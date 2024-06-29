import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class59 extends class18 {

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "Z")
    private boolean field819;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Z")
    private boolean field826;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "Ldfa;")
    private class477 field822;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
    private boolean field830;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lui;")
    private class251 field860;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Lui;")
    private class251 field835;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "Lfc;")
    public class660 field863;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field868 = new String[] { method637(method636("CMv")), method637(method636("bD0\r&")), method637(method636("o{E")), method637(method636("|^b%RfJf!")) };

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Leo;")
    private class344 field856;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "Ltb;")
    private class392 field866;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "Lwu;")
    public class451 field821;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field825;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "[F")
    public float[] field828;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[F")
    public float[] field843;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "[I")
    public int[] field847;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "[Lnda;")
    private class536[] field851;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "(I)Z")
    public final boolean method619(int arg0) {
        return this.field830 || super.field237.method4500(-23641, arg0).field9599;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public final void method218(int arg0) {
        this.field858 = arg0;
        this.field835.method2043(false);
    }

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "()[I")
    public final int[] method157() {
        return new int[] { this.field845, this.field857, this.field839, this.field859 };
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) throws class142 {
        if (this.field825 != null && this.field821 != null) {
            try {
                Graphics var3 = this.field825.getGraphics();
                this.field821.method776(0, arg0, this.field824, 0, var3, arg1, this.field823, -303);
            } catch (Exception var4) {
                this.field825.repaint();
            }
        } else {
            throw new IllegalStateException(field868[0]);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIF)Lta;")
    public final class330 method142(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "()Lcba;")
    public final class254 method210() {
        return new class254(0, field868[3], 1, field868[2], 0L);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lbha;Lkb;)Ltha;")
    public final class296 method134(class545 arg0, class102 arg1) {
        return new class344(this, (class392) arg0, (class597) arg1);
    }

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "()Z")
    public final boolean method140() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([IIIIIZ)Ltb;")
    public final class392 method180(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class88(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class498(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class88(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class498(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I[I)Laa;")
    public final class685 method236(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class303(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "(IIIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field849 && arg1 < this.field841) {
            if (arg0 < this.field850) {
                arg2 -= this.field850 - arg0;
                arg0 = this.field850;
            }
            if (arg0 + arg2 > this.field861) {
                arg2 = this.field861 - arg0;
            }
            int var6 = this.field846 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field847[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field847[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field847[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field847[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field847[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method235(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field833 = (int) (arg1 * 65535.0F);
        this.field836 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field853 = (int) (arg3 * 65535.0F / var7);
        this.field855 = (int) (arg4 * 65535.0F / var7);
        this.field848 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "(I)Z")
    public final boolean method620(int arg0) {
        return super.field237.method4500(-23641, arg0).field9601 || super.field237.method4500(-23641, arg0).field9590;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(FFF)V")
    public final void method160(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "()Z")
    public final boolean method133() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method635(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method635(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method631(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method631(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field850 && arg0 < this.field861 && var37 >= this.field849 && var37 < this.field841 && var24 < var21) {
                                int var38 = this.field846 * var37 + arg0;
                                int var39 = this.field847[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field847[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field850 && arg0 < this.field861 && var42 >= this.field849 && var42 < this.field841 && var24 < var21) {
                                int var43 = this.field846 * var42 + arg0;
                                int var44 = this.field847[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field847[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field850 && arg0 < this.field861 && var49 >= this.field849 && var49 < this.field841 && var24 < var21) {
                            this.field847[this.field846 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field849 && arg1 < this.field841 && var60 >= this.field850 && var60 < this.field861 && var24 < var21) {
                                int var61 = this.field846 * arg1 + var60;
                                int var62 = this.field847[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field847[this.field846 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field849 && arg1 < this.field841 && var65 >= this.field850 && var65 < this.field861 && var24 < var21) {
                                int var66 = this.field846 * arg1 + var65;
                                int var67 = this.field847[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field847[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field849 && arg1 < this.field841 && var72 >= this.field850 && var72 < this.field861 && var24 < var21) {
                            this.field847[this.field846 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "()I")
    public final int method198() {
        return 0;
    }

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "([I)V")
    public final void method229(int[] arg0) {
        arg0[0] = this.field850;
        arg0[1] = this.field849;
        arg0[2] = this.field861;
        arg0[3] = this.field841;
    }

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "(I)[I")
    public final int[] method621(int arg0) {
        class251 var2 = this.field835;
        class91 var3;
        synchronized (this.field835) {
            var3 = (class91) this.field835.method2053(0, (long) arg0 | Long.MIN_VALUE);
            if (var3 == null) {
                if (!super.field237.method4504(arg0, -31410)) {
                    return null;
                }
                class684 var5 = super.field237.method4500(-23641, arg0);
                int var6 = !var5.field9599 && !this.field830 ? this.field858 : 64;
                var3 = new class91(arg0, var6, super.field237.method4499(var6, var6, -7994, true, 0.7F, arg0), var5.field9584 != 1);
                this.field835.method2051((long) arg0 | Long.MIN_VALUE, var3, 93);
            }
        }
        var3.field1273 = true;
        return var3.method893();
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()Z")
    public final boolean method172() {
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "()Lqa;")
    public final class104 method221() {
        return new class660();
    }

    @OriginalMember(owner = "client!ed", name = "GA", descriptor = "(I)V")
    public final void method243(int arg0) {
        this.method237(0, 0, this.field846, this.field832, arg0, 0);
    }

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "()Z")
    public final boolean method215() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "()V")
    private final void method622() {
        for (int var1 = 0; var1 < this.field827; ++var1) {
            this.field851[var1].method4061(9125);
        }
        this.method240();
    }

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "()Z")
    public final boolean method202() {
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZ)Ltb;")
    public final class392 method222(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class88(this, arg0, arg1) : new class498(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lcd;[Lcu;Z)Lda;")
    public final class216 method145(class161 arg0, class66[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field981;
            var5[var7] = arg1[var7].field977;
            if (arg1[var7].field976 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class523(this, arg0, arg1, var4, var5);
            } else {
                return new class411(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class95(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "()V")
    public final void method234() {
        if (this.field825 != null) {
            this.field847 = this.field821.field6611;
            this.field846 = this.field821.field6616;
            this.field832 = this.field821.field6618;
            this.field843 = this.field828;
            this.field852 = this.field854;
            this.field838 = this.field834;
        } else {
            this.field846 = 1;
            this.field832 = 1;
            this.field847 = null;
            this.field852 = 1;
            this.field838 = 1;
            this.field843 = null;
        }
        this.field856 = null;
        this.method622();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class536 var14 = this.method633(Thread.currentThread());
        class187 var15 = var14.field7805;
        var15.field2446 = false;
        int var16 = arg0 - this.field829;
        int var17 = arg3 - this.field829;
        int var18 = arg6 - this.field829;
        int var19 = arg1 - this.field837;
        int var20 = arg4 - this.field837;
        int var21 = arg7 - this.field837;
        var15.field2450 = var16 < 0 || var16 > var15.field2445 || var17 < 0 || var17 > var15.field2445 || var18 < 0 || var18 > var15.field2445;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field2443 = 255 - var22;
                var15.field2439 = false;
                var15.method1562((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field2443 = 128;
                var15.field2439 = true;
                var15.method1562((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field2443 = 0;
            var15.field2439 = false;
            var15.method1562((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field2446 = true;
    }

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "()V")
    public final void method163() {
    }

    @OriginalMember(owner = "client!ed", name = "xa", descriptor = "(F)V")
    public final void method127(float arg0) {
        this.field864 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "()Z")
    public final boolean method186() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ltha;)V")
    public final void method165(class296 arg0) {
        class344 var2 = (class344) arg0;
        this.field846 = var2.field5007;
        this.field832 = var2.field5001;
        this.field847 = var2.field5002;
        this.field856 = var2;
        this.field852 = var2.field5007;
        this.field838 = var2.field5001;
        this.field843 = var2.field5000;
        this.method622();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8) {
        class303 var10 = (class303) arg6;
        int[] var11 = var10.field4226;
        int[] var12 = var10.field4223;
        int var13 = this.field849 > arg8 ? this.field849 : arg8;
        int var14 = this.field841 < var11.length + arg8 ? this.field841 : var11.length + arg8;
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
            if (arg0 < this.field850) {
                var18 += (this.field850 - arg0) * var20;
                arg0 = this.field850;
            }
            if (var21 >= this.field861) {
                var21 = this.field861 - 1;
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
                                int var28 = this.field846 * var25 + arg0;
                                int var29 = this.field847[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field847[var28] = var23 + var30;
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
                                int var34 = this.field846 * var31 + arg0;
                                int var35 = this.field847[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field847[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field847[this.field846 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field850 && var64 < this.field861 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field847[this.field846 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field850 && var50 < this.field861 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field846 * arg1 + var50;
                        int var54 = this.field847[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field847[this.field846 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field850 && var56 < this.field861 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field846 * arg1 + var56;
                        int var60 = this.field847[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field847[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "()I")
    public final int method139() {
        int var1 = this.field865;
        this.field865 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field846 * arg1 + arg0;
            int var15 = this.field846 - arg2;
            if (arg1 + arg3 > this.field841) {
                arg3 -= arg1 + arg3 - this.field841;
            }
            if (arg1 < this.field849) {
                int var16 = this.field849 - arg1;
                arg3 -= var16;
                var14 += this.field846 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field861) {
                int var17 = arg0 + arg2 - this.field861;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field850) {
                int var18 = this.field850 - arg0;
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
                            int var28 = this.field847[var14];
                            this.field847[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field847[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field847[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field847[var14++] = arg5;
                        } else {
                            this.field847[var14++] = arg4;
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

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "(I)Z")
    public final boolean method623(int arg0) {
        return super.field237.method4504(arg0, -31410);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lsn;)V")
    public final void method228(class369 arg0) {
    }

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "(III[I)V")
    public final void method223(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field863.field9362 + (float) arg0 * this.field863.field9360 + (float) arg1 * this.field863.field9357 + this.field863.field9347;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field863.field9342 + (float) arg0 * this.field863.field9340 + (float) arg1 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / var5);
            int var7 = (int) (((float) arg2 * this.field863.field9353 + (float) arg0 * this.field863.field9349 + (float) arg1 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / var5);
            arg3[0] = var6 - this.field829;
            arg3[1] = var7 - this.field837;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!ed", name = "la", descriptor = "()V")
    public final void method240() {
        this.field850 = 0;
        this.field849 = 0;
        this.field861 = this.field846;
        this.field841 = this.field832;
        this.method626();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method168(Canvas arg0, int arg1, int arg2) {
        class451 var4 = (class451) this.field822.method3693(false, (long) arg0.hashCode());
        if (var4 != null) {
            var4.method4294(0);
            class451 var5 = class15.method101(arg1, arg2, arg0, -1);
            this.field822.method3691(var5, (long) arg0.hashCode(), -1);
            if (this.field825 == arg0 && this.field856 == null) {
                Dimension var6 = arg0.getSize();
                this.field824 = var6.width;
                this.field823 = var6.height;
                this.field821 = var5;
                this.field847 = var5.field6611;
                this.field846 = var5.field6616;
                this.field832 = var5.field6618;
                if (this.field852 != this.field846 || this.field838 != this.field832) {
                    this.field854 = this.field852 = this.field846;
                    this.field834 = this.field838 = this.field832;
                    this.field828 = this.field843 = new float[this.field852 * this.field838];
                }
                this.method622();
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "pa", descriptor = "()V")
    public final void method169() {
        for (int var1 = 0; var1 < this.field851.length; ++var1) {
            this.field851[var1].field7775 = this.field851[var1].field7774;
            this.field851[var1].field7787 = false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "za", descriptor = "(IIIII)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field849) {
            var6 = this.field849;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field841) {
            var7 = this.field841;
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
                if (var64 < this.field850) {
                    var64 = this.field850;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field861) {
                    var65 = this.field861;
                }
                int var66 = this.field846 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field847[var66++] = arg3;
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
                if (var60 < this.field850) {
                    var60 = this.field850;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field861 - 1) {
                    var61 = this.field861 - 1;
                }
                int var62 = this.field846 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field847[var62++] = arg3;
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
                if (var28 < this.field850) {
                    var28 = this.field850;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field861) {
                    var29 = this.field861;
                }
                int var30 = this.field846 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field847[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field847[var30++] = var15 + var33;
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
                if (var22 < this.field850) {
                    var22 = this.field850;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field861 - 1) {
                    var23 = this.field861 - 1;
                }
                int var24 = this.field846 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field847[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field847[var24++] = var15 + var27;
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
                if (var47 < this.field850) {
                    var47 = this.field850;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field861) {
                    var48 = this.field861;
                }
                int var49 = this.field846 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field847[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field847[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field850) {
                    var39 = this.field850;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field861 - 1) {
                    var40 = this.field861 - 1;
                }
                int var41 = this.field846 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field847[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field847[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method203(int arg0) {
        this.field827 = arg0;
        this.field851 = new class536[this.field827];
        for (int var2 = 0; var2 < this.field827; ++var2) {
            this.field851[var2] = new class536(this);
        }
    }

    @OriginalMember(owner = "client!ed", name = "da", descriptor = "(III[I)V")
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field863.field9362 + (float) arg0 * this.field863.field9360 + (float) arg1 * this.field863.field9357 + this.field863.field9347;
        if (!(var5 < (float) this.field842) && !(var5 > (float) this.field831)) {
            int var6 = (int) (((float) arg2 * this.field863.field9342 + (float) arg0 * this.field863.field9340 + (float) arg1 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / var5);
            int var7 = (int) (((float) arg2 * this.field863.field9353 + (float) arg0 * this.field863.field9349 + (float) arg1 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / var5);
            if (var6 >= this.field829 && var6 <= this.field844 && var7 >= this.field837 && var7 <= this.field840) {
                arg3[0] = var6 - this.field829;
                arg3[1] = var7 - this.field837;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIII)Lsn;")
    public final class369 method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "()Z")
    public final boolean method216() {
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "ra", descriptor = "(IIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field851.length; ++var5) {
            this.field851[var5].field7774 = this.field851[var5].field7775;
            this.field851[var5].field7780 = arg0;
            this.field851[var5].field7775 = arg1;
            this.field851[var5].field7783 = arg2;
            this.field851[var5].field7787 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class303 var13 = (class303) arg6;
        int[] var14 = var13.field4226;
        int[] var15 = var13.field4223;
        int var16 = this.field849 > arg8 ? this.field849 : arg8;
        int var17 = this.field841 < var14.length + arg8 ? this.field841 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field850 && arg0 < this.field861 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field846 * var37 + arg0;
                                int var41 = this.field847[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field847[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field850 && arg0 < this.field861 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field846 * var44 + arg0;
                                int var48 = this.field847[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field847[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field850 && arg0 < this.field861 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field847[this.field846 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field850 && var80 < this.field861 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field847[this.field846 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field850 && var66 < this.field861 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field846 * arg1 + var66;
                        int var69 = this.field847[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field847[this.field846 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field850 && var72 < this.field861 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field846 * arg1 + var72;
                        int var75 = this.field847[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field847[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)Lza;")
    public final class348 method214(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "na", descriptor = "(IIII)[I")
    public final int[] method227(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field846 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field847[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()Z")
    public final boolean method166() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class59(Canvas arg0, class673 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method148(arg0, arg2, arg3);
            this.method156(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method177((byte) -87);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "(IIIII)V")
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field850 && arg0 < this.field861) {
            if (arg1 < this.field849) {
                arg2 -= this.field849 - arg1;
                arg1 = this.field849;
            }
            if (arg1 + arg2 > this.field841) {
                arg2 = this.field841 - arg1;
            }
            int var6 = this.field846 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field846 * var10 + var6;
                        int var12 = this.field847[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field847[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field846 * var14 + var6;
                        int var16 = this.field847[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field847[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field847[this.field846 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(IIIIII)V")
    private final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field849) {
            var7 = this.field849;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field841) {
            var8 = this.field841;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field850) {
                    var65 = this.field850;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field861) {
                    var66 = this.field861;
                }
                int var67 = this.field846 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field843[var67]) {
                        this.field847[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field850) {
                    var61 = this.field850;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field861 - 1) {
                    var62 = this.field861 - 1;
                }
                int var63 = this.field846 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field843[var63]) {
                        this.field847[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field850) {
                    var29 = this.field850;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field861) {
                    var30 = this.field861;
                }
                int var31 = this.field846 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field843[var31]) {
                        int var33 = this.field847[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field847[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field850) {
                    var23 = this.field850;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field861 - 1) {
                    var24 = this.field861 - 1;
                }
                int var25 = this.field846 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field843[var25]) {
                        int var27 = this.field847[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field847[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field850) {
                    var48 = this.field850;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field861) {
                    var49 = this.field861;
                }
                int var50 = this.field846 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field843[var50]) {
                        int var52 = this.field847[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field847[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field850) {
                    var40 = this.field850;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field861 - 1) {
                    var41 = this.field861 - 1;
                }
                int var42 = this.field846 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field843[var42]) {
                        int var44 = this.field847[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field847[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method213(arg0, arg1, arg2, arg4, arg5);
        this.method213(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method124(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method124(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)I")
    public final int method625(int arg0) {
        return super.field237.method4500(-23641, arg0).field9584;
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "()V")
    private final void method626() {
        this.field829 = this.field850 - this.field845;
        this.field844 = this.field861 - this.field845;
        this.field837 = this.field849 - this.field857;
        this.field840 = this.field841 - this.field857;
        for (int var1 = 0; var1 < this.field827; ++var1) {
            class187 var5 = this.field851[var1].field7805;
            var5.field2442 = this.field845 - this.field850;
            var5.field2452 = this.field857 - this.field849;
            var5.field2445 = this.field861 - this.field850;
            var5.field2447 = this.field841 - this.field849;
        }
        int var2 = this.field849 * this.field846 + this.field850;
        for (int var3 = this.field849; var3 < this.field841; ++var3) {
            for (int var4 = 0; var4 < this.field827; ++var4) {
                this.field851[var4].field7805.field2453[var3 - this.field849] = var2;
            }
            var2 += this.field846;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lts;IIII)V")
    private final void method627(class123 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field1549;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method624(arg1, arg2, arg3, arg4, arg0.field1547, 1);
        } else {
            if (this.field867 != var6) {
                class392 var9 = (class392) this.field860.method2053(0, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method621(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method619(var6) ? 64 : this.field858;
                    var9 = this.method201(var11, var11, var10, var11, (byte) 15, 0);
                    this.field860.method2051((long) var6, var9, 93);
                }
                this.field867 = var6;
                this.field866 = var9;
            }
            ++var8;
            ((class266) this.field866).method878(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field1547, 1, 1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "(Z)V")
    public final void method119(boolean arg0) {
        class536 var2 = this.method633(Thread.currentThread());
        var2.field7773 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "()Z")
    public final boolean method158() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)[I")
    public final int[] method628(int arg0) {
        class251 var2 = this.field835;
        class91 var3;
        synchronized (this.field835) {
            var3 = (class91) this.field835.method2053(0, (long) arg0);
            if (var3 == null) {
                if (!super.field237.method4504(arg0, -31410)) {
                    return null;
                }
                class684 var5 = super.field237.method4500(-23641, arg0);
                int var6 = !var5.field9599 && !this.field830 ? this.field858 : 64;
                var3 = new class91(arg0, var6, super.field237.method4502(0.7F, var6, -121, var6, arg0, true), var5.field9584 != 1);
                this.field835.method2051((long) arg0, var3, 93);
            }
        }
        var3.field1273 = true;
        return var3.method893();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field237.method4500(-23641, arg6).field9583) {
                if (this.field867 != arg6) {
                    class392 var11 = (class392) this.field860.method2053(0, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method621(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method619(arg6) ? 64 : this.field858;
                        var11 = this.method201(var13, var13, var12, var13, (byte) 126, 0);
                        this.field860.method2051((long) arg6, var11, 93);
                    }
                    this.field867 = arg6;
                    this.field866 = var11;
                }
                ((class266) this.field866).method878(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method624(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "(II)V")
    public final void method149(int arg0, int arg1) {
        int var3 = this.field846 * arg1 + arg0;
        int var4 = this.field852 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field847;
            float[] var6 = this.field843;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class569.method4248(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class569.method4248(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class569.method4244(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class569.method4244(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "()Z")
    public final boolean method137() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "()V")
    public final void method238() {
    }

    @OriginalMember(owner = "client!ed", name = "DA", descriptor = "(IIII)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3) {
        this.field845 = arg0;
        this.field857 = arg1;
        this.field839 = arg2;
        this.field859 = arg3;
        this.method626();
    }

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "()Z")
    public final boolean method125() {
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method224(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class142 {
        if (this.field825 != null && this.field821 != null) {
            try {
                Graphics var5 = this.field825.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field846 && var7.y + arg3 <= this.field832 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field821.method776(var7.x, var7.x + arg2, var7.width, var7.y, var5, var7.y + arg3, var7.height, -303);
                    }
                }
            } catch (Exception var8) {
                this.field825.repaint();
            }
        } else {
            throw new IllegalStateException(field868[0]);
        }
    }

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "(IIII)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3) {
        if (this.field850 < arg0) {
            this.field850 = arg0;
        }
        if (this.field849 < arg1) {
            this.field849 = arg1;
        }
        if (this.field861 > arg2) {
            this.field861 = arg2;
        }
        if (this.field841 > arg3) {
            this.field841 = arg3;
        }
        this.method626();
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public final void method199(boolean arg0) {
        this.field830 = arg0;
        this.field835.method2043(false);
    }

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "()Z")
    public final boolean method630() {
        return this.field819;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method148(Canvas arg0, int arg1, int arg2) {
        class451 var4 = (class451) this.field822.method3693(false, (long) arg0.hashCode());
        if (var4 == null) {
            class451 var5 = class15.method101(arg1, arg2, arg0, -1);
            this.field822.method3691(var5, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field6616 != arg1 || var4.field6618 != arg2) {
                this.method168(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)V")
    private final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field850 && arg0 < this.field861) {
            int var9 = this.field846 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field849 && arg1 + var15 < this.field841 && var12 < arg5) {
                            int var16 = this.field846 * var15 + var9;
                            int var17 = this.field847[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field847[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field849 && arg1 + var19 < this.field841 && var12 < arg5) {
                            int var20 = this.field846 * var19 + var9;
                            int var21 = this.field847[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field847[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field849 && arg1 + var25 < this.field841 && var12 < arg5) {
                        this.field847[this.field846 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(II)V")
    public final void method120(int arg0, int arg1) {
        class536 var3 = this.method633(Thread.currentThread());
        this.field842 = arg0;
        this.field831 = arg1;
        var3.field7778 = this.field831 - 255;
    }

    @OriginalMember(owner = "client!ed", name = "aa", descriptor = "(IIIIII)V")
    public final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field850) {
            arg2 -= this.field850 - arg0;
            arg0 = this.field850;
        }
        if (arg1 < this.field849) {
            arg3 -= this.field849 - arg1;
            arg1 = this.field849;
        }
        if (arg0 + arg2 > this.field861) {
            arg2 = this.field861 - arg0;
        }
        if (arg1 + arg3 > this.field841) {
            arg3 = this.field841 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field861 && arg1 <= this.field841) {
            int var7 = this.field846 - arg2;
            int var8 = this.field846 * arg1 + arg0;
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
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            ++var24;
                            this.field847[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field847[var24] = arg4;
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
                        int var14 = this.field847[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field847[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field847[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field847[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(II)Lkb;")
    public final class102 method191(int arg0, int arg1) {
        return new class597(arg0, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "()Lqa;")
    public final class104 method136() {
        class536 var1 = this.method633(Thread.currentThread());
        return var1.field7786;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        this.field851[arg0].method4062((byte) 28, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
    public final void method130(int arg0) {
        this.field851[arg0].method4062((byte) 28, (Runnable) null);
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "()V")
    public final void method167() {
        if (this.field826) {
            class485.method3742(true, false, -18448);
            this.field826 = false;
        }
        this.field821 = null;
        this.field825 = null;
        this.field824 = 0;
        this.field823 = 0;
        this.field822 = null;
        this.field819 = true;
    }

    @OriginalMember(owner = "client!ed", name = "JA", descriptor = "(IIIIII)I")
    public final int method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field863.field9362 + (float) arg0 * this.field863.field9360 + (float) arg1 * this.field863.field9357 + this.field863.field9347;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field863.field9362 + (float) arg3 * this.field863.field9360 + (float) arg4 * this.field863.field9357 + this.field863.field9347;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field842 && var9 < (float) this.field842) {
            var7 |= 16;
        } else if (var8 > (float) this.field831 && var9 > (float) this.field831) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field863.field9342 + (float) arg0 * this.field863.field9340 + (float) arg1 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / var8);
        int var11 = (int) (((float) arg5 * this.field863.field9342 + (float) arg3 * this.field863.field9340 + (float) arg4 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / var9);
        if (var10 < this.field829 && var11 < this.field829) {
            var7 |= 1;
        } else if (var10 > this.field844 && var11 > this.field844) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field863.field9353 + (float) arg0 * this.field863.field9349 + (float) arg1 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / var8);
        int var13 = (int) (((float) arg5 * this.field863.field9353 + (float) arg3 * this.field863.field9349 + (float) arg4 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / var9);
        if (var12 < this.field837 && var13 < this.field837) {
            var7 |= 4;
        } else if (var12 > this.field840 && var13 > this.field840) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()Z")
    public final boolean method164() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "()I")
    public final int method184() {
        int var1 = this.field862;
        this.field862 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lrha;IIII)Lka;")
    public final class761 method197(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class726(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lta;)V")
    public final void method189(int arg0, class330[] arg1) {
    }

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "()Lqa;")
    public final class104 method129() {
        return this.field863;
    }

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "(ILaa;II)V")
    public final void method153(int arg0, class685 arg1, int arg2, int arg3) {
        class303 var5 = (class303) arg1;
        int[] var6 = var5.field4226;
        int[] var7 = var5.field4223;
        int var8;
        if (this.field841 < var6.length + arg3) {
            var8 = this.field841 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field849 > arg3) {
            var9 = this.field849 - arg3;
            arg3 = this.field849;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field846 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field850 > var12) {
                    var13 -= this.field850 - var12;
                    var12 = this.field850;
                }
                if (this.field861 < var12 + var13) {
                    var13 = this.field861 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field847[var14++] = arg0;
                }
                var10 += this.field846;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(II)Lbha;")
    public final class545 method179(int arg0, int arg1) {
        return this.method222(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ld;)V")
    private class59(class673 arg0) {
        super(arg0);
        this.field819 = false;
        this.field826 = false;
        this.field822 = new class477(4);
        this.field841 = 0;
        this.field830 = false;
        this.field831 = 3500;
        this.field833 = 45823;
        this.field849 = 0;
        this.field859 = 512;
        this.field839 = 512;
        this.field842 = 50;
        this.field858 = 128;
        this.field861 = 0;
        this.field862 = 0;
        this.field850 = 0;
        this.field864 = 75518;
        this.field865 = 0;
        this.field836 = 78642;
        this.field860 = new class251(16);
        this.field867 = -1;
        try {
            this.field835 = new class251(256);
            this.field863 = new class660();
            this.method203(1);
            this.method205(0);
            class445.method3458(true, (byte) 80, true);
            this.field826 = true;
            this.field820 = (int) class614.method4531(-63);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method177((byte) -87);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIID)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field852 - arg2;
        int var8 = this.field852 * arg1 + arg0;
        float[] var9 = this.field843;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lqa;)V")
    public final void method204(class104 arg0) {
        this.field863 = (class660) arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([I)V")
    public final void method170(int[] arg0) {
        arg0[0] = this.field846;
        arg0[1] = this.field832;
    }

    @OriginalMember(owner = "client!ed", name = "ya", descriptor = "()V")
    public final void method225() {
        if (this.field850 == 0 && this.field861 == this.field846 && this.field849 == 0 && this.field841 == this.field832) {
            int var1 = this.field843.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
                this.field843[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field843[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field861 - this.field850;
            int var5 = this.field841 - this.field849;
            int var6 = this.field846 - var4;
            int var7 = this.field849 * this.field846 + this.field850;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field843[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "()I")
    public final int method122() {
        return 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIZ)Ltb;")
    public final class392 method196(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field846 * arg1 + arg0;
        int var8 = this.field846 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field847[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class88(this, var6, arg2, arg3);
        } else {
            return new class498(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "HA", descriptor = "(IIII[I)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field863.field9362 + (float) arg0 * this.field863.field9360 + (float) arg1 * this.field863.field9357 + this.field863.field9347;
        if (!(var6 < (float) this.field842) && !(var6 > (float) this.field831)) {
            int var7 = (int) (((float) arg2 * this.field863.field9342 + (float) arg0 * this.field863.field9340 + (float) arg1 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field863.field9353 + (float) arg0 * this.field863.field9349 + (float) arg1 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / (float) arg3);
            if (var7 >= this.field829 && var7 <= this.field844 && var8 >= this.field837 && var8 <= this.field840) {
                arg4[0] = var7 - this.field829;
                arg4[1] = var8 - this.field837;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lsn;Lsn;FLsn;)Lsn;")
    public final class369 method155(class369 arg0, class369 arg1, float arg2, class369 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIIIIIII)V")
    public final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field237.method4500(-23641, arg6).field9583) {
                if (this.field867 != arg6) {
                    class392 var11 = (class392) this.field860.method2053(0, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method621(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method619(arg6) ? 64 : this.field858;
                        var11 = this.method201(var13, var13, var12, var13, (byte) -60, 0);
                        this.field860.method2051((long) arg6, var11, 93);
                    }
                    this.field867 = arg6;
                    this.field866 = var11;
                }
                ((class266) this.field866).method871(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method624(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)V")
    public final void method154(int arg0) {
        class726.field10362 = arg0;
        class726.field10399 = arg0;
        if (this.field827 > 1) {
            throw new IllegalStateException(field868[1]);
        } else {
            this.method203(this.field827);
            this.method205(0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "()Z")
    public final boolean method181() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lkia;)V")
    public final void method126(class788 arg0) {
        class536 var2 = this.method633(Thread.currentThread());
        class592 var3 = arg0.field11376.field5728;
        for (class592 var4 = var3.field8523; var3 != var4; var4 = var4.field8523) {
            class123 var5 = (class123) var4;
            int var6 = var5.field1550 >> 12;
            int var7 = var5.field1551 >> 12;
            int var8 = var5.field1557 >> 12;
            float var9 = (float) var8 * this.field863.field9362 + (float) var6 * this.field863.field9360 + (float) var7 * this.field863.field9357 + this.field863.field9347;
            if (!(var9 < (float) this.field842) && !(var9 > (float) var2.field7778)) {
                int var10 = (int) (((float) var8 * this.field863.field9342 + (float) var6 * this.field863.field9340 + (float) var7 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / var9) + this.field845;
                int var11 = (int) (((float) var8 * this.field863.field9353 + (float) var6 * this.field863.field9349 + (float) var7 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / var9) + this.field857;
                if (var10 >= this.field850 && var10 <= this.field861 && var11 >= this.field849 && var11 <= this.field841) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method627(var5, var10, var11, (int) var9, (int) ((float) (this.field839 * var5.field1558 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method220(Canvas arg0) {
        if (this.field825 == arg0) {
            this.method156((Canvas) null);
        }
        class451 var2 = (class451) this.field822.method3693(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method4294(0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Runnable;)Lnda;")
    public final class536 method633(Runnable arg0) {
        for (int var2 = 0; var2 < this.field827; ++var2) {
            if (this.field851[var2].field7781 == arg0) {
                return this.field851[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "(IIIIIII)I")
    public final int method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field863.field9362 + (float) arg0 * this.field863.field9360 + (float) arg1 * this.field863.field9357 + this.field863.field9347;
        float var9 = (float) arg5 * this.field863.field9362 + (float) arg3 * this.field863.field9360 + (float) arg4 * this.field863.field9357 + this.field863.field9347;
        int var10 = 0;
        if (var8 < (float) this.field842 && var9 < (float) this.field842) {
            var10 |= 16;
        } else if (var8 > (float) this.field831 && var9 > (float) this.field831) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field863.field9342 + (float) arg0 * this.field863.field9340 + (float) arg1 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field863.field9342 + (float) arg3 * this.field863.field9340 + (float) arg4 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / (float) arg6);
        if (var11 < this.field829 && var12 < this.field829) {
            var10 |= 1;
        } else if (var11 > this.field844 && var12 > this.field844) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field863.field9353 + (float) arg0 * this.field863.field9349 + (float) arg1 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field863.field9353 + (float) arg3 * this.field863.field9349 + (float) arg4 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / (float) arg6);
        if (var13 < this.field837 && var14 < this.field837) {
            var10 |= 4;
        } else if (var13 > this.field840 && var14 > this.field840) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "(I)V")
    public final void method209(int arg0) {
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "()I")
    public final int method195() {
        return this.field842;
    }

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "()Z")
    public final boolean method217() {
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lkia;I)V")
    public final void method193(class788 arg0, int arg1) {
        class536 var3 = this.method633(Thread.currentThread());
        class592 var4 = arg0.field11376.field5728;
        for (class592 var5 = var4.field8523; var4 != var5; var5 = var5.field8523) {
            class123 var6 = (class123) var5;
            int var7 = var6.field1550 >> 12;
            int var8 = var6.field1551 >> 12;
            int var9 = var6.field1557 >> 12;
            float var10 = (float) var9 * this.field863.field9362 + (float) var7 * this.field863.field9360 + (float) var8 * this.field863.field9357 + this.field863.field9347;
            if (!(var10 < (float) this.field842) && !(var10 > (float) var3.field7778)) {
                int var11 = (int) (((float) var9 * this.field863.field9342 + (float) var7 * this.field863.field9340 + (float) var8 * this.field863.field9345 + this.field863.field9348) * (float) this.field839 / (float) arg1) + this.field845;
                int var12 = (int) (((float) var9 * this.field863.field9353 + (float) var7 * this.field863.field9349 + (float) var8 * this.field863.field9363 + this.field863.field9359) * (float) this.field859 / (float) arg1) + this.field857;
                if (var11 >= this.field850 && var11 <= this.field861 && var12 >= this.field849 && var12 <= this.field841) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method627(var6, var11, var12, (int) var10, (this.field839 * var6.field1558 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)V")
    public final void method175(int arg0) {
        int var2 = arg0 - this.field820;
        for (Object var3 = this.field835.method2049(-27); var3 != null; var3 = this.field835.method2054(false)) {
            class91 var4 = (class91) var3;
            if (var4.field1273) {
                var4.field1270 += var2;
                int var5 = var4.field1270 / 20;
                if (var5 > 0) {
                    class684 var6 = super.field237.method4500(-23641, var4.field1271);
                    var4.method894(var6.field9598 * var2 * 50 / 1000, var6.field9592 * var2 * 50 / 1000);
                    var4.field1270 -= var5 * 20;
                }
                var4.field1273 = false;
            }
        }
        this.field820 = arg0;
        this.field860.method2038(0, 5);
        this.field835.method2038(0, 5);
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(II)I")
    public final int method226(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V")
    public final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class536 var8 = this.method633(Thread.currentThread());
        class187 var9 = var8.field7805;
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
            int var23 = arg0 - var9.method1558();
            int var24 = arg1 - var9.method1556();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field2443 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2443 = 255 - (arg4 >>> 24);
            }
            this.method119(false);
            var9.field2450 = var25 < 0 || var25 > var9.field2445 || var26 < 0 || var26 > var9.field2445 || var27 < 0 || var27 > var9.field2445;
            var9.method1547((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field2450 = var25 < 0 || var25 > var9.field2445 || var27 < 0 || var27 > var9.field2445 || var28 < 0 || var28 > var9.field2445;
            var9.method1547((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method119(true);
        }
    }

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "(I)I")
    public final int method634(int arg0) {
        return super.field237.method4500(-23641, arg0).field9596 & 65535;
    }

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "()V")
    public final void method135() {
    }

    @OriginalMember(owner = "client!ed", name = "KA", descriptor = "(IIII)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field846) {
            arg2 = this.field846;
        }
        if (arg3 > this.field832) {
            arg3 = this.field832;
        }
        this.field850 = arg0;
        this.field861 = arg2;
        this.field849 = arg1;
        this.field841 = arg3;
        this.method626();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lza;)V")
    public final void method207(class348 arg0) {
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lcu;Z)Ltb;")
    public final class392 method231(class66 arg0, boolean arg1) {
        int[] var3 = arg0.field979;
        byte[] var4 = arg0.field982;
        int var5 = arg0.field981;
        int var6 = arg0.field977;
        class266 var11;
        if (arg1 && arg0.field976 == null) {
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
            var11 = new class494(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field976;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class88(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class498(this, var14, var5, var6);
            }
        }
        var11.method1379(arg0.field984, arg0.field983, arg0.field978, arg0.field980);
        return var11;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method156(Canvas arg0) {
        if (arg0 != null) {
            class451 var2 = (class451) this.field822.method3693(false, (long) arg0.hashCode());
            if (var2 != null) {
                this.field825 = arg0;
                Dimension var3 = arg0.getSize();
                this.field824 = var3.width;
                this.field823 = var3.height;
                this.field821 = var2;
                if (this.field856 == null) {
                    this.field847 = var2.field6611;
                    this.field846 = var2.field6616;
                    this.field832 = var2.field6618;
                    if (this.field852 != this.field846 || this.field838 != this.field832) {
                        this.field854 = this.field852 = this.field846;
                        this.field834 = this.field838 = this.field832;
                        this.field828 = this.field843 = new float[this.field852 * this.field838];
                    }
                    this.method622();
                    return;
                }
            }
        } else {
            this.field825 = null;
            this.field821 = null;
            if (this.field856 == null) {
                this.field847 = null;
                this.field846 = this.field832 = 1;
                this.field852 = this.field838 = 1;
                this.method622();
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "EA", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        class536 var5 = this.method633(Thread.currentThread());
        var5.field7780 = arg0;
        var5.field7775 = arg1;
        var5.field7783 = arg2;
    }

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "()V")
    public final void method138() {
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method213(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method213(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method124(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method124(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field850) {
                    var10 += (this.field850 - arg0) * var12;
                    arg0 = this.field850;
                }
                if (var13 >= this.field861) {
                    var13 = this.field861 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field849 && var17 < this.field841) {
                                int var18 = this.field846 * var17 + arg0;
                                int var19 = this.field847[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field847[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field849 && var21 < this.field841) {
                                int var22 = this.field846 * var21 + arg0;
                                int var23 = this.field847[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field847[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field849 && var27 < this.field841) {
                            this.field847[this.field846 * var27 + arg0] = arg4;
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
                if (arg1 < this.field849) {
                    var29 += (this.field849 - arg1) * var31;
                    arg1 = this.field849;
                }
                if (var32 >= this.field841) {
                    var32 = this.field841 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field850 && var46 < this.field861) {
                            this.field847[this.field846 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field850 && var36 < this.field861) {
                            int var37 = this.field846 * arg1 + var36;
                            int var38 = this.field847[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field847[this.field846 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field850 && var40 < this.field861) {
                            int var41 = this.field846 * arg1 + var40;
                            int var42 = this.field847[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field847[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "()V")
    public final void method123() {
        this.field835.method2043(false);
        this.field860.method2043(false);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIIIII)V")
    private final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field849 && arg1 < this.field841) {
            int var9 = this.field846 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field850 && arg0 + var15 < this.field861 && var12 < arg5) {
                            int var16 = this.field847[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field847[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field850 && arg0 + var18 < this.field861 && var12 < arg5) {
                            int var19 = this.field847[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field847[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field850 && arg0 + var23 < this.field861 && var12 < arg5) {
                        this.field847[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "(III)V")
    public final void method232(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field851.length; ++var4) {
            class536 var5 = this.field851[var4];
            var5.field7775 = arg0 & 16777215;
            int var6 = var5.field7775 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7775 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7775 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7775 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7779 = false;
            } else {
                var5.field7779 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class751 method206(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class547(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ed", name = "XA", descriptor = "()I")
    public final int method187() {
        return this.field831;
    }

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method636(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 114);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method637(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
