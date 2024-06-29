import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class143 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lvj;")
    public static class115 field2302 = new class115();

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Z")
    public static boolean field2309 = false;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lqh;")
    public static class201 field2310;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[[[B")
    public static byte[][][] field2305;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method984(byte arg0) {
        field2310 = null;
        field2305 = null;
        if (arg0 >= 110) {
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static final void method985(boolean arg0) {
        if (arg0) {
            class288.field4563 = class76.field1215;
            class124.field2012 = class83.field1307;
        } else {
            class288.field4563 = class66.field1083;
            class124.field2012 = class219.field3586;
        }
        class156.field2537 = class288.field4563.length;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method986(int arg0) {
        class199.field3181 = false;
        class233.field3813 = 0;
        if (arg0 != 32) {
            return;
        }
        class68.field1113.field3655 = 0;
        class205.field3291 = 0;
        class234.field3820 = 0;
        class121.field1973 = -1;
        class77.field1236 = -1;
        class67.field1103.field3655 = 0;
        class260.field4133 = 0;
        class76.field1229 = -1;
        class76.field1228 = 0;
        class115.field1912 = 0;
        field2306++;
        class253.field4034 = -1;
        for (int var1 = 0; var1 < class35.field548.length; var1++) {
            if (class35.field548[var1] != null) {
                class35.field548[var1].field3374 = -1;
            }
        }
        for (int var2 = 0; var2 < class137.field2260.length; var2++) {
            if (class137.field2260[var2] != null) {
                class137.field2260[var2].field3374 = -1;
            }
        }
        class44.method363(arg0 + 288);
        class229.field3786 = 1;
        class1.method5(30, arg0 + 91);
        for (int var3 = 0; var3 < 100; var3++) {
            class275.field4352[var3] = true;
        }
        class205.method1413((byte) -105);
    }
}
