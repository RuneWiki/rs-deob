import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class634 {

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
    public static int[] field9081 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)Z")
    public static final boolean method3644(int arg0, int arg1, int arg2) {
        int var3 = 14 % ((arg2 - 2) / 50);
        field9079++;
        return class560.method3283(arg0, arg1, -8225) & class488.method2934(arg1, arg0, 2048);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lfe;")
    public static final class567 method3645(int arg0, int arg1) {
        field9086++;
        if (arg1 <= 101) {
            return null;
        }
        class567 var2 = (class567) class322.field4583.method3054((byte) -96, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field1283.method1453(arg0, -123, 0);
        class567 var4 = new class567();
        if (var3 != null) {
            var4.method3318(-1, new class35(var3));
        }
        var4.method3315(-100);
        class322.field4583.method3047(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)Lcq;")
    public static final class464 method3646(int arg0) {
        field9085++;
        class42 var1 = null;
        class464 var2 = new class464(class649.field9170, 0);
        try {
            class637 var3 = class341.field4796.method2277(true, true, "");
            while (var3.field9091 == 0) {
                class246.method1639(1L, (byte) -99);
            }
            if (var3.field9091 == 1) {
                var1 = (class42) var3.field9093;
                byte[] var4 = new byte[(int) var1.method386((byte) 66)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method383(var4.length - var5, var5, var4, 1);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class464(new class35(var4), class649.field9170, 0);
            }
        } catch (Exception var8) {
        }
        if (arg0 < 119) {
            return null;
        }
        try {
            if (var1 != null) {
                var1.method389(31);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!qt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9084++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)Z")
    public static final boolean method3647(int arg0, int arg1, int arg2) {
        field9078++;
        if (arg2 < 0 || arg1 < 0 || class435.field6078[1].length <= arg2 || arg1 >= class435.field6078[1][arg2].length) {
            return false;
        } else if (arg0 >= -29) {
            return false;
        } else {
            return (class435.field6078[1][arg2][arg1] & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
    public static void method3648(boolean arg0) {
        field9081 = null;
        if (!arg0) {
            method3644(69, -9, -68);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I")
    public static final int method3649(int arg0, byte arg1) {
        field9082++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else {
            if (arg1 >= -31) {
                method3646(-120);
            }
            if (arg0 == 6409 || arg0 == 34846) {
                return 6409;
            } else if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }
}
