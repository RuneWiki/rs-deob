import java.awt.Font;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ltd;")
    public static class136 field2418 = class145.method1172("<col=ffff00>", 45);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ltd;")
    public static class136 field2417 = class145.method1172(")1j", 45);

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2425 = 0;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Ltd;")
    public static class136 field2428 = class145.method1172(")3runescape)3com", 45);

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Ltd;")
    public static class136 field2432 = class145.method1172("nicht hergestellt werden)3", 45);

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ldb;")
    public static class24 field2420;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lmd;")
    public static class87 field2422;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field2419;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field2429;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    public static int[] field2421;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
    public static int[] field2426;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[Lbb;")
    public static class10[] field2424;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[Lbb;")
    public static class10[] field2430;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Ltd;")
    public static final class136 method812(int arg0, byte arg1) {
        class136 var2 = class19.method140(arg0, -89);
        if (arg1 != 97) {
            field2430 = null;
        }
        field2431++;
        for (int var3 = var2.method1119(-10511) - 3; var3 > 0; var3 -= 3) {
            var2 = class79.method570(0, new class136[] { var2.method1105(0, (byte) -7, var3), class139.field3253, var2.method1108(var3, -16621) });
        }
        if (var2.method1119(-10511) > 9) {
            return class79.method570(arg1 - 97, new class136[] { class94.field2212, var2.method1105(0, (byte) -7, var2.method1119(-10511) + -8), class4.field69, class39.field922, var2, class87.field2057 });
        } else if (var2.method1119(-10511) > 6) {
            return class79.method570(0, new class136[] { class29.field636, var2.method1105(0, (byte) -7, var2.method1119(-10511) - 4), class1.field13, class39.field922, var2, class87.field2057 });
        } else {
            return class79.method570(arg1 - 97, new class136[] { class43.field1000, var2, class94.field2207 });
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method813(int arg0) {
        field2421 = null;
        field2429 = null;
        field2419 = null;
        field2420 = null;
        field2417 = null;
        if (arg0 > -22) {
            return;
        }
        field2424 = null;
        field2432 = null;
        field2430 = null;
        field2422 = null;
        field2426 = null;
        field2418 = null;
        field2428 = null;
    }
}
