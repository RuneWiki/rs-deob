import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class64 implements class355 {

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "Lih;")
    private class655 field773;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "Lie;")
    private class6 field771;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "Ldr;")
    public static class675 field779 = new class675(2, 2);

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "Ldr;")
    public static class675 field781 = new class675(52, 5);

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "Lkaa;")
    public static class44 field784;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)V")
    public static void method510(int arg0) {
        field784 = null;
        field779 = null;
        if (arg0 == 12) {
            field781 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILfa;Lrr;ZIIIJI)V")
    public static final void method511(int arg0, class219 arg1, class337 arg2, boolean arg3, int arg4, int arg5, int arg6, long arg7, int arg8) {
        field772++;
        if (arg3) {
            return;
        }
        int var10 = arg5 * arg5 + (arg8 * arg8);
        if (((long) var10) > arg7) {
            return;
        }
        int var11 = Math.min(arg2.field4309 / 2, arg2.field4211 / 2);
        if ((var11 * var11) >= var10) {
            class376.method2169(arg5, class657.field8940[arg6], (byte) 17, arg8, arg0, arg4, arg1, arg2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class385.field4946 == 4) {
            var12 = (int) class689.field9561 & 0x3FFF;
        } else {
            var12 = (int) class689.field9561 + class290.field3661 & 0x3FFF;
        }
        int var13 = class243.field3129[var12];
        int var14 = class243.field3128[var12];
        if (class385.field4946 != 4) {
            var13 = var13 * 256 / (class352.field4559 + 256);
            var14 = var14 * 256 / (class352.field4559 + 256);
        }
        int var15 = arg5 * var14 + arg8 * var13 >> 14;
        int var16 = arg8 * var14 - (arg5 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class131.field1595[arg6].method2555((float) arg2.field4309 / 2.0F + (float) arg4 + (float) var19, (float) arg2.field4211 / 2.0F + (float) arg0 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IB)I")
    public static final int method512(int arg0, byte arg1) {
        field775++;
        return arg1 == -73 ? arg0 >>> 10 : 42;
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lih;Lie;)V")
    public class64(class655 arg0, class6 arg1) {
        this.field773 = arg0;
        this.field771 = arg1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZB)V")
    public final void method513(boolean arg0, byte arg1) {
        field778++;
        class409 var3 = this.field773.method3661(this.field771.field54, (byte) 82);
        if (var3 != null) {
            int var4 = this.field771.field58.method3205(class696.field9640, -7963, this.field771.field51) + this.field771.field48;
            int var5 = this.field771.field53.method1445(2, class634.field8596, this.field771.field57) + this.field771.field60;
            if (this.field771.field52) {
                class309.field3898.method435(var4, var5, this.field771.field51, this.field771.field57, this.field771.field55, 0);
            }
            int var6 = var5 + this.method515(var3.field5260, class336.field4143, 5, 2, var5, var4) * 12;
            int var9 = var6 + 8;
            if (this.field771.field52) {
                class309.field3898.method497(var4, var9, this.field771.field51 + var4 - 1, var9, this.field771.field55, 0);
            }
            var6 = var9 + 1;
            int var7 = var6 + this.method515(var3.field5255, class336.field4143, 5, 2, var6, var4) * 12;
            int var10 = var7 + 5;
            int var10000 = var10 + this.method515(var3.field5256, class336.field4143, 5, 2, var10, var4) * 12;
        }
        if (arg1 <= 57) {
            this.field773 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IJII)V")
    public static final void method514(int arg0, long arg1, int arg2, int arg3) {
        if (arg0 != 28356) {
            field779 = null;
        }
        field782++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class472.method2565(var5, true, 0, arg2, false, var6, 0, 0, arg3);
            return;
        }
        class687 var8 = class232.field3017.method2358(0, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field9459;
            var9 = var8.field9395;
        } else {
            var9 = var8.field9459;
            var10 = var8.field9395;
        }
        int var11 = var8.field9452;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class472.method2565(0, true, var9, arg2, false, 0, var11, var10, arg3);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;Lta;IIII)I")
    private final int method515(String arg0, class201 arg1, int arg2, int arg3, int arg4, int arg5) {
        field780++;
        if (arg3 != 2) {
            field779 = null;
        }
        return arg1.method1175(this.field771.field49, 0, arg0, this.field771.field57 - arg2 * 2, 0, null, (byte) -34, arg2 + arg5, null, 0, arg2 + arg4, this.field771.field51 - arg2 * 2, 0, 0, this.field771.field50, null);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Z")
    public final boolean method516(int arg0) {
        field774++;
        return arg0 == -6191 ? this.field773.method3662(9601) : true;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field783++;
        int var8 = arg2;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg4 - arg6;
        int var13 = arg1 * arg1;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class30.field364[arg3];
        class390.method2223(arg0 - arg1, arg5, var39, (byte) -99, arg0 - var11);
        class390.method2223(arg0 - var11, arg7, var39, (byte) -127, arg0 + var11);
        class390.method2223(arg0 + var11, arg5, var39, (byte) -123, arg0 + arg1);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg3 - var9;
            int var42 = arg3 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class390.method2223(var44, arg5, class30.field364[var41], (byte) -111, var46);
                class390.method2223(var46, arg7, class30.field364[var41], (byte) -121, var45);
                class390.method2223(var45, arg5, class30.field364[var41], (byte) -61, var43);
                class390.method2223(var44, arg5, class30.field364[var42], (byte) -87, var46);
                class390.method2223(var46, arg7, class30.field364[var42], (byte) -118, var45);
                class390.method2223(var45, arg5, class30.field364[var42], (byte) -74, var43);
            } else {
                class390.method2223(var44, arg5, class30.field364[var41], (byte) -90, var43);
                class390.method2223(var44, arg5, class30.field364[var42], (byte) -77, var43);
            }
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    public final void method518(int arg0) {
        field777++;
        if (arg0 != -841) {
            field779 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I")
    public static final int method519(int arg0) {
        field776++;
        if (class367.field4752) {
            return 6;
        } else if (class67.field817 == null) {
            return 0;
        } else {
            int var1 = class67.field817.field6242;
            if (class550.method2943(var1, false)) {
                return 1;
            }
            if (arg0 != 31043) {
                field779 = null;
            }
            if (class534.method2880(-8897, var1)) {
                return 2;
            } else if (class245.method1473(var1, -120)) {
                return 3;
            } else if (class453.method2489((byte) 104, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }
}
