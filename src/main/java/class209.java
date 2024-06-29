import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class209 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
    public static int[] field3804 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lhj;")
    public static class69 field3802 = class181.method1318("Benutzen", (byte) -120);

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Lhj;")
    private static class69 field3811 = class181.method1318("Loading sprites )2 ", (byte) -110);

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[I")
    public static int[] field3814 = new int[1000];

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Lhj;")
    public static class69 field3807 = field3811;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Lhj;")
    public static class69 field3816 = class181.method1318("", (byte) -112);

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Lhj;")
    public static class69 field3805 = field3816;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lhj;")
    public static class69 field3809 = field3816;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3798;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lhj;Lhj;IB)V")
    public static final void method1509(class69 arg0, class69 arg1, int arg2, byte arg3) {
        field3808++;
        class16.field215 = arg2;
        field3805 = arg0;
        field3809 = arg1;
        class104.field1973 = false;
        class181.field3299 = 0;
        int var4 = -128 % ((arg3 + 50) / 39);
        if (field3809.method444((byte) -24, field3816) || field3805.method444((byte) -24, field3816)) {
            class165.field3034 = 0;
            class265.field4718 = 3;
        } else {
            class132.field2450 = 0;
            class165.field3034 = 1;
            class112.field2145 = 0;
            class265.field4718 = -3;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfh;IB)V")
    private final void method1510(class128 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3815 = arg0.method912(57);
            this.field3810 = arg0.method937(false);
            this.field3800 = arg0.method937(false);
        }
        if (arg2 <= 15) {
            this.method1510((class128) null, -100, (byte) -79);
        }
        field3801++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfh;I)V")
    public final void method1511(class128 arg0, int arg1) {
        field3799++;
        while (true) {
            int var3 = arg0.method937(false);
            if (var3 == 0) {
                if (arg1 == 2015) {
                    return;
                } else {
                    field3798 = null;
                    return;
                }
            }
            this.method1510(arg0, var3, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
    public static final boolean method1512(int arg0) {
        field3803++;
        int var1 = -48 % ((-arg0 - 46) / 37);
        if (class200.field3615 != 0) {
            try {
                class239.field4379.method480(class36.field508.field601, 9);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static final void method1513(int arg0) {
        if (arg0 != -24661) {
            method1514(-10);
        }
        field3813++;
        class193.field3497.method1713(-84);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field3804 = null;
        field3798 = null;
        field3802 = null;
        if (arg0 != -10048) {
            method1509((class69) null, (class69) null, -44, (byte) -59);
        }
        field3816 = null;
        field3811 = null;
        field3807 = null;
        field3814 = null;
        field3805 = null;
        field3809 = null;
    }
}
