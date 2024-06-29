import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class157 extends class208 {

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lve;")
    public static class255 field2662 = class87.method607(111, "0");

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Lud;")
    public static class269 field2665;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIB)Z", line = 5)
    public final boolean method1152(int arg0, int arg1, byte arg2) {
        field2664++;
        int var4 = -64 % ((9 - arg2) / 39);
        return this.field2663 <= arg1 && arg1 <= this.field2666 && this.field2661 <= arg0 && arg0 <= this.field2667;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V", line = 22)
    public static void method1153(byte arg0) {
        field2662 = null;
        field2665 = null;
        int var1 = -24 / ((arg0 + 38) / 44);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIII)V", line = 40)
    public class157(int arg0, int arg1, int arg2, int arg3) {
        this.field2667 = arg3;
        this.field2666 = arg2;
        this.field2663 = arg0;
        this.field2661 = arg1;
    }
}
