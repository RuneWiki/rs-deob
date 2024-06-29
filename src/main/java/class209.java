import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class209 {

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[I")
    private int[] field3585;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
    private int[] field3584;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lfb;")
    private class212 field3588;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lfb;")
    private class212 field3580;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[Lfb;")
    private class212[] field3579;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lsc;")
    private static class181 field3581 = class149.method967(255, "Loading config )2 ");

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lsc;")
    public static class181 field3578 = field3581;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field3590 = 3;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[J")
    public static long[] field3587 = new long[256];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[B")
    public static byte[] field3591;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZB)V")
    public static final void method1385(boolean arg0, byte arg1) {
        field3586++;
        class259.field4527 = arg0;
        if (arg1 != 119) {
            field3591 = null;
        }
        class46.field732 = !class219.method1460(arg1 ^ 0x317B616);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
    public static final boolean method1386(int arg0, int arg1) {
        field3582++;
        if (arg1 > -31) {
            field3587 = null;
        }
        return ((arg0 & 0x3E989E6F) >> 29) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)[Lpd;")
    public static final class48[] method1387(int arg0) {
        field3589++;
        class48[] var1 = new class48[class33.field535];
        for (int var2 = 0; var2 < class33.field535; var2++) {
            int var3 = class196.field3425[var2] * class121.field1978[var2];
            byte[] var4 = class143.field2319[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class254.field4443[class5.method43(var4[var6], 255)];
            }
            var1[var2] = new class48(class219.field3777, class78.field1273, class220.field3782[var2], class23.field410[var2], class196.field3425[var2], class121.field1978[var2], var5);
        }
        if (arg0 <= 67) {
            method1387(115);
        }
        class143.method919(16);
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljb;IZILwf;DIZ)[I")
    public final int[] method1388(class11 arg0, int arg1, boolean arg2, int arg3, class204 arg4, double arg5, int arg6, boolean arg7) {
        field3583++;
        class92.method611(false, arg5);
        class126.field2085 = arg4;
        if (arg1 != -32162268) {
            field3591 = null;
        }
        int[] var10 = new int[arg3 * arg6];
        class137.field2239 = arg0;
        class52.method389(arg3, arg6, (byte) -4);
        for (int var11 = 0; var11 < this.field3579.length; var11++) {
            this.field3579[var11].method1408(arg6, arg3, -256);
        }
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var12 = -1;
            var13 = arg3 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = arg3;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3588.field3651) {
                int[] var18 = this.field3588.method24(var16, (byte) 101);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3588.method260(var16, arg1 ^ 0xFE1501DB);
                var20 = var22[2];
                var19 = var22[1];
                var21 = var22[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class135.field2198[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class135.field2198[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class135.field2198[var26];
                var10[var15++] = (var27 << 16) - (-(var28 << 8) - var29);
                if (arg2) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3579.length; var17++) {
            this.field3579[var17].method1042(arg1 + 32170157);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method1389(boolean arg0) {
        field3578 = null;
        field3591 = null;
        field3587 = null;
        if (arg0) {
            method1387(-124);
        }
        field3581 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class209() {
        this.field3585 = new int[0];
        this.field3584 = new int[0];
        this.field3588 = new class2();
        this.field3588.field3654 = 1;
        this.field3580 = new class2();
        this.field3579 = new class212[] { this.field3588, this.field3580 };
        this.field3580.field3654 = 1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjb;Lwf;)Z")
    public final boolean method1390(boolean arg0, class11 arg1, class204 arg2) {
        field3592++;
        if (arg0) {
            method1389(false);
        }
        for (int var4 = 0; var4 < this.field3584.length; var4++) {
            if (!arg1.method94(this.field3584[var4], (byte) 100)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field3585.length; var5++) {
            if (!arg2.method932(this.field3585[var5], (byte) -112)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lvf;)V")
    public class209(class230 arg0) {
        int var2 = arg0.method1516((byte) 82);
        this.field3579 = new class212[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class212 var16 = class120.method790(12800, arg0);
            if (var16.method1040((byte) -92) >= 0) {
                var3++;
            }
            if (var16.method1411(-1) >= 0) {
                var5++;
            }
            int var17 = var16.field3659.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1516((byte) 82);
            }
            this.field3579[var6] = var16;
        }
        this.field3584 = new int[var3];
        int var7 = 0;
        this.field3585 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class212 var11 = this.field3579[var9];
            int var12 = var11.field3659.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3659[var13] = this.field3579[var4[var9][var13]];
            }
            int var14 = var11.method1040((byte) -92);
            int var15 = var11.method1411(-1);
            if (var14 > 0) {
                this.field3584[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3585[var8++] = var15;
            }
            var4[var9] = null;
        }
        this.field3588 = this.field3579[arg0.method1516((byte) 82)];
        Object var10 = null;
        this.field3580 = this.field3579[arg0.method1516((byte) 82)];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3587[var0] = var1;
        }
        field3591 = new byte[520];
    }
}
