import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class203 extends class55 {

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "Ljava/lang/String;")
    private String field2885 = "null";

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "[I")
    public static int[] field2875 = new int[256];

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field2873 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Lrc;")
    public static class9 field2883 = new class9(64);

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "C")
    public char field2877;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "C")
    public char field2887;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    private int field2893;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "Lpg;")
    public static class187 field2888;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "Lbc;")
    public static class282 field2886;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lc;")
    public class284 field2869;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lc;")
    private class284 field2874;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "[[B")
    public static byte[][] field2889;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field2889 = null;
        field2883 = null;
        if (arg0 != 29840) {
            field2875 = null;
        }
        field2886 = null;
        field2888 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLqi;)V")
    public final void method1302(byte arg0, class216 arg1) {
        field2870++;
        if (arg0 != 80) {
            this.method1302((byte) -83, (class216) null);
        }
        while (true) {
            int var3 = arg1.method1407(118);
            if (var3 == 0) {
                return;
            }
            this.method1305(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1303(int arg0, int arg1) {
        field2884++;
        if (this.field2869 == null) {
            return this.field2885;
        }
        if (arg0 != -5) {
            this.method1307(97, (byte) -41);
        }
        class20 var3 = (class20) this.field2869.method1895((long) arg1, -127);
        return var3 == null ? this.field2885 : var3.field249;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)I")
    public static final int method1304(int arg0, int arg1) {
        field2892++;
        int var2 = -45 % ((41 - arg0) / 48);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLqi;I)V")
    private final void method1305(boolean arg0, class216 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2887 = class285.method1908((byte) 68, arg1.method1355(true));
        } else if (arg2 == 2) {
            this.field2877 = class285.method1908((byte) 68, arg1.method1355(true));
        } else if (arg2 == 3) {
            this.field2885 = arg1.method1352((byte) 116);
        } else if (arg2 == 4) {
            this.field2893 = arg1.method1358(101);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1380(true);
            this.field2869 = new class284(class72.method450(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1358(126);
                class288 var7;
                if (arg2 == 5) {
                    var7 = new class20(arg1.method1352((byte) 52));
                } else {
                    var7 = new class138(arg1.method1358(100));
                }
                this.field2869.method1894(-1, var7, (long) var6);
            }
        }
        field2872++;
        if (arg0) {
            this.field2885 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1306(int arg0, String arg1) {
        field2878++;
        int var2 = 25 % ((-arg0 - 31) / 48);
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class144.field2064; var3++) {
            if (arg1.equalsIgnoreCase(class82.field990[var3])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class177.field2507.field3466);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)I")
    public final int method1307(int arg0, byte arg1) {
        field2890++;
        if (this.field2869 == null) {
            return this.field2893;
        }
        if (arg1 != -22) {
            this.method1313((byte) 86);
        }
        class138 var3 = (class138) this.field2869.method1895((long) arg0, -116);
        return var3 == null ? this.field2893 : var3.field2013;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    private final void method1308(int arg0) {
        if (arg0 != -13249) {
            this.field2893 = 98;
        }
        this.field2874 = new class284(this.field2869.method1891((byte) -107));
        field2879++;
        for (class138 var2 = (class138) this.field2869.method1890((byte) 88); var2 != null; var2 = (class138) this.field2869.method1889(false)) {
            class138 var3 = new class138((int) var2.field4489);
            this.field2874.method1894(-1, var3, (long) var2.field2013);
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)Z")
    public final boolean method1309(int arg0, int arg1) {
        if (arg1 != -24204) {
            field2876 = 50;
        }
        field2881++;
        if (this.field2869 == null) {
            return false;
        }
        if (this.field2874 == null) {
            this.method1308(arg1 + 10955);
        }
        class138 var3 = (class138) this.field2874.method1895((long) arg0, -128);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method1310(boolean arg0, String arg1) {
        field2891++;
        if (this.field2869 == null) {
            return false;
        }
        if (this.field2874 == null) {
            this.method1313((byte) -111);
        }
        class34 var3 = (class34) this.field2874.method1895(class247.method1592(arg1, 2998), -120);
        if (!arg0) {
            this.method1305(true, (class216) null, 78);
        }
        while (var3 != null) {
            if (var3.field398.equals(arg1)) {
                return true;
            }
            var3 = (class34) this.field2874.method1887((byte) 105);
        }
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILgl;III)V")
    public static final void method1311(int arg0, class273 arg1, int arg2, int arg3, int arg4) {
        field2894++;
        if (arg2 <= 58) {
            return;
        }
        for (class116 var5 = (class116) class72.field865.method1532(-128); var5 != null; var5 = (class116) class72.field865.method1523(-89)) {
            if (var5.field1623 == arg3 && (arg4 * 128) == var5.field1615 && arg0 * 128 == var5.field1607 && var5.field1630.field4012 == arg1.field4012) {
                if (var5.field1610 != null) {
                    class14.field178.method189(var5.field1610);
                    var5.field1610 = null;
                }
                if (var5.field1622 != null) {
                    class14.field178.method189(var5.field1622);
                    var5.field1622 = null;
                }
                var5.method1935(126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILtl;IB)V")
    public static final void method1312(int arg0, class240 arg1, int arg2, byte arg3) {
        if (arg3 != 107) {
            method1311(-19, (class273) null, 61, -123, 52);
        }
        if (arg1.field4592 == arg0 && arg0 != -1) {
            class274 var4 = class27.method165(arg0, (byte) -116);
            int var5 = var4.field4090;
            if (var5 == 1) {
                arg1.field4567 = 0;
                arg1.field4518 = arg2;
                arg1.field4580 = 1;
                arg1.field4565 = 0;
                arg1.field4503 = 0;
                class270.method1730(arg1.field4567, arg1.field4563, arg1.field4553, (byte) -114, var4, class177.field2507 == arg1);
            }
            if (var5 == 2) {
                arg1.field4565 = 0;
            }
        } else if (arg0 == -1 || arg1.field4592 == -1 || class27.method165(arg0, (byte) 92).field4071 >= class27.method165(arg1.field4592, (byte) 119).field4071) {
            arg1.field4565 = 0;
            arg1.field4592 = arg0;
            arg1.field4554 = arg1.field4603;
            arg1.field4503 = 0;
            arg1.field4567 = 0;
            arg1.field4518 = arg2;
            arg1.field4580 = 1;
            if (arg1.field4592 != -1) {
                class270.method1730(arg1.field4567, arg1.field4563, arg1.field4553, (byte) -116, class27.method165(arg1.field4592, (byte) 74), class177.field2507 == arg1);
            }
        }
        field2871++;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
    private final void method1313(byte arg0) {
        field2880++;
        this.field2874 = new class284(this.field2869.method1891((byte) 110));
        class20 var2 = (class20) this.field2869.method1890((byte) 104);
        if (arg0 > -32) {
            return;
        }
        while (var2 != null) {
            class34 var3 = new class34(var2.field249, (int) var2.field4489);
            this.field2874.method1894(-1, var3, class247.method1592(var2.field249, 2998));
            var2 = (class20) this.field2869.method1889(false);
        }
    }
}
