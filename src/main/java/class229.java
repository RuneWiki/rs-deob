import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class229 implements Runnable {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[Lir;")
    public volatile class19[] field3328 = new class19[2];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Z")
    public volatile boolean field3325 = false;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Z")
    public volatile boolean field3329 = false;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
    public static int[] field3327 = new int[] { 1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 2, 0, 0, 0, 0, -1, 12, 0, -2, 0, 6, 0, 0, -2, 3, 12, 0, 0, 0, 0, 0, 0, 0, 0, 28, 0, 0, 8, 0, 0, -2, 3, 12, 0, 8, 17, 6, -1, 10, 8, 0, 0, 12, 3, 0, 0, 0, 6, 15, -2, -2, 0, 5, 0, 0, 6, 0, 0, -2, 0, 0, 7, -1, 4, 1, 0, 0, 0, 0, 0, 9, 10, 6, 0, -1, 0, 7, -1, 0, 6, 0, 0, 12, 0, 0, 0, 0, 6, 0, -1, 0, 0, 14, 0, 0, 0, 3, 7, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, -2, -2, 0, 0, 1, 2, 0, -1, 2, 0, 0, 8, 0, 0, 0, 20, 0, 2, -1, -2, -1, -1, 0, 0, 6, 4, 0, 0, 0, 0, -1, -2, 5, 0, 0, -1, 8, 0, 1, 2, 0, 0, 3, 0, 0, 0, 6, 0, 0, 7, 0, 0, 0, 3, 10, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 5, -1, 0, 0, 0, 2, 8, 0, 2, 0, 0, 0, 8, 0, 0, -2, 0, 11, 0, 0, 0, 0, 0, 0, 6, 0, 10, 0, 0, 0, 0, 6, 15, 0, 0, 0, 4, 0, 8, 8, 0, 8, -2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 14, 0, 0, 3, 5, 8, 0 };

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3332;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lko;")
    public static class294 field3330;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lko;")
    public class294 field3333;

    static {
        new class442("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field3332 = "";
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        this.field3329 = true;
        field3331++;
        try {
            while (!this.field3325) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class19 var2 = this.field3328[var1];
                    if (var2 != null) {
                        var2.method266((byte) -47);
                    }
                }
                class349.method2219(10L, -24);
                class346.method2196(68, (Object) null, this.field3333);
            }
        } catch (Exception var9) {
            class271.method1776(-2296, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field3329 = false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 41)
    public static final String method1583(int arg0, byte arg1) {
        field3326++;
        if (arg1 != 49) {
            field3330 = null;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 53)
    public static void method1584(byte arg0) {
        field3330 = null;
        field3327 = null;
        field3332 = null;
        int var1 = 17 % ((44 - arg0) / 45);
    }
}
