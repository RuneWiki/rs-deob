import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class212 extends class512 {

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
    private int field3372 = 4096;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "Lvv;")
    public static class313 field3371;

    @OriginalMember(owner = "client!qt", name = "Q", descriptor = "[Z")
    public static boolean[] field3375;

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "Lrh;")
    public static class482 field3376;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!qt", name = "O", descriptor = "Lvv;")
    public static class313 field3373;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V")
    public static final void method1396(byte arg0) {
        ++field3370;
        int var1 = -13 / ((arg0 - 14) / 48);
        class387.field5967 = false;
        class358.method2298(class265.field4428, class134.field2262, (byte) -123, class128.field2195, class508.field7390);
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field3366;
        if (arg0) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        super.field7491 = ~arg2.method126((byte) -98) == -2;
                    }
                } else {
                    this.field3372 = arg2.method132(85);
                }
            } else {
                this.field3369 = arg2.method132(46);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        ++field3368;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = 60 % ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 79, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class402.field6113; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (~var13 <= ~this.field3369) {
                    if (this.field3372 >= var13) {
                        var9[var12] = var13;
                    } else {
                        var9[var12] = this.field3372;
                    }
                } else {
                    var9[var12] = this.field3369;
                }
                if (this.field3369 > var14) {
                    var10[var12] = this.field3369;
                } else if (var14 > this.field3372) {
                    var10[var12] = this.field3372;
                } else {
                    var10[var12] = var14;
                }
                if (this.field3369 <= var15) {
                    if (~this.field3372 <= ~var15) {
                        var11[var12] = var15;
                    } else {
                        var11[var12] = this.field3372;
                    }
                } else {
                    var11[var12] = this.field3369;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3376 = null;
        int var1 = -67 / ((50 - arg0) / 59);
        field3371 = null;
        field3373 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field3374;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var4 = this.method3013(false, 0, arg0);
            for (int var5 = 0; var5 < class402.field6113; ++var5) {
                int var6 = var4[var5];
                if (this.field3369 <= var6) {
                    if (this.field3372 < var6) {
                        var3[var5] = this.field3372;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field3369;
                }
            }
        }
        int var7 = 95 % ((arg1 - 43) / 48);
        return var3;
    }

    static {
        new class306("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field3371 = new class313(72, -1);
        field3375 = new boolean[100];
        new class306("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field3376 = new class482(16);
    }
}
