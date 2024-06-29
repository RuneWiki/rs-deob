import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class453 extends class264 {

    @OriginalMember(owner = "client!nja", name = "n", descriptor = "[F")
    public static float[] field6517 = new float[16384];

    @OriginalMember(owner = "client!nja", name = "k", descriptor = "[F")
    public static float[] field6514 = new float[16384];

    @OriginalMember(owner = "client!nja", name = "s", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!nja", name = "l", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!nja", name = "m", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!nja", name = "o", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!nja", name = "p", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!nja", name = "q", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!nja", name = "r", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            this.method660(-51);
        }
        ++field6519;
        return super.field3731.method3634(0).method2857(6) ? 3 : 2;
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(B)V")
    public static void method2723(byte arg0) {
        int var1 = 81 / ((12 - arg0) / 36);
        field6514 = null;
        field6517 = null;
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field6518;
        int var2 = 76 / ((arg0 - 1) / 41);
        if (super.field3733 < 1 || super.field3733 > 3) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!nja", name = "c", descriptor = "(B)I")
    public final int method2724(byte arg0) {
        if (arg0 > -31) {
            field6514 = null;
        }
        ++field6515;
        return super.field3733;
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lmfa;)V")
    public class453(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            this.method666((byte) -78, -84);
        }
        ++field6520;
        return 1;
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(ILmfa;)V")
    public class453(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        ++field6521;
        super.field3733 = arg1;
        if (arg0 >= -114) {
            field6522 = 1;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6517[var2] = (float) Math.sin((double) var2 * var0);
            field6514[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6522 = -1;
    }
}
