import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class502 extends InputStream {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lkn;")
    public static class530 field7098;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
    public static int[] field7101;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lqi;")
    public static class406 field7099;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[[B")
    public static byte[][] field7100;

    static {
        new class530("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field7098 = new class530("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
        field7101 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
        field7099 = new class406(32);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 3)
    public static void method2914(byte arg0) {
        field7098 = null;
        field7100 = null;
        if (arg0 != -59) {
            method2915(null, (byte) 49);
        }
        field7101 = null;
        field7099 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 16)
    public static final void method2915(String arg0, byte arg1) {
        field7102++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class487.method2806(-23881, arg0);
        int var3 = -105 % ((-arg1 - 68) / 42);
        if (var2 == null) {
            return;
        }
        for (int var4 = 0; var4 < class419.field5909; var4++) {
            String var5 = class366.field5229[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class487.method2806(-23881, var5);
            if (var6 != null && var6.equals(var2)) {
                class419.field5909--;
                for (int var7 = var4; var7 < class419.field5909; var7++) {
                    class366.field5229[var7] = class366.field5229[var7 + 1];
                    class388.field5452[var7] = class388.field5452[var7 + 1];
                    class213.field3081[var7] = class213.field3081[var7 + 1];
                    class152.field2192[var7] = class152.field2192[var7 + 1];
                    class66.field845[var7] = class66.field845[var7 + 1];
                }
                class530.field7767++;
                class360.field5154 = class371.field5285;
                class61.method498(class110.field1492, 1);
                class30.field357.method2376((byte) 122, class540.method3175(arg0, 1));
                class30.field357.method2377((byte) -53, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "read", descriptor = "()I", line = 76)
    public final int read() {
        field7097++;
        class52.method411(30000L, (byte) 113);
        return -1;
    }
}
