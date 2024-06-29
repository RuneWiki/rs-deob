import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class414 extends class467 {

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lui;")
    public static class375 field6215 = new class375("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[Lf;")
    public static class191[] field6216;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 9)
    public static final String method2512(String arg0, byte arg1) {
        field6214++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = -57 % ((arg1 - 24) / 35);
        int var4 = arg0.length();
        while (var2 < var4 && class461.method2766(95, arg0.charAt(var2))) {
            var2++;
        }
        while (var4 > var2 && class461.method2766(95, arg0.charAt(var4 - 1))) {
            var4--;
        }
        int var5 = var4 - var2;
        if (var5 < 1 || var5 > 12) {
            return null;
        }
        StringBuffer var6 = new StringBuffer(var5);
        for (int var7 = var2; var7 < var4; var7++) {
            char var8 = arg0.charAt(var7);
            if (class429.method2570(1, var8)) {
                char var9 = class300.method1938(false, var8);
                if (var9 != '\u0000') {
                    var6.append(var9);
                }
            }
        }
        if (var6.length() == 0) {
            return null;
        } else {
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZI)I", line = 62)
    public static final int method2513(int arg0, int arg1, boolean arg2, int arg3) {
        field6213++;
        class410 var4 = class261.method1684(arg1, 25, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field6166.length) {
            if (arg3 != 0) {
                field6215 = null;
            }
            return var4.field6166[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 91)
    public static void method2514(int arg0) {
        if (arg0 > -85) {
            field6216 = null;
        }
        field6215 = null;
        field6216 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)I")
    public abstract int method717(int arg0);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)J")
    public abstract long method716(int arg0);

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)I")
    public abstract int method712(int arg0);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)I")
    public abstract int method715(byte arg0);
}
