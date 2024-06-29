import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;IIZI)V", line = 3)
    public static final void method201(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class622.method3606(arg3, 114, arg2, false, null, arg0, arg4);
        if (arg1 >= 70) {
            field201++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILoo;)I", line = 20)
    public static final int method202(int arg0, class580 arg1) {
        field202++;
        int var2 = arg1.method3404(2, 8);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method3404(5, 8);
        } else if (var2 == 2) {
            var3 = arg1.method3404(8, 8);
        } else {
            var3 = arg1.method3404(11, 8);
        }
        if (arg0 != 1567) {
            method201(null, 127, 74, true, -51);
        }
        return var3;
    }
}
