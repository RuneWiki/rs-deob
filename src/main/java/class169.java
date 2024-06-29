import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class169 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field2467 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[Ljava/lang/Object;")
    public Object[] field2466 = new Object[5000];

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field2469 = 0;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[B")
    public byte[] field2468 = new byte[5000];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public volatile int field2471 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public volatile int field2465 = 0;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[F")
    public float[] field2472 = new float[5000];

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2474 = 1;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[[[Lct;")
    public static class88[][][] field2475;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IFLpl;ZI)V")
    public abstract void method1043(int arg0, float arg1, class426 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIZ)I")
    public static final int method1044(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 >= -36) {
            method1051(-124);
        }
        field2473++;
        class456 var4 = class264.method1626(0, arg2, arg3);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field6410.length) {
            return var4.field6410[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lct;I)V")
    public abstract void method1045(class88 arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
    public abstract void method1046(byte arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public abstract void method1047(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public abstract void method1048(byte arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLct;)V")
    public abstract void method1049(byte arg0, class88 arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILct;)V")
    public abstract void method1050(int arg0, class88 arg1);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method1051(int arg0) {
        int var1 = -90 / ((arg0 - 61) / 54);
        field2475 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1052(int arg0, int arg1);

    static {
        new class326("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field2476 = 1;
    }
}
