import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class416 extends class679 {

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[I")
    private int[] field5349 = new int[this.field9356];

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[I")
    public static int[] field5342 = new int[32];

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "J")
    public static long field5348 = -1L;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    private int field5343;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    private int field5351;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "Llf;")
    public static class507 field5353;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[B")
    private byte[] field5347;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
    public static void method2342(byte arg0) {
        field5353 = null;
        field5342 = null;
        if (arg0 < 114) {
            field5348 = 13L;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public final void method2343(byte arg0) {
        int var2 = 108 / ((arg0 - 14) / 40);
        ++field5344;
        this.field5343 = 0;
        this.field5351 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V")
    public final void method2344(int arg0, int arg1, boolean arg2) {
        this.field5351 += this.field5349[arg1] * arg0 >> 12;
        if (arg2) {
            ++field5350;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public final void method2345(int arg0) {
        ++field5346;
        this.field5351 = Math.abs(this.field5351);
        if (arg0 != -1810733887) {
            this.field5343 = -47;
        }
        if (~this.field5351 <= -4097) {
            this.field5351 = 4095;
        }
        this.method303(this.field5343++, (byte) (this.field5351 >> 4), true);
        this.field5351 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BF)F")
    public static final float method2346(byte arg0, float arg1) {
        ++field5341;
        if (arg0 != -117) {
            field5353 = null;
        }
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F + -15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBZ)V")
    public void method303(int arg0, byte arg1, boolean arg2) {
        ++field5352;
        if (!arg2) {
            this.method303(112, (byte) 96, true);
        }
        this.field5347[this.field5343++] = (byte) (class597.method3238(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZI)Lpe;")
    public static final class615 method2347(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != 4096) {
            field5353 = null;
        }
        ++field5345;
        class264 var5 = null;
        if (class514.field6737 != null) {
            var5 = new class264(arg2, class514.field6737, class388.field4970[arg2], 1000000);
        }
        class358.field4642[arg2] = class618.field8349.method1989((byte) 68, arg2, class34.field509, var5);
        if (arg3) {
            class358.field4642[arg2].method2568((byte) -41);
        }
        return new class615(class358.field4642[arg2], arg1, arg0);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIF)V")
    public class416(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field9356; ++var7) {
            this.field5349[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field5342[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
