import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class11 extends class160 {

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Z")
    public boolean field161 = false;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Lj;")
    public class168 field151;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "S")
    private short field154;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "S")
    private short field149;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "S")
    private short field147;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "S")
    private short field150;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "S")
    private short field159;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    private static int field160 = 12;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "S")
    public short field155;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 4)
    private final void method72() {
        this.field151.field2762.field3200[this.field155] = null;
        class194.field3202[class194.field3204] = this;
        class194.field3204 = class194.field3204 + 1 & 0x3FF;
        this.field151 = null;
        this.method2075(6204);
        this.method1132(4);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lj;IIIIIIIII)V", line = 14)
    public final void method73(class168 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field151 = arg0;
        this.field153 = arg1 << field160;
        this.field152 = arg2 << field160;
        this.field156 = arg3 << field160;
        this.field158 = arg9;
        this.field149 = this.field154 = (short) arg8;
        this.field147 = (short) arg4;
        this.field150 = (short) arg5;
        this.field159 = (short) arg6;
        this.field148 = arg7;
        this.method74();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V", line = 30)
    private final void method74() {
        int var1 = this.field151.field2762.field3208;
        if (this.field151.field2762.field3200[var1] != null) {
            this.field151.field2762.field3200[var1].method72();
        }
        this.field151.field2762.field3200[var1] = this;
        this.field155 = (short) this.field151.field2762.field3208;
        this.field151.field2762.field3208 = var1 + 1 & 0x1FFF;
        this.field151.field2770.method235(false, this);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)V", line = 47)
    public final void method75(long arg0, int arg1) {
        if (this.field151 == null) {
            return;
        }
        this.field154 = (short) (this.field154 - arg1);
        if (this.field154 <= 0) {
            this.method72();
            return;
        }
        int var4 = this.field153 >> field160;
        int var5 = this.field152 >> field160;
        int var6 = this.field156 >> field160;
        class194 var7 = this.field151.field2762;
        class70 var8 = this.field151.field2745;
        if (var8.field1123 != 0) {
            if (this.field149 - this.field154 <= var8.field1138) {
                int var9 = var8.field1156 * arg1 + (this.field158 >> 8 & 0xFF00) + (this.field157 >> 16 & 0xFF);
                int var10 = var8.field1132 * arg1 + (this.field157 >> 8 & 0xFF) + (this.field158 & 0xFF00);
                int var11 = var8.field1143 * arg1 + (this.field158 & 0xFF << 8) + (this.field157 & 0xFF);
                if (var9 < 0) {
                    var9 = 0;
                } else if (var9 > 65535) {
                    var9 = 65535;
                }
                if (var10 < 0) {
                    var10 = 0;
                } else if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 65535) {
                    var11 = 65535;
                }
                this.field158 &= 0xFF000000;
                this.field158 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field157 &= 0xFF000000;
                this.field157 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field149 - this.field154 <= var8.field1172) {
                int var12 = var8.field1116 * arg1 + (this.field158 >> 16 & 0xFF00) + (this.field157 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field158 &= 0xFFFFFF;
                this.field158 |= (var12 & 0xFF00) << 16;
                this.field157 &= 0xFFFFFF;
                this.field157 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field1168 != -1 && this.field149 - this.field154 <= var8.field1165) {
            this.field148 += var8.field1126 * arg1;
        }
        int var13 = this.field147;
        int var14 = this.field150;
        int var15 = this.field159;
        boolean var16 = false;
        if (var8.field1159 == 1) {
            int var17 = var4 - this.field151.field2751;
            int var18 = var5 - this.field151.field2765;
            int var19 = var6 - this.field151.field2749;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field1178 * var20 * arg1);
            this.field148 = (int) ((long) this.field148 - ((long) this.field148 * var21 >> 18));
        } else if (var8.field1159 == 2) {
            int var23 = var4 - this.field151.field2751;
            int var24 = var5 - this.field151.field2765;
            int var25 = var6 - this.field151.field2749;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field1178 * var26 * arg1);
            this.field148 = (int) ((long) this.field148 - ((long) this.field148 * var27 >> 28));
        }
        class80 var29 = var7.field3220.field3719;
        for (class80 var30 = var29.field1317; var30 != var29; var30 = var30.field1317) {
            class239 var31 = (class239) var30;
            class174 var32 = var31.field3962.field5624;
            if (var32.field2840 != 1) {
                int var33 = var4 - var31.field3953;
                int var34 = var5 - var31.field3961;
                int var35 = var6 - var31.field3948;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field2843) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field3957 * var35 + var31.field3951 * var33 + var32.field2838 * var34) * 65535L / (long) (var32.field2845 * var38);
                    if (var39 >= (long) var32.field2844) {
                        int var41 = 0;
                        if (var32.field2832 == 1) {
                            var41 = (var38 >> 4) * var32.field2854;
                        } else if (var32.field2832 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field2854;
                        }
                        if (var32.field2857 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field2845;
                            int var43 = (var34 << 15) / var38 * var32.field2845;
                            int var44 = (var35 << 15) / var38 * var32.field2845;
                            if (var32.field2848 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field153 += arg1 * var42 >> 15;
                                this.field152 += arg1 * var43 >> 15;
                                this.field156 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field2848 == 0) {
                            var13 += (var31.field3951 - var41) * arg1;
                            var14 += (var32.field2838 - var41) * arg1;
                            var15 += (var31.field3957 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field153 += (var31.field3951 - var41) * arg1;
                            this.field152 += (var32.field2838 - var41) * arg1;
                            this.field156 += (var31.field3957 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field1144 != null) {
            for (int var45 = 0; var45 < var8.field1144.length; var45++) {
                class239 var46 = (class239) class194.field3199.method2153(3, (long) var8.field1144[var45]);
                while (var46 != null) {
                    class174 var47 = var46.field3962.field5624;
                    int var48 = var4 - var46.field3953;
                    int var49 = var5 - var46.field3961;
                    int var50 = var6 - var46.field3948;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field2843) {
                        var46 = (class239) class194.field3199.method2158(-1);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field3957 * var50 + var46.field3951 * var48 + var47.field2838 * var49) * 65535L / (long) (var47.field2845 * var53);
                        if (var54 < (long) var47.field2844) {
                            var46 = (class239) class194.field3199.method2158(-1);
                        } else {
                            int var56 = 0;
                            if (var47.field2832 == 1) {
                                var56 = (var53 >> 4) * var47.field2854;
                            } else if (var47.field2832 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field2854;
                            }
                            if (var47.field2857 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field2845;
                                int var58 = (var49 << 15) / var53 * var47.field2845;
                                int var59 = (var50 << 15) / var53 * var47.field2845;
                                if (var47.field2848 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field153 += arg1 * var57 >> 15;
                                    this.field152 += arg1 * var58 >> 15;
                                    this.field156 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field2848 == 0) {
                                var13 += (var46.field3951 - var56) * arg1;
                                var14 += (var47.field2838 - var56) * arg1;
                                var15 += (var46.field3957 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field153 += (var46.field3951 - var56) * arg1;
                                this.field152 += (var47.field2838 - var56) * arg1;
                                this.field156 += (var46.field3957 - var56) * arg1;
                            }
                            var46 = (class239) class194.field3199.method2158(-1);
                        }
                    }
                }
            }
        }
        if (var8.field1148 != null) {
            for (int var60 = 0; var60 < var8.field1148.length; var60++) {
                class174 var61 = class88.method659(var8.field1148[var60], false);
                if (var61.field2848 == 0) {
                    var13 += var61.field2856 * arg1;
                    var14 += var61.field2838 * arg1;
                    var15 += var61.field2842 * arg1;
                    var16 = true;
                } else {
                    this.field153 += var61.field2856 * arg1;
                    this.field152 += var61.field2838 * arg1;
                    this.field156 += var61.field2842 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field147 = (short) var13;
                    this.field150 = (short) var14;
                    this.field159 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field148 <<= 0x1;
            }
        }
        this.field153 = (int) ((long) this.field153 + ((long) this.field147 * (long) this.field148 >> 23) * (long) arg1);
        this.field152 = (int) ((long) this.field152 + ((long) this.field150 * (long) this.field148 >> 23) * (long) arg1);
        this.field156 = (int) ((long) this.field156 + ((long) this.field159 * (long) this.field148 >> 23) * (long) arg1);
        int var62 = this.field153 >> 19;
        int var63 = this.field156 >> 19;
        int var64 = this.field152 >> field160;
        if (var64 > 0 || var64 < -65535 || var62 < 0 || var62 >= class88.field1504 || var63 < 0 || var63 >= class129.field2114) {
            this.method72();
            return;
        }
        int[][][] var65 = class192.field3174;
        int var66 = var65[var7.field3226][var62][var63];
        int var67;
        if (var7.field3226 < 3) {
            var67 = var65[var7.field3226 + 1][var62][var63];
        } else {
            var67 = var65[var7.field3226][var62][var63] - 1024;
        }
        if (var8.field1174) {
            if (var8.field1169 == -1 && var64 > var66) {
                this.method72();
                return;
            }
            if (var8.field1169 >= 0 && var64 > var65[var8.field1169][var62][var63]) {
                this.method72();
                return;
            }
            if (var8.field1175 == -1 && var64 < var67) {
                this.method72();
                return;
            }
            if (var8.field1175 >= 0 && var64 < var65[var8.field1175 + 1][var62][var63]) {
                this.method72();
                return;
            }
        }
        if (var62 >= var7.field3236 && var62 <= var7.field3235 && var63 >= var7.field3237 && var63 <= var7.field3228 && var64 <= var7.field3225 && var64 >= var7.field3230) {
            this.field161 = false;
            return;
        }
        this.field161 = true;
        byte var68 = 3;
        if (var64 > var65[1][var62][var63]) {
            var68 = 0;
        } else if (var64 > var65[2][var62][var63]) {
            var68 = 1;
        } else if (var64 > var65[3][var62][var63]) {
            var68 = 2;
        } else if (var64 < var65[3][var62][var63] - 1024) {
            this.method72();
            return;
        }
        class72 var69 = class225.field3705[var68][var62][var63];
        if (var69 == null) {
            var69 = class225.field3705[var68][var62][var63] = new class72(var68, var62, var63);
        }
        if (var69.field1233 == null) {
            var69.field1233 = new class78();
            var69.field1207 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var69.field1207) {
            var69.field1233.method590(true);
            var69.field1207 = (byte) ((int) (arg0 & 0xFFL));
        }
        var69.field1233.method582(true, this);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lj;IIIIIIIII)V", line = 506)
    public class11(class168 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field151 = arg0;
        this.field153 = arg1 << field160;
        this.field152 = arg2 << field160;
        this.field156 = arg3 << field160;
        this.field158 = arg9;
        this.field149 = this.field154 = (short) arg8;
        this.field147 = (short) arg4;
        this.field150 = (short) arg5;
        this.field159 = (short) arg6;
        this.field148 = arg7;
        this.method74();
    }
}
