import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class394 extends class4 {

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Luba;")
    public static class629 field5450 = new class629(0, 0);

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "Z")
    public static boolean field5453 = false;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        if (arg0 != 10) {
            this.method15((byte) -120, -71);
        }
        ++field5451;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int[] var4 = this.method20(0, -21986, arg1);
            for (int var5 = 0; ~class132.field1627 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field5448;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (arg1 > -83) {
            field5453 = true;
        }
        if (super.field38.field7618) {
            int[][] var4 = this.method22(arg0, (byte) -102, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class132.field1627; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field5449;
        if (~arg2 == -1) {
            super.field44 = arg1.method3045(-128) == 1;
        }
        if (arg0 >= -89) {
            method2367((byte) -23);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method2367(byte arg0) {
        if (arg0 != 114) {
            method2367((byte) 39);
        }
        field5450 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class394() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(BI)I")
    public static final int method2368(byte arg0, int arg1) {
        ++field5452;
        if (arg0 != -80) {
            field5450 = null;
        }
        return arg1 & 127;
    }

    static {
        new class344("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
