import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class176 extends class82 {

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "[B")
    public byte[] field2699;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "[S")
    public short[] field2700;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[B")
    public byte[] field2688;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "[Lae;")
    public class173[] field2698;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "[I")
    private int[] field2689;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[Ljk;")
    public class260[] field2686;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[B")
    public byte[] field2684;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2692 = "Unable to find ";

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field2695 = 0;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2691 = 0;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field2693 = -1;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Lpf;")
    public static class294 field2690;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "Lpf;")
    public static class294 field2697;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1089(class294 arg0, int arg1) {
        field2685++;
        if (class226.field3389) {
            return;
        }
        class111.method705();
        if (arg1 != -32599) {
            method1093(88);
        }
        class174.field2646 = class206.method1305(20527, arg0, class159.field2452);
        int var2 = class180.field2748;
        int var3 = var2 * 956 / 503;
        class174.field2646.method1283((class77.field1245 - var3) / 2, 0, var3, var2);
        class149.field2162 = class93.method595(-61, arg0, class268.field4037);
        class149.field2162.method1118(class77.field1245 / 2 - (class149.field2162.field3887 / 2), 18);
        class226.field3389 = true;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public final void method1090(int arg0) {
        field2687++;
        if (arg0 < 82) {
            field2697 = null;
        }
        this.field2689 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([B[ILof;I)Z")
    public final boolean method1091(byte[] arg0, int[] arg1, class274 arg2, int arg3) {
        field2694++;
        int var5 = 0;
        class260 var6 = null;
        boolean var7 = true;
        int var8 = 0;
        if (arg3 != 1387) {
            return false;
        }
        while (var8 < 128) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2689[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method1817(arg1, 0, var9 >> 2);
                        } else {
                            var6 = arg2.method1820(-2, var9 >> 2, arg1);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2686[var8] = var6;
                        this.field2689[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var7;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ldd;IIIIIIZ)V")
    public static final void method1092(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1973.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1973[var9] - class274.field4127;
            int var23 = arg0.field1975[var9] - class239.field3593;
            int var24 = arg0.field1978[var9] - class136.field1998;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1984 != null) {
                class135.field1979[var9] = var25;
                class135.field1969[var9] = var28;
                class135.field1971[var9] = var29;
            }
            class135.field1974[var9] = (var25 << 9) / var29 + class249.field3782;
            class135.field1972[var9] = (var28 << 9) / var29 + class249.field3780;
        }
        class249.field3768 = 0;
        int var10 = arg0.field1985.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1985[var11];
            int var13 = arg0.field1967[var11];
            int var14 = arg0.field1983[var11];
            int var15 = class135.field1974[var12];
            int var16 = class135.field1974[var13];
            int var17 = class135.field1974[var14];
            int var18 = class135.field1972[var12];
            int var19 = class135.field1972[var13];
            int var20 = class135.field1972[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class26.field327 && class139.method854(class249.field3782 + class175.field2659, class96.field1522 + class249.field3780, var18, var19, var20, var15, var16, var17)) {
                    class41.field607 = arg5;
                    class54.field878 = arg6;
                }
                if (!arg7) {
                    class249.field3773 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class249.field3769 || var16 > class249.field3769 || var17 > class249.field3769) {
                        class249.field3773 = true;
                    }
                    if (arg0.field1984 == null || arg0.field1984[var11] == -1) {
                        if (arg0.field1986[var11] != 12345678) {
                            class249.method1640(var18, var19, var20, var15, var16, var17, arg0.field1986[var11], arg0.field1980[var11], arg0.field1976[var11]);
                        }
                    } else if (!class189.field2896) {
                        int var21 = class249.field3775.method1308(arg0.field1984[var11], -8604);
                        class249.method1640(var18, var19, var20, var15, var16, var17, class61.method411(var21, arg0.field1986[var11]), class61.method411(var21, arg0.field1980[var11]), class61.method411(var21, arg0.field1976[var11]));
                    } else if (arg0.field1968) {
                        class249.method1633(var18, var19, var20, var15, var16, var17, arg0.field1986[var11], arg0.field1980[var11], arg0.field1976[var11], class135.field1979[0], class135.field1979[1], class135.field1979[3], class135.field1969[0], class135.field1969[1], class135.field1969[3], class135.field1971[0], class135.field1971[1], class135.field1971[3], arg0.field1984[var11]);
                    } else {
                        class249.method1633(var18, var19, var20, var15, var16, var17, arg0.field1986[var11], arg0.field1980[var11], arg0.field1976[var11], class135.field1979[var12], class135.field1979[var13], class135.field1979[var14], class135.field1969[var12], class135.field1969[var13], class135.field1969[var14], class135.field1971[var12], class135.field1971[var13], class135.field1971[var14], arg0.field1984[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
    public static void method1093(int arg0) {
        field2692 = null;
        field2697 = null;
        if (arg0 == 0) {
            field2690 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class176() {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "([B)V")
    public class176(byte[] arg0) {
        this.field2699 = new byte[128];
        this.field2700 = new short[128];
        this.field2688 = new byte[128];
        this.field2698 = new class173[128];
        this.field2689 = new int[128];
        this.field2686 = new class260[128];
        int var2 = 0;
        this.field2684 = new byte[128];
        class248 var3 = new class248(arg0);
        while (var3.field3723[var3.field3748 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1604(4);
        }
        var3.field3748++;
        int var6 = var3.field3748;
        var2++;
        int var7 = 0;
        var3.field3748 += var2;
        while (var3.field3723[var3.field3748 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1604(4);
        }
        var7++;
        var3.field3748++;
        int var10 = var3.field3748;
        var3.field3748 += var7;
        int var11;
        for (var11 = 0; var3.field3723[var3.field3748 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1604(4);
        }
        var3.field3748++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1593((byte) 27);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class173[] var18 = new class173[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class173 var102 = var18[var19] = new class173();
            int var103 = var3.method1593((byte) 27);
            if (var103 > 0) {
                var102.field2636 = new byte[var103 * 2];
            }
            int var104 = var3.method1593((byte) 27);
            if (var104 > 0) {
                var102.field2629 = new byte[var104 * 2 + 2];
                var102.field2629[1] = 64;
            }
        }
        int var20 = var3.method1593((byte) 27);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method1593((byte) 27);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field3723[var3.field3748 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method1604(4);
        }
        var3.field3748++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1593((byte) 27);
            this.field2700[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1593((byte) 27);
            this.field2700[var30] = (short) (this.field2700[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method1616((byte) 94);
            }
            this.field2700[var34] = (short) (this.field2700[var34] + (class94.method598(var33 - 1, 2) << 14));
            var31--;
            this.field2689[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2689[var38] != 0) {
                if (var35 == 0) {
                    var37 = var3.field3723[var6++] - 1;
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field2688[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2689[var42] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var39) {
                        var41 = -1;
                    } else {
                        var41 = var8[var39++];
                    }
                    var40 = var3.field3723[var10++] + 16 << 2;
                }
                this.field2699[var42] = (byte) var40;
                var41--;
            }
        }
        int var43 = 0;
        class173 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2689[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var45 < var12.length) {
                        var43 = var12[var45++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field2698[var46] = var44;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var48) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field2689[var50] > 0) {
                    var49 = var3.method1593((byte) 27) + 1;
                }
            }
            this.field2684[var50] = (byte) var49;
            var47--;
        }
        this.field2696 = var3.method1593((byte) 27) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class173 var99 = var18[var51];
            if (var99.field2636 != null) {
                for (int var100 = 1; var100 < var99.field2636.length; var100 += 2) {
                    var99.field2636[var100] = var3.method1604(4);
                }
            }
            if (var99.field2629 != null) {
                for (int var101 = 3; var101 < (var99.field2629.length - 2); var101 += 2) {
                    var99.field2629[var101] = var3.method1604(4);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1604(4);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1604(4);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class173 var96 = var18[var54];
            if (var96.field2629 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2629.length; var98 += 2) {
                    var97 = var97 + var3.method1593((byte) 27) + 1;
                    var96.field2629[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class173 var93 = var18[var55];
            if (var93.field2636 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2636.length; var95 += 2) {
                    var94 = var3.method1593((byte) 27) + var94 + 1;
                    var93.field2636[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1593((byte) 27);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method1593((byte) 27) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field2684[var60] = (byte) (this.field2684[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var59) * var58 + ((var64 - var59) / 2);
                var61 += 2;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class82.method540(true, var64 - var59, var66);
                    this.field2684[var67] = (byte) (this.field2684[var67] * var68 + 32 >> 6);
                    var66 += var65 - var58;
                }
                var59 = var64;
                var58 = var65;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field2684[var62] = (byte) (this.field2684[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method1593((byte) 27);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = (var69 + var3.method1593((byte) 27)) + 1;
                var23[var70] = (byte) var69;
            }
            int var71 = var23[1] << 1;
            byte var72 = var23[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field2699[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2699[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = (var78 - var72) / 2 + (var78 - var72) * var71;
                int var80 = var23[var74 + 1] << 1;
                for (int var81 = var72; var81 < var78; var81++) {
                    int var82 = class82.method540(true, var78 - var72, var79);
                    var79 += var80 - var71;
                    int var83 = (this.field2699[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2699[var81] = (byte) var83;
                }
                var72 = var78;
                var71 = var80;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field2699[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2699[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2641 = var3.method1593((byte) 27);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class173 var92 = var18[var86];
            if (var92.field2636 != null) {
                var92.field2640 = var3.method1593((byte) 27);
            }
            if (var92.field2629 != null) {
                var92.field2639 = var3.method1593((byte) 27);
            }
            if (var92.field2641 > 0) {
                var92.field2630 = var3.method1593((byte) 27);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2642 = var3.method1593((byte) 27);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class173 var91 = var18[var88];
            if (var91.field2642 > 0) {
                var91.field2643 = var3.method1593((byte) 27);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class173 var90 = var18[var89];
            if (var90.field2643 > 0) {
                var90.field2623 = var3.method1593((byte) 27);
            }
        }
    }
}
