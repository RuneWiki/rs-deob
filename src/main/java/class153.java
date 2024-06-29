import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class153 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1891 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lfk;")
    public static class393 field1895 = new class393();

    @OriginalMember(owner = "client!s", name = "l", descriptor = "F")
    public static float field1897;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lfo;")
    public class303 field1892;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ltq;")
    public static class376 field1886;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public int[] field1889;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 8)
    public static final void method925(int arg0) {
        class69.field796.method1626((byte) 106);
        field1887++;
        if (arg0 != -2) {
            field1897 = 0.38181472F;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I", line = 25)
    public static final int method926(byte arg0) {
        field1888++;
        return arg0 > -8 ? -15 : 6;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lli;", line = 37)
    public static final class246 method927(int arg0, int arg1) {
        field1893++;
        class246 var2 = (class246) class273.field3879.method1625((long) arg1, arg0 ^ arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class339.field4812.method2431((byte) 103, 36, arg1);
        class246 var4 = new class246();
        var4.field3479 = arg1;
        if (var3 != null) {
            var4.method1672(0, new class236(var3));
        }
        var4.method1670((byte) 125);
        class273.field3879.method1622((byte) 13, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 66)
    public static void method928(int arg0) {
        field1886 = null;
        field1895 = null;
        int var1 = 24 / ((arg0 - 25) / 50);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Laq;IIIB)V", line = 85)
    public static final void method929(class89 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1890++;
        long var5 = (long) (arg3 | arg2 << 14 | arg1 << 28);
        class282 var7 = (class282) class330.field4663.method1888(var5, (byte) -30);
        if (var7 == null) {
            class282 var8 = new class282();
            class330.field4663.method1886(var8, var5, arg4 - 99);
            var8.field3989.method509((byte) 115, arg0);
            return;
        }
        class163 var9 = class50.method288(arg4 ^ 0x64, arg0.field1084);
        if (arg4 != 100) {
            return;
        }
        int var10 = var9.field2292;
        if (var9.field2278 == 1) {
            var10 = (arg0.field1085 + 1) * var10;
        }
        for (class89 var11 = (class89) var7.field3989.method506((byte) -128); var11 != null; var11 = (class89) var7.field3989.method514(true)) {
            class163 var12 = class50.method288(arg4 - 100, var11.field1084);
            int var13 = var12.field2292;
            if (var12.field2278 == 1) {
                var13 = (var11.field1085 + 1) * var13;
            }
            if (var10 > var13) {
                class151.method919(arg0, var11, -114);
                return;
            }
        }
        var7.field3989.method509((byte) 110, arg0);
    }
}
