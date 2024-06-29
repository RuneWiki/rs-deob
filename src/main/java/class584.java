import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class584 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lfba;")
    public static class27 field8254 = new class27(80, -1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method3413(int arg0, int arg1) {
        field8253++;
        if (arg1 == -1 || !class505.field7173[arg1]) {
            return;
        }
        class428.field5819.method4329(true, arg1);
        class787.field10812[arg1] = null;
        class254.field3741[arg1] = null;
        int var2 = -61 % ((-arg0 - 42) / 60);
        class505.field7173[arg1] = false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method3414(byte arg0) {
        if (arg0 > -28) {
            field8254 = null;
        }
        field8254 = null;
    }
}
