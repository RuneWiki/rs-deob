import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class49 extends class290 {

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Z")
    private boolean field561;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Z")
    private boolean field563;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lqi;")
    private class406 field558;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "Z")
    public boolean field568;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "Z")
    private boolean field593;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Lfc;")
    private class174 field583;

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lfc;")
    private class174 field564;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Lgj;")
    public class457 field572;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "F")
    private float field591;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "F")
    private float field598;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lo;")
    private class24 field580;

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lo;")
    private class24 field607;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lvs;")
    private class426 field562;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field559;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "Z")
    public boolean field601;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "[I")
    public int[] field594;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "[Lbv;")
    private class204[] field588;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lbv;", line = 5)
    public final class204 method283(Runnable arg0) {
        for (int var2 = 0; var2 < this.field575; ++var2) {
            if (this.field588[var2].field2911 == arg0) {
                return this.field588[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILl;)V", line = 17)
    private class49(int arg0, class16 arg1) {
        super(arg0, arg1);
        this.field561 = false;
        this.field563 = false;
        this.field558 = new class406(4);
        this.field567 = 3500;
        this.field570 = 78642;
        this.field573 = 0;
        this.field587 = 0;
        this.field577 = 512;
        this.field589 = 0;
        this.field590 = 0;
        this.field581 = 50;
        this.field582 = 3500;
        this.field568 = false;
        this.field586 = 0;
        this.field584 = this.field567 - 255;
        this.field585 = 0;
        this.field596 = 0;
        this.field566 = 0;
        this.field592 = 512;
        this.field595 = 75518;
        this.field593 = false;
        this.field602 = 0;
        this.field569 = 45823;
        this.field605 = 0;
        this.field583 = new class174(16);
        this.field606 = -1;
        this.field564 = new class174(20);
        this.field572 = new class457();
        this.method306(1);
        this.method375(0);
        class108.method737(false, true, (byte) 49);
        this.field561 = true;
    }

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "()Z", line = 26)
    public final boolean method284() {
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 30)
    public final void method285(Canvas arg0) {
        if (arg0 != null) {
            class426 var2 = (class426) this.field558.method2405((long) arg0.hashCode(), -109);
            if (var2 != null) {
                this.field559 = arg0;
                this.field562 = var2;
                if (this.field580 == null) {
                    this.field594 = var2.field5981;
                    this.field597 = var2.field5986;
                    this.field578 = var2.field5983;
                    this.method338();
                    return;
                }
            }
        } else {
            this.field559 = null;
            this.field562 = null;
            if (this.field580 == null) {
                this.field594 = null;
                this.field597 = this.field578 = 1;
                this.method338();
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "ya", descriptor = "(I)V", line = 63)
    public final void method286(int arg0) {
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "(I)Z", line = 67)
    public final boolean method287(int arg0) {
        return super.field4246.method82(arg0, -18226);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIII)V", line = 70)
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method387(arg0, arg1, arg2, arg4, arg5);
        this.method387(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method376(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method376(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 77)
    public final void method289(Canvas arg0) {
        class426 var2 = (class426) this.field558.method2405((long) arg0.hashCode(), -126);
        if (var2 != null) {
            var2.method2891(-125);
            class426 var3 = class92.method659(61, arg0);
            this.field558.method2413((long) arg0.hashCode(), var3, -1);
            if (this.field559 == arg0 && this.field580 == null) {
                this.field562 = var3;
                this.field594 = var3.field5981;
                this.field597 = var3.field5986;
                this.field578 = var3.field5983;
                this.method338();
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "(IIIIII[BII)V", line = 96)
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field597 * arg1 + arg0;
            int var15 = this.field597 - arg2;
            if (arg1 + arg3 > this.field596) {
                arg3 -= arg1 + arg3 - this.field596;
            }
            if (arg1 < this.field605) {
                int var16 = this.field605 - arg1;
                arg3 -= var16;
                var14 += this.field597 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field573) {
                int var17 = arg0 + arg2 - this.field573;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field587) {
                int var18 = this.field587 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field594[var14];
                            this.field594[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field594[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field594[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field594[var14++] = arg5;
                        } else {
                            this.field594[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V", line = 271)
    public final void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0 && arg3 != 0) {
            if (arg5 != 65535 && !super.field4246.method83(arg5, 111).field3199) {
                if (this.field606 != arg5) {
                    class24 var10 = (class24) this.field583.method1088((long) arg5, (byte) -122);
                    if (var10 == null) {
                        int[] var11 = this.method381(arg5);
                        if (var11 == null) {
                            return;
                        }
                        int var12 = this.method383(arg5) ? 64 : 128;
                        var10 = this.method344(var11, 0, var12, var12, var12);
                        this.field583.method1097(19627, var10, (long) arg5);
                    }
                    this.field606 = arg5;
                    this.field607 = var10;
                }
                this.field607.method162(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
            } else {
                this.method328(arg0, arg1, arg2, arg6, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "()V", line = 303)
    public final void method292() {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lld;IIII)Le;", line = 308)
    public final class377 method293(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class491(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(FFF)V", line = 310)
    public final void method294(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!wc", name = "va", descriptor = "()V", line = 313)
    public final void method295() {
        this.field587 = 0;
        this.field605 = 0;
        this.field573 = this.field597;
        this.field596 = this.field578;
        this.method315();
    }

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "()Z", line = 320)
    public final boolean method296() {
        return this.field563;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V", line = 322)
    public final void method297(boolean arg0) {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([Le;Lc;[Lwp;I)V", line = 326)
    public final void method298(class377[] arg0, class125 arg1, class122[] arg2, int arg3) {
        class491[] var5 = new class491[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class491) arg0[var6];
            }
        }
        class491 var7 = class491.method2855(this, var5);
        var7.method2849(arg1, arg2 != null ? arg2[0] : null, (class324) null, arg3);
    }

    @OriginalMember(owner = "client!wc", name = "JA", descriptor = "(F)V", line = 341)
    public final void method299(float arg0) {
        this.field595 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!wc", name = "ra", descriptor = "(ILta;II)V", line = 345)
    public final void method300(int arg0, class145 arg1, int arg2, int arg3) {
        class138 var5 = (class138) arg1;
        int[] var6 = var5.field1811;
        int[] var7 = var5.field1812;
        int var8;
        if (this.field596 < var6.length + arg3) {
            var8 = this.field596 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field605 > arg3) {
            var9 = this.field605 - arg3;
            arg3 = this.field605;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field597 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field587 > var12) {
                    var13 -= this.field587 - var12;
                    var12 = this.field587;
                }
                if (this.field573 < var12 + var13) {
                    var13 = this.field573 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field594[var14++] = arg0;
                }
                var10 += this.field597;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "ba", descriptor = "(IIII)V", line = 403)
    public final void method301(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field597) {
            arg2 = this.field597;
        }
        if (arg3 > this.field578) {
            arg3 = this.field578;
        }
        this.field587 = arg0;
        this.field573 = arg2;
        this.field605 = arg1;
        this.field596 = arg3;
        this.method315();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I", line = 422)
    public final int method302(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "()V", line = 424)
    public final void method303() {
    }

    @OriginalMember(owner = "client!wc", name = "pa", descriptor = "()I", line = 427)
    public final int method304() {
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "(III[I)V", line = 431)
    public final void method305(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field572.field6408 * arg2 + this.field572.field6410 * arg1 + this.field572.field6405 * arg0 >> 15) + this.field572.field6409;
        if (var5 >= this.field581 && var5 <= this.field567) {
            int var6 = ((this.field572.field6411 * arg2 + this.field572.field6412 * arg1 + this.field572.field6407 * arg0 >> 15) + this.field572.field6415) * this.field592 / var5;
            int var7 = ((this.field572.field6414 * arg2 + this.field572.field6416 * arg1 + this.field572.field6413 * arg0 >> 15) + this.field572.field6406) * this.field577 / var5;
            if (var6 >= this.field574 && var6 <= this.field604 && var7 >= this.field571 && var7 <= this.field603) {
                arg3[0] = var6 - this.field574;
                arg3[1] = var7 - this.field571;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 455)
    public final void method306(int arg0) {
        if (this.field575 != arg0) {
            this.field575 = arg0;
            this.field588 = new class204[this.field575];
            for (int var2 = 0; var2 < this.field575; ++var2) {
                this.field588[var2] = new class204(this);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZ)Lo;", line = 472)
    public final class24 method307(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field597 * arg1 + arg0;
        int var8 = this.field597 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field594[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class175(this, var6, arg2, arg3);
        } else {
            return new class34(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "()Z", line = 504)
    public final boolean method308() {
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "AA", descriptor = "()I", line = 507)
    public final int method309() {
        return this.field581;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([Le;Lsj;Lc;[Lwp;I)V", line = 511)
    public final void method310(class377[] arg0, class324 arg1, class125 arg2, class122[] arg3, int arg4) {
        class491[] var6 = new class491[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class491) arg0[var7];
            }
        }
        class491 var8 = class491.method2855(this, var6);
        var8.method2849(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lud;)V", line = 525)
    public final void method311(class27 arg0) {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ldd;Z)Lo;", line = 529)
    public final class24 method312(class506 arg0, boolean arg1) {
        int[] var3 = arg0.field7496;
        byte[] var4 = arg0.field7490;
        int var5 = arg0.field7495;
        int var6 = arg0.field7489;
        class94 var11;
        if (arg1 && arg0.field7493 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class439(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7493;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class175(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class175(this, var14, var5, var6);
                var11 = new class34(this, var14, var5, var6);
            }
        }
        var11.method152(arg0.field7497, arg0.field7492, arg0.field7491, arg0.field7494);
        return var11;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lul;[Ldd;Z)Lla;", line = 632)
    public final class319 method313(class411 arg0, class506[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7495;
            var5[var7] = arg1[var7].field7489;
            if (arg1[var7].field7493 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class59(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class89(this, arg0, arg1, var4, var5);
        } else {
            return new class314(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 662)
    public final class38 method314(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class13(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "()V", line = 665)
    private final void method315() {
        this.field574 = this.field587 - this.field600;
        this.field604 = this.field573 - this.field600;
        this.field571 = this.field605 - this.field579;
        this.field603 = this.field596 - this.field579;
        for (int var1 = 0; var1 < this.field575; ++var1) {
            class185 var5 = this.field588[var1].field2907;
            var5.field2678 = this.field600 - this.field587;
            var5.field2669 = this.field579 - this.field605;
            var5.field2667 = this.field573 - this.field587;
            var5.field2676 = this.field596 - this.field605;
        }
        int var2 = this.field605 * this.field597 + this.field587;
        for (int var3 = this.field605; var3 < this.field596; ++var3) {
            for (int var4 = 0; var4 < this.field575; ++var4) {
                this.field588[var4].field2907.field2674[var3 - this.field605] = var2;
            }
            var2 += this.field597;
        }
    }

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "()V", line = 703)
    private final void method316() {
        if (this.field598 != 0.0F) {
            float var1 = (float) this.field567;
            float var2 = (float) this.field581;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field591 / (this.field598 + this.field591);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field598;
            this.field582 = (int) (((float) this.field567 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field582 = this.field567;
        }
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "()Z", line = 725)
    public final boolean method317() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "(III)V", line = 728)
    public final void method318(int arg0, int arg1, int arg2) {
        this.field586 = arg0 & 16777215;
        int var4 = this.field586 >>> 16 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field586 >> 8 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        int var6 = this.field586 & 255;
        if (var6 < 2) {
            var6 = 2;
        }
        this.field586 = var4 << 16 | var5 << 8 | var6;
        if (arg1 < 0) {
            this.field601 = false;
        } else {
            this.field601 = true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "(I)[I", line = 753)
    public final int[] method319(int arg0) {
        class174 var2 = this.field564;
        class374 var3;
        synchronized (this.field564) {
            var3 = (class374) this.field564.method1088((long) arg0, (byte) 100);
            if (var3 == null) {
                if (!super.field4246.method82(arg0, -18226)) {
                    return null;
                }
                class222 var5 = super.field4246.method83(arg0, 89);
                int var6 = !var5.field3186 && !this.field593 ? 128 : 64;
                var3 = new class374(arg0, var6, super.field4246.method81((byte) 106, var6, arg0, 0.7F, true, var6), var5.field3202);
                this.field564.method1097(19627, var3, (long) arg0);
            }
        }
        var3.field5321 = true;
        return var3.method2187();
    }

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "()V", line = 773)
    public final void method320() {
        this.field586 = this.field585;
        this.field568 = false;
    }

    @OriginalMember(owner = "client!wc", name = "sa", descriptor = "(IIII)[I", line = 780)
    public final int[] method321(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field597 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field594[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "()Z", line = 805)
    public final boolean method322() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "()Z", line = 809)
    public final boolean method323() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I", line = 812)
    public final int method324(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "(IIIIII)V", line = 816)
    public final void method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field587) {
            arg2 -= this.field587 - arg0;
            arg0 = this.field587;
        }
        if (arg1 < this.field605) {
            arg3 -= this.field605 - arg1;
            arg1 = this.field605;
        }
        if (arg0 + arg2 > this.field573) {
            arg2 = this.field573 - arg0;
        }
        if (arg1 + arg3 > this.field596) {
            arg3 = this.field596 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field573 && arg1 <= this.field596) {
            int var7 = this.field597 - arg2;
            int var8 = this.field597 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            ++var24;
                            this.field594[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field594[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = (var9 << 24) + ((arg4 & 16711935) * var9 >> 8 & 16711935) + ((arg4 & 65280) * var9 >> 8 & 65280);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field594[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field594[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field594[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field594[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "()Z", line = 951)
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "()Z", line = 954)
    public final boolean method327() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "ZA", descriptor = "(IIIII)V", line = 959)
    public final void method328(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field605) {
            var6 = this.field605;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field596) {
            var7 = this.field596;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field587) {
                    var64 = this.field587;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field573) {
                    var65 = this.field573;
                }
                int var66 = this.field597 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field594[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field587) {
                    var60 = this.field587;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field573 - 1) {
                    var61 = this.field573 - 1;
                }
                int var62 = this.field597 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field594[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field587) {
                    var28 = this.field587;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field573) {
                    var29 = this.field573;
                }
                int var30 = this.field597 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field594[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field594[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field587) {
                    var22 = this.field587;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field573 - 1) {
                    var23 = this.field573 - 1;
                }
                int var24 = this.field597 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field594[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field594[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field587) {
                    var47 = this.field587;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field573) {
                    var48 = this.field573;
                }
                int var49 = this.field597 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field594[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field594[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field587) {
                    var39 = this.field587;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field573 - 1) {
                    var40 = this.field573 - 1;
                }
                int var41 = this.field597 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field594[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field594[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lrl;III)V", line = 1246)
    public final void method329(class517 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0.field7607;
        int var7 = arg3 << 1;
        if (var5 == -1) {
            this.method328(arg1, arg2, arg3, arg0.field7606, 1);
        } else {
            if (this.field606 != var5) {
                class24 var8 = (class24) this.field583.method1088((long) var5, (byte) -111);
                if (var8 == null) {
                    int[] var9 = this.method381(var5);
                    if (var9 == null) {
                        return;
                    }
                    int var10 = this.method383(var5) ? 64 : 128;
                    var8 = this.method344(var9, 0, var10, var10, var10);
                    this.field583.method1097(19627, var8, (long) var5);
                }
                this.field606 = var5;
                this.field607 = var8;
            }
            this.field607.method162(arg1 - arg3, arg2 - arg3, var7, var7, 0, arg0.field7606, 1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIILta;II)V", line = 1284)
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8) {
        class138 var10 = (class138) arg6;
        int[] var11 = var10.field1811;
        int[] var12 = var10.field1812;
        int var13 = this.field605 > arg8 ? this.field605 : arg8;
        int var14 = this.field596 < var11.length + arg8 ? this.field596 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field587) {
                var18 += (this.field587 - arg0) * var20;
                arg0 = this.field587;
            }
            if (var21 >= this.field573) {
                var21 = this.field573 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field597 * var25 + arg0;
                                int var29 = this.field594[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field594[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field597 * var31 + arg0;
                                int var35 = this.field594[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field594[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field594[this.field597 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field587 && var64 < this.field573 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field594[this.field597 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field587 && var50 < this.field573 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field597 * arg1 + var50;
                        int var54 = this.field594[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field594[this.field597 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field587 && var56 < this.field573 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field597 * arg1 + var56;
                        int var60 = this.field594[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field594[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V", line = 1524)
    public final void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class204 var8 = this.method283(Thread.currentThread());
        class185 var9 = var8.field2907;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var17 = arg5 * var16 >> 17;
            int var18 = arg5 * var16 + 1 >> 17;
            int var19 = arg5 * var15 >> 17;
            int var20 = arg5 * var15 + 1 >> 17;
            int var21 = arg0 - var9.method1176();
            int var22 = arg1 - var9.method1173();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field2673 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2673 = 255 - (arg4 >> 24);
            }
            var9.field2666 = var23 < 0 || var23 > var9.field2667 || var24 < 0 || var24 > var9.field2667 || var25 < 0 || var25 > var9.field2667;
            var9.method1175(var27, var28, var29, var23, var24, var25, arg4);
            var9.field2666 = var23 < 0 || var23 > var9.field2667 || var24 < 0 || var24 > var9.field2667 || var26 < 0 || var26 > var9.field2667;
            var9.method1175(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[I[I)Lta;", line = 1593)
    public final class145 method332(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class138(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V", line = 1596)
    public final void method333(int arg0, int arg1, int arg2, int arg3) {
        this.field590 = arg0;
        this.field586 = arg1;
        this.field602 = arg2;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1602)
    public final void method334(Canvas arg0) {
        class426 var2 = (class426) this.field558.method2405((long) arg0.hashCode(), -33);
        if (var2 == null) {
            class426 var3 = class92.method659(60, arg0);
            this.field558.method2413((long) arg0.hashCode(), var3, -1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 1612)
    public final void method335(int arg0) {
        int var2 = arg0 - this.field560;
        for (Object var3 = this.field564.method1094((byte) 44); var3 != null; var3 = this.field564.method1086(11463)) {
            class374 var4 = (class374) var3;
            if (var4.field5321) {
                var4.field5323 += var2;
                int var5 = var4.field5323 / 20;
                if (var5 > 0) {
                    class222 var6 = super.field4246.method83(var4.field5320, 126);
                    var4.method2189(var6.field3192 * var2 * 50 / 1000, var6.field3207 * var2 * 50 / 1000);
                    var4.field5323 -= var5 * 20;
                }
                var4.field5321 = false;
            }
        }
        this.field560 = arg0;
        this.field583.method1087(1, 5);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIII)V", line = 1644)
    public final void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class204 var11 = this.method283(Thread.currentThread());
        class185 var12 = var11.field2907;
        var12.field2672 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field2672 = false;
            var12.field2673 = 0;
            var12.field2666 = true;
            var12.method1172(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field2672 = false;
            var12.field2673 = 255 - var13;
            var12.field2666 = true;
            var12.method1172(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field2672 = true;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()Z", line = 1678)
    public final boolean method337() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "()V", line = 1683)
    private final void method338() {
        for (int var1 = 0; var1 < this.field575; ++var1) {
            this.field588[var1].method1305(true);
        }
        this.method295();
    }

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "()Z", line = 1692)
    public final boolean method339() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(IIIIII)V", line = 1695)
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method387(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method387(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method376(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method376(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field587) {
                    var10 += (this.field587 - arg0) * var12;
                    arg0 = this.field587;
                }
                if (var13 >= this.field573) {
                    var13 = this.field573 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field605 && var17 < this.field596) {
                                int var18 = this.field597 * var17 + arg0;
                                int var19 = this.field594[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field594[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field605 && var21 < this.field596) {
                                int var22 = this.field597 * var21 + arg0;
                                int var23 = this.field594[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field594[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field605 && var27 < this.field596) {
                            this.field594[this.field597 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field605) {
                    var29 += (this.field605 - arg1) * var31;
                    arg1 = this.field605;
                }
                if (var32 >= this.field596) {
                    var32 = this.field596 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field587 && var46 < this.field573) {
                            this.field594[this.field597 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field587 && var36 < this.field573) {
                            int var37 = this.field597 * arg1 + var36;
                            int var38 = this.field594[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field594[this.field597 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field587 && var40 < this.field573) {
                            int var41 = this.field597 * arg1 + var40;
                            int var42 = this.field594[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field594[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V", line = 1907)
    public final void method341() {
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V", line = 1910)
    public final void method342() {
        if (this.field561) {
            class311.method1887(false, true, 0);
            this.field561 = false;
        }
        this.field562 = null;
        this.field559 = null;
        this.field558 = null;
        this.field563 = true;
    }

    @OriginalMember(owner = "client!wc", name = "MA", descriptor = "([I)V", line = 1923)
    public final void method343(int[] arg0) {
        arg0[0] = this.field587;
        arg0[1] = this.field605;
        arg0[2] = this.field573;
        arg0[3] = this.field596;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIIII)Lo;", line = 1930)
    public final class24 method344(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class175(this, arg0, arg1, arg2, arg3, arg4) : new class34(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class175(this, arg0, arg1, arg2, arg3, arg4) : new class34(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Le;Lsj;Lc;Lwp;I)V", line = 1965)
    public final void method345(class377 arg0, class324 arg1, class125 arg2, class122 arg3, int arg4) {
        ((class491) arg0).method2849(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!wc", name = "HA", descriptor = "(IIII)V", line = 1968)
    public final void method346(int arg0, int arg1, int arg2, int arg3) {
        if (this.field587 < arg0) {
            this.field587 = arg0;
        }
        if (this.field605 < arg1) {
            this.field605 = arg1;
        }
        if (this.field573 > arg2) {
            this.field573 = arg2;
        }
        if (this.field596 > arg3) {
            this.field596 = arg3;
        }
        this.method315();
    }

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V", line = 1983)
    public final void method347(int arg0) {
        this.method325(0, 0, this.field597, this.field578, arg0, 0);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(II)V", line = 1986)
    public final void method348(int arg0, int arg1) {
        this.field581 = arg0;
        this.field567 = arg1;
        this.field584 = this.field567 - 255;
        this.method316();
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)V", line = 1992)
    public final void method349(boolean arg0) {
        this.field593 = arg0;
        this.field564.method1096((byte) -48);
    }

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "(I)I", line = 1996)
    public final int method350(int arg0) {
        return super.field4246.method83(arg0, 42).field3204 & 65535;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lud;Lud;FLud;)Lud;", line = 1999)
    public final class27 method351(class27 arg0, class27 arg1, float arg2, class27 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[Lls;)V", line = 2001)
    public final void method352(int arg0, class95[] arg1) {
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 2003)
    public final void method353(int arg0) {
    }

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "()V", line = 2006)
    public final void method354() {
        this.field564.method1096((byte) -35);
    }

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "(IIII)V", line = 2009)
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        this.field585 = this.field586;
        this.field590 = arg0;
        this.field586 = arg1;
        this.field602 = arg2;
        this.field568 = true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ln;)V", line = 2015)
    public final void method356(class15 arg0) {
    }

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "()I", line = 2020)
    public final int method357() {
        return this.field567;
    }

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "()Lc;", line = 2023)
    public final class125 method358() {
        return new class457();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lsj;)V", line = 2028)
    public final void method359(class324 arg0) {
        class218 var2 = arg0.field4726.field228;
        for (class218 var3 = var2.field3163; var2 != var3; var3 = var3.field3163) {
            class517 var4 = (class517) var3;
            int var5 = var4.field7605 >> 12;
            int var6 = var4.field7616 >> 12;
            int var7 = var4.field7615 >> 12;
            int var8 = (this.field572.field6408 * var7 + this.field572.field6410 * var6 + this.field572.field6405 * var5 >> 15) + this.field572.field6409;
            if (var8 >= this.field581 && var8 <= this.field584) {
                int var9 = ((this.field572.field6411 * var7 + this.field572.field6412 * var6 + this.field572.field6407 * var5 >> 15) + this.field572.field6415) * this.field592 / var8 + this.field600;
                int var10 = ((this.field572.field6414 * var7 + this.field572.field6416 * var6 + this.field572.field6413 * var5 >> 15) + this.field572.field6406) * this.field577 / var8 + this.field579;
                if (var9 >= this.field587 && var9 <= this.field573 && var10 >= this.field605 && var10 <= this.field596) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method329(var4, var9, var10, (this.field592 * var4.field7610 >> 12) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "()Z", line = 2064)
    public final boolean method360() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "(IFFFFF)V", line = 2067)
    public final void method361(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field569 = (int) (arg1 * 65535.0F);
        this.field570 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field599 = (int) (arg3 * 65535.0F / var7);
        this.field576 = (int) (arg4 * 65535.0F / var7);
        this.field565 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "()Z", line = 2076)
    public final boolean method362() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()Z", line = 2079)
    public final boolean method363() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "()Z", line = 2082)
    public final boolean method364() {
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "da", descriptor = "(FF)V", line = 2085)
    public final void method365(float arg0, float arg1) {
        this.field591 = arg0;
        this.field598 = arg1;
        this.method316();
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIII)V", line = 2090)
    public final void method366(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!wc", name = "SA", descriptor = "(Lc;)V", line = 2096)
    public final void method367(class125 arg0) {
        this.field572 = (class457) arg0;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "()Lc;", line = 2101)
    public final class125 method368() {
        class204 var1 = this.method283(Thread.currentThread());
        return var1.field2906;
    }

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "()Z", line = 2105)
    public final boolean method369() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2108)
    public final void method370(Canvas arg0) {
        if (this.field559 == arg0) {
            this.method285((Canvas) null);
        }
        class426 var2 = (class426) this.field558.method2405((long) arg0.hashCode(), -37);
        if (var2 != null) {
            var2.method2891(-122);
        }
    }

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "()I", line = 2119)
    public final int method371() {
        return 0;
    }

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "()Z", line = 2122)
    public final boolean method372() {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2126)
    public final void method373(Rectangle[] arg0, int arg1) {
        if (this.field559 != null && this.field562 != null) {
            try {
                Graphics var3 = this.field559.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field597 && var5.y <= this.field578 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field562.method495(var3, var5.width, var5.x, var5.y, -109, var5.height);
                    }
                }
            } catch (Exception var6) {
                this.field559.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "()V", line = 2154)
    public final void method374() {
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 2157)
    public final void method375(int arg0) {
        this.field588[arg0].method1306((byte) 23, Thread.currentThread());
    }

    @OriginalMember(owner = "client!wc", name = "IA", descriptor = "(IIIII)V", line = 2160)
    public final void method376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field587 && arg0 < this.field573) {
            if (arg1 < this.field605) {
                arg2 -= this.field605 - arg1;
                arg1 = this.field605;
            }
            if (arg1 + arg2 > this.field596) {
                arg2 = this.field596 - arg1;
            }
            int var6 = this.field597 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field597 * var10 + var6;
                        int var12 = this.field594[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field594[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field597 * var14 + var6;
                        int var16 = this.field594[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field594[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field594[this.field597 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "()V", line = 2236)
    public final void method377() {
        if (this.field559 != null && this.field562 != null) {
            try {
                Graphics var1 = this.field559.getGraphics();
                this.field562.method497(var1, true, 0, 0);
            } catch (Exception var2) {
                this.field559.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "()I", line = 2253)
    public final int method378() {
        int var1 = this.field566;
        this.field566 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)Ln;", line = 2259)
    public final class15 method379(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIF)Lls;", line = 2263)
    public final class95 method380(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "(I)[I", line = 2271)
    private final int[] method381(int arg0) {
        class174 var2 = this.field564;
        class374 var3;
        synchronized (this.field564) {
            var3 = (class374) this.field564.method1088((long) arg0, (byte) -113);
            if (var3 == null) {
                if (!super.field4246.method82(arg0, -18226)) {
                    return null;
                }
                class222 var5 = super.field4246.method83(arg0, 58);
                int var6 = !var5.field3186 && !this.field593 ? 128 : 64;
                var3 = new class374(arg0, var6, super.field4246.method79(true, var6, arg0, var6, 0.7F, -20550), var5.field3202);
                this.field564.method1097(19627, var3, (long) arg0);
            }
        }
        var3.field5321 = true;
        return var3.method2187();
    }

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "(I)Z", line = 2291)
    public final boolean method382(int arg0) {
        return super.field4246.method83(arg0, 125).field3189;
    }

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "(I)Z", line = 2295)
    public final boolean method383(int arg0) {
        return this.field593 || super.field4246.method83(arg0, 123).field3186;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(IIIIII)Lud;", line = 2301)
    public final class27 method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 2303)
    public final void method385(boolean arg0) {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;)V", line = 2307)
    public class49(int arg0, Canvas arg1, class16 arg2) {
        this(arg0, arg2);
        this.method334(arg1);
        this.method285(arg1);
    }

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "()F", line = 2312)
    public final float method386() {
        return this.field591;
    }

    @OriginalMember(owner = "client!wc", name = "ma", descriptor = "(IIIII)V", line = 2323)
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field605 && arg1 < this.field596) {
            if (arg0 < this.field587) {
                arg2 -= this.field587 - arg0;
                arg0 = this.field587;
            }
            if (arg0 + arg2 > this.field573) {
                arg2 = this.field573 - arg0;
            }
            int var6 = this.field597 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field594[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field594[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field594[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field594[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field594[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "aa", descriptor = "()F", line = 2417)
    public final float method388() {
        return this.field598;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 2465)
    public final void method389(int arg0) {
        this.field588[arg0].method1306((byte) 77, (Runnable) null);
    }

    @OriginalMember(owner = "client!wc", name = "GA", descriptor = "(IIII)V", line = 2468)
    public final void method390(int arg0, int arg1, int arg2, int arg3) {
        this.field600 = arg0;
        this.field579 = arg1;
        this.field592 = arg2;
        this.field577 = arg3;
        this.method315();
    }

    @OriginalMember(owner = "client!wc", name = "VA", descriptor = "(IIIIII)Z", line = 2499)
    public final boolean method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field572.field6408 * arg2 + this.field572.field6410 * arg1 + this.field572.field6405 * arg0 >> 15) + this.field572.field6409;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field572.field6408 * arg5 + this.field572.field6410 * arg4 + this.field572.field6405 * arg3 >> 15) + this.field572.field6409;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field581 || var8 >= this.field581) && (var7 <= this.field567 || var8 <= this.field567)) {
            int var9 = ((this.field572.field6411 * arg2 + this.field572.field6412 * arg1 + this.field572.field6407 * arg0 >> 15) + this.field572.field6415) * this.field592 / var7;
            int var10 = ((this.field572.field6411 * arg5 + this.field572.field6412 * arg4 + this.field572.field6407 * arg3 >> 15) + this.field572.field6415) * this.field592 / var8;
            if (var9 < this.field574 && var10 < this.field574 || var9 > this.field604 && var10 > this.field604) {
                return false;
            } else {
                int var11 = ((this.field572.field6414 * arg2 + this.field572.field6416 * arg1 + this.field572.field6413 * arg0 >> 15) + this.field572.field6406) * this.field577 / var7;
                int var12 = ((this.field572.field6414 * arg5 + this.field572.field6416 * arg4 + this.field572.field6413 * arg3 >> 15) + this.field572.field6406) * this.field577 / var8;
                return (var11 >= this.field571 || var12 >= this.field571) && (var11 <= this.field603 || var12 <= this.field603);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "OA", descriptor = "()I", line = 2535)
    public final int method392() {
        int var1 = this.field589;
        this.field589 = 0;
        return var1;
    }
}
