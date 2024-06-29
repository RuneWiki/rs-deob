import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class262 extends class261 {

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "Lwv;")
    private class26 field3994;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lbk;")
    private class256 field3983;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "Lda;")
    private class44 field3998;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    private int field4005;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    private int field4003;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "[[F")
    private float[][] field3993;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[[F")
    private float[][] field3990;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[[F")
    private float[][] field3986;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "Ler;")
    private class70 field3985;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "Laf;")
    private class302 field3996;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Ler;")
    private class70 field3987;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "Lgg;")
    private class118 field3992;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lnn;")
    private class289 field3981;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "Lcb;")
    private class364 field4004;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Lmn;")
    private class249 field3988;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "Lwm;")
    public static class399 field4002;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    private int field3999;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "Lza;")
    public static class288 field4006;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4007;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1678(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        field3991++;
        if (!arg4) {
            this.field3994 = null;
        }
        if (this.field3996 == null || arg1 + arg2 < this.field4005 || this.field3989 < (arg1 - arg2) || this.field4003 > (arg0 + arg2) || arg0 - arg2 > this.field3997) {
            return;
        }
        for (int var6 = this.field4003; var6 <= this.field3997; var6++) {
            for (int var7 = this.field4005; var7 <= this.field3989; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (var8 > -arg2 && arg2 > var8 && -arg2 < var9 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field3998.method339((int) (this.field3983.method1650(99) * 255.0F) << 24, 30766);
                    this.field3998.method352(112, this.field3985, null, null, this.field3987);
                    this.field3998.method370(this.field3999, 4, -117, 0, this.field3996);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII)V")
    private final void method1679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4000++;
        long var8 = -1L;
        int var10 = arg6 + (arg3 << this.field3994.field558);
        int var11 = arg5 + (arg2 << this.field3994.field558);
        int var12 = this.field3994.method186(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class261 var13 = this.field3988.method1622(var8, -114);
            if (var13 != null) {
                this.method1680(((class490) var13).field7188, 118);
                return;
            }
        }
        short var14 = (short) (this.field3982++);
        if (var8 != -1L) {
            this.field3988.method1618(new class490(var14), var8, -1);
        }
        float var15;
        float var16;
        float var17;
        if (~arg6 == arg1 && arg5 == 0) {
            var15 = this.field3986[arg0][arg4];
            var16 = this.field3993[arg0][arg4];
            var17 = this.field3990[arg0][arg4];
        } else if (this.field3994.field552 == arg6 && arg5 == 0) {
            var16 = this.field3993[arg0 + 1][arg4];
            var15 = this.field3986[arg0 + 1][arg4];
            var17 = this.field3990[arg0 + 1][arg4];
        } else if (this.field3994.field552 == arg6 && this.field3994.field552 == arg5) {
            var15 = this.field3986[arg0 + 1][arg4 + 1];
            var17 = this.field3990[arg0 + 1][arg4 + 1];
            var16 = this.field3993[arg0 + 1][arg4 + 1];
        } else if (arg6 == 0 && this.field3994.field552 == arg5) {
            var15 = this.field3986[arg0][arg4 + 1];
            var16 = this.field3993[arg0][arg4 + 1];
            var17 = this.field3990[arg0][arg4 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field3994.field552;
            float var19 = (float) arg5 / (float) this.field3994.field552;
            float var20 = this.field3993[arg0][arg4];
            float var21 = this.field3990[arg0][arg4];
            float var22 = this.field3986[arg0][arg4];
            float var23 = this.field3993[arg0 + 1][arg4];
            float var24 = this.field3990[arg0 + 1][arg4];
            float var25 = (this.field3993[arg0 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field3993[arg0][arg4 + 1] - var20) * var18 + var20;
            float var27 = this.field3986[arg0 + 1][arg4];
            float var28 = (this.field3990[arg0][arg4 + 1] - var21) * var18 + var21;
            float var29 = (this.field3990[arg0 + 1][arg4 + 1] - var24) * var18 + var24;
            float var30 = (this.field3986[arg0][arg4 + 1] - var22) * var18 + var22;
            var17 = (var29 - var28) * var19 + var28;
            float var31 = (this.field3986[arg0 + 1][arg4 + 1] - var27) * var18 + var27;
            var16 = (var25 - var26) * var19 + var26;
            var15 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field3983.method1646(arg1 ^ 0x72) - var10);
        float var33 = (float) (this.field3983.method1655((byte) -66) - var12);
        float var34 = (float) (this.field3983.method1653((byte) -93) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field3983.method1647(-119);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3983.method1652(-17454);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3998.field924) {
            this.field4004.method2234((float) var10, -1933021816);
            this.field4004.method2234((float) var12, -1933021816);
            this.field4004.method2234((float) var11, -1933021816);
        } else {
            this.field4004.method2232((byte) 119, (float) var10);
            this.field4004.method2232((byte) 115, (float) var12);
            this.field4004.method2232((byte) -90, (float) var11);
        }
        this.field4004.method1814(var45, true);
        this.field4004.method1814(var46, true);
        this.field4004.method1814(var47, true);
        this.field4004.method1814(255, true);
        this.method1680(var14, 45);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(SI)V")
    private final void method1680(short arg0, int arg1) {
        if (arg1 < 23) {
            return;
        }
        field3995++;
        if (this.field3998.field924) {
            this.field3981.method1865(arg0, 812856296);
        } else {
            this.field3981.method1852(65, arg0);
        }
        this.field3999++;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method1681(byte arg0) {
        if (arg0 > 5) {
            field4007 = null;
            field4006 = null;
            field4002 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lda;Lwv;Lbk;[I)V")
    public class262(class44 arg0, class26 arg1, class256 arg2, int[] arg3) {
        this.field3994 = arg1;
        this.field3983 = arg2;
        this.field3998 = arg0;
        int var5 = this.field3983.method1647(-120) - (arg1.field552 >> 1);
        this.field4005 = this.field3983.method1646(-99) - var5 >> arg1.field558;
        this.field3989 = this.field3983.method1646(-96) + var5 >> arg1.field558;
        this.field4003 = this.field3983.method1653((byte) -75) - var5 >> arg1.field558;
        this.field3997 = this.field3983.method1653((byte) -118) + var5 >> arg1.field558;
        int var6 = this.field3989 + 1 - this.field4005;
        int var7 = this.field3997 + 1 - this.field4003;
        this.field3993 = new float[var6 + 1][var7 + 1];
        this.field3990 = new float[var6 + 1][var7 + 1];
        this.field3986 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field4003 + var8;
            if (var24 > 0 && (this.field3994.field554 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field4005 + var25;
                    if (var26 > 0 && var26 < this.field3994.field551 - 1) {
                        int var27 = arg1.method177(var26 + 1, var24) - arg1.method177(var26 - 1, var24);
                        int var28 = arg1.method177(var26, var24 + 1) - arg1.method177(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + ((var28 * var28) + 65536))));
                        this.field3993[var25][var8] = (float) var27 * var29;
                        this.field3990[var25][var8] = var29 * -256.0F;
                        this.field3986[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field4003; var11 <= this.field3997; var11++) {
            if (var11 >= 0 && arg1.field554 > var11) {
                for (int var21 = this.field4005; var21 <= this.field3989; var21++) {
                    if (var21 >= 0 && var21 < arg1.field551) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field409[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field3989 - this.field4005;
            }
        }
        if (var9 <= 0) {
            this.field3985 = null;
            this.field3996 = null;
            this.field3987 = null;
            this.field3992 = null;
        } else {
            this.field3981 = new class289(var9 * 2);
            this.field4004 = new class364(var9 * 16);
            this.field3988 = new class249(class184.method1256(var9, (byte) 109));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field4003; var14 <= this.field3997; var14++) {
                if (var14 >= 0 && var14 < arg1.field554) {
                    int var15 = 0;
                    for (int var16 = this.field4005; var16 <= this.field3989; var16++) {
                        if (var16 >= 0 && var16 < arg1.field551) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field409[var16][var14];
                            int[] var19 = arg1.field418[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1679(var15, -1, var14, var16, var12, var19[var20], var18[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method1679(var15, -1, var14, var16, var12, 0, 0);
                                    this.method1679(var15, -1, var14, var16, var12, 0, arg1.field552);
                                    this.method1679(var15, -1, var14, var16, var12, arg1.field552, 0);
                                } else if (var17 == 2) {
                                    this.method1679(var15, -1, var14, var16, var12, 0, arg1.field552);
                                    this.method1679(var15, -1, var14, var16, var12, arg1.field552, arg1.field552);
                                    this.method1679(var15, -1, var14, var16, var12, 0, 0);
                                } else if (var17 == 5) {
                                    this.method1679(var15, -1, var14, var16, var12, arg1.field552, arg1.field552);
                                    this.method1679(var15, -1, var14, var16, var12, arg1.field552, 0);
                                    this.method1679(var15, -1, var14, var16, var12, 0, arg1.field552);
                                } else if (var17 == 4) {
                                    this.method1679(var15, -1, var14, var16, var12, arg1.field552, 0);
                                    this.method1679(var15, -1, var14, var16, var12, 0, 0);
                                    this.method1679(var15, -1, var14, var16, var12, arg1.field552, arg1.field552);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field3989 - this.field4005;
                }
                var12++;
            }
            this.field3996 = this.field3998.method406(this.field3981.field4399, -113, false, 5123, this.field3981.field4408);
            this.field3992 = this.field3998.method283(this.field4004.field4399, 16, -68, this.field4004.field4408, false);
            this.field3985 = new class70(this.field3992, 5126, 3, 0);
            this.field3987 = new class70(this.field3992, 5121, 4, 12);
        }
        this.field4004 = null;
        this.field3993 = this.field3990 = this.field3986 = null;
        this.field3988 = null;
        this.field3981 = null;
    }

    static {
        new class309("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field4001 = 0;
        field4002 = new class399(32);
    }
}
