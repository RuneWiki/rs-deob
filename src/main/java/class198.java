import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class198 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
    public static int[] field3959 = new int[200];

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public static int[] field3955 = new int[128];

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3962 = 0;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lgg;")
    public static class63 field3958 = class116.method911(43, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Z")
    public static boolean field3964 = false;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3960 = -1;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lff;")
    public static class54 field3963 = null;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lgg;")
    private static class63 field3966 = class116.method911(43, "Unable to find ");

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lff;")
    public static class54 field3967 = null;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lgg;")
    public static class63 field3956 = field3966;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Ljc;")
    public static class85 field3953;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1291(byte arg0) {
        field3953 = null;
        field3955 = null;
        field3956 = null;
        field3963 = null;
        if (arg0 != -124) {
            method1292(-19, -33, 28);
        }
        field3959 = null;
        field3958 = null;
        field3966 = null;
        field3967 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1292(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2294 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
    public static final void method1293(int arg0, int arg1) {
        class96 var2 = class148.field3117[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class96 var4 = class148.field3117[var3][arg0][arg1] = class148.field3117[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2268--;
                for (int var5 = 0; var5 < var4.field2272; var5++) {
                    class98 var6 = var4.field2284[var5];
                    if ((var6.field2319 >> 29 & 0x3L) == 2L && var6.field2330 == arg0 && var6.field2325 == arg1) {
                        var6.field2315--;
                    }
                }
            }
        }
        if (class148.field3117[0][arg0][arg1] == null) {
            class148.field3117[0][arg0][arg1] = new class96(0, arg0, arg1);
        }
        class148.field3117[0][arg0][arg1].field2293 = var2;
        class148.field3117[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public static final void method1294(byte arg0) {
        field3954++;
        if (class132.field2868 != null) {
            class132.field2868.method498((byte) -120);
        }
        if (arg0 != -30) {
            field3959 = null;
        }
        if (class183.field3711 != null) {
            class183.field3711.method498((byte) 114);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)J")
    public static final synchronized long method1295(byte arg0) {
        field3965++;
        long var1 = System.currentTimeMillis();
        if (class150.field3161 > var1) {
            class148.field3120 += class150.field3161 - var1;
        }
        if (arg0 < 31) {
            return 97L;
        } else {
            class150.field3161 = var1;
            return class148.field3120 + var1;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
    public static final void method1296(byte arg0) {
        int var1 = class189.field3841 + class3.field72.field1141;
        field3957++;
        if (class9.field189[96]) {
            class135.field2913 += (-class135.field2913 - 24) / 2;
        } else if (class9.field189[97]) {
            class135.field2913 += (24 - class135.field2913) / 2;
        } else {
            class135.field2913 /= 2;
        }
        class68.field1710 = class135.field2913 / 2 + class68.field1710 & 0x7FF;
        if (class9.field189[98]) {
            class100.field2359 += (12 - class100.field2359) / 2;
        } else if (class9.field189[99]) {
            class100.field2359 += (-class100.field2359 - 12) / 2;
        } else {
            class100.field2359 /= 2;
        }
        int var2 = class174.field3578 + class3.field72.field1144;
        class89.field2088 += class100.field2359 / 2;
        if (class150.field3160 - var1 < -500 || class150.field3160 - var1 > 500 || class202.field4002 - var2 < -500 || class202.field4002 - var2 > 500) {
            class202.field4002 = var2;
            class150.field3160 = var1;
        }
        if (class150.field3160 != var1) {
            class150.field3160 += (var1 - class150.field3160) / 16;
        }
        int var3 = 10 % ((arg0 + 35) / 62);
        int var4 = class150.field3160 >> 7;
        if (class89.field2088 < 128) {
            class89.field2088 = 128;
        }
        if (class89.field2088 > 383) {
            class89.field2088 = 383;
        }
        if (class202.field4002 != var2) {
            class202.field4002 += (var2 - class202.field4002) / 16;
        }
        int var5 = class202.field4002 >> 7;
        int var6 = class112.method894(-95, class112.field2528, class150.field3160, class202.field4002);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = class112.field2528;
                    if (var10 < 3 && (class49.field1194[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class81.field1948[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (class195.field3919 < var12) {
            class195.field3919 += (var12 - class195.field3919) / 24;
        } else if (var12 < class195.field3919) {
            class195.field3919 += (var12 - class195.field3919) / 80;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Leh;I)V")
    public static final void method1297(class47 arg0, int arg1) {
        field3968++;
        arg0.field1108 = arg0.field1110;
        if (arg0.field1154 == 0) {
            arg0.field1148 = 0;
            return;
        }
        if (arg0.field1167 != -1 && arg0.field1152 == 0) {
            class9 var2 = class49.method480(1000, arg0.field1167);
            if (arg0.field1155 > 0 && var2.field195 == 0) {
                arg0.field1148++;
                return;
            }
            if (arg0.field1155 <= 0 && var2.field203 == 0) {
                arg0.field1148++;
                return;
            }
        }
        int var3 = arg0.field1141;
        int var4 = arg0.field1117[arg0.field1154 - 1] * 128 + arg0.field1123 * 64;
        int var5 = arg0.field1164[arg0.field1154 - 1] * 128 + arg0.field1123 * 64;
        int var6 = arg0.field1144;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var5 - var6 > 256 || var5 - var6 < -256) {
            arg0.field1144 = var5;
            arg0.field1141 = var4;
            return;
        }
        if (arg1 < 49) {
            method1295((byte) 64);
        }
        if (var3 >= var4) {
            if (var4 >= var3) {
                if (var5 > var6) {
                    arg0.field1129 = 1024;
                } else if (var5 < var6) {
                    arg0.field1129 = 0;
                }
            } else if (var6 < var5) {
                arg0.field1129 = 768;
            } else if (var6 > var5) {
                arg0.field1129 = 256;
            } else {
                arg0.field1129 = 512;
            }
        } else if (var5 > var6) {
            arg0.field1129 = 1280;
        } else if (var5 >= var6) {
            arg0.field1129 = 1536;
        } else {
            arg0.field1129 = 1792;
        }
        int var7 = arg0.field1149;
        int var8 = arg0.field1129 - arg0.field1104 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = 4;
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field1113;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field1124;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field1157;
        }
        if (var7 == -1) {
            var7 = arg0.field1113;
        }
        arg0.field1108 = var7;
        boolean var10 = true;
        if (arg0 instanceof class6) {
            var10 = ((class6) arg0).field150.field622;
        }
        if (var10) {
            if (arg0.field1129 != arg0.field1104 && arg0.field1132 == -1 && arg0.field1115 != 0) {
                var9 = 2;
            }
            if (arg0.field1154 > 2) {
                var9 = 6;
            }
            if (arg0.field1154 > 3) {
                var9 = 8;
            }
            if (arg0.field1148 > 0 && arg0.field1154 > 1) {
                var9 = 8;
                arg0.field1148--;
            }
        } else {
            if (arg0.field1154 > 1) {
                var9 = 6;
            }
            if (arg0.field1154 > 2) {
                var9 = 8;
            }
            if (arg0.field1148 > 0 && arg0.field1154 > 1) {
                arg0.field1148--;
                var9 = 8;
            }
        }
        if (arg0.field1095[arg0.field1154 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1113 == arg0.field1108 && arg0.field1159 != -1) {
            arg0.field1108 = arg0.field1159;
        }
        if (var5 > var6) {
            arg0.field1144 += var9;
            if (arg0.field1144 > var5) {
                arg0.field1144 = var5;
            }
        } else if (var5 < var6) {
            arg0.field1144 -= var9;
            if (arg0.field1144 < var5) {
                arg0.field1144 = var5;
            }
        }
        if (var4 > var3) {
            arg0.field1141 += var9;
            if (arg0.field1141 > var4) {
                arg0.field1141 = var4;
            }
        } else if (var4 < var3) {
            arg0.field1141 -= var9;
            if (var4 > arg0.field1141) {
                arg0.field1141 = var4;
            }
        }
        if (arg0.field1141 != var4 || arg0.field1144 != var5) {
            return;
        }
        arg0.field1154--;
        if (arg0.field1155 > 0) {
            arg0.field1155--;
            return;
        }
    }
}
