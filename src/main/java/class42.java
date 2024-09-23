import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MCCUMEPE")
public class class42 {

    @OriginalMember(owner = "MCCUMEPE", name = "a", descriptor = "I")
    private int field1142 = -27970;

    @OriginalMember(owner = "MCCUMEPE", name = "b", descriptor = "I")
    private int field1143 = 831;

    @OriginalMember(owner = "MCCUMEPE", name = "c", descriptor = "I")
    private int field1144 = 831;

    @OriginalMember(owner = "MCCUMEPE", name = "d", descriptor = "Z")
    private boolean field1145 = true;

    @OriginalMember(owner = "MCCUMEPE", name = "e", descriptor = "I")
    private int field1146 = -891;

    @OriginalMember(owner = "MCCUMEPE", name = "f", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "MCCUMEPE", name = "g", descriptor = "[LOWNYSRQV;")
    private class54[] field1148;

    @OriginalMember(owner = "MCCUMEPE", name = "<init>", descriptor = "(II)V")
    public class42(int arg0, int arg1) {
        this.field1147 = arg0;
        if (arg1 <= 0) {
            this.field1146 = -45;
        }
        this.field1148 = new class54[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class54 var4 = this.field1148[var3] = new class54();
            var4.field1299 = var4;
            var4.field1300 = var4;
        }
    }

    @OriginalMember(owner = "MCCUMEPE", name = "a", descriptor = "(J)LOWNYSRQV;")
    public class54 method314(long arg0) {
        class54 var3 = this.field1148[(int) (arg0 & (long) (this.field1147 - 1))];
        for (class54 var4 = var3.field1299; var4 != var3; var4 = var4.field1299) {
            if (var4.field1298 == arg0) {
                return var4;
            }
        }
        if (class54.field1301) {
        }
        return null;
    }

    @OriginalMember(owner = "MCCUMEPE", name = "a", descriptor = "(BLOWNYSRQV;J)V")
    public void method315(byte arg0, class54 arg1, long arg2) {
        if (arg1.field1300 != null) {
            arg1.method334();
        }
        class54 var5 = this.field1148[(int) (arg2 & (long) (this.field1147 - 1))];
        if (arg0 != 87) {
            return;
        }
        arg1.field1300 = var5.field1300;
        arg1.field1299 = var5;
        arg1.field1300.field1299 = arg1;
        arg1.field1299.field1300 = arg1;
        arg1.field1298 = arg2;
    }
}
