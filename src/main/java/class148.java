import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class148 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[[I")
    public static int[][] field1902 = new int[6][];

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lwr;")
    public static class459 field1901 = new class459(8);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Z")
    public static boolean field1903 = false;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method911(int arg0) {
        field1902 = null;
        field1901 = null;
        if (arg0 != -2229) {
            method913(-17);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static final void method912(boolean arg0) {
        if (arg0) {
            class77.field947 = class195.field2334;
            class25.field188 = class143.field1850;
        } else {
            class77.field947 = class396.field5627;
            class25.field188 = class86.field1182;
        }
        class307.field4170 = class77.field947.length;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static final void method913(int arg0) {
        class98.field1303 = -1;
        class476.field6576 = -1;
        class168.field2101 = arg0;
        field1900++;
    }
}
