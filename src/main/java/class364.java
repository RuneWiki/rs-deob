import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class364 extends class646 {

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field4659;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "Ldr;")
    public static class675 field4658 = new class675(96, 8);

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "[S")
    public static short[] field4666 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "Ldr;")
    public static class675 field4664 = new class675(80, -1);

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lsea;Ljava/lang/Object;I)V")
    public class364(class652 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4659 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Z")
    public final boolean method2112(int arg0) {
        if (arg0 != 0) {
            field4665 = -40;
        }
        field4662++;
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(II)I")
    public static int method2113(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(II)V")
    public static final void method2114(int arg0, int arg1) {
        class41.method257(class671.field9126.method3726((byte) 41, class71.field912), 19952, arg0);
        field4660++;
        if (arg1 < 92) {
            field4665 = -98;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2115(byte arg0) {
        field4663++;
        if (arg0 <= 103) {
            field4664 = null;
        }
        return this.field4659;
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
    public static void method2116(int arg0) {
        if (arg0 == 1) {
            field4664 = null;
            field4658 = null;
            field4666 = null;
        }
    }
}
