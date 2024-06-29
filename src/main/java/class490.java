import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class490 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lko;")
    private class348 field7151;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lob;")
    public static class516 field7148 = new class516("", 17);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lvp;")
    public static class123 field7154 = new class123(53, 2);

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[I")
    public static int[] field7156 = new int[2];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Loo;")
    private class439 field7158;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lhh;")
    public static class84 field7157;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7155;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Loo;")
    public final class439 method2931(byte arg0) {
        field7146++;
        if (arg0 != -60) {
            field7155 = null;
        }
        class439 var2 = this.field7158;
        if (this.field7151.field5279 == var2) {
            this.field7158 = null;
            return null;
        } else {
            this.field7158 = var2.field6403;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Loo;")
    public final class439 method2932(int arg0) {
        if (arg0 < 40) {
            method2935(3, 120, -36, -74, -90, -93);
        }
        field7150++;
        class439 var2 = this.field7151.field5279.field6403;
        if (this.field7151.field5279 == var2) {
            this.field7158 = null;
            return null;
        } else {
            this.field7158 = var2.field6403;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lko;B)V")
    public final void method2933(class348 arg0, byte arg1) {
        int var3 = -98 % ((arg1 - 75) / 43);
        field7149++;
        this.field7151 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method2934(int arg0) {
        field7148 = null;
        field7154 = null;
        if (arg0 != 17) {
            method2936(114);
        }
        field7157 = null;
        field7156 = null;
        field7155 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
    public static final void method2935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= class322.field4945 && class145.field2134 >= arg5 && class229.field3347 <= arg1 && arg3 <= class156.field2366) {
            class231.method1509(arg1, (byte) 89, arg3, arg4, arg2, arg5);
        } else {
            class1.method2(arg0 ^ 0x2311, arg2, arg4, arg5, arg1, arg3);
        }
        if (arg0 != 0) {
            field7147 = -34;
        }
        field7152++;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)[Lne;")
    public static final class207[] method2936(int arg0) {
        if (class256.field3687 == null) {
            class207[] var1 = class453.method2725(class112.field1785, -64);
            class207[] var2 = new class207[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class207 var8 = var1[var4];
                if ((var8.field2979 <= 0 || var8.field2979 >= 24) && var8.field2973 >= 800 && var8.field2975 >= 600 && (class445.field6538 >= 96 || class399.field5865 != 0 || var8.field2973 <= 1024 && var8.field2975 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class207 var10 = var2[var9];
                        if (var8.field2973 == var10.field2973 && var8.field2975 == var10.field2975) {
                            if (var8.field2979 > var10.field2979) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class256.field3687 = new class207[var3];
            class486.method2904(var2, 0, class256.field3687, 0, var3);
            int[] var5 = new int[class256.field3687.length];
            for (int var6 = 0; var6 < class256.field3687.length; var6++) {
                class207 var7 = class256.field3687[var6];
                var5[var6] = var7.field2975 * var7.field2973;
            }
            class153.method1112(var5, (byte) -39, class256.field3687);
        }
        field7153++;
        if (arg0 != -801) {
            method2936(-88);
        }
        return class256.field3687;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class490() {
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lko;)V")
    public class490(class348 arg0) {
        this.field7151 = arg0;
    }
}
