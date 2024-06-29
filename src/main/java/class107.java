import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class107 {

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field1767 = 1;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lkaa;")
    public static class46 field1768 = new class46(8);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "C")
    public char field1763;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lkr;")
    public static class743 field1765;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILud;I)V", line = 4)
    private final void method926(int arg0, class35 arg1, int arg2) {
        field1769++;
        if (arg2 == 1) {
            this.field1763 = class27.method199(16, arg1.method277((byte) 18));
        } else if (arg2 == 2) {
            this.field1767 = 0;
        }
        if (arg0 != -3) {
            this.method926(-4, null, -32);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 24)
    public static void method927(byte arg0) {
        field1765 = null;
        field1768 = null;
        if (arg0 != -93) {
            field1765 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILud;)V", line = 36)
    public final void method928(int arg0, class35 arg1) {
        int var3 = 66 % ((-arg0 - 34) / 38);
        while (true) {
            int var4 = arg1.method273(255);
            if (var4 == 0) {
                field1770++;
                return;
            }
            this.method926(-3, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BZZII)V", line = 64)
    public static final void method929(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 != -73) {
            field1768 = null;
        }
        field1764++;
        class175.method1277(arg3, arg4, arg2, class261.field3819.length - 1, arg1, (byte) 126, 0);
        class405.field5646 = null;
        class289.field4072 = 0;
    }
}
