import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class506 extends class535 {

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "[S")
    private short[] field7312 = new short[257];

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    private int field7316 = 0;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Z")
    public static boolean field7305 = false;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[I")
    public static int[] field7308 = new int[2048];

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lbd;")
    public static class44 field7317 = new class44("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Liw;")
    public static class212 field7320;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "[I")
    private int[] field7311;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
    private int[] field7314;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "[[I")
    private int[][] field7310;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg0 == 0) {
            this.field7316 = arg1.method3072((byte) -125);
            this.field7310 = new int[arg1.method3072((byte) -122)][2];
            for (int var4 = 0; this.field7310.length > var4; ++var4) {
                this.field7310[var4][0] = arg1.method3018(566990904);
                this.field7310[var4][1] = arg1.method3018(566990904);
            }
        }
        ++field7318;
        if (arg2 != -6232) {
            this.field7311 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static void method2948(int arg0) {
        field7320 = null;
        if (arg0 == 0) {
            field7308 = null;
            field7317 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)[I")
    private final int[] method2949(int arg0, boolean arg1) {
        ++field7315;
        if (~arg0 > -1) {
            return this.field7314;
        } else {
            if (!arg1) {
                this.method60(-37, (class519) null, -87);
            }
            return this.field7310.length <= arg0 ? this.field7311 : this.field7310[arg0];
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public final void method66(byte arg0) {
        if (this.field7310 == null) {
            this.field7310 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field7313;
        if (~this.field7310.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field7316 == -3) {
                this.method2951((byte) 118);
            }
            if (arg0 <= 111) {
                field7308 = null;
            }
            class100.method744(-121);
            this.method2952((byte) 51);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Lau;")
    public static final class528 method2950(boolean arg0) {
        ++field7307;
        if (arg0) {
            return null;
        } else if (class382.field5456 != null && class465.field6749 != null) {
            for (class528 var1 = (class528) class465.field6749.method1844(95); var1 != null; var1 = (class528) class465.field6749.method1844(95)) {
                class463 var2 = class382.field5447.method1429(var1.field7723, -3708);
                if (var2 != null && var2.field6723 && var2.method2743(class382.field5451, (byte) -124)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field7306;
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                int[] var4 = this.method3158(-113, 0, arg0);
                for (int var5 = 0; ~var5 > ~class174.field2597; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field7312[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(B)V")
    private final void method2951(byte arg0) {
        ++field7309;
        int[] var2 = this.field7310[0];
        int[] var3 = this.field7310[1];
        int[] var4 = this.field7310[this.field7310.length - 2];
        int[] var5 = this.field7310[this.field7310.length + -1];
        this.field7314 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + var2[1] - var3[1] };
        this.field7311 = new int[] { -var5[0] - -var4[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
        if (arg0 <= 104) {
            this.field7311 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(B)V")
    private final void method2952(byte arg0) {
        if (arg0 <= 38) {
            field7305 = false;
        }
        int var2 = this.field7316;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field7310.length + -1) && this.field7310[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field7310[var5 + -1];
                    int[] var7 = this.field7310[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class434.field6213[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field7312[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field7310.length - 1 && ~var13 <= ~this.field7310[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field7310[var14 + -1];
                    int[] var16 = this.field7310[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field7312[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field7310.length + -1) && ~var21 <= ~this.field7310[var22][0]; ++var22) {
                }
                int[] var23 = this.field7310[var22 + -1];
                int[] var24 = this.field7310[var22];
                int var25 = this.method2949(var22 + -2, true)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2949(var22 - -1, true)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - -var26 + -var25;
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - (-var37 - var26) + var36;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field7312[var20] = (short) var38;
            }
        }
        ++field7319;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class506() {
        super(1, true);
    }

    static {
        new class44("Player ", "Spieler ", "Joueur ", "Jogador ");
    }
}
