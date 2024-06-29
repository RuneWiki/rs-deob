import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class234 {

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "B")
    public byte field3608 = 0;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "S")
    public short field3614;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "S")
    public short field3599;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "B")
    public byte field3623;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "B")
    public byte field3600;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field3606 = 0;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "B")
    public byte field3601;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "B")
    public byte field3603;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "B")
    public byte field3616;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "B")
    public byte field3622;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lse;")
    public class170 field3618;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lne;")
    public class210 field3602;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lne;")
    public class210 field3605;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lak;")
    public class234 field3621;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Llv;")
    public class311 field3619;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "La;")
    public class440 field3607;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lip;")
    public class502 field3615;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lqh;")
    public class50 field3610;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Lqh;")
    public class50 field3613;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field3624;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "S")
    public short field3611;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Z")
    public boolean field3609;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Z")
    public boolean field3612;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Z")
    public boolean field3617;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
    public static final void method1536() {
        for (int var0 = 0; var0 < class429.field6417; var0++) {
            if (!class48.field989[var0]) {
                class188 var1 = class248.field3825[var0];
                class256 var2 = var1.field3015;
                int var3 = var1.field3021;
                int var4 = var2.method1647(-126) - class421.field6346;
                int var5 = (var4 * 2 >> class353.field5216) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1646(-108) - var4 >> class353.field5216;
                int var9 = var2.method1653((byte) -61) - var4 >> class353.field5216;
                int var10 = var2.method1653((byte) -71) + var4 >> class353.field5216;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class220.field3464) {
                    var10 = class220.field3464 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field3026[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class493.field7231) {
                        var16 = class493.field7231 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class402 var19 = class479.method2859(var3, var17, var11, field3624 == null ? (field3624 = method1541("qi")) : field3624);
                        if (var19 != null && var19.field6076 != 0) {
                            if (var19.field6076 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field3026[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field3026[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field3026[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field3026[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class48.field989[var0] = true;
                class520.field7560[var3].method178(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method1537(byte arg0) {
        while (this.field3607 != null) {
            class440 var3 = this.field3607.field6528;
            this.field3607.method2623((byte) 103);
            this.field3607 = var3;
        }
        int var2 = 119 % ((58 - arg0) / 59);
        field3620++;
        this.field3608 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqi;Z)Z")
    public static final boolean method1538(class402 arg0, boolean arg1) {
        boolean var2 = class520.field7560 == class293.field4481;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method11(65);
        if (arg0.field6082 < 0 || arg0.field6077 < 0 || arg0.field6081 >= class493.field7231 || arg0.field6075 >= class220.field3464) {
            return false;
        }
        for (int var6 = arg0.field6082; var6 <= arg0.field6081; var6++) {
            for (int var9 = arg0.field6077; var9 <= arg0.field6075; var9++) {
                class234 var10 = class455.method2715(arg0.field6084, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6082) {
                        var11++;
                    }
                    if (var6 < arg0.field6081) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6077) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6075) {
                        var11 += 2;
                    }
                    class440 var12 = class409.method2533((byte) -117, arg0, var11);
                    class440 var13 = var10.field3607;
                    if (var13 == null) {
                        var10.field3607 = var12;
                    } else {
                        while (var13.field6528 != null) {
                            var13 = var13.field6528;
                        }
                        var13.field6528 = var12;
                    }
                    var10.field3608 = (byte) (var10.field3608 | var11);
                    if (var2 && (class281.field4248[var6][var9] & 0xFF000000) != 0) {
                        var3 = class281.field4248[var6][var9];
                        var4 = class283.field4264[var6][var9];
                        var5 = class214.field3393[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6082; var7 <= arg0.field6081; var7++) {
                for (int var8 = arg0.field6077; var8 <= arg0.field6075; var8++) {
                    if ((class281.field4248[var7][var8] & 0xFF000000) == 0) {
                        class281.field4248[var7][var8] = var3;
                        class283.field4264[var7][var8] = var4;
                        class214.field3393[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class62.field1266[class229.field3555++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
    public class234(int arg0, int arg1, int arg2) {
        this.field3614 = (short) arg2;
        this.field3599 = (short) arg1;
        this.field3600 = this.field3623 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3598++;
        class447.method2675(arg3, -1);
        int var7 = 0;
        int var8 = arg3 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        if (arg5 > -9) {
            method1540(21, -18, 17, null);
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class316.field4797[arg1];
        int var16 = arg2 - var8;
        class503.method3027(arg2 - arg3, (byte) 127, var16, arg4, var15);
        int var17 = arg2 + var8;
        class503.method3027(var16, (byte) 127, var17, arg6, var15);
        class503.method3027(var17, (byte) 127, arg2 + arg3, arg4, var15);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class385.field5619[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class316.field4797[arg1 + var9];
                    int[] var19 = class316.field4797[arg1 - var9];
                    int var20 = class385.field5619[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class503.method3027(var22, (byte) 127, var24, arg4, var18);
                    class503.method3027(var24, (byte) 127, var23, arg6, var18);
                    class503.method3027(var23, (byte) 127, var21, arg4, var18);
                    class503.method3027(var22, (byte) 127, var24, arg4, var19);
                    class503.method3027(var24, (byte) 127, var23, arg6, var19);
                    class503.method3027(var23, (byte) 127, var21, arg4, var19);
                } else {
                    int[] var25 = class316.field4797[arg1 + var9];
                    int[] var26 = class316.field4797[arg1 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class503.method3027(var28, (byte) 127, var27, arg4, var25);
                    class503.method3027(var28, (byte) 127, var27, arg4, var26);
                }
            }
            int[] var29 = class316.field4797[arg1 + var7];
            int[] var30 = class316.field4797[arg1 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class385.field5619[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class503.method3027(var32, (byte) 127, var35, arg4, var29);
                class503.method3027(var35, (byte) 127, var34, arg6, var29);
                class503.method3027(var34, (byte) 127, var31, arg4, var29);
                class503.method3027(var32, (byte) 127, var35, arg4, var30);
                class503.method3027(var35, (byte) 127, var34, arg6, var30);
                class503.method3027(var34, (byte) 127, var31, arg4, var30);
            } else {
                class503.method3027(var32, (byte) 127, var31, arg4, var29);
                class503.method3027(var32, (byte) 127, var31, arg4, var30);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method1540(int arg0, int arg1, int arg2, Object arg3) {
        field3604++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class519.method3079(0, arg1, arg0, var4);
        } else if (arg3 instanceof class476) {
            class476 var5 = (class476) arg3;
            return var5.method2800(arg0, arg1, 0);
        } else {
            if (arg2 != 1) {
                method1540(93, 123, -1, null);
            }
            throw new IllegalArgumentException();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1541(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
