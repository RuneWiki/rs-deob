import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class167 extends class220 {

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    private int field2186 = 4096;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    private int field2188 = 409;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "[I")
    private int[] field2193 = new int[3];

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    private int field2192 = 4096;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "I")
    private int field2198 = 4096;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2191 = "Loaded sprites";

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
    public static volatile int field2196 = -1;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIZIIIIIIII)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2195;
        class153 var13 = new class153();
        var13.field1999 = arg5;
        var13.field2002 = arg11;
        var13.field2012 = arg12;
        var13.field2010 = arg6;
        var13.field1996 = arg3;
        var13.field2007 = arg9;
        var13.field2000 = arg8;
        var13.field2011 = arg10;
        var13.field2005 = arg2;
        var13.field2009 = arg0;
        var13.field2006 = arg7;
        if (!arg4) {
            field2196 = -78;
        }
        var13.field2001 = arg1;
        class261.field3789.method2660((byte) -125, var13);
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
    public static void method1038(int arg0) {
        if (arg0 == 0) {
            field2191 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field2189;
        int[][] var3 = super.field3135.method1774(arg0, arg1 + -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 121, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class344.field5043; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2193[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2188 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2193[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field2188 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field2193[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field2188 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2186 * var12 >> 12;
                            var9[var11] = this.field2192 * var14 >> 12;
                            var10[var11] = this.field2198 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return arg1 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIB)V")
    public static final void method1039(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~arg2 > ~arg0) {
            class370.method2440(arg0, class227.field3201[arg1], arg3, arg2, 123);
        } else {
            class370.method2440(arg2, class227.field3201[arg1], arg3, arg0, 125);
        }
        ++field2190;
        if (arg4 <= 113) {
            method1040(false, 2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method1691(false);
                            this.field2193[2] = class401.method2606(var5, 255) >> 12;
                            this.field2193[0] = class401.method2606(267386880, var5 << 4);
                            this.field2193[1] = class401.method2606(var5 >> 4, 4080);
                        }
                    } else {
                        this.field2186 = arg2.method1685(arg1 ^ -8089);
                    }
                } else {
                    this.field2192 = arg2.method1685(8104);
                }
            } else {
                this.field2198 = arg2.method1685(8104);
            }
        } else {
            this.field2188 = arg2.method1685(arg1 ^ -8089);
        }
        ++field2187;
        if (arg1 != -49) {
            method1039(-105, -37, -40, -70, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1040(boolean arg0, int arg1) {
        ++field2194;
        if (arg0) {
            return true;
        } else {
            return ~(-arg1 & arg1) == ~arg1;
        }
    }
}
