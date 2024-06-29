import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class279 extends class363 {

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[[Z")
    public static boolean[][] field3540 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 7)
    public static void method1679(byte arg0) {
        if (arg0 >= -72) {
            method1680(84, null);
        }
        field3540 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 17)
    public static final String method1680(int arg0, String arg1) {
        field3541++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class704.method3886(-122, arg1.charAt(var2))) {
            var2++;
        }
        if (arg0 != -2415) {
            field3540 = null;
        }
        while (var2 < var3 && class704.method3886(-73, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class250.method1503(var7, (byte) 27)) {
                char var8 = class653.method3656(var7, -25244);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V", line = 79)
    public static final void method1681(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3542++;
        if (class292.field3700 <= arg1 && arg1 <= class337.field4186) {
            int var5 = class654.method3659(-7690, arg4, class377.field4848, class125.field1524);
            int var6 = class654.method3659(-7690, arg0, class377.field4848, class125.field1524);
            class231.method1397(arg1, arg3, var5, var6, (byte) -116);
        }
        if (arg2 != -15510) {
            field3539 = 38;
        }
    }
}
