import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class332 extends class30 {

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
    private int field4475 = 4096;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    private int field4474 = 4096;

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
    private int field4477 = 409;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "[I")
    private int[] field4481 = new int[3];

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    private int field4483 = 4096;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
    public static int field4479 = 0;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "Lem;")
    public static class206 field4484 = new class206(36, 9);

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "[I")
    public static int[] field4486 = new int[1];

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg2.method2819((byte) 72);
                            this.field4481[1] = class136.method950(var5 >> 4, 4080);
                            this.field4481[0] = class136.method950(267386880, var5 << 4);
                            this.field4481[2] = class136.method950(0, var5 >> 12);
                        }
                    } else {
                        this.field4474 = arg2.method2845(-1);
                    }
                } else {
                    this.field4483 = arg2.method2845(-1);
                }
            } else {
                this.field4475 = arg2.method2845(-1);
            }
        } else {
            this.field4477 = arg2.method2845(-1);
        }
        if (arg0 > 100) {
            ++field4482;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
    public class332() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)V")
    public static void method1962(boolean arg0) {
        if (arg0) {
            field4479 = -125;
        }
        field4486 = null;
        field4484 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lls;I)V")
    public static final void method1963(class124 arg0, int arg1) {
        ++field4485;
        if (arg0.field1765 != null || arg0.field1782 != null) {
            boolean var2 = true;
            int var3 = 0;
            if (arg1 != -1) {
                field4478 = -81;
            }
            while (~arg0.field1765.length < ~var3) {
                int var4 = -1;
                if (arg0.field1765 != null) {
                    var4 = arg0.field1765[var3];
                }
                if (~var4 == 0) {
                    if (!arg0.method888(-53, var3, -1)) {
                        var2 = false;
                    }
                } else {
                    label61: {
                        var2 = false;
                        boolean var5 = false;
                        boolean var6 = false;
                        int var9;
                        int var10;
                        if (~(var4 & -1073741824) != 1073741823) {
                            if (~(32768 & var4) != -1) {
                                int var7 = 32767 & var4;
                                class677 var8 = class671.field9407[var7];
                                if (var8 == null) {
                                    arg0.method888(arg1 ^ 61, var3, -1);
                                    break label61;
                                }
                                var9 = -var8.field4047 + arg0.field4047;
                                var10 = -var8.field4042 + arg0.field4042;
                            } else {
                                class393 var11 = (class393) class299.field4071.method970((byte) 89, (long) var4);
                                if (var11 == null) {
                                    arg0.method888(arg1 + -104, var3, -1);
                                    break label61;
                                }
                                class61 var12 = var11.field5552;
                                var9 = -var12.field4047 + arg0.field4047;
                                var10 = -var12.field4042 + arg0.field4042;
                            }
                        } else {
                            int var13 = 268435455 & var4;
                            int var14 = var13 >> 14;
                            var10 = arg0.field4042 - 256 - (var14 - class498.field6774) * 512;
                            int var15 = 16383 & var13;
                            var9 = -((-class613.field8555 + var15) * 512) - 256 + arg0.field4047;
                        }
                        if (~var10 != -1 || var9 != 0) {
                            arg0.method888(-37, var3, 16383 & (int) (Math.atan2((double) var10, (double) var9) * 2607.5945876176133D));
                        }
                    }
                }
                ++var3;
            }
            if (var2) {
                arg0.field1782 = null;
                arg0.field1765 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field4476;
        int[][] var3 = super.field377.method3683(arg0, (byte) 125);
        if (arg1 != 7) {
            this.field4474 = -122;
        }
        if (super.field377.field9085) {
            int[][] var4 = this.method292(124, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class31.field399 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4481[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field4477) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4481[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4477) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4481[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field4477 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4474 * var12 >> 12;
                            var9[var11] = this.field4483 * var14 >> 12;
                            var10[var11] = this.field4475 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILjs;II)V")
    public static final void method1964(int arg0, int arg1, class301 arg2, int arg3, int arg4) {
        ++field4480;
        if (arg3 != -1347765623) {
            field4478 = 125;
        }
        for (class389 var5 = (class389) class327.field4437.method1436(28964); var5 != null; var5 = (class389) class327.field4437.method1443((byte) 6)) {
            if (~var5.field5501 == ~arg1 && arg4 << 9 == var5.field5513 && arg0 << 9 == var5.field5487 && var5.field5504.field4131 == arg2.field4131) {
                if (var5.field5499 != null) {
                    class61.field680.method1464(var5.field5499);
                    var5.field5499 = null;
                }
                if (var5.field5503 != null) {
                    class61.field680.method1464(var5.field5503);
                    var5.field5503 = null;
                }
                var5.method2340(-43);
                return;
            }
        }
    }
}
