import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class105 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public static int[] field1758 = new int[4];

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!m", name = "ma", descriptor = "(I)V")
    public abstract void method875(int arg0);

    @OriginalMember(owner = "client!m", name = "ta", descriptor = "(I)V")
    public abstract void method876(int arg0);

    @OriginalMember(owner = "client!m", name = "TA", descriptor = "(III)V")
    public abstract void method877(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "EA", descriptor = "(Lm;)V")
    public abstract void method878(class105 arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lm;")
    public abstract class105 method879();

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
    public abstract void method880(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "KA", descriptor = "(I)V")
    public abstract void method881(int arg0);

    @OriginalMember(owner = "client!m", name = "XA", descriptor = "(I)V")
    public abstract void method882(int arg0);

    @OriginalMember(owner = "client!m", name = "ha", descriptor = "()V")
    public abstract void method883();

    @OriginalMember(owner = "client!m", name = "oa", descriptor = "(III)V")
    public abstract void method884(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "I", descriptor = "(III[I)V")
    public abstract void method885(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method886(byte arg0) {
        int var1 = 115 % ((arg0 + 55) / 60);
        field1758 = null;
    }

    @OriginalMember(owner = "client!m", name = "k", descriptor = "(I)V")
    public abstract void method887(int arg0);

    @OriginalMember(owner = "client!m", name = "B", descriptor = "(IIIIII)V")
    public abstract void method888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
    public static final boolean method889(int arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            method889(36, -89, 71);
        }
        field1759++;
        return class55.method453(arg1, true, arg0) & class595.method3399(arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method890(byte arg0, String arg1) {
        System.exit(1);
        field1761++;
        if (arg0 != 71) {
            field1758 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "va", descriptor = "([I)V")
    public abstract void method891(int[] arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method892(int arg0) {
        class227.method1505();
        field1763++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class268.field3916[var1].method329(-113);
        }
        class429.method2555((byte) 120);
        class414.method2504(arg0 ^ 0xFFFFFF92);
        System.gc();
    }

    static {
        new class567("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
