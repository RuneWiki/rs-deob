import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class441 extends class359 {

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    private int field6383;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    private int field6392;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    private int field6394;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    private int field6395;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field6378 = null;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "J")
    public static long field6381 = 0L;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Ljava/lang/String;")
    public static String field6390 = null;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "Z")
    public static boolean field6397 = false;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field6398 = 1;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    private int field6382;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    private int field6384;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    private int field6385;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    private int field6393;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lqj;")
    public static class296 field6379;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "[B")
    private byte[] field6389;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "[I")
    public static int[] field6396;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public final void method571(int arg0) {
        if (arg0 != 5215) {
            return;
        }
        this.field6382 >>= 0x4;
        field6388++;
        this.field6395 = this.field6394;
        if (this.field6382 < 0) {
            this.field6382 = 0;
        } else if (this.field6382 > 255) {
            this.field6382 = 255;
        }
        this.method604(this.field6384++, (byte) this.field6382);
        this.field6382 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)I")
    public static final int method2762(int arg0, int arg1, int arg2) {
        field6387++;
        return arg1 == arg2 || arg2 == 3 ? class285.field3924[arg0 & 0x3] : class333.field4503[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public final void method570(int arg0) {
        if (arg0 == -2) {
            this.field6384 = 0;
            this.field6382 = 0;
            field6380++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
    public void method604(int arg0, byte arg1) {
        field6386++;
        this.field6389[arg0] = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static void method2763(byte arg0) {
        field6390 = null;
        field6396 = null;
        if (arg0 == -34) {
            field6378 = null;
            field6379 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
    public final void method569(byte arg0, int arg1, int arg2) {
        field6391++;
        if (arg1 == 0) {
            this.field6393 = this.field6383 - (arg2 >= 0 ? arg2 : -arg2);
            this.field6393 = this.field6393 * this.field6393 >> 12;
            this.field6385 = 4096;
            this.field6382 = this.field6393;
        } else {
            this.field6385 = this.field6393 * this.field6392 >> 12;
            this.field6393 = this.field6383 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field6385 < 0) {
                this.field6385 = 0;
            } else if (this.field6385 > 4096) {
                this.field6385 = 4096;
            }
            this.field6393 = this.field6393 * this.field6393 >> 12;
            this.field6393 = this.field6393 * this.field6385 >> 12;
            this.field6382 += this.field6395 * this.field6393 >> 12;
            this.field6395 = this.field6395 * this.field6394 >> 12;
        }
        int var4 = -75 / ((-arg0 - 84) / 38);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6383 = (int) (arg6 * 4096.0F);
        this.field6392 = (int) (arg7 * 4096.0F);
        this.field6395 = this.field6394 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
