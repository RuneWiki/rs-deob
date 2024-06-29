import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class53 extends class28 {

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "Z")
    public boolean field1176 = false;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Loh;")
    private class160 field1167;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
    public boolean field1168;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "Z")
    public boolean field1151;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Z")
    private boolean field1157;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Z")
    private boolean field1161;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Lqe;")
    private static class179 field1154 = class206.method1380("Hidden", (byte) -128);

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Lqe;")
    private static class179 field1160 = class206.method1380("Unexpected server response)3", (byte) -127);

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Lqe;")
    public static class179 field1165 = class206.method1380("Bitte wenden Sie sich an den Kundendienst)3", (byte) -128);

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "Lqe;")
    public static class179 field1170 = field1160;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "[Lrd;")
    public static class188[] field1152 = new class188[32768];

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Lqe;")
    public static class179 field1149 = field1154;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Lqe;")
    public static class179 field1174 = class206.method1380("::qa_op_test", (byte) -127);

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "F")
    private float field1153;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "[I")
    private int[] field1162;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lwh;Leh;II)[I")
    public final int[] method365(class242 arg0, class52 arg1, int arg2, int arg3) {
        field1173++;
        if (!this.field1167.method1036(arg1, 16776960, arg0)) {
            return null;
        }
        if (arg2 != 1536) {
            this.field1161 = false;
        }
        int var5 = arg3 >= this.field1164 ? this.field1164 : arg3;
        return this.field1167.method1035(false, arg1, 1.0D, this.field1157, arg0, -99, var5, var5);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLwh;FLeh;)[I")
    public final int[] method366(int arg0, byte arg1, class242 arg2, float arg3, class52 arg4) {
        field1155++;
        if (arg1 >= -68) {
            this.field1153 = -1.0845872F;
        }
        if (this.field1162 == null || this.field1153 != arg3) {
            if (!this.field1167.method1036(arg4, 16776960, arg2)) {
                return null;
            }
            int var6 = arg0 < this.field1164 ? arg0 : this.field1164;
            this.field1162 = this.field1167.method1035(true, arg4, (double) arg3, this.field1157, arg2, 117, var6, var6);
            this.field1153 = arg3;
            if (this.field1161) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field1162[var12];
                        var7[var34] += class107.method696(16757146, var35) >> 16;
                        var8[var34] += class107.method696(65318, var35) >> 8;
                        var9[var34] += class107.method696(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var22 += var8[var25];
                        var23 += var9[var25];
                        var24 += var7[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        int var32 = var24 / 9;
                        var25--;
                        int var33 = var23 / 9;
                        var21--;
                        var19--;
                        var10[var19] = class125.method790(var33, class125.method790(var31 << 8, var32 << 16));
                        var23 += var9[var25] - var9[var21];
                        var22 += var8[var25] - var8[var21];
                        var24 += var7[var25] - var7[var21];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field1162[var12];
                        var13--;
                        int var30 = this.field1162[var13];
                        var7[var28] += class107.method696(var29 >> 16, 255) - class107.method696(var30 >> 16, 255);
                        var8[var28] += class107.method696(255, var29 >> 8) - (class107.method696(var30, 65319) >> 8);
                        var9[var28] += -class107.method696(255, var30) + class107.method696(255, var29);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field1162 = var10;
            }
        }
        return this.field1162;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static void method367(boolean arg0) {
        field1149 = null;
        field1154 = null;
        field1160 = null;
        field1165 = null;
        field1174 = null;
        if (!arg0) {
            method371(24, -102, 115, -87, -119, -11, 54, 5);
        }
        field1152 = null;
        field1170 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLeh;Lwh;)Z")
    public final boolean method368(byte arg0, class52 arg1, class242 arg2) {
        if (arg0 >= -126) {
            field1174 = null;
        }
        field1166++;
        return this.field1167.method1036(arg1, 16776960, arg2);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
    public final void method369(int arg0, byte arg1) {
        field1171++;
        if (arg1 != -62) {
            field1154 = null;
        }
        if (this.field1162 == null || this.field1150 == 0 && this.field1156 == 0) {
            return;
        }
        if (class176.field3211 == null || this.field1162.length > class176.field3211.length) {
            class176.field3211 = new int[this.field1162.length];
        }
        int var3 = this.field1156 * arg0;
        int var4 = this.field1162.length == 4096 ? 64 : 128;
        int var5 = arg0 * var4 * this.field1150;
        int var6 = this.field1162.length;
        int var7 = var4 - 1;
        int var8 = var6 - 1;
        for (int var9 = 0; var9 < var6; var9 += var4) {
            int var11 = var5 + var9 & var8;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = (var3 + var12 & var7) + var11;
                int var14 = var9 + var12;
                class176.field3211[var14] = this.field1162[var13];
            }
        }
        int[] var10 = this.field1162;
        this.field1162 = class176.field3211;
        class176.field3211 = var10;
    }

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1169++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILqa;)V")
    public static final void method370(int arg0, class175 arg1) {
        field1163++;
        arg1.field3153 = arg1.field3130;
        if (arg1.field3176 == 0) {
            arg1.field3186 = 0;
            return;
        }
        if (arg1.field3182 != -1 && arg1.field3140 == 0) {
            class117 var2 = class239.method1550(arg1.field3182, (byte) 107);
            if (arg1.field3180 > 0 && var2.field2224 == 0) {
                arg1.field3186++;
                return;
            }
            if (arg1.field3180 <= 0 && var2.field2225 == 0) {
                arg1.field3186++;
                return;
            }
        }
        int var3 = arg1.field3159;
        int var4 = arg1.field3198;
        int var5 = arg1.field3160[arg1.field3176 - 1] * 128 + arg1.field3178 * 64;
        int var6 = arg1.field3200[arg1.field3176 - 1] * 128 + arg1.field3178 * 64;
        if (arg0 != 2535) {
            field1149 = null;
        }
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg1.field3198 = var5;
            arg1.field3159 = var6;
            return;
        }
        if (var3 < var6) {
            if (var5 > var4) {
                arg1.field3162 = 1280;
            } else if (var5 < var4) {
                arg1.field3162 = 1792;
            } else {
                arg1.field3162 = 1536;
            }
        } else if (var3 > var6) {
            if (var5 > var4) {
                arg1.field3162 = 768;
            } else if (var4 <= var5) {
                arg1.field3162 = 512;
            } else {
                arg1.field3162 = 256;
            }
        } else if (var5 > var4) {
            arg1.field3162 = 1024;
        } else if (var5 < var4) {
            arg1.field3162 = 0;
        }
        int var7 = arg1.field3162 - arg1.field3177 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field3133;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field3129;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field3199;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field3168;
        }
        if (var8 == -1) {
            var8 = arg1.field3129;
        }
        arg1.field3153 = var8;
        boolean var10 = true;
        if (arg1 instanceof class188) {
            var10 = ((class188) arg1).field3496.field3337;
        }
        if (var10) {
            if (arg1.field3177 != arg1.field3162 && arg1.field3142 == -1 && arg1.field3194 != 0) {
                var9 = 2;
            }
            if (arg1.field3176 > 2) {
                var9 = 6;
            }
            if (arg1.field3176 > 3) {
                var9 = 8;
            }
            if (arg1.field3186 > 0 && arg1.field3176 > 1) {
                var9 = 8;
                arg1.field3186--;
            }
        } else {
            if (arg1.field3176 > 1) {
                var9 = 6;
            }
            if (arg1.field3176 > 2) {
                var9 = 8;
            }
            if (arg1.field3186 > 0 && arg1.field3176 > 1) {
                var9 = 8;
                arg1.field3186--;
            }
        }
        if (arg1.field3139[arg1.field3176 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var3) {
            arg1.field3159 += var9;
            if (var6 < arg1.field3159) {
                arg1.field3159 = var6;
            }
        } else if (var3 > var6) {
            arg1.field3159 -= var9;
            if (var6 > arg1.field3159) {
                arg1.field3159 = var6;
            }
        }
        if (var9 >= 8 && arg1.field3153 == arg1.field3129 && arg1.field3190 != -1) {
            arg1.field3153 = arg1.field3190;
        }
        if (var4 < var5) {
            arg1.field3198 += var9;
            if (var5 < arg1.field3198) {
                arg1.field3198 = var5;
            }
        } else if (var5 < var4) {
            arg1.field3198 -= var9;
            if (arg1.field3198 < var5) {
                arg1.field3198 = var5;
            }
        }
        if (arg1.field3159 != var6 || arg1.field3198 != var5) {
            return;
        }
        arg1.field3176--;
        if (arg1.field3180 > 0) {
            arg1.field3180--;
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1175++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg2 - arg6;
        int var13 = arg1 * arg1;
        int var14 = arg2 * arg2;
        int var15 = var14 << 1;
        int var16 = var13 << 1;
        int var17 = var12 * var12;
        int var18 = var11 * var11;
        int var19 = var18 << 1;
        int var20 = var17 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var15;
        int var24 = var14 - (arg0 + var21) * var16;
        int var25 = var17 - (var22 - 1) * var19;
        int var26 = (1 - var22) * var18 + var20;
        int var27 = var13 << 2;
        int var28 = var18 << 2;
        int var29 = var17 << 2;
        int var30 = var14 << 2;
        int var31 = var15 * 3;
        int var32 = (var21 - 3) * var16;
        int var33 = var20 * 3;
        int var34 = (var22 - 3) * var19;
        int var35 = var30;
        int var36 = (arg2 - 1) * var27;
        int var37 = var29;
        int var38 = (var12 - 1) * var28;
        if (arg5 >= class168.field3037 && class70.field1403 >= arg5) {
            int[] var39 = class14.field331[arg5];
            int var40 = class56.method391(16777215, class40.field869, class235.field4336, arg7 - arg1);
            int var41 = class56.method391(16777215, class40.field869, class235.field4336, arg7 + arg1);
            int var42 = class56.method391(16777215, class40.field869, class235.field4336, arg7 - var11);
            int var43 = class56.method391(16777215, class40.field869, class235.field4336, arg7 + var11);
            class23.method161(var42, -1, arg4, var40, var39);
            class23.method161(var43, arg0, arg3, var42, var39);
            class23.method161(var41, -1, arg4, var43, var39);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var24 += var35;
                    var35 += var30;
                    var23 += var31;
                    var31 += var30;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var30;
                var35 += var30;
                var8++;
            }
            boolean var44 = var9 <= var12;
            var9--;
            int var45 = arg5 + var9;
            int var46 = arg5 - var9;
            var24 += -var32;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var33;
                        var33 += var29;
                        var10++;
                        var25 += var37;
                        var37 += var29;
                    }
                }
                if (var25 < 0) {
                    var26 += var33;
                    var33 += var29;
                    var10++;
                    var25 += var37;
                    var37 += var29;
                }
                var25 += -var34;
                var26 += -var38;
                var38 -= var28;
                var34 -= var28;
            }
            var23 += -var36;
            var36 -= var27;
            if (class168.field3037 <= var45 && class70.field1403 >= var46) {
                int var47 = class56.method391(16777215, class40.field869, class235.field4336, arg7 + var8);
                int var48 = class56.method391(16777215, class40.field869, class235.field4336, arg7 - var8);
                if (var44) {
                    int var49 = class56.method391(16777215, class40.field869, class235.field4336, arg7 + var10);
                    int var50 = class56.method391(16777215, class40.field869, class235.field4336, arg7 - var10);
                    if (var46 >= class168.field3037) {
                        int[] var51 = class14.field331[var46];
                        class23.method161(var50, arg0, arg4, var48, var51);
                        class23.method161(var49, -1, arg3, var50, var51);
                        class23.method161(var47, -1, arg4, var49, var51);
                    }
                    if (var45 <= class70.field1403) {
                        int[] var52 = class14.field331[var45];
                        class23.method161(var50, -1, arg4, var48, var52);
                        class23.method161(var49, -1, arg3, var50, var52);
                        class23.method161(var47, -1, arg4, var49, var52);
                    }
                } else {
                    if (var46 >= class168.field3037) {
                        class23.method161(var47, arg0, arg4, var48, class14.field331[var46]);
                    }
                    if (class70.field1403 >= var45) {
                        class23.method161(var47, arg0, arg4, var48, class14.field331[var45]);
                    }
                }
            }
            var32 -= var27;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lra;)V")
    public class53(class185 arg0) {
        this.field1167 = new class160(arg0);
        int var2 = arg0.method1243(3);
        this.field1168 = (var2 & 0x1) != 0;
        int var3 = var2 >> 3 & 0x3;
        this.field1151 = (var2 & 0x2) != 0;
        int var4 = arg0.method1243(3);
        this.field1164 = 0x1 << (var4 & 0x7) + 1;
        this.field1157 = (var4 & 0x80) != 0;
        this.field1161 = (var4 & 0x8) != 0;
        this.field1158 = arg0.method1252(2);
        this.field1148 = arg0.method1243(3);
        if (this.field1148 == 255) {
            this.field1148 = 256;
        }
        this.field1156 = arg0.method1204(false);
        this.field1150 = arg0.method1204(false);
        arg0.method1243(3);
        arg0.method1243(3);
        arg0.method1243(3);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class53() {
        this.field1167 = new class160();
        this.field1164 = 64;
        this.field1168 = true;
    }
}
