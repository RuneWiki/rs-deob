import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class115 {

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    private int field2077 = 0;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Ll;")
    private class328 field2069;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
    public static boolean field2080 = true;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lg;")
    public static class181 field2071;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lqk;")
    private class70 field2079;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 5)
    public static void method849(byte arg0) {
        if (arg0 <= 111) {
            method850((byte) 34, (Component) null);
        }
        field2071 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 18)
    public static final void method850(byte arg0, Component arg1) {
        arg1.addMouseListener(class317.field5164);
        field2074++;
        if (arg0 > 65) {
            arg1.addMouseMotionListener(class317.field5164);
            arg1.addFocusListener(class317.field5164);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILgb;ILgb;Z)I", line = 33)
    public static final int method851(int arg0, class191 arg1, int arg2, class191 arg3, boolean arg4) {
        if (arg2 > -90) {
            field2071 = (class181) null;
        }
        field2076++;
        if (arg0 == 1) {
            int var5 = arg1.field3615;
            int var6 = arg3.field3615;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class101.method765(arg3.method1324(-1482557983).field3269, class86.field1497, 3, arg1.method1324(-1482557983).field3269);
        } else if (arg0 == 3) {
            if (arg1.field3240.equals("-")) {
                if (arg3.field3240.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3240.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class101.method765(arg3.field3240, class86.field1497, 3, arg1.field3240);
            }
        } else if (arg0 == 4) {
            return arg1.method1513(8) ? (arg3.method1513(8) ? 0 : 1) : (arg3.method1513(8) ? -1 : 0);
        } else if (arg0 == 5) {
            return arg1.method1516((byte) -67) ? (arg3.method1516((byte) -67) ? 0 : 1) : (arg3.method1516((byte) -67) ? -1 : 0);
        } else if (arg0 == 6) {
            return arg1.method1517((byte) 106) ? (arg3.method1517((byte) 106) ? 0 : 1) : (arg3.method1517((byte) 106) ? -1 : 0);
        } else if (arg0 == 7) {
            return arg1.method1518(123) ? (arg3.method1518(127) ? 0 : 1) : (arg3.method1518(126) ? -1 : 0);
        } else {
            return arg1.field3237 - arg3.field3237;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Lqk;", line = 98)
    public final class70 method852(int arg0) {
        field2072++;
        this.field2077 = 0;
        int var2 = -2 % ((-arg0 - 32) / 59);
        return this.method853((byte) 55);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Lqk;", line = 109)
    public final class70 method853(byte arg0) {
        field2075++;
        if (this.field2077 > 0 && this.field2069.field5275[this.field2077 - 1] != this.field2079) {
            class70 var2 = this.field2079;
            this.field2079 = var2.field1290;
            return var2;
        }
        if (arg0 <= 40) {
            field2071 = (class181) null;
        }
        class70 var3;
        do {
            if (this.field2077 >= this.field2069.field5272) {
                return null;
            }
            var3 = this.field2069.field5275[this.field2077++].field1290;
        } while (this.field2069.field5275[this.field2077 - 1] == var3);
        this.field2079 = var3.field1290;
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lek;IZLek;I)Leb;", line = 142)
    public static final class133 method854(class206 arg0, int arg1, boolean arg2, class206 arg3, int arg4) {
        field2078++;
        boolean var5 = true;
        int[] var6 = arg3.method1413(arg1, (byte) 60);
        for (int var7 = arg4; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method1426(var6[var7], arg1, (byte) -110);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method1426(var9, 0, (byte) -119);
                } else {
                    var10 = arg0.method1426(0, var9, (byte) -126);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class133(arg3, arg0, arg1, arg2);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V", line = 197)
    public static final void method855(byte arg0) {
        int var1 = -33 % ((arg0 + 65) / 39);
        class177 var2 = (class177) class275.field4486.method431(0);
        field2073++;
        while (var2 != null) {
            class151 var3 = var2.field2925;
            if (class276.field4506 != var3.field2548 || var3.field2591 < class267.field4371) {
                var2.method535(-2801);
            } else if (var3.field2583 <= class267.field4371) {
                if (var3.field2588 > 0) {
                    class314 var4 = class149.field2533[var3.field2588 - 1];
                    if (var4 != null && var4.field199 >= 0 && var4.field199 < 13312 && var4.field213 >= 0 && var4.field213 < 13312) {
                        var3.method1082(28, class267.field4371, var4.field213, class21.method189((byte) -92, var4.field213, var4.field199, var3.field2548) - var3.field2572, var4.field199);
                    }
                }
                if (var3.field2588 < 0) {
                    int var5 = -var3.field2588 - 1;
                    class98 var6;
                    if (class96.field1752 == var5) {
                        var6 = class96.field1750;
                    } else {
                        var6 = class182.field3151[var5];
                    }
                    if (var6 != null && var6.field199 >= 0 && var6.field199 < 13312 && var6.field213 >= 0 && var6.field213 < 13312) {
                        var3.method1082(92, class267.field4371, var6.field213, class21.method189((byte) 78, var6.field213, var6.field199, var3.field2548) - var3.field2572, var6.field199);
                    }
                }
                var3.method1079((byte) -38, class197.field3303);
                class198.method1350(class276.field4506, (int) var3.field2554, (int) var3.field2567, (int) var3.field2576, 60, var3, var3.field2570, -1L, false);
            }
            var2 = (class177) class275.field4486.method439(-28512);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ll;)V", line = 268)
    public class115(class328 arg0) {
        this.field2069 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I", line = 277)
    public static int method856(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
