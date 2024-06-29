import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class317 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
    private boolean field4789;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    private int field4800;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    private int field4799;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    private static int[] field4788 = new int[4];

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lkr;")
    private static class234 field4790;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lkr;")
    private class234 field4794;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lkr;")
    private static class234 field4798;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lwp;")
    private static class292 field4795;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ldr;Lbj;)Z")
    public final boolean method1931(class261 arg0, class317 arg1) {
        return this.field4794 != null || this.method1933(arg0, arg1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ldr;)V")
    private static final void method1932(class261 arg0) {
        if (field4790 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field4790 = arg0.method401(var2, 0, 128, 128, 128);
        field4798 = arg0.method401(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Ldr;Lbj;)Z")
    private final boolean method1933(class261 arg0, class317 arg1) {
        if (this.field4794 == null) {
            if (this.field4799 == 0) {
                if (class145.field1930.method178(false, this.field4804)) {
                    int[] var3 = class145.field1930.method183(30111, 0.7F, this.field4796, this.field4804, false, this.field4796);
                    this.field4794 = arg0.method401(var3, 0, this.field4796, this.field4796, this.field4796);
                }
            } else if (this.field4799 == 2) {
                this.method1935(arg0, arg1);
            } else if (this.field4799 == 1) {
                this.method1937(arg0, arg1);
            }
        }
        return this.field4794 != null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)Z")
    public final boolean method1934(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4789) {
            this.field4797 = 1073741823;
            var8 = this.field4787;
            var9 = this.field4802;
            var10 = this.field4793;
        } else {
            int var5 = this.field4787 - arg0;
            int var6 = this.field4802 - arg1;
            int var7 = this.field4793 - arg2;
            this.field4797 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4797 == 0) {
                this.field4797 = 1;
            }
            var8 = (var5 << 8) / this.field4797;
            var9 = (var6 << 8) / this.field4797;
            var10 = (var7 << 8) / this.field4797;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4803 = this.field4800 * arg3 / (this.field4789 ? 1024 : this.field4797);
        } else {
            this.field4803 = 0;
        }
        if (this.field4803 < 8) {
            this.field4794 = null;
            return false;
        }
        int var12 = class196.method1174(81, this.field4803);
        if (var12 > arg3) {
            var12 = class275.method1708(arg3, true);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4796 != var12) {
            this.field4796 = var12;
        }
        this.field4801 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4791 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4794 = null;
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(Ldr;Lbj;)V")
    private final void method1935(class261 arg0, class317 arg1) {
        class49 var3 = class451.method2775(0, this.field4804, class151.field2081, 18325);
        if (var3 == null) {
            return;
        }
        arg0.method415(field4788);
        arg0.method436(0, 0, this.field4796, this.field4796);
        arg0.method358(0, 0, this.field4796, this.field4796, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4789) {
                var4 = -arg1.field4787;
                var5 = -arg1.field4802;
                var6 = -arg1.field4793;
            } else {
                var4 = this.field4787 - arg1.field4787;
                var5 = this.field4802 - arg1.field4802;
                var6 = this.field4793 - arg1.field4793;
            }
        }
        if (this.field4801 != 0) {
            int var7 = -this.field4801 & 0x3FFF;
            int var8 = class110.field1450[var7];
            int var9 = class110.field1452[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4791 != 0) {
            int var11 = -this.field4791 & 0x3FFF;
            int var12 = class110.field1450[var11];
            int var13 = class110.field1452[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method365(1.0F);
        arg0.method360(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class292 var15 = arg0.method390(var3, 1024, 0, 64, 768);
        int var16 = var15.method1270() - var15.method1301();
        int var17 = var15.method1253() - var15.method1263();
        int var18 = var15.method1301() + var16 / 2;
        int var19 = var15.method1263() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method399(var18, var19, var20, var20);
        arg0.method397(arg0.method388());
        class361 var21 = arg0.method434();
        var21.method611(0, 0, arg0.method444() - var15.method1289());
        var15.method1283(var21, (class158) null, arg0.method444(), 1);
        this.field4794 = arg0.method373(0, 0, this.field4796, this.field4796, true);
        this.field4794.method1410(0, 0, 3);
        arg0.method436(field4788[0], field4788[1], field4788[2], field4788[3]);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public final void method1936() {
        this.field4794 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(Ldr;Lbj;)V")
    private final void method1937(class261 arg0, class317 arg1) {
        method1938(arg0);
        method1932(arg0);
        arg0.method415(field4788);
        arg0.method436(0, 0, this.field4796, this.field4796);
        arg0.method353();
        arg0.method358(0, 0, this.field4796, this.field4796, this.field4792 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4789) {
                var3 = -arg1.field4787;
                var4 = -arg1.field4802;
                var5 = -arg1.field4793;
            } else {
                var3 = arg1.field4787 - this.field4787;
                var4 = arg1.field4802 - this.field4802;
                var5 = arg1.field4793 - this.field4793;
            }
        }
        if (this.field4801 != 0) {
            int var6 = class110.field1450[this.field4801];
            int var7 = class110.field1452[this.field4801];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4791 != 0) {
            int var9 = class110.field1450[this.field4791];
            int var10 = class110.field1452[this.field4791];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class292 var12 = field4795.method1264((byte) 0, 25600, true);
        if (arg0.method420()) {
            var12.method1257((short) 0, (short) this.field4804);
        } else {
            var12.method1259((short) 127, class145.field1930.method180(this.field4804, -116).field2134);
            var12.method1257((short) 0, (short) -1);
        }
        arg0.method365(1.0F);
        arg0.method360(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4796 * 1024 / (var12.method1270() - var12.method1301());
        if (this.field4792 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method399(this.field4796 / 2, this.field4796 / 2, var13, var13);
        arg0.method397(arg0.method388());
        class361 var14 = arg0.method388();
        var14.method611(0, 0, arg0.method444() - var12.method1289());
        var12.method1283(var14, (class158) null, 1024, 1);
        int var15 = this.field4796 * 13 / 16;
        int var16 = (this.field4796 - var15) / 2;
        field4798.method1222(var16, var16, var15, var15, 1, this.field4792 | 0xFF000000, 1);
        this.field4794 = arg0.method373(0, 0, this.field4796, this.field4796, true);
        arg0.method353();
        arg0.method358(0, 0, this.field4796, this.field4796, 0, 0);
        field4790.method1222(0, 0, this.field4796, this.field4796, 0, 0, 0);
        this.field4794.method1410(0, 0, 0);
        arg0.method436(field4788[0], field4788[1], field4788[2], field4788[3]);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Ldr;)V")
    private static final void method1938(class261 arg0) {
        if (field4795 != null) {
            return;
        }
        class49 var1 = new class49(580, 1104, 1);
        var1.method271((short) 1024, (short) 1024, (short) 0, (short) 1024, (byte) 0, (byte) 0, (short) 32767, (byte) 0, (short) 0, 29028);
        var1.method277(0, -127, 128, 0);
        var1.method277(0, -128, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class110.field1450[var3];
            int var5 = class110.field1452[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class110.field1452[var12] >> 8;
                int var14 = class110.field1450[var12] * var4 >> 23;
                int var15 = class110.field1450[var12] * var5 >> 23;
                var1.method277(-var14, -128, var13, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method279((short) 127, var8, 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, var7, (byte) -74);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method279((short) 127, var10, var8, (short) 0, (byte) 0, (byte) 0, (byte) 0, var7, (byte) -74);
                    var1.method279((short) 127, var11, var10, (short) 0, (byte) 0, (byte) 0, (byte) 0, var7, (byte) -74);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method279((short) 127, var8, var7, (short) 0, (byte) 0, (byte) 0, (byte) 0, 1, (byte) -74);
            }
        }
        var1.field610 = var1.field611;
        var1.field634 = null;
        var1.field624 = null;
        var1.field607 = null;
        field4795 = arg0.method390(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
    public static void method1939() {
        field4795 = null;
        field4798 = null;
        field4790 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()V")
    public static final void method1940() {
        field4795 = null;
        field4790 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ldr;IIIIII)V")
    public final void method1941(class261 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4794 == null) {
            return;
        }
        int var8 = this.field4801 - arg5 & 0x3FFF;
        int var9 = this.field4791 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4803) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4803) / 2;
        if (var10 < arg4 && this.field4803 + var10 > 0 && var11 < arg3 && this.field4803 + var11 > 0) {
            this.field4794.method1409(arg1 + var11, arg2 + var10, this.field4803, this.field4803);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4787 = arg2;
        this.field4802 = arg3;
        this.field4793 = arg4;
        this.field4789 = arg7;
        this.field4804 = arg1;
        this.field4792 = arg6;
        this.field4800 = arg5;
        this.field4799 = arg0;
    }
}
