import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class574 extends class69 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Z")
    public boolean field8071 = false;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Z")
    public boolean field8076 = true;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lo;")
    public static class208 field8077 = new class208(11, 0, 1, 2);

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field8082 = -1;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public int field8069;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field8070;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field8072;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field8074;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field8075;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public int field8078;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public int field8084;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Laka;")
    public class413 field8068;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Llp;")
    public static class82 field8079;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 9)
    public static final void method3367(int arg0) {
        class783.field10748 = 0;
        field8073++;
        if (arg0 != -1) {
            field8079 = null;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class546.field7594[var1] = null;
            class305.field4419[var1] = 1;
            class293.field4306[var1] = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 37)
    public static void method3368(int arg0) {
        if (arg0 == 2) {
            field8079 = null;
            field8077 = null;
        }
    }
}
