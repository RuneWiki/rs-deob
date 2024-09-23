import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LJCRDSKE")
public class class38 {

    @OriginalMember(owner = "LJCRDSKE", name = "a", descriptor = "Z")
    private boolean field1034 = false;

    @OriginalMember(owner = "LJCRDSKE", name = "b", descriptor = "I")
    private int field1035 = -341;

    @OriginalMember(owner = "LJCRDSKE", name = "c", descriptor = "Z")
    private boolean field1036 = true;

    @OriginalMember(owner = "LJCRDSKE", name = "d", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "LJCRDSKE", name = "e", descriptor = "[LXNCSKJMM;")
    private class67[] field1038;

    @OriginalMember(owner = "LJCRDSKE", name = "<init>", descriptor = "(IZ)V")
    public class38(int arg0, boolean arg1) {
        this.field1037 = arg0;
        this.field1038 = new class67[arg0];
        if (arg1) {
            this.field1035 = -93;
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            class67 var4 = this.field1038[var3] = new class67();
            var4.field1666 = var4;
            var4.field1667 = var4;
        }
    }

    @OriginalMember(owner = "LJCRDSKE", name = "a", descriptor = "(J)LXNCSKJMM;")
    public class67 method366(long arg0) {
        class67 var3 = this.field1038[(int) (arg0 & (long) (this.field1037 - 1))];
        for (class67 var4 = var3.field1666; var4 != var3; var4 = var4.field1666) {
            if (var4.field1665 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "LJCRDSKE", name = "a", descriptor = "(BLXNCSKJMM;J)V")
    public void method367(byte arg0, class67 arg1, long arg2) {
        if (arg1.field1667 != null) {
            arg1.method582();
        }
        class67 var5 = this.field1038[(int) (arg2 & (long) (this.field1037 - 1))];
        arg1.field1667 = var5.field1667;
        arg1.field1666 = var5;
        if (arg0 == 1) {
            boolean var6 = false;
        } else {
            this.field1034 = !this.field1034;
        }
        arg1.field1667.field1666 = arg1;
        arg1.field1666.field1667 = arg1;
        arg1.field1665 = arg2;
    }
}
