import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class205 extends class116 {

    @OriginalMember(owner = "client!qe", name = "Cc", descriptor = "I")
    public int field3483 = 0;

    @OriginalMember(owner = "client!qe", name = "xc", descriptor = "I")
    public int field3478 = 0;

    @OriginalMember(owner = "client!qe", name = "Gc", descriptor = "I")
    public int field3487 = -1;

    @OriginalMember(owner = "client!qe", name = "Jc", descriptor = "I")
    public int field3490 = 0;

    @OriginalMember(owner = "client!qe", name = "Fc", descriptor = "I")
    public int field3486 = -1;

    @OriginalMember(owner = "client!qe", name = "zc", descriptor = "I")
    public int field3480 = 0;

    @OriginalMember(owner = "client!qe", name = "yc", descriptor = "I")
    public int field3479 = 0;

    @OriginalMember(owner = "client!qe", name = "Nc", descriptor = "I")
    public int field3494 = -1;

    @OriginalMember(owner = "client!qe", name = "Uc", descriptor = "Z")
    public boolean field3501 = false;

    @OriginalMember(owner = "client!qe", name = "Yc", descriptor = "I")
    public int field3505 = 255;

    @OriginalMember(owner = "client!qe", name = "Lc", descriptor = "I")
    public int field3492 = -1;

    @OriginalMember(owner = "client!qe", name = "Pc", descriptor = "I")
    public int field3496 = -1;

    @OriginalMember(owner = "client!qe", name = "Oc", descriptor = "B")
    private byte field3495 = 0;

    @OriginalMember(owner = "client!qe", name = "Wc", descriptor = "I")
    public int field3503 = -1;

    @OriginalMember(owner = "client!qe", name = "bd", descriptor = "I")
    public int field3508 = -1;

    @OriginalMember(owner = "client!qe", name = "Ic", descriptor = "I")
    public static int field3489 = 0;

    @OriginalMember(owner = "client!qe", name = "ad", descriptor = "Ljava/lang/String;")
    public static String field3507 = "slide:";

    @OriginalMember(owner = "client!qe", name = "vc", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!qe", name = "Ac", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!qe", name = "Bc", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!qe", name = "Dc", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!qe", name = "Ec", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!qe", name = "Hc", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!qe", name = "Mc", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!qe", name = "Qc", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!qe", name = "Rc", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!qe", name = "Sc", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!qe", name = "Tc", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!qe", name = "Vc", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!qe", name = "Xc", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!qe", name = "Zc", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!qe", name = "wc", descriptor = "Lve;")
    public class293 field3477;

    @OriginalMember(owner = "client!qe", name = "Kc", descriptor = "Ljava/lang/String;")
    public String field3491;

    @OriginalMember(owner = "client!qe", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.field2012 != null) {
            this.field2012.method624();
        }
        field3484++;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)V", line = 16)
    public static final void method1532(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class42.field622; var3++) {
            for (int var4 = 0; var4 < class123.field2134; var4++) {
                for (int var5 = 0; var5 < class185.field3144; var5++) {
                    class257 var6 = class279.field4430[var3][var4][var5];
                    if (var6 != null) {
                        class297 var7 = var6.field4146;
                        if (var7 != null && var7.field4741.method896()) {
                            class227.method1652(var7.field4741, var3, var4, var5, 1, 1);
                            if (var7.field4744 != null && var7.field4744.method896()) {
                                class227.method1652(var7.field4744, var3, var4, var5, 1, 1);
                                var7.field4741.method894(var7.field4744, 0, 0, 0, false);
                                var7.field4744 = var7.field4744.method898(arg0, arg1, arg2);
                            }
                            var7.field4741 = var7.field4741.method898(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4150; var8++) {
                            class241 var9 = var6.field4147[var8];
                            if (var9 != null && var9.field3940.method896()) {
                                class227.method1652(var9.field3940, var3, var4, var5, var9.field3930 + 1 - var9.field3932, var9.field3928 - var9.field3929 + 1);
                                var9.field3940 = var9.field3940.method898(arg0, arg1, arg2);
                            }
                        }
                        class330 var10 = var6.field4140;
                        if (var10 != null && var10.field5257.method896()) {
                            class330.method2290(var10.field5257, var3, var4, var5);
                            var10.field5257 = var10.field5257.method898(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 92)
    public static void method1533(byte arg0) {
        field3507 = null;
        if (arg0 <= 22) {
            field3482 = 35;
        }
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)Ljava/lang/String;", line = 116)
    public final String method1534(int arg0) {
        if (arg0 > -64) {
            return (String) null;
        }
        String var2 = this.field3491;
        field3493++;
        if (class243.field3964 != null) {
            var2 = class243.field3964[this.field3495] + var2;
        }
        if (class153.field2720 != null) {
            var2 = var2 + class153.field2720[this.field3495];
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V", line = 139)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3476++;
        if (!this.field1938) {
            if (this.field3477 == null) {
                return;
            }
            class285 var6 = this.field1998 != -1 && this.field1934 == 0 ? class346.method2428(this.field1998, (byte) -24) : null;
            class285 var7 = this.field2000 == -1 || this.field3501 || this.field2000 == this.method980((byte) 73).field5521 && var6 != null ? null : class346.method2428(this.field2000, (byte) -24);
            class10 var8 = this.field3477.method2001(false, var7, this.field1932, var6, this.field2035, this.field2009, this.field2026, this.field1929, this.field1945, 5, this.field1974);
            if (var8 == null) {
                return;
            }
            this.method993((byte) 60, var8, (class10) null);
        }
        if (this.field2012 != null) {
            this.field2012.method615(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)I", line = 176)
    public final int method991(int arg0) {
        field3504++;
        return arg0 == 10295 ? this.field1962 : -51;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I", line = 204)
    public final int method95() {
        field3485++;
        return this.field1989;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIJILil;)V", line = 224)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field3499++;
        if (this.field3477 == null) {
            return;
        }
        class285 var13 = this.field1998 != -1 && this.field1934 == 0 ? class346.method2428(this.field1998, (byte) -24) : null;
        class285 var14 = this.field2000 == -1 || this.field3501 || this.field2000 == this.method980((byte) 73).field5521 && var13 != null ? null : class346.method2428(this.field2000, (byte) -24);
        class10 var15 = this.field3477.method2001(true, var14, this.field1932, var13, this.field2035, this.field2009, this.field2026, this.field1929, this.field1945, 5, this.field1974);
        int var16 = class135.method1112(4314);
        if (class43.field680 && class28.field385 < 96 && var16 > 50) {
            class170.method1340(-119);
        }
        if (class331.field5280 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (class200.field3408 < var17) {
                class215.field3615[class200.field3408] = new byte[102400];
                class200.field3408++;
            }
            while (class200.field3408 > var17) {
                class200.field3408--;
                class215.field3615[class200.field3408] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field1989 = var15.method95();
        if (class195.field3276 && (this.field3477.field4692 == -1 || class224.method1637(this.field3477.field4692, (byte) 113).field190)) {
            class10 var18 = class258.method1786(arg0, this.field2011, this.field2036, (byte) -127, 160, 0, var15, 240, this.field1984, var14 == null ? this.field1932 : this.field1974, this.field1985, 1, 0, var14 == null ? var13 : var14);
            if (class43.field680) {
                float var19 = class43.method381();
                float var20 = class43.method382();
                class43.method354();
                class43.method375(var19, var20 - 150.0F);
                var18.method74(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class65) null);
                class43.method376();
                class43.method375(var19, var20);
            } else {
                var18.method74(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class65) null);
            }
        }
        if (class218.field3632 == this) {
            for (int var21 = class311.field4922.length - 1; var21 >= 0; var21--) {
                class156 var22 = class311.field4922[var21];
                if (var22 != null && var22.field2771 != -1) {
                    if (var22.field2764 == 1 && var22.field2765 >= 0 && var22.field2765 < class320.field5071.length) {
                        class278 var23 = class320.field5071[var22.field2765];
                        if (var23 != null) {
                            int var24 = var23.field1985 / 32 - (class218.field3632.field1985 / 32);
                            int var25 = var23.field2036 / 32 - class218.field3632.field2036 / 32;
                            this.method1535(arg7, arg5, var25, arg3, 360000, var22.field2771, arg4, arg1, var15, arg0, arg6, (class65) null, arg2, -68, arg9, var24);
                        }
                    }
                    if (var22.field2764 == 2) {
                        int var26 = (var22.field2766 - class24.field345) * 4 + 2 - (class218.field3632.field2036 / 32);
                        int var27 = var22.field2772 * 4;
                        int var28 = var27 * var27;
                        int var29 = (var22.field2770 - class34.field484) * 4 + (2 - class218.field3632.field1985 / 32);
                        this.method1535(arg7, arg5, var26, arg3, var28, var22.field2771, arg4, arg1, var15, arg0, arg6, (class65) null, arg2, -65, arg9, var29);
                    }
                    if (var22.field2764 == 10 && var22.field2765 >= 0 && var22.field2765 < class135.field2359.length) {
                        class205 var30 = class135.field2359[var22.field2765];
                        if (var30 != null) {
                            int var31 = var30.field2036 / 32 - (class218.field3632.field2036 / 32);
                            int var32 = var30.field1985 / 32 - (class218.field3632.field1985 / 32);
                            this.method1535(arg7, arg5, var31, arg3, 360000, var22.field2771, arg4, arg1, var15, arg0, arg6, (class65) null, arg2, -62, arg9, var32);
                        }
                    }
                }
            }
        }
        this.method994(var15, (byte) 117);
        this.method982(var15, arg0, 105);
        class10 var33 = null;
        if (!this.field3501 && this.field1980 != -1 && this.field1966 != -1) {
            class158 var34 = class271.method1851(this.field1980, 0);
            var33 = var34.method1267(50, this.field1967, this.field1968, this.field1966);
            if (var33 != null) {
                var33.method85(0, -this.field1997, 0);
                if (var34.field2802) {
                    if (class17.field257 != 0) {
                        var33.method78(class17.field257);
                    }
                    if (class32.field459 != 0) {
                        var33.method104(class32.field459);
                    }
                    if (class125.field2164 != 0) {
                        var33.method85(0, class125.field2164, 0);
                    }
                }
            }
        }
        class10 var35 = null;
        if (!this.field3501 && this.field1936 != null) {
            if (this.field1956 <= class181.field3045) {
                this.field1936 = null;
            }
            if (this.field1949 <= class181.field3045 && this.field1956 > class181.field3045) {
                if (this.field1936 instanceof class71) {
                    var35 = (class10) ((class71) this.field1936).method686((byte) 2);
                } else {
                    var35 = (class10) this.field1936;
                }
                var35.method85(this.field2018 - this.field2036, -this.field2011 + this.field1948, this.field1976 - this.field1985);
                if (this.field1951 == 512) {
                    var35.method92();
                } else if (this.field1951 == 1024) {
                    var35.method75();
                } else if (this.field1951 == 1536) {
                    var35.method90();
                }
            }
        }
        if (class43.field680) {
            this.method993((byte) 60, var15, var33);
            var15.field127 = true;
            var15.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2012);
            if (var33 != null) {
                if (this.field2012 != null) {
                    class183 var36 = (class183) var33;
                    this.field2012.method613(var36.field3086, var36.field3066, true, var36.field3080, var36.field3054, var36.field3087);
                }
                var33.field127 = true;
                var33.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2012);
            }
        } else {
            if (var33 != null) {
                var15 = ((class103) var15).method880(var33);
            }
            if (var35 != null) {
                var15 = ((class103) var15).method880(var35);
            }
            this.method993((byte) 60, var15, var33);
            var15.field127 = true;
            var15.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2012);
        }
        if (var35 == null) {
            return;
        }
        if (this.field1951 == 512) {
            var35.method90();
        } else if (this.field1951 == 1024) {
            var35.method75();
        } else if (this.field1951 == 1536) {
            var35.method92();
        }
        var35.method85(this.field2036 - this.field2018, -this.field1948 + this.field2011, this.field1985 - this.field1976);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)I", line = 478)
    public final int method987(int arg0) {
        field3488++;
        if (this.field3477 == null || this.field3477.field4692 == -1) {
            if (arg0 != 3047) {
                this.field3494 = 96;
            }
            return super.method987(arg0);
        } else {
            return class224.method1637(this.field3477.field4692, (byte) 116).field202;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIILgk;IILil;IIII)V", line = 494)
    private final void method1535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class10 arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg13 >= -24) {
            this.field3508 = -80;
        }
        int var17 = arg2 * arg2 + (arg15 * arg15);
        field3481++;
        if (var17 < 16 || arg4 < var17) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg2, (double) arg15) * 325.949D) & 0x7FF;
        class10 var19 = class184.method1419(true, arg5, this.field2036, var18, this.field2011, arg8, this.field1985);
        if (var19 == null) {
            return;
        }
        if (!class43.field680) {
            var19.method74(0, arg7, arg12, arg3, arg6, arg1, arg10, arg0, -1L, arg14, arg11);
            return;
        }
        float var20 = class43.method381();
        float var21 = class43.method382();
        class43.method354();
        class43.method375(var20, var21 - 150.0F);
        var19.method74(0, arg7, arg12, arg3, arg6, arg1, arg10, arg0, -1L, arg14, arg11);
        class43.method376();
        class43.method375(var20, var21);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z", line = 535)
    public final boolean method981(byte arg0) {
        if (arg0 == -90) {
            field3506++;
            return this.field3477 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZIB)V", line = 571)
    public final void method1536(int arg0, boolean arg1, int arg2, byte arg3) {
        field3498++;
        if (arg3 != 101) {
            this.field3483 = 10;
        }
        super.method989(arg1, (byte) -94, arg2, this.method987(3047), arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lpi;I)V", line = 598)
    public final void method1537(class336 arg0, int arg1) {
        arg0.field5353 = 0;
        field3500++;
        int var3 = arg0.method2364(-9069);
        int var4 = var3 & 0x1;
        boolean var5 = (var3 & 0x4) != 0;
        int var6 = super.method987(3047);
        this.method985(((var3 & 0x3E) >> 3) + 1, arg1 ^ 0x1738);
        this.field3495 = (byte) (var3 >> 6 & 0x3);
        this.field2036 += arg1 * (this.method987(3047) - var6);
        int var7 = -1;
        int[] var8 = new int[12];
        this.field1985 += (this.method987(3047) - var6) * 64;
        this.field3486 = arg0.method2323(-32);
        this.field3508 = arg0.method2323(arg1 + 58);
        this.field3490 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method2364(-9069);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method2364(arg1 - 9133);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method2339((byte) -46);
                    this.field3490 = arg0.method2364(-9069);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class123.field2137[var12 - 32768];
                    var8[var9] = class144.method1159(1073741824, var13);
                    int var14 = class5.method31(-1731690365, var13).field2329;
                    if (var14 != 0) {
                        this.field3490 = var14;
                    }
                } else {
                    var8[var9] = class144.method1159(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method2364(-9069);
            if (var17 < 0 || var17 >= class311.field4934[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1962 = arg0.method2339((byte) -46);
        long var18 = arg0.method2367((byte) -113);
        this.field3491 = class8.method48(var18, true);
        this.field3480 = arg0.method2364(-9069);
        if (var5) {
            this.field3478 = arg0.method2339((byte) -46);
            this.field3479 = this.field3480;
            this.field3494 = -1;
        } else {
            this.field3478 = 0;
            this.field3479 = arg0.method2364(-9069);
            this.field3494 = arg0.method2364(arg1 ^ 0xFFFFDCD3);
            if (this.field3494 == 255) {
                this.field3494 = -1;
            }
        }
        int var20 = this.field3483;
        this.field3483 = arg0.method2364(-9069);
        if (this.field3483 == 0) {
            class30.method282(this, -1);
        } else {
            int var21 = this.field3487;
            int var22 = this.field3505;
            int var23 = this.field3496;
            int var24 = this.field3503;
            int var25 = this.field3492;
            this.field3487 = arg0.method2339((byte) -46);
            this.field3492 = arg0.method2339((byte) -46);
            this.field3503 = arg0.method2339((byte) -46);
            this.field3496 = arg0.method2339((byte) -46);
            this.field3505 = arg0.method2364(arg1 ^ 0xFFFFDCD3);
            if (this.field3483 != var20 || this.field3487 != var21 || this.field3492 != var25 || this.field3503 != var24 || this.field3496 != var23 || this.field3505 != var22) {
                class263.method1816((byte) 102, this);
            }
        }
        if (this.field3477 == null) {
            this.field3477 = new class293();
        }
        int var26 = this.field3477.field4692;
        this.field3477.method2007(arg1 - 52, var4 == 1, var15, var8, var7, this.field1962);
        if (var7 != var26) {
            this.field2036 = this.field1975[0] * 128 + (this.method987(3047) * 64);
            this.field1985 = this.field2034[0] * 128 + (this.method987(3047) * 64);
        }
        if (this.field2012 != null) {
            this.field2012.method620();
        }
    }
}
