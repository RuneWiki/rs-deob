import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class289 extends class69 {

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private int field4050;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "[B")
    private byte[] field4054;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
    public void method1893(int arg0, byte arg1) {
        this.field4054[arg0] = arg1;
        field4055++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZI)V")
    public final void method396(int arg0, boolean arg1, int arg2) {
        field4057++;
        if (arg1) {
            this.field4050 = 56;
        }
        if (arg0 == 0) {
            this.field4050 = this.field4051 - (arg2 < 0 ? -arg2 : arg2);
            this.field4050 = this.field4050 * this.field4050 >> 12;
            this.field4061 = 4096;
            this.field4053 = this.field4050;
            return;
        }
        this.field4061 = this.field4063 * this.field4050 >> 12;
        this.field4050 = this.field4051 - (arg2 >= 0 ? arg2 : -arg2);
        if (this.field4061 < 0) {
            this.field4061 = 0;
        } else if (this.field4061 > 4096) {
            this.field4061 = 4096;
        }
        this.field4050 = this.field4050 * this.field4050 >> 12;
        this.field4050 = this.field4061 * this.field4050 >> 12;
        this.field4053 += this.field4052 * this.field4050 >> 12;
        this.field4052 = this.field4062 * this.field4052 >> 12;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method392(int arg0) {
        this.field4060 = 0;
        if (arg0 <= 84) {
            this.field4051 = 49;
        }
        field4058++;
        this.field4053 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public final void method394(byte arg0) {
        field4056++;
        this.field4052 = this.field4062;
        this.field4053 >>= 0x4;
        if (this.field4053 < 0) {
            this.field4053 = 0;
        } else if (this.field4053 > 255) {
            this.field4053 = 255;
        }
        this.method1893(this.field4060++, (byte) this.field4053);
        int var2 = 113 / ((arg0 - 56) / 61);
        this.field4053 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1894(String arg0, byte arg1) {
        field4059++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg1 > -54) {
            method1894((String) null, (byte) 121);
        }
        while (var5 < var2) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4063 = (int) (arg7 * 4096.0F);
        this.field4051 = (int) (arg6 * 4096.0F);
        this.field4052 = this.field4062 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
