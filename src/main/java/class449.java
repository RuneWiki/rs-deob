import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class449 extends class747 {

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    private int field6208 = 585;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "Lst;")
    public static class335 field6211 = new class335(27, 11);

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "[C")
    public static char[] field6214 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "[I")
    public static int[] field6215 = new int[1];

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
    public static int field6216 = 0;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "Z")
    public static boolean field6212 = false;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "Luu;")
    public static class237 field6213;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rda", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field6219;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjm;)V")
    public static final void method2732(int arg0, class6 arg1) {
        ++field6218;
        if (arg0 != -1389) {
            field6213 = null;
        }
        if (class137.field1948 != null) {
            class722 var2 = null;
            if (arg1.field47 == 0) {
                var2 = (class722) class376.method2357(arg1.field50, arg1.field53, arg1.field41);
            }
            if (~arg1.field47 == -2) {
                var2 = (class722) class540.method3199(arg1.field50, arg1.field53, arg1.field41);
            }
            if (~arg1.field47 == -3) {
                var2 = (class722) class141.method932(arg1.field50, arg1.field53, arg1.field41, field6219 != null ? field6219 : (field6219 = method2736("bda")));
            }
            if (arg1.field47 == 3) {
                var2 = (class722) class134.method851(arg1.field50, arg1.field53, arg1.field41);
            }
            if (var2 != null) {
                arg1.field52 = var2.method782((byte) -109);
                arg1.field48 = var2.method784(-4532);
                arg1.field57 = var2.method794(arg0 + 1485);
            } else {
                arg1.field52 = -1;
                arg1.field57 = 0;
                arg1.field48 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
    public static void method2733(int arg0) {
        field6211 = null;
        field6213 = null;
        field6215 = null;
        if (arg0 != 3) {
            method2732(-44, (class6) null);
        }
        field6214 = null;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
    public class449() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)I")
    public static final int method2734(byte arg0, int arg1) {
        ++field6217;
        int var2 = arg1 & 63;
        if (arg0 <= 35) {
            field6216 = 34;
        }
        int var3 = arg1 >> 6 & 3;
        if (~var2 != -19) {
            if (~var2 == -20 || var2 == 21) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
        } else {
            if (var3 == 0) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (~var3 == -3) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)Z")
    public static final boolean method2735(int arg0, byte arg1) {
        if (arg1 > -54) {
            field6211 = null;
        }
        ++field6209;
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field6210;
        if (arg1 >= -89) {
            method2735(97, (byte) -38);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int var4 = class515.field7103[arg0];
            for (int var5 = 0; ~class73.field1095 < ~var5; ++var5) {
                int var6 = class639.field8571[var5];
                if (this.field6208 < var6 && ~var6 > ~(-this.field6208 + 4096) && var4 > -this.field6208 + 2048 && this.field6208 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6208 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field6208) && 2048 - -this.field6208 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field6208;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6208 + 2048);
                } else if (var4 >= this.field6208 && var4 <= -this.field6208 + 4096) {
                    if (~var6 <= ~this.field6208 && ~var6 >= ~(-this.field6208 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6208 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field6208;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field6208);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            field6214 = null;
        }
        if (arg2 == 0) {
            this.field6208 = arg0.method482(-772591672);
        }
        ++field6207;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2736(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
