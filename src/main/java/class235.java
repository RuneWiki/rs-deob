import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class235 extends class350 {

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "[I")
    private int[] field3540 = new int[this.field5067];

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "[I")
    public static int[] field3536 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "[I")
    public static int[] field3545 = new int[50];

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lci;")
    public static class287 field3533;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[B")
    private byte[] field3534;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public final void method1498(boolean arg0) {
        if (arg0) {
            ++field3543;
            this.field3541 = 0;
            this.field3538 = 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V")
    public void method173(int arg0, byte arg1) {
        ++field3539;
        this.field3534[this.field3538++] = (byte) ((class367.method2256(arg1, 255) >> 1) + 127);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1499(byte arg0) {
        if (arg0 > -94) {
            method1499((byte) -22);
        }
        field3545 = null;
        field3536 = null;
        field3533 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
    public final void method1500(byte arg0, int arg1, int arg2) {
        ++field3544;
        if (arg0 == -62) {
            this.field3541 += this.field3540[arg1] * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILdt;B)V")
    public static final void method1501(int arg0, int arg1, class145 arg2, byte arg3) {
        ++field3537;
        class171 var4 = arg2.method911(class141.field1878, (byte) -120);
        if (arg3 == 65) {
            if (var4 != null) {
                class141.field1878.method617(arg0, arg1, arg2.field2010 + arg0, arg1 - -arg2.field2021);
                if (class54.field729 < 3) {
                    class214.field3217.method1080((float) arg2.field2010 / 2.0F + (float) arg0, (float) arg2.field2021 / 2.0F + (float) arg1, 4096, (16383 & (int) (-class157.field2346)) << 2, var4, arg0, arg1);
                } else {
                    class141.field1878.method665(-16777216, var4, arg0, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V")
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field5067 < ~var7; ++var7) {
            this.field3540[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public final void method1502(int arg0) {
        ++field3535;
        this.field3541 = Math.abs(this.field3541);
        if (this.field3541 >= 4096) {
            this.field3541 = 4095;
        }
        this.method173(this.field3538++, (byte) (this.field3541 >> 4));
        if (arg0 > -15) {
            method1499((byte) -43);
        }
        this.field3541 = 0;
    }
}
