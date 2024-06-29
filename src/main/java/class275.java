import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class275 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public static int[] field3809 = new int[1000];

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Laq;")
    public static class385 field3807;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1723(byte arg0) {
        field3813++;
        if (class250.field3508) {
            return;
        }
        if (arg0 >= -54) {
            method1724(79);
        }
        class343.field4704 = true;
        if (class104.field1498) {
            class356.field4959 = (float) ((int) class356.field4959 - 17 & 0xFFFFFFF0);
        } else {
            class388.field5465 += (-class388.field5465 - 12.0F) / 2.0F;
        }
        class250.field3508 = true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 33)
    public static void method1724(int arg0) {
        field3807 = null;
        if (arg0 == -249) {
            field3809 = null;
        }
    }
}
