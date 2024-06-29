import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class283 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[[I")
    public static int[][] field4596 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
    public static boolean field4598;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[[[I")
    public static int[][][] field4595;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1943(int arg0) {
        field4596 = null;
        field4595 = null;
        if (arg0 != 13) {
            field4597 = -111;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method1944(int arg0) {
        class231.field3624.method1511((byte) 88);
        if (arg0 == 12) {
            field4599++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static final void method1945(int arg0) {
        if (class311.field4993 < 0) {
            class72.field1069 = -1;
            class282.field4592 = -1;
            class311.field4993 = 0;
        }
        int var1 = -69 / ((arg0 - 26) / 61);
        if (class207.field3242 < class311.field4993) {
            class311.field4993 = class207.field3242;
            class282.field4592 = -1;
            class72.field1069 = -1;
        }
        if (class229.field3544 < 0) {
            class282.field4592 = -1;
            class229.field3544 = 0;
            class72.field1069 = -1;
        }
        if (class229.field3544 > class207.field3247) {
            class72.field1069 = -1;
            class282.field4592 = -1;
            class229.field3544 = class207.field3247;
        }
        field4600++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)V")
    public static final void method1946(byte arg0, int arg1, int arg2) {
        field4601++;
        class181 var3 = class95.method652(6, (byte) 34, arg2);
        var3.method1285((byte) 64);
        int var4 = -41 / ((arg0 - 74) / 51);
        var3.field2847 = arg1;
    }
}
