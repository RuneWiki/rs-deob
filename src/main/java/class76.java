import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class76 extends class45 {

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    private int field1160 = 0;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Z")
    public boolean field1159 = true;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "Z")
    public boolean field1153 = false;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Lom;")
    public class65 field1150;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "Lq;")
    public class90 field1169;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "Lgf;")
    public class7 field1155;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "J")
    private long field1140;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "Lob;")
    public class277 field1168;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "[S")
    public static short[] field1147 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "[Z")
    public static boolean[] field1143 = new boolean[8];

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1164 = "flash2:";

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "[Lci;")
    public static class189[] field1146;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        field1146 = null;
        field1143 = null;
        field1164 = null;
        if (arg0 != 14) {
            method522((byte) -112);
        }
        field1147 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JIIBIZ)V")
    public final void method523(long arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field1152++;
        if (this.field1153) {
            arg5 = false;
        } else if (this.field1168.field4511 > class65.field967) {
            arg5 = false;
        } else if (class65.field947 > class271.field4415[class65.field967]) {
            arg5 = false;
        } else if (this.field1167 == this.field1141 && this.field1167 == this.field1145 && this.field1158 == this.field1148 && this.field1149 == this.field1148 && this.field1157 == this.field1151 && this.field1156 == this.field1151) {
            arg5 = false;
        } else if (this.field1168.field4500 != -1) {
            int var8 = (int) (arg0 - this.field1140);
            if (this.field1168.field4497 || var8 <= this.field1168.field4500) {
                var8 %= this.field1168.field4500;
            } else {
                arg5 = false;
            }
            if (!this.field1168.field4521 && var8 < this.field1168.field4531) {
                arg5 = false;
            }
            if (this.field1168.field4521 && this.field1168.field4531 <= var8) {
                arg5 = false;
            }
        }
        if (arg3 != 83) {
            return;
        }
        if (arg5) {
            this.field1160 += (int) ((double) arg4 * (Math.random() * (double) (this.field1168.field4512 - this.field1168.field4540) + (double) this.field1168.field4540));
            if (this.field1160 > 63) {
                int var9 = this.field1160 >> 6;
                this.field1160 &= 0x3F;
                if (this.field1159) {
                    int var10 = this.field1167 - this.field1141;
                    int var11 = this.field1148 - this.field1158;
                    int var12 = this.field1151 - this.field1157;
                    int var13 = this.field1145 - this.field1141;
                    int var14 = this.field1149 - this.field1158;
                    this.field1170 = var10 * var14 - (var11 * var13);
                    int var15 = this.field1156 - this.field1157;
                    this.field1144 = var12 * var13 - (var10 * var15);
                    this.field1139 = var11 * var15 - (var12 * var14);
                    while (true) {
                        if (this.field1139 <= 32767 && this.field1144 <= 32767 && this.field1170 <= 32767 && this.field1139 >= -32767 && this.field1144 >= -32767 && this.field1170 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field1170 * this.field1170 + this.field1144 * this.field1144 + this.field1139 * this.field1139));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field1170 = this.field1170 * 32767 / var16;
                            this.field1144 = this.field1144 * 32767 / var16;
                            this.field1139 = this.field1139 * 32767 / var16;
                            if (this.field1168.field4505 > 0 || this.field1168.field4490 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field1170, (double) this.field1139) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field1144, Math.sqrt((double) (this.field1139 * this.field1139 + (this.field1170 * this.field1170)))) * 2047.0D / 6.283185307179586D);
                                this.field1138 = this.field1168.field4490 - this.field1168.field4534;
                                int var20 = var18 - this.field1150.field957;
                                this.field1162 = this.field1168.field4505 - this.field1168.field4510;
                                this.field1161 = var20 + this.field1168.field4510 - (this.field1162 / 2);
                                this.field1137 = this.field1168.field4534 + var19 - (this.field1138 / 2);
                            } else if (this.field1150.field957 != 0) {
                                int var17 = this.field1170 * arg1 + (this.field1139 * arg2) >> 16;
                                this.field1170 = this.field1170 * arg2 - this.field1139 * arg1 >> 16;
                                this.field1139 = var17;
                            }
                            this.field1159 = false;
                            break;
                        }
                        this.field1170 >>= 0x1;
                        this.field1139 >>= 0x1;
                        this.field1144 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1168.field4505 <= 0 && this.field1168.field4490 <= 0) {
                        var22 = this.field1170;
                        var23 = this.field1139;
                        var24 = this.field1144;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field1162) + this.field1161;
                        int var26 = var25 & 0x7FF;
                        int var27 = class221.field3468[var26] >> 1;
                        int var28 = class221.field3465[var26] >> 1;
                        int var29 = (int) (Math.random() * (double) this.field1138) + this.field1137;
                        int var30 = var29 & 0x3FF;
                        int var31 = class221.field3468[var30] >> 1;
                        var23 = var28 * var31 >> 15;
                        int var32 = class221.field3465[var30] >> 1;
                        var24 = var32 * -1;
                        var22 = var27 * var31 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var35 - var34;
                    int var37 = this.field1148 * var35 + (this.field1158 * var34 + (this.field1149 * var36)) >> 8;
                    int var38 = this.field1167 * var35 + (this.field1141 * var34 + (this.field1145 * var36)) >> 8;
                    int var39 = this.field1157 * var34 + this.field1156 * var36 + this.field1151 * var35 >> 8;
                    if (this.field1150.field957 != 0) {
                        int var40 = arg1 * var39 + arg2 * var38 >> 16;
                        var39 = arg2 * var39 - (arg1 * var38) >> 16;
                        var38 = var40;
                    }
                    int var41 = (int) (Math.random() * (double) (this.field1168.field4481 - this.field1168.field4487)) + this.field1168.field4487;
                    int var42 = (int) ((double) (this.field1168.field4513 - this.field1168.field4545) * Math.random()) + this.field1168.field4545;
                    int var43;
                    if (this.field1168.field4529) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field1168.field4514 * var44 + (double) this.field1168.field4542) << 24 | (int) ((double) this.field1168.field4488 * var44 + (double) this.field1168.field4506) | (int) ((double) this.field1168.field4532 * var44 + (double) this.field1168.field4479) << 16 | (int) ((double) this.field1168.field4516 * var44 + (double) this.field1168.field4483) << 8;
                    } else {
                        var43 = (int) ((double) this.field1168.field4479 + Math.random() * (double) this.field1168.field4532) << 16 | (int) ((double) this.field1168.field4516 * Math.random() + (double) this.field1168.field4483) << 8 | (int) (Math.random() * (double) this.field1168.field4488 + (double) this.field1168.field4506) | (int) ((double) this.field1168.field4514 * Math.random() + (double) this.field1168.field4542) << 24;
                    }
                    if (class65.field934 == class65.field930) {
                        new class154(this, this.field1150.field968 + var38, this.field1150.field960 + var37, this.field1150.field964 + var39, var23, var24, var22, var42, var41, var43);
                    } else {
                        class154 var46 = class65.field931[class65.field930];
                        class65.field930 = class65.field930 + 1 & 0x3FF;
                        var46.method1071(this, this.field1150.field968 + var38, this.field1150.field960 + var37, this.field1150.field964 + var39, var23, var24, var22, var42, var41, var43);
                    }
                }
            }
        }
        this.field1165 = 0;
        for (class154 var48 = (class154) this.field1155.method37(60); var48 != null; var48 = (class154) this.field1155.method42(0)) {
            var48.method1069(arg0, arg4);
            this.field1165++;
        }
        class65.field935 += this.field1165;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1156 = arg3;
        this.field1158 = arg1;
        field1163++;
        this.field1151 = arg5;
        this.field1145 = arg9;
        this.field1167 = arg4;
        this.field1149 = arg7;
        this.field1148 = arg6;
        this.field1157 = arg0;
        int var11 = (this.field1157 + this.field1156 + this.field1151) / arg8 + this.field1150.field964;
        this.field1141 = arg2;
        int var12 = (this.field1141 + this.field1167 + this.field1145) / 3 + this.field1150.field968;
        int var13 = (this.field1158 - (-this.field1148 - this.field1149)) / 3 + this.field1150.field960;
        if (this.field1166 != var12 || this.field1154 != var13 || this.field1136 != var11) {
            this.field1166 = var12;
            this.field1136 = var11;
            this.field1159 = true;
            this.field1154 = var13;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII)V")
    public static final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class27 var7 = new class27();
        var7.field334 = arg1 / 128;
        var7.field319 = arg2 / 128;
        var7.field309 = arg3 / 128;
        var7.field310 = arg4 / 128;
        var7.field316 = arg0;
        var7.field332 = arg1;
        var7.field326 = arg2;
        var7.field321 = arg3;
        var7.field323 = arg4;
        var7.field315 = arg5;
        var7.field312 = arg6;
        class179.field2824[class24.field303++] = var7;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lq;Lom;J)V")
    public class76(class90 arg0, class65 arg1, long arg2) {
        this.field1150 = arg1;
        this.field1169 = arg0;
        this.field1155 = new class7();
        this.field1160 = (int) ((double) this.field1160 + Math.random() * 64.0D);
        this.field1140 = arg2;
        this.field1168 = this.field1169.field1359;
    }
}
