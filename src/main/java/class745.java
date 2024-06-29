import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class745 extends class409 {

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field10383;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "[I")
    public static int[] field10380 = new int[50];

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "Lju;")
    public static class102 field10384 = new class102(43, 7);

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "[I")
    public static int[] field10385 = new int[250];

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field10382;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2496(int arg0) {
        field10381++;
        if (arg0 != 4) {
            field10380 = null;
        }
        return this.field10383;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)Z")
    public final boolean method2495(byte arg0) {
        field10382++;
        if (arg0 != 65) {
            field10384 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class745(Object arg0, int arg1) {
        super(arg1);
        this.field10383 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public static void method4147(int arg0) {
        if (arg0 <= 1) {
            method4147(-25);
        }
        field10380 = null;
        field10384 = null;
        field10385 = null;
    }
}
