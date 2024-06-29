import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class387 implements class410 {

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lla;")
    private class476 field5844;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lkc;")
    public class145 field5845;

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5850 = new String[] { method3090(method3089("KO\u0019aZ\u0001")), method3090(method3089("KO\u0019a\\\u0001")), method3090(method3089("KO\u0019aR\u0001")), method3090(method3089("KO\u0019aS\u0001")), method3090(method3089("KO\u0019a[\u0001")), method3090(method3089("G\\\u0014#")), method3090(method3089("KO\u0019a]\u0001")), method3090(method3089("R\u0007Val")), method3090(method3089("KO\u0019a-@G\u0011;/\u0001")) };

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "Lvha;")
    public static class713 field5840 = new class713(11, 2);

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "Z")
    public static boolean field5848 = false;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "Lel;")
    public static class573 field5847 = new class573(28, 6);

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lfs;")
    public class581 field5843;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
    public final void method370(byte arg0) {
        try {
            if (arg0 < -98) {
                this.field5843 = class670.method4933(-43, this.field5844, this.field5845.field1783);
                field5846++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5850[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        try {
            if (arg0 != -17976) {
                this.method369(93);
            }
            field5841++;
            return this.field5844.method3618(this.field5845.field1783, 45);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5850[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZII)V")
    public static final void method3086(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                class280 var3 = class610.method4508(class226.field3452, class279.field4190, (byte) -66);
                var3.field4197.method1406(arg1, 380332136);
                class106.method934((byte) 53, var3);
            } else {
                class782.method5652(class749.field10903, arg1, -1);
            }
            field5839++;
            if (arg2 > -60) {
                method3087(-127, -57, 20, -32, null, -114);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5850[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIILhw;I)V")
    public static final void method3087(int arg0, int arg1, int arg2, int arg3, class142 arg4, int arg5) {
        try {
            field5838++;
            if (arg4.field1698 != -1 || arg4.field1706 != null) {
                int var6 = 0;
                int var7 = arg4.field1707 * class289.field4305.field803.method4492(false) >> 8;
                if (arg5 > arg4.field1687) {
                    var6 += arg5 - arg4.field1687;
                } else if (arg4.field1689 > arg5) {
                    var6 += arg4.field1689 - arg5;
                }
                if (arg3 > arg4.field1693) {
                    var6 += arg3 - arg4.field1693;
                } else if (arg3 < arg4.field1694) {
                    var6 += arg4.field1694 - arg3;
                }
                if (arg4.field1686 == 0 || (var6 - 256) > arg4.field1686 || class289.field4305.field803.method4492(false) == 0 || arg4.field1714 != arg2) {
                    if (arg4.field1700 != null) {
                        class594.field8714.method4980(arg4.field1700);
                        arg4.field1700 = null;
                        arg4.field1692 = null;
                        arg4.field1691 = null;
                    }
                    if (arg4.field1712 != null) {
                        class594.field8714.method4980(arg4.field1712);
                        arg4.field1712 = null;
                        arg4.field1697 = null;
                        arg4.field1711 = null;
                    }
                } else {
                    var6 -= 256;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var8 = arg4.field1686 - arg4.field1684;
                    if (var8 < 0) {
                        var8 = arg4.field1686;
                    }
                    int var9 = var7;
                    int var10 = var6 - arg4.field1684;
                    if (var10 > 0 && var8 > 0) {
                        var9 = (var8 - var10) * var7 / var8;
                    }
                    if (arg0 == -1) {
                        class225.field3446.method2101(arg0 + 31464);
                        int var11 = 8192;
                        int var12 = (arg4.field1689 + arg4.field1687) / 2 - arg5;
                        int var13 = (arg4.field1694 + arg4.field1693) / 2 - arg3;
                        if (var12 != 0 || var13 != 0) {
                            int var14 = -class93.field1052 - (int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
                            if (var14 > 8192) {
                                var14 = 16384 - var14;
                            }
                            int var15;
                            if (var6 <= 0) {
                                var15 = 8192;
                            } else if (var6 >= 4096) {
                                var15 = 16384;
                            } else {
                                var15 = var6 * 8192 / 4096 + 8192;
                            }
                            var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
                        }
                        if (arg4.field1700 != null) {
                            arg4.field1700.method2549(var9);
                            arg4.field1700.method2579(var11);
                        } else if (arg4.field1698 >= 0) {
                            int var16 = arg4.field1685 == 256 && arg4.field1710 == 256 ? 256 : class218.method1905((byte) 112, arg4.field1685, arg4.field1710);
                            if (arg4.field1701) {
                                if (arg4.field1691 == null) {
                                    arg4.field1691 = class438.method3367(class571.field8452, arg4.field1698);
                                }
                                if (arg4.field1691 != null) {
                                    if (arg4.field1692 == null) {
                                        arg4.field1692 = arg4.field1691.method3366(new int[] { 22050 });
                                    }
                                    if (arg4.field1692 != null) {
                                        class303 var17 = class303.method2578(arg4.field1692, var16, var9 << 6, var11);
                                        var17.method2555(-1);
                                        class594.field8714.method4981(var17);
                                        arg4.field1700 = var17;
                                    }
                                }
                            } else {
                                class395 var18 = class395.method3125(class227.field3474, arg4.field1698, 0);
                                if (var18 != null) {
                                    class105 var19 = var18.method3127().method930(class231.field3499);
                                    class303 var20 = class303.method2578(var19, var16, var9 << 6, var11);
                                    var20.method2555(-1);
                                    class594.field8714.method4981(var20);
                                    arg4.field1700 = var20;
                                }
                            }
                        }
                        if (arg4.field1712 != null) {
                            arg4.field1712.method2549(var9);
                            arg4.field1712.method2579(var11);
                            if (!arg4.field1712.method1823(0)) {
                                arg4.field1712 = null;
                                arg4.field1697 = null;
                                arg4.field1711 = null;
                            }
                        } else if (arg4.field1706 != null && (arg4.field1690 -= arg1) <= 0) {
                            int var21 = arg4.field1685 == 256 && arg4.field1710 == 256 ? 256 : (int) (Math.random() * (double) (arg4.field1685 - arg4.field1710)) + arg4.field1710;
                            if (!arg4.field1705) {
                                int var22 = (int) (Math.random() * (double) arg4.field1706.length);
                                class395 var23 = class395.method3125(class227.field3474, arg4.field1706[var22], 0);
                                if (var23 != null) {
                                    class105 var24 = var23.method3127().method930(class231.field3499);
                                    class303 var25 = class303.method2578(var24, var21, var9 << 6, var11);
                                    var25.method2555(0);
                                    class594.field8714.method4981(var25);
                                    arg4.field1690 = arg4.field1696 + ((int) ((double) (arg4.field1695 - arg4.field1696) * Math.random()));
                                    arg4.field1712 = var25;
                                    return;
                                }
                                return;
                            }
                            if (arg4.field1697 == null) {
                                int var26 = (int) (Math.random() * (double) arg4.field1706.length);
                                arg4.field1697 = class438.method3367(class571.field8452, arg4.field1706[var26]);
                            }
                            if (arg4.field1697 != null) {
                                if (arg4.field1711 == null) {
                                    arg4.field1711 = arg4.field1697.method3366(new int[] { 22050 });
                                }
                                if (arg4.field1711 != null) {
                                    class303 var27 = class303.method2578(arg4.field1711, var21, var9 << 6, var11);
                                    var27.method2555(0);
                                    class594.field8714.method4981(var27);
                                    arg4.field1712 = var27;
                                    arg4.field1690 = arg4.field1696 + (int) (Math.random() * (double) (arg4.field1695 - arg4.field1696));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field5850[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5850[5] : field5850[7]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lla;Lkc;)V")
    public class387(class476 arg0, class145 arg1) {
        try {
            this.field5844 = arg0;
            this.field5845 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5850[8] + (arg0 == null ? field5850[5] : field5850[7]) + ',' + (arg1 == null ? field5850[5] : field5850[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V")
    public static void method3088(boolean arg0) {
        try {
            field5847 = null;
            if (!arg0) {
                method3086(true, -120, -50);
            }
            field5840 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5850[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZB)V")
    public void method368(boolean arg0, byte arg1) {
        try {
            int var3 = -50 / ((arg1 - 38) / 37);
            if (arg0) {
                int var4 = this.field5845.field1789.method4532(this.field5843.method988(), 0, class604.field8861) + this.field5845.field1785;
                int var5 = this.field5845.field1781.method2339(this.field5843.method997(), (byte) -34, class524.field7654) + this.field5845.field1782;
                this.field5843.method4347(var4, var5);
            }
            field5842++;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5850[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3089(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3090(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
