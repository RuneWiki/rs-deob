import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class298 {

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[Z")
    public static boolean[] field5017 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lck;")
    private static class119 field5018 = method1987((byte) 11, "green:");

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lck;")
    public static class119 field5020 = method1987((byte) 118, ")1");

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5023 = 0;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lck;")
    public static class119 field5015 = field5018;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lck;")
    public static class119 field5029 = method1987((byte) 33, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lck;")
    private static class119 field5013 = method1987((byte) 82, "Created gameworld");

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lck;")
    public static class119 field5021 = field5018;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lck;")
    public static class119 field5019 = field5013;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "B")
    public static byte field5028;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/lang/String;)Lck;", line = 11)
    public static final class119 method1987(byte arg0, String arg1) {
        field5025++;
        if (arg0 < 3) {
            return (class119) null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class119 var5 = new class119();
        var5.field1838 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field1838[var5.field1825++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field1838[var5.field1825++] = (byte) var6;
            }
        }
        var5.method753(0);
        return var5.method768(4096);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILck;)I", line = 55)
    public static final int method1988(int arg0, class119 arg1) {
        field5030++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != 9612) {
            method1991((byte) 99);
        }
        while (class97.field1482 > var2) {
            if (arg1.method793(class126.field1941[var2], arg0 - 9572)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfh;", line = 83)
    public static final class207 method1989(Throwable arg0, String arg1) {
        field5016++;
        class207 var2;
        if (arg0 instanceof class207) {
            var2 = (class207) arg0;
            var2.field3306 = var2.field3306 + ' ' + arg1;
        } else {
            var2 = new class207(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 101)
    public static void method1990(int arg0) {
        field5015 = null;
        field5021 = null;
        field5020 = null;
        field5019 = null;
        field5029 = null;
        field5013 = null;
        field5018 = null;
        int var1 = -117 / ((arg0 - 53) / 32);
        field5017 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 117)
    public static final void method1991(byte arg0) {
        Object var1 = class164.field2583;
        synchronized (class164.field2583) {
            int var2 = 68 / ((arg0 - 29) / 63);
            if (class163.field2578 == 0) {
                class220.field3533.method1879(2, 5, new class10());
            }
            class163.field2578 = 600;
        }
        field5022++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lck;IIIIIJ)V", line = 144)
    public static final void method1992(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, long arg6) {
        class86.method574(1);
        class3 var8 = new class3(128);
        field5014++;
        var8.method32(10, (byte) -99);
        var8.method40((int) (Math.random() * 99999.0D), 107);
        var8.method40(503, -77);
        var8.method29(arg4 + 2880, arg6);
        var8.method26((int) (Math.random() * 9.9999999E7D), 85);
        var8.method61(false, arg0);
        var8.method26((int) (Math.random() * 9.9999999E7D), 107);
        var8.method40(class54.field867, 74);
        var8.method32(arg2, (byte) -99);
        var8.method32(arg1, (byte) -99);
        var8.method26((int) (Math.random() * 9.9999999E7D), arg4 ^ 0xFFFFFCB2);
        var8.method40(arg5, 60);
        var8.method40(arg3, 105);
        var8.method26((int) (Math.random() * 9.9999999E7D), 13);
        var8.method66(false, class181.field2875, class30.field433);
        class6.field149.field44 = 0;
        class6.field149.method32(216, (byte) -99);
        class6.field149.method32(var8.field44, (byte) -99);
        class6.field149.method73(var8.field44, (byte) -106, 0, var8.field101);
        class202.field3199 = 1;
        if (arg4 != -811) {
            field5015 = (class119) null;
        }
        class211.field3366 = 3;
    }
}
