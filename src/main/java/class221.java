import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class221 extends class344 {

    @OriginalMember(owner = "client!mr", name = "th", descriptor = "Lgk;")
    private class616 field2680 = new class616();

    @OriginalMember(owner = "client!mr", name = "Yh", descriptor = "Lgk;")
    private class616 field2711 = new class616();

    @OriginalMember(owner = "client!mr", name = "di", descriptor = "Lgk;")
    private class616 field2716 = new class616();

    @OriginalMember(owner = "client!mr", name = "fi", descriptor = "Lgk;")
    private class616 field2718 = new class616();

    @OriginalMember(owner = "client!mr", name = "gi", descriptor = "Lgk;")
    private class616 field2719 = new class616();

    @OriginalMember(owner = "client!mr", name = "hi", descriptor = "Lgk;")
    private class616 field2720 = new class616();

    @OriginalMember(owner = "client!mr", name = "ii", descriptor = "Lgk;")
    private class616 field2721 = new class616();

    @OriginalMember(owner = "client!mr", name = "ri", descriptor = "[Lls;")
    private class458[] field2730 = new class458[16];

    @OriginalMember(owner = "client!mr", name = "li", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2724 = new MapBuffer();

    @OriginalMember(owner = "client!mr", name = "si", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2731 = new MapBuffer();

    @OriginalMember(owner = "client!mr", name = "yi", descriptor = "I")
    private int field2737 = 0;

    @OriginalMember(owner = "client!mr", name = "rh", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field2678;

    @OriginalMember(owner = "client!mr", name = "Ei", descriptor = "Ljava/lang/String;")
    private String field2743;

    @OriginalMember(owner = "client!mr", name = "ui", descriptor = "Ljava/lang/String;")
    private String field2733;

    @OriginalMember(owner = "client!mr", name = "vi", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!mr", name = "zi", descriptor = "Z")
    public boolean field2738;

    @OriginalMember(owner = "client!mr", name = "Di", descriptor = "Z")
    private boolean field2742;

    @OriginalMember(owner = "client!mr", name = "ti", descriptor = "Z")
    private boolean field2732;

    @OriginalMember(owner = "client!mr", name = "wi", descriptor = "Z")
    public boolean field2735;

    @OriginalMember(owner = "client!mr", name = "Bi", descriptor = "Z")
    public boolean field2740;

    @OriginalMember(owner = "client!mr", name = "Ci", descriptor = "Z")
    public boolean field2741;

    @OriginalMember(owner = "client!mr", name = "xi", descriptor = "[I")
    public int[] field2736;

    @OriginalMember(owner = "client!mr", name = "Ai", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!mr", name = "Rh", descriptor = "Lcq;")
    public static class110 field2704 = new class110(56, 0);

    @OriginalMember(owner = "client!mr", name = "Zh", descriptor = "[J")
    public static long[] field2712 = new long[32];

    @OriginalMember(owner = "client!mr", name = "bi", descriptor = "[I")
    public static int[] field2714 = new int[32];

    @OriginalMember(owner = "client!mr", name = "ci", descriptor = "I")
    public static int field2715 = 0;

    @OriginalMember(owner = "client!mr", name = "ei", descriptor = "Lwd;")
    public static class357 field2717 = new class357(4, 1, 1, 1);

    @OriginalMember(owner = "client!mr", name = "rg", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!mr", name = "sg", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!mr", name = "tg", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!mr", name = "ug", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!mr", name = "vg", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!mr", name = "wg", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!mr", name = "xg", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!mr", name = "yg", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!mr", name = "zg", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!mr", name = "Ag", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!mr", name = "Bg", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!mr", name = "Cg", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!mr", name = "Dg", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!mr", name = "Eg", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!mr", name = "Fg", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!mr", name = "Gg", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!mr", name = "Hg", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!mr", name = "Ig", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!mr", name = "Jg", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!mr", name = "Kg", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!mr", name = "Lg", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!mr", name = "Mg", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!mr", name = "Ng", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!mr", name = "Og", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!mr", name = "Pg", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!mr", name = "Qg", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!mr", name = "Rg", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!mr", name = "Sg", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!mr", name = "Tg", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!mr", name = "Ug", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mr", name = "Vg", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!mr", name = "Wg", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!mr", name = "Xg", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!mr", name = "Yg", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!mr", name = "Zg", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!mr", name = "ah", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!mr", name = "bh", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!mr", name = "ch", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!mr", name = "dh", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!mr", name = "eh", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!mr", name = "fh", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!mr", name = "gh", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!mr", name = "hh", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!mr", name = "ih", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!mr", name = "jh", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!mr", name = "kh", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!mr", name = "lh", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!mr", name = "mh", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mr", name = "nh", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!mr", name = "oh", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!mr", name = "ph", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!mr", name = "qh", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!mr", name = "sh", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!mr", name = "uh", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!mr", name = "vh", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!mr", name = "wh", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!mr", name = "xh", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!mr", name = "yh", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!mr", name = "zh", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!mr", name = "Ah", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!mr", name = "Bh", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!mr", name = "Ch", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!mr", name = "Dh", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!mr", name = "Eh", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!mr", name = "Fh", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!mr", name = "Gh", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!mr", name = "Hh", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!mr", name = "Ih", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!mr", name = "Jh", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!mr", name = "Kh", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!mr", name = "Lh", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!mr", name = "Mh", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!mr", name = "Nh", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!mr", name = "Oh", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!mr", name = "Ph", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!mr", name = "Qh", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!mr", name = "Sh", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!mr", name = "Th", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!mr", name = "Uh", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!mr", name = "Vh", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!mr", name = "Wh", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!mr", name = "Xh", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!mr", name = "ai", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!mr", name = "ji", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!mr", name = "ki", descriptor = "J")
    private long field2723;

    @OriginalMember(owner = "client!mr", name = "mi", descriptor = "Z")
    private boolean field2725;

    @OriginalMember(owner = "client!mr", name = "ni", descriptor = "Z")
    private boolean field2726;

    @OriginalMember(owner = "client!mr", name = "oi", descriptor = "Z")
    private boolean field2727;

    @OriginalMember(owner = "client!mr", name = "pi", descriptor = "Z")
    private boolean field2728;

    @OriginalMember(owner = "client!mr", name = "qi", descriptor = "Z")
    private boolean field2729;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIZLbs;Lmda;I)V")
    public final void method1276(int arg0, int arg1, int arg2, boolean arg3, class215 arg4, class17 arg5, int arg6) {
        ++field2659;
        byte var8;
        int var9;
        if (class418.field5588 != arg4) {
            if (class286.field3572 == arg4) {
                var8 = 3;
                var9 = arg1 + 1;
            } else if (class538.field7582 == arg4) {
                var9 = arg1 * 3;
                var8 = 4;
            } else if (class25.field218 != arg4) {
                if (class636.field8953 != arg4) {
                    var8 = 0;
                    var9 = arg1;
                } else {
                    var9 = arg1 + 2;
                    var8 = 5;
                }
            } else {
                var8 = 6;
                var9 = arg1 - -2;
            }
        } else {
            var8 = 1;
            var9 = arg1 * 2;
        }
        class179 var10 = arg5.method72((byte) -30);
        if (arg3) {
            this.field2741 = false;
        }
        class38 var11 = (class38) arg5;
        var11.method2894((byte) -111);
        OpenGL.glDrawElements(var8, var9, class191.method1159(var10, 101), var11.method2893((byte) 117) - -((long) (var10.field2003 * arg0)));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BII)V")
    public final synchronized void method1277(byte arg0, int arg1, int arg2) {
        int var4 = -77 % ((60 - arg0) / 53);
        ++field2631;
        class22 var5 = new class22(arg1);
        var5.field4176 = (long) arg2;
        this.field2716.method3425(var5, false);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(ZB)V")
    public final void method1278(boolean arg0, byte arg1) {
        ++field2705;
        if (arg0) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        if (arg1 != -109) {
            this.field2722 = 103;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[Luaa;)Lada;")
    public final class278 method1279(int arg0, class436[] arg1) {
        ++field2634;
        int var3 = -49 % ((arg0 - 22) / 63);
        return new class642(arg1);
    }

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(II)V")
    public final void method1280(int arg0, int arg1) {
        ++field2644;
        if (arg1 != 1) {
            this.field2736 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lsu;II)V")
    public final void method1281(class155 arg0, int arg1, int arg2) {
        this.field2730[arg1] = (class458) arg0;
        ++field2658;
        if (arg2 <= 98) {
            this.method1327((Canvas) null, (Object) null, true);
        }
    }

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "(IIII)[I")
    public final int[] method944(int arg0, int arg1, int arg2, int arg3) {
        ++field2708;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field4458 - (var6 - -1) + -arg1, arg2, 1, 32993, this.field2739, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Llj;Llj;FLlj;)Llj;")
    public final class60 method959(class60 arg0, class60 arg1, float arg2, class60 arg3) {
        ++field2681;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!mr", name = "ja", descriptor = "(I)V")
    public final void method1002(int arg0) {
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field2645;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "(I)V")
    public final void method1282(int arg0) {
        ++field2697;
        if (arg0 == 1) {
            OpenGL.glActiveTexture(super.field4579 + 33984);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
    public final void method954(boolean arg0) {
        ++field2657;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)Lsu;")
    public final class155 method1283(boolean arg0, int arg1) {
        ++field2636;
        if (arg1 != -1) {
            this.field2728 = false;
        }
        return new class458(this, arg0);
    }

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "(I)V")
    public final void method1284(int arg0) {
        ++field2655;
        if (arg0 > -17) {
            this.field2730 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLada;)V")
    public final void method1285(boolean arg0, class278 arg1) {
        ++field2689;
        class436[] var3 = ((class642) arg1).field9083;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        if (arg0) {
            boolean var7 = false;
            for (int var8 = 0; ~var3.length < ~var8; ++var8) {
                class436 var11 = var3[var8];
                class458 var12 = this.field2730[var8];
                int var13 = 0;
                int var14 = var12.method2627((byte) 72);
                long var15 = var12.method2893((byte) 42);
                var12.method2894((byte) -111);
                for (int var17 = 0; ~var11.method2504((byte) 45) < ~var17; ++var17) {
                    class615 var18 = var11.method2500(var17, 0);
                    if (class615.field8653 != var18) {
                        if (class615.field8658 == var18) {
                            var6 = true;
                            OpenGL.glNormalPointer(5126, var14, var15 - -((long) var13));
                        } else if (class615.field8663 == var18) {
                            OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                            var5 = true;
                        } else if (class615.field8664 == var18) {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(1, 5126, var14, var15 - -((long) var13));
                        } else if (class615.field8665 != var18) {
                            if (class615.field8666 != var18) {
                                if (class615.field8667 == var18) {
                                    OpenGL.glClientActiveTexture(33984 - -(var4++));
                                    OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                                }
                            } else {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                            }
                        } else {
                            OpenGL.glClientActiveTexture(33984 + var4++);
                            OpenGL.glTexCoordPointer(2, 5126, var14, var15 - -((long) var13));
                        }
                    } else {
                        var7 = true;
                        OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                    }
                    var13 += var18.field8654;
                }
            }
            if (!var7 != !this.field2728) {
                if (var7) {
                    OpenGL.glEnableClientState(32884);
                } else {
                    OpenGL.glDisableClientState(32884);
                }
                this.field2728 = var7;
            }
            if (!this.field2727 != !var6) {
                if (!var6) {
                    OpenGL.glDisableClientState(32885);
                } else {
                    OpenGL.glEnableClientState(32885);
                }
                this.field2727 = var6;
            }
            if (this.field2725 != var5) {
                if (var5) {
                    OpenGL.glEnableClientState(32886);
                } else {
                    OpenGL.glDisableClientState(32886);
                }
                this.field2725 = var5;
            }
            if (~var4 >= ~this.field2722) {
                if (this.field2722 > var4) {
                    for (int var9 = var4; ~this.field2722 < ~var9; ++var9) {
                        OpenGL.glClientActiveTexture(var9 + 33984);
                        OpenGL.glDisableClientState(32888);
                    }
                    this.field2722 = var4;
                    return;
                }
            } else {
                for (int var10 = this.field2722; var10 < var4; ++var10) {
                    OpenGL.glClientActiveTexture(var10 + 33984);
                    OpenGL.glEnableClientState(32888);
                }
                this.field2722 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "gb", descriptor = "(I)V")
    public static void method1286(int arg0) {
        field2712 = null;
        field2704 = null;
        if (arg0 != -4232) {
            method1286(-128);
        }
        field2717 = null;
        field2714 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lrt;Lsq;B)Z")
    public final boolean method1287(class179 arg0, class485 arg1, byte arg2) {
        ++field2668;
        if (arg2 < 123) {
            this.method1292(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "(I)F")
    public final float method1288(int arg0) {
        ++field2675;
        if (arg0 != 29813) {
            this.method1044();
        }
        return 0.0F;
    }

    @OriginalMember(owner = "client!mr", name = "Y", descriptor = "(I)V")
    public final void method1289(int arg0) {
        ++field2627;
        OpenGL.glMatrixMode(5890);
        if (super.field4547[super.field4579] != class537.field7554) {
            OpenGL.glLoadMatrixf(super.field4538[super.field4579].method3016(class425.field6022, (byte) -100), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        if (arg0 >= 76) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBI[BILsq;)Ln;")
    public final class514 method1290(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, class485 arg5) {
        ++field2671;
        return arg1 <= 116 ? null : new class467(this, arg5, arg0, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!mr", name = "ya", descriptor = "()V")
    public final void method969() {
        ++field2664;
        this.method2029(7, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lbs;IZI)V")
    public final void method1291(class215 arg0, int arg1, boolean arg2, int arg3) {
        ++field2638;
        if (arg2) {
            byte var5;
            int var6;
            if (class418.field5588 == arg0) {
                var5 = 1;
                var6 = arg3 * 2;
            } else if (class286.field3572 == arg0) {
                var6 = arg3 + 1;
                var5 = 3;
            } else if (class538.field7582 != arg0) {
                if (class25.field218 != arg0) {
                    if (class636.field8953 == arg0) {
                        var5 = 5;
                        var6 = arg3 + 2;
                    } else {
                        var6 = arg3;
                        var5 = 0;
                    }
                } else {
                    var5 = 6;
                    var6 = arg3 - -2;
                }
            } else {
                var5 = 4;
                var6 = arg3 * 3;
            }
            OpenGL.glDrawArrays(var5, arg1, var6);
        }
    }

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "(Z)V")
    public final void method1292(boolean arg0) {
        ++field2643;
        OpenGL.glViewport(super.field4544, super.field4518, super.field4332, super.field4458);
        if (arg0) {
            this.field2722 = -122;
        }
    }

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "(I)V")
    public final void method1293(int arg0) {
        class186.field2109[2] = (float) class105.method572(super.field4525, 255) / 255.0F;
        class186.field2109[3] = (float) (super.field4525 >>> 24) / 255.0F;
        if (arg0 == -25974) {
            class186.field2109[0] = (float) class105.method572(16711680, super.field4525) / 1.671168E7F;
            class186.field2109[1] = (float) class105.method572(super.field4525, 65280) / 65280.0F;
            ++field2654;
            OpenGL.glTexEnvfv(8960, 8705, class186.field2109, 0);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1294(int arg0, Canvas arg1, Object arg2) {
        ++field2665;
        Long var4 = (Long) arg2;
        this.field2678.releaseSurface(arg1, var4);
        if (arg0 != 1) {
            this.method1049();
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILsq;IZII[F)Lpm;")
    public final class134 method1295(int arg0, int arg1, class485 arg2, int arg3, boolean arg4, int arg5, int arg6, float[] arg7) {
        ++field2707;
        if (arg1 != -27701) {
            return null;
        } else if (!this.field2732 && (!class483.method2792(arg0, -3) || !class483.method2792(arg5, -3))) {
            if (this.field2742) {
                return new class238(this, arg2, arg0, arg5, arg7, arg6, arg3);
            } else {
                class298 var9 = new class298(this, arg2, class179.field2012, class553.method3138(1781323777, arg0), class553.method3138(1781323777, arg5));
                var9.method1740(arg3, 0, arg2, arg5, arg7, -28819, arg6, arg0, 0);
                return var9;
            }
        } else {
            return new class298(this, arg2, arg0, arg5, arg4, arg7, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "(Z)V")
    public final void method1296(boolean arg0) {
        super.field4549 = (float) (super.field4599 - super.field4566);
        ++field2652;
        super.field4550 = (float) (-super.field4536) + super.field4549;
        if (super.field4550 < (float) super.field4533) {
            super.field4550 = (float) super.field4533;
        }
        OpenGL.glFogf(2915, super.field4550);
        OpenGL.glFogf(2916, super.field4549);
        class186.field2109[2] = (float) class105.method572(255, super.field4565) / 255.0F;
        class186.field2109[0] = (float) class105.method572(16711680, super.field4565) / 1.671168E7F;
        class186.field2109[1] = (float) class105.method572(65280, super.field4565) / 65280.0F;
        OpenGL.glFogfv(2918, class186.field2109, 0);
        if (arg0) {
            field2706 = 31;
        }
    }

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "(I)V")
    public final void method1297(int arg0) {
        int var2 = -67 / ((arg0 - 53) / 38);
        if (!super.field4530) {
            OpenGL.glDisable(3042);
        } else {
            OpenGL.glEnable(3042);
        }
        ++field2647;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public final Object method1298(Canvas arg0, byte arg1) {
        if (arg1 >= -81) {
            this.method1285(false, (class278) null);
        }
        ++field2648;
        long var3 = this.field2678.prepareSurface(arg0);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "(I)V")
    public final void method1299(int arg0) {
        ++field2703;
        int var2 = -98 / ((arg0 - -62) / 33);
        OpenGL.glTexEnvi(8960, 34162, class542.method3046(super.field4569[super.field4579], (byte) 120));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZIII[II)Lpm;")
    public final class134 method1300(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        ++field2677;
        if (arg0 <= 43) {
            return null;
        } else if (!this.field2732 && (!class483.method2792(arg4, -3) || !class483.method2792(arg3, -3))) {
            if (this.field2742) {
                return new class238(this, arg4, arg3, arg5, arg6, arg2);
            } else {
                class298 var8 = new class298(this, class412.field5529, class179.field2008, class553.method3138(1781323777, arg4), class553.method3138(1781323777, arg3));
                var8.method753(arg2, arg4, arg6, 0, arg5, (byte) -127, arg3, 0);
                return var8;
            }
        } else {
            return new class298(this, arg4, arg3, arg1, arg5, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "(Z)V")
    public final void method1301(boolean arg0) {
        ++field2635;
        if (!arg0) {
            this.field2721 = null;
        }
        OpenGL.glLightfv(16384, 4611, super.field4563, 0);
        OpenGL.glLightfv(16385, 4611, super.field4541, 0);
    }

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "()V")
    public final void method979() throws class20 {
        ++field2684;
        this.field2678.swapBuffers();
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method1302(boolean arg0, Canvas arg1, Object arg2) {
        if (arg0) {
            this.method1330(-9);
        }
        ++field2651;
        Long var4 = (Long) arg2;
        this.field2678.surfaceResized(var4);
    }

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "(B)Lss;")
    public static final class440 method1303(byte arg0) {
        if (arg0 < 122) {
            return null;
        } else {
            ++field2656;
            return class482.field6929;
        }
    }

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "(B)V")
    private final void method1304(byte arg0) {
        ++field2642;
        if (this.field2729) {
            OpenGL.glPopMatrix();
        }
        if (super.field4529.method213(-116)) {
            if (!this.field2726) {
                OpenGL.glLoadMatrixf(super.field4513.method3016(class425.field6022, (byte) -100), 0);
                this.field2726 = true;
                this.method1301(true);
                this.method1307(78);
            }
            if (super.field4508) {
                this.field2729 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field4510.method3016(class425.field6022, (byte) -100), 0);
                this.field2729 = true;
            }
        } else if (!super.field4508) {
            OpenGL.glLoadMatrixf(super.field4510.method3016(class425.field6022, (byte) -100), 0);
            this.field2729 = false;
        } else {
            OpenGL.glLoadIdentity();
            this.field2729 = false;
        }
        if (arg0 > -49) {
            this.method944(56, -29, -88, 82);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lgb;IIZ)V")
    public final void method1305(class163 arg0, int arg1, int arg2, boolean arg3) {
        ++field2685;
        OpenGL.glTexEnvi(8960, arg2 + 34184, class691.method3812(arg0, arg1 + -16087));
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg3 ? 771 : 770);
        if (arg1 != 14604) {
            this.field2737 = 114;
        }
    }

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "(I)V")
    public final void method1306(int arg0) {
        if (arg0 == 0) {
            if (!super.field4592) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            ++field2691;
        }
    }

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "(I)V")
    public final void method1307(int arg0) {
        ++field2676;
        this.method2011(false);
        int var2;
        for (var2 = 0; var2 < super.field4542; ++var2) {
            class670 var3 = super.field4606[var2];
            int var4 = var3.method3710(false);
            int var5 = var2 + 16386;
            float var6 = var3.method3704((byte) -94) / 255.0F;
            class186.field2109[0] = (float) var3.method3711(1795643394);
            class186.field2109[1] = (float) var3.method3703((byte) -29);
            class186.field2109[2] = (float) var3.method3706((byte) 121);
            class186.field2109[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class186.field2109, 0);
            class186.field2109[2] = var6 * (float) class105.method572(var4, 255);
            class186.field2109[3] = 1.0F;
            class186.field2109[0] = (float) class105.method572(255, var4 >> 16) * var6;
            class186.field2109[1] = var6 * (float) class105.method572(var4 >> 8, 255);
            OpenGL.glLightfv(var5, 4609, class186.field2109, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method3708((byte) 83) * var3.method3708((byte) 83)));
            OpenGL.glEnable(var5);
        }
        if (arg0 >= 60) {
            while (var2 < super.field4603) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            super.method1307(97);
        }
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V")
    public final synchronized void method948(int arg0) {
        ++field2673;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field2711.method3439((byte) -88)) {
            class22 var12 = (class22) this.field2711.method3440((byte) 123);
            class209.field2468[var3++] = (int) var12.field4176;
            super.field4507 -= var12.field168;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class209.field2468, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class209.field2468, 0);
            var3 = 0;
        }
        while (!this.field2716.method3439((byte) -59)) {
            class22 var11 = (class22) this.field2716.method3440((byte) 109);
            class209.field2468[var3++] = (int) var11.field4176;
            super.field4502 -= var11.field168;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class209.field2468, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class209.field2468, 0);
            var3 = 0;
        }
        while (!this.field2718.method3439((byte) 84)) {
            class22 var10 = (class22) this.field2718.method3440((byte) 126);
            class209.field2468[var3++] = var10.field168;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class209.field2468, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class209.field2468, 0);
            var3 = 0;
        }
        while (!this.field2719.method3439((byte) 125)) {
            class22 var9 = (class22) this.field2719.method3440((byte) -23);
            class209.field2468[var3++] = (int) var9.field4176;
            super.field4505 -= var9.field168;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class209.field2468, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class209.field2468, 0);
            boolean var4 = false;
        }
        while (!this.field2680.method3439((byte) 77)) {
            class22 var8 = (class22) this.field2680.method3440((byte) -5);
            OpenGL.glDeleteLists((int) var8.field4176, var8.field168);
        }
        while (!this.field2720.method3439((byte) 101)) {
            class333 var7 = this.field2720.method3440((byte) -57);
            OpenGL.glDeleteProgramARB((int) var7.field4176);
        }
        while (!this.field2721.method3439((byte) 52)) {
            class333 var6 = this.field2721.method3440((byte) -104);
            OpenGL.glDeleteObjectARB(var6.field4176);
        }
        while (!this.field2680.method3439((byte) 88)) {
            class22 var5 = (class22) this.field2680.method3440((byte) 106);
            OpenGL.glDeleteLists((int) var5.field4176, var5.field168);
        }
        if (this.method981() > 100663296 && ~(this.field2723 + 60000L) > ~class557.method3157(-103)) {
            System.gc();
            this.field2723 = class557.method3157(-110);
        }
        super.method948(var2);
    }

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "(B)V")
    public final void method1308(byte arg0) {
        ++field2662;
        if (arg0 < 97) {
            this.method959((class60) null, (class60) null, -0.68124604F, (class60) null);
        }
        this.field2726 = false;
        this.method1304((byte) -74);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)V")
    public final void method976(int arg0, int arg1, int arg2, int arg3) {
        ++field2686;
    }

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "(B)V")
    public final void method1309(byte arg0) {
        ++field2649;
        if (super.field4588 && super.field4575 && super.field4536 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 <= 33) {
            this.field2735 = false;
        }
    }

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "()V")
    public final void method1045() {
        ++field2630;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "()V")
    public final void method1029() {
        super.method1029();
        ++field2640;
        if (this.field2678 != null) {
            this.field2678.method3545();
            this.field2678.release();
            this.field2678 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "(I)V")
    public final void method1310(int arg0) {
        this.method1304((byte) -83);
        if (arg0 == 4924) {
            ++field2702;
        }
    }

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "(B)V")
    public final void method1311(byte arg0) {
        ++field2696;
        OpenGL.glDepthMask(super.field4531 && super.field4532);
        if (arg0 != 8) {
            this.field2735 = true;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method958(Rectangle[] arg0, int arg1) throws class20 {
        ++field2679;
        this.method979();
    }

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "(I)V")
    public final void method1312(int arg0) {
        ++field2666;
        int var2 = this.field2736[super.field4579];
        if (var2 != 0) {
            this.field2736[super.field4579] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        if (arg0 != -867) {
            this.field2680 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([BIZIIILsq;I)Lpm;")
    public final class134 method1313(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7) {
        if (arg1 != 2) {
            return null;
        } else {
            ++field2667;
            if (!this.field2732 && (!class483.method2792(arg3, -3) || !class483.method2792(arg4, -3))) {
                if (!this.field2742) {
                    class298 var9 = new class298(this, arg6, class179.field2008, class553.method3138(1781323777, arg3), class553.method3138(1781323777, arg4));
                    var9.method757(0, arg7, arg0, 0, arg4, arg5, arg3, arg6, arg1 + 13029);
                    return var9;
                } else {
                    return new class238(this, arg6, arg3, arg4, arg0, arg5, arg7);
                }
            } else {
                return new class298(this, arg6, arg3, arg4, arg2, arg0, arg5, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "DA", descriptor = "()I")
    public final int method1021() {
        ++field2637;
        return this.field2737;
    }

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "(II)V")
    public final synchronized void method1314(int arg0, int arg1) {
        ++field2650;
        class333 var3 = new class333();
        var3.field4176 = (long) arg0;
        this.field2720.method3425(var3, false);
        if (arg1 != 3169) {
            this.method1326(54, true);
        }
    }

    @OriginalMember(owner = "client!mr", name = "X", descriptor = "(I)V")
    public final void method1315(int arg0) {
        OpenGL.glScissor(super.field4576 + super.field4544, -super.field4605 + super.field4518 + super.field4458, -super.field4576 + super.field4615, -super.field4577 + super.field4605);
        if (arg0 != -12002) {
            this.method1279(-123, (class436[]) null);
        }
        ++field2709;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lf;Z)V")
    public final void method990(class534 arg0, boolean arg1) {
        ++field2626;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)Lnm;")
    public final class369 method1316(int arg0, byte arg1) {
        ++field2698;
        if (arg1 < 7) {
            this.field2727 = false;
        }
        if (arg0 != 3) {
            if (~arg0 != -5) {
                return arg0 == 8 ? new class404(this, super.field4380, super.field4413) : super.method1316(arg0, (byte) 112);
            } else {
                return new class497(this, super.field4380, super.field4413);
            }
        } else {
            return new class359(this, super.field4380);
        }
    }

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "(Z)V")
    public final void method1317(boolean arg0) {
        ++field2663;
        if (!super.field4574) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
        if (arg0) {
            this.method1309((byte) 13);
        }
    }

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "(B)V")
    public final void method1318(byte arg0) {
        ++field2688;
        if (!super.field4637) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        int var2 = -107 % ((arg0 - -3) / 37);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILrt;Lsq;)Lpm;")
    public final class134 method1319(int arg0, int arg1, int arg2, class179 arg3, class485 arg4) {
        int var6 = -34 / ((arg2 - 43) / 38);
        ++field2687;
        if (!this.field2732 && (!class483.method2792(arg0, -3) || !class483.method2792(arg1, -3))) {
            return this.field2742 ? new class238(this, arg4, arg3, arg0, arg1) : new class298(this, arg4, arg3, class553.method3138(1781323777, arg0), class553.method3138(1781323777, arg1));
        } else {
            return new class298(this, arg4, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "()V")
    public final void method967() {
        ++field2674;
    }

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "(I)V")
    public final void method1320(int arg0) {
        ++field2701;
        class186.field2109[2] = super.field4596 * super.field4572;
        class186.field2109[1] = super.field4596 * super.field4526;
        class186.field2109[3] = 1.0F;
        if (arg0 != 9415) {
            this.field2728 = true;
        }
        class186.field2109[0] = super.field4596 * super.field4589;
        OpenGL.glLightModelfv(2899, class186.field2109, 0);
    }

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "()Laj;")
    public final class286 method1037() {
        ++field2682;
        int var1 = -1;
        if (~this.field2743.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field2743.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field2743.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class286(var1, "OpenGL", this.field2734, this.field2733, 0L);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ[[IB)Lica;")
    public final class219 method1321(int arg0, boolean arg1, int[][] arg2, byte arg3) {
        if (arg3 != 52) {
            this.method1288(108);
        }
        ++field2639;
        return new class127(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mr", name = "ab", descriptor = "(I)V")
    public final void method1322(int arg0) {
        if (arg0 != 6) {
            method1325(-15, (byte) -74, 123);
        }
        if (super.field4573 && !super.field4535) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field2692;
    }

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "(B)V")
    public final void method1323(byte arg0) {
        ++field2713;
        if (arg0 != -70) {
            this.method1290(-125, (byte) 119, 70, (byte[]) null, 49, (class485) null);
        }
        OpenGL.glTexEnvi(8960, 34161, class542.method3046(super.field4556[super.field4579], (byte) 55));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(JI)V")
    public final synchronized void method1324(long arg0, int arg1) {
        if (arg1 <= 26) {
            this.field2731 = null;
        }
        ++field2633;
        class333 var4 = new class333();
        var4.field4176 = arg0;
        this.field2721.method3425(var4, false);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLfa;Ltf;I)V")
    public class221(OpenGL arg0, Canvas arg1, long arg2, class524 arg3, class701 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field2678 = arg0;
            this.field2678.method3544();
            this.field2743 = OpenGL.glGetString(7936).toLowerCase();
            this.field2733 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field2743.indexOf("microsoft") == -1 && this.field2743.indexOf("brian paul") == -1 && ~this.field2743.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class182.method1105(' ', (byte) -75, var8.replace('.', ' '));
                if (var9.length >= 2) {
                    try {
                        int var10 = class274.method1607(var9[0], 1);
                        int var11 = class274.method1607(var9[1], 1);
                        this.field2734 = var10 * 10 - -var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field2734 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field2678.method3546("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field2678.method3546("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field4612 = var12[0];
                        if (~super.field4612 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field4571 = 8;
                            this.field2738 = this.field2678.method3546("GL_ARB_vertex_buffer_object");
                            super.field4521 = this.field2678.method3546("GL_ARB_multisample");
                            this.field2742 = this.field2678.method3546("GL_ARB_texture_rectangle");
                            super.field4613 = this.field2678.method3546("GL_ARB_texture_cube_map");
                            this.field2732 = this.field2678.method3546("GL_ARB_texture_non_power_of_two");
                            super.field4520 = this.field2678.method3546("GL_EXT_texture3D");
                            this.field2735 = this.field2678.method3546("GL_ARB_vertex_shader");
                            this.field2740 = this.field2678.method3546("GL_ARB_vertex_program");
                            this.field2741 = this.field2678.method3546("GL_ARB_fragment_shader");
                            this.field2678.method3546("GL_ARB_fragment_program");
                            this.field2736 = new int[super.field4612];
                            this.field2739 = !Stream.method3480() ? 5121 : 33639;
                            if (~this.field2733.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class182.method1105(' ', (byte) -75, this.field2733.replace('/', ' '));
                                for (int var17 = 0; var17 < var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && ~var18.length() <= -4 && class63.method334(9394, var18.substring(1, 3))) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (var18.length() >= 4 && class63.method334(9394, var18.substring(0, 4))) {
                                                    var13 = class274.method1607(var18.substring(0, 4), 1);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field4520 = false;
                                    }
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field2738 = false;
                                    }
                                }
                                this.field2742 &= this.field2678.method3546("GL_ARB_half_float_pixel");
                            }
                            this.field2743.indexOf("intel");
                            if (this.field2738) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method1029();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1325(int arg0, byte arg1, int arg2) {
        ++field2694;
        if (arg1 != -106) {
            return true;
        } else {
            return class329.method1850(arg2, true, arg0) || class154.method835(arg0, arg2, 55);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)Lmda;")
    public final class17 method1326(int arg0, boolean arg1) {
        if (arg0 >= -46) {
            return null;
        } else {
            ++field2693;
            return new class38(this, class179.field2009, arg1);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public final void method1327(Canvas arg0, Object arg1, boolean arg2) {
        ++field2672;
        Long var4 = (Long) arg1;
        if (!this.field2678.setSurface(var4)) {
            throw new RuntimeException();
        } else if (!arg2) {
            field2704 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZZZLgb;)V")
    public final void method1328(int arg0, boolean arg1, boolean arg2, boolean arg3, class163 arg4) {
        ++field2699;
        if (!arg3) {
            this.field2742 = true;
        }
        OpenGL.glTexEnvi(8960, arg0 + 34176, class691.method3812(arg4, -1483));
        if (arg2) {
            OpenGL.glTexEnvi(8960, arg0 + 34192, !arg1 ? 770 : 771);
        } else {
            OpenGL.glTexEnvi(8960, arg0 + 34192, !arg1 ? 768 : 769);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
    public final synchronized void method1329(int arg0, int arg1, int arg2) {
        ++field2695;
        if (arg0 == 0) {
            class22 var4 = new class22(arg1);
            var4.field4176 = (long) arg2;
            this.field2711.method3425(var4, false);
        }
    }

    @OriginalMember(owner = "client!mr", name = "T", descriptor = "(I)V")
    public final void method1330(int arg0) {
        ++field2632;
        if (arg0 >= -15) {
            this.method975(-0.5246685F, 0.1613165F, -1.0697124F);
        }
        if (class376.field5109 != super.field4598) {
            if (class162.field1814 != super.field4598) {
                if (class554.field7918 == super.field4598) {
                    OpenGL.glBlendFunc(774, 1);
                    return;
                }
            } else {
                OpenGL.glBlendFunc(1, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
    }

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "()Z")
    public final boolean method977() {
        ++field2700;
        return false;
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "()Z")
    public final boolean method1044() {
        ++field2646;
        return false;
    }

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "(I)V")
    public final void method1331(int arg0) {
        class186.field2109[3] = 1.0F;
        class186.field2109[1] = super.field4602 * super.field4526;
        ++field2660;
        class186.field2109[0] = super.field4602 * super.field4589;
        if (arg0 > -27) {
            this.method1021();
        }
        class186.field2109[2] = super.field4602 * super.field4572;
        OpenGL.glLightfv(16384, 4609, class186.field2109, 0);
        class186.field2109[1] = -super.field4593 * super.field4526;
        class186.field2109[2] = -super.field4593 * super.field4572;
        class186.field2109[0] = -super.field4593 * super.field4589;
        class186.field2109[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class186.field2109, 0);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(Z)V")
    public final void method1332(boolean arg0) {
        if (arg0) {
            ++field2710;
            if (super.field4539) {
                OpenGL.glEnable(3008);
            } else {
                OpenGL.glDisable(3008);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "()V")
    public final void method1049() {
        ++field2690;
    }

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "()V")
    public final void method974() {
        OpenGL.glFinish();
        ++field2653;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(Z)V")
    public final void method1333(boolean arg0) {
        ++field2670;
        for (int var2 = super.field4612 + -1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = 16384 - -var4;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field2678.setSwapInterval(0);
        super.method1333(arg0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILrt;Lsq;)Z")
    public final boolean method1334(int arg0, class179 arg1, class485 arg2) {
        ++field2628;
        if (arg0 != 1) {
            field2714 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lal;B)V")
    public final void method1335(class307 arg0, byte arg1) {
        if (class158.field1768 == arg0) {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        } else {
            int var3 = class301.method1747(1564, arg0);
            OpenGL.glTexGeni(8192, 9472, var3);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var3);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var3);
            OpenGL.glEnable(3170);
        }
        if (arg1 > -60) {
            field2683 = -120;
        }
        ++field2669;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "()V")
    public final void method1011() {
        ++field2641;
        if (super.field4332 > 0 || ~super.field4458 < -1) {
            int var1 = super.field4576;
            int var2 = super.field4615;
            int var3 = super.field4577;
            int var4 = super.field4605;
            this.method1050();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2019((byte) -118);
            this.method2027(false, false);
            this.method1984(false, (byte) -55);
            this.method2001(false, (byte) 124);
            this.method2029(7, false);
            this.method1997(127, (class686) null);
            this.method2008(false, 123, -2, false);
            this.method2004(1, 2);
            this.method2051(0, (byte) -79);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field4332, super.field4458, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method982(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(Z)V")
    public final void method1336(boolean arg0) {
        if (!arg0) {
            this.method1044();
        }
        OpenGL.glMatrixMode(5889);
        ++field2629;
        OpenGL.glLoadMatrixf(super.field4562, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lr;IIIIIIZZ)V")
    public static final void method1337(class564 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class568.field8078 = arg0;
        class15.field126 = arg1;
        class110.field1180 = class15.field126 > 1 && class568.field8078.method1052();
        class559.field7984 = arg2;
        class171.field1904 = 1 << class559.field7984;
        class291.field3640 = class171.field1904 >> 1;
        Math.sqrt((double) (class291.field3640 * class291.field3640 + class291.field3640 * class291.field3640));
        class612.field8618 = arg3;
        class122.field1369 = arg4;
        class247.field3058 = arg5;
        class460.field6544 = arg6;
        class539.field7588 = class128.method728(-125);
        class120.method698((byte) -64);
        class50.field506 = new class499[arg3][class122.field1369][class247.field3058];
        class385.field5193 = new class274[arg3];
        if (arg7) {
            class470.field6718 = new int[class122.field1369][class247.field3058];
            class559.field7988 = new byte[class122.field1369][class247.field3058];
            class383.field5172 = new short[class122.field1369][class247.field3058];
            class604.field8494 = new class499[1][class122.field1369][class247.field3058];
            class666.field9303 = new class274[1];
        } else {
            class470.field6718 = null;
            class559.field7988 = null;
            class383.field5172 = null;
            class604.field8494 = null;
            class666.field9303 = null;
        }
        if (arg8) {
            class312.field3882 = new long[arg3][arg4][arg5];
            class85.field860 = new class241[65535];
            class652.field9154 = new boolean[65535];
            class137.field1501 = 0;
        } else {
            class312.field3882 = null;
            class85.field860 = null;
            class652.field9154 = null;
            class137.field1501 = 0;
        }
        class496.method2865(false);
        class469.field6711 = new class383[2][];
        class469.field6711[0] = new class383[class674.field9393[0]];
        class469.field6711[1] = new class383[class674.field9393[1]];
        class321.field3949 = new int[2];
        class13.field115 = new class383[2][];
        class13.field115[0] = new class383[class161.field1798[0]];
        class13.field115[1] = new class383[class161.field1798[1]];
        class635.field8946 = new int[2];
        class476.field6867 = new class383[2][];
        class476.field6867[0] = new class383[class241.field2992[0]];
        class476.field6867[1] = new class383[class241.field2992[1]];
        class701.field9822 = new int[2];
        class337.field4241 = new class383[10000];
        class446.field6294 = 0;
        class234.field2869 = new class383[5000];
        class361.field4846 = 0;
        class138.field1525 = new class613[5000];
        class282.field3532 = 0;
        class475.field6837 = new boolean[class460.field6544 + class460.field6544 + 1][class460.field6544 + class460.field6544 + 1];
        class41.field408 = new boolean[class460.field6544 + class460.field6544 + 2][class460.field6544 + class460.field6544 + 2];
        if (class110.field1180) {
            class560.field7992 = new boolean[arg3][class460.field6544 + class460.field6544 + 1][class460.field6544 + class460.field6544 + 1];
            class507.field7283 = new boolean[arg3][][];
            if (class642.field9080 != null) {
                class632.method3549();
            }
            class642.field9080 = new class589[class15.field126];
            class568.field8078.method978(class642.field9080.length + 1);
            class568.field8078.method1018(0);
            for (int var9 = 0; var9 < class642.field9080.length; ++var9) {
                class642.field9080[var9] = new class589(var9 + 1, class568.field8078);
                (new Thread(class642.field9080[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class15.field126 == 2) {
                var10 = 4;
                class531.field7481 = 2;
            } else if (class15.field126 == 3) {
                var10 = 6;
                class531.field7481 = 3;
            } else {
                var10 = 8;
                class531.field7481 = 4;
            }
            class472.field6799 = new class204[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class472.field6799[var11] = new class204(class163.field1819[class15.field126 - 2][var11]);
            }
        } else {
            class531.field7481 = 1;
        }
        class494.field7162 = new int[class531.field7481 - 1];
        class61.field625 = new int[class531.field7481 - 1];
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(FFF)V")
    public final void method975(float arg0, float arg1, float arg2) {
        ++field2661;
    }
}
