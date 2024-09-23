import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RXQASTJV")
public class class49 {

    @OriginalMember(owner = "RXQASTJV", name = "a", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "RXQASTJV", name = "b", descriptor = "[LDJXGSHIT;")
    private class6[] field1296;

    @OriginalMember(owner = "RXQASTJV", name = "<init>", descriptor = "(II)V")
    public class49(int arg0, int arg1) {
        this.field1295 = arg0;
        this.field1296 = new class6[arg0];
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            class6 var4 = this.field1296[var3] = new class6();
            var4.field543 = var4;
            var4.field544 = var4;
        }
    }

    @OriginalMember(owner = "RXQASTJV", name = "a", descriptor = "(J)LDJXGSHIT;")
    public class6 method508(long arg0) {
        class6 var3 = this.field1296[(int) (arg0 & (long) (this.field1295 - 1))];
        for (class6 var4 = var3.field543; var4 != var3; var4 = var4.field543) {
            if (var4.field542 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "RXQASTJV", name = "a", descriptor = "(ILDJXGSHIT;J)V")
    public void method509(int arg0, class6 arg1, long arg2) {
        if (arg1.field544 != null) {
            arg1.method156();
        }
        class6 var5 = this.field1296[(int) (arg2 & (long) (this.field1295 - 1))];
        arg1.field544 = var5.field544;
        arg1.field543 = var5;
        arg1.field544.field543 = arg1;
        arg1.field543.field544 = arg1;
        if (arg0 < 0 || arg0 > 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg1.field542 = arg2;
    }
}
