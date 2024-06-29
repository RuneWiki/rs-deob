import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class173 extends class175 {

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2896 = 2;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Leg;")
    private static class37 field2897 = class174.method1167("wave2:", 104);

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Leg;")
    public static class37 field2900 = class174.method1167("(U (X", -79);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Leg;")
    public static class37 field2895 = field2897;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[S")
    public static short[] field2901 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Leg;")
    public static class37 field2899 = field2897;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Leg;")
    public static class37 field2903 = class174.method1167("Null", 85);

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Leg;")
    public static class37 field2905 = class174.method1167("M", -67);

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lbf;")
    public static class202 field2902 = new class202(500);

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2906 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
    public static final int method1159(int arg0, byte arg1) {
        field2898++;
        if (arg1 >= -118) {
            method1161((Component) null, (byte) -14);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lwc;)V")
    public static final void method1160(class27 arg0) {
        for (int var1 = arg0.field402; var1 <= arg0.field387; var1++) {
            for (int var2 = arg0.field397; var2 <= arg0.field399; var2++) {
                class111 var3 = class286.field5048[arg0.field383][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1880; var4++) {
                        if (var3.field1858[var4] == arg0) {
                            var3.field1880--;
                            for (int var5 = var4; var5 < var3.field1880; var5++) {
                                var3.field1858[var5] = var3.field1858[var5 + 1];
                                var3.field1877[var5] = var3.field1877[var5 + 1];
                            }
                            var3.field1858[var3.field1880] = null;
                            break;
                        }
                    }
                    var3.field1881 = 0;
                    for (int var6 = 0; var6 < var3.field1880; var6++) {
                        var3.field1881 |= var3.field1877[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1161(Component arg0, byte arg1) {
        arg0.removeMouseListener(class233.field4017);
        if (arg1 > -76) {
            field2903 = null;
        }
        field2904++;
        arg0.removeMouseMotionListener(class233.field4017);
        arg0.removeFocusListener(class233.field4017);
        class35.field497 = 0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1162(int arg0) {
        if (arg0 != 0) {
            field2895 = null;
        }
        field2900 = null;
        field2905 = null;
        field2895 = null;
        field2902 = null;
        field2899 = null;
        field2897 = null;
        field2901 = null;
        field2906 = null;
        field2903 = null;
    }
}
