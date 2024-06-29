import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SMFBSJJD")
public class class56 {

    @OriginalMember(owner = "client!SMFBSJJD", name = "b", descriptor = "B")
    private byte field1570 = 8;

    @OriginalMember(owner = "client!SMFBSJJD", name = "c", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!SMFBSJJD", name = "d", descriptor = "[LSSWDZUWQ;")
    private class57[] field1572;

    @OriginalMember(owner = "client!SMFBSJJD", name = "a", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!SMFBSJJD", name = "<init>", descriptor = "(II)V")
    public class56(int arg0, int arg1) {
        this.field1571 = arg1;
        this.field1572 = new class57[arg1];
        if (arg0 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1; var4++) {
            class57 var5 = this.field1572[var4] = new class57();
            var5.field1575 = var5;
            var5.field1576 = var5;
        }
    }

    @OriginalMember(owner = "client!SMFBSJJD", name = "a", descriptor = "(J)LSSWDZUWQ;")
    public class57 method503(long arg0) {
        class57 var3 = this.field1572[(int) (arg0 & (long) (this.field1571 - 1))];
        for (class57 var4 = var3.field1575; var4 != var3; var4 = var4.field1575) {
            if (var4.field1574 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!SMFBSJJD", name = "a", descriptor = "(JLSSWDZUWQ;Z)V")
    public void method504(long arg0, class57 arg1, boolean arg2) {
        if (!arg2) {
            this.field1569 = -115;
        }
        if (arg1.field1576 != null) {
            arg1.method505();
        }
        class57 var5 = this.field1572[(int) (arg0 & (long) (this.field1571 - 1))];
        arg1.field1576 = var5.field1576;
        arg1.field1575 = var5;
        arg1.field1576.field1575 = arg1;
        arg1.field1575.field1576 = arg1;
        arg1.field1574 = arg0;
    }
}
