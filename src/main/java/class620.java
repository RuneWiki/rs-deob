import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public abstract class class620 extends class69 {

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "Lul;")
    public static class486 field8696 = new class486("", 11);

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "Lnf;")
    public static class136 field8693;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)J")
    public abstract long method1624(int arg0);

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
    public static void method3569(int arg0) {
        if (arg0 == 8266) {
            field8693 = null;
            field8696 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)I")
    public abstract int method1623(boolean arg0);

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)I")
    public abstract int method1625(int arg0);

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)I")
    public abstract int method1627(boolean arg0);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)I")
    public static final int method3570(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method3569(109);
        }
        field8694++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "(I)I")
    public abstract int method1626(int arg0);
}
