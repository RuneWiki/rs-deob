import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class175 {

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "[I")
    public static int[] field2162 = new int[3];

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "Ljava/lang/String;")
    public String field2161;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(CI)Z", line = 4)
    public static final boolean method1001(char arg0, int arg1) {
        field2157++;
        if (arg1 <= 104) {
            return true;
        } else {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "()V", line = 22)
    public static final void method1002() {
        for (int var0 = 0; var0 < class320.field4304; var0++) {
            class752 var1 = class561.field7935[var0];
            class709.method3983(var1, true);
            class561.field7935[var0] = null;
        }
        class320.field4304 = 0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)Lqm;", line = 36)
    public static final class146 method1003(int arg0, int arg1) {
        int var2 = 101 / ((3 - arg1) / 47);
        field2159++;
        return new class146(arg0, false);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V", line = 50)
    public static void method1004(int arg0) {
        field2162 = null;
        if (arg0 != 0) {
            field2162 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZLha;Z)Lpga;", line = 60)
    public static final class535 method1005(int arg0, boolean arg1, class60 arg2, boolean arg3) {
        field2158++;
        if (arg0 == -1) {
            return null;
        }
        if (class427.field6031 != null) {
            for (int var4 = 0; var4 < class427.field6031.length; var4++) {
                if (class427.field6031[var4] == arg0) {
                    return class583.field8166[var4];
                }
            }
        }
        class535 var5 = (class535) class362.field4796.method1571(-123, (long) arg0);
        if (var5 != null) {
            if (arg1 && var5.field7253 == null) {
                class377 var6 = class389.method2270(class473.field6550, true, arg0);
                if (var6 == null) {
                    return null;
                }
                var5.field7253 = var6;
            }
            return var5;
        }
        class204[] var7 = class204.method1128(class421.field5901, arg0);
        if (var7 == null) {
            return null;
        }
        if (!arg3) {
            method1003(-104, 72);
        }
        class377 var8 = class389.method2270(class473.field6550, true, arg0);
        if (var8 == null) {
            return null;
        }
        class535 var9;
        if (arg1) {
            var9 = new class535(arg2.method425(var8, var7, true), var8);
        } else {
            var9 = new class535(arg2.method425(var8, var7, true));
        }
        class362.field4796.method1574((long) arg0, var9, (byte) -80);
        return var9;
    }
}
