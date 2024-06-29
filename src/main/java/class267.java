import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class267 {

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lad;")
    private class19 field3332 = new class19(256);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lmj;")
    private class344 field3327;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lfa;")
    private class524 field3328;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3329 = 765;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method1573(int arg0) {
        if (arg0 != 64) {
            field3329 = 24;
        }
        this.field3332.method88(90);
        field3333++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public final void method1574(byte arg0) {
        if (arg0 != 111) {
            method1575();
        }
        field3331++;
        this.field3332.method83((byte) -2, 5);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public static final void method1575() {
        for (int var0 = class304.field3767; var0 < class612.field8618; var0++) {
            for (int var1 = 0; var1 < class122.field1369; var1++) {
                for (int var2 = 0; var2 < class247.field3058; var2++) {
                    class499 var3 = class487.field7044[var0][var1][var2];
                    if (var3 != null) {
                        class465 var4 = var3.field7218;
                        class465 var5 = var3.field7223;
                        if (var4 != null && var4.method183((byte) -119)) {
                            class371.method2162(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method183((byte) 127)) {
                                class371.method2162(var5, var0, var1, var2, 1, 1);
                                var5.method184(0, 0, 2, 0, var4, class568.field8078, false);
                                var5.method170(29);
                            }
                            var4.method170(104);
                        }
                        for (class245 var6 = var3.field7215; var6 != null; var6 = var6.field3027) {
                            class613 var8 = var6.field3029;
                            if (var8 != null && var8.method183((byte) -83)) {
                                class371.method2162(var8, var0, var1, var2, var8.field8634 + 1 - var8.field8635, var8.field8630 - var8.field8627 + 1);
                                var8.method170(123);
                            }
                        }
                        class570 var7 = var3.field7230;
                        if (var7 != null && var7.method183((byte) -81)) {
                            class432.method2485(var7, var0, var1, var2);
                            var7.method170(97);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lpm;")
    public final class134 method1576(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field3332 = null;
        }
        field3326++;
        Object var3 = this.field3332.method78(0, (long) arg0);
        if (var3 != null) {
            return (class134) var3;
        } else if (this.field3328.method144(8649, arg0)) {
            class295 var4 = this.field3328.method140(arg0, arg1 ^ 0xFFFFFCA1);
            int var5 = var4.field3668 ? 64 : this.field3327.field4607;
            class134 var7;
            if (var4.field3679 && this.field3327.method1044()) {
                float[] var6 = this.field3328.method139(16564, var5, var5, 0.7F, arg0, false);
                var7 = this.field3327.method2007(var5, var5, var6, class412.field5529, var4.field3675 != 0, (byte) -117);
            } else {
                int[] var8 = !var4.field3666 && class594.method3340(var4.field3669, (byte) 48) ? this.field3328.method145(var5, true, 0.7F, -18551, var5, arg0) : this.field3328.method141(false, arg0, var5, 0.7F, 16944, var5);
                var7 = this.field3327.method1983(var4.field3675 != 0, (byte) 101, var5, var5, var8);
            }
            var7.method759(var4.field3687, arg1 - 19313, var4.field3678);
            this.field3332.method92(1, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lmj;Lfa;)V")
    public class267(class344 arg0, class524 arg1) {
        this.field3327 = arg0;
        this.field3328 = arg1;
    }
}
