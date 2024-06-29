import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class105 extends class153 {

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "Ltg;")
    private static class184 field1905 = class135.method812("flash3:", 3);

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "Ltg;")
    private static class184 field1911 = class135.method812("Create a free account", 3);

    @OriginalMember(owner = "client!l", name = "db", descriptor = "Ltg;")
    public static class184 field1906 = field1911;

    @OriginalMember(owner = "client!l", name = "nb", descriptor = "Ltg;")
    public static class184 field1916 = field1905;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "Ltg;")
    public static class184 field1907 = field1905;

    @OriginalMember(owner = "client!l", name = "mb", descriptor = "Ltg;")
    public static class184 field1915 = class135.method812("Bitte warten Sie)3)3)3", 3);

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
    public static int field1914 = 0;

    @OriginalMember(owner = "client!l", name = "ob", descriptor = "Ltg;")
    public static class184 field1917 = class135.method812("Hier wechseln", 3);

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!l", name = "pb", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!l", name = "qb", descriptor = "[I")
    public static int[] field1919;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBIIII)V")
    public static final void method654(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2047 & -arg1 + 2048;
        ++field1908;
        if (arg2 != 75) {
            method655(-106);
        }
        int var8 = -arg3 + 2048 & 2047;
        int var9 = 0;
        int var10 = arg0;
        if (var7 != 0) {
            int var11 = class23.field422[var7];
            int var12 = class23.field434[var7];
            int var13 = var9 * var12 - arg0 * var11 >> 16;
            var10 = var9 * var11 + arg0 * var12 >> 16;
            var9 = var13;
        }
        int var14 = 0;
        if (~var8 != -1) {
            int var15 = class23.field422[var8];
            int var16 = class23.field434[var8];
            int var17 = var10 * var15 + var14 * var16 >> 16;
            var10 = var10 * var16 + -(var14 * var15) >> 16;
            var14 = var17;
        }
        class59.field1096 = -var14 + arg4;
        class34.field590 = arg3;
        class143.field2585 = -var9 + arg6;
        class119.field2147 = arg1;
        class78.field1418 = -var10 + arg5;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public static final void method655(int arg0) {
        class67.field1278.method770(false);
        ++field1918;
        class200.field3872.method770(false);
        if (arg0 != 2047) {
            method656(true, (byte) -34, 62, 86);
        }
        class40.field746.method770(false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZBII)Ltg;")
    public static final class184 method656(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field1913;
        if (arg2 >= 2 && arg2 <= 36) {
            int var4 = 1;
            int var5 = arg3 / arg2;
            while (~var5 != -1) {
                var5 /= arg2;
                ++var4;
            }
            int var6 = var4;
            if (~arg3 > -1 || arg0) {
                var6 = var4 + 1;
            }
            if (arg1 != 127) {
                method656(false, (byte) 38, 29, 12);
            }
            byte[] var7 = new byte[var6];
            if (~arg3 <= -1) {
                if (arg0) {
                    var7[0] = 43;
                }
            } else {
                var7[0] = 45;
            }
            for (int var8 = 0; var4 > var8; ++var8) {
                int var10 = arg3 % arg2;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 9) {
                    var10 += 39;
                }
                var7[var6 + -1 + -var8] = (byte) (var10 + 48);
                arg3 /= arg2;
            }
            class184 var9 = new class184();
            var9.field3555 = var6;
            var9.field3527 = var7;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILvb;Lvb;Lvb;)V")
    public static final void method657(int arg0, class197 arg1, class197 arg2, class197 arg3) {
        class173.field3280 = arg2;
        ++field1912;
        if (arg0 == 0) {
            class170.field3235 = arg3;
            class150.field2686 = arg1;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field1910;
        int[][] var3 = super.field232.method673(arg0, -115);
        int var4 = -59 % ((arg1 - -58) / 34);
        if (super.field232.field1962 && this.method930(-1)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = arg0 % super.field2745 * super.field2745;
            for (int var9 = 0; class201.field3889 > var9; ++var9) {
                int var10 = super.field2744[var9 % super.field2737 + var8];
                var7[var9] = class10.method61(var10 << 4, 4080);
                var6[var9] = class10.method61(65280, var10) >> 4;
                var5[var9] = class10.method61(16711680, var10) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public static void method658(byte arg0) {
        field1911 = null;
        field1906 = null;
        field1907 = null;
        field1919 = null;
        field1917 = null;
        field1915 = null;
        if (arg0 >= -125) {
            method658((byte) 7);
        }
        field1916 = null;
        field1905 = null;
    }
}
