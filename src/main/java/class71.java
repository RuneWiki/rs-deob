import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class71 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field1012 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static volatile int field1014 = -1;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
    public static boolean field1013;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[[S")
    public static short[][] field1015;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 7)
    public static void method585(byte arg0) {
        if (arg0 != -121) {
            field1012 = null;
        }
        field1012 = null;
        field1015 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 18)
    public static final void method586(int arg0) {
        if (arg0 != -1) {
            method587(53, 38, 88);
        }
        field1011++;
        class240.field3359.method372(114);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 41)
    public static final void method587(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1067 != null) {
            var3.field1067 = null;
        }
        if (var3.field1087 != null) {
            var3.field1087 = null;
        }
    }
}
