import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class86 extends class329 {

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "Ldga;")
    private class445 field1206;

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "Lqj;")
    private class548 field1222;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "Lgga;")
    private class332 field1203;

    @OriginalMember(owner = "client!cga", name = "B", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!cga", name = "M", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "[[F")
    private float[][] field1202;

    @OriginalMember(owner = "client!cga", name = "A", descriptor = "[[F")
    private float[][] field1215;

    @OriginalMember(owner = "client!cga", name = "N", descriptor = "[[F")
    private float[][] field1227;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!cga", name = "G", descriptor = "Les;")
    private class630 field1221;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "Lfw;")
    private class458 field1200;

    @OriginalMember(owner = "client!cga", name = "C", descriptor = "Lil;")
    private class68 field1217;

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "Ldw;")
    private class125 field1204;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "Lnl;")
    private class585 field1209;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "Lgv;")
    private class325 field1201;

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "Lgv;")
    private class325 field1220;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "J")
    public static long field1210 = 0L;

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "I")
    public static int field1207 = -1;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!cga", name = "y", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!cga", name = "J", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!cga", name = "L", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!cga", name = "O", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!cga", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field1212;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Z", line = 14)
    public static final boolean method491(byte arg0) {
        field1199++;
        try {
            if (class235.field2946 == 2) {
                if (class49.field691 == null) {
                    class49.field691 = class535.method2897(class316.field4061, class119.field1527, class149.field1920);
                    if (class49.field691 == null) {
                        return false;
                    }
                }
                if (class329.field4193 == null) {
                    class329.field4193 = new class235(class488.field6467, class70.field949);
                }
                if (class598.field8405.method1335(class636.field8925, class49.field691, (byte) 116, 22050, class329.field4193)) {
                    class598.field8405.method1346((byte) -53);
                    if (class223.field2774 > 0) {
                        class235.field2946 = 3;
                        class598.field8405.method1314(-120, 0);
                    } else {
                        class235.field2946 = 0;
                        class598.field8405.method1314(-73, class436.field5443);
                    }
                    if (class679.field9552 > 0L) {
                        class598.field8405.method1312(class679.field9552, class49.field691, -104, class531.field7173, true);
                    } else {
                        class598.field8405.method1317(class49.field691, class531.field7173, 4096);
                    }
                    class49.field691 = null;
                    class679.field9552 = 0L;
                    class316.field4061 = null;
                    class329.field4193 = null;
                    return true;
                }
            }
            int var1 = 43 / ((arg0 + 87) / 36);
        } catch (Exception var3) {
            var3.printStackTrace();
            class598.field8405.method1316(32);
            class329.field4193 = null;
            class235.field2946 = 0;
            class49.field691 = null;
            class316.field4061 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 78)
    public static void method492(int arg0) {
        if (arg0 == 1) {
            field1212 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method493(boolean arg0) {
        field1224++;
        class577.field8054.method2406(18385);
        if (!arg0) {
            field1219 = -96;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILkp;II)V", line = 106)
    public static final void method494(int arg0, class507 arg1, int arg2, int arg3) {
        field1213++;
        if (arg0 != 16383) {
            method491((byte) -22);
        }
        class600 var4 = arg1.method2740((byte) 125, class32.field452);
        if (var4 == null) {
            return;
        }
        class32.field452.method1083(arg2, arg3, arg2 + arg1.field6793, arg1.field6700 + arg3);
        if (class135.field1758 >= 3) {
            class32.field452.method1012(-16777216, var4, arg2, arg3);
        } else {
            class104.field1392.method2904((float) arg1.field6793 / 2.0F + (float) arg2, (float) arg1.field6700 / 2.0F + (float) arg3, 4096, ((int) (-class331.field4223) & 0x3FFF) << 2, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[[ZIII)V", line = 131)
    public final void method495(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field1223++;
        if (this.field1204 == null || this.field1216 > (arg2 + arg3)) {
            return;
        }
        int var6 = 96 / ((8 - arg0) / 52);
        if (this.field1226 < arg2 - arg3 || (arg4 + arg3) < this.field1208 || this.field1218 < (arg4 - arg3)) {
            return;
        }
        for (int var7 = this.field1208; var7 <= this.field1218; var7++) {
            for (int var8 = this.field1216; var8 <= this.field1226; var8++) {
                int var9 = var8 - arg2;
                int var10 = var7 - arg4;
                if ((-arg3) < var9 && var9 < arg3 && (-arg3) < var10 && var10 < arg3 && arg1[arg3 + var9][var10 + arg3]) {
                    this.field1222.method2972(-29455, (int) (this.field1203.method1882(100) * 255.0F) << 24);
                    this.field1222.method2985(this.field1201, (byte) 21, this.field1220, null, null);
                    this.field1222.method2978(this.field1205, 0, 4, this.field1204, 255);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(SB)V", line = 200)
    private final void method496(short arg0, byte arg1) {
        if (this.field1222.field7579) {
            this.field1221.method3526(arg0, 13469);
        } else {
            this.field1221.method3484(arg0, (byte) 0);
        }
        if (arg1 > 60) {
            field1228++;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIII)V", line = 220)
    private final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1225++;
        long var8 = -1L;
        int var10 = (arg4 << this.field1206.field3437) + arg1;
        int var11 = arg5 + (arg2 << this.field1206.field3437);
        int var12 = this.field1206.method1565(var11, var10, true);
        if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class329 var13 = this.field1217.method399(arg0 ^ 0xFFFFB15F, var8);
            if (var13 != null) {
                this.method496(((class423) var13).field5313, (byte) 67);
                return;
            }
        }
        short var14 = (short) (this.field1214++);
        if (var8 != -1L) {
            this.field1217.method402(new class423(var14), (byte) -81, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg5 == 0) {
            var15 = this.field1227[arg6][arg3];
            var16 = this.field1202[arg6][arg3];
            var17 = this.field1215[arg6][arg3];
        } else if (this.field1206.field3432 == arg1 && arg5 == 0) {
            var16 = this.field1202[arg6 + 1][arg3];
            var17 = this.field1215[arg6 + 1][arg3];
            var15 = this.field1227[arg6 + 1][arg3];
        } else if (this.field1206.field3432 == arg1 && this.field1206.field3432 == arg5) {
            var16 = this.field1202[arg6 + 1][arg3 + 1];
            var15 = this.field1227[arg6 + 1][arg3 + 1];
            var17 = this.field1215[arg6 + 1][arg3 + 1];
        } else if (arg1 == 0 && this.field1206.field3432 == arg5) {
            var16 = this.field1202[arg6][arg3 + 1];
            var15 = this.field1227[arg6][arg3 + 1];
            var17 = this.field1215[arg6][arg3 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field1206.field3432;
            float var19 = (float) arg5 / (float) this.field1206.field3432;
            float var20 = this.field1227[arg6][arg3];
            float var21 = this.field1215[arg6][arg3];
            float var22 = this.field1202[arg6][arg3];
            float var23 = this.field1227[arg6 + 1][arg3];
            float var24 = this.field1215[arg6 + 1][arg3];
            float var25 = (this.field1227[arg6][arg3 + 1] - var20) * var18 + var20;
            float var26 = (this.field1215[arg6 + 1][arg3 + 1] - var24) * var18 + var24;
            float var27 = this.field1202[arg6 + 1][arg3];
            float var28 = (this.field1202[arg6][arg3 + 1] - var22) * var18 + var22;
            float var29 = (this.field1227[arg6 + 1][arg3 + 1] - var23) * var18 + var23;
            float var30 = (this.field1215[arg6][arg3 + 1] - var21) * var18 + var21;
            float var31 = (this.field1202[arg6 + 1][arg3 + 1] - var27) * var18 + var27;
            var15 = (var29 - var25) * var19 + var25;
            var17 = (var26 - var30) * var19 + var30;
            var16 = (var31 - var28) * var19 + var28;
        }
        if (arg0 != 12619) {
            return;
        }
        float var32 = (float) (this.field1203.method1886(true) - var10);
        float var33 = (float) (this.field1203.method1888(-55) - var12);
        float var34 = (float) (this.field1203.method1885((byte) 119) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1203.method1883((byte) -53);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1203.method1881(122);
        int var45 = (int) ((float) ((var44 & 0xFF8848) >> 16) * var43);
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
        if (this.field1222.field7579) {
            this.field1200.method2449((float) var10, -92);
            this.field1200.method2449((float) var12, arg0 ^ 0xFFFFCED4);
            this.field1200.method2449((float) var11, -124);
        } else {
            this.field1200.method2447((byte) -71, (float) var10);
            this.field1200.method2447((byte) -71, (float) var12);
            this.field1200.method2447((byte) -71, (float) var11);
        }
        this.field1200.method3509(var45, (byte) -128);
        this.field1200.method3509(var46, (byte) -117);
        this.field1200.method3509(var47, (byte) -108);
        this.field1200.method3509(255, (byte) -117);
        this.method496(var14, (byte) 88);
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lqj;Ldga;Lgga;[I)V", line = 388)
    public class86(class548 arg0, class445 arg1, class332 arg2, int[] arg3) {
        this.field1206 = arg1;
        this.field1222 = arg0;
        this.field1203 = arg2;
        int var5 = this.field1203.method1883((byte) -54) - (arg1.field3432 >> 1);
        this.field1216 = this.field1203.method1886(true) - var5 >> arg1.field3437;
        this.field1226 = this.field1203.method1886(true) + var5 >> arg1.field3437;
        this.field1208 = this.field1203.method1885((byte) 119) - var5 >> arg1.field3437;
        this.field1218 = this.field1203.method1885((byte) 119) + var5 >> arg1.field3437;
        int var6 = this.field1226 + 1 - this.field1216;
        int var7 = this.field1218 + 1 - this.field1208;
        this.field1202 = new float[var6 + 1][var7 + 1];
        this.field1215 = new float[var6 + 1][var7 + 1];
        this.field1227 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field1208 + var8;
            if (var25 > 0 && var25 < (this.field1206.field3440 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field1216 + var26;
                    if (var27 > 0 && this.field1206.field3441 - 1 > var27) {
                        int var28 = arg1.method1562(var25, (byte) 51, var27 + 1) - arg1.method1562(var25, (byte) 51, var27 - 1);
                        int var29 = arg1.method1562(var25 + 1, (byte) 51, var27) - arg1.method1562(var25 - 1, (byte) 51, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var28 * var28 + 65536))));
                        this.field1227[var26][var8] = (float) var28 * var30;
                        this.field1215[var26][var8] = var30 * -256.0F;
                        this.field1202[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1208; var10 <= this.field1218; var10++) {
            if (var10 >= 0 && arg1.field3440 > var10) {
                for (int var21 = this.field1216; var21 <= this.field1226; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3441) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field5633[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field1205 += 3;
                                    }
                                }
                            } else {
                                this.field1205 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1226 - this.field1216;
            }
        }
        if (this.field1205 > 0) {
            this.field1221 = new class630(this.field1205 * 2);
            this.field1200 = new class458(this.field1205 * 16);
            this.field1217 = new class68(class391.method2101(this.field1205, 128));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field1208; var13 <= this.field1218; var13++) {
                if (var13 >= 0 && var13 < arg1.field3440) {
                    int var14 = 0;
                    for (int var15 = this.field1216; var15 <= this.field1226; var15++) {
                        if (var15 >= 0 && var15 < arg1.field3441) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field5633[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field5612[var15][var13];
                                    int[] var19 = arg1.field5646[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method497(12619, var18[var20], var13, var11, var15, var19[var20], var14);
                                                var20++;
                                                this.method497(12619, var18[var20], var13, var11, var15, var19[var20], var14);
                                                var20++;
                                                this.method497(12619, var18[var20], var13, var11, var15, var19[var20], var14);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method497(12619, 0, var13, var11, var15, 0, var14);
                                    this.method497(12619, arg1.field3432, var13, var11, var15, 0, var14);
                                    this.method497(12619, 0, var13, var11, var15, arg1.field3432, var14);
                                } else if (var16 == 2) {
                                    this.method497(12619, arg1.field3432, var13, var11, var15, 0, var14);
                                    this.method497(12619, arg1.field3432, var13, var11, var15, arg1.field3432, var14);
                                    this.method497(12619, 0, var13, var11, var15, 0, var14);
                                } else if (var16 == 5) {
                                    this.method497(12619, arg1.field3432, var13, var11, var15, arg1.field3432, var14);
                                    this.method497(12619, 0, var13, var11, var15, arg1.field3432, var14);
                                    this.method497(12619, arg1.field3432, var13, var11, var15, 0, var14);
                                } else if (var16 == 4) {
                                    this.method497(12619, 0, var13, var11, var15, arg1.field3432, var14);
                                    this.method497(12619, 0, var13, var11, var15, 0, var14);
                                    this.method497(12619, arg1.field3432, var13, var11, var15, arg1.field3432, var14);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field1226 - this.field1216;
                }
                var11++;
            }
            this.field1204 = this.field1222.method2984((byte) -82, this.field1221.field8812, this.field1221.field8804, false, 5123);
            this.field1209 = this.field1222.method3024(this.field1200.field8804, this.field1200.field8812, false, 16, -110);
            this.field1201 = new class325(this.field1209, 5126, 3, 0);
            this.field1220 = new class325(this.field1209, 5121, 4, 12);
        } else {
            this.field1209 = null;
            this.field1204 = null;
            this.field1220 = null;
            this.field1201 = null;
        }
        this.field1221 = null;
        this.field1227 = this.field1215 = this.field1202 = null;
        this.field1217 = null;
        this.field1200 = null;
    }
}
