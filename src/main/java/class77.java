import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class77 extends class464 {

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Liu;")
    public static class390 field1091 = new class390(24, 16);

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "[I")
    public static int[] field1092;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "[Lqg;")
    public static class307[] field1090;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V", line = 4)
    public static final void method508(byte arg0) {
        class319.field4687 = null;
        class8.field135 = null;
        class146.field1893 = null;
        int var1 = -44 % ((arg0 - 63) / 56);
        class126.field1622 = null;
        field1088++;
        class212.field3004 = null;
        class410.field6010 = null;
        class503.field7683 = null;
        class370.field5560 = null;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V", line = 25)
    public static void method509(int arg0) {
        if (arg0 < 88) {
            method510(12, 71, -50);
        }
        field1091 = null;
        field1090 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)I", line = 43)
    public static final int method510(int arg0, int arg1, int arg2) {
        field1089++;
        if (arg0 <= 72) {
            field1090 = null;
        }
        return arg1 == 4 || arg1 == 5 ? class451.field6571[arg2 & 0x3] : 256;
    }
}
