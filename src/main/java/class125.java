import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class125 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field1690 = 0;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field1693 = 2048;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field1694 = 2048;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field1696 = 0;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lap;")
    public static class310 field1692 = new class310(31, 2);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "J")
    public static long field1698 = 0L;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lae;")
    public static class172 field1697;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lnl;")
    public static class435 field1699;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILkk;)V")
    public final void method946(int arg0, class161 arg1) {
        if (arg0 != 31) {
            method947(47);
        }
        while (true) {
            int var3 = arg1.method1172((byte) -113);
            if (var3 == 0) {
                field1688++;
                return;
            }
            this.method949(var3, (byte) -17, arg1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method947(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class424.field5879[var1] = true;
        }
        field1689++;
        if (arg0 > -44) {
            method947(-16);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method948(int arg0) {
        field1699 = null;
        field1692 = null;
        if (arg0 <= -119) {
            field1697 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLkk;)V")
    private final void method949(int arg0, byte arg1, class161 arg2) {
        if (arg1 >= -11) {
            field1692 = null;
        }
        if (arg0 == 1) {
            this.field1690 = arg2.method1172((byte) 113);
        } else if (arg0 == 2) {
            this.field1693 = arg2.method1134(-16848);
        } else if (arg0 == 3) {
            this.field1694 = arg2.method1134(-16848);
        } else if (arg0 == 4) {
            this.field1696 = arg2.method1163(9988);
        }
        field1691++;
    }
}
