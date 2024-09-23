import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LLGCDMZG")
public class class43 {

    @OriginalMember(owner = "LLGCDMZG", name = "a", descriptor = "I")
    private int field1241 = -39808;

    @OriginalMember(owner = "LLGCDMZG", name = "b", descriptor = "Z")
    private boolean field1242 = true;

    @OriginalMember(owner = "LLGCDMZG", name = "c", descriptor = "I")
    private int field1243 = 46945;

    @OriginalMember(owner = "LLGCDMZG", name = "d", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "LLGCDMZG", name = "e", descriptor = "[LOGKECTLC;")
    private class45[] field1245;

    @OriginalMember(owner = "LLGCDMZG", name = "<init>", descriptor = "(BI)V")
    public class43(byte arg0, int arg1) {
        this.field1244 = arg1;
        this.field1245 = new class45[arg1];
        if (arg0 != 22) {
            this.field1241 = -255;
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            class45 var4 = this.field1245[var3] = new class45();
            var4.field1263 = var4;
            var4.field1264 = var4;
        }
    }

    @OriginalMember(owner = "LLGCDMZG", name = "a", descriptor = "(J)LOGKECTLC;")
    public class45 method447(long arg0) {
        class45 var3 = this.field1245[(int) (arg0 & (long) (this.field1244 - 1))];
        for (class45 var4 = var3.field1263; var4 != var3; var4 = var4.field1263) {
            if (var4.field1262 == arg0) {
                return var4;
            }
        }
        if (class45.field1265) {
        }
        return null;
    }

    @OriginalMember(owner = "LLGCDMZG", name = "a", descriptor = "(LOGKECTLC;BJ)V")
    public void method448(class45 arg0, byte arg1, long arg2) {
        if (arg1 != -49) {
            return;
        }
        if (arg0.field1264 != null) {
            arg0.method450();
        }
        class45 var5 = this.field1245[(int) (arg2 & (long) (this.field1244 - 1))];
        arg0.field1264 = var5.field1264;
        arg0.field1263 = var5;
        arg0.field1264.field1263 = arg0;
        arg0.field1263.field1264 = arg0;
        arg0.field1262 = arg2;
    }
}
