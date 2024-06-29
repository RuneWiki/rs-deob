import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class673 {

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lada;")
    public static class164 field9382 = new class164();

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lada;")
    public static class164 field9383 = new class164();

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "Lqe;")
    public static class469 field9384 = new class469(109, -1);

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "[I")
    public static int[] field9385 = new int[4];

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "J")
    public static long field9388 = -1L;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "Lre;")
    public static class603 field9386 = new class603();

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field9389 = -1;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "Lvd;")
    public static class39 field9387;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lsca;B)V")
    public static final void method3850(class46 arg0, byte arg1) {
        if (class2.field21 == arg0.field567) {
            class228.field3352[arg0.field566] = true;
        }
        field9380++;
        int var2 = 13 / ((27 - arg1) / 46);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)V")
    public static final void method3851(byte arg0, int arg1) {
        if (arg0 != 45) {
            method3852(true);
        }
        field9381++;
        class150 var2 = class676.method3885(1000, 6, arg1);
        var2.method1115(true);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)V")
    public static void method3852(boolean arg0) {
        field9386 = null;
        field9384 = null;
        if (arg0) {
            method3851((byte) 112, 3);
        }
        field9385 = null;
        field9387 = null;
        field9383 = null;
        field9382 = null;
    }
}
