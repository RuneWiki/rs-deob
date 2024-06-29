import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    private int[] field1010 = new int[256];

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
    private int[] field1026 = new int[256];

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Loc;")
    public static class99 field1013 = class48.method402((byte) -104, "(U4");

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Loc;")
    private static class99 field1009 = class48.method402((byte) -104, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Loc;")
    public static class99 field1016 = class48.method402((byte) -104, "null");

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Loc;")
    private static class99 field1022 = class48.method402((byte) -104, "Hidden");

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Loc;")
    public static class99 field1028 = class48.method402((byte) -104, "jolt");

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field1015 = -1;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Loc;")
    public static class99 field1024 = class48.method402((byte) -104, "Hierhin gehen");

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Loc;")
    public static class99 field1030 = class48.method402((byte) -104, " ");

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Loc;")
    private static class99 field1035 = class48.method402((byte) -104, "Click to continue");

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Loc;")
    public static class99 field1032 = field1009;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Loc;")
    public static class99 field1029 = field1022;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Loc;")
    public static class99 field1031 = field1035;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Loc;")
    public static class99 field1036 = class48.method402((byte) -104, "Handel akzeptieren");

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    private int field1027;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lie;")
    public static class61 field1019;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[Ldc;")
    public static class24[] field1021;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method361(boolean arg0) {
        class111.method949(18645);
        field1020++;
        class3.method16(0);
        if (class112.field2804 == 2 || class112.field2804 == 5) {
            byte[] var41 = class80.field1987.field566;
            int[] var42 = class96.field2330;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class112.field2804 < 3) {
                class14.field349.method580(0, 0, 33, 33, 25, 25, class140.field3478, 256, class39.field974, class110.field2738);
            }
            class100.method860(550);
            return;
        }
        int var1 = class69.field1770.field3115 / 32 + 48;
        int var2 = class140.field3478 + class32.field777 & 0x7FF;
        int var3 = 464 - class69.field1770.field3077 / 32;
        class16.field429.method580(25, 5, 146, 151, var1, var3, var2, class23.field556 + 256, class36.field924, class27.field676);
        for (int var4 = 0; var4 < class31.field746; var4++) {
            int var39 = class74.field1866[var4] * 4 + 2 - class69.field1770.field3077 / 32;
            int var40 = class126.field3058[var4] * 4 + 2 - class69.field1770.field3115 / 32;
            class126.method1035((byte) 78, var40, class119.field2931[var4], var39);
        }
        if (!arg0) {
            field1035 = null;
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class83 var36 = class18.field476[class84.field2116][var5][var35];
                if (var36 != null) {
                    int var37 = var5 * 4 + 2 - class69.field1770.field3115 / 32;
                    int var38 = var35 * 4 + 2 - class69.field1770.field3077 / 32;
                    class126.method1035((byte) 78, var37, class77.field1905[0], var38);
                }
            }
        }
        for (int var6 = 0; var6 < class86.field2151; var6++) {
            class149 var31 = class149.field3691[class9.field232[var6]];
            if (var31 != null && var31.method1032(-16)) {
                class46 var32 = var31.field3689;
                if (var32 != null && var32.field1104 != null) {
                    var32 = var32.method383((byte) -124);
                }
                if (var32 != null && var32.field1101 && var32.field1126) {
                    int var33 = var31.field3077 / 32 - class69.field1770.field3077 / 32;
                    int var34 = var31.field3115 / 32 - class69.field1770.field3115 / 32;
                    class126.method1035((byte) 78, var34, class77.field1905[1], var33);
                }
            }
        }
        for (int var7 = 0; var7 < class101.field2446; var7++) {
            class126 var23 = class59.field1571[class67.field1729[var7]];
            if (var23 != null && var23.method1032(-16)) {
                int var24 = var23.field3115 / 32 - class69.field1770.field3115 / 32;
                int var25 = var23.field3077 / 32 - class69.field1770.field3077 / 32;
                boolean var26 = false;
                long var27 = var23.field3034.method834(-97);
                for (int var29 = 0; var29 < class9.field230; var29++) {
                    if (class88.field2185[var29] == var27 && class59.field1589[var29] != 0) {
                        var26 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class69.field1770.field3040 != 0 && var23.field3040 != 0 && class69.field1770.field3040 == var23.field3040) {
                    var30 = true;
                }
                if (var26) {
                    class126.method1035((byte) 78, var24, class77.field1905[3], var25);
                } else if (var30) {
                    class126.method1035((byte) 78, var24, class77.field1905[4], var25);
                } else {
                    class126.method1035((byte) 78, var24, class77.field1905[2], var25);
                }
            }
        }
        if (class121.field2963 != 0 && class101.field2444 % 20 < 10) {
            if (class121.field2963 == 1 && class107.field2627 >= 0 && class107.field2627 < class149.field3691.length) {
                class149 var8 = class149.field3691[class107.field2627];
                if (var8 != null) {
                    int var9 = var8.field3115 / 32 - class69.field1770.field3115 / 32;
                    int var10 = var8.field3077 / 32 - class69.field1770.field3077 / 32;
                    class9.method110(105, var9, class132.field3226[1], var10);
                }
            }
            if (class121.field2963 == 2) {
                int var11 = (class126.field3046 - class67.field1712) * 4 + 2 - class69.field1770.field3115 / 32;
                int var12 = (class89.field2205 - class5.field120) * 4 + 2 - class69.field1770.field3077 / 32;
                class9.method110(-85, var11, class132.field3226[1], var12);
            }
            if (class121.field2963 == 10 && class130.field3188 >= 0 && class59.field1571.length > class130.field3188) {
                class126 var13 = class59.field1571[class130.field3188];
                if (var13 != null) {
                    int var14 = var13.field3115 / 32 - class69.field1770.field3115 / 32;
                    int var15 = var13.field3077 / 32 - class69.field1770.field3077 / 32;
                    class9.method110(-99, var14, class132.field3226[1], var15);
                }
            }
        }
        if (class69.field1765 != 0) {
            int var16 = class69.field1765 * 4 + 2 - class69.field1770.field3115 / 32;
            int var17 = class143.field3585 * 4 + 2 - class69.field1770.field3077 / 32;
            class126.method1035((byte) 78, var16, class132.field3226[0], var17);
        }
        class96.method794(97, 78, 3, 3, 16777215);
        if (class112.field2804 < 3) {
            class14.field349.method580(0, 0, 33, 33, 25, 25, class140.field3478, 256, class39.field974, class110.field2738);
        } else {
            int[] var18 = class96.field2330;
            byte[] var19 = class80.field1987.field566;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class80.field1987.field569 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var19[var21 + var22] == 0) {
                        var18[var21 + var22] = 0;
                    }
                }
            }
        }
        class100.method860(550);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
    public final int method362(byte arg0) {
        field1023++;
        int var2 = -15 / ((48 - arg0) / 61);
        if (this.field1012-- == 0) {
            this.method365(25597);
            this.field1012 = 255;
        }
        return this.field1026[this.field1012];
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static final void method363(byte arg0) {
        if (arg0 > -122) {
            field1024 = null;
        }
        field1034++;
        class1.field21.method998(true);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public static void method364(boolean arg0) {
        field1024 = null;
        field1009 = null;
        if (!arg0) {
            field1022 = null;
        }
        field1019 = null;
        field1029 = null;
        field1031 = null;
        field1036 = null;
        field1032 = null;
        field1022 = null;
        field1021 = null;
        field1016 = null;
        field1013 = null;
        field1030 = null;
        field1028 = null;
        field1035 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    private final void method365(int arg0) {
        if (arg0 != 25597) {
            field1036 = null;
        }
        field1037++;
        this.field1018 += ++this.field1027;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1010[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1025 ^= this.field1025 << 13;
                } else {
                    this.field1025 ^= this.field1025 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1025 ^= this.field1025 << 2;
            } else {
                this.field1025 ^= this.field1025 >>> 16;
            }
            this.field1025 += this.field1010[var2 + 128 & 0xFF];
            int var4;
            this.field1010[var2] = var4 = this.field1018 + this.field1010[class17.method171(var3 >> 2, 255)] + this.field1025;
            this.field1026[var2] = this.field1018 = var3 + this.field1010[class17.method171(261246, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    private final void method366(int arg0) {
        field1033++;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var65 ^ var62 << 8;
            int var67 = var5 + var64;
            int var68 = var4 + var66;
            int var69 = var62 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1026[var11 + 1] + var8;
            int var38 = this.field1026[var11 + 7] + var2;
            int var39 = this.field1026[var11 + 4] + var5;
            int var40 = this.field1026[var11 + 3] + var6;
            int var41 = this.field1026[var11 + 5] + var4;
            int var42 = this.field1026[var11 + 2] + var7;
            int var43 = this.field1026[var11] + var9;
            int var44 = this.field1026[var11 + 6] + var3;
            int var45 = var43 ^ var37 << 11;
            int var46 = var37 + var42;
            int var47 = var46 ^ var42 >>> 2;
            int var48 = var40 + var45;
            int var49 = var39 + var47;
            int var50 = var42 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var41 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var44;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var47;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field1010[var11] = var9;
            var7 = var2 + var51;
            this.field1010[var11 + 1] = var8;
            this.field1010[var11 + 2] = var7;
            this.field1010[var11 + 3] = var6;
            this.field1010[var11 + 4] = var5;
            this.field1010[var11 + 5] = var4;
            this.field1010[var11 + 6] = var3;
            this.field1010[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1010[var12 + 5] + var4;
            int var14 = this.field1010[var12 + 7] + var2;
            int var15 = this.field1010[var12] + var9;
            int var16 = this.field1010[var12 + 2] + var7;
            int var17 = this.field1010[var12 + 6] + var3;
            int var18 = this.field1010[var12 + 4] + var5;
            int var19 = this.field1010[var12 + 1] + var8;
            int var20 = var15 ^ var19 << 11;
            int var21 = this.field1010[var12 + 3] + var6;
            int var22 = var20 + var21;
            int var23 = var16 + var19;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var16 + var22;
            int var26 = var18 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var13 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var17;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var14;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var20;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field1010[var12] = var9;
            this.field1010[var12 + 1] = var8;
            this.field1010[var12 + 2] = var7;
            this.field1010[var12 + 3] = var6;
            this.field1010[var12 + 4] = var5;
            this.field1010[var12 + 5] = var4;
            this.field1010[var12 + 6] = var3;
            this.field1010[var12 + 7] = var2;
        }
        this.method365(25597);
        this.field1012 = 256;
        if (arg0 != 2031906672) {
            field1024 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([I)V")
    public class42(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1026[var2] = arg0[var2];
        }
        this.method366(2031906672);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)I")
    public static final int method367(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1011++;
        if (arg3 == 3699) {
            int var5 = 65536 - class40.field981[arg0 * 1024 / arg2] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg1 * var5 >> 16);
        } else {
            return 98;
        }
    }
}
