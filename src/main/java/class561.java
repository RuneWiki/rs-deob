import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class561 extends class24 {

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "Ltm;")
    public static class412 field7533 = new class412();

    @OriginalMember(owner = "client!pga", name = "D", descriptor = "I")
    public static int field7540 = 0;

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "Lmga;")
    public static class739 field7535 = new class739(71, 3);

    @OriginalMember(owner = "client!pga", name = "F", descriptor = "Ltea;")
    public static class252 field7542 = new class252(8);

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
    private int field7538;

    @OriginalMember(owner = "client!pga", name = "E", descriptor = "J")
    private long field7541;

    @OriginalMember(owner = "client!pga", name = "C", descriptor = "[I")
    public static int[] field7539;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(III)Z", line = 8)
    public static final boolean method3150(int arg0, int arg1, int arg2) {
        if (arg1 == -16730) {
            field7537++;
            return (arg2 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(B)V", line = 24)
    public static void method3151(byte arg0) {
        field7535 = null;
        field7542 = null;
        if (arg0 != 117) {
            method3151((byte) 48);
        }
        field7533 = null;
        field7539 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILjp;)V", line = 39)
    public final void method191(int arg0, class376 arg1) {
        this.field7538 = arg1.method2384(12);
        field7536++;
        this.field7541 = arg1.method2366(true);
        if (arg0 > -56) {
            this.field7538 = 102;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lke;I)V", line = 62)
    public final void method190(class625 arg0, int arg1) {
        if (arg1 != 5) {
            method3151((byte) -27);
        }
        field7534++;
        arg0.method3436(this.field7541, arg1 ^ 0x66, this.field7538);
    }
}
