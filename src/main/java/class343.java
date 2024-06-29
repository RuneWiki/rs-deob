import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class343 extends class271 {

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
    private int[] field4601 = new int[this.field3572];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lea;")
    public static class547 field4607 = new class547(107, 6);

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lda;")
    public static class61 field4609;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "[B")
    private byte[] field4605;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "[I")
    public static int[] field4611;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIB)V")
    public void method2017(byte arg0, int arg1, byte arg2) {
        ++field4604;
        this.field4605[this.field4602++] = (byte) (class321.method1919(arg0 >> 1, 127) + 127);
        if (arg2 != 42) {
            field4607 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static void method2018(int arg0) {
        field4609 = null;
        field4611 = null;
        if (arg0 != 13432) {
            method2018(-53);
        }
        field4607 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method1617(int arg0) {
        ++field4608;
        this.field4602 = 0;
        if (arg0 != 751943489) {
            this.method1617(35);
        }
        this.field4606 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public final void method1619(int arg0, int arg1, int arg2) {
        this.field4606 += this.field4601[arg0] * arg1 >> 12;
        if (arg2 == 255) {
            ++field4603;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final void method1621(int arg0) {
        ++field4610;
        this.field4606 = Math.abs(this.field4606);
        if (~this.field4606 <= -4097) {
            this.field4606 = 4095;
        }
        this.method2017((byte) (this.field4606 >> 4), this.field4602++, (byte) 42);
        this.field4606 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIF)V")
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field3572; ++var7) {
            this.field4601[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }
}
