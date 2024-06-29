import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class116 extends class446 {

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "Z")
    public boolean field1664 = true;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field1667 = -1;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "[I")
    public static int[] field1672 = new int[2];

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "C")
    private char field1665;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "Ljava/lang/String;")
    public String field1670;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILkh;I)V", line = 7)
    private final void method804(int arg0, class11 arg1, int arg2) {
        if (arg2 < 14) {
            this.field1665 = 'Q';
        }
        field1669++;
        if (arg0 == 1) {
            this.field1665 = class436.method2744(63, arg1.method162(-4436));
        } else if (arg0 == 2) {
            this.field1668 = arg1.method185(25239);
        } else if (arg0 == 4) {
            this.field1664 = false;
            return;
        } else if (arg0 == 5) {
            this.field1670 = arg1.method171(-9265);
            return;
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 35)
    public static void method805(int arg0) {
        field1672 = null;
        if (arg0 != -31008) {
            field1672 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)Z", line = 58)
    public final boolean method806(int arg0) {
        if (arg0 == -116) {
            field1671++;
            return this.field1665 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLkh;)V", line = 70)
    public final void method807(byte arg0, class11 arg1) {
        if (arg0 != 46) {
            return;
        }
        field1666++;
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method804(var3, arg1, 43);
        }
    }
}
