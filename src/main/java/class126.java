import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class126 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1949 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1954 = "Connection lost.";

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lfa;")
    public static class273 field1953;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lmi;")
    public static class282 field1948;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[Ljj;")
    public static class110[] field1958;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[Lmh;")
    public static class160[] field1957;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I")
    public static final int method838(int arg0, byte arg1) {
        field1952++;
        int var2 = -46 / ((11 - arg1) / 43);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method839(int arg0) {
        field1954 = null;
        field1957 = null;
        if (arg0 == -1) {
            field1948 = null;
            field1958 = null;
            field1949 = null;
            field1953 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1950++;
        class120 var5 = (class120) class42.field550.method872((byte) -99, (long) arg1);
        if (var5 == null) {
            var5 = new class120();
            class42.field550.method857(false, var5, (long) arg1);
        }
        if (arg4 >= var5.field1842.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1842.length; var8++) {
                var6[var8] = var5.field1842[var8];
                var7[var8] = var5.field1840[var8];
            }
            for (int var9 = var5.field1842.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1840 = var7;
            var5.field1842 = var6;
        }
        var5.field1842[arg4] = arg3;
        if (arg0 >= -89) {
            method842(83, (byte) 83);
        }
        var5.field1840[arg4] = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Lvk;")
    public static final class36 method841(int arg0) {
        field1956++;
        class36 var1 = (class36) class281.field4643.method1187((byte) 127);
        if (var1 != null) {
            var1.method900(116);
            var1.method1075(7596);
            return var1;
        }
        int var2 = -73 / ((arg0 + 46) / 33);
        class36 var3;
        do {
            var3 = (class36) class297.field4887.method1187((byte) 127);
            if (var3 == null) {
                return null;
            }
            if (var3.method224((byte) 95) > class267.method1841((byte) 109)) {
                return null;
            }
            var3.method900(94);
            var3.method1075(7596);
        } while ((Long.MIN_VALUE & var3.field2552) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)V")
    public static final void method842(int arg0, byte arg1) {
        field1955++;
        if (arg1 <= 113) {
            field1958 = null;
        }
        for (class134 var2 = class250.field3985.method871(-36); var2 != null; var2 = class250.field3985.method869(-14210)) {
            if ((var2.field2102 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method900(126);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Z")
    public static final boolean method843(byte arg0, int arg1) {
        class45.field613 = arg1 + 1 & 0xFFFF;
        class52.field709 = true;
        int var2 = -6 % ((arg0 + 28) / 57);
        field1951++;
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILvh;)V")
    public static final void method844(int arg0, class298 arg1) {
        field1959++;
        class294.method2054(arg0, arg1, -115);
    }
}
