import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class135 {

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Z")
    public boolean field2220 = true;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
    public static boolean field2212 = false;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Z")
    public static boolean field2215 = false;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Llc;")
    public static class86 field2207;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Llc;I)V")
    public static final void method971(class86 arg0, int arg1) {
        field2218++;
        class20.field225 = arg0;
        if (arg1 != 3) {
            method972(true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method972(boolean arg0) {
        if (arg0) {
            field2207 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIB)I")
    public static final int method973(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 94) {
            method971((class86) null, 46);
        }
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        field2217++;
        return (arg1 >> 1) + ((arg2 >> 2 << 10) + (arg0 >> 5 << 7));
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2208 = arg0;
        this.field2211 = arg3;
        this.field2214 = arg2;
        this.field2220 = arg6;
        this.field2216 = arg4;
        this.field2213 = arg5;
        this.field2219 = arg1;
    }
}
