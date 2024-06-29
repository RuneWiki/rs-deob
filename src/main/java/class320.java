import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class320 extends class132 {

    @OriginalMember(owner = "client!c", name = "mc", descriptor = "I")
    public int field4991 = 0;

    @OriginalMember(owner = "client!c", name = "pc", descriptor = "I")
    public int field4994 = 0;

    @OriginalMember(owner = "client!c", name = "uc", descriptor = "I")
    public int field4999 = -1;

    @OriginalMember(owner = "client!c", name = "qc", descriptor = "I")
    public int field4995 = -1;

    @OriginalMember(owner = "client!c", name = "nc", descriptor = "I")
    public int field4992 = 0;

    @OriginalMember(owner = "client!c", name = "lc", descriptor = "I")
    public int field4990 = -1;

    @OriginalMember(owner = "client!c", name = "Bc", descriptor = "I")
    public int field5006 = -1;

    @OriginalMember(owner = "client!c", name = "Gc", descriptor = "I")
    public int field5011 = -1;

    @OriginalMember(owner = "client!c", name = "xc", descriptor = "I")
    public int field5002 = 0;

    @OriginalMember(owner = "client!c", name = "Kc", descriptor = "Z")
    public boolean field5015 = false;

    @OriginalMember(owner = "client!c", name = "Mc", descriptor = "I")
    public int field5017 = -1;

    @OriginalMember(owner = "client!c", name = "Cc", descriptor = "I")
    public int field5007 = 255;

    @OriginalMember(owner = "client!c", name = "Oc", descriptor = "B")
    private byte field5019 = 0;

    @OriginalMember(owner = "client!c", name = "Jc", descriptor = "I")
    public int field5014 = -1;

    @OriginalMember(owner = "client!c", name = "Tc", descriptor = "I")
    public int field5024 = 0;

    @OriginalMember(owner = "client!c", name = "Nc", descriptor = "[I")
    public static int[] field5018 = new int[32];

    @OriginalMember(owner = "client!c", name = "oc", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!c", name = "rc", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!c", name = "tc", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!c", name = "vc", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!c", name = "wc", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!c", name = "Ac", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!c", name = "Dc", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!c", name = "Ec", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!c", name = "Fc", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!c", name = "Hc", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!c", name = "Ic", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!c", name = "Lc", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!c", name = "Pc", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!c", name = "Qc", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!c", name = "Rc", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!c", name = "Sc", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!c", name = "zc", descriptor = "Lsh;")
    public class303 field5004;

    @OriginalMember(owner = "client!c", name = "sc", descriptor = "Lclient;")
    public static client field4997;

    @OriginalMember(owner = "client!c", name = "yc", descriptor = "Ljava/lang/String;")
    public String field5003;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I", line = 6)
    public final int method910(int arg0) {
        if (arg0 != -1) {
            this.field5002 = 97;
        }
        field5000++;
        return this.field5004 == null || this.field5004.field4733 == -1 ? super.method910(-1) : class281.method1993(this.field5004.field4733, -3).field1808;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZ)V", line = 33)
    public final void method2236(int arg0, int arg1, int arg2, boolean arg3) {
        field4993++;
        super.method902(arg3, this.method910(-1), false, arg1, arg0);
        if (arg2 != 18675) {
            this.method2238((class192) null, -25);
        }
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() {
        field5021++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBIILll;IIIIIILlf;II)V", line = 78)
    private final void method2237(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class167 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class134 arg13, int arg14, int arg15) {
        field5001++;
        int var17 = arg12 * arg12 + (arg5 * arg5);
        if (var17 < 16 || arg2 < var17) {
            return;
        }
        if (arg3 > -39) {
            this.field4995 = 60;
        }
        int var18 = (int) (Math.atan2((double) arg12, (double) arg5) * 325.949D) & 0x7FF;
        class134 var19 = class116.method807((byte) -22, arg13, this.field1980, arg11, var18, this.field1944, this.field1943);
        if (var19 == null) {
            return;
        }
        if (!class186.field2991) {
            var19.method153(0, arg4, arg0, arg1, arg7, arg15, arg14, arg9, -1L, arg10, arg6);
            return;
        }
        float var20 = class186.method1305();
        float var21 = class186.method1307();
        class186.method1284();
        class186.method1306(var20, var21 - 150.0F);
        var19.method153(0, arg4, arg0, arg1, arg7, arg15, arg14, arg9, -1L, arg10, arg6);
        class186.method1289();
        class186.method1306(var20, var21);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z", line = 118)
    public final boolean method911(int arg0) {
        int var2 = 2 % ((arg0 - 28) / 63);
        field5016++;
        return this.field5004 != null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lim;I)V", line = 133)
    public final void method2238(class192 arg0, int arg1) {
        field5005++;
        arg0.field3129 = 0;
        int var3 = arg0.method1399(-1172389784);
        int var4 = var3 & 0x1;
        int var5 = super.method910(-1);
        this.method906(((var3 & 0x3B) >> 3) + 1, 114);
        int var6 = -1;
        boolean var7 = (var3 & 0x4) != 0;
        this.field5019 = (byte) ((var3 & 0xF8) >> 6);
        this.field1980 += (this.method910(-1) - var5) * 64;
        this.field1944 += (this.method910(-1) - var5) * 64;
        this.field5014 = arg0.method1377(true);
        this.field4990 = arg0.method1377(true);
        int[] var8 = new int[12];
        if (arg1 > -75) {
            this.method2238((class192) null, -15);
        }
        this.field4992 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method1399(-1172389784);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1399(-1172389784);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var6 = arg0.method1396(-18);
                    this.field4992 = arg0.method1399(-1172389784);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class17.field228[var12 - 32768];
                    var8[var9] = class24.method149(var13, 1073741824);
                    int var14 = class31.method198(false, var13).field972;
                    if (var14 != 0) {
                        this.field4992 = var14;
                    }
                } else {
                    var8[var9] = class24.method149(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method1399(-1172389784);
            if (var17 < 0 || class92.field1426[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1989 = arg0.method1396(-49);
        long var18 = arg0.method1346(2);
        this.field5003 = class331.method2290((byte) 120, var18);
        this.field4994 = arg0.method1399(-1172389784);
        if (var7) {
            this.field5024 = arg0.method1396(-128);
            this.field5002 = this.field4994;
            this.field4995 = -1;
        } else {
            this.field5024 = 0;
            this.field5002 = arg0.method1399(-1172389784);
            this.field4995 = arg0.method1399(-1172389784);
            if (this.field4995 == 255) {
                this.field4995 = -1;
            }
        }
        int var20 = this.field4991;
        this.field4991 = arg0.method1399(-1172389784);
        if (this.field4991 == 0) {
            class271.method1936(this, 11741);
        } else {
            int var21 = this.field5017;
            int var22 = this.field4999;
            int var23 = this.field5006;
            int var24 = this.field5011;
            int var25 = this.field5007;
            this.field5017 = arg0.method1396(-91);
            this.field5006 = arg0.method1396(-62);
            this.field4999 = arg0.method1396(-37);
            this.field5011 = arg0.method1396(-126);
            this.field5007 = arg0.method1399(-1172389784);
            if (this.field4991 != var20 || this.field5017 != var21 || this.field5006 != var23 || this.field4999 != var22 || this.field5011 != var24 || this.field5007 != var25) {
                class338.method2331(this, (byte) 72);
            }
        }
        if (this.field5004 == null) {
            this.field5004 = new class303();
        }
        int var26 = this.field5004.field4733;
        this.field5004.method2122(var6, var8, false, var15, this.field1989, var4 == 1);
        if (var6 != var26) {
            this.field1980 = this.field1969[0] * 128 + this.method910(-1) * 64;
            this.field1944 = this.field2006[0] * 128 + this.method910(-1) * 64;
        }
        if (this.field1984 != null) {
            this.field1984.method1149();
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V", line = 294)
    public static void method2239(byte arg0) {
        field5018 = null;
        if (arg0 >= 21) {
            field4997 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V", line = 305)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5008++;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(B)Ljava/lang/String;", line = 319)
    public final String method2240(byte arg0) {
        field5010++;
        String var2 = this.field5003;
        if (arg0 != 115) {
            return (String) null;
        }
        if (class94.field1449 != null) {
            var2 = class94.field1449[this.field5019] + var2;
        }
        if (class5.field60 != null) {
            var2 = var2 + class5.field60[this.field5019];
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIBII)V", line = 349)
    public static final void method2241(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field5009++;
        if (arg4 >= 1 && arg7 >= 1 && arg4 <= 102 && arg7 <= 102) {
            if (!class152.method1062(122) && (class81.field1229[0][arg4][arg7] & 0x2) == 0) {
                int var8 = arg3;
                if ((class81.field1229[arg3][arg4][arg7] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class146.field2190 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class81.field1229[1][arg4][arg7] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class93.method671(arg4, arg3, (byte) -43, var9, class50.field685[arg3], arg7, arg0);
            if (arg2 >= 0) {
                boolean var10 = class39.field548;
                class39.field548 = true;
                class49.method341(-1, arg3, var9, class50.field685[arg3], arg6, arg4, false, false, arg1, arg2, arg7);
                class39.field548 = var10;
            }
        }
        if (arg5 < 114) {
            method2242((byte) 114);
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)I", line = 408)
    public final int method898(byte arg0) {
        field4996++;
        int var2 = -69 % ((arg0 - 38) / 42);
        return this.field1989;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 421)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        field5012++;
        if (this.field5004 == null) {
            return;
        }
        class80 var13 = this.field1968 != -1 && this.field2002 == 0 ? class37.method236(this.field1968, 20254) : null;
        class80 var14 = this.field1994 == -1 || this.field5015 || this.field1994 == this.method899(true).field3354 && var13 != null ? null : class37.method236(this.field1994, 20254);
        class134 var15 = this.field5004.method2121(this.field2031, this.field2012, false, var13, this.field1960, this.field1955, this.field1948, this.field1996, this.field1987, true, var14);
        int var16 = class255.method1796((byte) 35);
        if (class186.field2991 && class130.field1924 < 96 && var16 > 50) {
            class160.method1112((byte) -19);
        }
        if (class60.field790 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (class100.field1530 < var17) {
                class242.field3843[class100.field1530] = new byte[102400];
                class100.field1530++;
            }
            while (class100.field1530 > var17) {
                class100.field1530--;
                class242.field3843[class100.field1530] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field1997 = var15.method152();
        if (class202.field3302 && (this.field5004.field4733 == -1 || class281.method1993(this.field5004.field4733, -3).field1782)) {
            class134 var18 = class19.method124(var14 == null ? this.field1948 : this.field1987, arg0, 0, this.field1943, this.field1980, var15, this.field1944, 123, 0, 160, this.field1965, 240, 1, var14 == null ? var13 : var14);
            if (class186.field2991) {
                float var19 = class186.method1305();
                float var20 = class186.method1307();
                class186.method1284();
                class186.method1306(var19, var20 - 150.0F);
                var18.method153(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class167) null);
                class186.method1289();
                class186.method1306(var19, var20);
            } else {
                var18.method153(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class167) null);
            }
        }
        if (class13.field159 == this) {
            for (int var21 = class283.field4472.length - 1; var21 >= 0; var21--) {
                class249 var22 = class283.field4472[var21];
                if (var22 != null && var22.field3959 != -1) {
                    if (var22.field3967 == 1 && var22.field3951 >= 0 && var22.field3951 < class297.field4657.length) {
                        class196 var23 = class297.field4657[var22.field3951];
                        if (var23 != null) {
                            int var24 = var23.field1980 / 32 - (class13.field159.field1980 / 32);
                            int var25 = var23.field1944 / 32 - (class13.field159.field1944 / 32);
                            this.method2237(arg2, arg3, 360000, (byte) -83, arg1, var25, (class167) null, arg4, arg0, arg7, arg9, var22.field3959, var24, var15, arg6, arg5);
                        }
                    }
                    if (var22.field3967 == 2) {
                        int var26 = (var22.field3953 - class24.field351) * 4 + 2 - (class13.field159.field1944 / 32);
                        int var27 = var22.field3950 * 4;
                        int var28 = var27 * var27;
                        int var29 = (var22.field3965 - class181.field2925) * 4 + 2 - (class13.field159.field1980 / 32);
                        this.method2237(arg2, arg3, var28, (byte) -83, arg1, var26, (class167) null, arg4, arg0, arg7, arg9, var22.field3959, var29, var15, arg6, arg5);
                    }
                    if (var22.field3967 == 10 && var22.field3951 >= 0 && var22.field3951 < class100.field1523.length) {
                        class320 var30 = class100.field1523[var22.field3951];
                        if (var30 != null) {
                            int var31 = var30.field1980 / 32 - (class13.field159.field1980 / 32);
                            int var32 = var30.field1944 / 32 - (class13.field159.field1944 / 32);
                            this.method2237(arg2, arg3, 360000, (byte) -70, arg1, var32, (class167) null, arg4, arg0, arg7, arg9, var22.field3959, var31, var15, arg6, arg5);
                        }
                    }
                }
            }
        }
        this.method908(var15, 100);
        this.method905(var15, arg0, false);
        class134 var33 = null;
        if (!this.field5015 && this.field2022 != -1 && this.field1957 != -1) {
            class20 var34 = class264.method1881((byte) 117, this.field2022);
            var33 = var34.method136(this.field1993, (byte) 80, this.field2024, this.field1957);
            if (var33 != null) {
                var33.method519(0, -this.field2010, 0);
                if (var34.field283) {
                    if (class98.field1497 != 0) {
                        var33.method520(class98.field1497);
                    }
                    if (class303.field4729 != 0) {
                        var33.method515(class303.field4729);
                    }
                    if (class327.field5091 != 0) {
                        var33.method519(0, class327.field5091, 0);
                    }
                }
            }
        }
        class134 var35 = null;
        if (!this.field5015 && this.field1986 != null) {
            if (this.field1999 <= class48.field648) {
                this.field1986 = null;
            }
            if (class48.field648 >= this.field1982 && class48.field648 < this.field1999) {
                if ((this.field1986 instanceof class240)) {
                    var35 = (class134) ((class240) this.field1986).method1705((byte) 35);
                } else {
                    var35 = (class134) this.field1986;
                }
                var35.method519(this.field2011 - this.field1980, -this.field1943 + this.field2027, this.field2026 - this.field1944);
                if (this.field1973 == 512) {
                    var35.method524();
                } else if (this.field1973 == 1024) {
                    var35.method533();
                } else if (this.field1973 == 1536) {
                    var35.method503();
                }
            }
        }
        if (class186.field2991) {
            var15.field2042 = true;
            var15.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1984);
            if (var33 != null) {
                var33.field2042 = true;
                var33.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1984);
            }
        } else {
            if (var33 != null) {
                var15 = ((class76) var15).method559(var33);
            }
            if (var35 != null) {
                var15 = ((class76) var15).method559(var35);
            }
            var15.field2042 = true;
            var15.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1984);
        }
        if (var35 == null) {
            return;
        }
        if (this.field1973 == 512) {
            var35.method503();
        } else if (this.field1973 == 1024) {
            var35.method533();
        } else if (this.field1973 == 1536) {
            var35.method524();
        }
        var35.method519(this.field1980 - this.field2011, this.field1943 - this.field2027, this.field1944 - this.field2026);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I", line = 674)
    public final int method152() {
        field5022++;
        return this.field1997;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(B)V", line = 683)
    public static final void method2242(byte arg0) {
        if (arg0 != -65) {
            method2241(-116, -19, 96, 112, -121, (byte) -30, 125, -23);
        }
        class337.field5234.method1623(1);
        field5013++;
    }
}
