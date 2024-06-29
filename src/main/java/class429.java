import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class429 {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6082 = 0;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "[[I")
    public static int[][] field6093 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "Lkg;")
    public static class179 field6090 = new class179(30, -1);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    private int field6087;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lad;")
    public class294 field6089;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILfh;)V")
    public final void method2509(int arg0, class463 arg1) {
        field6091++;
        if (arg0 > -99) {
            return;
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                return;
            }
            this.method2510(var3, -50, arg1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILfh;)V")
    private final void method2510(int arg0, int arg1, class463 arg2) {
        if (arg1 >= -19) {
            return;
        }
        field6088++;
        if (arg0 == 1) {
            this.field6087 = arg2.method2758((byte) 120);
        } else if (arg0 == 2) {
            this.field6084 = arg2.method2737(false);
            this.field6085 = arg2.method2737(false);
            return;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method2511(byte arg0) {
        field6093 = null;
        if (arg0 != -4) {
            field6082 = 70;
        }
        field6090 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
    public static final void method2512(int arg0, int arg1) {
        if (arg0 != 11) {
            method2512(-114, -111);
        }
        field6081++;
        class216.field2763 = arg1;
        class240.field3085.method2642(0);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)[Lcu;")
    public static final class147[] method2513(int arg0) {
        if (arg0 != 0) {
            field6093 = null;
        }
        field6092++;
        return new class147[] { class266.field3358, class266.field3359, class266.field3360, class266.field3361, class266.field3362, class266.field3363, class266.field3364, class266.field3365, class266.field3366, class266.field3367, class266.field3368, class266.field3369 };
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Lqv;")
    public final synchronized class311 method2514(byte arg0) {
        field6086++;
        class311 var2 = (class311) this.field6089.field3768.method2647(-98, (long) this.field6087);
        if (var2 != null) {
            return var2;
        }
        class311 var3 = class311.method1816(this.field6089.field3761, this.field6087, 0);
        if (var3 != null) {
            this.field6089.field3768.method2635((long) this.field6087, -26591, var3);
        }
        return arg0 >= -45 ? null : var3;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lfh;II)V")
    public static final void method2515(class463 arg0, int arg1, int arg2) {
        if (class191.field2485 != null) {
            try {
                class191.field2485.method533(0, 0L);
                class191.field2485.method535(arg0.field6618, (byte) -103, 24, arg1);
            } catch (Exception var3) {
            }
        }
        if (arg2 != 1) {
            field6090 = null;
        }
        field6094++;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)Z")
    public static final boolean method2516(byte arg0, int arg1, int arg2) {
        field6083++;
        if (arg0 != 46) {
            method2515(null, 8, -91);
        }
        return (arg2 & 0x70000) != 0 | class502.method3023(arg2, (byte) -125, arg1) || class454.method2705(arg2, 106, arg1);
    }

    static {
        new class335(null, "geschickt werden.", null, null);
    }
}
