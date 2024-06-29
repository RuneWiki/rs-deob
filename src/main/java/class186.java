import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class186 extends class363 {

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
    private boolean field2760 = false;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Z")
    private boolean field2763;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[Lrc;")
    private class374[] field2761;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
    public static boolean field2765 = false;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[Ltu;")
    public static class230[] field2762 = new class230[6];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Lum;")
    public static class362 field2767;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lbw;")
    private class483 field2774;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)Z", line = 4)
    public static final boolean method1278(int arg0, int arg1, int arg2) {
        if (arg2 != -11872) {
            field2762 = null;
        }
        ++field2771;
        return (65536 & arg1) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljk;IB)V", line = 16)
    public final void method121(class446 arg0, int arg1, byte arg2) {
        ++field2773;
        super.field5564.method2200(arg0, (byte) 115);
        super.field5564.method2186(arg1, 55);
        if (arg2 > -69) {
            method1282(84);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V", line = 28)
    public final void method128(int arg0, int arg1, int arg2) {
        ++field2759;
        if (arg1 <= -13) {
            if (this.field2760) {
                super.field5564.method2176(1, 111);
                super.field5564.method2200(this.field2761[arg2 + -1], (byte) 119);
                super.field5564.method2176(0, 79);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lod;)V", line = 47)
    public class186(class349 arg0) {
        super(arg0);
        if (arg0.field5348) {
            this.field2763 = arg0.field5292 < 3;
            int var2 = !this.field2763 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 != 1) {
                                if (~var14 != -3) {
                                    if (var14 == 3) {
                                        var15 = -var13;
                                    } else if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
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
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
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
            this.field2761 = new class374[3];
            this.field2761[0] = new class374(super.field5564, 6406, 64, false, var4, 6406);
            this.field2761[1] = new class374(super.field5564, 6406, 64, false, var5, 6406);
            this.field2761[2] = new class374(super.field5564, 6406, 64, false, var3, 6406);
            this.method1283((byte) 5);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(III)Z", line = 159)
    public static final boolean method1279(int arg0, int arg1, int arg2) {
        int var3 = class4.field58[arg0][arg1][arg2];
        if (-class337.field4744 == var3) {
            return false;
        } else if (class337.field4744 == var3) {
            return true;
        } else {
            int var4 = arg1 << class192.field2815;
            int var5 = arg2 << class192.field2815;
            if (class382.method2333(var4 + 1, class86.field1324[arg0].method201(arg1, arg2), var5 + 1) && class382.method2333(class352.field5398 + var4 - 1, class86.field1324[arg0].method201(arg1 + 1, arg2), var5 + 1) && class382.method2333(class352.field5398 + var4 - 1, class86.field1324[arg0].method201(arg1 + 1, arg2 + 1), class352.field5398 + var5 - 1) && class382.method2333(var4 + 1, class86.field1324[arg0].method201(arg1, arg2 + 1), class352.field5398 + var5 - 1) && class382.method2333(class143.field2134 + var4, class86.field1324[arg0].method201(arg1, arg2), var5 + 1) && class382.method2333(class352.field5398 + var4 - 1, class86.field1324[arg0].method201(arg1 + 1, arg2), class143.field2134 + var5) && class382.method2333(class143.field2134 + var4, class86.field1324[arg0].method201(arg1, arg2 + 1), class352.field5398 + var5 - 1) && class382.method2333(class352.field5398 + var4 - 1, class86.field1324[arg0].method201(arg1, arg2), class143.field2134 + var5) && class382.method2333(class143.field2134 + var4, class86.field1324[arg0].method201(arg1, arg2), class143.field2134 + var5)) {
                class4.field58[arg0][arg1][arg2] = class337.field4744;
                return true;
            } else {
                class4.field58[arg0][arg1][arg2] = -class337.field4744;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V", line = 185)
    public final void method125(boolean arg0, int arg1) {
        if (arg1 <= -69) {
            if (this.field2774 != null && arg0) {
                if (!this.field2763) {
                    super.field5564.method2176(2, 126);
                    super.field5564.method2200(super.field5564.field5296, (byte) 112);
                    super.field5564.method2176(0, 74);
                }
                this.field2774.method2863(false, '\u0000');
                this.field2760 = true;
            } else {
                super.field5564.method2135(0, 34168, -112, 770);
            }
            ++field2769;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I", line = 211)
    public static final int method1280(int arg0) {
        ++field2770;
        class162 var1 = class348.field5015;
        if (arg0 != -27640) {
            method1279(-126, 17, 54);
        }
        boolean var2 = false;
        if (~class170.field2529 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class162.method1090(var3, 0, (class126) null, (class432) null, 0, false);
        }
        long var4 = class256.method1708((byte) 118);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method1101(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class256.method1708((byte) 118));
        var1.method1087(0, 0, arg0 ^ -27529, 100, -16777216, 100);
        if (var2) {
            var1.method1108(-7682);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(III)B", line = 253)
    public static final byte method1281(int arg0, int arg1, int arg2) {
        ++field2766;
        if (arg1 > -64) {
            field2762 = null;
        }
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) (~(1 & arg0) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZB)V", line = 277)
    public final void method122(boolean arg0, byte arg1) {
        if (arg1 != 52) {
            this.method1283((byte) 110);
        }
        super.field5564.method2131(arg1 + 34110, 7681, 8448);
        ++field2772;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 295)
    public final void method120(boolean arg0) {
        if (arg0) {
            method1281(3, -69, -28);
        }
        if (!this.field2760) {
            super.field5564.method2135(0, 5890, -68, 770);
        } else {
            if (!this.field2763) {
                super.field5564.method2176(2, 85);
                super.field5564.method2200((class446) null, (byte) 126);
            }
            super.field5564.method2176(1, 40);
            super.field5564.method2200((class446) null, (byte) 112);
            super.field5564.method2176(0, 31);
            this.field2774.method2863(false, '\u0001');
            this.field2760 = false;
        }
        ++field2768;
        super.field5564.method2131(34162, 8448, 8448);
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V", line = 324)
    public static void method1282(int arg0) {
        field2762 = null;
        if (arg0 != 770) {
            field2767 = null;
        }
        field2767 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Z", line = 336)
    public final boolean method126(int arg0) {
        int var2 = 75 % ((37 - arg0) / 48);
        ++field2764;
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 353)
    private final void method1283(byte arg0) {
        ++field2758;
        this.field2774 = new class483(super.field5564, 2);
        this.field2774.method2869(0, -125);
        super.field5564.method2176(1, 89);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        if (arg0 != 5) {
            this.field2774 = null;
        }
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field2763) {
            super.field5564.method2131(34162, 7681, 260);
            super.field5564.method2156(5890, 770, 2969, 0);
            super.field5564.method2135(0, 34167, -76, 770);
        } else {
            super.field5564.method2131(34162, 8448, 7681);
            super.field5564.method2156(34168, 768, 2969, 0);
            super.field5564.method2176(2, 107);
            super.field5564.method2131(34162, 7681, 260);
            super.field5564.method2156(34168, 768, arg0 + 2964, 0);
            super.field5564.method2156(34168, 770, 2969, 1);
            super.field5564.method2135(0, 34167, -91, 770);
        }
        super.field5564.method2176(0, arg0 + 71);
        this.field2774.method2870(1952872654);
        this.field2774.method2869(1, 66);
        super.field5564.method2176(1, arg0 + 59);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field2763) {
            super.field5564.method2131(34162, 8448, 8448);
            super.field5564.method2156(5890, 768, 2969, 0);
            super.field5564.method2135(0, 5890, -93, 770);
        } else {
            super.field5564.method2131(34162, 8448, 8448);
            super.field5564.method2156(5890, 768, 2969, 0);
            super.field5564.method2176(2, 39);
            super.field5564.method2131(arg0 ^ 34167, 8448, 8448);
            super.field5564.method2156(5890, 768, 2969, 0);
            super.field5564.method2156(34168, 768, 2969, 1);
            super.field5564.method2135(0, 5890, -91, 770);
        }
        super.field5564.method2176(0, arg0 + 60);
        this.field2774.method2870(1952872654);
    }
}
