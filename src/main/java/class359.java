import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class359 extends class558 {

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    private int field5004;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    private int field5010;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    private int field5007;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    private int field5012;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "[B")
    private byte[] field5014;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2229(int arg0, byte arg1, int arg2) {
        if (arg1 >= -67) {
            return false;
        } else {
            field5003++;
            return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class359(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5017 = (int) (arg7 * 4096.0F);
        this.field5009 = (int) (arg6 * 4096.0F);
        this.field5010 = this.field5004 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)Z")
    public static final boolean method2230(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field5013++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BBI)V")
    public void method268(byte arg0, byte arg1, int arg2) {
        if (arg1 > -71) {
            this.field5017 = 20;
        }
        field5006++;
        this.field5014[arg2] = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
    public final void method2181(int arg0) {
        this.field5008 = 0;
        this.field5007 = 0;
        field5016++;
        if (arg0 < 77) {
            method2230(74, -54, -28);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
    public final void method2179(int arg0, int arg1, int arg2) {
        field5005++;
        if (arg1 < 77) {
            this.method2181(113);
        }
        if (arg2 == 0) {
            this.field5015 = this.field5009 - (arg0 >= 0 ? arg0 : -arg0);
            this.field5012 = 4096;
            this.field5015 = this.field5015 * this.field5015 >> 12;
            this.field5008 = this.field5015;
            return;
        }
        this.field5012 = this.field5017 * this.field5015 >> 12;
        if (this.field5012 < 0) {
            this.field5012 = 0;
        } else if (this.field5012 > 4096) {
            this.field5012 = 4096;
        }
        this.field5015 = this.field5009 - (arg0 >= 0 ? arg0 : -arg0);
        this.field5015 = this.field5015 * this.field5015 >> 12;
        this.field5015 = this.field5015 * this.field5012 >> 12;
        this.field5008 += this.field5015 * this.field5010 >> 12;
        this.field5010 = this.field5010 * this.field5004 >> 12;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
    public final void method2177(boolean arg0) {
        this.field5010 = this.field5004;
        this.field5008 >>= 0x4;
        field5011++;
        if (arg0) {
            return;
        }
        if (this.field5008 < 0) {
            this.field5008 = 0;
        } else if (this.field5008 > 255) {
            this.field5008 = 255;
        }
        this.method268((byte) this.field5008, (byte) -100, this.field5007++);
        this.field5008 = 0;
    }
}
