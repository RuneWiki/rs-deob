import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class462 extends class10 {

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "[I")
    private int[] field6565 = new int[this.field116];

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field6564 = 0;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    private int field6571;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    private int field6574;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "[B")
    private byte[] field6569;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "[I")
    public static int[] field6576;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "[I")
    public static int[] field6577;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)V")
    public final void method73(int arg0, int arg1, byte arg2) {
        this.field6571 += this.field6565[arg0] * arg1 >> 12;
        ++field6570;
        int var4 = 15 / ((32 - arg2) / 46);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILlf;IIII)Lfu;")
    public static final class411 method2729(int arg0, class250 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6572;
        if (arg2 < 51) {
            return null;
        } else if (!arg1.field3588 && (!class439.method2627(0, arg0) || !class439.method2627(0, arg5))) {
            return arg1.field3616 ? new class411(arg1, 34037, arg3, arg4, arg0, arg5, true) : new class411(arg1, arg3, arg4, arg0, arg5, class8.method45(23714, arg0), class8.method45(23714, arg5), true);
        } else {
            return new class411(arg1, 3553, arg3, arg4, arg0, arg5, true);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZIB)V")
    public void method2621(boolean arg0, int arg1, byte arg2) {
        if (arg0) {
            method2732((class214) null, true, false);
        }
        this.field6569[this.field6574++] = (byte) (127 + class519.method3018(arg2 >> 1, 127));
        ++field6575;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIIIF)V")
    public class462(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field116; ++var7) {
            this.field6565[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public final void method68(int arg0) {
        this.field6574 = 0;
        this.field6571 = 0;
        int var2 = -115 / ((58 - arg0) / 58);
        ++field6567;
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
    public static void method2730(int arg0) {
        field6577 = null;
        if (arg0 == 127) {
            field6576 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Z")
    public static final boolean method2731(int arg0, int arg1) {
        ++field6573;
        if (arg0 > -99) {
            return true;
        } else {
            return ~arg1 == -4 || arg1 == 4;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public final void method70(byte arg0) {
        int var2 = -79 / ((59 - arg0) / 42);
        ++field6566;
        this.field6571 = Math.abs(this.field6571);
        if (this.field6571 >= 4096) {
            this.field6571 = 4095;
        }
        this.method2621(false, this.field6574++, (byte) (this.field6571 >> 4));
        this.field6571 = 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfq;ZZ)V")
    public static final void method2732(class214 arg0, boolean arg1, boolean arg2) {
        arg0.field2812 = arg2;
        if (class522.field7253) {
            if (arg1) {
                class267.field3910[class267.field3910.length - 1].method1090(arg0, -97);
            } else {
                int var3 = class174.method1200(arg0.field2816);
                int var4 = class456.field6531[2] * arg0.method767(false) / arg0.field2806;
                int var5 = class174.method1200(arg0.field2816 - var4);
                int var6 = class174.method1200(arg0.field2816 + var4);
                if (var5 == var6) {
                    class267.field3910[var3].method1090(arg0, -110);
                } else if (var6 - var5 == 1) {
                    class267.field3910[class496.field6975 + var5].method1090(arg0, -108);
                } else {
                    class267.field3910[class267.field3910.length - 1].method1090(arg0, -114);
                }
            }
        } else {
            class758.method4164(arg0, class617.field8328);
        }
    }
}
