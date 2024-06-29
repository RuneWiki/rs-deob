import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class538 extends class348 {

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lwc;")
    private class273 field7870;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lmb;")
    private class291 field7880;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field7881 = 0;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lkp;")
    private class292 field7867;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIFZIIIII)[[I")
    public static final int[][] method3186(int arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7878;
        int[][] var9 = new int[arg0][arg5];
        class416 var10 = new class416();
        int var11 = 87 % ((arg6 - 74) / 49);
        var10.field6310 = arg8;
        var10.field6307 = arg3;
        var10.field6303 = (int) (arg2 * 4096.0F);
        var10.field6300 = arg7;
        var10.field6317 = arg1;
        var10.method51(-75);
        class454.method2856(true, arg5, arg0);
        for (int var12 = 0; ~arg0 < ~var12; ++var12) {
            var10.method2660((byte) 107, var12, var9[var12]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lna;Lwc;)V")
    public class538(class211 arg0, class273 arg1) {
        super(arg0);
        this.field7870 = arg1;
        this.method3187((byte) -112);
        this.field7880 = new class291(super.field5398, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7880.method1959(0, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        if (arg0 != -233) {
            this.method262(true, (byte) 17);
        }
        ++field7874;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        if (arg1 >= -30) {
            this.method3187((byte) 20);
        }
        ++field7876;
        if (super.field5398.field3563 > 0) {
            float var3 = -0.5F / (float) super.field5398.field3563;
            super.field5398.method1507(1, 0);
            class78.field1169[3] = super.field5398.field3582 * var3 + 0.25F;
            class78.field1169[0] = 0.0F;
            class78.field1169[2] = var3;
            class78.field1169[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class78.field1169, 0);
            OpenGL.glPopMatrix();
            super.field5398.method1512(8, 0.5F, (float) super.field5398.field3563);
            super.field5398.method1540(58, this.field7880);
            super.field5398.method1507(0, 0);
        }
        this.field7867.method1963(true, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        ++field7877;
        if (arg2 >= -51) {
            this.field7880 = null;
        }
        if (~(arg1 & 1) != -2) {
            if (!this.field7870.field4346) {
                super.field5398.method1540(102, this.field7870.field4344[0]);
            } else {
                super.field5398.method1540(36, this.field7870.field4349);
                class78.field1169[2] = 0.0F;
                class78.field1169[1] = 0.0F;
                class78.field1169[0] = 0.0F;
                class78.field1169[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class78.field1169, 0);
            }
        } else if (this.field7870.field4346) {
            super.field5398.method1540(62, this.field7870.field4349);
            class78.field1169[3] = (float) (super.field5398.field3484 % 4000) / 4000.0F;
            class78.field1169[0] = 0.0F;
            class78.field1169[2] = 0.0F;
            class78.field1169[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class78.field1169, 0);
        } else {
            int var4 = super.field5398.field3484 % 4000 * 16 / 4000;
            super.field5398.method1540(79, this.field7870.field4344[var4]);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    private final void method3187(byte arg0) {
        ++field7872;
        this.field7867 = new class292(super.field5398, 2);
        this.field7867.method1965(0, (byte) -49);
        super.field5398.method1507(1, 0);
        if (arg0 >= -73) {
            this.method265(32);
        }
        super.field5398.method1568(260, 2896, 7681);
        super.field5398.method1498(34192, 0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5398.method1507(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7870.field4346) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7867.method1962(-6635);
        this.field7867.method1965(1, (byte) -48);
        super.field5398.method1507(1, 0);
        super.field5398.method1568(8448, 2896, 8448);
        super.field5398.method1498(34192, 0, 5890, 768);
        OpenGL.glDisable(3168);
        super.field5398.method1507(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7870.field4346) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7867.method1962(-6635);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLtq;)V")
    public static final void method3188(int arg0, byte arg1, class276 arg2) {
        ++field7875;
        boolean var3 = ~arg2.method1852(120, 1) == -2;
        if (var3) {
            class530.field7787[class275.field4367++] = arg0;
        }
        if (arg1 <= 38) {
            field7881 = -98;
        }
        int var4 = arg2.method1852(101, 2);
        class350 var5 = class264.field4276[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field5454 = false;
            } else if (~class528.field7772 == ~arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class34 var6 = class460.field7103[arg0] = new class34();
                var6.field348 = (class453.field7018 - -var5.field894[0] >> 6 << 14) + (var5.field6419 << 28) - -(class126.field1718 - -var5.field899[0] >> 6);
                if (~var5.field5461 != 0) {
                    var6.field349 = var5.field5461;
                } else {
                    var6.field349 = var5.field887.method2986((byte) 35);
                }
                var6.field345 = var5.field5425;
                var6.field346 = var5.field829;
                if (var5.field5439 > 0) {
                    class16.method88(var5, 2);
                }
                class264.field4276[arg0] = null;
                if (arg2.method1852(93, 1) != 0) {
                    class140.method853(-345, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1852(123, 3);
            int var8 = var5.field894[0];
            int var9 = var5.field899[0];
            if (~var7 == -1) {
                --var9;
                --var8;
            } else if (~var7 == -2) {
                --var9;
            } else if (var7 == 2) {
                ++var8;
                --var9;
            } else if (var7 == 3) {
                --var8;
            } else if (var7 != 4) {
                if (var7 != 5) {
                    if (var7 != 6) {
                        if (var7 == 7) {
                            ++var9;
                            ++var8;
                        }
                    } else {
                        ++var9;
                    }
                } else {
                    --var8;
                    ++var9;
                }
            } else {
                ++var8;
            }
            if (var3) {
                var5.field5446 = var9;
                var5.field5454 = true;
                var5.field5449 = var8;
            } else {
                var5.method2308(var9, class467.field7156[arg0], (byte) -20, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1852(93, 4);
            int var11 = var5.field894[0];
            int var12 = var5.field899[0];
            if (var10 != 0) {
                if (var10 != 1) {
                    if (~var10 != -3) {
                        if (~var10 != -4) {
                            if (~var10 != -5) {
                                if (~var10 == -6) {
                                    var11 -= 2;
                                    --var12;
                                } else if (~var10 == -7) {
                                    var11 += 2;
                                    --var12;
                                } else if (~var10 == -8) {
                                    var11 -= 2;
                                } else if (~var10 != -9) {
                                    if (var10 == 9) {
                                        var11 -= 2;
                                        ++var12;
                                    } else if (~var10 == -11) {
                                        var11 += 2;
                                        ++var12;
                                    } else if (~var10 != -12) {
                                        if (~var10 != -13) {
                                            if (~var10 == -14) {
                                                var12 += 2;
                                            } else if (var10 != 14) {
                                                if (var10 == 15) {
                                                    var12 += 2;
                                                    var11 += 2;
                                                }
                                            } else {
                                                var12 += 2;
                                                ++var11;
                                            }
                                        } else {
                                            --var11;
                                            var12 += 2;
                                        }
                                    } else {
                                        var12 += 2;
                                        var11 -= 2;
                                    }
                                } else {
                                    var11 += 2;
                                }
                            } else {
                                var12 -= 2;
                                var11 += 2;
                            }
                        } else {
                            var12 -= 2;
                            ++var11;
                        }
                    } else {
                        var12 -= 2;
                    }
                } else {
                    var12 -= 2;
                    --var11;
                }
            } else {
                var11 -= 2;
                var12 -= 2;
            }
            if (var3) {
                var5.field5449 = var11;
                var5.field5454 = true;
                var5.field5446 = var12;
            } else {
                var5.method2308(var12, class467.field7156[arg0], (byte) -20, var11);
            }
        } else {
            int var13 = arg2.method1852(116, 1);
            if (var13 == 0) {
                int var14 = arg2.method1852(116, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 1005) >> 5;
                if (~var16 < -16) {
                    var16 -= 32;
                }
                int var17 = 31 & var14;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field894[0] - -var16;
                int var19 = var5.field899[0] + var17;
                if (var3) {
                    var5.field5454 = true;
                    var5.field5449 = var18;
                    var5.field5446 = var19;
                } else {
                    var5.method2308(var19, class467.field7156[arg0], (byte) -20, var18);
                }
                var5.field6419 = (byte) (3 & var5.field6419 + var15);
                if (class528.field7772 == arg0) {
                    class201.field3057 = var5.field6419;
                }
            } else {
                int var20 = arg2.method1852(125, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 268434852) >> 14;
                int var23 = var20 & 16383;
                int var24 = (var5.field894[0] + var22 - -class453.field7018 & 16383) + -class453.field7018;
                int var25 = (class126.field1718 + var23 + var5.field899[0] & 16383) + -class126.field1718;
                if (var3) {
                    var5.field5449 = var24;
                    var5.field5446 = var25;
                    var5.field5454 = true;
                } else {
                    var5.method2308(var25, class467.field7156[arg0], (byte) -20, var24);
                }
                var5.field6419 = (byte) (3 & var5.field6419 + var21);
                if (~class528.field7772 == ~arg0) {
                    class201.field3057 = var5.field6419;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        this.field7867.method1963(true, '\u0001');
        ++field7869;
        if (~super.field5398.field3563 < -1) {
            super.field5398.method1507(1, 0);
            super.field5398.method1540(101, (class427) null);
            super.field5398.method1512(8, 1.0F, 0.0F);
            super.field5398.method1507(0, 0);
        }
        super.field5398.method1568(8448, 2896, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        int var2 = -46 / ((61 - arg0) / 63);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        int var4 = 122 % ((-49 - arg1) / 44);
        ++field7871;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        ++field7868;
        super.field5398.method1568(8448, 2896, 260);
        int var3 = 25 / ((-23 - arg1) / 41);
    }
}
