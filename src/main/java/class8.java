import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field119 = -1;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field116 = new int[50];

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Li;")
    private static class88 field122 = class208.method1425(105, "Your account has been disabled)3");

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Li;")
    public static class88 field117 = field122;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Li;")
    public static class88 field120 = class208.method1425(105, "<col=ffff00>");

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[[[B")
    public static byte[][][] field115;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
    public static final boolean method43(int arg0, int arg1, int arg2) {
        class148 var3 = class190.method1323(arg2, arg1 ^ 0xFFFFCF56);
        if (arg1 != 8) {
            method45(-34);
        }
        field123++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method993((byte) 23, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static final void method44(byte arg0) {
        field118++;
        for (class143 var1 = (class143) class66.field1196.method1612(false); var1 != null; var1 = (class143) class66.field1196.method1621(arg0 ^ 0x1C)) {
            if (var1.field2636 != null) {
                var1.method940(-64);
            }
        }
        if (arg0 != 78) {
            method43(76, 20, 47);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method45(int arg0) {
        field116 = null;
        field117 = null;
        field120 = null;
        field115 = null;
        if (arg0 != 50) {
            method44((byte) -114);
        }
        field122 = null;
    }
}
