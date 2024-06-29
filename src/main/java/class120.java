import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class120 extends class118 {

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    private int field1581 = 0;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
    private int field1583 = 4096;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "J")
    public static long field1582 = -1L;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "Z")
    public static boolean field1585;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "Z")
    public static boolean field1586;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "Lnn;")
    public static class151 field1584;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "Liq;")
    public static class134 field1580;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field1575;
        if (arg1 != 1) {
            method721(7);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1552 = ~arg2.method2343(255) == -2;
                }
            } else {
                this.field1583 = arg2.method2323(-45);
            }
        } else {
            this.field1581 = arg2.method2323(-60);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field1573;
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (arg0) {
            return null;
        } else {
            if (super.field1549.field4903) {
                int[][] var4 = this.method708(arg1, (byte) -92, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class440.field6474 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (var12 < this.field1581) {
                        var8[var11] = this.field1581;
                    } else if (this.field1583 >= var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field1583;
                    }
                    if (~var13 > ~this.field1581) {
                        var9[var11] = this.field1581;
                    } else if (this.field1583 < var13) {
                        var9[var11] = this.field1583;
                    } else {
                        var9[var11] = var13;
                    }
                    if (~var14 <= ~this.field1581) {
                        if (var14 > this.field1583) {
                            var10[var11] = this.field1583;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field1581;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)Z")
    public static final boolean method721(int arg0) {
        ++field1577;
        if (~class360.field5320 != -1) {
            return true;
        } else {
            return arg0 != -15920 ? false : class311.field4685.method1593(false);
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(III)I")
    public static final int method722(int arg0, int arg1, int arg2) {
        ++field1579;
        if (arg2 != -20999) {
            field1584 = null;
        }
        return arg0 != 4 && arg0 != 5 ? 256 : class344.field5142[3 & arg1];
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method723(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1574;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg1 + arg3;
        int var12 = arg2 - arg1;
        if (arg0 == -27) {
            int var13 = arg3 * arg3;
            int var14 = arg2 * arg2;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg2 << 1;
            int var22 = var12 << 1;
            int var23 = (1 - var21) * var13 + var17;
            int var24 = -((var21 - 1) * var18) + var14;
            int var25 = (-var22 + 1) * var15 + var19;
            int var26 = -((var22 + -1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg2 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 - 1) * var29;
            int[] var39 = class292.field4448[arg5];
            class379.method2285(127, var39, -var11 + arg7, arg4, -arg3 + arg7);
            class379.method2285(124, var39, arg7 + var11, arg6, -var11 + arg7);
            class379.method2285(127, var39, arg3 + arg7, arg4, arg7 - -var11);
            while (var9 > 0) {
                boolean var40 = ~var9 >= ~var12;
                if (var23 < 0) {
                    while (var23 < 0) {
                        var24 += var35;
                        var23 += var31;
                        var31 += var28;
                        ++var8;
                        var35 += var28;
                    }
                }
                if (var40) {
                    if (var25 < 0) {
                        while (~var25 > -1) {
                            var25 += var33;
                            var26 += var37;
                            ++var10;
                            var33 += var30;
                            var37 += var30;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                    var25 += -var38;
                    var26 += -var34;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (~var24 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }
                var23 += -var36;
                var24 += -var32;
                var36 -= var27;
                var32 -= var27;
                --var9;
                int var41 = -var9 + arg5;
                int var42 = arg5 - -var9;
                int var43 = arg7 + var8;
                int var44 = arg7 - var8;
                if (var40) {
                    int var45 = arg7 + var10;
                    int var46 = -var10 + arg7;
                    class379.method2285(125, class292.field4448[var41], var46, arg4, var44);
                    class379.method2285(127, class292.field4448[var41], var45, arg6, var46);
                    class379.method2285(arg0 ^ -101, class292.field4448[var41], var43, arg4, var45);
                    class379.method2285(124, class292.field4448[var42], var46, arg4, var44);
                    class379.method2285(arg0 + 153, class292.field4448[var42], var45, arg6, var46);
                    class379.method2285(125, class292.field4448[var42], var43, arg4, var45);
                } else {
                    class379.method2285(125, class292.field4448[var41], var43, arg4, var44);
                    class379.method2285(127, class292.field4448[var42], var43, arg4, var44);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
    public static void method724(byte arg0) {
        if (arg0 != -79) {
            method725(-61, 119, -48);
        }
        field1580 = null;
        field1584 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1576;
        int[] var3 = super.field1537.method2395(arg0 + 30962, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, arg1, arg0 + -3);
            for (int var5 = 0; var5 < class440.field6474; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field1581) {
                    var3[var5] = this.field1581;
                } else if (~this.field1583 > ~var6) {
                    var3[var5] = this.field1583;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != 1) {
            field1585 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method725(int arg0, int arg1, int arg2) {
        ++field1578;
        int var3 = arg1 - arg2;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < arg0) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else if (~var3 < -10) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    static {
        new class151("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field1585 = false;
        field1586 = false;
        field1584 = new class151("M", "M", "M", "M");
    }
}
