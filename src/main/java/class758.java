import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class758 {

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10832 = new String[] { method5500(method5499("IyfW_")), method5500(method5499("P?f:\n")), method5500(method5499("Ed$x")), method5500(method5499("IyfU_")), method5500(method5499("IyfP_")), method5500(method5499("IyfV_")), method5500(method5499("IyfQ_")) };

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
    public static int[] field10831 = new int[13];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field10826;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field10828;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field10829;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field10830;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[Lsl;")
    public static class746[] field10827;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 7)
    public static final void method5494(int arg0, int arg1) {
        try {
            field10830++;
            if (class30.field382 != null && arg1 >= 0 && class30.field382.field324 > arg1 && arg0 < -40) {
                class756 var2 = class30.field382.field319[arg1];
                if (var2.field10814 == -1) {
                    class779 var3 = class85.method851(false);
                    class274 var4 = class375.method2969((byte) 1, class212.field3118, var3.field11100);
                    var4.field3885.method5114(255, class101.method986(var2.field10808, 6743) + 2);
                    var4.field3885.method5138((byte) -112, arg1);
                    var4.field3885.method5089(var2.field10808, (byte) 78);
                    var3.method5608(var4, 29867);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10832[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Llt;ILha;I)V", line = 40)
    public static final void method5495(class182 arg0, int arg1, class18 arg2, int arg3) {
        try {
            field10828++;
            if (class130.field1625 != null && arg1 <= arg0.field2356) {
                for (int var4 = 0; var4 < class130.field1625.length; var4++) {
                    if (class130.field1625[var4] != -1000000 && (arg0.field2351[0] <= class130.field1625[var4] || arg0.field2351[1] <= class130.field1625[var4] || arg0.field2351[2] <= class130.field1625[var4] || class130.field1625[var4] >= arg0.field2351[3]) && (class263.field3721[var4] >= arg0.field2353[0] || class263.field3721[var4] >= arg0.field2353[1] || arg0.field2353[2] <= class263.field3721[var4] || arg0.field2353[3] <= class263.field3721[var4]) && (class393.field5719[var4] <= arg0.field2353[0] || class393.field5719[var4] <= arg0.field2353[1] || class393.field5719[var4] <= arg0.field2353[2] || arg0.field2353[3] >= class393.field5719[var4]) && (class502.field7335[var4] >= arg0.field2352[0] || class502.field7335[var4] >= arg0.field2352[1] || class502.field7335[var4] >= arg0.field2352[2] || arg0.field2352[3] <= class502.field7335[var4]) && (class559.field8140[var4] <= arg0.field2352[0] || arg0.field2352[1] >= class559.field8140[var4] || arg0.field2352[2] >= class559.field8140[var4] || arg0.field2352[3] >= class559.field8140[var4])) {
                        return;
                    }
                }
            }
            if (arg0.field2347 == 1) {
                int var5 = arg0.field2354 + class501.field7316 - class269.field3812;
                if (var5 >= 0 && (class501.field7316 + class501.field7316) >= var5) {
                    int var6 = class501.field7316 + arg0.field2357 - class98.field1331;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (class501.field7316 + class501.field7316 < var6) {
                        return;
                    }
                    int var7 = class501.field7316 + arg0.field2358 - class98.field1331;
                    if (class501.field7316 + class501.field7316 < var7) {
                        var7 = class501.field7316 + class501.field7316;
                    } else if (var7 < 0) {
                        return;
                    }
                    boolean var8 = false;
                    while (var7 >= var6) {
                        if (class30.field385[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (class161.field2067 - arg0.field2353[0]);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!(var9 < (float) class316.field4330) && class565.method4221(0, false, arg0) && class565.method4221(1, false, arg0) && class565.method4221(2, false, arg0) && class565.method4221(3, false, arg0)) {
                            class654.field9283[class694.field9701++] = arg0;
                        }
                    }
                }
            } else if (arg0.field2347 == 2) {
                int var10 = arg0.field2357 + class501.field7316 - class98.field1331;
                if (var10 >= 0 && (class501.field7316 + class501.field7316) >= var10) {
                    int var11 = class501.field7316 + arg0.field2354 - class269.field3812;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if ((class501.field7316 + class501.field7316) < var11) {
                        return;
                    }
                    int var12 = class501.field7316 + arg0.field2348 - class269.field3812;
                    if (var12 > (class501.field7316 + class501.field7316)) {
                        var12 = class501.field7316 + class501.field7316;
                    } else if (var12 < 0) {
                        return;
                    }
                    boolean var13 = false;
                    while (var12 >= var11) {
                        if (class30.field385[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (class446.field6565 - arg0.field2352[0]);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!(var14 < (float) class316.field4330) && class565.method4221(0, false, arg0) && class565.method4221(1, false, arg0) && class565.method4221(2, false, arg0) && class565.method4221(3, false, arg0)) {
                            class654.field9283[class694.field9701++] = arg0;
                        }
                    }
                }
            } else {
                if (arg3 != 0) {
                    field10827 = null;
                }
                if (arg0.field2347 == 16 || arg0.field2347 == 8) {
                    int var15 = arg0.field2354 + class501.field7316 - class269.field3812;
                    if (var15 >= 0 && var15 <= class501.field7316 + class501.field7316) {
                        int var16 = arg0.field2357 + class501.field7316 - class98.field1331;
                        if (var16 >= 0 && var16 <= class501.field7316 + class501.field7316 && class30.field385[var15][var16]) {
                            float var17 = (float) (class161.field2067 - arg0.field2353[0]);
                            if (var17 < 0.0F) {
                                var17 *= -1.0F;
                            }
                            float var18 = (float) (class446.field6565 - arg0.field2352[0]);
                            if (var18 < 0.0F) {
                                var18 *= -1.0F;
                            }
                            if (!(var17 < (float) class316.field4330) || !(var18 < (float) class316.field4330) && class565.method4221(0, false, arg0) && class565.method4221(1, false, arg0) && class565.method4221(2, false, arg0) && class565.method4221(3, false, arg0)) {
                                class654.field9283[class694.field9701++] = arg0;
                            }
                        }
                    }
                } else if (arg0.field2347 == 4) {
                    float var19 = (float) (arg0.field2351[0] - class137.field1771);
                    if (!(var19 <= (float) class281.field3962)) {
                        int var20 = arg0.field2357 - (class98.field1331 - class501.field7316);
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (class501.field7316 + class501.field7316 < var20) {
                            return;
                        }
                        int var21 = arg0.field2358 + class501.field7316 - class98.field1331;
                        if (var21 > class501.field7316 + class501.field7316) {
                            var21 = class501.field7316 + class501.field7316;
                        } else if (var21 < 0) {
                            return;
                        }
                        int var22 = arg0.field2354 + class501.field7316 - class269.field3812;
                        if (var22 < 0) {
                            var22 = 0;
                        } else if ((class501.field7316 + class501.field7316) < var22) {
                            return;
                        }
                        int var23 = arg0.field2348 + class501.field7316 - class269.field3812;
                        if (var23 > class501.field7316 + class501.field7316) {
                            var23 = class501.field7316 + class501.field7316;
                        } else if (var23 < 0) {
                            return;
                        }
                        boolean var24 = false;
                        label343: for (int var25 = var22; var25 <= var23; var25++) {
                            for (int var26 = var20; var26 <= var21; var26++) {
                                if (class30.field385[var25][var26]) {
                                    var24 = true;
                                    break label343;
                                }
                            }
                        }
                        if (var24 && class565.method4221(0, false, arg0) && class565.method4221(1, false, arg0) && class565.method4221(2, false, arg0) && class565.method4221(3, false, arg0)) {
                            class654.field9283[class694.field9701++] = arg0;
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field10832[5] + (arg0 == null ? field10832[2] : field10832[1]) + ',' + arg1 + ',' + (arg2 == null ? field10832[2] : field10832[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lem;IIB)V", line = 366)
    public static final void method5496(class339 arg0, int arg1, int arg2, byte arg3) {
        try {
            field10826++;
            int[] var4 = new int[arg3];
            class569.method4243(var4, 0, var4.length, arg2);
            class688.method4920(var4, arg0, arg1, false, 1);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10832[3] + (arg0 == null ? field10832[2] : field10832[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 380)
    public static void method5497(int arg0) {
        try {
            field10831 = null;
            if (arg0 == -5074) {
                field10827 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10832[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)Z", line = 391)
    public static final boolean method5498(boolean arg0) {
        try {
            class292.field4116++;
            if (arg0) {
                field10827 = null;
            }
            class408.field5907 = true;
            field10829++;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10832[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5499(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5500(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
