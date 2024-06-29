import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class207 extends class219 {

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field3488 = 4096;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    private int field3494 = 4096;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    private int field3503 = 409;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    private int field3508 = 4096;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "[I")
    private int[] field3504 = new int[3];

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Lbd;")
    public static class162 field3490 = class17.method142(0, "<col=ff9040>");

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "J")
    public static volatile long field3492 = 0L;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field3495 = 0;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "[S")
    public static short[] field3496 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field3499 = -1;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "[Lbd;")
    public static class162[] field3498 = new class162[100];

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lbd;")
    public static class162 field3502 = class17.method142(0, "compass");

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "F")
    public static float field3489;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Lbj;")
    public static class276 field3507;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB[Lqd;IZ[B)V", line = 7)
    public static final void method1524(int arg0, byte arg1, class179[] arg2, int arg3, boolean arg4, byte[] arg5) {
        field3493++;
        class94 var6 = new class94(arg5);
        int var7 = 68 % ((arg1 + 56) / 37);
        int var8 = -1;
        while (true) {
            int var9 = var6.method725(8);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method755((byte) -101);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var6.method756(915905888);
                int var15 = var10 >> 12;
                int var16 = var14 >> 2;
                int var17 = var14 & 0x3;
                int var18 = arg3 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    class179 var20 = null;
                    if (!arg4) {
                        int var21 = var15;
                        if ((class213.field3580[1][var18][var19] & 0x2) == 2) {
                            var21 = var15 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg2[var21];
                        }
                    }
                    class82.method624(var17, var18, var8, var15, var16, 4, var15, var19, !arg4, var20, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILb;)V", line = 82)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field3501++;
        if (arg0 == 0) {
            this.field3503 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field3508 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field3494 = arg2.method761((byte) 108);
        } else if (arg0 == 3) {
            this.field3488 = arg2.method761((byte) 108);
        } else if (arg0 == 4) {
            int var5 = arg2.method732(-1);
            this.field3504[2] = class92.method695(255, var5) >> 12;
            this.field3504[0] = class92.method695(267386880, var5 << 4);
            this.field3504[1] = class92.method695(var5, 65280) >> 4;
        }
        if (arg1 != 0) {
            method1524(-33, (byte) 82, (class179[]) null, 0, false, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[[I", line = 173)
    public final int[][] method219(int arg0, byte arg1) {
        field3509++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (arg1 != 83) {
            this.method42(84, 52, (class94) null);
        }
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class128.field2326; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3504[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3503 >= var13) {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3504[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3503 >= var15) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field3504[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field3503) {
                            var10[var11] = this.field3488 * var12 >> 12;
                            var8[var11] = this.field3494 * var14 >> 12;
                            var9[var11] = this.field3508 * var16 >> 12;
                        } else {
                            var10[var11] = var12;
                            var8[var11] = var14;
                            var9[var11] = var16;
                        }
                    } else {
                        var10[var11] = var12;
                        var8[var11] = var14;
                        var9[var11] = var7[var11];
                    }
                } else {
                    var10[var11] = var12;
                    var8[var11] = var6[var11];
                    var9[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 311)
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z", line = 275)
    public static final boolean method1525(int arg0, int arg1) {
        if (arg1 != -1237219540) {
            method1525(-121, 35);
        }
        field3506++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V", line = 290)
    public static void method1526(boolean arg0) {
        field3507 = null;
        field3496 = null;
        field3490 = null;
        field3498 = null;
        field3502 = null;
        if (!arg0) {
            field3497 = 50;
        }
    }
}
