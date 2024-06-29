import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class153 extends class478 {

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    private int field2205 = -1;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    private int field2197 = -1;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "[I")
    public static int[] field2194 = new int[3];

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2198 = "";

    @OriginalMember(owner = "client!em", name = "H", descriptor = "F")
    public static float field2204 = 0.0F;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "Z")
    public static boolean field2207 = false;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "[I")
    public static int[] field2208 = new int[4096];

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 3)
    public final void method462(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field2197, this.field2205, super.field6667, 0, 0, 0);
        ++field2203;
        if (arg0 != -1259451258) {
            method984(-3);
        }
        this.field2205 = -1;
        this.field2197 = -1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLoi;I)Lul;", line = 16)
    public static final class411 method979(byte arg0, class53 arg1, int arg2) {
        if (arg0 != -108) {
            method979((byte) 6, (class53) null, 106);
        }
        ++field2209;
        byte[] var3 = arg1.method421(arg2, 1);
        return var3 == null ? null : new class411(var3);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ll;BILjava/awt/Canvas;Lnt;I)Lza;", line = 33)
    public static final class290 method980(class16 arg0, byte arg1, int arg2, Canvas arg3, class151 arg4, int arg5) {
        int var6 = -103 % ((-44 - arg1) / 37);
        ++field2193;
        return new class503(arg2, arg3, arg0, arg5, arg4);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lih;IIII)V", line = 46)
    public class153(class503 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field2202 = arg3;
        this.field2200 = arg4;
        this.field2196 = arg2;
        super.field6649.method2968(this, -50);
        OpenGL.glTexImage3Dub(super.field6667, 0, super.field6670, this.field2196, this.field2202, this.field2200, 0, class527.method3110(super.field6670, 6410), 5121, (byte[]) null, 0);
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V", line = 64)
    public final void method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2199;
        super.field6649.method2968(this, -76);
        OpenGL.glCopyTexSubImage3D(super.field6667, arg6, arg5, arg7, arg4, arg2, arg3, arg0, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lih;IIII[BI)V", line = 74)
    public class153(class503 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2200 = arg4;
        this.field2202 = arg3;
        this.field2196 = arg2;
        super.field6649.method2968(this, -44);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6667, 0, super.field6670, this.field2196, this.field2202, this.field2200, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2762(9728, true);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)Z", line = 89)
    public static final boolean method982(int arg0, int arg1) {
        int var2 = -12 % ((arg0 - -50) / 61);
        ++field2201;
        for (class214 var3 = (class214) class363.field5190.method2655(15152); var3 != null; var3 = (class214) class363.field5190.method2660((byte) 67)) {
            if (class26.method168(var3.field3094, 205) && (long) arg1 == var3.field3089) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(B)V", line = 117)
    public static void method983(byte arg0) {
        if (arg0 >= -77) {
            method979((byte) -54, (class53) null, 43);
        }
        field2194 = null;
        field2198 = null;
        field2208 = null;
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V", line = 152)
    public static final void method984(int arg0) {
        class61.method498(class443.field6219, 1);
        if (arg0 <= -93) {
            ++class268.field3913;
            ++field2195;
            class30.field357.method2372(class121.field1668, -127);
        }
    }
}
