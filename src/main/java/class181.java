import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class181 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lrb;")
    public static class283 field2684 = new class283(73, 6);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Z")
    public static boolean field2693;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lkc;")
    public static class157 field2694;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2692;

    static {
        new class157("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field2693 = false;
        field2695 = 0;
        field2694 = new class157("Attack", "Angreifen", "Attaquer", "Atacar");
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 6)
    public static void method1230(int arg0) {
        field2684 = null;
        field2694 = null;
        if (arg0 != 12959) {
            method1235(72, 103);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Z", line = 27)
    public final boolean method1231(boolean arg0) {
        field2689++;
        if (!arg0) {
            field2684 = null;
        }
        return (this.field2687 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Z", line = 38)
    public final boolean method1232(int arg0) {
        int var2 = -94 % ((-arg0 - 40) / 53);
        field2688++;
        return (this.field2687 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Z", line = 49)
    public final boolean method1233(int arg0) {
        if (arg0 != 4) {
            this.field2690 = -119;
        }
        field2686++;
        return (this.field2687 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Z", line = 60)
    public final boolean method1234(byte arg0) {
        if (arg0 != -100) {
            method1235(-69, 65);
        }
        field2685++;
        return (this.field2687 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I", line = 80)
    public static final int method1235(int arg0, int arg1) {
        if (arg0 != 64) {
            field2695 = 43;
        }
        field2692++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xC0) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
