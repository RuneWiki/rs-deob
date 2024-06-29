import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OWFJUUFC")
public class class40 {

    @OriginalMember(owner = "client!OWFJUUFC", name = "a", descriptor = "Z")
    private boolean field1174 = true;

    @OriginalMember(owner = "client!OWFJUUFC", name = "b", descriptor = "I")
    private int field1175 = 562;

    @OriginalMember(owner = "client!OWFJUUFC", name = "c", descriptor = "B")
    private byte field1176 = 5;

    @OriginalMember(owner = "client!OWFJUUFC", name = "d", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!OWFJUUFC", name = "e", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!OWFJUUFC", name = "f", descriptor = "[LLXNKZOGX;")
    private class31[] field1179;

    @OriginalMember(owner = "client!OWFJUUFC", name = "<init>", descriptor = "(BI)V")
    public class40(byte arg0, int arg1) {
        if (this.field1176 == arg0) {
            boolean var3 = false;
        } else {
            this.field1177 = -458;
        }
        this.field1178 = arg1;
        this.field1179 = new class31[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class31 var5 = this.field1179[var4] = new class31();
            var5.field982 = var5;
            var5.field983 = var5;
        }
    }

    @OriginalMember(owner = "client!OWFJUUFC", name = "a", descriptor = "(J)LLXNKZOGX;")
    public class31 method378(long arg0) {
        class31 var3 = this.field1179[(int) (arg0 & (long) (this.field1178 - 1))];
        for (class31 var4 = var3.field982; var4 != var3; var4 = var4.field982) {
            if (var4.field981 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!OWFJUUFC", name = "a", descriptor = "(JLLXNKZOGX;I)V")
    public void method379(long arg0, class31 arg1, int arg2) {
        if (arg2 != 0) {
            this.field1174 = !this.field1174;
        }
        if (arg1.field983 != null) {
            arg1.method331();
        }
        class31 var5 = this.field1179[(int) (arg0 & (long) (this.field1178 - 1))];
        arg1.field983 = var5.field983;
        arg1.field982 = var5;
        arg1.field983.field982 = arg1;
        arg1.field982.field983 = arg1;
        arg1.field981 = arg0;
    }
}
