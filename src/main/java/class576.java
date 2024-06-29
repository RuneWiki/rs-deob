import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class576 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field8163 = -1;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lcb;")
    public static class631 field8165 = new class631(28, -1);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field8166 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lni;")
    public static class511 field8167;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[[[Llo;")
    public static class114[][][] field8160;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public abstract void method42(int arg0);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)J")
    public abstract long method40(int arg0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)I")
    public final int method3335(long arg0, int arg1) {
        field8161++;
        long var4 = this.method40(arg1);
        if ((long) arg1 < var4) {
            class484.method2932(true, var4);
        }
        return this.method39(arg0, (byte) 105);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)I")
    public abstract int method39(long arg0, byte arg1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)J")
    public abstract long method41(byte arg0);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static void method3336(int arg0) {
        field8167 = null;
        field8160 = null;
        field8165 = null;
        if (arg0 != 25936) {
            field8164 = 17;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lha;I)V")
    public static final void method3337(class544 arg0, int arg1) {
        field8162++;
        if (arg1 == class596.field8447.method3467(25623)) {
            return;
        }
        if (class654.field9289.field5415.method2004(arg1 ^ 0x3) == 0) {
            for (class7 var4 = (class7) class596.field8447.method3463((byte) -50); var4 != null; var4 = (class7) class596.field8447.method3469((byte) 107)) {
                class556.field7917.method743(false, false, arg1 - 12581, class236.field3788, var4.field72, arg0, var4.field70, var4.field75, var4.field69, arg0, var4.field73 ? class145.field2251.field8138 : null, var4.field67);
                var4.method636((byte) 97);
            }
            class353.method2259((byte) 98);
            return;
        }
        if (class471.field6843 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class471.field6843 = class405.method2499(class172.field2951, var2, 0, 0, (byte) -121, class352.field5158);
            class19.field194 = class471.field6843.method424(class552.method3220(class424.field6234, (byte) 115, 0, class312.field4704), class726.method4006(class101.field1494, class424.field6234, 0), true);
        }
        for (class7 var3 = (class7) class596.field8447.method3463((byte) -50); var3 != null; var3 = (class7) class596.field8447.method3469((byte) 107)) {
            class556.field7917.method743(false, false, arg1 ^ 0xFFFFCEDB, class19.field194, var3.field72, arg0, var3.field70, var3.field75, var3.field69, class471.field6843, var3.field73 ? class145.field2251.field8138 : null, var3.field67);
            var3.method636((byte) 97);
        }
    }
}
