import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class165 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lh;")
    public static class572 field2604 = new class572("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public static boolean field2608 = false;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Z")
    public static boolean field2607;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[Lsa;")
    public static class176[] field2609;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[Lha;")
    public static class53[] field2611;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lm;")
    public abstract class165 method335();

    @OriginalMember(owner = "client!m", name = "KA", descriptor = "(I)V")
    public abstract void method355(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
    public abstract void method341(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "oa", descriptor = "(III)V")
    public abstract void method353(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method1189(int arg0) {
        if (arg0 != 1) {
            field2611 = null;
        }
        field2604 = null;
        field2611 = null;
        field2609 = null;
    }

    @OriginalMember(owner = "client!m", name = "ha", descriptor = "()V")
    public abstract void method336();

    @OriginalMember(owner = "client!m", name = "I", descriptor = "(III[I)V")
    public abstract void method343(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "B", descriptor = "(IIIIII)V")
    public abstract void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!m", name = "ma", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!m", name = "va", descriptor = "([I)V")
    public abstract void method351(int[] arg0);

    @OriginalMember(owner = "client!m", name = "ta", descriptor = "(I)V")
    public abstract void method345(int arg0);

    @OriginalMember(owner = "client!m", name = "TA", descriptor = "(III)V")
    public abstract void method338(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1190(byte arg0, String arg1) {
        field2610++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class533.method3214(-1, arg1);
        int var3 = -85 % ((arg0 + 62) / 60);
        if (var2 == null) {
            return;
        }
        for (int var4 = 0; var4 < class33.field402; var4++) {
            String var5 = class470.field6634[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class533.method3214(-1, var5);
            if (var6 != null && var6.equals(var2)) {
                class33.field402--;
                for (int var7 = var4; var7 < class33.field402; var7++) {
                    class470.field6634[var7] = class470.field6634[var7 + 1];
                    class380.field5229[var7] = class380.field5229[var7 + 1];
                    class59.field744[var7] = class59.field744[var7 + 1];
                    class78.field1058[var7] = class78.field1058[var7 + 1];
                    class643.field9366[var7] = class643.field9366[var7 + 1];
                }
                class253.field3644++;
                class433.field5800 = class226.field3283;
                class402.method2367(class334.field4620, (byte) 124);
                class112.field1589.method1049(-1, class539.method3267(arg1, false));
                class112.field1589.method1050((byte) 32, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "EA", descriptor = "(Lm;)V")
    public abstract void method337(class165 arg0);

    @OriginalMember(owner = "client!m", name = "k", descriptor = "(I)V")
    public abstract void method342(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1191(String arg0, int arg1) {
        if (arg1 != -71) {
            return null;
        }
        field2606++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 'a';
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - '0';
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + '\n' - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 - 55;
                }
                var4 += 2;
                if (var11 != 0 && class429.method2516(25536, (byte) var11)) {
                    var2.append(class387.method2305((byte) -118, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!m", name = "XA", descriptor = "(I)V")
    public abstract void method352(int arg0);
}
