import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class513 extends class372 {

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public static int field6721 = -1;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "[I")
    public static int[] field6723 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "Lra;")
    public static class361 field6720 = new class361(84, -2);

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "[Z")
    public static boolean[] field6724 = new boolean[100];

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Ll;", line = 4)
    public static final class261 method2767(int arg0) {
        field6718++;
        if (arg0 != -1545) {
            return null;
        }
        try {
            return (class261) Class.forName("mh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILfd;)V", line = 23)
    public static final void method2768(int arg0, class418 arg1) {
        field6722++;
        if ((arg1.field5393.length - arg1.field5367) < 1) {
            return;
        }
        int var2 = arg1.method2396(arg0 ^ 0x24);
        if (var2 < 0 || var2 > 1 || (arg1.field5393.length - arg1.field5367) < 2) {
            return;
        }
        int var3 = arg1.method2393(-30727);
        if (arg0 != 1 || var3 * 6 > arg1.field5393.length - arg1.field5367) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method2393(-30727);
            int var6 = arg1.method2355(66);
            if (class311.field4040.length > var5 && class564.field7369[var5] && (class499.field6561.method1732(true, var5).field6138 != '1' || var6 >= -1 && var6 <= 1)) {
                class311.field4040[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V", line = 71)
    public static void method2769(int arg0) {
        field6723 = null;
        field6720 = null;
        field6724 = null;
        if (arg0 != -3) {
            field6720 = null;
        }
    }
}
