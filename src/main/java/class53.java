import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class53 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lub;")
    public static class15 field686 = new class15(8);

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ldr;")
    public static class428 field688 = new class428(0, 0);

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[Lcl;")
    public static class145[] field689 = new class145[5];

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Z")
    public static boolean field690;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field687;

    static {
        for (int var0 = 0; var0 < field689.length; var0++) {
            field689[var0] = new class145();
        }
        field690 = true;
        new class349("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIILfl;Lfl;)V", line = 5)
    public static final void method341(int arg0, int arg1, int arg2, class441 arg3, class441 arg4) {
        if (class385.field5449[arg0][arg1][arg2] == null) {
            class197.method1400(arg0, arg1, arg2);
        }
        class385.field5449[arg0][arg1][arg2].field967 = arg3;
        class385.field5449[arg0][arg1][arg2].field976 = arg4;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 18)
    public static final void method342(int arg0, int arg1, int arg2) {
        field687++;
        class129 var3 = class148.field2215[arg0][arg1];
        if (var3 != null) {
            class141.field2144 = var3.field1822;
            class230.field3406 = var3.field1824;
            class187.field2670 = var3.field1827;
        }
        class78.method459(arg2 ^ 0x3B5C);
        if (arg2 != 8) {
            field689 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 40)
    public static final void method343(int arg0) {
        class15 var1 = class317.field4658;
        synchronized (class317.field4658) {
            class317.field4658.method98(arg0);
        }
        field685++;
        class15 var2 = class392.field5506;
        synchronized (class392.field5506) {
            class392.field5506.method98(0);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 54)
    public static void method344(int arg0) {
        int var1 = 31 / ((arg0 - 37) / 55);
        field688 = null;
        field686 = null;
        field689 = null;
    }
}
