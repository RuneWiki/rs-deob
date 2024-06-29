import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class435 extends class148 {

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    private int field6503 = 2048;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    private int field6507 = 3072;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    private int field6511 = 1024;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Llt;")
    public static class475 field6506 = new class475("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!a", name = "T", descriptor = "[[[I")
    public static int[][][] field6513 = new int[2][][];

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field6514 = 0;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 16 % ((arg2 - -88) / 33);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2183 = arg1.method1428(32122) == 1;
                }
            } else {
                this.field6507 = arg1.method1450((byte) 49);
            }
        } else {
            this.field6511 = arg1.method1450((byte) 115);
        }
        ++field6504;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        ++field6509;
        if (arg0 != -1285532468) {
            method2616(-124);
        }
        this.field6503 = this.field6507 - this.field6511;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Z")
    public static final boolean method2615(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field6505;
            return class99.method606((byte) 123, arg1, arg2) || class52.method319(arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public static void method2616(int arg0) {
        field6506 = null;
        field6513 = null;
        if (arg0 != 2) {
            field6506 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field6515;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (!arg0) {
            method2617(-46, 122, -15, -59, 104, 112);
        }
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class320.field4579; ++var11) {
                var8[var11] = (var5[var11] * this.field6503 >> 12) + this.field6511;
                var9[var11] = this.field6511 - -(var6[var11] * this.field6503 >> 12);
                var10[var11] = (var7[var11] * this.field6503 >> 12) + this.field6511;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class435() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V")
    public static final void method2617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6510;
        if (~class426.field6401.field1022 != -1 && ~arg3 != -1 && ~class299.field4256 > -51 && arg1 != -1) {
            class333.field4700[class299.field4256++] = new class297((byte) 1, arg1, arg3, arg5, arg2, arg0);
        }
        if (arg4 != 0) {
            method2617(-30, 43, 94, -91, -85, 34);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6508;
        if (arg0 >= -65) {
            this.method175(126);
        }
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            for (int var5 = 0; ~var5 > ~class320.field4579; ++var5) {
                var3[var5] = this.field6511 - -(var4[var5] * this.field6503 >> 12);
            }
        }
        return var3;
    }
}
