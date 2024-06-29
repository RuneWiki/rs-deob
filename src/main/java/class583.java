import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class583 extends class395 {

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    private int field7373;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    private int field7380;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    private int field7384;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    private int field7383;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Lrn;")
    public static class633 field7371 = new class633(21, -1);

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "Lgh;")
    public static class54 field7385 = new class54(10, 2, 2, 0);

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    private int field7370;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    private int field7372;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    private int field7374;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    private int field7378;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "[B")
    private byte[] field7379;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
    public final void method2285(int arg0) {
        field7376++;
        this.field7378 = 0;
        this.field7370 = 0;
        if (arg0 != -4) {
            method3120(3);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljha;I)V")
    public static final void method3119(class33 arg0, int arg1) {
        field7375++;
        int var2 = -58 % ((14 - arg1) / 42);
        class53 var3 = (class53) class548.field6848.method2616((long) arg0.field4737, (byte) -125);
        if (var3 == null) {
            class663.method3612(0, arg0.field4758[0], arg0.field4767[0], arg0, arg0.field2895, null, 1588241065, null);
        } else {
            var3.method332((byte) 110);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)V")
    public void method529(int arg0, byte arg1, int arg2) {
        field7382++;
        this.field7379[arg0] = arg1;
        int var4 = -92 % ((arg2 - 54) / 63);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZI)V")
    public final void method2293(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2286(-88);
        }
        if (arg0 == 0) {
            this.field7374 = this.field7373 - (arg2 >= 0 ? arg2 : -arg2);
            this.field7372 = 4096;
            this.field7374 = this.field7374 * this.field7374 >> 12;
            this.field7370 = this.field7374;
        } else {
            this.field7372 = this.field7380 * this.field7374 >> 12;
            this.field7374 = this.field7373 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field7372 < 0) {
                this.field7372 = 0;
            } else if (this.field7372 > 4096) {
                this.field7372 = 4096;
            }
            this.field7374 = this.field7374 * this.field7374 >> 12;
            this.field7374 = this.field7374 * this.field7372 >> 12;
            this.field7370 += this.field7383 * this.field7374 >> 12;
            this.field7383 = this.field7384 * this.field7383 >> 12;
        }
        field7377++;
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)V")
    public static void method3120(int arg0) {
        field7385 = null;
        if (arg0 != -256) {
            method3119(null, -114);
        }
        field7371 = null;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
    public final void method2286(int arg0) {
        field7381++;
        this.field7383 = this.field7384;
        this.field7370 >>= 0x4;
        if (this.field7370 < 0) {
            this.field7370 = 0;
        } else if (this.field7370 > 255) {
            this.field7370 = 255;
        }
        if (arg0 != 2) {
            this.field7384 = -126;
        }
        this.method529(this.field7378++, (byte) this.field7370, -21);
        this.field7370 = 0;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7373 = (int) (arg6 * 4096.0F);
        this.field7380 = (int) (arg7 * 4096.0F);
        this.field7383 = this.field7384 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
