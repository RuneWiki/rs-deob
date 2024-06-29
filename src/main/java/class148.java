import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class148 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[I")
    public static int[] field2312 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2317 = 1;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field2321 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Z")
    public static boolean field2313 = false;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "Z")
    public static boolean field2322 = false;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lvb;")
    public static class140 field2315;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "[[[I")
    public static int[][][] field2320;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method1030(int arg0) {
        field2320 = null;
        field2312 = null;
        if (arg0 != -12101) {
            field2321 = -77;
        }
        field2315 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lnc;")
    public static final class259 method1031(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class259 var4 = var3.field2355;
            var3.field2355 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public static final void method1032(int arg0, int arg1) {
        class175 var2 = class182.method1317(14, arg0, false);
        var2.method1278((byte) 109);
        if (arg1 < 68) {
            field2314 = 30;
        }
        field2316++;
    }
}
