import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class270 extends class305 {

    @OriginalMember(owner = "client!th", name = "uc", descriptor = "I")
    public int field4190 = 0;

    @OriginalMember(owner = "client!th", name = "vc", descriptor = "I")
    public int field4191 = -1;

    @OriginalMember(owner = "client!th", name = "Cc", descriptor = "I")
    public int field4198 = -1;

    @OriginalMember(owner = "client!th", name = "Ec", descriptor = "B")
    private byte field4200 = 0;

    @OriginalMember(owner = "client!th", name = "Ic", descriptor = "I")
    public int field4204 = 0;

    @OriginalMember(owner = "client!th", name = "Tc", descriptor = "I")
    public int field4215 = -1;

    @OriginalMember(owner = "client!th", name = "Rc", descriptor = "I")
    public int field4213 = -1;

    @OriginalMember(owner = "client!th", name = "Oc", descriptor = "I")
    public int field4210 = -1;

    @OriginalMember(owner = "client!th", name = "Fc", descriptor = "I")
    public int field4201 = -1;

    @OriginalMember(owner = "client!th", name = "xc", descriptor = "I")
    public int field4193 = 0;

    @OriginalMember(owner = "client!th", name = "Zc", descriptor = "I")
    public int field4221 = 0;

    @OriginalMember(owner = "client!th", name = "Hc", descriptor = "I")
    public int field4203 = 0;

    @OriginalMember(owner = "client!th", name = "ad", descriptor = "I")
    public int field4222 = -1;

    @OriginalMember(owner = "client!th", name = "Bc", descriptor = "Z")
    public boolean field4197 = false;

    @OriginalMember(owner = "client!th", name = "dd", descriptor = "I")
    public int field4225 = 255;

    @OriginalMember(owner = "client!th", name = "Lc", descriptor = "Lfa;")
    public static class98 field4207 = new class98(64);

    @OriginalMember(owner = "client!th", name = "ed", descriptor = "Ldi;")
    public static class51 field4226 = new class51();

    @OriginalMember(owner = "client!th", name = "wc", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!th", name = "yc", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!th", name = "zc", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!th", name = "Ac", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!th", name = "Gc", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!th", name = "Jc", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!th", name = "Kc", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!th", name = "Mc", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!th", name = "Nc", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!th", name = "Pc", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!th", name = "Qc", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!th", name = "Sc", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!th", name = "Uc", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!th", name = "Vc", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!th", name = "Yc", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!th", name = "bd", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!th", name = "cd", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!th", name = "fd", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!th", name = "Xc", descriptor = "Le;")
    public static class237 field4219;

    @OriginalMember(owner = "client!th", name = "Dc", descriptor = "Log;")
    public class295 field4199;

    @OriginalMember(owner = "client!th", name = "Wc", descriptor = "Ljava/lang/String;")
    public String field4218;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILnl;)V", line = 9)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        field4202++;
        if (this.field4199 == null) {
            return;
        }
        class28 var13 = this.field4707 != -1 && this.field4684 == 0 ? client.method1010(this.field4707, (byte) 126) : null;
        class28 var14 = this.field4765 == -1 || this.field4197 || this.field4765 == this.method2099(78).field3988 && var13 != null ? null : client.method1010(this.field4765, (byte) 124);
        class74 var15 = this.field4199.method2037(this.field4695, var13, var14, this.field4727, this.field4672, -87980144, this.field4700, this.field4699, this.field4743, this.field4685, true);
        int var16 = class181.method1352(false);
        if (class73.field1058 && class245.field3715 < 96 && var16 > 50) {
            class110.method843(-128);
        }
        if (class120.field1855 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class332.field5160) {
                class59.field785[class332.field5160] = new byte[102400];
                class332.field5160++;
            }
            while (class332.field5160 > var17) {
                class332.field5160--;
                class59.field785[class332.field5160] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4722 = var15.method565();
        if (class134.field2036 && (this.field4199.field4552 == -1 || class242.method1676(this.field4199.field4552, 64).field5122)) {
            class74 var18 = class343.method2374(3, 0, this.field4731, 240, var15, var14 == null ? var13 : var14, var14 == null ? this.field4727 : this.field4743, this.field4713, this.field4683, 0, 1, arg0, this.field4732, 160);
            if (class73.field1058) {
                float var19 = class73.method529();
                float var20 = class73.method515();
                class73.method538();
                class73.method524(var19, var20 - 150.0F);
                var18.method576(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class249) null);
                class73.method525();
                class73.method524(var19, var20);
            } else {
                var18.method576(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class249) null);
            }
        }
        if (class39.field575 == this) {
            for (int var21 = class118.field1837.length - 1; var21 >= 0; var21--) {
                class279 var22 = class118.field1837[var21];
                if (var22 != null && var22.field4333 != -1) {
                    if (var22.field4338 == 1 && var22.field4328 >= 0 && var22.field4328 < class264.field4064.length) {
                        class76 var23 = class264.field4064[var22.field4328];
                        if (var23 != null) {
                            int var24 = var23.field4713 / 32 - (class39.field575.field4713 / 32);
                            int var25 = var23.field4731 / 32 - (class39.field575.field4731 / 32);
                            this.method1891(360000, var22.field4333, arg0, var24, arg5, (class249) null, arg9, arg3, arg4, (byte) 99, var25, arg6, arg1, arg7, arg2, var15);
                        }
                    }
                    if (var22.field4338 == 2) {
                        int var26 = (var22.field4331 - class327.field5054) * 4 + 2 - (class39.field575.field4713 / 32);
                        int var27 = (var22.field4334 - class293.field4522) * 4 + 2 - (class39.field575.field4731 / 32);
                        int var28 = var22.field4336 * 4;
                        int var29 = var28 * var28;
                        this.method1891(var29, var22.field4333, arg0, var26, arg5, (class249) null, arg9, arg3, arg4, (byte) 58, var27, arg6, arg1, arg7, arg2, var15);
                    }
                    if (var22.field4338 == 10 && var22.field4328 >= 0 && var22.field4328 < class201.field3096.length) {
                        class270 var30 = class201.field3096[var22.field4328];
                        if (var30 != null) {
                            int var31 = var30.field4713 / 32 - (class39.field575.field4713 / 32);
                            int var32 = var30.field4731 / 32 - (class39.field575.field4731 / 32);
                            this.method1891(360000, var22.field4333, arg0, var31, arg5, (class249) null, arg9, arg3, arg4, (byte) 47, var32, arg6, arg1, arg7, arg2, var15);
                        }
                    }
                }
            }
        }
        this.method2090((byte) -92, var15);
        this.method2100((byte) -65, var15, arg0);
        class74 var33 = null;
        if (!this.field4197 && this.field4750 != -1 && this.field4754 != -1) {
            class38 var34 = class265.method1866(this.field4750, 11273);
            var33 = var34.method292(this.field4692, this.field4769, 90, this.field4754);
            if (var33 != null) {
                var33.method567(0, -this.field4759, 0);
                if (var34.field555) {
                    if (class163.field2644 != 0) {
                        var33.method559(class163.field2644);
                    }
                    if (class172.field2787 != 0) {
                        var33.method578(class172.field2787);
                    }
                    if (class203.field3116 != 0) {
                        var33.method567(0, class203.field3116, 0);
                    }
                }
            }
        }
        class74 var35 = null;
        if (!this.field4197 && this.field4729 != null) {
            if (class233.field3542 >= this.field4689) {
                this.field4729 = null;
            }
            if (this.field4686 <= class233.field3542 && class233.field3542 < this.field4689) {
                if ((this.field4729 instanceof class264)) {
                    var35 = (class74) ((class264) this.field4729).method1858(117);
                } else {
                    var35 = (class74) this.field4729;
                }
                var35.method567(this.field4681 - this.field4713, -this.field4732 + this.field4730, this.field4719 - this.field4731);
                if (this.field4674 == 512) {
                    var35.method570();
                } else if (this.field4674 == 1024) {
                    var35.method573();
                } else if (this.field4674 == 1536) {
                    var35.method574();
                }
            }
        }
        if (class73.field1058) {
            var15.field1085 = true;
            var15.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4693);
            if (var33 != null) {
                var33.field1085 = true;
                var33.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4693);
            }
        } else {
            if (var33 != null) {
                var15 = ((class113) var15).method870(var33);
            }
            if (var35 != null) {
                var15 = ((class113) var15).method870(var35);
            }
            var15.field1085 = true;
            var15.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4693);
        }
        if (var35 == null) {
            return;
        }
        if (this.field4674 == 512) {
            var35.method574();
        } else if (this.field4674 == 1024) {
            var35.method573();
        } else if (this.field4674 == 1536) {
            var35.method570();
        }
        var35.method567(this.field4713 - this.field4681, -this.field4730 + this.field4732, this.field4731 - this.field4719);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lmn;II)I", line = 264)
    public static final int method1887(class161 arg0, int arg1, int arg2) {
        field4195++;
        if (!client.method1012(arg0).method26(arg1 + 16186, arg2) && arg0.field2528 == null) {
            return -1;
        } else {
            if (arg1 != -16185) {
                method1898(30, -50, -76, -111, 62, 7, 48, 126, -45);
            }
            return arg0.field2614 == null || arg2 >= arg0.field2614.length ? -1 : arg0.field2614[arg2];
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Ljava/lang/String;IB[S)V", line = 282)
    public static final void method1888(int arg0, String[] arg1, int arg2, byte arg3, short[] arg4) {
        field4220++;
        if (arg0 < arg2) {
            int var5 = arg0;
            int var6 = (arg0 + arg2) / 2;
            String var7 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var7;
            short var8 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg1[arg2] = arg1[var5];
            arg1[var5] = var7;
            arg4[arg2] = arg4[var5];
            arg4[var5] = var8;
            method1888(arg0, arg1, var5 - 1, (byte) -108, arg4);
            method1888(var5 + 1, arg1, arg2, (byte) -108, arg4);
        }
        if (arg3 != -108) {
            method1887((class161) null, -128, -47);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V", line = 343)
    public static final void method1889(int arg0, boolean arg1) {
        field4212++;
        if (arg1) {
            if (class28.field334 != -1) {
                class330.method2302(arg0 + 1206133549, class28.field334);
            }
            for (class242 var2 = (class242) class222.field3383.method1706(0); var2 != null; var2 = (class242) class222.field3383.method1705((byte) 86)) {
                class147.method1109(var2, true, (byte) 64);
            }
            class28.field334 = -1;
            class222.field3383 = new class250(8);
            class5.method45(255);
            class28.field334 = class217.field3323;
            class265.method1860((byte) -47, false);
            class323.method2241(-121);
            class85.method642(arg0 + 1206115998, class28.field334);
        }
        class38.field552 = -1;
        class171.method1292((byte) 101, class340.field5284);
        class39.field575 = new class270();
        class39.field575.field4731 = 3000;
        if (arg0 != -1206115993) {
            method1892((class5) null, 10, (class5) null);
        }
        class39.field575.field4713 = 3000;
        if (!class73.field1058 && class248.field3754 == 0) {
            class5.method41(true, class264.field4087);
            class101.method758(123, 10);
            return;
        }
        if (class268.field4168 == 2) {
            class197.field3028 = class106.field1538 << 7;
            class190.field2976 = class32.field396 << 7;
        } else {
            class209.method1500(2);
        }
        if (class73.field1058) {
            class222.method1578(-13559);
        }
        class109.method832((byte) -121);
        class101.method758(arg0 ^ 0xB81C2119, 28);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLwm;)V", line = 406)
    public final void method1890(byte arg0, class254 arg1) {
        arg1.field3866 = 0;
        field4227++;
        int var3 = arg1.method1774((byte) -100);
        int var4 = super.method1897(8);
        this.method2094(((var3 & 0x39) >> 3) + 1, 7);
        this.field4200 = (byte) ((var3 & 0xCA) >> 6);
        boolean var5 = (var3 & 0x4) != 0;
        this.field4713 += (this.method1897(8) - var4) * 64;
        int var6 = var3 & 0x1;
        this.field4731 += (this.method1897(8) - var4) * 64;
        this.field4222 = arg1.method1733(2023893896);
        int var7 = -1;
        this.field4191 = arg1.method1733(2023893896);
        this.field4193 = 0;
        int[] var8 = new int[12];
        if (arg0 < 88) {
            return;
        }
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method1774((byte) -109);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method1774((byte) -108);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method1755(false);
                    this.field4193 = arg1.method1774((byte) -112);
                    break;
                }
                if (var12 < 32768) {
                    var8[var9] = class261.method1835(var12 - 256, Integer.MIN_VALUE);
                } else {
                    int var13 = class110.field1660[var12 - 32768];
                    var8[var9] = class261.method1835(1073741824, var13);
                    int var14 = class222.method1576(var13, (byte) 92).field1635;
                    if (var14 != 0) {
                        this.field4193 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method1774((byte) -92);
            if (var17 < 0 || var17 >= class122.field1870[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4767 = arg1.method1755(false);
        long var18 = arg1.method1777(2047062688);
        this.field4218 = class336.method2344(23827, var18);
        this.field4203 = arg1.method1774((byte) -107);
        if (var5) {
            this.field4221 = arg1.method1755(false);
            this.field4198 = -1;
            this.field4204 = this.field4203;
        } else {
            this.field4221 = 0;
            this.field4204 = arg1.method1774((byte) -123);
            this.field4198 = arg1.method1774((byte) 52);
            if (this.field4198 == 255) {
                this.field4198 = -1;
            }
        }
        int var20 = this.field4190;
        this.field4190 = arg1.method1774((byte) 104);
        if (this.field4190 == 0) {
            class273.method1902(this, -11210);
        } else {
            int var21 = this.field4215;
            int var22 = this.field4213;
            int var23 = this.field4210;
            int var24 = this.field4201;
            int var25 = this.field4225;
            this.field4210 = arg1.method1755(false);
            this.field4201 = arg1.method1755(false);
            this.field4215 = arg1.method1755(false);
            this.field4213 = arg1.method1755(false);
            this.field4225 = arg1.method1774((byte) 35);
            if (this.field4190 != var20 || this.field4210 != var23 || this.field4201 != var24 || this.field4215 != var21 || this.field4213 != var22 || this.field4225 != var25) {
                class237.method1654(this, (byte) 77);
            }
        }
        if (this.field4199 == null) {
            this.field4199 = new class295();
        }
        int var26 = this.field4199.field4552;
        this.field4199.method2036(var8, var6 == 1, var7, var15, (byte) -108, this.field4767);
        if (var7 != var26) {
            this.field4713 = this.field4676[0] * 128 + (this.method1897(8) * 64);
            this.field4731 = this.field4744[0] * 128 + this.method1897(8) * 64;
        }
        if (this.field4693 != null) {
            this.field4693.method1702();
        }
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V", line = 567)
    protected final void finalize() {
        field4217++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 579)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4216++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I", line = 601)
    public final int method565() {
        field4211++;
        return this.field4722;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIILnl;IIIBIIIIILr;)V", line = 612)
    private final void method1891(int arg0, int arg1, int arg2, int arg3, int arg4, class249 arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class74 arg15) {
        field4206++;
        int var17 = arg3 * arg3 + arg10 * arg10;
        if (var17 < 16 || arg0 < var17) {
            return;
        }
        if (arg9 < 38) {
            this.field4199 = (class295) null;
        }
        int var18 = (int) (Math.atan2((double) arg3, (double) arg10) * 325.949D) & 0x7FF;
        class74 var19 = class59.method415(arg1, this.field4731, var18, 0, this.field4713, this.field4732, arg15);
        if (var19 == null) {
            return;
        }
        if (!class73.field1058) {
            var19.method576(0, arg12, arg14, arg7, arg8, arg4, arg11, arg13, -1L, arg6, arg5);
            return;
        }
        float var20 = class73.method529();
        float var21 = class73.method515();
        class73.method538();
        class73.method524(var20, var21 - 150.0F);
        var19.method576(0, arg12, arg14, arg7, arg8, arg4, arg11, arg13, -1L, arg6, arg5);
        class73.method525();
        class73.method524(var20, var21);
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)I", line = 652)
    public final int method601(byte arg0) {
        field4196++;
        if (arg0 >= -9) {
            this.method572(61, 116, 28, 78, -17);
        }
        return this.field4767;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lma;ILma;)V", line = 667)
    public static final void method1892(class5 arg0, int arg1, class5 arg2) {
        field4214++;
        if (arg0.field68 != null) {
            arg0.method39(10717);
        }
        arg0.field68 = arg2.field68;
        if (arg1 != 20459) {
            method1899(14);
        }
        arg0.field81 = arg2;
        arg0.field68.field81 = arg0;
        arg0.field81.field68 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIBI)V", line = 689)
    public final void method1893(boolean arg0, int arg1, byte arg2, int arg3) {
        super.method2089(arg3, this.method1897(arg2 ^ 0xFFFFFFDA), false, arg0, arg1);
        field4192++;
        if (arg2 != -46) {
            field4219 = (class237) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V", line = 701)
    public static void method1894(int arg0) {
        if (arg0 != 28215) {
            method1899(-48);
        }
        field4219 = null;
        field4207 = null;
        field4226 = null;
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)Ljava/lang/String;", line = 714)
    public final String method1895(int arg0) {
        field4208++;
        String var2 = this.field4218;
        if (class56.field736 != null) {
            var2 = class56.field736[this.field4200] + var2;
        }
        if (arg0 != 1958408711) {
            this.method598(-51);
        }
        if (class260.field4000 != null) {
            var2 = var2 + class260.field4000[this.field4200];
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjd;)V", line = 734)
    public static final void method1896(byte arg0, class95 arg1) {
        field4194++;
        class182.field2887 = arg1;
        int var2 = -111 / ((arg0 + 10) / 54);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I", line = 747)
    public final int method1897(int arg0) {
        field4224++;
        if (this.field4199 == null || this.field4199.field4552 == -1) {
            if (arg0 != 8) {
                this.method576(105, 42, -39, -10, 48, 7, -55, 48, -7L, 126, (class249) null);
            }
            return super.method1897(arg0 ^ 0x0);
        } else {
            return class242.method1676(this.field4199.field4552, 64).field5181;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIII)V", line = 762)
    public static final void method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 < 48) {
            field4207 = (class98) null;
        }
        for (int var9 = 0; var9 < class228.field3489.field291; var9++) {
            if (class228.field3489.method197(-88, var9)) {
                int[] var10 = class163.field2649.method1842(class228.field3489.field289[var9] >> 14 & 0x3FFF, (class228.field3489.field289[var9] & 0x37CD0AB0) >> 28, class228.field3489.field289[var9] & 0x3FFF, (byte) -44);
                if (var10 != null) {
                    int var11 = var10[1] - class196.field3024;
                    int var12 = class176.field2822 + class229.field3494 - var10[2] - 1;
                    int var13 = (var11 - arg4) * (arg8 - arg5) / (arg0 - arg4) + arg5;
                    int var14 = class228.field3489.method202(3, var9);
                    int var15 = arg6 + ((var12 - arg1) * (arg7 - arg6) / (arg3 - arg1));
                    int var16 = 16777215;
                    class310 var17 = null;
                    if (var14 == 0) {
                        if ((double) class198.field3035 == 3.0D) {
                            var17 = class281.field4374;
                        }
                        if ((double) class198.field3035 == 4.0D) {
                            var17 = class82.field1205;
                        }
                        if ((double) class198.field3035 == 6.0D) {
                            var17 = class268.field4172;
                        }
                        if ((double) class198.field3035 >= 8.0D) {
                            var17 = class312.field4842;
                        }
                    }
                    if (var14 == 1) {
                        if ((double) class198.field3035 == 3.0D) {
                            var17 = class268.field4172;
                        }
                        if ((double) class198.field3035 == 4.0D) {
                            var17 = class312.field4842;
                        }
                        if ((double) class198.field3035 == 6.0D) {
                            var17 = class311.field4834;
                        }
                        if ((double) class198.field3035 >= 8.0D) {
                            var17 = class222.field3381;
                        }
                    }
                    if (var14 == 2) {
                        if ((double) class198.field3035 == 3.0D) {
                            var17 = class311.field4834;
                        }
                        if ((double) class198.field3035 == 4.0D) {
                            var17 = class222.field3381;
                        }
                        if ((double) class198.field3035 == 6.0D) {
                            var17 = class309.field4815;
                        }
                        var16 = 16755200;
                        if ((double) class198.field3035 >= 8.0D) {
                            var17 = class84.field1228;
                        }
                    }
                    if (class228.field3489.field281[var9] != -1) {
                        var16 = class228.field3489.field281[var9];
                    }
                    if (var17 != null) {
                        int var18 = class300.field4623.method2260(class228.field3489.field283[var9], (int[]) null, class197.field3030);
                        int var19 = var15 - var17.method2122() * (var18 - 1) / 2;
                        int var20 = var19 + var17.method2129() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class197.field3030[var21];
                            if (var18 - 1 > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method2125(var22, var13, var20, var16, true);
                            var20 += var17.method2122();
                        }
                    }
                }
            }
        }
        field4223++;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Z", line = 886)
    public final boolean method598(int arg0) {
        if (arg0 > -30) {
            this.method601((byte) -46);
        }
        field4205++;
        return this.field4199 != null;
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V", line = 937)
    public static final void method1899(int arg0) {
        class83.field1219 = null;
        field4209++;
        class153.method1153(0, class215.field3300, arg0, class151.field2281, -57, 0, class28.field334, -1, 0);
        if (class83.field1219 != null) {
            class261.method1836(class112.field1696, class151.field2281, -1412584499, class267.field4152, class215.field3300, 0, class83.field1219, class153.field2324.field2457, 0, 0);
            class83.field1219 = null;
        }
    }
}
