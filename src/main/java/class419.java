import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class419 extends class237 {

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "[I")
    private int[] field5874 = new int[this.field3298];

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "[[B")
    public static byte[][] field5868 = new byte[250][];

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field5873 = 0;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    private int field5876;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    private int field5879;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "[B")
    private byte[] field5869;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 6)
    public static void method2587(int arg0) {
        if (arg0 != 0) {
            method2587(-49);
        }
        field5868 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V", line = 19)
    public void method1585(int arg0, byte arg1) {
        ++field5881;
        this.field5869[this.field5876++] = (byte) (127 + (class323.method2059(255, arg1) >> 1));
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIF)V", line = 31)
    public class419(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field3298 > var7; ++var7) {
            this.field5874[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V", line = 48)
    public static final void method2588(int arg0, int arg1) {
        class410 var2 = class243.field3362;
        synchronized (class243.field3362) {
            class243.field3362.method2534(0, arg1);
        }
        ++field5880;
        if (arg0 != -8298) {
            method2589(3, 26, -57, -75, -100, 111);
        }
        class410 var3 = class373.field5245;
        synchronized (class373.field5245) {
            class373.field5245.method2534(0, arg1);
        }
        class410 var4 = class418.field5861;
        synchronized (class418.field5861) {
            class418.field5861.method2534(0, arg1);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI)V", line = 73)
    public final void method1580(int arg0, byte arg1, int arg2) {
        this.field5879 += this.field5874[arg0] * arg2 >> 12;
        ++field5872;
        if (arg1 != 57) {
            field5870 = 10;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIII)V", line = 84)
    public static final void method2589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5877;
        if (arg3 >= 30) {
            if (class433.field6144 <= arg0 && ~arg5 >= ~class69.field1047 && ~class39.field595 >= ~arg4 && ~class134.field1917 <= ~arg1) {
                class283.method1789(arg0, 1010, arg4, arg1, arg5, arg2);
            } else {
                class223.method1524(arg5, arg2, 105, arg4, arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(II)V", line = 103)
    public static final void method2590(int arg0, int arg1) {
        ++field5878;
        class410 var2 = class263.field3531;
        synchronized (class263.field3531) {
            class263.field3531.method2534(0, arg1);
            if (arg0 < 48) {
                method2590(46, -116);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V", line = 116)
    public final void method1583(byte arg0) {
        if (arg0 != 67) {
            method2588(-30, -12);
        }
        this.field5876 = 0;
        this.field5879 = 0;
        ++field5875;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 134)
    public final void method1577(byte arg0) {
        this.field5879 = Math.abs(this.field5879);
        ++field5871;
        if (~this.field5879 <= -4097) {
            this.field5879 = 4095;
        }
        this.method1585(this.field5876++, (byte) (this.field5879 >> 4));
        this.field5879 = 0;
        if (arg0 != 94) {
            this.field5869 = null;
        }
    }
}
