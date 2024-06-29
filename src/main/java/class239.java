import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class239 extends class1 {

    @OriginalMember(owner = "client!qg", name = "jc", descriptor = "I")
    public int field4185 = 0;

    @OriginalMember(owner = "client!qg", name = "zc", descriptor = "I")
    public int field4201 = -1;

    @OriginalMember(owner = "client!qg", name = "Ac", descriptor = "I")
    public int field4202 = 0;

    @OriginalMember(owner = "client!qg", name = "xc", descriptor = "I")
    public int field4199 = 0;

    @OriginalMember(owner = "client!qg", name = "Bc", descriptor = "I")
    public int field4203 = -1;

    @OriginalMember(owner = "client!qg", name = "Ec", descriptor = "I")
    public int field4206 = -1;

    @OriginalMember(owner = "client!qg", name = "Ic", descriptor = "I")
    private int field4210 = 0;

    @OriginalMember(owner = "client!qg", name = "Lc", descriptor = "I")
    public int field4213 = 0;

    @OriginalMember(owner = "client!qg", name = "Nc", descriptor = "I")
    public int field4215 = -1;

    @OriginalMember(owner = "client!qg", name = "uc", descriptor = "I")
    public int field4196 = 0;

    @OriginalMember(owner = "client!qg", name = "Oc", descriptor = "I")
    public int field4216 = -1;

    @OriginalMember(owner = "client!qg", name = "oc", descriptor = "I")
    public int field4190 = -1;

    @OriginalMember(owner = "client!qg", name = "Jc", descriptor = "I")
    public int field4211 = -1;

    @OriginalMember(owner = "client!qg", name = "Fc", descriptor = "Z")
    public boolean field4207 = false;

    @OriginalMember(owner = "client!qg", name = "tc", descriptor = "I")
    public static int field4195 = 0;

    @OriginalMember(owner = "client!qg", name = "Qc", descriptor = "I")
    public static int field4218 = 0;

    @OriginalMember(owner = "client!qg", name = "lc", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!qg", name = "mc", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!qg", name = "pc", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!qg", name = "qc", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!qg", name = "rc", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!qg", name = "sc", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!qg", name = "wc", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!qg", name = "yc", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!qg", name = "Dc", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!qg", name = "Gc", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!qg", name = "Hc", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!qg", name = "Kc", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!qg", name = "Mc", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!qg", name = "Pc", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!qg", name = "kc", descriptor = "Lig;")
    public static class175 field4186;

    @OriginalMember(owner = "client!qg", name = "vc", descriptor = "Lud;")
    public class279 field4197;

    @OriginalMember(owner = "client!qg", name = "nc", descriptor = "Lqd;")
    public class44 field4189;

    @OriginalMember(owner = "client!qg", name = "Cc", descriptor = "[I")
    public static int[] field4204;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I", line = 4)
    public final int method3(byte arg0) {
        if (arg0 > -89) {
            method1721(-4);
        }
        field4198++;
        return this.field4189 == null || this.field4189.field920 == -1 ? super.method3((byte) -103) : class150.method1198(this.field4189.field920, 30).field2266;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 18)
    public static final void method1717(int arg0) {
        if (class265.field4776 < 0) {
            class265.field4776 = 0;
            class276.field4901 = -1;
            class298.field5284 = -1;
        }
        if (class121.field2180 < class265.field4776) {
            class276.field4901 = -1;
            class298.field5284 = -1;
            class265.field4776 = class121.field2180;
        }
        if (class298.field5282 < 0) {
            class298.field5284 = -1;
            class298.field5282 = 0;
            class276.field4901 = -1;
        }
        if (class298.field5282 > class166.field3007) {
            class276.field4901 = -1;
            class298.field5282 = class166.field3007;
            class298.field5284 = -1;
        }
        field4192++;
        if (arg0 != -2984) {
            field4204 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Lud;", line = 59)
    public final class279 method1718(int arg0) {
        field4208++;
        if (arg0 != 4) {
            field4194 = -79;
        }
        class279 var2 = this.field4197;
        if (class103.field1929 != null) {
            var2 = class115.method929(new class279[] { class103.field1929[this.field4210], var2 }, (byte) 60);
        }
        if (class172.field3110 != null) {
            var2 = class115.method929(new class279[] { var2, class172.field3110[this.field4210] }, (byte) 60);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() {
        field4214++;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I", line = 89)
    public final int method184() {
        field4209++;
        return this.field52;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIJILlb;)V", line = 97)
    public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10) {
        field4193++;
        if (this.field4189 == null) {
            return;
        }
        class182 var13 = this.field30 != -1 && this.field27 == 0 ? class131.method1033((byte) -82, this.field30) : null;
        class182 var14 = this.field25 == -1 || this.field4207 || this.field25 == this.method15(119).field765 && var13 != null ? null : class131.method1033((byte) -82, this.field25);
        class19 var15 = this.field4189.method373(this.field9, this.field101, this.field18, this.field29, this.field14, true, this.field66, var14, var13, -1, this.field87);
        int var16 = class261.method1870(-67);
        if (class97.field1824 && class274.field4867 < 96 && var16 > 50) {
            class285.method2042(2209);
        }
        if (class283.field5063 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class292.field5212) {
                class14.field424[class292.field5212] = new byte[102400];
                class292.field5212++;
            }
            while (var17 < class292.field5212) {
                class292.field5212--;
                class14.field424[class292.field5212] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field52 = var15.method184();
        if (class220.field3883 && (this.field4189.field920 == -1 || class150.method1198(this.field4189.field920, 109).field2293)) {
            class19 var18 = class209.method1535(160, this.field79, this.field86, 0, this.field20, 0, var14 == null ? var13 : var14, arg0, var14 == null ? this.field18 : this.field14, (byte) -128, 240, 1, this.field70, var15);
            if (class97.field1824) {
                float var19 = class97.method834();
                float var20 = class97.method830();
                class97.method831();
                class97.method827(var19, var20 - 150.0F);
                var18.method186(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class208) null);
                class97.method824();
                class97.method827(var19, var20);
            } else {
                var18.method186(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class208) null);
            }
        }
        if (class72.field1420 == this) {
            for (int var21 = class268.field4807.length - 1; var21 >= 0; var21--) {
                class130 var22 = class268.field4807[var21];
                if (var22 != null && var22.field2364 != -1) {
                    if (var22.field2365 == 1 && var22.field2374 >= 0 && var22.field2374 < class122.field2196.length) {
                        class102 var23 = class122.field2196[var22.field2374];
                        if (var23 != null) {
                            int var24 = var23.field86 / 32 - (class72.field1420.field86 / 32);
                            int var25 = var23.field79 / 32 - (class72.field1420.field79 / 32);
                            this.method1719(var24, arg0, var25, arg6, arg3, arg7, false, arg5, arg1, arg9, var22.field2364, arg2, (class208) null, arg4, var15);
                        }
                    }
                    if (var22.field2365 == 2) {
                        int var26 = (var22.field2370 - class12.field396) * 4 + 2 - (class72.field1420.field79 / 32);
                        int var27 = (var22.field2371 - class112.field2058) * 4 + 2 - class72.field1420.field86 / 32;
                        this.method1719(var27, arg0, var26, arg6, arg3, arg7, false, arg5, arg1, arg9, var22.field2364, arg2, (class208) null, arg4, var15);
                    }
                    if (var22.field2365 == 10 && var22.field2374 >= 0 && class96.field1780.length > var22.field2374) {
                        class239 var28 = class96.field1780[var22.field2374];
                        if (var28 != null) {
                            int var29 = var28.field86 / 32 - (class72.field1420.field86 / 32);
                            int var30 = var28.field79 / 32 - class72.field1420.field79 / 32;
                            this.method1719(var29, arg0, var30, arg6, arg3, arg7, false, arg5, arg1, arg9, var22.field2364, arg2, (class208) null, arg4, var15);
                        }
                    }
                }
            }
        }
        this.method5((byte) -36, var15);
        this.method14(arg0, var15, 0);
        class19 var31 = null;
        if (!this.field4207 && this.field81 != -1 && this.field5 != -1) {
            class213 var32 = class103.method874(this.field81, -601);
            var31 = var32.method1566(this.field5, false, this.field102, this.field2);
            if (var31 != null) {
                var31.method170(0, -this.field7, 0);
                if (var32.field3746) {
                    if (class130.field2366 != 0) {
                        var31.method181(class130.field2366);
                    }
                    if (class278.field4913 != 0) {
                        var31.method166(class278.field4913);
                    }
                    if (class29.field682 != 0) {
                        var31.method170(0, class29.field682, 0);
                    }
                }
            }
        }
        class19 var33 = null;
        if (!this.field4207 && this.field24 != null) {
            if (class8.field279 >= this.field41) {
                this.field24 = null;
            }
            if (this.field76 <= class8.field279 && class8.field279 < this.field41) {
                if ((this.field24 instanceof class216)) {
                    var33 = (class19) ((class216) this.field24).method1582(false);
                } else {
                    var33 = (class19) this.field24;
                }
                var33.method170(this.field35 - this.field86, -this.field70 + this.field89, this.field73 - this.field79);
                if (this.field28 == 512) {
                    var33.method185();
                } else if (this.field28 == 1024) {
                    var33.method169();
                } else if (this.field28 == 1536) {
                    var33.method183();
                }
            }
        }
        if (class97.field1824) {
            var15.field566 = true;
            var15.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field60);
            if (var31 != null) {
                var31.field566 = true;
                var31.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field60);
            }
        } else {
            if (var31 != null) {
                var15 = ((class242) var15).method1728(var31);
            }
            if (var33 != null) {
                var15 = ((class242) var15).method1728(var33);
            }
            var15.field566 = true;
            var15.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field60);
        }
        if (var33 == null) {
            return;
        }
        if (this.field28 == 512) {
            var33.method183();
        } else if (this.field28 == 1024) {
            var33.method169();
        } else if (this.field28 == 1536) {
            var33.method185();
        }
        var33.method170(this.field86 - this.field35, -this.field89 + this.field70, this.field79 - this.field73);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIZIIIIILlb;ILga;)V", line = 344)
    private final void method1719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class208 arg12, int arg13, class19 arg14) {
        field4217++;
        int var16 = arg0 * arg0 + (arg2 * arg2);
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg0, (double) arg2) * 325.949D) & 0x7FF;
        class19 var18 = class141.method1085(var17, this.field70, this.field79, arg10, this.field86, arg6, arg14);
        if (var18 == null) {
            return;
        }
        if (!class97.field1824) {
            var18.method186(0, arg8, arg11, arg4, arg13, arg7, arg3, arg5, -1L, arg9, arg12);
            return;
        }
        float var19 = class97.method834();
        float var20 = class97.method830();
        class97.method831();
        class97.method827(var19, var20 - 150.0F);
        var18.method186(0, arg8, arg11, arg4, arg13, arg7, arg3, arg5, -1L, arg9, arg12);
        class97.method824();
        class97.method827(var19, var20);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 396)
    public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4191++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lvh;I)V", line = 421)
    public final void method1720(class53 arg0, int arg1) {
        arg0.field1142 = 0;
        field4205++;
        int var3 = arg0.method483(-106);
        int var4 = var3 & 0x1;
        int var5 = super.method3((byte) -112);
        boolean var6 = (var3 & 0x4) != 0;
        int var7 = -1;
        int[] var8 = new int[12];
        this.method1(0, ((var3 & 0x3A) >> 3) + 1);
        this.field4210 = var3 >> 6 & 0x3;
        this.field86 += (this.method3((byte) -102) - var5) * 64;
        this.field79 += (this.method3((byte) -90) - var5) * 64;
        this.field4211 = arg0.method494(false);
        this.field4203 = arg0.method494(false);
        this.field4185 = arg1;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method483(-108);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method483(-127);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method468(arg1 ^ 0x6E36);
                    this.field4185 = arg0.method483(-124);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class130.field2376[var12 - 32768];
                    var8[var9] = class301.method2139(var13, 1073741824);
                    int var14 = class220.method1612(-2254, var13).field2837;
                    if (var14 != 0) {
                        this.field4185 = var14;
                    }
                } else {
                    var8[var9] = class301.method2139(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method483(-101);
            if (var17 < 0 || var17 >= class223.field3939[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field23 = arg0.method468(28214);
        long var18 = arg0.method469((byte) 42);
        this.field4197 = class72.method631(var18, 5702).method2016(-32);
        this.field4196 = arg0.method483(-111);
        if (var6) {
            this.field4202 = arg0.method468(28214);
            this.field4213 = this.field4196;
            this.field4201 = -1;
        } else {
            this.field4202 = 0;
            this.field4213 = arg0.method483(-106);
            this.field4201 = arg0.method483(-111);
            if (this.field4201 == 255) {
                this.field4201 = -1;
            }
        }
        int var20 = this.field4199;
        this.field4199 = arg0.method483(-122);
        if (this.field4199 == 0) {
            class271.method1935(this, 100);
        } else {
            int var21 = this.field4190;
            int var22 = this.field4216;
            int var23 = this.field4206;
            int var24 = this.field4215;
            this.field4190 = arg0.method468(28214);
            this.field4215 = arg0.method468(28214);
            this.field4216 = arg0.method468(arg1 ^ 0x6E36);
            this.field4206 = arg0.method468(arg1 + 28214);
            if (this.field4199 != var20 || this.field4190 != var21 || this.field4215 != var24 || this.field4216 != var22 || this.field4206 != var23) {
                class134.method1053(arg1 ^ 0xFFFFFFC6, this);
            }
        }
        if (this.field4189 == null) {
            this.field4189 = new class44();
        }
        int var25 = this.field4189.field920;
        this.field4189.method369(-7277, var7, var8, var15, var4 == 1, this.field23);
        if (var7 != var25) {
            this.field86 = this.field11[0] * 128 + this.method3((byte) -116) * 64;
            this.field79 = this.field34[0] * 128 + this.method3((byte) -95) * 64;
        }
        if (this.field60 != null) {
            this.field60.method1531();
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V", line = 588)
    public static void method1721(int arg0) {
        field4204 = null;
        if (arg0 == -51) {
            field4186 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)I", line = 608)
    public final int method7(boolean arg0) {
        if (!arg0) {
            this.field4185 = 16;
        }
        field4187++;
        return this.field23;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIZ)V", line = 619)
    public final void method1722(byte arg0, int arg1, int arg2, boolean arg3) {
        field4212++;
        if (arg0 != -32) {
            this.field4213 = 15;
        }
        super.method10(arg3, this.method3((byte) -120), arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z", line = 630)
    public final boolean method2(int arg0) {
        if (arg0 != 27121) {
            field4204 = (int[]) null;
        }
        field4200++;
        return this.field4189 != null;
    }
}
