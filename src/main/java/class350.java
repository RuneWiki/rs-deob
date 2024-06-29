import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class350 {

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "Ldu;")
    public static class360 field4925 = new class360(8);

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "F")
    public static float field4930;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    private int field4922;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
    public int field4928;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "Lwu;")
    public static class376 field4921;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)I")
    public final int method2097(byte arg0) {
        field4929++;
        if (arg0 > -53) {
            this.field4928 = -28;
        }
        return this.field4928 & 0x3FFF;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V")
    public static void method2098(int arg0) {
        if (arg0 == -27121) {
            field4921 = null;
            field4925 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IB)V")
    public final void method2099(int arg0, byte arg1) {
        this.field4928 = arg0;
        field4924++;
        if (arg1 != -109) {
            method2098(-45);
        }
        this.field4922 = 0;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var9 = arg5 + 1;
        class717.method4012(arg1, -79, arg0, class690.field9616[arg5], arg3);
        field4926++;
        int var8 = arg2 - 1;
        class717.method4012(arg1, -84, arg0, class690.field9616[arg2], arg3);
        if (!arg4) {
            method2103(41, -115, 73, 81, -116, 126, 74);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class690.field9616[var6];
            var7[arg0] = var7[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)V")
    public final void method2101(byte arg0) {
        if (arg0 <= 53) {
            method2098(-110);
        }
        this.field4928 &= 0x3FFF;
        field4920++;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIII)Z")
    public final boolean method2102(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -11598) {
            method2103(30, -128, -5, -37, 124, 76, 127);
        }
        field4927++;
        int var5 = this.field4922;
        if (this.field4928 == arg2 && this.field4922 == 0) {
            return false;
        }
        boolean var8;
        if (this.field4922 == 0) {
            if (this.field4928 < arg2 && arg2 <= this.field4928 + arg3 || this.field4928 > arg2 && arg2 >= (this.field4928 - arg3)) {
                this.field4928 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field4922 > 0 && arg2 > this.field4928) {
            int var6 = this.field4922 * this.field4922 / (arg3 * 2);
            int var7 = this.field4928 + var6;
            if (arg2 > var7 && var7 >= this.field4928) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field4922 < 0 && arg2 < this.field4928) {
            int var9 = this.field4922 * this.field4922 / (arg3 * 2);
            int var10 = this.field4928 - var9;
            if (var10 > arg2 && var10 <= this.field4928) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field4928 >= arg2) {
                this.field4922 -= arg3;
                if (arg1 != 0 && this.field4922 < -arg1) {
                    this.field4922 = -arg1;
                }
            } else {
                this.field4922 += arg3;
                if (arg1 != 0 && this.field4922 > arg1) {
                    this.field4922 = arg1;
                }
            }
            if (this.field4922 != var5) {
                int var11 = this.field4922 * this.field4922 / (arg3 * 2);
                if (arg2 <= this.field4928) {
                    if (arg2 < this.field4928 && this.field4928 - var11 < arg2) {
                        this.field4922 = var5;
                    }
                } else if ((this.field4928 + var11) > arg2) {
                    this.field4922 = var5;
                }
            }
        } else if (this.field4922 <= 0) {
            this.field4922 += arg3;
            if (this.field4922 > 0) {
                this.field4922 = 0;
            }
        } else {
            this.field4922 -= arg3;
            if (this.field4922 < 0) {
                this.field4922 = 0;
            }
        }
        this.field4928 += this.field4922 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4923++;
        int var7 = arg3 - arg6;
        int var8 = arg4 + arg6;
        if (arg0 != 0) {
            return;
        }
        for (int var9 = arg4; var9 < var8; var9++) {
            class717.method4012(arg1, -56, arg5, class690.field9616[var9], arg2);
        }
        int var10 = arg2 - arg6;
        for (int var11 = arg3; var11 > var7; var11--) {
            class717.method4012(arg1, arg0 - 59, arg5, class690.field9616[var11], arg2);
        }
        int var12 = arg5 + arg6;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class690.field9616[var13];
            class717.method4012(arg1, -115, arg5, var14, var12);
            class717.method4012(arg1, -81, var10, var14, arg2);
        }
    }
}
