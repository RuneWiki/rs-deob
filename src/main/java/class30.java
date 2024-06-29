import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class30 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[I")
    private int[] field445;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "[I")
    private int[] field444;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field436 = 1;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Lld;")
    public static class274 field443 = null;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lok;")
    private static class41 field441 = class137.method956("Loaded textures", 45);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Lok;")
    public static class41 field431 = field441;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class101.field1445 == 0) {
            int var7 = class174.field2826;
            class251.field3997++;
            int var8 = class302.field5003;
            int var9 = class22.field327;
            int var10 = (arg1 - arg3) * (var9 - var7) / arg0 + var7;
            int var11 = class50.field760;
            int var12 = (arg4 - arg5) * (var11 - var8) / arg2 + var8;
            if (class128.field1901 && (class193.field3108 & 0x40) == 64) {
                class302 var13 = class79.method567(-120, class3.field44, class75.field1119);
                if (var13 == null) {
                    class118.method845((byte) 104);
                } else {
                    class79.method565(0L, class75.field1115, (byte) 95, (short) 47, var10, class94.field1389, var12);
                }
            } else {
                class79.method565(0L, class266.field4233, (byte) 124, (short) 36, var10, class26.field384, var12);
            }
        }
        long var14 = -1L;
        if (arg6 != -22191) {
            field441 = (class41) null;
        }
        for (int var16 = 0; var16 < class268.field4316; var16++) {
            long var17 = class91.field1315[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var17 >> 29 & 0x3;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class68.method496(class55.field807, var19, var20, var17)) {
                    class171 var23 = class234.method1684(-2441, var21);
                    if (var23.field2745 != null) {
                        var23 = var23.method1230(false);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class101.field1445 == 1) {
                        class242.field3871++;
                        class79.method565(var17, class187.method1346(new class41[] { class74.field1096, class177.field2870, var23.field2737 }, 0), (byte) 112, (short) 41, var19, class18.field237, var20);
                    } else if (!class128.field1901) {
                        class122.field1800++;
                        class41[] var24 = var23.field2775;
                        if (class69.field1030) {
                            var24 = class153.method1089(var24, true);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class20.field307++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 3;
                                    }
                                    if (var25 == 1) {
                                        var26 = 57;
                                    }
                                    if (var25 == 2) {
                                        var26 = 44;
                                    }
                                    if (var25 == 3) {
                                        var26 = 40;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class79.method565(var17, class187.method1346(new class41[] { class37.field576, var23.field2737 }, 0), (byte) 58, var26, var19, var24[var25], var20);
                                }
                            }
                        }
                        class79.method565((long) var23.field2733, class187.method1346(new class41[] { class37.field576, var23.field2737 }, 0), (byte) 70, (short) 1007, var19, class315.field5311, var20);
                    } else if ((class193.field3108 & 0x4) == 4) {
                        class79.method565(var17, class187.method1346(new class41[] { class126.field1871, class177.field2870, var23.field2737 }, 0), (byte) 123, (short) 34, var19, class94.field1389, var20);
                        class283.field4598++;
                    }
                }
                if (var22 == 1) {
                    class50 var27 = class216.field3471[var21];
                    if (var27.field758.field2251 == 1 && (var27.field4280 & 0x7F) == 64 && (var27.field4311 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class97.field1419; var28++) {
                            class50 var29 = class216.field3471[class101.field1441[var28]];
                            if (var29 != null && var27 != var29 && var29.field758.field2251 == 1 && var27.field4280 == var29.field4280 && var27.field4311 == var29.field4311) {
                                class292.method2021(var29.field758, 72, var19, var20, class101.field1441[var28]);
                            }
                        }
                        for (int var30 = 0; var30 < class85.field1248; var30++) {
                            class245 var31 = class246.field3955[class118.field1737[var30]];
                            if (var31 != null && var27.field4280 == var31.field4280 && var27.field4311 == var31.field4311) {
                                class317.method2186(class118.field1737[var30], 24, var31, var20, var19);
                            }
                        }
                    }
                    class292.method2021(var27.field758, 48, var19, var20, var21);
                }
                if (var22 == 0) {
                    class245 var32 = class246.field3955[var21];
                    if ((var32.field4280 & 0x7F) == 64 && (var32.field4311 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class97.field1419; var33++) {
                            class50 var34 = class216.field3471[class101.field1441[var33]];
                            if (var34 != null && var34.field758.field2251 == 1 && var32.field4280 == var34.field4280 && var32.field4311 == var34.field4311) {
                                class292.method2021(var34.field758, -65, var19, var20, class101.field1441[var33]);
                            }
                        }
                        for (int var35 = 0; var35 < class85.field1248; var35++) {
                            class245 var36 = class246.field3955[class118.field1737[var35]];
                            if (var36 != null && var32 != var36 && var32.field4280 == var36.field4280 && var32.field4311 == var36.field4311) {
                                class317.method2186(class118.field1737[var35], 101, var36, var20, var19);
                            }
                        }
                    }
                    class317.method2186(var21, 48, var32, var20, var19);
                }
                if (var22 == 3) {
                    class212 var37 = class81.field1199[class55.field807][var19][var20];
                    if (var37 != null) {
                        for (class295 var38 = (class295) var37.method1504((byte) 124); var38 != null; var38 = (class295) var37.method1502(15469)) {
                            int var39 = var38.field4772.field3290;
                            class138 var40 = class130.method918(var39, arg6 ^ 0x56B5);
                            if (class101.field1445 == 1) {
                                class175.field2841++;
                                class79.method565((long) var39, class187.method1346(new class41[] { class74.field1096, class234.field3731, var40.field2120 }, 0), (byte) 74, (short) 49, var19, class18.field237, var20);
                            } else if (!class128.field1901) {
                                class156.field2459++;
                                class41[] var41 = var40.field2094;
                                if (class69.field1030) {
                                    var41 = class153.method1089(var41, true);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class159.field2488++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 23;
                                        }
                                        if (var42 == 1) {
                                            var43 = 16;
                                        }
                                        if (var42 == 2) {
                                            var43 = 12;
                                        }
                                        if (var42 == 3) {
                                            var43 = 22;
                                        }
                                        if (var42 == 4) {
                                            var43 = 29;
                                        }
                                        class79.method565((long) var39, class187.method1346(new class41[] { class78.field1155, var40.field2120 }, 0), (byte) 82, var43, var19, var41[var42], var20);
                                    } else if (var42 == 2) {
                                        class311.field5258++;
                                        class79.method565((long) var39, class187.method1346(new class41[] { class78.field1155, var40.field2120 }, 0), (byte) 45, (short) 12, var19, class137.field2050, var20);
                                    }
                                }
                                class79.method565((long) var39, class187.method1346(new class41[] { class78.field1155, var40.field2120 }, arg6 ^ 0xFFFFA951), (byte) 75, (short) 1001, var19, class315.field5311, var20);
                            } else if ((class193.field3108 & 0x1) == 1) {
                                class131.field1958++;
                                class79.method565((long) var39, class187.method1346(new class41[] { class126.field1871, class234.field3731, var40.field2120 }, 0), (byte) 93, (short) 11, var19, class94.field1389, var20);
                            }
                        }
                    }
                }
            }
        }
        field438++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 332)
    public static void method187(byte arg0) {
        field441 = null;
        if (arg0 < 89) {
            field429 = 103;
        }
        field431 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 347)
    private final void method188(int arg0) {
        field432++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var5 + var14;
            int var18 = var4 + var16;
            int var19 = var12 + var17;
            var6 = var19 ^ var17 >>> 16;
            int var20 = var3 + var6;
            int var21 = var17 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var18 + var20;
            var4 = var22 ^ var20 >>> 4;
            int var23 = var2 + var5;
            int var24 = var4 + var11;
            int var25 = var20 + var23;
            var3 = var25 ^ var23 << 8;
            int var26 = var23 + var24;
            var8 = var3 + var14;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var16;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field445[var27 + 3] + var6;
            int var29 = this.field445[var27 + 4] + var5;
            int var30 = this.field445[var27] + var9;
            int var31 = this.field445[var27 + 1] + var8;
            int var32 = this.field445[var27 + 6] + var3;
            int var33 = this.field445[var27 + 2] + var7;
            int var34 = this.field445[var27 + 5] + var4;
            int var35 = var30 ^ var31 << 11;
            int var36 = this.field445[var27 + 7] + var2;
            int var37 = var28 + var35;
            int var38 = var31 + var33;
            int var39 = var38 ^ var33 >>> 2;
            int var40 = var29 + var39;
            int var41 = var33 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var34 + var42;
            int var44 = var37 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var40 + var43;
            var5 = var45 ^ var43 << 10;
            int var46 = var6 + var32;
            int var47 = var5 + var36;
            int var48 = var43 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var4 + var35;
            int var50 = var46 + var47;
            var3 = var50 ^ var47 << 8;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var8 = var3 + var39;
            var9 = var8 + var49;
            this.field444[var27] = var9;
            this.field444[var27 + 1] = var8;
            var7 = var2 + var42;
            this.field444[var27 + 2] = var7;
            this.field444[var27 + 3] = var6;
            this.field444[var27 + 4] = var5;
            this.field444[var27 + 5] = var4;
            this.field444[var27 + 6] = var3;
            this.field444[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field444[var52 + 1] + var8;
            int var54 = this.field444[var52 + 7] + var2;
            int var55 = this.field444[var52 + 4] + var5;
            int var56 = this.field444[var52 + 2] + var7;
            int var57 = this.field444[var52] + var9;
            int var58 = this.field444[var52 + 3] + var6;
            int var59 = var57 ^ var53 << 11;
            int var60 = this.field444[var52 + 5] + var4;
            int var61 = this.field444[var52 + 6] + var3;
            int var62 = var53 + var56;
            int var63 = var58 + var59;
            int var64 = var62 ^ var56 >>> 2;
            int var65 = var56 + var63;
            int var66 = var65 ^ var63 << 8;
            int var67 = var55 + var64;
            int var68 = var60 + var66;
            int var69 = var63 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var6 + var61;
            int var72 = var5 + var54;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var59;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var66;
            this.field444[var52] = var9;
            this.field444[var52 + 1] = var8;
            this.field444[var52 + 2] = var7;
            this.field444[var52 + 3] = var6;
            this.field444[var52 + 4] = var5;
            this.field444[var52 + 5] = var4;
            this.field444[var52 + 6] = var3;
            this.field444[var52 + 7] = var2;
        }
        this.method192(true);
        this.field434 = 256;
        if (arg0 < 118) {
            method190(-107, -74, 54);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I", line = 495)
    public final int method189(byte arg0) {
        if ((this.field434--) == 0) {
            this.method192(true);
            this.field434 = 255;
        }
        field439++;
        int var2 = -61 % ((71 - arg0) / 52);
        return this.field445[this.field434];
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)J", line = 514)
    public static final long method190(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        return var3 == null || var3.field5208 == null ? 0L : var3.field5208.field3184;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 525)
    public static final void method191(byte arg0) {
        field430++;
        if (arg0 != -101) {
            return;
        }
        for (class35 var1 = (class35) class199.field3196.method1495(-312); var1 != null; var1 = (class35) class199.field3196.method1501(-78)) {
            class160 var2 = var1.field518;
            if (class55.field807 != var2.field2506 || class18.field234 > var2.field2503) {
                var1.method418(arg0 + 7072);
            } else if (class18.field234 >= var2.field2521) {
                if (var2.field2513 > 0) {
                    class50 var3 = class216.field3471[var2.field2513 - 1];
                    if (var3 != null && var3.field4280 >= 0 && var3.field4280 < 13312 && var3.field4311 >= 0 && var3.field4311 < 13312) {
                        var2.method1131(class18.field234, var3.field4311, 1, class140.method983((byte) 89, var2.field2506, var3.field4280, var3.field4311) - var2.field2498, var3.field4280);
                    }
                }
                if (var2.field2513 < 0) {
                    int var4 = -var2.field2513 - 1;
                    class245 var5;
                    if (class204.field3300 == var4) {
                        var5 = class62.field913;
                    } else {
                        var5 = class246.field3955[var4];
                    }
                    if (var5 != null && var5.field4280 >= 0 && var5.field4280 < 13312 && var5.field4311 >= 0 && var5.field4311 < 13312) {
                        var2.method1131(class18.field234, var5.field4311, 1, class140.method983((byte) 104, var2.field2506, var5.field4280, var5.field4311) - var2.field2498, var5.field4280);
                    }
                }
                var2.method1128(0, class140.field2163);
                class238.method1709(class55.field807, (int) var2.field2504, (int) var2.field2501, (int) var2.field2517, 60, var2, var2.field2532, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 596)
    private final void method192(boolean arg0) {
        field433++;
        if (!arg0) {
            this.field444 = (int[]) null;
        }
        this.field442 += ++this.field437;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field444[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field435 ^= this.field435 << 13;
                } else {
                    this.field435 ^= this.field435 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field435 ^= this.field435 << 2;
            } else {
                this.field435 ^= this.field435 >>> 16;
            }
            this.field435 += this.field444[var2 + 128 & 0xFF];
            int var4;
            this.field444[var2] = var4 = this.field435 + (this.field444[class217.method1563(var3 >> 2, 255)] + this.field442);
            this.field445[var2] = this.field442 = this.field444[class217.method1563(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 639)
    private class30() {
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "([I)V", line = 647)
    public class30(int[] arg0) {
        this.field445 = new int[256];
        this.field444 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field445[var2] = arg0[var2];
        }
        this.method188(121);
    }
}
