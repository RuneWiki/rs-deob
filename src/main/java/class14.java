import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 implements class63 {

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    private int field116 = -1;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    private int field140 = 0;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "[Ljca;")
    private class641[] field142 = new class641[9];

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Ljaa;")
    private class576 field119;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "Lsv;")
    public static class617 field135 = new class617();

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "Lca;")
    public static class285 field136 = new class285();

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "[I")
    public static int[] field139;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
    public final void method63(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field132++;
        if (arg0 > -83) {
            this.method81(-126, (byte) 30);
        }
        this.field140 &= 0xFFFFFFFE;
        this.field116 = this.method78((byte) -29);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILhc;)V")
    public final void method64(int arg0, int arg1, class130 arg2) {
        field117++;
        if (this.field116 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg1 << arg0;
        if ((~var4 & this.field131) == 0) {
            this.field123 = arg2.field1574;
            this.field121 = arg2.field1580;
        } else if (this.field123 != arg2.field1574 || this.field121 != arg2.field1580) {
            throw new RuntimeException();
        }
        arg2.method843(-1, class618.field8387[arg0], this.field116);
        this.field142[arg0] = arg2;
        this.field131 |= var4;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZII)V")
    public static final void method65(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method75(75, 17, -70);
        }
        field118++;
        class243 var3 = class546.method2926(arg2, 13, !arg0);
        var3.method1457(76);
        var3.field3132 = arg1;
    }

    @OriginalMember(owner = "client!ds", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field119.method3149(-101, this.field129);
        field124++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public final void method66(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field125++;
        this.field140 &= 0xFFFFFFFD;
        if (arg0 >= 39) {
            this.field116 = this.method78((byte) -29);
        }
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)Z")
    public final boolean method67(int arg0) {
        field120++;
        int var2 = -124 % ((29 - arg0) / 44);
        int var3 = OpenGL.glCheckFramebufferStatusEXT(this.field116);
        return var3 == 36053;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public final void method68(byte arg0) {
        if (arg0 >= -113) {
            this.field121 = -124;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field129);
        field128++;
        this.field140 |= 0x1;
        this.field116 = this.method78((byte) -29);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        if (arg0 > -77) {
            method70(118);
        }
        field141++;
        if (this.field116 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class618.field8387[arg1]);
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
    public static final void method70(int arg0) {
        field134++;
        class265.method1578();
        if (arg0 > -67) {
            field139 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public final void method71(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field133++;
        this.field140 &= 0xFFFFFFFB;
        this.field116 = this.method78((byte) -29);
        if (arg0 != -18741) {
            method75(86, 44, -6);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILco;)V")
    public final void method72(int arg0, int arg1, class109 arg2) {
        field143++;
        this.method77(0, arg2, arg1, 0);
        if (arg0 != -27902) {
            this.method80(-43);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZLgda;)V")
    public final void method73(int arg0, int arg1, boolean arg2, class51 arg3) {
        if (!arg2) {
            this.method83(arg1, arg3, 119, arg0, 0);
            field126++;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)V")
    public final void method74(int arg0, int arg1) {
        field138++;
        if (this.field116 == -1) {
            throw new RuntimeException();
        } else if (arg1 == 4) {
            OpenGL.glReadBuffer(class618.field8387[arg0]);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
    public static final int method75(int arg0, int arg1, int arg2) {
        field144++;
        int var3 = class536.method2887(arg2 - 1, 86, arg1 - 1) + class536.method2887(arg2 - 1, 43, arg1 + 1) + class536.method2887(arg2 + 1, arg0 ^ 0xFFFFDFBB, arg1 + -1) + class536.method2887(arg2 + 1, arg0 ^ 0xFFFFDF8B, arg1 - -1);
        int var4 = class536.method2887(arg2, 76, arg1 - 1) + class536.method2887(arg2, arg0 + 8285, arg1 + 1) + (class536.method2887(arg2 + -1, 97, arg1) - -class536.method2887(arg2 + 1, 105, arg1));
        int var5 = class536.method2887(arg2, 112, arg1);
        return arg0 == -8216 ? var4 / 8 + var3 / 16 + var5 / 4 : 95;
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)V")
    public static void method76(int arg0) {
        if (arg0 <= -64) {
            field135 = null;
            field139 = null;
            field136 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILco;II)V")
    private final void method77(int arg0, class109 arg1, int arg2, int arg3) {
        field137++;
        if (~this.field116 == arg3) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field131 & ~var5) == 0) {
            this.field121 = arg1.field1361;
            this.field123 = arg1.field1360;
        } else if (this.field123 != arg1.field1360 || this.field121 != arg1.field1361) {
            throw new RuntimeException();
        }
        arg1.method761(class618.field8387[arg2], (byte) -120, arg0, this.field116);
        this.field142[arg2] = arg1;
        this.field131 |= var5;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)I")
    private final int method78(byte arg0) {
        field115++;
        if ((this.field140 & 0x4) != 0) {
            return 36160;
        } else if ((this.field140 & 0x2) != 0) {
            return 36009;
        } else if (arg0 == -29) {
            return (this.field140 & 0x1) == 0 ? -1 : 36008;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Loa;)V")
    public static final void method79(class650 arg0) {
        for (int var1 = class631.field8559; var1 < class709.field9904; var1++) {
            for (int var2 = 0; var2 < class546.field6871; var2++) {
                for (int var3 = 0; var3 < class36.field538; var3++) {
                    class565 var4 = class407.field5237[var1][var2][var3];
                    if (var4 != null) {
                        class567 var5 = var4.field7079;
                        class567 var6 = var4.field7087;
                        if (var5 != null && var5.method137(-47)) {
                            class400.method2255(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method137(-97)) {
                                class400.method2255(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method135(false, arg0, var5, 0, 0, 0, 12137);
                                var6.method140((byte) 30);
                            }
                            var5.method140((byte) 115);
                        }
                        for (class436 var7 = var4.field7074; var7 != null; var7 = var7.field5485) {
                            class597 var9 = var7.field5486;
                            if (var9 != null && var9.method137(-37)) {
                                class400.method2255(arg0, var9, var1, var2, var3, var9.field8005 + 1 - var9.field8017, var9.field8008 - var9.field8014 + 1);
                                var9.method140((byte) 90);
                            }
                        }
                        class445 var8 = var4.field7085;
                        if (var8 != null && var8.method137(-119)) {
                            class552.method2949(arg0, var8, var1, var2, var3);
                            var8.method140((byte) 100);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (arg0 < 74) {
            this.method64(-83, 14, null);
        }
        OpenGL.glBindFramebufferEXT(36009, this.field129);
        field122++;
        this.field140 |= 0x2;
        this.field116 = this.method78((byte) -29);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
    public final void method81(int arg0, byte arg1) {
        if (this.field142[arg0] != null) {
            this.field142[arg0].method298((byte) -99);
        }
        field127++;
        this.field131 &= ~(0x1 << arg0);
        this.field142[arg0] = null;
        int var3 = -24 % ((arg1 - 29) / 56);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
    public final void method82(byte arg0) {
        if (arg0 < 10) {
            this.field131 = -12;
        }
        field130++;
        OpenGL.glBindFramebufferEXT(36160, this.field129);
        this.field140 |= 0x4;
        this.field116 = this.method78((byte) -29);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILgda;III)V")
    private final void method83(int arg0, class51 arg1, int arg2, int arg3, int arg4) {
        field114++;
        if (this.field116 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field131) == 0) {
            this.field123 = arg1.field653;
            this.field121 = arg1.field653;
        } else if (this.field123 != arg1.field653 || this.field121 != arg1.field653) {
            throw new RuntimeException();
        }
        arg1.method299(this.field116, arg4, class618.field8387[arg0], arg3, (byte) 68);
        if (arg2 < 94) {
            this.field129 = 123;
        }
        this.field142[arg0] = arg1;
        this.field131 |= var6;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Ljaa;)V")
    public class14(class576 arg0) {
        if (!arg0.field7667) {
            throw new IllegalStateException("");
        }
        this.field119 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class479.field5965, 0);
        this.field129 = class479.field5965[0];
    }
}
