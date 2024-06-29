import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class15 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Z")
    public static boolean field218 = true;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field224 = 5063219;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljf;")
    public static class229 field229 = class212.method1457((byte) 118, "null");

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljf;")
    public static class229 field225 = class212.method1457((byte) 63, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Ljf;")
    private static class229 field230 = class212.method1457((byte) 111, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Ljf;")
    public static class229 field233 = field230;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljf;")
    public static class229 field231 = class212.method1457((byte) 85, "<col=ffff00>");

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Ljf;")
    public static class229 field235 = class212.method1457((byte) 127, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Ljf;")
    public static class229 field237 = class212.method1457((byte) 127, "logo");

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient;")
    public static client field223;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[Ltl;")
    public static class210[] field228;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[Lkb;")
    public static class35[] field220;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lek;I)V", line = 8)
    public static final void method146(class185 arg0, int arg1) {
        class115.field2057 = arg0;
        field226++;
        if (arg1 >= -96) {
            field228 = (class210[]) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLtb;Ltb;Z)I", line = 19)
    public static final int method147(int arg0, byte arg1, class222 arg2, class222 arg3, boolean arg4) {
        field219++;
        if (arg0 == 1) {
            int var5 = arg2.field4854;
            int var6 = arg3.field4854;
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
            return arg2.method1530((byte) -100).field2440.method1619(arg3.method1530((byte) -100).field2440, arg1 ^ 0x2F);
        } else if (arg0 == 3) {
            if (arg2.field3794.method1641((byte) -64, class331.field5640)) {
                if (arg3.field3794.method1641((byte) -64, class331.field5640)) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3794.method1641((byte) -64, class331.field5640)) {
                return arg4 ? 1 : -1;
            } else {
                return arg2.field3794.method1619(arg3.field3794, 115);
            }
        } else if (arg0 == 4) {
            return arg2.method1990((byte) -109) ? (arg3.method1990((byte) -122) ? 0 : 1) : (arg3.method1990((byte) -124) ? -1 : 0);
        } else {
            if (arg1 != 92) {
                field230 = (class229) null;
            }
            if (arg0 == 5) {
                return arg2.method1989(false) ? (arg3.method1989(false) ? 0 : 1) : (arg3.method1989(false) ? -1 : 0);
            } else if (arg0 == 6) {
                return arg2.method1994(arg1 - 22) ? (arg3.method1994(77) ? 0 : 1) : (arg3.method1994(58) ? -1 : 0);
            } else if (arg0 == 7) {
                return arg2.method1996(arg1 ^ 0x5C) ? (arg3.method1996(0) ? 0 : 1) : (arg3.method1996(0) ? -1 : 0);
            } else {
                return arg2.field3798 - arg3.field3798;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLbm;Z)V", line = 95)
    public static final void method148(boolean arg0, class138 arg1, boolean arg2) {
        if (!arg2) {
            method149((class14) null, (class229) null, (byte) 62);
        }
        field227++;
        if (class108.field1900 || arg0) {
            int var3 = class78.field1429;
            int var4 = var3 * 956 / 503;
            class170.field2964.method310((class175.field3046 - var4) / 2, 0, var4, var3);
            class22.field380.method543(class175.field3046 / 2 - class22.field380.field2294 / 2, 18);
        }
        arg1.method954(class289.field4940, class175.field3046 / 2, class78.field1429 / 2 - 26, 16777215, -1);
        int var5 = class78.field1429 / 2 - 18;
        if (class108.field1900) {
            class163.method1098(class175.field3046 / 2 - 152, var5, 304, 34, 9179409);
            class163.method1098(class175.field3046 / 2 - 151, var5 + 1, 302, 32, 0);
            class163.method1102(class175.field3046 / 2 - 150, var5 + 2, class295.field5043 * 3, 30, 9179409);
            class163.method1102(class175.field3046 / 2 + (class295.field5043 * 3) - 150, var5 + 2, 300 - (class295.field5043 * 3), 30, 0);
        } else {
            class114.method805(class175.field3046 / 2 - 152, var5, 304, 34, 9179409);
            class114.method805(class175.field3046 / 2 - 151, var5 + 1, 302, 32, 0);
            class114.method803(class175.field3046 / 2 - 150, var5 + 2, class295.field5043 * 3, 30, 9179409);
            class114.method803(class175.field3046 / 2 + class295.field5043 * 3 - 150, var5 + 2, 300 - (class295.field5043 * 3), 30, 0);
        }
        arg1.method954(class42.field772, class175.field3046 / 2, class78.field1429 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lkh;Ljf;B)I", line = 141)
    public static final int method149(class14 arg0, class229 arg1, byte arg2) {
        field222++;
        if (arg2 < 20) {
            field224 = -10;
        }
        int var3 = arg0.field195;
        arg0.method111(-27075, arg1.field3973);
        arg0.field195 += class180.field3126.method2052(arg0.field195, (byte) 57, arg1.field3944, arg1.field3973, arg0.field174, 0);
        return arg0.field195 - var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)Lk;", line = 163)
    public static final class237 method150(byte arg0, int arg1) {
        class237 var2 = (class237) class117.field2091.method229((long) arg1, -14);
        field236++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 37) {
            method150((byte) 116, -65);
        }
        byte[] var3 = class115.field2057.method1275(arg1, 0, -5211);
        class237 var4 = new class237();
        if (var3 != null) {
            var4.method1696((byte) -118, new class14(var3));
        }
        var4.method1693(255);
        class117.field2091.method227(-25077, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 202)
    public static final void method151(boolean arg0) {
        class293.field5016.method230(true);
        if (arg0) {
            method148(false, (class138) null, false);
        }
        field234++;
        class214.field3683.method230(true);
        class273.field4665.method230(true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 218)
    public static void method152(int arg0) {
        field220 = null;
        field233 = null;
        field229 = null;
        field230 = null;
        field223 = null;
        field235 = null;
        field225 = null;
        field228 = null;
        field231 = null;
        field237 = null;
        if (arg0 != 302) {
            field233 = (class229) null;
        }
    }
}
