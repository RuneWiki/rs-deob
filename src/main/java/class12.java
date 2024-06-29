import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class45 {

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public int field382 = 0;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public int field380 = -1;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public int field385 = -1;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "Z")
    public boolean field389 = true;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field383 = 0;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "Lkd;")
    private static class73 field394 = class126.method1070((byte) -66, "Loaded wordpack");

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lkd;")
    private static class73 field379 = class126.method1070((byte) -66, "glow1:");

    @OriginalMember(owner = "client!bd", name = "pb", descriptor = "Z")
    public static boolean field402 = false;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "Lkd;")
    public static class73 field381 = field379;

    @OriginalMember(owner = "client!bd", name = "ob", descriptor = "Lkd;")
    public static class73 field401 = field379;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "Lkd;")
    public static class73 field390 = field394;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!bd", name = "qb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!bd", name = "rb", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!bd", name = "sb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!bd", name = "tb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "[[[B")
    public static byte[][][] field400;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILqc;)V")
    private final void method103(int arg0, byte arg1, int arg2, class114 arg3) {
        if (arg2 == 1) {
            this.field382 = arg3.method933(-128);
        } else if (arg2 == 2) {
            this.field385 = arg3.method957((byte) 119);
        } else if (arg2 == 5) {
            this.field389 = false;
        } else if (arg2 == 7) {
            this.field380 = arg3.method933(-126);
        }
        field387++;
        if (arg1 != -40) {
            this.field404 = 49;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field381 = null;
        field401 = null;
        field390 = null;
        field379 = null;
        field394 = null;
        if (arg0 >= -60) {
            field390 = null;
        }
        field400 = null;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static final void method105(int arg0) {
        field396++;
        if (class103.field2567 == 0 && !class50.field1329) {
            class80.method684(class9.field298, false, 48, class139.field3446, class31.field869, class3.field161, 0);
            class139.field3445++;
        }
        int var1 = -1;
        if (arg0 >= -24) {
            method107(-112, (byte) 121, 41);
        }
        for (int var2 = 0; var2 < class91.field2349; var2++) {
            int var3 = class91.field2365[var2];
            int var4 = var3 >> 29 & 0x3;
            int var5 = var3 & 0x7F;
            int var6 = var3 >> 7 & 0x7F;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var4 == 2 && class34.field923.method62(class11.field320, var5, var6, var3) >= 0) {
                    class149 var8 = class122.method1045(31, var7);
                    if (var8.field3691 != null) {
                        var8 = var8.method1201((byte) 122);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class103.field2567 == 1) {
                        class80.method684(class32.method258(-73, new class73[] { class5.field192, class79.field2001, var8.field3693 }), false, 6, class87.field2189, var5, var6, var3);
                        class5.field193++;
                    } else if (!class50.field1329) {
                        class61.field1607++;
                        class73[] var9 = var8.field3655;
                        if (class33.field915) {
                            var9 = class143.method1155(false, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class2.field153++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 47;
                                    }
                                    if (var10 == 1) {
                                        var11 = 39;
                                    }
                                    if (var10 == 2) {
                                        var11 = 14;
                                    }
                                    if (var10 == 3) {
                                        var11 = 32;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1006;
                                    }
                                    class80.method684(class32.method258(-59, new class73[] { class143.field3565, var8.field3693 }), false, var11, var9[var10], var5, var6, var3);
                                }
                            }
                        }
                        class80.method684(class32.method258(-62, new class73[] { class143.field3565, var8.field3693 }), false, 1001, class86.field2178, var5, var6, var8.field3640 << 14);
                    } else if ((class94.field2392 & 0x4) == 4) {
                        class80.method684(class32.method258(-80, new class73[] { class121.field3102, class79.field2001, var8.field3693 }), false, 12, class57.field1511, var5, var6, var3);
                        class121.field3089++;
                    }
                }
                if (var4 == 1) {
                    class9 var12 = class133.field3345[var7];
                    if (var12.field301.field800 == 1 && (var12.field2277 & 0x7F) == 64 && (var12.field2264 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < client.field618; var13++) {
                            class9 var16 = class133.field3345[class55.field1455[var13]];
                            if (var16 != null && var12 != var16 && var16.field301.field800 == 1 && var12.field2277 == var16.field2277 && var12.field2264 == var16.field2264) {
                                class30.method250(class55.field1455[var13], var5, var16.field301, (byte) -121, var6);
                            }
                        }
                        for (int var14 = 0; var14 < class63.field1661; var14++) {
                            class118 var15 = class42.field1141[class14.field435[var14]];
                            if (var15 != null && var12.field2277 == var15.field2277 && var12.field2264 == var15.field2264) {
                                class140.method1140(var15, var6, -15891, class14.field435[var14], var5);
                            }
                        }
                    }
                    class30.method250(var7, var5, var12.field301, (byte) -112, var6);
                }
                if (var4 == 0) {
                    class118 var17 = class42.field1141[var7];
                    if ((var17.field2277 & 0x7F) == 64 && (var17.field2264 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < client.field618; var18++) {
                            class9 var21 = class133.field3345[class55.field1455[var18]];
                            if (var21 != null && var21.field301.field800 == 1 && var17.field2277 == var21.field2277 && var17.field2264 == var21.field2264) {
                                class30.method250(class55.field1455[var18], var5, var21.field301, (byte) -120, var6);
                            }
                        }
                        for (int var19 = 0; var19 < class63.field1661; var19++) {
                            class118 var20 = class42.field1141[class14.field435[var19]];
                            if (var20 != null && var17 != var20 && var17.field2277 == var20.field2277 && var17.field2264 == var20.field2264) {
                                class140.method1140(var20, var6, -15891, class14.field435[var19], var5);
                            }
                        }
                    }
                    class140.method1140(var17, var6, -15891, var7, var5);
                }
                if (var4 == 3) {
                    class61 var22 = class118.field3019[class11.field320][var5][var6];
                    if (var22 != null) {
                        for (class24 var23 = (class24) var22.method518((byte) 90); var23 != null; var23 = (class24) var22.method516(10404)) {
                            class126 var24 = class9.method86(var23.field692, (byte) 108);
                            if (class103.field2567 == 1) {
                                class80.method684(class32.method258(-113, new class73[] { class5.field192, class74.field1922, var24.field3220 }), false, 17, class87.field2189, var5, var6, var23.field692);
                                class120.field3068++;
                            } else if (!class50.field1329) {
                                class81.field2055++;
                                class73[] var25 = var24.field3216;
                                if (class33.field915) {
                                    var25 = class143.method1155(false, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class19.field542++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 11;
                                        }
                                        if (var26 == 1) {
                                            var27 = 20;
                                        }
                                        if (var26 == 2) {
                                            var27 = 16;
                                        }
                                        if (var26 == 3) {
                                            var27 = 10;
                                        }
                                        if (var26 == 4) {
                                            var27 = 58;
                                        }
                                        class80.method684(class32.method258(-102, new class73[] { class131.field3299, var24.field3220 }), false, var27, var25[var26], var5, var6, var23.field692);
                                    } else if (var26 == 2) {
                                        class80.method684(class32.method258(-127, new class73[] { class131.field3299, var24.field3220 }), false, 16, class5.field190, var5, var6, var23.field692);
                                        class53.field1411++;
                                    }
                                }
                                class80.method684(class32.method258(-61, new class73[] { class131.field3299, var24.field3220 }), false, 1003, class86.field2178, var5, var6, var23.field692);
                            } else if ((class94.field2392 & 0x1) == 1) {
                                class80.method684(class32.method258(-108, new class73[] { class121.field3102, class74.field1922, var24.field3220 }), false, 43, class57.field1511, var5, var6, var23.field692);
                                class139.field3454++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
    private final void method106(byte arg0, int arg1) {
        field406++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 > var5) {
            var9 = var3;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var5;
        if (var3 < var5) {
            var15 = var3;
        }
        if (var7 < var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field392 = (int) (var17 * 256.0D);
        if (this.field392 < 0) {
            this.field392 = 0;
        } else if (this.field392 > 255) {
            this.field392 = 255;
        }
        if (var9 != var15) {
            if (var5 == var9) {
                var11 = (var3 - var7) / (-var15 + var9);
            } else if (var3 == var9) {
                var11 = (var7 - var5) / (-var15 + var9) + 2.0D;
            } else if (var7 == var9) {
                var11 = (var5 - var3) / (-var15 + var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var9 - var15) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var15) / (2.0D - var9 - var15);
            }
        }
        double var19 = var11 / 6.0D;
        this.field391 = (int) (var19 * 256.0D);
        if (arg0 <= 85) {
            return;
        }
        this.field397 = (int) (var13 * 256.0D);
        if (this.field397 < 0) {
            this.field397 = 0;
        } else if (this.field397 > 255) {
            this.field397 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)I")
    public static final int method107(int arg0, byte arg1, int arg2) {
        field386++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (arg1 >= -106) {
            method107(-112, (byte) -86, -88);
        }
        int var3 = (arg2 & 0x7F) * arg0 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)I")
    public static final int method108(int arg0) {
        field393++;
        if (arg0 != 19) {
            method110(16);
        }
        return 19;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILqc;B)V")
    public final void method109(int arg0, class114 arg1, byte arg2) {
        field405++;
        while (true) {
            int var4 = arg1.method957((byte) 54);
            if (var4 == 0) {
                if (arg2 < 75) {
                    this.field385 = -44;
                    return;
                } else {
                    return;
                }
            }
            this.method103(arg0, (byte) -40, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static final void method110(int arg0) {
        if (arg0 != 5990) {
            method110(-123);
        }
        for (class23 var1 = (class23) class141.field3505.method514((byte) -79); var1 != null; var1 = (class23) class141.field3505.method517(-118)) {
            if (var1.field649 != null) {
                var1.method191((byte) 96);
            }
        }
        field388++;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (this.field380 != -1) {
            this.method106((byte) 90, this.field380);
            this.field395 = this.field392;
            this.field404 = this.field391;
            this.field398 = this.field397;
        }
        field403++;
        if (arg0 < -105) {
            this.method106((byte) 93, this.field382);
        }
    }
}
