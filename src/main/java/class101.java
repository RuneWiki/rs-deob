import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class101 extends class141 {

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
    private boolean field1571 = false;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Z")
    private boolean field1573;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lhp;")
    private class221[] field1563;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
    public static boolean field1567 = false;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Luv;")
    private class250 field1569;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public static final void method745() {
        if (class47.field898 != null) {
            for (int var0 = 0; var0 < class47.field898.length; ++var0) {
                for (int var1 = 0; var1 < class394.field5608; ++var1) {
                    for (int var2 = 0; var2 < class337.field5000; ++var2) {
                        if (class47.field898[var0][var1][var2] != null) {
                            class47.field898[var0][var1][var2].method1289((byte) 0);
                        }
                        class47.field898[var0][var1][var2] = null;
                    }
                }
            }
        }
        class47.field898 = null;
        class393.field5594 = null;
        if (class277.field4137 != null) {
            for (int var3 = 0; var3 < class277.field4137.length; ++var3) {
                for (int var4 = 0; var4 < class394.field5608; ++var4) {
                    for (int var5 = 0; var5 < class337.field5000; ++var5) {
                        if (class277.field4137[var3][var4][var5] != null) {
                            class277.field4137[var3][var4][var5].method1289((byte) 0);
                        }
                        class277.field4137[var3][var4][var5] = null;
                    }
                }
            }
        }
        class277.field4137 = null;
        class477.field6942 = null;
        class461.field6675 = null;
        class146.field2262 = null;
        class269.field4061 = 0;
        if (class366.field5302 != null) {
            for (int var6 = 0; var6 < class269.field4061; ++var6) {
                class366.field5302[var6] = null;
            }
        }
        if (class296.field4431 != null) {
            for (int var7 = 0; var7 < class504.field7296; ++var7) {
                class296.field4431[var7] = null;
            }
            class504.field7296 = 0;
        }
        if (client.field3117 != null) {
            for (int var8 = 0; var8 < class234.field3499; ++var8) {
                client.field3117[var8] = null;
            }
            for (int var9 = 0; var9 < class251.field3740; ++var9) {
                for (int var10 = 0; var10 < class394.field5608; ++var10) {
                    for (int var11 = 0; var11 < class337.field5000; ++var11) {
                        class297.field4444[var9][var10][var11] = 0L;
                    }
                }
            }
            class234.field3499 = 0;
        }
        class121.field1894 = null;
        class66.method531(false);
        class302.field4481.method901(-1);
        class18.field198 = null;
        class303.field4495 = null;
        class539.field7922 = null;
        class386.field5506 = null;
        class98.field1538 = null;
        class141.field2179 = null;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        ++field1566;
        if (arg0 != 0) {
            this.field1563 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)I")
    public static final int method746(int arg0, int arg1) {
        ++field1564;
        int var2 = (1431655765 & arg1 >>> 1) + (arg1 & 1431655765);
        int var3 = (var2 >>> 2 & 858993459) + (var2 & arg0);
        int var4 = 252645135 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return 255 & var6;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field1570;
            super.field2178.method275(8448, 7681, 127);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        ++field1562;
        if (arg0 != 1400) {
            this.method51(90, false);
        }
        if (this.field1571) {
            super.field2178.method277(1, (byte) 88);
            super.field2178.method285(false, this.field1563[arg2 + -1]);
            super.field2178.method277(0, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (!this.field1571) {
            super.field2178.method200(5890, 0, 770, (byte) 122);
        } else {
            if (!this.field1573) {
                super.field2178.method277(2, (byte) 102);
                super.field2178.method285(false, (class120) null);
            }
            super.field2178.method277(1, (byte) 69);
            super.field2178.method285(false, (class120) null);
            super.field2178.method277(0, (byte) 95);
            this.field1569.method1625('\u0001', (byte) -36);
            this.field1571 = false;
        }
        ++field1572;
        super.field2178.method275(8448, 8448, 124);
        int var2 = 105 % ((-51 - arg0) / 45);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        ++field1565;
        if (arg2 <= 89) {
            this.method48(81);
        }
        super.field2178.method285(false, arg0);
        super.field2178.method249(arg1, -2);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    private final void method747(int arg0) {
        this.field1569 = new class250(super.field2178, 2);
        ++field1561;
        this.field1569.method1622(0, (byte) 69);
        super.field2178.method277(1, (byte) 70);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        if (arg0 == 1279540392) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field1573) {
                super.field2178.method275(260, 7681, 124);
                super.field2178.method333(false, 5890, 770, 0);
                super.field2178.method200(34167, 0, 770, (byte) 113);
            } else {
                super.field2178.method275(7681, 8448, 126);
                super.field2178.method333(false, 34168, 768, 0);
                super.field2178.method277(2, (byte) 94);
                super.field2178.method275(260, 7681, arg0 ^ 1279540432);
                super.field2178.method333(false, 34168, 768, 0);
                super.field2178.method333(false, 34168, 770, 1);
                super.field2178.method200(34167, 0, 770, (byte) 116);
            }
            super.field2178.method277(0, (byte) 96);
            this.field1569.method1624(-22853);
            this.field1569.method1622(1, (byte) 69);
            super.field2178.method277(1, (byte) 86);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field1573) {
                super.field2178.method275(8448, 8448, arg0 + -1279540266);
                super.field2178.method333(false, 5890, 768, 0);
                super.field2178.method200(5890, 0, 770, (byte) 119);
            } else {
                super.field2178.method275(8448, 8448, 121);
                super.field2178.method333(false, 5890, 768, 0);
                super.field2178.method277(2, (byte) 104);
                super.field2178.method275(8448, 8448, 123);
                super.field2178.method333(false, 5890, 768, 0);
                super.field2178.method333(false, 34168, 768, 1);
                super.field2178.method200(5890, 0, 770, (byte) 117);
            }
            super.field2178.method277(0, (byte) 74);
            this.field1569.method1624(-22853);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lbt;)V")
    public class101(class33 arg0) {
        super(arg0);
        if (arg0.field648) {
            this.field1573 = ~arg0.field707 > -4;
            int var2 = !this.field1573 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (var14 == 2) {
                                    var15 = var12;
                                } else if (~var14 != -4) {
                                    if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field1563 = new class221[3];
            this.field1563[0] = new class221(super.field2178, 6406, 64, false, var4, 6406);
            this.field1563[1] = new class221(super.field2178, 6406, 64, false, var5, 6406);
            this.field1563[2] = new class221(super.field2178, 6406, 64, false, var3, 6406);
            this.method747(1279540392);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        ++field1568;
        if (arg0 == -21897) {
            if (this.field1569 != null && arg1) {
                if (!this.field1573) {
                    super.field2178.method277(2, (byte) 56);
                    super.field2178.method285(false, super.field2178.field682);
                    super.field2178.method277(0, (byte) 106);
                }
                this.field1569.method1625('\u0000', (byte) -36);
                this.field1571 = true;
            } else {
                super.field2178.method200(34168, 0, 770, (byte) 112);
            }
        }
    }
}
