import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class253 extends class259 {

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private final int field4242;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    private final int field4241;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    private final int field4243;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "[I")
    public static int[] field4253 = new int[2];

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Z")
    public static boolean field4255 = true;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Ljava/awt/Frame;")
    public static Frame field4250;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "[B")
    private byte[] field4240;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Lce;", line = 6)
    public static final class126 method1711(int arg0, int arg1) {
        class126 var2 = class195.method1386((byte) 20, arg0);
        if (arg1 < 26) {
            return (class126) null;
        }
        for (int var3 = var2.method878((byte) -121) - 3; var3 > 0; var3 -= 3) {
            var2 = class12.method69(new class126[] { var2.method859(var3, -96, 0), class168.field3001, var2.method879(-14178, var3) }, (byte) 121);
        }
        field4248++;
        if (var2.method878((byte) 120) <= 9) {
            return var2.method878((byte) 59) > 6 ? class12.method69(new class126[] { class195.field3336, var2.method859(var2.method878((byte) 90) - 4, -124, 0), class71.field1161, class194.field3303, var2, class33.field491 }, (byte) 124) : class12.method69(new class126[] { class194.field3308, var2, class228.field3841 }, (byte) 116);
        } else {
            return class12.method69(new class126[] { class300.field4964, var2.method859(var2.method878((byte) -63) - 8, -105, 0), class58.field910, class194.field3303, var2, class33.field491 }, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIFFF)V", line = 37)
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4242 = (int) (arg6 * 4096.0F);
        this.field4241 = (int) (arg7 * 4096.0F);
        this.field4251 = this.field4243 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method1712(boolean arg0) {
        field4239++;
        if (arg0) {
            method1713(-72);
        }
        class280.field4656.method1178(-113);
        class168.field2997.method1178(-107);
        class278.field4632.method1178(-92);
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 83)
    public static void method1713(int arg0) {
        field4250 = null;
        field4253 = null;
        if (arg0 != -11730) {
            field4253 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)V", line = 114)
    public static final void method1714(int arg0, int arg1) {
        field4258++;
        class245 var2 = class139.method1022(10, (byte) -105, arg0);
        var2.method1682(94);
        if (arg1 != 26206) {
            field4250 = (Frame) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 137)
    public final void method825(int arg0) {
        this.field4251 = this.field4243;
        this.field4252 >>= 0x4;
        if (this.field4252 < 0) {
            this.field4252 = 0;
        } else if (this.field4252 > 255) {
            this.field4252 = 255;
        }
        this.method1717(this.field4246++, (byte) this.field4252);
        field4254++;
        this.field4252 = 0;
        if (arg0 < 21) {
            method1712(true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([II[III)V", line = 159)
    public static final void method1715(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 >= -125) {
            method1711(18, 29);
        }
        field4244++;
        if (arg4 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var8;
        for (int var9 = arg3; var9 < arg4; var9++) {
            if (arg2[var9] > ((var9 & 0x1) + var7)) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg0[arg4] = arg0[var6];
        arg0[var6] = var8;
        method1715(arg0, -128, arg2, arg3, var6 - 1);
        method1715(arg0, -127, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V", line = 218)
    public final void method821(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field4237 = this.field4242 - (arg1 < 0 ? -arg1 : arg1);
            this.field4236 = 4096;
            this.field4237 = this.field4237 * this.field4237 >> 12;
            this.field4252 = this.field4237;
        } else {
            this.field4236 = this.field4241 * this.field4237 >> 12;
            if (this.field4236 < 0) {
                this.field4236 = 0;
            } else if (this.field4236 > 4096) {
                this.field4236 = 4096;
            }
            this.field4237 = this.field4242 - (arg1 >= 0 ? arg1 : -arg1);
            this.field4237 = this.field4237 * this.field4237 >> 12;
            this.field4237 = this.field4237 * this.field4236 >> 12;
            this.field4252 += this.field4251 * this.field4237 >> 12;
            this.field4251 = this.field4251 * this.field4243 >> 12;
        }
        field4238++;
        if (arg2 != 128) {
            method1715((int[]) null, -91, (int[]) null, -16, 2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLui;)I", line = 253)
    public static final int method1716(boolean arg0, class89 arg1) {
        field4245++;
        class304 var2 = arg1.field1389;
        if (var2.field5059 != null) {
            var2 = var2.method2038((byte) -24);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5074;
        if (!arg0) {
            field4255 = true;
        }
        if (arg1.field2501 == arg1.field2441) {
            var3 = var2.field5119;
        } else if (arg1.field2501 == arg1.field2464) {
            var3 = var2.field5052;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V", line = 285)
    public void method1717(int arg0, byte arg1) {
        this.field4240[arg0] = arg1;
        field4256++;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 307)
    public final void method827(int arg0) {
        if (arg0 != -5437) {
            this.field4251 = -18;
        }
        this.field4246 = 0;
        this.field4252 = 0;
        field4257++;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)I", line = 319)
    public static final int method1718(int arg0, int arg1) {
        field4247++;
        return arg1 == 0 ? arg0 & 0xFF : 14;
    }
}
