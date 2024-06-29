import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class55 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Ldj;")
    public static class44 field1001 = class89.method650(255, "; Max)2Age=");

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1008 = 10;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Ldj;")
    public static class44 field1000 = class89.method650(255, ")4slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lah;")
    public static final class9 method393(int arg0, int arg1) {
        class9 var2 = (class9) class186.field3211.method1178((long) arg1, 14176);
        field1003++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field2165.method1466(16, arg1, (byte) -127);
        class9 var4 = new class9();
        if (arg0 != 0) {
            method393(13, -22);
        }
        if (var3 != null) {
            var4.method88(0, new class66(var3));
        }
        class186.field3211.method1183((byte) 117, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static final void method394(int arg0) {
        class153 var1 = class119.field2117;
        synchronized (class119.field2117) {
            class30.field535++;
            class213.field3821 = class46.field871;
            class27.field486 = class228.field4279;
            class7.field151 = class39.field693;
            class194.field3393 = class61.field1137;
            class180.field3108 = class121.field2154;
            class102.field1860 = class196.field3466;
            class2.field37 = class45.field859;
            class61.field1137 = arg0;
        }
        field1007++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZII)I")
    public static final int method395(int arg0, boolean arg1, int arg2, int arg3) {
        field1002++;
        if (arg1) {
            return 55;
        } else {
            int var4 = 256 - arg0;
            return ((arg2 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg0 & 0xFF0000) >> 8;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method396(int arg0) {
        field1001 = null;
        if (arg0 == -129) {
            field1000 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)Z")
    public static final boolean method397(int arg0, boolean arg1) {
        field1004++;
        if (arg1) {
            return false;
        } else {
            return (arg0 >> 30 & 0x1) != 0;
        }
    }
}
