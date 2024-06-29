import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class346 {

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "J")
    public long field5035;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Los;")
    private class468 field5033;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lqu;")
    public static class364 field5038 = new class364(55, 8);

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Z")
    public static boolean field5041;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Ldda;")
    public static class597 field5036;

    static {
        new class487("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field5040 = 0;
        field5041 = false;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method2126(int arg0, int arg1, int arg2) {
        if (arg2 != 55) {
            method2127(19);
        }
        field5037++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 19)
    public static void method2127(int arg0) {
        if (arg0 > -48) {
            field5040 = 121;
        }
        field5038 = null;
        field5036 = null;
    }

    @OriginalMember(owner = "client!vt", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        field5034++;
        this.field5033.method2840(this.field5035, 111);
        super.finalize();
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Los;JI)V", line = 39)
    public class346(class468 arg0, long arg1, int arg2) {
        this.field5035 = arg1;
        this.field5033 = arg0;
    }
}
