import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class117 extends class124 {

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Z")
    public static boolean field1935 = false;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "Z")
    public static boolean field1936 = false;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Le;")
    public static class191 field1930 = class54.method368("Eingabeprozedur geladen)3", 2047);

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Lwe;")
    public static class147 field1937 = new class147(4);

    @OriginalMember(owner = "client!b", name = "V", descriptor = "F")
    public static float field1931;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public static final boolean method776(int arg0, int arg1) {
        if (arg0 != -820868335) {
            method779(-112, (class225) null);
        }
        field1927++;
        return ((arg1 & 0x1433BEFC) >> 28) != 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILng;BI)Lwa;")
    public static final class226 method777(int arg0, class121 arg1, byte arg2, int arg3) {
        int var4 = 107 % ((arg2 - 56) / 36);
        field1928++;
        return class121.method796(true, arg3, arg0, arg1) ? class127.method864(96) : null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        field1933++;
        if (arg0 < 68) {
            method777(-83, (class121) null, (byte) 98, 77);
        }
        return class257.field4559;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
    public static void method778(int arg0) {
        field1930 = null;
        field1937 = null;
        if (arg0 <= 90) {
            method776(79, 73);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILji;)Lmg;")
    public static final class49 method779(int arg0, class225 arg1) {
        if (arg0 <= 0) {
            method777(63, (class121) null, (byte) 116, -64);
        }
        field1929++;
        class49 var2 = new class49(arg1.method1596((byte) 67), arg1.method1596((byte) 32), arg1.method1593(true), arg1.method1593(true), arg1.method1562(21705), arg1.method1580(-107) == 1);
        int var3 = arg1.method1580(-50);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field872.method1176(new class217(arg1.method1593(true), arg1.method1593(true), arg1.method1593(true), arg1.method1593(true)), (byte) 38);
        }
        var2.method331(-122);
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIZ)Lwa;")
    public static final class226 method780(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1934++;
        int var6 = (arg1 << 19) + arg0 - (-(arg5 ? 65536 : 0) - (arg3 << 17));
        long var8 = (long) var6 * 3849834839L + (long) arg4 * 3147483667L;
        if (arg2 != -820868335) {
            method780(123, 58, 22, 82, -86, false);
        }
        class226 var10 = (class226) class163.field2756.method991(var8, -25858);
        if (var10 != null) {
            return var10;
        }
        class15.field194 = false;
        class226 var11 = class143.method940(arg5, arg1, arg2 + 820868336, arg4, false, arg3, false, arg0);
        if (var11 != null && !class15.field194) {
            class163.field2756.method987(var11, var8, arg2 + 820865897);
        }
        return var11;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Leg;I)Z")
    public static final boolean method781(class33 arg0, int arg1) {
        field1925++;
        if (arg0.field483 == 205) {
            class197.field3517 = 250;
            return true;
        } else {
            if (arg1 != 338935548) {
                field1932 = 122;
            }
            return false;
        }
    }
}
