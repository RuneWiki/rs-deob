import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class307 {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    public static int[] field4937 = new int[5];

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field4939 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lim;")
    public static class178 field4933;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lue;")
    public static class222 field4942;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lnh;")
    public static class305 field4932;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[[S")
    public static short[][] field4938;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnh;II)Lta;")
    public static final class203 method2088(class305 arg0, int arg1, int arg2) {
        field4944++;
        if (arg1 != 5) {
            field4937 = null;
        }
        return class109.method696(0, arg2, arg0) ? class255.method1665(11362) : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILbj;)V")
    private final void method2089(byte arg0, int arg1, class215 arg2) {
        if (arg1 == 1) {
            this.field4943 = arg2.method1379(-73);
            this.field4940 = arg2.method1374((byte) -60);
            this.field4935 = arg2.method1374((byte) -60);
        }
        field4941++;
        if (arg0 < 55) {
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method2090(int arg0) {
        int var1 = -110 % ((arg0 - 49) / 39);
        field4938 = null;
        field4937 = null;
        field4942 = null;
        field4933 = null;
        field4932 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lbj;Z)V")
    public final void method2091(class215 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1374((byte) -60);
            if (var3 == 0) {
                field4934++;
                if (arg1) {
                    field4931 = -80;
                    return;
                }
                return;
            }
            this.method2089((byte) 80, var3, arg0);
        }
    }
}
