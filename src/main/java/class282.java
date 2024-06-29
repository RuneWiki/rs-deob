import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class282 {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lwa;")
    private static class75 field4858 = class66.method560("Loading )2 please wait)3", false);

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lwa;")
    public static class75 field4861 = field4858;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lgb;")
    public static class158 field4855 = new class158(5);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field4856;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "J")
    public long field4854;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lpj;")
    public class171 field4860;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lpj;")
    public class171 field4862;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lpj;")
    public class171 field4864;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lcb;")
    public static class267 field4865;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JZZI)Lwa;", line = 5)
    public static final class75 method1997(long arg0, boolean arg1, boolean arg2, int arg3) {
        field4866++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        int var8 = var5;
        if (!arg2) {
            field4861 = (class75) null;
        }
        if (arg0 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg0 % (long) arg3);
            if (var11 < 0) {
                var11 = -var11;
            }
            arg0 /= (long) arg3;
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class75 var12 = new class75();
        var12.field1296 = var9;
        var12.field1280 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 83)
    public static void method1998(int arg0) {
        field4855 = null;
        field4858 = null;
        if (arg0 == -19081) {
            field4865 = null;
            field4861 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lhe;", line = 105)
    public static final class87 method1999(int arg0, int arg1) {
        class87 var2 = (class87) class28.field362.method1193((long) arg1, 78);
        field4868++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1505.method1911(4, arg1, -122);
        if (arg0 != -3) {
            method2001(8, true, -122, 80, -59, 92, -106);
        }
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method698((byte) -89, new class60(var3), arg1);
        }
        class28.field362.method1194(var4, (long) arg1, false);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lwa;", line = 129)
    public static final class75 method2000(int arg0, int arg1, int arg2) {
        field4863++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class166.field2797;
        } else if (var3 < -6) {
            return class8.field106;
        } else if (var3 < -3) {
            return class265.field4582;
        } else if (var3 < 0) {
            return class258.field4334;
        } else if (var3 > 9) {
            return class194.field3241;
        } else if (var3 > 6) {
            return class54.field897;
        } else if (var3 > 3) {
            return class175.field2941;
        } else if (var3 <= arg0) {
            return class6.field80;
        } else {
            return class211.field3600;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZIIIII)V", line = 168)
    public static final void method2001(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            return;
        }
        field4853++;
        if ((arg6 - arg0) >= class153.field2635 && class288.field4956 >= arg0 + arg6 && (arg5 - arg0) >= class90.field1495 && (arg0 + arg5) <= class294.field5041) {
            class258.method1842(arg3, !arg1, arg6, arg5, arg0, arg2, arg4);
        } else {
            class170.method1259(arg5, arg2, arg4, 1083924257, arg6, arg3, arg0);
        }
    }
}
