import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class336 extends class311 {

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public int field4538 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public int field4543 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public int field4546 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public int field4542 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public int field4549 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public int field4541 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public int field4550 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public int field4551 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Lqg;")
    public class157 field4539;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field4540 = 127;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field4536 = 0;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lbc;")
    public static class285 field4537;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)I")
    public static final int method2041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4535++;
        if (arg1 != -30002) {
            field4537 = null;
        }
        if (class436.field6160 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg3 >> 7;
            int var7 = arg5 >> 7;
            if (arg4 < 0 || arg2 < 0 || arg4 > class11.field107 - 1 || arg2 > class264.field3620 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class11.field107 - 1) < var6 || class264.field3620 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class302.field4122[1][arg3 >> 7][arg5 >> 7] & 0x2) != 0;
            if ((arg3 & 0x7F) == 0) {
                boolean var9 = (class302.field4122[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                boolean var10 = (class302.field4122[1][var6][arg5 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class302.field4122[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x7F) == 0) {
                boolean var11 = (class302.field4122[1][arg3 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class302.field4122[1][arg3 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class302.field4122[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class436.field6160[arg0].method331(arg3, arg5);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)Z")
    public final boolean method2042(int arg0, byte arg1, int arg2) {
        field4547++;
        if (arg1 != -85) {
            method2041(-66, 36, -66, 40, -35, -87);
        }
        if (this.field4551 <= arg2 && this.field4550 >= arg2 && this.field4549 <= arg0 && arg0 <= this.field4542) {
            return true;
        } else {
            return arg2 >= this.field4546 && this.field4541 >= arg2 && arg0 >= this.field4543 && arg0 <= this.field4538;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method2043(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg8 && arg1 == arg3 && arg2 == arg6 && arg5 == arg9) {
            class200.method1378(arg3, (byte) -80, arg2, arg5, arg0, arg7);
        } else {
            int var10 = arg0;
            int var11 = arg3;
            int var12 = arg0 * 3;
            int var13 = arg3 * 3;
            int var14 = arg8 * 3;
            int var15 = arg1 * 3;
            int var16 = arg6 * 3;
            int var17 = arg9 * 3;
            int var18 = arg2 + var14 - arg0 - var16;
            int var19 = var15 + arg5 - var17 - arg3;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
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
                int var33 = arg0 + (var27 + var31 + var29 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg3;
                class200.method1378(var11, (byte) -112, var33, var34, var10, arg7);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg4 != 14) {
            method2041(77, -22, 106, -13, 95, 125);
        }
        field4544++;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public static void method2044(int arg0) {
        field4537 = null;
        if (arg0 > -51) {
            method2044(-126);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lqg;)V")
    public class336(class157 arg0) {
        this.field4539 = arg0;
    }
}
