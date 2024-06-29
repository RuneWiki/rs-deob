import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class129 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
    public static int[] field2267 = new int[256];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lda;")
    public static class275 field2271 = class255.method1672(124, "scrollen:");

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lda;")
    private static class275 field2272;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[[I")
    public static int[][] field2277;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lda;")
    public static class275 field2275;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
    public static int[] field2274;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lda;")
    public static class275 field2278;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lda;")
    public static class275 field2279;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2270;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method918(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        int var2 = 89 / ((30 - arg1) / 59);
        field2265++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2277 = null;
        field2278 = null;
        if (arg0 < 57) {
            field2276 = -3;
        }
        field2275 = null;
        field2270 = null;
        field2267 = null;
        field2274 = null;
        field2279 = null;
        field2271 = null;
        field2272 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method920(int arg0) {
        if (arg0 != -16955) {
            field2264 = 43;
        }
        field2266++;
        if (class233.field4075 == null) {
            return;
        }
        if (class95.field1628 < 10) {
            if (!class125.field2244.method758(class233.field4075.field3814, arg0 ^ 0xFFFFBDBA)) {
                class95.field1628 = class271.field4707.method766(class233.field4075.field3814, (byte) 52) / 10;
                return;
            }
            class145.method1038(false);
            class95.field1628 = 10;
        }
        if (class95.field1628 == 10) {
            class18.field255 = class233.field4075.field3824 >> 6 << 6;
            class106.field1841 = class233.field4075.field3817 >> 6 << 6;
            int var1 = (class66.field1094.field1770 >> 7) + class16.field237 - class18.field255;
            class153.field2683 = 8.0F;
            class199.field3397 = 8.0F;
            class255.field4497 = (class233.field4075.field3802 >> 6 << 6) + 64 - class18.field255;
            class5.field67 = (class233.field4075.field3813 >> 6 << 6) + 64 - class106.field1841;
            int var2 = class5.field67 - class234.field4083 - ((class66.field1094.field1758 >> 7) - class106.field1841) - 1;
            int var3 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class255.field4497 && var4 >= 0 && var4 < class5.field67) {
                class261.field4531 = var3;
                class258.field4521 = var4;
            } else {
                class258.field4521 = class106.field1841 + class5.field67 - (class233.field4075.field3820 * 64) - 1;
                class261.field4531 = class233.field4075.field3811 * 64 - class18.field255;
            }
            class138.method994((byte) 72);
            int var5 = class79.field1298 >> 1;
            int var6 = class255.field4497 >> 6;
            int var7 = class5.field67 >> 6;
            class83.field1341 = new byte[var6][var7][];
            class114.field2027 = new int[class46.field766 + 1];
            class123.field2207 = new byte[var6][var7][];
            int var8 = class221.field3753 >> 2 << 10;
            class144.field2526 = new byte[var6][var7][];
            class51.field839 = new int[var6][var7][];
            class262.field4556 = new int[var6][var7][];
            class57.field964 = new byte[var6][var7][];
            class107.field1855 = new short[var6][var7][];
            class157.field2768 = new byte[var6][var7][];
            class46.method280(var5, (byte) 127, var8);
            class95.field1628 = 20;
        } else if (class95.field1628 == 20) {
            class60.method380((byte) 83, new class85(class125.field2244.method781(class182.field3130, class233.field4075.field3814, 7)));
            class95.field1628 = 30;
            class22.method135(true, -104);
            class77.method504((byte) 124);
        } else if (class95.field1628 == 30) {
            class94.method678(-8, new class85(class125.field2244.method781(class143.field2512, class233.field4075.field3814, arg0 ^ -16958)));
            class95.field1628 = 40;
            class77.method504((byte) 7);
        } else if (class95.field1628 == 40) {
            class46.method271(new class85(class125.field2244.method781(class73.field1193, class233.field4075.field3814, arg0 + 16962)), arg0 ^ 0xFFFFED0B);
            class95.field1628 = 50;
            class77.method504((byte) -94);
        } else if (class95.field1628 == 50) {
            class201.method1319(-98, new class85(class125.field2244.method781(class5.field74, class233.field4075.field3814, arg0 ^ -16958)));
            class95.field1628 = 60;
            class22.method135(true, -107);
            class77.method504((byte) 121);
        } else if (class95.field1628 == 60) {
            if (class125.field2244.method768(false, class197.method1291(new class275[] { class233.field4075.field3814, class22.field332 }, -30025))) {
                if (!class125.field2244.method758(class197.method1291(new class275[] { class233.field4075.field3814, class22.field332 }, arg0 - 13070), 127)) {
                    return;
                }
                class215.field3655 = class84.method555(124, class125.field2244, class197.method1291(new class275[] { class233.field4075.field3814, class22.field332 }, arg0 ^ 0x3772));
            } else {
                class215.field3655 = new class65(0);
            }
            class95.field1628 = 70;
            class77.method504((byte) 121);
        } else if (class95.field1628 == 70) {
            class91.field1545 = new class274(11, true, class93.field1601);
            class95.field1628 = 73;
            class22.method135(true, -96);
            class77.method504((byte) 121);
        } else if (class95.field1628 == 73) {
            class108.field1879 = new class274(12, true, class93.field1601);
            class95.field1628 = 76;
            class22.method135(true, -54);
            class77.method504((byte) 127);
        } else if (class95.field1628 == 76) {
            class11.field165 = new class274(14, true, class93.field1601);
            class95.field1628 = 79;
            class22.method135(true, -62);
            class77.method504((byte) -113);
        } else if (class95.field1628 == 79) {
            class162.field2831 = new class274(17, true, class93.field1601);
            class95.field1628 = 82;
            class22.method135(true, arg0 + 16841);
            class77.method504((byte) 127);
        } else if (class95.field1628 == 82) {
            class251.field4445 = new class274(19, true, class93.field1601);
            class95.field1628 = 85;
            class22.method135(true, -85);
            class77.method504((byte) -59);
        } else if (class95.field1628 == 85) {
            class48.field803 = new class274(22, true, class93.field1601);
            class95.field1628 = 88;
            class22.method135(true, -120);
            class77.method504((byte) 124);
        } else if (class95.field1628 == 88) {
            class229.field3933 = new class274(26, true, class93.field1601);
            class95.field1628 = 91;
            class22.method135(true, -66);
            class77.method504((byte) -94);
        } else {
            class200.field3417 = new class274(30, true, class93.field1601);
            class95.field1628 = 100;
            class22.method135(true, -51);
            class77.method504((byte) 127);
            class51.field842 = -1;
            class163.field2840 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public static final void method921(int arg0, int arg1, int arg2) {
        if (class113.field2002 > 0) {
            class261.method1706(class113.field2002, -119);
            class113.field2002 = 0;
        }
        short var3 = 256;
        field2269++;
        if (arg1 != 20593) {
            field2270 = null;
        }
        int var4 = class47.field790 * arg2;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class42.field732[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class205.field3475[var6++];
                int var12 = class47.field786[arg0 + var4++];
                if (var11 == 0) {
                    class122.field2191.field4527[var5++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - (var11 + 18);
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class273.field4723[var11];
                    class122.field2191.field4527[var5++] = class19.method98(class19.method98(var12, 16711935) * var14 + class19.method98(var15, 16711935) * var13, -16711936) + class19.method98(16711680, class19.method98(65280, var15) * var13 + var14 * class19.method98(65280, var12)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class122.field2191.field4527[var5++] = class47.field786[var4++ + arg0];
            }
            var4 += class47.field790 - 128;
        }
        class122.field2191.method719(arg0, arg2);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var2 = var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var2 & 0x1) == 1) {
                    var2 = var2 >>> 1 ^ 0xEDB88320;
                } else {
                    var2 >>>= 0x1;
                }
            }
            field2267[var0] = var2;
        }
        field2273 = 0;
        field2272 = class255.method1672(98, "Loading world list data");
        field2277 = new int[5][5000];
        field2275 = field2272;
        field2274 = new int[4096];
        for (int var1 = 0; var1 < 4096; var1++) {
            field2274[var1] = class141.method1017(var1, 116);
        }
        field2278 = class255.method1672(114, "hint_mapedge");
        field2279 = class255.method1672(99, "Opened titlescreen)3");
    }
}
