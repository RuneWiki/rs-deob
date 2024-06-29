import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lqf;")
    private static class117 field1241 = class72.method514(126, "Loaded input handler");

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lqf;")
    public static class117 field1255 = class72.method514(101, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lqf;")
    private static class117 field1243 = class72.method514(111, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lqf;")
    private static class117 field1253 = class72.method514(125, "Click to continue");

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lqf;")
    public static class117 field1254 = class72.method514(103, "Von:");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lqf;")
    public static class117 field1246 = field1253;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lqf;")
    public static class117 field1250 = field1241;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lqf;")
    public static class117 field1263 = class72.method514(124, "backvmid2");

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Lqf;")
    public static class117 field1267 = class72.method514(118, "backhmid2");

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lqf;")
    public static class117 field1262 = field1243;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method427(int arg0) {
        field1241 = null;
        field1246 = null;
        field1243 = null;
        field1263 = null;
        field1250 = null;
        field1253 = null;
        field1262 = null;
        if (arg0 == 4280) {
            field1254 = null;
            field1267 = null;
            field1255 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method428(int arg0) {
        if (arg0 != 23868) {
            return;
        }
        field1257++;
        for (class23 var1 = (class23) class97.field2356.method27(arg0 ^ 0x14BB); var1 != null; var1 = (class23) class97.field2356.method25((byte) -128)) {
            if (var1.field453 == -1) {
                var1.field437 = 0;
                class132.method1026(arg0 - 23869, var1);
            } else {
                var1.method495(-89);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)I")
    public static final int method429(int arg0, int arg1, byte arg2) {
        if (arg2 != 9) {
            return 17;
        }
        field1236++;
        class78 var3 = (class78) client.field395.method1221(arg2 + 113, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field1762.length) {
            return var3.field1762[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V")
    public static final void method430(int arg0, byte arg1) {
        field1259++;
        if (arg1 != -47) {
            method430(34, (byte) -90);
        }
        if (class48.field1022 == arg0) {
            return;
        }
        if (class48.field1022 == 0) {
            class121.method973((byte) 123);
        }
        if (arg0 == 20 || arg0 == 40) {
            class36.field767 = 0;
            class43.field855 = 0;
            class140.field3339 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class52.field1079 != null) {
            class52.field1079.method738(1);
            class52.field1079 = null;
        }
        if (class48.field1022 == 25 || class48.field1022 == 40) {
            class66.method469(69);
            class49.method353();
        }
        if (class48.field1022 == 25) {
            class96.field2343 = 0;
            class91.field2237 = 1;
            class26.field521 = 0;
            class112.field2626 = 0;
            class47.field950 = 1;
        }
        if (arg0 == 0 || arg0 == 35) {
            class95.method746(1282);
            class149.method1199(2);
            if (class36.field753 == null) {
                class36.field753 = class52.method390((byte) -120, class3.field64, 765, 503);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class36.field753 = null;
            class95.method746(1282);
            class117.method910(class3.field64, arg1 ^ 0xFFFFFFB8, class134.field3184, class78.field1774);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class36.field753 = null;
            class149.method1199(2);
            class45.method310(-81, class134.field3184, class3.field64);
        }
        class48.field1022 = arg0;
        class42.field823 = true;
    }
}
