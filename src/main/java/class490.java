import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class490 {

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "B")
    public byte field7123 = 0;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "S")
    public short field7135;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "S")
    public short field7132;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "B")
    public byte field7143;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "B")
    public byte field7140;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field7121 = 0;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Ldq;")
    public static class493 field7119 = new class493(40, 8);

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
    public static int field7139 = 0;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "Ldq;")
    public static class493 field7136 = new class493(105, -1);

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "Lap;")
    public static class335 field7148 = new class335("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "B")
    public byte field7124;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "B")
    public byte field7125;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "B")
    public byte field7133;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "B")
    public byte field7147;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "F")
    public static float field7122;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "Lub;")
    public static class18 field7145;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "Lah;")
    public class262 field7129;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Lqd;")
    public class314 field7126;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "Lqd;")
    public class314 field7130;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "Le;")
    public class372 field7137;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "Le;")
    public class372 field7138;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Lur;")
    public class376 field7127;

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "Lev;")
    public class490 field7146;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "Lfm;")
    public class517 field7134;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "Lkn;")
    public class522 field7131;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "S")
    public short field7144;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "Z")
    public boolean field7128;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "Z")
    public boolean field7141;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "Z")
    public boolean field7142;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 7)
    public final void method2971(byte arg0) {
        while (this.field7127 != null) {
            class376 var2 = this.field7127.field4952;
            this.field7127.method2137(-105);
            this.field7127 = var2;
        }
        field7118++;
        this.field7123 = arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 32)
    public static void method2972(int arg0) {
        int var1 = 85 / ((arg0 - 68) / 50);
        field7148 = null;
        field7119 = null;
        field7145 = null;
        field7136 = null;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(III)V", line = 43)
    public class490(int arg0, int arg1, int arg2) {
        this.field7135 = (short) arg2;
        this.field7132 = (short) arg1;
        this.field7140 = this.field7143 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)Z", line = 58)
    public static final boolean method2973(byte arg0, int arg1) {
        if (arg0 != 0) {
            field7136 = null;
        }
        field7120++;
        if (arg1 == 3 || arg1 == 59 || arg1 == 46 || arg1 == 6 || arg1 == 1002) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 1004;
        }
    }
}
