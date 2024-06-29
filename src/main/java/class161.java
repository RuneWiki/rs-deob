import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class161 extends class277 {

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Z")
    private boolean field2121;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Lbj;")
    private class483 field2118;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Lbj;")
    private class483 field2111;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "Lbj;")
    private class483 field2120;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "Lbj;")
    private class483 field2127;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "Lpm;")
    private class133 field2128;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "Lrga;")
    public static class280 field2124 = new class280(44, 3);

    @OriginalMember(owner = "client!un", name = "A", descriptor = "[I")
    public static int[] field2129 = new int[16];

    @OriginalMember(owner = "client!un", name = "B", descriptor = "Lwea;")
    public static class259 field2130 = new class259(2, 2);

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Z")
    private boolean field2115;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "Z")
    private boolean field2126;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
    public final void method276(int arg0, int arg1, int arg2) {
        if (arg1 != 50) {
            this.field2115 = true;
        }
        ++field2114;
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
    public final void method928(byte arg0) {
        ++field2117;
        class159 var2 = super.field3475.field7515;
        if (!this.field2126) {
            OpenGL.glBindProgramARB(34336, ~super.field3475.field7558 != Integer.MIN_VALUE ? this.field2120.field6416 : this.field2118.field6416);
        } else {
            OpenGL.glBindProgramARB(34336, ~super.field3475.field7558 != Integer.MIN_VALUE ? this.field2127.field6416 : this.field2111.field6416);
        }
        var2.method904((byte) 24, -1.0F, 0.0F, 0.0F, class2.field19, (float) super.field3475.field7558);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, class2.field19[0], class2.field19[1], class2.field19[2], class2.field19[3]);
        OpenGL.glEnable(34336);
        if (arg0 < 50) {
            field2129 = null;
        }
        this.field2115 = true;
        this.method931(117);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (this.field2115) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2115 = false;
        }
        if (arg0 != 1268) {
            field2129 = null;
        }
        ++field2116;
        super.field3475.method3027(1, true);
        super.field3475.method2960((class615) null, -2);
        super.field3475.method2983(8448, -465309136, 8448);
        super.field3475.method2966(0, 768, 768, 5890);
        super.field3475.method2966(2, 770, 768, 34166);
        super.field3475.method3015(5890, 770, 0, true);
        super.field3475.method3027(0, true);
        super.field3475.method2966(0, 768, 768, 5890);
        super.field3475.method3015(5890, 770, 0, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILbfa;I)V")
    public static final void method929(int arg0, int arg1, class145 arg2, int arg3) {
        ++field2122;
        if (arg2 != null && class1.field7.field541 != arg2) {
            if (arg0 == 0) {
                int var4 = arg2.field1869;
                int var5 = arg2.field1868;
                int var6 = arg2.field1873;
                int var7 = (int) arg2.field1865;
                long var8 = arg2.field1865;
                if (~var6 <= -2001) {
                    var6 -= 2000;
                }
                if (~var6 == -17) {
                    class369.field4685 = 2;
                    ++class553.field7706;
                    class231.field2890 = 0;
                    class204.field2591 = arg1;
                    class199.field2527 = arg3;
                    class704 var10 = class314.method1820(class671.field9448, class400.field5014, (byte) -91);
                    var10.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                    var10.field9929.method3505(-117, class145.field1879 + var4);
                    var10.field9929.method3526(class630.field8817 + var5, 13469);
                    var10.field9929.method3526(var7, 13469);
                    class122.method654(var10, (byte) -36);
                    class168.method967((byte) -67, var4, var5);
                }
                if (~var6 == -1013 || var6 == 1007 || ~var6 == -1011 || var6 == 1002 || ~var6 == -1007) {
                    class295.method1651(arg0 ^ -1013, var6, var4, var7);
                }
                if (~var6 == -1010) {
                    class369.field4685 = 2;
                    class204.field2591 = arg1;
                    class231.field2890 = 0;
                    ++class5.field118;
                    class199.field2527 = arg3;
                    class704 var11 = class314.method1820(class657.field9290, class400.field5014, (byte) 85);
                    var11.field9929.method3506(128, var5 - -class630.field8817);
                    var11.field9929.method3525((byte) 125, class277.field3470.method448((byte) -68, 82) ? 1 : 0);
                    var11.field9929.method3526(var4 - -class145.field1879, 13469);
                    var11.field9929.method3526(Integer.MAX_VALUE & (int) (var8 >>> 32), arg0 + 13469);
                    class122.method654(var11, (byte) -36);
                    class503.method2705(var4, (byte) -42, var8, var5);
                }
                if (~var6 == -7) {
                    class199.field2527 = arg3;
                    class231.field2890 = 0;
                    class204.field2591 = arg1;
                    class369.field4685 = 2;
                    ++class341.field4396;
                    class704 var12 = class314.method1820(class447.field5735, class400.field5014, (byte) 127);
                    var12.field9929.method3466(112, var7);
                    var12.field9929.method3505(58, class145.field1879 + var4);
                    var12.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                    var12.field9929.method3526(class630.field8817 + var5, 13469);
                    class122.method654(var12, (byte) -36);
                    class168.method967((byte) -67, var4, var5);
                }
                if (var6 == 21) {
                    if (class199.field2531 > 0 && class277.field3470.method448((byte) -68, 82) && class277.field3470.method448((byte) -68, 81)) {
                        class5.method41(arg0 ^ 1024908230, class376.field4748.field6470, class630.field8817 + var5, class145.field1879 - -var4);
                    } else {
                        class199.field2527 = arg3;
                        class369.field4685 = 1;
                        ++class478.field6183;
                        class204.field2591 = arg1;
                        class231.field2890 = 0;
                        class704 var13 = class314.method1820(class16.field264, class400.field5014, (byte) -98);
                        var13.field9929.method3526(class630.field8817 - -var5, arg0 ^ 13469);
                        var13.field9929.method3466(103, class145.field1879 + var4);
                        class122.method654(var13, (byte) -36);
                    }
                }
                if (~var6 == -1005) {
                    class204.field2591 = arg1;
                    class199.field2527 = arg3;
                    class231.field2890 = 0;
                    class369.field4685 = 2;
                    ++class284.field3530;
                    class704 var14 = class314.method1820(class221.field2712, class400.field5014, (byte) -83);
                    var14.field9929.method3526(var7, 13469);
                    class122.method654(var14, (byte) -36);
                }
                if (var6 == 22) {
                    class199.field2527 = arg3;
                    class231.field2890 = 0;
                    ++class260.field3175;
                    class204.field2591 = arg1;
                    class369.field4685 = 2;
                    class704 var15 = class314.method1820(class480.field6384, class400.field5014, (byte) -73);
                    var15.field9929.method3505(-107, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    var15.field9929.method3526(class630.field8817 + var5, arg0 ^ 13469);
                    var15.field9929.method3506(128, var4 - -class145.field1879);
                    var15.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                    class122.method654(var15, (byte) -36);
                    class503.method2705(var4, (byte) -42, var8, var5);
                }
                if (var6 == 57) {
                    class507 var16 = class138.method795(var5, var4, (byte) 64);
                    if (var16 != null) {
                        class476.method2518((byte) 31);
                        class369 var17 = client.method3819(var16);
                        class359.method1978(0, var16, var17.method2018(-1035661311), var17.field4683);
                        class537.field7208 = class678.method3798(var16, (byte) -105);
                        if (class537.field7208 == null) {
                            class537.field7208 = "Null";
                        }
                        class473.field6007 = var16.field6828 + "<col=ffffff>";
                    }
                } else {
                    if (var6 == 12) {
                        class514 var18 = class351.field4490[var7];
                        if (var18 != null) {
                            class204.field2591 = arg1;
                            class231.field2890 = 0;
                            class199.field2527 = arg3;
                            class369.field4685 = 2;
                            ++class294.field3633;
                            class704 var19 = class314.method1820(class668.field9426, class400.field5014, (byte) 114);
                            var19.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                            var19.field9929.method3526(var7, 13469);
                            class122.method654(var19, (byte) -36);
                            class413.method2202(1, 0, -2, var18.method2785(-1), 0, true, var18.field9758[0], var18.field9754[0], var18.method2785(~arg0));
                        }
                    }
                    if (var6 == 47) {
                        ++class647.field9126;
                        class231.field2890 = 0;
                        class369.field4685 = 2;
                        class204.field2591 = arg1;
                        class199.field2527 = arg3;
                        class704 var20 = class314.method1820(class105.field1403, class400.field5014, (byte) -113);
                        var20.field9929.method3505(10, class630.field8817 + var5);
                        var20.field9929.method3505(-23, Integer.MAX_VALUE & (int) (var8 >>> 32));
                        var20.field9929.method3506(128, class145.field1879 + var4);
                        var20.field9929.method3512(class277.field3470.method448((byte) -68, 82) ? 1 : 0, (byte) 7);
                        class122.method654(var20, (byte) -36);
                        class503.method2705(var4, (byte) -42, var8, var5);
                    }
                    if (~var6 == -18) {
                        class206 var21 = (class206) class180.field2318.method399(-32748, (long) var7);
                        if (var21 != null) {
                            class204.field2591 = arg1;
                            ++class469.field5962;
                            class369.field4685 = 2;
                            class231.field2890 = 0;
                            class307 var22 = var21.field2618;
                            class199.field2527 = arg3;
                            class704 var23 = class314.method1820(class670.field9436, class400.field5014, (byte) -98);
                            var23.field9929.method3526(var7, arg0 ^ 13469);
                            var23.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -109);
                            class122.method654(var23, (byte) -36);
                            class413.method2202(arg0 + 1, 0, -2, var22.method2785(-1), 0, true, var22.field9758[0], var22.field9754[0], var22.method2785(-1));
                        }
                    }
                    if (~var6 == -3) {
                        ++class465.field5929;
                        class204.field2591 = arg1;
                        class231.field2890 = 0;
                        class199.field2527 = arg3;
                        class369.field4685 = 2;
                        class704 var24 = class314.method1820(class422.field5309, class400.field5014, (byte) 94);
                        var24.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -111);
                        var24.field9929.method3506(128, class172.field2252);
                        var24.field9929.method3492(class529.field7156, 123);
                        var24.field9929.method3506(128, class286.field3557);
                        var24.field9929.method3506(arg0 ^ 128, class376.field4748.field9676);
                        class122.method654(var24, (byte) -36);
                    }
                    if (~var6 == -46) {
                        class507 var25 = class138.method795(var5, var4, (byte) 86);
                        if (var25 != null) {
                            class378.method2057(var25, 23687);
                        }
                    }
                    if (var6 == 30) {
                        class199.field2527 = arg3;
                        class369.field4685 = 1;
                        class204.field2591 = arg1;
                        ++class528.field7141;
                        class231.field2890 = 0;
                        class704 var26 = class314.method1820(class15.field255, class400.field5014, (byte) 80);
                        var26.field9929.method3466(104, class286.field3557);
                        var26.field9929.method3526(class630.field8817 - -var5, 13469);
                        var26.field9929.method3526(class172.field2252, 13469);
                        var26.field9929.method3526(class145.field1879 + var4, 13469);
                        var26.field9929.method3502(class529.field7156, -119);
                        class122.method654(var26, (byte) -36);
                        class413.method2202(arg0 ^ 1, 0, -4, 1, 0, true, var4, var5, 1);
                    }
                    if (var6 == 9) {
                        class514 var27 = class351.field4490[var7];
                        if (var27 != null) {
                            ++class516.field7043;
                            class199.field2527 = arg3;
                            class204.field2591 = arg1;
                            class231.field2890 = 0;
                            class369.field4685 = 2;
                            class704 var28 = class314.method1820(class220.field2689, class400.field5014, (byte) -101);
                            var28.field9929.method3518((byte) -72, class277.field3470.method448((byte) -68, 82) ? 1 : 0);
                            var28.field9929.method3505(-126, var7);
                            class122.method654(var28, (byte) -36);
                            class413.method2202(arg0 ^ 1, 0, -2, var27.method2785(-1), 0, true, var27.field9758[0], var27.field9754[0], var27.method2785(-1));
                        }
                    }
                    if (var6 == 1008) {
                        class204.field2591 = arg1;
                        class199.field2527 = arg3;
                        class231.field2890 = 0;
                        ++class598.field8401;
                        class369.field4685 = 2;
                        class704 var29 = class314.method1820(class464.field5908, class400.field5014, (byte) 108);
                        var29.field9929.method3526(var7, 13469);
                        class122.method654(var29, (byte) -36);
                    }
                    if (~var6 == -51 && class461.field5873 == null) {
                        class586.method3219(0, var4, var5);
                        class461.field5873 = class138.method795(var5, var4, (byte) 66);
                        class572.method3158(class461.field5873, arg0 ^ 1023);
                    }
                    if (var6 == 58) {
                        class206 var30 = (class206) class180.field2318.method399(arg0 + -32748, (long) var7);
                        if (var30 != null) {
                            class307 var31 = var30.field2618;
                            class204.field2591 = arg1;
                            ++class454.field5821;
                            class369.field4685 = 2;
                            class199.field2527 = arg3;
                            class231.field2890 = 0;
                            class704 var32 = class314.method1820(class473.field6006, class400.field5014, (byte) 79);
                            var32.field9929.method3518((byte) -72, !class277.field3470.method448((byte) -68, 82) ? 0 : 1);
                            var32.field9929.method3505(arg0 ^ 88, var7);
                            class122.method654(var32, (byte) -36);
                            class413.method2202(1, 0, -2, var31.method2785(-1), 0, true, var31.field9758[0], var31.field9754[0], var31.method2785(-1));
                        }
                    }
                    if (var6 == 1001) {
                        class369.field4685 = 2;
                        class204.field2591 = arg1;
                        class199.field2527 = arg3;
                        class231.field2890 = 0;
                        class206 var33 = (class206) class180.field2318.method399(-32748, (long) var7);
                        if (var33 != null) {
                            class307 var34 = var33.field2618;
                            class586 var35 = var34.field3902;
                            if (var35.field8205 != null) {
                                var35 = var35.method3220(-4261, class684.field9606);
                            }
                            if (var35 != null) {
                                ++class331.field4227;
                                class704 var36 = class314.method1820(class596.field8391, class400.field5014, (byte) -85);
                                var36.field9929.method3526(var35.field8199, arg0 + 13469);
                                class122.method654(var36, (byte) -36);
                            }
                        }
                    }
                    if (var6 == 15) {
                        class514 var37 = class351.field4490[var7];
                        if (var37 != null) {
                            class199.field2527 = arg3;
                            class231.field2890 = 0;
                            ++class289.field3597;
                            class369.field4685 = 2;
                            class204.field2591 = arg1;
                            class704 var38 = class314.method1820(field2124, class400.field5014, (byte) 118);
                            var38.field9929.method3505(-109, var7);
                            var38.field9929.method3525((byte) 125, !class277.field3470.method448((byte) -68, 82) ? 0 : 1);
                            class122.method654(var38, (byte) -36);
                            class413.method2202(arg0 + 1, 0, -2, var37.method2785(-1), 0, true, var37.field9758[0], var37.field9754[0], var37.method2785(arg0 + -1));
                        }
                    }
                    if (~var6 == -6) {
                        class206 var39 = (class206) class180.field2318.method399(-32748, (long) var7);
                        if (var39 != null) {
                            class199.field2527 = arg3;
                            ++class324.field4162;
                            class307 var40 = var39.field2618;
                            class369.field4685 = 2;
                            class231.field2890 = 0;
                            class204.field2591 = arg1;
                            class704 var41 = class314.method1820(class440.field5479, class400.field5014, (byte) -93);
                            var41.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -119);
                            var41.field9929.method3506(128, var7);
                            class122.method654(var41, (byte) -36);
                            class413.method2202(1, 0, -2, var40.method2785(-1), 0, true, var40.field9758[0], var40.field9754[0], var40.method2785(arg0 + -1));
                        }
                    }
                    if (var6 == 8) {
                        class514 var42 = class351.field4490[var7];
                        if (var42 != null) {
                            class231.field2890 = 0;
                            ++class645.field9066;
                            class204.field2591 = arg1;
                            class369.field4685 = 2;
                            class199.field2527 = arg3;
                            class704 var43 = class314.method1820(class220.field2690, class400.field5014, (byte) 124);
                            var43.field9929.method3505(arg0 ^ 98, var7);
                            var43.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -120);
                            class122.method654(var43, (byte) -36);
                            class413.method2202(1, 0, -2, var42.method2785(arg0 + -1), 0, true, var42.field9758[0], var42.field9754[0], var42.method2785(-1));
                        }
                    }
                    if (var6 == 46) {
                        ++class43.field564;
                        class199.field2527 = arg3;
                        class231.field2890 = 0;
                        class204.field2591 = arg1;
                        class369.field4685 = 2;
                        class704 var44 = class314.method1820(class5.field140, class400.field5014, (byte) -55);
                        var44.field9929.method3526(class145.field1879 + var4, 13469);
                        var44.field9929.method3518((byte) -72, class277.field3470.method448((byte) -68, 82) ? 1 : 0);
                        var44.field9929.method3466(120, class630.field8817 + var5);
                        var44.field9929.method3506(arg0 + 128, var7);
                        class122.method654(var44, (byte) -36);
                        class168.method967((byte) -67, var4, var5);
                    }
                    if (~var6 == -26) {
                        ++class599.field8408;
                        class204.field2591 = arg1;
                        class231.field2890 = 0;
                        class199.field2527 = arg3;
                        class369.field4685 = 2;
                        class704 var45 = class314.method1820(class268.field3389, class400.field5014, (byte) 85);
                        var45.field9929.method3466(125, var7);
                        var45.field9929.method3466(119, class630.field8817 + var5);
                        var45.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                        var45.field9929.method3526(class145.field1879 + var4, 13469);
                        class122.method654(var45, (byte) -36);
                        class168.method967((byte) -67, var4, var5);
                    }
                    if (~var6 == -24) {
                        class206 var46 = (class206) class180.field2318.method399(-32748, (long) var7);
                        if (var46 != null) {
                            class307 var47 = var46.field2618;
                            class199.field2527 = arg3;
                            class231.field2890 = 0;
                            class204.field2591 = arg1;
                            ++class570.field7974;
                            class369.field4685 = 2;
                            class704 var48 = class314.method1820(class365.field4643, class400.field5014, (byte) -112);
                            var48.field9929.method3466(108, var7);
                            var48.field9929.method3512(class277.field3470.method448((byte) -68, 82) ? 1 : 0, (byte) 7);
                            class122.method654(var48, (byte) -36);
                            class413.method2202(1, 0, -2, var47.method2785(-1), 0, true, var47.field9758[0], var47.field9754[0], var47.method2785(~arg0));
                        }
                    }
                    if (var6 == 48) {
                        class369.field4685 = 2;
                        class204.field2591 = arg1;
                        ++class688.field9761;
                        class231.field2890 = 0;
                        class199.field2527 = arg3;
                        class704 var49 = class314.method1820(class8.field159, class400.field5014, (byte) -110);
                        var49.field9929.method3506(128, class286.field3557);
                        var49.field9929.method3506(128, var7);
                        var49.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                        var49.field9929.method3464(class529.field7156, arg0 + -105);
                        var49.field9929.method3505(81, class630.field8817 + var5);
                        var49.field9929.method3505(-20, class172.field2252);
                        var49.field9929.method3466(118, class145.field1879 + var4);
                        class122.method654(var49, (byte) -36);
                        class168.method967((byte) -67, var4, var5);
                    }
                    if (~var6 == -61 || var6 == 1011) {
                        class430.method2273(var4, 18365, var7, arg2.field1867, var5);
                    }
                    if (~var6 == -14) {
                        class206 var50 = (class206) class180.field2318.method399(-32748, (long) var7);
                        if (var50 != null) {
                            class307 var51 = var50.field2618;
                            class199.field2527 = arg3;
                            class231.field2890 = 0;
                            class204.field2591 = arg1;
                            class369.field4685 = 2;
                            ++class214.field2660;
                            class704 var52 = class314.method1820(class388.field4886, class400.field5014, (byte) 89);
                            var52.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -110);
                            var52.field9929.method3505(-113, var7);
                            class122.method654(var52, (byte) -36);
                            class413.method2202(1, 0, -2, var51.method2785(arg0 + -1), 0, true, var51.field9758[0], var51.field9754[0], var51.method2785(-1));
                        }
                    }
                    if (~var6 == -11) {
                        if (~class199.field2531 < -1 && class277.field3470.method448((byte) -68, 82) && class277.field3470.method448((byte) -68, 81)) {
                            class5.method41(1024908230, class376.field4748.field6470, class630.field8817 + var5, class145.field1879 - -var4);
                        } else {
                            class704 var53 = class436.method2287(true, var4, var5, var7);
                            if (~var7 == -2) {
                                var53.field9929.method3509(-1, (byte) -111);
                                var53.field9929.method3509(-1, (byte) -127);
                                var53.field9929.method3526((int) class331.field4223, 13469);
                                var53.field9929.method3509(57, (byte) -126);
                                var53.field9929.method3509(class411.field5135, (byte) -119);
                                var53.field9929.method3509(class354.field4510, (byte) -109);
                                var53.field9929.method3509(89, (byte) -113);
                                var53.field9929.method3526(class376.field4748.field6461, 13469);
                                var53.field9929.method3526(class376.field4748.field6464, 13469);
                                var53.field9929.method3509(63, (byte) -123);
                            } else {
                                class231.field2890 = 0;
                                class199.field2527 = arg3;
                                class204.field2591 = arg1;
                                class369.field4685 = 1;
                            }
                            class122.method654(var53, (byte) -36);
                            class413.method2202(1, 0, -4, 1, 0, true, var4, var5, 1);
                        }
                    }
                    if (var6 == 19) {
                        ++class538.field7221;
                        class204.field2591 = arg1;
                        class199.field2527 = arg3;
                        class369.field4685 = 2;
                        class231.field2890 = 0;
                        class704 var54 = class314.method1820(class311.field3977, class400.field5014, (byte) -121);
                        var54.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -126);
                        var54.field9929.method3502(class529.field7156, -112);
                        var54.field9929.method3505(~arg0, class172.field2252);
                        var54.field9929.method3466(arg0 + 110, class286.field3557);
                        var54.field9929.method3466(arg0 + 105, var4 - -class145.field1879);
                        var54.field9929.method3526(Integer.MAX_VALUE & (int) (var8 >>> 32), 13469);
                        var54.field9929.method3466(arg0 + 125, class630.field8817 + var5);
                        class122.method654(var54, (byte) -36);
                        class503.method2705(var4, (byte) -42, var8, var5);
                    }
                    if (var6 == 20) {
                        class206 var55 = (class206) class180.field2318.method399(-32748, (long) var7);
                        if (var55 != null) {
                            class307 var56 = var55.field2618;
                            class231.field2890 = 0;
                            ++class285.field3537;
                            class199.field2527 = arg3;
                            class204.field2591 = arg1;
                            class369.field4685 = 2;
                            class704 var57 = class314.method1820(class573.field7997, class400.field5014, (byte) 95);
                            var57.field9929.method3502(class529.field7156, -121);
                            var57.field9929.method3526(class172.field2252, 13469);
                            var57.field9929.method3506(128, var7);
                            var57.field9929.method3509(class277.field3470.method448((byte) -68, 82) ? 1 : 0, (byte) -121);
                            var57.field9929.method3505(arg0 ^ -126, class286.field3557);
                            class122.method654(var57, (byte) -36);
                            class413.method2202(1, 0, -2, var56.method2785(-1), 0, true, var56.field9758[0], var56.field9754[0], var56.method2785(-1));
                        }
                    }
                    if (var6 == 3) {
                        class514 var58 = class351.field4490[var7];
                        if (var58 != null) {
                            class231.field2890 = 0;
                            ++class340.field4393;
                            class204.field2591 = arg1;
                            class369.field4685 = 2;
                            class199.field2527 = arg3;
                            class704 var59 = class314.method1820(class117.field1514, class400.field5014, (byte) -90);
                            var59.field9929.method3525((byte) 125, !class277.field3470.method448((byte) -68, 82) ? 0 : 1);
                            var59.field9929.method3505(75, var7);
                            class122.method654(var59, (byte) -36);
                            class413.method2202(1, 0, -2, var58.method2785(-1), 0, true, var58.field9758[0], var58.field9754[0], var58.method2785(arg0 + -1));
                        }
                    }
                    if (var6 == 51) {
                        class369.field4685 = 2;
                        ++class322.field4121;
                        class204.field2591 = arg1;
                        class199.field2527 = arg3;
                        class231.field2890 = 0;
                        class704 var60 = class314.method1820(class693.field9837, class400.field5014, (byte) 85);
                        var60.field9929.method3466(arg0 + 102, Integer.MAX_VALUE & (int) (var8 >>> 32));
                        var60.field9929.method3525((byte) 125, !class277.field3470.method448((byte) -68, 82) ? 0 : 1);
                        var60.field9929.method3526(class145.field1879 + var4, 13469);
                        var60.field9929.method3466(arg0 + 120, var5 - -class630.field8817);
                        class122.method654(var60, (byte) -36);
                        class503.method2705(var4, (byte) -42, var8, var5);
                    }
                    if (~var6 == -60) {
                        class514 var61 = class351.field4490[var7];
                        if (var61 != null) {
                            class204.field2591 = arg1;
                            ++class50.field707;
                            class199.field2527 = arg3;
                            class231.field2890 = 0;
                            class369.field4685 = 2;
                            class704 var62 = class314.method1820(class639.field8961, class400.field5014, (byte) 105);
                            var62.field9929.method3466(111, var7);
                            var62.field9929.method3512(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) 7);
                            class122.method654(var62, (byte) -36);
                            class413.method2202(arg0 + 1, 0, -2, var61.method2785(~arg0), 0, true, var61.field9758[0], var61.field9754[0], var61.method2785(-1));
                        }
                    }
                    if (~var6 == -50) {
                        class514 var63 = class351.field4490[var7];
                        if (var63 != null) {
                            class204.field2591 = arg1;
                            class231.field2890 = 0;
                            class369.field4685 = 2;
                            ++class275.field3453;
                            class199.field2527 = arg3;
                            class704 var64 = class314.method1820(class316.field4059, class400.field5014, (byte) -124);
                            var64.field9929.method3506(128, var7);
                            var64.field9929.method3512(class277.field3470.method448((byte) -68, 82) ? 1 : 0, (byte) 7);
                            class122.method654(var64, (byte) -36);
                            class413.method2202(arg0 + 1, 0, -2, var63.method2785(-1), 0, true, var63.field9758[0], var63.field9754[0], var63.method2785(-1));
                        }
                    }
                    if (var6 == 18) {
                        class199.field2527 = arg3;
                        class204.field2591 = arg1;
                        class369.field4685 = 2;
                        class231.field2890 = 0;
                        ++class344.field4417;
                        class704 var65 = class314.method1820(class498.field6564, class400.field5014, (byte) 77);
                        var65.field9929.method3466(108, Integer.MAX_VALUE & (int) (var8 >>> 32));
                        var65.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -111);
                        var65.field9929.method3466(96, var5 - -class630.field8817);
                        var65.field9929.method3505(arg0 ^ 54, class145.field1879 + var4);
                        class122.method654(var65, (byte) -36);
                        class503.method2705(var4, (byte) -42, var8, var5);
                    }
                    if (var6 == 11) {
                        ++class83.field1108;
                        class231.field2890 = 0;
                        class369.field4685 = 2;
                        class199.field2527 = arg3;
                        class204.field2591 = arg1;
                        class704 var66 = class314.method1820(class514.field6980, class400.field5014, (byte) 98);
                        var66.field9929.method3526(class145.field1879 + var4, 13469);
                        var66.field9929.method3505(arg0 ^ 21, class630.field8817 + var5);
                        var66.field9929.method3525((byte) 125, !class277.field3470.method448((byte) -68, 82) ? 0 : 1);
                        var66.field9929.method3506(128, var7);
                        class122.method654(var66, (byte) -36);
                        class168.method967((byte) -67, var4, var5);
                    }
                    if (~var6 == -5) {
                        class514 var67 = class351.field4490[var7];
                        if (var67 != null) {
                            class231.field2890 = 0;
                            ++class465.field5929;
                            class204.field2591 = arg1;
                            class369.field4685 = 2;
                            class199.field2527 = arg3;
                            class704 var68 = class314.method1820(class422.field5309, class400.field5014, (byte) -127);
                            var68.field9929.method3509(!class277.field3470.method448((byte) -68, 82) ? 0 : 1, (byte) -118);
                            var68.field9929.method3506(128, class172.field2252);
                            var68.field9929.method3492(class529.field7156, 124);
                            var68.field9929.method3506(arg0 ^ 128, class286.field3557);
                            var68.field9929.method3506(128, var7);
                            class122.method654(var68, (byte) -36);
                            class413.method2202(1, 0, -2, var67.method2785(-1), 0, true, var67.field9758[0], var67.field9754[0], var67.method2785(-1));
                        }
                    }
                    if (var6 == 44) {
                        class514 var69 = class351.field4490[var7];
                        if (var69 != null) {
                            ++class40.field532;
                            class231.field2890 = 0;
                            class369.field4685 = 2;
                            class204.field2591 = arg1;
                            class199.field2527 = arg3;
                            class704 var70 = class314.method1820(class5.field137, class400.field5014, (byte) 109);
                            var70.field9929.method3505(arg0 + -121, var7);
                            var70.field9929.method3512(class277.field3470.method448((byte) -68, 82) ? 1 : 0, (byte) 7);
                            class122.method654(var70, (byte) -36);
                            class413.method2202(1, 0, -2, var69.method2785(arg0 + -1), 0, true, var69.field9758[0], var69.field9754[0], var69.method2785(~arg0));
                        }
                    }
                    if (class664.field9377) {
                        class476.method2518((byte) 31);
                    }
                    if (class698.field9867 != null && class532.field7179 == 0) {
                        class572.method3158(class698.field9867, arg0 ^ 1023);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)V")
    public final void method280(int arg0, boolean arg1) {
        ++field2123;
        if (arg0 > -64) {
            this.method284((byte) 8);
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IZ)V")
    public final void method277(int arg0, boolean arg1) {
        ++field2113;
        this.field2126 = arg1;
        super.field3475.method3027(1, true);
        super.field3475.method2960(this.field2128, -2);
        super.field3475.method2983(34165, -465309136, 7681);
        super.field3475.method2966(0, 768, 768, 34166);
        super.field3475.method2966(2, 770, 768, 5890);
        super.field3475.method3015(34168, 770, 0, true);
        super.field3475.method3027(0, true);
        int var3 = 113 % ((65 - arg0) / 60);
        this.method928((byte) 88);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
    public final boolean method284(byte arg0) {
        if (arg0 >= -93) {
            return true;
        } else {
            ++field2112;
            return this.field2121;
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(B)V")
    public static void method930(byte arg0) {
        if (arg0 != -20) {
            method929(111, -124, (class145) null, 98);
        }
        field2130 = null;
        field2129 = null;
        field2124 = null;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public final void method931(int arg0) {
        ++field2119;
        int var2 = -68 % ((arg0 - 59) / 57);
        if (this.field2115) {
            int var3 = super.field3475.method1055();
            int var4 = super.field3475.method974();
            float var5 = (float) var3 - (float) (-var4 + var3) * 0.125F;
            float var6 = (float) var3 + -((float) (-var4 + var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, var5, 1.0F / (float) super.field3475.field7589, (float) super.field3475.field7543 / 255.0F);
            super.field3475.method3027(1, true);
            super.field3475.method2972(-29455, super.field3475.field7623);
            super.field3475.method3027(0, true);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILrg;)V")
    public final void method279(int arg0, int arg1, class615 arg2) {
        if (arg1 == 7) {
            if (arg2 != null) {
                super.field3475.method2960(arg2, arg1 + -9);
                super.field3475.method3005(false, arg0);
            } else {
                super.field3475.method2960(super.field3475.field7569, -2);
                super.field3475.method3005(false, 1);
                super.field3475.method2966(0, 768, arg1 ^ 775, 34168);
                super.field3475.method3015(34168, 770, 0, true);
            }
            ++field2125;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lqj;)V")
    public class161(class548 arg0) {
        super(arg0);
        if (!super.field3475.field7524) {
            this.field2121 = false;
        } else {
            this.field2118 = class393.method2108("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -65536, 34336, super.field3475);
            this.field2111 = class393.method2108("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", -65536, 34336, super.field3475);
            this.field2120 = class393.method2108("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -65536, 34336, super.field3475);
            this.field2127 = class393.method2108("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", -65536, 34336, super.field3475);
            if (this.field2127 != null & this.field2118 != null & this.field2111 != null & this.field2120 != null) {
                this.field2128 = new class133(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
                this.field2128.method774(false, (byte) -117, false);
                this.field2121 = true;
            } else {
                this.field2121 = false;
            }
        }
    }
}
