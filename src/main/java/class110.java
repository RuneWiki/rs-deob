import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class110 implements class213 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lli;")
    public static class185 field1974 = class245.method1649("(U1", 124);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1976 = 0;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
    public static boolean field1978 = false;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lli;")
    public static class185 field1979 = class245.method1649("Musik)2Engine vorbereitet)3", 124);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lli;")
    public static class185 field1980 = null;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IJII)Lli;")
    public final class185 method770(int[] arg0, long arg1, int arg2, int arg3) {
        field1975++;
        if (arg2 == arg3) {
            class260 var6 = class257.method1746(arg0[0], false);
            return var6.method1765((int) arg1, (byte) -60);
        } else if (arg3 == 1 || arg3 == 10) {
            class134 var7 = class165.method1179(102, (int) arg1);
            return var7.field2436;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class257.method1746(arg0[0], false).method1765((int) arg1, (byte) -60);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method771(int arg0) {
        if (arg0 <= -81) {
            field1980 = null;
            field1974 = null;
            field1979 = null;
        }
    }
}
