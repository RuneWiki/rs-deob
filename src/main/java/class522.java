import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class522 {

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lsv;")
    public static class570 field7316 = new class570(72, 11);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Lgga;")
    public static class513 field7317;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public abstract void method3062(int arg0);

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z")
    public abstract boolean method3063(int arg0);

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)Z")
    public abstract boolean method3064(int arg0);

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)I")
    public abstract int method3065(int arg0);

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)I")
    public abstract int method3066(int arg0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZI)I")
    public static final int method3067(int arg0, int arg1, boolean arg2, int arg3) {
        field7318++;
        class393 var4 = class275.method1745(arg2, (byte) -105, arg1);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field5458.length > arg3) {
            return arg0 == 72 ? var4.field5458[arg3] : -98;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
    public abstract void method3068(int arg0);

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)Luaa;")
    public abstract class453 method3069(int arg0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
    public abstract boolean method3070(byte arg0);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "(I)Z")
    public final boolean method3071(int arg0) {
        if (arg0 != 72) {
            this.method3064(29);
        }
        field7313++;
        return this.method3064(-8) || this.method3070((byte) 101) || this.method3063(-1);
    }

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "(I)V")
    public static void method3072(int arg0) {
        field7317 = null;
        if (arg0 != 29285) {
            field7314 = 15;
        }
        field7316 = null;
    }
}
