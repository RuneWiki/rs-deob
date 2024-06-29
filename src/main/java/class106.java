import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class106 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    private boolean field1687;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    private static int[] field1680 = new int[4];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    private int field1684;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lom;")
    private static class166 field1686;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lqi;")
    private class232 field1675;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[B")
    private static byte[] field1676;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    private final void method748() {
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z")
    public final boolean method749(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1687) {
            this.field1681 = 1073741823;
            var8 = this.field1674;
            var9 = this.field1689;
            var10 = this.field1677;
        } else {
            int var5 = this.field1674 - arg0;
            int var6 = this.field1689 - arg1;
            int var7 = this.field1677 - arg2;
            this.field1681 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1681 == 0) {
                this.field1681 = 1;
            }
            var8 = (var5 << 8) / this.field1681;
            var9 = (var6 << 8) / this.field1681;
            var10 = (var7 << 8) / this.field1681;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1678 = this.field1683 * arg3 / (this.field1687 ? 1024 : this.field1681);
        } else {
            this.field1678 = 0;
        }
        if (this.field1678 < 8) {
            this.method748();
            this.field1675 = null;
            return false;
        }
        int var12 = class120.method848(-99, this.field1678);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1682 != var12) {
            this.field1682 = var12;
        }
        this.field1688 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1684 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1675 = null;
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method750(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1676[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIILid;)V")
    public final void method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class106 arg6) {
        int var8 = this.field1688 - arg4 & 0x7FF;
        int var9 = this.field1684 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1678) / 2 + var10;
        int var13 = (arg2 - this.field1678) / 2 + var11;
        if (var12 < arg3 && this.field1678 + var12 > 0 && var13 < arg2 && this.field1678 + var13 > 0 && this.method753(arg6)) {
            this.field1675.method1019(arg0 + var13, arg1 + var12, this.field1678, this.field1678);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    public static void method752() {
        field1686 = null;
        field1676 = null;
        field1680 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lid;)Z")
    private final boolean method753(class106 arg0) {
        if (this.field1675 == null) {
            if (this.field1685 == 0) {
                this.field1675 = class302.field4828.method105(this.field1682, true, class302.field4820, this.field1690, -16578);
            } else if (this.field1685 == 2) {
                this.method755(arg0);
            } else if (this.field1685 == 1) {
                this.method756(arg0);
            }
        }
        return this.field1675 != null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
    private final void method754() {
        int var1 = this.field1682;
        int var2 = this.field1682;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class127.field2006 - var1;
        if (var2 > class127.field2008) {
            var2 -= var2 - class127.field2008;
        }
        if (class127.field2003 > 0) {
            int var9 = class127.field2003;
            var2 -= var9;
            var7 += class127.field2006 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class127.field2009) {
            int var10 = var1 - class127.field2009;
            var1 -= var10;
            var8 += var10;
        }
        if (class127.field2004 > 0) {
            int var11 = class127.field2004;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method750(class127.field2007, this.field1679, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!id", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method748();
        super.finalize();
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lid;)V")
    private final void method755(class106 arg0) {
        class166 var2 = class166.method1200(class21.field270, this.field1690, 0);
        if (var2 == null) {
            return;
        }
        this.field1675 = new class232(this.field1682, this.field1682);
        class127.method887(field1680);
        this.field1675.method1569();
        class302.method2008();
        class127.method886(0, 0, this.field1682, this.field1682, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1687) {
                var3 = -arg0.field1674;
                var4 = -arg0.field1689;
                var5 = -arg0.field1677;
            } else {
                var3 = this.field1674 - arg0.field1674;
                var4 = this.field1689 - arg0.field1689;
                var5 = this.field1677 - arg0.field1677;
            }
        }
        if (this.field1688 != 0) {
            int var6 = class302.field4823[this.field1688];
            int var7 = class302.field4824[this.field1688];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1684 != 0) {
            int var9 = this.field1684 - 1024 & 0x7FF;
            int var10 = class302.field4823[var9];
            int var11 = class302.field4824[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class31 var13 = var2.method1216(64, 768, -var3, -var4, -var5);
        int var14 = var13.method174() - var13.method181();
        int var15 = var13.method166() - var13.method15();
        int var16 = var13.method181() + var14 / 2;
        int var17 = var13.method15() + var15 / 2;
        if (var14 > var15) {
            var13.method195(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1682);
        } else {
            var13.method195(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1682);
        }
        class112.field1757.method497((byte) -70);
        class127.method902(field1680);
        class302.method2008();
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Lid;)V")
    private final void method756(class106 arg0) {
        method759();
        method757();
        this.field1675 = new class200(this.field1682, this.field1682);
        class127.method887(field1680);
        this.field1675.method1569();
        class302.method2008();
        class127.method886(0, 0, this.field1682, this.field1682, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1687) {
                var2 = -arg0.field1674;
                var3 = -arg0.field1689;
                var4 = -arg0.field1677;
            } else {
                var2 = this.field1674 - arg0.field1674;
                var3 = this.field1689 - arg0.field1689;
                var4 = this.field1677 - arg0.field1677;
            }
        }
        if (this.field1688 != 0) {
            int var5 = class302.field4823[this.field1688];
            int var6 = class302.field4824[this.field1688];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1684 != 0) {
            int var8 = this.field1684 - 1024 & 0x7FF;
            int var9 = class302.field4823[var8];
            int var10 = class302.field4824[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class157.method1069(field1686.field2695, 0, field1686.field2675, (short) class302.field4828.method113(this.field1690, (byte) -61));
        class31 var12 = field1686.method1216(64, 512, -var2, -var3, -var4);
        int var13 = var12.method174() - var12.method181();
        int var14 = var12.method166() - var12.method15();
        if (var13 > var14) {
            int var15 = this.field1679 == 0 ? (var13 << 9) / this.field1682 : (var13 * 16 << 9) / (this.field1682 * 13);
            var12.method195(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1679 == 0 ? (var14 << 9) / this.field1682 : (var14 * 16 << 9) / (this.field1682 * 13);
            var12.method195(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1679 == 0) {
            for (int var17 = 0; var17 < class127.field2007.length; var17++) {
                if (class127.field2007[var17] != 0) {
                    class127.field2007[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method758();
            this.method754();
        }
        class112.field1757.method497((byte) 49);
        class127.method902(field1680);
        class302.method2008();
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()V")
    private static final void method757() {
        if (field1676 != null) {
            return;
        }
        field1676 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field1676[var4 + var6] = field1676[var4 + var9] = field1676[var5 + var6] = field1676[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()V")
    private final void method758() {
        int var1 = this.field1682 * 3 / 32;
        int var3 = this.field1682 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class127.field2006 * var1 + var1;
        int var8 = class127.field2006 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class127.field2008) {
            var4 = var3 - (var1 + var3 - class127.field2008);
        }
        if (var1 < class127.field2003) {
            int var11 = class127.field2003 - var1;
            var4 -= var11;
            var7 += class127.field2006 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class127.field2009) {
            int var12 = var1 + var3 - class127.field2009;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class127.field2004) {
            int var13 = class127.field2004 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method760(class127.field2007, 0, this.field1679, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "()V")
    private static final void method759() {
        if (field1686 != null) {
            return;
        }
        class166 var0 = field1686 = new class166(260, 480, 0);
        int[] var1 = var0.field2700;
        int[] var2 = var0.field2687;
        int[] var3 = var0.field2681;
        int[] var4 = var0.field2699;
        int[] var5 = var0.field2672;
        int[] var6 = var0.field2706;
        var0.field2717 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class302.field4823[var8] >> 1;
            int var10 = class302.field4824[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class302.field4824[var17] >> 9;
                int var19 = (class302.field4823[var17] >> 1) * var9 >> 23;
                int var20 = (class302.field4823[var17] >> 1) * var10 >> 23;
                var1[var0.field2717] = var20;
                var2[var0.field2717] = var18;
                var3[var0.field2717] = -var19;
                var0.field2717++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field2675] = 0;
                var5[var0.field2675] = var13;
                var6[var0.field2675] = var12;
                var0.field2675++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field2675] = var13;
                    var5[var0.field2675] = var15;
                    var6[var0.field2675] = var12;
                    var0.field2675++;
                    var4[var0.field2675] = var15;
                    var5[var0.field2675] = var16;
                    var6[var0.field2675] = var12;
                    var0.field2675++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field2675] = var12;
                var5[var0.field2675] = var13;
                var6[var0.field2675] = 1;
                var0.field2675++;
            }
        }
        var0.field2686 = var0.field2717;
        var0.field2692 = null;
        var0.field2677 = null;
        var0.field2719 = null;
        var0.field2718 = null;
        var0.field2674 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method760(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1676[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1674 = arg2;
        this.field1689 = arg3;
        this.field1677 = arg4;
        this.field1687 = arg7;
        this.field1690 = arg1;
        this.field1679 = arg6;
        this.field1683 = arg5;
        this.field1685 = arg0;
    }
}
