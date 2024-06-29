import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class117 {

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "[I")
    private int[] field2790 = new int[256];

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
    private int[] field2787 = new int[256];

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lae;")
    public static class6 field2769 = class64.method474(111, "backhmid2");

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lae;")
    private static class6 field2780 = class64.method474(113, "wishes to duel with you)3");

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lae;")
    private static class6 field2774 = class64.method474(123, "Error loading your profile)3");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lae;")
    public static class6 field2763 = field2780;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lae;")
    public static class6 field2772 = class64.method474(108, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
    public static boolean field2783 = false;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lae;")
    public static class6 field2760 = field2774;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lae;")
    private static class6 field2782 = class64.method474(114, "Enter object name");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Z")
    public static boolean field2768 = false;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lae;")
    public static class6 field2781 = field2782;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lae;")
    public static class6 field2788 = class64.method474(104, "backleft1");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lae;")
    public static class6 field2764 = class64.method474(111, "(U4");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field2776 = -1;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[Lm;")
    public static class77[] field2789 = new class77[2048];

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    private int field2767;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    private int field2785;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lq;")
    public static class101 field2779;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[[[B")
    public static byte[][][] field2759;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[Lte;IIIII)V", line = 9)
    public static final void method958(int arg0, int arg1, int arg2, int arg3, class121[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2786++;
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class121 var11 = arg4[var10];
            if (var11 != null && (var11.field2971 == 0 || var11.field2911) && var11 != null && var11.field2915 == arg0 && !var11.method980(117, class30.field717)) {
                int var12 = var11.field2967 + arg1 - arg7;
                int var13 = var11.field2879 + arg9 - arg3;
                int var14 = var11.field2984 + var12;
                int var15 = var13 + var11.field2872;
                int var16 = var13 <= arg9 ? arg9 : var13;
                int var17 = arg6 > var14 ? var14 : arg6;
                int var18 = arg1 < var12 ? var12 : arg1;
                int var19 = var15 < arg5 ? var15 : arg5;
                if (var11.field2971 == 0) {
                    method958(var11.field2960, var18, arg2, var11.field2847, arg4, var19, var17, var11.field2936, arg8, var16);
                    if (var11.field2885 != null) {
                        method958(var11.field2960, var18, 1, var11.field2847, var11.field2885, var19, var17, var11.field2936, arg8, var16);
                    }
                }
                if (var11.field2911) {
                    boolean var20 = false;
                    boolean var21;
                    if (field2771 >= var18 && class57.field1244 >= var16 && var17 > field2771 && var19 > class57.field1244) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    boolean var22 = false;
                    if (class54.field1198 == 1 && var21) {
                        var20 = true;
                    }
                    if (class89.field2140 == 1 && class52.field1170 >= var18 && class116.field2728 >= var16 && var17 > class52.field1170 && class116.field2728 < var19) {
                        var22 = true;
                    }
                    if (var22 && class100.field2341 == null && (arg8 & 0x200) != 0 && !class125.field3052 && class81.method693(var11, (byte) -128) != null) {
                        class129.field3143 = class57.field1244;
                        class109.field2646 = 0;
                        class22.field576 = field2771;
                        class100.field2341 = var11;
                        class67.field1474 = false;
                    }
                    if (class100.field2341 != null || class125.field3052) {
                        var21 = false;
                        var22 = false;
                        var20 = false;
                    }
                    if (!var11.field2986 && var22 && (arg8 & 0x1) != 0) {
                        var11.field2986 = true;
                        if (var11.field2898 != null) {
                            class76.method612(0, var11.field2898, null, 125, class52.field1170 - var12, var11, class116.field2728 - var13);
                        }
                    }
                    if (var11.field2986 && var20 && (arg8 & 0x4) != 0 && var11.field2908 != null) {
                        class76.method612(0, var11.field2908, null, -119, field2771 - var12, var11, class57.field1244 - var13);
                    }
                    if (var11.field2986 && !var20 && (arg8 & 0x2) != 0) {
                        var11.field2986 = false;
                        if (var11.field2961 != null) {
                            class76.method612(0, var11.field2961, null, 122, field2771 - var12, var11, class57.field1244 - var13);
                        }
                    }
                    if (var20 && (arg8 & 0x8) != 0 && var11.field2956 != null) {
                        class76.method612(0, var11.field2956, null, 118, field2771 - var12, var11, class57.field1244 - var13);
                    }
                    if (!var11.field2906 && var21 && (arg8 & 0x10) != 0) {
                        var11.field2906 = true;
                        if (var11.field2877 != null) {
                            class76.method612(0, var11.field2877, null, 127, field2771 - var12, var11, class57.field1244 - var13);
                        }
                    }
                    if (var11.field2906 && var21 && (arg8 & 0x40) != 0 && var11.field2948 != null) {
                        class76.method612(0, var11.field2948, null, arg2 - 122, -var12 + field2771, var11, class57.field1244 - var13);
                    }
                    if (var11.field2906 && !var21 && (arg8 & 0x20) != 0) {
                        var11.field2906 = false;
                        if (var11.field2977 != null) {
                            class76.method612(0, var11.field2977, null, -44, field2771 - var12, var11, class57.field1244 - var13);
                        }
                    }
                    if (var11.field2873 != null && (arg8 & 0x80) != 0) {
                        class76.method612(0, var11.field2873, null, 106, 0, var11, 0);
                    }
                    if (var21 && class122.field3005 != 0 && var11.field2902 != null && (arg8 & 0x400) != 0) {
                        class76.method612(0, var11.field2902, null, -86, 0, var11, class122.field3005);
                    }
                    if ((arg8 & 0x100) != 0) {
                        if (var11.field2869 < class133.field3246 && var11.field2979 != null) {
                            class76.method612(0, var11.field2979, null, -19, 0, var11, 0);
                        }
                        if (class77.field1851 > var11.field2869 && var11.field2933 != null) {
                            class76.method612(0, var11.field2933, null, arg2 ^ 0x7A, 0, var11, 0);
                        }
                        if (var11.field2869 < client.field468 && var11.field2934 != null) {
                            class76.method612(0, var11.field2934, null, 123, 0, var11, 0);
                        }
                        var11.field2869 = class5.field61;
                    }
                }
            }
        }
        if (arg2 != 1) {
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I", line = 190)
    public final int method959(byte arg0) {
        if (this.field2773-- == 0) {
            this.method962(true);
            this.field2773 = 255;
        }
        if (arg0 <= 124) {
            return -20;
        } else {
            field2770++;
            return this.field2790[this.field2773];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 233)
    private final void method960(int arg0) {
        field2775++;
        if (arg0 < 59) {
            field2780 = null;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
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
            int var37 = this.field2790[var11 + 2] + var7;
            int var38 = this.field2790[var11 + 4] + var5;
            int var39 = this.field2790[var11] + var9;
            int var40 = this.field2790[var11 + 5] + var4;
            int var41 = this.field2790[var11 + 6] + var3;
            int var42 = this.field2790[var11 + 1] + var8;
            int var43 = var39 ^ var42 << 11;
            int var44 = this.field2790[var11 + 3] + var6;
            int var45 = var43 + var44;
            int var46 = this.field2790[var11 + 7] + var2;
            int var47 = var37 + var42;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var37 + var45;
            int var50 = var38 + var48;
            int var51 = var49 ^ var45 << 8;
            int var52 = var45 + var50;
            var6 = var52 ^ var50 >>> 16;
            int var53 = var6 + var41;
            int var54 = var40 + var51;
            int var55 = var50 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var46;
            var4 = var56 ^ var53 >>> 4;
            int var58 = var4 + var43;
            int var59 = var53 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field2787[var11] = var9;
            this.field2787[var11 + 1] = var8;
            this.field2787[var11 + 2] = var7;
            this.field2787[var11 + 3] = var6;
            this.field2787[var11 + 4] = var5;
            this.field2787[var11 + 5] = var4;
            this.field2787[var11 + 6] = var3;
            this.field2787[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2787[var12 + 1] + var8;
            int var14 = this.field2787[var12] + var9;
            int var15 = this.field2787[var12 + 2] + var7;
            int var16 = this.field2787[var12 + 6] + var3;
            int var17 = var14 ^ var13 << 11;
            int var18 = this.field2787[var12 + 3] + var6;
            int var19 = this.field2787[var12 + 7] + var2;
            int var20 = var17 + var18;
            int var21 = this.field2787[var12 + 4] + var5;
            int var22 = var13 + var15;
            int var23 = var22 ^ var15 >>> 2;
            int var24 = var15 + var20;
            int var25 = var24 ^ var20 << 8;
            int var26 = var21 + var23;
            int var27 = this.field2787[var12 + 5] + var4;
            int var28 = var20 + var26;
            var6 = var28 ^ var26 >>> 16;
            int var29 = var6 + var16;
            int var30 = var25 + var27;
            int var31 = var26 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var29 >>> 4;
            int var33 = var4 + var17;
            int var34 = var5 + var19;
            int var35 = var29 + var34;
            var3 = var35 ^ var34 << 8;
            int var36 = var33 + var34;
            var2 = var36 ^ var33 >>> 9;
            var7 = var2 + var25;
            var8 = var3 + var23;
            var9 = var8 + var33;
            this.field2787[var12] = var9;
            this.field2787[var12 + 1] = var8;
            this.field2787[var12 + 2] = var7;
            this.field2787[var12 + 3] = var6;
            this.field2787[var12 + 4] = var5;
            this.field2787[var12 + 5] = var4;
            this.field2787[var12 + 6] = var3;
            this.field2787[var12 + 7] = var2;
        }
        this.method962(true);
        this.field2773 = 256;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 389)
    public static void method961(boolean arg0) {
        field2780 = null;
        field2769 = null;
        field2789 = null;
        if (arg0) {
            return;
        }
        field2764 = null;
        field2759 = null;
        field2772 = null;
        field2781 = null;
        field2760 = null;
        field2763 = null;
        field2779 = null;
        field2788 = null;
        field2782 = null;
        field2774 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 416)
    private final void method962(boolean arg0) {
        field2765++;
        if (!arg0) {
            return;
        }
        this.field2761 += ++this.field2767;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2787[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2785 ^= this.field2785 << 13;
                } else {
                    this.field2785 ^= this.field2785 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2785 ^= this.field2785 << 2;
            } else {
                this.field2785 ^= this.field2785 >>> 16;
            }
            this.field2785 += this.field2787[var2 + 128 & 0xFF];
            int var4;
            this.field2787[var2] = var4 = this.field2785 + this.field2787[class60.method451(1020, var3) >> 2] + this.field2761;
            this.field2790[var2] = this.field2761 = this.field2787[class60.method451(var4, 261338) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 458)
    public static final void method963(int arg0) {
        class47.field1063.method941(arg0 + 1540585344);
        if (arg0 != -1540585334) {
            method964(10);
        }
        field2777++;
        class26.field663.method1036(0, 0);
        class104.field2477 = class29.method258(class104.field2477);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 516)
    public static final void method964(int arg0) {
        if (class67.field1491 != null) {
            class67.field1491.method207(-2158);
            class67.field1491 = null;
        }
        class122.method1002(false);
        field2778++;
        class81.field1967.method543();
        for (int var1 = 0; var1 < 4; var1++) {
            class90.field2160[var1].method382((byte) -110);
        }
        if (arg0 != 7641) {
            method963(62);
        }
        System.gc();
        class70.method519((byte) -100, 10);
        class138.field3360 = -1;
        class21.field519 = 0;
        class100.method844((byte) 115);
        class139.method1122((byte) 40, 10);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([I)V", line = 566)
    public class117(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2790[var2] = arg0[var2];
        }
        this.method960(102);
    }
}
