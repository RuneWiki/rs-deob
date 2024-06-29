import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class317 {

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public int field4896 = 16777215;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public int field4894 = 8;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4892 = -1;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field4895 = 205;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "F")
    public static float field4900;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public int field4897;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field4902;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public int field4903;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
    public boolean field4893;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lgk;I)V")
    public final void method1981(class468 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2765(72);
            if (var3 == 0) {
                field4898++;
                int var4 = 66 % ((-arg1 - 27) / 36);
                return;
            }
            this.method1983(var3, 20663, arg0);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIIIIIBI)V")
    public static final void method1982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, int arg13) {
        field4901++;
        if (class249.field3405 == null) {
            return;
        }
        class400 var15;
        if (arg13 >= 0) {
            int var14 = arg13 - 1;
            var15 = class88.field1375[var14];
        } else {
            int var16 = -arg13 - 1;
            if (class449.field6615 == var16) {
                var15 = class410.field6198;
            } else {
                var15 = class83.field1327[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        if (arg12 >= -80) {
            field4892 = -12;
        }
        class486 var17 = class119.field1824.method248(arg4, 30);
        int var18;
        int var19;
        if (arg3 == 1 || arg3 == 3) {
            var19 = var17.field7182;
            var18 = var17.field7235;
        } else {
            var18 = var17.field7182;
            var19 = var17.field7235;
        }
        int var20 = (var18 >> 1) + arg11;
        int var21 = (var18 + 1 >> 1) + arg11;
        int var22 = (var19 >> 1) + arg0;
        int var23 = arg0 + (var19 + 1 >> 1);
        class337 var24 = class249.field3405[arg5];
        int var25 = var24.method707(var20, var22) - (-var24.method707(var21, var22) - var24.method707(var20, var23) - var24.method707(var21, var23)) >> 2;
        class372 var26 = new class372();
        var26.field5628 = arg10;
        var26.field5633 = arg4;
        if (arg6 < arg2) {
            int var27 = arg2;
            arg2 = arg6;
            arg6 = var27;
        }
        var26.field5623 = arg11;
        var26.field5625 = class86.field1350 + arg7;
        var26.field5631 = class86.field1350 + arg8;
        var26.field5627 = arg0;
        var26.field5621 = arg3;
        var26.field5620 = var15.field7686;
        var26.field5630 = arg2 + arg11;
        var26.field5626 = arg6 + arg11;
        if (arg9 < arg1) {
            int var28 = arg1;
            arg1 = arg9;
            arg9 = var28;
        }
        var26.field5629 = var25;
        var26.field5637 = arg0 + arg1;
        var26.field5636 = (var26.field5627 << 7) + (var19 << 6);
        var26.field5632 = arg0 + arg9;
        var26.field5624 = (var26.field5623 << 7) + (var18 << 6);
        class257.field3491.method2958(var26, (byte) 105);
        var15.field6058 = var26;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILgk;)V")
    private final void method1983(int arg0, int arg1, class468 arg2) {
        if (arg0 == 1) {
            this.field4894 = arg2.method2727((byte) 43);
        } else if (arg0 == 2) {
            this.field4893 = true;
        } else if (arg0 == 3) {
            this.field4903 = arg2.method2745(-1);
            this.field4902 = arg2.method2745(-1);
            this.field4899 = arg2.method2745(arg1 - 20664);
        } else if (arg0 == 4) {
            this.field4904 = arg2.method2765(72);
        } else if (arg0 == 5) {
            this.field4897 = arg2.method2727((byte) 43);
        } else if (arg0 == 6) {
            this.field4896 = arg2.method2759(1919914864);
        }
        if (arg1 == 20663) {
            field4905++;
        }
    }

    static {
        new class347("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
