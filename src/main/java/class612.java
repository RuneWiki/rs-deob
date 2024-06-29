import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class612 extends class189 {

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "I")
    public int field8584;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
    public int field8585;

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "Lqfa;")
    public static class98 field8583 = new class98(6, -1);

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "Lqfa;")
    public static class98 field8587 = new class98(50, -1);

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "Lqh;")
    public static class67 field8588;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V", line = 5)
    public static void method3433(int arg0) {
        if (arg0 != 31356) {
            field8586 = 13;
        }
        field8583 = null;
        field8587 = null;
        field8588 = null;
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(II)V", line = 17)
    public class612(int arg0, int arg1) {
        this.field8584 = arg0;
        this.field8585 = arg1;
    }
}
