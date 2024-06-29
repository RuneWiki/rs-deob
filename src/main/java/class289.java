import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class289 {

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "[F")
    public static float[] field4583 = new float[16];

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4586 = null;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "B")
    public static byte field4585;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 4)
    public static void method2042(int arg0) {
        field4586 = null;
        field4583 = null;
        if (arg0 != -12979) {
            method2042(52);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V", line = 24)
    public static final void method2043(byte arg0) {
        if (arg0 < -63) {
            class619.field8762 = new class295(class122.field1976.method1091(class135.field2206, 1), "", class250.field4003, 1010, -1, 0L, 0, 0, true, false);
            field4582++;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lri;BLri;Lri;Lri;)V", line = 38)
    public static final void method2044(class97 arg0, byte arg1, class97 arg2, class97 arg3, class97 arg4) {
        class118.field1889 = arg4;
        class208.field3475 = arg2;
        field4584++;
        class613.field8711 = arg3;
        class564.field8105 = new class665[class118.field1889.method917(true)][];
        if (arg1 > -83) {
            field4581 = 6;
        }
        class661.field9224 = new boolean[class118.field1889.method917(true)];
    }
}
