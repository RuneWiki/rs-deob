import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class204 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field3439 = 2048;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public int field3436 = 0;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public int field3441 = 2048;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field3438 = 0;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Ltm;")
    public static class334 field3434 = new class334(36, 0);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method1502(byte arg0) {
        int var1 = -48 % ((arg0 - 18) / 58);
        field3434 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lofa;II)V")
    private final void method1503(class301 arg0, int arg1, int arg2) {
        if (arg1 >= -83) {
            return;
        }
        field3440++;
        if (arg2 == 1) {
            this.field3438 = arg0.method1987(-44);
        } else if (arg2 == 2) {
            this.field3441 = arg0.method1989((byte) -119);
        } else if (arg2 == 3) {
            this.field3439 = arg0.method1989((byte) -31);
        } else if (arg2 == 4) {
            this.field3436 = arg0.method1977((byte) -122);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILofa;)V")
    public final void method1504(int arg0, class301 arg1) {
        while (true) {
            int var3 = arg1.method1987(-82);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field3437++;
                return;
            }
            this.method1503(arg1, -88, var3);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method1505(int arg0, int arg1, String arg2, boolean arg3) {
        field3435++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        if (arg1 != -17905) {
            field3434 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
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
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }
}
