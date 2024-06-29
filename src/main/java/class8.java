import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class8 extends class345 {

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public int field127 = 50;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Z")
    private boolean field116 = false;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public int field122 = 0;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    private int field130 = 0;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field117 = 0;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public int field131 = 0;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public int field125 = 3500;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public int field128 = 45823;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "Z")
    public boolean field138 = false;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    private int field145 = 0;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public int field140 = 512;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "Z")
    private boolean field137 = false;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field115 = 0;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    private int field152 = 3500;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public int field141 = 512;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "Z")
    private boolean field136 = false;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public int field147 = this.field152 - 255;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    private int field153 = 0;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    public int field156 = 78642;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    public int field158 = 0;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public int field144 = 0;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
    public int field159 = 75518;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field114 = 0;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lbj;")
    private class131 field120 = new class131(16);

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Ljava/awt/Canvas;")
    private Canvas field142;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lja;")
    public class152 field123;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lnr;")
    private class35 field132;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "F")
    private float field124;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "F")
    private float field135;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "Lbj;")
    private class131 field143;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "Llm;")
    private class291 field160;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Lei;")
    public class96 field129;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Z")
    public boolean field119;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Lsp;")
    private class382[] field151;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIIII)V", line = 3)
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field158 && arg1 < this.field114) {
            if (arg0 < this.field122) {
                arg2 -= this.field122 - arg0;
                arg0 = this.field122;
            }
            if (arg0 + arg2 > this.field117) {
                arg2 = this.field117 - arg0;
            }
            int var6 = this.field121 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field149[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field149[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field149[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field149[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field149[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()V", line = 75)
    public final void method43() {
        this.field115 = this.field145;
        this.field138 = false;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)Z", line = 80)
    public final boolean method44(int arg0) {
        return this.field123.method473(arg0, 93);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V", line = 83)
    public final void method45(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)[I", line = 87)
    private final int[] method46(int arg0) {
        class131 var2 = this.field143;
        class86 var3;
        synchronized (this.field143) {
            var3 = (class86) this.field143.method904(false, (long) arg0);
            if (var3 == null) {
                if (!this.field123.method473(arg0, 100)) {
                    return null;
                }
                class454 var5 = this.field123.method469(arg0, (byte) -73);
                int var6 = !var5.field6488 && !this.field137 ? 128 : 64;
                var3 = new class86(arg0, var6, this.field123.method468(var6, 0.7F, -24250, var6, arg0, true), var5.field6479);
                this.field143.method902((long) arg0, (byte) 112, var3);
            }
        }
        var3.field1211 = true;
        return var3.method617();
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)V", line = 107)
    public final void method47(int arg0, int arg1) {
        this.field127 = arg0;
        this.field152 = arg1;
        this.field147 = this.field152 - 255;
        this.method68();
    }

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "()I", line = 114)
    public final int method48() {
        return 0;
    }

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "()I", line = 119)
    public final int method49() {
        return this.field127;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(IIIIII)Lqe;", line = 122)
    public final class275 method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "()Z", line = 126)
    public final boolean method51() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "()Z", line = 129)
    public final boolean method52() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIII)V", line = 133)
    public final void method53(int arg0, int arg1, int arg2, int arg3) {
        if (this.field122 < arg0) {
            this.field122 = arg0;
        }
        if (this.field158 < arg1) {
            this.field158 = arg1;
        }
        if (this.field117 > arg2) {
            this.field117 = arg2;
        }
        if (this.field114 > arg3) {
            this.field114 = arg3;
        }
        this.method89();
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)Z", line = 149)
    public final boolean method54(int arg0) {
        return this.field123.method469(arg0, (byte) -71).field6485;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 152)
    public final void method55(boolean arg0) {
        this.field137 = arg0;
        this.field143.method905((byte) 123);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIIII)V", line = 157)
    public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field122) {
            arg2 -= this.field122 - arg0;
            arg0 = this.field122;
        }
        if (arg1 < this.field158) {
            arg3 -= this.field158 - arg1;
            arg1 = this.field158;
        }
        if (arg0 + arg2 > this.field117) {
            arg2 = this.field117 - arg0;
        }
        if (arg1 + arg3 > this.field114) {
            arg3 = this.field114 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field117 && arg1 <= this.field114) {
            int var7 = this.field121 - arg2;
            int var8 = this.field121 * arg1 + arg0;
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
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            ++var24;
                            this.field149[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field149[var24] = arg4;
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
                        int var14 = this.field149[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field149[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field149[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field149[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V", line = 293)
    public final void method57(int arg0, int arg1, int arg2) {
        this.field131 = arg0;
        this.field115 = arg1;
        this.field144 = arg2;
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "(I)I", line = 298)
    public final int method58(int arg0) {
        return this.field123.method469(arg0, (byte) -63).field6489 & 65535;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(IIIIII)V", line = 302)
    public final void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method42(arg0, arg1, arg2, arg4, arg5);
        this.method42(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method138(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method138(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "()V", line = 308)
    public final void method60() {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[I[I)Lep;", line = 312)
    public final class241 method61(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class288(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lbr;IIII)Lmj;", line = 316)
    public final class394 method62(class223 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class363(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(IIII)V", line = 319)
    public final void method63(int arg0, int arg1, int arg2, int arg3) {
        this.field118 = arg0;
        this.field154 = arg1;
        this.field140 = arg2;
        this.field141 = arg3;
        this.method89();
    }

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "()I", line = 327)
    public final int method64() {
        int var1 = this.field130;
        this.field130 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)Lip;", line = 333)
    public final class423 method65(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "()Z", line = 336)
    public final boolean method66() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IFFFFF)V", line = 339)
    public final void method67(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field128 = (int) (arg1 * 65535.0F);
        this.field156 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field146 = (int) (arg3 * 65535.0F / var7);
        this.field134 = (int) (arg4 * 65535.0F / var7);
        this.field148 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 348)
    private final void method68() {
        if (this.field135 != 0.0F) {
            float var1 = (float) this.field152;
            float var2 = (float) this.field127;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field124 / (this.field135 + this.field124);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field135;
            this.field125 = (int) (((float) this.field152 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field125 = this.field152;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()Z", line = 371)
    public final boolean method69() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "()V", line = 374)
    public final void method70() {
        this.field143.method905((byte) 57);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 377)
    private final void method71() {
        this.field143 = new class131(20);
        this.field129 = new class96();
        class14.method231(false, true, (byte) -124);
        this.field136 = true;
        this.method94(1);
        this.method110(0);
        this.method143();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lmj;Lmr;Lic;Lvf;I)V", line = 386)
    public final void method72(class394 arg0, class77 arg1, class417 arg2, class84 arg3, int arg4) {
        ((class363) arg0).method2355(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(I)[I", line = 390)
    public final int[] method73(int arg0) {
        class131 var2 = this.field143;
        class86 var3;
        synchronized (this.field143) {
            var3 = (class86) this.field143.method904(false, (long) arg0);
            if (var3 == null) {
                if (!this.field123.method473(arg0, 93)) {
                    return null;
                }
                class454 var5 = this.field123.method469(arg0, (byte) -115);
                int var6 = !var5.field6488 && !this.field137 ? 128 : 64;
                var3 = new class86(arg0, var6, this.field123.method472(var6, (byte) -72, 0.7F, true, arg0, var6), var5.field6479);
                this.field143.method902((long) arg0, (byte) 112, var3);
            }
        }
        var3.field1211 = true;
        return var3.method617();
    }

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)Z", line = 410)
    public final boolean method74(int arg0) {
        return this.field137 || this.field123.method469(arg0, (byte) -59).field6488;
    }

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "()V", line = 417)
    public final void method75() {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lk;[Llg;Z)Lai;", line = 422)
    public final class357 method76(class337 arg0, class238[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field3388;
            var5[var7] = arg1[var7].field3392;
            if (arg1[var7].field3391 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class351(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class332(this, arg0, arg1, var4, var5);
        } else {
            return new class449(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lip;)V", line = 451)
    public final void method77(class423 arg0) {
    }

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "()Z", line = 454)
    public final boolean method78() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lmj;Lic;[Lvf;I)V", line = 459)
    public final void method79(class394[] arg0, class417 arg1, class84[] arg2, int arg3) {
        class363[] var5 = new class363[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class363) arg0[var6];
            }
        }
        class363 var7 = class363.method2350(this, var5);
        var7.method2355(arg1, arg2 != null ? arg2[0] : null, (class77) null, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(FF)V", line = 476)
    public final void method80(float arg0, float arg1) {
        this.field124 = arg0;
        this.field135 = arg1;
        this.method68();
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lja;I)V", line = 2419)
    public class8(Canvas arg0, class152 arg1, int arg2) {
        this.field142 = arg0;
        this.field123 = arg1;
        super.field4704 = arg2;
        this.field132 = class210.method1380(this.field142, false);
        this.field149 = this.field132.field540;
        this.field121 = this.field132.field541;
        this.field139 = this.field132.field537;
        this.method71();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 487)
    public final void method81(Canvas arg0) {
        this.field142 = arg0;
        this.method129();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lqe;Lqe;FLqe;)Lqe;", line = 491)
    public final class275 method82(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lmr;)V", line = 498)
    public final void method83(class77 arg0) {
        class325 var2 = arg0.field1102.field4089;
        for (class325 var3 = var2.field4449; var2 != var3; var3 = var3.field4449) {
            class399 var4 = (class399) var3;
            int var5 = var4.field5689 >> 12;
            int var6 = var4.field5688 >> 12;
            int var7 = var4.field5701 >> 12;
            int var8 = (this.field129.field1339 * var7 + this.field129.field1345 * var5 + this.field129.field1340 * var6 >> 15) + this.field129.field1338;
            if (var8 >= this.field127 && var8 <= this.field152) {
                int var9 = ((this.field129.field1348 * var7 + this.field129.field1346 * var5 + this.field129.field1342 * var6 >> 15) + this.field129.field1347) * this.field140 / var8 + this.field118;
                int var10 = ((this.field129.field1341 * var7 + this.field129.field1344 * var6 + this.field129.field1337 * var5 >> 15) + this.field129.field1343) * this.field141 / var8 + this.field154;
                if (var9 >= this.field122 && var9 <= this.field117 && var10 >= this.field158 && var10 <= this.field114) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method122(var4, var9, var10, (var4.field5698 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "()Lic;", line = 535)
    public final class417 method84() {
        class382 var1 = this.method104(Thread.currentThread());
        return var1.field5458;
    }

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "()I", line = 541)
    public final int method85() {
        return this.field152;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILep;II)V", line = 545)
    public final void method86(int arg0, class241 arg1, int arg2, int arg3) {
        class288 var5 = (class288) arg1;
        int[] var6 = var5.field4054;
        int[] var7 = var5.field4051;
        int var8;
        if (this.field114 < var6.length + arg3) {
            var8 = this.field114 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field158 > arg3) {
            var9 = this.field158 - arg3;
            arg3 = this.field158;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field121 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field122 > var12) {
                    var13 -= this.field122 - var12;
                    var12 = this.field122;
                }
                if (this.field117 < var12 + var13) {
                    var13 = this.field117 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field149[var14++] = arg0;
                }
                var10 += this.field121;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIIIII)Z", line = 603)
    public final boolean method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field129.field1339 * arg2 + this.field129.field1345 * arg0 + this.field129.field1340 * arg1 >> 15) + this.field129.field1338;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field129.field1339 * arg5 + this.field129.field1345 * arg3 + this.field129.field1340 * arg4 >> 15) + this.field129.field1338;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field127 || var8 >= this.field127) && (var7 <= this.field152 || var8 <= this.field152)) {
            int var9 = ((this.field129.field1348 * arg2 + this.field129.field1346 * arg0 + this.field129.field1342 * arg1 >> 15) + this.field129.field1347) * this.field140 / var7;
            int var10 = ((this.field129.field1348 * arg5 + this.field129.field1346 * arg3 + this.field129.field1342 * arg4 >> 15) + this.field129.field1347) * this.field140 / var8;
            if (var9 < this.field133 && var10 < this.field133 || var9 > this.field150 && var10 > this.field150) {
                return false;
            } else {
                int var11 = ((this.field129.field1341 * arg2 + this.field129.field1344 * arg1 + this.field129.field1337 * arg0 >> 15) + this.field129.field1343) * this.field141 / var7;
                int var12 = ((this.field129.field1341 * arg5 + this.field129.field1344 * arg4 + this.field129.field1337 * arg3 >> 15) + this.field129.field1343) * this.field141 / var8;
                return (var11 >= this.field113 || var12 >= this.field113) && (var11 <= this.field157 || var12 <= this.field157);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[[I[[IIII)Lij;", line = 632)
    public final class242 method88(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class102(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 635)
    private final void method89() {
        this.field133 = this.field122 - this.field118;
        this.field150 = this.field117 - this.field118;
        this.field113 = this.field158 - this.field154;
        this.field157 = this.field114 - this.field154;
        for (int var1 = 0; var1 < this.field126; ++var1) {
            class110 var5 = this.field151[var1].field5453;
            var5.field1588 = this.field118 - this.field122;
            var5.field1586 = this.field154 - this.field158;
            var5.field1580 = this.field117 - this.field122;
            var5.field1577 = this.field114 - this.field158;
        }
        int var2 = this.field158 * this.field121 + this.field122;
        for (int var3 = this.field158; var3 < this.field114; ++var3) {
            for (int var4 = 0; var4 < this.field126; ++var4) {
                this.field151[var4].field5453.field1584[var3 - this.field158] = var2;
            }
            var2 += this.field121;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(F)V", line = 674)
    public final void method90(float arg0) {
        this.field159 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "()Z", line = 677)
    public final boolean method91() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 680)
    public final void method92(Rectangle[] arg0, int arg1) {
        if (this.field142 != null && this.field132 != null) {
            try {
                Graphics var3 = this.field142.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field121 && var5.y <= this.field139 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field132.method342(var5.height, var5.x, var5.width, var3, var5.y, (byte) 0);
                    }
                }
            } catch (Exception var6) {
                this.field142.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "()Z", line = 705)
    public final boolean method93() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V", line = 710)
    public final void method94(int arg0) {
        if (this.field126 != arg0) {
            this.field126 = arg0;
            this.field151 = new class382[this.field126];
            for (int var2 = 0; var2 < this.field126; ++var2) {
                this.field151[var2] = new class382(this);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "()V", line = 729)
    public final void method95() {
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V", line = 735)
    public final void method96(boolean arg0) {
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()F", line = 738)
    public final float method97() {
        return this.field135;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V", line = 745)
    public final void method98(int arg0) {
        int var2 = arg0 - this.field155;
        for (Object var3 = this.field143.method899(-114); var3 != null; var3 = this.field143.method908(18603)) {
            class86 var4 = (class86) var3;
            if (var4.field1211) {
                var4.field1209 += var2;
                int var5 = var4.field1209 / 20;
                if (var5 > 0) {
                    class454 var6 = this.field123.method469(var4.field1212, (byte) -83);
                    var4.method616(var6.field6484 * var2 * 50 / 1000, var6.field6482 * var2 * 50 / 1000);
                    var4.field1209 -= var5 * 20;
                }
                var4.field1211 = false;
            }
        }
        this.field155 = arg0;
        this.field120.method901(5, 12223);
    }

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "()Z", line = 779)
    public final boolean method99() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "()V", line = 783)
    public final void method100() {
        if (this.field136) {
            class90.method637(true, false, 73);
            this.field136 = false;
        }
        this.field142 = null;
        this.field123 = null;
        this.field132 = null;
        this.field116 = true;
    }

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "()Lic;", line = 797)
    public final class417 method101() {
        return new class96();
    }

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "()Z", line = 801)
    public final boolean method102() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 804)
    public final void method103(int arg0) {
        this.field151[arg0].method2435(true, (Runnable) null);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/Runnable;)Lsp;", line = 809)
    public final class382 method104(Runnable arg0) {
        for (int var2 = 0; var2 < this.field126; ++var2) {
            if (this.field151[var2].field5462 == arg0) {
                return this.field151[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Llg;Z)Lsg;", line = 823)
    public final class226 method105(class238 arg0, boolean arg1) {
        int[] var3 = arg0.field3393;
        byte[] var4 = arg0.field3390;
        int var5 = arg0.field3388;
        int var6 = arg0.field3392;
        class82 var11;
        if (arg1 && arg0.field3391 == null) {
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
            var11 = new class101(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field3391;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class81(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class81(this, var14, var5, var6);
                var11 = new class451(this, var14, var5, var6);
            }
        }
        var11.method595(arg0.field3385, arg0.field3387, arg0.field3389, arg0.field3386);
        return var11;
    }

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "()F", line = 925)
    public final float method106() {
        return this.field124;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V", line = 928)
    public final void method107(int[] arg0) {
        arg0[0] = this.field122;
        arg0[1] = this.field158;
        arg0[2] = this.field117;
        arg0[3] = this.field114;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)I", line = 940)
    public final int method108(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "()Z", line = 944)
    public final boolean method109() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V", line = 947)
    public final void method110(int arg0) {
        this.field151[arg0].method2435(true, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V", line = 951)
    public final void method111(int arg0, int arg1, int arg2) {
        this.field145 = this.field115;
        this.field131 = arg0;
        this.field115 = arg1;
        this.field144 = arg2;
        this.field138 = true;
    }

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()Z", line = 958)
    public final boolean method112() {
        return this.field116;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lbh;)V", line = 960)
    public final void method113(int arg0, class24[] arg1) {
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 964)
    public final void method114(int arg0) {
        this.method56(0, 0, this.field121, this.field139, arg0, 0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[I)V", line = 969)
    public final void method115(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field129.field1339 * arg2 + this.field129.field1345 * arg0 + this.field129.field1340 * arg1 >> 15) + this.field129.field1338;
        if (var5 >= this.field127 && var5 <= this.field152) {
            int var6 = ((this.field129.field1348 * arg2 + this.field129.field1346 * arg0 + this.field129.field1342 * arg1 >> 15) + this.field129.field1347) * this.field140 / var5;
            int var7 = ((this.field129.field1341 * arg2 + this.field129.field1344 * arg1 + this.field129.field1337 * arg0 >> 15) + this.field129.field1343) * this.field141 / var5;
            if (var6 >= this.field133 && var6 <= this.field150 && var7 >= this.field113 && var7 <= this.field157) {
                arg3[0] = var6 - this.field133;
                arg3[1] = var7 - this.field113;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII[BII)V", line = 995)
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field121 * arg1 + arg0;
            int var15 = this.field121 - arg2;
            if (arg1 + arg3 > this.field114) {
                arg3 -= arg1 + arg3 - this.field114;
            }
            if (arg1 < this.field158) {
                int var16 = this.field158 - arg1;
                arg3 -= var16;
                var14 += this.field121 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field117) {
                int var17 = arg0 + arg2 - this.field117;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field122) {
                int var18 = this.field122 - arg0;
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
                            int var28 = this.field149[var14];
                            this.field149[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
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
                                int var34 = this.field149[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field149[var14++] = var35 - var37 | var37 - (var37 >>> 8);
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
                            this.field149[var14++] = arg5;
                        } else {
                            this.field149[var14++] = arg4;
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

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIZ)Lsg;", line = 1171)
    public final class226 method117(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field121 * arg1 + arg0;
        int var8 = this.field121 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field149[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class81(this, var6, arg2, arg3);
        } else {
            return new class451(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "()V", line = 1203)
    public final void method118() {
        if (this.field142 != null && this.field132 != null) {
            try {
                Graphics var1 = this.field142.getGraphics();
                this.field132.method339(13, 0, var1, 0);
            } catch (Exception var2) {
                this.field142.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIIIII)V", line = 1220)
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method42(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method42(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method138(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method138(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
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
                if (arg0 < this.field122) {
                    var10 += (this.field122 - arg0) * var12;
                    arg0 = this.field122;
                }
                if (var13 >= this.field117) {
                    var13 = this.field117 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field158 && var17 < this.field114) {
                                int var18 = this.field121 * var17 + arg0;
                                int var19 = this.field149[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field149[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field158 && var21 < this.field114) {
                                int var22 = this.field121 * var21 + arg0;
                                int var23 = this.field149[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field149[var22] = var24 - var26 | var26 - (var26 >>> 8);
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
                        if (var27 >= this.field158 && var27 < this.field114) {
                            this.field149[this.field121 * var27 + arg0] = arg4;
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
                if (arg1 < this.field158) {
                    var29 += (this.field158 - arg1) * var31;
                    arg1 = this.field158;
                }
                if (var32 >= this.field114) {
                    var32 = this.field114 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field122 && var46 < this.field117) {
                            this.field149[this.field121 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field122 && var36 < this.field117) {
                            int var37 = this.field121 * arg1 + var36;
                            int var38 = this.field149[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field149[this.field121 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field122 && var40 < this.field117) {
                            int var41 = this.field121 * arg1 + var40;
                            int var42 = this.field149[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field149[var41] = var43 - var45 | var45 - (var45 >>> 8);
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

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V", line = 1433)
    public final void method120(int arg0, int arg1) {
        this.field115 = arg0 & 16777215;
        int var3 = this.field115 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field115 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field115 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field115 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field119 = false;
        } else {
            this.field119 = true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIII)V", line = 1459)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class382 var11 = this.method104(Thread.currentThread());
        class110 var12 = var11.field5453;
        var12.field1583 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field1583 = false;
            var12.field1589 = 0;
            var12.field1578 = true;
            var12.method777(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field1583 = false;
            var12.field1589 = 255 - var13;
            var12.field1578 = true;
            var12.method777(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field1583 = true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lua;III)V", line = 1494)
    public final void method122(class399 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field5696;
        if (var6 == -1) {
            this.method133(arg1, arg2, var5, arg0.field5691, 1);
        } else {
            if (this.field160 == null || (long) var6 != this.field160.field5600) {
                this.field160 = (class291) this.field120.method904(false, (long) var6);
            }
            if (this.field160 == null) {
                int[] var7 = this.method46(var6);
                if (var7 == null) {
                    return;
                }
                this.field160 = new class291();
                this.field160.field4076 = this.method74(var6);
                int var8 = this.field160.field4076 ? 64 : 128;
                this.field160.field4079 = this.method128(var7, 0, var8, var8, var8);
                this.field120.method902((long) var6, (byte) 112, this.field160);
            }
            if (this.field160.field4076) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field160.field4079.method588(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field5691, 1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lmj;Lmr;Lic;[Lvf;I)V", line = 1538)
    public final void method123(class394[] arg0, class77 arg1, class417 arg2, class84[] arg3, int arg4) {
        class363[] var6 = new class363[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class363) arg0[var7];
            }
        }
        class363 var8 = class363.method2350(this, var6);
        var8.method2355(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "()Z", line = 1554)
    public final boolean method124() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "()Z", line = 1565)
    public final boolean method125() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lic;)V", line = 1569)
    public final void method126(class417 arg0) {
        this.field129 = (class96) arg0;
    }

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "()Z", line = 1572)
    public final boolean method127() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIII)Lsg;", line = 1576)
    public final class226 method128(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class81(this, arg0, arg1, arg2, arg3, arg4) : new class451(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class81(this, arg0, arg1, arg2, arg3, arg4) : new class451(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "()V", line = 1611)
    public final void method129() {
        this.field132 = class210.method1380(this.field142, false);
        this.field149 = this.field132.field540;
        this.field121 = this.field132.field541;
        this.field139 = this.field132.field537;
        for (int var1 = 0; var1 < this.field126; ++var1) {
            this.field151[var1].method2436((byte) -66);
        }
        this.method143();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lqe;)V", line = 1624)
    public final void method130(class275 arg0) {
    }

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "()I", line = 1631)
    public final int method131() {
        int var1 = this.field153;
        this.field153 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIILep;II)V", line = 1637)
    public final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class241 arg6, int arg7, int arg8) {
        class288 var10 = (class288) arg6;
        int[] var11 = var10.field4054;
        int[] var12 = var10.field4051;
        int var13 = this.field158 > arg8 ? this.field158 : arg8;
        int var14 = this.field114 < var11.length + arg8 ? this.field114 : var11.length + arg8;
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
            if (arg0 < this.field122) {
                var18 += (this.field122 - arg0) * var20;
                arg0 = this.field122;
            }
            if (var21 >= this.field117) {
                var21 = this.field117 - 1;
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
                                int var28 = this.field121 * var25 + arg0;
                                int var29 = this.field149[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field149[var28] = var23 + var30;
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
                                int var34 = this.field121 * var31 + arg0;
                                int var35 = this.field149[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field149[var34] = var36 - var38 | var38 - (var38 >>> 8);
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
                            this.field149[this.field121 * var39 + arg0] = arg4;
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
                    if (var64 >= this.field122 && var64 < this.field117 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field149[this.field121 * arg1 + var64] = arg4;
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
                    if (var50 >= this.field122 && var50 < this.field117 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field121 * arg1 + var50;
                        int var54 = this.field149[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field149[this.field121 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field122 && var56 < this.field117 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field121 * arg1 + var56;
                        int var60 = this.field149[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field149[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIII)V", line = 1878)
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field158) {
            var6 = this.field158;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field114) {
            var7 = this.field114;
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
                if (var64 < this.field122) {
                    var64 = this.field122;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field117) {
                    var65 = this.field117;
                }
                int var66 = this.field121 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field149[var66++] = arg3;
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
                if (var60 < this.field122) {
                    var60 = this.field122;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field117 - 1) {
                    var61 = this.field117 - 1;
                }
                int var62 = this.field121 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field149[var62++] = arg3;
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
                if (var28 < this.field122) {
                    var28 = this.field122;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field117) {
                    var29 = this.field117;
                }
                int var30 = this.field121 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field149[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field149[var30++] = var15 + var33;
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
                if (var22 < this.field122) {
                    var22 = this.field122;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field117 - 1) {
                    var23 = this.field117 - 1;
                }
                int var24 = this.field121 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field149[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field149[var24++] = var15 + var27;
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
                if (var47 < this.field122) {
                    var47 = this.field122;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field117) {
                    var48 = this.field117;
                }
                int var49 = this.field121 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field149[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field149[var49++] = var52 - var54 | var54 - (var54 >>> 8);
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
                if (var39 < this.field122) {
                    var39 = this.field122;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field117 - 1) {
                    var40 = this.field117 - 1;
                }
                int var41 = this.field121 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field149[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field149[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V", line = 2166)
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class382 var8 = this.method104(Thread.currentThread());
        class110 var9 = var8.field5453;
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
            int var21 = arg0 - var9.method776();
            int var22 = arg1 - var9.method788();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field1589 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field1589 = 255 - (arg4 >> 24);
            }
            var9.field1578 = var23 < 0 || var23 > var9.field1580 || var24 < 0 || var24 > var9.field1580 || var25 < 0 || var25 > var9.field1580;
            var9.method779(var27, var28, var29, var23, var24, var25, arg4);
            var9.field1578 = var23 < 0 || var23 > var9.field1580 || var24 < 0 || var24 > var9.field1580 || var26 < 0 || var26 > var9.field1580;
            var9.method779(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "()V", line = 2234)
    public final void method135() {
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIII)V", line = 2241)
    public final void method136(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field121) {
            arg2 = this.field121;
        }
        if (arg3 > this.field139) {
            arg3 = this.field139;
        }
        this.field122 = arg0;
        this.field117 = arg2;
        this.field158 = arg1;
        this.field114 = arg3;
        this.method89();
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(Z)V", line = 2263)
    public final void method137(boolean arg0) {
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIIII)V", line = 2267)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field122 && arg0 < this.field117) {
            if (arg1 < this.field158) {
                arg2 -= this.field158 - arg1;
                arg1 = this.field158;
            }
            if (arg1 + arg2 > this.field114) {
                arg2 = this.field114 - arg1;
            }
            int var6 = this.field121 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field121 * var10 + var6;
                        int var12 = this.field149[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field149[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field121 * var14 + var6;
                        int var16 = this.field149[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field149[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field149[this.field121 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I", line = 2343)
    public final int method139(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "()Z", line = 2347)
    public final boolean method140() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "()Z", line = 2356)
    public final boolean method141() {
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIII)[I", line = 2360)
    public final int[] method142(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field121 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field149[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "()V", line = 2386)
    public final void method143() {
        this.field122 = 0;
        this.field158 = 0;
        this.field117 = this.field121;
        this.field114 = this.field139;
        this.method89();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(FFF)V", line = 2395)
    public final void method144(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "()I", line = 2401)
    public final int method145() {
        return 0;
    }
}
