import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KEVJJMXF")
public class class31 {

    @OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "Z")
    private boolean field1000 = false;

    @OriginalMember(owner = "client!KEVJJMXF", name = "k", descriptor = "[I")
    private int[] field1010 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "l", descriptor = "[I")
    private int[] field1011 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "m", descriptor = "[I")
    private int[] field1012 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "o", descriptor = "I")
    private int field1014 = 100;

    @OriginalMember(owner = "client!KEVJJMXF", name = "r", descriptor = "I")
    public int field1017 = 500;

    @OriginalMember(owner = "client!KEVJJMXF", name = "b", descriptor = "I")
    private static int field1001 = 6;

    @OriginalMember(owner = "client!KEVJJMXF", name = "w", descriptor = "[I")
    private static int[] field1022 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "x", descriptor = "[I")
    private static int[] field1023 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "y", descriptor = "[I")
    private static int[] field1024 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "z", descriptor = "[I")
    private static int[] field1025 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "A", descriptor = "[I")
    private static int[] field1026 = new int[5];

    @OriginalMember(owner = "client!KEVJJMXF", name = "n", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!KEVJJMXF", name = "s", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!KEVJJMXF", name = "c", descriptor = "LMWRZAKOJ;")
    private class38 field1002;

    @OriginalMember(owner = "client!KEVJJMXF", name = "d", descriptor = "LMWRZAKOJ;")
    private class38 field1003;

    @OriginalMember(owner = "client!KEVJJMXF", name = "e", descriptor = "LMWRZAKOJ;")
    private class38 field1004;

    @OriginalMember(owner = "client!KEVJJMXF", name = "f", descriptor = "LMWRZAKOJ;")
    private class38 field1005;

    @OriginalMember(owner = "client!KEVJJMXF", name = "g", descriptor = "LMWRZAKOJ;")
    private class38 field1006;

    @OriginalMember(owner = "client!KEVJJMXF", name = "h", descriptor = "LMWRZAKOJ;")
    private class38 field1007;

    @OriginalMember(owner = "client!KEVJJMXF", name = "i", descriptor = "LMWRZAKOJ;")
    private class38 field1008;

    @OriginalMember(owner = "client!KEVJJMXF", name = "j", descriptor = "LMWRZAKOJ;")
    private class38 field1009;

    @OriginalMember(owner = "client!KEVJJMXF", name = "q", descriptor = "LMWRZAKOJ;")
    private class38 field1016;

    @OriginalMember(owner = "client!KEVJJMXF", name = "p", descriptor = "LURKVTZGT;")
    private class61 field1015;

    @OriginalMember(owner = "client!KEVJJMXF", name = "t", descriptor = "[I")
    private static int[] field1019;

    @OriginalMember(owner = "client!KEVJJMXF", name = "u", descriptor = "[I")
    private static int[] field1020;

    @OriginalMember(owner = "client!KEVJJMXF", name = "v", descriptor = "[I")
    private static int[] field1021;

    @OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "()V")
    public static final void method327() {
        field1020 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1020[var0] = 1;
            } else {
                field1020[var0] = -1;
            }
        }
        field1021 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1021[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1019 = new int[220500];
    }

    @OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "(II)[I")
    public final int[] method328(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1019[var3] = 0;
        }
        if (arg1 < 10) {
            return field1019;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1002.method360(true);
        this.field1003.method360(true);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1004 != null) {
            this.field1004.method360(true);
            this.field1005.method360(true);
            var6 = (int) ((double) (this.field1004.field1202 - this.field1004.field1201) * 32.768D / var4);
            var7 = (int) ((double) this.field1004.field1201 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1006 != null) {
            this.field1006.method360(true);
            this.field1007.method360(true);
            var9 = (int) ((double) (this.field1006.field1202 - this.field1006.field1201) * 32.768D / var4);
            var10 = (int) ((double) this.field1006.field1201 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1010[var12] != 0) {
                field1022[var12] = 0;
                field1023[var12] = (int) ((double) this.field1012[var12] * var4);
                field1024[var12] = (this.field1010[var12] << 14) / 100;
                field1025[var12] = (int) ((double) (this.field1002.field1202 - this.field1002.field1201) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1011[var12]) / var4);
                field1026[var12] = (int) ((double) this.field1002.field1201 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1002.method361(field1001, arg0);
            int var42 = this.field1003.method361(field1001, arg0);
            if (this.field1004 != null) {
                int var43 = this.field1004.method361(field1001, arg0);
                int var44 = this.field1005.method361(field1001, arg0);
                var41 += this.method329((byte) 1, var8, var44, this.field1004.field1203) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1006 != null) {
                int var45 = this.field1006.method361(field1001, arg0);
                int var46 = this.field1007.method361(field1001, arg0);
                var42 = var42 * ((this.method329((byte) 1, var11, var46, this.field1006.field1203) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1010[var47] != 0) {
                    int var48 = field1023[var47] + var13;
                    if (var48 < arg0) {
                        field1019[var48] += this.method329((byte) 1, field1022[var47], field1024[var47] * var42 >> 15, this.field1002.field1203);
                        field1022[var47] += (field1025[var47] * var41 >> 16) + field1026[var47];
                    }
                }
            }
        }
        if (this.field1008 != null) {
            this.field1008.method360(true);
            this.field1009.method360(true);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1008.method361(field1001, arg0);
                int var19 = this.field1009.method361(field1001, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1008.field1202 - this.field1008.field1201) * var18 >> 8) + this.field1008.field1201;
                } else {
                    var20 = ((this.field1008.field1202 - this.field1008.field1201) * var19 >> 8) + this.field1008.field1201;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1019[var17] = 0;
                }
            }
        }
        if (this.field1013 > 0 && this.field1014 > 0) {
            int var21 = (int) ((double) this.field1013 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1019[var22] += field1019[var22 - var21] * this.field1014 / 100;
            }
        }
        if (this.field1015.field1574[0] > 0 || this.field1015.field1574[1] > 0) {
            this.field1016.method360(true);
            int var23 = this.field1016.method361(field1001, arg0 + 1);
            int var24 = this.field1015.method520(0, -481, (float) var23 / 65536.0F);
            int var25 = this.field1015.method520(1, -481, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1019[var24 + var26] * (long) class61.field1581 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1019[var24 + var26 - var38 - 1] * (long) class61.field1579[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1019[var26 - var39 - 1] * (long) class61.field1579[1][var39] >> 16);
                    }
                    field1019[var26] = var37;
                    var23 = this.field1016.method361(field1001, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1019[var24 + var26] * (long) class61.field1581 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1019[var24 + var26 - var35 - 1] * (long) class61.field1579[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1019[var26 - var36 - 1] * (long) class61.field1579[1][var36] >> 16);
                        }
                        field1019[var26] = var34;
                        var23 = this.field1016.method361(field1001, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1019[var24 + var26 - var31 - 1] * (long) class61.field1579[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1019[var26 - var32 - 1] * (long) class61.field1579[1][var32] >> 16);
                            }
                            field1019[var26] = var30;
                            this.field1016.method361(field1001, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1015.method520(0, -481, (float) var23 / 65536.0F);
                    var25 = this.field1015.method520(1, -481, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1019[var40] < -32768) {
                field1019[var40] = -32768;
            }
            if (field1019[var40] > 32767) {
                field1019[var40] = 32767;
            }
        }
        return field1019;
    }

    @OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "(BIII)I")
    private final int method329(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field1021[arg1 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field1020[arg1 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!KEVJJMXF", name = "a", descriptor = "(LIUVBENCV;B)V")
    public final void method330(class25 arg0, byte arg1) {
        this.field1002 = new class38();
        this.field1002.method358(arg0, (byte) 1);
        this.field1003 = new class38();
        this.field1003.method358(arg0, (byte) 1);
        int var3 = arg0.method245();
        if (var3 != 0) {
            arg0.field837--;
            this.field1004 = new class38();
            this.field1004.method358(arg0, (byte) 1);
            this.field1005 = new class38();
            this.field1005.method358(arg0, (byte) 1);
        }
        int var4 = arg0.method245();
        if (var4 != 0) {
            arg0.field837--;
            this.field1006 = new class38();
            this.field1006.method358(arg0, (byte) 1);
            this.field1007 = new class38();
            this.field1007.method358(arg0, (byte) 1);
        }
        int var5 = arg0.method245();
        if (var5 != 0) {
            arg0.field837--;
            this.field1008 = new class38();
            this.field1008.method358(arg0, (byte) 1);
            this.field1009 = new class38();
            this.field1009.method358(arg0, (byte) 1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method259();
            if (var7 == 0) {
                break;
            }
            this.field1010[var6] = var7;
            this.field1011[var6] = arg0.method258();
            this.field1012[var6] = arg0.method259();
        }
        this.field1013 = arg0.method259();
        this.field1014 = arg0.method259();
        this.field1017 = arg0.method247();
        if (arg1 == 1) {
            boolean var8 = false;
        } else {
            this.field1000 = !this.field1000;
        }
        this.field1018 = arg0.method247();
        this.field1015 = new class61();
        this.field1016 = new class38();
        this.field1015.method521(arg0, this.field1016, -224);
    }
}
