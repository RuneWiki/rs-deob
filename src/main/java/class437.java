import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class437 extends class476 {

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public int field6308;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "[I")
    public static int[] field6310 = new int[2];

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field6306 = -1;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "Lkc;")
    public static class157 field6312 = new class157("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Ldk;")
    public static class421 field6309;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method2587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class17.field275.field4360 = 0;
        field6311++;
        class17.field275.method1891(false, class88.field1435.field2102);
        class17.field275.method1891(false, arg2);
        if (arg1 != 16175) {
            method2588(-101);
        }
        class17.field275.method1891(false, arg0);
        class17.field275.method1857(arg1 ^ 0x217BAD3F, arg3);
        class17.field275.method1857(561746448, arg4);
        class49.field703 = -3;
        class92.field1489 = 0;
        class196.field2876 = 1;
        class221.field3126 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 27)
    public class437() {
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 32)
    public static void method2588(int arg0) {
        field6312 = null;
        field6310 = null;
        field6309 = null;
        if (arg0 <= 6) {
            method2588(125);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V", line = 47)
    public class437(int arg0) {
        this.field6308 = arg0;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)[Ltv;", line = 65)
    public static final class293[] method2589(int arg0) {
        if (arg0 > -19) {
            method2588(14);
        }
        field6314++;
        if (class462.field6687 == null) {
            class293[] var1 = class370.method2210((byte) -108, class346.field4985);
            class293[] var2 = new class293[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class293 var8 = var1[var4];
                if ((var8.field3962 <= 0 || var8.field3962 >= 24) && var8.field3959 >= 800 && var8.field3958 >= 600 && (class20.field294 >= 96 || class195.field2849 != 0 || var8.field3959 <= 1024 && var8.field3958 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class293 var10 = var2[var9];
                        if (var8.field3959 == var10.field3959 && var8.field3958 == var10.field3958) {
                            if (var10.field3962 < var8.field3962) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class462.field6687 = new class293[var3];
            class57.method371(var2, 0, class462.field6687, 0, var3);
            int[] var5 = new int[class462.field6687.length];
            for (int var6 = 0; var6 < class462.field6687.length; var6++) {
                class293 var7 = class462.field6687[var6];
                var5[var6] = var7.field3959 * var7.field3958;
            }
            class270.method1591((byte) 103, class462.field6687, var5);
        }
        return class462.field6687;
    }
}
