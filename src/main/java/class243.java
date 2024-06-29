import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class243 extends class115 {

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    private int field4221 = 32768;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "[I")
    public static int[] field4216 = new int[99];

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
    public static int[] field4220;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "Lhe;")
    public static class47 field4224;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "Z")
    public static boolean field4222;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "[[[B")
    public static byte[][][] field4226;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIILqf;IJ)Z")
    public static final boolean method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class13 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class146.method983(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILob;)V")
    public static final void method1596(int arg0, class23 arg1) {
        ++field4218;
        long var2 = 0L;
        if (~arg1.field268 == -1) {
            var2 = class186.method1213(arg1.field259, arg1.field270, arg1.field260);
        }
        if (arg1.field268 == 1) {
            var2 = class87.method578(arg1.field259, arg1.field270, arg1.field260);
        }
        int var4 = 0;
        if (~arg1.field268 == -3) {
            var2 = class94.method622(arg1.field259, arg1.field270, arg1.field260);
        }
        int var5 = 0;
        if (arg1.field268 == 3) {
            var2 = class23.method117(arg1.field259, arg1.field270, arg1.field260);
        }
        int var6 = -1;
        if (~var2 != -1L) {
            var6 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = ((int) var2 & 3602078) >> 20;
            var4 = (int) var2 >> 14 & 31;
        }
        arg1.field264 = var4;
        if (arg0 == 438014688) {
            arg1.field269 = var6;
            arg1.field265 = var5;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class243() {
        super(3, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            field4227 = -87;
        }
        ++field4213;
        int[] var3 = super.field1872.method182((byte) -98, arg0);
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 1, arg0);
            int[] var5 = this.method792(0, 2, arg0);
            for (int var6 = 0; class130.field2297 > var6; ++var6) {
                int var7 = var5[var6] * this.field4221 >> 12;
                int var8 = (4091 & var4[var6]) >> 4;
                int var9 = class234.field3980[var8] * var7 >> 12;
                int var10 = class170.field2961[var8] * var7 >> 12;
                int var11 = class134.field2350 & var6 - -(var10 >> 12);
                int var12 = class38.field522 & (var9 >> 12) + arg0;
                int[] var13 = this.method792(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        class142.method969(arg0 ^ -395473810);
        if (arg0 != 395462996) {
            this.field4221 = 85;
        }
        ++field4217;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lpi;")
    public static final class87 method1597(int arg0, int arg1) {
        ++field4214;
        class87 var2 = (class87) class177.field3113.method1499(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != -25901) {
                method1596(-54, (class23) null);
            }
            byte[] var3 = class173.field3008.method1712(arg0, 5, arg1 + 25900);
            class87 var4 = new class87();
            if (var3 != null) {
                var4.method577(false, new class112(var3));
            }
            class177.field3113.method1502((byte) -18, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1598(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4212;
        if (arg3) {
            if (arg2 >= 1 && ~arg1 <= -2 && ~arg2 >= -103 && ~arg1 >= -103) {
                if (!class119.method816((byte) 15) && (2 & class205.field3561[0][arg2][arg1]) == 0) {
                    int var8 = arg7;
                    if ((class205.field3561[arg7][arg2][arg1] & 8) != 0) {
                        var8 = 0;
                    }
                    if (class118.field1938 != var8) {
                        return;
                    }
                }
                int var9 = arg7;
                if (arg7 < 3 && ~(class205.field3561[1][arg2][arg1] & 2) == -3) {
                    var9 = arg7 + 1;
                }
                class104.method692(arg1, arg7, class169.field2951[arg7], arg2, 59, arg6, var9);
                if (arg0 >= 0) {
                    boolean var10 = class227.field3866;
                    class227.field3866 = true;
                    class159.method1042(arg1, false, (byte) -50, arg2, false, var9, arg0, arg5, class169.field2951[arg7], arg7, arg4);
                    class227.field3866 = var10;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field4219;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1879 = ~arg1.method758(true) == -2;
            }
        } else {
            this.field4221 = arg1.method731(false) << 4;
        }
        if (arg0 != 107) {
            field4226 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)I")
    public static final int method1599(int arg0, int arg1) {
        ++field4215;
        if ((arg0 < 97 || arg0 > 122) && (~arg0 > -225 || ~arg0 < -255 || arg0 == 247)) {
            if (~arg0 == -256) {
                return 159;
            } else if (~arg0 == -157) {
                return 140;
            } else {
                if (arg1 >= -95) {
                    field4223 = 51;
                }
                return arg0;
            }
        } else {
            return arg0 - 32;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field4211;
        int[][] var3 = super.field1882.method1242(arg0, -127);
        if (super.field1882.field3344) {
            int[] var4 = this.method792(0, 1, arg0);
            int[] var5 = this.method792(0, 2, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class130.field2297; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field4221 >> 12;
                int var12 = class170.field2961[var10] * var11 >> 12;
                int var13 = class234.field3980[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class134.field2350;
                int var15 = class38.field522 & (var13 >> 12) + arg0;
                int[][] var16 = this.method789(0, (byte) -124, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg1 < 11) {
            this.method3((byte) 116, (class112) null, 116);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V")
    public static void method1600(int arg0) {
        field4226 = null;
        field4224 = null;
        field4216 = null;
        field4220 = null;
        if (arg0 != 0) {
            method1596(86, (class23) null);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field4216[var1] = var0 / 4;
        }
        field4220 = new int[5];
        field4223 = 0;
        field4224 = new class47();
        field4227 = 0;
    }
}
