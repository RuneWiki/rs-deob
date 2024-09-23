import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FXRMRSFD")
public class class16 {

    @OriginalMember(owner = "FXRMRSFD", name = "a", descriptor = "B")
    private byte field763 = 1;

    @OriginalMember(owner = "FXRMRSFD", name = "b", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "FXRMRSFD", name = "c", descriptor = "[LWWONSPNF;")
    private class62[] field765;

    @OriginalMember(owner = "FXRMRSFD", name = "<init>", descriptor = "(IB)V")
    public class16(int arg0, byte arg1) {
        this.field764 = arg0;
        if (this.field763 != arg1) {
            throw new NullPointerException();
        }
        this.field765 = new class62[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class62 var4 = this.field765[var3] = new class62();
            var4.field1588 = var4;
            var4.field1589 = var4;
        }
    }

    @OriginalMember(owner = "FXRMRSFD", name = "a", descriptor = "(J)LWWONSPNF;")
    public class62 method219(long arg0) {
        class62 var3 = this.field765[(int) (arg0 & (long) (this.field764 - 1))];
        for (class62 var4 = var3.field1588; var4 != var3; var4 = var4.field1588) {
            if (var4.field1587 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "FXRMRSFD", name = "a", descriptor = "(JLWWONSPNF;I)V")
    public void method220(long arg0, class62 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        if (arg1.field1589 != null) {
            arg1.method555();
        }
        class62 var5 = this.field765[(int) (arg0 & (long) (this.field764 - 1))];
        arg1.field1589 = var5.field1589;
        arg1.field1588 = var5;
        arg1.field1589.field1588 = arg1;
        arg1.field1588.field1589 = arg1;
        arg1.field1587 = arg0;
    }
}
