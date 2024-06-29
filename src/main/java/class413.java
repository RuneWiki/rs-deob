import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class413 {

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
    public static int[] field6128 = new int[500];

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Lsl;")
    public static class318 field6140 = new class318(28, 8);

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field6142 = 0;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "Lbg;")
    public static class324 field6141 = new class324(44, 6);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public int field6120;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field6125;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field6126;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field6127;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field6129;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field6130;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field6133;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public int field6134;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field6135;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Lst;")
    public static class297 field6143;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "[I")
    public static int[] field6138;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method2520(byte arg0) {
        class417.method2545(-106);
        if (arg0 > 32) {
            field6132++;
            class106.method876((byte) -109);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method2521(int arg0) {
        if (arg0 != 500) {
            return;
        }
        field6128 = null;
        field6143 = null;
        field6138 = null;
        field6141 = null;
        field6140 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBIII)V")
    public static final void method2522(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -33) {
            method2521(-12);
        }
        field6118++;
        if (arg0 >= class72.field992 && arg0 <= class126.field1842) {
            int var5 = class332.method2034(class401.field5947, -24309, arg2, class471.field6963);
            int var6 = class332.method2034(class401.field5947, -24309, arg3, class471.field6963);
            class167.method1179((byte) -17, var6, var5, arg0, arg4);
        }
    }
}
