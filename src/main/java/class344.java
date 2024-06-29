import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class344 extends class56 {

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    private int field4972;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private int field4975;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    private int field4976;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    private int field4981;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[B")
    private byte[] field4970;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 6)
    public final void method338(int arg0) {
        this.field4967 >>= 0x4;
        this.field4968 = this.field4972;
        field4980++;
        if (this.field4967 < 0) {
            this.field4967 = 0;
        } else if (this.field4967 > 255) {
            this.field4967 = 255;
        }
        this.method2106(4096, this.field4975++, (byte) this.field4967);
        this.field4967 = 0;
        if (arg0 > -6) {
            this.method2106(-118, -52, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIFFF)V", line = 27)
    public class344(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4971 = (int) (arg7 * 4096.0F);
        this.field4979 = (int) (arg6 * 4096.0F);
        this.field4968 = this.field4972 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 38)
    public final void method344(byte arg0) {
        this.field4967 = 0;
        field4978++;
        int var2 = 1 / ((-arg0 - 77) / 46);
        this.field4975 = 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIB)V", line = 50)
    public void method2106(int arg0, int arg1, byte arg2) {
        if (arg0 == 4096) {
            field4977++;
            this.field4970[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB)V", line = 67)
    public final void method340(int arg0, int arg1, byte arg2) {
        field4974++;
        if (arg2 != 47) {
            this.field4972 = 4;
        }
        if (arg0 == 0) {
            this.field4976 = this.field4979 - (arg1 >= 0 ? arg1 : -arg1);
            this.field4976 = this.field4976 * this.field4976 >> 12;
            this.field4981 = 4096;
            this.field4967 = this.field4976;
            return;
        }
        this.field4981 = this.field4976 * this.field4971 >> 12;
        if (this.field4981 < 0) {
            this.field4981 = 0;
        } else if (this.field4981 > 4096) {
            this.field4981 = 4096;
        }
        this.field4976 = this.field4979 - (arg1 >= 0 ? arg1 : -arg1);
        this.field4976 = this.field4976 * this.field4976 >> 12;
        this.field4976 = this.field4981 * this.field4976 >> 12;
        this.field4967 += this.field4976 * this.field4968 >> 12;
        this.field4968 = this.field4972 * this.field4968 >> 12;
    }
}
