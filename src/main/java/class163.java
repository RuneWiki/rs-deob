import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class163 extends class200 {

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "Z")
    public static boolean field3055 = true;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "Lli;")
    public static class185 field3059 = class245.method1649("<br>", -88);

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field3057 = 0;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "Lbk;")
    public static class52 field3060;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Lsf;")
    public static class89 field3054;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)Lmi;")
    public static final class228 method1170(int arg0, boolean arg1) {
        field3058++;
        if (arg1) {
            field3055 = false;
        }
        class228 var2 = (class228) class118.field2109.method82(-25, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field3252.method1688(0, arg0, 1);
        class228 var4 = new class228();
        if (var3 != null) {
            var4.method1574((byte) 115, arg0, new class118(var3));
        }
        class118.field2109.method84(96, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILp;I)V")
    public static final void method1171(int arg0, int arg1, class82 arg2, int arg3) {
        field3061++;
        if (class127.field2283 < 2 && class187.field3471 == 0 && !class254.field4504) {
            return;
        }
        if (arg3 != 15) {
            field3060 = null;
        }
        class185 var4 = class116.method810(-119);
        if (arg2 == null) {
            int var5 = class82.field1608.method1839(var4, arg0 + 4, arg1 + 15, 16777215, 0, class214.field3901, class68.field1199);
            class142.method1017(arg1, arg0 + 4, (byte) -109, class82.field1608.method1843(var4) + var5, 15);
            return;
        }
        class270 var6 = arg2.method538(arg3 ^ 0x79D, class282.field4979);
        if (var6 == null) {
            var6 = class82.field1608;
        }
        var6.method1849(var4, arg0, arg1, arg2.field1505, arg2.field1498, arg2.field1594, arg2.field1494, arg2.field1623, arg2.field1577, class214.field3901, class68.field1199, class25.field418);
        class142.method1017(class25.field418[1], class25.field418[0], (byte) -97, class25.field418[2], class25.field418[3]);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field3059 = null;
        if (arg0 != 0) {
            method1173(106, 81, false, -73, 93);
        }
        field3060 = null;
        field3054 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZII)V")
    public static final void method1173(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class195.field3587 = 0L;
        field3062++;
        boolean var5 = false;
        int var6 = class123.method898(true);
        if (var6 > 0 == arg3 <= 0) {
            var5 = true;
        }
        if (arg3 == 3 || var6 == 3) {
            arg2 = true;
        }
        if (class160.field3026.startsWith("mac") && arg3 > 0) {
            arg2 = true;
        }
        if (arg4 > 99) {
            if (arg2 && arg3 > 0) {
                var5 = true;
            }
            class253.method1717(var6, arg3, var5, arg1, arg2, arg0, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)Z")
    public static final boolean method1174(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return false;
        }
        class135 var3 = class184.method1294(arg1, -28916);
        field3056++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method960(65535, arg0);
    }
}
