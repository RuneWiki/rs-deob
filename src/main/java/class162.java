import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class162 {

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "J")
    public long field2496 = 0L;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2482 = -1;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2493 = "glow2:";

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "[[I")
    public static int[][] field2488 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lsk;")
    public class114 field2478;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lsk;")
    public class114 field2489;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
    public static int[] field2487;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[Lsb;")
    public static class230[] field2486;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;ZIZ)I")
    public static final int method1002(String arg0, boolean arg1, int arg2, boolean arg3) {
        field2480++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = arg3;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public static final void method1003(int arg0, int arg1, int arg2) {
        field2490++;
        if (class277.field4178 > 0) {
            class262.method1752(class277.field4178, 1702428295);
            class277.field4178 = 0;
        }
        short var3 = 256;
        int var4 = class111.field1719 * arg1;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = arg0; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class153.field2301[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class92.field1451[var5++];
                int var12 = class111.field1716[arg2 + (var4++)];
                if (var11 == 0) {
                    class61.field974.field3047[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 238 - var11;
                    int var15 = class67.field1065[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class61.field974.field3047[var6++] = class94.method598(var13 * class94.method598(var15, 16711935) + var14 * class94.method598(var12, 16711935), -16711936) + class94.method598(var13 * class94.method598(var15, 65280) + class94.method598(var12, 65280) * var14, 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class61.field974.field3047[var6++] = class111.field1716[arg2 + (var4++)];
            }
            var4 += class111.field1719 - 128;
        }
        class61.field974.method1264(arg2, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method1004(int arg0) {
        field2493 = null;
        field2486 = null;
        field2487 = null;
        field2488 = null;
        if (arg0 != 1) {
            method1005(20, -52);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
    public static final void method1005(int arg0, int arg1) {
        int var2 = 100 % ((81 - arg1) / 44);
        field2479++;
        class187 var3 = class120.method762((byte) -98, 12, arg0);
        var3.method1162(1);
    }
}
