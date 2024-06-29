import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class234 {

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Laa;")
    public static class76 field3289 = new class76(19, 6);

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Ldp;")
    public static class347 field3293 = new class347("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Ldp;")
    public static class347 field3294 = new class347("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "[Z")
    public static boolean[] field3295 = new boolean[8];

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lsl;")
    public static class456 field3296 = new class456("", 10);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[B")
    public byte[] field3282;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[B")
    public byte[] field3283;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1445(int arg0) {
        field3281++;
        class415 var1 = null;
        try {
            if (arg0 != 6) {
                method1446((byte) 90);
            }
            class533 var2 = class25.field375.method825(0, "2", true);
            while (var2.field7848 == 0) {
                class389.method2332(-121, 1L);
            }
            if (var2.field7848 == 1) {
                var1 = (class415) var2.field7849;
                class468 var3 = new class468(class477.field7040 * 6 + 3);
                var3.method2754(1, 5574);
                var3.method2777((byte) 74, class477.field7040);
                for (int var4 = 0; var4 < class466.field6795.length; var4++) {
                    if (class409.field6170[var4]) {
                        var3.method2777((byte) 74, var4);
                        var3.method2717(class466.field6795[var4], 496598568);
                    }
                }
                var1.method2489(0, 0, var3.field6830, var3.field6868);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2485(67);
            }
        } catch (Exception var5) {
        }
        class65.field883 = class381.method2281((byte) -122);
        class274.field4089 = false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 64)
    public static void method1446(byte arg0) {
        field3293 = null;
        field3294 = null;
        field3289 = null;
        field3295 = null;
        field3296 = null;
        if (arg0 >= -20) {
            method1446((byte) 58);
        }
    }
}
