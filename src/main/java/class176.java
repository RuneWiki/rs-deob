import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class176 extends class139 {

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    private int field2489;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    private int field2486;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Z")
    public static boolean field2485 = true;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lnh;")
    public static class305 field2488;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
    public static final int method1103(byte arg0, int arg1) {
        ++field2478;
        if (arg0 != 15) {
            field2485 = false;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BII)V")
    public final void method790(byte arg0, int arg1, int arg2) {
        if (arg0 >= 93) {
            ++field2483;
            int var4 = this.field2481 * arg2 >> 12;
            int var5 = this.field2487 * arg1 >> 12;
            int var6 = this.field2486 * arg2 >> 12;
            int var7 = this.field2489 * arg1 >> 12;
            class208.method1293(-2, var7, super.field1932, var5, var4, var6, super.field1926);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIII)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2489 = arg1;
        this.field2486 = arg0;
        this.field2481 = arg2;
        this.field2487 = arg3;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(ZII)V")
    public final void method786(boolean arg0, int arg1, int arg2) {
        ++field2482;
        int var4 = this.field2486 * arg2 >> 12;
        int var5 = this.field2481 * arg2 >> 12;
        int var6 = this.field2489 * arg1 >> 12;
        int var7 = this.field2487 * arg1 >> 12;
        if (!arg0) {
            this.method786(false, 40, 2);
        }
        class223.method1470(false, var7, var6, var4, var5, super.field1928);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII)V")
    public final void method791(boolean arg0, int arg1, int arg2) {
        ++field2480;
        int var4 = this.field2486 * arg1 >> 12;
        int var5 = this.field2489 * arg2 >> 12;
        if (arg0) {
            this.field2489 = 112;
        }
        int var6 = this.field2481 * arg1 >> 12;
        int var7 = this.field2487 * arg2 >> 12;
        class10.method56(1146, super.field1926, var7, var6, var5, super.field1928, var4, super.field1932);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1104(int arg0) {
        if (arg0 == 0) {
            field2488 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
    public static final int method1105(int arg0, int arg1) {
        if (class272.field4332 != null) {
            class272.field4332.method1211((byte) 118);
            class272.field4332 = null;
        }
        ++class245.field3839;
        ++field2479;
        if (arg0 != 1310) {
            return 85;
        } else if (~class245.field3839 < -5) {
            class245.field3839 = 0;
            class223.field3480 = 0;
            return arg1;
        } else {
            if (class288.field4600 != class215.field3259) {
                class215.field3259 = class288.field4600;
            } else {
                class215.field3259 = class290.field4627;
            }
            class223.field3480 = 0;
            return -1;
        }
    }
}
