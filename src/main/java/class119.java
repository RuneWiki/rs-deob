import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class119 {

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[[B")
    public static byte[][] field2120 = new byte[50][];

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Ljd;")
    public static class85 field2123 = class221.method1499("headicons_prayer", (byte) 87);

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljd;")
    public static class85 field2118 = class221.method1499("<img=0>", (byte) 117);

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
    public static int[] field2125 = new int[5];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[J")
    public static long[] field2114 = new long[1000];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[Lc;")
    public static class103[] field2116;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
    public static final int method826(int arg0, int arg1) {
        field2121++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else {
            int var2 = -2 / ((54 - arg1) / 46);
            return arg0 == 156 ? 140 : arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method827(int arg0) {
        field2114 = null;
        if (arg0 >= -2) {
            method827(21);
        }
        field2116 = null;
        field2118 = null;
        field2123 = null;
        field2125 = null;
        field2120 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLjd;)Ljd;")
    public static final class85 method828(boolean arg0, class85 arg1) {
        if (arg0) {
            int var2 = class168.method1130((byte) 89, arg1);
            field2119++;
            return var2 == -1 ? class242.field4156 : class177.field3025.field3851[var2].method585(class47.field831, (byte) -127, class31.field464);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)I")
    public static final int method829(int arg0, int arg1, int arg2) {
        field2115++;
        if (arg0 <= 52) {
            return 38;
        } else if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2124++;
        int var10002 = arg3 ^ 0x6E;
        int var8 = arg0 + 1;
        class183.method1260(arg5, arg1, var10002, class146.field2488[arg0], arg4);
        int var9 = arg2 - 1;
        class183.method1260(arg5, arg1, 106, class146.field2488[arg2], arg4);
        if (arg3 != -1) {
            method829(93, -100, 109);
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class146.field2488[var6];
            var7[arg1] = var7[arg4] = arg5;
        }
    }
}
