import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class262 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ldk;")
    public static class326 field3835 = new class326("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lwf;")
    public static class79 field3838 = new class79(18, -1);

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
    public static int[] field3842 = new int[1000];

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[I")
    public static int[] field3843 = new int[8];

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lak;")
    public static class212 field3832;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3840;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method1620(int arg0) {
        field3842 = null;
        field3832 = null;
        field3840 = null;
        field3843 = null;
        if (arg0 == -17281) {
            field3838 = null;
            field3835 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILb;)V")
    public static final void method1621(int arg0, class201 arg1) {
        class167.field2444 = 0;
        field3834++;
        if (arg0 != 1) {
            method1623(94, 126, (byte) 54, 85);
        }
        field3841 = 0;
        class460.field6451 = new class225();
        class164.field2424 = new class468[1024];
        class427.method2510((byte) 118, arg1);
        class64.method398(arg1, (byte) -87);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
    public static final void method1622(int arg0, int arg1) {
        if (arg0 != -23065) {
            field3841 = 123;
        }
        field3837++;
        class489 var2 = class116.method731(-625541408, 7, arg1);
        var2.method2861(-229012000);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBI)V")
    public static final void method1623(int arg0, int arg1, byte arg2, int arg3) {
        class225.field3415.method1744(arg1, true);
        if (arg2 == 106) {
            field3836++;
            class225.field3415.method1711(false, arg0);
            class225.field3415.method1689(arg3, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)I")
    public static final int method1624(int arg0) {
        if (arg0 != 16822) {
            field3841 = -21;
        }
        field3833++;
        if (class86.field1045 == null) {
            return class480.field6738 ? 2 : 1;
        } else {
            return 3;
        }
    }
}
