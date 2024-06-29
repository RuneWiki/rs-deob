import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lec;")
    public static class32 field2317 = class73.method594("headicons_pk", true);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lec;")
    public static class32 field2320 = class73.method594("Mitglieder)2Welt", true);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[[I")
    public static int[][] field2319 = new int[104][104];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lh;")
    public static class49 field2322;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)I")
    public static final int method797(int arg0, int arg1, int arg2, int arg3) {
        field2321++;
        if (arg2 > 179) {
            arg3 /= 2;
        }
        if (arg2 > 192) {
            arg3 /= 2;
        }
        if (arg2 > 217) {
            arg3 /= 2;
        }
        if (arg2 > 243) {
            arg3 /= 2;
        }
        return (arg1 / 4 << 10) + (arg3 / 32 << 7) + arg2 / arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method798(int arg0) {
        field2317 = null;
        field2322 = null;
        field2320 = null;
        field2319 = null;
        if (arg0 != -193) {
            field2317 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLfd;)V")
    public static final void method799(byte arg0, class40 arg1) {
        field2318++;
        arg1.field948 = false;
        if (arg1.field947 != null) {
            arg1.field947.field2186 = 0;
        }
        for (class40 var2 = arg1.method106(); var2 != null; var2 = arg1.method113()) {
            method799((byte) -15, var2);
        }
        if (arg0 != -15) {
            method798(-59);
        }
    }
}
