import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class143 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field2104 = 1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "C")
    public char field2103;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[[[J")
    public static long[][][] field2105;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1019(int arg0) {
        field2105 = null;
        int var1 = 89 % ((arg0 + 43) / 55);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILso;I)V")
    private final void method1020(int arg0, class494 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2103 = class583.method3412(arg1.method2943((byte) 16), (byte) 58);
        } else if (arg0 == 2) {
            this.field2104 = 0;
        }
        field2107++;
        int var4 = -124 / ((27 - arg2) / 56);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lso;I)V")
    public final void method1021(class494 arg0, int arg1) {
        field2106++;
        while (true) {
            int var3 = arg0.method2964((byte) 107);
            if (var3 == 0) {
                int var4 = -72 / ((42 - arg1) / 34);
                return;
            }
            this.method1020(var3, arg0, 91);
        }
    }
}
