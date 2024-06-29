import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class419 extends class182 {

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "[I")
    private int[] field5816 = new int[this.field2637];

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "I")
    private int field5814;

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
    private int field5815;

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "J")
    public static long field5818;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "[B")
    private byte[] field5810;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "[[Z")
    public static boolean[][] field5809;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)V")
    public final void method1220(int arg0) {
        ++field5817;
        this.field5815 = 0;
        this.field5814 = 0;
        if (arg0 >= -40) {
            this.method2539(127, -13, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "(I)V")
    public static void method2537(int arg0) {
        if (arg0 <= 15) {
            method2538(10, 118);
        }
        field5809 = null;
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(IIIIIF)V")
    public class419(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field2637; ++var7) {
            this.field5816[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
    public final void method1215(int arg0) {
        this.field5815 = Math.abs(this.field5815);
        ++field5811;
        if (~this.field5815 <= -4097) {
            this.field5815 = 4095;
        }
        this.method2539(255, this.field5814++, (byte) (this.field5815 >> 4));
        int var2 = 17 / ((54 - arg0) / 38);
        this.field5815 = 0;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)I")
    public static final int method2538(int arg0, int arg1) {
        return class111.field1590 != null ? class111.field1590[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V")
    public final void method1214(int arg0, int arg1, int arg2) {
        if (arg2 <= 109) {
            this.field5814 = 94;
        }
        this.field5815 += this.field5816[arg1] * arg0 >> 12;
        ++field5812;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIB)V")
    public void method2539(int arg0, int arg1, byte arg2) {
        ++field5808;
        this.field5810[this.field5814++] = (byte) (127 + (class136.method878(arg2, arg0) >> 1));
    }

    @OriginalMember(owner = "client!gia", name = "f", descriptor = "(I)V")
    public static final void method2540(int arg0) {
        ++field5813;
        class615.method3607((byte) -2);
        class350.method1993(26779);
        if (arg0 != 31378) {
            method2540(45);
        }
    }
}
