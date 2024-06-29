import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class230 extends class297 {

    @OriginalMember(owner = "client!aia", name = "I", descriptor = "I")
    private int field3321 = 4096;

    @OriginalMember(owner = "client!aia", name = "K", descriptor = "[I")
    private int[] field3323 = new int[3];

    @OriginalMember(owner = "client!aia", name = "P", descriptor = "I")
    private int field3328 = 4096;

    @OriginalMember(owner = "client!aia", name = "Q", descriptor = "I")
    private int field3329 = 4096;

    @OriginalMember(owner = "client!aia", name = "S", descriptor = "I")
    private int field3331 = 409;

    @OriginalMember(owner = "client!aia", name = "N", descriptor = "Lej;")
    public static class124 field3326 = new class124(2, 6);

    @OriginalMember(owner = "client!aia", name = "J", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!aia", name = "L", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!aia", name = "M", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!aia", name = "R", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!aia", name = "O", descriptor = "Lrh;")
    public static class267 field3327;

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V", line = 8)
    public class230() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(Z)V", line = 13)
    public static void method1604(boolean arg0) {
        field3326 = null;
        field3327 = null;
        if (!arg0) {
            method1604(true);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lcea;II)V", line = 28)
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field3324;
        if (arg2 != 31015) {
            this.field3331 = 115;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method1499(-1);
                            this.field3323[2] = class263.method1762(0, var5 >> 12);
                            this.field3323[1] = class263.method1762(var5, 65280) >> 4;
                            this.field3323[0] = class263.method1762(var5 << 4, 267386880);
                        }
                    } else {
                        this.field3329 = arg0.method1478(arg2 + 842366929);
                    }
                } else {
                    this.field3328 = arg0.method1478(842397944);
                }
            } else {
                this.field3321 = arg0.method1478(842397944);
            }
        } else {
            this.field3331 = arg0.method1478(arg2 + 842366929);
        }
    }

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "(II)I", line = 97)
    public static final int method1605(int arg0, int arg1) {
        if (arg1 != 4096) {
            return -68;
        } else {
            ++field3322;
            int var2 = arg0 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        }
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(II)[[I", line = 119)
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            this.field3328 = 64;
        }
        ++field3330;
        int[][] var3 = super.field4166.method2180(-127, arg0);
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) 62, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class525.field7275 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3323[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field3331) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3323[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3331) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3323[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3331) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3329 * var12 >> 12;
                            var9[var11] = this.field3328 * var14 >> 12;
                            var10[var11] = this.field3321 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 218)
    public static final Class method1606(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != 11012) {
            field3326 = null;
        }
        ++field3325;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }
}
