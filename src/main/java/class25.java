import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 {

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    private int[] field496 = new int[256];

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
    private int[] field494 = new int[256];

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "J")
    public static volatile long field490 = 0L;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[Lbb;")
    public static class10[] field505 = new class10[14];

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "[Z")
    public static boolean[] field511 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field507 = 20;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Lrd;")
    private static class114 field510 = class84.method656("Close", (byte) 119);

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field495 = 1;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lrd;")
    public static class114 field504 = class84.method656(" )2> @lre@", (byte) 125);

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lrd;")
    public static class114 field500 = field510;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Ljd;")
    public static class66 field498;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "Ljd;")
    public static class66 field514;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Loa;")
    public static class93 field491;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[Loa;")
    public static class93[] field489;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method182(int arg0) {
        field491 = null;
        field498 = null;
        field489 = null;
        field504 = null;
        field505 = null;
        field514 = null;
        field511 = null;
        field500 = null;
        if (arg0 >= -78) {
            method184(-117);
        }
        field510 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method183(boolean arg0, String arg1) throws ClassNotFoundException {
        field502++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0) {
                field498 = null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method184(int arg0) {
        class124.field2956.method200(-93);
        if (arg0 != -12) {
            method184(114);
        }
        field515++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    private final void method185(byte arg0) {
        field492++;
        if (arg0 <= 81) {
            return;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var71 << 8;
            int var76 = var71 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field494[var11 + 1] + var8;
            int var38 = this.field494[var11 + 3] + var6;
            int var39 = this.field494[var11 + 2] + var7;
            int var40 = this.field494[var11 + 7] + var2;
            int var41 = this.field494[var11 + 6] + var3;
            int var42 = this.field494[var11] + var9;
            int var43 = var42 ^ var37 << 11;
            int var44 = this.field494[var11 + 5] + var4;
            int var45 = var37 + var39;
            int var46 = this.field494[var11 + 4] + var5;
            int var47 = var38 + var43;
            int var48 = var45 ^ var39 >>> 2;
            int var49 = var39 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var46 + var48;
            int var52 = var47 + var51;
            int var53 = var44 + var50;
            var6 = var52 ^ var51 >>> 16;
            int var54 = var51 + var53;
            int var55 = var6 + var41;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var40;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var43;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var50;
            var8 = var3 + var48;
            var9 = var8 + var59;
            this.field496[var11] = var9;
            this.field496[var11 + 1] = var8;
            this.field496[var11 + 2] = var7;
            this.field496[var11 + 3] = var6;
            this.field496[var11 + 4] = var5;
            this.field496[var11 + 5] = var4;
            this.field496[var11 + 6] = var3;
            this.field496[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field496[var12 + 6] + var3;
            int var14 = this.field496[var12 + 3] + var6;
            int var15 = this.field496[var12 + 4] + var5;
            int var16 = this.field496[var12 + 2] + var7;
            int var17 = this.field496[var12 + 1] + var8;
            int var18 = this.field496[var12] + var9;
            int var19 = var18 ^ var17 << 11;
            int var20 = this.field496[var12 + 5] + var4;
            int var21 = this.field496[var12 + 7] + var2;
            int var22 = var14 + var19;
            int var23 = var16 + var17;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var16 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var15 + var24;
            int var28 = var22 + var27;
            int var29 = var20 + var26;
            var6 = var28 ^ var27 >>> 16;
            int var30 = var27 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var6 + var13;
            int var32 = var5 + var21;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var7 = var2 + var26;
            var9 = var8 + var34;
            this.field496[var12] = var9;
            this.field496[var12 + 1] = var8;
            this.field496[var12 + 2] = var7;
            this.field496[var12 + 3] = var6;
            this.field496[var12 + 4] = var5;
            this.field496[var12 + 5] = var4;
            this.field496[var12 + 6] = var3;
            this.field496[var12 + 7] = var2;
        }
        this.method191((byte) -87);
        this.field488 = 256;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)I")
    public static final int method186(int arg0, int arg1, boolean arg2) {
        field503++;
        if (!arg2) {
            field500 = null;
        }
        int var3 = class42.method291(arg1 - 1, arg0 + -1, Integer.MAX_VALUE) + class42.method291(arg1 - 1, arg0 + 1, Integer.MAX_VALUE) + class42.method291(arg1 + 1, arg0 + -1, Integer.MAX_VALUE) + class42.method291(arg1 + 1, arg0 + 1, Integer.MAX_VALUE);
        int var4 = class42.method291(arg1, arg0 - 1, Integer.MAX_VALUE) + class42.method291(arg1, arg0 + 1, Integer.MAX_VALUE) + class42.method291(arg1 + -1, arg0, Integer.MAX_VALUE) + class42.method291(arg1 - -1, arg0, Integer.MAX_VALUE);
        int var5 = class42.method291(arg1, arg0, Integer.MAX_VALUE);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static final void method187(byte arg0) {
        field506++;
        class118.method919(-12);
        if (class104.field2419 == 1) {
            class112.field2628[class8.field113 / 100].method400(class69.field1512 - 4 - 8, class63.field1350 + -12);
        }
        if (class104.field2419 == 2) {
            class112.field2628[class8.field113 / 100 + 4].method400(class69.field1512 - 4 - 8, class63.field1350 + -12);
        }
        if (class72.field1608 != -1) {
            client.method150(class72.field1608, 0);
            class144.method1147(0, 334, 512, 0, false, 4, class72.field1608);
        }
        if (class117.field2747 != -1) {
            client.method150(class117.field2747, 0);
            class144.method1147(0, 334, 512, 0, false, 0, class117.field2747);
        }
        class62.method512(-826);
        if (!class116.field2714) {
            class67.method536(true);
            class117.method905(-24413);
        } else if (class14.field304 == 0) {
            class24.method171(-7);
        }
        if (class131.field3154 == 1) {
            class114.field2636.method400(472, 296);
        }
        if (arg0 != -44) {
            return;
        }
        if (class122.field2850) {
            short var1 = 507;
            byte var2 = 20;
            class5.field54.method317(class101.method786((byte) 127, new class114[] { class101.field2316, class14.method113(class143.field3405, -31766) }), var1, var2, 16776960);
            int var9 = var2 + 15;
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            int var5 = 16776960;
            if (var4 > 32768 && class64.field1370) {
                var5 = 16711680;
            }
            if (var4 > 65536 && !class64.field1370) {
                var5 = 16711680;
            }
            class5.field54.method317(class101.method786((byte) 125, new class114[] { class116.field2711, class14.method113(var4, -31766), class42.field862 }), var1, var9, var5);
            var9 += 15;
            if (class42.field860) {
                class5.field54.method317(class50.field1044, var1, var9, 16711680);
                var9 += 15;
                class42.field860 = false;
            }
            if (class75.field1738) {
                class5.field54.method317(class1.field9, var1, var9, 16711680);
                class75.field1738 = false;
                var9 += 15;
            }
            if (class61.field1302) {
                class5.field54.method317(class85.field1914, var1, var9, 16711680);
                var9 += 15;
                class61.field1302 = false;
            }
        }
        if (class79.field1805 == 0) {
            return;
        }
        int var6 = class79.field1805 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class5.field54.method333(class101.method786((byte) 126, new class114[] { class80.field1809, class14.method113(var7, -31766), class101.field2323, class14.method113(var8, arg0 ^ 0x7C3E) }), 4, 329, 16776960);
        } else {
            class5.field54.method333(class101.method786((byte) 127, new class114[] { class80.field1809, class14.method113(var7, arg0 ^ 0x7C3E), class22.field425, class14.method113(var8, -31766) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lpb;I)V")
    public static final void method188(class100 arg0, int arg1) {
        class143.field3401 = arg0;
        if (arg1 > 62) {
            field508++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
    public final int method189(int arg0) {
        if (this.field488-- == 0) {
            this.method191((byte) -87);
            this.field488 = 255;
        }
        if (arg0 == -4) {
            field497++;
            return this.field494[this.field488];
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static final void method190(int arg0) {
        int var1 = 115 % ((arg0 + 72) / 46);
        for (class65 var2 = (class65) class111.field2601.method654((byte) 75); var2 != null; var2 = (class65) class111.field2601.method644((byte) -68)) {
            if (var2.field1385 != null) {
                var2.method523(17015);
            }
        }
        field501++;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([I)V")
    public class25(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field494[var2] = arg0[var2];
        }
        this.method185((byte) 101);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    private final void method191(byte arg0) {
        field493++;
        this.field512 += ++this.field513;
        if (arg0 != -87) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field496[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field509 ^= this.field509 << 13;
                } else {
                    this.field509 ^= this.field509 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field509 ^= this.field509 << 2;
            } else {
                this.field509 ^= this.field509 >>> 16;
            }
            this.field509 += this.field496[var2 + 128 & 0xFF];
            int var4;
            this.field496[var2] = var4 = this.field496[class96.method737(var3, 1020) >> 2] + this.field512 + this.field509;
            this.field494[var2] = this.field512 = this.field496[class96.method737(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)I")
    public static final int method192(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class47.field965[(var4 ^ arg0[var5]) & 0xFF];
        }
        if (arg2 != -23173) {
            field504 = null;
        }
        int var6 = ~var4;
        field499++;
        return var6;
    }
}
