import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class220 extends class287 {

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field3872 = 0;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Lmh;")
    public static class128 field3870 = class22.method156(124, "Versteckt");

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "[I")
    public static int[] field3874 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "J")
    public long field3876;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "Lmh;")
    public static class128 field3879;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Lgj;")
    public class220 field3880;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "Lgj;")
    public class220 field3881;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI[B)Lmh;", line = 6)
    public static final class128 method1520(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3875++;
        class128 var4 = new class128();
        var4.field2224 = new byte[arg0];
        var4.field2181 = 0;
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field2224[var4.field2181++] = arg3[var5];
            }
        }
        if (arg1 < 85) {
            method1525(54, -123, 17, -14, true, 58, -20);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 52)
    public final void method1521(int arg0) {
        field3871++;
        if (this.field3880 == null) {
            return;
        }
        this.field3880.field3881 = this.field3881;
        this.field3881.field3880 = this.field3880;
        this.field3881 = null;
        this.field3880 = null;
        if (arg0 != -3810) {
            method1522(113, -40, (class314) null, -119);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILdj;I)[Lng;", line = 85)
    public static final class152[] method1522(int arg0, int arg1, class314 arg2, int arg3) {
        field3878++;
        if (class118.method708(arg3 + 16711934, arg1, arg2, arg0)) {
            return arg3 == -16711936 ? class239.method1630((byte) 29) : (class152[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 100)
    public static void method1523(int arg0) {
        if (arg0 != 0) {
            method1520(-80, (byte) 116, -25, (byte[]) null);
        }
        field3874 = null;
        field3879 = null;
        field3870 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZII)V", line = 112)
    public static final void method1524(boolean arg0, int arg1, int arg2) {
        field3873++;
        if (class139.field2392 > 0) {
            class262.method1841((byte) -69, class139.field2392);
            class139.field2392 = 0;
        }
        int var3 = class213.field3772 * arg2;
        short var4 = 256;
        int var5 = 0;
        int var6 = 0;
        if (arg0) {
            method1524(false, -127, -70);
        }
        for (int var7 = 1; var7 < (var4 - 1); var7++) {
            int var8 = (var4 - var7) * class229.field3993[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class213.field3769[arg1 + var3++];
                int var11 = class128.field2222[var5++];
                if (var11 == 0) {
                    class283.field4871.field4003[var6++] = var10;
                } else {
                    int var12 = var11 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class233.field4025[var11];
                    class283.field4871.field4003[var6++] = class238.method1622(-16711936, class238.method1622(16711935, var10) * var13 + var12 * class238.method1622(var14, 16711935)) + class238.method1622(16711680, class238.method1622(65280, var14) * var12 + var13 * class238.method1622(var10, 65280)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class283.field4871.field4003[var6++] = class213.field3769[var3++ + arg1];
            }
            var3 += class213.field3772 - 128;
        }
        class283.field4871.method278(arg1, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIZII)I", line = 204)
    public static final int method1525(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        int var8 = arg2 & 0x3;
        field3877++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg5;
        } else {
            if (arg4) {
                method1523(-66);
            }
            return var8 == 2 ? -arg1 - (arg0 - 8) : -arg5 + 7 - (arg3 + -1);
        }
    }
}
