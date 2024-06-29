import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class493 extends class324 {

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Ltu;")
    private class294 field7187;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Lha;")
    private class53 field7186;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Loj;")
    private class321 field7192;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    private int field7179;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    private int field7182;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    private int field7180;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field7173;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[[F")
    private float[][] field7172;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[[F")
    private float[][] field7177;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "[[F")
    private float[][] field7190;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    private int field7189;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Lcca;")
    private class209 field7170;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Lnq;")
    private class396 field7188;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Lsd;")
    private class80 field7183;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7178;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7184;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    private int field7181;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field7185 = 0;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Ltf;")
    public static class248 field7174 = new class248();

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Z")
    public static boolean field7194;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method2955(byte arg0, int arg1) {
        class30.field344.method1811((byte) 119, arg1);
        field7193++;
        if (arg0 <= 12) {
            field7174 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIII)V", line = 18)
    private final void method2956(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7171++;
        long var8 = -1L;
        int var10 = arg1 + (arg3 << this.field7186.field1663);
        int var11 = arg2 + (arg6 << this.field7186.field1663);
        int var12 = this.field7186.method249(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class324 var13 = this.field7183.method524((byte) 88, var8);
            if (var13 != null) {
                this.method2957((byte) -125, ((class173) var13).field2118);
                return;
            }
        }
        short var14 = (short) (this.field7181++);
        if (var8 != -1L) {
            this.field7183.method520((byte) -77, new class173(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg2 == 0) {
            var15 = this.field7177[arg5][arg4];
            var16 = this.field7190[arg5][arg4];
            var17 = this.field7172[arg5][arg4];
        } else if (this.field7186.field1662 == arg1 && arg2 == 0) {
            var16 = this.field7190[arg5 + 1][arg4];
            var17 = this.field7172[arg5 + 1][arg4];
            var15 = this.field7177[arg5 + 1][arg4];
        } else if (this.field7186.field1662 == arg1 && this.field7186.field1662 == arg2) {
            var16 = this.field7190[arg5 + 1][arg4 + 1];
            var17 = this.field7172[arg5 + 1][arg4 + 1];
            var15 = this.field7177[arg5 + 1][arg4 + 1];
        } else if (arg1 == 0 && this.field7186.field1662 == arg2) {
            var15 = this.field7177[arg5][arg4 + 1];
            var17 = this.field7172[arg5][arg4 + 1];
            var16 = this.field7190[arg5][arg4 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field7186.field1662;
            float var19 = (float) arg2 / (float) this.field7186.field1662;
            float var20 = this.field7190[arg5][arg4];
            float var21 = this.field7172[arg5][arg4];
            float var22 = this.field7177[arg5][arg4];
            float var23 = this.field7190[arg5 + 1][arg4];
            float var24 = this.field7172[arg5 + 1][arg4];
            float var25 = (this.field7190[arg5 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field7172[arg5][arg4 + 1] - var21) * var18 + var21;
            float var27 = (this.field7190[arg5][arg4 + 1] - var20) * var18 + var20;
            float var28 = this.field7177[arg5 + 1][arg4];
            float var29 = (this.field7177[arg5][arg4 + 1] - var22) * var18 + var22;
            float var30 = (this.field7172[arg5 + 1][arg4 + 1] - var24) * var18 + var24;
            var17 = (var30 - var26) * var19 + var26;
            var16 = (var25 - var27) * var19 + var27;
            float var31 = (this.field7177[arg5 + 1][arg4 + 1] - var28) * var18 + var28;
            var15 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field7192.method2093((byte) -74) - var10);
        float var33 = (float) (this.field7192.method2097((byte) -89) - var12);
        float var34 = (float) (this.field7192.method2095(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field7192.method2094(0);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field7192.method2098((byte) 89);
        if (arg0 > -31) {
            this.field7180 = 57;
        }
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3423()) {
            this.field7178.method3415((float) var10);
            this.field7178.method3415((float) var12);
            this.field7178.method3415((float) var11);
        } else {
            this.field7178.method3416((float) var10);
            this.field7178.method3416((float) var12);
            this.field7178.method3416((float) var11);
        }
        if (this.field7187.field4261 == 0) {
            this.field7178.method3412(var47);
            this.field7178.method3412(var46);
            this.field7178.method3412(var45);
        } else {
            this.field7178.method3412(var45);
            this.field7178.method3412(var46);
            this.field7178.method3412(var47);
        }
        this.field7178.method3412(255);
        this.method2957((byte) -53, var14);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BS)V", line = 199)
    private final void method2957(byte arg0, short arg1) {
        if (arg0 > -45) {
            return;
        }
        field7176++;
        if (Stream.method3423()) {
            this.field7184.method3414(arg1);
        } else {
            this.field7184.method3413(arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIII[[Z)V", line = 218)
    public final void method2958(byte arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field7175++;
        if (this.field7188 == null || this.field7179 > (arg2 + arg3) || (arg3 - arg2) > this.field7182) {
            return;
        }
        if (arg0 != 106) {
            this.field7181 = -43;
        }
        if (this.field7180 > arg1 + arg2 || (arg1 - arg2) > this.field7173) {
            return;
        }
        for (int var6 = this.field7180; var6 <= this.field7173; var6++) {
            for (int var7 = this.field7179; var7 <= this.field7182; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if ((-arg2) < var8 && var8 < arg2 && var9 > -arg2 && arg2 > var9 && arg4[var8 + arg2][arg2 + var9]) {
                    this.field7187.method1951((byte) 115, (byte) ((int) (this.field7192.method2091(-918913433) * 255.0F)));
                    this.field7187.method1558(this.field7170, 121, 0);
                    this.field7187.method1562(75, this.field7187.field4366);
                    this.field7187.method1508(-28296, 0, this.field7189 / 3, this.field7181, 0, class256.field3658, this.field7188);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 285)
    public static final void method2959(int arg0, int arg1) {
        class455.field6822 = new int[arg1];
        if (arg0 > -104) {
            return;
        }
        field7191++;
        class448.field6688 = new int[arg1];
        class274.field3847 = new int[arg1];
        class334.field4796 = new int[arg1];
        class550.field7845 = new int[arg1];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 310)
    public static void method2960(int arg0) {
        if (arg0 != -885157695) {
            method2959(44, 42);
        }
        field7174 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ltu;Lha;Loj;[I)V", line = 320)
    public class493(class294 arg0, class53 arg1, class321 arg2, int[] arg3) {
        this.field7187 = arg0;
        this.field7186 = arg1;
        this.field7192 = arg2;
        int var5 = this.field7192.method2094(0) - (arg1.field1662 >> 1);
        this.field7179 = this.field7192.method2093((byte) -108) - var5 >> arg1.field1663;
        this.field7182 = this.field7192.method2093((byte) -121) + var5 >> arg1.field1663;
        this.field7180 = this.field7192.method2095(true) - var5 >> arg1.field1663;
        this.field7173 = var5 + this.field7192.method2095(true) >> arg1.field1663;
        int var6 = this.field7182 + 1 - this.field7179;
        int var7 = this.field7173 + 1 - this.field7180;
        this.field7172 = new float[var6 + 1][var7 + 1];
        this.field7177 = new float[var6 + 1][var7 + 1];
        this.field7190 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field7180 + var8;
            if (var27 > 0 && var27 < (this.field7186.field1660 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field7179 + var28;
                    if (var29 > 0 && var29 < (this.field7186.field1656 - 1)) {
                        int var30 = arg1.method259(var29 + 1, var27) - arg1.method259(var29 - 1, var27);
                        int var31 = arg1.method259(var29, var27 + 1) - arg1.method259(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field7190[var28][var8] = (float) var30 * var32;
                        this.field7172[var28][var8] = var32 * -256.0F;
                        this.field7177[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7180; var10 <= this.field7173; var10++) {
            if (var10 >= 0 && arg1.field1660 > var10) {
                for (int var23 = this.field7179; var23 <= this.field7182; var23++) {
                    if (var23 >= 0 && arg1.field1656 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field559[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field7189 += 3;
                                    }
                                }
                            } else {
                                this.field7189 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field7182 - this.field7179;
            }
        }
        if (this.field7189 <= 0) {
            this.field7170 = null;
            this.field7188 = null;
        } else {
            this.field7183 = new class80(class367.method2354(-224121456, this.field7189));
            this.field7188 = this.field7187.method1535((byte) -104, false);
            this.field7188.method654(this.field7189, 9658);
            NativeHeapBuffer var11 = this.field7187.method1974((byte) 56, false, this.field7189 * 16);
            this.field7178 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field7188.method652(true, 31983);
                } while (var12 == null);
                this.field7184 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field7180; var15 <= this.field7173; var15++) {
                    if (var15 >= 0 && var15 < arg1.field1660) {
                        int var16 = 0;
                        for (int var17 = this.field7179; var17 <= this.field7182; var17++) {
                            if (var17 >= 0 && var17 < arg1.field1656) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field559[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field584[var17][var15];
                                        int[] var21 = arg1.field576[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2956((byte) -62, var20[var22], var21[var22], var17, var14, var16, var15);
                                                    var22++;
                                                    this.method2956((byte) -73, var20[var22], var21[var22], var17, var14, var16, var15);
                                                    var22++;
                                                    this.method2956((byte) -55, var20[var22], var21[var22], var17, var14, var16, var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2956((byte) -119, 0, 0, var17, var14, var16, var15);
                                        this.method2956((byte) -54, arg1.field1662, 0, var17, var14, var16, var15);
                                        this.method2956((byte) -106, 0, arg1.field1662, var17, var14, var16, var15);
                                    } else if (var18 == 2) {
                                        this.method2956((byte) -59, arg1.field1662, 0, var17, var14, var16, var15);
                                        this.method2956((byte) -92, arg1.field1662, arg1.field1662, var17, var14, var16, var15);
                                        this.method2956((byte) -65, 0, 0, var17, var14, var16, var15);
                                    } else if (var18 == 5) {
                                        this.method2956((byte) -47, arg1.field1662, arg1.field1662, var17, var14, var16, var15);
                                        this.method2956((byte) -76, 0, arg1.field1662, var17, var14, var16, var15);
                                        this.method2956((byte) -56, arg1.field1662, 0, var17, var14, var16, var15);
                                    } else if (var18 == 4) {
                                        this.method2956((byte) -110, 0, arg1.field1662, var17, var14, var16, var15);
                                        this.method2956((byte) -89, 0, 0, var17, var14, var16, var15);
                                        this.method2956((byte) -50, arg1.field1662, arg1.field1662, var17, var14, var16, var15);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field7182 - this.field7179;
                    }
                    var14++;
                }
                this.field7184.method3411();
                if (this.field7188.method651(-15045)) {
                    this.field7178.method3411();
                    this.field7170 = this.field7187.method1548((byte) 122, false);
                    this.field7170.method1070(var11, -110, 16, this.field7181 * 16);
                    break;
                }
                this.field7178.method3421(0);
                this.field7183.method528(-519011192);
            }
        }
        this.field7183 = null;
        this.field7190 = this.field7172 = this.field7177 = null;
        this.field7178 = null;
        this.field7184 = null;
    }
}
