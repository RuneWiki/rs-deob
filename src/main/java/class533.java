import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class533 extends class34 {

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "[I")
    public static int[] field7850;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "Lo;")
    public static class359 field7852;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lek;")
    public static class431 field7851;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "Lgp;")
    public static class464 field7848;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "[S")
    public static short[] field7846;

    static {
        new class157("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        new class157("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field7850 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lsv;II)V", line = 3)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field533 = ~arg0.method1869(-114) == -2;
        }
        ++field7849;
        if (arg1 < 16) {
            field7851 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V", line = 17)
    public static void method3159(int arg0) {
        field7848 = null;
        field7851 = null;
        field7850 = null;
        field7852 = null;
        if (arg0 == 0) {
            field7846 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[I", line = 31)
    public final int[] method64(int arg0, byte arg1) {
        ++field7845;
        int[] var3 = super.field537.method1780(arg0, (byte) 80);
        int var4 = -43 / (arg1 / 50);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 0);
            int[] var6 = this.method252(false, arg0, 1);
            int[] var7 = this.method252(false, arg0, 2);
            for (int var8 = 0; var8 < class383.field5502; ++var8) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var3[var8] = var5[var8];
                } else if (var9 != 0) {
                    var3[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                } else {
                    var3[var8] = var6[var8];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[[I", line = 92)
    public final int[][] method66(byte arg0, int arg1) {
        ++field7844;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            this.method66((byte) -67, 56);
        }
        if (super.field536.field726) {
            int[] var4 = this.method252(false, arg1, 2);
            int[][] var5 = this.method254(arg0 + 11, 0, arg1);
            int[][] var6 = this.method254(arg0 ^ -11, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class383.field5502; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 170)
    public class533() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V", line = 186)
    public static final void method3160(boolean arg0) {
        ++field7847;
        for (int var1 = 0; ~class40.field602 < ~var1; ++var1) {
            class441 var2 = class320.field4411[var1];
            if (var2.field6346 == 2) {
                if (var2.field6354 == null) {
                    var2.field6360 = Integer.MIN_VALUE;
                } else {
                    class290.field3924.method298(var2.field6354);
                }
            }
        }
        if (arg0) {
            field7852 = null;
        }
    }
}
