import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class51 {

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Ldf;")
    private class146 field897 = new class146(256);

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Ldf;")
    private class146 field898 = new class146(256);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lff;")
    private class3 field884;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lff;")
    private class3 field888;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
    public static boolean field886 = false;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lmb;")
    public static class96 field896 = class243.method1708(" )2>", (byte) 96);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Luc;")
    public static class11 field883 = new class11(500);

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "J")
    public static long field881;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        field883 = null;
        if (arg0 < 1) {
            field886 = false;
        }
        field896 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public static final void method385(int arg0, int arg1, int arg2) {
        if (class273.field4744 > 0) {
            class24.method169(arg2 - 1879052367, class273.field4744);
            class273.field4744 = 0;
        }
        short var3 = 256;
        if (arg2 != 1879052287) {
            method385(15, -64, 112);
        }
        field895++;
        int var4 = 0;
        int var5 = class84.field1429 * arg0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class222.field3796[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class27.field454[var4++];
                int var12 = class84.field1427[var5++ + arg1];
                if (var11 == 0) {
                    class93.field1534.field3026[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - (var11 + 18);
                    int var15 = class107.field1927[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class93.field1534.field3026[var6++] = class130.method985(class130.method985(16711935, var15) * var13 + (class130.method985(var12, 16711935) * var14), -16711936) + class130.method985(var13 * class130.method985(var15, 65280) + (var14 * class130.method985(var12, 65280)), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class93.field1534.field3026[var6++] = class84.field1427[var5++ + arg1];
            }
            var5 += class84.field1429 - 128;
        }
        class93.field1534.method1048(arg1, arg0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIII)V")
    public static final void method386(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field892++;
        if (class100.field1690 < 100) {
            client.method823(1);
        }
        class84.method593(arg3, arg2, arg3 + arg1, arg2 + arg4);
        if (class100.field1690 < 100) {
            byte var5 = 20;
            int var6 = arg3 + (arg1 / 2);
            int var7 = arg4 / 2 + arg2 - var5 - 18;
            class84.method598(arg3, arg2, arg1, arg4, 0);
            class84.method607(var6 - 152, var7, 304, 34, 9179409);
            class84.method607(var6 - 151, var7 + 1, 302, 32, 0);
            class84.method598(var6 - 150, var7 + 2, class100.field1690 * 3, 30, 9179409);
            class84.method598(class100.field1690 * 3 + var6 - 150, var7 + 2, 300 - (class100.field1690 * 3), 30, 0);
            class71.field1216.method117(class24.field417, var6, var5 + var7, 16777215, -1);
            return;
        }
        class32.field502 = (int) ((float) (arg4 * 2) / class121.field2232);
        class78.field1326 = (int) ((float) (arg1 * 2) / class121.field2232);
        class235.field4026 = class200.field3481 - (int) ((float) arg4 / class121.field2232);
        int var8 = class137.field2456 - ((int) ((float) arg1 / class121.field2232));
        class89.field1483 = class137.field2456 - (int) ((float) arg1 / class121.field2232);
        int var9 = (int) ((float) arg1 / class121.field2232) + class137.field2456;
        int var10 = class200.field3481 - ((int) ((float) arg4 / class121.field2232));
        int var11 = (int) ((float) arg4 / class121.field2232) + class200.field3481;
        if (arg0) {
            return;
        }
        class231.method1575(var8, !arg0, arg2 + arg4, var11, var10, arg1 + arg3, arg3, var9, arg2);
        class116.method913(var11, arg3 + arg1, arg2, arg2 + arg4, arg0, arg3, var10, var8, var9);
        class39.method309(var11, arg1 + arg3, arg3, var8, (byte) -128, arg2 + arg4, arg2, var10, var9);
        if (class248.field4297 > 0) {
            class248.field4297--;
        }
        if (!class56.field979) {
            return;
        }
        int var12 = arg3 + arg1 - 5;
        int var13 = arg2 + arg4 - 8;
        class244.field4235.method132(class36.method289(-5615, new class96[] { class106.field1793, class31.method205(class53.field925, (byte) -78) }), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class244.field4235.method132(class36.method289(-5615, new class96[] { class139.field2499, class31.method205(var16, (byte) -78), class127.field2328 }), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([IIB)Lvh;")
    public final class131 method387(int[] arg0, int arg1, byte arg2) {
        field882++;
        if (this.field884.method40((byte) 123) == 1) {
            return this.method388((byte) 110, arg0, 0, arg1);
        }
        int var4 = 45 % ((-arg2 - 12) / 40);
        if (this.field884.method37(arg1, (byte) -91) != 1) {
            throw new RuntimeException();
        }
        return this.method388((byte) 109, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B[III)Lvh;")
    private final class131 method388(byte arg0, int[] arg1, int arg2, int arg3) {
        field890++;
        int var5 = (arg2 >>> 12 | (arg2 & 0x70000FFF) << 4) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class131 var9 = (class131) this.field898.method1081(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class113 var10 = class113.method886(this.field884, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class131 var11 = var10.method887();
            if (arg0 < 59) {
                field881 = -1L;
            }
            this.field898.method1085(-1, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field2356.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)V")
    public static final void method389(boolean arg0, int arg1) {
        class269.field4691.method82((byte) -109, arg1);
        field887++;
        if (arg0) {
            field899 = 38;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([III)Lvh;")
    public final class131 method390(int[] arg0, int arg1, int arg2) {
        field891++;
        if (this.field888.method40((byte) 127) == 1) {
            return this.method391(false, 0, arg0, arg1);
        } else if (this.field888.method37(arg1, (byte) -104) == 1) {
            return this.method391(false, arg1, arg0, 0);
        } else if (arg2 <= 122) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI[II)Lvh;")
    private final class131 method391(boolean arg0, int arg1, int[] arg2, int arg3) {
        field894++;
        if (arg0) {
            this.method390((int[]) null, 126, -45);
        }
        int var5 = arg3 ^ ((arg1 & 0x30000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class131 var9 = (class131) this.field898.method1081(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class184 var10 = (class184) this.field897.method1081(0, var7);
            if (var10 == null) {
                var10 = class184.method1300(this.field888, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field897.method1085(-1, var10, var7);
            }
            class131 var11 = var10.method1294(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1743((byte) 104);
                this.field898.method1085(-1, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
    public static final void method392(byte arg0, int arg1) {
        int var2 = 104 % ((arg1 - 25) / 39);
        field885++;
        if (class153.field2690 == null) {
            class153.field2690 = new byte[4][104][104];
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class153.field2690[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method393(int arg0) {
        field893++;
        if (class48.field847 != null || class90.field1494 != null) {
            return;
        }
        int var1 = class272.field4734;
        if (class170.field2981) {
            if (var1 != 1) {
                int var2 = class17.field244;
                int var3 = class214.field3684;
                if (class145.field2574 - 10 > var2 || var2 > (class145.field2574 + class64.field1095 + 10) || (class55.field950 - 10) > var3 || var3 > class55.field950 - (-class232.field3980 - 10)) {
                    class170.field2981 = false;
                    class52.method399(true, class232.field3980, class64.field1095, class145.field2574, class55.field950);
                }
            }
            if (var1 == 1) {
                int var4 = class55.field950;
                int var5 = class64.field1095;
                int var6 = class145.field2574;
                int var7 = class167.field2950;
                int var8 = class272.field4722;
                int var9 = -1;
                for (int var10 = 0; var10 < class73.field1254; var10++) {
                    int var11 = (class73.field1254 - var10 - 1) * 15 + var4 + 31;
                    if (var6 < var7 && var7 < (var5 + var6) && var8 > var11 - 13 && var8 < (var11 + 3)) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class100.method754(var9, -99);
                }
                class170.field2981 = false;
                class52.method399(true, class232.field3980, class64.field1095, class145.field2574, class55.field950);
            }
        } else {
            if (var1 == 1 && class73.field1254 > 0) {
                short var12 = class79.field1346[class73.field1254 - 1];
                if (var12 == 33 || var12 == 6 || var12 == 46 || var12 == 12 || var12 == 44 || var12 == 13 || var12 == 25 || var12 == 58 || var12 == 51 || var12 == 18 || var12 == 14 || var12 == 1007) {
                    int var13 = class53.field927[class73.field1254 - 1];
                    int var14 = class78.field1329[class73.field1254 - 1];
                    class107 var15 = class55.method408(var14, 251234864);
                    if (class265.method1825(0, client.method817(var15)) || class132.method997(arg0 ^ 0xFFFFFFFE, client.method817(var15))) {
                        class82.field1388 = false;
                        class115.field2142 = 0;
                        if (class48.field847 != null) {
                            class53.method403(-102, class48.field847);
                        }
                        class48.field847 = class55.method408(var14, arg0 + 251234863);
                        class139.field2482 = var13;
                        class249.field4312 = class167.field2950;
                        class205.field3528 = class272.field4722;
                        class53.method403(arg0 ^ 0xFFFFFFBA, class48.field847);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class244.field4239 == 1 && class73.field1254 > 2 || class246.method1727(class73.field1254 - 1, false))) {
                var1 = 2;
            }
            if (var1 == 2 && class73.field1254 > 0 || class71.field1223 == 1) {
                class73.method529((byte) -121);
            }
            if (var1 == 1 && class73.field1254 > 0 || class71.field1223 == 2) {
                class180.method1275(94);
            }
        }
        if (arg0 != 1) {
            method389(false, -22);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lff;Lff;)V")
    public class51(class3 arg0, class3 arg1) {
        this.field884 = arg0;
        this.field888 = arg1;
    }
}
