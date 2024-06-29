import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class620 extends class27 {

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "Lud;")
    private class33 field8625;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Lcp;")
    private class675 field8624;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field8617 = 0;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "J")
    public static long field8619 = 0L;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "[I")
    public static int[] field8614 = new int[32];

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    public static int field8630 = 0;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "Lem;")
    public static class206 field8631 = new class206(106, 8);

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "Lqm;")
    private class129 field8618;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILvf;)V", line = 3)
    public final void method257(int arg0, int arg1, class136 arg2) {
        if (arg1 != -10479) {
            this.method258((byte) -63, true);
        }
        ++field8627;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V", line = 17)
    public final void method261(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            field8617 = 99;
        }
        ++field8628;
        if (~(arg0 & 1) != -2) {
            if (!this.field8625.field412) {
                super.field337.method3206(this.field8625.field410[0], (byte) 26);
            } else {
                super.field337.method3206(this.field8625.field411, (byte) 26);
                class389.field5492[0] = 0.0F;
                class389.field5492[1] = 0.0F;
                class389.field5492[2] = 0.0F;
                class389.field5492[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class389.field5492, 0);
            }
        } else if (!this.field8625.field412) {
            int var4 = super.field337.field7834 % 4000 * 16 / 4000;
            super.field337.method3206(this.field8625.field410[var4], (byte) 26);
        } else {
            super.field337.method3206(this.field8625.field411, (byte) 26);
            class389.field5492[0] = 0.0F;
            class389.field5492[3] = (float) (super.field337.field7834 % 4000) / 4000.0F;
            class389.field5492[1] = 0.0F;
            class389.field5492[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class389.field5492, 0);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)Z", line = 62)
    public final boolean method260(boolean arg0) {
        if (arg0) {
            method3446((class677) null, (byte) 32, false);
        }
        ++field8621;
        return true;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lhb;BZ)V", line = 79)
    public static final void method3446(class677 arg0, byte arg1, boolean arg2) {
        ++field8615;
        if (class137.field1948 < 400) {
            if (class143.field2063 == arg0) {
                if (class426.field5971 && (16 & class89.field1283) != 0) {
                    ++class247.field3380;
                    class547.method3077(12, 0, class178.field2551, class547.field7417, false, true, class185.field2679 + " -> <col=ffffff>" + class65.field825.method555(class697.field9900, true), 0L, -71, 0, -1);
                }
            } else {
                String var9;
                if (arg0.field9667 == 0) {
                    boolean var3 = true;
                    if (~class143.field2063.field9669 != 0 && arg0.field9669 != -1) {
                        int var4 = class143.field2063.field9663 <= arg0.field9663 ? arg0.field9663 : class143.field2063.field9663;
                        int var5 = arg0.field9669 <= class143.field2063.field9669 ? arg0.field9669 : class143.field2063.field9669;
                        int var6 = 5 - (-(var4 * 10 / 100) + -var5);
                        int var7 = -arg0.field9663 + class143.field2063.field9663;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        if (var6 < var7) {
                            var3 = false;
                        }
                    }
                    String var8 = class704.field9959 == class219.field3065 ? class65.field818.method555(class697.field9900, true) : class65.field816.method555(class697.field9900, true);
                    if (arg0.field9661 > arg0.field9663) {
                        var9 = arg0.method3846(true, (byte) -104) + (!var3 ? "<col=ffffff>" : class151.method1093((byte) 107, arg0.field9663, class143.field2063.field9663)) + " (" + var8 + arg0.field9663 + "+" + (-arg0.field9663 + arg0.field9661) + ")";
                    } else {
                        var9 = arg0.method3846(true, (byte) -46) + (!var3 ? "<col=ffffff>" : class151.method1093((byte) 113, arg0.field9663, class143.field2063.field9663)) + " (" + var8 + arg0.field9663 + ")";
                    }
                } else if (~arg0.field9667 == 0) {
                    var9 = arg0.method3846(true, (byte) -66);
                } else {
                    var9 = arg0.method3846(true, (byte) -67) + " (" + class65.field817.method555(class697.field9900, true) + arg0.field9667 + ")";
                }
                if (class426.field5971 && !arg2 && (8 & class89.field1283) != 0) {
                    ++class631.field8756;
                    class547.method3077(21, 0, class178.field2551, class547.field7417, false, true, class185.field2679 + " -> <col=ffffff>" + var9, (long) arg0.field1697, -128, 0, -1);
                }
                if (arg2) {
                    class547.method3077(-1, 0, "<col=cccccc>" + var9, -1, true, false, "", 0L, -58, 0, 0);
                } else {
                    for (int var10 = 7; ~var10 <= -1; --var10) {
                        if (class193.field2733[var10] != null) {
                            short var13 = 0;
                            if (class454.field6305 == class219.field3065 && class193.field2733[var10].equalsIgnoreCase(class65.field811.method555(class697.field9900, true))) {
                                if (class143.field2063.field9663 < arg0.field9663) {
                                    var13 = 2000;
                                }
                                if (~class143.field2063.field9709 != -1 && arg0.field9709 != 0) {
                                    if (~class143.field2063.field9709 == ~arg0.field9709) {
                                        var13 = 2000;
                                    } else {
                                        var13 = 0;
                                    }
                                }
                            } else if (class426.field5967[var10]) {
                                var13 = 2000;
                            }
                            short var14 = (short) (class167.field2437[var10] + var13);
                            int var15 = class418.field5904[var10] == -1 ? class76.field1005 : class418.field5904[var10];
                            class547.method3077(var14, 0, class193.field2733[var10], var15, false, true, "<col=ffffff>" + var9, (long) arg0.field1697, -91, 0, -1);
                            ++class366.field4866;
                        }
                    }
                }
                if (!arg2) {
                    for (class499 var11 = (class499) class588.field8265.method1436(28964); var11 != null; var11 = (class499) class588.field8265.method1443((byte) 6)) {
                        if (~var11.field6780 == -24) {
                            var11.field6786 = "<col=ffffff>" + var9;
                            break;
                        }
                    }
                }
                int var12 = 78 % ((-6 - arg1) / 33);
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Llj;Lud;)V", line = 235)
    public class620(class565 arg0, class33 arg1) {
        super(arg0);
        this.field8625 = arg1;
        this.method3448(false);
        this.field8624 = new class675(super.field337, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field8624.method3827(3317, false);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V", line = 252)
    public final void method256(byte arg0) {
        this.field8618.method918(1, '\u0001');
        ++field8622;
        if (super.field337.field7904 > 0) {
            super.field337.method3220(0, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3182(1.0F, 0.0F, arg0 ^ -1629144918);
            super.field337.method3220(0, 0);
        }
        super.field337.method3210(8448, 33, 8448);
        if (arg0 == 50) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BZ)V", line = 279)
    public final void method258(byte arg0, boolean arg1) {
        ++field8623;
        if (~super.field337.field7904 < -1) {
            float var3 = -0.5F / (float) super.field337.field7904;
            super.field337.method3220(0, 1);
            class389.field5492[2] = var3;
            class389.field5492[1] = 0.0F;
            class389.field5492[3] = super.field337.field7976 * var3 + 0.25F;
            class389.field5492[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class389.field5492, 0);
            OpenGL.glPopMatrix();
            super.field337.method3182(0.5F, (float) super.field337.field7904, -1629144936);
            super.field337.method3206(this.field8624, (byte) 26);
            super.field337.method3220(0, 0);
        }
        this.field8618.method918(1, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg0 >= -80) {
            field8630 = 88;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V", line = 315)
    public static final void method3447(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 == -1005) {
            class97.method701(class98.field1375, arg2, arg1);
        } else if (~arg0 != -1010) {
            if (arg0 == 1001) {
                class97.method701(class466.field6408, arg2, arg1);
            } else if (~arg0 != -1009) {
                if (arg0 == 1002) {
                    class97.method701(class273.field3737, arg2, arg1);
                }
            } else {
                class97.method701(class48.field579, arg2, arg1);
            }
        } else {
            class97.method701(class384.field5435, arg2, arg1);
        }
        if (arg3 == -1009) {
            ++field8620;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)V", line = 344)
    private final void method3448(boolean arg0) {
        ++field8616;
        this.field8618 = new class129(super.field337, 2);
        if (arg0) {
            field8617 = 19;
        }
        this.field8618.method919(0, 4864);
        super.field337.method3220(0, 1);
        super.field337.method3210(7681, -95, 260);
        super.field337.method3164(34168, 0, (byte) 109, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field337.method3220(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field8625.field412) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field8618.method915((byte) 95);
        this.field8618.method919(1, 4864);
        super.field337.method3220(0, 1);
        super.field337.method3210(8448, -98, 8448);
        super.field337.method3164(5890, 0, (byte) 123, 768);
        OpenGL.glDisable(3168);
        super.field337.method3220(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field8625.field412) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field8618.method915((byte) 95);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V", line = 390)
    public static void method3449(int arg0) {
        if (arg0 == -15074) {
            field8631 = null;
            field8614 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)V", line = 407)
    public final void method263(boolean arg0, int arg1) {
        ++field8629;
        if (arg1 != 8) {
            this.method261(-27, -111, 112);
        }
        super.field337.method3210(260, -103, 8448);
    }
}
