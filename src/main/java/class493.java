import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class493 {

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "[I")
    public int[] field6822;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "[[F")
    public float[][] field6820;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[I")
    public int[] field6823;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "[I")
    public int[] field6824;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field6819 = 0;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljr;")
    public static class112 field6825 = new class112(50);

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "Lej;")
    public static class124 field6826 = new class124(33, 8);

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static void method2902(int arg0) {
        if (arg0 < 25) {
            method2903(30);
        }
        field6826 = null;
        field6825 = null;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public static final void method2903(int arg0) {
        class112.field1938.method228(((float) class693.field9368.field4429.method2980(-32350) * 0.1F + 0.7F) * 1.1523438F);
        field6821++;
        class112.field1938.method218(class521.field7233, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class112.field1938.method172(class521.field7238, -1, 0);
        int var1 = -35 / ((45 - arg0) / 44);
        class112.field1938.method177(class454.field6406);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class493(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field6822 = arg2;
        this.field6820 = arg3;
        this.field6823 = arg1;
        this.field6824 = arg0;
    }
}
