import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class173 extends class80 {

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    private int field2793 = 0;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    private int field2790 = 1;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    private int field2794 = 0;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "Los;")
    public static class309 field2785 = new class309("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "F")
    public static float field2795;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "Ll;")
    public static class16 field2792;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILha;)I", line = 4)
    public static final int method1196(int arg0, class43 arg1) {
        ++field2783;
        int var2 = arg1.method261(2, 0);
        int var3;
        if (~var2 == -1) {
            var3 = 0;
        } else if (~var2 != -2) {
            if (var2 != 2) {
                var3 = arg1.method261(11, 0);
            } else {
                var3 = arg1.method261(8, 0);
            }
        } else {
            var3 = arg1.method261(5, 0);
        }
        if (arg0 <= 35) {
            method1196(-72, (class43) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 31)
    public static void method1197(int arg0) {
        field2792 = null;
        if (arg0 > -55) {
            field2795 = -0.7735859F;
        }
        field2785 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILnn;)V", line = 43)
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field2790 = arg2.method1858(-3256);
                }
            } else {
                this.field2793 = arg2.method1858(-3256);
            }
        } else {
            this.field2794 = arg2.method1858(-3256);
        }
        int var5 = 109 % ((arg1 - 28) / 53);
        ++field2784;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V", line = 87)
    public final void method23(boolean arg0) {
        class488.method2956(-15926);
        ++field2787;
        if (!arg0) {
            method1196(42, (class43) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)[I", line = 98)
    public final int[] method25(int arg0, int arg1) {
        ++field2786;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int var4 = class44.field795[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class137.field2308; ++var6) {
                int var7 = class460.field6860[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field2794 == -1) {
                    var9 = (-var4 + var7) * this.field2790;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field2790 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field2793 != 0) {
                    if (~this.field2793 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class352.field5192[(4094 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 != -16828 ? null : var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lgh;B)V", line = 170)
    public static final void method1198(class388 arg0, byte arg1) {
        ++field2789;
        class388 var2 = class368.method2257(-41, arg0);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field5745;
            var4 = var2.field5712;
        } else {
            var4 = class65.field1330;
            var3 = class71.field1415;
        }
        class375.method2306(false, var3, var4, 5, arg0);
        if (arg1 != -63) {
            method1198((class388) null, (byte) -90);
        }
        class308.method1971(var3, arg0, var4, -3804);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 198)
    public class173() {
        super(0, true);
    }
}
