import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class442 implements class685 {

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Ljava/lang/String;")
    private String field6095;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Lwu;")
    private class376 field6094;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Lqr;")
    public static class65 field6091 = new class65(3000000, 200);

    @OriginalMember(owner = "client!io", name = "k", descriptor = "Z")
    public static boolean field6096 = false;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "F")
    public static float field6097 = 1.0F;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "Z")
    public static boolean field6098 = false;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLvfa;)Lvfa;", line = 7)
    public static final class672 method2542(boolean arg0, class672 arg1) {
        field6086++;
        if (arg1.field9255 != -1) {
            return class21.method225(65535, arg1.field9255);
        } else if (arg0) {
            return null;
        } else {
            int var2 = arg1.field9200 >>> 16;
            class425 var3 = new class425(class350.field4925);
            for (class8 var4 = (class8) var3.method2454((byte) -91); var4 != null; var4 = (class8) var3.method2453(20322)) {
                if (var4.field161 == var2) {
                    return class21.method225(65535, (int) var4.field8680);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 38)
    public static final void method2543(byte arg0) {
        field6087++;
        if (class341.field4807.method436()) {
            class341.field4807.method507(class295.field4217);
            class153.method1121(-125);
            if (class24.field412) {
                class63.method543(1, class295.field4217);
            } else {
                Dimension var1 = class295.field4217.getSize();
                class341.field4807.method395(class295.field4217, var1.width, var1.height);
            }
            class341.field4807.method472(class295.field4217);
        } else {
            class421.method2435(false, 63, class411.field5711.field3913.method3282(true));
        }
        class312.method1915(-101);
        class302.field4291 = true;
        if (arg0 < 98) {
            method2542(true, null);
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V", line = 68)
    public static final void method2544(byte arg0) {
        if (!class403.field5625) {
            class163.field2471 = class434.field5977 != -1 && class434.field5977 <= class181.field2730 || (class743.field10329 ? 26 : 22) + class181.field2730 * 16 > class199.field2993;
        }
        field6092++;
        class69.field842.method23(10);
        class76.field927.method23(10);
        for (class433 var1 = (class433) class446.field6126.method21(2); var1 != null; var1 = (class433) class446.field6126.method9(-128)) {
            int var38 = var1.field5963;
            if (var38 < 1000) {
                var1.method3564(true);
                if (var38 == 21 || var38 == 46 || var38 == 9 || var38 == 44 || var38 == 60 || var38 == 22 || var38 == 25) {
                    class76.field927.method11(var1, -102);
                } else {
                    class69.field842.method11(var1, -99);
                }
            }
        }
        class69.field842.method16(class446.field6126, -2);
        class76.field927.method16(class446.field6126, -2);
        if (class181.field2730 <= 1) {
            class218.field3147 = null;
            class436.field6017 = null;
        } else {
            if (class658.field8699 && class153.field2345.method2313(true, 81) && class181.field2730 > 2) {
                class218.field3147 = (class433) class446.field6126.field24.field8681.field8681;
            } else {
                class218.field3147 = (class433) class446.field6126.field24.field8681;
            }
            class436.field6017 = (class433) class446.field6126.field24.field8681;
        }
        if (arg0 >= -14) {
            method2544((byte) 58);
        }
        int var2 = -1;
        class466 var3 = (class466) class334.field4747.method21(2);
        if (var3 != null) {
            var2 = var3.method1100(-128);
        }
        if (!class403.field5625) {
            if (var2 == 0 && (class536.field7066 == 1 && class181.field2730 > 2 || class281.method1733(-555))) {
                var2 = 2;
            }
            if (var2 == 2 && class181.field2730 > 0 && var3 != null) {
                if (class137.field2182 == null && class211.field3105 == 0) {
                    class540.method3014(var3.method1098(-15204), 5966, var3.method1099((byte) -7));
                } else {
                    class30.field479 = 2;
                }
            }
            if (var2 == 0) {
                if (class218.field3147 != null) {
                    class645.method3534((byte) 117);
                } else if (class142.field2268) {
                    class617.method3377((byte) -119);
                }
            }
            if (class137.field2182 != null || class211.field3105 != 0) {
                return;
            }
            class30.field479 = 0;
            class348.field4895 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class569.field7492.method780((byte) -73);
            int var5 = class569.field7492.method772(117);
            boolean var6 = false;
            if (class21.field392 != null) {
                if (var4 >= class267.field3716 - 10 && var4 <= (class366.field5133 + class267.field3716 + 10) && var5 >= class214.field3121 - 10 && var5 <= (class214.field3121 + class274.field3814 + 10)) {
                    var6 = true;
                } else {
                    class30.method265(false);
                }
            }
            if (!var6) {
                if (var4 < class477.field6534 - 10 || var4 > class575.field7554 + class477.field6534 + 10 || (class733.field10151 - 10) > var5 || var5 > class733.field10151 + class141.field2261 + 10) {
                    class355.method2120(-1877);
                } else if (class163.field2471) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class172.field2634; var9++) {
                        if (class743.field10329) {
                            int var11 = class733.field10151 - (-var9 * 16 - 33);
                            if (var5 > (var11 - 13) && (var11 + 4) > var5) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var10 = var9 * 16 + (class733.field10151 + 31);
                            if (var10 - 13 < var5 && var5 < (var10 + 3)) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class327 var13 = new class327(class592.field7703);
                        for (class236 var14 = (class236) var13.method1981((byte) 47); var14 != null; var14 = (class236) var13.method1979(false)) {
                            if (var7 == var12) {
                                if (var14.field3323 > 1) {
                                    class723.method4073((byte) 114, var14, var5, var8);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1098(-15204);
        int var16 = var3.method1099((byte) -102);
        if (class21.field392 != null && class267.field3716 <= var15 && (class267.field3716 + class366.field5133) >= var15 && var16 >= class214.field3121 && var16 <= (class274.field3814 + class214.field3121)) {
            int var17 = -1;
            for (int var18 = 0; var18 < class21.field392.field3323; var18++) {
                if (class743.field10329) {
                    int var22 = var18 * 16 + class214.field3121 + 33;
                    if ((var22 - 13) < var16 && var16 < var22 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var23 = var18 * 16 + class214.field3121 + 31;
                    if (var23 - 13 < var16 && var16 < (var23 + 3)) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class327 var20 = new class327(class21.field392.field3322);
                for (class433 var21 = (class433) var20.method1981((byte) 47); var21 != null; var21 = (class433) var20.method1979(false)) {
                    if (var17 == var19) {
                        class75.method608(false, var16, var15, var21);
                        break;
                    }
                    var19++;
                }
            }
            class355.method2120(-1877);
            return;
        }
        if (var15 < class477.field6534 || (class575.field7554 + class477.field6534) < var15 || class733.field10151 > var16 || class733.field10151 + class141.field2261 < var16) {
            return;
        }
        if (!class163.field2471) {
            int var24 = -1;
            for (int var25 = 0; var25 < class181.field2730; var25++) {
                if (class743.field10329) {
                    int var30 = (class181.field2730 - var25 - 1) * 16 + class733.field10151 + 33;
                    if (var16 > (var30 - 13) && (var30 + 4) > var16) {
                        var24 = var25;
                    }
                } else {
                    int var29 = (class181.field2730 - var25 - 1) * 16 + class733.field10151 + 31;
                    if (var29 - 13 < var16 && (var29 + 3) > var16) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class716 var27 = new class716(class446.field6126);
                for (class433 var28 = (class433) var27.method4010(true); var28 != null; var28 = (class433) var27.method4011((byte) -119)) {
                    if (var24 == var26) {
                        class75.method608(false, var16, var15, var28);
                        break;
                    }
                    var26++;
                }
            }
            class355.method2120(-1877);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class172.field2634; var32++) {
            if (class743.field10329) {
                int var34 = var32 * 16 + class733.field10151 + 33;
                if (var34 - 13 < var16 && var16 < (var34 + 4)) {
                    var31 = var32;
                    break;
                }
            } else {
                int var33 = var32 * 16 + class733.field10151 + 31;
                if (var33 - 13 < var16 && var33 + 3 > var16) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class327 var36 = new class327(class592.field7703);
        for (class236 var37 = (class236) var36.method1981((byte) 47); var37 != null; var37 = (class236) var36.method1979(false)) {
            if (var31 == var35) {
                class75.method608(false, var16, var15, (class433) var37.field3322.field10032.field5748);
                class355.method2120(-1877);
                return;
            }
            var35++;
        }
        return;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIB)Z", line = 464)
    public static final boolean method2545(int arg0, int arg1, byte arg2) {
        if (arg2 != -124) {
            field6097 = 2.2983282F;
        }
        field6093++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 475)
    public static void method2546(byte arg0) {
        field6091 = null;
        int var1 = -80 % ((arg0 + 30) / 34);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)I", line = 486)
    public final int method78(int arg0) {
        field6090++;
        if (arg0 == -20701) {
            return this.field6094.method2227(this.field6095, true) ? 100 : this.field6094.method2212(-34, this.field6095);
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Lsaa;", line = 502)
    public final class331 method77(byte arg0) {
        if (arg0 > -120) {
            field6097 = 0.96468645F;
        }
        field6089++;
        return class331.field4721;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)Z", line = 515)
    public static final boolean method2547(int arg0, int arg1, int arg2, int arg3) {
        class200.field3011.method1708(arg1, arg0, arg2, class352.field4953);
        field6088++;
        if (arg3 != -12825) {
            method2545(-120, -67, (byte) -10);
        }
        int var4 = class352.field4953[2];
        if (var4 < 50) {
            return false;
        } else {
            class352.field4953[1] = class352.field4953[1] * class228.field3255 / var4 + class130.field2134;
            class352.field4953[0] = class718.field9913 + (class352.field4953[0] * class646.field8583 / var4);
            class352.field4953[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lwu;Ljava/lang/String;)V", line = 543)
    public class442(class376 arg0, String arg1) {
        this.field6095 = arg1;
        this.field6094 = arg0;
    }
}
