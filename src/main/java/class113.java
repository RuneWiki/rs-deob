import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class113 extends class270 {

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    private int field1813 = 4;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    private int field1824 = 4;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1816 = "Allocating memory";

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "[I")
    public static int[] field1815 = new int[50];

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1820 = " has logged in.";

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "F")
    public static float field1822;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method81(byte arg0, int arg1) {
        ++field1814;
        if (arg0 < 26) {
            method975(-48, -20, -127, 19, (class186) null, -68, (class220) null, false, (String) null, (class134) null, 77, (class258) null);
        }
        int[] var3 = super.field4053.method396(arg1, -91);
        if (super.field4053.field815) {
            int var4 = class161.field2445 / this.field1813;
            int var5 = class364.field5188 / this.field1824;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1927(0, 0, class364.field5188 * var6 / var5);
            } else {
                var7 = this.method1927(0, 0, 0);
            }
            for (int var8 = 0; class161.field2445 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class161.field2445 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 59)
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 62)
    public static void method973(byte arg0) {
        field1816 = null;
        int var1 = -54 % ((arg0 - -40) / 37);
        field1820 = null;
        field1815 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Lbq;", line = 73)
    public static final class51 method974(int arg0, byte arg1) {
        if (arg1 > -63) {
            return null;
        } else {
            ++field1812;
            class18 var2 = class63.field1013;
            class51 var3;
            synchronized (class63.field1013) {
                var3 = (class51) class63.field1013.method103(0, (long) arg0);
            }
            if (var3 != null) {
                return var3;
            } else {
                byte[] var4 = class441.field6412.method1355(class122.method1031(-8187, arg0), -12607, class128.method1084(-2, arg0));
                class51 var5 = new class51();
                var5.field844 = arg0;
                if (var4 != null) {
                    var5.method409(new class37(var4), -84);
                }
                var5.method405(-26);
                class18 var6 = class63.field1013;
                synchronized (class63.field1013) {
                    class63.field1013.method113(var5, 0, (long) arg0);
                    return var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLec;I)V", line = 105)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method123(false, -58);
        }
        ++field1818;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1824 = arg1.method271((byte) 122);
            }
        } else {
            this.field1813 = arg1.method271((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILbs;ILpi;ZLjava/lang/String;Lrn;ILmb;)V", line = 141)
    public static final void method975(int arg0, int arg1, int arg2, int arg3, class186 arg4, int arg5, class220 arg6, boolean arg7, String arg8, class134 arg9, int arg10, class258 arg11) {
        ++field1823;
        int var12;
        if (class322.field4643 == 4) {
            var12 = 16383 & (int) class106.field1756;
        } else {
            var12 = (int) class106.field1756 + class1.field3 & 16383;
        }
        int var13 = Math.max(arg11.field3764 / 2, arg11.field3758 / 2) - -10;
        int var14 = arg1 * arg1 + arg3 * arg3;
        if (var14 <= var13 * var13) {
            int var15 = class56.field897[var12];
            int var16 = class56.field898[var12];
            if (!arg7) {
                if (class322.field4643 != 4) {
                    var15 = var15 * 256 / (class248.field3593 + 256);
                    var16 = var16 * 256 / (class248.field3593 - -256);
                }
                int var17 = arg1 * var15 - -(arg3 * var16) >> 15;
                int var18 = arg1 * var16 - arg3 * var15 >> 15;
                int var19 = arg4.method1443(arg8, (class421[]) null, (byte) 109, 100);
                int var20 = arg4.method1446(-18743, arg8, (class421[]) null, 100, 0);
                int var21 = var17 - var19 / 2;
                if (~(-arg11.field3764) >= ~var21 && arg11.field3764 >= var21 && -arg11.field3758 <= var18 && ~arg11.field3758 <= ~var18) {
                    arg6.method1674(arg11.field3764 / 2 + var21 - -arg10, arg11.field3758 / 2 + -var20 + arg2 - var18 + -arg0, (class421[]) null, 0, var19, (int[]) null, 0, 1, arg2, arg10, arg9, arg8, (byte) -5, arg5, 50, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)[[I", line = 188)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field1821;
        if (!arg0) {
            method974(61, (byte) 55);
        }
        int[][] var3 = super.field4046.method244(arg1, 123);
        if (super.field4046.field488) {
            int var4 = class161.field2445 / this.field1813;
            int var5 = class364.field5188 / this.field1824;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1930(0, 0, (byte) -75);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1930(class364.field5188 * var7 / var5, 0, (byte) -75);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class161.field2445; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class161.field2445 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V", line = 275)
    public static final void method976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1811;
        float var5 = (float) class272.field4093 / (float) class272.field4099;
        int var6 = arg3;
        int var7 = arg4;
        if (!(var5 < 1.0F)) {
            var6 = (int) ((float) arg4 / var5);
        } else {
            var7 = (int) ((float) arg3 * var5);
        }
        int var8 = arg2 - (arg3 - var6) / 2;
        int var9 = arg1 - (-var7 + arg4) / 2;
        class243.field3541 = arg0;
        class373.field5295 = -(class272.field4093 * var9 / var7) + class272.field4093;
        class270.field4049 = -1;
        class110.field1797 = class272.field4099 * var8 / var6;
        class441.method2748(-58);
    }
}
