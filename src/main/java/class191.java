import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class191 extends class70 {

    @OriginalMember(owner = "client!ea", name = "Tb", descriptor = "S")
    private short field3265 = 0;

    @OriginalMember(owner = "client!ea", name = "Jb", descriptor = "Z")
    public boolean field3255 = false;

    @OriginalMember(owner = "client!ea", name = "Sb", descriptor = "I")
    public int field3264 = 0;

    @OriginalMember(owner = "client!ea", name = "Mb", descriptor = "I")
    private int field3258 = 0;

    @OriginalMember(owner = "client!ea", name = "ec", descriptor = "I")
    public int field3276 = 0;

    @OriginalMember(owner = "client!ea", name = "Ub", descriptor = "I")
    public int field3266 = 0;

    @OriginalMember(owner = "client!ea", name = "kc", descriptor = "I")
    public int field3282 = 0;

    @OriginalMember(owner = "client!ea", name = "bc", descriptor = "I")
    public int field3273 = -1;

    @OriginalMember(owner = "client!ea", name = "Zb", descriptor = "I")
    public int field3271 = 0;

    @OriginalMember(owner = "client!ea", name = "Vb", descriptor = "I")
    public int field3267 = -1;

    @OriginalMember(owner = "client!ea", name = "rc", descriptor = "I")
    public int field3289 = -1;

    @OriginalMember(owner = "client!ea", name = "Nb", descriptor = "I")
    public int field3259 = 0;

    @OriginalMember(owner = "client!ea", name = "Qb", descriptor = "S")
    private short field3262 = 0;

    @OriginalMember(owner = "client!ea", name = "nc", descriptor = "I")
    public int field3285 = -1;

    @OriginalMember(owner = "client!ea", name = "Yb", descriptor = "I")
    public int field3270 = -1;

    @OriginalMember(owner = "client!ea", name = "qc", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!ea", name = "Rb", descriptor = "Lpa;")
    public static class2 field3263 = class148.method919(50);

    @OriginalMember(owner = "client!ea", name = "tc", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!ea", name = "Kb", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ea", name = "Lb", descriptor = "I")
    private int field3257;

    @OriginalMember(owner = "client!ea", name = "Ob", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!ea", name = "Wb", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ea", name = "Xb", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ea", name = "ac", descriptor = "I")
    private int field3272;

    @OriginalMember(owner = "client!ea", name = "dc", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!ea", name = "gc", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!ea", name = "hc", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ea", name = "ic", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ea", name = "jc", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ea", name = "lc", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ea", name = "mc", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!ea", name = "oc", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!ea", name = "pc", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ea", name = "sc", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ea", name = "fc", descriptor = "Lre;")
    public class262 field3277;

    @OriginalMember(owner = "client!ea", name = "cc", descriptor = "Lbe;")
    public class283 field3274;

    @OriginalMember(owner = "client!ea", name = "Pb", descriptor = "Lhk;")
    public class289 field3261;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V", line = 24)
    public static void method1239(byte arg0) {
        field3263 = null;
        if (arg0 >= -6) {
            method1239((byte) 12);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)Lbe;", line = 38)
    public final class283 method1240(boolean arg0) {
        if (arg0) {
            field3263 = (class2) null;
        }
        field3281++;
        class283 var2 = this.field3274;
        if (class50.field685 != null) {
            var2 = class299.method2022(new class283[] { class50.field685[this.field3258], var2 }, (byte) 102);
        }
        if (class76.field1327 != null) {
            var2 = class299.method2022(new class283[] { var2, class76.field1327[this.field3258] }, (byte) 55);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I", line = 68)
    public final int method460(byte arg0) {
        field3283++;
        int var2 = 33 % ((80 - arg0) / 32);
        return this.field3277 == null || this.field3277.field4450 == -1 ? super.method460((byte) -13) : class207.method1379(-63, this.field3277.field4450).field2157;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I", line = 84)
    public final int method40() {
        field3290++;
        return this.field1188;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZII)V", line = 93)
    public final void method1241(byte arg0, boolean arg1, int arg2, int arg3) {
        field3279++;
        if (arg0 > -69) {
            this.field3260 = -38;
        }
        super.method457(arg1, arg2, this.method460((byte) -99), (byte) -17, arg3);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILhk;IIIIIIII)V", line = 111)
    private final void method1242(int arg0, int arg1, int arg2, int arg3, class289 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3269++;
        int var14 = arg5 * arg5 + arg12 * arg12;
        if (var14 < 16 || var14 > 360000) {
            return;
        }
        int var15 = (int) (Math.atan2((double) arg5, (double) arg12) * 325.949D) & arg10;
        class289 var16 = class91.method582(var15, this.field1180, (byte) -85, arg9, this.field1210, this.field1193, arg4);
        if (var16 == null) {
            return;
        }
        float var17 = class167.method1056();
        float var18 = class167.method1048();
        class167.method1041();
        class167.method1052(var17, var18 - 150.0F);
        var16.method41(0, arg3, arg0, arg7, arg11, arg1, arg8, arg2, -1L);
        class167.method1037();
        class167.method1052(var17, var18);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(Z)V", line = 147)
    public static final void method1243(boolean arg0) {
        field3280++;
        class270.field4564.method1631(-27875);
        if (!arg0) {
            field3263 = (class2) null;
        }
        class148.field2414.method1631(-27875);
        class30.field452.method1631(-27875);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIJ)V", line = 200)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3256++;
        if (this.field3277 == null) {
            return;
        }
        class157 var11 = this.field1192 != -1 && this.field1200 == 0 ? class132.method821(128, this.field1192) : null;
        class157 var12 = this.field1219 == -1 || this.field3255 || this.field1219 == this.field1203 && var11 != null ? null : class132.method821(128, this.field1219);
        class289 var13 = this.field3277.method1779(var11, this.field1220, var12, this.field1205, -1);
        if (var13 == null) {
            return;
        }
        this.field1188 = var13.method40();
        if (class91.field1541 && (this.field3277.field4450 == -1 || class207.method1379(-63, this.field3277.field4450).field2165)) {
            class289 var14 = class169.method1069(0, this.field1180, var12 == null ? var11 : var12, arg0, this.field1210, 240, 1, this.field1176, 160, 1, var13, 0, this.field1193, var12 == null ? this.field1220 : this.field1205);
            float var15 = class167.method1056();
            float var16 = class167.method1048();
            class167.method1041();
            class167.method1052(var15, var16 - 150.0F);
            var14.method41(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class167.method1037();
            class167.method1052(var15, var16);
        }
        if (class213.field3624 == this) {
            for (int var17 = class38.field555.length - 1; var17 >= 0; var17--) {
                class290 var18 = class38.field555[var17];
                if (var18 != null && var18.field4922 != -1) {
                    if (var18.field4907 == 1 && var18.field4908 >= 0 && class33.field493.length > var18.field4908) {
                        class60 var19 = class33.field493[var18.field4908];
                        if (var19 != null) {
                            int var20 = var19.field1193 / 32 - (class213.field3624.field1193 / 32);
                            int var21 = var19.field1210 / 32 - class213.field3624.field1210 / 32;
                            this.method1242(arg2, arg5, arg7, arg1, var13, var20, arg0, arg3, arg6, var18.field4922, 2047, arg4, var21);
                        }
                    }
                    if (var18.field4907 == 2) {
                        int var22 = (var18.field4919 - class214.field3637) * 4 + 2 - class213.field3624.field1193 / 32;
                        int var23 = (var18.field4916 - class107.field1833) * 4 + 2 - (class213.field3624.field1210 / 32);
                        this.method1242(arg2, arg5, arg7, arg1, var13, var22, arg0, arg3, arg6, var18.field4922, 2047, arg4, var23);
                    }
                    if (var18.field4907 == 10 && var18.field4908 >= 0 && class149.field2436.length > var18.field4908) {
                        class191 var24 = class149.field2436[var18.field4908];
                        if (var24 != null) {
                            int var25 = var24.field1193 / 32 - (class213.field3624.field1193 / 32);
                            int var26 = var24.field1210 / 32 - class213.field3624.field1210 / 32;
                            this.method1242(arg2, arg5, arg7, arg1, var13, var25, arg0, arg3, arg6, var18.field4922, 2047, arg4, var26);
                        }
                    }
                }
            }
        }
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        if (this.field3262 != 0 && this.field3265 != 0) {
            int var30 = class139.field2309[arg0];
            short var31 = this.field3262;
            int var32 = class139.field2316[arg0];
            short var33 = this.field3265;
            int var34 = -var31 / 2;
            int var35 = -var33 / 2;
            int var36 = var31 / 2;
            int var37 = var30 * var35 + var32 * var34 >> 16;
            int var38 = var32 * var35 - (var30 * var34) >> 16;
            int var39 = class42.method254(class61.field850, this.field1210 + var38, this.field1193 + var37, -20341);
            int var40 = -var33 / 2;
            int var41 = var32 * var40 - (var30 * var36) >> 16;
            int var42 = var30 * var40 + (var32 * var36) >> 16;
            int var43 = -var31 / 2;
            int var44 = class42.method254(class61.field850, this.field1210 + var41, this.field1193 + var42, -20341);
            int var45 = var33 / 2;
            int var46 = var32 * var45 - var30 * var43 >> 16;
            int var47 = var30 * var45 + (var32 * var43) >> 16;
            int var48 = class42.method254(class61.field850, this.field1210 + var46, this.field1193 + var47, -20341);
            int var49 = var31 / 2;
            int var50 = var33 / 2;
            int var51 = var30 * var50 + var32 * var49 >> 16;
            int var52 = var44 > var39 ? var39 : var44;
            int var53 = var32 * var50 - var30 * var49 >> 16;
            int var54 = class42.method254(class61.field850, this.field1210 + var53, this.field1193 + var51, -20341);
            int var55 = var48 < var54 ? var48 : var54;
            int var56 = var44 >= var54 ? var54 : var44;
            int var57 = var39 + var54;
            if (var57 > (var44 + var48)) {
                var57 = var44 + var48;
            }
            var27 = (int) (Math.atan2((double) (var52 - var55), (double) var33) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                var13.method1362(var27);
            }
            int var58 = var48 > var39 ? var39 : var48;
            var28 = (int) (Math.atan2((double) (var58 - var56), (double) var31) * 325.95D) & 0x7FF;
            if (var28 != 0) {
                var13.method1331(var28);
            }
            var29 = (var57 >> 1) - this.field1180;
            if (var29 != 0) {
                var13.method1325(0, var29, 0);
            }
        }
        class289 var59 = null;
        if (!this.field3255 && this.field1211 != -1 && this.field1206 != -1) {
            class169 var60 = class259.method1750((byte) 93, this.field1211);
            var59 = var60.method1074(this.field1206, 99);
            if (var59 != null) {
                var59.method1325(0, -this.field1175, 0);
                if (var60.field2839) {
                    if (var27 != 0) {
                        var59.method1362(var27);
                    }
                    if (var28 != 0) {
                        var59.method1331(var28);
                    }
                    if (var29 != 0) {
                        var59.method1325(0, var29, 0);
                    }
                }
            }
        }
        class289 var61 = null;
        if (!this.field3255 && this.field3261 != null) {
            if (class75.field1309 >= this.field3264) {
                this.field3261 = null;
            }
            if (this.field3276 <= class75.field1309 && this.field3264 > class75.field1309) {
                var61 = this.field3261;
                var61.method1325(this.field3257 - this.field1193, this.field3286 - this.field1180, this.field3272 - this.field1210);
                if (this.field1153 == 512) {
                    var61.method1339();
                } else if (this.field1153 == 1024) {
                    var61.method1360();
                } else if (this.field1153 == 1536) {
                    var61.method1368();
                }
            }
        }
        var13.field4906 = true;
        var13.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var59 != null) {
            var59.field4906 = true;
            var59.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (var61 == null) {
            return;
        }
        if (this.field1153 == 512) {
            var61.method1368();
        } else if (this.field1153 == 1024) {
            var61.method1360();
        } else if (this.field1153 == 1536) {
            var61.method1339();
        }
        var61.method1325(this.field1193 - this.field3257, -this.field3286 + this.field1180, this.field1210 - this.field3272);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lfe;B)V", line = 483)
    public final void method1244(class229 arg0, byte arg1) {
        arg0.field3905 = 0;
        field3268++;
        int var3 = arg0.method1535((byte) 124);
        boolean var4 = (var3 & 0x4) != 0;
        if ((var3 & 0x2) == 2) {
            this.field3262 = (short) (arg0.method1535((byte) 102) << 2);
            this.field3265 = (short) (arg0.method1535((byte) 120) << 2);
        } else {
            this.field3265 = 0;
            this.field3262 = 0;
        }
        int var5 = var3 & 0x1;
        int var6 = -1;
        int var7 = super.method460((byte) 125);
        this.method458((var3 >> 3 & 0x7) + 1, 18072);
        int[] var8 = new int[12];
        this.field3258 = (var3 & 0xCB) >> 6;
        this.field1193 += (this.method460((byte) 117) - var7) * 64;
        this.field1210 += (this.method460((byte) 114) - var7) * 64;
        this.field3289 = arg0.method1497(false);
        this.field3273 = arg0.method1497(false);
        this.field3266 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method1535((byte) 102);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1535((byte) 72);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var6 = arg0.method1496(true);
                    break;
                }
                if (var12 < 32768) {
                    var8[var9] = class53.method337(Integer.MIN_VALUE, var12 - 256);
                } else {
                    int var13 = class240.field4055[var12 - 32768];
                    var8[var9] = class53.method337(1073741824, var13);
                    int var14 = class103.method676(var13, -1).field5191;
                    if (var14 != 0) {
                        this.field3266 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method1535((byte) 104);
            if (var17 < 0 || class184.field3169[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1203 = arg0.method1496(true);
        if (this.field1203 == 65535) {
            this.field1203 = -1;
        }
        this.field1184 = arg0.method1496(true);
        if (this.field1184 == 65535) {
            this.field1184 = -1;
        }
        this.field1169 = this.field1184;
        this.field1204 = arg0.method1496(true);
        if (this.field1204 == 65535) {
            this.field1204 = -1;
        }
        this.field1207 = arg0.method1496(true);
        if (this.field1207 == 65535) {
            this.field1207 = -1;
        }
        this.field1152 = arg0.method1496(true);
        if (this.field1152 == 65535) {
            this.field1152 = -1;
        }
        this.field1151 = arg0.method1496(true);
        if (this.field1151 == 65535) {
            this.field1151 = -1;
        }
        this.field1187 = arg0.method1496(true);
        if (this.field1187 == 65535) {
            this.field1187 = -1;
        }
        this.field3274 = class232.method1567(arg0.method1495((byte) 79), 120).method1901(4095);
        this.field3259 = arg0.method1535((byte) 79);
        int var18 = -128 / ((63 - arg1) / 49);
        if (var4) {
            this.field3271 = arg0.method1496(true);
        } else {
            this.field3271 = 0;
        }
        int var19 = this.field3282;
        this.field3282 = arg0.method1535((byte) 110);
        if (this.field3282 == 0) {
            class16.method90(this, 8735);
        } else {
            int var20 = this.field3270;
            int var21 = this.field3267;
            int var22 = this.field3285;
            this.field3267 = arg0.method1496(true);
            this.field3270 = arg0.method1496(true);
            this.field3285 = arg0.method1496(true);
            if (this.field3282 != var19 || this.field3267 != var21 || this.field3270 != var20 || this.field3285 != var22) {
                class42.method260(0, this);
            }
        }
        if (this.field3277 == null) {
            this.field3277 = new class262();
        }
        int var23 = this.field3277.field4450;
        this.field3277.method1780(var15, 0, var5 == 1, var6, var8);
        if (var6 != var23) {
            this.field1193 = this.field1178[0] * 128 + (this.method460((byte) -39) * 64);
            this.field1210 = this.field1150[0] * 128 + (this.method460((byte) -76) * 64);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Z", line = 676)
    public final boolean method395(boolean arg0) {
        field3287++;
        if (!arg0) {
            method1239((byte) -80);
        }
        return this.field3277 != null;
    }
}
