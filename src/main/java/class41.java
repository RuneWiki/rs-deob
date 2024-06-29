import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Z")
    private boolean field619;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[I")
    private static int[] field610 = new int[4];

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "La;")
    private static class162 field621;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lta;")
    private class203 field618;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[B")
    private static byte[] field608;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method269(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field608[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
    private final void method270() {
        int var1 = this.field617 * 3 / 32;
        int var3 = this.field617 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class266.field4275 * var1 + var1;
        int var8 = class266.field4275 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class266.field4280) {
            var4 = var3 - (var1 + var3 - class266.field4280);
        }
        if (var1 < class266.field4281) {
            int var11 = class266.field4281 - var1;
            var4 -= var11;
            var7 += class266.field4275 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class266.field4278) {
            int var12 = var1 + var3 - class266.field4278;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class266.field4279) {
            int var13 = class266.field4279 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method269(class266.field4282, 0, this.field613, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIILok;)V")
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class41 arg6) {
        int var8 = this.field615 - arg4 & 0x7FF;
        int var9 = this.field611 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field623) / 2 + var10;
        int var13 = (arg2 - this.field623) / 2 + var11;
        if (var12 < arg3 && this.field623 + var12 > 0 && var13 < arg2 && this.field623 + var13 > 0 && this.method273(arg6)) {
            this.field618.method685(arg0 + var13, arg1 + var12, this.field623, this.field623);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V")
    private static final void method272() {
        if (field608 != null) {
            return;
        }
        field608 = new byte[16384];
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
                field608[var4 + var6] = field608[var4 + var9] = field608[var5 + var6] = field608[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;)Z")
    private final boolean method273(class41 arg0) {
        if (this.field618 == null) {
            if (this.field614 == 0) {
                this.field618 = class118.field1696.method562(this.field617, 116, true, class118.field1689, this.field624);
            } else if (this.field614 == 2) {
                this.method274(arg0);
            } else if (this.field614 == 1) {
                this.method276(arg0);
            }
        }
        return this.field618 != null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lok;)V")
    private final void method274(class41 arg0) {
        class162 var2 = class162.method1036(class214.field3236, this.field624, 0);
        if (var2 == null) {
            return;
        }
        this.field618 = new class203(this.field617, this.field617);
        class266.method1731(field610);
        this.field618.method1262();
        class118.method765();
        class266.method1730(0, 0, this.field617, this.field617, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field619) {
                var3 = -arg0.field609;
                var4 = -arg0.field612;
                var5 = -arg0.field620;
            } else {
                var3 = this.field609 - arg0.field609;
                var4 = this.field612 - arg0.field612;
                var5 = this.field620 - arg0.field620;
            }
        }
        if (this.field615 != 0) {
            int var6 = class118.field1697[this.field615];
            int var7 = class118.field1690[this.field615];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field611 != 0) {
            int var9 = this.field611 - 1024 & 0x7FF;
            int var10 = class118.field1697[var9];
            int var11 = class118.field1690[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class66 var13 = var2.method1015(64, 768, -var3, -var4, -var5);
        int var14 = var13.method419() - var13.method434();
        int var15 = var13.method437() - var13.method9();
        int var16 = var13.method434() + var14 / 2;
        int var17 = var13.method9() + var15 / 2;
        if (var14 > var15) {
            var13.method408(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field617);
        } else {
            var13.method408(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field617);
        }
        class24.field382.method1586((byte) 94);
        class266.method1727(field610);
        class118.method765();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method275(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field608[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method281();
        super.finalize();
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Lok;)V")
    private final void method276(class41 arg0) {
        method278();
        method272();
        this.field618 = new class269(this.field617, this.field617);
        class266.method1731(field610);
        this.field618.method1262();
        class118.method765();
        class266.method1730(0, 0, this.field617, this.field617, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field619) {
                var2 = -arg0.field609;
                var3 = -arg0.field612;
                var4 = -arg0.field620;
            } else {
                var2 = this.field609 - arg0.field609;
                var3 = this.field612 - arg0.field612;
                var4 = this.field620 - arg0.field620;
            }
        }
        if (this.field615 != 0) {
            int var5 = class118.field1697[this.field615];
            int var6 = class118.field1690[this.field615];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field611 != 0) {
            int var8 = this.field611 - 1024 & 0x7FF;
            int var9 = class118.field1697[var8];
            int var10 = class118.field1690[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class285.method1882(field621.field2258, 0, field621.field2273, (short) class118.field1696.method560(this.field624, 65535));
        class66 var12 = field621.method1015(64, 512, -var2, -var3, -var4);
        int var13 = var12.method419() - var12.method434();
        int var14 = var12.method437() - var12.method9();
        if (var13 > var14) {
            int var15 = this.field613 == 0 ? (var13 << 9) / this.field617 : (var13 * 16 << 9) / (this.field617 * 13);
            var12.method408(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field613 == 0 ? (var14 << 9) / this.field617 : (var14 * 16 << 9) / (this.field617 * 13);
            var12.method408(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field613 == 0) {
            for (int var17 = 0; var17 < class266.field4282.length; var17++) {
                if (class266.field4282[var17] != 0) {
                    class266.field4282[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method270();
            this.method279();
        }
        class24.field382.method1586((byte) 96);
        class266.method1727(field610);
        class118.method765();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)Z")
    public final boolean method277(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field619) {
            this.field622 = 1073741823;
            var8 = this.field609;
            var9 = this.field612;
            var10 = this.field620;
        } else {
            int var5 = this.field609 - arg0;
            int var6 = this.field612 - arg1;
            int var7 = this.field620 - arg2;
            this.field622 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field622 == 0) {
                this.field622 = 1;
            }
            var8 = (var5 << 8) / this.field622;
            var9 = (var6 << 8) / this.field622;
            var10 = (var7 << 8) / this.field622;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field623 = this.field616 * arg3 / (this.field619 ? 1024 : this.field622);
        } else {
            this.field623 = 0;
        }
        if (this.field623 < 8) {
            this.method281();
            this.field618 = null;
            return false;
        }
        int var12 = class281.method1825(62, this.field623);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field617 != var12) {
            this.field617 = var12;
        }
        this.field615 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field611 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field618 = null;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()V")
    private static final void method278() {
        if (field621 != null) {
            return;
        }
        class162 var0 = field621 = new class162(260, 480, 0);
        int[] var1 = var0.field2301;
        int[] var2 = var0.field2294;
        int[] var3 = var0.field2284;
        int[] var4 = var0.field2268;
        int[] var5 = var0.field2280;
        int[] var6 = var0.field2292;
        var0.field2308 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class118.field1697[var8] >> 1;
            int var10 = class118.field1690[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class118.field1690[var17] >> 9;
                int var19 = (class118.field1697[var17] >> 1) * var9 >> 23;
                int var20 = (class118.field1697[var17] >> 1) * var10 >> 23;
                var1[var0.field2308] = var20;
                var2[var0.field2308] = var18;
                var3[var0.field2308] = -var19;
                var0.field2308++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field2273] = 0;
                var5[var0.field2273] = var13;
                var6[var0.field2273] = var12;
                var0.field2273++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field2273] = var13;
                    var5[var0.field2273] = var15;
                    var6[var0.field2273] = var12;
                    var0.field2273++;
                    var4[var0.field2273] = var15;
                    var5[var0.field2273] = var16;
                    var6[var0.field2273] = var12;
                    var0.field2273++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field2273] = var12;
                var5[var0.field2273] = var13;
                var6[var0.field2273] = 1;
                var0.field2273++;
            }
        }
        var0.field2260 = var0.field2308;
        var0.field2291 = null;
        var0.field2289 = null;
        var0.field2263 = null;
        var0.field2271 = null;
        var0.field2300 = null;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()V")
    private final void method279() {
        int var1 = this.field617;
        int var2 = this.field617;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class266.field4275 - var1;
        if (var2 > class266.field4280) {
            var2 -= var2 - class266.field4280;
        }
        if (class266.field4281 > 0) {
            int var9 = class266.field4281;
            var2 -= var9;
            var7 += class266.field4275 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class266.field4278) {
            int var10 = var1 - class266.field4278;
            var1 -= var10;
            var8 += var10;
        }
        if (class266.field4279 > 0) {
            int var11 = class266.field4279;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method275(class266.field4282, this.field613, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()V")
    public static void method280() {
        field621 = null;
        field608 = null;
        field610 = null;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()V")
    private final void method281() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field609 = arg2;
        this.field612 = arg3;
        this.field620 = arg4;
        this.field619 = arg7;
        this.field624 = arg1;
        this.field613 = arg6;
        this.field616 = arg5;
        this.field614 = arg0;
    }
}
