import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class233 {

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Li;")
    public static class58 field3638 = new class58(512);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
    public static int[] field3647 = new int[50];

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Z")
    public static volatile boolean field3650 = true;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[I")
    public static int[] field3651 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static volatile int field3649 = 0;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "C")
    public static char field3645;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lrk;")
    public static class292 field3646;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)V")
    public abstract void method281(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/String;ZI)I")
    public static final int method1608(byte arg0, String arg1, boolean arg2, int arg3) {
        field3643++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = 62 / ((31 - arg0) / 53);
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg3) {
                throw new NumberFormatException();
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg3 * var6 + var12;
            if (var11 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var6 = var11;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)V")
    public abstract void method282(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I")
    public static int method1609(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public abstract void method279(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    public class233(int arg0, int arg1, int arg2) {
        this.field3648 = arg0;
        this.field3641 = arg1;
        this.field3639 = arg2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field3638 = null;
        field3647 = null;
        field3646 = null;
        field3651 = null;
        if (arg0 < 50) {
            field3649 = -83;
        }
    }
}
