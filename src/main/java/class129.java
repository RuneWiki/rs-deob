import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class129 extends class24 {

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lfc;")
    public static class34 field3126 = new class34();

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[J")
    public static long[] field3133 = new long[100];

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Lv;")
    public static class122 field3129 = class55.method425(-96, "null");

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lwb;")
    public class129 field3125;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Lwb;")
    public class129 field3127;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lkb;")
    public static class62 field3124;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 17)
    public static void method1011(byte arg0) {
        field3133 = null;
        if (arg0 == -46) {
            field3126 = null;
            field3129 = null;
            field3124 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 37)
    public final void method1012(int arg0) {
        field3132++;
        if (this.field3127 == null) {
            return;
        }
        this.field3127.field3125 = this.field3125;
        this.field3125.field3127 = this.field3127;
        this.field3127 = null;
        if (arg0 == -1) {
            this.field3125 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V", line = 66)
    public static final void method1013(int arg0) {
        field3131++;
        class74.field1935.method996((byte) 53, 163);
        if (class109.field2698 != -1) {
            class16.method160(arg0 + 29565, class109.field2698);
            class62.field1588 = true;
            class114.field2796 = true;
            class24.field664 = false;
            class109.field2698 = -1;
        }
        if (arg0 != -29565) {
            field3124 = null;
        }
        class49.field1233++;
        if (class6.field155 != -1) {
            class16.method160(arg0 + 29565, class6.field155);
            class24.field664 = false;
            class103.field2558 = true;
            class6.field155 = -1;
        }
        if (class108.field2676 != -1) {
            class16.method160(arg0 ^ 0xFFFF8C83, class108.field2676);
            class108.field2676 = -1;
            class76.method641(30, true);
        }
        if (class113.field2765 != -1) {
            class16.method160(0, class113.field2765);
            class113.field2765 = -1;
        }
        if (class47.field1210 != -1) {
            class16.method160(arg0 ^ 0xFFFF8C83, class47.field1210);
            class47.field1210 = -1;
        }
    }
}
