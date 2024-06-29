import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class184 {

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    private int field2972 = 0;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lff;")
    private class47 field2966;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[I")
    public static int[] field2967 = new int[32];

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lve;")
    public static class255 field2968 = class87.method607(52, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[Lve;")
    public static class255[] field2969 = new class255[100];

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field2963 = 255;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Lli;")
    private class208 field2965;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILme;IJ)Z", line = 17)
    public static final boolean method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class177 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class314.method2166(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 32)
    public static final void method1285(byte arg0) {
        field2970++;
        if (arg0 != 28) {
            method1289(50, (byte) 32);
        }
        class271.field4658.method553(-118);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lm;", line = 48)
    public static final class43 method1286(Throwable arg0, String arg1) {
        field2971++;
        class43 var2;
        if (arg0 instanceof class43) {
            var2 = (class43) arg0;
            var2.field669 = var2.field669 + ' ' + arg1;
        } else {
            var2 = new class43(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lli;", line = 65)
    public final class208 method1287(int arg0) {
        field2960++;
        if (this.field2972 > 0 && this.field2966.field709[this.field2972 - 1] != this.field2965) {
            class208 var2 = this.field2965;
            this.field2965 = var2.field3563;
            return var2;
        } else if (arg0 <= 38) {
            return (class208) null;
        } else {
            class208 var3;
            do {
                if (this.field2966.field712 <= this.field2972) {
                    return null;
                }
                var3 = this.field2966.field709[this.field2972++].field3563;
            } while (this.field2966.field709[this.field2972 - 1] == var3);
            this.field2965 = var3.field3563;
            return var3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Lli;", line = 99)
    public final class208 method1288(int arg0) {
        int var2 = -34 / ((arg0 + 62) / 42);
        field2964++;
        this.field2972 = 0;
        return this.method1287(126);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V", line = 114)
    public static final void method1289(int arg0, byte arg1) {
        class59.field897 = -1;
        class314.field5334 = -1;
        if (arg1 != -96) {
            field2967 = (int[]) null;
        }
        field2961++;
        class85.field1369 = arg0;
        class301.method2099(arg1 ^ 0xFFFFFFC4);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 145)
    public static void method1290(int arg0) {
        field2967 = null;
        if (arg0 >= 7) {
            field2968 = null;
            field2969 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lff;)V", line = 161)
    public class184(class47 arg0) {
        this.field2966 = arg0;
    }
}
