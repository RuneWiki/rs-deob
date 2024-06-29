import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 extends class793 implements class339 {

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "Lhj;")
    public static class596 field702 = new class596(66, 3);

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "Lhj;")
    public static class596 field704 = new class596(77, -2);

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "[[[Ldq;")
    public static class727[][][] field707;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 >= -113) {
            method471((byte) 29, (byte[]) null);
        }
        ++field696;
        if (arg0 == arg3 && ~arg4 == ~arg9 && arg1 == arg2 && ~arg5 == ~arg6) {
            class639.method3588(arg7, arg0, arg6, arg9, arg1, (byte) -113);
        } else {
            int var10 = arg0;
            int var11 = arg9;
            int var12 = arg0 * 3;
            int var13 = arg9 * 3;
            int var14 = arg3 * 3;
            int var15 = arg4 * 3;
            int var16 = arg2 * 3;
            int var17 = arg5 * 3;
            int var18 = -arg0 + arg1 + -var16 + var14;
            int var19 = -arg9 + arg6 - (var17 - var15);
            int var20 = -var14 + var16 - (var14 - var12);
            int var21 = -var15 + var17 + var13 + -var15;
            int var22 = -var12 + var14;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = arg9 - -(var28 + var30 + var32 >> 12);
                class639.method3588(arg7, var10, var34, var11, var33, (byte) -112);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)Z")
    public static final boolean method464(int arg0, int arg1, int arg2) {
        ++field705;
        if (arg1 > -121) {
            method468(-68);
        }
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(B)V")
    public final void method465(byte arg0) {
        if (arg0 != 62) {
            field702 = null;
        }
        ++field700;
        super.field10898.method3924(this, true);
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lpc;ILjaclib/memory/Buffer;IZ)V")
    public class50(class700 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field698 = arg1;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)J")
    public final long method466(byte arg0) {
        int var2 = 120 % ((-25 - arg0) / 44);
        ++field701;
        return 0L;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(III[B)V")
    public final void method467(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 >= -96) {
            field707 = null;
        }
        ++field703;
        this.method4370(arg3, arg1, 35040);
        this.field698 = arg2;
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
    public static void method468(int arg0) {
        field704 = null;
        field702 = null;
        if (arg0 != -21265) {
            method464(-83, -93, -46);
        }
        field707 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)I")
    public final int method469(int arg0) {
        ++field706;
        if (arg0 != -30665) {
            method468(-52);
        }
        return super.field10894;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lpc;I[BIZ)V")
    public class50(class700 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field698 = arg1;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)I")
    public final int method470(int arg0) {
        ++field699;
        return arg0 > -85 ? -13 : this.field698;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method471(byte arg0, byte[] arg1) {
        ++field697;
        class403 var2 = new class403(arg1);
        if (arg0 != 21) {
            field707 = null;
        }
        int var3 = var2.method2396((byte) -83);
        int var4 = var2.method2381((byte) 97);
        if (var4 < 0 || class787.field10856 != 0 && ~class787.field10856 > ~var4) {
            throw new RuntimeException();
        } else if (~var3 == -1) {
            byte[] var5 = new byte[var4];
            var2.method2401(65280, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method2381((byte) 114);
            if (var6 < 0 || class787.field10856 != 0 && ~class787.field10856 > ~var6) {
                throw new RuntimeException();
            } else {
                byte[] var7 = new byte[var6];
                if (~var3 != -2) {
                    class780 var8 = class233.field2780;
                    synchronized (class233.field2780) {
                        class233.field2780.method4327(var2, var7, (byte) -122);
                    }
                } else {
                    class106.method871(var7, var6, arg1, var4, 9);
                }
                return var7;
            }
        }
    }
}
