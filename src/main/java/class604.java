import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class604 extends class5 {

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    private int field8506 = -1;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public int field8499;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public int field8509;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
    public int[] field8500;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V", line = 9)
    public static final void method3311(int arg0) {
        class592.method3251(60, class301.field3698.field6606);
        ++field8502;
        int var1 = (class20.field292 >> 12) + (class145.field1879 >> 3);
        int var2 = (class630.field8817 >> 3) + (class276.field3464 >> 12);
        class476.field6039 = class376.field4748.field6470 = 0;
        class376.field4748.method2786(arg0 + 16773839, 8, 8);
        if (arg0 != -16777216) {
            method3311(120);
        }
        byte var3 = 18;
        class277.field3474 = new byte[var3][];
        class500.field6598 = new int[var3][4];
        class496.field6546 = new byte[var3][];
        class564.field7842 = new int[var3];
        class511.field6945 = new int[var3];
        class209.field2635 = new byte[var3][];
        class137.field1782 = new byte[var3][];
        class638.field8956 = new int[var3];
        class565.field7887 = new int[var3];
        class633.field8884 = new int[var3];
        class442.field5599 = new int[var3];
        class169.field2212 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (-(class431.field5395 >> 4) + var1) / 8; ~var5 >= ~(((class431.field5395 >> 4) + var1) / 8); ++var5) {
            for (int var8 = (-(class452.field5802 >> 4) + var2) / 8; ((class452.field5802 >> 4) + var2) / 8 >= var8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class564.field7842[var4] = var9;
                class442.field5599[var4] = class600.field8416.method3341("m" + var5 + "_" + var8, arg0 + 16777307);
                class511.field6945[var4] = class600.field8416.method3341("l" + var5 + "_" + var8, class688.method3877(arg0, 16777133));
                class565.field7887[var4] = class600.field8416.method3341("n" + var5 + "_" + var8, class688.method3877(arg0, -16777183));
                class633.field8884[var4] = class600.field8416.method3341("um" + var5 + "_" + var8, class688.method3877(arg0, 16777114));
                class638.field8956[var4] = class600.field8416.method3341("ul" + var5 + "_" + var8, arg0 + 16777285);
                if (class565.field7887[var4] == -1) {
                    class442.field5599[var4] = -1;
                    class511.field6945[var4] = -1;
                    class633.field8884[var4] = -1;
                    class638.field8956[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; class565.field7887.length > var6; ++var6) {
            class565.field7887[var6] = -1;
            class442.field5599[var6] = -1;
            class511.field6945[var6] = -1;
            class633.field8884[var6] = -1;
            class638.field8956[var6] = -1;
        }
        byte var7;
        if (class504.field6675 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class560.method3075(var7, 512, false, var1, var2);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLr;)V", line = 95)
    public static final void method3312(boolean arg0, class566 arg1) {
        ++field8507;
        int var2 = class219.field2680;
        int var3 = class88.field1231;
        int var4 = class672.field9461;
        int var5 = class50.field720 + -3;
        byte var6 = 20;
        if (class423.field5310 == null || class596.field8385 == null) {
            if (class631.field8846.method3368(1912, class700.field9908) && class631.field8846.method3368(1912, class50.field705)) {
                class423.field5310 = arg1.method1072(class661.method3715(class631.field8846, class700.field9908, 0), true);
                class661 var7 = class661.method3715(class631.field8846, class50.field705, 0);
                class596.field8385 = arg1.method1072(var7, true);
                var7.method3714();
                class157.field2048 = arg1.method1072(var7, true);
            } else {
                arg1.method1090(var2, var3, var4, var6, class551.field7670 | -class107.field1429 + 255 << 24, 1);
            }
        }
        if (class423.field5310 != null && class596.field8385 != null) {
            int var8 = (var4 - class596.field8385.method167() * 2) / class423.field5310.method167();
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                class423.field5310.method2902(var2 - -class596.field8385.method167() - -(var9 * class423.field5310.method167()), var3);
            }
            class596.field8385.method2902(var2, var3);
            class157.field2048.method2902(var2 + var4 + -class157.field2048.method167(), var3);
        }
        class65.field889.method2192(-16777216 | class408.field5120, true, var2 + 3, class83.field1132.method476((byte) -62, class250.field3068), -1, var3 + 14);
        arg1.method1090(var2, var3 + var6, var4, -var6 + var5, class551.field7670 | 255 - class107.field1429 << 24, 1);
        int var10 = class289.field3592.method944(2000);
        int var11 = class289.field3592.method941(118);
        int var12 = 0;
        for (class145 var13 = (class145) class1.field7.method237(86); var13 != null; var13 = (class145) class1.field7.method245((byte) 38)) {
            int var31 = var3 - -((class463.field5904 - 1 + -var12) * 16) + var6 + 13;
            ++var12;
            if (var2 < var10 && var2 + var4 > var10 && ~(var31 - 13) > ~var11 && var11 < var31 + 4 && var13.field1877) {
                arg1.method1090(var2, var31 + -12, var4, 16, class633.field8879 | 255 - class16.field263 << 24, 1);
            }
        }
        if ((class238.field2972 == null || class188.field2362 == null || class514.field6997 == null) && class631.field8846.method3368(1912, class65.field890) && class631.field8846.method3368(1912, class67.field913) && class631.field8846.method3368(1912, class629.field8761)) {
            class661 var14 = class661.method3715(class631.field8846, class67.field913, 0);
            class188.field2362 = arg1.method1072(var14, true);
            var14.method3714();
            class645.field9071 = arg1.method1072(var14, true);
            class238.field2972 = arg1.method1072(class661.method3715(class631.field8846, class65.field890, 0), true);
            class661 var15 = class661.method3715(class631.field8846, class629.field8761, 0);
            class514.field6997 = arg1.method1072(var15, true);
            var15.method3714();
            class160.field2101 = arg1.method1072(var15, true);
        }
        if (class238.field2972 != null && class188.field2362 != null && class514.field6997 != null) {
            int var16 = (-(2 * class514.field6997.method167()) + var4) / class238.field2972.method167();
            for (int var17 = 0; ~var16 < ~var17; ++var17) {
                class238.field2972.method2902(class514.field6997.method167() + var2 + class238.field2972.method167() * var17, var3 + var5 - class238.field2972.method162());
            }
            int var18 = (-var6 + var5 + -class514.field6997.method162()) / class188.field2362.method162();
            for (int var19 = 0; var18 > var19; ++var19) {
                class188.field2362.method2902(var2, var3 + (var6 - -(class188.field2362.method162() * var19)));
                class645.field9071.method2902(var2 + (var4 - class645.field9071.method167()), var19 * class188.field2362.method162() + var6 + var3);
            }
            class514.field6997.method2902(var2, -class514.field6997.method162() + (var3 - -var5));
            class160.field2101.method2902(var4 + (var2 - class514.field6997.method167()), -class514.field6997.method162() + var3 + var5);
        }
        int var20 = 0;
        for (class145 var21 = (class145) class1.field7.method237(106); var21 != null; var21 = (class145) class1.field7.method245((byte) 41)) {
            int var22 = var3 + var6 - (-13 - (class463.field5904 - 1 + -var20) * 16);
            int var23 = -16777216 | class408.field5120;
            if (~var2 > ~var10 && var10 < var2 + var4 && ~(var22 + -13) > ~var11 && ~var11 > ~(var22 + 4) && var21.field1877) {
                var23 = -16777216 | class446.field5666;
            }
            int[] var24 = null;
            if (class497.method2674(var21.field1873, (byte) 56)) {
                var24 = class633.field8881.method434(12388, (int) var21.field1865).field80;
            } else if (var21.field1866 == -1) {
                if (!class605.method3316(-1, var21.field1873)) {
                    if (class556.method3060(var21.field1873, 21922)) {
                        Object var25 = null;
                        class441 var26;
                        if (var21.field1873 == 1008) {
                            var26 = class428.field5352.method3138((byte) 104, (int) var21.field1865);
                        } else {
                            var26 = class428.field5352.method3138((byte) 90, (int) (2147483647L & var21.field1865 >>> 32));
                        }
                        if (var26.field5574 != null) {
                            var26 = var26.method2355(class684.field9606, -1643);
                        }
                        if (var26 != null) {
                            var24 = var26.field5510;
                        }
                    }
                } else {
                    class206 var27 = (class206) class180.field2318.method399(-32748, (long) ((int) var21.field1865));
                    if (var27 != null) {
                        class307 var28 = var27.field2618;
                        class586 var29 = var28.field3902;
                        if (var29.field8205 != null) {
                            var29 = var29.method3220(-4261, class684.field9606);
                        }
                        if (var29 != null) {
                            var24 = var29.field8200;
                        }
                    }
                }
            } else {
                var24 = class633.field8881.method434(12388, var21.field1866).field80;
            }
            String var30 = class425.method2255(var21, 124);
            if (var24 != null) {
                var30 = var30 + class531.method2880(var24, (byte) 126);
            }
            class65.field889.method2193(-4611, 0, class478.field6077, var22, class304.field3747, var23, var2 - -3, var30);
            if (var21.field1864) {
                class600.field8418.method2902(class546.field7269.method3269((byte) 99, var30) + var2 + 5, var22 + -12);
            }
            ++var20;
        }
        if (arg0) {
            method3311(-18);
        }
        class698.method3925(class88.field1231, class219.field2680, class672.field9461, (byte) 97, class50.field720);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I", line = 299)
    public final int method38(byte arg0) {
        int var2 = 69 % ((67 - arg0) / 56);
        ++field8501;
        return this.field8506;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 309)
    public final void method37(int arg0) {
        if (arg0 < 42) {
            this.method3313((byte) -85);
        }
        ++field8508;
        super.method37(74);
        this.field8500 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 321)
    public class604() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Z", line = 324)
    public final boolean method3313(byte arg0) {
        ++field8504;
        if (this.field8500 != null) {
            return true;
        } else if (this.field8506 >= 0) {
            class661 var2 = ~class506.field6697 <= -1 ? class661.method3715(class433.field5432, class506.field6697, this.field8506) : class661.method3721(class433.field5432, this.field8506);
            var2.method3717();
            this.field8500 = var2.method3725();
            this.field8499 = var2.field9353;
            this.field8509 = var2.field9351;
            return true;
        } else {
            int var3 = 43 / ((-44 - arg0) / 43);
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILes;I)V", line = 349)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            ++field8505;
            if (arg2 == 0) {
                this.field8506 = arg1.method3470(arg0 + 13110);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[[I", line = 371)
    public int[][] method44(int arg0, boolean arg1) {
        ++field8503;
        int[][] var3 = super.field135.method2706(arg0, -56);
        if (super.field135.field6667 && this.method3313((byte) 104)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field8509 * (~class622.field8706 == ~this.field8499 ? arg0 : this.field8499 * arg0 / class622.field8706);
            if (class657.field9287 != this.field8509) {
                for (int var8 = 0; var8 < class657.field9287; ++var8) {
                    int var9 = this.field8509 * var8 / class657.field9287;
                    int var10 = this.field8500[var7 + var9];
                    var6[var8] = class695.method3921(var10 << 4, 4080);
                    var5[var8] = class695.method3921(var10 >> 4, 4080);
                    var4[var8] = class695.method3921(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class657.field9287; ++var11) {
                    int var12 = this.field8500[var7++];
                    var6[var11] = class695.method3921(4080, var12 << 4);
                    var5[var11] = class695.method3921(4080, var12 >> 4);
                    var4[var11] = class695.method3921(4080, var12 >> 12);
                }
            }
        }
        if (!arg1) {
            this.method47(34, (class630) null, -119);
        }
        return var3;
    }
}
