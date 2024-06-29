import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class290 {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4005 = "Loaded input handler";

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[Z")
    public static boolean[] field4004 = new boolean[100];

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4012 = "Opened title screen";

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)Lrg;")
    public static final class383 method1869(byte arg0, int arg1) {
        field4006++;
        if (arg0 < 2) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class333.field4511[var2] == null || class333.field4511[var2][var3] == null) {
            boolean var4 = class77.method545(true, var2);
            if (!var4) {
                return null;
            }
        }
        return class333.field4511[var2][var3];
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;ZBLkq;Z)V")
    public static final void method1870(String arg0, boolean arg1, byte arg2, class351 arg3, boolean arg4) {
        if (arg2 != -34) {
            method1870((String) null, true, (byte) -51, (class351) null, false);
        }
        field4010++;
        if (!arg4) {
            class57.method379(3, 54, arg3, arg0);
            return;
        }
        if (class351.field4895.startsWith("win") && class351.field4889 != 3) {
            String var5 = null;
            if (arg3.field4888 != null) {
                var5 = arg3.field4888.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class295 var6 = class57.method379(0, 76, arg3, arg0);
                class270.field3684 = arg0;
                class124.field1735 = var6;
                class280.field3835 = arg3;
                return;
            }
        }
        if (class351.field4895.startsWith("mac")) {
            String var7 = null;
            if (arg3.field4888 != null) {
                var7 = arg3.field4888.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg1) {
                class57.method379(1, 86, arg3, arg0);
                return;
            }
        }
        class57.method379(2, 104, arg3, arg0);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method1871(int arg0) {
        field4004 = null;
        field4012 = null;
        field4005 = null;
        if (arg0 != 1024) {
            method1873(82, (class296) null);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public static final void method1872(int arg0, int arg1, int arg2) {
        field4002++;
        if (arg1 >= -20) {
            method1869((byte) 120, 26);
        }
        class413 var3 = class300.method1936(arg2, (byte) -11);
        int var4 = var3.field5996;
        int var5 = var3.field5997;
        int var6 = var3.field5994;
        int var7 = class48.field731[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class305.method1946(~var8 & class300.field4147[var4] | arg0 << var5 & var8, var4, 13239);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILqj;)V")
    public static final void method1873(int arg0, class296 arg1) {
        class189.field2617 = 0;
        field4008++;
        class97.field1486 = 0;
        class196.field2721 = new class357();
        class207.field2794 = new class452[1024];
        if (arg0 < -75) {
            class254.method1566(20731, arg1);
            class322.method2035(5, arg1);
        }
    }
}
