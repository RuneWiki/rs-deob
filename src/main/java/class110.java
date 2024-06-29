import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class110 {

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Z")
    public boolean field1869 = false;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[J")
    public static long[] field1854 = new long[100];

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
    public static boolean field1860 = false;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field1861 = -1;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lkg;")
    public static class69 field1864 = null;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lt;")
    public static class239 field1857 = new class239(512);

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "[S")
    public static short[] field1868 = new short[500];

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field1866 = -1;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lbe;")
    private static class283 field1867 = class153.method941(-95, "Free world");

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lbe;")
    public static class283 field1871 = field1867;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "J")
    public long field1859;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lgf;")
    public class7 field1855;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 20)
    public static final void method728(int arg0, int arg1) {
        field1856++;
        class241.field4074 = -1;
        class7.field79 = arg1;
        class237.field3962 = arg0;
        class305.method2070(-1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 39)
    public static void method729(byte arg0) {
        field1867 = null;
        field1854 = null;
        field1871 = null;
        field1864 = null;
        if (arg0 > 73) {
            field1868 = null;
            field1857 = null;
        }
    }
}
