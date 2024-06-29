import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class26 {

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public int field644 = 0;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field650 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lec;")
    public static class27 field629 = new class27();

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lke;")
    public static class65 field638 = class1.method17("Handel akzeptieren", -124);

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Z")
    public static boolean field640 = false;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public static int[] field636 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field649 = 0;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lke;")
    private static class65 field647 = class1.method17("Username: ", -126);

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lke;")
    private static class65 field653 = class1.method17("Moderator option: Mute player for 48 hours: <ON>", -120);

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lke;")
    public static class65 field635 = field653;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Lke;")
    public static class65 field654 = field647;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lta;")
    public static class112 field645;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lae;")
    public class6 field631;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lae;")
    public class6 field646;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 16)
    public static void method215(boolean arg0) {
        field653 = null;
        field654 = null;
        if (arg0) {
            method216(31, 102L);
        }
        field645 = null;
        field647 = null;
        field636 = null;
        field629 = null;
        field635 = null;
        field638 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Lke;", line = 56)
    public static final class65 method216(int arg0, long arg1) {
        field641++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class54.field1383[(int) (var8 - arg1 * 37L)];
            }
            if (arg0 == 16972) {
                class65 var7 = new class65();
                var7.field1702 = var6;
                var7.field1733 = var6.length;
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 121)
    public static final void method217(byte arg0) {
        field648++;
        class12.field252 = 0;
        int var1 = -59 % ((arg0 + 67) / 51);
        for (int var2 = -1; var2 < class72.field1895 + class113.field2818; var2++) {
            class41 var19;
            if (var2 == -1) {
                var19 = class32.field833;
            } else if (var2 >= class72.field1895) {
                var19 = class31.field817[class56.field1464[var2 - class72.field1895]];
            } else {
                var19 = class52.field1324[class10.field187[var2]];
            }
            if (var19 != null && var19.method363(0)) {
                if (var19 instanceof class129) {
                    class55 var20 = ((class129) var19).field3126;
                    if (var20.field1403 != null) {
                        var20 = var20.method443(0);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= class72.field1895) {
                    class55 var21 = ((class129) var19).field3126;
                    if (var21.field1411 >= 0 && var21.field1411 < class47.field1231.length) {
                        class131.method1023(var19, (byte) 65, var19.field1083 + 15);
                        if (class84.field2224 > -1) {
                            class47.field1231[var21.field1411].method507(class84.field2224 - 12, class9.field162 + -30);
                        }
                    }
                    if (class10.field193 == 1 && class56.field1464[var2 - class72.field1895] == class57.field1522 && class76.field2028 % 20 < 10) {
                        class131.method1023(var19, (byte) 31, var19.field1083 + 15);
                        if (class84.field2224 > -1) {
                            class88.field2352[0].method507(class84.field2224 - 12, class9.field162 + -28);
                        }
                    }
                } else {
                    class114 var22 = (class114) var19;
                    int var23 = 30;
                    if (var22.field2857 != -1 || var22.field2838 != -1) {
                        class131.method1023(var19, (byte) -96, var19.field1083 + 15);
                        if (class84.field2224 > -1) {
                            if (var22.field2857 != -1) {
                                class33.field866[var22.field2857].method507(class84.field2224 - 12, -var23 + class9.field162);
                                var23 += 25;
                            }
                            if (var22.field2838 != -1) {
                                class47.field1231[var22.field2838].method507(class84.field2224 - 12, -var23 + class9.field162);
                                var23 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && class10.field193 == 10 && class10.field187[var2] == class94.field2499) {
                        class131.method1023(var19, (byte) -112, var19.field1083 + 15);
                        if (class84.field2224 > -1) {
                            class88.field2352[1].method507(class84.field2224 - 12, -var23 + class9.field162);
                        }
                    }
                }
                if (var19.field1112 != null && (class72.field1895 <= var2 || class6.field108 == 0 || class6.field108 == 3 || class6.field108 == 1 && class41.method365(127, ((class114) var19).field2866))) {
                    class131.method1023(var19, (byte) 30, var19.field1083);
                    if (class84.field2224 > -1 && class93.field2444 > class12.field252) {
                        class93.field2457[class12.field252] = class27.field660.method116(var19.field1112) / 2;
                        class93.field2441[class12.field252] = class27.field660.field333;
                        class93.field2466[class12.field252] = class84.field2224;
                        class93.field2449[class12.field252] = class9.field162;
                        class93.field2459[class12.field252] = var19.field1086;
                        class93.field2467[class12.field252] = var19.field1085;
                        class93.field2452[class12.field252] = var19.field1098;
                        class93.field2471[class12.field252] = var19.field1112;
                        class12.field252++;
                    }
                }
                if (var19.field1122 > class76.field2028) {
                    class131.method1023(var19, (byte) -106, var19.field1083 + 15);
                    if (class84.field2224 > -1) {
                        int var24 = var19.field1057 * 30 / var19.field1117;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class108.method886(class84.field2224 - 15, class9.field162 + -3, var24, 5, 65280);
                        class108.method886(class84.field2224 + var24 - 15, class9.field162 + -3, 30 - var24, 5, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var19.field1089[var25] > class76.field2028) {
                        class131.method1023(var19, (byte) 34, var19.field1083 / 2);
                        if (class84.field2224 > -1) {
                            if (var25 == 1) {
                                class9.field162 -= 20;
                            }
                            if (var25 == 2) {
                                class9.field162 -= 10;
                                class84.field2224 -= 15;
                            }
                            if (var25 == 3) {
                                class9.field162 -= 10;
                                class84.field2224 += 15;
                            }
                            class101.field2638[var19.field1078[var25]].method507(class84.field2224 - 12, class9.field162 + -12);
                            class116.field2922.method119(class39.method320(var19.field1090[var25], (byte) -36), class84.field2224, class9.field162 + 4, 0);
                            class116.field2922.method119(class39.method320(var19.field1090[var25], (byte) -36), class84.field2224 - 1, class9.field162 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class12.field252; var3++) {
            int var4 = class93.field2466[var3];
            int var5 = class93.field2449[var3];
            boolean var6 = true;
            int var7 = class93.field2441[var3];
            int var8 = class93.field2457[var3];
            while (var6) {
                var6 = false;
                for (int var18 = 0; var18 < var3; var18++) {
                    if (class93.field2449[var18] - class93.field2441[var18] < var5 + 2 && var5 - var7 < class93.field2449[var18] + 2 && class93.field2466[var18] + class93.field2457[var18] > var4 - var8 && class93.field2466[var18] - class93.field2457[var18] < var4 + var8 && var5 > class93.field2449[var18] - class93.field2441[var18]) {
                        var6 = true;
                        var5 = class93.field2449[var18] - class93.field2441[var18];
                    }
                }
            }
            class84.field2224 = class93.field2466[var3];
            class9.field162 = class93.field2449[var3] = var5;
            class65 var9 = class93.field2471[var3];
            if (class80.field2130 == 0) {
                int var10 = 16776960;
                if (class93.field2459[var3] < 6) {
                    var10 = class99.field2567[class93.field2459[var3]];
                }
                if (class93.field2459[var3] == 6) {
                    var10 = class112.field2775 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class93.field2459[var3] == 7) {
                    var10 = class112.field2775 % 20 >= 10 ? 65535 : 255;
                }
                if (class93.field2459[var3] == 8) {
                    var10 = class112.field2775 % 20 < 10 ? 45056 : 8454016;
                }
                if (class93.field2459[var3] == 9) {
                    int var11 = 150 - class93.field2452[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (class93.field2459[var3] == 10) {
                    int var12 = 150 - class93.field2452[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16384000 + 16711935 - var12 * 327680;
                    } else if (var12 < 150) {
                        var10 = var12 * 327680 - (var12 - 100) * 5 - 32767745;
                    }
                }
                if (class93.field2459[var3] == 11) {
                    int var13 = 150 - class93.field2452[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (class93.field2467[var3] == 0) {
                    class27.field660.method119(var9, class84.field2224, class9.field162 + 1, 0);
                    class27.field660.method119(var9, class84.field2224, class9.field162, var10);
                }
                if (class93.field2467[var3] == 1) {
                    class27.field660.method107(var9, class84.field2224, class9.field162 + 1, 0, class112.field2775);
                    class27.field660.method107(var9, class84.field2224, class9.field162, var10, class112.field2775);
                }
                if (class93.field2467[var3] == 2) {
                    class27.field660.method117(var9, class84.field2224, class9.field162 + 1, 0, class112.field2775);
                    class27.field660.method117(var9, class84.field2224, class9.field162, var10, class112.field2775);
                }
                if (class93.field2467[var3] == 3) {
                    class27.field660.method118(var9, class84.field2224, class9.field162 + 1, 0, class112.field2775, 150 - class93.field2452[var3]);
                    class27.field660.method118(var9, class84.field2224, class9.field162, var10, class112.field2775, 150 - class93.field2452[var3]);
                }
                if (class93.field2467[var3] == 4) {
                    int var14 = class27.field660.method116(var9);
                    int var15 = (var14 + 100) * (150 - class93.field2452[var3]) / 150;
                    class108.method887(class84.field2224 - 50, 0, class84.field2224 + 50, 334);
                    class27.field660.method109(var9, class84.field2224 + 50 - var15, class9.field162 + 1, 0);
                    class27.field660.method109(var9, class84.field2224 + 50 - var15, class9.field162, var10);
                    class108.method882();
                }
                if (class93.field2467[var3] == 5) {
                    int var16 = 150 - class93.field2452[var3];
                    class108.method887(0, class9.field162 - class27.field660.field333 - 1, 512, class9.field162 + 5);
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class27.field660.method119(var9, class84.field2224, class9.field162 + var17 + 1, 0);
                    class27.field660.method119(var9, class84.field2224, class9.field162 + var17, var10);
                    class108.method882();
                }
            } else {
                class27.field660.method119(var9, class84.field2224, class9.field162 + 1, 0);
                class27.field660.method119(var9, class84.field2224, class9.field162, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILkb;BI)V", line = 505)
    public static final void method218(int arg0, class61 arg1, byte arg2, int arg3) {
        field651++;
        int var4 = arg0 * arg0 + arg3 * arg3;
        if (arg2 != -45) {
            field649 = 57;
        }
        if (var4 <= 4225 || var4 >= 90000) {
            class87.method775(arg0, -1, arg1, arg3);
            return;
        }
        int var5 = class125.field3031 + class112.field2793 & 0x7FF;
        int var6 = class37.field932[var5];
        int var7 = class37.field943[var5];
        int var8 = var6 * 256 / (class74.field1991 + 256);
        int var9 = var7 * 256 / (class74.field1991 + 256);
        int var10 = arg3 * var9 - arg0 * var8 >> 16;
        int var11 = arg0 * var9 + arg3 * var8 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class41.field1093.method516(var14 + 94 - 6, 63 - var15, 20, 20, 15, 15, var12, 256);
    }
}
