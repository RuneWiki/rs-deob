import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class402 extends class46 {

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    private int field5976;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
    private int field5980;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    private int field5969;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "Ltg;")
    public static class605 field5970 = new class605();

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "Ltm;")
    public static class334 field5979 = new class334(84, 10);

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "Ltm;")
    public static class334 field5981 = new class334(9, -2);

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "Ltm;")
    public static class334 field5982 = new class334(66, 6);

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    private int field5971;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    private int field5973;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    private int field5978;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "[B")
    private byte[] field5967;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 5)
    public final void method474(int arg0) {
        this.field5971 >>= 0x4;
        if (arg0 != 4095) {
            this.field5978 = -34;
        }
        this.field5969 = this.field5980;
        field5977++;
        if (this.field5971 < 0) {
            this.field5971 = 0;
        } else if (this.field5971 > 255) {
            this.field5971 = 255;
        }
        this.method2228(this.field5978++, false, (byte) this.field5971);
        this.field5971 = 0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZB)V", line = 27)
    public void method2228(int arg0, boolean arg1, byte arg2) {
        field5968++;
        this.field5967[arg0] = arg2;
        if (arg1) {
            method2490((byte) 29);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 38)
    public final void method468(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field5975 = this.field5974 - (arg1 >= 0 ? arg1 : -arg1);
            this.field5975 = this.field5975 * this.field5975 >> 12;
            this.field5973 = 4096;
            this.field5971 = this.field5975;
        } else {
            this.field5973 = this.field5976 * this.field5975 >> 12;
            this.field5975 = this.field5974 - (arg1 >= 0 ? arg1 : -arg1);
            if (this.field5973 < 0) {
                this.field5973 = 0;
            } else if (this.field5973 > 4096) {
                this.field5973 = 4096;
            }
            this.field5975 = this.field5975 * this.field5975 >> 12;
            this.field5975 = this.field5975 * this.field5973 >> 12;
            this.field5971 += this.field5975 * this.field5969 >> 12;
            this.field5969 = this.field5980 * this.field5969 >> 12;
        }
        if (arg2 != 4095) {
            this.method2228(81, true, (byte) -54);
        }
        field5966++;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 88)
    public final void method473(int arg0) {
        field5972++;
        this.field5978 = 0;
        if (arg0 != 1861690668) {
            this.method474(-77);
        }
        this.field5971 = 0;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIFFF)V", line = 101)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5976 = (int) (arg7 * 4096.0F);
        this.field5974 = (int) (arg6 * 4096.0F);
        this.field5969 = this.field5980 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 112)
    public static void method2490(byte arg0) {
        field5981 = null;
        field5982 = null;
        field5970 = null;
        field5979 = null;
        if (arg0 != -40) {
            field5979 = null;
        }
    }
}
