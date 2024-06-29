import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class320 extends class30 {

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    private int field4377;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "[I")
    public static int[] field4380 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "[Ldr;")
    public static class671[] field4382 = new class671[2048];

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "Lem;")
    public static class206 field4383 = new class206(107, 19);

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field4378;
        if (arg0 != 1) {
            return null;
        } else {
            int[] var3 = super.field374.method3664(arg1, (byte) 8);
            if (super.field374.field9032) {
                class359.method2051(var3, 0, class31.field399, this.field4377);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 == 0) {
            this.field4377 = (arg2.method2874((byte) -75) << 12) / 255;
        }
        if (arg0 <= 100) {
            field4380 = null;
        }
        ++field4384;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)V")
    public static final void method1923(int arg0, int arg1, int arg2) {
        ++field4379;
        class689 var3 = class187.field2718[arg2][arg0];
        if (var3 != null) {
            class226.field3141 = var3.field9818;
            class456.field6334 = var3.field9819;
            class420.field5918 = var3.field9825;
        }
        int var4 = 48 % ((45 - arg1) / 57);
        class593.method3353(false);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(I)V")
    public class320(int arg0) {
        super(0, true);
        this.field4377 = 4096;
        this.field4377 = arg0;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class320() {
        this(4096);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
    public static void method1924(boolean arg0) {
        field4380 = null;
        field4383 = null;
        if (arg0) {
            field4382 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3) {
        class492.field6720 = new byte[arg1][arg0][arg3];
        if (arg2 != 2048) {
            field4383 = null;
        }
        ++field4381;
    }
}
