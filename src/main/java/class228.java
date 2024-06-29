import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class228 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lsv;")
    public static class319 field3200 = new class319(new byte[5000]);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lhi;")
    public static class45 field3201 = new class45(39, 15);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lza;")
    public static class295 field3204;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method1405(byte arg0) {
        field3199++;
        if (class33.field516) {
            return;
        }
        int var1 = 92 % ((76 - arg0) / 47);
        if (class76.field1075.field3649) {
            class496.field7236 = ((int) class496.field7236 + 47 & 0xFFFFFFF0);
        } else {
            class514.field7533 += (12.0F - class514.field7533) / 2.0F;
        }
        class33.field516 = true;
        class163.field2483 = true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method1406(boolean arg0) {
        if (arg0) {
            method1406(true);
        }
        field3200 = null;
        field3204 = null;
        field3201 = null;
    }
}
