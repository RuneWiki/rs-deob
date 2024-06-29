import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class270 extends class196 {

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Ljava/lang/String;")
    private String field4130 = "null";

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public static int field4134 = 1;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4138 = "Discard";

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field4141 = -1;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4149 = "green:";

    @OriginalMember(owner = "client!a", name = "E", descriptor = "C")
    public char field4133;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "C")
    public char field4137;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    private int field4147;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Ltd;")
    private class192 field4127;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Ltd;")
    public class192 field4129;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Llm;")
    public static class210 field4126;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 8)
    public final String method1897(boolean arg0, int arg1) {
        field4131++;
        if (this.field4129 == null) {
            return this.field4130;
        }
        class241 var3 = (class241) this.field4129.method1320((long) arg1, 13002);
        if (var3 == null) {
            return this.field4130;
        } else {
            if (!arg0) {
                field4126 = (class210) null;
            }
            return var3.field3586;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Z", line = 29)
    public final boolean method1898(int arg0, int arg1) {
        field4139++;
        if (this.field4129 == null) {
            return false;
        }
        if (this.field4127 == null) {
            this.method1900((byte) -58);
        }
        class261 var3 = (class261) this.field4127.method1320((long) arg1, 13002);
        if (arg0 == 6) {
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 52)
    public final boolean method1899(String arg0, int arg1) {
        field4146++;
        if (this.field4129 == null) {
            return false;
        }
        if (arg1 != -6) {
            method1904(false);
        }
        if (this.field4127 == null) {
            this.method1901((byte) 11);
        }
        for (class326 var3 = (class326) this.field4127.method1320(class74.method474((byte) -128, arg0), 13002); var3 != null; var3 = (class326) this.field4127.method1326((byte) -117)) {
            if (var3.field4908.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V", line = 81)
    private final void method1900(byte arg0) {
        this.field4127 = new class192(this.field4129.method1322(14965));
        field4143++;
        for (class261 var2 = (class261) this.field4129.method1321((byte) -57); var2 != null; var2 = (class261) this.field4129.method1330((byte) -119)) {
            class261 var3 = new class261((int) var2.field1603);
            this.field4127.method1319(-95, (long) var2.field3954, var3);
        }
        if (arg0 != -58) {
            method1908(56);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V", line = 103)
    private final void method1901(byte arg0) {
        this.field4127 = new class192(this.field4129.method1322(14965));
        if (arg0 != 11) {
            this.method1897(false, -105);
        }
        for (class241 var2 = (class241) this.field4129.method1321((byte) -84); var2 != null; var2 = (class241) this.field4129.method1330((byte) -112)) {
            class326 var3 = new class326(var2.field3586, (int) var2.field1603);
            this.field4127.method1319(-120, class74.method474((byte) -128, var2.field3586), var3);
        }
        field4148++;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I", line = 144)
    public final int method1902(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4137 = (char) 65463;
        }
        field4132++;
        if (this.field4129 == null) {
            return this.field4147;
        } else {
            class261 var3 = (class261) this.field4129.method1320((long) arg1, 13002);
            return var3 == null ? this.field4147 : var3.field3954;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLre;)V", line = 164)
    public final void method1903(byte arg0, class263 arg1) {
        field4136++;
        if (arg0 < 14) {
            method1907(56, -79L);
        }
        while (true) {
            int var3 = arg1.method1787(false);
            if (var3 == 0) {
                return;
            }
            this.method1909(87, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 185)
    public static void method1904(boolean arg0) {
        field4138 = null;
        field4126 = null;
        if (!arg0) {
            field4149 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 213)
    public static final String method1905(long arg0, int arg1) {
        field4140++;
        return arg1 > -46 ? (String) null : class177.method1224(0, arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(III)Led;", line = 225)
    public static final class311 method1906(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3374; var4++) {
            class311 var5 = var3.field3354[var4];
            if ((var5.field4720 >> 29 & 0x3L) == 2L && var5.field4724 == arg1 && var5.field4735 == arg2) {
                class114.method788(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IJ)V", line = 250)
    public static final void method1907(int arg0, long arg1) {
        field4145++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class193.field2892 < 100 || class283.field4277) || class193.field2892 >= 200) {
            class92.method656(0, class327.field4920, "", arg0 ^ 0x5);
            return;
        }
        String var3 = class194.method1337(arg1, arg0 + 7);
        if (arg0 != -6) {
            field4128 = 66;
        }
        for (int var4 = 0; var4 < class193.field2892; var4++) {
            if (class7.field50[var4] == arg1) {
                class92.method656(0, var3 + class211.field3209, "", -1);
                return;
            }
        }
        for (int var5 = 0; var5 < class247.field3687; var5++) {
            if (class212.field3220[var5] == arg1) {
                class92.method656(0, class73.field956 + var3 + class96.field1438, "", arg0 + 5);
                return;
            }
        }
        if (var3.equals(class114.field1750.field2934)) {
            class92.method656(0, class124.field1935, "", -1);
            return;
        }
        class156.field2347[class193.field2892] = var3;
        class290.field4390++;
        class7.field50[class193.field2892] = arg1;
        class255.field3872[class193.field2892] = 0;
        class17.field196[class193.field2892] = "";
        class63.field831[class193.field2892] = 0;
        class120.field1891[class193.field2892] = false;
        class315.field4761 = class225.field3423;
        class193.field2892++;
        class234.field3507.method28(103, false);
        class234.field3507.method1816(arg1, 21054);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 322)
    public static final void method1908(int arg0) {
        field4135++;
        if (arg0 < 13) {
            method1904(true);
        }
        if (class60.field796 != null) {
            class9 var1 = class60.field796;
            synchronized (class60.field796) {
                class60.field796 = null;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILre;)V", line = 340)
    private final void method1909(int arg0, int arg1, class263 arg2) {
        if (arg1 == 1) {
            this.field4133 = class166.method1164(arg2.method1810((byte) 116), (byte) 106);
        } else if (arg1 == 2) {
            this.field4137 = class166.method1164(arg2.method1810((byte) 102), (byte) 37);
        } else if (arg1 == 3) {
            this.field4130 = arg2.method1801(-30054);
        } else if (arg1 == 4) {
            this.field4147 = arg2.method1826(-206227536);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1830((byte) -77);
            this.field4129 = new class192(class104.method731(var4, -59));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1826(-206227536);
                class101 var7;
                if (arg1 == 5) {
                    var7 = new class241(arg2.method1801(-30054));
                } else {
                    var7 = new class261(arg2.method1826(-206227536));
                }
                this.field4129.method1319(108, (long) var6, var7);
            }
        }
        int var8 = -73 / ((arg0 - 8) / 60);
        field4142++;
    }
}
