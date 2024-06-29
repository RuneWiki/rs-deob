import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class184 extends class661 {

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Lgr;")
    public static class530 field2537 = new class530(67, 7);

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field2546 = 104;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "B")
    public byte field2538;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "Lsl;")
    public class479 field2544;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V", line = 5)
    public static void method1301(int arg0) {
        if (arg0 > 3) {
            field2537 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V", line = 17)
    public static final void method1302(int arg0) {
        ++field2543;
        class243.field3580.method3301(1, arg0 + 24, class243.field3580.field7964);
        class243.field3580.method3301(1, 24, class243.field3580.field8002);
        class243.field3580.method3301(1, 24, class243.field3580.field7998);
        class243.field3580.method3301(1, 24, class243.field3580.field7986);
        class243.field3580.method3301(1, 24, class243.field3580.field7996);
        class243.field3580.method3301(1, 24, class243.field3580.field7972);
        class243.field3580.method3301(0, 24, class243.field3580.field7966);
        class243.field3580.method3301(0, 24, class243.field3580.field8006);
        class243.field3580.method3301(0, 24, class243.field3580.field7994);
        class243.field3580.method3301(0, arg0 + 24, class243.field3580.field8007);
        class243.field3580.method3301(0, 24, class243.field3580.field8008);
        class243.field3580.method3301(0, 24, class243.field3580.field7991);
        class243.field3580.method3301(0, 24, class243.field3580.field8001);
        class243.field3580.method3301(0, 24, class243.field3580.field8005);
        class243.field3580.method3301(0, 24, class243.field3580.field8015);
        class243.field3580.method3301(0, 24, class243.field3580.field8017);
        class243.field3580.method3301(0, 24, class243.field3580.field7973);
        class243.field3580.method3301(arg0, 24, class243.field3580.field7974);
        class243.field3580.method3301(0, arg0 + 24, class243.field3580.field8011);
        class551.method3320(true);
        class243.field3580.method3301(2, 24, class243.field3580.field7983);
        class243.field3580.method3301(2, arg0 ^ 24, class243.field3580.field7990);
        class181.method1284(111);
        class728.method4065(-1386);
        class567.field8205 = true;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z", line = 55)
    public static final boolean method1303(int arg0, int arg1) {
        if (arg1 != 9499) {
            method1305(-96);
        }
        ++field2545;
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)[B", line = 66)
    public final byte[] method1304(int arg0) {
        if (arg0 < 98) {
            return null;
        } else {
            ++field2540;
            if (!super.field9450 && this.field2544.field6864 >= this.field2544.field6800.length + -this.field2538) {
                return this.field2544.field6800;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I", line = 84)
    public static final int method1305(int arg0) {
        ++field2542;
        if (class214.field3211 != null) {
            return 3;
        } else {
            if (arg0 != 1) {
                method1301(93);
            }
            return !class708.field9958 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I", line = 102)
    public final int method1306(int arg0) {
        if (arg0 != 3344) {
            this.field2538 = 39;
        }
        ++field2539;
        return this.field2544 == null ? 0 : this.field2544.field6864 * 100 / (this.field2544.field6800.length + -this.field2538);
    }
}
