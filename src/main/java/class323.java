import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class323 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    private int field5002 = 128;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    private int field5005 = 0;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
    public boolean field5008 = false;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
    public boolean field5018 = false;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    private int field5026 = 0;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field5011 = -1;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    private int field5025 = 0;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    private int field5027 = 128;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[S")
    public static short[] field5012 = new short[256];

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "[C")
    public static char[] field5017 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "[I")
    public static int[] field5013 = new int[100];

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "Ljava/lang/String;")
    public static String field5028 = "Face here";

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field5020;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    private int field5022;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Li;")
    public static class15 field5006;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lak;")
    public static class172 field5003;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "[S")
    private short[] field5014;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "[S")
    private short[] field5016;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[S")
    private short[] field5019;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[S")
    private short[] field5024;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[[[B")
    public static byte[][][] field5021;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[[[I")
    public static int[][][] field5007;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)I", line = 35)
    public static final int method2261(boolean arg0, int arg1) {
        field5010++;
        long var2 = class283.method2038((byte) 124);
        for (class253 var4 = arg0 ? (class253) class182.field3004.method458((byte) -16) : (class253) class182.field3004.method455((byte) -90); var4 != null; var4 = (class253) class182.field3004.method455((byte) 78)) {
            if ((var4.field4039 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4039 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2744;
                    class70.field991[var5] = class335.field5232[var5];
                    var4.method1212((byte) 102);
                    return var5;
                }
                var4.method1212((byte) 69);
            }
        }
        if (arg1 < 25) {
            return 120;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZII[Lac;[B)V", line = 80)
    public static final void method2262(byte arg0, boolean arg1, int arg2, int arg3, class108[] arg4, byte[] arg5) {
        class44 var6 = new class44(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method260(8);
            if (var8 == 0) {
                int var21 = -34 % ((-arg0 - 75) / 39);
                field5004++;
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method281(-73);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = (var9 & 0xFF5) >> 6;
                int var12 = var9 >> 12;
                int var13 = var9 & 0x3F;
                int var14 = var6.method286((byte) -81);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var11 + arg3;
                int var18 = arg2 + var13;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class108 var19 = null;
                    if (!arg1) {
                        int var20 = var12;
                        if ((class129.field2025[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class277.method2009(var7, !arg1, var18, var15, var17, var12, var19, arg1, (byte) -79, var12, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 151)
    public static void method2263(int arg0) {
        field5017 = null;
        field5007 = (int[][][]) null;
        field5021 = (byte[][][]) null;
        field5013 = null;
        int var1 = -124 / ((arg0 - 16) / 46);
        field5003 = null;
        field5006 = null;
        field5028 = null;
        field5012 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLrf;)V", line = 171)
    public static final void method2264(byte arg0, class263 arg1) {
        if (arg0 != -6) {
            return;
        }
        class17 var2 = arg1.method1876((byte) 125);
        arg1.field4232 = var2.field200;
        field5023++;
        if (arg1.field4251 == 0) {
            arg1.field4239 = 0;
            return;
        }
        if (arg1.field4268 != -1 && arg1.field4190 == 0) {
            class202 var3 = class325.method2274(arg1.field4268, -118);
            if (arg1.field4279 > 0 && var3.field3305 == 0) {
                arg1.field4239++;
                return;
            }
            if (arg1.field4279 <= 0 && var3.field3285 == 0) {
                arg1.field4239++;
                return;
            }
        }
        if (arg1.field4278 != -1 && class240.field3818 >= arg1.field4236) {
            class323 var4 = class215.method1545(arg1.field4278, 1);
            if (var4.field5008 && var4.field5011 != -1) {
                class202 var5 = class325.method2274(var4.field5011, arg0 - 86);
                if (arg1.field4279 > 0 && var5.field3305 == 0) {
                    arg1.field4239++;
                    return;
                }
                if (arg1.field4279 <= 0 && var5.field3285 == 0) {
                    arg1.field4239++;
                    return;
                }
            }
        }
        int var6 = arg1.field4264;
        int var7 = arg1.field4255;
        int var8 = arg1.field4248[arg1.field4251 - 1] * 128 + arg1.method1881(-20395) * 64;
        int var9 = arg1.field4184[arg1.field4251 - 1] * 128 + (arg1.method1881(-20395) * 64);
        if (var8 - var7 > 256 || var8 - var7 < -256 || (var9 - var6) > 256 || (var9 - var6) < -256) {
            arg1.field4255 = var8;
            arg1.field4264 = var9;
            return;
        }
        int var10 = 4;
        if (var8 <= var7) {
            if (var7 > var8) {
                if (var6 < var9) {
                    arg1.field4277 = 768;
                } else if (var9 >= var6) {
                    arg1.field4277 = 512;
                } else {
                    arg1.field4277 = 256;
                }
            } else if (var6 < var9) {
                arg1.field4277 = 1024;
            } else if (var6 > var9) {
                arg1.field4277 = 0;
            }
        } else if (var9 > var6) {
            arg1.field4277 = 1280;
        } else if (var6 > var9) {
            arg1.field4277 = 1792;
        } else {
            arg1.field4277 = 1536;
        }
        int var11 = var2.field215;
        int var12 = arg1.field4277 - arg1.field4196 & 0x7FF;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        boolean var13 = true;
        byte var14 = 1;
        if (var12 >= -256 && var12 <= 256) {
            var11 = var2.field228;
        } else if (var12 >= 256 && var12 < 768) {
            var11 = var2.field204;
        } else if (var12 >= -768 && var12 <= -256) {
            var11 = var2.field221;
        }
        if (var11 == -1) {
            var11 = var2.field228;
        }
        arg1.field4232 = var11;
        if (arg1 instanceof class234) {
            var13 = ((class234) arg1).field3752.field4090;
        }
        if (var13) {
            if (arg1.field4277 != arg1.field4196 && arg1.field4198 == -1 && arg1.field4185 != 0) {
                var10 = 2;
            }
            if (arg1.field4251 > 2) {
                var10 = 6;
            }
            if (arg1.field4251 > 3) {
                var10 = 8;
            }
            if (arg1.field4239 > 0 && arg1.field4251 > 1) {
                var10 = 8;
                arg1.field4239--;
            }
        } else {
            if (arg1.field4251 > 1) {
                var10 = 6;
            }
            if (arg1.field4251 > 2) {
                var10 = 8;
            }
            if (arg1.field4239 > 0 && arg1.field4251 > 1) {
                var10 = 8;
                arg1.field4239--;
            }
        }
        if (arg1.field4246[arg1.field4251 - 1] == 2) {
            var10 <<= 0x1;
            var14 = 2;
        } else if (arg1.field4246[arg1.field4251 - 1] == 0) {
            var10 >>= 0x1;
            var14 = 0;
        }
        if (var10 < 8 || var2.field229 == -1) {
            if (var2.field224 != -1 && var14 == 0) {
                if (arg1.field4232 == var2.field215 && var2.field208 != -1) {
                    arg1.field4232 = var2.field208;
                } else if (arg1.field4232 == var2.field221 && var2.field199 != -1) {
                    arg1.field4232 = var2.field199;
                } else if (arg1.field4232 == var2.field204 && var2.field218 != -1) {
                    arg1.field4232 = var2.field218;
                } else {
                    arg1.field4232 = var2.field224;
                }
            }
        } else if (arg1.field4232 == var2.field215 && var2.field210 != -1) {
            arg1.field4232 = var2.field210;
        } else if (arg1.field4232 == var2.field221 && var2.field202 != -1) {
            arg1.field4232 = var2.field202;
        } else if (arg1.field4232 == var2.field204 && var2.field217 != -1) {
            arg1.field4232 = var2.field217;
        } else {
            arg1.field4232 = var2.field229;
        }
        if (var2.field211 != -1) {
            int var15 = var10 << 7;
            if (arg1.field4251 == 1) {
                int var16 = arg1.field4244 * arg1.field4244;
                int var17 = (arg1.field4264 > var9 ? arg1.field4264 - var9 : var9 - arg1.field4264) << 7;
                int var18 = (arg1.field4255 > var8 ? arg1.field4255 - var8 : var8 - arg1.field4255) << 7;
                int var19 = var18 <= var17 ? var17 : var18;
                int var20 = var2.field211 * 2 * var19;
                if (var16 > var20) {
                    arg1.field4244 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field4244 -= var2.field211;
                    if (arg1.field4244 < 0) {
                        arg1.field4244 = 0;
                    }
                } else if (var15 > arg1.field4244) {
                    arg1.field4244 += var2.field211;
                    if (var15 < arg1.field4244) {
                        arg1.field4244 = var15;
                    }
                }
            } else if (var15 > arg1.field4244) {
                arg1.field4244 += var2.field211;
                if (var15 < arg1.field4244) {
                    arg1.field4244 = var15;
                }
            } else if (arg1.field4244 > 0) {
                arg1.field4244 -= var2.field211;
                if (arg1.field4244 < 0) {
                    arg1.field4244 = 0;
                }
            }
            var10 = arg1.field4244 >> 7;
            if (var10 < 1) {
                var10 = 1;
            }
        }
        if (var8 > var7) {
            arg1.field4255 += var10;
            if (arg1.field4255 > var8) {
                arg1.field4255 = var8;
            }
        } else if (var8 < var7) {
            arg1.field4255 -= var10;
            if (var8 > arg1.field4255) {
                arg1.field4255 = var8;
            }
        }
        if (var9 > var6) {
            arg1.field4264 += var10;
            if (arg1.field4264 > var9) {
                arg1.field4264 = var9;
            }
        } else if (var9 < var6) {
            arg1.field4264 -= var10;
            if (var9 > arg1.field4264) {
                arg1.field4264 = var9;
            }
        }
        if (arg1.field4255 == var8 && arg1.field4264 == var9) {
            if (arg1.field4279 > 0) {
                arg1.field4279--;
            }
            arg1.field4251--;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)Lei;", line = 523)
    public final class262 method2265(int arg0, int arg1, int arg2, int arg3) {
        class262 var5 = (class262) class29.field400.method704((byte) 115, (long) this.field5020);
        int var6 = 113 % ((arg0 + 4) / 43);
        field5015++;
        if (var5 == null) {
            class134 var7 = class134.method997(class129.field2023, this.field5022, 0);
            if (var7 == null) {
                return null;
            }
            if (this.field5019 != null) {
                for (int var8 = 0; var8 < this.field5019.length; var8++) {
                    var7.method987(this.field5019[var8], this.field5016[var8]);
                }
            }
            if (this.field5024 != null) {
                for (int var9 = 0; var9 < this.field5024.length; var9++) {
                    var7.method984(this.field5024[var9], this.field5014[var9]);
                }
            }
            var5 = var7.method988(this.field5005 + 64, 850 - -this.field5025, -30, -50, -30);
            class29.field400.method703(var5, (long) this.field5020, (byte) 62);
        }
        class262 var10;
        if (this.field5011 == -1 || arg3 == -1) {
            var10 = var5.method1191(true, true, true);
        } else {
            var10 = class325.method2274(this.field5011, -117).method1477(arg1, var5, arg3, 1, arg2);
        }
        if (this.field5002 != 128 || this.field5027 != 128) {
            var10.method1196(this.field5002, this.field5027, this.field5002);
        }
        if (this.field5026 != 0) {
            if (this.field5026 == 90) {
                var10.method1169();
            }
            if (this.field5026 == 180) {
                var10.method1190();
            }
            if (this.field5026 == 270) {
                var10.method1176();
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjj;)V", line = 599)
    private final void method2266(int arg0, int arg1, class44 arg2) {
        field5009++;
        if (arg1 == 1) {
            this.field5022 = arg2.method271(21081);
        } else if (arg1 == 2) {
            this.field5011 = arg2.method271(21081);
        } else if (arg1 == 4) {
            this.field5002 = arg2.method271(arg0 ^ 0xFFFFB416);
        } else if (arg1 == 5) {
            this.field5027 = arg2.method271(arg0 + 27658);
        } else if (arg1 == 6) {
            this.field5026 = arg2.method271(arg0 ^ 0xFFFFB416);
        } else if (arg1 == 7) {
            this.field5005 = arg2.method286((byte) -103);
        } else if (arg1 == 8) {
            this.field5025 = arg2.method286((byte) -84);
        } else if (arg1 == 9) {
            this.field5018 = true;
        } else if (arg1 == 10) {
            this.field5008 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method286((byte) -80);
            this.field5016 = new short[var4];
            this.field5019 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5019[var5] = (short) arg2.method271(21081);
                this.field5016[var5] = (short) arg2.method271(21081);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method286((byte) -95);
            this.field5024 = new short[var6];
            this.field5014 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5024[var7] = (short) arg2.method271(21081);
                this.field5014[var7] = (short) arg2.method271(21081);
            }
        }
        if (arg0 != -6577) {
            this.field5014 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljj;Z)V", line = 710)
    public final void method2267(class44 arg0, boolean arg1) {
        if (!arg1) {
            this.method2266(51, 79, (class44) null);
        }
        while (true) {
            int var3 = arg0.method286((byte) -115);
            if (var3 == 0) {
                field5001++;
                return;
            }
            this.method2266(-6577, var3, arg0);
        }
    }
}
