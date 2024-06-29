import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class226 {

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "Ljo;")
    public class226 field3380;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "Lm;")
    public class187 field3377;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Lvq;")
    public static class24 field3386 = new class24(24, 14);

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "[I")
    public static int[] field3389 = new int[50];

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "[I")
    public static int[] field3388 = new int[13];

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "Ljn;")
    public static class409 field3390 = new class409("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Lbn;")
    public static class160 field3392 = new class160(58, 2);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Lct;")
    public static class104 field3381;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Lae;")
    public static class285 field3383;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 10)
    public static void method1550(int arg0) {
        field3392 = null;
        field3390 = null;
        field3383 = null;
        int var1 = -57 / ((arg0 - 18) / 53);
        field3386 = null;
        field3389 = null;
        field3381 = null;
        field3388 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 34)
    public static final void method1551(int arg0, String arg1, int arg2) {
        field3378++;
        class125 var3 = class56.method428(arg2, arg0, -3636);
        var3.method846(26848);
        var3.field1655 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V", line = 60)
    public class226(int arg0, int arg1) {
        this.field3391 = arg1;
        this.field3387 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljo;I)V", line = 72)
    public class226(class226 arg0, int arg1) {
        this.field3380 = arg0;
        this.field3391 = this.field3380.field3391 + arg1;
        this.field3377 = this.field3380.field3377;
        this.field3387 = this.field3380.field3387;
    }
}
