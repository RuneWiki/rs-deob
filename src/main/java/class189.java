import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class189 implements class100 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Z")
    public static boolean field3063 = false;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3064 = "red:";

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lte;")
    public static class244 field3067 = new class244(100);

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field3069 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3064 = null;
        if (arg0 != 25) {
            method1320(-2);
        }
        field3067 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static final void method1319(int arg0) {
        class5.method31(false, -52);
        field3066++;
        System.gc();
        class2.method13(false, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IJIB)Ljava/lang/String;")
    public final String method614(int[] arg0, long arg1, int arg2, byte arg3) {
        field3065++;
        if (arg3 != 71) {
            return null;
        } else if (arg2 == 0) {
            class285 var6 = class176.method1220(512, arg0[0]);
            return var6.method1905(arg3 ^ 0x28, (int) arg1);
        } else if (arg2 == 1 || arg2 == 10) {
            class108 var7 = class256.method1753(arg3 - 73, (int) arg1);
            return var7.field1504;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class176.method1220(arg3 + 441, arg0[0]).method1905(92, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static final void method1320(int arg0) {
        if (arg0 == -2319) {
            class75.field937 = new class123[class18.field224.method930((byte) 122)][];
            class181.field2888 = new boolean[class18.field224.method930((byte) 119)];
            field3068++;
        }
    }
}
