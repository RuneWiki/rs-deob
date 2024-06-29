import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class442 extends class145 {

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    private int field6360 = 4;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    private int field6364 = 4;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "Z")
    public static boolean field6363 = false;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field6357 = 0;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "[I")
    public static int[] field6368 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!up", name = "N", descriptor = "F")
    public static float field6365;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "J")
    public static long field6358;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "Lvm;")
    public static class323 field6362;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "Lkb;")
    public static class80 field6361;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "[I")
    public static int[] field6369;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field6370;
        int[] var3 = super.field2218.method1614(39, arg0);
        if (super.field2218.field3396) {
            int var4 = class156.field2364 / this.field6360;
            int var5 = class81.field1209 / this.field6364;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1119(0, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1119(0, 0, class81.field1209 * var7 / var5);
            }
            for (int var8 = 0; ~var8 > ~class156.field2364; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class156.field2364 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        int var10 = -113 / ((16 - arg1) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field6367;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field6364 = arg0.method1861((byte) -72);
            }
        } else {
            this.field6360 = arg0.method1861((byte) -72);
        }
        int var5 = 77 / ((arg1 - 11) / 52);
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(B)V")
    public static void method2744(byte arg0) {
        field6369 = null;
        field6362 = null;
        field6361 = null;
        field6368 = null;
        if (arg0 != 21) {
            method2745((byte) 60);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class442() {
        super(1, false);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field6366;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int var4 = class156.field2364 / this.field6360;
            int var5 = class81.field1209 / this.field6364;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1121(class81.field1209 * var6 / var5, 0, 2);
            } else {
                var7 = this.method1121(0, 0, 2);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class156.field2364; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class156.field2364 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        if (!arg0) {
            field6358 = -105L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(B)V")
    public static final void method2745(byte arg0) {
        if (arg0 == -115) {
            class127.field1786.method2539(89);
            ++field6359;
            class362.field4992.method2539(33);
        }
    }
}
