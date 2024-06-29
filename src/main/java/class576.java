import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class576 extends class176 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lhh;")
    public class109 field7929;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field7930 = 1403;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lej;")
    public static class104 field7928 = new class104("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
    public static boolean field7934 = true;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field7935 = 2;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7933++;
        int var8 = 97 / ((arg4 + 7) / 51);
        if (arg0 == arg1) {
            class585.method3431(arg6, arg7, (byte) 74, arg3, arg2, arg5, arg1);
        } else if (class326.field4387 <= (arg2 - arg1) && (arg2 + arg1) <= class596.field8621 && (arg3 - arg0) >= class264.field3687 && class591.field8435 >= arg0 + arg3) {
            class7.method45(arg0, arg5, arg1, arg7, -114, arg3, arg2, arg6);
        } else {
            class77.method594(arg7, arg0, arg6, arg1, (byte) 60, arg5, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method3281(byte arg0) {
        field7928 = null;
        if (arg0 != -100) {
            method3282(-83, 51, 22, 26, -113, 105);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIIIII)V")
    public static final void method3282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7936++;
        if (arg5 >= -30) {
            field7932 = 67;
        }
        if (arg3 > class591.field8435 || arg2 < class264.field3687) {
            return;
        }
        boolean var6;
        if (arg4 < class326.field4387) {
            var6 = false;
            arg4 = class326.field4387;
        } else if (arg4 > class596.field8621) {
            arg4 = class596.field8621;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class326.field4387 > arg0) {
            arg0 = class326.field4387;
            var7 = false;
        } else if (class596.field8621 >= arg0) {
            var7 = true;
        } else {
            arg0 = class596.field8621;
            var7 = false;
        }
        if (arg3 >= class264.field3687) {
            class266.method1742(26844, class182.field2580[arg3++], arg0, arg1, arg4);
        } else {
            arg3 = class264.field3687;
        }
        if (arg2 > class591.field8435) {
            arg2 = class591.field8435;
        } else {
            class266.method1742(26844, class182.field2580[arg2--], arg0, arg1, arg4);
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg2; var8++) {
                int[] var9 = class182.field2580[var8];
                var9[arg4] = var9[arg0] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg3; var10 <= arg2; var10++) {
                class182.field2580[var10][arg4] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg3; var11 <= arg2; var11++) {
                class182.field2580[var11][arg0] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lhh;)V")
    public class576(class109 arg0) {
        this.field7929 = arg0;
    }
}
