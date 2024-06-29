import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class286 {

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "[[Lnba;")
    private class251[][] field3948 = new class251[1600][64];

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "[I")
    private int[] field3950 = new int[64];

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "[I")
    private int[] field3952 = new int[8191];

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    private int field3943 = 0;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "[[Lnba;")
    private class251[][] field3955 = new class251[64][768];

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "[I")
    private int[] field3959 = new int[1600];

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lep;")
    private class358 field3947;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "Lcca;")
    private class209 field3949;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "Lcca;")
    private class209 field3953;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lnq;")
    private class396 field3946;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lea;")
    public static class474 field3945 = new class474("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "[Lxa;")
    public static class433[] field3960;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ltu;I)V")
    private final void method1847(class294 arg0, int arg1) {
        arg0.method1905((byte) -127, true);
        field3961++;
        if (arg1 < 47) {
            method1853(102, false);
        }
        arg0.method1923((byte) 47, true);
        if (class628.field9072 != arg0.field4326) {
            arg0.method315(class628.field9072);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public final void method1848(int arg0) {
        this.field3949.method650(true);
        field3958++;
        if (arg0 > -63) {
            method1853(-14, false);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lbe;ILtu;)V")
    public final void method1849(class33 arg0, int arg1, class294 arg2) {
        field3962++;
        if (arg2.field4254 == null) {
            return;
        }
        this.method1854(-92, arg2);
        float var4 = arg2.field4254.field9319;
        float var5 = arg2.field4254.field9336;
        float var6 = arg2.field4254.field9309;
        float var7 = arg2.field4254.field9330;
        try {
            if (arg0.field381) {
                int var26 = arg0.field382 - arg0.field384;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class112.method688((byte) -121, var26) + 1 - class507.field7382;
                    var26 = (var26 >> var27) + 2;
                }
                class481 var28 = arg0.field378.field3242;
                class481 var29 = var28.field7068;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field3943 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3959[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3950[var34] = 0;
                    }
                    while (var28 != var29) {
                        class251 var35 = (class251) var29;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field3562;
                            var31 = var35.field3563;
                        } else if (var35.field3562 != var30 || var31 != var35.field3563) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field3559 >> 12) * var6 + (float) (var35.field3569 >> 12) * var4 + (float) (var35.field3568 >> 12) * var5 + var7) - arg0.field384 >> var27;
                        if (var36 < 1600) {
                            if (this.field3959[var36] < 64) {
                                this.field3948[var36][this.field3959[var36]++] = var35;
                            } else {
                                label142: {
                                    if (this.field3959[var36] == 64) {
                                        if (this.field3943 == 64) {
                                            break label142;
                                        }
                                        this.field3959[var36] += this.field3943++ + 1;
                                    }
                                    this.field3955[this.field3959[var36] - 64 - 1][this.field3950[this.field3959[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field7068;
                    }
                    arg2.method1899(false, var30 <= 0 ? -1 : var30, false, 0);
                    if (var31 && class628.field9072 != arg2.field4326) {
                        arg2.method315(class628.field9072);
                    } else if (arg2.field4326 != 1.0F) {
                        arg2.method315(1.0F);
                    }
                    this.method1851(1647002828, var26, arg2);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class481 var11 = arg0.field378.field3242;
                for (class481 var12 = var11.field7068; var12 != var11; var12 = var12.field7068) {
                    class251 var13 = (class251) var12;
                    int var14 = (int) ((float) (var13.field3559 >> 12) * var6 + (float) (var13.field3569 >> 12) * var4 + (float) (var13.field3568 >> 12) * var5 + var7);
                    if (var14 < var9) {
                        var9 = var14;
                    }
                    this.field3952[var8++] = var14;
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 > 1600) {
                    var16 = class112.method688((byte) -121, var15) + 1 - class507.field7382;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var16 = 0;
                    var15 += 2;
                }
                int var17 = 0;
                class481 var18 = var11.field7068;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field3943 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field3959[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field3950[var23] = 0;
                    }
                    while (var11 != var18) {
                        class251 var24 = (class251) var18;
                        if (var21) {
                            var20 = var24.field3563;
                            var21 = false;
                            var19 = var24.field3562;
                        }
                        if (var17 > 0 && (var24.field3562 != var19 || var24.field3563 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field3952[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field3959[var25] >= 64) {
                                label186: {
                                    if (this.field3959[var25] == 64) {
                                        if (this.field3943 == 64) {
                                            break label186;
                                        }
                                        this.field3959[var25] += this.field3943++ + 1;
                                    }
                                    this.field3955[this.field3959[var25] - 1 - 64][this.field3950[this.field3959[var25] - 64 - 1]++] = var24;
                                }
                            } else {
                                this.field3948[var25][this.field3959[var25]++] = var24;
                            }
                        }
                        var18 = var18.field7068;
                    }
                    arg2.method1899(false, var19 >= 0 ? var19 : -1, false, 0);
                    if (var20 && class628.field9072 != arg2.field4326) {
                        arg2.method315(class628.field9072);
                    } else if (arg2.field4326 != 1.0F) {
                        arg2.method315(1.0F);
                    }
                    this.method1851(1647002828, var15, arg2);
                }
            }
        } catch (Exception var37) {
        }
        this.method1847(arg2, 78);
        if (arg1 != 22484) {
            this.field3950 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLtu;)V")
    public final void method1850(boolean arg0, class294 arg1) {
        this.field3949.method1071(24, -1249, 786336);
        field3956++;
        if (arg0) {
            method1852(false);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILtu;)V")
    private final void method1851(int arg0, int arg1, class294 arg2) {
        field3954++;
        int var4 = 0;
        class646 var5 = arg2.method1937((byte) -111);
        float var6 = var5.field9356;
        float var7 = var5.field9308;
        float var8 = var5.field9334;
        float var9 = var5.field9335;
        float var10 = var5.field9341;
        float var11 = var5.field9342;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        if (arg0 != 1647002828) {
            this.field3949 = null;
        }
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field3949.method652(true, 31983);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method1932(var21, (byte) -82);
        if (Stream.method3423()) {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field3959[var48] > 64 ? 64 : this.field3959[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class251 var63 = this.field3948[var48][var50];
                        int var64 = var63.field3560;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field3569 >> 12);
                        float var70 = (float) (var63.field3568 >> 12);
                        float var71 = (float) (var63.field3559 >> 12);
                        int var72 = var63.field3556 >> 12;
                        var22.method3415((float) (-var72) * var12 + var69);
                        var22.method3415((float) (-var72) * var13 + var70);
                        var22.method3415((float) (-var72) * var14 + var71);
                        var22.method3412(var67);
                        var22.method3412(var66);
                        var22.method3412(var65);
                        var22.method3412(var68);
                        var22.method3415(0.0F);
                        var22.method3415(0.0F);
                        var22.method3415((float) var72 * var15 + var69);
                        var22.method3415((float) var72 * var16 + var70);
                        var22.method3415((float) var72 * var17 + var71);
                        var22.method3412(var67);
                        var22.method3412(var66);
                        var22.method3412(var65);
                        var22.method3412(var68);
                        var22.method3415(1.0F);
                        var22.method3415(0.0F);
                        var22.method3415((float) var72 * var12 + var69);
                        var22.method3415((float) var72 * var13 + var70);
                        var22.method3415((float) var72 * var14 + var71);
                        var22.method3412(var67);
                        var22.method3412(var66);
                        var22.method3412(var65);
                        var22.method3412(var68);
                        var22.method3415(1.0F);
                        var22.method3415(1.0F);
                        var22.method3415((float) var72 * var18 + var69);
                        var22.method3415((float) var72 * var19 + var70);
                        var22.method3415((float) var72 * var20 + var71);
                        var22.method3412(var67);
                        var22.method3412(var66);
                        var22.method3412(var65);
                        var22.method3412(var68);
                        var22.method3415(0.0F);
                        var22.method3415(1.0F);
                        var4++;
                    }
                    if (this.field3959[var48] > 64) {
                        int var51 = this.field3959[var48] - 1 - 64;
                        for (int var52 = this.field3950[var51] - 1; var52 >= 0; var52--) {
                            class251 var53 = this.field3955[var51][var52];
                            int var54 = var53.field3560;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field3569 >> 12);
                            float var60 = (float) (var53.field3568 >> 12);
                            float var61 = (float) (var53.field3559 >> 12);
                            int var62 = var53.field3556 >> 12;
                            var22.method3415((float) (-var62) * var12 + var59);
                            var22.method3415((float) (-var62) * var13 + var60);
                            var22.method3415((float) (-var62) * var14 + var61);
                            var22.method3412(var57);
                            var22.method3412(var56);
                            var22.method3412(var55);
                            var22.method3412(var58);
                            var22.method3415(0.0F);
                            var22.method3415(0.0F);
                            var22.method3415((float) var62 * var15 + var59);
                            var22.method3415((float) var62 * var16 + var60);
                            var22.method3415((float) var62 * var17 + var61);
                            var22.method3412(var57);
                            var22.method3412(var56);
                            var22.method3412(var55);
                            var22.method3412(var58);
                            var22.method3415(1.0F);
                            var22.method3415(0.0F);
                            var22.method3415((float) var62 * var12 + var59);
                            var22.method3415((float) var62 * var13 + var60);
                            var22.method3415((float) var62 * var14 + var61);
                            var22.method3412(var57);
                            var22.method3412(var56);
                            var22.method3412(var55);
                            var22.method3412(var58);
                            var22.method3415(1.0F);
                            var22.method3415(1.0F);
                            var22.method3415((float) var62 * var18 + var59);
                            var22.method3415((float) var62 * var19 + var60);
                            var22.method3415((float) var62 * var20 + var61);
                            var22.method3412(var57);
                            var22.method3412(var56);
                            var22.method3412(var55);
                            var22.method3412(var58);
                            var22.method3415(0.0F);
                            var22.method3415(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field3959[var23] <= 64 ? this.field3959[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class251 var38 = this.field3948[var23][var25];
                        int var39 = var38.field3560;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field3569 >> 12);
                        float var45 = (float) (var38.field3568 >> 12);
                        float var46 = (float) (var38.field3559 >> 12);
                        int var47 = var38.field3556 >> 12;
                        var22.method3416((float) (-var47) * var12 + var44);
                        var22.method3416((float) (-var47) * var13 + var45);
                        var22.method3416((float) (-var47) * var14 + var46);
                        var22.method3412(var42);
                        var22.method3412(var41);
                        var22.method3412(var40);
                        var22.method3412(var43);
                        var22.method3416(0.0F);
                        var22.method3416(0.0F);
                        var22.method3416((float) var47 * var15 + var44);
                        var22.method3416((float) var47 * var16 + var45);
                        var22.method3416((float) var47 * var17 + var46);
                        var22.method3412(var42);
                        var22.method3412(var41);
                        var22.method3412(var40);
                        var22.method3412(var43);
                        var22.method3416(1.0F);
                        var22.method3416(0.0F);
                        var22.method3416((float) var47 * var12 + var44);
                        var22.method3416((float) var47 * var13 + var45);
                        var22.method3416((float) var47 * var14 + var46);
                        var22.method3412(var42);
                        var22.method3412(var41);
                        var22.method3412(var40);
                        var22.method3412(var43);
                        var22.method3416(1.0F);
                        var22.method3416(1.0F);
                        var22.method3416((float) var47 * var18 + var44);
                        var22.method3416((float) var47 * var19 + var45);
                        var22.method3416((float) var47 * var20 + var46);
                        var22.method3412(var42);
                        var22.method3412(var41);
                        var22.method3412(var40);
                        var22.method3412(var43);
                        var22.method3416(0.0F);
                        var4++;
                        var22.method3416(1.0F);
                    }
                    if (this.field3959[var23] > 64) {
                        int var26 = this.field3959[var23] - 1 - 64;
                        for (int var27 = this.field3950[var26] - 1; var27 >= 0; var27--) {
                            class251 var28 = this.field3955[var26][var27];
                            int var29 = var28.field3560;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field3569 >> 12);
                            float var35 = (float) (var28.field3568 >> 12);
                            float var36 = (float) (var28.field3559 >> 12);
                            int var37 = var28.field3556 >> 12;
                            var22.method3416((float) (-var37) * var12 + var34);
                            var22.method3416((float) (-var37) * var13 + var35);
                            var22.method3416((float) (-var37) * var14 + var36);
                            var22.method3412(var32);
                            var22.method3412(var31);
                            var22.method3412(var30);
                            var22.method3412(var33);
                            var22.method3416(0.0F);
                            var22.method3416(0.0F);
                            var22.method3416((float) var37 * var15 + var34);
                            var22.method3416((float) var37 * var16 + var35);
                            var22.method3416((float) var37 * var17 + var36);
                            var22.method3412(var32);
                            var22.method3412(var31);
                            var22.method3412(var30);
                            var22.method3412(var33);
                            var22.method3416(1.0F);
                            var22.method3416(0.0F);
                            var22.method3416((float) var37 * var12 + var34);
                            var22.method3416((float) var37 * var13 + var35);
                            var22.method3416((float) var37 * var14 + var36);
                            var22.method3412(var32);
                            var22.method3412(var31);
                            var22.method3412(var30);
                            var22.method3412(var33);
                            var22.method3416(1.0F);
                            var22.method3416(1.0F);
                            var22.method3416((float) var37 * var18 + var34);
                            var22.method3416((float) var37 * var19 + var35);
                            var22.method3416((float) var37 * var20 + var36);
                            var22.method3412(var32);
                            var22.method3412(var31);
                            var22.method3412(var30);
                            var22.method3412(var33);
                            var22.method3416(0.0F);
                            var4++;
                            var22.method3416(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3411();
        if (this.field3949.method651(-15045)) {
            arg2.method1558(this.field3949, -32, 0);
            arg2.method1558(this.field3953, arg0 ^ 0x622B44A1, 1);
            arg2.method1562(117, this.field3947);
            arg2.method1508(-28296, 0, var4 * 2, var4 * 4, 0, class256.field3658, this.field3946);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)V")
    public static void method1852(boolean arg0) {
        if (!arg0) {
            field3945 = null;
        }
        field3960 = null;
        field3945 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)V")
    public static final void method1853(int arg0, boolean arg1) {
        field3957++;
        class213.field2945 = 0;
        class207.field2771 = 0;
        class509.method3036(1);
        class473.method2898(arg1, 0);
        class561.method3244((byte) -127);
        boolean var2 = false;
        if (arg0 != -14708) {
            method1853(-125, false);
        }
        for (int var3 = 0; var3 < class213.field2945; var3++) {
            int var5 = class259.field3689[var3];
            class411 var6 = (class411) class42.field456.method524((byte) 105, (long) var5);
            class78 var7 = var6.field6254;
            if (class600.field8764 && class313.method2061(114, var5)) {
                class427.method2671(arg0 ^ 0xFFFFC69E);
            }
            if (class287.field3982 != var7.field2455) {
                if (var7.field864.method3283(-1)) {
                    class130.method801(var7, (byte) -76);
                }
                var7.method509(null, -4);
                var2 = true;
                var6.method2108(true);
            }
        }
        if (var2) {
            class458.field6840 = class42.field456.method521((byte) -77);
            class42.field456.method519(arg0 + 22418, class599.field8757);
        }
        if (class32.field372 != class46.field498.field2610) {
            throw new RuntimeException("gnp1 pos:" + class46.field498.field2610 + " psize:" + class32.field372);
        }
        for (int var4 = 0; var4 < class387.field5958; var4++) {
            if (class42.field456.method524((byte) 85, (long) class362.field5141[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class387.field5958);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILtu;)V")
    private final void method1854(int arg0, class294 arg1) {
        if (arg0 > -37) {
            this.field3953 = null;
        }
        field3944++;
        class628.field9072 = arg1.field4326;
        arg1.method1949(1);
        arg1.method1923((byte) 47, false);
        arg1.method1905((byte) 99, false);
        arg1.method1945((byte) 123);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lkr;Z)V")
    public static final void method1855(class645 arg0, boolean arg1) {
        field3951++;
        arg0.method3668(-47);
        int var2 = 0;
        for (int var3 = 0; var3 < class88.field1018; var3++) {
            int var15 = class457.field6839[var3];
            if ((class262.field3727[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class262.field3727[var15] = (byte) class283.method1834(class262.field3727[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method3671(1, (byte) 17);
                    if (var16 == 0) {
                        var2 = class174.method995(arg0, -127);
                        class262.field3727[var15] = (byte) class283.method1834(class262.field3727[var15], 2);
                    } else {
                        class263.method1742(arg0, var15, -49);
                    }
                }
            }
        }
        arg0.method3670(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method3668(114);
        for (int var4 = 0; var4 < class88.field1018; var4++) {
            int var13 = class457.field6839[var4];
            if ((class262.field3727[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class262.field3727[var13] = (byte) class283.method1834(class262.field3727[var13], 2);
                } else {
                    int var14 = arg0.method3671(1, (byte) 17);
                    if (var14 == 0) {
                        var2 = class174.method995(arg0, 85);
                        class262.field3727[var13] = (byte) class283.method1834(class262.field3727[var13], 2);
                    } else {
                        class263.method1742(arg0, var13, -111);
                    }
                }
            }
        }
        arg0.method3670(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method3668(111);
        for (int var5 = 0; var5 < class368.field5557; var5++) {
            int var11 = class236.field3386[var5];
            if ((class262.field3727[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class262.field3727[var11] = (byte) class283.method1834(class262.field3727[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method3671(1, (byte) 17);
                    if (var12 == 0) {
                        var2 = class174.method995(arg0, -49);
                        class262.field3727[var11] = (byte) class283.method1834(class262.field3727[var11], 2);
                    } else if (class80.method531(var11, true, arg0)) {
                        class262.field3727[var11] = (byte) class283.method1834(class262.field3727[var11], 2);
                    }
                }
            }
        }
        arg0.method3670(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method3668(121);
        for (int var6 = 0; var6 < class368.field5557; var6++) {
            int var9 = class236.field3386[var6];
            if ((class262.field3727[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class262.field3727[var9] = (byte) class283.method1834(class262.field3727[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method3671(1, (byte) 17);
                    if (var10 == 0) {
                        var2 = class174.method995(arg0, -82);
                        class262.field3727[var9] = (byte) class283.method1834(class262.field3727[var9], 2);
                    } else if (class80.method531(var9, true, arg0)) {
                        class262.field3727[var9] = (byte) class283.method1834(class262.field3727[var9], 2);
                    }
                }
            }
        }
        if (!arg1) {
            method1853(98, false);
        }
        arg0.method3670(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class88.field1018 = 0;
        class368.field5557 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class262.field3727[var7] = (byte) (class262.field3727[var7] >> 1);
            class655 var8 = class142.field1749[var7];
            if (var8 == null) {
                class236.field3386[class368.field5557++] = var7;
            } else {
                class457.field6839[class88.field1018++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Ltu;)V")
    public class286(class294 arg0) {
        this.field3947 = arg0.method1520(new class558[] { new class558(new class596[] { class596.field8705, class596.field8707, class596.field8709 }), new class558(class596.field8706) }, true);
        this.field3949 = arg0.method1548((byte) 113, true);
        this.field3953 = arg0.method1548((byte) 80, false);
        this.field3953.method1071(12, -1249, 393168);
        this.field3946 = arg0.method1535((byte) -95, false);
        this.field3946.method654(49146, 9658);
        Buffer var2 = this.field3946.method652(true, 31983);
        if (var2 != null) {
            Stream var3 = arg0.method1932(var2, (byte) -82);
            if (Stream.method3423()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3414(var5);
                    var3.method3414(var5 + 1);
                    var3.method3414(var5 + 2);
                    var3.method3414(var5 + 2);
                    var3.method3414(var5 + 3);
                    var3.method3414(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3413(var7);
                    var3.method3413(var7 + 1);
                    var3.method3413(var7 + 2);
                    var3.method3413(var7 + 2);
                    var3.method3413(var7 + 3);
                    var3.method3413(var7);
                }
            }
            var3.method3411();
            this.field3946.method651(-15045);
        }
        Buffer var8 = this.field3953.method652(true, 31983);
        if (var8 != null) {
            Stream var9 = arg0.method1932(var8, (byte) -82);
            if (Stream.method3423()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3415(0.0F);
                    var9.method3415(-1.0F);
                    var9.method3415(0.0F);
                    var9.method3415(0.0F);
                    var9.method3415(-1.0F);
                    var9.method3415(0.0F);
                    var9.method3415(0.0F);
                    var9.method3415(-1.0F);
                    var9.method3415(0.0F);
                    var9.method3415(0.0F);
                    var9.method3415(-1.0F);
                    var9.method3415(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3416(0.0F);
                    var9.method3416(-1.0F);
                    var9.method3416(0.0F);
                    var9.method3416(0.0F);
                    var9.method3416(-1.0F);
                    var9.method3416(0.0F);
                    var9.method3416(0.0F);
                    var9.method3416(-1.0F);
                    var9.method3416(0.0F);
                    var9.method3416(0.0F);
                    var9.method3416(-1.0F);
                    var9.method3416(0.0F);
                }
            }
            var9.method3411();
            this.field3953.method651(-15045);
        }
    }
}
