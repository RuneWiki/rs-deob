import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class162 extends class116 {

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "Lof;")
    public class178 field2833;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lrg;")
    public static class84 field2828 = new class84();

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field2834 = 0;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lqe;")
    public static class42 field2835 = new class42(64);

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Lda;")
    public static class275 field2837 = class255.method1672(107, "sch-Utteln:");

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Llg;")
    public static class266 field2838;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Llb;")
    public static class274 field2831;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
    public static int[] field2836;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Lda;")
    public static final class275 method1127(int arg0, int arg1) {
        if (arg0 <= 65) {
            field2832 = -20;
        }
        field2827++;
        if (arg1 < 100000) {
            return class197.method1291(new class275[] { class187.field3207, class250.method1644(arg1, (byte) -115), class118.field2109 }, -30025);
        } else if (arg1 < 10000000) {
            return class197.method1291(new class275[] { class124.field2208, class250.method1644(arg1 / 1000, (byte) -115), class42.field714, class118.field2109 }, -30025);
        } else {
            return class197.method1291(new class275[] { class127.field2255, class250.method1644(arg1 / 1000000, (byte) -115), class207.field3493, class118.field2109 }, -30025);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)V")
    public static final void method1128(int arg0, byte arg1) {
        field2829++;
        class184 var2 = class147.method1044(7, (byte) 59, arg0);
        var2.method1230(1000);
        int var3 = -27 % ((-arg1 - 13) / 44);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBI)V")
    public static final void method1129(int arg0, int arg1, byte arg2, int arg3) {
        field2830++;
        class184 var4 = class147.method1044(9, (byte) 88, arg3);
        var4.method1226((byte) 26);
        var4.field3145 = arg1;
        if (arg2 < 22) {
            field2836 = null;
        }
        var4.field3151 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field2836 = null;
        field2831 = null;
        field2837 = null;
        field2838 = null;
        field2835 = null;
        field2828 = null;
        if (arg0 != 10000000) {
            method1129(29, -28, (byte) -22, -42);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lof;)V")
    public class162(class178 arg0) {
        this.field2833 = arg0;
    }
}
