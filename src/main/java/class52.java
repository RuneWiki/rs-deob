import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class52 extends class179 {

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "[B")
    public byte[] field786;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "[S")
    public short[] field781;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "[I")
    private int[] field792;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "[B")
    public byte[] field788;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "[Lgu;")
    public class393[] field780;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
    public byte[] field787;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "[Llh;")
    public class350[] field790;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "Loe;")
    public static class127 field794;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "Lsk;")
    public static class423 field796;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "[I")
    public static int[] field798;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "F")
    public static float field795;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "F")
    public static float field797;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field793;

    static {
        new class423("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field794 = new class127(14, -1);
        field796 = new class423("wave2:", "welle2:", "ondulation2:", "onda2:");
        field798 = new int[] { 0, -1, 0, 1 };
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[B)Z", line = 10)
    public static final boolean method362(int arg0, byte[] arg1) {
        field789++;
        class40 var2 = new class40(arg1);
        if (arg0 != 128) {
            return true;
        }
        int var3 = var2.method257((byte) 81);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method257((byte) 102) == 1;
        if (var4) {
            class58.method416(arg0 + 9016, var2);
        }
        class73.method546((byte) -101, var2);
        return true;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V", line = 36)
    public static final void method363(boolean arg0, int arg1) {
        if (arg0) {
            method365(50);
        }
        field791++;
        class64 var2 = class230.method1387(arg1, (byte) 40, 4);
        var2.method446(-20033);
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)V", line = 50)
    public static void method364(int arg0) {
        if (arg0 >= 111) {
            field798 = null;
            field794 = null;
            field796 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)Ljt;", line = 63)
    public static final class64 method365(int arg0) {
        if (arg0 < 96) {
            field796 = null;
        }
        field784++;
        class64 var1 = (class64) class268.field4040.method2260((byte) 117);
        if (var1 != null) {
            var1.method1121(false);
            var1.method1512((byte) 119);
            return var1;
        }
        class64 var2;
        do {
            var2 = (class64) class16.field224.method2260((byte) 47);
            if (var2 == null) {
                return null;
            }
            if (var2.method444(126) > class344.method2111((byte) -47)) {
                return null;
            }
            var2.method1121(false);
            var2.method1512((byte) 126);
        } while ((var2.field3839 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B[I[BLiv;)Z", line = 112)
    public final boolean method366(byte arg0, int[] arg1, byte[] arg2, class61 arg3) {
        field793++;
        boolean var5 = true;
        int var6 = 0;
        class393 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field792[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method427(-1854519324, arg1, var9 >> 2);
                        } else {
                            var7 = arg3.method426(arg1, -120, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field780[var8] = var7;
                        this.field792[var8] = 0;
                    }
                }
            }
        }
        if (arg0 > -37) {
            this.method366((byte) 2, null, null, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "(I)V", line = 174)
    public final void method367(int arg0) {
        this.field792 = null;
        if (arg0 == -129) {
            field782++;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIIIIII)V", line = 185)
    public static final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class149.method973(arg6, arg8, arg0, arg2, arg1, arg2, arg3, arg7, arg5, arg4);
        field785++;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V", line = 194)
    public class52() {
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([B)V", line = 200)
    public class52(byte[] arg0) {
        this.field786 = new byte[128];
        this.field781 = new short[128];
        this.field792 = new int[128];
        this.field788 = new byte[128];
        this.field780 = new class393[128];
        this.field787 = new byte[128];
        this.field790 = new class350[128];
        class40 var2 = new class40(arg0);
        int var3;
        for (var3 = 0; var2.field536[var2.field585 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method262(-2);
        }
        var2.field585++;
        var3++;
        int var6 = var2.field585;
        var2.field585 += var3;
        int var7;
        for (var7 = 0; var2.field536[var2.field585 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method262(-2);
        }
        var2.field585++;
        var7++;
        int var10 = var2.field585;
        var2.field585 += var7;
        int var11;
        for (var11 = 0; var2.field536[var2.field585 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method262(-2);
        }
        var11++;
        var2.field585++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method257((byte) 47);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class350[] var19 = new class350[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class350 var103 = var19[var20] = new class350();
            int var104 = var2.method257((byte) 36);
            if (var104 > 0) {
                var103.field5157 = new byte[var104 * 2];
            }
            int var105 = var2.method257((byte) 49);
            if (var105 > 0) {
                var103.field5152 = new byte[var105 * 2 + 2];
                var103.field5152[1] = 64;
            }
        }
        int var21 = var2.method257((byte) 43);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method257((byte) 29);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field536[var2.field585 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method262(-2);
        }
        var25++;
        var2.field585++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method257((byte) 68);
            this.field781[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method257((byte) 93);
            this.field781[var31] = (short) (this.field781[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method269((byte) -91);
            }
            this.field781[var35] = (short) (this.field781[var35] + class330.method2050(var34 - 1 << 14, 32768));
            this.field792[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field792[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field536[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field788[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field792[var43] != 0) {
                if (var40 == 0) {
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field536[var10++] + 16 << 2;
                }
                this.field786[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class350 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field792[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field790[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field792[var51] > 0) {
                    var50 = var2.method257((byte) 38) + 1;
                }
            }
            this.field787[var51] = (byte) var50;
            var49--;
        }
        this.field783 = var2.method257((byte) 33) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class350 var100 = var19[var52];
            if (var100.field5157 != null) {
                for (int var101 = 1; var101 < var100.field5157.length; var101 += 2) {
                    var100.field5157[var101] = var2.method262(-2);
                }
            }
            if (var100.field5152 != null) {
                for (int var102 = 3; var102 < var100.field5152.length - 2; var102 += 2) {
                    var100.field5152[var102] = var2.method262(-2);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method262(-2);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method262(-2);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class350 var97 = var19[var55];
            if (var97.field5152 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5152.length; var99 += 2) {
                    var98 = var98 + var2.method257((byte) 49) + 1;
                    var97.field5152[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class350 var94 = var19[var56];
            if (var94.field5157 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5157.length; var96 += 2) {
                    var95 = var95 + var2.method257((byte) 121) + 1;
                    var94.field5157[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method257((byte) 107);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method257((byte) 89) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field787[var61] = (byte) (this.field787[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class188.method1165(var65 - var59, (byte) 127, var67);
                    this.field787[var68] = (byte) (this.field787[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field787[var63] = (byte) (this.field787[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method257((byte) 41);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method257((byte) 42) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field786[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field786[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class188.method1165(var79 - var72, (byte) 127, var81);
                    int var84 = (this.field786[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field786[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field786[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field786[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field5161 = var2.method257((byte) 103);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class350 var93 = var19[var87];
            if (var93.field5157 != null) {
                var93.field5162 = var2.method257((byte) 27);
            }
            if (var93.field5152 != null) {
                var93.field5159 = var2.method257((byte) 87);
            }
            if (var93.field5161 > 0) {
                var93.field5153 = var2.method257((byte) 120);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field5163 = var2.method257((byte) 71);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class350 var92 = var19[var89];
            if (var92.field5163 > 0) {
                var92.field5155 = var2.method257((byte) 60);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class350 var91 = var19[var90];
            if (var91.field5155 > 0) {
                var91.field5151 = var2.method257((byte) 76);
            }
        }
    }
}
