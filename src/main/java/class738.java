import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class738 extends class567 {

    @OriginalMember(owner = "client!oha", name = "B", descriptor = "I")
    private int field10319;

    @OriginalMember(owner = "client!oha", name = "C", descriptor = "I")
    private int field10320;

    @OriginalMember(owner = "client!oha", name = "A", descriptor = "I")
    private int field10318;

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "I")
    private int field10310;

    @OriginalMember(owner = "client!oha", name = "v", descriptor = "I")
    public static int field10313 = 0;

    @OriginalMember(owner = "client!oha", name = "t", descriptor = "I")
    public static int field10311 = 0;

    @OriginalMember(owner = "client!oha", name = "x", descriptor = "Ljt;")
    public static class104 field10315 = new class104("", 13);

    @OriginalMember(owner = "client!oha", name = "u", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!oha", name = "w", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!oha", name = "y", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "I")
    private int field10317;

    @OriginalMember(owner = "client!oha", name = "D", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
    private int field10322;

    @OriginalMember(owner = "client!oha", name = "G", descriptor = "I")
    private int field10324;

    @OriginalMember(owner = "client!oha", name = "H", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!oha", name = "I", descriptor = "I")
    private int field10326;

    @OriginalMember(owner = "client!oha", name = "F", descriptor = "[B")
    private byte[] field10323;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BIB)V", line = 5)
    public void method1394(byte arg0, int arg1, byte arg2) {
        field10321++;
        if (arg0 != 1) {
            this.method1576(-37);
        }
        this.field10323[arg1] = arg2;
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V", line = 19)
    public final void method1576(int arg0) {
        this.field10317 = 0;
        field10312++;
        this.field10324 = 0;
        if (arg0 != 9194) {
            method4114((byte) -69);
        }
    }

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)V", line = 38)
    public final void method1578(int arg0) {
        this.field10324 >>= 0x4;
        field10325++;
        this.field10310 = this.field10318;
        if (this.field10324 < 0) {
            this.field10324 = 0;
        } else if (this.field10324 > 255) {
            this.field10324 = 255;
        }
        this.method1394((byte) 1, this.field10317++, (byte) this.field10324);
        this.field10324 = arg0;
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(IIIIIFFF)V", line = 56)
    public class738(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field10319 = (int) (arg7 * 4096.0F);
        this.field10320 = (int) (arg6 * 4096.0F);
        this.field10310 = this.field10318 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V", line = 80)
    public static void method4114(byte arg0) {
        field10315 = null;
        int var1 = 62 / ((arg0 - 22) / 61);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V", line = 92)
    public final void method1579(int arg0, int arg1, int arg2) {
        field10314++;
        if (arg1 != 4095) {
            return;
        }
        if (arg2 == 0) {
            this.field10326 = this.field10320 - (arg0 >= 0 ? arg0 : -arg0);
            this.field10326 = this.field10326 * this.field10326 >> 12;
            this.field10322 = 4096;
            this.field10324 = this.field10326;
            return;
        }
        this.field10322 = this.field10326 * this.field10319 >> 12;
        if (this.field10322 < 0) {
            this.field10322 = 0;
        } else if (this.field10322 > 4096) {
            this.field10322 = 4096;
        }
        this.field10326 = this.field10320 - (arg0 >= 0 ? arg0 : -arg0);
        this.field10326 = this.field10326 * this.field10326 >> 12;
        this.field10326 = this.field10326 * this.field10322 >> 12;
        this.field10324 += this.field10326 * this.field10310 >> 12;
        this.field10310 = this.field10318 * this.field10310 >> 12;
    }
}
