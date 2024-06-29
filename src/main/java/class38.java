import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class38 extends InputStream {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field559 = -1;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lts;")
    public static class343 field562;

    static {
        new class206("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field560 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        class374.method2298(-28114, 30000L);
        field558++;
        return -1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 15)
    public static void method277(byte arg0) {
        if (arg0 != -111) {
            method277((byte) -28);
        }
        field562 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BI)Ljs;", line = 38)
    public static final class199 method278(byte[] arg0, int arg1) {
        field561++;
        if (arg1 != -39) {
            method278((byte[]) null, 49);
        }
        class199 var2 = new class199();
        class32 var3 = new class32(arg0);
        var3.field456 = var3.field472.length - 2;
        int var4 = var3.method215((byte) 108);
        int var5 = var3.field472.length - var4 - 2 - 12;
        var3.field456 = var5;
        int var6 = var3.method222(1024);
        var2.field2684 = var3.method215((byte) 117);
        var2.field2694 = var3.method215((byte) 93);
        var2.field2696 = var3.method215((byte) 121);
        var2.field2692 = var3.method215((byte) 110);
        int var7 = var3.method201((byte) -119);
        if (var7 > 0) {
            var2.field2689 = new class268[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method215((byte) 110);
                class268 var10 = new class268(class100.method616(var9, true));
                var2.field2689[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method222(1024);
                    int var12 = var3.method222(arg1 ^ 0xFFFFFBD9);
                    var10.method1525((byte) 19, new class37(var12), (long) var11);
                }
            }
        }
        var3.field456 = 0;
        var2.field2685 = var3.method245((byte) 119);
        var2.field2693 = new String[var6];
        var2.field2691 = new int[var6];
        var2.field2686 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field456) {
            int var14 = var3.method215((byte) 115);
            if (var14 == 3) {
                var2.field2693[var13] = var3.method195(-85).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field2691[var13] = var3.method201((byte) -120);
            } else {
                var2.field2691[var13] = var3.method222(1024);
            }
            var2.field2686[var13++] = var14;
        }
        return var2;
    }
}
