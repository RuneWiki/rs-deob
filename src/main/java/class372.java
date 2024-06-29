import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class372 extends class117 {

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public int field4834;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field4826;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4828 = null;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Ldq;")
    public static class493 field4833 = new class493(62, 1);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
    public static int[] field4824;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        field4821++;
        if (arg0 >= -72) {
            this.field4822 = 34;
        }
        return false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
    public static final boolean method2117(int arg0, int arg1) {
        field4836++;
        if (arg1 == 12505) {
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public static void method2118(int arg0) {
        field4828 = null;
        int var1 = 108 % ((42 - arg0) / 45);
        field4824 = null;
        field4833 = null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)I")
    public abstract int method516(boolean arg0);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public static final void method2119(int arg0) {
        int var1 = 1 / ((arg0 - 68) / 43);
        field4825++;
        for (class495 var2 = (class495) class223.field2817.method153(0); var2 != null; var2 = (class495) class223.field2817.method161(-60)) {
            if (var2.field7187 == -1) {
                var2.field7189 = 0;
                if (var2.field7193 >= 0 && var2.field7186 >= 0 && class452.field6526 > var2.field7193 && class440.field6307 > var2.field7186) {
                    class22.method183(var2, (byte) 86);
                }
            } else {
                var2.method2165(16225);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        field4832++;
        if (arg0 != -2) {
            this.method194((byte) -121);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = -29 / ((arg5 - 27) / 40);
        field4827++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIII)V")
    public class372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4829 = arg0;
        this.field4822 = arg1;
        this.field4831 = arg5;
        this.field4830 = arg4;
        this.field4834 = arg3;
        this.field4826 = arg6;
        this.field4835 = arg2;
    }
}
