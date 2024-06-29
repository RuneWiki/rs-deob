import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class332 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "[Lao;")
    public static class288[] field4767 = new class288[14];

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
    public static boolean field4768 = false;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "D")
    public static double field4771 = -1.0D;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field4772 = -1;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Lqe;")
    public static class469 field4770 = new class469(39, 8);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static void method2095(byte arg0) {
        field4767 = null;
        field4770 = null;
        int var1 = 37 % ((14 - arg0) / 44);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILma;Lma;)V")
    public static final void method2096(int arg0, int arg1, int arg2, class12 arg3, class12 arg4) {
        class186 var5 = class467.method2834(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2834 = arg3;
        var5.field2841 = arg4;
        int var6 = class582.field8287 == class46.field568 ? 1 : 0;
        if (!arg3.method320((byte) 84)) {
            arg3.field8431 = class374.field5677[var6];
            class374.field5677[var6] = arg3;
        } else if (arg3.method329((byte) 101)) {
            arg3.field8431 = class614.field8664[var6];
            class614.field8664[var6] = arg3;
        } else {
            arg3.field8431 = class577.field8153[var6];
            class577.field8153[var6] = arg3;
            class226.field3323 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method320((byte) 84)) {
            if (arg4.method329((byte) 99)) {
                arg4.field8431 = class614.field8664[var6];
                class614.field8664[var6] = arg4;
                return;
            }
            arg4.field8431 = class577.field8153[var6];
            class577.field8153[var6] = arg4;
            class226.field3323 = true;
            return;
        }
        arg4.field8431 = class374.field5677[var6];
        class374.field5677[var6] = arg4;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZILha;)Lci;")
    public static final class451 method2097(int arg0, boolean arg1, int arg2, class60 arg3) {
        field4773++;
        if (arg0 == -1) {
            return null;
        }
        if (class716.field10074 != null) {
            for (int var4 = 0; var4 < class716.field10074.length; var4++) {
                if (class716.field10074[var4] == arg0) {
                    return class122.field1661[var4];
                }
            }
        }
        class451 var5 = (class451) class372.field5334.method803(108, (long) arg0);
        if (var5 != null) {
            if (arg1 && var5.field6665 == null) {
                class66 var6 = class647.method3764(arg0, class256.field3683, 0);
                if (var6 == null) {
                    return null;
                }
                var5.field6665 = var6;
            }
            return var5;
        } else if (arg2 == 31236) {
            class129[] var7 = class129.method918(class323.field4609, arg0);
            if (var7 == null) {
                return null;
            }
            class66 var8 = class647.method3764(arg0, class256.field3683, 0);
            if (var8 == null) {
                return null;
            }
            class451 var9;
            if (arg1) {
                var9 = new class451(arg3.method474(var8, var7, true), var8);
            } else {
                var9 = new class451(arg3.method474(var8, var7, true));
            }
            class372.field5334.method801(arg2 ^ 0x7A05, var9, (long) arg0);
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
    public static final boolean method2098(String arg0, boolean arg1, int arg2, int arg3) {
        field4769++;
        if (arg3 <= 29) {
            field4768 = true;
        }
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }
}
