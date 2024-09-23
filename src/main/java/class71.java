import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZRDWHMTU")
public class class71 {

    @OriginalMember(owner = "ZRDWHMTU", name = "a", descriptor = "I")
    private int field1700;

    @OriginalMember(owner = "ZRDWHMTU", name = "b", descriptor = "[LMXUYAYVV;")
    private class38[] field1701;

    @OriginalMember(owner = "ZRDWHMTU", name = "<init>", descriptor = "(II)V")
    public class71(int arg0, int arg1) {
        this.field1700 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1701 = new class38[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class38 var5 = this.field1701[var4] = new class38();
            var5.field1226 = var5;
            var5.field1227 = var5;
        }
    }

    @OriginalMember(owner = "ZRDWHMTU", name = "a", descriptor = "(J)LMXUYAYVV;")
    public class38 method561(long arg0) {
        class38 var3 = this.field1701[(int) (arg0 & (long) (this.field1700 - 1))];
        for (class38 var4 = var3.field1226; var4 != var3; var4 = var4.field1226) {
            if (var4.field1225 == arg0) {
                return var4;
            }
        }
        if (class38.field1228) {
        }
        return null;
    }

    @OriginalMember(owner = "ZRDWHMTU", name = "a", descriptor = "(JLMXUYAYVV;I)V")
    public void method562(long arg0, class38 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        if (arg1.field1227 != null) {
            arg1.method430();
        }
        class38 var5 = this.field1701[(int) (arg0 & (long) (this.field1700 - 1))];
        arg1.field1227 = var5.field1227;
        arg1.field1226 = var5;
        arg1.field1227.field1226 = arg1;
        arg1.field1226.field1227 = arg1;
        arg1.field1225 = arg0;
    }
}
