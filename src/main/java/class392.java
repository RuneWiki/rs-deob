import jaggl.OpenGL;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class392 extends class55 {

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field5551 = 0;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Lrga;")
    public static class242 field5556 = new class242("game4", 3);

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
    public long field5550;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Ltm;")
    public class392 field5555;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "Ltm;")
    public class392 field5560;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)Z", line = 5)
    public final boolean method2285(byte arg0) {
        if (arg0 <= 34) {
            field5551 = -110;
        }
        field5552++;
        return this.field5560 != null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 22)
    public static void method2286(int arg0) {
        if (arg0 != 0) {
            field5551 = 103;
        }
        field5556 = null;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V", line = 37)
    public final void method2287(byte arg0) {
        field5559++;
        if (this.field5560 == null) {
            return;
        }
        this.field5560.field5555 = this.field5555;
        this.field5555.field5560 = this.field5560;
        this.field5555 = null;
        if (arg0 != -90) {
            method2286(-94);
        }
        this.field5560 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 58)
    public static final void method2288(String arg0, int arg1) {
        if (class73.field784 == null) {
            class568.method3192((byte) -43);
        }
        field5557++;
        class135.field1716.setTime(new Date(class538.method2963(-47)));
        int var2 = -118 % ((arg1 + 11) / 50);
        int var3 = class135.field1716.get(11);
        int var4 = class135.field1716.get(12);
        int var5 = class135.field1716.get(13);
        String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
        String[] var7 = class490.method2753(arg0, '\n', false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            for (int var9 = class543.field7690; var9 > 0; var9--) {
                class73.field784[var9] = class73.field784[var9 - 1];
            }
            class73.field784[0] = var6 + ": " + var7[var8];
            if (class568.field8003 != null) {
                try {
                    class568.field8003.write(class487.method2746(0, class73.field784[0] + "\n"));
                } catch (IOException var10) {
                }
            }
            if (class543.field7690 < class73.field784.length - 1) {
                if (class52.field549 > 0) {
                    class52.field549++;
                }
                class543.field7690++;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([BLhl;II)Lon;", line = 130)
    public static final class339 method2289(byte[] arg0, class529 arg1, int arg2, int arg3) {
        field5554++;
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        if (arg2 != -25671) {
            field5551 = 21;
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class191.field2300, 0);
        if (class191.field2300[0] == 0) {
            if (class191.field2300[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class191.field2300, 1);
            if (class191.field2300[1] > 1) {
                byte[] var6 = new byte[class191.field2300[1]];
                OpenGL.glGetInfoLogARB(var4, class191.field2300[1], class191.field2300, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class191.field2300[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class339(arg1, var4, arg3);
    }
}
