import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class262 extends class567 {

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
    private int[] field3251 = new int[this.field8065];

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lgt;")
    public static class454 field3249 = new class454();

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "[I")
    public static int[] field3258 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
    private byte[] field3247;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class262(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field8065 < ~var7; ++var7) {
            this.field3251[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[B)Z", line = 21)
    public static final boolean method1573(byte arg0, byte[] arg1) {
        ++field3259;
        class244 var2 = new class244(arg1);
        if (arg0 > -65) {
            field3257 = -118;
        }
        int var3 = var2.method1423(-55);
        if (var3 != 2) {
            return false;
        } else {
            boolean var4 = var2.method1423(-78) == 1;
            if (var4) {
                class323.method1929((byte) -32, var2);
            }
            class271.method1614(var2, -1);
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V", line = 56)
    public void method1574(int arg0, int arg1, byte arg2) {
        this.field3247[this.field3252++] = (byte) (127 + (class327.method1956(255, arg2) >> 1));
        if (arg1 == 3) {
            ++field3248;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z", line = 67)
    public static final boolean method1575(int arg0, int arg1) {
        if (arg1 != 6) {
            method1573((byte) 62, (byte[]) null);
        }
        ++field3250;
        return arg0 == 3 || ~arg0 == -5 || ~arg0 == -6 || arg0 == 6;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 78)
    public final void method1576(int arg0) {
        this.field3246 = 0;
        this.field3252 = 0;
        if (arg0 != 9194) {
            this.field3251 = null;
        }
        ++field3255;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V", line = 90)
    public static final void method1577(int arg0) {
        if (arg0 == -18667) {
            class411.method2522(23);
            ++field3256;
            class381.method2343(false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 103)
    public final void method1578(int arg0) {
        this.field3246 = Math.abs(this.field3246);
        ++field3254;
        if (this.field3246 >= 4096) {
            this.field3246 = 4095;
        }
        this.method1574(this.field3252++, 3, (byte) (this.field3246 >> 4));
        this.field3246 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V", line = 117)
    public final void method1579(int arg0, int arg1, int arg2) {
        ++field3253;
        if (arg1 != 4095) {
            field3258 = null;
        }
        this.field3246 += this.field3251[arg2] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 129)
    public static void method1580(int arg0) {
        if (arg0 != -1498078175) {
            field3257 = 65;
        }
        field3249 = null;
        field3258 = null;
    }
}
