import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class102 extends class455 {

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "[I")
    private int[] field1453 = new int[this.field6288];

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "Ltm;")
    public static class112 field1456;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "Lcs;")
    public static class351 field1457;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "[C")
    public static char[] field1458;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "[B")
    private byte[] field1455;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)V")
    public final void method364(int arg0, int arg1, int arg2) {
        ++field1447;
        if (arg0 != -4096) {
            this.method360(120);
        }
        this.field1451 += this.field1453[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
    public final void method360(int arg0) {
        ++field1448;
        this.field1451 = Math.abs(this.field1451);
        if (this.field1451 >= 4096) {
            this.field1451 = 4095;
        }
        this.method504(this.field1454++, (byte) (this.field1451 >> 4));
        this.field1451 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
    public final void method362(int arg0) {
        if (arg0 < 36) {
            field1458 = null;
        }
        this.field1451 = 0;
        this.field1454 = 0;
        ++field1450;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)V")
    public void method504(int arg0, byte arg1) {
        this.field1455[this.field1454++] = (byte) ((class347.method2074(arg1, 255) >> 1) + 127);
        ++field1449;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public static void method647(boolean arg0) {
        field1457 = null;
        field1458 = null;
        field1456 = null;
        if (!arg0) {
            field1452 = -16;
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIF)V")
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field6288 > var7; ++var7) {
            this.field1453[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    static {
        new class112("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field1456 = new class112(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
        field1457 = new class351(56, -1);
        field1458 = new char[] { '[', ']', '#' };
    }
}
