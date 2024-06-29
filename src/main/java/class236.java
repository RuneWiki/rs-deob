import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class236 {

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lef;")
    private class338 field3343;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lwj;")
    public static class270 field3346;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Ldi;")
    public static class83 field3347;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static final void method1452(int arg0) {
        class354.field5189 = arg0;
        for (int var1 = 0; var1 < class206.field2881; var1++) {
            for (int var2 = 0; var2 < class371.field5427; var2++) {
                if (class89.field1305[arg0][var1][var2] == null) {
                    class89.field1305[arg0][var1][var2] = new class486(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBII)V")
    public static final void method1453(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg0 > arg3) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class437.field6400[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class437.field6400[var6][arg1] = arg4;
            }
        }
        field3342++;
        if (arg2 != 16) {
            field3347 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public static void method1454(int arg0) {
        field3347 = null;
        if (arg0 != 0) {
            field3346 = null;
        }
        field3346 = null;
    }

    @OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3343.method1966(this.field3344, 120);
        field3341++;
        super.finalize();
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lef;II)V")
    public class236(class338 arg0, int arg1, int arg2) {
        this.field3343 = arg0;
        this.field3344 = arg2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static final void method1455(byte arg0) {
        int var1 = -5 % ((arg0 - 7) / 44);
        class280.method1666();
        field3345++;
    }

    static {
        new class466("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field3346 = new class270(84, 10);
        new class466("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field3347 = new class83(7, 7);
    }
}
