import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class111 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "J")
    public static long field1853 = 0L;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Z")
    public static boolean field1854 = false;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    public static int[] field1852 = new int[5];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
    public static int[] field1859 = new int[4];

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[B")
    public static byte[] field1857 = new byte[520];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method843(byte arg0) {
        int var1 = 18 / ((arg0 - 11) / 37);
        field1852 = null;
        field1859 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Lh;")
    public static final class279 method844(int arg0, int arg1, int arg2) {
        if (arg2 != -1780180960) {
            method843((byte) 51);
        }
        field1860++;
        class279 var3 = (class279) class65.field982.method1073(-1, (long) arg1 << 32 | (long) arg0);
        if (var3 == null) {
            var3 = new class279(arg1, arg0);
            class65.field982.method1074((byte) 39, var3, var3.field4008);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static final void method845(byte arg0) {
        field1858++;
        if (arg0 > 49) {
            class268.field4311.method1422((byte) -108);
        }
    }
}
