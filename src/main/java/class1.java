import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Lu;")
    private static class38 field2 = class9.method45(-41, "Next page");

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Lu;")
    private static class38 field4 = class9.method45(-41, "Overview");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Lma;")
    public static class25 field5 = new class25();

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Lu;")
    public static class38 field6 = class9.method45(-41, "Windmill");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 17)
    public static void method1(byte arg0) {
        field5 = null;
        field3 = null;
        if (arg0 > -46) {
            method4((byte) -114);
        }
        field6 = null;
        field2 = null;
        field4 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(B)V", line = 38)
    public static final void method2(byte arg0) {
        if (arg0 >= -6) {
            return;
        }
        if (++class22.field206 >= 64) {
            class22.field206 = 0;
            class30.field365++;
            if (class11.field114 >> 6 > class30.field365) {
                class8.method33((byte) -112);
            }
        }
        class14.field139 = (class22.field206 << 6) + class11.field103;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)[B", line = 67)
    public static final synchronized byte[] method3(int arg0, int arg1) {
        if (arg1 == 100 && class40.field503 > 0) {
            byte[] var2 = class23.field213[--class40.field503];
            class23.field213[class40.field503] = null;
            return var2;
        } else if (arg1 == 5000 && class25.field228 > 0) {
            byte[] var3 = class26.field329[--class25.field228];
            class26.field329[class25.field228] = null;
            return var3;
        } else if (arg1 == 30000 && class32.field413 > 0) {
            byte[] var4 = class10.field89[--class32.field413];
            class10.field89[class32.field413] = null;
            return var4;
        } else {
            if (arg0 != -6736) {
                method1((byte) 61);
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(B)[Lu;", line = 117)
    public static final class38[] method4(byte arg0) {
        if (arg0 >= -24) {
            field6 = null;
        }
        return new class38[] { field4, class20.field189, class19.field177, class33.field434, field2, class32.field408, class22.field204, class22.field203, class38.field494, class39.field497, class38.field493, class18.field170, class16.field153, class34.field437 };
    }
}
