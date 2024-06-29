import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class206 {

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
    public boolean field3173 = false;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    private int field3167 = 128;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    private int field3168 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public int field3166 = -1;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Z")
    public boolean field3180 = false;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    private int field3177 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private int field3159 = 128;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    private int field3179 = 0;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
    public static int[] field3170 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[S")
    private short[] field3164;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[S")
    private short[] field3172;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[S")
    private short[] field3175;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[S")
    private short[] field3181;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Ldl;")
    public static final class127 method1439(int arg0, int arg1) {
        field3182++;
        int var2 = -19 / ((arg0 + 41) / 34);
        class127 var3 = (class127) class49.field806.method1173((long) arg1, true);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class223.field3579.method721((byte) -117, 16, arg1);
        class127 var5 = new class127();
        if (var4 != null) {
            var5.method950(true, new class31(var4));
        }
        class49.field806.method1167((byte) 108, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIJIZ)Ljava/lang/String;")
    public static final String method1440(int arg0, int arg1, long arg2, int arg3, boolean arg4) {
        field3161++;
        char var6 = '.';
        char var7 = ',';
        if (arg0 == 0) {
            var7 = '.';
            var6 = ',';
        }
        if (arg0 == 2) {
            var6 = ' ';
        }
        boolean var8 = false;
        StringBuffer var9 = new StringBuffer(26);
        if ((long) arg3 > arg2) {
            var8 = true;
            arg2 = -arg2;
        }
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var7);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg2 * 10));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILha;)V")
    private final void method1441(int arg0, int arg1, class31 arg2) {
        field3160++;
        if (arg0 < 45) {
            field3170 = null;
        }
        if (arg1 == 1) {
            this.field3171 = arg2.method260((byte) -67);
        } else if (arg1 == 2) {
            this.field3166 = arg2.method260((byte) -67);
        } else if (arg1 == 4) {
            this.field3159 = arg2.method260((byte) -67);
        } else if (arg1 == 5) {
            this.field3167 = arg2.method260((byte) -67);
        } else if (arg1 == 6) {
            this.field3179 = arg2.method260((byte) -67);
        } else if (arg1 == 7) {
            this.field3177 = arg2.method265(-127);
        } else if (arg1 == 8) {
            this.field3168 = arg2.method265(-107);
        } else if (arg1 == 9) {
            this.field3173 = true;
        } else if (arg1 == 10) {
            this.field3180 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method265(-120);
            this.field3175 = new short[var4];
            this.field3172 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3172[var5] = (short) arg2.method260((byte) -67);
                this.field3175[var5] = (short) arg2.method260((byte) -67);
            }
            return;
        } else if (arg1 == 41) {
            int var6 = arg2.method265(-91);
            this.field3164 = new short[var6];
            this.field3181 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3181[var7] = (short) arg2.method260((byte) -67);
                this.field3164[var7] = (short) arg2.method260((byte) -67);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V")
    public static final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3163++;
        class198 var5 = (class198) class94.field1480.method2043((long) arg1, -1);
        if (var5 == null) {
            var5 = new class198();
            class94.field1480.method2046(var5, -44, (long) arg1);
        }
        if (arg0 != 10427) {
            return;
        }
        if (var5.field3086.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field3086.length; var8++) {
                var7[var8] = var5.field3086[var8];
                var6[var8] = var5.field3078[var8];
            }
            for (int var9 = var5.field3086.length; var9 < arg3; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field3078 = var6;
            var5.field3086 = var7;
        }
        var5.field3086[arg3] = arg2;
        var5.field3078[arg3] = arg4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Lhd;")
    public final class11 method1443(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 10) {
            return null;
        }
        class11 var5 = (class11) class128.field1913.method1173((long) this.field3158, true);
        field3176++;
        if (var5 == null) {
            class271 var6 = class271.method1859(class259.field4108, this.field3171, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3172 != null) {
                for (int var7 = 0; var7 < this.field3172.length; var7++) {
                    var6.method1847(this.field3172[var7], this.field3175[var7]);
                }
            }
            if (this.field3181 != null) {
                for (int var8 = 0; var8 < this.field3181.length; var8++) {
                    var6.method1858(this.field3181[var8], this.field3164[var8]);
                }
            }
            var5 = var6.method1844(this.field3177 + 64, this.field3168 + 850, -30, -50, -30);
            class128.field1913.method1167((byte) -66, var5, (long) this.field3158);
        }
        class11 var9;
        if (this.field3166 == -1 || arg3 == -1) {
            var9 = var5.method68(true, true, true);
        } else {
            var9 = class250.method1700(this.field3166, -90).method783(arg3, (byte) -108, arg0, arg2, var5);
        }
        if (this.field3159 != 128 || this.field3167 != 128) {
            var9.method64(this.field3159, this.field3167, this.field3159);
        }
        if (this.field3179 != 0) {
            if (this.field3179 == 90) {
                var9.method77();
            }
            if (this.field3179 == 180) {
                var9.method73();
            }
            if (this.field3179 == 270) {
                var9.method78();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILha;)V")
    public final void method1444(int arg0, class31 arg1) {
        int var3 = 75 / ((arg0 + 40) / 50);
        field3162++;
        while (true) {
            int var4 = arg1.method265(-88);
            if (var4 == 0) {
                return;
            }
            this.method1441(53, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBLcc;IIII)V")
    public static final void method1445(int arg0, int arg1, byte arg2, class222 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class190.field2979) {
            class297.field4789 = 32;
        } else {
            class297.field4789 = 0;
        }
        field3165++;
        class190.field2979 = false;
        if (class155.field2312 != 0) {
            if (arg1 >= arg5 && arg5 + 16 > arg1 && arg7 <= arg0 && arg7 + 16 > arg0) {
                arg3.field3569 -= 4;
                class80.method628((byte) -112, arg3);
            } else if (arg1 >= arg5 && arg5 + 16 > arg1 && arg0 >= (arg6 + arg7 - 16) && arg0 < arg6 + arg7) {
                arg3.field3569 += 4;
                class80.method628((byte) -102, arg3);
            } else if (arg1 >= arg5 - class297.field4789 && arg1 < class297.field4789 + arg5 + 16 && (arg7 + 16) <= arg0 && (arg6 + arg7 - 16) > arg0) {
                int var8 = (arg6 - 32) * arg6 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - arg7 - var8 / 2 - 16;
                int var10 = arg6 - var8 - 32;
                arg3.field3569 = (arg4 - arg6) * var9 / var10;
                class80.method628((byte) -97, arg3);
                class190.field2979 = true;
            }
        }
        if (class8.field133 != 0) {
            int var11 = arg3.field3408;
            if ((arg5 - var11) <= arg1 && arg7 <= arg0 && (arg5 + 16) > arg1 && arg6 + arg7 >= arg0) {
                arg3.field3569 += class8.field133 * 45;
                class80.method628((byte) -70, arg3);
            }
        }
        int var12 = 16 / ((49 - arg2) / 58);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkc;B)V")
    public static final void method1446(class296 arg0, byte arg1) {
        class241 var2 = arg0.method1982((byte) -93);
        if (arg1 != 27) {
            return;
        }
        arg0.field4736 = var2.field3872;
        field3178++;
        if (arg0.field4743 == 0) {
            arg0.field4745 = 0;
            return;
        }
        if (arg0.field4727 != -1 && arg0.field4701 == 0) {
            class103 var3 = class250.method1700(arg0.field4727, -114);
            if (arg0.field4700 > 0 && var3.field1594 == 0) {
                arg0.field4745++;
                return;
            }
            if (arg0.field4700 <= 0 && var3.field1600 == 0) {
                arg0.field4745++;
                return;
            }
        }
        if (arg0.field4732 != -1 && class41.field686 >= arg0.field4750) {
            class206 var4 = class86.method654(arg0.field4732, 116);
            if (var4.field3180 && var4.field3166 != -1) {
                class103 var5 = class250.method1700(var4.field3166, arg1 - 43);
                if (arg0.field4700 > 0 && var5.field1594 == 0) {
                    arg0.field4745++;
                    return;
                }
                if (arg0.field4700 <= 0 && var5.field1600 == 0) {
                    arg0.field4745++;
                    return;
                }
            }
        }
        int var6 = arg0.field4725;
        int var7 = arg0.field4709;
        int var8 = arg0.field4749[arg0.field4743 - 1] * 128 + (arg0.method1013(0) * 64);
        int var9 = arg0.field4673[arg0.field4743 - 1] * 128 + (arg0.method1013(0) * 64);
        if ((var8 - var6) > 256 || (var8 - var6) < -256 || (var9 - var7) > 256 || var9 - var7 < -256) {
            arg0.field4709 = var9;
            arg0.field4725 = var8;
            return;
        }
        if (var8 <= var6) {
            if (var8 >= var6) {
                if (var7 < var9) {
                    arg0.field4696 = 1024;
                } else if (var9 < var7) {
                    arg0.field4696 = 0;
                }
            } else if (var9 > var7) {
                arg0.field4696 = 768;
            } else if (var9 < var7) {
                arg0.field4696 = 256;
            } else {
                arg0.field4696 = 512;
            }
        } else if (var7 < var9) {
            arg0.field4696 = 1280;
        } else if (var7 <= var9) {
            arg0.field4696 = 1536;
        } else {
            arg0.field4696 = 1792;
        }
        int var10 = arg0.field4696 - arg0.field4719 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var11 = var2.field3870;
        int var12 = 4;
        boolean var13 = true;
        byte var14 = 1;
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field3851;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field3862;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field3866;
        }
        if (var11 == -1) {
            var11 = var2.field3851;
        }
        arg0.field4736 = var11;
        if (arg0 instanceof class161) {
            var13 = ((class161) arg0).field2421.field1492;
        }
        if (var13) {
            if (arg0.field4719 != arg0.field4696 && arg0.field4702 == -1 && arg0.field4667 != 0) {
                var12 = 2;
            }
            if (arg0.field4743 > 2) {
                var12 = 6;
            }
            if (arg0.field4743 > 3) {
                var12 = 8;
            }
            if (arg0.field4745 > 0 && arg0.field4743 > 1) {
                var12 = 8;
                arg0.field4745--;
            }
        } else {
            if (arg0.field4743 > 1) {
                var12 = 6;
            }
            if (arg0.field4743 > 2) {
                var12 = 8;
            }
            if (arg0.field4745 > 0 && arg0.field4743 > 1) {
                var12 = 8;
                arg0.field4745--;
            }
        }
        if (arg0.field4670[arg0.field4743 - 1] == 2) {
            var14 = 2;
            var12 <<= 0x1;
        } else if (arg0.field4670[arg0.field4743 - 1] == 0) {
            var14 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var2.field3844 == -1) {
            if (var2.field3835 != -1 && var14 == 0) {
                if (arg0.field4736 == var2.field3870 && var2.field3840 != -1) {
                    arg0.field4736 = var2.field3840;
                } else if (arg0.field4736 == var2.field3866 && var2.field3834 != -1) {
                    arg0.field4736 = var2.field3834;
                } else if (arg0.field4736 == var2.field3862 && var2.field3837 != -1) {
                    arg0.field4736 = var2.field3837;
                } else {
                    arg0.field4736 = var2.field3835;
                }
            }
        } else if (arg0.field4736 == var2.field3870 && var2.field3855 != -1) {
            arg0.field4736 = var2.field3855;
        } else if (arg0.field4736 == var2.field3866 && var2.field3842 != -1) {
            arg0.field4736 = var2.field3842;
        } else if (arg0.field4736 == var2.field3862 && var2.field3843 != -1) {
            arg0.field4736 = var2.field3843;
        } else {
            arg0.field4736 = var2.field3844;
        }
        if (var2.field3853 != -1) {
            int var15 = var12 << 7;
            if (arg0.field4743 == 1) {
                int var16 = (arg0.field4725 <= var8 ? var8 - arg0.field4725 : -var8 + arg0.field4725) << 7;
                int var17 = arg0.field4755 * arg0.field4755;
                int var18 = (arg0.field4709 <= var9 ? var9 - arg0.field4709 : arg0.field4709 - var9) << 7;
                int var19 = var16 > var18 ? var16 : var18;
                int var20 = var2.field3853 * 2 * var19;
                if (var20 < var17) {
                    arg0.field4755 /= 2;
                } else if (var17 / 2 > var19) {
                    arg0.field4755 -= var2.field3853;
                    if (arg0.field4755 < 0) {
                        arg0.field4755 = 0;
                    }
                } else if (var15 > arg0.field4755) {
                    arg0.field4755 += var2.field3853;
                    if (var15 < arg0.field4755) {
                        arg0.field4755 = var15;
                    }
                }
            } else if (arg0.field4755 < var15) {
                arg0.field4755 += var2.field3853;
                if (var15 < arg0.field4755) {
                    arg0.field4755 = var15;
                }
            } else if (arg0.field4755 > 0) {
                arg0.field4755 -= var2.field3853;
                if (arg0.field4755 < 0) {
                    arg0.field4755 = 0;
                }
            }
            var12 = arg0.field4755 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var9 > var7) {
            arg0.field4709 += var12;
            if (var9 < arg0.field4709) {
                arg0.field4709 = var9;
            }
        } else if (var9 < var7) {
            arg0.field4709 -= var12;
            if (arg0.field4709 < var9) {
                arg0.field4709 = var9;
            }
        }
        if (var8 > var6) {
            arg0.field4725 += var12;
            if (var8 < arg0.field4725) {
                arg0.field4725 = var8;
            }
        } else if (var8 < var6) {
            arg0.field4725 -= var12;
            if (arg0.field4725 < var8) {
                arg0.field4725 = var8;
            }
        }
        if (arg0.field4725 != var8 || arg0.field4709 != var9) {
            return;
        }
        arg0.field4743--;
        if (arg0.field4700 > 0) {
            arg0.field4700--;
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1447(int arg0) {
        field3170 = null;
        int var1 = -46 / ((arg0 - 50) / 33);
    }
}
