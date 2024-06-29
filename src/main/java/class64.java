import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lr;")
    private static class118 field1458 = class153.method1136(97, "Loaded update list");

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lr;")
    public static class118 field1467 = field1458;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lef;")
    public static class35 field1464 = new class35(32);

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lr;")
    public static class118 field1469 = class153.method1136(80, "title_mute");

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[S")
    public static short[] field1470 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lr;")
    public static class118 field1471 = class153.method1136(106, "welle:");

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field1472 = 128;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[S")
    public static short[] field1473 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lr;")
    public static class118 field1474 = class153.method1136(75, "<col=ffffff>");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Ldf;")
    public static class28 field1468;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lff;")
    public static class42 field1454;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lmf;")
    public class89 field1459;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I")
    public static final int method560(int arg0, byte arg1, int arg2) {
        field1455++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 >= -100) {
                field1474 = null;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lid;")
    public static final class60 method561(boolean arg0, int arg1) {
        field1461++;
        class60 var2 = (class60) class141.field3193.method395((byte) -93, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class113.field2652.method350(4, -80, arg1);
        class60 var4 = new class60();
        if (var3 != null) {
            var4.method537(arg1, 0, new class105(var3));
        }
        var4.method536((byte) 78);
        class141.field3193.method391(var4, (long) arg1, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static final void method562(boolean arg0) {
        field1466++;
        for (int var1 = -1; var1 < class105.field2425; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class73.field1685[var1];
            }
            class132 var6 = class108.field2526[var5];
            if (var6 != null && var6.field773 > 0) {
                var6.field773--;
                if (var6.field773 == 0) {
                    var6.field709 = null;
                }
            }
        }
        if (!arg0) {
            method563(87);
        }
        for (int var2 = 0; var2 < class115.field2702; var2++) {
            int var3 = class68.field1580[var2];
            class83 var4 = class74.field1833[var3];
            if (var4 != null && var4.field773 > 0) {
                var4.field773--;
                if (var4.field773 == 0) {
                    var4.field709 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method563(int arg0) {
        if (arg0 <= 123) {
            method560(-6, (byte) 12, -75);
        }
        field1474 = null;
        field1468 = null;
        field1469 = null;
        field1471 = null;
        field1467 = null;
        field1454 = null;
        field1464 = null;
        field1473 = null;
        field1458 = null;
        field1470 = null;
    }
}
