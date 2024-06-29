import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class408 extends class756 {

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    private int field5754;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    private int field5746;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    private int field5749;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field5747;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field5753 = 0;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIII)V")
    public class408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5754 = arg2;
        this.field5746 = arg0;
        this.field5749 = arg3;
        this.field5747 = arg1;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIII)V")
    public static final void method2416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < -88) {
            for (int var6 = arg2; ~var6 >= ~arg0; ++var6) {
                class284.method1709(class15.field220[var6], arg1, -8251, arg5, arg3);
            }
            ++field5760;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    public static final void method2417(byte arg0) {
        ++field5757;
        for (int var1 = 0; var1 < class215.field2726; ++var1) {
            class185.field2426[var1] = null;
        }
        class215.field2726 = 0;
        for (int var2 = 0; ~var2 > ~class126.field1511; ++var2) {
            for (int var42 = 0; class90.field1142 > var42; ++var42) {
                for (int var43 = 0; ~class665.field9107 < ~var43; ++var43) {
                    class73 var44 = class495.field7002[var2][var43][var42];
                    if (var44 != null) {
                        if (~var44.field967 < -1) {
                            var44.field967 = (short) (var44.field967 * -1);
                        }
                        if (var44.field972 > 0) {
                            var44.field972 = (short) (var44.field972 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; ~class126.field1511 < ~var3; ++var3) {
            for (int var4 = 0; ~var4 > ~class90.field1142; ++var4) {
                for (int var5 = 0; var5 < class665.field9107; ++var5) {
                    class73 var6 = class495.field7002[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class495.field7002[0][var5][var4] != null && class495.field7002[0][var5][var4].field962 != null;
                        if (var6.field967 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class73 var12 = class495.field7002[var3][var5][var4 - 1];
                            int var13 = class716.field10106[var3].method2381(arg0 ^ 125, var5, var4);
                            while (~var8 < -1 && var12 != null && ~var12.field967 > -1 && ~var6.field967 == ~var12.field967 && ~var6.field970 == ~var12.field970 && ~class716.field10106[var3].method2381(arg0 + -96, var5, var8 + -1) == ~var13 && (~(var8 - 1) >= -1 || ~var13 == ~class716.field10106[var3].method2381(-103, var5, var8 - 2))) {
                                --var8;
                                var12 = class495.field7002[var3][var5][var8 + -1];
                            }
                            for (class73 var14 = class495.field7002[var3][var5][var4 - -1]; var9 < class665.field9107 && var14 != null && ~var14.field967 > -1 && var6.field967 == var14.field967 && ~var6.field970 == ~var14.field970 && class716.field10106[var3].method2381(-122, var5, var9 + 1) == var13 && (~class665.field9107 >= ~(var9 + 1) || ~class716.field10106[var3].method2381(-127, var5, var9 + 2) == ~var13); var14 = class495.field7002[var3][var5][var9 - -1]) {
                                ++var9;
                            }
                            int var15 = var3 + 1 + -var3;
                            int var16 = class716.field10106[var7 ? var3 + 1 : var3].method2381(-127, var5, var8);
                            int var17 = var6.field967 * var15 + var16;
                            int var18 = class716.field10106[!var7 ? var3 : var3 + 1].method2381(-115, var5, var9 + 1);
                            int var19 = var18 - -(var6.field967 * var15);
                            int var20 = var5 << class455.field6383;
                            int var21 = var8 << class455.field6383;
                            int var22 = (var9 << class455.field6383) - -class431.field6109;
                            class185.field2426[class215.field2726++] = new class600(1, var3, var6.field970 + var20, var6.field970 + var20, var20 - -var6.field970, var20 - -var6.field970, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; ~var11 <= ~var23; ++var23) {
                                for (int var24 = var8; ~var9 <= ~var24; ++var24) {
                                    class495.field7002[var23][var5][var24].field967 = (short) (class495.field7002[var23][var5][var24].field967 * -1);
                                }
                            }
                        }
                        if (var6.field972 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class73 var29 = class495.field7002[var3][var5 + -1][var4];
                            int var30 = class716.field10106[var3].method2381(-90, var5, var4);
                            while (~var25 < -1 && var29 != null && ~var29.field972 > -1 && ~var6.field972 == ~var29.field972 && ~var6.field968 == ~var29.field968 && ~class716.field10106[var3].method2381(-102, var25 + -1, var4) == ~var30 && (var25 - 1 <= 0 || var30 == class716.field10106[var3].method2381(-101, var25 + -2, var4))) {
                                --var25;
                                var29 = class495.field7002[var3][var25 - 1][var4];
                            }
                            for (class73 var31 = class495.field7002[var3][var5 + 1][var4]; class90.field1142 > var26 && var31 != null && ~var31.field972 > -1 && ~var6.field972 == ~var31.field972 && ~var6.field968 == ~var31.field968 && ~var30 == ~class716.field10106[var3].method2381(arg0 + -97, var26 - -1, var4) && (class90.field1142 <= var26 + 1 || ~var30 == ~class716.field10106[var3].method2381(arg0 ^ 121, var26 + 2, var4)); var31 = class495.field7002[var3][var26 + 1][var4]) {
                                ++var26;
                            }
                            int var32 = -var3 + var3 - -1;
                            int var33 = class716.field10106[!var7 ? var3 : var3 + 1].method2381(arg0 + -101, var25, var4);
                            int var34 = var6.field972 * var32 + var33;
                            int var35 = class716.field10106[!var7 ? var3 : var3 + 1].method2381(arg0 ^ 103, var26 - -1, var4);
                            int var36 = var6.field972 * var32 + var35;
                            int var37 = var25 << class455.field6383;
                            int var38 = (var26 << class455.field6383) - -class431.field6109;
                            int var39 = var4 << class455.field6383;
                            class185.field2426[class215.field2726++] = new class600(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field968 + var39, var39 - -var6.field968, var6.field968 + var39, var39 - -var6.field968);
                            for (int var40 = var3; var40 <= var28; ++var40) {
                                for (int var41 = var25; ~var41 >= ~var26; ++var41) {
                                    class495.field7002[var40][var41][var4].field972 = (short) (class495.field7002[var40][var41][var4].field972 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -2) {
            field5748 = 73;
        }
        class116.field1424 = true;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[[[Lfu;)V")
    public static final void method2418(int arg0, class73[][][] arg1) {
        if (arg0 >= -22) {
            method2417((byte) 5);
        }
        for (int var2 = 0; ~var2 > ~arg1.length; ++var2) {
            class73[][] var3 = arg1[var2];
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class73 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field966 instanceof class559) {
                            ((class559) var6.field966).method736((byte) -124);
                        }
                        if (var6.field964 instanceof class559) {
                            ((class559) var6.field964).method736((byte) -125);
                        }
                        if (var6.field971 instanceof class559) {
                            ((class559) var6.field971).method736((byte) -125);
                        }
                        if (var6.field973 instanceof class559) {
                            ((class559) var6.field973).method736((byte) -124);
                        }
                        if (var6.field961 instanceof class559) {
                            ((class559) var6.field961).method736((byte) -125);
                        }
                        for (class456 var7 = var6.field969; var7 != null; var7 = var7.field6389) {
                            class451 var8 = var7.field6384;
                            if (var8 instanceof class559) {
                                ((class559) var8).method736((byte) -127);
                            }
                        }
                    }
                }
            }
        }
        ++field5752;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB)V")
    public final void method1902(int arg0, int arg1, byte arg2) {
        if (arg2 > -74) {
            method2419(true, -54, 96, (Object) null);
        }
        ++field5751;
        int var4 = this.field5746 * arg1 >> 12;
        int var5 = this.field5754 * arg1 >> 12;
        int var6 = this.field5747 * arg0 >> 12;
        int var7 = this.field5749 * arg0 >> 12;
        class398.method2361(var7, super.field10527, var5, super.field10528, var6, var4, super.field10533, 93);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
    public final void method1897(int arg0, int arg1, int arg2) {
        int var4 = 56 % ((arg2 - 68) / 33);
        ++field5745;
        int var5 = this.field5746 * arg0 >> 12;
        int var6 = this.field5754 * arg0 >> 12;
        int var7 = this.field5747 * arg1 >> 12;
        int var8 = this.field5749 * arg1 >> 12;
        class714.method3958(var7, var6, super.field10528, var5, (byte) 97, var8);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BII)V")
    public final void method1903(byte arg0, int arg1, int arg2) {
        ++field5756;
        int var4 = this.field5746 * arg1 >> 12;
        int var5 = this.field5754 * arg1 >> 12;
        int var6 = -28 / ((82 - arg0) / 40);
        int var7 = this.field5747 * arg2 >> 12;
        int var8 = this.field5749 * arg2 >> 12;
        class11.method53(-10932, var5, super.field10527, var7, var4, super.field10533, var8);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZIILjava/lang/Object;)[B")
    public static final byte[] method2419(boolean arg0, int arg1, int arg2, Object arg3) {
        if (arg0) {
            field5748 = -11;
        }
        ++field5758;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class363.method2242(0, arg2, arg1, var4);
        } else if (arg3 instanceof class242) {
            class242 var5 = (class242) arg3;
            return var5.method526(-32, arg2, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method2420(byte arg0, Random arg1, int arg2) {
        ++field5755;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class487.method2850((byte) 52, arg2)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg1.nextInt()) >> 32);
        } else {
            int var3 = 71 % ((arg0 - -79) / 33);
            int var4 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (~var5 <= ~var4);
            return class222.method1440(arg2, var5, -31781);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lkl;B)V")
    public static final void method2421(class144 arg0, byte arg1) {
        int var2 = 50 % ((-64 - arg1) / 44);
        arg0.field1714 = null;
        ++field5750;
        if (class88.field1122 < 20) {
            class717.field10115.method1840(18, arg0);
            ++class88.field1122;
        }
    }
}
