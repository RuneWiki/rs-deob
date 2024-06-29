import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class150 {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    public static int[] field3724 = new int[32768];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public static int[] field3719 = new int[50];

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lqf;")
    private static class117 field3729 = class72.method514(102, "Walk here");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lqf;")
    public static class117 field3727 = field3729;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3730 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Llf;")
    public static class82 field3721 = new class82();

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lqf;")
    private static class117 field3731 = class72.method514(102, "Accept challenge");

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lqf;")
    private static class117 field3732 = class72.method514(100, "To");

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lqf;")
    public static class117 field3734 = field3731;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lqf;")
    public static class117 field3733 = field3732;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1205(int arg0, boolean arg1, Object arg2) {
        if (arg0 != -12653) {
            return null;
        }
        field3723++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class65.method461(var3, 0) : var3;
        } else if (arg2 instanceof class105) {
            class105 var4 = (class105) arg2;
            return var4.method416((byte) -127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lmd;B)V")
    public static final void method1206(class87 arg0, byte arg1) {
        field3728++;
        arg0.field1968 = false;
        if (arg0.field1949 != -1) {
            class96 var2 = class130.method1013(arg0.field1949, -127);
            if (var2 == null || var2.field2312 == null) {
                arg0.field1949 = -1;
            } else {
                arg0.field1988++;
                if (arg0.field1948 < var2.field2312.length && arg0.field1988 > var2.field2334[arg0.field1948]) {
                    arg0.field1988 = 1;
                    arg0.field1948++;
                    class146.method1173(var2, false, arg0.field1948, arg0.field1998, arg0.field1960);
                }
                if (arg0.field1948 >= var2.field2312.length) {
                    arg0.field1988 = 0;
                    arg0.field1948 = 0;
                    class146.method1173(var2, false, arg0.field1948, arg0.field1998, arg0.field1960);
                }
            }
        }
        if (arg1 <= 54) {
            method1205(-76, false, null);
        }
        if (arg0.field2014 != -1 && class43.field856 >= arg0.field1974) {
            if (arg0.field1961 < 0) {
                arg0.field1961 = 0;
            }
            int var3 = class126.method994((byte) 51, arg0.field2014).field1226;
            if (var3 == -1) {
                arg0.field2014 = -1;
            } else {
                class96 var4 = class130.method1013(var3, -79);
                if (var4 == null || var4.field2312 == null) {
                    arg0.field2014 = -1;
                } else {
                    arg0.field1977++;
                    if (arg0.field1961 < var4.field2312.length && arg0.field1977 > var4.field2334[arg0.field1961]) {
                        arg0.field1977 = 1;
                        arg0.field1961++;
                        class146.method1173(var4, false, arg0.field1961, arg0.field1998, arg0.field1960);
                    }
                    if (var4.field2312.length <= arg0.field1961 && (arg0.field1961 < 0 || arg0.field1961 >= var4.field2312.length)) {
                        arg0.field2014 = -1;
                    }
                }
            }
        }
        if (arg0.field2017 != -1 && arg0.field1994 <= 1) {
            class96 var5 = class130.method1013(arg0.field2017, -118);
            if (var5.field2329 == 1 && arg0.field1955 > 0 && class43.field856 >= arg0.field2013 && class43.field856 > arg0.field1976) {
                arg0.field1994 = 1;
                return;
            }
        }
        if (arg0.field2017 != -1 && arg0.field1994 == 0) {
            class96 var6 = class130.method1013(arg0.field2017, -77);
            if (var6 == null || var6.field2312 == null) {
                arg0.field2017 = -1;
            } else {
                arg0.field2015++;
                if (var6.field2312.length > arg0.field1952 && var6.field2334[arg0.field1952] < arg0.field2015) {
                    arg0.field2015 = 1;
                    arg0.field1952++;
                    class146.method1173(var6, false, arg0.field1952, arg0.field1998, arg0.field1960);
                }
                if (arg0.field1952 >= var6.field2312.length) {
                    arg0.field2010++;
                    arg0.field1952 -= var6.field2331;
                    if (var6.field2339 <= arg0.field2010) {
                        arg0.field2017 = -1;
                    } else if (arg0.field1952 >= 0 && arg0.field1952 < var6.field2312.length) {
                        class146.method1173(var6, false, arg0.field1952, arg0.field1998, arg0.field1960);
                    } else {
                        arg0.field2017 = -1;
                    }
                }
                arg0.field1968 = var6.field2314;
            }
        }
        if (arg0.field1994 > 0) {
            arg0.field1994--;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field3732 = null;
        field3729 = null;
        field3724 = null;
        field3733 = null;
        field3721 = null;
        if (arg0 != -2) {
            method1208(null, 73);
        }
        field3731 = null;
        field3734 = null;
        field3727 = null;
        field3719 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1208(Component arg0, int arg1) {
        field3726++;
        arg0.removeKeyListener(class116.field2740);
        arg0.removeFocusListener(class116.field2740);
        class45.field884 = arg1;
    }
}
