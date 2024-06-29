import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class469 extends class544 {

    @OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
    private int field6562;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "F")
    public float field6557;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
    public int field6558;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
    public int field6556;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public int field6554;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field6549 = -1;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "Lrg;")
    public static class548 field6561 = new class548(20, 3);

    @OriginalMember(owner = "client!cba", name = "B", descriptor = "I")
    public static int field6563 = -1;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
    public final int method2730(int arg0) {
        field6548++;
        return arg0 == -1 ? this.field6556 : 84;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)I")
    public final int method2731(byte arg0) {
        field6553++;
        if (arg0 != -96) {
            method2733(-106);
        }
        return this.field6558;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
    public static void method2732(int arg0) {
        field6561 = null;
        if (arg0 != -1) {
            field6563 = -65;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)V")
    public abstract void method509(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
    public static final void method2733(int arg0) {
        field6555++;
        class443.field6109.method188((byte) 50);
        class368.field4859.method174(-128);
        class216.field2633.method1310(arg0 + 9024);
        if (arg0 != -9153) {
            method2732(76);
        }
        class41.field331.setBackground(Color.black);
        class387.field5113 = -1;
        class443.field6109 = class9.method45((byte) 28, class41.field331);
        class368.field4859 = class479.method2794((byte) -82, true, class41.field331);
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)F")
    public final float method2734(byte arg0) {
        field6560++;
        if (arg0 != -37) {
            this.method2730(-7);
        }
        return this.field6557;
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(B)I")
    public final int method2735(byte arg0) {
        field6559++;
        if (arg0 < 76) {
            this.method2736((byte) 48);
        }
        return this.field6562;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IF)V")
    public abstract void method506(int arg0, float arg1);

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "(B)I")
    public final int method2736(byte arg0) {
        field6551++;
        int var2 = -107 % ((-arg0 - 14) / 42);
        return this.field6552;
    }

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "(B)I")
    public final int method2737(byte arg0) {
        field6550++;
        return arg0 == -86 ? this.field6554 : -2;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIIF)V")
    public class469(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6562 = arg3;
        this.field6557 = arg5;
        this.field6558 = arg0;
        this.field6556 = arg1;
        this.field6552 = arg4;
        this.field6554 = arg2;
    }
}
