import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class149 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field2732 = new int[128];

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lmb;")
    public static class132 field2735 = class166.method1092("_", 127);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lpb;")
    public static class165 field2737;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Ls;")
    public static class194 field2738;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        if (arg0 != 0) {
            method989(104, 0.4730624420040743D);
        }
        field2735 = null;
        field2732 = null;
        field2737 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ID)V")
    public static final void method989(int arg0, double arg1) {
        if (class4.field49 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class34.field562[var3] = var4 > 255 ? 255 : var4;
            }
            class4.field49 = arg1;
        }
        field2739++;
        if (arg0 <= 14) {
            method990(true, null, -31);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLii;I)Lmb;")
    public static final class132 method990(boolean arg0, class96 arg1, int arg2) {
        field2733++;
        if (!class39.method274(arg2, 118, class170.method1113(arg1, (byte) -50)) && arg1.field1790 == null) {
            return null;
        } else if (arg1.field1723 == null || arg2 >= arg1.field1723.length || arg1.field1723[arg2] == null || arg1.field1723[arg2].method870((byte) -95).method902((byte) -4) == 0) {
            return class191.field3555 ? class187.method1197(new class132[] { class74.field1223, class132.method889(arg2, (byte) 101) }, -97) : null;
        } else if (arg0) {
            return null;
        } else {
            return arg1.field1723[arg2];
        }
    }
}
