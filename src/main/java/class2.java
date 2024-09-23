import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BELQMOFW")
public class class2 {

    @OriginalMember(owner = "BELQMOFW", name = "a", descriptor = "I")
    private int field37 = -543;

    @OriginalMember(owner = "BELQMOFW", name = "b", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "BELQMOFW", name = "c", descriptor = "[LCDEGFOQA;")
    private class4[] field39;

    @OriginalMember(owner = "BELQMOFW", name = "<init>", descriptor = "(BI)V")
    public class2(byte arg0, int arg1) {
        this.field38 = arg1;
        this.field39 = new class4[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class4 var4 = this.field39[var3] = new class4();
            var4.field55 = var4;
            var4.field56 = var4;
        }
        if (arg0 != 52) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "BELQMOFW", name = "a", descriptor = "(J)LCDEGFOQA;")
    public class4 method14(long arg0) {
        class4 var3 = this.field39[(int) (arg0 & (long) (this.field38 - 1))];
        for (class4 var4 = var3.field55; var4 != var3; var4 = var4.field55) {
            if (var4.field54 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "BELQMOFW", name = "a", descriptor = "(JLCDEGFOQA;B)V")
    public void method15(long arg0, class4 arg1, byte arg2) {
        if (arg1.field56 != null) {
            arg1.method19();
        }
        class4 var5 = this.field39[(int) (arg0 & (long) (this.field38 - 1))];
        arg1.field56 = var5.field56;
        if (arg2 != -18) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg1.field55 = var5;
        arg1.field56.field55 = arg1;
        arg1.field55.field56 = arg1;
        arg1.field54 = arg0;
    }
}
