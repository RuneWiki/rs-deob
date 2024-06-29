import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class458 extends class330 {

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    private int field6406 = -1;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    private int field6402;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "I")
    private int field6411;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "[I")
    private int[] field6407;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)I")
    public static final int method2754(byte arg0) {
        ++field6404;
        if (arg0 > -48) {
            field6399 = 17;
        }
        class39 var1 = class129.field1672;
        synchronized (class129.field1672) {
            return class129.field1672.method318(-32192);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public final void method766(byte arg0) {
        ++field6408;
        super.method766((byte) 105);
        this.field6407 = null;
        if (arg0 < 27) {
            method2757(-74, -18, -45, -50, -90, (byte[][][]) null, (class473) null, 44, 77, 85, -90, -105, -13);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIIIIIZ)V")
    public static final void method2755(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (~arg3 < ~arg4) {
            int var7 = (arg3 + arg4) / 2;
            int var8 = arg4;
            class138 var9 = class254.field3765[var7];
            class254.field3765[var7] = class254.field3765[arg3];
            class254.field3765[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; ++var10) {
                if (class697.method3935(arg1, class254.field3765[var10], arg2, arg0, 0, var9, arg6) <= 0) {
                    class138 var11 = class254.field3765[var10];
                    class254.field3765[var10] = class254.field3765[var8];
                    class254.field3765[var8++] = var11;
                }
            }
            class254.field3765[arg3] = class254.field3765[var8];
            class254.field3765[var8] = var9;
            method2755(arg0, arg1, arg2, var8 - 1, arg4, arg5, arg6);
            method2755(arg0, arg1, arg2, arg3, var8 - -1, 1, arg6);
        }
        if (arg5 != 1) {
            method2756((byte) -127, -54, 88);
        }
        ++field6401;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZII)V")
    public final void method2079(boolean arg0, int arg1, int arg2) {
        super.method2079(arg0, arg1, arg2);
        ++field6409;
        if (~this.field6406 <= -1 && class591.field8337 != null) {
            int var4 = !class591.field8337.method581(-21732, this.field6406).field10265 ? 128 : 64;
            this.field6407 = class591.field8337.method578(var4, false, this.field6406, 1.0F, arg0, var4);
            this.field6402 = var4;
            this.field6411 = var4;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BII)Z")
    public static final boolean method2756(byte arg0, int arg1, int arg2) {
        if (arg0 != 53) {
            method2754((byte) 12);
        }
        ++field6400;
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class458() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)I")
    public final int method2080(boolean arg0) {
        if (!arg0) {
            this.method466((class511) null, -20, (byte) 41);
        }
        ++field6398;
        return this.field6406;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field6403;
        int var4 = 33 / ((-41 - arg2) / 42);
        if (~arg1 == -1) {
            this.field6406 = arg0.method3002(-1);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII[[[BLha;IIIIII)V")
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, class473 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6405;
        if (~arg9 != -1 && ~arg1 != -1) {
            if (arg7 <= -41) {
                if (arg9 == 9) {
                    arg9 = 1;
                    arg3 = arg3 + 1 & 3;
                }
                if (arg9 == 10) {
                    arg9 = 1;
                    arg3 = 3 & arg3 + 3;
                }
                if (arg9 == 11) {
                    arg3 = arg3 - -3 & 3;
                    arg9 = 8;
                }
                arg6.method224(arg12, arg11, arg8, arg4, arg2, arg0, arg5[arg9 - 1][arg3], arg1, arg10);
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field6410;
        if (arg0 != 0) {
            this.field6411 = 118;
        }
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int var4 = (class291.field4285 == this.field6411 ? arg1 : this.field6411 * arg1 / class291.field4285) * this.field6402;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class80.field901 == ~this.field6402) {
                for (int var8 = 0; class80.field901 > var8; ++var8) {
                    int var9 = this.field6407[var4++];
                    var7[var8] = class407.method2490(255, var9) << 4;
                    var6[var8] = class407.method2490(var9 >> 4, 4080);
                    var5[var8] = class407.method2490(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class80.field901; ++var10) {
                    int var11 = this.field6402 * var10 / class80.field901;
                    int var12 = this.field6407[var4 - -var11];
                    var7[var10] = class407.method2490(255, var12) << 4;
                    var6[var10] = class407.method2490(4080, var12 >> 4);
                    var5[var10] = class407.method2490(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
