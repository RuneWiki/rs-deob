import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class468 extends class564 {

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Z")
    private boolean field6662;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Z")
    private boolean field6665;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lwa;")
    private class661 field6664;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public int field6672;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public int field6678;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public int field6675;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public int field6666;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    private int field6683;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public int field6676;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public int field6680;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public int field6687;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public int field6695;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    private int field6698;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
    private boolean field6686;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lad;")
    private class19 field6674;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    private int field6702;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lad;")
    private class19 field6694;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Luv;")
    public class3 field6696;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    private int field6660;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    private int field6669;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public int field6673;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    private int field6677;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public int field6679;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field6685;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public int field6688;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public int field6693;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public int field6697;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public int field6700;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lsca;")
    private class239 field6661;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "Lf;")
    private class534 field6699;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lf;")
    private class534 field6701;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6663;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "[I")
    public int[] field6689;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "[I")
    public int[] field6691;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[Lnw;")
    private class348[] field6668;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "(I)Z")
    public final boolean method2693(int arg0) {
        return this.field6686 || super.field8050.method140(arg0, 862).field3668;
    }

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "(I)[I")
    public final int[] method2694(int arg0) {
        class19 var2 = this.field6694;
        class132 var3;
        synchronized (this.field6694) {
            var3 = (class132) this.field6694.method78(0, (long) arg0);
            if (var3 == null) {
                if (!super.field8050.method144(8649, arg0)) {
                    return null;
                }
                class295 var5 = super.field8050.method140(arg0, 862);
                int var6 = !var5.field3668 && !this.field6686 ? 128 : 64;
                var3 = new class132(arg0, var6, super.field8050.method145(var6, true, 0.7F, -18551, var6, arg0), var5.field3680);
                this.field6694.method92(1, (long) arg0, var3);
            }
        }
        var3.field1479 = true;
        return var3.method745();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lq;)V")
    public final void method992(class490 arg0) {
        this.field6696 = (class3) arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Le;)V")
    public final void method1043(class385 arg0) {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class348 var11 = this.method2699(Thread.currentThread());
        class292 var12 = var11.field4680;
        var12.field3651 = false;
        int var13 = arg0 - this.field6692;
        int var14 = arg2 - this.field6692;
        int var15 = arg4 - this.field6692;
        int var16 = arg1 - this.field6688;
        int var17 = arg3 - this.field6688;
        int var18 = arg5 - this.field6688;
        var12.field3661 = var13 < 0 || var13 > var12.field3657 || var14 < 0 || var14 > var12.field3657 || var15 < 0 || var15 > var12.field3657;
        var12.field3659 = true;
        int var19 = arg6 >>> 24;
        if (arg9 != 0 && (arg9 != 1 || var19 != 255)) {
            if (arg9 == 1) {
                var12.field3649 = 255 - var19;
                var12.field3653 = false;
                var12.method1701(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            } else {
                if (arg9 != 2) {
                    throw new IllegalArgumentException();
                }
                var12.field3649 = 128;
                var12.field3653 = true;
                var12.method1701(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
            }
        } else {
            var12.field3649 = 0;
            var12.field3653 = false;
            var12.method1701(var16, var17, var18, var13, var14, var15, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field3651 = true;
        var12.field3659 = false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Led;IIII)V")
    private final void method2695(class119 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field1331;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2705(arg1, arg2, arg3, arg4, arg0.field1330, 1);
        } else {
            if (this.field6702 != var6) {
                class534 var9 = (class534) this.field6674.method78(0, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method2701(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2693(var6) ? 64 : 128;
                    var9 = this.method1017(var10, 0, var11, var11, var11);
                    this.field6674.method92(1, (long) var6, var9);
                }
                this.field6702 = var6;
                this.field6701 = var9;
            }
            ++var8;
            ((class58) this.field6701).method303(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field1330, 1, 1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lf;Z)V")
    public final void method990(class534 arg0, boolean arg1) {
        if (arg0 instanceof class650) {
            class650 var3 = (class650) arg0;
            this.field6667 = var3.field586;
            this.field6685 = var3.field593;
            this.field6689 = var3.field9142;
            this.field6699 = arg0;
        } else {
            if (!(arg0 instanceof class455)) {
                throw new RuntimeException();
            }
            class455 var4 = (class455) arg0;
            this.field6667 = var4.field586;
            this.field6685 = var4.field593;
            this.field6689 = var4.field6493;
            this.field6699 = arg0;
        }
        this.method2704();
    }

    @OriginalMember(owner = "client!cc", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field6667 * arg1 + arg0;
            int var15 = this.field6667 - arg2;
            if (arg1 + arg3 > this.field6690) {
                arg3 -= arg1 + arg3 - this.field6690;
            }
            if (arg1 < this.field6676) {
                int var16 = this.field6676 - arg1;
                arg3 -= var16;
                var14 += this.field6667 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field6678) {
                int var17 = arg0 + arg2 - this.field6678;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field6675) {
                int var18 = this.field6675 - arg0;
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
                            int var28 = this.field6689[var14];
                            this.field6689[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field6689[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field6689[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field6689[var14++] = arg5;
                        } else {
                            this.field6689[var14++] = arg4;
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

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method2696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field8050.method140(arg6, 862).field3674) {
                if (this.field6702 != arg6) {
                    class534 var11 = (class534) this.field6674.method78(0, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method2701(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2693(arg6) ? 64 : 128;
                        var11 = this.method1017(var12, 0, var13, var13, var13);
                        this.field6674.method92(1, (long) arg6, var11);
                    }
                    this.field6702 = arg6;
                    this.field6701 = var11;
                }
                ((class58) this.field6701).method303(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2705(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "()Z")
    public final boolean method939() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "ya", descriptor = "()V")
    public final void method969() {
        if (this.field6675 == 0 && this.field6678 == this.field6667 && this.field6676 == 0 && this.field6690 == this.field6685) {
            int var1 = this.field6691.length;
            int var2 = var1 - var1 & 7;
            int var3 = 0;
            while (var3 < var2) {
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
                this.field6691[var3++] = Integer.MAX_VALUE;
            }
            while (var3 < var1) {
                this.field6691[var3++] = Integer.MAX_VALUE;
            }
        } else {
            int var4 = this.field6678 - this.field6675;
            int var5 = this.field6690 - this.field6676;
            int var6 = this.field6667 - var4;
            int var7 = this.field6676 * this.field6667 + this.field6675;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field6691[var10] = Integer.MAX_VALUE;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([I)V")
    public final void method996(int[] arg0) {
        arg0[0] = this.field6667;
        arg0[1] = this.field6685;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()V")
    public final void method1045() {
        if (this.field6663 != null) {
            this.field6689 = this.field6661.field2968;
            this.field6667 = this.field6661.field2966;
            this.field6685 = this.field6661.field2964;
        } else {
            this.field6667 = 1;
            this.field6685 = 1;
            this.field6689 = null;
        }
        this.field6699 = null;
        this.method2704();
    }

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "()V")
    private final void method2697() {
        this.field6692 = this.field6675 - this.field6673;
        this.field6679 = this.field6678 - this.field6673;
        this.field6688 = this.field6676 - this.field6682;
        this.field6693 = this.field6690 - this.field6682;
        for (int var1 = 0; var1 < this.field6670; ++var1) {
            class292 var5 = this.field6668[var1].field4680;
            var5.field3644 = this.field6673 - this.field6675;
            var5.field3656 = this.field6682 - this.field6676;
            var5.field3657 = this.field6678 - this.field6675;
            var5.field3650 = this.field6690 - this.field6676;
        }
        int var2 = this.field6676 * this.field6667 + this.field6675;
        for (int var3 = this.field6676; var3 < this.field6690; ++var3) {
            for (int var4 = 0; var4 < this.field6670; ++var4) {
                this.field6668[var4].field4680.field3647[var3 - this.field6676] = var2;
            }
            var2 += this.field6667;
        }
    }

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)Z")
    public final boolean method2698(int arg0) {
        return super.field8050.method144(8649, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lqw;I)V")
    public final void method1048(class332 arg0, int arg1) {
        class348 var3 = this.method2699(Thread.currentThread());
        class536 var4 = arg0.field4171.field760;
        for (class536 var5 = var4.field7499; var4 != var5; var5 = var5.field7499) {
            class119 var6 = (class119) var5;
            int var7 = var6.field1337 >> 12;
            int var8 = var6.field1328 >> 12;
            int var9 = var6.field1335 >> 12;
            float var10 = (float) var9 * this.field6696.field17 + (float) var7 * this.field6696.field24 + (float) var8 * this.field6696.field28 + this.field6696.field44;
            if (!(var10 < (float) this.field6687) && !(var10 > (float) var3.field4659)) {
                int var11 = (int) (((float) var9 * this.field6696.field29 + (float) var7 * this.field6696.field33 + (float) var8 * this.field6696.field41 + this.field6696.field22) * (float) this.field6672 / (float) arg1) + this.field6673;
                int var12 = (int) (((float) var9 * this.field6696.field30 + (float) var7 * this.field6696.field43 + (float) var8 * this.field6696.field21 + this.field6696.field36) * (float) this.field6681 / (float) arg1) + this.field6682;
                if (var11 >= this.field6675 && var11 <= this.field6678 && var12 >= this.field6676 && var12 <= this.field6690) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method2695(var6, var11, var12, (int) var10, (this.field6672 * var6.field1333 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
    public final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1007(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1007(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1030(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1030(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field6675) {
                    var10 += (this.field6675 - arg0) * var12;
                    arg0 = this.field6675;
                }
                if (var13 >= this.field6678) {
                    var13 = this.field6678 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field6676 && var17 < this.field6690) {
                                int var18 = this.field6667 * var17 + arg0;
                                int var19 = this.field6689[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field6689[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field6676 && var21 < this.field6690) {
                                int var22 = this.field6667 * var21 + arg0;
                                int var23 = this.field6689[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field6689[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field6676 && var27 < this.field6690) {
                            this.field6689[this.field6667 * var27 + arg0] = arg4;
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
                if (arg1 < this.field6676) {
                    var29 += (this.field6676 - arg1) * var31;
                    arg1 = this.field6676;
                }
                if (var32 >= this.field6690) {
                    var32 = this.field6690 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field6675 && var46 < this.field6678) {
                            this.field6689[this.field6667 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field6675 && var36 < this.field6678) {
                            int var37 = this.field6667 * arg1 + var36;
                            int var38 = this.field6689[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field6689[this.field6667 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field6675 && var40 < this.field6678) {
                            int var41 = this.field6667 * arg1 + var40;
                            int var42 = this.field6689[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field6689[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lqw;)V")
    public final void method1033(class332 arg0) {
        class348 var2 = this.method2699(Thread.currentThread());
        class536 var3 = arg0.field4171.field760;
        for (class536 var4 = var3.field7499; var3 != var4; var4 = var4.field7499) {
            class119 var5 = (class119) var4;
            int var6 = var5.field1337 >> 12;
            int var7 = var5.field1328 >> 12;
            int var8 = var5.field1335 >> 12;
            float var9 = (float) var8 * this.field6696.field17 + (float) var6 * this.field6696.field24 + (float) var7 * this.field6696.field28 + this.field6696.field44;
            if (!(var9 < (float) this.field6687) && !(var9 > (float) var2.field4659)) {
                int var10 = (int) (((float) var8 * this.field6696.field29 + (float) var6 * this.field6696.field33 + (float) var7 * this.field6696.field41 + this.field6696.field22) * (float) this.field6672 / var9) + this.field6673;
                int var11 = (int) (((float) var8 * this.field6696.field30 + (float) var6 * this.field6696.field43 + (float) var7 * this.field6696.field21 + this.field6696.field36) * (float) this.field6681 / var9) + this.field6682;
                if (var10 >= this.field6675 && var10 <= this.field6678 && var11 >= this.field6676 && var11 <= this.field6690) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method2695(var5, var10, var11, (int) var9, (int) ((float) (this.field6672 * var5.field1333 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "()I")
    public final int method952() {
        int var1 = this.field6698;
        this.field6698 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final void method991(int arg0) {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lnw;")
    public final class348 method2699(Runnable arg0) {
        for (int var2 = 0; var2 < this.field6670; ++var2) {
            if (this.field6668[var2].field4661 == arg0) {
                return this.field6668[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "()Lq;")
    public final class490 method1035() {
        return new class3();
    }

    @OriginalMember(owner = "client!cc", name = "VA", descriptor = "(IFFFFF)V")
    public final void method1032(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field6695 = (int) (arg1 * 65535.0F);
        this.field6666 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field6697 = (int) (arg3 * 65535.0F / var7);
        this.field6684 = (int) (arg4 * 65535.0F / var7);
        this.field6700 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method993(Canvas arg0) {
        if (this.field6663 == arg0) {
            this.method988((Canvas) null);
        }
        class239 var2 = (class239) this.field6664.method3669((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method1922(86);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Llj;Llj;FLlj;)Llj;")
    public final class60 method959(class60 arg0, class60 arg1, float arg2, class60 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class274 method1001(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class391(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public final void method978(int arg0) {
        this.field6670 = arg0;
        this.field6668 = new class348[this.field6670];
        for (int var2 = 0; var2 < this.field6670; ++var2) {
            this.field6668[var2] = new class348(this);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(IIIII)V")
    public final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field6676) {
            var6 = this.field6676;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field6690) {
            var7 = this.field6690;
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
                if (var64 < this.field6675) {
                    var64 = this.field6675;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field6678) {
                    var65 = this.field6678;
                }
                int var66 = this.field6667 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field6689[var66++] = arg3;
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
                if (var60 < this.field6675) {
                    var60 = this.field6675;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field6678 - 1) {
                    var61 = this.field6678 - 1;
                }
                int var62 = this.field6667 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field6689[var62++] = arg3;
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
                if (var28 < this.field6675) {
                    var28 = this.field6675;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field6678) {
                    var29 = this.field6678;
                }
                int var30 = this.field6667 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field6689[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field6689[var30++] = var15 + var33;
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
                if (var22 < this.field6675) {
                    var22 = this.field6675;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field6678 - 1) {
                    var23 = this.field6678 - 1;
                }
                int var24 = this.field6667 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field6689[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field6689[var24++] = var15 + var27;
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
                if (var47 < this.field6675) {
                    var47 = this.field6675;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field6678) {
                    var48 = this.field6678;
                }
                int var49 = this.field6667 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field6689[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field6689[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field6675) {
                    var39 = this.field6675;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field6678 - 1) {
                    var40 = this.field6678 - 1;
                }
                int var41 = this.field6667 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field6689[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field6689[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "()Z")
    public final boolean method2700() {
        return this.field6665;
    }

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "()Z")
    public final boolean method1053() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()Z")
    public final boolean method977() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "ZA", descriptor = "(Z)V")
    public final void method955(boolean arg0) {
        class348 var2 = this.method2699(Thread.currentThread());
        var2.field4656 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(FFF)V")
    public final void method975(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method988(Canvas arg0) {
        if (arg0 != null) {
            class239 var2 = (class239) this.field6664.method3669((long) arg0.hashCode(), -1);
            if (var2 != null) {
                this.field6663 = arg0;
                this.field6661 = var2;
                if (this.field6699 == null) {
                    this.field6689 = var2.field2968;
                    this.field6667 = var2.field2966;
                    this.field6685 = var2.field2964;
                    if (this.field6677 != this.field6667 || this.field6685 != this.field6669) {
                        this.field6677 = this.field6667;
                        this.field6669 = this.field6685;
                        this.field6691 = new int[this.field6677 * this.field6669];
                    }
                    this.method2704();
                    return;
                }
            }
        } else {
            this.field6663 = null;
            this.field6661 = null;
            if (this.field6699 == null) {
                this.field6689 = null;
                this.field6667 = this.field6685 = 1;
                this.field6677 = this.field6669 = 1;
                this.method2704();
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "()Laj;")
    public final class286 method1037() {
        return new class286(0, "Pure Java", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "(I)[I")
    private final int[] method2701(int arg0) {
        class19 var2 = this.field6694;
        class132 var3;
        synchronized (this.field6694) {
            var3 = (class132) this.field6694.method78(0, (long) arg0);
            if (var3 == null) {
                if (!super.field8050.method144(8649, arg0)) {
                    return null;
                }
                class295 var5 = super.field8050.method140(arg0, 862);
                int var6 = !var5.field3668 && !this.field6686 ? 128 : 64;
                var3 = new class132(arg0, var6, super.field8050.method141(true, arg0, var6, 0.7F, 16944, var6), var5.field3680);
                this.field6694.method92(1, (long) arg0, var3);
            }
        }
        var3.field1479 = true;
        return var3.method745();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lqo;Z)Lf;")
    public final class534 method1041(class550 arg0, boolean arg1) {
        int[] var3 = arg0.field7871;
        byte[] var4 = arg0.field7869;
        int var5 = arg0.field7873;
        int var6 = arg0.field7872;
        class58 var11;
        if (arg1 && arg0.field7868 == null) {
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
            var11 = new class433(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field7868;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class455(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class650(this, var14, var5, var6);
            }
        }
        var11.method313(arg0.field7870, arg0.field7867, arg0.field7875, arg0.field7874);
        return var11;
    }

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "(I)I")
    public final int method2702(int arg0) {
        return super.field8050.method140(arg0, 862).field3683 & 65535;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method956(Canvas arg0) {
        class239 var2 = (class239) this.field6664.method3669((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method1922(92);
            class239 var3 = class273.method1605(-1211, arg0);
            this.field6664.method3671(false, var3, (long) arg0.hashCode());
            if (this.field6663 == arg0 && this.field6699 == null) {
                this.field6661 = var3;
                this.field6689 = var3.field2968;
                this.field6667 = var3.field2966;
                this.field6685 = var3.field2964;
                if (this.field6677 != this.field6667 || this.field6685 != this.field6669) {
                    this.field6677 = this.field6667;
                    this.field6669 = this.field6685;
                    this.field6691 = new int[this.field6677 * this.field6669];
                }
                this.method2704();
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)V")
    public final void method942(int arg0) {
        this.field6668[arg0].method2068(10, (Runnable) null);
    }

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "()V")
    public final void method967() {
    }

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "()Z")
    public final boolean method1005() {
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(IIIIII)V")
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1007(arg0, arg1, arg2, arg4, arg5);
        this.method1007(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1030(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1030(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!cc", name = "la", descriptor = "(IIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3) {
        this.field6673 = arg0;
        this.field6682 = arg1;
        this.field6672 = arg2;
        this.field6681 = arg3;
        this.method2697();
    }

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "()V")
    public final void method1049() {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIF)Leq;")
    public final class670 method1010(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
    public final void method1011() {
    }

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "(I)Z")
    public final boolean method2703(int arg0) {
        return super.field8050.method140(arg0, 862).field3665;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public final void method948(int arg0) {
        int var2 = arg0 - this.field6660;
        for (Object var3 = this.field6694.method86((byte) -13); var3 != null; var3 = this.field6694.method90(true)) {
            class132 var4 = (class132) var3;
            if (var4.field1479) {
                var4.field1483 += var2;
                int var5 = var4.field1483 / 20;
                if (var5 > 0) {
                    class295 var6 = super.field8050.method140(var4.field1481, 862);
                    var4.method747(var6.field3673 * var2 * 50 / 1000, var6.field3681 * var2 * 50 / 1000);
                    var4.field1483 -= var5 * 20;
                }
                var4.field1479 = false;
            }
        }
        this.field6660 = arg0;
        this.field6674.method83((byte) -2, 5);
        this.field6694.method83((byte) -2, 5);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8) {
        class409 var10 = (class409) arg6;
        int[] var11 = var10.field5466;
        int[] var12 = var10.field5467;
        int var13 = this.field6676 > arg8 ? this.field6676 : arg8;
        int var14 = this.field6690 < var11.length + arg8 ? this.field6690 : var11.length + arg8;
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
            if (arg0 < this.field6675) {
                var18 += (this.field6675 - arg0) * var20;
                arg0 = this.field6675;
            }
            if (var21 >= this.field6678) {
                var21 = this.field6678 - 1;
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
                                int var28 = this.field6667 * var25 + arg0;
                                int var29 = this.field6689[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field6689[var28] = var23 + var30;
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
                                int var34 = this.field6667 * var31 + arg0;
                                int var35 = this.field6689[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field6689[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field6689[this.field6667 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field6675 && var64 < this.field6678 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field6689[this.field6667 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field6675 && var50 < this.field6678 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field6667 * arg1 + var50;
                        int var54 = this.field6689[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field6689[this.field6667 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field6675 && var56 < this.field6678 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field6667 * arg1 + var56;
                        int var60 = this.field6689[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field6689[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "da", descriptor = "(IIII)V")
    public final void method982(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field6667) {
            arg2 = this.field6667;
        }
        if (arg3 > this.field6685) {
            arg3 = this.field6685;
        }
        this.field6675 = arg0;
        this.field6678 = arg2;
        this.field6676 = arg1;
        this.field6690 = arg3;
        this.method2697();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Leq;)V")
    public final void method1020(int arg0, class670[] arg1) {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public final void method1015(boolean arg0) {
        this.field6686 = arg0;
        this.field6694.method88(72);
    }

    @OriginalMember(owner = "client!cc", name = "BA", descriptor = "()I")
    public final int method966() {
        return this.field6687;
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "()I")
    public final int method953() {
        return 0;
    }

    @OriginalMember(owner = "client!cc", name = "oa", descriptor = "([I)V")
    public final void method963(int[] arg0) {
        arg0[0] = this.field6675;
        arg0[1] = this.field6676;
        arg0[2] = this.field6678;
        arg0[3] = this.field6690;
    }

    @OriginalMember(owner = "client!cc", name = "YA", descriptor = "(IIII)V")
    public final void method1031(int arg0, int arg1, int arg2, int arg3) {
        class348 var5 = this.method2699(Thread.currentThread());
        var5.field4671 = arg0;
        var5.field4662 = arg1;
        var5.field4657 = arg2;
    }

    @OriginalMember(owner = "client!cc", name = "ra", descriptor = "(F)V")
    public final void method949(float arg0) {
        this.field6680 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "(IIIIII)V")
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field6675) {
            arg2 -= this.field6675 - arg0;
            arg0 = this.field6675;
        }
        if (arg1 < this.field6676) {
            arg3 -= this.field6676 - arg1;
            arg1 = this.field6676;
        }
        if (arg0 + arg2 > this.field6678) {
            arg2 = this.field6678 - arg0;
        }
        if (arg1 + arg3 > this.field6690) {
            arg3 = this.field6690 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field6678 && arg1 <= this.field6690) {
            int var7 = this.field6667 - arg2;
            int var8 = this.field6667 * arg1 + arg0;
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
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            ++var24;
                            this.field6689[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field6689[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field6689[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field6689[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field6689[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field6689[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "()Lq;")
    public final class490 method983() {
        return this.field6696;
    }

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "()Z")
    public final boolean method972() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()I")
    public final int method981() {
        return 0;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
    public final int method973(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "()V")
    public final void method974() {
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public final void method954(boolean arg0) {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
    public final void method976(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "()Z")
    public final boolean method946() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lef;IIII)Lda;")
    public final class473 method1051(class581 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class545(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cc", name = "CA", descriptor = "(IIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field6668.length; ++var5) {
            this.field6668[var5].field4658 = this.field6668[var5].field4662;
            this.field6668[var5].field4671 = arg0;
            this.field6668[var5].field4662 = arg1;
            this.field6668[var5].field4657 = arg2;
            this.field6668[var5].field4670 = true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method958(Rectangle[] arg0, int arg1) throws class20 {
        if (this.field6663 != null && this.field6661 != null) {
            try {
                Graphics var3 = this.field6663.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field6667 && var5.y <= this.field6685 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field6661.method1368(var5.y, var5.x, var3, var5.height, (byte) 64, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field6663.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)Le;")
    public final class385 method1012(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lfa;)V")
    private class468(class524 arg0) {
        super(arg0);
        this.field6662 = false;
        this.field6665 = false;
        this.field6664 = new class661(4);
        this.field6672 = 512;
        this.field6678 = 0;
        this.field6675 = 0;
        this.field6666 = 78642;
        this.field6683 = 0;
        this.field6671 = 3500;
        this.field6676 = 0;
        this.field6680 = 75518;
        this.field6681 = 512;
        this.field6687 = 50;
        this.field6695 = 45823;
        this.field6698 = 0;
        this.field6690 = 0;
        this.field6686 = false;
        this.field6674 = new class19(16);
        this.field6702 = -1;
        this.field6694 = new class19(256);
        this.field6696 = new class3();
        this.method978(1);
        this.method1018(0);
        class370.method2159(-14, false, true);
        this.field6662 = true;
        this.field6660 = (int) class557.method3157(-57);
    }

    @OriginalMember(owner = "client!cc", name = "DA", descriptor = "()I")
    public final int method1021() {
        int var1 = this.field6683;
        this.field6683 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method968(Canvas arg0) {
        class239 var2 = (class239) this.field6664.method3669((long) arg0.hashCode(), -1);
        if (var2 == null) {
            class239 var3 = class273.method1605(-1211, arg0);
            this.field6664.method3671(false, var3, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    public final void method1029() {
        if (this.field6662) {
            class694.method3817(false, true, (byte) 43);
            this.field6662 = false;
        }
        this.field6661 = null;
        this.field6663 = null;
        this.field6664 = null;
        this.field6665 = true;
    }

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "()V")
    public final void method1047() {
        for (int var1 = 0; var1 < this.field6668.length; ++var1) {
            this.field6668[var1].field4662 = this.field6668[var1].field4658;
            this.field6668[var1].field4670 = false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "()Lq;")
    public final class490 method950() {
        class348 var1 = this.method2699(Thread.currentThread());
        return var1.field4667;
    }

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "()Z")
    public final boolean method1038() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class348 var8 = this.method2699(Thread.currentThread());
        class292 var9 = var8.field4680;
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
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method1710();
            int var24 = arg1 - var9.method1707();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field3649 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3649 = 255 - (arg4 >>> 24);
            }
            this.method955(false);
            var9.field3661 = var25 < 0 || var25 > var9.field3657 || var26 < 0 || var26 > var9.field3657 || var27 < 0 || var27 > var9.field3657;
            var9.method1706(var29, var30, var31, var25, var26, var27, 100, 100, 100, arg4);
            var9.field3661 = var25 < 0 || var25 > var9.field3657 || var27 < 0 || var27 > var9.field3657 || var28 < 0 || var28 > var9.field3657;
            var9.method1706(var29, var31, var32, var25, var27, var28, 100, 100, 100, arg4);
            this.method955(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([IIIII)Lf;")
    public final class534 method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class455(this, arg0, arg1, arg2, arg3, arg4) : new class650(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class455(this, arg0, arg1, arg2, arg3, arg4) : new class650(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Llj;)V")
    public final void method947(class60 arg0) {
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public final int method1004(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "()V")
    private final void method2704() {
        for (int var1 = 0; var1 < this.field6670; ++var1) {
            this.field6668[var1].method2069(0);
        }
        this.method1050();
    }

    @OriginalMember(owner = "client!cc", name = "JA", descriptor = "()V")
    public final void method1050() {
        this.field6675 = 0;
        this.field6676 = 0;
        this.field6678 = this.field6667;
        this.field6690 = this.field6685;
        this.method2697();
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()Z")
    public final boolean method1044() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZ)Lf;")
    public final class534 method1025(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class455(this, arg0, arg1) : new class650(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "()Z")
    public final boolean method1042() {
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "()Z")
    public final boolean method960() {
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "()V")
    public final void method979() throws class20 {
        if (this.field6663 != null && this.field6661 != null) {
            try {
                Graphics var1 = this.field6663.getGraphics();
                this.field6661.method1366(0, var1, 0, true);
            } catch (Exception var2) {
                this.field6663.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!cc", name = "MA", descriptor = "(III[I)V")
    public final void method970(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field6696.field17 + (float) arg0 * this.field6696.field24 + (float) arg1 * this.field6696.field28 + this.field6696.field44;
        if (!(var5 < (float) this.field6687) && !(var5 > (float) this.field6671)) {
            int var6 = (int) (((float) arg2 * this.field6696.field29 + (float) arg0 * this.field6696.field33 + (float) arg1 * this.field6696.field41 + this.field6696.field22) * (float) this.field6672 / var5);
            int var7 = (int) (((float) arg2 * this.field6696.field30 + (float) arg0 * this.field6696.field43 + (float) arg1 * this.field6696.field21 + this.field6696.field36) * (float) this.field6681 / var5);
            arg3[0] = var6 - this.field6692;
            arg3[1] = var7 - this.field6688;
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "AA", descriptor = "(III[I)V")
    public final void method1019(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field6696.field17 + (float) arg0 * this.field6696.field24 + (float) arg1 * this.field6696.field28 + this.field6696.field44;
        if (!(var5 < (float) this.field6687) && !(var5 > (float) this.field6671)) {
            int var6 = (int) (((float) arg2 * this.field6696.field29 + (float) arg0 * this.field6696.field33 + (float) arg1 * this.field6696.field41 + this.field6696.field22) * (float) this.field6672 / var5);
            int var7 = (int) (((float) arg2 * this.field6696.field30 + (float) arg0 * this.field6696.field43 + (float) arg1 * this.field6696.field21 + this.field6696.field36) * (float) this.field6681 / var5);
            if (var6 >= this.field6692 && var6 <= this.field6679 && var7 >= this.field6688 && var7 <= this.field6693) {
                arg3[0] = var6 - this.field6692;
                arg3[1] = var7 - this.field6688;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()Z")
    public final boolean method1052() {
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "()Z")
    public final boolean method994() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "FA", descriptor = "(ILua;II)V")
    public final void method1036(int arg0, class598 arg1, int arg2, int arg3) {
        class409 var5 = (class409) arg1;
        int[] var6 = var5.field5466;
        int[] var7 = var5.field5467;
        int var8;
        if (this.field6690 < var6.length + arg3) {
            var8 = this.field6690 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field6676 > arg3) {
            var9 = this.field6676 - arg3;
            arg3 = this.field6676;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field6667 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field6675 > var12) {
                    var13 -= this.field6675 - var12;
                    var12 = this.field6675;
                }
                if (this.field6678 < var12 + var13) {
                    var13 = this.field6678 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field6689[var14++] = arg0;
                }
                var10 += this.field6667;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "()[I")
    public final int[] method938() {
        return new int[] { this.field6673, this.field6682, this.field6672, this.field6681 };
    }

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field6696.field17 + (float) arg0 * this.field6696.field24 + (float) arg1 * this.field6696.field28 + this.field6696.field44;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field6696.field17 + (float) arg3 * this.field6696.field24 + (float) arg4 * this.field6696.field28 + this.field6696.field44;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field6687) || !(var8 < (float) this.field6687)) && (!(var7 > (float) this.field6671) || !(var8 > (float) this.field6671))) {
            int var9 = (int) (((float) arg2 * this.field6696.field29 + (float) arg0 * this.field6696.field33 + (float) arg1 * this.field6696.field41 + this.field6696.field22) * (float) this.field6672 / var7);
            int var10 = (int) (((float) arg5 * this.field6696.field29 + (float) arg3 * this.field6696.field33 + (float) arg4 * this.field6696.field41 + this.field6696.field22) * (float) this.field6672 / var8);
            if (var9 < this.field6692 && var10 < this.field6692 || var9 > this.field6679 && var10 > this.field6679) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field6696.field30 + (float) arg0 * this.field6696.field43 + (float) arg1 * this.field6696.field21 + this.field6696.field36) * (float) this.field6681 / var7);
                int var12 = (int) (((float) arg5 * this.field6696.field30 + (float) arg3 * this.field6696.field43 + (float) arg4 * this.field6696.field21 + this.field6696.field36) * (float) this.field6681 / var8);
                return (var11 >= this.field6688 || var12 >= this.field6688) && (var11 <= this.field6693 || var12 <= this.field6693);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "XA", descriptor = "(IIIII)V")
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field6676 && arg1 < this.field6690) {
            if (arg0 < this.field6675) {
                arg2 -= this.field6675 - arg0;
                arg0 = this.field6675;
            }
            if (arg0 + arg2 > this.field6678) {
                arg2 = this.field6678 - arg0;
            }
            int var6 = this.field6667 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6689[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field6689[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field6689[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field6689[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field6689[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "GA", descriptor = "(II)V")
    public final void method1016(int arg0, int arg1) {
        class348 var3 = this.method2699(Thread.currentThread());
        this.field6687 = arg0;
        this.field6671 = arg1;
        var3.field4659 = this.field6671 - 255;
    }

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "()Z")
    public final boolean method1008() {
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "ja", descriptor = "(I)V")
    public final void method1002(int arg0) {
        this.method1022(0, 0, this.field6667, this.field6685, arg0, 0);
    }

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "(IIII)V")
    public final void method941(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6675 < arg0) {
            this.field6675 = arg0;
        }
        if (this.field6676 < arg1) {
            this.field6676 = arg1;
        }
        if (this.field6678 > arg2) {
            this.field6678 = arg2;
        }
        if (this.field6690 > arg3) {
            this.field6690 = arg3;
        }
        this.method2697();
    }

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "()I")
    public final int method971() {
        return this.field6671;
    }

    @OriginalMember(owner = "client!cc", name = "va", descriptor = "(I)V")
    public final void method1027(int arg0) {
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(IIII)[I")
    public final int[] method944(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field6667 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field6689[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(IIIIII)V")
    private final void method2705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg2 << 8;
        int var8 = arg1 - arg3;
        if (var8 < this.field6676) {
            var8 = this.field6676;
        }
        int var9 = arg1 + arg3 + 1;
        if (var9 > this.field6690) {
            var9 = this.field6690;
        }
        int var10 = var8;
        int var11 = arg3 * arg3;
        int var12 = 0;
        int var13 = arg1 - var8;
        int var14 = var13 * var13;
        int var15 = var14 - var13;
        if (arg1 > var9) {
            arg1 = var9;
        }
        int var16 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var16 == 255) {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var66 = arg0 - var12 + 1;
                if (var66 < this.field6675) {
                    var66 = this.field6675;
                }
                int var67 = arg0 + var12;
                if (var67 > this.field6678) {
                    var67 = this.field6678;
                }
                int var68 = this.field6667 * var10 + var66;
                for (int var69 = var66; var69 < var67; ++var69) {
                    if (var7 < this.field6691[var68]) {
                        this.field6689[var68] = arg4;
                    }
                    ++var68;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var57 = arg3;
            int var58 = var10 - arg1;
            int var59 = var58 * var58 + var11;
            int var60 = var59 - arg3;
            int var61 = var59 - var58;
            while (var10 < var9) {
                while (var61 > var11 && var60 > var11) {
                    var61 -= var57-- + var57;
                    var60 -= var57 + var57;
                }
                int var62 = arg0 - var57;
                if (var62 < this.field6675) {
                    var62 = this.field6675;
                }
                int var63 = arg0 + var57;
                if (var63 > this.field6678 - 1) {
                    var63 = this.field6678 - 1;
                }
                int var64 = this.field6667 * var10 + var62;
                for (int var65 = var62; var65 <= var63; ++var65) {
                    if (var7 < this.field6691[var64]) {
                        this.field6689[var64] = arg4;
                    }
                    ++var64;
                }
                ++var10;
                var61 += var58 + var58;
                var60 += var58++ + var58;
            }
        } else if (arg5 == 1) {
            int var17 = (var16 << 24) + ((arg4 & 16711935) * var16 >> 8 & 16711935) + ((arg4 & 65280) * var16 >> 8 & 65280);
            int var18 = 256 - var16;
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var30 = arg0 - var12 + 1;
                if (var30 < this.field6675) {
                    var30 = this.field6675;
                }
                int var31 = arg0 + var12;
                if (var31 > this.field6678) {
                    var31 = this.field6678;
                }
                int var32 = this.field6667 * var10 + var30;
                for (int var33 = var30; var33 < var31; ++var33) {
                    if (var7 < this.field6691[var32]) {
                        int var34 = this.field6689[var32];
                        int var35 = ((var34 & 16711935) * var18 >> 8 & 16711935) + ((var34 & 65280) * var18 >> 8 & 65280);
                        this.field6689[var32] = var17 + var35;
                    }
                    ++var32;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var19 = arg3;
            int var20 = -var13;
            int var21 = var20 * var20 + var11;
            int var22 = var21 - arg3;
            int var23 = var21 - var20;
            while (var10 < var9) {
                while (var23 > var11 && var22 > var11) {
                    var23 -= var19-- + var19;
                    var22 -= var19 + var19;
                }
                int var24 = arg0 - var19;
                if (var24 < this.field6675) {
                    var24 = this.field6675;
                }
                int var25 = arg0 + var19;
                if (var25 > this.field6678 - 1) {
                    var25 = this.field6678 - 1;
                }
                int var26 = this.field6667 * var10 + var24;
                for (int var27 = var24; var27 <= var25; ++var27) {
                    if (var7 < this.field6691[var26]) {
                        int var28 = this.field6689[var26];
                        int var29 = ((var28 & 16711935) * var18 >> 8 & 16711935) + ((var28 & 65280) * var18 >> 8 & 65280);
                        this.field6689[var26] = var17 + var29;
                    }
                    ++var26;
                }
                ++var10;
                var23 += var20 + var20;
                var22 += var20++ + var20;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var10 < arg1) {
                while (var15 <= var11 || var14 <= var11) {
                    var14 += var12 + var12;
                    var15 += var12++ + var12;
                }
                int var49 = arg0 - var12 + 1;
                if (var49 < this.field6675) {
                    var49 = this.field6675;
                }
                int var50 = arg0 + var12;
                if (var50 > this.field6678) {
                    var50 = this.field6678;
                }
                int var51 = this.field6667 * var10 + var49;
                for (int var52 = var49; var52 < var50; ++var52) {
                    if (var7 < this.field6691[var51]) {
                        int var53 = this.field6689[var51];
                        int var54 = arg4 + var53;
                        int var55 = (arg4 & 16711935) + (var53 & 16711935);
                        int var56 = (var54 - var55 & 65536) + (var55 & 16777472);
                        this.field6689[var51] = var54 - var56 | var56 - (var56 >>> 8);
                    }
                    ++var51;
                }
                ++var10;
                var14 -= var13-- + var13;
                var15 -= var13 + var13;
            }
            int var36 = arg3;
            int var37 = -var13;
            int var38 = var37 * var37 + var11;
            int var39 = var38 - arg3;
            int var40 = var38 - var37;
            while (var10 < var9) {
                while (var40 > var11 && var39 > var11) {
                    var40 -= var36-- + var36;
                    var39 -= var36 + var36;
                }
                int var41 = arg0 - var36;
                if (var41 < this.field6675) {
                    var41 = this.field6675;
                }
                int var42 = arg0 + var36;
                if (var42 > this.field6678 - 1) {
                    var42 = this.field6678 - 1;
                }
                int var43 = this.field6667 * var10 + var41;
                for (int var44 = var41; var44 <= var42; ++var44) {
                    if (var7 < this.field6691[var43]) {
                        int var45 = this.field6689[var43];
                        int var46 = arg4 + var45;
                        int var47 = (arg4 & 16711935) + (var45 & 16711935);
                        int var48 = (var46 - var47 & 65536) + (var47 & 16777472);
                        this.field6689[var43] = var46 - var48 | var48 - (var48 >>> 8);
                    }
                    ++var43;
                }
                ++var10;
                var40 += var37 + var37;
                var39 += var37++ + var37;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    public final void method1018(int arg0) {
        this.field6668[arg0].method2068(10, Thread.currentThread());
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class534 method951(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field6667 * arg1 + arg0;
        int var8 = this.field6667 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field6689[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class455(this, var6, arg2, arg3);
        } else {
            return new class650(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lho;[Lqo;Z)Lla;")
    public final class413 method998(class463 arg0, class550[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7873;
            var5[var7] = arg1[var7].field7872;
            if (arg1[var7].field7868 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class577(this, arg0, arg1, var4, var5);
            } else {
                return new class548(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class532(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "(IIIII)V")
    public final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field6675 && arg0 < this.field6678) {
            if (arg1 < this.field6676) {
                arg2 -= this.field6676 - arg1;
                arg1 = this.field6676;
            }
            if (arg1 + arg2 > this.field6690) {
                arg2 = this.field6690 - arg1;
            }
            int var6 = this.field6667 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field6667 * var10 + var6;
                        int var12 = this.field6689[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field6689[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field6667 * var14 + var6;
                        int var16 = this.field6689[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field6689[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field6689[this.field6667 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[I[I)Lua;")
    public final class598 method940(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class409(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(IIIIII)Llj;")
    public final class60 method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class468(Canvas arg0, class524 arg1) {
        this(arg1);
        this.method968(arg0);
        this.method988(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "pa", descriptor = "(III)V")
    public final void method937(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6668.length; ++var4) {
            class348 var5 = this.field6668[var4];
            var5.field4662 = arg0 & 16777215;
            int var6 = var5.field4662 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field4662 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field4662 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field4662 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field4669 = false;
            } else {
                var5.field4669 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "()V")
    public final void method1000() {
        this.field6694.method88(69);
        this.field6674.method88(57);
    }

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "()Z")
    public final boolean method965() {
        return false;
    }
}
