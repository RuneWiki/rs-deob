import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class226 {

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lqd;")
    private class44 field3875 = new class44();

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lqd;")
    private class44 field3882 = new class44();

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lqd;")
    private class44 field3884 = new class44();

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lqd;")
    private class44 field3885 = new class44();

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lkh;")
    private class14 field3887 = new class14(4);

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public volatile int field3891 = 0;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public volatile int field3893 = 0;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "B")
    private byte field3890 = 0;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lkh;")
    private class14 field3892 = new class14(8);

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
    public static int[] field3866 = new int[50];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    private int field3886;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "J")
    private long field3889;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Lea;")
    private class205 field3888;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lne;")
    private class238 field3894;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lvm;")
    public static class77 field3861;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[Lch;")
    public static class140[] field3880;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method1558(boolean arg0, int arg1) {
        field3862++;
        if (this.field3888 == null) {
            return;
        }
        try {
            this.field3887.field195 = 0;
            this.field3887.method140(arg0 ? 2 : 3, (byte) 75);
            this.field3887.method137(0, true);
            if (arg1 > -16) {
                this.field3885 = (class44) null;
            }
            this.field3888.method1428(22974, 4, this.field3887.field174, 0);
        } catch (IOException var6) {
            try {
                this.field3888.method1433((byte) -115);
            } catch (Exception var5) {
            }
            this.field3888 = null;
            this.field3891++;
            this.field3893 = -2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I", line = 33)
    public final int method1559(byte arg0) {
        int var2 = 13 % ((28 - arg0) / 50);
        field3860++;
        return this.field3875.method380(0) + this.field3882.method380(0);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 43)
    public static final void method1560(byte arg0) {
        field3881++;
        if (class160.field2720 != null) {
            class160.field2720.method1433((byte) -115);
            class160.field2720 = null;
        }
        class254.method1808(1);
        class259.method1845();
        for (int var1 = 0; var1 < 4; var1++) {
            class80.field1460[var1].method1767((byte) -96);
        }
        class225.method1548(false, (byte) -20);
        System.gc();
        class151.method1025(2, (byte) 59);
        class269.field4620 = false;
        class232.field4020 = -1;
        class254.method1806((byte) -69, true);
        class258.field4503 = 0;
        class213.field3649 = 0;
        class70.field1339 = 0;
        class68.field1301 = false;
        class184.field3188 = 0;
        if (arg0 != -39) {
            return;
        }
        for (int var2 = 0; var2 < class279.field4777.length; var2++) {
            class279.field4777[var2] = null;
        }
        class132.field2323 = 0;
        class126.field2238 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class192.field3334[var3] = null;
            class69.field1320[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class331.field5637[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class105.field1822[var5][var6][var7] = null;
                }
            }
        }
        class21.method203((byte) 7);
        class308.field5208 = 0;
        class64.method480(99);
        class237.method1695((byte) -91, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjf;)I", line = 136)
    public static final int method1561(byte arg0, class229 arg1) {
        field3868++;
        if (arg0 < 73) {
            method1561((byte) -48, (class229) null);
        }
        return arg1.method1626(28) + 1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z", line = 148)
    public final boolean method1562(int arg0) {
        if (arg0 != -7463) {
            return false;
        }
        field3883++;
        if (this.field3888 != null) {
            long var2 = class153.method1032(105);
            int var4 = (int) (var2 - this.field3889);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3886 += var4;
            this.field3889 = var2;
            if (this.field3886 > 30000) {
                try {
                    this.field3888.method1433((byte) -115);
                } catch (Exception var30) {
                }
                this.field3888 = null;
            }
        }
        if (this.field3888 == null) {
            return this.method1559((byte) -40) == 0 && this.method1569(arg0 ^ 0xFFFFC6BC) == 0;
        }
        try {
            this.field3888.method1429((byte) -36);
            for (class238 var6 = (class238) this.field3875.method383(false); var6 != null; var6 = (class238) this.field3875.method382(arg0 + 7508)) {
                this.field3887.field195 = 0;
                this.field3887.method140(1, (byte) 75);
                this.field3887.method137((int) var6.field4845, true);
                this.field3888.method1428(22974, 4, this.field3887.field174, 0);
                this.field3882.method375(42, var6);
            }
            for (class238 var7 = (class238) this.field3884.method383(false); var7 != null; var7 = (class238) this.field3884.method382(68)) {
                this.field3887.field195 = 0;
                this.field3887.method140(0, (byte) 75);
                this.field3887.method137((int) var7.field4845, true);
                this.field3888.method1428(22974, 4, this.field3887.field174, 0);
                this.field3885.method375(42, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3888.method1436(arg0 ^ 0x1339);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3886 = 0;
                byte var10 = 0;
                if (this.field3894 == null) {
                    var10 = 8;
                } else if (this.field3894.field4160 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field3894.field4169.field174.length - this.field3894.field4167;
                    int var12 = 512 - this.field3894.field4160;
                    if (var11 - this.field3894.field4169.field195 < var12) {
                        var12 = var11 - this.field3894.field4169.field195;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field3888.method1431(var12, this.field3894.field4169.field174, this.field3894.field4169.field195, (byte) -92);
                    if (this.field3890 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field3894.field4169.field174[this.field3894.field4169.field195 + var13] = (byte) class260.method1850(this.field3894.field4169.field174[this.field3894.field4169.field195 + var13], this.field3890);
                        }
                    }
                    this.field3894.field4169.field195 += var12;
                    this.field3894.field4160 += var12;
                    if (this.field3894.field4169.field195 == var11) {
                        this.field3894.method1986((byte) 86);
                        this.field3894.field4499 = false;
                        this.field3894 = null;
                    } else if (this.field3894.field4160 == 512) {
                        this.field3894.field4160 = 0;
                    }
                } else {
                    int var14 = var10 - this.field3892.field195;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field3888.method1431(var14, this.field3892.field174, this.field3892.field195, (byte) -92);
                    if (this.field3890 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field3892.field174[this.field3892.field195 + var15] = (byte) class260.method1850(this.field3892.field174[this.field3892.field195 + var15], this.field3890);
                        }
                    }
                    this.field3892.field195 += var14;
                    if (this.field3892.field195 >= var10) {
                        if (this.field3894 == null) {
                            this.field3892.field195 = 0;
                            int var16 = this.field3892.method93(false);
                            int var17 = this.field3892.method116(-1);
                            int var18 = this.field3892.method93(false);
                            int var19 = this.field3892.method128((byte) 4);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            Object var22 = null;
                            long var23 = (long) ((var16 << 16) + var17);
                            class238 var25;
                            if (var21) {
                                for (var25 = (class238) this.field3885.method383(false); var25 != null && var25.field4845 != var23; var25 = (class238) this.field3885.method382(44)) {
                                }
                            } else {
                                for (var25 = (class238) this.field3882.method383(false); var25 != null && var25.field4845 != var23; var25 = (class238) this.field3882.method382(85)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field3894 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field3894.field4169 = new class14(var19 + var26 + this.field3894.field4167);
                            this.field3894.field4169.method140(var20, (byte) 75);
                            this.field3894.field4169.method100(var19, arg0 + 72743);
                            this.field3894.field4160 = 8;
                            this.field3892.field195 = 0;
                        } else if (this.field3894.field4160 != 0) {
                            throw new IOException();
                        } else if (this.field3892.field174[0] == -1) {
                            this.field3892.field195 = 0;
                            this.field3894.field4160 = 1;
                        } else {
                            this.field3894 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3888.method1433((byte) -115);
            } catch (Exception var29) {
            }
            this.field3891++;
            this.field3888 = null;
            this.field3893 = -2;
            return this.method1559((byte) 82) == 0 && this.method1569(9317) == 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZIBI)Lne;", line = 428)
    public final class238 method1563(byte arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        long var6 = (long) ((arg2 << 16) + arg4);
        field3871++;
        if (arg3 != -104) {
            this.method1569(-10);
        }
        class238 var8 = new class238();
        var8.field4167 = arg0;
        var8.field4494 = arg1;
        var8.field4845 = var6;
        if (arg1) {
            if (this.method1559((byte) -97) >= 20) {
                throw new RuntimeException();
            }
            this.field3875.method375(42, var8);
        } else if (this.method1569(9317) < 20) {
            this.field3884.method375(arg3 ^ 0xFFFFFFB2, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Z", line = 474)
    public final boolean method1564(byte arg0) {
        field3878++;
        if (arg0 != 91) {
            this.method1565(-48);
        }
        return this.method1569(9317) >= 20;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 487)
    public final void method1565(int arg0) {
        try {
            this.field3888.method1433((byte) -115);
        } catch (Exception var3) {
        }
        this.field3890 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
        field3874++;
        this.field3891++;
        this.field3888 = null;
        this.field3893 = -1;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 501)
    public final void method1566(int arg0) {
        field3872++;
        if (arg0 != 1) {
            this.field3885 = (class44) null;
        }
        if (this.field3888 != null) {
            this.field3888.method1433((byte) -115);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lqg;ZI)V", line = 518)
    public static final void method1567(class244[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class142.field2464[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class142.field2464[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method1774(3, var5, var4);
                            }
                        }
                    }
                }
            }
            class311.field5236 += (int) (Math.random() * 5.0D) - 2;
            class225.field3848 += (int) (Math.random() * 5.0D) - 2;
            if (class311.field5236 < -16) {
                class311.field5236 = -16;
            }
            if (class311.field5236 > 16) {
                class311.field5236 = 16;
            }
            if (class225.field3848 < -8) {
                class225.field3848 = -8;
            }
            if (class225.field3848 > 8) {
                class225.field3848 = 8;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        field3864++;
        int var8 = class225.field3848 >> 2 << 10;
        int var9 = class311.field5236 >> 1;
        int[][] var10 = new int[104][104];
        if (arg2 < 64) {
            method1567((class244[]) null, true, -97);
        }
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class70.field1334[var12];
            if (!class108.field1900) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class132.field2328[var12][var17 + 1][var16] - class132.field2328[var12][var17 - 1][var16];
                        int var20 = class132.field2328[var12][var17][var16 + 1] - class132.field2328[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var19 * var19 + (var20 * var20) + 65536));
                        int var22 = -65536 / var21;
                        int var23 = (var19 << 8) / var21;
                        int var24 = (var13[var17 + 1][var16] >> 3) + ((var13[var17][var16 - 1] >> 2) + (var13[var17 - 1][var16] >> 2) - (-(var13[var17][var16 - -1] >> 3) - (var13[var17][var16] >> 1)));
                        int var25 = (var20 << 8) / var21;
                        int var26 = (var23 * -50 + var22 * -10 + var25 * -50) / var15 + var18;
                        var11[var17][var16] = var26 - var24;
                    }
                }
            } else if (class329.field5607) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44 - 1][var43] >> 2) + (var13[var44][var43 + 1] >> 3) + (var13[var44][var43 + -1] >> 2) - (-(var13[var44 + 1][var43] >> 3) + -(var13[var44][var43] >> 1));
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class276.field4746[0];
                int var28 = (int) class276.field4746[1];
                int var29 = (int) class276.field4746[2];
                int var30 = (int) Math.sqrt((double) (var29 * var29 + (var27 * var27 + (var28 * var28))));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        int var34 = class132.field2328[var12][var33 + 1][var32] - class132.field2328[var12][var33 - 1][var32];
                        byte var35 = 96;
                        int var36 = class132.field2328[var12][var33][var32 + 1] - class132.field2328[var12][var33][var32 - 1];
                        int var37 = (int) Math.sqrt((double) (var36 * var36 + var34 * var34 + 65536));
                        int var38 = (var34 << 8) / var37;
                        int var39 = (var13[var33][var32] >> 1) + (var13[var33 + 1][var32] >> 3) + ((var13[var33][var32 + -1] >> 2) + (var13[var33 - 1][var32] >> 2) - -(var13[var33][var32 + 1] >> 3));
                        int var40 = (var36 << 8) / var37;
                        int var41 = -65536 / var37;
                        int var42 = (var29 * var40 + var27 * var38 + var28 * var41) / var31 + var35;
                        var11[var33][var32] = var42 - ((int) ((float) var39 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class279.field4779[var47] = 0;
                class100.field1766[var47] = 0;
                class160.field2717[var47] = 0;
                class56.field992[var47] = 0;
                class169.field2914[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class260.field4515[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class173 var52 = class305.method2085(1, var51 - 1);
                            class279.field4779[var49] += var52.field3011;
                            class100.field1766[var49] += var52.field3008;
                            class160.field2717[var49] += var52.field3019;
                            class56.field992[var49] += var52.field3020;
                            var10002 = class169.field2914[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class260.field4515[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class173 var55 = class305.method2085(1, var54 - 1);
                            class279.field4779[var49] -= var55.field3011;
                            class100.field1766[var49] -= var55.field3008;
                            class160.field2717[var49] -= var55.field3019;
                            class56.field992[var49] -= var55.field3020;
                            var10002 = class169.field2914[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var60 += class169.field2914[var62];
                            var57 += class100.field1766[var62];
                            var59 += class56.field992[var62];
                            var58 += class160.field2717[var62];
                            var56 += class279.field4779[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var57 -= class100.field1766[var63];
                            var58 -= class160.field2717[var63];
                            var56 -= class279.field4779[var63];
                            var59 -= class56.field992[var63];
                            var60 -= class169.field2914[var63];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var10[var48][var61] = class243.method1754(false, var56 * 256 / var59, var57 / var60, var58 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label769: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class110.method781((byte) 126) || (class142.field2464[0][var64][var65] & 0x2) != 0 || (class142.field2464[var12][var64][var65] & 0x10) == 0 && class212.method1453(var65, -122, var64, var12) == class225.field3852) {
                        if (class287.field4915 > var12) {
                            class287.field4915 = var12;
                        }
                        int var66 = class260.field4515[var12][var64][var65] & 0xFF;
                        int var67 = class217.field3735[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class132.field2328[var12][var64 + 1][var65];
                            int var69 = class132.field2328[var12][var64][var65];
                            int var70 = class132.field2328[var12][var64 + 1][var65 + 1];
                            int var71 = class132.field2328[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class115.field2083[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class122.method874(-2702, var67 - 1).field5438) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var70 && var69 == var71) {
                                    class220.field3760[var12][var64][var65] = class97.method665(class220.field3760[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var10[var64][var65];
                                int var75 = (var73 & 0x7F) + var9;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var73 & 0x380) + (var73 + var8 & 0xFC00) + var75;
                                var74 = class227.field3907[class283.method1995(96, var76, 126)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class19.method186(var12, var64, var65, 0, 0, -1, var69, var68, var70, var71, class283.method1995(var77, var73, 126), class283.method1995(var78, var73, 126), class283.method1995(var79, var73, 126), class283.method1995(var80, var73, 126), 0, 0, 0, 0, var74, 0);
                                if (class108.field1900 && var12 > 0 && var73 != -1 && class305.method2085(1, var66 - 1).field3013) {
                                    class139.method966(0, 0, true, false, var64, var65, var69 - class132.field2328[0][var64][var65], -class132.field2328[0][var64 + 1][var65] + var68, var70 - class132.field2328[0][var64 + 1][var65 + 1], -class132.field2328[0][var64][var65 + 1] + var71);
                                }
                                if (class108.field1900 && !arg1 && class299.field5095 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= var64 + 1; var81++) {
                                        for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class217.field3735[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class323 var84 = class122.method874(-2702, var83 - 1);
                                                    if (var84.field5442 != -1 && class227.field3904.method1507(false, var84.field5442) == 4) {
                                                        class299.field5095[var64][var65] = (var84.field5457 << 24) + var84.field5447;
                                                        continue label769;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var85 = class236.field4084[var12][var64][var65];
                                int var86 = class115.field2083[var12][var64][var65] + 1;
                                class323 var87 = class122.method874(-2702, var67 - 1);
                                if (class108.field1900 && !arg1 && class299.field5095 != null && var12 == 0) {
                                    if (var87.field5442 != -1 && class227.field3904.method1507(false, var87.field5442) == 4) {
                                        class299.field5095[var64][var65] = (var87.field5457 << 24) + var87.field5447;
                                    } else {
                                        label750: for (int var88 = var64 - 1; var88 <= (var64 + 1); var88++) {
                                            for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class217.field3735[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class323 var91 = class122.method874(-2702, var90 - 1);
                                                        if (var91.field5442 != -1 && class227.field3904.method1507(false, var91.field5442) == 4) {
                                                            class299.field5095[var64][var65] = (var91.field5457 << 24) + var91.field5447;
                                                            break label750;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field5442;
                                if (var92 >= 0 && !class227.field3904.method1516((byte) 119, var92)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var94 = class227.field3907[class224.method1540(96, class227.field3904.method1509((byte) 123, var92), -1)];
                                    var93 = -1;
                                } else if (var87.field5443 == -1) {
                                    var93 = -2;
                                    var94 = 0;
                                } else {
                                    var93 = var87.field5443;
                                    int var95 = (var93 & 0x7F) + var9;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var93 + var8 & 0xFC00) + (var93 & 0x380) + var95;
                                    var94 = class227.field3907[class224.method1540(96, var96, -1)];
                                }
                                if (var87.field5436 >= 0) {
                                    int var97 = var87.field5436;
                                    int var98 = (var97 & 0x7F) + var9;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var97 & 0x380) + (var8 + var97 & 0xFC00) + var98;
                                    var94 = class227.field3907[class224.method1540(96, var99, -1)];
                                }
                                class19.method186(var12, var64, var65, var86, var85, var92, var69, var68, var70, var71, class283.method1995(var77, var73, 126), class283.method1995(var78, var73, 126), class283.method1995(var79, var73, 126), class283.method1995(var80, var73, 126), class224.method1540(var77, var93, -1), class224.method1540(var78, var93, -1), class224.method1540(var79, var93, -1), class224.method1540(var80, var93, -1), var74, var94);
                                if (class108.field1900 && var12 > 0) {
                                    class139.method966(var86, var85, var93 == -2 || !var87.field5448, var73 == -1 || !class305.method2085(1, var66 - 1).field3013, var64, var65, var69 - class132.field2328[0][var64][var65], var68 - class132.field2328[0][var64 + 1][var65], var70 - class132.field2328[0][var64 + 1][var65 + 1], -class132.field2328[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class108.field1900) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class132.field2328[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class37[] var109 = class38.method335(class142.field2464, (byte) 89, var10, class16.field256[0], var101, class132.field2328[var12], class115.field2083[var12], var102, class236.field4084[var12], class260.field4515[var12], var100, var11, var12, class299.field5095, class217.field3735[var12]);
                            class109.method773(var12, var109);
                            break;
                        }
                        class37[] var110 = class38.method335(class142.field2464, (byte) 89, var10, (int[][]) null, var101, class132.field2328[var12], class115.field2083[var12], var102, class236.field4084[var12], class260.field4515[var12], var100, var11, var12, (int[][]) null, class217.field3735[var12]);
                        class37[] var111 = class16.method158(255, class217.field3735[var12], class236.field4084[var12], var12, var11, var100, var101, class115.field2083[var12], class132.field2328[var12], var102, class142.field2464, class260.field4515[var12]);
                        class37[] var112 = new class37[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class109.method773(var12, var112);
                        class269.method1898(class216.field3703, var101, class115.field2083[var12], class216.field3710, class217.field3735[var12], var102, var12, class260.field4515[var12], class132.field2328[var12], class236.field4084[var12], false, var100);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        int var107 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 - (-(var107 * var107) - 65536)));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class260.field4515[var12] = (byte[][]) null;
            class217.field3735[var12] = (byte[][]) null;
            class115.field2083[var12] = (byte[][]) null;
            class236.field4084[var12] = (byte[][]) null;
            class70.field1334[var12] = (byte[][]) null;
        }
        class172.method1167(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class142.field2464[1][var115][var116] & 0x2) == 2) {
                    class132.method916(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class220.field3760[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class220.field3760[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121;
                        for (var121 = var118; var121 < 104 && (class220.field3760[var117][var119][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        int var122 = var117;
                        int var123 = var117;
                        label451: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class220.field3760[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label451;
                                }
                            }
                            var122--;
                        }
                        label440: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class220.field3760[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label440;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var123 + 1 - var122) * (var121 + 1 - var120);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class132.field2328[var123][var119][var120] - var127;
                            int var129 = class132.field2328[var122][var119][var120];
                            class213.method1459(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var128, var129);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class220.field3760[var130][var119][var131] = class305.method2086(class220.field3760[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class220.field3760[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 < 104 && (class220.field3760[var117][var132 + 1][var118] & 0x2) != 0; var132++) {
                        }
                        int var133 = var117;
                        int var134 = var117;
                        int var135;
                        for (var135 = var119; var135 > 0 && (class220.field3760[var117][var135 - 1][var118] & 0x2) != 0; var135--) {
                        }
                        label506: while (var134 > 0) {
                            for (int var136 = var135; var136 <= var132; var136++) {
                                if ((class220.field3760[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label506;
                                }
                            }
                            var134--;
                        }
                        label495: while (var133 < 3) {
                            for (int var137 = var135; var137 <= var132; var137++) {
                                if ((class220.field3760[var133 + 1][var137][var118] & 0x2) == 0) {
                                    break label495;
                                }
                            }
                            var133++;
                        }
                        int var138 = (var132 + 1 - var135) * (var133 + 1 - var134);
                        if (var138 >= 8) {
                            int var139 = class132.field2328[var134][var135][var118];
                            short var140 = 240;
                            int var141 = class132.field2328[var133][var135][var118] - var140;
                            class213.method1459(2, var135 * 128, var132 * 128 + 128, var118 * 128, var118 * 128, var141, var139);
                            for (int var142 = var134; var142 <= var133; var142++) {
                                for (int var143 = var135; var143 <= var132; var143++) {
                                    class220.field3760[var142][var143][var118] = class305.method2086(class220.field3760[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class220.field3760[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var118;
                        int var146;
                        for (var146 = var118; var146 > 0 && (class220.field3760[var117][var119][var146 - 1] & 0x4) != 0; var146--) {
                        }
                        while (var145 < 104 && (class220.field3760[var117][var119][var145 + 1] & 0x4) != 0) {
                            var145++;
                        }
                        label561: while (var144 > 0) {
                            for (int var147 = var146; var147 <= var145; var147++) {
                                if ((class220.field3760[var117][var144 - 1][var147] & 0x4) == 0) {
                                    break label561;
                                }
                            }
                            var144--;
                        }
                        int var148;
                        label549: for (var148 = var119; var148 < 104; var148++) {
                            for (int var149 = var146; var149 <= var145; var149++) {
                                if ((class220.field3760[var117][var148 + 1][var149] & 0x4) == 0) {
                                    break label549;
                                }
                            }
                        }
                        if (((var145 + 1 - var146) * (var148 + 1 - var144)) >= 4) {
                            int var150 = class132.field2328[var117][var144][var146];
                            class213.method1459(4, var144 * 128, var148 * 128 + 128, var146 * 128, var145 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var148; var151++) {
                                for (int var152 = var146; var152 <= var145; var152++) {
                                    class220.field3760[var117][var151][var152] = class305.method2086(class220.field3760[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 1484)
    public final void method1568(boolean arg0) {
        field3879++;
        if (this.field3888 == null) {
            return;
        }
        try {
            this.field3887.field195 = 0;
            this.field3887.method140(7, (byte) 75);
            this.field3887.method137(0, arg0);
            this.field3888.method1428(22974, 4, this.field3887.field174, 0);
        } catch (IOException var5) {
            try {
                this.field3888.method1433((byte) -115);
            } catch (Exception var4) {
            }
            this.field3891++;
            this.field3893 = -2;
            this.field3888 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I", line = 1509)
    private final int method1569(int arg0) {
        field3877++;
        if (arg0 != 9317) {
            this.method1568(true);
        }
        return this.field3884.method380(0) + this.field3885.method380(0);
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 1521)
    public static final void method1570(int arg0) {
        field3873++;
        if (class111.field1956 || class329.field5599 == 2) {
            return;
        }
        try {
            class20.field314.method1634((byte) -2, class15.field223);
        } catch (Throwable var2) {
        }
        if (arg0 != 0) {
            method1572((byte) -28);
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 1547)
    public final void method1571(int arg0) {
        if (arg0 >= -76) {
            method1561((byte) -1, (class229) null);
        }
        if (this.field3888 != null) {
            this.field3888.method1432(20752);
        }
        field3870++;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V", line = 1568)
    public static final void method1572(byte arg0) {
        int var1 = class150.field2593 * 128 + 64;
        int var2 = class84.field1602 * 128 + 64;
        field3863++;
        int var3 = class282.method1984((byte) -127, var1, var2, class16.field254) - class289.field4942;
        if (class295.field5039 >= 100) {
            class97.field1721 = class84.field1602 * 128 + 64;
            class243.field4301 = class150.field2593 * 128 + 64;
            class107.field1881 = class282.method1984((byte) -109, class243.field4301, class97.field1721, class16.field254) - class289.field4942;
        } else {
            if (class107.field1881 < var3) {
                class107.field1881 += class315.field5340 + ((var3 - class107.field1881) * class295.field5039 / 1000);
                if (var3 < class107.field1881) {
                    class107.field1881 = var3;
                }
            }
            if (var1 > class243.field4301) {
                class243.field4301 += (var1 - class243.field4301) * class295.field5039 / 1000 + class315.field5340;
                if (class243.field4301 > var1) {
                    class243.field4301 = var1;
                }
            }
            if (class107.field1881 > var3) {
                class107.field1881 -= (class107.field1881 - var3) * class295.field5039 / 1000 + class315.field5340;
                if (var3 > class107.field1881) {
                    class107.field1881 = var3;
                }
            }
            if (var1 < class243.field4301) {
                class243.field4301 -= (class243.field4301 - var1) * class295.field5039 / 1000 + class315.field5340;
                if (var1 > class243.field4301) {
                    class243.field4301 = var1;
                }
            }
            if (var2 > class97.field1721) {
                class97.field1721 += (var2 - class97.field1721) * class295.field5039 / 1000 + class315.field5340;
                if (class97.field1721 > var2) {
                    class97.field1721 = var2;
                }
            }
            if (var2 < class97.field1721) {
                class97.field1721 -= (class97.field1721 - var2) * class295.field5039 / 1000 + class315.field5340;
                if (var2 > class97.field1721) {
                    class97.field1721 = var2;
                }
            }
        }
        int var4 = class104.field1808 * 128 + 64;
        int var5 = class61.field1048 * 128 + 64;
        int var6 = class282.method1984((byte) -95, var5, var4, class16.field254) - class327.field5500;
        int var7 = var5 - class243.field4301;
        int var8 = var6 - class107.field1881;
        int var9 = var4 - class97.field1721;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (arg0 != 107) {
            return;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class203.field3550 < var11) {
            class203.field3550 += (var11 - class203.field3550) * class295.field5040 / 1000 + class126.field2233;
            if (class203.field3550 > var11) {
                class203.field3550 = var11;
            }
        }
        if (var11 < class203.field3550) {
            class203.field3550 -= (class203.field3550 - var11) * class295.field5040 / 1000 + class126.field2233;
            if (class203.field3550 < var11) {
                class203.field3550 = var11;
            }
        }
        int var13 = var12 - class174.field3043;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class174.field3043 += class126.field2233 + (class295.field5040 * var13 / 1000);
            class174.field3043 &= 0x7FF;
        }
        if (var13 < 0) {
            class174.field3043 -= -var13 * class295.field5040 / 1000 + class126.field2233;
            class174.field3043 &= 0x7FF;
        }
        int var14 = var12 - class174.field3043;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class174.field3043 = var12;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V", line = 1720)
    private final void method1573(boolean arg0) {
        field3865++;
        if (this.field3888 == null) {
            return;
        }
        try {
            this.field3887.field195 = 0;
            if (arg0) {
                this.method1573(true);
            }
            this.field3887.method140(6, (byte) 75);
            this.field3887.method137(3, true);
            this.field3888.method1428(22974, 4, this.field3887.field174, 0);
        } catch (IOException var5) {
            try {
                this.field3888.method1433((byte) -115);
            } catch (Exception var4) {
            }
            this.field3891++;
            this.field3888 = null;
            this.field3893 = -2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V", line = 1747)
    public static void method1574(int arg0) {
        field3880 = null;
        field3866 = null;
        if (arg0 != 1) {
            field3866 = (int[]) null;
        }
        field3861 = null;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)Z", line = 1763)
    public final boolean method1575(int arg0) {
        field3867++;
        if (arg0 < 3) {
            return true;
        } else {
            return this.method1559((byte) 79) >= 20;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZBLea;)V", line = 1781)
    public final void method1576(boolean arg0, byte arg1, class205 arg2) {
        if (this.field3888 != null) {
            try {
                this.field3888.method1433((byte) -115);
            } catch (Exception var11) {
            }
            this.field3888 = null;
        }
        field3876++;
        this.field3888 = arg2;
        if (arg1 > -77) {
            field3866 = (int[]) null;
        }
        this.method1573(false);
        this.method1558(arg0, -73);
        this.field3894 = null;
        this.field3892.field195 = 0;
        while (true) {
            class238 var5 = (class238) this.field3882.method372(3791);
            if (var5 == null) {
                while (true) {
                    class238 var6 = (class238) this.field3885.method372(3791);
                    if (var6 == null) {
                        if (this.field3890 != 0) {
                            try {
                                this.field3887.field195 = 0;
                                this.field3887.method140(4, (byte) 75);
                                this.field3887.method140(this.field3890, (byte) 75);
                                this.field3887.method125(-25369, 0);
                                this.field3888.method1428(22974, 4, this.field3887.field174, 0);
                            } catch (IOException var10) {
                                try {
                                    this.field3888.method1433((byte) -115);
                                } catch (Exception var9) {
                                }
                                this.field3888 = null;
                                this.field3891++;
                                this.field3893 = -2;
                            }
                        }
                        this.field3886 = 0;
                        this.field3889 = class153.method1032(106);
                        return;
                    }
                    this.field3884.method375(42, var6);
                }
            }
            this.field3875.method375(42, var5);
        }
    }
}
