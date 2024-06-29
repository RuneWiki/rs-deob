import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class281 extends class359 {

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    private int field3943;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field3947;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3941 = new Rectangle[100];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Z")
    public static boolean field3945 = true;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
    public static int[] field3954 = new int[32];

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3948 = "Select";

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Z")
    public static boolean field3962;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field3941[var0] = new Rectangle();
        }
        field3961 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I", line = 11)
    public static final int method1796(int arg0, int arg1, int arg2, int arg3) {
        field3952++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg1 == var4) {
            return 1023 - arg2;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I", line = 30)
    public static final int method1797(int arg0, int arg1, int arg2) {
        field3957++;
        int var3 = class201.method1288(arg2 - 1, arg1 + -1, (byte) -72) + class201.method1288(arg2 + 1, arg1 - 1, (byte) -72) + class201.method1288(arg2 + -1, arg1 + 1, (byte) -72) + class201.method1288(arg2 - -1, arg1 - -1, (byte) -72);
        if (arg0 <= 44) {
            method1797(44, 20, 112);
        }
        int var4 = class201.method1288(arg2 - 1, arg1, (byte) -72) + class201.method1288(arg2 + 1, arg1, (byte) -72) + class201.method1288(arg2, arg1 + -1, (byte) -72) + class201.method1288(arg2, arg1 - -1, (byte) -72);
        int var5 = class201.method1288(arg2, arg1, (byte) -72);
        return var4 / 8 + (var3 / 16 + (var5 / 4));
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z", line = 55)
    public final boolean method1798(int arg0, int arg1, int arg2) {
        field3940++;
        if (arg1 != -28675) {
            this.method1801(-87, -75, -48, (byte) -70);
        }
        return this.field3955 <= arg0 && arg0 <= this.field3951 && arg2 >= this.field3949 && this.field3960 >= arg2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lbk;I)Lll;", line = 70)
    public static final class204 method1799(class211 arg0, int arg1) {
        field3944++;
        if (arg1 == 1) {
            class204 var2 = new class204();
            var2.field2794 = arg0.method1355(32136);
            var2.field2793 = class419.method2603(var2.field2794, true);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)Z", line = 85)
    public final boolean method1800(int arg0, byte arg1, int arg2) {
        if (arg1 >= -84) {
            this.field3950 = 84;
        }
        field3956++;
        return this.field3958 <= arg0 && this.field3946 >= arg0 && arg2 >= this.field3943 && this.field3950 >= arg2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIB)Z", line = 101)
    public final boolean method1801(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -10) {
            return false;
        } else {
            field3942++;
            return this.field3947 == arg2 && this.field3958 <= arg0 && this.field3946 >= arg0 && this.field3943 <= arg1 && this.field3950 >= arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IBI)V", line = 125)
    public final void method1802(int arg0, int[] arg1, byte arg2, int arg3) {
        field3939++;
        arg1[2] = arg3 - (this.field3949 - this.field3943);
        arg1[0] = this.field3947;
        arg1[1] = arg0 + this.field3958 - this.field3955;
        int var5 = -34 % ((arg2 + 38) / 50);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 139)
    public static void method1803(boolean arg0) {
        field3941 = null;
        if (arg0) {
            field3948 = null;
            field3954 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([IIII)V", line = 151)
    public final void method1804(int[] arg0, int arg1, int arg2, int arg3) {
        field3959++;
        if (arg2 == 32) {
            arg0[1] = this.field3955 + arg1 - this.field3958;
            arg0[2] = this.field3949 + arg3 - this.field3943;
            arg0[0] = 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIIIII)V", line = 180)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3943 = arg2;
        this.field3949 = arg6;
        this.field3960 = arg8;
        this.field3950 = arg4;
        this.field3947 = arg0;
        this.field3958 = arg1;
        this.field3951 = arg7;
        this.field3955 = arg5;
        this.field3946 = arg3;
    }
}
