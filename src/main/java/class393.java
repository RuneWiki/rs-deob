import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class393 extends class268 {

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[I")
    private int[] field5345 = new int[this.field3463];

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "[[Z")
    public static boolean[][] field5350 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Lcq;")
    public static class72 field5352 = new class72("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field5355 = 0;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field5361 = 0;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "[I")
    public static int[] field5360 = new int[13];

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "Lcq;")
    public static class72 field5359 = new class72("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    private int field5347;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    private int field5358;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "[B")
    private byte[] field5354;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "[I")
    public static int[] field5356;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIF)V", line = 8)
    public class393(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field3463; ++var7) {
            this.field5345[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 28)
    public static final void method2439(int arg0) {
        ++field5351;
        class427.field5837.method2162(false, 56);
        ++class196.field2324;
        int var1 = -80 / ((-39 - arg0) / 56);
        class427.field5837.method1593(0, -107);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 40)
    public static void method2440(int arg0) {
        field5360 = null;
        field5356 = null;
        field5352 = null;
        field5350 = null;
        if (arg0 != 56) {
            field5355 = -33;
        }
        field5359 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V", line = 54)
    public final void method887(boolean arg0) {
        ++field5353;
        this.field5347 = Math.abs(this.field5347);
        if (~this.field5347 <= -4097) {
            this.field5347 = 4095;
        }
        if (arg0) {
            this.method886((byte) 67, -44, -94);
        }
        this.method800(this.field5358++, (byte) (this.field5347 >> 4));
        this.field5347 = 0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BII)V", line = 76)
    public final void method886(byte arg0, int arg1, int arg2) {
        ++field5346;
        this.field5347 += this.field5345[arg2] * arg1 >> 12;
        if (arg0 != -38) {
            this.field5347 = -28;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 87)
    public void method800(int arg0, byte arg1) {
        ++field5349;
        this.field5354[this.field5358++] = (byte) (class191.method1183(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 95)
    public final void method885(byte arg0) {
        this.field5358 = 0;
        ++field5348;
        if (arg0 != -102) {
            method2440(45);
        }
        this.field5347 = 0;
    }
}
