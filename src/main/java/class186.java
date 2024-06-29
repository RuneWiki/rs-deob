import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public abstract class class186 extends class401 {

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "F")
    public float field2703;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field2697 = 0;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "Llh;")
    public static class487 field2698 = new class487(29, -1);

    @OriginalMember(owner = "client!tw", name = "A", descriptor = "Z")
    public static boolean field2709 = true;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!tw", name = "v", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!tw", name = "x", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!tw", name = "y", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "[Lf;")
    public static class702[] field2692;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIB)V")
    public abstract void method74(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Z")
    public static final boolean method1278(int arg0) {
        field2707++;
        if (class123.field1686) {
            try {
                class204.method1329((byte) -57, class59.field668, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 != -1;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I")
    public final int method1279(int arg0) {
        field2696++;
        return arg0 == 0 ? this.field2708 : -8;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(Z)I")
    public final int method1280(boolean arg0) {
        field2706++;
        return arg0 ? this.field2701 : 72;
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)I")
    public final int method1281(int arg0) {
        if (arg0 <= 20) {
            return 73;
        } else {
            field2705++;
            return this.field2700;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FB)V")
    public abstract void method73(float arg0, byte arg1);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)I")
    public final int method1282(byte arg0) {
        if (arg0 != 102) {
            this.method1282((byte) 4);
        }
        field2694++;
        return this.field2699;
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)I")
    public final int method1283(int arg0) {
        if (arg0 != 0) {
            field2698 = null;
        }
        field2693++;
        return this.field2702;
    }

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field2692 = null;
        field2698 = null;
        int var1 = 36 / ((arg0 - 55) / 49);
    }

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "(I)F")
    public final float method1285(int arg0) {
        if (arg0 != -1120) {
            method1284(-100);
        }
        field2704++;
        return this.field2703;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(IIIIIF)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field2702 = arg4;
        this.field2708 = arg2;
        this.field2700 = arg3;
        this.field2703 = arg5;
        this.field2699 = arg1;
        this.field2701 = arg0;
    }
}
