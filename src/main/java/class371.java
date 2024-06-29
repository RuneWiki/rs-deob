import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public abstract class class371 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field5165 = 1338;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
    public static int[] field5163 = new int[1];

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5166 = "";

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Lkaa;")
    public static class47 field5169 = new class47(6, 8);

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "[I")
    public static int[] field5170 = new int[13];

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Ldaa;")
    public static class10 field5164;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lrk;I)Lrk;")
    public abstract class32 method2121(class32 arg0, int arg1);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public static void method2178(int arg0) {
        field5164 = null;
        field5170 = null;
        field5166 = null;
        field5169 = null;
        if (arg0 < 99) {
            method2178(-33);
        }
        field5163 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static final void method2179(int arg0) {
        if (class692.field9641 <= 1) {
            class411.field5711.method1677(class411.field5711.field3873, (byte) -71, 2);
        } else {
            class411.field5711.method1677(class411.field5711.field3873, (byte) -71, 4);
        }
        if (arg0 != 8583) {
            method2180(51, 50, -72);
        }
        field5168++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z")
    public static final boolean method2180(int arg0, int arg1, int arg2) {
        field5167++;
        return arg1 == 13 ? class53.method365((byte) -79, arg0, arg2) & class148.method1112(arg2, (byte) 108, arg0) : false;
    }
}
