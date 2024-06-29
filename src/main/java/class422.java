import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class422 extends class214 {

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[I")
    private int[] field5802 = new int[3];

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    private int field5801 = 4096;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    private int field5800 = 4096;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    private int field5805 = 4096;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    private int field5807 = 409;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Lms;")
    public static class363 field5806 = null;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Lhi;")
    public static class445 field5809 = new class445(8);

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Ltm;")
    public static class112 field5812;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lbc;")
    public static class187 field5813;

    static {
        new class112("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field5811 = 104;
        field5812 = new class112(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 4)
    public static void method2448(byte arg0) {
        field5813 = null;
        field5806 = null;
        field5812 = null;
        field5809 = null;
        int var1 = 20 % ((arg0 - -72) / 45);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 206)
    public class422() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Llk;II)V", line = 24)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field5799;
        if (arg1 <= -114) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (~arg2 == -5) {
                                int var5 = arg0.method2498(3);
                                this.field5802[0] = class347.method2074(267386880, var5 << 4);
                                this.field5802[1] = class347.method2074(var5, 65280) >> 4;
                                this.field5802[2] = class347.method2074(0, var5 >> 12);
                            }
                        } else {
                            this.field5800 = arg0.method2508(true);
                        }
                    } else {
                        this.field5805 = arg0.method2508(true);
                    }
                } else {
                    this.field5801 = arg0.method2508(true);
                }
            } else {
                this.field5807 = arg0.method2508(true);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[[I", line = 91)
    public final int[][] method11(int arg0, byte arg1) {
        ++field5803;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            return null;
        } else {
            if (super.field3030.field6644) {
                int[][] var4 = this.method1354(0, arg0, (byte) 23);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class399.field5585 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field5802[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~this.field5807 > ~var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field5802[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field5807) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field5802[2];
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field5807 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field5800 * var12 >> 12;
                                var9[var11] = this.field5805 * var14 >> 12;
                                var10[var11] = this.field5801 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V", line = 182)
    public static final void method2449(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class269.field3730[var1] = false;
        }
        ++field5808;
        class165.field2435 = 0;
        class236.field3333 = -1;
        int var2 = -69 / ((35 - arg0) / 45);
        class375.field5312 = 1;
        class383.field5438 = -1;
        class287.field3916 = 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIII)V", line = 212)
    public static final void method2450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != -10831) {
            field5809 = null;
        }
        class145.method887(arg3, arg5, arg4, 0, arg1, arg7, arg6, arg0, arg8, 0);
        ++field5804;
    }
}
