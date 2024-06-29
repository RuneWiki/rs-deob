import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lqb;")
    private class97 field1195 = new class97();

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lke;")
    public static class65 field1198 = class1.method17("Entfernen", -128);

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lke;")
    public static class65 field1210 = class1.method17("Freund hinzuf-Ugen", -125);

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[I")
    public static int[] field1211 = new int[2048];

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lke;")
    public static class65 field1207 = class1.method17("Ein", -118);

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[I")
    public static int[] field1204 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lke;")
    private static class65 field1208 = class1.method17("Malformed login packet)3", -125);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1215 = 0;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lke;")
    public static class65 field1209 = class1.method17("redstone2", -113);

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lke;")
    public static class65 field1212 = field1208;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[[I")
    public static int[][] field1216 = new int[104][104];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lqd;")
    public static class100 field1200 = new class100(10);

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Lke;")
    private static class65 field1219 = class1.method17("Create a free account", -119);

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lke;")
    public static class65 field1217 = field1219;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Ljava/lang/Object;")
    public static Object field1218 = new Object();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Luc;")
    public static class119 field1192;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lpa;")
    public static class90 field1206;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field1193;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lqb;", line = 4)
    public final class97 method389(byte arg0) {
        field1196++;
        if (arg0 == 36) {
            class97 var2 = this.field1195.field2510;
            return this.field1195 == var2 ? null : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 44)
    public static void method390(byte arg0) {
        field1209 = null;
        if (arg0 != 49) {
            return;
        }
        field1211 = null;
        field1192 = null;
        field1216 = null;
        field1218 = null;
        field1206 = null;
        field1198 = null;
        field1200 = null;
        field1219 = null;
        field1212 = null;
        field1208 = null;
        field1210 = null;
        field1193 = null;
        field1207 = null;
        field1217 = null;
        field1204 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 840)
    public class46() {
        this.field1195.field2510 = this.field1195;
        this.field1195.field2515 = this.field1195;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BILge;)V", line = 93)
    public static final void method391(byte arg0, int arg1, class41 arg2) {
        if (arg0 != 21) {
            field1210 = null;
        }
        field1201++;
        if (arg2.field1067 < 128 || arg2.field1070 < 128 || arg2.field1067 >= 13184 || arg2.field1070 >= 13184) {
            arg2.field1075 = -1;
            arg2.field1071 = 0;
            arg2.field1072 = -1;
            arg2.field1123 = 0;
            arg2.field1067 = arg2.field1105[0] * 128 + arg2.field1069 * 64;
            arg2.field1070 = arg2.field1097[0] * 128 + arg2.field1069 * 64;
            arg2.method368(arg0 + 83);
        }
        if (class32.field833 == arg2 && (arg2.field1067 < 1536 || arg2.field1070 < 1536 || arg2.field1067 >= 11776 || arg2.field1070 >= 11776)) {
            arg2.field1071 = 0;
            arg2.field1123 = 0;
            arg2.field1075 = -1;
            arg2.field1072 = -1;
            arg2.field1067 = arg2.field1105[0] * 128 + arg2.field1069 * 64;
            arg2.field1070 = arg2.field1097[0] * 128 + arg2.field1069 * 64;
            arg2.method368(104);
        }
        if (class76.field2028 < arg2.field1071) {
            class13.method74(arg2, (byte) -106);
        } else if (arg2.field1123 >= class76.field2028) {
            class128.method1012(true, arg2);
        } else {
            class23.method187(-256, arg2);
        }
        class100.method835(arg2, arg0 - 120);
        class27.method225(arg2, 104);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 160)
    public static final void method392(int arg0) {
        if (class126.field3057 > 1) {
            class126.field3057--;
        }
        field1202++;
        if (class21.field512 > 0) {
            class21.field512--;
        }
        if (class53.field1359) {
            class53.field1359 = false;
            class123.method978((byte) 68);
            return;
        }
        for (int var1 = 0; var1 < 100 && class20.method165((byte) -120); var1++) {
        }
        if (class19.field456 != 30 && class19.field456 != 35) {
            return;
        }
        if (class117.field2928 && class19.field456 == 30) {
            class10.field216 = 0;
            field1215 = 0;
            while (class117.method952(127)) {
            }
            for (int var2 = 0; var2 < class75.field2024.length; var2++) {
                class75.field2024[var2] = false;
            }
        }
        class28.method237(class56.field1453, 24, 40);
        Object var3 = class13.field264.field517;
        synchronized (class13.field264.field517) {
            if (!class113.field2811) {
                class13.field264.field520 = 0;
            } else if (field1215 != 0 || class13.field264.field520 >= 40) {
                class56.field1453.method642(249, false);
                class55.field1432++;
                class56.field1453.method305(false, 0);
                int var4 = class56.field1453.field998;
                int var5 = 0;
                for (int var6 = 0; class13.field264.field520 > var6 && class56.field1453.field998 - var4 < 240; var6++) {
                    int var7 = class13.field264.field519[var6];
                    int var8 = class13.field264.field518[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    var5++;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var9 = var8 * 765 + var7;
                    if (class13.field264.field518[var6] == -1 && class13.field264.field519[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (class47.field1243 != var7 || class26.field637 != var8) {
                        int var10 = var7 - class47.field1243;
                        class47.field1243 = var7;
                        int var11 = var8 - class26.field637;
                        class26.field637 = var8;
                        if (class66.field1758 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class56.field1453.method310((byte) 80, (class66.field1758 << 12) + (var10 << 6) + var11);
                            class66.field1758 = 0;
                        } else if (class66.field1758 < 8) {
                            class56.field1453.method299((class66.field1758 << 19) + var9 + 8388608, 29520);
                            class66.field1758 = 0;
                        } else {
                            class56.field1453.method351((class66.field1758 << 19) + var9 - 1073741824, arg0 + 55);
                            class66.field1758 = 0;
                        }
                    } else if (class66.field1758 < 2047) {
                        class66.field1758++;
                    }
                }
                class56.field1453.method319(class56.field1453.field998 - var4, -1332453464);
                if (var5 < class13.field264.field520) {
                    class13.field264.field520 -= var5;
                    for (int var12 = 0; var12 < class13.field264.field520; var12++) {
                        class13.field264.field519[var12] = class13.field264.field519[var12 + var5];
                        class13.field264.field518[var12] = class13.field264.field518[var5 + var12];
                    }
                } else {
                    class13.field264.field520 = 0;
                }
            }
        }
        if (field1215 != 0) {
            class73.field1949++;
            int var13 = class115.field2901;
            long var14 = (class55.field1418 - class23.field559) / 50L;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 502) {
                var13 = 502;
            }
            int var16 = class1.field42;
            class23.field559 = class55.field1418;
            byte var17 = 0;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var18 = var13 * 765 + var16;
            if (field1215 == 2) {
                var17 = 1;
            }
            int var19 = (int) var14;
            class56.field1453.method642(86, false);
            class56.field1453.method351((var19 << 20) + (var17 << 19) + var18, 62);
        }
        if (class52.field1330 > 0) {
            class52.field1330--;
        }
        if (class75.field2024[96] || class75.field2024[97] || class75.field2024[98] || class75.field2024[99]) {
            class79.field2107 = true;
        }
        if (class79.field2107 && class52.field1330 <= 0) {
            class52.field1330 = 20;
            class79.field2107 = false;
            class56.field1453.method642(125, false);
            class54.field1375++;
            class56.field1453.method302(class125.field3031, arg0 + 128);
            class56.field1453.method321(class128.field3098, (byte) 117);
        }
        if (class101.field2632 && !class65.field1713) {
            class1.field28++;
            class65.field1713 = true;
            class56.field1453.method642(5, false);
            class56.field1453.method305(false, 1);
        }
        if (!class101.field2632 && class65.field1713) {
            class1.field28++;
            class65.field1713 = false;
            class56.field1453.method642(5, false);
            class56.field1453.method305(false, 0);
        }
        class13.method77((byte) 55);
        if (class19.field456 != 30 && class19.field456 != 35) {
            return;
        }
        class60.method506(102);
        class56.method453(true);
        class13.field277++;
        if (class13.field277 > 750) {
            class123.method978((byte) 96);
            return;
        }
        class27.method219((byte) -123);
        class1.method3(false);
        class6.method41(66);
        if (class83.field2191 != 0) {
            class114.field2877++;
            if (class114.field2877 >= 15) {
                if (class83.field2191 == 2) {
                    class116.field2910 = true;
                }
                if (class83.field2191 == 3) {
                    class39.field996 = true;
                }
                class83.field2191 = 0;
            }
        }
        class22.field524++;
        if (class51.field1294 != 0) {
            class60.field1618 += 20;
            if (class60.field1618 >= 400) {
                class51.field1294 = 0;
            }
        }
        if (class80.field2128 != 0) {
            if (class64.field1673 + 5 < class91.field2418 || class91.field2418 < class64.field1673 - 5 || class52.field1320 > class51.field1315 + 5 || class51.field1315 - 5 > class52.field1320) {
                class74.field1963 = true;
            }
            class88.field2353++;
            if (class10.field216 == 0) {
                if (class80.field2128 == 2) {
                    class116.field2910 = true;
                }
                if (class80.field2128 == 3) {
                    class39.field996 = true;
                }
                class80.field2128 = 0;
                if (class74.field1963 && class88.field2353 >= 5) {
                    class126.field3060 = -1;
                    class84.method758(arg0 - 65);
                    if (class92.field2439 == class126.field3060 && class93.field2465 != class115.field2883) {
                        class27 var20 = class110.method903(class92.field2439, -119);
                        class44.field1150++;
                        byte var21 = 0;
                        if (class33.field858 == 1 && var20.field705 == 206) {
                            var21 = 1;
                        }
                        if (var20.field676[class115.field2883] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field672) {
                            int var24 = class93.field2465;
                            int var25 = class115.field2883;
                            var20.field676[var25] = var20.field676[var24];
                            var20.field700[var25] = var20.field700[var24];
                            var20.field676[var24] = -1;
                            var20.field700[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class93.field2465;
                            int var23 = class115.field2883;
                            while (var22 != var23) {
                                if (var22 > var23) {
                                    var20.method229(var22 - 1, 31327, var22);
                                    var22--;
                                } else if (var23 > var22) {
                                    var20.method229(var22 + 1, 31327, var22);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method229(class115.field2883, 31327, class93.field2465);
                        }
                        class56.field1453.method642(222, false);
                        class56.field1453.method305(false, var21);
                        class56.field1453.method351(class92.field2439, -92);
                        class56.field1453.method321(class115.field2883, (byte) 110);
                        class56.field1453.method302(class93.field2465, 128);
                    }
                } else if ((class110.field2725 == 1 || class31.method249(1553, class125.field3040 - 1)) && class125.field3040 > 2) {
                    class112.method919((byte) 79);
                } else if (class125.field3040 > 0) {
                    class128.method1013(class125.field3040 - 1, arg0 ^ 0x194D);
                }
                class114.field2877 = 10;
                field1215 = 0;
            }
        }
        if (class71.field1862 != -1) {
            int var26 = class71.field1862;
            int var27 = class71.field1845;
            boolean var28 = class24.method196(0, 0, 0, var27, 0, 0, (byte) -104, class32.field833.field1105[0], var26, true, 0, class32.field833.field1097[0]);
            if (var28) {
                class66.field1773 = class1.field42;
                class60.field1618 = 0;
                class51.field1294 = 1;
                class130.field3135 = class115.field2901;
            }
            class71.field1862 = -1;
        }
        if (field1215 == 1 && class73.field1933 != null) {
            class73.field1933 = null;
            field1215 = 0;
            class39.field996 = true;
        }
        class24.method194(arg0 + 1);
        if (class10.field213 == -1) {
            class74.method659(-57);
            class86.method767((byte) 120);
            class7.method51(-3112);
        }
        if (~class114.field2854 == arg0 && class92.field2434 == -1 && class41.field1048 == -1) {
            if (class77.field2054 > 0) {
                class77.field2054--;
            }
        } else if (class64.field1693 > class77.field2054) {
            class77.field2054++;
            if (class77.field2054 == class64.field1693) {
                if (class114.field2854 != -1) {
                    class39.field996 = true;
                }
                if (class92.field2434 != -1) {
                    class116.field2910 = true;
                }
            }
        }
        if (class10.field216 == 1 || field1215 == 1) {
            class26.field649++;
        }
        class54.method430(7735);
        if (class101.field2625) {
            class99.method829(arg0 ^ 0x475F);
        }
        for (int var29 = 0; var29 < 5; var29++) {
            int var10002 = class6.field110[var29]++;
        }
        class75.method665((byte) 119);
        int var30 = class32.method256(14977);
        int var31 = class131.method1021(-120);
        if (var30 > 4500 && var31 > 4500) {
            class21.field512 = 250;
            class78.method689(4000, 111);
            class56.field1453.method642(183, false);
            class24.field602++;
        }
        class66.field1766++;
        class12.field251++;
        if (class12.field251 > 500) {
            class12.field251 = 0;
            int var32 = (int) (Math.random() * 8.0D);
            if ((var32 & 0x1) == 1) {
                field1203 += class87.field2324;
            }
            if ((var32 & 0x4) == 4) {
                class75.field2018 += class19.field412;
            }
            if ((var32 & 0x2) == 2) {
                class10.field168 += class24.field584;
            }
        }
        if (class75.field2018 < -40) {
            class19.field412 = 1;
        }
        class76.field2040++;
        if (class10.field168 < -55) {
            class24.field584 = 2;
        }
        if (class10.field168 > 55) {
            class24.field584 = -2;
        }
        if (class66.field1766 > 500) {
            class66.field1766 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class112.field2793 += class52.field1326;
            }
            if ((var33 & 0x2) == 2) {
                class74.field1991 += class116.field2920;
            }
        }
        if (class75.field2018 > 40) {
            class19.field412 = -1;
        }
        if (class112.field2793 < -60) {
            class52.field1326 = 2;
        }
        if (class74.field1991 < -20) {
            class116.field2920 = 1;
        }
        if (class74.field1991 > 10) {
            class116.field2920 = -1;
        }
        if (field1203 < -50) {
            class87.field2324 = 2;
        }
        if (class112.field2793 > 60) {
            class52.field1326 = -2;
        }
        if (field1203 > 50) {
            class87.field2324 = -2;
        }
        if (class76.field2040 > 50) {
            class9.field161++;
            class56.field1453.method642(217, false);
        }
        try {
            if (class98.field2541 != null && class56.field1453.field998 > 0) {
                class98.field2541.method82(class56.field1453.field998, arg0 ^ 0x2C, 0, class56.field1453.field994);
                class76.field2040 = 0;
                class56.field1453.field998 = 0;
            }
        } catch (IOException var34) {
            class123.method978((byte) 84);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 735)
    public static final void method393(int arg0) {
        if (arg0 != 32584) {
            method391((byte) 50, -83, null);
        }
        field1197++;
        if (class93.field2464 == null) {
            return;
        }
        if (class35.field890 >= 0) {
            if (class12.field246 > 0) {
                class56.field1462 += class110.field2722;
                class93.field2464.method86(0, class35.field890, class56.field1462);
                class12.field246--;
                if (class12.field246 == 0) {
                    class93.field2464.method90((byte) 59);
                    class12.field246 = 20;
                    class35.field890 = -1;
                }
            }
        } else if (class12.field246 > 0) {
            class12.field246--;
            if (class12.field246 == 0) {
                if (class58.field1593 == null) {
                    class93.field2464.method88(256, (byte) -62);
                } else {
                    class93.field2464.method88(class23.field572, (byte) -111);
                    class35.field890 = class23.field572;
                    class93.field2464.method89((byte) -96, class125.field3047, class23.field572, class58.field1593);
                    class58.field1593 = null;
                }
                class56.field1462 = 0;
            }
        }
        class93.field2464.method87((byte) -56);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLqb;)V", line = 809)
    public final void method394(byte arg0, class97 arg1) {
        field1191++;
        if (arg1.field2515 != null) {
            arg1.method817((byte) -112);
        }
        arg1.field2515 = this.field1195;
        if (arg0 < -109) {
            arg1.field2510 = this.field1195.field2510;
            arg1.field2515.field2510 = arg1;
            arg1.field2510.field2515 = arg1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Lqb;", line = 860)
    public final class97 method395(int arg0) {
        if (arg0 != 29038) {
            this.method389((byte) -33);
        }
        field1214++;
        class97 var2 = this.field1195.field2510;
        if (this.field1195 == var2) {
            return null;
        } else {
            var2.method817((byte) -111);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BLqb;)V", line = 877)
    public final void method396(byte arg0, class97 arg1) {
        if (arg1.field2515 != null) {
            arg1.method817((byte) 106);
        }
        arg1.field2515 = this.field1195.field2515;
        arg1.field2510 = this.field1195;
        if (arg0 != -70) {
            this.method395(-98);
        }
        arg1.field2515.field2510 = arg1;
        field1194++;
        arg1.field2510.field2515 = arg1;
    }
}
