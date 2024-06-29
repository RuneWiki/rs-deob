import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class442 {

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "J")
    private long field6529 = -1L;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "Ltf;")
    private class524 field6527 = new class524();

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6533 = new String[] { method3444(method3443("}ql\u00171#")), method3444(method3443("p;#\u0017\u000e")), method3444(method3443("^{\u007f\\\u0010drcP\u0000nq-z\u001fj{NQ\u0012e{hU7nyyXS\u007fl}\\Sb{-]\u0016hzi\\[\"")), method3444(method3443("e`aU")), method3444(method3443("}ql\u00170#")), method3444(method3443("TfyX\u0007bvhU\u0016fpcM\u0000")), method3444(method3443("_zbRI+")), method3444(method3443("}ql\u00177#")), method3444(method3443("7w\u007f\u0007[:%=\u001cZ")), method3444(method3443("ff")), method3444(method3443("}ql\u00172#")), method3444(method3443("+qhU\u0007j;nU\u0012e]lJ\u001b1")), method3444(method3443("HylW0ctcW\u0016gQhU\u0007j;lI\u0003glYV0gtcz\u001bj{c\\\u001f#<7\u00190ypi\\\u001d\u007f|lU\u0000+qb\u0019\u001dda-T\u0012\u007fve\u0018Shv#Z\u001fj{EX\u0000c/")), method3444(method3443("+`}]\u0012\u007fpCL\u001e1")), method3444(method3443("}ql\u00176#")), method3444(method3443("}ql\u0017Ob{dMM#")) };

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field6528 = 0;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Lsb;")
    public static class261 field6532 = new class261(76, -2);

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "J")
    private long field6531;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljc;I)V", line = 6)
    private final void method3438(class711 arg0, int arg1) {
        try {
            field6526++;
            this.field6531 = arg0.method5147((byte) 77);
            if (arg1 == 1) {
                this.field6529 = arg0.method5147((byte) 126);
                for (int var3 = arg0.method5128(0); var3 != 0; var3 = arg0.method5128(arg1 ^ 0x1)) {
                    class627 var4;
                    if (var3 == 1) {
                        var4 = new class559();
                    } else if (var3 == 4) {
                        var4 = new class387();
                    } else if (var3 == 3) {
                        var4 = new class52();
                    } else if (var3 == 2) {
                        var4 = new class14();
                    } else {
                        throw new RuntimeException(field6533[2]);
                    }
                    var4.method97(arg0, -101);
                    this.field6527.method3984(var4, 0);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6533[0] + (arg0 == null ? field6533[3] : field6533[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 45)
    public static void method3439(int arg0) {
        try {
            if (arg0 <= 103) {
                method3440(null, -85, -13, -88, 40);
            }
            field6532 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6533[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ldm;IIII)V", line = 64)
    public static final void method3440(class274 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field6530++;
            arg0.field3885.method5138((byte) -112, arg1);
            if (arg2 >= -2) {
                field6532 = null;
            }
            arg0.field3885.method5115(arg4, 587134664);
            arg0.field3885.method5138((byte) -97, arg3);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6533[14] + (arg0 == null ? field6533[3] : field6533[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 83)
    public static final void method3441(byte arg0) {
        try {
            class671.method4828((byte) -124, false);
            field6525++;
            class36.field433 = 0;
            boolean var1 = true;
            for (int var2 = 0; var2 < class385.field5630.length; var2++) {
                if (class250.field3572[var2] != -1 && class385.field5630[var2] == null) {
                    class385.field5630[var2] = class203.field2987.method512(0, class250.field3572[var2], (byte) -6);
                    if (class385.field5630[var2] == null) {
                        class36.field433++;
                        var1 = false;
                    }
                }
                if (class521.field7608[var2] != -1 && class796.field11577[var2] == null) {
                    class796.field11577[var2] = class203.field2987.method499(arg0 - 29091, class20.field255[var2], class521.field7608[var2], 0);
                    if (class796.field11577[var2] == null) {
                        var1 = false;
                        class36.field433++;
                    }
                }
                if (class693.field9685[var2] != -1 && class686.field9614[var2] == null) {
                    class686.field9614[var2] = class203.field2987.method512(0, class693.field9685[var2], (byte) -41);
                    if (class686.field9614[var2] == null) {
                        class36.field433++;
                        var1 = false;
                    }
                }
                if (class359.field5217[var2] != -1 && class125.field1576[var2] == null) {
                    class125.field1576[var2] = class203.field2987.method512(0, class359.field5217[var2], (byte) -37);
                    if (class125.field1576[var2] == null) {
                        var1 = false;
                        class36.field433++;
                    }
                }
                if (class259.field3688 != null && class753.field10768[var2] == null && class259.field3688[var2] != -1) {
                    class753.field10768[var2] = class203.field2987.method499(-28996, class20.field255[var2], class259.field3688[var2], 0);
                    if (class753.field10768[var2] == null) {
                        var1 = false;
                        class36.field433++;
                    }
                }
            }
            if (class293.field4126 == null) {
                if (class450.field6600 == null || !class622.field8890.method521(class450.field6600.field10174 + field6533[5], false)) {
                    class293.field4126 = new class663(0);
                } else if (class622.field8890.method503(3, class450.field6600.field10174 + field6533[5])) {
                    class293.field4126 = class378.method2992(class260.field3696, (byte) 127, class450.field6600.field10174 + field6533[5], class622.field8890);
                } else {
                    var1 = false;
                    class36.field433++;
                }
            }
            if (var1) {
                class185.field2400 = 0;
                boolean var3 = true;
                for (int var4 = 0; var4 < class385.field5630.length; var4++) {
                    byte[] var5 = class796.field11577[var4];
                    if (var5 != null) {
                        int var6 = (class136.field1754[var4] >> 8) * 64 - class537.field7895;
                        int var7 = (class136.field1754[var4] & 0xFF) * 64 - class655.field9286;
                        if (class751.field10694 != 0) {
                            var7 = 10;
                            var6 = 10;
                        }
                        var3 &= class583.method4318(-1, class14.field187, var6, var5, var7, class625.field8929);
                    }
                    byte[] var8 = class125.field1576[var4];
                    if (var8 != null) {
                        int var9 = (class136.field1754[var4] >> 8) * 64 - class537.field7895;
                        int var10 = (class136.field1754[var4] & 0xFF) * 64 - class655.field9286;
                        if (class751.field10694 != 0) {
                            var9 = 10;
                            var10 = 10;
                        }
                        var3 &= class583.method4318(-1, class14.field187, var9, var8, var10, class625.field8929);
                    }
                }
                if (var3) {
                    if (class772.field11000 != 0) {
                        class649.method4730(2, class84.field1185, class537.field7842.method4068((byte) -70, class405.field5883) + field6533[8], class23.field279, class236.field3418, true);
                    }
                    if (arg0 != 95) {
                        field6528 = 63;
                    }
                    class635.method4633(88);
                    class731.method5323(-4245);
                    class353.method2822(arg0 + 5);
                    boolean var11 = false;
                    if (class236.field3418.method125() && class451.field6612.field9105.method1260(3) == 2) {
                        for (int var12 = 0; var12 < class385.field5630.length; var12++) {
                            if (class125.field1576[var12] != null || class686.field9614[var12] != null) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                    int var13;
                    if (class451.field6612.field9114.method5345(3) == 1) {
                        var13 = class246.field3516[class351.field5087];
                    } else {
                        var13 = class561.field8161[class351.field5087];
                    }
                    if (class236.field3418.method186()) {
                        var13++;
                    }
                    class595.method4392(class236.field3418, class336.field4869, 9, 4, class625.field8929, class14.field187, var13, var11, class236.field3418.method198() > 0);
                    class522.method3967(class574.field8311);
                    if (class574.field8311 == 0) {
                        class576.method4283(null);
                    } else {
                        class576.method4283(class626.field8945);
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        class195.field2919[var14].method2432(true);
                    }
                    class526.method4000(true);
                    class470.method3615(false, (byte) -86);
                    class321.method2542(true);
                    class119.field1512 = false;
                    class635.method4633(98);
                    System.gc();
                    class671.method4828((byte) 36, true);
                    class49.method542((byte) -120);
                    class577.field8358 = class451.field6612.field9113.method1072(3);
                    class113.field1459 = class342.field4980 >= 96;
                    class375.field5481 = class451.field6612.field9105.method1260(arg0 ^ 0x5C) == 2;
                    class418.field6028 = class451.field6612.field9127.method5475(3) == 1;
                    class599.field8601 = class451.field6612.field9089.method5427(3) == 1 ? -1 : class475.field6973;
                    class459.field6683 = class451.field6612.field9101.method2398(3) == 1;
                    class297.field4147 = class451.field6612.field9092.method2151(3) == 1;
                    class334.field4579 = new class794(4, class625.field8929, class14.field187, false);
                    if (class751.field10694 == 0) {
                        class468.method3593(class334.field4579, -25, class385.field5630);
                    } else {
                        class520.method3952(class334.field4579, arg0 + 3872, class385.field5630);
                    }
                    class680.method4882(false, class14.field187 >> 4, class625.field8929 >> 4);
                    class162.method1383(-14816);
                    if (var11) {
                        class526.method3999(true);
                        class663.field9373 = new class794(1, class625.field8929, class14.field187, true);
                        if (class751.field10694 == 0) {
                            class468.method3593(class663.field9373, -109, class686.field9614);
                            class671.method4828((byte) -125, true);
                        } else {
                            class520.method3952(class663.field9373, arg0 ^ 0xF20, class686.field9614);
                            class671.method4828((byte) -128, true);
                        }
                        class663.field9373.method367((byte) -48, class334.field4579.field456[0], 0);
                        class663.field9373.method370(null, class236.field3418, (byte) -8, null);
                        class526.method3999(false);
                    }
                    class334.field4579.method370(class195.field2919, class236.field3418, (byte) -8, var11 ? class663.field9373.field456 : null);
                    if (class751.field10694 == 0) {
                        class671.method4828((byte) 34, true);
                        class784.method5646(class334.field4579, arg0 - 223, class796.field11577);
                        if (class753.field10768 != null) {
                            class237.method1965(0);
                        }
                    } else {
                        class671.method4828((byte) -113, true);
                        class303.method2436(class334.field4579, (byte) 62, class796.field11577);
                    }
                    class731.method5323(-4245);
                    if (class342.field4980 < 96) {
                        class723.method5229(-117);
                    }
                    class671.method4828((byte) 74, true);
                    class334.field4579.method364(null, -31047, var11 ? class677.field9474[0] : null, class236.field3418);
                    class334.field4579.method5726(false, class236.field3418, false);
                    class671.method4828((byte) 91, true);
                    if (var11) {
                        class526.method3999(true);
                        class671.method4828((byte) -117, true);
                        if (class751.field10694 == 0) {
                            class784.method5646(class663.field9373, -105, class125.field1576);
                        } else {
                            class303.method2436(class663.field9373, (byte) 62, class125.field1576);
                        }
                        class731.method5323(-4245);
                        class671.method4828((byte) 86, true);
                        class663.field9373.method364(class213.field3124[0], -31047, null, class236.field3418);
                        class663.field9373.method5726(false, class236.field3418, true);
                        class671.method4828((byte) -114, true);
                        class526.method3999(false);
                    }
                    class26.method296((byte) -3);
                    int var15 = class334.field4579.field11554;
                    if (var15 > class693.field9689) {
                        var15 = class693.field9689;
                    }
                    if (var15 < class693.field9689 - 1) {
                        var15 = class693.field9689 - 1;
                    }
                    if (class451.field6612.field9089.method5427(3) == 0) {
                        class460.method3539(var15);
                    } else {
                        class460.method3539(0);
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < class625.field8929; var17++) {
                            for (int var18 = 0; var18 < class14.field187; var18++) {
                                class757.method5489(var18, (byte) -75, var16, var17);
                            }
                        }
                    }
                    class51.method553((byte) -59);
                    class635.method4633(106);
                    class423.method3286(107);
                    class731.method5323(-4245);
                    class755.method5476((byte) -117);
                    if (class543.field7942 != null && class60.field916.field11096 != null && class559.field8139 == 12) {
                        class432.field6270++;
                        class274 var19 = class375.method2969((byte) 1, class194.field2551, class60.field916.field11100);
                        var19.field3885.method5127(1057001181, arg0 + 26013);
                        class60.field916.method5608(var19, arg0 + 29772);
                    }
                    if (class751.field10694 == 0) {
                        int var20 = (class353.field5113 - (class625.field8929 >> 4)) / 8;
                        int var21 = (class353.field5113 + (class625.field8929 >> 4)) / 8;
                        int var22 = (class427.field6145 - (class14.field187 >> 4)) / 8;
                        int var23 = ((class14.field187 >> 4) + class427.field6145) / 8;
                        for (int var24 = var20 - 1; var24 <= (var21 + 1); var24++) {
                            for (int var25 = var22 - 1; var25 <= var23 + 1; var25++) {
                                if (var24 < var20 || var21 < var24 || var22 > var25 || var25 > var23) {
                                    class203.field2987.method516(112, "m" + var24 + "_" + var25);
                                    class203.field2987.method516(64, "l" + var24 + "_" + var25);
                                }
                            }
                        }
                    }
                    if (class559.field8139 == 4) {
                        class699.method5035(3, 31754);
                    } else if (class559.field8139 == 8) {
                        class699.method5035(7, 31754);
                    } else if (class559.field8139 == 10) {
                        class699.method5035(9, 31754);
                    } else {
                        class699.method5035(11, 31754);
                        if (class60.field916.field11096 != null) {
                            class274 var26 = class375.method2969((byte) 1, class345.field5018, class60.field916.field11100);
                            class60.field916.method5608(var26, 29867);
                        }
                    }
                    class384.method3027(arg0 + 5287);
                    class635.method4633(85);
                    class258.method2150((byte) -32);
                    class710.field9925 = true;
                    if (class706.field9872) {
                        class11.method74(field6533[6] + (class614.method4531(-96) - class156.field1989) + field6533[9], (byte) 66);
                        class706.field9872 = false;
                    }
                } else {
                    class772.field11000 = 2;
                }
            } else {
                class772.field11000 = 1;
            }
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field6533[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLkj;)V", line = 568)
    public final void method3442(byte arg0, class26 arg1) {
        try {
            field6524++;
            if (this.field6531 != arg1.field8378 || this.field6529 != arg1.field314) {
                throw new RuntimeException(field6533[12] + arg1.field8378 + field6533[13] + arg1.field314 + field6533[11] + this.field6531 + field6533[13] + this.field6529);
            }
            if (arg0 < 119) {
                this.field6527 = null;
            }
            for (class627 var3 = (class627) this.field6527.method3977((byte) -46); var3 != null; var3 = (class627) this.field6527.method3987(0)) {
                var3.method96(arg1, 94);
            }
            arg1.field314++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6533[10] + arg0 + ',' + (arg1 == null ? field6533[3] : field6533[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljc;)V", line = 604)
    public class442(class711 arg0) {
        try {
            this.method3438(arg0, 1);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6533[15] + (arg0 == null ? field6533[3] : field6533[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3443(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3444(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
