import jaggl.OpenGL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class428 extends class179 {

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    private int field6420 = -1;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    private int field6421 = -1;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public int field6419;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public int field6418;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "Z")
    public static boolean field6424 = false;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public final void method1213(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field6421, this.field6420, super.field2829, arg0, 0, 0);
        ++field6425;
        this.field6421 = -1;
        this.field6420 = -1;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lih;IIII[BI)V")
    public class428(class214 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6423 = arg3;
        this.field6419 = arg4;
        this.field6418 = arg2;
        super.field2845.method1471(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2829, 0, super.field2832, this.field6418, this.field6423, this.field6419, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1208(true, -121);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIZ)V")
    public final void method2609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super.field2845.method1471(arg7, this);
        ++field6422;
        OpenGL.glCopyTexSubImage3D(super.field2829, 0, arg2, arg1, arg5, arg3, arg0, arg4, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2610(Throwable arg0, int arg1) throws IOException {
        ++field6417;
        String var3;
        if (arg0 instanceof class380) {
            class380 var2 = (class380) arg0;
            arg0 = var2.field5884;
            var3 = var2.field5883 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                String var18 = var3 + "| " + var8;
                int var19 = -107 % ((arg1 - 3) / 36);
                return var18;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 != 0) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 - -5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lih;IIII)V")
    public class428(class214 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field6419 = arg4;
        this.field6423 = arg3;
        this.field6418 = arg2;
        super.field2845.method1471(true, this);
        OpenGL.glTexImage3Dub(super.field2829, 0, super.field2832, this.field6418, this.field6423, this.field6419, 0, class344.method2215(super.field2832, -12017), 5121, (byte[]) null, 0);
        this.method1208(true, -104);
    }
}
