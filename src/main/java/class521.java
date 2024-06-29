import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class521 extends class475 {

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field7568;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    private int field7573;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    private int field7582;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    private int field7584;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Z")
    public static boolean field7578 = true;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "[S")
    public static short[] field7581 = new short[256];

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[I")
    public static int[] field7570 = new int[32];

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    private int field7572;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    private int field7575;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    private int field7579;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    private int field7583;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "[B")
    private byte[] field7577;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field7570[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method3080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7569++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        class645.method3675(96, class402.field6087[arg1], arg2, arg0 - arg4, arg0 + arg4);
        if (arg3 <= 63) {
            method3080(-99, 119, -14, 119, 43);
        }
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class402.field6087[arg1 + var6];
                int[] var10 = class402.field6087[arg1 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class645.method3675(111, var9, arg2, var12, var11);
                class645.method3675(98, var10, arg2, var12, var11);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class402.field6087[arg1 + var5];
            int[] var16 = class402.field6087[arg1 - var5];
            class645.method3675(101, var15, arg2, var14, var13);
            class645.method3675(104, var16, arg2, var14, var13);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V", line = 63)
    public void method922(int arg0, int arg1, byte arg2) {
        if (arg1 != 14482) {
            this.field7582 = 43;
        }
        field7571++;
        this.field7577[arg0] = arg2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 76)
    public final void method2806(int arg0) {
        field7585++;
        this.field7575 >>= arg0;
        this.field7584 = this.field7582;
        if (this.field7575 < 0) {
            this.field7575 = 0;
        } else if (this.field7575 > 255) {
            this.field7575 = 255;
        }
        this.method922(this.field7583++, 14482, (byte) this.field7575);
        this.field7575 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 96)
    public final void method2804(int arg0) {
        if (arg0 == 4096) {
            field7580++;
            this.field7583 = 0;
            this.field7575 = 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;)Lbda;", line = 117)
    public static final class437 method3081(byte arg0, Canvas arg1) {
        field7576++;
        try {
            Class var2 = Class.forName("as");
            if (arg0 != 25) {
                method3082(-70);
            }
            class437 var3 = (class437) var2.getDeclaredConstructor().newInstance();
            var3.method822(arg0 - 118, arg1);
            return var3;
        } catch (Throwable var5) {
            class413 var4 = new class413();
            var4.method822(-77, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 144)
    public static void method3082(int arg0) {
        if (arg0 == 0) {
            field7570 = null;
            field7581 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIIFFF)V", line = 158)
    public class521(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7568 = (int) (arg6 * 4096.0F);
        this.field7573 = (int) (arg7 * 4096.0F);
        this.field7584 = this.field7582 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V", line = 171)
    public final void method2807(byte arg0, int arg1, int arg2) {
        int var4 = -38 % ((-arg0 - 14) / 48);
        field7574++;
        if (arg1 == 0) {
            this.field7572 = this.field7568 - (arg2 >= 0 ? arg2 : -arg2);
            this.field7572 = this.field7572 * this.field7572 >> 12;
            this.field7579 = 4096;
            this.field7575 = this.field7572;
            return;
        }
        this.field7579 = this.field7573 * this.field7572 >> 12;
        if (this.field7579 < 0) {
            this.field7579 = 0;
        } else if (this.field7579 > 4096) {
            this.field7579 = 4096;
        }
        this.field7572 = this.field7568 - (arg2 >= 0 ? arg2 : -arg2);
        this.field7572 = this.field7572 * this.field7572 >> 12;
        this.field7572 = this.field7579 * this.field7572 >> 12;
        this.field7575 += this.field7584 * this.field7572 >> 12;
        this.field7584 = this.field7584 * this.field7582 >> 12;
    }
}
