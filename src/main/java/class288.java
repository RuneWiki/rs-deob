import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class288 extends class79 {

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Z")
    public boolean field4736 = false;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lck;")
    public static class119 field4735 = class298.method1987((byte) 40, "gelb:");

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Lck;")
    public static class119 field4738 = class298.method1987((byte) 44, "");

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field4740 = 0;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "[I")
    public static int[] field4741 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Lml;")
    public static class134 field4742 = null;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Llh;")
    public static class282 field4743;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI)V", line = 25)
    public static final void method1923(int arg0, boolean arg1, int arg2) {
        field4737++;
        class68 var3 = class252.method1622(arg2, (byte) -120);
        int var4 = var3.field1053;
        int var5 = var3.field1055;
        int var6 = var3.field1052;
        int var7 = class198.field3169[var6 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        if (!arg1) {
            method1923(-28, true, 89);
        }
        int var8 = var7 << var4;
        class292.method1944(~var8 & class106.field1641[var5] | var8 & arg0 << var4, (byte) -102, var5);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 65)
    public static void method1924(int arg0) {
        if (arg0 != 2) {
            method1923(83, false, 3);
        }
        field4738 = null;
        field4741 = null;
        field4735 = null;
        field4742 = null;
        field4743 = null;
    }
}
