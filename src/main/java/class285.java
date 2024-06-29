import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class285 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lbda;")
    private class222 field4099;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lpq;")
    private class194 field4100;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    private int field4106;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[B")
    public byte[] field4097;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    private int field4098;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[Lfja;")
    public static class200[] field4105;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[[Ljfa;")
    private class128[][] field4107;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILr;)V", line = 3)
    public final void method1875(int arg0, int arg1, int arg2, class113 arg3) {
        field4114++;
        class65 var5 = (class65) arg3;
        int var6 = var5.field720 + arg0 + 1;
        int var7 = var5.field712 + arg1 + 1;
        int var8 = this.field4115 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field713;
        int var11 = var5.field719;
        int var12 = this.field4115 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var8 += this.field4115 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field4102) {
            int var15 = var6 - (this.field4102 - var10 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
            var9 += var16;
            var8 += var16;
            var7 = 1;
        }
        int var17 = -52 % ((2 - arg2) / 60);
        if ((var7 + var11) >= this.field4115) {
            int var18 = var7 + var11 + 1 - this.field4115;
            var12 += var18;
            var13 += var18;
            var11 -= var18;
        }
        if (var11 > 0 && var10 > 0) {
            class451.method2726(var10, var12, var9, this.field4097, -105, var8, var11, var5.field715, var13);
            this.method1880((byte) 92, var11, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILha;IIIII)Lka;", line = 72)
    public static final class231 method1876(int arg0, class473 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4104++;
        long var7 = (long) arg3;
        class231 var9 = (class231) class678.field9487.method312(arg0 - 77303792, var7);
        short var10 = 2055;
        if (arg0 != 77303792) {
            return null;
        }
        if (var9 == null) {
            class534 var11 = class93.method674(arg3, 4, 0, class384.field5496);
            if (var11 == null) {
                return null;
            }
            if (var11.field7366 < 13) {
                var11.method3166(2, (byte) -16);
            }
            var9 = arg1.method231(var11, var10, class494.field6800, 64, 768);
            class678.field9487.method305(var9, var7, 18320);
        }
        class231 var12 = var9.method1584((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method1542(arg2);
        }
        if (arg5 != 0) {
            var12.method1569(arg5);
        }
        if (arg4 != 0) {
            var12.method1559(arg4);
        }
        if (arg6 != 0) {
            var12.method1565(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 120)
    public static void method1877(byte arg0) {
        field4105 = null;
        if (arg0 != -72) {
            method1884(true, -120);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lr;III)V", line = 147)
    public final void method1878(class113 arg0, int arg1, int arg2, int arg3) {
        field4108++;
        class65 var5 = (class65) arg0;
        int var6 = var5.field712 + arg1 + 1;
        int var7 = var5.field720 + arg3 + 1;
        int var8 = this.field4115 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field713;
        int var11 = -9 % ((arg2 - 41) / 59);
        int var12 = var5.field719;
        int var13 = this.field4115 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var9 += var12 * var15;
            var7 = 1;
            var10 -= var15;
            var8 += this.field4115 * var15;
        }
        if (var7 + var10 >= this.field4102) {
            int var16 = var7 + var10 + 1 - this.field4102;
            var10 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var13 += var17;
            var9 += var17;
            var14 += var17;
            var12 -= var17;
            var8 += var17;
            var6 = 1;
        }
        if (this.field4115 <= (var6 + var12)) {
            int var18 = var6 - (-var12 - 1) - this.field4115;
            var14 += var18;
            var13 += var18;
            var12 -= var18;
        }
        if (var12 > 0 && var10 > 0) {
            class665.method3789(var14, var12, var9, var5.field715, var10, this.field4097, 4096, var13, var8);
            this.method1880((byte) 24, var12, var7, var6, var10);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 220)
    public final void method1879(byte arg0) {
        field4103++;
        this.field4107 = new class128[this.field4098][this.field4110];
        for (int var2 = 0; var2 < this.field4110; var2++) {
            for (int var3 = 0; var3 < this.field4098; var3++) {
                this.field4107[var3][var2] = new class128(this.field4100, this, this.field4099, var3, var2, this.field4106, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 <= 51) {
            this.field4099 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BIIII)V", line = 250)
    private final void method1880(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4101++;
        if (this.field4107 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg4 - 2 >> 7;
        int var10 = var6;
        int var11 = 66 / ((arg0 + 44) / 56);
        while (var7 >= var10) {
            class128[] var12 = this.field4107[var10];
            for (int var13 = var8; var13 <= var9; var13++) {
                var12[var13].field1663 = true;
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIZ[[Z)V", line = 287)
    public final void method1881(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5) {
        field4109++;
        this.field4100.method1202(93, false);
        this.field4100.method1247(false, (byte) 5);
        this.field4100.method1232(-2, 1);
        this.field4100.method1263(1, 118);
        this.field4100.method1241(1, (byte) 125);
        float var7 = 1.0F / (float) (this.field4100.field2611 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field4110; var22++) {
                int var24 = var22 << this.field4106;
                int var25 = var22 + 1 << this.field4106;
                label85: for (int var26 = 0; var26 < this.field4098; var26++) {
                    int var27 = var26 << this.field4106;
                    int var28 = var26 + 1 << this.field4106;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if (-arg2 <= var29 - arg1 && arg2 >= (var29 - arg1)) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (-arg2 <= var30 - arg0 && (var30 - arg0) <= arg2 && arg5[var29 + arg2 - arg1][arg2 + var30 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4107[var26][var22].method877((byte) -97);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4110; var8++) {
                int var9 = var8 << this.field4106;
                int var10 = var8 + 1 << this.field4106;
                for (int var11 = 0; var11 < this.field4098; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field4106;
                    int var14 = var11 + 1 << this.field4106;
                    class296 var15 = this.field4100.field2686;
                    var15.field6962 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((-arg2) <= (var16 - arg0) && arg2 >= var16 - arg0) {
                            int var17 = this.field4099.field5827 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg2 <= var18 - arg1 && var18 - arg1 <= arg2 && arg5[var18 + arg2 - arg1][var16 + arg2 - arg0]) {
                                    short[] var19 = this.field4099.field3064[var17];
                                    if (var19 != null) {
                                        if (this.field4100.field2748) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method2986(var19[var20] & 0xFFFF, 110);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method2974(var19[var21] & 0xFFFF, (byte) -87);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field4107[var11][var8].method885(var15.field6979, -30276, 5123, var12);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        int var23 = -52 / ((arg3 - 59) / 40);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)I", line = 474)
    public static final int method1882(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4111++;
        if (arg0 == -1065) {
            int var5 = 65536 - class448.field6270[arg2 * 8192 / arg4] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lpq;Lbda;)V", line = 487)
    public class285(class194 arg0, class222 arg1) {
        this.field4099 = arg1;
        this.field4100 = arg0;
        this.field4115 = (this.field4099.field5827 * this.field4099.field5818 >> this.field4100.field2610) + 2;
        this.field4102 = (this.field4099.field5826 * this.field4099.field5818 >> this.field4100.field2610) + 2;
        this.field4106 = this.field4100.field2610 + 7 - this.field4099.field5825;
        this.field4097 = new byte[this.field4115 * this.field4102];
        this.field4098 = this.field4099.field5827 >> this.field4106;
        this.field4110 = this.field4099.field5826 >> this.field4106;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lr;III)Z", line = 502)
    public final boolean method1883(class113 arg0, int arg1, int arg2, int arg3) {
        field4112++;
        class65 var5 = (class65) arg0;
        int var6 = var5.field712 + arg2 + 1;
        int var7 = var5.field720 + arg3 + 1;
        int var8 = var6 + (this.field4115 * var7);
        int var9 = var5.field713;
        int var10 = var5.field719;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var8 += this.field4115 * var11;
            var9 -= var11;
        }
        int var12 = this.field4115 - var10;
        if (this.field4102 <= (var7 + var9)) {
            int var13 = var9 + var7 + 1 - this.field4102;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var12 += var14;
            var8 += var14;
        }
        if (arg1 != 77303792) {
            field4105 = null;
        }
        if (var6 + var10 >= this.field4115) {
            int var15 = var6 + var10 + 1 - this.field4115;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4115 + var12;
            return class234.method1605(var8, var17, var16, var10, var9, -1, this.field4097);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V", line = 575)
    public static final void method1884(boolean arg0, int arg1) {
        field4113++;
        if (class664.field9331 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class766.field10546 == null) {
                class739.method4091(class671.field9423, 2, class266.field3866, class284.field4094);
            } else {
                class201.method1299(2, class284.field4094);
            }
        }
        if (arg1 != 13 && class750.field10360 != null) {
            class750.field10360.method3634(22654);
            class750.field10360 = null;
        }
        if (arg1 == 3) {
            class360.method2265(class610.field8597 != class353.field5118, (byte) 55);
        }
        if (arg1 == 7) {
            class434.method2603(true, class610.field8597 != class296.field4323);
        }
        if (arg1 == 5) {
            if (class766.field10546 == null) {
                class557.method3280(class266.field3866, class671.field9423, -25400);
            } else {
                class676.method3854(-19252);
            }
        } else if (arg1 == 6) {
            if (class766.field10546 == null) {
                class739.method4091(class671.field9423, 2, class266.field3866, class284.field4094);
            } else {
                class201.method1299(2, class284.field4094);
            }
        } else if (arg1 == 9) {
            if (class766.field10546 == null) {
                class739.method4091(class671.field9423, 2, class266.field3866, class284.field4094);
            } else {
                class201.method1299(2, class284.field4094);
            }
        } else if (arg1 == 12) {
            if (class766.field10546 == null) {
                class557.method3280(class266.field3866, class671.field9423, -25400);
            } else {
                class676.method3854(-19252);
            }
        }
        if (!arg0) {
            method1882(112, -117, 77, -97, -90);
        }
        if (class363.method2286((byte) -24, class664.field9331)) {
            class403.field5684.field4076 = 2;
            class122.field1617.field4076 = 2;
            class99.field1155.field4076 = 2;
            class605.field8484.field4076 = 2;
            class75.field841.field4076 = 2;
            class16.field95.field4076 = 2;
            class448.field6272.field4076 = 2;
        }
        if (class363.method2286((byte) -24, arg1)) {
            class483.field6687 = 0;
            class609.field8590 = 1;
            class593.field8344 = 1;
            class511.field7009 = 0;
            class616.field8645 = 0;
            class25.method108(true, (byte) -112);
            class403.field5684.field4076 = 1;
            class122.field1617.field4076 = 1;
            class99.field1155.field4076 = 1;
            class605.field8484.field4076 = 1;
            class75.field841.field4076 = 1;
            class16.field95.field4076 = 1;
            class448.field6272.field4076 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class701.method3967((byte) 98);
        }
        boolean var2 = arg1 == 2 || class760.method4198(arg1, 2) || class232.method1593((byte) -127, arg1);
        boolean var3 = class664.field9331 == 2 || class760.method4198(class664.field9331, 2) || class232.method1593((byte) -125, class664.field9331);
        if (var2 != var3) {
            if (var2) {
                class4.field22 = class442.field6102;
                if (class688.field9602.field8521.method1981((byte) -98) == 0) {
                    class158.method1017(2, (byte) -128);
                } else {
                    class102.method719(false, 120, class456.field6372, class688.field9602.field8521.method1981((byte) -98), 2, 0, class442.field6102);
                    class644.method3690(101);
                }
                class68.field750.method2553(false, -2);
            } else {
                class158.method1017(2, (byte) -128);
                class68.field750.method2553(true, -2);
            }
        }
        if (class363.method2286((byte) -24, arg1) || arg1 == 13) {
            class111.field1332.method250();
        }
        class664.field9331 = arg1;
    }
}
