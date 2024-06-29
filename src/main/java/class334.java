import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class334 extends class263 {

    @OriginalMember(owner = "client!qm", name = "kc", descriptor = "I")
    public int field5197 = 0;

    @OriginalMember(owner = "client!qm", name = "rc", descriptor = "I")
    public int field5204 = -1;

    @OriginalMember(owner = "client!qm", name = "oc", descriptor = "I")
    public int field5201 = -1;

    @OriginalMember(owner = "client!qm", name = "uc", descriptor = "I")
    public int field5207 = 0;

    @OriginalMember(owner = "client!qm", name = "tc", descriptor = "I")
    public int field5206 = -1;

    @OriginalMember(owner = "client!qm", name = "zc", descriptor = "I")
    public int field5212 = -1;

    @OriginalMember(owner = "client!qm", name = "Bc", descriptor = "I")
    public int field5214 = 0;

    @OriginalMember(owner = "client!qm", name = "yc", descriptor = "I")
    public int field5211 = -1;

    @OriginalMember(owner = "client!qm", name = "Fc", descriptor = "I")
    public int field5218 = -1;

    @OriginalMember(owner = "client!qm", name = "Hc", descriptor = "I")
    public int field5220 = 255;

    @OriginalMember(owner = "client!qm", name = "Cc", descriptor = "I")
    public int field5215 = -1;

    @OriginalMember(owner = "client!qm", name = "sc", descriptor = "I")
    public int field5205 = 0;

    @OriginalMember(owner = "client!qm", name = "wc", descriptor = "B")
    private byte field5209 = 0;

    @OriginalMember(owner = "client!qm", name = "Nc", descriptor = "I")
    public int field5226 = 0;

    @OriginalMember(owner = "client!qm", name = "Oc", descriptor = "Z")
    public boolean field5227 = false;

    @OriginalMember(owner = "client!qm", name = "ic", descriptor = "I")
    public static int field5195 = 0;

    @OriginalMember(owner = "client!qm", name = "vc", descriptor = "Ljava/lang/String;")
    public static String field5208 = "Loaded textures";

    @OriginalMember(owner = "client!qm", name = "Ec", descriptor = "[I")
    public static int[] field5217 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qm", name = "jc", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!qm", name = "lc", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!qm", name = "mc", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!qm", name = "nc", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!qm", name = "pc", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!qm", name = "qc", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!qm", name = "xc", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!qm", name = "Ac", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!qm", name = "Gc", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!qm", name = "Ic", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!qm", name = "Jc", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!qm", name = "Kc", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!qm", name = "Mc", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!qm", name = "Lc", descriptor = "Lsk;")
    public class106 field5224;

    @OriginalMember(owner = "client!qm", name = "Dc", descriptor = "Ljava/lang/String;")
    public String field5216;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method1695(int arg0) {
        field5198++;
        if (this.field5224 == null) {
            return false;
        } else if (arg0 == 29082) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)I", line = 22)
    public final int method1698(boolean arg0) {
        field5202++;
        if (arg0) {
            method2336(-118);
        }
        return this.field4234;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V", line = 39)
    public static final void method2331(int arg0, boolean arg1) {
        field5225++;
        int var2 = class129.field2017.length;
        if (arg0 != 255) {
            return;
        }
        byte[][] var3;
        if (class232.field3690 && arg1) {
            var3 = class4.field69;
        } else {
            var3 = class256.field4120;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class330.field5109[var4] >> 8) * 64 - class70.field989;
                int var7 = (class330.field5109[var4] & 0xFF) * 64 - class205.field3367;
                class76.method516((byte) -51);
                class323.method2262((byte) -123, arg1, var7, var6, class126.field1964, var5);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIJILpe;)V", line = 76)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10) {
        field5210++;
        if (this.field5224 == null) {
            return;
        }
        class202 var13 = this.field4268 != -1 && this.field4190 == 0 ? class325.method2274(this.field4268, -63) : null;
        class202 var14 = this.field4232 == -1 || this.field5227 || this.field4232 == this.method1876((byte) 125).field200 && var13 != null ? null : class325.method2274(this.field4232, -90);
        class262 var15 = this.field5224.method725(var13, true, this.field4274, this.field4191, this.field4265, this.field4237, this.field4212, var14, this.field4201, this.field4195, (byte) 100);
        int var16 = class178.method1334(105);
        if (class232.field3690 && class36.field480 < 96 && var16 > 50) {
            class100.method687(0);
        }
        if (class34.field456 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class55.field777) {
                class77.field1090[class55.field777] = new byte[102400];
                class55.field777++;
            }
            while (var17 < class55.field777) {
                class55.field777--;
                class77.field1090[class55.field777] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4272 = var15.method33();
        if (class180.field2984 && (this.field5224.field1568 == -1 || class98.method666((byte) -65, this.field5224.field1568).field4054)) {
            class262 var18 = class307.method2179(arg0, var14 == null ? this.field4265 : this.field4212, this.field4247, this.field4264, 0, var15, (byte) -122, 160, this.field4255, var14 == null ? var13 : var14, 1, 240, this.field4219, 0);
            if (class232.field3690) {
                float var19 = class232.method1646();
                float var20 = class232.method1642();
                class232.method1673();
                class232.method1680(var19, var20 - 150.0F);
                var18.method38(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class294) null);
                class232.method1681();
                class232.method1680(var19, var20);
            } else {
                var18.method38(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class294) null);
            }
        }
        if (class191.field3129 == this) {
            for (int var21 = class175.field2895.length - 1; var21 >= 0; var21--) {
                class193 var22 = class175.field2895[var21];
                if (var22 != null && var22.field3160 != -1) {
                    if (var22.field3156 == 1 && var22.field3162 >= 0 && class99.field1445.length > var22.field3162) {
                        class234 var23 = class99.field1445[var22.field3162];
                        if (var23 != null) {
                            int var24 = var23.field4255 / 32 - (class191.field3129.field4255 / 32);
                            int var25 = var23.field4264 / 32 - class191.field3129.field4264 / 32;
                            this.method2337(var24, arg2, arg3, (class294) null, var15, arg1, arg4, arg5, arg9, arg6, arg0, 0, var22.field3160, var25, 360000, arg7);
                        }
                    }
                    if (var22.field3156 == 2) {
                        int var26 = (var22.field3145 - class205.field3367) * 4 + 2 - (class191.field3129.field4264 / 32);
                        int var27 = (var22.field3161 - class70.field989) * 4 + 2 - (class191.field3129.field4255 / 32);
                        int var28 = var22.field3164 * 4;
                        int var29 = var28 * var28;
                        this.method2337(var27, arg2, arg3, (class294) null, var15, arg1, arg4, arg5, arg9, arg6, arg0, 0, var22.field3160, var26, var29, arg7);
                    }
                    if (var22.field3156 == 10 && var22.field3162 >= 0 && class74.field1049.length > var22.field3162) {
                        class334 var30 = class74.field1049[var22.field3162];
                        if (var30 != null) {
                            int var31 = var30.field4255 / 32 - (class191.field3129.field4255 / 32);
                            int var32 = var30.field4264 / 32 - class191.field3129.field4264 / 32;
                            this.method2337(var31, arg2, arg3, (class294) null, var15, arg1, arg4, arg5, arg9, arg6, arg0, 0, var22.field3160, var32, 360000, arg7);
                        }
                    }
                }
            }
        }
        this.method1877(true, var15);
        class262 var33 = null;
        this.method1884(var15, arg0, (byte) 121);
        if (!this.field5227 && this.field4278 != -1 && this.field4276 != -1) {
            class323 var34 = class215.method1545(this.field4278, 1);
            var33 = var34.method2265(-104, this.field4211, this.field4267, this.field4276);
            if (var33 != null) {
                var33.method1189(0, -this.field4206, 0);
                if (var34.field5018) {
                    if (class101.field1476 != 0) {
                        var33.method1163(class101.field1476);
                    }
                    if (class278.field4480 != 0) {
                        var33.method1186(class278.field4480);
                    }
                    if (class34.field462 != 0) {
                        var33.method1189(0, class34.field462, 0);
                    }
                }
            }
        }
        class262 var35 = null;
        if (!this.field5227 && this.field4189 != null) {
            if (class240.field3818 >= this.field4203) {
                this.field4189 = null;
            }
            if (class240.field3818 >= this.field4221 && class240.field3818 < this.field4203) {
                if (this.field4189 instanceof class175) {
                    var35 = (class262) ((class175) this.field4189).method1323(0);
                } else {
                    var35 = (class262) this.field4189;
                }
                var35.method1189(this.field4216 - this.field4255, this.field4218 - this.field4219, this.field4217 - this.field4264);
                if (this.field4277 == 512) {
                    var35.method1176();
                } else if (this.field4277 == 1024) {
                    var35.method1190();
                } else if (this.field4277 == 1536) {
                    var35.method1169();
                }
            }
        }
        if (class232.field3690) {
            var15.field4178 = true;
            var15.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4205);
            if (var33 != null) {
                var33.field4178 = true;
                var33.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4205);
            }
        } else {
            if (var33 != null) {
                var15 = ((class250) var15).method1778(var33);
            }
            if (var35 != null) {
                var15 = ((class250) var15).method1778(var35);
            }
            var15.field4178 = true;
            var15.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4205);
        }
        if (var35 == null) {
            return;
        }
        if (this.field4277 == 512) {
            var35.method1169();
        } else if (this.field4277 == 1024) {
            var35.method1190();
        } else if (this.field4277 == 1536) {
            var35.method1176();
        }
        var35.method1189(this.field4255 - this.field4216, -this.field4218 + this.field4219, this.field4264 - this.field4217);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLjj;)V", line = 327)
    public final void method2332(byte arg0, class44 arg1) {
        field5203++;
        arg1.field586 = 0;
        int var3 = arg1.method286((byte) -120);
        boolean var4 = (var3 & 0x4) != 0;
        int var5 = super.method1881(-20395);
        int var6 = var3 & 0x1;
        this.method1883(8, ((var3 & 0x38) >> 3) + 1);
        int var7 = -1;
        int[] var8 = new int[12];
        this.field5209 = (byte) ((var3 & 0xCD) >> 6);
        this.field4255 += (this.method1881(arg0 - 20381) - var5) * 64;
        this.field4264 += (this.method1881(-20395) - var5) * 64;
        this.field5215 = arg1.method246((byte) -58);
        this.field5212 = arg1.method246((byte) -34);
        this.field5214 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method286((byte) -108);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method286((byte) -127);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method271(21081);
                    this.field5214 = arg1.method286((byte) -85);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class252.field4029[var12 - 32768];
                    var8[var9] = class122.method882(var13, 1073741824);
                    int var14 = class285.method2054(var13, arg0 + 14).field5112;
                    if (var14 != 0) {
                        this.field5214 = var14;
                    }
                } else {
                    var8[var9] = class122.method882(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method286((byte) -121);
            if (var17 < 0 || var17 >= class11.field143[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4234 = arg1.method271(arg0 ^ 0xFFFFADAB);
        long var18 = arg1.method276((byte) 121);
        this.field5216 = class13.method74(86, var18);
        this.field5205 = arg1.method286((byte) -126);
        if (var4) {
            this.field5197 = arg1.method271(arg0 + 21095);
            this.field5207 = this.field5205;
            this.field5204 = -1;
        } else {
            this.field5197 = 0;
            this.field5207 = arg1.method286((byte) -117);
            this.field5204 = arg1.method286((byte) -113);
            if (this.field5204 == 255) {
                this.field5204 = -1;
            }
        }
        int var20 = this.field5226;
        this.field5226 = arg1.method286((byte) -85);
        if (this.field5226 == 0) {
            class315.method2214(this, 0);
        } else {
            int var21 = this.field5201;
            int var22 = this.field5211;
            int var23 = this.field5218;
            int var24 = this.field5220;
            int var25 = this.field5206;
            this.field5211 = arg1.method271(arg0 ^ 0xFFFFADAB);
            this.field5201 = arg1.method271(21081);
            this.field5218 = arg1.method271(21081);
            this.field5206 = arg1.method271(arg0 + 21095);
            this.field5220 = arg1.method286((byte) -100);
            if (this.field5226 != var20 || this.field5211 != var22 || this.field5201 != var21 || this.field5218 != var23 || this.field5206 != var25 || this.field5220 != var24) {
                class229.method1617((byte) -26, this);
            }
        }
        if (this.field5224 == null) {
            this.field5224 = new class106();
        }
        int var26 = this.field5224.field1568;
        if (arg0 != -14) {
            return;
        }
        this.field5224.method730(var15, this.field4234, var6 == 1, var8, -122, var7);
        if (var7 != var26) {
            this.field4255 = this.field4248[0] * 128 + (this.method1881(-20395) * 64);
            this.field4264 = this.field4184[0] * 128 + (this.method1881(-20395) * 64);
        }
        if (this.field4205 != null) {
            this.field4205.method2105();
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 486)
    public final String method2333(boolean arg0) {
        String var2 = this.field5216;
        if (class311.field4845 != null) {
            var2 = class311.field4845[this.field5209] + var2;
        }
        if (class23.field325 != null) {
            var2 = var2 + class23.field325[this.field5209];
        }
        if (arg0) {
            field5219++;
            return var2;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I", line = 508)
    public static final int method2334(byte arg0) {
        if (arg0 > -13) {
            field5195 = -110;
        }
        field5223++;
        if (class310.field4838) {
            return 0;
        } else if (class76.method518(-19076)) {
            return class273.field4410 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 533)
    protected final void finalize() {
        field5200++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIZB)V", line = 542)
    public final void method2335(int arg0, int arg1, boolean arg2, byte arg3) {
        int var5 = 82 % ((arg3 + 20) / 46);
        field5221++;
        super.method1873(arg2, arg0, arg1, this.method1881(-20395), false);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()I", line = 558)
    public final int method33() {
        field5196++;
        return this.field4272;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 582)
    public static void method2336(int arg0) {
        if (arg0 == -24624) {
            field5217 = null;
            field5208 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILpe;Lei;IIIIIIIIIII)V", line = 626)
    private final void method2337(int arg0, int arg1, int arg2, class294 arg3, class262 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field5199++;
        int var17 = arg0 * arg0 + (arg13 * arg13);
        if (var17 < 16 || var17 > arg14 || arg11 != 0) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg0, (double) arg13) * 325.949D) & 0x7FF;
        class262 var19 = class234.method1699(this.field4264, arg12, this.field4255, arg4, var18, this.field4219, -3514);
        if (var19 == null) {
            return;
        }
        if (!class232.field3690) {
            var19.method38(0, arg5, arg1, arg2, arg6, arg7, arg9, arg15, -1L, arg8, arg3);
            return;
        }
        float var20 = class232.method1646();
        float var21 = class232.method1642();
        class232.method1673();
        class232.method1680(var20, var21 - 150.0F);
        var19.method38(0, arg5, arg1, arg2, arg6, arg7, arg9, arg15, -1L, arg8, arg3);
        class232.method1681();
        class232.method1680(var20, var21);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)I", line = 674)
    public final int method1881(int arg0) {
        field5213++;
        if (this.field5224 == null || this.field5224.field1568 == -1) {
            return arg0 == -20395 ? super.method1881(-20395) : -57;
        } else {
            return class98.method666((byte) -65, this.field5224.field1568).field4051;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V", line = 692)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5222++;
    }
}
