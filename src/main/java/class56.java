import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class16 {

    @OriginalMember(owner = "client!i", name = "E", descriptor = "[I")
    public static int[] field1114 = new int[100];

    @OriginalMember(owner = "client!i", name = "H", descriptor = "[I")
    public static int[] field1117 = new int[99];

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static volatile int field1128 = 0;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
    public static boolean field1132;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Lob;")
    public static class99 field1130;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lje;")
    public static class67 field1133;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "[I")
    public int[] field1110;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "[I")
    public int[] field1119;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "[I")
    public int[] field1125;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "[Lg;")
    public class43[] field1122;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "[Lg;")
    public class43[] field1127;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "[[[B")
    public byte[][][] field1124;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)V")
    public static final void method390(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 114) {
            return;
        }
        for (int var5 = arg1; var5 <= arg1 + arg4; var5++) {
            for (int var6 = arg2; var6 <= arg2 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class106.field2424[0][var6][var5] = 127;
                    if (arg2 == var6 && var6 > 0) {
                        class142.field3253[0][var6][var5] = class142.field3253[0][var6 - 1][var5];
                    }
                    if (arg2 + arg3 == var6 && var6 < 103) {
                        class142.field3253[0][var6][var5] = class142.field3253[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class142.field3253[0][var6][var5] = class142.field3253[0][var6][var5 - 1];
                    }
                    if (arg1 + arg4 == var5 && var5 < 103) {
                        class142.field3253[0][var6][var5] = class142.field3253[0][var6][var5 + 1];
                    }
                }
            }
        }
        field1116++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILqb;BI)V")
    public static final void method391(int arg0, int arg1, int arg2, class113 arg3, byte arg4, int arg5) {
        field1118++;
        if (arg4 != -123) {
            method393((byte) 114);
        }
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 4225 || var6 >= 90000) {
            class145.method1121(arg1, arg2, arg0, arg3, 102, arg5);
            return;
        }
        int var7 = class47.field874 + class25.field463 & 0x7FF;
        int var8 = class96.field2148[var7];
        int var9 = var8 * 256 / (class115.field2603 + 256);
        int var10 = class96.field2143[var7];
        int var11 = var10 * 256 / (class115.field2603 + 256);
        int var12 = arg0 * var11 + arg1 * var9 >> 16;
        int var13 = arg0 * var9 - arg1 * var11 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class129.field2829.method907(arg5 + var16 + 94 + 4 - 10, arg2 - -83 + -var17 + -20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method392(Component arg0, boolean arg1) {
        arg0.addMouseListener(class60.field1203);
        field1115++;
        arg0.addMouseMotionListener(class60.field1203);
        arg0.addFocusListener(class60.field1203);
        if (!arg1) {
            method390((byte) -107, 71, -17, -30, -24);
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static void method393(byte arg0) {
        field1117 = null;
        field1114 = null;
        field1133 = null;
        if (arg0 == -28) {
            field1130 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lje;Lfd;Lje;I)[Lkd;")
    public static final class73[] method394(class67 arg0, class40 arg1, class67 arg2, int arg3) {
        if (arg3 == -16958) {
            field1120++;
            int var4 = arg1.method251(0, arg2);
            int var5 = arg1.method254(arg0, 0, var4);
            return class149.method1146(var5, arg1, -60, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static final void method395(boolean arg0) {
        field1126++;
        short var1 = 256;
        if (field1123 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (field1123 > 768) {
                    class37.field672[var4] = class88.method610(1024 - field1123, class27.field485[var4], -156490936, class99.field2201[var4]);
                } else if (field1123 <= 256) {
                    class37.field672[var4] = class88.method610(256 - field1123, class99.field2201[var4], -156490936, class27.field485[var4]);
                } else {
                    class37.field672[var4] = class99.field2201[var4];
                }
            }
        } else if (class86.field1902 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class37.field672[var2] = class27.field485[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class86.field1902 > 768) {
                    class37.field672[var3] = class88.method610(1024 - class86.field1902, class27.field485[var3], -156490936, class85.field1891[var3]);
                } else if (class86.field1902 > 256) {
                    class37.field672[var3] = class85.field1891[var3];
                } else {
                    class37.field672[var3] = class88.method610(256 - class86.field1902, class85.field1891[var3], -156490936, class27.field485[var3]);
                }
            }
        }
        class8.method60(0, 9, 128, var1 + 7);
        class116.field2620.method906(0, 0);
        class8.method64();
        int var5 = 6885;
        int var6 = 0;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class151.field3463[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class118.field2667[var6++];
                if (var23 == 0) {
                    var5++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class81.field1792.field256[var5];
                    int var27 = class37.field672[var23];
                    class81.field1792.field256[var5++] = class34.method213(var25 * class34.method213(16711935, var26) + var23 * class34.method213(var27, 16711935), -16711936) + class34.method213(var23 * class34.method213(65280, var27) + var25 * class34.method213(65280, var26), 16711680) >> 8;
                }
            }
            var5 += var21 + 765 - 128;
        }
        int var8 = 7546;
        class8.method60(637, 9, 765, var1 + 7);
        int var9 = 0;
        if (arg0) {
            method390((byte) -128, 87, -123, 97, -30);
        }
        class114.field2586.method906(382, 0);
        class8.method64();
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class151.field3463[var10] / var1;
            int var12 = 103 - var11;
            int var13 = var8 + var11;
            for (int var14 = 0; var14 < var12; var14++) {
                int var15 = class118.field2667[var9++];
                if (var15 == 0) {
                    var13++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class37.field672[var15];
                    int var19 = class81.field1792.field256[var13];
                    class81.field1792.field256[var13++] = class34.method213(-16711936, var17 * class34.method213(var19, 16711935) + class34.method213(16711935, var18) * var15) + class34.method213(var15 * class34.method213(65280, var18) + class34.method213(var19, 65280) * var17, 16711680) >> 8;
                }
            }
            var8 = var13 + 765 - var12 - var11;
            var9 += 128 - var12;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILje;IIBLje;)V")
    public static final void method396(int arg0, int arg1, class67 arg2, int arg3, int arg4, byte arg5, class67 arg6) {
        if (arg5 >= -60) {
            method393((byte) -30);
        }
        field1129++;
        if (class12.field222 || class69.field1419 >= 500) {
            return;
        }
        class55.field1095[class69.field1419] = arg6;
        class31.field543[class69.field1419] = arg2;
        class101.field2267[class69.field1419] = arg4;
        class126.field2766[class69.field1419] = arg3;
        class46.field847[class69.field1419] = arg1;
        class154.field3501[class69.field1419] = arg0;
        class69.field1419++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1117[var1] = var0 / 4;
        }
        field1132 = false;
        field1131 = -1;
        field1130 = new class99(64);
        field1133 = class85.method592(255, "RuneScape wurde aktualisiert(Q");
    }
}
