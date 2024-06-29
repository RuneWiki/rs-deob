import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
    private int[] field1029 = new int[256];

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
    private int[] field1024 = new int[256];

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lrd;")
    public static class117 field1018 = class95.method812("m-Ochte mit Ihnen handeln)3", (byte) 8);

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    public static int[] field1037 = new int[200];

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field1032 = 99;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Laa;")
    public static class2 field1036 = new class2(4096);

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field1038 = -1;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Lrd;")
    private static class117 field1039 = class95.method812("Loading config )2 ", (byte) 8);

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lrd;")
    public static class117 field1043 = field1039;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Lkb;")
    public static class71 field1041 = new class71();

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field1045 = 0;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field1046 = 0;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static volatile int field1048 = -1;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static volatile int field1047 = 0;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "[J")
    public static long[] field1049 = new long[32];

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field1052 = 3353893;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[Lrd;")
    public static class117[] field1051 = new class117[500];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lm;")
    public static class83 field1040;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lnc;")
    public static class92 field1050;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "[[[B")
    public static byte[][][] field1044;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    private final void method437(int arg0) {
        this.field1017 += ++this.field1023;
        field1022++;
        if (arg0 != -718) {
            field1037 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1029[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1031 ^= this.field1031 << 13;
                } else {
                    this.field1031 ^= this.field1031 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1031 ^= this.field1031 << 2;
            } else {
                this.field1031 ^= this.field1031 >>> 16;
            }
            this.field1031 += this.field1029[var2 + 128 & 0xFF];
            int var4;
            this.field1029[var2] = var4 = this.field1017 + this.field1029[class66.method660(var3, 1020) >> 2] + this.field1031;
            this.field1024[var2] = this.field1017 = this.field1029[class66.method660(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
    public final int method438(int arg0) {
        if (this.field1033-- == 0) {
            this.method437(-718);
            this.field1033 = 255;
        }
        field1026++;
        return arg0 < 46 ? 46 : this.field1024[this.field1033];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lwa;Z)Z")
    public static final boolean method439(class144 arg0, boolean arg1) {
        field1034++;
        int var2 = arg0.field3467;
        if (!arg1) {
            field1038 = 34;
        }
        if (class93.field2347 == 2) {
            if (var2 == 201) {
                class80.field2142 = 0;
                class57.field1584 = 1;
                class134.field3216 = class134.field3215;
                class134.field3212 = class73.field2043;
                class36.field1058 = true;
                class18.field458 = true;
            }
            if (var2 == 202) {
                class80.field2142 = 0;
                class57.field1584 = 2;
                class36.field1058 = true;
                class18.field458 = true;
                class134.field3212 = class54.field1539;
                class134.field3216 = class134.field3215;
            }
        }
        if (var2 == 205) {
            class86.field2247 = 250;
            return true;
        }
        if (var2 == 501) {
            class36.field1058 = true;
            class134.field3212 = class42.field1213;
            class18.field458 = true;
            class57.field1584 = 4;
            class134.field3216 = class134.field3215;
            class80.field2142 = 0;
        }
        if (var2 == 502) {
            class18.field458 = true;
            class36.field1058 = true;
            class57.field1584 = 5;
            class134.field3216 = class134.field3215;
            class134.field3212 = class141.field3350;
            class80.field2142 = 0;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class147.field3589.method372(var4, -19419, var3 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class147.field3589.method381(var6 == 1, var5, 127);
        }
        if (var2 == 324) {
            class147.field3589.method378(false, -1);
        }
        if (var2 == 325) {
            class147.field3589.method378(true, -1);
        }
        if (var2 == 326) {
            class138.field3310++;
            class25.field754.method739(false, 40);
            class147.field3589.method371(60, class25.field754);
            return true;
        }
        if (var2 == 620) {
            class110.field2760 = !class110.field2760;
        }
        if (var2 >= 601 && var2 <= 613) {
            class20.method229((byte) -14);
            if (class134.field3202.method954(71) > 0) {
                class25.field754.method739(false, 28);
                class1.field11++;
                class25.field754.method163(-12, class134.field3202.method966(121));
                class25.field754.method162(var2 - 601, -23339);
                class25.field754.method162(class110.field2760 ? 1 : 0, -23339);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLbf;I)Lrd;")
    public static final class117 method440(byte arg0, class14 arg1, int arg2) {
        field1019++;
        try {
            int var3 = 69 % ((arg0 + 11) / 41);
            class117 var4 = new class117();
            var4.field2858 = arg1.method169(108);
            if (arg2 < var4.field2858) {
                var4.field2858 = arg2;
            }
            var4.field2851 = new byte[var4.field2858];
            arg1.field314 += class61.field1706.method107(arg1.field326, 24, var4.field2851, arg1.field314, 0, var4.field2858);
            return var4;
        } catch (Exception var5) {
            return class60.field1691;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILnc;Laf;)V")
    public static final void method441(int arg0, int arg1, class92 arg2, class7 arg3) {
        field1030++;
        byte[] var4 = null;
        class1 var5 = class132.field3168;
        synchronized (class132.field3168) {
            if (arg1 <= 116) {
                field1025 = -80;
            }
            for (class27 var6 = (class27) class132.field3168.method3(false); var6 != null; var6 = (class27) class132.field3168.method14(127)) {
                if ((long) arg0 == var6.field2048 && var6.field791 == arg2 && var6.field804 == 0) {
                    var4 = var6.field792;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method799((byte) -64, arg0);
            arg3.method55(true, arg2, (byte) 2, var7, arg0);
        } else {
            arg3.method55(true, arg2, (byte) 2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method442(byte arg0) {
        class137.field3283 = new class1();
        field1028++;
        if (arg0 != -120) {
            method439(null, true);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI[B)Lrd;")
    public static final class117 method443(int arg0, byte arg1, int arg2, byte[] arg3) {
        class117 var4 = new class117();
        field1020++;
        var4.field2858 = 0;
        var4.field2851 = new byte[arg2];
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field2851[var4.field2858++] = arg3[var5];
            }
        }
        if (arg1 <= 70) {
            method444((byte) -108);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([I)V")
    public class35(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1024[var2] = arg0[var2];
        }
        this.method445(true);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field1018 = null;
        field1044 = null;
        field1043 = null;
        field1036 = null;
        field1049 = null;
        field1039 = null;
        field1040 = null;
        field1041 = null;
        field1050 = null;
        field1037 = null;
        field1051 = null;
        if (arg0 != -109) {
            field1018 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    private final void method445(boolean arg0) {
        field1035++;
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
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1024[var11 + 7] + var2;
            int var38 = this.field1024[var11 + 3] + var6;
            int var39 = this.field1024[var11 + 2] + var7;
            int var40 = this.field1024[var11] + var9;
            int var41 = this.field1024[var11 + 4] + var5;
            int var42 = this.field1024[var11 + 5] + var4;
            int var43 = this.field1024[var11 + 1] + var8;
            int var44 = var40 ^ var43 << 11;
            int var45 = var38 + var44;
            int var46 = var39 + var43;
            int var47 = var46 ^ var39 >>> 2;
            int var48 = var41 + var47;
            int var49 = this.field1024[var11 + 6] + var3;
            int var50 = var39 + var45;
            int var51 = var50 ^ var45 << 8;
            int var52 = var42 + var51;
            int var53 = var45 + var48;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var6 + var49;
            int var55 = var48 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var37;
            int var58 = var54 + var57;
            int var59 = var4 + var44;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var47;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field1029[var11] = var9;
            var7 = var2 + var51;
            this.field1029[var11 + 1] = var8;
            this.field1029[var11 + 2] = var7;
            this.field1029[var11 + 3] = var6;
            this.field1029[var11 + 4] = var5;
            this.field1029[var11 + 5] = var4;
            this.field1029[var11 + 6] = var3;
            this.field1029[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1029[var12 + 7] + var2;
            int var14 = this.field1029[var12 + 1] + var8;
            int var15 = this.field1029[var12 + 2] + var7;
            int var16 = this.field1029[var12 + 4] + var5;
            int var17 = this.field1029[var12 + 3] + var6;
            int var18 = this.field1029[var12] + var9;
            int var19 = this.field1029[var12 + 6] + var3;
            int var20 = this.field1029[var12 + 5] + var4;
            int var21 = var18 ^ var14 << 11;
            int var22 = var17 + var21;
            int var23 = var14 + var15;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var15 + var22;
            int var26 = var16 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var20 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var19;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var13;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field1029[var12] = var9;
            this.field1029[var12 + 1] = var8;
            this.field1029[var12 + 2] = var7;
            this.field1029[var12 + 3] = var6;
            this.field1029[var12 + 4] = var5;
            this.field1029[var12 + 5] = var4;
            this.field1029[var12 + 6] = var3;
            this.field1029[var12 + 7] = var2;
        }
        if (!arg0) {
            field1041 = null;
        }
        this.method437(-718);
        this.field1033 = 256;
    }
}
