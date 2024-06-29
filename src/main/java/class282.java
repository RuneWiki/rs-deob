import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class282 {

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "Los;")
    public static class282 field4150;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public abstract void method1011(int arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Los;)V")
    public abstract void method1014(class282 arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
    public abstract void method1012(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(III)V")
    public abstract void method1019(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public abstract void method1015(int arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLjava/lang/String;IZ)I")
    public static final int method1781(boolean arg0, String arg1, int arg2, boolean arg3) {
        field4148++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
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
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!arg0) {
            return 32;
        } else if (var5) {
            return var6;
        } else {
            throw new NumberFormatException();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public static final void method1782(byte arg0) {
        class80.field983 = null;
        class333.field4844 = null;
        class115.field1467 = null;
        class280.field4126 = null;
        class218.field3264 = null;
        class295.field4276 = null;
        class214.field3217 = null;
        field4149++;
        class491.field6928 = null;
        class311.field4397 = null;
        class190.field2816 = null;
        class453.field6355 = null;
        class375.field5397 = null;
        class92.field1166 = null;
        class273.field3976 = null;
        class243.field3627 = null;
        class231.field3496 = null;
        class134.field1751 = null;
        if (arg0 < -72) {
            class306.field4362 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III[I)V")
    public abstract void method1016(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
    public abstract void method1017();

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
    public abstract void method1018(int arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([I)V")
    public abstract void method1013(int[] arg0);

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
    public static void method1783(int arg0) {
        if (arg0 != 9349) {
            field4150 = null;
        }
        field4150 = null;
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V")
    public abstract void method1010(int arg0);

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
    public abstract void method1020(int arg0);

    static {
        new class326("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4151 = 0;
        field4152 = 0;
    }
}
