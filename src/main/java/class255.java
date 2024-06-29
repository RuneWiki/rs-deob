import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class255 extends class288 {

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Z")
    public static boolean field3681 = false;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "[I")
    public int[] field3669;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "[I")
    public int[] field3670;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "[I")
    public int[] field3678;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "[Lbd;")
    public class81[] field3673;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "[Lbd;")
    public class81[] field3677;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "[Lwe;")
    public static class82[] field3684;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "[S")
    public static short[] field3685;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[[B")
    public static byte[][] field3682;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "[[[B")
    public byte[][][] field3675;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public static void method1630(int arg0) {
        field3682 = null;
        if (arg0 != 8162) {
            method1631(-109);
        }
        field3684 = null;
        field3685 = null;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        int var1 = class248.field3614.method539(class164.field2349);
        field3679++;
        if (arg0 != 256) {
            return;
        }
        for (int var2 = 0; var2 < class112.field1496; var2++) {
            int var6 = class248.field3614.method539(class59.method368(var2, (byte) -128));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        int var3 = class112.field1496 * 15 + 21;
        int var4 = class72.field866;
        var1 += 8;
        int var5 = class17.field215 - (var1 / 2);
        if ((var4 + var3) > client.field4437) {
            var4 = client.field4437 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if ((var5 + var1) > class84.field1166) {
            var5 = class84.field1166 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class253.field3661 == 1) {
            if (class17.field215 == class152.field2199 && class72.field866 == class257.field3719) {
                class177.field2518 = true;
                class253.field3661 = 0;
                class76.field911 = class112.field1496 * 15 + (class154.field2226 ? 26 : 22);
                class263.field3814 = var5;
                class221.field3134 = var4;
                class267.field3901 = var1;
            }
        } else if (class76.field905 == class17.field215 && class72.field866 == class190.field2736) {
            class177.field2518 = true;
            class263.field3814 = var5;
            class253.field3661 = 0;
            class221.field3134 = var4;
            class76.field911 = class112.field1496 * 15 + (class154.field2226 ? 26 : 22);
            class267.field3901 = var1;
        } else {
            class253.field3661 = 1;
            class257.field3719 = class190.field2736;
            class152.field2199 = class76.field905;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILwe;)V")
    public static final void method1632(int arg0, class82 arg1) {
        if (arg0 != 16711680) {
            field3682 = null;
        }
        field3672++;
        if (class156.field2256 == arg1.field1009) {
            class129.field1862[arg1.field1072] = true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
    public static final void method1633(int arg0, int arg1, int arg2) {
        if (class215.field3002 > 0) {
            class279.method1833((byte) 82, class215.field3002);
            class215.field3002 = 0;
        }
        field3683++;
        short var3 = 256;
        if (arg1 <= 23) {
            method1633(-93, -41, 42);
        }
        int var4 = 0;
        int var5 = class155.field2244 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class203.field2875[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class155.field2242[arg0 + (var5++)];
                int var12 = class58.field685[var4++];
                if (var12 == 0) {
                    class119.field1680.field2691[var6++] = var11;
                } else {
                    int var13 = var12 + 18;
                    int var14 = 256 - var12 - 18;
                    int var15 = class252.field3639[var12];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class119.field1680.field2691[var6++] = class5.method26(16711680, var13 * class5.method26(var15, 65280) + (var14 * class5.method26(65280, var11))) + class5.method26(-16711936, var13 * class5.method26(16711935, var15) + class5.method26(16711935, var11) * var14) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class119.field1680.field2691[var6++] = class155.field2242[arg0 + var5++];
            }
            var5 += class155.field2244 - 128;
        }
        class119.field1680.method851(arg0, arg2);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)J")
    public static final long method1634(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        return var3 == null || var3.field1927 == null ? 0L : var3.field1927.field1662;
    }
}
