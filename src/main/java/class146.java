import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class146 extends class398 {

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    private int field2005 = 2048;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    private int field2007 = 3072;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    private int field2009 = 1024;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "[I")
    public static int[] field2000 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "Lps;")
    public static class394 field2002;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "[[B")
    public static byte[][] field2006;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class146() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field2003;
        int[] var3 = super.field5927.method305(arg0, (byte) 101);
        if (arg1 != 0) {
            method930(-85);
        }
        if (super.field5927.field591) {
            int[] var4 = this.method2558(0, 29295, arg0);
            for (int var5 = 0; ~class140.field1922 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2005 >> 12) + this.field2009;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(CB)Z")
    public static final boolean method929(char arg0, byte arg1) {
        ++field1999;
        if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
        } else if (arg1 > -49) {
            return false;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else {
            return ~arg0 == -8365 || ~arg0 == -339 || arg0 == 8212 || ~arg0 == -340 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        ++field1998;
        if (arg0 == 16) {
            this.field2005 = this.field2007 - this.field2009;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            this.field2007 = -32;
        }
        ++field2004;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5931 = ~arg0.method1348(-100) == -2;
                }
            } else {
                this.field2007 = arg0.method1343(arg2 ^ -13237);
            }
        } else {
            this.field2009 = arg0.method1343(255);
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method930(int arg0) {
        field2000 = null;
        if (arg0 == 23466) {
            field2002 = null;
            field2006 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
    public final int[][] method99(int arg0, int arg1) {
        ++field2008;
        if (arg1 != 2) {
            return null;
        } else {
            int[][] var3 = super.field5933.method2205((byte) -114, arg0);
            if (super.field5933.field4847) {
                int[][] var4 = this.method2561(arg0, (byte) -124, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class140.field1922 > var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field2005 >> 12) + this.field2009;
                    var9[var11] = this.field2009 - -(var6[var11] * this.field2005 >> 12);
                    var10[var11] = (var7[var11] * this.field2005 >> 12) + this.field2009;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2001;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = -arg4 + arg2;
        int var12 = -arg4 + arg1;
        int var13 = arg2 * arg2;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        if (arg7 == -399361631) {
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg1 - 1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            int[] var39 = class384.field5560[arg6];
            class207.method1221((byte) -124, arg0 - arg2, -var11 + arg0, var39, arg3);
            class207.method1221((byte) -124, -var11 + arg0, arg0 + var11, var39, arg5);
            class207.method1221((byte) -128, arg0 + var11, arg0 + arg2, var39, arg3);
            while (~var9 < -1) {
                boolean var40 = ~var12 <= ~var9;
                if (var23 < 0) {
                    while (var23 < 0) {
                        var24 += var35;
                        var23 += var31;
                        ++var8;
                        var31 += var28;
                        var35 += var28;
                    }
                }
                if (var40) {
                    if (var25 < 0) {
                        while (var25 < 0) {
                            var26 += var37;
                            var25 += var33;
                            ++var10;
                            var37 += var30;
                            var33 += var30;
                        }
                    }
                    if (~var26 > -1) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                    var25 += -var38;
                    var26 += -var34;
                    var38 -= var29;
                    var34 -= var29;
                }
                if (var24 < 0) {
                    var24 += var35;
                    var23 += var31;
                    ++var8;
                    var31 += var28;
                    var35 += var28;
                }
                var23 += -var36;
                var24 += -var32;
                var32 -= var27;
                --var9;
                var36 -= var27;
                int var41 = -var9 + arg6;
                int var42 = arg6 + var9;
                int var43 = arg0 + var8;
                int var44 = -var8 + arg0;
                if (!var40) {
                    class207.method1221((byte) -122, var44, var43, class384.field5560[var41], arg3);
                    class207.method1221((byte) -128, var44, var43, class384.field5560[var42], arg3);
                } else {
                    int var45 = arg0 + var10;
                    int var46 = arg0 - var10;
                    class207.method1221((byte) -127, var44, var46, class384.field5560[var41], arg3);
                    class207.method1221((byte) -122, var46, var45, class384.field5560[var41], arg5);
                    class207.method1221((byte) -123, var45, var43, class384.field5560[var41], arg3);
                    class207.method1221((byte) -124, var44, var46, class384.field5560[var42], arg3);
                    class207.method1221((byte) -126, var46, var45, class384.field5560[var42], arg5);
                    class207.method1221((byte) -128, var45, var43, class384.field5560[var42], arg3);
                }
            }
        }
    }
}
