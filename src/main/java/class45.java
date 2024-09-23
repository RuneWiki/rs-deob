import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SAEPCADT")
public class class45 {

    @OriginalMember(owner = "SAEPCADT", name = "a", descriptor = "I")
    private int field1153 = 38686;

    @OriginalMember(owner = "SAEPCADT", name = "b", descriptor = "I")
    private int field1154 = 12314;

    @OriginalMember(owner = "SAEPCADT", name = "c", descriptor = "Z")
    private boolean field1155 = true;

    @OriginalMember(owner = "SAEPCADT", name = "d", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "SAEPCADT", name = "e", descriptor = "[LWYQNTERC;")
    private class64[] field1157;

    @OriginalMember(owner = "SAEPCADT", name = "<init>", descriptor = "(II)V")
    public class45(int arg0, int arg1) {
        this.field1156 = arg1;
        this.field1157 = new class64[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class64 var4 = this.field1157[var3] = new class64();
            var4.field1588 = var4;
            var4.field1589 = var4;
        }
        while (arg0 >= 0) {
            this.field1153 = -171;
        }
    }

    @OriginalMember(owner = "SAEPCADT", name = "a", descriptor = "(J)LWYQNTERC;")
    public class64 method431(long arg0) {
        class64 var3 = this.field1157[(int) (arg0 & (long) (this.field1156 - 1))];
        for (class64 var4 = var3.field1588; var4 != var3; var4 = var4.field1588) {
            if (var4.field1587 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "SAEPCADT", name = "a", descriptor = "(IJLWYQNTERC;)V")
    public void method432(int arg0, long arg1, class64 arg2) {
        if (arg0 != -11582) {
            this.field1153 = -58;
        }
        if (arg2.field1589 != null) {
            arg2.method540();
        }
        class64 var5 = this.field1157[(int) (arg1 & (long) (this.field1156 - 1))];
        arg2.field1589 = var5.field1589;
        arg2.field1588 = var5;
        arg2.field1589.field1588 = arg2;
        arg2.field1588.field1589 = arg2;
        arg2.field1587 = arg1;
    }
}
