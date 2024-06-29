import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class97 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1524 = "Loaded interfaces";

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field1525 = 0;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field1528 = 0;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lik;")
    public static class267 field1526 = new class267(64);

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[I")
    public static int[] field1531 = new int[2];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lgk;")
    public static class159 field1530 = new class159();

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1533 = "Loaded textures";

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lrf;")
    public static class289 field1529;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    public static int[] field1523;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "[[[B")
    public static byte[][][] field1532;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method626(int arg0) {
        field1526 = null;
        field1532 = null;
        field1529 = null;
        field1524 = null;
        if (arg0 != 14414) {
            method626(124);
        }
        field1530 = null;
        field1523 = null;
        field1533 = null;
        field1531 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lud;")
    public static final class2 method627(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4071; var4++) {
            class2 var5 = var3.field4069[var4];
            if ((var5.field28 >> 29 & 0x3L) == 2L && var5.field26 == arg1 && var5.field23 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method628(boolean arg0, int arg1, int arg2, int arg3) {
        field1527++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg2 >= 0) {
            int var4 = arg2 / arg1;
            int var5 = 2;
            while (var4 != 0) {
                var5++;
                var4 /= arg1;
            }
            char[] var6 = new char[var5];
            var6[0] = '+';
            int var7 = var5 - 1;
            if (arg3 != 28855) {
                method627(49, 121, -108);
            }
            while (var7 > 0) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - (arg1 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
                var7--;
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }
}
