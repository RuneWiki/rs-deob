import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class253 extends class666 {

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    private int field3240 = 4096;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Z")
    private boolean field3241 = true;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Lkfa;")
    public static class549 field3242 = new class549(59, -1);

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Ljo;")
    public static class303 field3243;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILlt;)V")
    public static final void method1449(int arg0, class617 arg1) {
        ++field3235;
        if (arg0 == 18956) {
            for (int var2 = 0; ~var2 > ~class179.field2218; ++var2) {
                int var3 = class382.field5045[var2];
                class455 var4 = class362.field4726[var3];
                int var5 = arg1.method2541(83);
                if ((32 & var5) != 0) {
                    var5 += arg1.method2541(arg0 + -18899) << 8;
                }
                if (~(2048 & var5) != -1) {
                    var5 += arg1.method2541(60) << 16;
                }
                class509.method2924(arg1, 0, var5, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V")
    public static void method1450(int arg0) {
        field3243 = null;
        field3242 = null;
        if (arg0 < 9) {
            method1449(7, (class617) null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field3237;
        if (arg1 != 98) {
            this.field3240 = 47;
        }
        int[][] var3 = super.field9471.method3639(10, arg0);
        if (super.field9471.field9180) {
            int[] var4 = this.method3739(0, -128, arg0 + -1 & class515.field7357);
            int[] var5 = this.method3739(0, arg1 + -223, arg0);
            int[] var6 = this.method3739(0, -127, arg0 + 1 & class515.field7357);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class501.field7222 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3240;
                int var12 = (var5[class507.field7299 & var10 + 1] + -var5[class507.field7299 & var10 + -1]) * this.field3240;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 - 4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field3241) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FIZBIIIII)[[I")
    public static final int[][] method1451(float arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3234;
        int[][] var9 = new int[arg5][arg6];
        class273 var10 = new class273();
        var10.field3466 = arg4;
        var10.field3459 = (int) (arg0 * 4096.0F);
        var10.field3469 = arg8;
        var10.field3470 = arg2;
        var10.field3468 = arg7;
        var10.method118(-9);
        if (arg3 < 78) {
            field3242 = null;
        }
        class625.method3502(arg6, (byte) 33, arg5);
        for (int var11 = 0; ~arg5 < ~var11; ++var11) {
            var10.method1562(var9[var11], var11, true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field3241 = false;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3241 = arg1.method2541(43) == 1;
            }
        } else {
            this.field3240 = arg1.method2574(-1758460248);
        }
        ++field3236;
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)Lss;")
    public static final class393 method1452(int arg0) {
        ++field3238;
        if (arg0 != 4096) {
            return null;
        } else {
            class393 var1 = (class393) class44.field498.method89((byte) 127);
            if (var1 != null) {
                --class559.field7963;
                return var1;
            } else {
                return new class393();
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class253() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;ZZ)Z")
    public static final boolean method1453(int arg0, String arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            return false;
        } else {
            ++field3239;
            if (~arg0 <= -3 && ~arg0 >= -37) {
                boolean var4 = false;
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg1.length();
                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                    char var9 = arg1.charAt(var8);
                    if (var8 == 0) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg3) {
                            continue;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || ~var9 < -123) {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (~arg0 >= ~var11) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg0 * var6 + var11;
                    if (~(var10 / arg0) != ~var6) {
                        return false;
                    }
                    var6 = var10;
                    var5 = true;
                }
                return var5;
            } else {
                throw new IllegalArgumentException("Invalid radix:" + arg0);
            }
        }
    }
}
