import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class513 extends class535 {

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    private int field7450 = 1;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    private int field7455 = 1;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field7454 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field7457 = -2;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "Lbd;")
    public static class44 field7452 = new class44("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field7461 = 0;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "Lbd;")
    public static class44 field7460 = new class44("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "Lqv;")
    public static class316 field7462 = new class316(30, -1);

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Laa;")
    public static class343 field7459;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "[I")
    public static int[] field7463;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2999(int arg0, byte arg1, int arg2) {
        if (arg1 >= -17) {
            return true;
        } else {
            ++field7458;
            return (arg0 & 34) != 0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field7878 = arg1.method3072((byte) -127) == 1;
                }
            } else {
                this.field7450 = arg1.method3072((byte) -126);
            }
        } else {
            this.field7455 = arg1.method3072((byte) -120);
        }
        if (arg2 != -6232) {
            field7454 = null;
        }
        ++field7451;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field7456;
        if (arg0 >= -116) {
            return null;
        } else {
            int[][] var3 = super.field7879.method733(arg1, -16963);
            if (super.field7879.field1528) {
                int var4 = this.field7450 + 1 + this.field7450;
                int var5 = 65536 / var4;
                int var6 = this.field7455 - -this.field7455 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field7450 + arg1; ~var9 >= ~(this.field7450 + arg1); ++var9) {
                    int[][] var19 = this.method3157((byte) 67, class293.field4364 & var9, 0);
                    int[][] var20 = new int[3][class174.field2597];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field7455; ~this.field7455 <= ~var27; ++var27) {
                        int var37 = var27 & class529.field7783;
                        var23 += var26[var37];
                        var21 += var24[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~var31 > ~class174.field2597) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class529.field7783 & -this.field7455 + var31;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = this.field7455 + var31 & class529.field7783;
                        var23 = var26[var36] + var35;
                        var21 = var24[var36] + var33;
                        var22 = var25[var36] + var34;
                    }
                    var8[-arg1 + var9 + this.field7450] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class174.field2597; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var17 > ~var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Z")
    public static final boolean method3000(int arg0) {
        int var1 = 124 % ((arg0 - -37) / 62);
        ++field7449;
        if (class481.field6989) {
            try {
                if ((Boolean) class325.method2066(class280.field4173.field5824, (byte) -114, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method3001(boolean arg0) {
        field7460 = null;
        field7452 = null;
        field7462 = null;
        if (!arg0) {
            method3000(63);
        }
        field7463 = null;
        field7454 = null;
        field7459 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field7453;
        if (arg1 != 1) {
            field7454 = null;
        }
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int var4 = this.field7450 + 1 + this.field7450;
            int var5 = 65536 / var4;
            int var6 = this.field7455 + this.field7455 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7450 + arg0; ~(this.field7450 + arg0) <= ~var9; ++var9) {
                int[] var13 = this.method3158(-109, 0, var9 & class293.field4364);
                int[] var14 = new int[class174.field2597];
                int var15 = 0;
                for (int var16 = -this.field7455; this.field7455 >= var16; ++var16) {
                    var15 += var13[class529.field7783 & var16];
                }
                int var17 = 0;
                while (var17 < class174.field2597) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class529.field7783 & -this.field7455 + var17];
                    ++var17;
                    var15 = var13[this.field7455 + var17 & class529.field7783] + var18;
                }
                var8[-arg0 + var9 + this.field7450] = var14;
            }
            for (int var10 = 0; ~class174.field2597 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class513() {
        super(1, false);
    }
}
