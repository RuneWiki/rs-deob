import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class753 extends class336 {

    @OriginalMember(owner = "client!ika", name = "O", descriptor = "I")
    public int field10465 = -1;

    @OriginalMember(owner = "client!ika", name = "db", descriptor = "I")
    public int field10480 = -1;

    @OriginalMember(owner = "client!ika", name = "bb", descriptor = "Z")
    private boolean field10478 = false;

    @OriginalMember(owner = "client!ika", name = "gb", descriptor = "I")
    private int field10483 = 0;

    @OriginalMember(owner = "client!ika", name = "fb", descriptor = "I")
    public int field10482 = 0;

    @OriginalMember(owner = "client!ika", name = "P", descriptor = "J")
    public static long field10466 = 0L;

    @OriginalMember(owner = "client!ika", name = "cb", descriptor = "[I")
    public static int[] field10479 = new int[4];

    @OriginalMember(owner = "client!ika", name = "N", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!ika", name = "Q", descriptor = "I")
    public static int field10467;

    @OriginalMember(owner = "client!ika", name = "R", descriptor = "I")
    public int field10468;

    @OriginalMember(owner = "client!ika", name = "S", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!ika", name = "T", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!ika", name = "U", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!ika", name = "V", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!ika", name = "W", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!ika", name = "X", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!ika", name = "Y", descriptor = "I")
    public int field10475;

    @OriginalMember(owner = "client!ika", name = "Z", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!ika", name = "ab", descriptor = "I")
    public int field10477;

    @OriginalMember(owner = "client!ika", name = "eb", descriptor = "I")
    public int field10481;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lha;I)Luh;")
    public final class162 method204(class475 arg0, int arg1) {
        ++field10476;
        class11 var3 = class156.method1209(super.field10361, super.field10347 >> class679.field9600, super.field10350 >> class679.field9600);
        class203 var4 = class180.method1311(super.field10361, super.field10347 >> class679.field9600, super.field10350 >> class679.field9600);
        int var5 = 0;
        if (var3 != null && var3.field143.field3037) {
            var5 = var3.field143.method1167(101);
        }
        if (var4 != null && ~(-var5) > ~var4.field3005) {
            var5 = -var4.field3005;
        }
        if (~this.field10482 != ~var5) {
            super.field10358 -= this.field10482;
            super.field10358 += var5;
            this.field10482 = var5;
        }
        class765 var6 = arg0.method457();
        var6.method1569();
        if (this.field10482 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class419 var10 = class678.field9594[super.field10349];
            int var11 = this.field10483 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method2478(true, super.field10350 + var14, super.field10347 + var13);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method2478(true, super.field10350 + var17, super.field10347 + var16);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method2478(true, super.field10350 + var20, super.field10347 + var19);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method2478(true, super.field10350 - -var23, super.field10347 - -var22);
            int var25 = ~var15 <= ~var18 ? var18 : var15;
            int var26 = var21 < var24 ? var21 : var24;
            int var27 = var18 < var24 ? var18 : var24;
            int var28 = var21 <= var15 ? var21 : var15;
            if (var11 != 0) {
                int var29 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (var25 - var26), (double) var11));
                if (var29 != 0) {
                    var6.method1553(var29);
                }
            }
            if (var11 != 0) {
                int var30 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var28), (double) var11));
                if (~var30 != -1) {
                    var6.method1551(-var30);
                }
            }
            int var31 = var15 - -var24;
            if (~var31 < ~(var18 + var21)) {
                var31 = var18 - -var21;
            }
            int var32 = (var31 >> 1) + -super.field10358;
            if (var32 != 0) {
                var6.method1558(0, var32, 0);
            }
        }
        var6.method1558(super.field10347, super.field10358 + -10, super.field10350);
        class162 var33 = class527.method3085(3, true, ~arg1);
        this.field10483 = 0;
        this.field10478 = false;
        if (~this.field10480 != 0) {
            class233 var34 = class422.field5873.method2937((byte) -69, this.field10480).method317((class98) null, 0, this.field10468, (byte) -106, -1, 2048, (class285) null, 0, arg0);
            if (var34 != null) {
                if (!class765.field10581) {
                    var34.method575(var6, var33.field2500[2], 0);
                } else {
                    var34.method546(var6, var33.field2500[2], class349.field4956, 0);
                }
                this.field10478 |= var34.method558();
                this.field10483 = var34.method544();
            }
        }
        if (this.field10465 != arg1) {
            class233 var35 = class422.field5873.method2937((byte) -19, this.field10465).method317((class98) null, 0, this.field10477, (byte) -127, -1, 2048, (class285) null, 0, arg0);
            if (var35 != null) {
                if (class765.field10581) {
                    var35.method546(var6, var33.field2500[1], class349.field4956, 0);
                } else {
                    var35.method575(var6, var33.field2500[1], 0);
                }
                this.field10478 |= var35.method558();
                if (var35.method544() > this.field10483) {
                    this.field10483 = var35.method544();
                }
            }
        }
        class233 var36 = class422.field5873.method2937((byte) -85, this.field10475).method317((class98) null, 0, this.field10481, (byte) -102, -1, 2048, (class285) null, 0, arg0);
        if (var36 != null) {
            if (!class765.field10581) {
                var36.method575(var6, var33.field2500[0], 0);
            } else {
                var36.method546(var6, var33.field2500[0], class349.field4956, 0);
            }
            this.field10478 |= var36.method558();
            if (var36.method544() > this.field10483) {
                this.field10483 = var36.method544();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!ika", name = "g", descriptor = "(I)I")
    public final int method2960(int arg0) {
        if (arg0 != -5102) {
            this.method2960(-68);
        }
        ++field10470;
        class42 var2 = class422.field5873.method2937((byte) -4, this.field10475);
        int var3 = var2.field549;
        if (~this.field10465 != 0) {
            class42 var4 = class422.field5873.method2937((byte) -21, this.field10465);
            if (var3 < var4.field549) {
                var3 = var4.field549;
            }
        }
        if (this.field10480 != -1) {
            class42 var5 = class422.field5873.method2937((byte) -51, this.field10480);
            if (~var5.field549 < ~var3) {
                var3 = var5.field549;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ika", name = "f", descriptor = "(I)I")
    public final int method1167(int arg0) {
        ++field10467;
        if (arg0 < 75) {
            this.method205((byte) 124, (class475) null);
        }
        return -10;
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(Z)I")
    public final int method1173(boolean arg0) {
        ++field10474;
        if (!arg0) {
            this.method1170(122);
        }
        return this.field10483;
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(BLha;)Lmg;")
    public final class248 method205(byte arg0, class475 arg1) {
        ++field10471;
        return arg0 != 45 ? null : null;
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(IIIII)V")
    public class753(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "(ILha;)V")
    public final void method192(int arg0, class475 arg1) {
        if (arg0 < 2) {
            this.field10481 = -78;
        }
        ++field10473;
    }

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "(Z)V")
    public static void method4156(boolean arg0) {
        field10479 = null;
        if (!arg0) {
            method4156(true);
        }
    }

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)Z")
    public final boolean method1170(int arg0) {
        ++field10472;
        if (arg0 != 16383) {
            this.method205((byte) -32, (class475) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ika", name = "f", descriptor = "(B)Z")
    public final boolean method1175(byte arg0) {
        if (arg0 < 38) {
            this.method192(93, (class475) null);
        }
        ++field10469;
        return this.field10478;
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(BIILha;)Z")
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field10464;
        class765 var5 = arg3.method457();
        var5.method1568(super.field10347, super.field10358 + -10, super.field10350);
        class42 var6 = class422.field5873.method2937((byte) -93, this.field10475);
        class233 var7 = var6.method317((class98) null, 0, this.field10481, (byte) -126, -1, 131072, (class285) null, 0, arg3);
        if (var7 != null && (!class765.field10581 ? var7.method589(arg1, arg2, var5, true, var6.field549) : var7.method584(arg1, arg2, var5, true, var6.field549, class349.field4956))) {
            return true;
        } else {
            if (~this.field10465 != 0) {
                class42 var8 = class422.field5873.method2937((byte) -43, this.field10465);
                class233 var9 = var8.method317((class98) null, 0, this.field10477, (byte) -105, -1, 131072, (class285) null, 0, arg3);
                if (var9 != null && (class765.field10581 ? var9.method584(arg1, arg2, var5, true, var8.field549, class349.field4956) : var9.method589(arg1, arg2, var5, true, var8.field549))) {
                    return true;
                }
            }
            if (this.field10480 != -1) {
                class42 var10 = class422.field5873.method2937((byte) -11, this.field10480);
                class233 var11 = var10.method317((class98) null, 0, this.field10468, (byte) -126, -1, 131072, (class285) null, 0, arg3);
                if (var11 != null && (class765.field10581 ? var11.method584(arg1, arg2, var5, true, var10.field549, class349.field4956) : var11.method589(arg1, arg2, var5, true, var10.field549))) {
                    return true;
                }
            }
            int var12 = -29 % ((arg0 - 51) / 51);
            return false;
        }
    }
}
