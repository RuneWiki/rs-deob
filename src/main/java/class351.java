import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class351 extends class366 {

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Z")
    private boolean field5324 = false;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "Z")
    private boolean field5328;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "[Lnm;")
    private class329[] field5326;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "Lvp;")
    public static class123 field5321 = new class123(46, 2);

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "[I")
    public static int[] field5332 = new int[4096];

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lcv;")
    public static class398 field5333;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "Loh;")
    public static class278 field5334;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "Lcn;")
    private class356 field5323;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
    private final void method2278(byte arg0) {
        this.field5323 = new class356(super.field5494, 2);
        ++field5330;
        this.field5323.method2295(0, (byte) 125);
        super.field5494.method2030(1, (byte) -121);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        if (arg0 != 51) {
            method2281(true);
        }
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field5328) {
            super.field5494.method2070(arg0 + 26, 8448, 7681);
            super.field5494.method2053(arg0 ^ -89, 0, 34168, 768);
            super.field5494.method2030(2, (byte) -128);
            super.field5494.method2070(119, 7681, 260);
            super.field5494.method2053(-119, 0, 34168, 768);
            super.field5494.method2053(arg0 + 73, 1, 34168, 770);
            super.field5494.method2034(0, 34167, 770, arg0 + 8909);
        } else {
            super.field5494.method2070(78, 7681, 260);
            super.field5494.method2053(-122, 0, 5890, 770);
            super.field5494.method2034(0, 34167, 770, arg0 + 8909);
        }
        super.field5494.method2030(0, (byte) -128);
        this.field5323.method2296(125);
        this.field5323.method2295(1, (byte) 127);
        super.field5494.method2030(1, (byte) -123);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field5328) {
            super.field5494.method2070(104, 8448, 8448);
            super.field5494.method2053(89, 0, 5890, 768);
            super.field5494.method2030(2, (byte) -126);
            super.field5494.method2070(111, 8448, 8448);
            super.field5494.method2053(44, 0, 5890, 768);
            super.field5494.method2053(50, 1, 34168, 768);
            super.field5494.method2034(0, 5890, 770, arg0 ^ 9011);
        } else {
            super.field5494.method2070(arg0 ^ 102, 8448, 8448);
            super.field5494.method2053(arg0 ^ -67, 0, 5890, 768);
            super.field5494.method2034(0, 5890, 770, 8960);
        }
        super.field5494.method2030(0, (byte) 59);
        this.field5323.method2296(arg0 ^ 79);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
    public static final void method2279(boolean arg0) {
        class407.field5984.method2221(5, 4);
        ++field5329;
        class224.field3259.method266(5, 128);
        class413.field6075.method1856((byte) -96, 5);
        class246.field3567.method611(5, (byte) 99);
        class500.field7358.method1610(50, 5);
        class8.field111.method3083(5, true);
        class311.field4455.method1239((byte) -82, 5);
        class450.field6582.method1474(0, 5);
        class369.field5528.method720(5, (byte) -87);
        class85.field1409.method726(5, (byte) -101);
        class4.field64.method1197(5, -3685);
        class495.field7209.method1832((byte) 73, 5);
        class173.field2651.method1761(5, 12233);
        class219.field3164.method2571(5, 64);
        class275.field3992.method1664((byte) 89, 5);
        class233.field3389.method1204(5, -32613);
        class25.field443.method301(5, (byte) 44);
        class17.field267.method1278(-2624, 5);
        class230.field3355.method2764(120, 5);
        if (arg0) {
            field5333 = null;
        }
        class418.field6177.method3033((byte) 6, 5);
        class491.method2938(5, (byte) -37);
        class424.method2591((byte) -126, 50);
        class44.method331(5, 127);
        class491.method2940(5, (byte) -105);
        class439.field6400.method2348(5, -126);
        class91.field1511.method2348(5, 84);
        class326.field5032.method2348(5, -2);
        class148.field2208.method2348(5, -30);
        class150.field2298.method2348(5, 18);
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)La;")
    public static final class434 method2280(int arg0) {
        if (arg0 != 0) {
            field5334 = null;
        }
        ++field5331;
        class434 var1 = (class434) class178.field2695.method820(true);
        if (var1 != null) {
            var1.method2663(arg0 + -108);
            var1.method855(51);
            return var1;
        } else {
            class434 var2;
            do {
                var2 = (class434) class470.field6917.method820(true);
                if (var2 == null) {
                    return null;
                }
                if (var2.method2631((byte) 113) > class464.method2773((byte) 103)) {
                    return null;
                }
                var2.method2663(-128);
                var2.method855(51);
            } while (~(var2.field1844 & Long.MIN_VALUE) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lqg;)V")
    public class351(class321 arg0) {
        super(arg0);
        if (arg0.field4896) {
            this.field5328 = ~arg0.field4844 > -4;
            int var2 = this.field5328 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 != 1) {
                                if (~var14 != -3) {
                                    if (var14 != 3) {
                                        if (~var14 != -5) {
                                            var15 = -var11;
                                        } else {
                                            var15 = var11;
                                        }
                                    } else {
                                        var15 = -var12;
                                    }
                                } else {
                                    var15 = var12;
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
            this.field5326 = new class329[3];
            this.field5326[0] = new class329(super.field5494, 6406, 64, false, var4, 6406);
            this.field5326[1] = new class329(super.field5494, 6406, 64, false, var5, 6406);
            this.field5326[2] = new class329(super.field5494, 6406, 64, false, var3, 6406);
            this.method2278((byte) 51);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
    public final void method5(boolean arg0, int arg1) {
        ++field5318;
        if (this.field5323 != null && arg0) {
            if (!this.field5328) {
                super.field5494.method2030(2, (byte) -125);
                super.field5494.method2042(super.field5494.field4826, 0);
                super.field5494.method2030(0, (byte) 53);
            }
            this.field5323.method2298('\u0000', 0);
            this.field5324 = true;
        } else {
            super.field5494.method2034(0, 34168, 770, 8960);
        }
        int var3 = -124 % ((arg1 - 10) / 48);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)V")
    public final void method8(int arg0, int arg1, byte arg2) {
        if (this.field5324) {
            super.field5494.method2030(1, (byte) 58);
            super.field5494.method2042(this.field5326[arg1 + -1], 0);
            super.field5494.method2030(0, (byte) 96);
        }
        if (arg2 <= 18) {
            method2280(49);
        }
        ++field5325;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)V")
    public static void method2281(boolean arg0) {
        if (!arg0) {
            method2281(false);
        }
        field5321 = null;
        field5332 = null;
        field5333 = null;
        field5334 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZZ)V")
    public final void method7(boolean arg0, boolean arg1) {
        ++field5319;
        super.field5494.method2070(95, 7681, 8448);
        if (!arg0) {
            field5332 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
    public final void method1(int arg0) {
        if (arg0 < 2) {
            this.method5(true, -68);
        }
        if (!this.field5324) {
            super.field5494.method2034(0, 5890, 770, 8960);
        } else {
            if (!this.field5328) {
                super.field5494.method2030(2, (byte) 86);
                super.field5494.method2042((class440) null, 0);
            }
            super.field5494.method2030(1, (byte) -121);
            super.field5494.method2042((class440) null, 0);
            super.field5494.method2030(0, (byte) 9);
            this.field5323.method2298('\u0001', 0);
            this.field5324 = false;
        }
        ++field5327;
        super.field5494.method2070(102, 8448, 8448);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILgo;B)V")
    public final void method6(int arg0, class440 arg1, byte arg2) {
        int var4 = -124 % ((31 - arg2) / 59);
        super.field5494.method2042(arg1, 0);
        ++field5322;
        super.field5494.method2068(arg0, 13134);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Z")
    public final boolean method9(int arg0) {
        ++field5320;
        if (arg0 <= 21) {
            method2279(true);
        }
        return true;
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field5332[var0] = class281.method1775(var0, false);
        }
        field5333 = new class398(16);
    }
}
