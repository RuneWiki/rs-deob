import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class133 extends class184 {

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "Lap;")
    public static class335 field1728 = new class335("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "J")
    public static long field1733;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "[I")
    public static int[] field1729;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field1730;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int var4 = class334.field4218[arg0];
            for (int var5 = 0; ~class245.field3167 < ~var5; ++var5) {
                var3[var5] = this.method924(class347.field4461[var5], class489.method2968(arg1, -564), var4) % 4096;
            }
        }
        if (arg1 != 578) {
            method922(-14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
    public static void method922(int arg0) {
        field1729 = null;
        if (arg0 == -14387) {
            field1728 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZZIII)V")
    public static final void method923(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg5 > arg6) {
            int var7 = (arg5 + arg6) / 2;
            int var8 = arg6;
            class254 var9 = class62.field808[var7];
            class62.field808[var7] = class62.field808[arg5];
            class62.field808[arg5] = var9;
            for (int var10 = arg6; ~var10 > ~arg5; ++var10) {
                if (~class364.method2087(class62.field808[var10], arg1, arg2, var9, (byte) 48, arg4, arg3) >= -1) {
                    class254 var11 = class62.field808[var10];
                    class62.field808[var10] = class62.field808[var8];
                    class62.field808[var8++] = var11;
                }
            }
            class62.field808[arg5] = class62.field808[var8];
            class62.field808[var8] = var9;
            method923(arg0, arg1, arg2, arg3, arg4, var8 + -1, arg6);
            method923(arg0, arg1, arg2, arg3, arg4, arg5, var8 + 1);
        }
        ++field1727;
        if (arg0 != 2) {
            method923(0, 117, false, false, -111, 25, 4);
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(III)I")
    private final int method924(int arg0, int arg1, int arg2) {
        ++field1731;
        int var4 = arg0 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        return arg1 >= -89 ? -58 : 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class133() {
        super(0, true);
    }
}
