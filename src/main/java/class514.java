import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class514 extends class631 {

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lrc;")
    private class538 field7327;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "Lwu;")
    private class371 field7335;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Lup;")
    private class274 field7326;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)I")
    public static final int method3025(int arg0) {
        ++field7325;
        if (~class558.field7842 == -1) {
            class647.field8874.method3569(new class23("jaclib"), (byte) 69);
            if (class647.field8874.method3571(true).method146(6340) != 100) {
                return 1;
            }
            if (!((class23) class647.field8874.method3571(true)).method148((byte) 49)) {
                class499.field7161.method2207(-12362);
            }
            class558.field7842 = 1;
        }
        if (~class558.field7842 == -2) {
            class652.field8958 = class647.method3568(false);
            class647.field8872.method3569(new class412(class456.field6432), (byte) 127);
            class647.field8875.method3569(new class23("jaggl"), (byte) 60);
            class647.field8876.method3569(new class23("jagdx"), (byte) 29);
            class647.field8877.method3569(new class23("jagmisc"), (byte) 49);
            class647.field8878.method3569(new class23("sw3d"), (byte) 30);
            class647.field8879.method3569(new class23("hw3d"), (byte) 96);
            class647.field8880.method3569(new class23("jagtheora"), (byte) 98);
            class647.field8881.method3569(new class412(class452.field6395), (byte) 60);
            class647.field8882.method3569(new class412(class52.field592), (byte) 95);
            class647.field8883.method3569(new class412(class580.field8187), (byte) 28);
            class647.field8884.method3569(new class412(class236.field3172), (byte) 118);
            class647.field8885.method3569(new class412(class211.field2784), (byte) 33);
            class647.field8886.method3569(new class412(class360.field5104), (byte) 122);
            class647.field8887.method3569(new class412(class48.field567), (byte) 47);
            class647.field8888.method3569(new class412(class476.field6761), (byte) 59);
            class647.field8889.method3569(new class412(class119.field1444), (byte) 89);
            class647.field8890.method3569(new class412(class467.field6617), (byte) 63);
            class647.field8891.method3569(new class412(class318.field4413), (byte) 71);
            class647.field8892.method3569(new class412(class511.field7311), (byte) 39);
            class647.field8893.method3569(new class412(class606.field8527), (byte) 120);
            class647.field8894.method3569(new class412(class488.field6898), (byte) 105);
            class647.field8895.method3569(new class33(class228.field3062, "huffman"), (byte) 95);
            class647.field8896.method3569(new class412(class705.field9810), (byte) 114);
            class647.field8897.method3569(new class412(class164.field2255), (byte) 107);
            class647.field8898.method3569(new class412(class405.field5725), (byte) 110);
            class647.field8899.method3569(new class688(class662.field9065, "details"), (byte) 117);
            for (int var1 = 0; class652.field8958.length > var1; ++var1) {
                if (class652.field8958[var1].method3571(true) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class647[] var3 = class652.field8958;
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                class647 var5 = var3[var4];
                int var6 = var5.method3572(0);
                int var7 = var5.method3571(true).method146(6340);
                var2 += var6 * var7 / 100;
            }
            class558.field7842 = 2;
            class647.field8900 = var2;
        }
        if (class652.field8958 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            class647[] var11 = class652.field8958;
            if (arg0 > -86) {
                return 58;
            } else {
                for (int var12 = 0; var12 < var11.length; ++var12) {
                    class647 var16 = var11[var12];
                    int var17 = var16.method3572(0);
                    int var18 = var16.method3571(true).method146(6340);
                    if (var18 < 100) {
                        var10 = false;
                    }
                    var8 += var17;
                    var9 += var17 * var18 / 100;
                }
                if (var10) {
                    if (!((class23) class647.field8877.method3571(true)).method148((byte) -127)) {
                        class499.field7161.method2208(-1);
                    }
                    if (!((class23) class647.field8880.method3571(true)).method148((byte) 57)) {
                        class358.field5099 = class499.field7161.method2200(0);
                    }
                    class652.field8958 = null;
                }
                int var13 = var8 - class647.field8900;
                int var14 = var9 - class647.field8900;
                int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
                if (!var10 && ~var15 < -100) {
                    var15 = 99;
                }
                return var15;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V")
    public final void method1509(boolean arg0, boolean arg1) {
        if (super.field8722.field1840 > 0) {
            float var3 = -0.5F / (float) super.field8722.field1840;
            super.field8722.method884(1, arg0);
            class722.field10019[0] = 0.0F;
            class722.field10019[2] = var3;
            class722.field10019[3] = super.field8722.field1929 * var3 + 0.25F;
            class722.field10019[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class722.field10019, 0);
            OpenGL.glPopMatrix();
            super.field8722.method890((float) super.field8722.field1840, -11757, 0.5F);
            super.field8722.method926(this.field7335, 102);
            super.field8722.method884(0, true);
        }
        ++field7336;
        this.field7326.method1783(-26, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (arg0) {
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    public static final void method3026(int arg0) {
        ++field7331;
        for (int var1 = arg0; var1 < class593.field8350; ++var1) {
            class642.field8800[var1] = null;
        }
        class593.field8350 = 0;
        for (int var2 = 0; ~class634.field8744 < ~var2; ++var2) {
            for (int var42 = 0; class492.field6939 > var42; ++var42) {
                for (int var43 = 0; class365.field5171 > var43; ++var43) {
                    class165 var44 = class553.field7776[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field2276 > 0) {
                            var44.field2276 = (short) (var44.field2276 * -1);
                        }
                        if (~var44.field2273 < -1) {
                            var44.field2273 = (short) (var44.field2273 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class634.field8744; ++var3) {
            for (int var4 = 0; class492.field6939 > var4; ++var4) {
                for (int var5 = 0; ~class365.field5171 < ~var5; ++var5) {
                    class165 var6 = class553.field7776[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class553.field7776[0][var5][var4] != null && class553.field7776[0][var5][var4].field2272 != null;
                        if (~var6.field2273 > -1) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class165 var12 = class553.field7776[var3][var5][var4 + -1];
                            int var13 = class588.field8292[var3].method1816((byte) -10, var4, var5);
                            while (var8 > 0 && var12 != null && ~var12.field2273 > -1 && ~var6.field2273 == ~var12.field2273 && ~var6.field2275 == ~var12.field2275 && var13 == class588.field8292[var3].method1816((byte) 124, var8 + -1, var5) && (var8 + -1 <= 0 || var13 == class588.field8292[var3].method1816((byte) 49, var8 + -2, var5))) {
                                --var8;
                                var12 = class553.field7776[var3][var5][var8 + -1];
                            }
                            for (class165 var14 = class553.field7776[var3][var5][var4 + 1]; ~class365.field5171 < ~var9 && var14 != null && ~var14.field2273 > -1 && var6.field2273 == var14.field2273 && var6.field2275 == var14.field2275 && ~class588.field8292[var3].method1816((byte) 126, var9 + 1, var5) == ~var13 && (class365.field5171 <= var9 + 1 || ~class588.field8292[var3].method1816((byte) -26, var9 + 2, var5) == ~var13); var14 = class553.field7776[var3][var5][var9 + 1]) {
                                ++var9;
                            }
                            int var15 = -var3 + var3 + 1;
                            int var16 = class588.field8292[!var7 ? var3 : var3 + 1].method1816((byte) 121, var8, var5);
                            int var17 = var6.field2273 * var15 + var16;
                            int var18 = class588.field8292[!var7 ? var3 : var3 + 1].method1816((byte) 122, var9 + 1, var5);
                            int var19 = var6.field2273 * var15 + var18;
                            int var20 = var5 << class660.field9038;
                            int var21 = var8 << class660.field9038;
                            int var22 = (var9 << class660.field9038) + class586.field8250;
                            class642.field8800[class593.field8350++] = new class104(1, var3, var6.field2275 + var20, var20 - -var6.field2275, var6.field2275 + var20, var6.field2275 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; ++var23) {
                                for (int var24 = var8; var9 >= var24; ++var24) {
                                    class553.field7776[var23][var5][var24].field2273 = (short) (class553.field7776[var23][var5][var24].field2273 * -1);
                                }
                            }
                        }
                        if (~var6.field2276 > -1) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class165 var29 = class553.field7776[var3][var5 + -1][var4];
                            int var30 = class588.field8292[var3].method1816((byte) 124, var4, var5);
                            while (~var25 < -1 && var29 != null && ~var29.field2276 > -1 && var6.field2276 == var29.field2276 && var6.field2277 == var29.field2277 && class588.field8292[var3].method1816((byte) 123, var4, var25 + -1) == var30 && (var25 + -1 <= 0 || var30 == class588.field8292[var3].method1816((byte) -31, var4, var25 - 2))) {
                                --var25;
                                var29 = class553.field7776[var3][var25 + -1][var4];
                            }
                            for (class165 var31 = class553.field7776[var3][var5 + 1][var4]; class492.field6939 > var26 && var31 != null && ~var31.field2276 > -1 && var6.field2276 == var31.field2276 && ~var6.field2277 == ~var31.field2277 && class588.field8292[var3].method1816((byte) 124, var4, var26 + 1) == var30 && (var26 - -1 >= class492.field6939 || ~var30 == ~class588.field8292[var3].method1816((byte) 127, var4, var26 + 2)); var31 = class553.field7776[var3][var26 + 1][var4]) {
                                ++var26;
                            }
                            int var32 = var3 + 1 + -var3;
                            int var33 = class588.field8292[!var7 ? var3 : var3 + 1].method1816((byte) 123, var4, var25);
                            int var34 = var6.field2276 * var32 + var33;
                            int var35 = class588.field8292[!var7 ? var3 : var3 + 1].method1816((byte) -92, var4, var26 + 1);
                            int var36 = var35 - -(var6.field2276 * var32);
                            int var37 = var25 << class660.field9038;
                            int var38 = (var26 << class660.field9038) - -class586.field8250;
                            int var39 = var4 << class660.field9038;
                            class642.field8800[class593.field8350++] = new class104(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 - -var6.field2277, var6.field2277 + var39, var6.field2277 + var39, var39 - -var6.field2277);
                            for (int var40 = var3; ~var28 <= ~var40; ++var40) {
                                for (int var41 = var25; var26 >= var41; ++var41) {
                                    class553.field7776[var40][var41][var4].field2276 = (short) (class553.field7776[var40][var41][var4].field2276 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class196.field2608 = true;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILta;)V")
    public final void method1508(int arg0, int arg1, class210 arg2) {
        ++field7330;
        int var4 = 36 % ((arg1 - 52) / 62);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
    public final void method1506(int arg0, boolean arg1) {
        if (arg0 != 17660) {
            method3028(-101, (byte) 103, 29, 40, 98);
        }
        ++field7333;
        super.field8722.method946(false, 260, 8448);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
    public final void method1512(int arg0, int arg1, int arg2) {
        ++field7338;
        if (arg1 >= 72) {
            if (~(arg0 & 1) != -2) {
                if (this.field7327.field7545) {
                    super.field8722.method926(this.field7327.field7551, 108);
                    class722.field10019[0] = 0.0F;
                    class722.field10019[1] = 0.0F;
                    class722.field10019[2] = 0.0F;
                    class722.field10019[3] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class722.field10019, 0);
                } else {
                    super.field8722.method926(this.field7327.field7550[0], 75);
                }
            } else if (!this.field7327.field7545) {
                int var4 = super.field8722.field1790 % 4000 * 16 / 4000;
                super.field8722.method926(this.field7327.field7550[var4], 92);
            } else {
                super.field8722.method926(this.field7327.field7551, 65);
                class722.field10019[0] = 0.0F;
                class722.field10019[1] = 0.0F;
                class722.field10019[2] = 0.0F;
                class722.field10019[3] = (float) (super.field8722.field1790 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, class722.field10019, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V")
    private final void method3027(int arg0) {
        ++field7329;
        this.field7326 = new class274(super.field8722, 2);
        this.field7326.method1785(0, 114);
        super.field8722.method884(1, true);
        super.field8722.method946(false, 7681, 260);
        super.field8722.method883((byte) 34, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field8722.method884(0, true);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7327.field7545) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7326.method1784(-50135600);
        if (arg0 >= -26) {
            this.field7326 = null;
        }
        this.field7326.method1785(1, 79);
        super.field8722.method884(1, true);
        super.field8722.method946(false, 8448, 8448);
        super.field8722.method883((byte) 34, 0, 768, 5890);
        OpenGL.glDisable(3168);
        super.field8722.method884(0, true);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7327.field7545) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7326.method1784(-50135600);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBIII)V")
    public static final void method3028(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= 31) {
            ++field7332;
            int var5 = class469.field6649;
            int var6 = class382.field5463;
            if (class589.field8295) {
                var5 += class171.method1102(5467);
                var6 += class575.method3288((byte) -108);
            }
            if (~class674.field9142 == -2) {
                class88 var7 = class458.field6452[class269.field3848 / 100];
                var7.method658(var5 - 8, var6 + -8);
                class189.method1186(var7.method670() + var6 + -8, var5 + -8 + var7.method656(), (byte) -71, var5 + -8, var6 + -8);
            }
            if (class674.field9142 == 2) {
                class88 var8 = class458.field6452[4 - -(class269.field3848 / 100)];
                var8.method658(var5 + -8, var6 + -8);
                class189.method1186(var8.method670() + var6 + -8, var8.method656() + (var5 - 8), (byte) -68, var5 - 8, var6 + -8);
            }
            class140.method985((byte) -73);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)Z")
    public final boolean method1507(byte arg0) {
        ++field7328;
        int var2 = 115 / ((arg0 - -9) / 53);
        return true;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Leea;Lrc;)V")
    public class514(class131 arg0, class538 arg1) {
        super(arg0);
        this.field7327 = arg1;
        this.method3027(-41);
        this.field7335 = new class371(super.field8722, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7335.method2346(false, false);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public final void method1513(int arg0) {
        this.field7326.method1783(-12, '\u0001');
        ++field7334;
        if (super.field8722.field1840 > 0) {
            super.field8722.method884(1, true);
            super.field8722.method926((class210) null, 47);
            super.field8722.method890(0.0F, -11757, 1.0F);
            super.field8722.method884(0, true);
        }
        if (arg0 >= 74) {
            super.field8722.method946(false, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }
}
