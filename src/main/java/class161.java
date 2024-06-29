import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class161 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Z")
    public static boolean field2811 = false;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2809 = 0;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[[[I")
    public static int[][][] field2815;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 10)
    public static void method1167(byte arg0) {
        field2815 = (int[][][]) null;
        if (arg0 != -14) {
            field2809 = 105;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 21)
    public static final void method1168(byte arg0) {
        field2813++;
        if (arg0 < 84) {
            method1169(38, -22);
        }
        class306.field5205.method2172(false);
        class42.field738.method2172(false);
        class189.field3166.method2172(false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I", line = 45)
    public static final int method1169(int arg0, int arg1) {
        class130 var2 = class290.method2002(arg0, (byte) -75);
        field2810++;
        int var3 = var2.field2260;
        int var4 = var2.field2262;
        if (arg1 == 0) {
            int var5 = var2.field2269;
            int var6 = class98.field1772[var4 - var5];
            return var6 & class312.field5398[var3] >> var5;
        } else {
            return -85;
        }
    }
}
