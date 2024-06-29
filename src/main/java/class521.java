import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class521 {

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "Ltm;")
    public static class334 field7525 = new class334(19, -1);

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "I")
    public static int field7527 = 2;

    @OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
    public static int field7529 = 0;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public int field7521;

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!fha", name = "f", descriptor = "I")
    private int field7523;

    @OriginalMember(owner = "client!fha", name = "g", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!fha", name = "i", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!fha", name = "k", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "Lla;")
    public static class422 field7518;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)I")
    public final int method3102(int arg0) {
        if (arg0 == -8255) {
            field7522++;
            return this.field7521 & 0x3FFF;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)V")
    public final void method3103(int arg0, int arg1) {
        this.field7521 = arg0;
        if (arg1 > -51) {
            this.method3107(99, -128, 120, -91);
        }
        this.field7523 = 0;
        field7524++;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V")
    public static void method3104(byte arg0) {
        field7518 = null;
        field7525 = null;
        int var1 = 102 % ((arg0 - 12) / 39);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class160.method1197(arg5, (byte) 46);
        field7519++;
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (arg6 != 30758) {
            field7529 = 26;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class76.field1126 && arg1 <= class461.field6699) {
            int[] var14 = class77.field1131[arg1];
            int var15 = class487.method2955(class184.field3102, class657.field9347, (byte) 123, arg4 - arg5);
            int var16 = class487.method2955(class184.field3102, class657.field9347, (byte) -93, arg4 + arg5);
            int var17 = class487.method2955(class184.field3102, class657.field9347, (byte) 78, arg4 - var8);
            int var18 = class487.method2955(class184.field3102, class657.field9347, (byte) -93, arg4 + var8);
            class608.method3484(var14, var15, -7, arg3, var17);
            class608.method3484(var14, var17, -7, arg0, var18);
            class608.method3484(var14, var18, -7, arg3, var16);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class146.field2293[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (var21 >= class76.field1126 && class461.field6699 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class487.method2955(class184.field3102, class657.field9347, (byte) 73, arg4 + var7);
                        int var23 = class487.method2955(class184.field3102, class657.field9347, (byte) -104, arg4 - var7);
                        if (class461.field6699 >= var21) {
                            class608.method3484(class77.field1131[var21], var23, -7, arg3, var22);
                        }
                        if (var20 >= class76.field1126) {
                            class608.method3484(class77.field1131[var20], var23, arg6 ^ 0xFFFF87DF, arg3, var22);
                        }
                    } else {
                        int var24 = class146.field2293[var9];
                        int var25 = class487.method2955(class184.field3102, class657.field9347, (byte) -127, arg4 + var7);
                        int var26 = class487.method2955(class184.field3102, class657.field9347, (byte) -113, arg4 - var7);
                        int var27 = class487.method2955(class184.field3102, class657.field9347, (byte) 127, arg4 + var24);
                        int var28 = class487.method2955(class184.field3102, class657.field9347, (byte) -113, arg4 - var24);
                        if (var21 <= class461.field6699) {
                            int[] var29 = class77.field1131[var21];
                            class608.method3484(var29, var26, -7, arg3, var28);
                            class608.method3484(var29, var28, -7, arg0, var27);
                            class608.method3484(var29, var27, -7, arg3, var25);
                        }
                        if (var20 >= class76.field1126) {
                            int[] var30 = class77.field1131[var20];
                            class608.method3484(var30, var26, -7, arg3, var28);
                            class608.method3484(var30, var28, -7, arg0, var27);
                            class608.method3484(var30, var27, arg6 - 30765, arg3, var25);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class76.field1126 <= var32 && class461.field6699 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (var33 >= class184.field3102 && class657.field9347 >= var34) {
                    int var35 = class487.method2955(class184.field3102, class657.field9347, (byte) 43, var33);
                    int var36 = class487.method2955(class184.field3102, class657.field9347, (byte) 26, var34);
                    if (var7 >= var8) {
                        if (var32 <= class461.field6699) {
                            class608.method3484(class77.field1131[var32], var36, -7, arg3, var35);
                        }
                        if (var31 >= class76.field1126) {
                            class608.method3484(class77.field1131[var31], var36, -7, arg3, var35);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class146.field2293[var7];
                        int var38 = class487.method2955(class184.field3102, class657.field9347, (byte) 82, arg4 + var37);
                        int var39 = class487.method2955(class184.field3102, class657.field9347, (byte) -108, arg4 - var37);
                        if (var32 <= class461.field6699) {
                            int[] var40 = class77.field1131[var32];
                            class608.method3484(var40, var36, arg6 - 30765, arg3, var39);
                            class608.method3484(var40, var39, -7, arg0, var38);
                            class608.method3484(var40, var38, arg6 - 30765, arg3, var35);
                        }
                        if (class76.field1126 <= var31) {
                            int[] var41 = class77.field1131[var31];
                            class608.method3484(var41, var36, -7, arg3, var39);
                            class608.method3484(var41, var39, arg6 - 30765, arg0, var38);
                            class608.method3484(var41, var38, -7, arg3, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)V")
    public final void method3106(boolean arg0) {
        this.field7521 &= 0x3FFF;
        field7528++;
        if (arg0) {
            field7527 = 60;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIII)Z")
    public final boolean method3107(int arg0, int arg1, int arg2, int arg3) {
        field7520++;
        int var5 = this.field7523;
        if (this.field7521 == arg3 && this.field7523 == 0) {
            return false;
        }
        boolean var6;
        if (~this.field7523 == arg0) {
            if (this.field7521 < arg3 && this.field7521 + arg1 >= arg3 || this.field7521 > arg3 && this.field7521 - arg1 <= arg3) {
                this.field7521 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field7523 > 0 && this.field7521 < arg3) {
            int var7 = this.field7523 * this.field7523 / (arg1 * 2);
            int var8 = this.field7521 + var7;
            if (var8 < arg3 && this.field7521 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field7523 < 0 && arg3 < this.field7521) {
            int var9 = this.field7523 * this.field7523 / (arg1 * 2);
            int var10 = this.field7521 - var9;
            if (var10 > arg3 && var10 <= this.field7521) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field7521 >= arg3) {
                this.field7523 -= arg1;
                if (arg2 != 0 && this.field7523 < (-arg2)) {
                    this.field7523 = -arg2;
                }
            } else {
                this.field7523 += arg1;
                if (arg2 != 0 && this.field7523 > arg2) {
                    this.field7523 = arg2;
                }
            }
            if (this.field7523 != var5) {
                int var11 = this.field7523 * this.field7523 / (arg1 * 2);
                if (this.field7521 >= arg3) {
                    if (this.field7521 > arg3 && this.field7521 - var11 < arg3) {
                        this.field7523 = var5;
                    }
                } else if (this.field7521 + var11 > arg3) {
                    this.field7523 = var5;
                }
            }
        } else if (this.field7523 <= 0) {
            this.field7523 += arg1;
            if (this.field7523 > 0) {
                this.field7523 = 0;
            }
        } else {
            this.field7523 -= arg1;
            if (this.field7523 < 0) {
                this.field7523 = 0;
            }
        }
        this.field7521 += this.field7523 + var5 >> 1;
        return var6;
    }
}
