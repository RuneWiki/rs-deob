import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class533 extends class89 {

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    private int field7327;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    private int field7326;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    private int field7320;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    private int field7330;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Led;")
    public static class116 field7324 = new class116();

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field7323;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    private int field7325;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    private int field7328;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    private int field7333;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lwo;")
    public static class445 field7329;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[B")
    private byte[] field7331;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        field7332++;
        this.field7328 = 0;
        if (!arg0) {
            this.field7325 = 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static void method2995(boolean arg0) {
        if (!arg0) {
            field7329 = null;
        }
        field7324 = null;
        field7329 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
    public void method761(int arg0, int arg1, byte arg2) {
        field7319++;
        if (arg1 >= -116) {
            this.method485(14);
        }
        this.field7331[arg0] = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method485(int arg0) {
        field7321++;
        this.field7330 = this.field7320;
        this.field7325 >>= 0x4;
        if (arg0 < 91) {
            this.field7320 = 33;
        }
        if (this.field7325 < 0) {
            this.field7325 = 0;
        } else if (this.field7325 > 255) {
            this.field7325 = 255;
        }
        this.method761(this.field7328++, -124, (byte) this.field7325);
        this.field7325 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public final void method483(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field7323 = this.field7326 - (arg0 >= 0 ? arg0 : -arg0);
            this.field7333 = 4096;
            this.field7323 = this.field7323 * this.field7323 >> 12;
            this.field7325 = this.field7323;
        } else {
            this.field7333 = this.field7327 * this.field7323 >> 12;
            this.field7323 = this.field7326 - (arg0 < 0 ? -arg0 : arg0);
            if (this.field7333 < 0) {
                this.field7333 = 0;
            } else if (this.field7333 > 4096) {
                this.field7333 = 4096;
            }
            this.field7323 = this.field7323 * this.field7323 >> 12;
            this.field7323 = this.field7333 * this.field7323 >> 12;
            this.field7325 += this.field7330 * this.field7323 >> 12;
            this.field7330 = this.field7330 * this.field7320 >> 12;
        }
        if (arg2 != 26676) {
            this.field7323 = 43;
        }
        field7322++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class533(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7327 = (int) (arg7 * 4096.0F);
        this.field7326 = (int) (arg6 * 4096.0F);
        this.field7330 = this.field7320 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
