import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JJYRPNAX")
public class class25 {

    @OriginalMember(owner = "client!JJYRPNAX", name = "a", descriptor = "I")
    private int field908 = 9;

    @OriginalMember(owner = "client!JJYRPNAX", name = "b", descriptor = "I")
    private int field909 = 375;

    @OriginalMember(owner = "client!JJYRPNAX", name = "c", descriptor = "I")
    private int field910 = -706;

    @OriginalMember(owner = "client!JJYRPNAX", name = "d", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!JJYRPNAX", name = "e", descriptor = "[LLTTSKENL;")
    private class33[] field912;

    @OriginalMember(owner = "client!JJYRPNAX", name = "<init>", descriptor = "(II)V")
    public class25(int arg0, int arg1) {
        this.field911 = arg1;
        this.field912 = new class33[arg1];
        while (arg0 >= 0) {
            this.field910 = 339;
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            class33 var4 = this.field912[var3] = new class33();
            var4.field958 = var4;
            var4.field959 = var4;
        }
    }

    @OriginalMember(owner = "client!JJYRPNAX", name = "a", descriptor = "(J)LLTTSKENL;")
    public class33 method315(long arg0) {
        class33 var3 = this.field912[(int) (arg0 & (long) (this.field911 - 1))];
        for (class33 var4 = var3.field958; var4 != var3; var4 = var4.field958) {
            if (var4.field957 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!JJYRPNAX", name = "a", descriptor = "(LLTTSKENL;ZJ)V")
    public void method316(class33 arg0, boolean arg1, long arg2) {
        if (arg0.field959 != null) {
            arg0.method327();
        }
        class33 var5 = this.field912[(int) (arg2 & (long) (this.field911 - 1))];
        arg0.field959 = var5.field959;
        arg0.field958 = var5;
        arg0.field959.field958 = arg0;
        arg0.field958.field959 = arg0;
        if (!arg1) {
            arg0.field957 = arg2;
        }
    }
}
