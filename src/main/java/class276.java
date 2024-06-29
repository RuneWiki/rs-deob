import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class276 extends class446 {

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[I")
    public static int[] field3838 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!so", name = "D", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "[I")
    public static int[] field3839;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "[[[Ljd;")
    public static class125[][][] field3836;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V", line = 27)
    public static void method1796(int arg0) {
        field3836 = null;
        if (arg0 != -31041) {
            method1797(false, (class374) null);
        }
        field3838 = null;
        field3839 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLoo;)V", line = 39)
    public static final void method1797(boolean arg0, class374 arg1) {
        if (arg0) {
            field3837 = -34;
        }
        field3841++;
        if (arg1 instanceof class198) {
            class198 var2 = (class198) arg1;
            if (var2.field2737 != null) {
                class42.method387(30529, var2);
                return;
            }
        } else if ((arg1 instanceof class134)) {
            class132.method914((class134) arg1, 18989);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!so", name = "e", descriptor = "(I)V", line = 67)
    public static final void method1798(int arg0) {
        if (class417.field5927 != null) {
            class417.field5927.method258((byte) -118);
        }
        field3835++;
        if (class119.field1682 != null) {
            class119.field1682.method258((byte) -118);
        }
        class376.method2402(2, (byte) 16, class133.field1904, 22050);
        if (arg0 >= 121) {
            class417.field5927 = class74.method551(112, 22050, class304.field4191, class241.field3426, 0);
            class417.field5927.method260((byte) -77, class48.field683);
            class119.field1682 = class74.method551(116, 2048, class304.field4191, class241.field3426, 1);
            class119.field1682.method260((byte) -77, class164.field2266);
        }
    }
}
