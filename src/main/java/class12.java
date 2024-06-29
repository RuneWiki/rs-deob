import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 extends class5 {

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public int field184 = 0;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static volatile int field178 = -1;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field180 = 0;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Led;")
    public static class43 field181 = class191.method1219("(U(Y", false);

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "[La;")
    public static class1[] field183 = new class1[2048];

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "[I")
    public static int[] field182;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "[[Lob;")
    public static class129[][] field177;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjg;)V")
    private final void method52(int arg0, int arg1, class89 arg2) {
        if (arg0 == arg1) {
            this.field184 = arg2.method555(-1113627096);
        }
        field176++;
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public static void method53(int arg0) {
        field177 = null;
        field181 = null;
        if (arg0 != -29754) {
            field183 = null;
        }
        field182 = null;
        field183 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z")
    public static final boolean method54(int arg0, byte arg1) {
        if (arg1 != -102) {
            field180 = 3;
        }
        field174++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljg;I)V")
    public final void method55(class89 arg0, int arg1) {
        if (arg1 != 2) {
            method53(15);
        }
        while (true) {
            int var3 = arg0.method538((byte) -114);
            if (var3 == 0) {
                field175++;
                return;
            }
            this.method52(2, var3, arg0);
        }
    }
}
