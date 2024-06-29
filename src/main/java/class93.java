import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class93 extends class88 implements class678 {

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "I")
    public static int field1301 = 1408;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "Lhja;")
    public static class426 field1303 = new class426();

    @OriginalMember(owner = "client!fca", name = "F", descriptor = "[C")
    private static char[] field1308 = new char[64];

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!fca", name = "G", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!fca", name = "H", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!fca", name = "J", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!fca", name = "K", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!fca", name = "L", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIB[FILg;I)V")
    public final void method728(int arg0, int arg1, int arg2, int arg3, byte arg4, float[] arg5, int arg6, class166 arg7, int arg8) {
        ++field1312;
        super.field1258.method3882(0, this);
        OpenGL.glPixelStorei(3314, arg2);
        if (arg4 > -87) {
            method729((byte) -1);
        }
        OpenGL.glTexSubImage2Df(super.field1243, 0, arg0, arg6, arg1, arg3, class350.method2238((byte) 79, arg7), 5121, arg5, arg8);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "(B)V")
    public static void method729(byte arg0) {
        int var1 = 58 % ((arg0 - -16) / 54);
        field1303 = null;
        field1308 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII[BLg;IB)V")
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class166 arg6, int arg7, byte arg8) {
        int var10 = -93 % ((20 - arg8) / 59);
        super.field1258.method3882(0, this);
        ++field1306;
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Dub(super.field1243, 0, arg1, arg4, arg7, arg3, class350.method2238((byte) 79, arg6), 5121, arg5, arg0);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(FZ)F")
    public final float method617(float arg0, boolean arg1) {
        if (arg1) {
            this.method627(-26);
        }
        ++field1313;
        return arg0 / (float) this.field1305;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IF)F")
    public final float method621(int arg0, float arg1) {
        ++field1314;
        if (arg0 != 20490) {
            field1310 = 121;
        }
        return arg1 / (float) this.field1311;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[IIIIII)V")
    public final void method629(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1304;
        int[] var8 = new int[this.field1311 * this.field1305];
        super.field1258.method3882(arg4 ^ arg4, this);
        OpenGL.glGetTexImagei(super.field1243, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; arg5 > var9; ++var9) {
            class421.method2531(var8, (-var9 + arg5 + arg2 + -1) * this.field1305, arg1, arg6 * var9 + arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lsha;Lg;Lwj;II)V")
    public class93(class757 arg0, class166 arg1, class415 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field1305 = arg3;
        this.field1311 = arg4;
        super.field1258.method3882(0, this);
        OpenGL.glTexImage2Dub(super.field1243, 0, this.method711(-92), arg3, arg4, 0, class350.method2238((byte) 79, super.field1249), class195.method1284(5125, super.field1260), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        if (arg0 != 15501) {
            this.method621(36, 1.2728766F);
        }
        ++field1309;
        return true;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lsha;Lg;IIZ[FII)V")
    public class93(class757 arg0, class166 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class415.field5990, arg2 * arg3, arg4);
        this.field1311 = arg3;
        this.field1305 = arg2;
        super.field1258.method3882(0, this);
        if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method709(arg2, -10282, arg3, super.field1243, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field1243, 0, this.method711(-115), arg2, arg3, 0, class350.method2238((byte) 79, super.field1249), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lsha;Lg;IIZ[BII)V")
    public class93(class757 arg0, class166 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class415.field5986, arg2 * arg3, arg4);
        this.field1311 = arg3;
        this.field1305 = arg2;
        super.field1258.method3882(0, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method707(arg3, arg5, 121, arg2, super.field1243);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field1243, 0, this.method711(-115), arg2, arg3, 0, class350.method2238((byte) 79, super.field1249), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)I")
    public final int method623(boolean arg0) {
        ++field1300;
        return arg0 ? 38 : this.field1305;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lsha;IIZ[III)V")
    public class93(class757 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class109.field1521, class415.field5986, arg1 * arg2, arg3);
        this.field1305 = arg1;
        this.field1311 = arg2;
        super.field1258.method3882(0, this);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method703(arg1, arg4, (byte) -72, arg2, super.field1243);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field1243, 0, 6408, this.field1305, this.field1311, 0, 32993, super.field1258.field10336, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII[III)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        super.field1258.method3882(0, this);
        if (arg6 > 63) {
            ++field1302;
            OpenGL.glPixelStorei(3314, arg4);
            OpenGL.glTexSubImage2Di(super.field1243, 0, arg3, arg1, arg2, arg7, 32993, super.field1258.field10336, arg5, arg0);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZZZ)V")
    public final void method622(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg0) {
            this.method618(-35, 50, 13, -88, 44, (byte[]) null, (class166) null, -70, (byte) -3);
        }
        super.field1258.method3882(0, this);
        ++field1307;
        OpenGL.glTexParameteri(super.field1243, 10242, arg1 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field1243, 10243, !arg2 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
    public final int method627(int arg0) {
        if (arg0 != -7840) {
            this.field1305 = 57;
        }
        ++field1299;
        return this.field1311;
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field1308[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field1308[var1] = (char) (var1 + -26 + 97);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field1308[var2] = (char) (var2 + -52 + 48);
        }
        field1308[63] = '-';
        field1308[62] = '*';
    }
}
