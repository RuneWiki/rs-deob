import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RZUUVVSJ")
public class class53 {

    @OriginalMember(owner = "RZUUVVSJ", name = "a", descriptor = "I")
    private int field1383 = -10491;

    @OriginalMember(owner = "RZUUVVSJ", name = "b", descriptor = "I")
    private int field1384 = 2;

    @OriginalMember(owner = "RZUUVVSJ", name = "c", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "RZUUVVSJ", name = "d", descriptor = "[LOEHUIBBM;")
    private class37[] field1386;

    @OriginalMember(owner = "RZUUVVSJ", name = "<init>", descriptor = "(IB)V")
    public class53(int arg0, byte arg1) {
        this.field1385 = arg0;
        if (arg1 != 8) {
            this.field1383 = 227;
        }
        this.field1386 = new class37[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class37 var4 = this.field1386[var3] = new class37();
            var4.field1081 = var4;
            var4.field1082 = var4;
        }
    }

    @OriginalMember(owner = "RZUUVVSJ", name = "a", descriptor = "(J)LOEHUIBBM;")
    public class37 method453(long arg0) {
        class37 var3 = this.field1386[(int) (arg0 & (long) (this.field1385 - 1))];
        for (class37 var4 = var3.field1081; var4 != var3; var4 = var4.field1081) {
            if (var4.field1080 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "RZUUVVSJ", name = "a", descriptor = "(LOEHUIBBM;JZ)V")
    public void method454(class37 arg0, long arg1, boolean arg2) {
        if (arg0.field1082 != null) {
            arg0.method397();
        }
        class37 var5 = this.field1386[(int) (arg1 & (long) (this.field1385 - 1))];
        arg0.field1082 = var5.field1082;
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg0.field1081 = var5;
        arg0.field1082.field1081 = arg0;
        arg0.field1081.field1082 = arg0;
        arg0.field1080 = arg1;
    }
}
