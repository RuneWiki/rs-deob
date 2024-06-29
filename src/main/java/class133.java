import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 extends class121 {

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "Lhe;")
    private static class54 field3004 = class6.method58("Invalid username or password)3", false);

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "Lhe;")
    public static class54 field3000 = class6.method58("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", false);

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field3002 = 0;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "Z")
    public static boolean field3007 = false;

    @OriginalMember(owner = "client!ta", name = "rb", descriptor = "Lhe;")
    public static class54 field3018 = class6.method58("Verbindung mit Update)2Server)3)3)3", false);

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lhe;")
    public static class54 field3003 = field3004;

    @OriginalMember(owner = "client!ta", name = "qb", descriptor = "Lnc;")
    public static class93 field3017 = null;

    @OriginalMember(owner = "client!ta", name = "sb", descriptor = "Lhe;")
    public static class54 field3019 = class6.method58("<col=ffffff>", false);

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "Lqb;")
    public static class113 field3015;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "Lhe;")
    public class54 field3010;

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "[I")
    public int[] field3009;

    @OriginalMember(owner = "client!ta", name = "tb", descriptor = "[I")
    public int[] field3020;

    @OriginalMember(owner = "client!ta", name = "pb", descriptor = "[Lhe;")
    public class54[] field3016;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public static final void method997(int arg0) {
        field3013++;
        if (arg0 != 25651) {
            method1002((byte) -7, -6, -84, null, -1, 100);
        }
        class1.field5.method126((byte) -56);
        class83.field2051 = 1;
        class134.field3046 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLef;I)Z")
    public static final boolean method998(boolean arg0, class35 arg1, int arg2) {
        field3014++;
        byte[] var3 = arg1.method261(arg2, arg0);
        if (var3 == null) {
            return false;
        } else {
            class129.method968(var3, 53);
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)I")
    public static final int method999(int arg0) {
        field2999++;
        return arg0 == 6 ? 6 : -115;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1000(int arg0, byte[] arg1) {
        if (arg0 > -3) {
            method1000(-121, null);
        }
        class83 var2 = new class83(arg1);
        field3005++;
        int var3 = var2.method638(0);
        int var4 = var2.method641((byte) 73);
        if (var4 < 0 || class63.field1542 != 0 && class63.field1542 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method675(0, (byte) -15, var4, var7);
            return var7;
        } else {
            int var5 = var2.method641((byte) 73);
            if (var5 < 0 || class63.field1542 != 0 && var5 > class63.field1542) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class47.method336(var6, var5, arg1, var4, 9);
            } else {
                class67.field1681.method1139((byte) -84, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public static void method1001(int arg0) {
        field3019 = null;
        if (arg0 < 95) {
            method1000(25, null);
        }
        field3017 = null;
        field3004 = null;
        field3018 = null;
        field3015 = null;
        field3000 = null;
        field3003 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIILab;II)V")
    public static final void method1002(byte arg0, int arg1, int arg2, class3 arg3, int arg4, int arg5) {
        field2998++;
        class138 var6 = new class138();
        var6.field3161 = arg1 * 128;
        var6.field3151 = arg3.field69;
        var6.field3164 = arg4;
        var6.field3171 = arg3.field98;
        var6.field3153 = arg3.field85 * 128;
        var6.field3155 = arg3.field63;
        var6.field3150 = arg3.field78;
        if (arg0 < 26) {
            method997(78);
        }
        var6.field3174 = arg5 * 128;
        int var7 = arg3.field67;
        int var8 = arg3.field86;
        if (arg2 == 1 || arg2 == 3) {
            var7 = arg3.field86;
            var8 = arg3.field67;
        }
        var6.field3156 = (arg1 + var7) * 128;
        var6.field3175 = (arg5 + var8) * 128;
        if (arg3.field74 != null) {
            var6.field3166 = arg3;
            var6.method1070(false);
        }
        class83.field2039.method976(var6, (byte) -117);
        if (var6.field3150 != null) {
            var6.field3176 = var6.field3151 + (int) ((double) (var6.field3155 - var6.field3151) * Math.random());
        }
    }
}
