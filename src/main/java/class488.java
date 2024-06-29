import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class488 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field6847 = 0;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field6843 = 0;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field6845 = 1;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
    public static int[] field6848 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[S")
    public static short[] field6846 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lvm;")
    public abstract class293 method1099(int arg0);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public abstract void method1103(int arg0);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2850(int arg0, String arg1) {
        field6844++;
        if (arg0 != 1) {
            method2851((byte) 36);
        }
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class226.method1463(arg0 ^ 0xFFFFFFFE, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class157.field2190; var3++) {
            String var4 = class42.field570[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class226.method1463(arg0 - 2, var4);
            if (var5 != null && var5.equals(var2)) {
                class157.field2190--;
                for (int var6 = var3; var6 < class157.field2190; var6++) {
                    class42.field570[var6] = class42.field570[var6 + 1];
                    class310.field4681[var6] = class310.field4681[var6 + 1];
                    class484.field6787[var6] = class484.field6787[var6 + 1];
                    class95.field1354[var6] = class95.field1354[var6 + 1];
                    class245.field3499[var6] = class245.field3499[var6 + 1];
                    class176.field2498[var6] = class176.field2498[var6 + 1];
                }
                class475.field6649 = class12.field169;
                class367.field5548++;
                class378.method2320(class485.field6819, (byte) 119);
                class230.field3390.method2619((byte) -123, class330.method2021((byte) 120, arg1));
                class230.field3390.method2597(arg1, (byte) -109);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method1100(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public abstract void method1097(int arg0);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method2851(byte arg0) {
        int var1 = -52 % ((-arg0 - 63) / 48);
        field6848 = null;
        field6846 = null;
    }

    static {
        new class332("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field6849 = 0;
    }
}
