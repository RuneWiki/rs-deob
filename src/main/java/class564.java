import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class564 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "[I")
    private int[] field8348 = new int[1600];

    @OriginalMember(owner = "client!et", name = "j", descriptor = "[[Lgda;")
    private class49[][] field8357 = new class49[64][768];

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[[Lgda;")
    private class49[][] field8358 = new class49[1600][64];

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[I")
    private int[] field8359 = new int[64];

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    private int field8350 = 0;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "[I")
    private int[] field8351 = new int[8191];

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Ltq;")
    private class90 field8352;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "Lvs;")
    private class567 field8349;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "Lg;")
    private class512 field8363;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "Lqu;")
    public static class364 field8365 = new class364(52, -1);

    @OriginalMember(owner = "client!et", name = "t", descriptor = "Lnj;")
    public static class487 field8367 = new class487("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
    public static boolean field8368 = false;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public final void method3295(boolean arg0) {
        field8355++;
        this.field8352.method409(false);
        if (!arg0) {
            this.field8357 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLoaa;Lkw;)V")
    public final void method3296(byte arg0, class510 arg1, class174 arg2) {
        field8366++;
        if (arg2.field2533 == null) {
            return;
        }
        this.method3298(arg2, -1);
        float var4 = arg2.field2533.field1607;
        float var5 = arg2.field2533.field1592;
        float var6 = arg2.field2533.field1608;
        float var7 = arg2.field2533.field1618;
        try {
            if (arg1.field7580) {
                int var8 = arg1.field7579 - arg1.field7581;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class552.method3233(-124, var8) + (1 - class554.field8237);
                    var8 = (var8 >> var9) + 2;
                }
                class130 var10 = arg1.field7577.field7506;
                class130 var11 = var10.field1710;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field8350 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field8348[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field8359[var16] = 0;
                    }
                    while (var10 != var11) {
                        class49 var17 = (class49) var11;
                        if (var14) {
                            var14 = false;
                            var13 = var17.field566;
                            var12 = var17.field571;
                        } else if (var17.field571 != var12 || var17.field566 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field567 >> 12) * var6 + (float) (var17.field574 >> 12) * var5 + (float) (var17.field564 >> 12) * var4 + var7) - arg1.field7581 >> var9;
                        if (var18 < 1600) {
                            if (this.field8348[var18] >= 64) {
                                label191: {
                                    if (this.field8348[var18] == 64) {
                                        if (this.field8350 == 64) {
                                            break label191;
                                        }
                                        this.field8348[var18] += (this.field8350++) + 1;
                                    }
                                    class49[] var10000 = this.field8357[this.field8348[var18] - 65];
                                    int var10002 = this.field8348[var18] - 65;
                                    int var10004 = this.field8359[this.field8348[var18] - 65];
                                    this.field8359[var10002] = this.field8359[this.field8348[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            } else {
                                this.field8358[var18][this.field8348[var18]++] = var17;
                            }
                        }
                        var11 = var11.field1710;
                    }
                    arg2.method1171(false, 0, var12 < 0 ? -1 : var12, false);
                    if (var13 && class174.field2379 != arg2.field2555) {
                        arg2.method987(class174.field2379);
                    } else if (arg2.field2555 != 1.0F) {
                        arg2.method987(1.0F);
                    }
                    this.method3301(arg2, 0, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class130 var22 = arg1.field7577.field7506;
                for (class130 var23 = var22.field1710; var23 != var22; var23 = var23.field1710) {
                    class49 var24 = (class49) var23;
                    int var25 = (int) ((float) (var24.field567 >> 12) * var6 + (float) (var24.field574 >> 12) * var5 + (float) (var24.field564 >> 12) * var4 + var7);
                    this.field8351[var19++] = var25;
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    if (var21 < var25) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class552.method3233(-126, var26) + 1 - class554.field8237;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                int var28 = 0;
                class130 var29 = var22.field1710;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field8350 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field8348[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field8359[var34] = 0;
                    }
                    while (var22 != var29) {
                        class49 var35 = (class49) var29;
                        if (var32) {
                            var30 = var35.field571;
                            var31 = var35.field566;
                            var32 = false;
                        }
                        if (var28 > 0 && (var35.field571 != var30 || var35.field566 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field8351[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field8348[var36] < 64) {
                                this.field8358[var36][this.field8348[var36]++] = var35;
                            } else {
                                label142: {
                                    if (this.field8348[var36] == 64) {
                                        if (this.field8350 == 64) {
                                            break label142;
                                        }
                                        this.field8348[var36] += this.field8350++ + 1;
                                    }
                                    this.field8357[this.field8348[var36] - 1 - 64][this.field8359[this.field8348[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field1710;
                    }
                    arg2.method1171(false, 0, var30 >= 0 ? var30 : -1, false);
                    if (var31 && class174.field2379 != arg2.field2555) {
                        arg2.method987(class174.field2379);
                    } else if (arg2.field2555 != 1.0F) {
                        arg2.method987(1.0F);
                    }
                    this.method3301(arg2, 0, var26);
                }
            }
        } catch (Exception var37) {
        }
        if (arg0 > -53) {
            method3302((byte) 54);
        }
        this.method3297(4670, arg2);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILkw;)V")
    private final void method3297(int arg0, class174 arg1) {
        arg1.method1146((byte) -87, true);
        field8354++;
        if (arg0 == 4670) {
            arg1.method1162(true, (byte) 109);
            if (class174.field2379 != arg1.field2555) {
                arg1.method987(class174.field2379);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lkw;I)V")
    private final void method3298(class174 arg0, int arg1) {
        if (arg1 != -1) {
            this.method3298(null, 18);
        }
        field8362++;
        class174.field2379 = arg0.field2555;
        arg0.method1129(true);
        arg0.method1162(false, (byte) 109);
        arg0.method1146((byte) -87, false);
        arg0.method1138((byte) -45);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZLkw;)V")
    public final void method3299(boolean arg0, class174 arg1) {
        this.field8352.method412(196584, 24, (byte) -61);
        field8364++;
        if (!arg0) {
            this.field8358 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;ZLuf;ZB)V")
    public static final void method3300(String arg0, boolean arg1, class353 arg2, boolean arg3, byte arg4) {
        field8361++;
        if (arg1) {
            if (class353.field5142.startsWith("win") && class353.field5140 != 3) {
                String var5 = null;
                if (arg2.field5129 != null) {
                    var5 = arg2.field5129.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class286 var6 = class326.method2041(arg2, -8346, 0, arg0);
                    class240.field3509 = arg2;
                    class311.field4569 = var6;
                    class124.field1641 = arg0;
                    return;
                }
            }
            if (class353.field5142.startsWith("mac")) {
                String var7 = null;
                if (arg2.field5129 != null) {
                    var7 = arg2.field5129.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class326.method2041(arg2, -8346, 1, arg0);
                    return;
                }
            }
            class326.method2041(arg2, -8346, 2, arg0);
        } else {
            class326.method2041(arg2, -8346, 3, arg0);
        }
        if (arg4 >= -41) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lkw;II)V")
    private final void method3301(class174 arg0, int arg1, int arg2) {
        field8353++;
        int var4 = 0;
        class124 var5 = arg0.method1140((byte) -41);
        float var6 = var5.field1616;
        float var7 = var5.field1635;
        float var8 = var5.field1598;
        float var9 = var5.field1597;
        float var10 = var5.field1599;
        float var11 = var5.field1636;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field8352.method410(true, (byte) -56);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method1163(var21, -4455);
        if (Stream.method3328()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field8348[var48] > 64 ? 64 : this.field8348[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class49 var63 = this.field8358[var48][var50];
                        int var64 = var63.field568;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field564 >> 12);
                        float var70 = (float) (var63.field574 >> 12);
                        float var71 = (float) (var63.field567 >> 12);
                        int var72 = var63.field562 >> 12;
                        var22.method3326((float) (-var72) * var12 + var69);
                        var22.method3326((float) (-var72) * var13 + var70);
                        var22.method3326((float) (-var72) * var14 + var71);
                        var22.method3330(var67);
                        var22.method3330(var66);
                        var22.method3330(var65);
                        var22.method3330(var68);
                        var22.method3326(0.0F);
                        var22.method3326(0.0F);
                        var22.method3326((float) var72 * var15 + var69);
                        var22.method3326((float) var72 * var16 + var70);
                        var22.method3326((float) var72 * var17 + var71);
                        var22.method3330(var67);
                        var22.method3330(var66);
                        var22.method3330(var65);
                        var22.method3330(var68);
                        var22.method3326(1.0F);
                        var22.method3326(0.0F);
                        var22.method3326((float) var72 * var12 + var69);
                        var22.method3326((float) var72 * var13 + var70);
                        var22.method3326((float) var72 * var14 + var71);
                        var22.method3330(var67);
                        var22.method3330(var66);
                        var22.method3330(var65);
                        var22.method3330(var68);
                        var22.method3326(1.0F);
                        var22.method3326(1.0F);
                        var22.method3326((float) var72 * var18 + var69);
                        var22.method3326((float) var72 * var19 + var70);
                        var22.method3326((float) var72 * var20 + var71);
                        var22.method3330(var67);
                        var22.method3330(var66);
                        var22.method3330(var65);
                        var22.method3330(var68);
                        var22.method3326(0.0F);
                        var4++;
                        var22.method3326(1.0F);
                    }
                    if (this.field8348[var48] > 64) {
                        int var51 = this.field8348[var48] - 64 - 1;
                        for (int var52 = this.field8359[var51] - 1; var52 >= 0; var52--) {
                            class49 var53 = this.field8357[var51][var52];
                            int var54 = var53.field568;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field564 >> 12);
                            float var60 = (float) (var53.field574 >> 12);
                            float var61 = (float) (var53.field567 >> 12);
                            int var62 = var53.field562 >> 12;
                            var22.method3326((float) (-var62) * var12 + var59);
                            var22.method3326((float) (-var62) * var13 + var60);
                            var22.method3326((float) (-var62) * var14 + var61);
                            var22.method3330(var57);
                            var22.method3330(var56);
                            var22.method3330(var55);
                            var22.method3330(var58);
                            var22.method3326(0.0F);
                            var22.method3326(0.0F);
                            var22.method3326((float) var62 * var15 + var59);
                            var22.method3326((float) var62 * var16 + var60);
                            var22.method3326((float) var62 * var17 + var61);
                            var22.method3330(var57);
                            var22.method3330(var56);
                            var22.method3330(var55);
                            var22.method3330(var58);
                            var22.method3326(1.0F);
                            var22.method3326(0.0F);
                            var22.method3326((float) var62 * var12 + var59);
                            var22.method3326((float) var62 * var13 + var60);
                            var22.method3326((float) var62 * var14 + var61);
                            var22.method3330(var57);
                            var22.method3330(var56);
                            var22.method3330(var55);
                            var22.method3330(var58);
                            var22.method3326(1.0F);
                            var22.method3326(1.0F);
                            var22.method3326((float) var62 * var18 + var59);
                            var22.method3326((float) var62 * var19 + var60);
                            var22.method3326((float) var62 * var20 + var61);
                            var22.method3330(var57);
                            var22.method3330(var56);
                            var22.method3330(var55);
                            var22.method3330(var58);
                            var22.method3326(0.0F);
                            var22.method3326(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field8348[var23] > 64 ? 64 : this.field8348[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class49 var38 = this.field8358[var23][var25];
                        int var39 = var38.field568;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field564 >> 12);
                        float var45 = (float) (var38.field574 >> 12);
                        float var46 = (float) (var38.field567 >> 12);
                        int var47 = var38.field562 >> 12;
                        var22.method3333((float) (-var47) * var12 + var44);
                        var22.method3333((float) (-var47) * var13 + var45);
                        var22.method3333((float) (-var47) * var14 + var46);
                        var22.method3330(var42);
                        var22.method3330(var41);
                        var22.method3330(var40);
                        var22.method3330(var43);
                        var22.method3333(0.0F);
                        var22.method3333(0.0F);
                        var22.method3333((float) var47 * var15 + var44);
                        var22.method3333((float) var47 * var16 + var45);
                        var22.method3333((float) var47 * var17 + var46);
                        var22.method3330(var42);
                        var22.method3330(var41);
                        var22.method3330(var40);
                        var22.method3330(var43);
                        var22.method3333(1.0F);
                        var22.method3333(0.0F);
                        var22.method3333((float) var47 * var12 + var44);
                        var22.method3333((float) var47 * var13 + var45);
                        var22.method3333((float) var47 * var14 + var46);
                        var22.method3330(var42);
                        var22.method3330(var41);
                        var22.method3330(var40);
                        var22.method3330(var43);
                        var22.method3333(1.0F);
                        var22.method3333(1.0F);
                        var22.method3333((float) var47 * var18 + var44);
                        var22.method3333((float) var47 * var19 + var45);
                        var22.method3333((float) var47 * var20 + var46);
                        var22.method3330(var42);
                        var22.method3330(var41);
                        var22.method3330(var40);
                        var22.method3330(var43);
                        var22.method3333(0.0F);
                        var22.method3333(1.0F);
                        var4++;
                    }
                    if (this.field8348[var23] > 64) {
                        int var26 = this.field8348[var23] - 65;
                        for (int var27 = this.field8359[var26] - 1; var27 >= 0; var27--) {
                            class49 var28 = this.field8357[var26][var27];
                            int var29 = var28.field568;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field564 >> 12);
                            float var35 = (float) (var28.field574 >> 12);
                            float var36 = (float) (var28.field567 >> 12);
                            int var37 = var28.field562 >> 12;
                            var22.method3333((float) (-var37) * var12 + var34);
                            var22.method3333((float) (-var37) * var13 + var35);
                            var22.method3333((float) (-var37) * var14 + var36);
                            var22.method3330(var32);
                            var22.method3330(var31);
                            var22.method3330(var30);
                            var22.method3330(var33);
                            var22.method3333(0.0F);
                            var22.method3333(0.0F);
                            var22.method3333((float) var37 * var15 + var34);
                            var22.method3333((float) var37 * var16 + var35);
                            var22.method3333((float) var37 * var17 + var36);
                            var22.method3330(var32);
                            var22.method3330(var31);
                            var22.method3330(var30);
                            var22.method3330(var33);
                            var22.method3333(1.0F);
                            var22.method3333(0.0F);
                            var22.method3333((float) var37 * var12 + var34);
                            var22.method3333((float) var37 * var13 + var35);
                            var22.method3333((float) var37 * var14 + var36);
                            var22.method3330(var32);
                            var22.method3330(var31);
                            var22.method3330(var30);
                            var22.method3330(var33);
                            var22.method3333(1.0F);
                            var22.method3333(1.0F);
                            var22.method3333((float) var37 * var18 + var34);
                            var22.method3333((float) var37 * var19 + var35);
                            var22.method3333((float) var37 * var20 + var36);
                            var22.method3330(var32);
                            var22.method3330(var31);
                            var22.method3330(var30);
                            var22.method3330(var33);
                            var22.method3333(0.0F);
                            var4++;
                            var22.method3333(1.0F);
                        }
                    }
                }
            }
        }
        if (arg1 != 0) {
            return;
        }
        var22.method3332();
        if (this.field8352.method411(-37)) {
            arg0.method326(43, this.field8349);
            arg0.method296(0, this.field8352, 101);
            arg0.method292(false, this.field8363, 0, class386.field5653, var4 * 2, 0, var4 * 4);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public static void method3302(byte arg0) {
        field8365 = null;
        if (arg0 != -33) {
            method3300(null, false, null, false, (byte) 28);
        }
        field8367 = null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lkw;)V")
    public class564(class174 arg0) {
        this.field8352 = arg0.method304(true, false);
        this.field8349 = arg0.method312(new class314[] { new class314(new class176[] { class176.field2671, class176.field2677, class176.field2679 }) }, (byte) 72);
        this.field8363 = arg0.method302(false, -113);
        this.field8363.method464(true, 49146);
        Buffer var2 = this.field8363.method410(true, (byte) -56);
        if (var2 != null) {
            Stream var3 = arg0.method1163(var2, -4455);
            if (Stream.method3328()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3337(var7);
                    var3.method3337(var7 + 1);
                    var3.method3337(var7 + 2);
                    var3.method3337(var7 + 2);
                    var3.method3337(var7 + 3);
                    var3.method3337(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3336(var5);
                    var3.method3336(var5 + 1);
                    var3.method3336(var5 + 2);
                    var3.method3336(var5 + 2);
                    var3.method3336(var5 + 3);
                    var3.method3336(var5);
                }
            }
            var3.method3332();
            this.field8363.method411(-67);
        }
    }
}
