import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class44 {

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "Lvp;")
    private class160 field359;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Lwba;")
    public static class44 field361 = new class44(0, 3, class160.field1936);

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Lwba;")
    public static class44 field364 = new class44(1, 3, class160.field1936);

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "Lwba;")
    public static class44 field365 = new class44(2, 4, class160.field1932);

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lwba;")
    public static class44 field366 = new class44(3, 1, class160.field1936);

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Lwba;")
    public static class44 field367 = new class44(4, 2, class160.field1936);

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Lwba;")
    public static class44 field368 = new class44(5, 3, class160.field1936);

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "Lwba;")
    private static class44 field369 = new class44(6, 4, class160.field1936);

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public static int field370 = class131.method739(16, 4);

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "[S")
    public static short[] field371 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "[I")
    public static int[] field373 = new int[4096];

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "Ldn;")
    public static class438 field372;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)[Lwba;")
    public static final class44[] method230(int arg0) {
        field356++;
        return arg0 == -12149 ? new class44[] { field361, field364, field365, field366, field367, field368, field369 } : null;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)I")
    public static final int method231(int arg0, int arg1, int arg2) {
        field358++;
        int var3 = class289.method1625(2, arg1 - 1, arg0 + -1) - (-class289.method1625(2, arg1 - 1, arg0 + 1) - class289.method1625(2, arg1 + 1, arg0 - 1)) + class289.method1625(2, arg1 - -1, arg0 - -1);
        if (arg2 >= -107) {
            field371 = null;
        }
        int var4 = class289.method1625(2, arg1, arg0 - 1) + (class289.method1625(2, arg1, arg0 + 1) + class289.method1625(2, arg1 - 1, arg0)) + class289.method1625(2, arg1 + 1, arg0);
        int var5 = class289.method1625(2, arg1, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static void method232(int arg0) {
        field372 = null;
        field369 = null;
        field371 = null;
        field373 = null;
        field365 = null;
        field367 = null;
        field361 = null;
        field366 = null;
        field364 = null;
        if (arg0 != -98) {
            field364 = null;
        }
        field368 = null;
    }

    @OriginalMember(owner = "client!wba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field360++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZLjava/lang/String;)I")
    public static final int method233(int arg0, int arg1, boolean arg2, String arg3) {
        field357++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg0 != 122) {
            return 62;
        }
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    public static final void method234(byte arg0) {
        class528.method3006(-3083);
        field354++;
        if (arg0 != -12) {
            return;
        }
        class638.method3656(22050, 2, true, class565.field8299.field2171);
        class382.field5052 = class346.method1934(class41.field331, 22050, 1, 0, class74.field873);
        class382.field5052.method1255(false, class306.field3892);
        class441.field6089 = class346.method1934(class41.field331, 2048, 1, 1, class74.field873);
        class441.field6089.method1255(false, class534.field7500);
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(IILvp;)V")
    private class44(int arg0, int arg1, class160 arg2) {
        this.field359 = arg2;
        this.field362 = arg1;
        this.field363 = arg0;
        this.field355 = this.field359.field1924 * this.field362;
        if (this.field363 >= 16) {
            throw new RuntimeException();
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field373[var0] = class430.method2492(var0, (byte) -122);
        }
    }
}
