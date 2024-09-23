import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YCPCXCIN")
public class class68 {

    @OriginalMember(owner = "YCPCXCIN", name = "a", descriptor = "I")
    private int field1685 = -28737;

    @OriginalMember(owner = "YCPCXCIN", name = "b", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "YCPCXCIN", name = "c", descriptor = "[LDLMMHADP;")
    private class13[] field1687;

    @OriginalMember(owner = "YCPCXCIN", name = "<init>", descriptor = "(II)V")
    public class68(int arg0, int arg1) {
        if (arg1 != -32236) {
            throw new NullPointerException();
        }
        this.field1686 = arg0;
        this.field1687 = new class13[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class13 var4 = this.field1687[var3] = new class13();
            var4.field721 = var4;
            var4.field722 = var4;
        }
    }

    @OriginalMember(owner = "YCPCXCIN", name = "a", descriptor = "(J)LDLMMHADP;")
    public class13 method578(long arg0) {
        class13 var3 = this.field1687[(int) (arg0 & (long) (this.field1686 - 1))];
        for (class13 var4 = var3.field721; var4 != var3; var4 = var4.field721) {
            if (var4.field720 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "YCPCXCIN", name = "a", descriptor = "(LDLMMHADP;JB)V")
    public void method579(class13 arg0, long arg1, byte arg2) {
        if (arg0.field722 != null) {
            arg0.method234();
        }
        class13 var5 = this.field1687[(int) (arg1 & (long) (this.field1686 - 1))];
        arg0.field722 = var5.field722;
        if (arg2 == 5) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        arg0.field721 = var5;
        arg0.field722.field721 = arg0;
        arg0.field721.field722 = arg0;
        arg0.field720 = arg1;
    }
}
