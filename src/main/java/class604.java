import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class604 extends class573 {

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "[I")
    private int[] field8541 = new int[this.field8108];

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field8548 = new String[100];

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    private int field8540;

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
    private int field8543;

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "Lvd;")
    public static class39 field8545;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "[B")
    private byte[] field8539;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BII)V", line = 4)
    public void method1641(byte arg0, int arg1, int arg2) {
        if (arg2 == 9170) {
            this.field8539[this.field8543++] = (byte) (class493.method2943(arg0 >> 1, 127) + 127);
            ++field8544;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BII)V", line = 18)
    public final void method2062(byte arg0, int arg1, int arg2) {
        if (arg0 <= 124) {
            this.field8539 = null;
        }
        ++field8538;
        this.field8540 += this.field8541[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V", line = 29)
    public static void method3511(int arg0) {
        field8548 = null;
        if (arg0 <= 100) {
            method3511(-59);
        }
        field8545 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V", line = 44)
    public final void method2060(byte arg0) {
        this.field8540 = Math.abs(this.field8540);
        ++field8547;
        if (~this.field8540 <= -4097) {
            this.field8540 = 4095;
        }
        if (arg0 > 43) {
            this.method1641((byte) (this.field8540 >> 4), this.field8543++, 9170);
            this.field8540 = 0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V", line = 66)
    public final void method2059(byte arg0) {
        this.field8540 = 0;
        this.field8543 = 0;
        ++field8542;
        if (arg0 > -7) {
            this.method2062((byte) 68, 77, 90);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(IIIIIF)V", line = 78)
    public class604(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field8108 < ~var7; ++var7) {
            this.field8541[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }
}
