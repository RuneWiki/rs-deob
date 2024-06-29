import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class516 implements class392 {

    @OriginalMember(owner = "client!to", name = "kb", descriptor = "Z")
    private boolean field109 = false;

    @OriginalMember(owner = "client!to", name = "bb", descriptor = "Lek;")
    public class535 field100;

    @OriginalMember(owner = "client!to", name = "ob", descriptor = "Z")
    private boolean field113;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "[I")
    public static int[] field94 = new int[4];

    @OriginalMember(owner = "client!to", name = "cb", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!to", name = "db", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!to", name = "eb", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!to", name = "fb", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!to", name = "gb", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!to", name = "hb", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!to", name = "ib", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!to", name = "jb", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!to", name = "lb", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!to", name = "mb", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "Lel;")
    private class574 field99;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "(I)Z", line = 4)
    public final boolean method59(int arg0) {
        if (arg0 != -1) {
            this.field100 = null;
        }
        ++field91;
        return false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;Lwea;ZIIII)V", line = 17)
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 > -16) {
            this.method66(34);
        }
        ++field92;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!to", name = "k", descriptor = "(I)Z", line = 30)
    public final boolean method21(int arg0) {
        ++field93;
        return arg0 != 0 ? true : this.field109;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILgga;II)V", line = 44)
    public static final void method61(int arg0, int arg1, class309 arg2, int arg3, int arg4) {
        ++field105;
        long var5 = (long) (arg4 | arg1 << 28 | arg0 << 14);
        class193 var7 = (class193) class558.field7516.method3953(var5, arg3 ^ -15);
        if (var7 == null) {
            class193 var8 = new class193();
            class558.field7516.method3962(var5, var8, -106);
            var8.field2590.method2545(arg3 ^ 126, arg2);
        } else {
            class322 var9 = class770.field10602.method2467(-14, arg2.field4453);
            if (arg3 != -1) {
                method62(126);
            }
            int var10 = var9.field4630;
            if (var9.field4658 == 1) {
                var10 = (arg2.field4455 - -1) * var10;
            }
            for (class309 var11 = (class309) var7.field2590.method2551((byte) -108); var11 != null; var11 = (class309) var7.field2590.method2542(arg3 + -99)) {
                class322 var12 = class770.field10602.method2467(arg3 ^ -122, var11.field4453);
                int var13 = var12.field4630;
                if (var12.field4658 == 1) {
                    var13 = (var11.field4455 + 1) * var13;
                }
                if (~var13 > ~var10) {
                    class274.method1781(arg2, 9476, var11);
                    return;
                }
            }
            var7.field2590.method2545(-127, arg2);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILha;)Z", line = 97)
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field106;
        class500 var5 = this.field100.method3054(true, arg3, false, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != 4161) {
                field86 = 100;
            }
            class303 var6 = arg3.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            return class200.field2658 ? var5.method311(arg2, arg1, var6, false, 0, class330.field4773) : var5.method291(arg2, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I", line = 119)
    public final int method18(int arg0) {
        if (arg0 != -10908) {
            this.method59(-6);
        }
        ++field89;
        return this.field100.field7283;
    }

    @OriginalMember(owner = "client!to", name = "o", descriptor = "(I)V", line = 130)
    public static void method62(int arg0) {
        field94 = null;
        if (arg0 != -1) {
            field94 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I", line = 145)
    public final int method17(int arg0) {
        if (arg0 != -2132) {
            this.method60((class65) null, (class167) null, true, -101, 35, 23, -55);
        }
        ++field97;
        return this.field100.field7293;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;B)Lel;", line = 157)
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            this.field109 = false;
        }
        ++field110;
        return this.field99;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLha;)V", line = 171)
    public final void method32(byte arg0, class65 arg1) {
        ++field108;
        class500 var3 = this.field100.method3054(true, arg1, true, 262144, true);
        if (var3 != null) {
            int var4 = super.field2257 >> 9;
            int var5 = super.field2259 >> 9;
            class303 var6 = arg1.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            this.field100.method3061(arg1, false, var4, var5, var5, var4, var6, var3, (byte) 96);
        }
        if (arg0 <= 69) {
            this.field99 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILhj;)V", line = 195)
    public final void method63(int arg0, class596 arg1) {
        this.field100.method3060(-1090, arg1);
        ++field101;
        if (arg0 != 131072) {
            method65(-93);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIILha;)V", line = 207)
    public static final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class65 arg7) {
        arg7.method462(66, arg3, arg0, arg5, arg6, arg4);
        if (arg1 <= 68) {
            field86 = 59;
        }
        ++field112;
        arg7.method462(-110, arg3 + -2, arg0 + 1, 16, arg6 + 1, arg2);
        arg7.method471(arg0 - -18, (byte) 40, arg5 + -19, arg2, arg6 + 1, arg3 - 2);
    }

    @OriginalMember(owner = "client!to", name = "p", descriptor = "(I)V", line = 220)
    public static final void method65(int arg0) {
        ++field96;
        class139 var1 = (class139) class496.field6853.method2551((byte) -108);
        if (arg0 > -102) {
            method61(-19, 28, (class309) null, -104, 109);
        }
        while (var1 != null) {
            if (!var1.field2020) {
                var1.field2023 = true;
                if (~var1.field2034 <= -1 && ~var1.field2033 <= -1 && class597.field8132 > var1.field2034 && ~class628.field8800 < ~var1.field2033) {
                    class719.method4016(var1, -3361);
                }
            } else {
                var1.method792((byte) -104);
            }
            var1 = (class139) class496.field6853.method2542(-116);
        }
        for (class139 var2 = (class139) class583.field7785.method2551((byte) -108); var2 != null; var2 = (class139) class583.field7785.method2542(-106)) {
            if (var2.field2020) {
                var2.method792((byte) -117);
            } else {
                var2.field2023 = true;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "m", descriptor = "(I)I", line = 261)
    public final int method24(int arg0) {
        if (arg0 != 748449288) {
            this.method19(71);
        }
        ++field103;
        return this.field100.method3056((byte) 126);
    }

    @OriginalMember(owner = "client!to", name = "l", descriptor = "(I)I", line = 275)
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            this.field109 = false;
        }
        ++field90;
        return this.field100.method3057((byte) 122);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILha;)Ldfa;", line = 288)
    public final class176 method22(int arg0, class65 arg1) {
        ++field107;
        class500 var3 = this.field100.method3054(true, arg1, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -10) {
                this.method66(47);
            }
            class303 var4 = arg1.method450();
            var4.method981(super.field2257, super.field2246, super.field2259);
            class176 var5 = class567.method3167(this.field113, arg0 + 10, 1);
            int var6 = super.field2257 >> 9;
            int var7 = super.field2259 >> 9;
            this.field100.method3061(arg1, true, var6, var7, var7, var6, var4, var3, (byte) 118);
            if (!class200.field2658) {
                var3.method292(var4, var5.field2345[0], 0);
            } else {
                var3.method300(var4, var5.field2345[0], class330.field4773, 0);
            }
            if (this.field100.field7277 != null) {
                class515 var8 = this.field100.field7277.method3671();
                if (class200.field2658) {
                    arg1.method532(var8, class330.field4773);
                } else {
                    arg1.method524(var8);
                }
            }
            this.field109 = var3.method326() || this.field100.field7277 != null;
            if (this.field99 != null) {
                class419.method2584(var3, this.field99, super.field2246, super.field2259, super.field2257, 1);
            } else {
                this.field99 = class321.method2038(arg0 ^ 23537, var3, super.field2259, super.field2257, super.field2246);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!to", name = "j", descriptor = "(I)V", line = 339)
    public final void method66(int arg0) {
        if (arg0 == -13514) {
            ++field87;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lha;I)V", line = 351)
    public final void method20(class65 arg0, int arg1) {
        if (arg1 == -4947) {
            this.field100.method3066((byte) -125, arg0);
            ++field102;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIII)V", line = 391)
    public class8(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class514.method2989((byte) -43, arg8, arg9));
        this.field100 = new class535(arg0, arg1, arg8, arg9, super.field2250, arg3, this, arg7, arg10);
        this.field113 = ~arg1.field7933 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Z", line = 365)
    public final boolean method30(int arg0) {
        if (arg0 < 59) {
            return true;
        } else {
            ++field111;
            return this.field100.method3065(-1);
        }
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)I", line = 379)
    public final int method31(int arg0) {
        ++field98;
        return arg0 != -23356 ? 39 : this.field100.field7278;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V", line = 401)
    public final void method25(int arg0) {
        ++field88;
        if (arg0 != 14667) {
            this.method19(18);
        }
    }

    @OriginalMember(owner = "client!to", name = "h", descriptor = "(I)Z", line = 412)
    public final boolean method19(int arg0) {
        ++field95;
        return arg0 > -87;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lha;I)V", line = 425)
    public final void method34(class65 arg0, int arg1) {
        this.field100.method3063(arg1 + 18310, arg0);
        ++field104;
        if (arg1 != -4351) {
            this.method18(7);
        }
    }
}
