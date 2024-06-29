import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class298 implements class360 {

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field4131 = 0;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "[S")
    public static short[] field4133 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4132 = "white:";

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
    public static final void method1922(boolean arg0) {
        field4130++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class5.field83[var1] = false;
        }
        class23.field303 = class244.field3377;
        class80.field1235 = class34.field528;
        class123.field1731 = 5;
        class217.field2871 = class356.field5020;
        class299.field4142 = -1;
        class3.field31 = class336.field4561;
        class6.field91 = -1;
        class449.field6496 = class368.field5158;
        class405.field5890 = 0;
        class36.field550 = class35.field541;
        class89.field1359 = 0;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method1923(String[] arg0, int arg1, int arg2, int arg3) {
        field4128++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg3 < 51) {
                method1926((byte) -50);
            }
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static final void method1924(int arg0) {
        class442.field6400.method158((byte) 7, 241);
        class220.field2895++;
        field4134++;
        class442.field6400.method2396(class162.method1075(-45), 12450);
        if (arg0 != 11296) {
            method1922(true);
        }
        class442.field6400.method2416(22064, class194.field2696);
        class442.field6400.method2416(22064, class243.field3359);
        class442.field6400.method2396(class67.field1056, arg0 + 1154);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
    public final String method1925(long arg0, int arg1, int arg2, int[] arg3) {
        field4127++;
        if (arg2 == 0) {
            class315 var6 = class46.method322(arg3[0], (byte) 15);
            return var6.method2001((int) arg0, true);
        } else if (arg2 == 1 || arg2 == 10) {
            class389 var7 = class347.method2222((int) arg0, 18682);
            return var7.field5722;
        } else if (arg1 == -8259) {
            return arg2 == 6 || arg2 == 7 || arg2 == 11 ? class46.method322(arg3[0], (byte) 32).method2001((int) arg0, true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)Z")
    public static final boolean method1926(byte arg0) {
        field4126++;
        class207 var1 = (class207) class167.field2393.field2720.field5369;
        if (arg0 >= -44) {
            field4133 = null;
        }
        if (var1 == null || class167.field2393.field2720 == var1) {
            return false;
        } else {
            if (var1.field2797 >= 2000) {
                var1.field2797 -= 2000;
            }
            return var1.field2797 == 1001;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
    public static void method1927(boolean arg0) {
        field4133 = null;
        if (!arg0) {
            field4132 = null;
        }
    }
}
