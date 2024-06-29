import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class312 extends class71 {

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[B")
    public byte[] field4858;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[I")
    private int[] field4852;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[B")
    public byte[] field4853;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[Lqj;")
    public class267[] field4854;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[S")
    public short[] field4857;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "[Lq;")
    public class105[] field4860;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[B")
    public byte[] field4851;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Ltl;")
    public static class222 field4849 = new class222(64);

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "F")
    public static float field4862 = 0.0F;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Ljava/lang/Thread;")
    public static Thread field4856;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(JZ)V", line = 4)
    public static final void method2170(long arg0, boolean arg1) {
        field4859++;
        if (arg0 == 0L || !arg1) {
            return;
        }
        for (int var3 = 0; var3 < class198.field3247; var3++) {
            if (class87.field1314[var3] == arg0) {
                class198.field3247--;
                class66.field856++;
                for (int var4 = var3; var4 < class198.field3247; var4++) {
                    class239.field3773[var4] = class239.field3773[var4 + 1];
                    class36.field482[var4] = class36.field482[var4 + 1];
                    class164.field2670[var4] = class164.field2670[var4 + 1];
                    class87.field1314[var4] = class87.field1314[var4 + 1];
                    class239.field3783[var4] = class239.field3783[var4 + 1];
                    class183.field2957[var4] = class183.field2957[var4 + 1];
                }
                class93.field1444 = class297.field4655;
                class21.field313.method1541(-110, 225);
                class21.field313.method1375(arg0, -81);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Lug;", line = 66)
    public static final class321 method2171(int arg0) {
        int var1 = class244.field3885[0] * class21.field316[0];
        field4850++;
        int[] var2 = new int[var1];
        if (arg0 != 5701) {
            method2171(-96);
        }
        byte[] var3 = class3.field20[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class305.field4754[class200.method1465(255, var3[var4])];
        }
        class321 var5;
        if (class186.field2991) {
            var5 = new class14(class163.field2659, class113.field1698, class163.field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], var2);
        } else {
            var5 = new class298(class163.field2659, class113.field1698, class163.field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], var2);
        }
        class17.method115((byte) 123);
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIBZI)V", line = 106)
    public static final void method2172(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field4865++;
        class162.field2649++;
        class99.method705((byte) -60);
        if (arg4) {
            class23.method146(false, false, (byte) 21, 0);
        } else {
            class193.method1415(0, -104);
            class23.method146(true, false, (byte) 21, 0);
            if (class337.field5238 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class23.method146(false, false, (byte) 21, var6);
                    class23.method146(false, true, (byte) 21, var6);
                    class193.method1415(var6, -119);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class193.method1415(var7, -110);
                    class23.method146(false, false, (byte) 21, var7);
                    class23.method146(false, true, (byte) 21, var7);
                }
            }
        }
        if (!arg4) {
            class299.method2089(64);
        }
        class256.method1804((byte) -120);
        if (class186.field2991) {
            class280.method1980(arg5, arg1, true, 2, arg0, arg2);
            arg1 = class339.field5267;
            arg2 = class321.field5026;
            arg0 = class234.field3729;
            arg5 = class230.field3667;
        }
        if (class282.field4461 == 1) {
            int var8 = (int) class329.field5112;
            int var9 = (int) field4862 + class41.field564 & 0x7FF;
            if (var8 < (class114.field1717 / 256)) {
                var8 = class114.field1717 / 256;
            }
            if (class36.field483[4] && var8 < class236.field3740[4] + 128) {
                var8 = class236.field3740[4] + 128;
            }
            class48.method330(var9, class131.field1935, class227.method1653(class13.field159.field1980, class13.field159.field1944, -12282, class148.field2209) - 50, var8 * 3 + 600, var8, (byte) -118, arg2, class255.field4045);
        } else if (class282.field4461 == 5) {
            class264.method1885(arg2, -93);
        }
        int var10 = class161.field2644;
        int var11 = class74.field983;
        int var12 = class27.field388;
        int var13 = class281.field4425;
        int var14 = class185.field2971;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class36.field483[var15]) {
                int var16 = (int) (Math.random() * (double) (class253.field4012[var15] * 2 + 1) + Math.sin((double) class302.field4724[var15] / 100.0D * (double) class97.field1487[var15]) * (double) class236.field3740[var15] - (double) class253.field4012[var15]);
                if (var15 == 2) {
                    class27.field388 += var16;
                }
                if (var15 == 3) {
                    class185.field2971 = class185.field2971 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class281.field4425 += var16;
                    if (class281.field4425 < 128) {
                        class281.field4425 = 128;
                    }
                    if (class281.field4425 > 383) {
                        class281.field4425 = 383;
                    }
                }
                if (var15 == 0) {
                    class74.field983 += var16;
                }
                if (var15 == 1) {
                    class161.field2644 += var16;
                }
            }
        }
        class184.method1270((byte) 33);
        if (class186.field2991) {
            class344.method2376(arg1, arg5, arg0 + arg1, arg5 - -arg2);
            float var18 = (float) class185.field2971 * 0.17578125F;
            boolean var19 = false;
            float var20 = (float) class281.field4425 * 0.17578125F;
            if (class282.field4461 == 3) {
                var20 = class154.field2356 * 360.0F / 6.2831855F;
                var18 = class297.field4653 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class144.field2159 == 10) {
                var21 = class30.method196(78, class274.field4353, class27.field388 >> 10, class74.field983 >> 10, class91.field1404);
            } else {
                var21 = class30.method196(75, class274.field4353, class13.field159.field2006[0] >> 3, class13.field159.field1969[0] >> 3, class91.field1404);
            }
            if (class294.field4624 >= 0) {
                class186.method1312();
                class268 var22 = class127.method871(class157.field2423, 5, class294.field4624, class209.field3417, class93.field1429);
                var22.method1917(class100.field1521, arg1, arg5, arg0, arg2, class281.field4425, class185.field2971, var21);
            } else {
                class186.method1293(var21);
            }
            class186.method1303(arg1, arg5, arg0, arg2, arg0 / 2 + arg1, arg5 - -(arg2 / 2), var20, var18, class343.field5354, class343.field5354);
            class146.method1024(false, 4486);
            class186.method1298();
            class186.method1274(true);
            class186.method1290(true);
        } else {
            class216.method1571(arg1, arg5, arg0 + arg1, arg2 + arg5);
            class25.method166();
            if (class294.field4624 < 0) {
                class216.method1573(arg1, arg5, arg0, arg2, 0);
            } else {
                class268 var17 = class127.method871(class157.field2423, 5, class294.field4624, class209.field3417, class93.field1429);
                var17.method1919(class100.field1521, arg1, arg5, arg0, arg2, class281.field4425, class185.field2971, 0);
            }
        }
        if (class19.field274 || class18.field256 < arg1 || (arg0 + arg1) <= class18.field256 || arg5 > class323.field5055 || class323.field5055 >= (arg2 + arg5)) {
            class283.field4470 = 0;
            class4.field31 = false;
        } else {
            class283.field4470 = 0;
            class4.field31 = true;
            int var23 = class338.field5244;
            int var24 = class204.field3334;
            int var25 = class131.field1931;
            class147.field2196 = (var25 - var23) * (class18.field256 - arg1) / arg0 + var23;
            int var26 = class287.field4527;
            class175.field2794 = (class323.field5055 - arg5) * (var26 - var24) / arg2 + var24;
        }
        class40.method279(25259);
        byte var27 = class218.method1598(7829) == 2 ? (byte) class162.field2649 : 1;
        if (class186.field2991) {
            class47.method317(class48.field648, !class39.field512);
            class161.method1115(class161.field2644, class281.field4425, class27.field388, (byte) -122, class185.field2971, class74.field983);
            class186.field2993 = class48.field648;
            class92.method668(class74.field983, class161.field2644, class27.field388, class281.field4425, class185.field2971, class280.field4416, class58.field764, class308.field4819, class69.field902, class232.field3712, class60.field789, class148.field2209 + 1, var27, class13.field159.field1980 >> 7, class13.field159.field1944 >> 7);
            class26.field383 = true;
            class47.method320();
            class161.method1115(0, 0, 0, (byte) -117, 0, 0);
            class40.method279(25259);
            class282.method2000(arg2, class343.field5354, arg0, -123, arg5, class343.field5354, arg1);
            class338.method2326(class343.field5354, class343.field5354, arg1, false, arg5, arg0, arg2);
            class314.method2182();
        } else {
            class92.method668(class74.field983, class161.field2644, class27.field388, class281.field4425, class185.field2971, class280.field4416, class58.field764, class308.field4819, class69.field902, class232.field3712, class60.field789, class148.field2209 + 1, var27, class13.field159.field1980 >> 7, class13.field159.field1944 >> 7);
            class40.method279(25259);
            class314.method2182();
            class282.method2000(arg2, 256, arg0, -126, arg5, 256, arg1);
            class338.method2326(256, 256, arg1, false, arg5, arg0, arg2);
        }
        ((class270) class25.field365).method1932(class274.field4353, 0);
        class100.method706(arg0, false, arg1, arg5, arg2);
        int var28 = -124 % ((-arg3 - 47) / 37);
        class161.field2644 = var10;
        class27.field388 = var12;
        class74.field983 = var11;
        class185.field2971 = var14;
        class281.field4425 = var13;
        if (class92.field1427 && class269.field4246.method1728(4) == 0) {
            class92.field1427 = false;
        }
        if (class92.field1427) {
            if (class186.field2991) {
                class344.method2375(arg1, arg5, arg0, arg2, 0);
            } else {
                class216.method1573(arg1, arg5, arg0, arg2, 0);
            }
            class303.method2126(false, class288.field4533, -57);
        }
        if (!arg4 && !class92.field1427 && !class19.field274 && arg1 <= class18.field256 && class18.field256 < (arg1 + arg0) && class323.field5055 >= arg5 && class323.field5055 < (arg5 + arg2)) {
            class44.method297(arg2, arg5, 119, arg0, class323.field5055, arg1, class18.field256);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[B[ILdi;)Z", line = 379)
    public final boolean method2173(int arg0, byte[] arg1, int[] arg2, class161 arg3) {
        field4864++;
        boolean var5 = true;
        int var6 = 0;
        class267 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4852[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1120(53, arg2, var9 >> 2);
                        } else {
                            var7 = arg3.method1117(var9 >> 2, (byte) -113, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4854[var8] = var7;
                        this.field4852[var8] = 0;
                    }
                }
            }
        }
        if (arg0 >= -91) {
            this.method2175(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 435)
    public static void method2174(byte arg0) {
        if (arg0 > -106) {
            field4849 = (class222) null;
        }
        field4856 = null;
        field4849 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 444)
    public class312() {
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V", line = 446)
    public class312(byte[] arg0) {
        this.field4858 = new byte[128];
        this.field4852 = new int[128];
        this.field4853 = new byte[128];
        this.field4854 = new class267[128];
        this.field4857 = new short[128];
        int var2 = 0;
        this.field4860 = new class105[128];
        this.field4851 = new byte[128];
        class192 var3 = new class192(arg0);
        while (var3.field3128[var3.field3129 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1377(true);
        }
        var3.field3129++;
        var2++;
        int var6 = var3.field3129;
        var3.field3129 += var2;
        int var7;
        for (var7 = 0; var3.field3128[var3.field3129 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1377(true);
        }
        var3.field3129++;
        int var10 = var3.field3129;
        var7++;
        int var11 = 0;
        var3.field3129 += var7;
        while (var3.field3128[var3.field3129 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1377(true);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field3129++;
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1399(-1172389784);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class105[] var19 = new class105[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class105 var21 = var19[var20] = new class105();
            int var22 = var3.method1399(-1172389784);
            if (var22 > 0) {
                var21.field1602 = new byte[var22 * 2];
            }
            int var23 = var3.method1399(-1172389784);
            if (var23 > 0) {
                var21.field1601 = new byte[var23 * 2 + 2];
                var21.field1601[1] = 64;
            }
        }
        int var24 = var3.method1399(-1172389784);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1399(-1172389784);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field3128[var3.field3129 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method1377(true);
        }
        var3.field3129++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1399(-1172389784);
            this.field4857[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1399(-1172389784);
            this.field4857[var34] = (short) (this.field4857[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var36 == 0) {
                if (var29.length <= var35) {
                    var36 = -1;
                } else {
                    var36 = var29[var35++];
                }
                var37 = var3.method1366((byte) -122);
            }
            this.field4857[var38] = (short) (this.field4857[var38] + class200.method1465(32768, var37 - 1 << 14));
            this.field4852[var38] = var37;
            var36--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4852[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var4.length) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var3.field3128[var6++] - 1;
                }
                this.field4858[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4852[var46] != 0) {
                if (var43 == 0) {
                    var44 = var3.field3128[var10++] + 16 << 2;
                    if (var45 < var8.length) {
                        var43 = var8[var45++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field4853[var46] = (byte) var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class105 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4852[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length > var47) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                var48--;
                this.field4860[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var52 >= var29.length) {
                    var51 = -1;
                } else {
                    var51 = var29[var52++];
                }
                if (this.field4852[var54] > 0) {
                    var53 = var3.method1399(-1172389784) + 1;
                }
            }
            var51--;
            this.field4851[var54] = (byte) var53;
        }
        this.field4863 = var3.method1399(-1172389784) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class105 var56 = var19[var55];
            if (var56.field1602 != null) {
                for (int var57 = 1; var57 < var56.field1602.length; var57 += 2) {
                    var56.field1602[var57] = var3.method1377(true);
                }
            }
            if (var56.field1601 != null) {
                for (int var58 = 3; var58 < (var56.field1601.length - 2); var58 += 2) {
                    var56.field1601[var58] = var3.method1377(true);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1377(true);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method1377(true);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class105 var62 = var19[var61];
            if (var62.field1601 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1601.length; var64 += 2) {
                    var63 = var3.method1399(-1172389784) + var63 + 1;
                    var62.field1601[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class105 var66 = var19[var65];
            if (var66.field1602 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1602.length; var68 += 2) {
                    var67 = var67 + var3.method1399(-1172389784) + 1;
                    var66.field1602[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1399(-1172389784);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 += var3.method1399(-1172389784) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field4851[var73] = (byte) (this.field4851[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) * var72 + ((var75 - var71) / 2);
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class58.method410(var75 - var71, (byte) -54, var77);
                    this.field4851[var78] = (byte) (this.field4851[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field4851[var80] = (byte) (this.field4851[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method1399(-1172389784);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var3.method1399(-1172389784) + (var82 + 1);
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field4853[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4853[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                int var91 = var27[var88 + 1] << 1;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class58.method410(var89 - var84, (byte) 104, var90);
                    var90 += var91 - var85;
                    int var94 = (this.field4853[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4853[var92] = (byte) var94;
                }
                var84 = var89;
                var88 += 2;
                var85 = var91;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field4853[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field4853[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field1592 = var3.method1399(-1172389784);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class105 var100 = var19[var99];
            if (var100.field1602 != null) {
                var100.field1589 = var3.method1399(-1172389784);
            }
            if (var100.field1601 != null) {
                var100.field1587 = var3.method1399(-1172389784);
            }
            if (var100.field1592 > 0) {
                var100.field1594 = var3.method1399(-1172389784);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field1598 = var3.method1399(-1172389784);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class105 var103 = var19[var102];
            if (var103.field1598 > 0) {
                var103.field1599 = var3.method1399(-1172389784);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class105 var105 = var19[var104];
            if (var105.field1599 > 0) {
                var105.field1595 = var3.method1399(-1172389784);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 1091)
    public final void method2175(boolean arg0) {
        field4848++;
        this.field4852 = null;
        if (!arg0) {
            this.field4852 = (int[]) null;
        }
    }
}
