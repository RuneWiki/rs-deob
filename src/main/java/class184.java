import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class184 extends class189 {

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public int field2960 = 0;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLnn;)V")
    public final void method1254(byte arg0, class289 arg1) {
        int var3 = 111 / ((arg0 + 61) / 56);
        field2957++;
        while (true) {
            int var4 = arg1.method1858(-3256);
            if (var4 == 0) {
                return;
            }
            this.method1255(arg1, -754926815, var4);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lnn;II)V")
    private final void method1255(class289 arg0, int arg1, int arg2) {
        field2961++;
        if (arg2 == 2) {
            this.field2960 = arg0.method1841((byte) 82);
        }
        if (arg1 != -754926815) {
            this.method1254((byte) -67, null);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)I")
    public static final int method1256(int arg0, byte arg1) {
        int var7 = arg0 - 1;
        field2962++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 < 75) {
            field2958 = 76;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
