import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class491 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "J")
    public long field6127;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Ljaa;")
    private class576 field6126;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field6125 = 0;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "Z")
    public static boolean field6128 = false;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "[I")
    public static int[] field6123 = new int[5];

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static final void method2665(int arg0) {
        int var1 = 98 % ((22 - arg0) / 54);
        field6130++;
        class131.field1588.method1218(103);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static void method2666(int arg0) {
        int var1 = 17 % ((53 - arg0) / 55);
        field6123 = null;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljaa;JI)V")
    public class491(class576 arg0, long arg1, int arg2) {
        this.field6127 = arg1;
        this.field6126 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6124++;
        this.field6126.method3118(this.field6127, -29131);
        super.finalize();
    }
}
