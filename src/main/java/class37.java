import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OYARMXQN")
public class class37 {

    @OriginalMember(owner = "OYARMXQN", name = "a", descriptor = "I")
    private int field1214 = 708;

    @OriginalMember(owner = "OYARMXQN", name = "b", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "OYARMXQN", name = "c", descriptor = "[LOYTUMBCI;")
    private class38[] field1216;

    @OriginalMember(owner = "OYARMXQN", name = "<init>", descriptor = "(II)V")
    public class37(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1214 = -259;
        }
        this.field1215 = arg1;
        this.field1216 = new class38[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class38 var4 = this.field1216[var3] = new class38();
            var4.field1219 = var4;
            var4.field1220 = var4;
        }
    }

    @OriginalMember(owner = "OYARMXQN", name = "a", descriptor = "(J)LOYTUMBCI;")
    public class38 method365(long arg0) {
        class38 var3 = this.field1216[(int) (arg0 & (long) (this.field1215 - 1))];
        for (class38 var4 = var3.field1219; var4 != var3; var4 = var4.field1219) {
            if (var4.field1218 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "OYARMXQN", name = "a", descriptor = "(LOYTUMBCI;JI)V")
    public void method366(class38 arg0, long arg1, int arg2) {
        if (arg0.field1220 != null) {
            arg0.method367();
        }
        class38 var5 = this.field1216[(int) (arg1 & (long) (this.field1215 - 1))];
        arg0.field1220 = var5.field1220;
        arg0.field1219 = var5;
        arg0.field1220.field1219 = arg0;
        arg0.field1219.field1220 = arg0;
        if (arg2 < 5 || arg2 > 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg0.field1218 = arg1;
    }
}
