import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class367 extends class305 {

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    private int field5403 = 4096;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Ljp;")
    public static class55 field5406 = new class55(56, 0);

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "Lpu;")
    public static class179 field5411 = new class179("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Lpn;")
    public static class49 field5412 = new class49(79, 12);

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "Lpn;")
    public static class49 field5413 = new class49(8, -1);

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field5416 = 0;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "F")
    public static float field5415;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIIIII)V", line = 5)
    public static final void method2333(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5407;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = var9 - (var12 + -1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        if (arg0 != 105) {
            field5413 = null;
        }
        int var19 = (var6 + 1) * var16;
        if (class487.field7124 <= arg2 && ~class232.field3493 <= ~arg2) {
            int var20 = class306.method2023(arg0 ^ 108, class232.field3492, arg3 + arg5, class36.field453);
            int var21 = class306.method2023(5, class232.field3492, arg3 - arg5, class36.field453);
            class262.method1831(var20, class402.field5946[arg2], (byte) 43, arg4, var21);
        }
        int var22 = (arg1 + -1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var22 -= var15;
            int var23 = -var7 + arg2;
            int var24 = arg2 + var7;
            if (var24 >= class487.field7124 && var23 <= class232.field3493) {
                int var25 = class306.method2023(5, class232.field3492, arg3 + var6, class36.field453);
                int var26 = class306.method2023(arg0 + -100, class232.field3492, -var6 + arg3, class36.field453);
                if (~var23 <= ~class487.field7124) {
                    class262.method1831(var25, class402.field5946[var23], (byte) 43, arg4, var26);
                }
                if (~var24 >= ~class232.field3493) {
                    class262.method1831(var25, class402.field5946[var24], (byte) 43, arg4, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILfh;B)V", line = 107)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field5403 = arg1.method1396(30);
        }
        if (arg2 <= 76) {
            this.method14(-114, (class194) null, (byte) -49);
        }
        ++field5409;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILum;)Lap;", line = 121)
    public static final class29 method2334(int arg0, int arg1, int arg2, class83 arg3) {
        if (arg0 > -67) {
            method2333((byte) 52, 67, -17, -97, 35, 81);
        }
        ++field5404;
        byte[] var4 = arg3.method731(0, arg1, arg2);
        return var4 == null ? null : new class29(var4);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 206)
    public class367() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method15(int arg0, int arg1) {
        ++field5408;
        if (arg1 != 4688) {
            method2336(-99, 21);
        }
        int[] var3 = super.field4677.method2174(arg0, -121);
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(0, arg0 + -1 & class236.field3551, 0);
            int[] var5 = this.method2021(0, arg0, 0);
            int[] var6 = this.method2021(0, arg0 + 1 & class236.field3551, 0);
            for (int var7 = 0; var7 < class91.field1471; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field5403;
                int var9 = (var5[class228.field3447 & var7 + 1] + -var5[var7 - 1 & class228.field3447]) * this.field5403;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IF)F", line = 195)
    public static final float method2335(int arg0, float arg1) {
        if (arg0 > -10) {
            field5415 = 1.043443F;
        }
        ++field5405;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F + -15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[B", line = 210)
    public static final byte[] method2336(int arg0, int arg1) {
        ++field5410;
        class507 var2 = (class507) class291.field4497.method3008((long) arg0, (byte) 117);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = 255 - var6;
                int var8 = class58.method378(false, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class507(var3);
            class291.field4497.method3011((long) arg0, var2, 97);
        }
        if (arg1 != 255) {
            field5406 = null;
        }
        return var2.field7376;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V", line = 261)
    public static void method2337(int arg0) {
        if (arg0 != 1896327233) {
            method2337(12);
        }
        field5412 = null;
        field5406 = null;
        field5413 = null;
        field5411 = null;
    }
}
