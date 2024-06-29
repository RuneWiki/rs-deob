import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class533 {

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    private int field7202;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    private int field7208;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    private int field7198;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    private int field7197;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    private int field7215;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    private int field7207;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    private int field7213;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private int field7196;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    private int field7206;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    private int field7210;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field7204 = 0;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field7200 = 100;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "[I")
    public static int[] field7203 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field7214 = 0;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Llj;I)V")
    public static final void method3023(class565 arg0, int arg1) {
        if (class296.field4062 == null) {
            class610 var2 = new class610();
            byte[] var3 = var2.method3420(128, 128, 16, arg1 + 14236);
            class296.field4062 = class697.method3912(var3, 0, false);
        }
        field7211++;
        if (class148.field2200 == null) {
            class335 var4 = new class335();
            byte[] var5 = var4.method1971(128, 63, 16, 128);
            class148.field2200 = class697.method3912(var5, 0, false);
        }
        if (arg1 != -14363) {
            return;
        }
        class576 var6 = arg0.field7829;
        if (var6.method3292(-26176) && class220.field3081 == null) {
            byte[] var7 = class527.method3001(128, 16, 4.0F, 16.0F, 0.6F, 8, (byte) 120, 128, new class564(419684), 4.0F, 0.5F);
            class220.field3081 = class697.method3912(var7, 0, false);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BIII)Z")
    public final boolean method3024(byte arg0, int arg1, int arg2, int arg3) {
        field7201++;
        if (arg1 < this.field7215 || arg1 > this.field7206) {
            return false;
        }
        int var5 = 117 / ((arg0 - 24) / 60);
        if (this.field7213 > arg3 || arg3 > this.field7196) {
            return false;
        } else if (this.field7207 <= arg2 && arg2 <= this.field7210) {
            int var6 = arg1 - this.field7198;
            int var7 = arg2 - this.field7208;
            return (var6 * var6 + var7 * var7) < this.field7202;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBIIIIIIII)V")
    public final void method3025(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field7202 = arg8 * arg8;
        this.field7208 = arg1;
        field7209++;
        if (arg2 != -15) {
            method3023(null, -20);
        }
        this.field7197 = arg0;
        this.field7198 = arg9;
        this.field7213 = this.field7197 + arg10;
        this.field7196 = this.field7197 + arg5;
        this.field7207 = this.field7208 + arg4;
        this.field7215 = this.field7198 + arg3;
        this.field7206 = this.field7198 + arg7;
        this.field7210 = this.field7208 + arg6;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method3026(int arg0) {
        if (arg0 <= 62) {
            field7214 = 110;
        }
        field7203 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3027(int arg0, int arg1, byte arg2) {
        int var3 = -101 / ((arg2 + 68) / 35);
        field7205++;
        return (arg0 & 0x70000) != 0 | class577.method3293((byte) 124, arg0, arg1) || class607.method3415(arg1, 29965, arg0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
    public static final void method3028(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7200 = arg1;
        class469.field6466 = arg2;
        int var5 = 20 / ((6 - arg4) / 41);
        field7199++;
        class529.field7169 = arg3;
        class128.field1831 = arg0;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7202 = arg3 * arg3;
        this.field7208 = arg2;
        this.field7198 = arg0;
        this.field7197 = arg1;
        this.field7215 = this.field7198 + arg4;
        this.field7207 = this.field7208 + arg8;
        this.field7213 = this.field7197 + arg6;
        this.field7196 = this.field7197 + arg7;
        this.field7206 = this.field7198 + arg5;
        this.field7210 = this.field7208 + arg9;
    }
}
