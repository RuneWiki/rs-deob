import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class681 extends class38 {

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
    private int field9445 = 4096;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "I")
    public static int field9446 = 0;

    @OriginalMember(owner = "client!nfa", name = "I", descriptor = "[I")
    public static int[] field9450 = new int[2];

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V", line = 4)
    public static void method3900(int arg0) {
        if (arg0 < -101) {
            field9450 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)V", line = 18)
    public static final void method3901(int arg0) {
        class459.method2803((byte) -41, false);
        ++field9449;
        class456.field6729 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class46.field666.length < ~var2; ++var2) {
            if (class642.field9002[var2] != -1 && class46.field666[var2] == null) {
                class46.field666[var2] = class111.field1553.method211(true, class642.field9002[var2], 0);
                if (class46.field666[var2] == null) {
                    ++class456.field6729;
                    var1 = false;
                }
            }
            if (class606.field8557[var2] != -1 && class502.field7147[var2] == null) {
                class502.field7147[var2] = class111.field1553.method218(10253, 0, class606.field8557[var2], class724.field10107[var2]);
                if (class502.field7147[var2] == null) {
                    var1 = false;
                    ++class456.field6729;
                }
            }
            if (class298.field4233[var2] != -1 && class146.field1945[var2] == null) {
                class146.field1945[var2] = class111.field1553.method211(true, class298.field4233[var2], 0);
                if (class146.field1945[var2] == null) {
                    var1 = false;
                    ++class456.field6729;
                }
            }
            if (~class446.field6617[var2] != 0 && class324.field4628[var2] == null) {
                class324.field4628[var2] = class111.field1553.method211(true, class446.field6617[var2], 0);
                if (class324.field4628[var2] == null) {
                    var1 = false;
                    ++class456.field6729;
                }
            }
            if (class468.field6842 != null && class140.field1857[var2] == null && ~class468.field6842[var2] != 0) {
                class140.field1857[var2] = class111.field1553.method218(10253, 0, class468.field6842[var2], class724.field10107[var2]);
                if (class140.field1857[var2] == null) {
                    var1 = false;
                    ++class456.field6729;
                }
            }
        }
        if (class567.field8057 == null) {
            if (class194.field2944 != null && class564.field8027.method221(-128, class194.field2944.field1654 + "_staticelements")) {
                if (!class564.field8027.method204(class194.field2944.field1654 + "_staticelements", arg0 ^ 28881)) {
                    ++class456.field6729;
                    var1 = false;
                } else {
                    class567.field8057 = class405.method2573(class691.field9553, -1, class564.field8027, class194.field2944.field1654 + "_staticelements");
                }
            } else {
                class567.field8057 = new class152(0);
            }
        }
        if (!var1) {
            class505.field7183 = 1;
        } else {
            boolean var3 = true;
            class44.field477 = 0;
            for (int var4 = 0; ~var4 > ~class46.field666.length; ++var4) {
                byte[] var21 = class502.field7147[var4];
                if (var21 != null) {
                    int var22 = (class434.field6462[var4] >> 8) * 64 + -class361.field5224;
                    int var23 = (class434.field6462[var4] & 255) * 64 + -class582.field8288;
                    if (~class9.field132 != -1) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class473.method2858(class194.field2946, var22, var23, class255.field3656, arg0 ^ -28839, var21);
                }
                byte[] var24 = class324.field4628[var4];
                if (var24 != null) {
                    int var25 = (class434.field6462[var4] >> 8) * 64 + -class361.field5224;
                    int var26 = (class434.field6462[var4] & 255) * 64 + -class582.field8288;
                    if (~class9.field132 != -1) {
                        var26 = 10;
                        var25 = 10;
                    }
                    var3 &= class473.method2858(class194.field2946, var25, var26, class255.field3656, -23, var24);
                }
            }
            if (!var3) {
                class505.field7183 = 2;
            } else {
                if (class505.field7183 != 0) {
                    class310.method1960(true, class430.field6382.method2679(class650.field9160, 102) + "<br>(100%)", class55.field764, class358.field5201, (byte) -124, class736.field10316);
                }
                class290.method1858((byte) 97);
                class132.method934(false);
                class434.method2688(-106);
                boolean var5 = false;
                if (class736.field10316.method483() && ~class63.field916.field10166.method4091(arg0 ^ 13551) == -3) {
                    for (int var6 = 0; ~var6 > ~class46.field666.length; ++var6) {
                        if (class324.field4628[var6] != null || class146.field1945[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class63.field916.field10209.method3083(17503) != 1) {
                    var7 = class598.field8471[class358.field5197];
                } else {
                    var7 = class70.field987[class358.field5197];
                }
                if (class736.field10316.method475()) {
                    ++var7;
                }
                class194.method1348(class736.field10316, class289.field4113, 9, 4, class194.field2946, class255.field3656, var7, var5, class736.field10316.method433() > 0);
                class284.method1816(class99.field1422);
                if (~class99.field1422 != -1) {
                    class131.method931(class427.field6332);
                } else {
                    class131.method931((class61) null);
                }
                for (int var8 = 0; var8 < 4; ++var8) {
                    class326.field4655[var8].method1590((byte) -104);
                }
                class117.method857((byte) -114);
                class760.method4229(false, arg0 + -28721);
                class572.method3312((byte) -128);
                class324.field4627 = false;
                class704.field9842 = null;
                class290.method1858((byte) 74);
                System.gc();
                class459.method2803((byte) -41, true);
                class754.method4203(true);
                field9446 = class63.field916.field10185.method2160(arg0 ^ 13551);
                class165.field2607 = class265.field3794 >= 96;
                class579.field8242 = class63.field916.field10166.method4091(17503) == 2;
                class267.field3823 = ~class63.field916.field10175.method1990(17503) == -2;
                class218.field3213 = class63.field916.field10204.method368(17503) == 1 ? -1 : class700.field9654;
                class57.field793 = class63.field916.field10207.method3961(17503) == 1;
                class209.field3068 = class63.field916.field10162.method4009(17503) == 1;
                class671.field9358 = new class227(4, class194.field2946, class255.field3656, false);
                if (~class9.field132 == -1) {
                    class312.method1970(class46.field666, (byte) -36, class671.field9358);
                } else {
                    class376.method2435(class46.field666, false, class671.field9358);
                }
                class392.method2511(class194.field2946 >> 4, -1, class255.field3656 >> 4);
                class497.method2958((byte) -121);
                if (var5) {
                    class320.method2023(true);
                    class754.field10540 = new class227(1, class194.field2946, class255.field3656, true);
                    if (class9.field132 == 0) {
                        class312.method1970(class146.field1945, (byte) -79, class754.field10540);
                        class459.method2803((byte) -41, true);
                    } else {
                        class376.method2435(class146.field1945, false, class754.field10540);
                        class459.method2803((byte) -41, true);
                    }
                    class754.field10540.method55(class671.field9358.field137[0], 0, -1);
                    class754.field10540.method66(8, (int[][][]) null, (class240[]) null, class736.field10316);
                    class320.method2023(false);
                }
                class671.field9358.method66(arg0 + -28840, !var5 ? null : class754.field10540.field137, class326.field4655, class736.field10316);
                if (class9.field132 == 0) {
                    class459.method2803((byte) -41, true);
                    class476.method2871((byte) -125, class502.field7147, class671.field9358);
                    if (class140.field1857 != null) {
                        class528.method3089(-30266);
                    }
                } else {
                    class459.method2803((byte) -41, true);
                    class99.method773(class502.field7147, arg0 + -43221, class671.field9358);
                }
                class132.method934(false);
                if (~class265.field3794 > -97) {
                    class748.method4176(31622);
                }
                class459.method2803((byte) -41, true);
                class671.field9358.method61((class280) null, class736.field10316, !var5 ? null : class46.field568[0], arg0 + -28844);
                class671.field9358.method1530(108, class736.field10316, false);
                class459.method2803((byte) -41, true);
                if (var5) {
                    class320.method2023(true);
                    class459.method2803((byte) -41, true);
                    if (~class9.field132 != -1) {
                        class99.method773(class324.field4628, -14373, class754.field10540);
                    } else {
                        class476.method2871((byte) -125, class324.field4628, class754.field10540);
                    }
                    class132.method934(false);
                    class459.method2803((byte) -41, true);
                    class754.field10540.method61(class531.field7566[0], class736.field10316, (class280) null, 4);
                    class754.field10540.method1530(arg0 ^ 28896, class736.field10316, true);
                    class459.method2803((byte) -41, true);
                    class320.method2023(false);
                }
                class546.method3197((byte) 117);
                int var9 = class671.field9358.field3338;
                if (~var9 < ~class341.field4946) {
                    var9 = class341.field4946;
                }
                if (~var9 > ~(class341.field4946 + -1)) {
                    var9 = class341.field4946 + -1;
                }
                if (~class63.field916.field10204.method368(arg0 + -11345) != -1) {
                    class557.method3250(0);
                } else {
                    class557.method3250(var9);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var19 = 0; var19 < class194.field2946; ++var19) {
                        for (int var20 = 0; var20 < class255.field3656; ++var20) {
                            class41.method295(var10, var19, var20, 0);
                        }
                    }
                }
                class603.method3502(102);
                class290.method1858((byte) 38);
                class418.method2639(-118);
                class132.method934(false);
                class290.method1850(-115);
                if (class169.field2648 != null && class533.field7668 != null && class87.field1246 == 11) {
                    ++class738.field10352;
                    class468 var11 = class93.method734(class29.field284, class453.field6685, 8174);
                    var11.field6839.method3695(1057001181, arg0 + -28593);
                    class120.method872((byte) 53, var11);
                }
                if (class9.field132 == 0) {
                    int var12 = (-(class194.field2946 >> 4) + class352.field5126) / 8;
                    int var13 = ((class194.field2946 >> 4) + class352.field5126) / 8;
                    int var14 = (-(class255.field3656 >> 4) + class499.field7093) / 8;
                    int var15 = ((class255.field3656 >> 4) + class499.field7093) / 8;
                    for (int var16 = var12 - 1; var16 <= var13 + 1; ++var16) {
                        for (int var17 = var14 + -1; var17 <= var15 + 1; ++var17) {
                            if (~var12 < ~var16 || var16 > var13 || ~var14 < ~var17 || var15 < var17) {
                                class111.field1553.method209((byte) -125, "m" + var16 + "_" + var17);
                                class111.field1553.method209((byte) -125, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (class87.field1246 == 4) {
                    class49.method363(3, -121);
                } else if (~class87.field1246 != -9) {
                    class49.method363(10, -75);
                    if (class533.field7668 != null) {
                        class468 var18 = class93.method734(class29.field284, class705.field9933, arg0 ^ 28510);
                        class120.method872((byte) 117, var18);
                    }
                } else {
                    class49.method363(7, -26);
                }
                class537.method3151((byte) -114);
                class290.method1858((byte) 36);
                class375.method2430((byte) -118);
                if (arg0 != 28848) {
                    field9446 = 111;
                }
                class226.field3323 = true;
                if (class15.field201) {
                    class533.method3136(119, "Took: " + (class524.method3075(arg0 + -28830) - class337.field4911) + "ms");
                    class15.field201 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V", line = 571)
    public class681() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IILrg;)V", line = 504)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 == 0) {
            this.field9445 = arg2.method3712((byte) -121);
        }
        if (arg0 >= 34) {
            ++field9448;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BI)[I", line = 518)
    public final int[] method199(byte arg0, int arg1) {
        ++field9447;
        if (arg0 >= -43) {
            field9450 = null;
        }
        int[] var3 = super.field397.method1376(arg1, (byte) 118);
        if (super.field397.field3005) {
            int[] var4 = this.method189(class619.field8708 & arg1 + -1, 0, (byte) -92);
            int[] var5 = this.method189(arg1, 0, (byte) -92);
            int[] var6 = this.method189(arg1 + 1 & class619.field8708, 0, (byte) -92);
            for (int var7 = 0; ~var7 > ~class729.field10216; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field9445;
                int var9 = (var5[class554.field7909 & var7 - -1] - var5[var7 - 1 & class554.field7909]) * this.field9445;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }
}
