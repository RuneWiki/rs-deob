import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class416 extends class269 {

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    public int field5965 = 0;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
    private int field5958 = 3500;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public int field5954 = 0;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public int field5974 = 45823;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    public int field5971 = 0;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    private int field5966 = 0;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    public int field5960 = this.field5958 - 255;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public int field5963 = 75518;

    @OriginalMember(owner = "client!dq", name = "ab", descriptor = "I")
    public int field5979 = 512;

    @OriginalMember(owner = "client!dq", name = "cb", descriptor = "I")
    public int field5981 = 50;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public int field5950 = 0;

    @OriginalMember(owner = "client!dq", name = "gb", descriptor = "I")
    public int field5985 = 0;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
    public int field5970 = 3500;

    @OriginalMember(owner = "client!dq", name = "ib", descriptor = "I")
    public int field5987 = 78642;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public int field5961 = 0;

    @OriginalMember(owner = "client!dq", name = "Z", descriptor = "I")
    public int field5978 = 0;

    @OriginalMember(owner = "client!dq", name = "X", descriptor = "I")
    private int field5976 = 0;

    @OriginalMember(owner = "client!dq", name = "jb", descriptor = "I")
    private int field5988 = 0;

    @OriginalMember(owner = "client!dq", name = "hb", descriptor = "Z")
    public boolean field5986 = false;

    @OriginalMember(owner = "client!dq", name = "mb", descriptor = "I")
    public int field5991 = 512;

    @OriginalMember(owner = "client!dq", name = "lb", descriptor = "Z")
    private boolean field5990 = false;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "Z")
    private boolean field5967 = false;

    @OriginalMember(owner = "client!dq", name = "eb", descriptor = "Z")
    private boolean field5983 = false;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "Lub;")
    private class15 field5969 = new class15(16);

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5959;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "Lbk;")
    public class211 field5948;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "Leg;")
    private class56 field5953;

    @OriginalMember(owner = "client!dq", name = "fb", descriptor = "[I")
    public int[] field5984;

    @OriginalMember(owner = "client!dq", name = "bb", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    private int field5949;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "F")
    private float field5964;

    @OriginalMember(owner = "client!dq", name = "kb", descriptor = "F")
    private float field5989;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public int field5946;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    public int field5951;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    public int field5952;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public int field5962;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!dq", name = "Y", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!dq", name = "db", descriptor = "I")
    private int field5982;

    @OriginalMember(owner = "client!dq", name = "nb", descriptor = "I")
    public int field5992;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "Lub;")
    private class15 field5956;

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "Lel;")
    public class326 field5973;

    @OriginalMember(owner = "client!dq", name = "ob", descriptor = "Lmc;")
    private class69 field5993;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "Z")
    public boolean field5955;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "[Les;")
    private class214[] field5947;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 4)
    public final void method1007(int arg0) {
        int var2 = arg0 - this.field5982;
        for (Object var3 = this.field5956.method96((byte) 115); var3 != null; var3 = this.field5956.method93(-26269)) {
            class389 var4 = (class389) var3;
            if (var4.field5479) {
                var4.field5475 += var2;
                int var5 = var4.field5475 / 20;
                if (var5 > 0) {
                    class287 var6 = this.field5948.method1475(var4.field5478, 17673);
                    var4.method2458(var6.field4174 * var2 * 50 / 1000, var6.field4168 * var2 * 50 / 1000);
                    var4.field5475 -= var5 * 20;
                }
                var4.field5479 = false;
            }
        }
        this.field5982 = arg0;
        this.field5969.method91(4, 5);
    }

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "()I", line = 36)
    public final int method906() {
        return this.field5958;
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(IIIIII)V", line = 39)
    public final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method990(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method990(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method946(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method946(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field5978) {
                    var10 += (this.field5978 - arg0) * var12;
                    arg0 = this.field5978;
                }
                if (var13 >= this.field5961) {
                    var13 = this.field5961 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field5985 && var17 < this.field5965) {
                                int var18 = this.field5980 * var17 + arg0;
                                int var19 = this.field5984[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field5984[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field5985 && var21 < this.field5965) {
                                int var22 = this.field5980 * var21 + arg0;
                                int var23 = this.field5984[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field5984[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field5985 && var27 < this.field5965) {
                            this.field5984[this.field5980 * var27 + arg0] = arg4;
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
                if (arg1 < this.field5985) {
                    var29 += (this.field5985 - arg1) * var31;
                    arg1 = this.field5985;
                }
                if (var32 >= this.field5965) {
                    var32 = this.field5965 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field5978 && var46 < this.field5961) {
                            this.field5984[this.field5980 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field5978 && var36 < this.field5961) {
                            int var37 = this.field5980 * arg1 + var36;
                            int var38 = this.field5984[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field5984[this.field5980 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field5978 && var40 < this.field5961) {
                            int var41 = this.field5980 * arg1 + var40;
                            int var42 = this.field5984[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field5984[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "()V", line = 253)
    public final void method882() {
        if (this.field5959 != null && this.field5953 != null) {
            try {
                Graphics var1 = this.field5959.getGraphics();
                this.field5953.method367(true, var1, 0, 0);
            } catch (Exception var2) {
                this.field5959.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III[I)V", line = 267)
    public final void method914(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field5973.field4732 * arg2 + this.field5973.field4730 * arg1 + this.field5973.field4729 * arg0 >> 15) + this.field5973.field4731;
        if (var5 >= this.field5981 && var5 <= this.field5958) {
            int var6 = ((this.field5973.field4726 * arg2 + this.field5973.field4736 * arg1 + this.field5973.field4734 * arg0 >> 15) + this.field5973.field4733) * this.field5991 / var5;
            int var7 = ((this.field5973.field4735 * arg2 + this.field5973.field4728 * arg1 + this.field5973.field4727 * arg0 >> 15) + this.field5973.field4737) * this.field5979 / var5;
            if (var6 >= this.field5975 && var6 <= this.field5951 && var7 >= this.field5968 && var7 <= this.field5992) {
                arg3[0] = var6 - this.field5975;
                arg3[1] = var7 - this.field5968;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 292)
    public final void method886(int arg0) {
        this.method1012(0, 0, this.field5980, this.field5949, arg0, 0);
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "()V", line = 294)
    public final void method911() {
    }

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "()Z", line = 298)
    public final boolean method887() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[[I[[IIII)Luh;", line = 301)
    public final class92 method997(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class188(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "()Ls;", line = 305)
    public final class154 method884() {
        class214 var1 = this.method2618(Thread.currentThread());
        return var1.field3021;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lro;Lro;FLro;)Lro;", line = 309)
    public final class1 method993(class1 arg0, class1 arg1, float arg2, class1 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(IIIIII)Lro;", line = 312)
    public final class1 method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V", line = 315)
    public final void method1005(int arg0) {
        this.field5947[arg0].method1495((Runnable) null, (byte) 46);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lrm;)V", line = 319)
    public final void method928(class235 arg0) {
        class299 var2 = arg0.field3458.field91;
        for (class299 var3 = var2.field4339; var2 != var3; var3 = var3.field4339) {
            class401 var4 = (class401) var3;
            int var5 = var4.field5638 >> 12;
            int var6 = var4.field5627 >> 12;
            int var7 = var4.field5632 >> 12;
            int var8 = (this.field5973.field4732 * var7 + this.field5973.field4730 * var6 + this.field5973.field4729 * var5 >> 15) + this.field5973.field4731;
            if (var8 >= this.field5981 && var8 <= this.field5958) {
                int var9 = ((this.field5973.field4726 * var7 + this.field5973.field4736 * var6 + this.field5973.field4734 * var5 >> 15) + this.field5973.field4733) * this.field5991 / var8 + this.field5952;
                int var10 = ((this.field5973.field4735 * var7 + this.field5973.field4728 * var6 + this.field5973.field4727 * var5 >> 15) + this.field5973.field4737) * this.field5979 / var8 + this.field5972;
                if (var9 >= this.field5978 && var9 <= this.field5961 && var10 >= this.field5985 && var10 <= this.field5965) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2623(var4, var9, var10, (var4.field5636 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(III)V", line = 356)
    public final void method893(int arg0, int arg1, int arg2) {
        this.field5954 = arg0;
        this.field5950 = arg1;
        this.field5971 = arg2;
    }

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "()I", line = 362)
    public final int method895() {
        return 0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V", line = 365)
    public final void method980(int arg0, int arg1) {
        this.field5981 = arg0;
        this.field5958 = arg1;
        this.field5960 = this.field5958 - 255;
        this.method2619();
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "()Z", line = 371)
    public final boolean method920() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IFFFFF)V", line = 374)
    public final void method873(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field5974 = (int) (arg1 * 65535.0F);
        this.field5987 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field5977 = (int) (arg3 * 65535.0F / var7);
        this.field5946 = (int) (arg4 * 65535.0F / var7);
        this.field5962 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(FFF)V", line = 382)
    public final void method965(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[I[I)Lsg;", line = 386)
    public final class226 method1022(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class447(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "()V", line = 389)
    public final void method931() {
        this.field5978 = 0;
        this.field5985 = 0;
        this.field5961 = this.field5980;
        this.field5965 = this.field5949;
        this.method2626();
    }

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "()I", line = 398)
    public final int method959() {
        int var1 = this.field5988;
        this.field5988 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(IIII)[I", line = 404)
    public final int[] method898(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field5980 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field5984[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "()I", line = 429)
    public final int method892() {
        return this.field5981;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 433)
    public final void method1025(Rectangle[] arg0, int arg1) {
        if (this.field5959 != null && this.field5953 != null) {
            try {
                Graphics var3 = this.field5959.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field5980 && var5.y <= this.field5949 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field5953.method368(var5.width, var5.x, 23608, var5.height, var5.y, var3);
                    }
                }
            } catch (Exception var6) {
                this.field5959.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "(I)Z", line = 458)
    public final boolean method2617(int arg0) {
        return this.field5948.method1471(-31571, arg0);
    }

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "()Z", line = 461)
    public final boolean method891() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 464)
    public final void method1017(Canvas arg0) {
        this.field5959 = arg0;
        this.method950();
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(Z)V", line = 468)
    public final void method874(boolean arg0) {
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(IIIIII)V", line = 471)
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method990(arg0, arg1, arg2, arg4, arg5);
        this.method990(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method946(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method946(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "()Z", line = 477)
    public final boolean method976() {
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lk;Z)Lvj;", line = 481)
    public final class256 method870(class337 arg0, boolean arg1) {
        int[] var3 = arg0.field4881;
        byte[] var4 = arg0.field4884;
        int var5 = arg0.field4886;
        int var6 = arg0.field4888;
        class300 var11;
        if (arg1 && arg0.field4885 == null) {
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
            var11 = new class290(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field4885;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class123(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class123(this, var14, var5, var6);
                var11 = new class388(this, var14, var5, var6);
            }
        }
        var11.method85(arg0.field4883, arg0.field4880, arg0.field4887, arg0.field4882);
        return var11;
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "()V", line = 585)
    public final void method967() {
        this.field5950 = this.field5976;
        this.field5986 = false;
    }

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "()V", line = 590)
    public final void method970() {
        if (this.field5983) {
            class247.method1723(false, -18668, true);
            this.field5983 = false;
        }
        this.field5959 = null;
        this.field5948 = null;
        this.field5953 = null;
        this.field5967 = true;
    }

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "()Z", line = 605)
    public final boolean method971() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "()V", line = 608)
    public final void method950() {
        this.field5953 = class106.method623(this.field5959, (byte) 59);
        this.field5984 = this.field5953.field757;
        this.field5980 = this.field5953.field756;
        this.field5949 = this.field5953.field755;
        for (int var1 = 0; var1 < this.field5957; ++var1) {
            this.field5947[var1].method1497(-122);
        }
        this.method931();
    }

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "()I", line = 623)
    public final int method896() {
        int var1 = this.field5966;
        this.field5966 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIII[BII)V", line = 628)
    public final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field5980 * arg1 + arg0;
            int var15 = this.field5980 - arg2;
            if (arg1 + arg3 > this.field5965) {
                arg3 -= arg1 + arg3 - this.field5965;
            }
            if (arg1 < this.field5985) {
                int var16 = this.field5985 - arg1;
                arg3 -= var16;
                var14 += this.field5980 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field5961) {
                int var17 = arg0 + arg2 - this.field5961;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field5978) {
                int var18 = this.field5978 - arg0;
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
                            int var28 = this.field5984[var14];
                            this.field5984[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field5984[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field5984[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field5984[var14++] = arg5;
                        } else {
                            this.field5984[var14++] = arg4;
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

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(II)I", line = 803)
    public final int method863(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lbb;[Lk;Z)Lug;", line = 807)
    public final class335 method1024(class182 arg0, class337[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4886;
            var5[var7] = arg1[var7].field4888;
            if (arg1[var7].field4885 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class263(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class364(this, arg0, arg1, var4, var5);
        } else {
            return new class422(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIZ)Lvj;", line = 838)
    public final class256 method1027(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field5980 * arg1 + arg0;
        int var8 = this.field5980 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field5984[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class123(this, var6, arg2, arg3);
        } else {
            return new class388(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(IIII)V", line = 870)
    public final void method1004(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5978 < arg0) {
            this.field5978 = arg0;
        }
        if (this.field5985 < arg1) {
            this.field5985 = arg1;
        }
        if (this.field5961 > arg2) {
            this.field5961 = arg2;
        }
        if (this.field5965 > arg3) {
            this.field5965 = arg3;
        }
        this.method2626();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILsg;II)V", line = 890)
    public final void method871(int arg0, class226 arg1, int arg2, int arg3) {
        class447 var5 = (class447) arg1;
        int[] var6 = var5.field6382;
        int[] var7 = var5.field6386;
        int var8;
        if (this.field5965 < var6.length + arg3) {
            var8 = this.field5965 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field5985 > arg3) {
            var9 = this.field5985 - arg3;
            arg3 = this.field5985;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field5980 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field5978 > var12) {
                    var13 -= this.field5978 - var12;
                    var12 = this.field5978;
                }
                if (this.field5961 < var12 + var13) {
                    var13 = this.field5961 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field5984[var14++] = arg0;
                }
                var10 += this.field5980;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "()Z", line = 947)
    public final boolean method964() {
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "()Z", line = 950)
    public final boolean method1026() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "()Z", line = 953)
    public final boolean method930() {
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([I)V", line = 957)
    public final void method904(int[] arg0) {
        arg0[0] = this.field5978;
        arg0[1] = this.field5985;
        arg0[2] = this.field5961;
        arg0[3] = this.field5965;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Runnable;)Les;", line = 965)
    public final class214 method2618(Runnable arg0) {
        for (int var2 = 0; var2 < this.field5957; ++var2) {
            if (this.field5947[var2].field3019 == arg0) {
                return this.field5947[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "()Z", line = 977)
    public final boolean method880() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lni;Lrm;Ls;Lrh;I)V", line = 981)
    public final void method1013(class305 arg0, class235 arg1, class154 arg2, class144 arg3, int arg4) {
        ((class116) arg0).method692(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)V", line = 986)
    public final void method1006(int arg0, int arg1, int arg2) {
        this.field5976 = this.field5950;
        this.field5954 = arg0;
        this.field5950 = arg1;
        this.field5971 = arg2;
        this.field5986 = true;
    }

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "()Z", line = 993)
    public final boolean method918() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)Lbc;", line = 998)
    public final class205 method934(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([IIIII)Lvj;", line = 1002)
    public final class256 method876(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class123(this, arg0, arg1, arg2, arg3, arg4) : new class388(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class123(this, arg0, arg1, arg2, arg3, arg4) : new class388(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIIIII)Z", line = 1038)
    public final boolean method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field5973.field4732 * arg2 + this.field5973.field4730 * arg1 + this.field5973.field4729 * arg0 >> 15) + this.field5973.field4731;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field5973.field4732 * arg5 + this.field5973.field4730 * arg4 + this.field5973.field4729 * arg3 >> 15) + this.field5973.field4731;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field5981 || var8 >= this.field5981) && (var7 <= this.field5958 || var8 <= this.field5958)) {
            int var9 = ((this.field5973.field4726 * arg2 + this.field5973.field4736 * arg1 + this.field5973.field4734 * arg0 >> 15) + this.field5973.field4733) * this.field5991 / var7;
            int var10 = ((this.field5973.field4726 * arg5 + this.field5973.field4736 * arg4 + this.field5973.field4734 * arg3 >> 15) + this.field5973.field4733) * this.field5991 / var8;
            if (var9 < this.field5975 && var10 < this.field5975 || var9 > this.field5951 && var10 > this.field5951) {
                return false;
            } else {
                int var11 = ((this.field5973.field4735 * arg2 + this.field5973.field4728 * arg1 + this.field5973.field4727 * arg0 >> 15) + this.field5973.field4737) * this.field5979 / var7;
                int var12 = ((this.field5973.field4735 * arg5 + this.field5973.field4728 * arg4 + this.field5973.field4727 * arg3 >> 15) + this.field5973.field4737) * this.field5979 / var8;
                return (var11 >= this.field5968 || var12 >= this.field5968) && (var11 <= this.field5992 || var12 <= this.field5992);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Lni;Lrm;Ls;[Lrh;I)V", line = 1070)
    public final void method1008(class305[] arg0, class235 arg1, class154 arg2, class144[] arg3, int arg4) {
        class116[] var6 = new class116[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class116) arg0[var7];
            }
        }
        class116 var8 = class116.method704(this, var6);
        var8.method692(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V", line = 1084)
    public final void method877(boolean arg0) {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIIIII)V", line = 1088)
    public final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class214 var11 = this.method2618(Thread.currentThread());
        class251 var12 = var11.field3023;
        var12.field3731 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field3731 = false;
            var12.field3733 = 0;
            var12.field3730 = true;
            var12.method1746(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field3731 = false;
            var12.field3733 = 255 - var13;
            var12.field3730 = true;
            var12.method1746(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field3731 = true;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I", line = 1122)
    public final int method944(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[Lpc;)V", line = 1126)
    public final void method945(int arg0, class402[] arg1) {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V", line = 1129)
    public final void method984(boolean arg0) {
        this.field5990 = arg0;
        this.field5956.method102((byte) -98);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lbk;I)V", line = 2419)
    public class416(Canvas arg0, class211 arg1, int arg2) {
        this.field5959 = arg0;
        this.field5948 = arg1;
        super.field3936 = arg2;
        this.field5953 = class106.method623(this.field5959, (byte) 59);
        this.field5984 = this.field5953.field757;
        this.field5980 = this.field5953.field756;
        this.field5949 = this.field5953.field755;
        this.method2628();
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(II)V", line = 1139)
    public final void method989(int arg0, int arg1) {
        this.field5950 = arg0 & 16777215;
        int var3 = this.field5950 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field5950 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field5950 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field5950 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field5955 = false;
        } else {
            this.field5955 = true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIII)V", line = 1162)
    public final void method924(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(IIIII)V", line = 1165)
    public final void method901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field5985) {
            var6 = this.field5985;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field5965) {
            var7 = this.field5965;
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
                if (var64 < this.field5978) {
                    var64 = this.field5978;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field5961) {
                    var65 = this.field5961;
                }
                int var66 = this.field5980 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field5984[var66++] = arg3;
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
                if (var60 < this.field5978) {
                    var60 = this.field5978;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field5961 - 1) {
                    var61 = this.field5961 - 1;
                }
                int var62 = this.field5980 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field5984[var62++] = arg3;
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
                if (var28 < this.field5978) {
                    var28 = this.field5978;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field5961) {
                    var29 = this.field5961;
                }
                int var30 = this.field5980 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field5984[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field5984[var30++] = var15 + var33;
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
                if (var22 < this.field5978) {
                    var22 = this.field5978;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field5961 - 1) {
                    var23 = this.field5961 - 1;
                }
                int var24 = this.field5980 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field5984[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field5984[var24++] = var15 + var27;
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
                if (var47 < this.field5978) {
                    var47 = this.field5978;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field5961) {
                    var48 = this.field5961;
                }
                int var49 = this.field5980 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field5984[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field5984[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field5978) {
                    var39 = this.field5978;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field5961 - 1) {
                    var40 = this.field5961 - 1;
                }
                int var41 = this.field5980 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field5984[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field5984[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIIII)V", line = 1452)
    public final void method990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field5985 && arg1 < this.field5965) {
            if (arg0 < this.field5978) {
                arg2 -= this.field5978 - arg0;
                arg0 = this.field5978;
            }
            if (arg0 + arg2 > this.field5961) {
                arg2 = this.field5961 - arg0;
            }
            int var6 = this.field5980 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5984[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field5984[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field5984[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field5984[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field5984[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Lni;Ls;[Lrh;I)V", line = 1525)
    public final void method917(class305[] arg0, class154 arg1, class144[] arg2, int arg3) {
        class116[] var5 = new class116[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class116) arg0[var6];
            }
        }
        class116 var7 = class116.method704(this, var5);
        var7.method692(arg1, arg2 != null ? arg2[0] : null, (class235) null, arg3);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V", line = 1542)
    private final void method2619() {
        if (this.field5989 != 0.0F) {
            float var1 = (float) this.field5958;
            float var2 = (float) this.field5981;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field5964 / (this.field5989 + this.field5964);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field5989;
            this.field5970 = (int) (((float) this.field5958 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field5970 = this.field5958;
        }
    }

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "()V", line = 1562)
    public final void method897() {
    }

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "()F", line = 1566)
    public final float method988() {
        return this.field5964;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIILsg;II)V", line = 1571)
    public final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class226 arg6, int arg7, int arg8) {
        class447 var10 = (class447) arg6;
        int[] var11 = var10.field6382;
        int[] var12 = var10.field6386;
        int var13 = this.field5985 > arg8 ? this.field5985 : arg8;
        int var14 = this.field5965 < var11.length + arg8 ? this.field5965 : var11.length + arg8;
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
            if (arg0 < this.field5978) {
                var18 += (this.field5978 - arg0) * var20;
                arg0 = this.field5978;
            }
            if (var21 >= this.field5961) {
                var21 = this.field5961 - 1;
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
                                int var28 = this.field5980 * var25 + arg0;
                                int var29 = this.field5984[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field5984[var28] = var23 + var30;
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
                                int var34 = this.field5980 * var31 + arg0;
                                int var35 = this.field5984[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field5984[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field5984[this.field5980 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field5978 && var64 < this.field5961 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field5984[this.field5980 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field5978 && var50 < this.field5961 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field5980 * arg1 + var50;
                        int var54 = this.field5984[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field5984[this.field5980 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field5978 && var56 < this.field5961 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field5980 * arg1 + var56;
                        int var60 = this.field5984[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field5984[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "(I)Z", line = 1815)
    public final boolean method2620(int arg0) {
        return this.field5948.method1475(arg0, 17673).field4170;
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(IIII)V", line = 1820)
    public final void method937(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field5980) {
            arg2 = this.field5980;
        }
        if (arg3 > this.field5949) {
            arg3 = this.field5949;
        }
        this.field5978 = arg0;
        this.field5961 = arg2;
        this.field5985 = arg1;
        this.field5965 = arg3;
        this.method2626();
    }

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "(I)Z", line = 1840)
    public final boolean method2621(int arg0) {
        return this.field5990 || this.field5948.method1475(arg0, 17673).field4164;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(IIIII)V", line = 1847)
    public final void method946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field5978 && arg0 < this.field5961) {
            if (arg1 < this.field5985) {
                arg2 -= this.field5985 - arg1;
                arg1 = this.field5985;
            }
            if (arg1 + arg2 > this.field5965) {
                arg2 = this.field5965 - arg1;
            }
            int var6 = this.field5980 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field5980 * var10 + var6;
                        int var12 = this.field5984[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field5984[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field5980 * var14 + var6;
                        int var16 = this.field5984[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field5984[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field5984[this.field5980 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "()Ls;", line = 1926)
    public final class154 method1016() {
        return new class326();
    }

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "(I)[I", line = 1938)
    private final int[] method2622(int arg0) {
        class15 var2 = this.field5956;
        class389 var3;
        synchronized (this.field5956) {
            var3 = (class389) this.field5956.method99(true, (long) arg0);
            if (var3 == null) {
                if (!this.field5948.method1471(-31571, arg0)) {
                    return null;
                }
                class287 var5 = this.field5948.method1475(arg0, 17673);
                int var6 = !var5.field4164 && !this.field5990 ? 128 : 64;
                var3 = new class389(arg0, var6, this.field5948.method1470(0.7F, arg0, var6, 3962, var6, true), var5.field4178);
                this.field5956.method90(var3, (long) arg0, 0);
            }
        }
        var3.field5479 = true;
        return var3.method2457();
    }

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "()V", line = 1958)
    public final void method879() {
        this.field5956.method102((byte) -84);
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "()Z", line = 1962)
    public final boolean method952() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lab;III)V", line = 1966)
    public final void method2623(class401 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field5630;
        if (var6 == -1) {
            this.method901(arg1, arg2, var5, arg0.field5634, 1);
        } else {
            if (this.field5993 == null || (long) var6 != this.field5993.field6070) {
                this.field5993 = (class69) this.field5969.method99(true, (long) var6);
            }
            if (this.field5993 == null) {
                int[] var7 = this.method2622(var6);
                if (var7 == null) {
                    return;
                }
                this.field5993 = new class69();
                this.field5993.field922 = this.method2621(var6);
                int var8 = this.field5993.field922 ? 64 : 128;
                this.field5993.field916 = this.method876(var7, 0, var8, var8, var8);
                this.field5969.method90(this.field5993, (long) var6, 0);
            }
            if (this.field5993.field922) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field5993.field916.method74(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field5634, 1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lro;)V", line = 2007)
    public final void method948(class1 arg0) {
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "()V", line = 2012)
    public final void method900() {
    }

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "()Z", line = 2020)
    public final boolean method957() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lbc;)V", line = 2022)
    public final void method999(class205 arg0) {
    }

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "(I)[I", line = 2029)
    public final int[] method2624(int arg0) {
        class15 var2 = this.field5956;
        class389 var3;
        synchronized (this.field5956) {
            var3 = (class389) this.field5956.method99(true, (long) arg0);
            if (var3 == null) {
                if (!this.field5948.method1471(-31571, arg0)) {
                    return null;
                }
                class287 var5 = this.field5948.method1475(arg0, 17673);
                int var6 = !var5.field4164 && !this.field5990 ? 128 : 64;
                var3 = new class389(arg0, var6, this.field5948.method1474(var6, true, 0.7F, var6, (byte) -38, arg0), var5.field4178);
                this.field5956.method90(var3, (long) arg0, 0);
            }
        }
        var3.field5479 = true;
        return var3.method2457();
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()Z", line = 2049)
    public final boolean method2625() {
        return this.field5967;
    }

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "()F", line = 2052)
    public final float method866() {
        return this.field5989;
    }

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "()V", line = 2054)
    public final void method932() {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(F)V", line = 2057)
    public final void method883(float arg0) {
        this.field5963 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "()Z", line = 2068)
    public final boolean method1011() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIII)V", line = 2073)
    public final void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class214 var8 = this.method2618(Thread.currentThread());
        class251 var9 = var8.field3023;
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
            int var21 = arg0 - var9.method1741();
            int var22 = arg1 - var9.method1747();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field3733 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3733 = 255 - (arg4 >> 24);
            }
            var9.field3730 = var23 < 0 || var23 > var9.field3734 || var24 < 0 || var24 > var9.field3734 || var25 < 0 || var25 > var9.field3734;
            var9.method1748(var27, var28, var29, var23, var24, var25, arg4);
            var9.field3730 = var23 < 0 || var23 > var9.field3734 || var24 < 0 || var24 > var9.field3734 || var26 < 0 || var26 > var9.field3734;
            var9.method1748(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(FF)V", line = 2142)
    public final void method956(float arg0, float arg1) {
        this.field5964 = arg0;
        this.field5989 = arg1;
        this.method2619();
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V", line = 2147)
    public final void method936(int arg0) {
        if (this.field5957 != arg0) {
            this.field5957 = arg0;
            this.field5947 = new class214[this.field5957];
            for (int var2 = 0; var2 < this.field5957; ++var2) {
                this.field5947[var2] = new class214(this);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ls;)V", line = 2164)
    public final void method973(class154 arg0) {
        this.field5973 = (class326) arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIII)V", line = 2168)
    public final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field5978) {
            arg2 -= this.field5978 - arg0;
            arg0 = this.field5978;
        }
        if (arg1 < this.field5985) {
            arg3 -= this.field5985 - arg1;
            arg1 = this.field5985;
        }
        if (arg0 + arg2 > this.field5961) {
            arg2 = this.field5961 - arg0;
        }
        if (arg1 + arg3 > this.field5965) {
            arg3 = this.field5965 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field5961 && arg1 <= this.field5965) {
            int var7 = this.field5980 - arg2;
            int var8 = this.field5980 * arg1 + arg0;
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
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            ++var24;
                            this.field5984[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field5984[var24] = arg4;
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
                        int var14 = this.field5984[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field5984[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field5984[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field5984[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "()V", line = 2318)
    private final void method2626() {
        this.field5975 = this.field5978 - this.field5952;
        this.field5951 = this.field5961 - this.field5952;
        this.field5968 = this.field5985 - this.field5972;
        this.field5992 = this.field5965 - this.field5972;
        for (int var1 = 0; var1 < this.field5957; ++var1) {
            class251 var5 = this.field5947[var1].field3023;
            var5.field3735 = this.field5952 - this.field5978;
            var5.field3725 = this.field5972 - this.field5985;
            var5.field3734 = this.field5961 - this.field5978;
            var5.field3729 = this.field5965 - this.field5985;
        }
        int var2 = this.field5985 * this.field5980 + this.field5978;
        for (int var3 = this.field5985; var3 < this.field5965; ++var3) {
            for (int var4 = 0; var4 < this.field5957; ++var4) {
                this.field5947[var4].field3023.field3727[var3 - this.field5985] = var2;
            }
            var2 += this.field5980;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lqf;IIII)Lni;", line = 2356)
    public final class305 method905(class406 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class116(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)V", line = 2366)
    public final void method1003(int arg0, int arg1, int arg2, int arg3) {
        this.field5952 = arg0;
        this.field5972 = arg1;
        this.field5991 = arg2;
        this.field5979 = arg3;
        this.method2626();
    }

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "()Z", line = 2376)
    public final boolean method960() {
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "()Z", line = 2380)
    public final boolean method864() {
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "(I)I", line = 2384)
    public final int method2627(int arg0) {
        return this.field5948.method1475(arg0, 17673).field4175 & 65535;
    }

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "()V", line = 2390)
    private final void method2628() {
        this.field5956 = new class15(20);
        this.field5973 = new class326();
        class34.method190(true, false, false);
        this.field5983 = true;
        this.method936(1);
        this.method890(0);
        this.method931();
    }

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "()I", line = 2399)
    public final int method953() {
        return 0;
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V", line = 2402)
    public final void method890(int arg0) {
        this.field5947[arg0].method1495(Thread.currentThread(), (byte) 46);
    }
}
