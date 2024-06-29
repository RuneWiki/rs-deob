import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class532 extends class188 {

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    private int field7685 = -1;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    private int field7687 = -1;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public int field7683;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Z")
    public static boolean field7692 = true;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Lrfa;")
    public static class211 field7690;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "Lmea;")
    public static class451 field7688;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Ljava/lang/Object;")
    public static Object field7686;

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lqfa;IIII)V")
    public class532(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7689 = arg2;
        this.field7683 = arg4;
        this.field7682 = arg3;
        super.field2905.method808((byte) 34, this);
        OpenGL.glTexImage3Dub(super.field2899, 0, super.field2906, this.field7689, this.field7682, this.field7683, 0, class434.method2600(-6407, super.field2906), 5121, (byte[]) null, 0);
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
    public final void method3208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7693;
        super.field2905.method808((byte) 34, this);
        if (arg0 != -1489) {
            method3209((byte) 7);
        }
        OpenGL.glCopyTexSubImage3D(super.field2899, 0, arg1, arg4, arg6, arg5, arg3, arg2, arg7);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method1319(int arg0) {
        if (arg0 == -17115) {
            OpenGL.glFramebufferTexture3DEXT(this.field7685, this.field7687, super.field2899, 0, 0, 0);
            ++field7691;
            this.field7687 = -1;
            this.field7685 = -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    public static void method3209(byte arg0) {
        field7688 = null;
        int var1 = 118 / ((arg0 - -48) / 61);
        field7690 = null;
        field7686 = null;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static final void method3210(int arg0) {
        class594.method3465(false, 124);
        ++field7684;
        class268.field3902 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class300.field4333.length; ++var2) {
            if (class325.field4552[var2] != -1 && class300.field4333[var2] == null) {
                class300.field4333[var2] = class168.field2640.method4339(0, 0, class325.field4552[var2]);
                if (class300.field4333[var2] == null) {
                    var1 = false;
                    ++class268.field3902;
                }
            }
            if (~class459.field6422[var2] != 0 && client.field4492[var2] == null) {
                client.field4492[var2] = class168.field2640.method4355(class459.field6422[var2], false, 0, class779.field10692[var2]);
                if (client.field4492[var2] == null) {
                    ++class268.field3902;
                    var1 = false;
                }
            }
            if (class148.field2139[var2] != -1 && client.field4500[var2] == null) {
                client.field4500[var2] = class168.field2640.method4339(0, 0, class148.field2139[var2]);
                if (client.field4500[var2] == null) {
                    ++class268.field3902;
                    var1 = false;
                }
            }
            if (class490.field6955[var2] != -1 && class8.field79[var2] == null) {
                class8.field79[var2] = class168.field2640.method4339(0, 0, class490.field6955[var2]);
                if (class8.field79[var2] == null) {
                    var1 = false;
                    ++class268.field3902;
                }
            }
            if (class314.field4472 != null && class506.field7191[var2] == null && ~class314.field4472[var2] != 0) {
                class506.field7191[var2] = class168.field2640.method4355(class314.field4472[var2], false, 0, class779.field10692[var2]);
                if (class506.field7191[var2] == null) {
                    var1 = false;
                    ++class268.field3902;
                }
            }
        }
        if (class161.field2550 == null) {
            if (class58.field728 != null && class249.field3679.method4352((byte) 95, class58.field728.field10445 + "_staticelements")) {
                if (class249.field3679.method4337(0, class58.field728.field10445 + "_staticelements")) {
                    class161.field2550 = class333.method2123(class249.field3679, class58.field728.field10445 + "_staticelements", arg0 ^ 3319, class792.field10895);
                } else {
                    var1 = false;
                    ++class268.field3902;
                }
            } else {
                class161.field2550 = new class632(0);
            }
        }
        if (!var1) {
            class339.field4746 = 1;
        } else {
            class48.field613 = 0;
            boolean var3 = true;
            for (int var4 = 0; class300.field4333.length > var4; ++var4) {
                byte[] var21 = client.field4492[var4];
                if (var21 != null) {
                    int var22 = (class551.field7919[var4] >> 8) * 64 + -class124.field1922;
                    int var23 = (255 & class551.field7919[var4]) * 64 - class88.field999;
                    if (~class472.field6621 != -1) {
                        var23 = 10;
                        var22 = 10;
                    }
                    var3 &= class115.method860(var22, var23, var21, 16223, class350.field4898, class768.field10571);
                }
                byte[] var24 = class8.field79[var4];
                if (var24 != null) {
                    int var25 = (class551.field7919[var4] >> 8) * 64 + -class124.field1922;
                    int var26 = (255 & class551.field7919[var4]) * 64 + -class88.field999;
                    if (~class472.field6621 != -1) {
                        var25 = 10;
                        var26 = 10;
                    }
                    var3 &= class115.method860(var25, var26, var24, arg0 ^ 13226, class350.field4898, class768.field10571);
                }
            }
            if (!var3) {
                class339.field4746 = 2;
            } else {
                if (class339.field4746 != 0) {
                    class66.method569(arg0 ^ -3244, class449.field6148, true, class37.field491, class620.field8673.method3580(class140.field2081, 12) + "<br>(100%)", class368.field5111);
                }
                class265.method1722(16033);
                class449.method2678(0);
                class132.method980(-120);
                boolean var5 = false;
                if (class37.field491.method455() && ~class21.field353.field10072.method697(arg0 ^ -3204) == -3) {
                    for (int var6 = 0; class300.field4333.length > var6; ++var6) {
                        if (class8.field79[var6] != null || client.field4500[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (~class21.field353.field10091.method1432(-70) == -2) {
                    var7 = class337.field4729[class580.field8171];
                } else {
                    var7 = class476.field6671[class580.field8171];
                }
                if (class37.field491.method516()) {
                    ++var7;
                }
                class745.method4149(class37.field491, class683.field9463, 9, 4, class768.field10571, class350.field4898, var7, var5, ~class37.field491.method535() < -1);
                class352.method2235(class103.field1191);
                if (class103.field1191 != 0) {
                    class640.method3654(class718.field9945);
                } else {
                    class640.method3654((class66) null);
                }
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class346.field4838[var8].method1772(arg0 + 21437);
                }
                class115.method861((byte) 117);
                class433.method2596(arg0 ^ -3236, false);
                class607.method3524(arg0 ^ -3212);
                class416.field5698 = null;
                class110.field1678 = false;
                class265.method1722(16033);
                System.gc();
                class594.method3465(true, 81);
                class550.method3285(31);
                class26.field390 = class21.field353.field10062.method4001(-42);
                class682.field9452 = ~class54.field676 <= -97;
                class53.field671 = ~class21.field353.field10072.method697(-84) == -3;
                class147.field2132 = class21.field353.field10080.method4366(arg0 + -3374) == 1;
                class451.field6344 = class21.field353.field10086.method1642(-54) == 1 ? -1 : class481.field6761;
                class281.field4082 = ~class21.field353.field10089.method124(-70) == -2;
                class588.field8296 = ~class21.field353.field10057.method1024(-114) == -2;
                class442.field6036 = new class381(4, class768.field10571, class350.field4898, false);
                if (~class472.field6621 == -1) {
                    class123.method933(31308, class300.field4333, class442.field6036);
                } else {
                    client.method2033(class442.field6036, class300.field4333, (byte) 76);
                }
                class189.method1321(class350.field4898 >> 4, 27944, class768.field10571 >> 4);
                class294.method1912(1391655267);
                if (var5) {
                    class33.method273(true);
                    class554.field7923 = new class381(1, class768.field10571, class350.field4898, true);
                    if (class472.field6621 != 0) {
                        client.method2033(class554.field7923, client.field4500, (byte) 109);
                        class594.method3465(true, 90);
                    } else {
                        class123.method933(arg0 + 27991, client.field4500, class554.field7923);
                        class594.method3465(true, 101);
                    }
                    class554.field7923.method3254(0, 38, class442.field6036.field7828[0]);
                    class554.field7923.method3259(class37.field491, 6, (int[][][]) null, (class274[]) null);
                    class33.method273(false);
                }
                class442.field6036.method3259(class37.field491, 6, !var5 ? null : class554.field7923.field7828, class346.field4838);
                if (~class472.field6621 == -1) {
                    class594.method3465(true, 103);
                    class545.method3262(class442.field6036, client.field4492, 103);
                    if (class506.field7191 != null) {
                        class63.method420(-7858);
                    }
                } else {
                    class594.method3465(true, 91);
                    class164.method1230(client.field4492, class442.field6036, arg0 + -9347);
                }
                class449.method2678(0);
                if (~class54.field676 > -97) {
                    class758.method4212((byte) 123);
                }
                class594.method3465(true, arg0 + -3250);
                class442.field6036.method3261(arg0 ^ arg0, class37.field491, (class294) null, var5 ? class774.field10642[0] : null);
                class442.field6036.method2373(1, class37.field491, false);
                class594.method3465(true, 102);
                if (var5) {
                    class33.method273(true);
                    class594.method3465(true, arg0 + -3223);
                    if (~class472.field6621 == -1) {
                        class545.method3262(class554.field7923, class8.field79, 103);
                    } else {
                        class164.method1230(class8.field79, class554.field7923, -6030);
                    }
                    class449.method2678(arg0 ^ 3317);
                    class594.method3465(true, arg0 ^ 3245);
                    class554.field7923.method3261(0, class37.field491, class411.field5572[0], (class294) null);
                    class554.field7923.method2373(1, class37.field491, true);
                    class594.method3465(true, 112);
                    class33.method273(false);
                }
                class428.method2578(0);
                int var9 = class442.field6036.field5265;
                if (~class368.field5113 > ~var9) {
                    var9 = class368.field5113;
                }
                if (class368.field5113 + -1 > var9) {
                    var9 = class368.field5113 + -1;
                }
                if (~class21.field353.field10086.method1642(-45) == -1) {
                    class649.method3720(var9);
                } else {
                    class649.method3720(0);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var19 = 0; class768.field10571 > var19; ++var19) {
                        for (int var20 = 0; class350.field4898 > var20; ++var20) {
                            class554.method3297(var19, var10, var20, arg0 + 1319318132);
                        }
                    }
                }
                class620.method3581(-2);
                class265.method1722(16033);
                class373.method2311(0);
                class449.method2678(0);
                class635.method3638(false);
                if (class384.field5278 != null && class527.field7529 != null && ~class266.field3873 == -12) {
                    ++class703.field9802;
                    class312 var11 = class353.method2245(class87.field971, class537.field7717, (byte) 78);
                    var11.field4445.method2959(1057001181, (byte) 118);
                    class208.method1440(var11, arg0 ^ 3287);
                }
                if (class472.field6621 == 0) {
                    int var12 = (-(class768.field10571 >> 4) + class432.field5849) / 8;
                    int var13 = ((class768.field10571 >> 4) + class432.field5849) / 8;
                    int var14 = (-(class350.field4898 >> 4) + class436.field5884) / 8;
                    int var15 = ((class350.field4898 >> 4) + class436.field5884) / 8;
                    for (int var16 = var12 - 1; var16 <= var13 + 1; ++var16) {
                        for (int var17 = var14 + -1; ~var17 >= ~(var15 + 1); ++var17) {
                            if (var16 < var12 || ~var16 < ~var13 || var14 > var17 || var17 > var15) {
                                class168.field2640.method4346(arg0 ^ 23617, "m" + var16 + "_" + var17);
                                class168.field2640.method4346(20660, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (~class266.field3873 == -5) {
                    class225.method1539(false, 3);
                } else if (~class266.field3873 == -9) {
                    class225.method1539(false, 7);
                } else {
                    class225.method1539(false, 10);
                    if (class527.field7529 != null) {
                        class312 var18 = class353.method2245(class87.field971, class204.field3167, (byte) 116);
                        class208.method1440(var18, arg0 ^ 3209);
                    }
                }
                class57.method392(arg0 + -3318);
                class265.method1722(16033);
                class561.method3315(-15168);
                class98.field1115 = true;
                if (class106.field1345) {
                    class587.method3423("Took: " + (class459.method2731(104) - class647.field9057) + "ms", -114);
                    class106.field1345 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lqfa;IIII[BI)V")
    public class532(class106 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field7682 = arg3;
        this.field7683 = arg4;
        this.field7689 = arg2;
        super.field2905.method808((byte) 34, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2899, 0, super.field2906, this.field7689, this.field7682, this.field7683, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1312((byte) -79, true);
    }
}
