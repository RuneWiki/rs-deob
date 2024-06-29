import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class229 {

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "Z")
    private boolean field38 = false;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "Z")
    private boolean field41;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "[Lil;")
    private class7[] field33;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Lqo;")
    public static class19 field39 = new class19("", 13);

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "Lqo;")
    public static class19 field42 = new class19("", 16);

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "Lvh;")
    public static class240 field34;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lwu;")
    private class250 field29;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "[Lf;")
    public static class529[] field26;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I[Lf;)V")
    public static final void method11(int arg0, class529[] arg1) {
        ++field31;
        class478.field6989 = arg1.length;
        class272.field3713 = new class529[class478.field6989 + 10];
        class119.field1615 = new int[class478.field6989 - -10];
        class416.method2485(arg1, 0, class272.field3713, 0, class478.field6989);
        int var2 = 0;
        if (arg0 == -229) {
            while (~var2 > ~class478.field6989) {
                class119.field1615[var2] = class272.field3713[var2].method121();
                ++var2;
            }
            for (int var3 = class478.field6989; ~var3 > ~class272.field3713.length; ++var3) {
                class119.field1615[var3] = 12;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)V")
    public final void method12(int arg0, int arg1, int arg2) {
        if (this.field38) {
            super.field3194.method2398(1, (byte) -8);
            super.field3194.method2412((byte) 4, this.field33[arg0 + -1]);
            super.field3194.method2398(0, (byte) -105);
        }
        ++field27;
        int var4 = 109 % ((13 - arg1) / 46);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
    public final boolean method13(byte arg0) {
        ++field35;
        if (arg0 < 123) {
            field42 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lki;Lki;I)V")
    public static final void method14(class499 arg0, class499 arg1, int arg2) {
        ++field24;
        if (arg1.field7339 != null) {
            arg1.method2946(-117);
        }
        arg1.field7339 = arg0.field7339;
        arg1.field7336 = arg0;
        arg1.field7339.field7336 = arg1;
        int var3 = 76 % ((arg2 - 29) / 38);
        arg1.field7336.field7339 = arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
    public static final void method15(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class437.field6374.field4252 * arg0 >> 8;
        ++field36;
        if (arg1 != var4 && ~arg3 != 0) {
            class370.method2140(false, false, client.field2802, 0, arg3, var4);
            class208.field2948 = true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
    private final void method16(boolean arg0) {
        this.field29 = new class250(super.field3194, 2);
        ++field28;
        this.field29.method1471(2, 0);
        super.field3194.method2398(1, (byte) 27);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        if (arg0) {
            field42 = null;
        }
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field41) {
            super.field3194.method2383(7681, 94, 8448);
            super.field3194.method2362(34168, (byte) 65, 768, 0);
            super.field3194.method2398(2, (byte) 109);
            super.field3194.method2383(260, 68, 7681);
            super.field3194.method2362(34168, (byte) 65, 768, 0);
            super.field3194.method2362(34168, (byte) 65, 770, 1);
            super.field3194.method2379(770, (byte) -108, 34167, 0);
        } else {
            super.field3194.method2383(260, 104, 7681);
            super.field3194.method2362(5890, (byte) 65, 770, 0);
            super.field3194.method2379(770, (byte) -114, 34167, 0);
        }
        super.field3194.method2398(0, (byte) -68);
        this.field29.method1475(17);
        this.field29.method1471(2, 1);
        super.field3194.method2398(1, (byte) 12);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field41) {
            super.field3194.method2383(8448, 91, 8448);
            super.field3194.method2362(5890, (byte) 65, 768, 0);
            super.field3194.method2398(2, (byte) -63);
            super.field3194.method2383(8448, 106, 8448);
            super.field3194.method2362(5890, (byte) 65, 768, 0);
            super.field3194.method2362(34168, (byte) 65, 768, 1);
            super.field3194.method2379(770, (byte) -122, 5890, 0);
        } else {
            super.field3194.method2383(8448, 78, 8448);
            super.field3194.method2362(5890, (byte) 65, 768, 0);
            super.field3194.method2379(770, (byte) -112, 5890, 0);
        }
        super.field3194.method2398(0, (byte) 1);
        this.field29.method1475(17);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
    public final void method17(boolean arg0, int arg1) {
        super.field3194.method2383(8448, 115, 7681);
        if (arg1 != -27632) {
            method15(40, -39, -40, 84);
        }
        ++field30;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
    public static final int method18(int arg0, int arg1) {
        return class393.field5478 != null ? class393.field5478[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method19(int arg0) {
        ++field32;
        if (!this.field38) {
            super.field3194.method2379(770, (byte) -119, 5890, 0);
        } else {
            if (!this.field41) {
                super.field3194.method2398(2, (byte) 104);
                super.field3194.method2412((byte) 4, (class188) null);
            }
            super.field3194.method2398(1, (byte) 110);
            super.field3194.method2412((byte) 4, (class188) null);
            super.field3194.method2398(0, (byte) 122);
            this.field29.method1473(-2, '\u0001');
            this.field38 = false;
        }
        if (arg0 == 262144) {
            super.field3194.method2383(8448, 60, 8448);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZZ)V")
    public final void method20(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field25;
            if (this.field29 != null && arg1) {
                if (!this.field41) {
                    super.field3194.method2398(2, (byte) 119);
                    super.field3194.method2412((byte) 4, super.field3194.field5928);
                    super.field3194.method2398(0, (byte) 112);
                }
                this.field29.method1473(-2, '\u0000');
                this.field38 = true;
            } else {
                super.field3194.method2379(770, (byte) -75, 34168, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)V")
    public static void method21(byte arg0) {
        field26 = null;
        if (arg0 > 99) {
            field34 = null;
            field42 = null;
            field39 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILao;)V")
    public final void method22(int arg0, int arg1, class188 arg2) {
        if (arg0 >= -45) {
            this.field41 = false;
        }
        ++field37;
        super.field3194.method2412((byte) 4, arg2);
        super.field3194.method2365(true, arg1);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILqa;IIBI)V")
    public static final void method23(int arg0, class162 arg1, int arg2, int arg3, byte arg4, int arg5) {
        arg1.method462(arg5, arg3, arg2 + arg5, arg0 + arg3);
        ++field40;
        arg1.method1006(arg5, -16777216, arg3, arg0, 1, arg2);
        if (~class374.field5277 <= -101) {
            if (arg4 >= 48) {
                float var6 = (float) class481.field7056 / (float) class481.field7051;
                int var7 = arg2;
                int var8 = arg0;
                if (var6 < 1.0F) {
                    var8 = (int) ((float) arg2 * var6);
                } else {
                    var7 = (int) ((float) arg0 / var6);
                }
                int var9 = (-var7 + arg2) / 2 + arg5;
                int var10 = (-var8 + arg0) / 2 + arg3;
                if (class356.field4873 == null || ~class356.field4873.method125() != ~arg2 || arg0 != class356.field4873.method129()) {
                    class481.method2845(class481.field7046, class481.field7066 + class481.field7056, class481.field7046 - -class481.field7051, class481.field7066, var9, var10, var7 + var9, var8 + var10);
                    class481.method2842(arg1);
                    class356.field4873 = arg1.method454(var9, var10, var7, var8, false);
                }
                class356.field4873.method3111(var9, var10);
                int var11 = class61.field812 * var7 / class481.field7051;
                int var12 = class59.field796 * var8 / class481.field7056;
                int var13 = var9 - -(class287.field3844 * var7 / class481.field7051);
                int var14 = -(class167.field2369 * var8 / class481.field7056) + var10 + -var12 + var8;
                int var15 = -1996554240;
                if (class341.field4700 == class288.field3885) {
                    var15 = -1996488705;
                }
                arg1.method459(var13, var14, var11, var12, var15, 1);
                arg1.method431(var13, var14, var11, var12, var15, 0);
                if (class319.field4418 > 0) {
                    int var16;
                    if (class52.field706 <= 50) {
                        var16 = class52.field706 * 5;
                    } else {
                        var16 = 500 - class52.field706 * 5;
                    }
                    for (class92 var17 = (class92) class481.field7037.method3072((byte) 95); var17 != null; var17 = (class92) class481.field7037.method3066(2)) {
                        class191 var18 = class481.field7031.method850((byte) 78, var17.field1236);
                        if (class300.method1712(4096, var18)) {
                            if (~class279.field3768 == ~var17.field1236) {
                                int var19 = var17.field1241 * var7 / class481.field7051 + var9;
                                int var20 = var10 - -((-var17.field1237 + class481.field7056) * var8 / class481.field7056);
                                arg1.method1006(var19 - 2, 16776960 | var16 << 24, var20 + -2, 4, 1, 4);
                            } else if (class210.field2971 != -1 && ~class210.field2971 == ~var18.field2682) {
                                int var21 = var9 - -(var17.field1241 * var7 / class481.field7051);
                                int var22 = (-var17.field1237 + class481.field7056) * var8 / class481.field7056 + var10;
                                arg1.method1006(var21 - 2, 16776960 | var16 << 24, var22 - 2, 4, 1, 4);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lht;)V")
    public class3(class410 arg0) {
        super(arg0);
        if (arg0.field5933) {
            this.field41 = ~arg0.field5885 > -4;
            int var2 = !this.field41 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (var14 != 2) {
                                    if (var14 != 3) {
                                        if (var14 != 4) {
                                            var15 = -var11;
                                        } else {
                                            var15 = var11;
                                        }
                                    } else {
                                        var15 = -var13;
                                    }
                                } else {
                                    var15 = var13;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field33 = new class7[3];
            this.field33[0] = new class7(super.field3194, 6406, 64, false, var4, 6406);
            this.field33[1] = new class7(super.field3194, 6406, 64, false, var5, 6406);
            this.field33[2] = new class7(super.field3194, 6406, 64, false, var3, 6406);
            this.method16(false);
        }
    }
}
