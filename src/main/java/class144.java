import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class144 extends class45 {

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field1960 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field1961 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public int field1965 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field1958 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public int field1970 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public int field1968 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public int field1966 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public int field1971 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lni;")
    public class246 field1973;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1967 = " has logged out.";

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[Lrf;")
    public static class442[] field1972 = new class442[14];

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[Lpj;")
    public static class393[] field1969;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lvc;")
    public static final class308 method916(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class308 var4 = var3.field3525;
            var3.field3525 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Z")
    public final boolean method917(int arg0, int arg1, int arg2) {
        field1959++;
        if (this.field1960 <= arg1 && this.field1961 >= arg1 && arg0 >= this.field1958 && this.field1965 >= arg0) {
            return true;
        } else {
            if (arg2 != 16695) {
                field1972 = null;
            }
            return this.field1971 <= arg1 && this.field1968 >= arg1 && arg0 >= this.field1970 && this.field1966 >= arg0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JZ)V")
    public static final void method918(long arg0, boolean arg1) {
        if (!arg1) {
            method916(50, -23, -89);
        }
        field1975++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class394.method2528(arg0 - 1L, (byte) -105);
            class394.method2528(1L, (byte) -105);
        } else {
            class394.method2528(arg0, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method919(int arg0, int arg1) {
        field1974++;
        class430.field6313 = arg0;
        int var2 = -9 % ((arg1 - 54) / 43);
        class189 var3 = class22.field285;
        synchronized (class22.field285) {
            class22.field285.method1141(256);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;IZ)Z")
    public static final boolean method920(byte arg0, String arg1, int arg2, boolean arg3) {
        field1976++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg0 != -38) {
            method922(-18, -128, 100, -38, 20, false);
        }
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

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field1972 = null;
        if (arg0 <= 36) {
            method921((byte) 94);
        }
        field1967 = null;
        field1969 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            class30.method202((byte) 51);
        }
        field1963++;
        if (class103.field1428 != null && (arg4 != 3 || class406.field6030 != arg2 || class122.field1692 != arg0)) {
            class265.method1820((byte) -128, class103.field1428, class76.field1085);
            class103.field1428 = null;
        }
        if (arg4 == 3 && class103.field1428 == null) {
            class103.field1428 = class143.method915(class76.field1085, 0, arg0, arg2, 10, 0);
            if (class103.field1428 != null) {
                class122.field1692 = arg0;
                class406.field6030 = arg2;
                class253.method1547(23912, class76.field1085);
            }
        }
        if (arg4 == 3 && class103.field1428 == null) {
            method922(-1, -105, -1, arg3, class11.field171, true);
            return;
        }
        Container var6;
        if (class103.field1428 != null) {
            class180.field2384 = arg0;
            var6 = class103.field1428;
            class273.field3956 = arg2;
        } else if (class374.field5447 == null) {
            var6 = class76.field1085.field519;
            class273.field3956 = var6.getSize().width;
            class180.field2384 = var6.getSize().height;
        } else {
            Insets var7 = class374.field5447.getInsets();
            int var10001 = var7.right + var7.left;
            class273.field3956 = class374.field5447.getSize().width - var10001;
            int var12 = -var7.top;
            class180.field2384 = class374.field5447.getSize().height + var12 - var7.bottom;
            var6 = class374.field5447;
        }
        if (arg4 == 1) {
            class92.field1294 = 503;
            class138.field1907 = 765;
            class159.field2145 = (class273.field3956 - 765) / 2;
            class308.field4535 = 0;
        } else if (class134.field1867 < 96 && class373.field5422 == 0) {
            int var8 = class273.field3956 <= 1024 ? class273.field3956 : 1024;
            int var9 = class180.field2384 <= 768 ? class180.field2384 : 768;
            class159.field2145 = (class273.field3956 - var8) / 2;
            class138.field1907 = var8;
            class308.field4535 = 0;
            class92.field1294 = var9;
        } else {
            class92.field1294 = class180.field2384;
            class159.field2145 = 0;
            class138.field1907 = class273.field3956;
            class308.field4535 = 0;
        }
        if (class61.field803 != 0) {
            boolean var10000;
            if (class138.field1907 < 1024 && class92.field1294 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class283.method1953(class373.field5422, (byte) -22);
        } else {
            class202.field2708.setSize(class138.field1907, class92.field1294);
            if (class61.field807 != null) {
                class61.field807.method1670();
            }
            if (class374.field5447 == var6) {
                Insets var10 = class374.field5447.getInsets();
                class202.field2708.setLocation(class159.field2145 + var10.left, class308.field4535 + var10.top);
            } else {
                class202.field2708.setLocation(class159.field2145, class308.field4535);
            }
        }
        if (arg4 < 2) {
            class214.field2857 = false;
        } else {
            class214.field2857 = true;
        }
        if (class329.field4790 != -1) {
            class110.method720((byte) 121, true);
        }
        if (arg1 > -84) {
            field1962 = -21;
        }
        if (class191.field2558 != null && (class70.field932 == 30 || class70.field932 == 25)) {
            class376.method2440(false);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class270.field3927[var11] = true;
        }
        class171.field2296 = true;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lni;)V")
    public class144(class246 arg0) {
        this.field1973 = arg0;
    }
}
