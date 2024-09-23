import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OAXQGLDV")
public class class37 {

    @OriginalMember(owner = "OAXQGLDV", name = "a", descriptor = "I")
    private int field1106 = 33605;

    @OriginalMember(owner = "OAXQGLDV", name = "b", descriptor = "Z")
    private boolean field1107 = false;

    @OriginalMember(owner = "OAXQGLDV", name = "c", descriptor = "Z")
    private boolean field1108 = true;

    @OriginalMember(owner = "OAXQGLDV", name = "d", descriptor = "I")
    private int field1109 = 7;

    @OriginalMember(owner = "OAXQGLDV", name = "e", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "OAXQGLDV", name = "f", descriptor = "[LOKDOXVFL;")
    private class40[] field1111;

    @OriginalMember(owner = "OAXQGLDV", name = "<init>", descriptor = "(IZ)V")
    public class37(int arg0, boolean arg1) {
        this.field1110 = arg0;
        this.field1111 = new class40[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class40 var4 = this.field1111[var3] = new class40();
            var4.field1191 = var4;
            var4.field1192 = var4;
        }
        if (arg1) {
            this.field1108 = !this.field1108;
        }
    }

    @OriginalMember(owner = "OAXQGLDV", name = "a", descriptor = "(J)LOKDOXVFL;")
    public class40 method339(long arg0) {
        class40 var3 = this.field1111[(int) (arg0 & (long) (this.field1110 - 1))];
        for (class40 var4 = var3.field1191; var4 != var3; var4 = var4.field1191) {
            if (var4.field1190 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "OAXQGLDV", name = "a", descriptor = "(JLOKDOXVFL;I)V")
    public void method340(long arg0, class40 arg1, int arg2) {
        if (arg1.field1192 != null) {
            arg1.method398();
        }
        class40 var5 = this.field1111[(int) (arg0 & (long) (this.field1110 - 1))];
        arg1.field1192 = var5.field1192;
        if (arg2 != 0) {
            return;
        }
        arg1.field1191 = var5;
        arg1.field1192.field1191 = arg1;
        arg1.field1191.field1192 = arg1;
        arg1.field1190 = arg0;
        if (class40.field1193) {
        }
    }
}
