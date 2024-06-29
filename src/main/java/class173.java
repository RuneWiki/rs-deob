import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class173 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lii;")
    public static class250 field2788 = new class250(16);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lec;")
    public static class99 field2790 = new class99(64);

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Ljn;", line = 7)
    public static final class327 method1299(byte arg0) {
        field2791++;
        class327 var1;
        if (class73.field1058) {
            var1 = new class66(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], class220.field3362[0], class82.field1212);
        } else {
            var1 = new class42(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], class220.field3362[0], class82.field1212);
        }
        class245.method1684(255);
        if (arg0 != 124) {
            field2790 = (class99) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 40)
    public static void method1300(int arg0) {
        field2788 = null;
        if (arg0 != 0) {
            field2789 = 111;
        }
        field2790 = null;
    }
}
