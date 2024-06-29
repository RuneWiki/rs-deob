import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VWNUVMOR")
public class class60 {

    @OriginalMember(owner = "client!VWNUVMOR", name = "b", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client!VWNUVMOR", name = "c", descriptor = "[LJZLLDEPM;")
    private class30[] field1550;

    @OriginalMember(owner = "client!VWNUVMOR", name = "a", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!VWNUVMOR", name = "<init>", descriptor = "(II)V")
    public class60(int arg0, int arg1) {
        this.field1549 = arg0;
        this.field1550 = new class30[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class30 var5 = this.field1550[var3] = new class30();
            var5.field1021 = var5;
            var5.field1022 = var5;
        }
        if (arg1 != 26357) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!VWNUVMOR", name = "a", descriptor = "(J)LJZLLDEPM;")
    public class30 method527(long arg0) {
        class30 var3 = this.field1550[(int) (arg0 & (long) (this.field1549 - 1))];
        for (class30 var4 = var3.field1021; var4 != var3; var4 = var4.field1021) {
            if (var4.field1020 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!VWNUVMOR", name = "a", descriptor = "(ZLJZLLDEPM;J)V")
    public void method528(boolean arg0, class30 arg1, long arg2) {
        if (arg1.field1022 != null) {
            arg1.method329();
        }
        class30 var5 = this.field1550[(int) (arg2 & (long) (this.field1549 - 1))];
        arg1.field1022 = var5.field1022;
        if (!arg0) {
            this.field1548 = 276;
        }
        arg1.field1021 = var5;
        arg1.field1022.field1021 = arg1;
        arg1.field1021.field1022 = arg1;
        arg1.field1020 = arg2;
    }
}
