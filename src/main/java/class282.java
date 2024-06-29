import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class282 extends class159 {

    @OriginalMember(owner = "client!to", name = "v", descriptor = "Ljn;")
    public static class409 field4143 = new class409("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!to", name = "w", descriptor = "Ljn;")
    public static class409 field4144 = new class409("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Ljn;")
    public static class409 field4145 = new class409("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
    public static boolean field4147 = false;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "[I")
    public static int[] field4149 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "Lm;")
    public static class187 field4146;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "[[[B")
    public static byte[][][] field4150;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 5)
    public static void method1902(byte arg0) {
        field4150 = null;
        field4149 = null;
        field4144 = null;
        field4146 = null;
        int var1 = -19 % ((10 - arg0) / 59);
        field4143 = null;
        field4145 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V", line = 22)
    public static final void method1903(byte arg0, int arg1, int arg2) {
        class34.field492 = new class363(arg2);
        field4142++;
        if (arg0 >= 84) {
            class318.field4665 = new class363(arg1);
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V", line = 34)
    public static final void method1904(byte arg0) {
        field4141++;
        int var1 = -100 / ((33 - arg0) / 34);
        class456.field6750.method2772(-83);
        class286.field4209 = null;
        class82.field1008 = 1;
    }
}
