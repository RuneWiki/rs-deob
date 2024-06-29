import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class133 extends class61 {

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "Lwm;")
    public static class152 field2048 = class157.method1048("gleiten:", 110);

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "Lwm;")
    public static class152 field2047 = class157.method1048("Liste der Welten geladen", 121);

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "Lwm;")
    public static class152 field2049 = class157.method1048("null", 105);

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Lbg;")
    public static class203 field2043;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "[I")
    public static int[] field2042;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[[B")
    public static byte[][] field2041;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lvj;", line = 20)
    public static final class107 method849(int arg0, int arg1) {
        field2044++;
        class107 var2 = (class107) class308.field5285.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class94.field1347.method1381(16, arg0, 0);
        class107 var4 = new class107();
        if (var3 != null) {
            var4.method715(1157495591, new class291(var3));
        }
        if (arg1 > -58) {
            method850(false, true, (class152) null);
        }
        class308.field5285.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZLwm;)V", line = 45)
    public static final void method850(boolean arg0, boolean arg1, class152 arg2) {
        field2045++;
        class152 var3 = arg2.method1023((byte) 91);
        if (!arg0) {
            field2047 = (class152) null;
        }
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class317.field5502 : class33.field536);
        for (int var8 = var6; var8 < var7; var8++) {
            class157 var9 = class22.method177(1, var8);
            if (var9.field2504 && var9.method1049(0).method1023((byte) 96).method988(var3, 0) != -1) {
                if (var5 >= 50) {
                    client.field4356 = null;
                    class114.field1623 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class114.field1623 = var5;
        class280.field4782 = 0;
        class152[] var12 = new class152[class114.field1623];
        client.field4356 = var4;
        for (int var13 = 0; var13 < class114.field1623; var13++) {
            var12[var13] = class22.method177(1, var4[var13]).method1049(0);
        }
        class184.method1226(client.field4356, var12, -18653);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Luj;", line = 121)
    public static final class141 method851(int arg0, int arg1) {
        field2046++;
        class141 var2 = (class141) class37.field607.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field145.method1381(class17.method109((byte) 87, arg0), class141.method893(arg0, false), 0);
        class141 var4 = new class141();
        var4.field2171 = arg0;
        int var5 = 21 % ((arg1 - 50) / 50);
        if (var3 != null) {
            var4.method891(new class291(var3), (byte) 24);
        }
        var4.method885(0);
        class37.field607.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 147)
    public static void method852(byte arg0) {
        field2042 = null;
        field2049 = null;
        if (arg0 >= -35) {
            method851(-55, -50);
        }
        field2041 = (byte[][]) null;
        field2047 = null;
        field2048 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z")
    public abstract boolean method848(int arg0);

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method853(int arg0);
}
