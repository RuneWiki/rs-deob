import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class190 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    private int field2667;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
    private boolean field2680;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    private int field2670;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    private int field2666;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private int field2671;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    private static int[] field2668 = new int[4];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    private int field2672;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    private int field2673;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lc;")
    private static class121 field2681;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lf;")
    private static class529 field2675;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lf;")
    private static class529 field2677;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lf;")
    private class529 field2683;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqa;Lsb;)V")
    private final void method1219(class162 arg0, class190 arg1) {
        method1223(arg0);
        method1228(arg0);
        arg0.method613(field2668);
        arg0.method572(0, 0, this.field2679, this.field2679);
        arg0.method600();
        arg0.method585(0, 0, this.field2679, this.field2679, this.field2666 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2680) {
                var3 = -arg1.field2667;
                var4 = -arg1.field2669;
                var5 = -arg1.field2682;
            } else {
                var3 = arg1.field2667 - this.field2667;
                var4 = arg1.field2669 - this.field2669;
                var5 = arg1.field2682 - this.field2682;
            }
        }
        if (this.field2673 != 0) {
            int var6 = class305.field4019[this.field2673];
            int var7 = class305.field4022[this.field2673];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2672 != 0) {
            int var9 = class305.field4019[this.field2672];
            int var10 = class305.field4022[this.field2672];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class121 var12 = field2681.method863((byte) 0, 51200, true);
        if (arg0.method519()) {
            var12.method872((short) 0, (short) this.field2670);
        } else {
            var12.method865((short) 127, class155.field2276.method677(2459, this.field2670).field3647);
            var12.method872((short) 0, (short) -1);
        }
        arg0.method559(1.0F);
        arg0.method592(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2679 * 1024 / (var12.method873() - var12.method845());
        if (this.field2666 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method573(this.field2679 / 2, this.field2679 / 2, var13, var13);
        arg0.method603(arg0.method538());
        class414 var14 = arg0.method538();
        var14.method971(0, 0, arg0.method560() - var12.method850());
        var12.method857(var14, null, 1024, 1);
        int var15 = this.field2679 * 13 / 16;
        int var16 = (this.field2679 - var15) / 2;
        field2675.method155(var16, var16, var15, var15, 0, this.field2666 | 0xFF000000, 1);
        this.field2683 = arg0.method618(0, 0, this.field2679, this.field2679, true);
        arg0.method600();
        arg0.method585(0, 0, this.field2679, this.field2679, 0, 0);
        field2677.method155(0, 0, this.field2679, this.field2679, 1, 0, 0);
        this.field2683.method164(0, 0, 0);
        arg0.method572(field2668[0], field2668[1], field2668[2], field2668[3]);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public final void method1220() {
        this.field2683 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lqa;Lsb;)V")
    private final void method1221(class162 arg0, class190 arg1) {
        class118 var3 = class116.method798(class151.field2138, 0, this.field2670, (byte) -117);
        if (var3 == null) {
            return;
        }
        arg0.method613(field2668);
        arg0.method572(0, 0, this.field2679, this.field2679);
        arg0.method585(0, 0, this.field2679, this.field2679, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2680) {
                var4 = -arg1.field2667;
                var5 = -arg1.field2669;
                var6 = -arg1.field2682;
            } else {
                var4 = this.field2667 - arg1.field2667;
                var5 = this.field2669 - arg1.field2669;
                var6 = this.field2682 - arg1.field2682;
            }
        }
        if (this.field2673 != 0) {
            int var7 = -this.field2673 & 0x3FFF;
            int var8 = class305.field4019[var7];
            int var9 = class305.field4022[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2672 != 0) {
            int var11 = -this.field2672 & 0x3FFF;
            int var12 = class305.field4019[var11];
            int var13 = class305.field4022[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method559(1.0F);
        arg0.method592(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class121 var15 = arg0.method531(var3, 2048, 0, 64, 768);
        int var16 = var15.method873() - var15.method845();
        int var17 = var15.method876() - var15.method861();
        int var18 = var15.method845() + var16 / 2;
        int var19 = var15.method861() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method573(var18, var19, var20, var20);
        arg0.method603(arg0.method538());
        class414 var21 = arg0.method611();
        var21.method971(0, 0, arg0.method560() - var15.method850());
        var15.method857(var21, null, arg0.method560(), 1);
        this.field2683 = arg0.method618(0, 0, this.field2679, this.field2679, true);
        this.field2683.method164(0, 0, 3);
        arg0.method572(field2668[0], field2668[1], field2668[2], field2668[3]);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)Z")
    public final boolean method1222(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2680) {
            this.field2674 = 1073741823;
            var8 = this.field2667;
            var9 = this.field2669;
            var10 = this.field2682;
        } else {
            int var5 = this.field2667 - arg0;
            int var6 = this.field2669 - arg1;
            int var7 = this.field2682 - arg2;
            this.field2674 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2674 == 0) {
                this.field2674 = 1;
            }
            var8 = (var5 << 8) / this.field2674;
            var9 = (var6 << 8) / this.field2674;
            var10 = (var7 << 8) / this.field2674;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2676 = this.field2678 * arg3 / (this.field2680 ? 1024 : this.field2674);
        } else {
            this.field2676 = 0;
        }
        if (this.field2676 < 8) {
            this.field2683 = null;
            return false;
        }
        int var12 = class321.method1857((byte) 113, this.field2676);
        if (var12 > arg3) {
            var12 = class415.method2408(arg3, (byte) -109);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2679 != var12) {
            this.field2679 = var12;
        }
        this.field2673 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2672 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2683 = null;
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqa;)V")
    private static final void method1223(class162 arg0) {
        if (field2681 != null) {
            return;
        }
        class118 var1 = new class118(580, 1104, 1);
        var1.method817((short) 0, (byte) 0, -256, (byte) 0, (short) 1024, (short) 0, (short) 32767, (byte) 0, (short) 1024, (short) 1024);
        var1.method813(0, 128, 0, 0);
        var1.method813(0, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class305.field4019[var3];
            int var5 = class305.field4022[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class305.field4022[var12] >> 8;
                int var14 = class305.field4019[var12] * var4 >> 23;
                int var15 = class305.field4019[var12] * var5 >> 23;
                var1.method813(var15, var13, -var14, 0);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method809((short) 127, (short) 0, var8, 0, (byte) 0, var7, -125, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method809((short) 127, (short) 0, var10, var8, (byte) 0, var7, -112, (byte) 0, (byte) 0);
                    var1.method809((short) 127, (short) 0, var11, var10, (byte) 0, var7, -118, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method809((short) 127, (short) 0, var8, var7, (byte) 0, 1, -128, (byte) 0, (byte) 0);
            }
        }
        var1.field1693 = var1.field1694;
        var1.field1718 = null;
        var1.field1719 = null;
        var1.field1690 = null;
        field2681 = arg0.method531(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
    public static void method1224() {
        field2681 = null;
        field2675 = null;
        field2677 = null;
        field2668 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Lqa;Lsb;)Z")
    public final boolean method1225(class162 arg0, class190 arg1) {
        return this.field2683 != null || this.method1227(arg0, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method1226(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2683 == null) {
            return;
        }
        int var8 = this.field2673 - arg5 & 0x3FFF;
        int var9 = this.field2672 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2676) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2676) / 2;
        if (var10 < arg4 && this.field2676 + var10 > 0 && var11 < arg3 && this.field2676 + var11 > 0) {
            this.field2683.method3114(arg1 + var11, arg2 + var10, this.field2676, this.field2676);
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(Lqa;Lsb;)Z")
    private final boolean method1227(class162 arg0, class190 arg1) {
        if (this.field2683 == null) {
            if (this.field2671 == 0) {
                if (class155.field2276.method680(-16576, this.field2670)) {
                    int[] var3 = class155.field2276.method681(0.7F, false, this.field2679, this.field2679, 1519, this.field2670);
                    this.field2683 = arg0.method598(var3, 0, this.field2679, this.field2679, this.field2679);
                }
            } else if (this.field2671 == 2) {
                this.method1221(arg0, arg1);
            } else if (this.field2671 == 1) {
                this.method1219(arg0, arg1);
            }
        }
        return this.field2683 != null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lqa;)V")
    private static final void method1228(class162 arg0) {
        if (field2677 != null) {
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
        field2677 = arg0.method598(var2, 0, 128, 128, 128);
        field2675 = arg0.method598(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()V")
    public static final void method1229() {
        field2681 = null;
        field2677 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2667 = arg2;
        this.field2669 = arg3;
        this.field2682 = arg4;
        this.field2680 = arg7;
        this.field2670 = arg1;
        this.field2666 = arg6;
        this.field2678 = arg5;
        this.field2671 = arg0;
    }
}
