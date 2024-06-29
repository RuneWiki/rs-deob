import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class412 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "Lwo;")
    public static class690 field5849 = new class690(103, -1);

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Lwo;")
    public static class690 field5852 = new class690(65, -1);

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Lce;")
    public static class281 field5853 = new class281(0, 0);

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field5854 = 0;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 4)
    public static void method2483(int arg0) {
        field5852 = null;
        field5853 = null;
        field5849 = null;
        if (arg0 != 63) {
            method2483(-20);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)I", line = 19)
    public static final int method2484(int arg0, int arg1) {
        field5851++;
        return arg1 < 92 ? 84 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 40)
    public static final void method2485(byte arg0) {
        if (arg0 >= -52) {
            method2484(-5, -28);
        }
        field5850++;
        if (class221.field2851.method1747(0, class375.field5039) || class656.field9319 == class617.field8853) {
            class497.method2894(class68.field1045, -1079213620);
            if (class617.field8853 != class575.field8422) {
                class699.method3917(111);
            }
        } else {
            class245.method1493((byte) -28, false, 11, class389.field5225, class532.field7778);
        }
    }
}
