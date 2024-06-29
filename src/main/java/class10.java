import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class10 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lpd;")
    private static class94 field264 = class28.method249(125, "flash1:");

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    public static int[] field266 = new int[] { 0, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 8, 14, 1, 0, 0, 0, 2, 5, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 0, 0, -2, 0, 0, 10, 0, -1, 6, 0, 0, -2, 4, 2, 0, 0, 0, 5, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 4, 0, 3, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, -2, 4, -2, 6, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 0, 0, 0, 0, 7, 0, 2, 2, 0, 0, 0, 0, 0, 0, 6, 0, 0, 3, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 4, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, 0, 0, 0, 10, 7, -2, 0, 0, 0, 0, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 5, 4, 0, 0, 6, 0, 0, 4, 0, 0, 0, 0, 0, 8, 0, 1, 0, 0, 0, -2, 10, 0, 0, 0, 0, 4, -1, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 15, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lpd;")
    public static class94 field267 = class28.method249(-104, "Texturen geladen)3");

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lpd;")
    public static class94 field268 = class28.method249(-67, "gleiten:");

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[J")
    public static long[] field265 = new long[200];

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lpd;")
    public static class94 field271 = field264;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ls;")
    public static class111 field269;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I", line = 4)
    public static final int method60(int arg0) {
        if (arg0 == 0) {
            field270++;
            int var1 = class25.method226(class64.field1589, class105.field2615, class20.field553, (byte) -108);
            return var1 - class103.field2596 >= 800 || (class108.field2679[class64.field1589][class20.field553 >> 7][class105.field2615 >> 7] & 0x4) == 0 ? 3 : class64.field1589;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 34)
    public static void method61(int arg0) {
        field265 = null;
        field264 = null;
        field267 = null;
        field269 = null;
        field268 = null;
        field271 = null;
        if (arg0 <= 7) {
            method60(-79);
        }
        field266 = null;
    }
}
