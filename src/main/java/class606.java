import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class606 {

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public int field8708 = -1;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public int field8711 = -1;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public int field8710 = 2;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "Z")
    public boolean field8715 = false;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "Z")
    public boolean field8717 = false;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public int field8716 = 5;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
    public boolean field8703 = false;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public int field8713 = -1;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public int field8724 = 99;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public int field8721 = -1;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "Z")
    public boolean field8726 = false;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public int field8727 = -1;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    public int field8725;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "Loq;")
    public class205 field8718;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "Lfda;")
    public static class628 field8722;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
    public int[] field8699;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "[I")
    public int[] field8700;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "[I")
    public int[] field8705;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "[I")
    public int[] field8707;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
    public int[] field8709;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "[I")
    private int[] field8712;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[Z")
    public boolean[] field8704;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "[[I")
    public int[][] field8723;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
    public static final boolean method3445(int arg0, int arg1, int arg2) {
        if (arg0 == 24916) {
            field8702++;
            return (arg1 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method3446(int arg0) {
        field8722 = null;
        if (arg0 != 31608) {
            field8722 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIILda;I)Lda;")
    public final class397 method3447(int arg0, int arg1, int arg2, int arg3, class397 arg4, int arg5) {
        field8701++;
        int var7 = this.field8699[arg2];
        int var8 = this.field8707[arg2];
        class374 var9 = this.field8718.method1421((byte) 123, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method475((byte) 1, arg0, true);
        }
        class374 var11 = null;
        if ((this.field8703 || class61.field888) && arg1 != -1 && this.field8707.length > arg1) {
            int var12 = this.field8707[arg1];
            var11 = this.field8718.method1421((byte) 105, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class374 var13 = null;
        class374 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field8712 != null) {
            if (arg2 < this.field8712.length) {
                var15 = this.field8712[arg2];
                if (var15 != 65535) {
                    var13 = this.field8718.method1421((byte) 53, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field8703 || class61.field888) && arg1 != -1 && this.field8712.length > arg1) {
                var16 = this.field8712[arg1];
                if (var16 != 65535) {
                    var14 = this.field8718.method1421((byte) 78, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field8717) {
            arg0 |= 0x200;
        }
        if (var9.method2238(arg3 + 15256, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method2234(var10, (byte) 61)) {
            arg0 |= 0x100;
        }
        if (var9.method2235(-29895, var10)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2238(arg3 ^ 0xFFFFC468, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method2234(var15, (byte) 61)) {
                arg0 |= 0x100;
            }
            if (var13.method2235(-29895, var15)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2238(1, arg1)) {
                arg0 |= 0x80;
            }
            if (var11.method2234(arg1, (byte) 61)) {
                arg0 |= 0x100;
            }
            if (var11.method2235(arg3 - 14640, arg1)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2238(1, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method2234(var16, (byte) 61)) {
                arg0 |= 0x100;
            }
            if (var14.method2235(-29895, var16)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        if (arg3 != -15255) {
            return null;
        }
        class397 var18 = arg4.method475((byte) 1, var17, true);
        var18.method2418(0, this.field8717, var7, var11, arg1, arg5 - 1, -1, var10, var9);
        if (var13 != null) {
            var18.method2418(0, this.field8717, var7, var14, var16, arg5 - 1, arg3 ^ 0x3B96, var15, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public final void method3448(byte arg0) {
        if (this.field8713 == -1) {
            if (this.field8704 == null) {
                this.field8713 = 0;
            } else {
                this.field8713 = 2;
            }
        }
        int var2 = -41 % ((-arg0 - 35) / 39);
        field8698++;
        if (this.field8708 != -1) {
            return;
        }
        if (this.field8704 == null) {
            this.field8708 = 0;
        } else {
            this.field8708 = 2;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILda;BIIIII)Lda;")
    public final class397 method3449(int arg0, class397 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8719++;
        int var9 = this.field8699[arg3];
        if (arg4 != 27020) {
            this.field8712 = null;
        }
        int var10 = this.field8707[arg3];
        class374 var11 = this.field8718.method1421((byte) 94, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method475(arg2, arg5, true);
        }
        class374 var13 = null;
        if ((this.field8703 || class61.field888) && arg7 != -1 && arg7 < this.field8707.length) {
            int var14 = this.field8707[arg7];
            var13 = this.field8718.method1421((byte) 35, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field8717) {
            arg5 |= 0x200;
        }
        if (var11.method2238(1, var12)) {
            arg5 |= 0x80;
        }
        if (var11.method2234(var12, (byte) 61)) {
            arg5 |= 0x100;
        }
        if (var11.method2235(-29895, var12)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2238(1, arg7)) {
                arg5 |= 0x80;
            }
            if (var13.method2234(arg7, (byte) 61)) {
                arg5 |= 0x100;
            }
            if (var13.method2235(arg4 - 56915, arg7)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        class397 var16 = arg1.method475(arg2, var15, true);
        var16.method2418(arg6, this.field8717, var9, var13, arg7, arg0 - 1, arg4 ^ 0xFFFF9673, var12, var11);
        return var16;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILek;)V")
    public final void method3450(int arg0, class465 arg1) {
        if (arg0 < 95) {
            return;
        }
        field8720++;
        while (true) {
            int var3 = arg1.method2705(-95);
            if (var3 == 0) {
                return;
            }
            this.method3451(var3, arg1, 65);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILek;I)V")
    private final void method3451(int arg0, class465 arg1, int arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method2755((byte) -98);
            this.field8699 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8699[var5] = arg1.method2755((byte) -94);
            }
            this.field8707 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field8707[var6] = arg1.method2755((byte) -128);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field8707[var7] = (arg1.method2755((byte) -111) << 16) + this.field8707[var7];
            }
        } else if (arg0 == 2) {
            this.field8721 = arg1.method2755((byte) -115);
        } else if (arg0 == 3) {
            this.field8704 = new boolean[256];
            int var8 = arg1.method2705(-73);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field8704[arg1.method2705(-56)] = true;
            }
        } else if (arg0 == 5) {
            this.field8716 = arg1.method2705(-32);
        } else if (arg0 == 6) {
            this.field8711 = arg1.method2755((byte) -102);
        } else if (arg0 == 7) {
            this.field8727 = arg1.method2755((byte) -112);
        } else if (arg0 == 8) {
            this.field8724 = arg1.method2705(-51);
        } else if (arg0 == 9) {
            this.field8708 = arg1.method2705(-78);
        } else if (arg0 == 10) {
            this.field8713 = arg1.method2705(-69);
        } else if (arg0 == 11) {
            this.field8710 = arg1.method2705(-70);
        } else if (arg0 == 12) {
            int var17 = arg1.method2705(-73);
            this.field8712 = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                this.field8712[var18] = arg1.method2755((byte) -80);
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field8712[var19] += arg1.method2755((byte) -69) << 16;
            }
        } else if (arg0 == 13) {
            int var10 = arg1.method2755((byte) -94);
            this.field8723 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method2705(-48);
                if (var12 > 0) {
                    this.field8723[var11] = new int[var12];
                    this.field8723[var11][0] = arg1.method2714(true);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field8723[var11][var13] = arg1.method2755((byte) -92);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field8717 = true;
        } else if (arg0 == 15) {
            this.field8703 = true;
        } else if (arg0 == 16) {
            this.field8726 = true;
        } else if (arg0 == 18) {
            this.field8715 = true;
        } else if (arg0 == 19) {
            if (this.field8705 == null) {
                this.field8705 = new int[this.field8723.length];
                for (int var16 = 0; var16 < this.field8723.length; var16++) {
                    this.field8705[var16] = 255;
                }
            }
            this.field8705[arg1.method2705(-46)] = arg1.method2705(-60);
        } else if (arg0 == 20) {
            if (this.field8700 == null || this.field8709 == null) {
                this.field8700 = new int[this.field8723.length];
                this.field8709 = new int[this.field8723.length];
                for (int var14 = 0; var14 < this.field8723.length; var14++) {
                    this.field8700[var14] = 256;
                    this.field8709[var14] = 256;
                }
            }
            int var15 = arg1.method2705(-18);
            this.field8700[var15] = arg1.method2755((byte) -79);
            this.field8709[var15] = arg1.method2755((byte) -94);
        }
        field8706++;
        if (arg2 < 32) {
            this.field8700 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIIZ)I")
    public final int method3452(byte arg0, int arg1, int arg2, boolean arg3) {
        field8714++;
        int var5 = 0;
        if (arg0 != 29) {
            this.field8709 = null;
        }
        int var6 = 0;
        int var7 = this.field8707[arg2];
        class374 var8 = null;
        class374 var9 = this.field8718.method1421((byte) 92, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field8703 || class61.field888) && arg1 != -1 && arg1 < this.field8707.length) {
            int var11 = this.field8707[arg1];
            var8 = this.field8718.method1421((byte) 43, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field8717) {
            var5 |= 0x200;
        }
        if (var9.method2238(1, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2234(var10, (byte) 61)) {
            var5 |= 0x100;
        }
        if (var9.method2235(-29895, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2238(1, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2234(var6, (byte) 61)) {
                var5 |= 0x100;
            }
            if (var8.method2235(-29895, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field8712 != null && arg3) {
            if (this.field8712.length > arg2) {
                int var12 = this.field8712[arg2];
                if (var12 != 65535) {
                    class374 var13 = this.field8718.method1421((byte) 96, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2238(1, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2234(var14, (byte) 61)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2235(-29895, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field8703 || class61.field888) && arg1 != -1 && arg1 < this.field8712.length) {
                int var15 = this.field8712[arg1];
                if (var15 != 65535) {
                    class374 var16 = this.field8718.method1421((byte) 35, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2238(1, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2234(var17, (byte) 61)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2235(-29895, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
