import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class138 extends class101 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2274 = null;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lkh;")
    public static class13 field2275;

    static {
        new class423("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        new class231("", 76);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 4)
    public static void method924(byte arg0) {
        if (arg0 >= -50) {
            method926(30, 2);
        }
        field2274 = null;
        field2275 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 15)
    public static final void method925(int arg0) {
        class273.field4149 = arg0;
        for (int var1 = 0; var1 < class377.field5492; var1++) {
            for (int var2 = 0; var2 < class347.field5132; var2++) {
                if (class321.field4830[arg0][var1][var2] == null) {
                    class321.field4830[arg0][var1][var2] = new class268(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 56)
    public static final void method926(int arg0, int arg1) {
        class268 var2 = class321.field4830[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class268 var4 = class321.field4830[var3][arg0][arg1] = class321.field4830[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4039--;
                for (class297 var5 = var4.field4045; var5 != null; var5 = var5.field4500) {
                    class205 var6 = var5.field4505;
                    if (var6.field3225 == arg0 && var6.field3219 == arg1) {
                        var6.field3217--;
                    }
                }
            }
        }
        if (class321.field4830[0][arg0][arg1] == null) {
            class321.field4830[0][arg0][arg1] = new class268(0, arg0, arg1);
            class321.field4830[0][arg0][arg1].field4062 = 1;
        }
        class321.field4830[0][arg0][arg1].field4049 = var2;
        class321.field4830[3][arg0][arg1] = null;
    }
}
