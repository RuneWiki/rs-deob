import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class266 {

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4155 = 0;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "S")
    public static short field4152 = 1;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4151 = 1;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[S")
    public static short[] field4156 = new short[] { 34, 43, 37, 48, 46, 25, 17, 7 };

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method1798(int arg0, String arg1, int arg2, String arg3) {
        field4149++;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        char var7 = 0;
        int var8 = 0;
        char var9 = 0;
        while (var6 - var7 < var4 || var5 > (var8 - var9)) {
            if ((var6 - var7) >= var4) {
                return -1;
            }
            if (var8 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var8++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var7 = class209.method1376(-115, var22);
            var9 = class209.method1376(-64, var24);
            char var26 = class224.method1529(var22, arg2, arg0 ^ 0x6B);
            char var27 = class224.method1529(var24, arg2, arg0 ^ 0x7E);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class89.method678(arg2, var28, false) - class89.method678(arg2, var29, false);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class89.method678(arg2, var20, false) - class89.method678(arg2, var21, false);
                }
            }
        }
        int var12 = var4 - var5;
        if (arg0 != var12) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class89.method678(arg2, var14, false) - class89.method678(arg2, var15, false);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1799(int arg0) {
        field4156 = null;
        if (arg0 != 2) {
            field4152 = -7;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4153++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg6;
        int var11 = arg1 - arg2;
        int var12 = arg6 * arg6;
        int var13 = arg6 - arg2;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 << 1;
        int var17 = var13 * var13;
        int var18 = var17 << 1;
        int var19 = var15 << 1;
        int var20 = arg6 << 1;
        int var21 = var14 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var20) * var14 + var16;
        int var24 = var12 - ((var20 - 1) * var21);
        int var25 = (arg5 - var22) * var15 + var18;
        int var26 = var17 - (var22 - 1) * var19;
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = var18 * 3;
        int var33 = (var20 - 3) * var21;
        int var34 = (var22 - 3) * var19;
        int var35 = (arg6 - 1) * var28;
        int var36 = var30;
        int var37 = (var13 - 1) * var29;
        int var38 = var27;
        int[] var39 = class241.field3751[arg3];
        class222.method1519((byte) -122, arg7 - arg1, var39, arg7 - var11, arg0);
        class222.method1519((byte) -111, arg7 - var11, var39, arg7 + var11, arg4);
        class222.method1519((byte) -120, arg7 + var11, var39, arg7 + arg1, arg0);
        while (var10 > 0) {
            boolean var40 = var13 >= var10;
            var10--;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var31 += var27;
                    var8++;
                    var24 += var38;
                    var38 += var27;
                }
            }
            int var41 = arg3 + var10;
            if (var24 < 0) {
                var23 += var31;
                var8++;
                var24 += var38;
                var38 += var27;
                var31 += var27;
            }
            var24 += -var33;
            int var42 = arg7 - var8;
            int var43 = arg3 - var10;
            var33 -= var28;
            var23 += -var35;
            var35 -= var28;
            int var44 = arg7 + var8;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var32 += var30;
                        var9++;
                        var26 += var36;
                        var36 += var30;
                    }
                }
                if (var26 < 0) {
                    var9++;
                    var26 += var36;
                    var25 += var32;
                    var36 += var30;
                    var32 += var30;
                }
                var25 += -var37;
                var26 += -var34;
                var34 -= var29;
                var37 -= var29;
            }
            if (var40) {
                int var45 = arg7 + var9;
                int var46 = arg7 - var9;
                class222.method1519((byte) -119, var42, class241.field3751[var43], var46, arg0);
                class222.method1519((byte) -123, var46, class241.field3751[var43], var45, arg4);
                class222.method1519((byte) -109, var45, class241.field3751[var43], var44, arg0);
                class222.method1519((byte) -115, var42, class241.field3751[var41], var46, arg0);
                class222.method1519((byte) -128, var46, class241.field3751[var41], var45, arg4);
                class222.method1519((byte) -117, var45, class241.field3751[var41], var44, arg0);
            } else {
                class222.method1519((byte) -116, var42, class241.field3751[var43], var44, arg0);
                class222.method1519((byte) -128, var42, class241.field3751[var41], var44, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1801(String arg0, byte arg1) {
        if (arg1 != -37) {
            method1801((String) null, (byte) 46);
        }
        field4154++;
        int var2 = class221.method1515(arg0, -4402);
        if (var2 != -1) {
            int[] var3 = class90.field1362.method1872((byte) 109, (class154.field2251.field3738[var2] & 0xFFFF4F5) >> 14, (class154.field2251.field3738[var2] & 0x32B74BCE) >> 28, class154.field2251.field3738[var2] & 0x3FFF);
            class145.method996(var3[1], 32160, var3[2]);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
    public static final int method1802(int arg0, int arg1, int arg2) {
        field4148++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 != -1) {
            field4151 = 110;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
