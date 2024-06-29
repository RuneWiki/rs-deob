import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class228 extends class333 {

    @OriginalMember(owner = "client!qm", name = "sc", descriptor = "I")
    public int field3431 = 0;

    @OriginalMember(owner = "client!qm", name = "vc", descriptor = "I")
    public int field3434 = -1;

    @OriginalMember(owner = "client!qm", name = "Ec", descriptor = "B")
    private byte field3443 = 0;

    @OriginalMember(owner = "client!qm", name = "Dc", descriptor = "I")
    public int field3442 = -1;

    @OriginalMember(owner = "client!qm", name = "yc", descriptor = "I")
    public int field3437 = -1;

    @OriginalMember(owner = "client!qm", name = "Cc", descriptor = "I")
    public int field3441 = 0;

    @OriginalMember(owner = "client!qm", name = "xc", descriptor = "I")
    public int field3436 = 0;

    @OriginalMember(owner = "client!qm", name = "tc", descriptor = "I")
    public int field3432 = 0;

    @OriginalMember(owner = "client!qm", name = "Sc", descriptor = "B")
    private byte field3457 = 0;

    @OriginalMember(owner = "client!qm", name = "Uc", descriptor = "I")
    public int field3459 = 0;

    @OriginalMember(owner = "client!qm", name = "Wc", descriptor = "I")
    public int field3461 = -1;

    @OriginalMember(owner = "client!qm", name = "Zc", descriptor = "Z")
    public boolean field3464 = false;

    @OriginalMember(owner = "client!qm", name = "Fc", descriptor = "I")
    public int field3444 = -1;

    @OriginalMember(owner = "client!qm", name = "Rc", descriptor = "I")
    public int field3456 = -1;

    @OriginalMember(owner = "client!qm", name = "Jc", descriptor = "I")
    public int field3448 = 255;

    @OriginalMember(owner = "client!qm", name = "bd", descriptor = "I")
    public int field3466 = -1;

    @OriginalMember(owner = "client!qm", name = "rc", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!qm", name = "uc", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!qm", name = "wc", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!qm", name = "zc", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!qm", name = "Ac", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!qm", name = "Bc", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!qm", name = "Hc", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!qm", name = "Ic", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!qm", name = "Lc", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!qm", name = "Mc", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!qm", name = "Pc", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!qm", name = "Qc", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!qm", name = "Tc", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!qm", name = "Vc", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!qm", name = "Yc", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!qm", name = "ad", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!qm", name = "Gc", descriptor = "Lnh;")
    public class256 field3445;

    @OriginalMember(owner = "client!qm", name = "Nc", descriptor = "Ljava/lang/String;")
    public String field3452;

    @OriginalMember(owner = "client!qm", name = "Oc", descriptor = "Ljava/lang/String;")
    public String field3453;

    @OriginalMember(owner = "client!qm", name = "Kc", descriptor = "[Lmo;")
    public static class250[] field3449;

    @OriginalMember(owner = "client!qm", name = "Xc", descriptor = "[[[I")
    public static int[][][] field3462;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIJILko;)V", line = 5)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10) {
        field3430++;
        if (this.field3445 == null) {
            return;
        }
        class248 var13 = this.field5190 != -1 && this.field5177 == 0 ? class119.method893(this.field5190, (byte) -41) : null;
        class15 var14 = this.method2355(true);
        boolean var15 = var14.field230 != 0 || var14.field256 != 0 || var14.field255 != 0 || var14.field216 != 0;
        class248 var16 = this.field5096 == -1 || this.field3464 || this.field5096 == this.method2355(true).field262 && var13 != null ? null : class119.method893(this.field5096, (byte) -41);
        class151 var17 = this.field3445.method1886(var13, this.field5146, this.field5108, this.field5132, this.field5194, 11, this.field5180, this.field5185, this.field5151, var15, var16, true);
        int var18 = class36.method264(true);
        if (class141.field2031 && class243.field3620 < 96 && var18 > 50) {
            class64.method537((byte) -70);
        }
        if (class59.field870 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (class200.field2908 < var19) {
                class206.field3017[class200.field2908] = new byte[102400];
                class200.field2908++;
            }
            while (var19 < class200.field2908) {
                class200.field2908--;
                class206.field3017[class200.field2908] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field5154 = var17.method371();
        if (class221.field3304 && (this.field3445.field3830 == -1 || class343.method2393((byte) -27, this.field3445.field3830).field3089)) {
            class151 var20 = class122.method913(this.field5137, arg0, 82, 160, 240, 0, this.field5165, 1, var16 == null ? var13 : var16, var17, this.field5187, this.field5111, 0, var16 == null ? this.field5132 : this.field5180);
            if (class141.field2031) {
                float var21 = class141.method1019();
                float var22 = class141.method988();
                class141.method1020();
                class141.method981(var21, var22 - 150.0F);
                var20.method380(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class155) null);
                class141.method1023();
                class141.method981(var21, var22);
            } else {
                var20.method380(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class155) null);
            }
        }
        if (class1.field55 == this) {
            for (int var23 = class351.field5417.length - 1; var23 >= 0; var23--) {
                class230 var24 = class351.field5417[var23];
                if (var24 != null && var24.field3484 != -1) {
                    if (var24.field3487 == 1 && var24.field3480 >= 0 && class300.field4495.length > var24.field3480) {
                        class181 var25 = class300.field4495[var24.field3480];
                        if (var25 != null) {
                            int var26 = var25.field5137 / 32 - (class1.field55.field5137 / 32);
                            int var27 = var25.field5165 / 32 - class1.field55.field5165 / 32;
                            this.method1704(arg5, var17, var27, arg7, arg4, arg9, (class155) null, arg6, arg0, arg1, arg3, 360000, arg2, (byte) -97, var26, var24.field3484);
                        }
                    }
                    if (var24.field3487 == 2) {
                        int var28 = var24.field3486 * 4;
                        int var29 = (var24.field3492 - class202.field2968) * 4 + 2 - (class1.field55.field5165 / 32);
                        int var30 = (var24.field3481 - class272.field4123) * 4 + 2 - (class1.field55.field5137 / 32);
                        int var31 = var28 * var28;
                        this.method1704(arg5, var17, var29, arg7, arg4, arg9, (class155) null, arg6, arg0, arg1, arg3, var31, arg2, (byte) -91, var30, var24.field3484);
                    }
                    if (var24.field3487 == 10 && var24.field3480 >= 0 && var24.field3480 < class343.field5312.length) {
                        class228 var32 = class343.field5312[var24.field3480];
                        if (var32 != null) {
                            int var33 = var32.field5137 / 32 - (class1.field55.field5137 / 32);
                            int var34 = var32.field5165 / 32 - class1.field55.field5165 / 32;
                            this.method1704(arg5, var17, var34, arg7, arg4, arg9, (class155) null, arg6, arg0, arg1, arg3, 360000, arg2, (byte) -95, var33, var24.field3484);
                        }
                    }
                }
            }
        }
        this.method2341(var17, true);
        this.method2349(arg0, -60, var17);
        class151 var35 = null;
        if (!this.field3464 && this.field5090 != -1 && this.field5159 != -1) {
            class107 var36 = class81.method669(32, this.field5090);
            var35 = var36.method819(this.field5144, 19852, this.field5131, this.field5159);
            if (var35 != null) {
                var35.method1091(0, -this.field5100, 0);
                if (var36.field1541) {
                    if (class11.field182 != 0) {
                        var35.method1079(class11.field182);
                    }
                    if (class145.field2097 != 0) {
                        var35.method1090(class145.field2097);
                    }
                    if (class127.field1850 != 0) {
                        var35.method1091(0, class127.field1850, 0);
                    }
                }
            }
        }
        class151 var37 = null;
        if (!this.field3464 && this.field5094 != null) {
            if (class304.field4560 >= this.field5135) {
                this.field5094 = null;
            }
            if (class304.field4560 >= this.field5110 && class304.field4560 < this.field5135) {
                if ((this.field5094 instanceof class149)) {
                    var37 = (class151) ((class149) this.field5094).method1056((byte) 52);
                } else {
                    var37 = (class151) this.field5094;
                }
                var37.method1091(this.field5174 - this.field5137, -this.field5111 + this.field5123, this.field5152 - this.field5165);
                if (this.field5089 == 512) {
                    var37.method1070();
                } else if (this.field5089 == 1024) {
                    var37.method1069();
                } else if (this.field5089 == 1536) {
                    var37.method1092();
                }
            }
        }
        if (class141.field2031) {
            this.method2354(var35, var17, -31669);
            var17.field2188 = true;
            var17.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5099);
            if (var35 != null) {
                if (this.field5099 != null) {
                    class218 var38 = (class218) var35;
                    this.field5099.method1118(var38.field3216, var38.field3241, true, var38.field3244, var38.field3246, var38.field3214);
                }
                var35.field2188 = true;
                var35.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5099);
            }
        } else {
            if (var35 != null) {
                var17 = ((class317) var17).method2214(var35);
            }
            if (var37 != null) {
                var17 = ((class317) var17).method2214(var37);
            }
            this.method2354(var35, var17, -31669);
            var17.field2188 = true;
            var17.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5099);
        }
        if (var37 == null) {
            return;
        }
        if (this.field5089 == 512) {
            var37.method1092();
        } else if (this.field5089 == 1024) {
            var37.method1069();
        } else if (this.field5089 == 1536) {
            var37.method1070();
        }
        var37.method1091(this.field5137 - this.field5174, this.field5111 - this.field5123, this.field5165 - this.field5152);
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I", line = 265)
    public final int method1700(int arg0) {
        if (arg0 > -93) {
            return 15;
        } else {
            field3439++;
            return this.field3445 == null || this.field3445.field3830 == -1 ? super.method1700(-113) : class343.method2393((byte) -27, this.field3445.field3830).field3083;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()I", line = 280)
    public final int method371() {
        field3463++;
        return this.field5154;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I", line = 290)
    public final int method1255(int arg0) {
        if (arg0 == 28952) {
            field3446++;
            return this.field5195;
        } else {
            return 12;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIZ)V", line = 301)
    public final void method1701(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != 6476) {
            this.method1703(-41, true);
        }
        field3465++;
        super.method2347(arg1, arg2, (byte) 125, this.method1700(-96), arg3);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I", line = 324)
    public final int method1251(byte arg0) {
        field3454++;
        int var2 = -49 / ((-arg0 - 72) / 49);
        return -1;
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 350)
    public static void method1702(int arg0) {
        if (arg0 == 128) {
            field3462 = (int[][][]) null;
            field3449 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 362)
    public final String method1703(int arg0, boolean arg1) {
        String var3 = "";
        if (class236.field3548 != null) {
            var3 = var3 + class236.field3548[this.field3457];
        }
        if (class145.field2091 != null && class145.field2091[this.field3457] != -1) {
            class76 var4 = class315.method2197(class145.field2091[this.field3457], 120);
            if (var4.field1106 == 's') {
                var3 = var3 + var4.method622((byte) -52, this.field3443 & 0xFF);
            } else {
                class343.method2402("gdn1", new Throwable(), -2);
                class145.field2091[this.field3457] = -1;
            }
        }
        field3451++;
        int var5 = 116 / ((-arg0 - 17) / 51);
        String var6;
        if (arg1) {
            var6 = var3 + this.field3452;
        } else {
            var6 = var3 + this.field3453;
        }
        if (class347.field5365 != null) {
            var6 = var6 + class347.field5365[this.field3457];
        }
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILhc;IIIILko;IIIIIIBII)V", line = 399)
    private final void method1704(int arg0, class151 arg1, int arg2, int arg3, int arg4, int arg5, class155 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg13 > -80) {
            this.method1701(-77, 48, 32, true);
        }
        field3458++;
        int var17 = arg2 * arg2 + arg14 * arg14;
        if (var17 < 16 || var17 > arg11) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg14, (double) arg2) * 325.949D) & 0x7FF;
        class151 var19 = class72.method598(this.field5137, var18, arg1, this.field5111, -128, this.field5165, arg15);
        if (var19 == null) {
            return;
        }
        if (!class141.field2031) {
            var19.method380(0, arg9, arg12, arg10, arg4, arg0, arg7, arg3, -1L, arg5, arg6);
            return;
        }
        float var20 = class141.method1019();
        float var21 = class141.method988();
        class141.method1020();
        class141.method981(var20, var21 - 150.0F);
        var19.method380(0, arg9, arg12, arg10, arg4, arg0, arg7, arg3, -1L, arg5, arg6);
        class141.method1023();
        class141.method981(var20, var21);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V", line = 439)
    public static final void method1705(byte arg0) {
        int var1 = -82 % ((arg0 - 25) / 56);
        int var2 = class329.field4954;
        field3447++;
        int var3 = class354.field5445;
        int var4 = class212.field3069 - var2 - class286.field4312;
        int var5 = class98.field1389 - var3 - class19.field301;
        if (var2 <= 0 && var4 <= 0 && var3 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class124.field1809 != null) {
                var6 = class124.field1809;
            } else if (class131.field1905 == null) {
                var6 = class54.field787.field878;
            } else {
                var6 = class131.field1905;
            }
            int var7 = 0;
            int var8 = 0;
            if (class131.field1905 == var6) {
                Insets var9 = class131.field1905.getInsets();
                var7 = var9.left;
                var8 = var9.top;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var2 > 0) {
                var10.fillRect(var7, var8, var2, class98.field1389);
            }
            if (var3 > 0) {
                var10.fillRect(var7, var8, class212.field3069, var3);
            }
            if (var4 > 0) {
                var10.fillRect(class212.field3069 + var7 - var4, var8, var4, class98.field1389);
            }
            if (var5 > 0) {
                var10.fillRect(var7, class98.field1389 + var8 - var5, class212.field3069, var5);
            }
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I", line = 506)
    public static int method1706(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IZ)Ljava/lang/String;", line = 518)
    public final String method1707(int arg0, boolean arg1) {
        field3450++;
        if (arg0 > -36) {
            this.method371();
        }
        return arg1 ? this.field3452 : this.field3453;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lsb;BI)V", line = 544)
    public final void method1708(class190 arg0, byte arg1, int arg2) {
        field3438++;
        arg0.field2776 = 0;
        int var4 = arg0.method1319(255);
        int var5 = var4 & 0x1;
        int var6 = -1;
        boolean var7 = (var4 & 0x4) != 0;
        int[] var8 = new int[12];
        boolean var9 = (var4 & 0x2) != 0;
        if (arg1 > -64) {
            this.field3466 = 44;
        }
        int var10 = super.method1700(-120);
        this.method2351(((var4 & 0x39) >> 3) + 1, -19464);
        this.field3457 = (byte) (var4 >> 6 & 0x3);
        this.field5137 += (this.method1700(-128) - var10) * 64;
        this.field5165 += (this.method1700(-97) - var10) * 64;
        this.field3443 = arg0.method1322(9813);
        this.field3434 = arg0.method1322(9813);
        this.field3444 = arg0.method1322(9813);
        this.field3431 = 0;
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method1319(255);
            if (var12 == 0) {
                var8[var11] = 0;
            } else {
                int var13 = arg0.method1319(255);
                int var14 = (var12 << 8) + var13;
                if (var11 == 0 && var14 == 65535) {
                    var6 = arg0.method1317((byte) 91);
                    this.field3431 = arg0.method1319(255);
                    break;
                }
                if (var14 >= 32768) {
                    int var15 = class255.field3804[var14 - 32768];
                    var8[var11] = class81.method666(var15, 1073741824);
                    int var16 = class175.method1228((byte) 54, var15).field1762;
                    if (var16 != 0) {
                        this.field3431 = var16;
                    }
                } else {
                    var8[var11] = class81.method666(Integer.MIN_VALUE, var14 - 256);
                }
            }
        }
        int[] var17 = new int[5];
        for (int var18 = 0; var18 < 5; var18++) {
            int var19 = arg0.method1319(255);
            if (var19 < 0 || class119.field1674[var18].length <= var19) {
                var19 = 0;
            }
            var17[var18] = var19;
        }
        this.field5195 = arg0.method1317((byte) 111);
        this.field3452 = arg0.method1329((byte) 59);
        if (var9) {
            this.field3453 = arg0.method1329((byte) 59);
        } else {
            this.field3453 = this.field3452;
        }
        this.field3459 = arg0.method1319(255);
        if (var7) {
            this.field3441 = arg0.method1317((byte) 67);
            this.field3436 = this.field3459;
            this.field3466 = -1;
        } else {
            this.field3441 = 0;
            this.field3436 = arg0.method1319(255);
            this.field3466 = arg0.method1319(255);
            if (this.field3466 == 255) {
                this.field3466 = -1;
            }
        }
        int var20 = this.field3432;
        this.field3432 = arg0.method1319(255);
        if (this.field3432 == 0) {
            class247.method1812(this, arg2, 2);
        } else {
            int var21 = this.field3456;
            int var22 = this.field3461;
            int var23 = this.field3448;
            int var24 = this.field3442;
            int var25 = this.field3437;
            this.field3442 = arg0.method1317((byte) 34);
            this.field3456 = arg0.method1317((byte) 56);
            this.field3461 = arg0.method1317((byte) 48);
            this.field3437 = arg0.method1317((byte) 26);
            this.field3448 = arg0.method1319(255);
            if (this.field3432 != var20 || this.field3442 != var24 || this.field3456 != var21 || this.field3461 != var22 || this.field3437 != var25 || this.field3448 != var23) {
                class192.method1383(this, 32768, arg2);
            }
        }
        if (this.field3445 == null) {
            this.field3445 = new class256();
        }
        int var26 = this.field3445.field3830;
        this.field3445.method1881(var17, var5 == 1, (byte) 112, var8, var6, this.field5195);
        if (var6 != var26) {
            this.field5137 = this.field5186[0] * 128 + this.method1700(-105) * 64;
            this.field5165 = this.field5162[0] * 128 + this.method1700(-118) * 64;
        }
        if (this.field5099 != null) {
            this.field5099.method1111();
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V", line = 708)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3440++;
        if (!this.field5148) {
            if (this.field3445 == null) {
                return;
            }
            class248 var6 = this.field5190 != -1 && this.field5177 == 0 ? class119.method893(this.field5190, (byte) -41) : null;
            class248 var7 = this.field5096 == -1 || this.field3464 || this.field5096 == this.method2355(true).field262 && var6 != null ? null : class119.method893(this.field5096, (byte) -41);
            class151 var8 = this.field3445.method1886(var6, this.field5146, this.field5108, this.field5132, this.field5194, 11, this.field5180, this.field5185, this.field5151, false, var7, false);
            if (var8 == null) {
                return;
            }
            this.method2354((class151) null, var8, -31669);
        }
        if (this.field5099 != null) {
            this.field5099.method1109(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)Z", line = 748)
    public final boolean method1256(int arg0) {
        field3433++;
        if (arg0 != 19942) {
            this.field3442 = 75;
        }
        return this.field3445 != null;
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 769)
    protected final void finalize() {
        if (this.field5099 != null) {
            this.field5099.method1129();
        }
        field3455++;
    }
}
