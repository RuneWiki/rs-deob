import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class272 extends class412 {

    @OriginalMember(owner = "client!saa", name = "B", descriptor = "B")
    public byte field3539 = 5;

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
    public static int field3531 = 0;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "Lmf;")
    public static class354 field3537 = new class354();

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!saa", name = "w", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "Lm;")
    public static class163 field3527;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "Z")
    public boolean field3532;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)V")
    public static void method1519(byte arg0) {
        if (arg0 != -40) {
            field3531 = 116;
        }
        field3537 = null;
        field3527 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ltm;B[BI)Loi;")
    public static final class63 method1520(class327 arg0, byte arg1, byte[] arg2, int arg3) {
        field3536++;
        if (arg2 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class359.field4726, 0);
        if (class359.field4726[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            int var5 = 16 % ((-arg1 - 72) / 42);
            return new class63(arg0, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)I")
    public static final int method1521(int arg0, int arg1, int arg2) {
        field3538++;
        int var3 = -85 % ((-arg2 - 47) / 44);
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([BBI)[B")
    public static final byte[] method1522(byte[] arg0, byte arg1, int arg2) {
        field3529++;
        byte[] var3 = new byte[arg2];
        if (arg1 > -50) {
            method1520(null, (byte) -77, null, -14);
        }
        class345.method1932(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIBZII)V")
    public static final void method1523(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        class241.field3003 = arg6;
        field3526++;
        if (arg3 <= 24) {
            field3531 = -71;
        }
        class64.field632 = arg5;
        class42.field335 = arg2;
        class641.field9238 = arg0;
        class230.field2856 = arg1;
        if (arg4 && class241.field3003 >= 100) {
            class39.field303 = class641.field9238 * 128 + 64;
            class286.field3729 = class42.field335 * 128 + 64;
            class521.field7321 = class426.method2400(-1, class39.field303, class286.field3729, class442.field6099) - class64.field632;
        }
        class617.field8931 = 2;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3) {
        field3528++;
        if (arg2 == 1003) {
            class630.method3617(class555.field8165, arg1, arg0);
        } else if (arg2 == 1006) {
            class630.method3617(class612.field8876, arg1, arg0);
        } else if (arg2 == 1004) {
            class630.method3617(class282.field3710, arg1, arg0);
        } else if (arg2 == 1001) {
            class630.method3617(class236.field2889, arg1, arg0);
        } else if (arg2 == 1007) {
            class630.method3617(class537.field7706, arg1, arg0);
        }
        if (arg3 != -1002) {
            field3537 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III[BIZI)Z")
    public static final boolean method1525(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6) {
        field3533++;
        if (arg5) {
            field3531 = 62;
        }
        int var7 = arg0 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg1 + arg4 - 1) / arg4);
        int var10 = -((arg0 + arg4 - 1) / arg4);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg6] == 0) {
                    return true;
                }
                arg6 += arg4;
            }
            int var13 = arg6 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg2 + var13;
        }
        return false;
    }
}
