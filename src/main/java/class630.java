import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class630 extends class168 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lqaa;")
    public static class27 field9035 = new class27(68, 7);

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[Ljn;")
    public static class716[] field9041 = new class716[4];

    @OriginalMember(owner = "client!am", name = "m", descriptor = "S")
    public static short field9042 = 205;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
    public static boolean field9043 = false;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Ljw;")
    public static class551 field9039 = new class551(0, 1);

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[[B")
    public static byte[][] field9040;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I")
    public static final int method3627(byte arg0, int arg1) {
        field9037++;
        byte var2;
        if (arg1 > 12000) {
            class127.method988(2);
            var2 = 4;
        } else if (arg1 > 5000) {
            class150.method1158((byte) -105);
            var2 = 3;
        } else if (arg1 > 2000) {
            class405.method2489(-6589);
            var2 = 2;
        } else {
            var2 = 1;
            class155.method1184(0, true);
        }
        if (class471.field6781.field6684.method1843(27669) != 2) {
            class471.field6781.method2826(2, (byte) 116, class471.field6781.field6695);
            class54.method490((byte) -121, false, 2);
        }
        class129.method994((byte) 47);
        if (arg0 != 60) {
            field9035 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static void method3628(int arg0) {
        if (arg0 != 32250) {
            field9042 = -58;
        }
        field9040 = null;
        field9041 = null;
        field9039 = null;
        field9035 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lee;")
    public static final class673 method3629(int arg0, int arg1) {
        field9036++;
        int var2 = -34 % ((-arg1 - 26) / 51);
        class673[] var3 = class183.method1308(2);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class673 var5 = var3[var4];
            if (var5.field9447 == arg0) {
                return var5;
            }
        }
        return null;
    }
}
