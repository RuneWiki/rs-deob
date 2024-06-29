import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class388 extends class354 {

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    private int field5931 = 4;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    private int field5935 = 4;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[I")
    public static int[] field5933 = new int[200];

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lof;")
    public static class446 field5934 = new class446("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field5929;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field5935 = arg0.method1087(false);
            }
        } else {
            this.field5931 = arg0.method1087(false);
        }
        if (arg2 != 1638) {
            this.field5931 = -51;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class388() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field5932;
        if (arg0 > -74) {
            return null;
        } else {
            int[] var3 = super.field5478.method2522(arg1, 16863);
            if (super.field5478.field6213) {
                int var4 = class531.field7814 / this.field5931;
                int var5 = class33.field511 / this.field5935;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method2275((byte) 72, 0, class33.field511 * var6 / var5);
                } else {
                    var7 = this.method2275((byte) 71, 0, 0);
                }
                for (int var8 = 0; ~var8 > ~class531.field7814; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var7[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class531.field7814 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JI)V")
    public static final void method2433(long arg0, int arg1) {
        ++field5927;
        int var3 = -16 % ((-2 - arg1) / 46);
        if (arg0 > 0L) {
            if (~(arg0 % 10L) != -1L) {
                class160.method1038(arg0, false);
            } else {
                class160.method1038(arg0 - 1L, false);
                class160.method1038(1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
    public static final int method2434(byte arg0) {
        if (arg0 < 100) {
            method2435(95, -106, -97);
        }
        ++field5928;
        return 6;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field5926;
        int var3 = 47 / ((48 - arg1) / 60);
        int[][] var4 = super.field5474.method2414((byte) -116, arg0);
        if (super.field5474.field5870) {
            int var5 = class531.field7814 / this.field5931;
            int var6 = class33.field511 / this.field5935;
            int[][] var8;
            if (~var6 < -1) {
                int var7 = arg0 % var6;
                var8 = this.method2274((byte) 84, class33.field511 * var7 / var6, 0);
            } else {
                var8 = this.method2274((byte) 84, 0, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class531.field7814 < ~var15; ++var15) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class531.field7814 * var17 / var5;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
    public static final void method2435(int arg0, int arg1, int arg2) {
        ++field5930;
        class177 var3 = class344.method2229(arg1, arg2, (byte) 120);
        var3.method1191(arg1 ^ -26);
        var3.field2372 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public static void method2436(boolean arg0) {
        if (!arg0) {
            method2433(109L, 108);
        }
        field5934 = null;
        field5933 = null;
    }
}
