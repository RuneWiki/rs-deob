import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class405 extends class328 {

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    private int field5939;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    private int field5941;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    private int field5942;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "[[Z")
    public static boolean[][] field5944 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field5940 = 0;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field5948 = 0;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Z")
    public static boolean field5946;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 3)
    public static void method2435(byte arg0) {
        field5944 = null;
        if (arg0 != 121) {
            field5948 = -38;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(III)V", line = 14)
    public final void method4(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method3(17, 15, -35);
        }
        ++field5945;
        int var4 = this.field5941 * arg2 >> 12;
        int var5 = this.field5939 * arg2 >> 12;
        int var6 = this.field5947 * arg0 >> 12;
        int var7 = this.field5942 * arg0 >> 12;
        class382.method2268(var5, var4, var6, super.field4486, -15703, var7);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZI)V", line = 33)
    public final void method5(int arg0, boolean arg1, int arg2) {
        ++field5943;
        int var4 = this.field5941 * arg0 >> 12;
        int var5 = this.field5939 * arg0 >> 12;
        int var6 = this.field5947 * arg2 >> 12;
        int var7 = this.field5942 * arg2 >> 12;
        class234.method1446(var6, super.field4486, var5, super.field4482, var4, arg1, var7, super.field4487);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIII)V", line = 52)
    public class405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5939 = arg2;
        this.field5941 = arg0;
        this.field5942 = arg3;
        this.field5947 = arg1;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(III)V", line = 68)
    public final void method3(int arg0, int arg1, int arg2) {
        ++field5938;
        if (arg2 != -1342) {
            this.method3(19, 107, 91);
        }
    }
}
