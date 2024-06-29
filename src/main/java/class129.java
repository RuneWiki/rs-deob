import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class129 extends class160 {

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field2024 = new String[200];

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "[I")
    public static int[] field2025 = new int[100];

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "Led;")
    public static class186 field2021;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    public static void method892(int arg0) {
        field2024 = null;
        if (arg0 != 4) {
            field2025 = null;
        }
        field2025 = null;
        field2021 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2((class88) null, -66, -77);
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            for (int var7 = 0; ~var7 > ~class240.field3896; ++var7) {
                this.method895(var7, arg0, 8994);
                int[][] var8 = this.method1079(class198.field3122, 106, 0);
                var6[var7] = var8[0][class238.field3863];
                var5[var7] = var8[1][class238.field3863];
                var4[var7] = var8[2][class238.field3863];
            }
        }
        ++field2026;
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field2029;
        if (arg2 == 0) {
            super.field2494 = ~arg0.method633(68) == -2;
        }
        if (arg1 < 11) {
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field2022;
        int[] var3 = super.field2488.method15((byte) 124, arg0);
        if (arg1 != 57) {
            field2025 = null;
        }
        if (super.field2488.field42) {
            for (int var4 = 0; var4 < class240.field3896; ++var4) {
                this.method895(var4, arg0, 8994);
                int[] var5 = this.method1085(0, class198.field3122, (byte) 102);
                var3[var4] = var5[class238.field3863];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class129() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public static final void method893(int arg0) {
        ++field2028;
        if (~class235.field3794 != -1 && class235.field3794 != 5) {
            try {
                if (~(++class259.field4145) < -2001) {
                    if (class249.field4022 != null) {
                        class249.field4022.method899((byte) 124);
                        class249.field4022 = null;
                    }
                    if (~class167.field2619 <= -2) {
                        class217.field3353 = -5;
                        class235.field3794 = 0;
                        return;
                    }
                    ++class167.field2619;
                    class235.field3794 = 1;
                    class259.field4145 = 0;
                    if (~class88.field1539 != ~class177.field2773) {
                        class177.field2773 = class88.field1539;
                    } else {
                        class177.field2773 = class184.field2845;
                    }
                }
                if (class235.field3794 == 1) {
                    class194.field3073 = class179.field2788.method246(class173.field2719, class177.field2773, false);
                    class235.field3794 = 2;
                }
                if (class235.field3794 == 2) {
                    if (~class194.field3073.field1255 == -3) {
                        throw new IOException();
                    }
                    if (class194.field3073.field1255 != 1) {
                        return;
                    }
                    class249.field4022 = new class130((Socket) class194.field3073.field1258, class179.field2788);
                    class194.field3073 = null;
                    long var1 = class265.field4212 = class148.method1000(class245.field3980, 934);
                    int var3 = (int) (var1 >> 16 & 31L);
                    client.field2435.field1535 = 0;
                    client.field2435.method654((byte) -98, 14);
                    client.field2435.method654((byte) -105, var3);
                    class249.field4022.method897(2, client.field2435.field1471, 0, 5000);
                    if (class222.field3412 != null) {
                        class222.field3412.method558(0);
                    }
                    if (class183.field2844 != null) {
                        class183.field2844.method558(0);
                    }
                    int var4 = class249.field4022.method906(-70);
                    if (class222.field3412 != null) {
                        class222.field3412.method558(0);
                    }
                    if (class183.field2844 != null) {
                        class183.field2844.method558(0);
                    }
                    if (var4 != 0) {
                        class235.field3794 = 0;
                        class217.field3353 = var4;
                        class249.field4022.method899((byte) 116);
                        class249.field4022 = null;
                        return;
                    }
                    class235.field3794 = 3;
                }
                if (class235.field3794 == 3) {
                    if (~class249.field4022.method898(37) > -9) {
                        return;
                    }
                    int[] var5 = new int[4];
                    class249.field4022.method907((byte) 123, 8, class236.field3814.field1471, 0);
                    class236.field3814.field1535 = 0;
                    class24.field327 = class236.field3814.method625((byte) -22);
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    var5[2] = (int) (class24.field327 >> 32);
                    var5[1] = (int) (9.9999999E7D * Math.random());
                    client.field2435.field1535 = 0;
                    var5[3] = (int) class24.field327;
                    client.field2435.method654((byte) -116, 10);
                    client.field2435.method639(var5[0], (byte) -100);
                    client.field2435.method639(var5[1], (byte) -117);
                    client.field2435.method639(var5[2], (byte) -118);
                    client.field2435.method639(var5[3], (byte) -111);
                    client.field2435.method638(class148.method1000(class245.field3980, 934), false);
                    client.field2435.method680(class221.field3400, (byte) 101);
                    client.field2435.method632(-32106, class29.field407, class11.field189);
                    class118.field1914.field1535 = 0;
                    if (class39.field551 == 40) {
                        class118.field1914.method654((byte) -126, 18);
                    } else {
                        class118.field1914.method654((byte) -97, 16);
                    }
                    class118.field1914.method634(163 + client.field2435.field1535 + class125.method871(class84.field1416, true), 88);
                    class118.field1914.method639(536, (byte) -127);
                    class118.field1914.method654((byte) -107, class71.field1137);
                    class118.field1914.method654((byte) -100, !class95.field1613 ? 0 : 1);
                    class118.field1914.method654((byte) -99, 0);
                    class118.field1914.method654((byte) -115, class33.method262(0));
                    class118.field1914.method634(class29.field409, 66);
                    class118.field1914.method634(class79.field1310, 30);
                    class118.field1914.method654((byte) -102, class180.field2815);
                    class291.method1951(true, class118.field1914);
                    class118.field1914.method680(class84.field1416, (byte) 101);
                    class118.field1914.method639(class232.field3696, (byte) -124);
                    class118.field1914.method639(class163.method1108((byte) 32), (byte) -127);
                    class216.field3351 = true;
                    class118.field1914.method634(class221.field3401, 115);
                    class118.field1914.method639(class4.field41.method1606(0), (byte) -101);
                    class118.field1914.method639(class227.field3461.method1606(0), (byte) -124);
                    class118.field1914.method639(class161.field2530.method1606(0), (byte) -128);
                    class118.field1914.method639(class283.field4465.method1606(0), (byte) -119);
                    class118.field1914.method639(class135.field2097.method1606(0), (byte) -123);
                    class118.field1914.method639(class17.field252.method1606(0), (byte) -127);
                    class118.field1914.method639(class31.field459.method1606(0), (byte) -120);
                    class118.field1914.method639(class208.field3246.method1606(0), (byte) -123);
                    class118.field1914.method639(class130.field2055.method1606(0), (byte) -101);
                    class118.field1914.method639(class255.field4086.method1606(0), (byte) -113);
                    class118.field1914.method639(class62.field1074.method1606(0), (byte) -106);
                    class118.field1914.method639(class240.field3901.method1606(0), (byte) -106);
                    class118.field1914.method639(class132.field2073.method1606(0), (byte) -116);
                    class118.field1914.method639(class236.field3832.method1606(0), (byte) -126);
                    class118.field1914.method639(class150.field2370.method1606(0), (byte) -118);
                    class118.field1914.method639(class230.field3661.method1606(0), (byte) -96);
                    class118.field1914.method639(class210.field3266.method1606(0), (byte) -118);
                    class118.field1914.method639(class33.field496.method1606(0), (byte) -109);
                    class118.field1914.method639(class223.field3422.method1606(0), (byte) -98);
                    class118.field1914.method639(class109.field1797.method1606(0), (byte) -101);
                    class118.field1914.method639(class253.field4062.method1606(0), (byte) -108);
                    class118.field1914.method639(class205.field3204.method1606(0), (byte) -112);
                    class118.field1914.method639(class99.field1662.method1606(0), (byte) -118);
                    class118.field1914.method639(class4.field22.method1606(0), (byte) -124);
                    class118.field1914.method639(class118.field1918.method1606(0), (byte) -125);
                    class118.field1914.method639(class218.field3371.method1606(0), (byte) -104);
                    class118.field1914.method639(class109.field1784.method1606(0), (byte) -119);
                    class118.field1914.method639(class168.field2626.method1606(0), (byte) -103);
                    class118.field1914.method639(class17.field254.method1606(0), (byte) -110);
                    class118.field1914.method669(0, client.field2435.field1471, client.field2435.field1535, -1);
                    class249.field4022.method897(class118.field1914.field1535, class118.field1914.field1471, 0, 5000);
                    client.field2435.method533(104, var5);
                    for (int var6 = 0; var6 < 4; ++var6) {
                        var5[var6] += 50;
                    }
                    class236.field3814.method533(104, var5);
                    class235.field3794 = 4;
                }
                if (class235.field3794 == 4) {
                    if (class249.field4022.method898(37) < 1) {
                        return;
                    }
                    int var7 = class249.field4022.method906(-89);
                    if (var7 == 21) {
                        class235.field3794 = 7;
                    } else if (~var7 != -30) {
                        if (var7 == 1) {
                            class235.field3794 = 5;
                            class217.field3353 = var7;
                            return;
                        }
                        if (~var7 != -3) {
                            if (var7 == 15) {
                                class235.field3794 = 0;
                                class217.field3353 = var7;
                                return;
                            }
                            if (var7 == 23 && ~class167.field2619 > -2) {
                                class235.field3794 = 1;
                                class259.field4145 = 0;
                                ++class167.field2619;
                                class249.field4022.method899((byte) 123);
                                class249.field4022 = null;
                                return;
                            }
                            class217.field3353 = var7;
                            class235.field3794 = 0;
                            class249.field4022.method899((byte) -14);
                            class249.field4022 = null;
                            return;
                        }
                        class235.field3794 = 8;
                    } else {
                        class235.field3794 = 10;
                    }
                }
                if (class235.field3794 == 6) {
                    client.field2435.field1535 = 0;
                    client.field2435.method536((byte) -104, 17);
                    class249.field4022.method897(client.field2435.field1535, client.field2435.field1471, 0, 5000);
                    class235.field3794 = 4;
                } else if (arg0 < -104) {
                    if (class235.field3794 == 7) {
                        if (~class249.field4022.method898(37) <= -2) {
                            class245.field3988 = 60 * (3 + class249.field4022.method906(-112));
                            class217.field3353 = 21;
                            class235.field3794 = 0;
                            class249.field4022.method899((byte) 20);
                            class249.field4022 = null;
                        }
                    } else if (~class235.field3794 == -11) {
                        if (class249.field4022.method898(37) >= 1) {
                            class5.field57 = class249.field4022.method906(-59);
                            class235.field3794 = 0;
                            class217.field3353 = 29;
                            class249.field4022.method899((byte) 117);
                            class249.field4022 = null;
                        }
                    } else {
                        if (~class235.field3794 == -9) {
                            if (~class249.field4022.method898(37) > -15) {
                                return;
                            }
                            class249.field4022.method907((byte) 123, 14, class236.field3814.field1471, 0);
                            class236.field3814.field1535 = 0;
                            class140.field2141 = class236.field3814.method633(58);
                            class261.field4166 = class236.field3814.method633(67);
                            class230.field3658 = ~class236.field3814.method633(115) == -2;
                            class115.field1878 = ~class236.field3814.method633(48) == -2;
                            class194.field3069 = class236.field3814.method633(50) == 1;
                            class179.field2794 = class236.field3814.method633(115) == 1;
                            class292.field4600 = ~class236.field3814.method633(90) == -2;
                            class116.field1897 = class236.field3814.method645(11596);
                            class83.field1398 = class236.field3814.method633(78) == 1;
                            class43.field616 = ~class236.field3814.method633(63) == -2;
                            class274.method1842(27841, class43.field616);
                            class176.method1192((byte) 111, class43.field616);
                            if (!class95.field1613) {
                                if ((!class230.field3658 || class194.field3069) && !class83.field1398) {
                                    try {
                                        class215.method1453(class179.field2788.field479, 113, "unzap");
                                    } catch (Throwable var9) {
                                    }
                                } else {
                                    try {
                                        class215.method1453(class179.field2788.field479, 126, "zap");
                                    } catch (Throwable var10) {
                                    }
                                }
                            }
                            try {
                                class215.method1453(class179.field2788.field479, 107, "loggedin");
                            } catch (Throwable var8) {
                            }
                            class66.field1105 = class236.field3814.method542((byte) -82);
                            class53.field804 = class236.field3814.method645(11596);
                            class235.field3794 = 9;
                        }
                        if (class235.field3794 == 9) {
                            if (class249.field4022.method898(37) >= class53.field804) {
                                class236.field3814.field1535 = 0;
                                class249.field4022.method907((byte) 113, class53.field804, class236.field3814.field1471, 0);
                                class217.field3353 = 2;
                                class235.field3794 = 0;
                                class152.method1023(-21988);
                                class219.field3376 = -1;
                                class39.method283(25, false);
                                class66.field1105 = -1;
                            }
                        }
                    }
                }
            } catch (IOException var11) {
                if (class249.field4022 != null) {
                    class249.field4022.method899((byte) -57);
                    class249.field4022 = null;
                }
                if (~class167.field2619 > -2) {
                    class235.field3794 = 1;
                    ++class167.field2619;
                    class259.field4145 = 0;
                    if (class88.field1539 == class177.field2773) {
                        class177.field2773 = class184.field2845;
                    } else {
                        class177.field2773 = class88.field1539;
                    }
                } else {
                    class235.field3794 = 0;
                    class217.field3353 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZII)I")
    public static final int method894(boolean arg0, int arg1, int arg2) {
        ++field2023;
        if (arg0) {
            field2025 = null;
        }
        int var3 = arg1 - -(arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 - -789221) * var4 + 1376312589;
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(III)V")
    private final void method895(int arg0, int arg1, int arg2) {
        if (arg2 == 8994) {
            ++field2027;
            int var4 = class190.field2946[arg0];
            int var5 = class103.field1713[arg1];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class238.field3863 = arg0;
                class198.field3122 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class238.field3863 = arg1;
                class198.field3122 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class238.field3863 = -arg1 + class240.field3896;
                class198.field3122 = arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class238.field3863 = arg0;
                class198.field3122 = -arg1 + class79.field1328;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class198.field3122 = class79.field1328 - arg1;
                class238.field3863 = -arg0 + class240.field3896;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class238.field3863 = class240.field3896 - arg1;
                class198.field3122 = -arg0 + class79.field1328;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class198.field3122 = class79.field1328 - arg0;
                class238.field3863 = arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class238.field3863 = -arg0 + class240.field3896;
                class198.field3122 = arg1;
            }
            class238.field3863 &= class189.field2929;
            class198.field3122 &= class53.field811;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/util/Random;Z)I")
    public static final int method896(int arg0, Random arg1, boolean arg2) {
        ++field2030;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class41.method304(arg0, (byte) 32)) {
            return (int) ((4294967295L & (long) arg1.nextInt()) * (long) arg0 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
            if (arg2) {
                return 104;
            } else {
                int var4;
                do {
                    var4 = arg1.nextInt();
                } while (var4 >= var3);
                return class50.method372(var4, arg0, false);
            }
        }
    }
}
