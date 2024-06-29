import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class95 extends class90 {

    @OriginalMember(owner = "client!k", name = "A", descriptor = "[I")
    public int[] field2037 = new int[] { -1 };

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[I")
    public int[] field2038 = new int[1];

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field2033 = 0;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lrf;")
    private static class163 field2039 = class53.method392(90, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lrf;")
    public static class163 field2034 = field2039;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Lue;")
    public static class189 field2032;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[Lpf;")
    public static class145[] field2035;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static void method660(int arg0) {
        field2035 = null;
        field2034 = null;
        if (arg0 != -29950) {
            field2032 = null;
        }
        field2032 = null;
        field2039 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)V")
    public static final void method661(int arg0, long arg1) {
        field2036++;
        if (arg1 == 0L) {
            return;
        }
        if (class26.field479 >= 100) {
            class43.method267((byte) -128, class59.field1219, class36.field728, 0);
            return;
        }
        class163 var3 = class116.method802(arg1, true).method1031(false);
        for (int var4 = 0; var4 < class26.field479; var4++) {
            if (class130.field2713[var4] == arg1) {
                class43.method267((byte) -83, class180.method1216(new class163[] { var3, class114.field2416 }, false), class36.field728, 0);
                return;
            }
        }
        for (int var5 = arg0; var5 < class186.field3717; var5++) {
            if (class86.field1887[var5] == arg1) {
                class43.method267((byte) -49, class180.method1216(new class163[] { class154.field3186, var3, class208.field4055 }, false), class36.field728, 0);
                return;
            }
        }
        if (var3.method1043(81, class56.field1136.field758)) {
            class43.method267((byte) -126, class180.field3615, class36.field728, 0);
            return;
        }
        class44.field898++;
        class130.field2713[class26.field479] = arg1;
        class55.field1118[class26.field479++] = class116.method802(arg1, true);
        class109.field2286 = class62.field1325;
        class141.field2896.method326(104, 117);
        class141.field2896.method373((byte) -52, arg1);
    }
}
