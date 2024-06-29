import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class606 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field8718 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
    public static boolean field8717 = false;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
    public static int[] field8722 = new int[14];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field8716 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method3467(byte arg0) {
        field8722 = null;
        if (arg0 != 50) {
            field8716 = -101;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lge;II)V")
    private final void method3468(class551 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field8718 = arg0.method3090(-94);
        }
        field8721++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3469(String arg0, byte arg1) {
        field8720++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 <= 8) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > var4 + 2) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 - 55;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + '\n' - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                if (var11 != 0 && class125.method675(128, (byte) var11)) {
                    var2.append(class515.method2865(0, (byte) var11));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lge;B)V")
    public final void method3470(class551 arg0, byte arg1) {
        if (arg1 <= 97) {
            field8722 = null;
        }
        while (true) {
            int var3 = arg0.method3045(-126);
            if (var3 == 0) {
                field8715++;
                return;
            }
            this.method3468(arg0, -6, var3);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static final void method3471(int arg0) {
        field8719++;
        if (!class280.field3669) {
            return;
        }
        class447 var1 = class433.method2525(class167.field2109, class201.field2637, (byte) -115);
        if (arg0 < 82) {
            method3467((byte) -102);
        }
        if (var1 != null && var1.field6181 != null) {
            class9 var2 = new class9();
            var2.field77 = var1;
            var2.field81 = var1.field6181;
            class218.method1408(var2);
        }
        class476.field6707 = -1;
        class48.field659 = -1;
        class280.field3669 = false;
        if (var1 != null) {
            class90.method501(var1, -1);
        }
    }

    static {
        new class344("Use", "Benutzen", "Utiliser", "Usar");
    }
}
