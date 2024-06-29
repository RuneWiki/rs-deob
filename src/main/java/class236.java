import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class236 extends class287 {

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public int field4048 = 0;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public int field4064 = -1;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "Lmh;")
    public static class128 field4062 = class22.method156(127, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lmh;")
    public static class128 field4051 = class22.method156(125, "k");

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    public static int[] field4046 = new int[2];

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public int field4063;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 7)
    public static final void method1615(int arg0) {
        class139.field2392++;
        field4056++;
        if (arg0 != 1) {
            method1618((byte) -120, 82);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)V", line = 29)
    public static final void method1616(long arg0, int arg1) {
        class71.field1320.field3380 = 0;
        field4066++;
        class71.field1320.method1352(arg1 ^ 0x6297, 228);
        class71.field1320.method1344(100, arg0);
        class211.field3740 = 0;
        if (arg1 != 32767) {
            field4046 = (int[]) null;
        }
        class4.field75 = 1;
        class176.field3103 = 0;
        class192.field3330 = -3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lem;BI)Lmh;", line = 47)
    public static final class128 method1617(class10 arg0, byte arg1, int arg2) {
        if (arg1 < 73) {
            field4059 = 54;
        }
        field4047++;
        if (!class196.method1373(-1, arg2, client.method1657(arg0)) && arg0.field308 == null) {
            return null;
        } else if (arg0.field360 == null || arg2 >= arg0.field360.length || arg0.field360[arg2] == null || arg0.field360[arg2].method832(-1).method865((byte) 56) == 0) {
            return class3.field57 ? class28.method177((byte) -114, new class128[] { class250.field4330, class257.method1811(arg2, (byte) 63) }) : null;
        } else {
            return arg0.field360[arg2];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I", line = 75)
    public static final int method1618(byte arg0, int arg1) {
        if (arg0 >= -84) {
            method1615(12);
        }
        field4052++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V", line = 95)
    public static void method1619(boolean arg0) {
        field4046 = null;
        if (!arg0) {
            field4057 = -103;
        }
        field4051 = null;
        field4062 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Ljk;", line = 129)
    public static final class81 method1620(int arg0, int arg1) {
        field4045++;
        class81 var2 = (class81) class74.field1392.method1443((long) arg0, false);
        if (arg1 > -54) {
            return (class81) null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class292.field4996.method2155(arg0 & 0x7FFF, 0, (byte) 70);
            } else {
                var3 = class245.field4186.method2155(arg0, 0, (byte) 70);
            }
            class81 var4 = new class81();
            if (var3 != null) {
                var4.method512(new class194(var3), (byte) 125);
            }
            if (arg0 >= 32768) {
                var4.method511((byte) 55);
            }
            class74.field1392.method1442(-1, (long) arg0, var4);
            return var4;
        } else {
            return var2;
        }
    }
}
