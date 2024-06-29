import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class74 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static volatile int field1121 = 0;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lhe;")
    public static class47 field1124 = new class47();

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[[B")
    public static byte[][] field1126 = new byte[250][];

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Lqe;")
    public static class168 field1130 = class66.method448(":", -108);

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lrd;")
    public static class207 field1127;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[[[I")
    public static int[][][] field1123;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BII)V")
    public static final void method499(byte arg0, int arg1, int arg2) {
        field1120++;
        long var3 = (long) ((arg2 << 16) + arg1);
        class186 var5 = (class186) class34.field430.method1527(var3, (byte) -99);
        if (arg0 < -33 && var5 != null) {
            class163.field2797.method398(-127, var5);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public static final void method500(boolean arg0) {
        if (arg0) {
            method499((byte) -33, 35, 46);
        }
        field1118++;
        class241.field4128.method1497((byte) 124);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method501(int arg0) {
        field1126 = null;
        if (arg0 == 1) {
            field1123 = null;
            field1130 = null;
            field1127 = null;
            field1124 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lqe;Z)V")
    public static final void method502(class168 arg0, boolean arg1) {
        field1119++;
        if (class154.field2690 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1084(32383);
        if (var3 == 0L) {
            return;
        }
        while (class154.field2690.length > var2 && class154.field2690[var2].field3308 != var3) {
            var2++;
        }
        if (arg1) {
            field1123 = null;
        }
        if (var2 < class154.field2690.length && class154.field2690[var2] != null) {
            class87.field1348.method672(241, 238);
            class186.field3275++;
            class87.field1348.method739(class154.field2690[var2].field3308, -23147);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BB)V")
    public static final void method503(byte[] arg0, byte arg1) {
        field1122++;
        int var2 = 0;
        while (true) {
            while (arg0.length > var2) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class232.field3935;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class162.field2781;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class79.field1189 && var4 + 64 < class42.field552) {
                    int var5 = var3 >> 6;
                    int var6 = class42.field552 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class1.field6[var5][var6] == null) {
                                    class1.field6[var5][var6] = new byte[4096];
                                }
                                class1.field6[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class243.field4226[var5][var6] == null) {
                                    class243.field4226[var5][var6] = new byte[4096];
                                }
                                class243.field4226[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            if (arg1 <= 49) {
                method501(-51);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Lfj;")
    public static final class180 method504(int arg0, byte arg1) {
        field1125++;
        if (arg1 != -59) {
            return null;
        }
        class180 var2 = (class180) class26.field316.method1499(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field1775.method1712(class82.method544((byte) 84, arg0), class162.method1050(arg0, 64), -1);
        class180 var4 = new class180();
        var4.field3177 = arg0;
        if (var3 != null) {
            var4.method1189(new class112(var3), arg1 ^ 0x7E);
        }
        var4.method1193(arg1 + 9);
        class26.field316.method1502((byte) -18, var4, (long) arg0);
        return var4;
    }
}
