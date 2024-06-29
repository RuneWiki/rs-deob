import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JVZXLCGT")
public class class33 {

    @OriginalMember(owner = "client!JVZXLCGT", name = "a", descriptor = "Z")
    private boolean field981 = false;

    @OriginalMember(owner = "client!JVZXLCGT", name = "b", descriptor = "I")
    private int field982 = 5;

    @OriginalMember(owner = "client!JVZXLCGT", name = "c", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!JVZXLCGT", name = "d", descriptor = "[LABHGPSRU;")
    private class1[] field984;

    @OriginalMember(owner = "client!JVZXLCGT", name = "<init>", descriptor = "(BI)V")
    public class33(byte arg0, int arg1) {
        this.field983 = arg1;
        this.field984 = new class1[arg1];
        if (arg0 != 108) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1; var4++) {
            class1 var5 = this.field984[var4] = new class1();
            var5.field2 = var5;
            var5.field3 = var5;
        }
    }

    @OriginalMember(owner = "client!JVZXLCGT", name = "a", descriptor = "(J)LABHGPSRU;")
    public class1 method341(long arg0) {
        class1 var3 = this.field984[(int) (arg0 & (long) (this.field983 - 1))];
        for (class1 var4 = var3.field2; var4 != var3; var4 = var4.field2) {
            if (var4.field1 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!JVZXLCGT", name = "a", descriptor = "(ILABHGPSRU;J)V")
    public void method342(int arg0, class1 arg1, long arg2) {
        if (arg1.field3 != null) {
            arg1.method1();
        }
        class1 var5 = this.field984[(int) (arg2 & (long) (this.field983 - 1))];
        arg1.field3 = var5.field3;
        if (arg0 <= 0) {
            return;
        }
        arg1.field2 = var5;
        arg1.field3.field2 = arg1;
        arg1.field2.field3 = arg1;
        arg1.field1 = arg2;
        if (class1.field4) {
        }
    }
}
