import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class213 implements class283 {

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Lpl;")
    private class612 field2651;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "[I")
    public static int[] field2649 = new int[32];

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2648++;
        int var8 = class605.method3315(arg7, 4095, class289.field3595, class159.field2063);
        int var9 = class605.method3315(arg1, 4095, class289.field3595, class159.field2063);
        int var10 = class605.method3315(arg5, arg2 - 24348, class263.field3294, class314.field4052);
        int var11 = class605.method3315(arg3, 4095, class263.field3294, class314.field4052);
        int var12 = class605.method3315(arg7 + arg4, 4095, class289.field3595, class159.field2063);
        int var13 = class605.method3315(arg1 - arg4, 4095, class289.field3595, class159.field2063);
        for (int var14 = var8; var14 < var12; var14++) {
            class57.method362(var10, class550.field7650[var14], arg6, var11, -127);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class57.method362(var10, class550.field7650[var15], arg6, var11, -121);
        }
        int var16 = class605.method3315(arg4 + arg5, 4095, class263.field3294, class314.field4052);
        if (arg2 != 28443) {
            return;
        }
        int var17 = class605.method3315(arg3 - arg4, 4095, class263.field3294, class314.field4052);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class550.field7650[var18];
            class57.method362(var10, var19, arg6, var16, arg2 ^ 0xFFFF9089);
            class57.method362(var16, var19, arg0, var17, -123);
            class57.method362(var17, var19, arg6, var11, 95);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
    public static final void method1263(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class66.method393(var3.field1022);
        class66.method393(var3.field1034);
        if (var3.field1022 != null) {
            var3.field1022 = null;
        }
        if (var3.field1034 != null) {
            var3.field1034 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
    public static void method1264(int arg0) {
        field2649 = null;
        if (arg0 != 9179) {
            method1264(68);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Ltj;")
    public final class31 method1265(byte arg0) {
        field2650++;
        if (arg0 != -58) {
            this.field2651 = null;
        }
        return class31.field436;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
    public final int method1266(int arg0) {
        int var2 = 116 / ((-arg0 - 55) / 49);
        field2647++;
        return this.field2651.method3356(28528) ? 100 : this.field2651.method3357(false);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lpl;)V")
    public class213(class612 arg0) {
        this.field2651 = arg0;
    }
}
