import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class249 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[Lub;")
    public static class227[] field4321 = new class227[100];

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lub;")
    public static class227 field4325 = class257.method1749(" )2>", 17263);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lub;")
    public static class227 field4327 = class257.method1749("headicons_pk", 17263);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ln;")
    public static class138 field4326;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Z")
    public static final boolean method1665(boolean arg0) {
        field4323++;
        if (!arg0) {
            method1669(-28, 102, -127, -39, 17);
        }
        if (class171.field2856 != 0) {
            try {
                class191.field3243.method1499(-118, class61.field1123.field4153);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    public static int method1666(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZI)Lub;")
    public static final class227 method1667(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = -22 % ((arg3 - 10) / 32);
        field4320++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        for (int var6 = arg1 / arg0; var6 != 0; var6 /= arg0) {
            var5++;
        }
        int var7 = var5;
        if (arg1 < 0 || arg2) {
            var7 = var5 + 1;
        }
        byte[] var8 = new byte[var7];
        if (arg1 < 0) {
            var8[0] = 45;
        } else if (arg2) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg1 % arg0;
            arg1 /= arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var8[var7 - var9 - 1] = (byte) (var11 + 48);
        }
        class227 var10 = new class227();
        var10.field3915 = var7;
        var10.field3955 = var8;
        return var10;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1668(int arg0) {
        field4327 = null;
        field4325 = null;
        field4321 = null;
        if (arg0 == -1) {
            field4326 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 118) {
            return;
        }
        field4319++;
        if (class125.field2234 <= arg1 && class19.field331 >= arg1) {
            int var5 = class23.method111(arg3, class161.field2718, class46.field817, 0);
            int var6 = class23.method111(arg2, class161.field2718, class46.field817, 0);
            class94.method579(var6, var5, -10260, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILnj;)Lub;")
    public static final class227 method1670(int arg0, int arg1, class226 arg2) {
        field4324++;
        try {
            if (arg1 != -27760) {
                field4322 = 30;
            }
            class227 var3 = new class227();
            var3.field3915 = arg2.method1467(false);
            if (var3.field3915 > arg0) {
                var3.field3915 = arg0;
            }
            var3.field3955 = new byte[var3.field3915];
            arg2.field3879 += class173.field2889.method1285(0, var3.field3955, false, var3.field3915, arg2.field3901, arg2.field3879);
            return var3;
        } catch (Exception var4) {
            return class43.field705;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZZZI)Lnh;")
    public static final class57 method1671(byte arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg0 != 42) {
            return null;
        }
        class192 var5 = null;
        if (class75.field1310 != null) {
            var5 = new class192(arg4, class75.field1310, class7.field157[arg4], 1000000);
        }
        field4317++;
        return new class57(var5, class152.field2641, arg4, arg2, arg1, arg3);
    }
}
