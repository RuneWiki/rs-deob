import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class332 extends class144 implements class394 {

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Z")
    private boolean field4608;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "B")
    private byte field4592;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Z")
    private boolean field4598;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Z")
    private boolean field4593;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "S")
    private short field4603;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "B")
    private byte field4601;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Z")
    private boolean field4614;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Lda;")
    public class397 field4588;

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "Lha;")
    private class427 field4618;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Lvh;")
    public static class125 field4594 = new class125(69, -1);

    @OriginalMember(owner = "client!kh", name = "pb", descriptor = "[B")
    public static byte[] field4622 = new byte[2048];

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "Leda;")
    public static class116 field4616 = new class116(11, 6);

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!kh", name = "mb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!kh", name = "ob", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!kh", name = "qb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!kh", name = "rb", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Leh;")
    private class203 field4587;

    @OriginalMember(owner = "client!kh", name = "sb", descriptor = "[Ldm;")
    public static class680[] field4625;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLr;I)Lda;")
    private final class397 method1970(byte arg0, class98 arg1, int arg2) {
        ++field4612;
        if (this.field4588 != null && ~arg1.method754(this.field4588.method468(), arg2) == -1) {
            return this.field4588;
        } else {
            class75 var4 = this.method1973(false, arg2, (byte) 86, arg1);
            if (arg0 != 83) {
                return null;
            } else {
                return var4 != null ? var4.field1179 : null;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lr;B)V")
    public final void method911(class98 arg0, byte arg1) {
        if (arg1 != 31) {
            this.method632(-108, -125, (class98) null, (byte) 112);
        }
        ++field4595;
        Object var3 = null;
        class427 var5;
        if (this.field4618 == null && this.field4614) {
            class75 var4 = this.method1973(true, 262144, (byte) 86, arg0);
            var5 = var4 == null ? null : var4.field1178;
        } else {
            var5 = this.field4618;
            this.field4618 = null;
        }
        if (var5 != null) {
            class123.method986(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)Z")
    public final boolean method908(boolean arg0) {
        if (arg0) {
            this.method626(123);
        }
        ++field4589;
        return this.field4614;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)I")
    public final int method1971(byte arg0) {
        ++field4600;
        if (arg0 != -104) {
            this.method911((class98) null, (byte) -98);
        }
        return this.field4588 != null ? this.field4588.method461() / 4 : 15;
    }

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "(I)V")
    public static void method1972(int arg0) {
        if (arg0 != 10) {
            method1974(-120, 37, 31, -1, -82, (byte[]) null, false);
        }
        field4622 = null;
        field4625 = null;
        field4616 = null;
        field4594 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIBLr;)Lfj;")
    private final class75 method1973(boolean arg0, int arg1, byte arg2, class98 arg3) {
        ++field4619;
        if (arg2 != 86) {
            return null;
        } else {
            class119 var5 = class14.field224.method2834(0, this.field4603 & 65535);
            class682 var6;
            class682 var7;
            if (this.field4593) {
                var6 = class340.field4723[super.field3163];
                var7 = class621.field8841[0];
            } else {
                var6 = class621.field8841[super.field3163];
                if (super.field3163 >= 3) {
                    var7 = null;
                } else {
                    var7 = class621.field8841[super.field3163 + 1];
                }
            }
            return var5.method960(arg2 + 25, var7, super.field3160, this.field4601 != 11 ? this.field4592 : this.field4592 + 4, arg3, this.field4601 == 11 ? 10 : this.field4601, super.field3155, var6, arg1, arg0, super.field3154);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)Z")
    public final boolean method633(boolean arg0) {
        ++field4605;
        return !arg0 ? true : true;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIIIIIIZ)V")
    public class332(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1955 == -2, class333.method1980(arg13, -21638, arg12));
        this.field4608 = arg1.field1903 != 0 && !arg7;
        this.field4592 = (byte) arg13;
        this.field4598 = arg14;
        this.field4593 = arg7;
        this.field4603 = (short) arg1.field1953;
        this.field4601 = (byte) arg12;
        super.field3163 = (byte) arg3;
        this.field4614 = arg0.method742() && arg1.field1964 && !this.field4593 && ~class525.field7713.method2484(class76.field1182, false) != -1;
        int var16 = 2048;
        if (this.field4598) {
            var16 |= 65536;
        }
        class75 var17 = this.method1973(this.field4614, var16, (byte) 86, arg0);
        if (var17 != null) {
            this.field4588 = var17.field1179;
            this.field4618 = var17.field1178;
            if (this.field4598) {
                this.field4588 = this.field4588.method475((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII[BZ)V")
    public static final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6) {
        ++field4604;
        if (~arg2 < -1 && !class452.method2633(arg2, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (!arg6) {
            if (arg4 > 0 && !class452.method2633(arg4, (byte) 127)) {
                throw new IllegalArgumentException("");
            } else {
                int var7 = class312.method1891(-67, arg3);
                int var8 = 0;
                int var9 = arg2 < arg4 ? arg2 : arg4;
                int var10 = arg2 >> 1;
                int var11 = arg4 >> 1;
                byte[] var12 = arg5;
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var8, arg0, arg2, arg4, 0, arg3, 5121, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg2 * var7;
                    for (int var15 = 0; var15 < var7; ++var15) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
                        for (int var20 = 0; var20 < var11; ++var20) {
                            for (int var21 = 0; var10 > var21; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = (byte) (var27 >> 2);
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    byte[] var16 = var13;
                    var13 = var12;
                    arg4 = var11;
                    arg2 = var10;
                    var12 = var16;
                    ++var8;
                    var11 >>= 1;
                    var9 >>= 1;
                    var10 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(ILr;)V")
    public final void method625(int arg0, class98 arg1) {
        ++field4607;
        if (arg0 < 67) {
            this.field4598 = false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)Z")
    public final boolean method630(int arg0) {
        int var2 = 58 / ((arg0 - -59) / 44);
        ++field4624;
        return this.field4588 != null ? this.field4588.method449() : false;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILr;)V")
    public final void method912(int arg0, class98 arg1) {
        ++field4620;
        if (arg0 == 20280) {
            Object var3 = null;
            class427 var5;
            if (this.field4618 == null && this.field4614) {
                class75 var4 = this.method1973(true, 262144, (byte) 86, arg1);
                var5 = var4 != null ? var4.field1178 : null;
            } else {
                var5 = this.field4618;
                this.field4618 = null;
            }
            if (var5 != null) {
                class68.method564(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
    public final int method634(byte arg0) {
        ++field4599;
        if (arg0 > -102) {
            field4616 = null;
        }
        return this.field4588 == null ? 0 : this.field4588.method434();
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
    public final int method904(int arg0) {
        ++field4623;
        return arg0 != -15140 ? 49 : this.field4592;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
    public final int method907(boolean arg0) {
        ++field4617;
        if (arg0) {
            this.method625(-83, (class98) null);
        }
        return this.field4601;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg0 instanceof class564) {
            class564 var8 = (class564) arg0;
            if (this.field4588 != null && var8.field8235 != null) {
                this.field4588.method466(var8.field8235, arg1, arg4, arg5, arg2);
            }
        } else if (arg0 instanceof class332) {
            class332 var9 = (class332) arg0;
            if (this.field4588 != null && var9.field4588 != null) {
                this.field4588.method466(var9.field4588, arg1, arg4, arg5, arg2);
            }
        }
        if (arg6 < 22) {
            this.method911((class98) null, (byte) -3);
        }
        ++field4596;
    }

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)I")
    public final int method626(int arg0) {
        if (arg0 != -32768) {
            this.method625(40, (class98) null);
        }
        ++field4610;
        return this.field4588 != null ? this.field4588.method478() : 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lr;I)Lej;")
    public final class690 method627(class98 arg0, int arg1) {
        ++field4602;
        if (arg1 != -7927) {
            this.method633(false);
        }
        if (this.field4588 == null) {
            return null;
        } else {
            class152 var3 = arg0.method777();
            var3.method166(super.field3155, super.field3160, super.field3154);
            class690 var4 = null;
            if (this.field4608) {
                var4 = class101.method849(arg1 + 7828, 1);
            }
            if (!class372.field5162) {
                this.field4588.method460(var3, var4 == null ? null : var4.field9788[0], 0);
            } else {
                this.field4588.method448(var3, var4 != null ? var4.field9788[0] : null, class450.field6494, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
    public static final String method1975(int arg0, int arg1, boolean arg2, long arg3, int arg4) {
        ++field4621;
        char var6 = ',';
        char var7 = '.';
        if (~arg1 == -1) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg0 < -1) {
            for (int var10 = 0; ~var10 > ~arg0; ++var10) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        int var13 = -100 % ((41 - arg4) / 54);
        while (true) {
            int var14 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var14 + 48 - (int) arg3 * 10));
            if (~arg3 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public final void method902(int arg0) {
        ++field4613;
        if (arg0 != 27906) {
            this.field4587 = null;
        }
        if (this.field4588 != null) {
            this.field4588.method444();
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(Z)V")
    public static final void method1976(boolean arg0) {
        ++field4590;
        class563.method3293(-100);
        class655.method3701((byte) 38);
        if (arg0) {
            method1975(107, 9, false, -89L, 42);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIIZ)V")
    public static final void method1977(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field4591;
        if (~arg2 <= -8001 && arg2 <= 48000) {
            class525.field7704 = arg3;
            class616.field8814 = arg2;
            if (!arg0) {
                method1975(-118, 107, true, 15L, 80);
            }
            class551.field8077 = arg1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILr;B)Z")
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field4609;
        class397 var5 = this.method1970((byte) 83, arg2, 131072);
        int var6 = -54 % ((arg3 - -75) / 40);
        if (var5 != null) {
            class152 var7 = arg2.method777();
            var7.method166(super.field3155, super.field3160, super.field3154);
            return class372.field5162 ? var5.method482(arg0, arg1, var7, false, class450.field6494) : var5.method469(arg0, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(ILr;)Leh;")
    public final class203 method631(int arg0, class98 arg1) {
        if (this.field4587 == null) {
            this.field4587 = class420.method2486(super.field3155, super.field3160, super.field3154, this.method1970((byte) 83, arg1, 0), arg0 ^ 22673);
        }
        if (arg0 != 1) {
            this.method902(8);
        }
        ++field4611;
        return this.field4587;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final int method903(int arg0) {
        ++field4615;
        if (arg0 <= 76) {
            this.field4592 = -98;
        }
        return this.field4603 & 65535;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        if (arg0 != -15258) {
            return false;
        } else {
            ++field4597;
            return this.field4598;
        }
    }

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        ++field4606;
        if (arg0 != 96) {
            this.method908(false);
        }
        this.field4598 = false;
        if (this.field4588 != null) {
            this.field4588.method438(this.field4588.method468() & -65537);
        }
    }
}
