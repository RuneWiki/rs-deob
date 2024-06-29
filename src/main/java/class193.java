import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class193 extends class242 {

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "[S")
    private short[] field3401 = new short[257];

    @OriginalMember(owner = "client!cl", name = "ib", descriptor = "I")
    private int field3412 = 0;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "Lp;")
    private static class280 field3395 = class18.method140((byte) -122, "Opened title screen");

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "Z")
    public static boolean field3397 = false;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "Lp;")
    public static class280 field3396 = field3395;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Lp;")
    public static class280 field3403 = class18.method140((byte) -124, "blinken1:");

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "J")
    public static long field3404 = 0L;

    @OriginalMember(owner = "client!cl", name = "jb", descriptor = "Lsb;")
    public static class221 field3413 = new class221(260);

    @OriginalMember(owner = "client!cl", name = "kb", descriptor = "Lp;")
    public static class280 field3414 = class18.method140((byte) -121, "<img=1>");

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "[I")
    private int[] field3398;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "[I")
    private int[] field3400;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "[[I")
    private int[][] field3405;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZZZI)Ltg;")
    public static final class180 method1333(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        ++field3409;
        if (arg0 != 11806) {
            method1335((byte) 18);
        }
        class211 var5 = null;
        if (class79.field1297 != null) {
            var5 = new class211(arg4, class79.field1297, class59.field957[arg4], 1000000);
        }
        class267.field4696[arg4] = class228.field3950.method612(arg4, class227.field3914, 229, var5);
        if (arg3) {
            class267.field4696[arg4].method1549((byte) -109);
        }
        return new class180(class267.field4696[arg4], arg1, arg2);
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)V")
    private final void method1334(int arg0) {
        if (arg0 != -1703353172) {
            this.method1338(-18, 73);
        }
        ++field3408;
        int var2 = this.field3412;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field3405.length + -1 && var4 >= this.field3405[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3405[var5 + -1];
                    int[] var7 = this.field3405[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class90.field1459[(8177 & var8) >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3401[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field3405.length + -1) < ~var14 && ~this.field3405[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field3405[var14];
                    int[] var16 = this.field3405[var14 + -1];
                    int var17 = (var13 - var16[0] << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3401[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field3405.length - 1) && ~this.field3405[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field3405[var22 - 1];
                int[] var24 = this.field3405[var22];
                int var25 = this.method1338(var22 + -2, arg0 ^ 1703358011)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1338(var22 + 1, -13673)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 + -var25 + var26;
                int var33 = var27 - var25;
                int var34 = -var31 + var25 + -var26;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var34 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - (-var26 + -var36) + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3401[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (this.field3405 == null) {
            this.field3405 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3406;
        if (~this.field3405.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 <= 122) {
                this.method1334(9);
            }
            if (this.field3412 == 2) {
                this.method1336((byte) -104);
            }
            class252.method1696(-117);
            this.method1334(-1703353172);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (~arg1 == -1) {
            this.field3412 = arg2.method189((byte) -103);
            this.field3405 = new int[arg2.method189((byte) -103)][2];
            for (int var4 = 0; ~var4 > ~this.field3405.length; ++var4) {
                this.field3405[var4][0] = arg2.method193((byte) 77);
                this.field3405[var4][1] = arg2.method193((byte) 77);
            }
        }
        ++field3399;
        if (arg0 > -119) {
            method1335((byte) -41);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1335(byte arg0) {
        if (arg0 != -73) {
            method1333(-40, true, true, false, -28);
        }
        field3395 = null;
        field3413 = null;
        field3396 = null;
        field3414 = null;
        field3403 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    private final void method1336(byte arg0) {
        ++field3402;
        int[] var2 = this.field3405[0];
        int[] var3 = this.field3405[1];
        int[] var4 = this.field3405[this.field3405.length + -1];
        int[] var5 = this.field3405[this.field3405.length - 2];
        if (arg0 >= -86) {
            this.method54(-68, 12);
        }
        this.field3400 = new int[] { var5[0] - (-var5[0] - -var4[0]), var5[1] - (var4[1] + -var5[1]) };
        this.field3398 = new int[] { var2[0] + -var3[0] + var2[0], -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)I")
    public static final int method1337(int arg0, int arg1, byte arg2) {
        if (arg2 < 79) {
            return 18;
        } else {
            ++field3410;
            if (~arg1 < ~arg0) {
                int var3 = arg0;
                arg0 = arg1;
                arg1 = var3;
            }
            while (arg1 != 0) {
                int var4 = arg0 % arg1;
                arg0 = arg1;
                arg1 = var4;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field3411;
        int var3 = -72 / ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 80, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0, 48);
            for (int var6 = 0; class264.field4654 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field3401[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)[I")
    private final int[] method1338(int arg0, int arg1) {
        ++field3407;
        if (~arg0 > -1) {
            return this.field3398;
        } else if (~this.field3405.length >= ~arg0) {
            return this.field3400;
        } else {
            if (arg1 != -13673) {
                field3414 = null;
            }
            return this.field3405[arg0];
        }
    }
}
