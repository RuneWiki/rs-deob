import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    private int[] field84 = new int[64];

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
    private int[] field85 = new int[8191];

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    private int field79 = 0;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[[Lsi;")
    private class480[][] field90 = new class480[1600][64];

    @OriginalMember(owner = "client!to", name = "o", descriptor = "[I")
    private int[] field93 = new int[1600];

    @OriginalMember(owner = "client!to", name = "m", descriptor = "[[Lsi;")
    private class480[][] field91 = new class480[64][768];

    @OriginalMember(owner = "client!to", name = "q", descriptor = "Lql;")
    private class628 field95;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lsk;")
    private class532 field83;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "Laf;")
    private class370 field88;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "F")
    public static float field96;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
    public static int[] field81;

    static {
        new class572("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        new class572("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V", line = 4)
    public final void method34(boolean arg0) {
        if (arg0) {
            this.field95.method281((byte) 80);
            field97++;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lcb;Z)V", line = 18)
    private final void method35(class444 arg0, boolean arg1) {
        field86++;
        class205.field3051 = arg0.field6190;
        arg0.method2569(-14449);
        arg0.method2671(20977, false);
        if (arg1) {
            arg0.method2644(-98, false);
            arg0.method2613((byte) 120);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 35)
    public static void method36(int arg0) {
        if (arg0 == 0) {
            field81 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lcb;)V", line = 764)
    public class8(class444 arg0) {
        this.field95 = arg0.method2627(true, -30125);
        this.field83 = arg0.method2649(-124, new class334[] { new class334(new class58[] { class58.field719, class58.field729, class58.field732 }) });
        this.field88 = arg0.method2638(false, false);
        this.field88.method287(-113, 49146);
        Buffer var2 = this.field88.method282(-13803, true);
        if (var2 != null) {
            Stream var3 = arg0.method2597(var2, 1);
            if (Stream.method3454()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3447(var7);
                    var3.method3447(var7 + 1);
                    var3.method3447(var7 + 2);
                    var3.method3447(var7 + 2);
                    var3.method3447(var7 + 3);
                    var3.method3447(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3452(var5);
                    var3.method3452(var5 + 1);
                    var3.method3452(var5 + 2);
                    var3.method3452(var5 + 2);
                    var3.method3452(var5 + 3);
                    var3.method3452(var5);
                }
            }
            var3.method3448();
            this.field88.method280(28596);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Lcu;", line = 52)
    public static final class187 method37(int arg0, int arg1) {
        int var2 = -127 % (arg1 / 60);
        field87++;
        return class617.field9126 && class169.field2637 <= arg0 && class561.field8337 >= arg0 ? class61.field769[arg0 - class169.field2637] : null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILrd;Lcb;)V", line = 68)
    public final void method38(int arg0, class283 arg1, class444 arg2) {
        field94++;
        if (arg2.field6092 == null) {
            return;
        }
        this.method35(arg2, true);
        if (arg0 <= 34) {
            return;
        }
        float var4 = arg2.field6092.field674;
        float var5 = arg2.field6092.field709;
        float var6 = arg2.field6092.field708;
        float var7 = arg2.field6092.field706;
        try {
            if (arg1.field3962) {
                int var8 = arg1.field3963 - arg1.field3964;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = (class136.method950((byte) 73, var8) - class88.field1317) + 1;
                    var8 = (var8 >> var9) + 2;
                }
                class613 var10 = arg1.field3959.field2700;
                class613 var11 = var10.field9070;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field79 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field93[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field84[var16] = 0;
                    }
                    while (var10 != var11) {
                        class480 var17 = (class480) var11;
                        if (var14) {
                            var14 = false;
                            var12 = var17.field6828;
                            var13 = var17.field6827;
                        } else if (var17.field6828 != var12 || var17.field6827 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field6815 >> 12) * var6 + (float) (var17.field6826 >> 12) * var4 + (float) (var17.field6824 >> 12) * var5 + var7) - arg1.field3964 >> var9;
                        if (var18 < 1600) {
                            if (this.field93[var18] >= 64) {
                                label191: {
                                    if (this.field93[var18] == 64) {
                                        if (this.field79 == 64) {
                                            break label191;
                                        }
                                        this.field93[var18] += this.field79++ + 1;
                                    }
                                    class480[] var10000 = this.field91[this.field93[var18] - 1 - 64];
                                    int var10002 = this.field93[var18] - 65;
                                    int var10004 = this.field84[this.field93[var18] - 65];
                                    this.field84[var10002] = this.field84[this.field93[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            } else {
                                this.field90[var18][this.field93[var18]++] = var17;
                            }
                        }
                        var11 = var11.field9070;
                    }
                    arg2.method2652(false, 128, var12, false);
                    if (var13 && class205.field3051 != arg2.field6190) {
                        arg2.method500(class205.field3051);
                    } else if (arg2.field6190 != 1.0F) {
                        arg2.method500(1.0F);
                    }
                    this.method41(var8, arg2, false);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class613 var22 = arg1.field3959.field2700;
                for (class613 var23 = var22.field9070; var23 != var22; var23 = var23.field9070) {
                    class480 var24 = (class480) var23;
                    int var25 = (int) ((float) (var24.field6815 >> 12) * var6 + (float) (var24.field6826 >> 12) * var4 + (float) (var24.field6824 >> 12) * var5 + var7);
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field85[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class136.method950((byte) 73, var26) + (1 - class88.field1317);
                    var26 = (var26 >> var27) + 2;
                }
                int var28 = 0;
                class613 var29 = var22.field9070;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field79 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field93[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field84[var34] = 0;
                    }
                    while (var22 != var29) {
                        class480 var35 = (class480) var29;
                        if (var32) {
                            var31 = var35.field6827;
                            var32 = false;
                            var30 = var35.field6828;
                        }
                        if (var28 > 0 && (var35.field6828 != var30 || var31 != var35.field6827)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field85[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field93[var36] < 64) {
                                this.field90[var36][this.field93[var36]++] = var35;
                            } else {
                                label142: {
                                    if (this.field93[var36] == 64) {
                                        if (this.field79 == 64) {
                                            break label142;
                                        }
                                        this.field93[var36] += this.field79++ + 1;
                                    }
                                    this.field91[this.field93[var36] - 65][this.field84[this.field93[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field9070;
                    }
                    arg2.method2652(false, 128, var30 >= 0 ? var30 : -1, false);
                    if (var31 && class205.field3051 != arg2.field6190) {
                        arg2.method500(class205.field3051);
                    } else if (arg2.field6190 != 1.0F) {
                        arg2.method500(1.0F);
                    }
                    this.method41(var26, arg2, false);
                }
            }
        } catch (Exception var37) {
        }
        this.method39(arg2, (byte) 119);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lcb;B)V", line = 350)
    private final void method39(class444 arg0, byte arg1) {
        field89++;
        arg0.method2644(-127, true);
        arg0.method2671(20977, true);
        if (arg1 < 43) {
            this.field83 = null;
        }
        if (class205.field3051 != arg0.field6190) {
            arg0.method500(class205.field3051);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILcb;)V", line = 376)
    public final void method40(int arg0, class444 arg1) {
        field82++;
        if (arg0 == -30740) {
            this.field95.method1866(196584, 24, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILcb;Z)V", line = 394)
    private final void method41(int arg0, class444 arg1, boolean arg2) {
        field92++;
        int var4 = 0;
        class57 var5 = arg1.method2579(40);
        float var6 = var5.field694;
        float var7 = var5.field679;
        float var8 = var5.field696;
        float var9 = var5.field690;
        float var10 = var5.field677;
        float var11 = var5.field684;
        float var12 = var6 + var9;
        if (arg2) {
            this.method38(64, null, null);
        }
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field95.method282(-13803, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2597(var21, 1);
        if (Stream.method3454()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field93[var48] > 64 ? 64 : this.field93[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class480 var63 = this.field90[var48][var50];
                        int var64 = var63.field6825;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field6826 >> 12);
                        float var70 = (float) (var63.field6824 >> 12);
                        float var71 = (float) (var63.field6815 >> 12);
                        int var72 = var63.field6829 >> 12;
                        var22.method3446((float) (-var72) * var12 + var69);
                        var22.method3446((float) (-var72) * var13 + var70);
                        var22.method3446((float) (-var72) * var14 + var71);
                        var22.method3445(var67);
                        var22.method3445(var66);
                        var22.method3445(var65);
                        var22.method3445(var68);
                        var22.method3446(0.0F);
                        var22.method3446(0.0F);
                        var22.method3446((float) var72 * var15 + var69);
                        var22.method3446((float) var72 * var16 + var70);
                        var22.method3446((float) var72 * var17 + var71);
                        var22.method3445(var67);
                        var22.method3445(var66);
                        var22.method3445(var65);
                        var22.method3445(var68);
                        var22.method3446(1.0F);
                        var22.method3446(0.0F);
                        var22.method3446((float) var72 * var12 + var69);
                        var22.method3446((float) var72 * var13 + var70);
                        var22.method3446((float) var72 * var14 + var71);
                        var22.method3445(var67);
                        var22.method3445(var66);
                        var22.method3445(var65);
                        var22.method3445(var68);
                        var22.method3446(1.0F);
                        var22.method3446(1.0F);
                        var22.method3446((float) var72 * var18 + var69);
                        var22.method3446((float) var72 * var19 + var70);
                        var22.method3446((float) var72 * var20 + var71);
                        var22.method3445(var67);
                        var22.method3445(var66);
                        var22.method3445(var65);
                        var22.method3445(var68);
                        var22.method3446(0.0F);
                        var4++;
                        var22.method3446(1.0F);
                    }
                    if (this.field93[var48] > 64) {
                        int var51 = this.field93[var48] - 64 - 1;
                        for (int var52 = this.field84[var51] - 1; var52 >= 0; var52--) {
                            class480 var53 = this.field91[var51][var52];
                            int var54 = var53.field6825;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field6826 >> 12);
                            float var60 = (float) (var53.field6824 >> 12);
                            float var61 = (float) (var53.field6815 >> 12);
                            int var62 = var53.field6829 >> 12;
                            var22.method3446((float) (-var62) * var12 + var59);
                            var22.method3446((float) (-var62) * var13 + var60);
                            var22.method3446((float) (-var62) * var14 + var61);
                            var22.method3445(var57);
                            var22.method3445(var56);
                            var22.method3445(var55);
                            var22.method3445(var58);
                            var22.method3446(0.0F);
                            var22.method3446(0.0F);
                            var22.method3446((float) var62 * var15 + var59);
                            var22.method3446((float) var62 * var16 + var60);
                            var22.method3446((float) var62 * var17 + var61);
                            var22.method3445(var57);
                            var22.method3445(var56);
                            var22.method3445(var55);
                            var22.method3445(var58);
                            var22.method3446(1.0F);
                            var22.method3446(0.0F);
                            var22.method3446((float) var62 * var12 + var59);
                            var22.method3446((float) var62 * var13 + var60);
                            var22.method3446((float) var62 * var14 + var61);
                            var22.method3445(var57);
                            var22.method3445(var56);
                            var22.method3445(var55);
                            var22.method3445(var58);
                            var22.method3446(1.0F);
                            var22.method3446(1.0F);
                            var22.method3446((float) var62 * var18 + var59);
                            var22.method3446((float) var62 * var19 + var60);
                            var22.method3446((float) var62 * var20 + var61);
                            var22.method3445(var57);
                            var22.method3445(var56);
                            var22.method3445(var55);
                            var22.method3445(var58);
                            var22.method3446(0.0F);
                            var22.method3446(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field93[var23] > 64 ? 64 : this.field93[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class480 var38 = this.field90[var23][var25];
                        int var39 = var38.field6825;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field6826 >> 12);
                        float var45 = (float) (var38.field6824 >> 12);
                        float var46 = (float) (var38.field6815 >> 12);
                        int var47 = var38.field6829 >> 12;
                        var22.method3453((float) (-var47) * var12 + var44);
                        var22.method3453((float) (-var47) * var13 + var45);
                        var22.method3453((float) (-var47) * var14 + var46);
                        var22.method3445(var42);
                        var22.method3445(var41);
                        var22.method3445(var40);
                        var22.method3445(var43);
                        var22.method3453(0.0F);
                        var22.method3453(0.0F);
                        var22.method3453((float) var47 * var15 + var44);
                        var22.method3453((float) var47 * var16 + var45);
                        var22.method3453((float) var47 * var17 + var46);
                        var22.method3445(var42);
                        var22.method3445(var41);
                        var22.method3445(var40);
                        var22.method3445(var43);
                        var22.method3453(1.0F);
                        var22.method3453(0.0F);
                        var22.method3453((float) var47 * var12 + var44);
                        var22.method3453((float) var47 * var13 + var45);
                        var22.method3453((float) var47 * var14 + var46);
                        var22.method3445(var42);
                        var22.method3445(var41);
                        var22.method3445(var40);
                        var22.method3445(var43);
                        var22.method3453(1.0F);
                        var22.method3453(1.0F);
                        var22.method3453((float) var47 * var18 + var44);
                        var22.method3453((float) var47 * var19 + var45);
                        var22.method3453((float) var47 * var20 + var46);
                        var22.method3445(var42);
                        var22.method3445(var41);
                        var22.method3445(var40);
                        var22.method3445(var43);
                        var22.method3453(0.0F);
                        var22.method3453(1.0F);
                        var4++;
                    }
                    if (this.field93[var23] > 64) {
                        int var26 = this.field93[var23] - 65;
                        for (int var27 = this.field84[var26] - 1; var27 >= 0; var27--) {
                            class480 var28 = this.field91[var26][var27];
                            int var29 = var28.field6825;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field6826 >> 12);
                            float var35 = (float) (var28.field6824 >> 12);
                            float var36 = (float) (var28.field6815 >> 12);
                            int var37 = var28.field6829 >> 12;
                            var22.method3453((float) (-var37) * var12 + var34);
                            var22.method3453((float) (-var37) * var13 + var35);
                            var22.method3453((float) (-var37) * var14 + var36);
                            var22.method3445(var32);
                            var22.method3445(var31);
                            var22.method3445(var30);
                            var22.method3445(var33);
                            var22.method3453(0.0F);
                            var22.method3453(0.0F);
                            var22.method3453((float) var37 * var15 + var34);
                            var22.method3453((float) var37 * var16 + var35);
                            var22.method3453((float) var37 * var17 + var36);
                            var22.method3445(var32);
                            var22.method3445(var31);
                            var22.method3445(var30);
                            var22.method3445(var33);
                            var22.method3453(1.0F);
                            var22.method3453(0.0F);
                            var22.method3453((float) var37 * var12 + var34);
                            var22.method3453((float) var37 * var13 + var35);
                            var22.method3453((float) var37 * var14 + var36);
                            var22.method3445(var32);
                            var22.method3445(var31);
                            var22.method3445(var30);
                            var22.method3445(var33);
                            var22.method3453(1.0F);
                            var22.method3453(1.0F);
                            var22.method3453((float) var37 * var18 + var34);
                            var22.method3453((float) var37 * var19 + var35);
                            var22.method3453((float) var37 * var20 + var36);
                            var22.method3445(var32);
                            var22.method3445(var31);
                            var22.method3445(var30);
                            var22.method3445(var33);
                            var22.method3453(0.0F);
                            var4++;
                            var22.method3453(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3448();
        if (this.field95.method280(28596)) {
            arg1.method2584(true, this.field83);
            arg1.method2617(this.field95, 0, (byte) 106);
            arg1.method2578((byte) 49, class569.field8396, 0, 0, var4 * 4, var4 * 2, this.field88);
        }
    }
}
