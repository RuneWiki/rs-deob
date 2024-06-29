import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class139 {

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1927 = 1;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
    public static boolean field1929 = false;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lcc;")
    public static class208 field1925;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lnh;")
    public static class305 field1924;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lnh;")
    public static class305 field1931;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method887(byte arg0) {
        field1930++;
        if (arg0 < 15) {
            field1931 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class274.field4355[var1] = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
    public abstract void method791(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)V")
    public abstract void method790(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(ZII)V")
    public abstract void method786(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method888(int arg0) {
        field1931 = null;
        if (arg0 != -101) {
            field1931 = null;
        }
        field1924 = null;
        field1925 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(III)V")
    public class139(int arg0, int arg1, int arg2) {
        this.field1932 = arg2;
        this.field1928 = arg0;
        this.field1926 = arg1;
    }
}
