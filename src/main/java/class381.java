import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class381 extends class336 {

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lub;")
    public static class15 field5408 = new class15(64);

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field5412 = 0;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field5414 = 104;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Z")
    public static boolean field5415;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
    public static int[] field5416;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public static void method2427(int arg0) {
        if (arg0 <= 120) {
            method2430(-13, 39, -12, -23, -49, -102);
        }
        field5416 = null;
        field5408 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static final void method2428(byte arg0) {
        class145[] var1 = class53.field689;
        synchronized (class53.field689) {
            for (int var2 = 0; var2 < class53.field689.length; var2++) {
                class53.field689[var2] = new class145();
                class178.field2527[var2] = 0;
            }
            if (arg0 != 71) {
                field5412 = -31;
            }
        }
        field5409++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLtj;)V")
    public static final void method2429(byte arg0, class108 arg1) {
        class16.field246 = arg1;
        field5407++;
        if (arg0 != 35) {
            field5414 = 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5411++;
        if (class408.field5789 <= arg2 && arg0 <= class231.field3415 && arg4 >= class245.field3659 && class240.field3547 >= arg1) {
            class86.method516(arg1, arg2, arg0, (byte) 118, arg5, arg4);
        } else {
            class398.method2497(arg4, arg0, arg2, arg1, -256, arg5);
        }
        if (arg3 > -44) {
            field5408 = null;
        }
    }

    static {
        new class349("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field5415 = false;
        field5416 = new int[14];
    }
}
