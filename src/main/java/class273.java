import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class273 extends class156 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "C")
    public char field3464;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "J")
    public long field3465;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lbg;")
    public class273 field3471;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
    public boolean field3468;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)C", line = 5)
    public final char method1054(boolean arg0) {
        if (arg0) {
            return (char) 65498;
        } else {
            field3467++;
            return this.field3464;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I", line = 18)
    public final int method1052(byte arg0) {
        field3469++;
        if (arg0 != 51) {
            this.method1052((byte) -12);
        }
        return this.field3462;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Z", line = 31)
    public final boolean method1056(byte arg0) {
        field3470++;
        int var2 = 116 / ((arg0 + 17) / 48);
        return this.field3468;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I", line = 43)
    public final int method1057(byte arg0) {
        if (arg0 >= -27) {
            return 76;
        } else {
            field3461++;
            return this.field3463;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)J", line = 68)
    public final long method1055(int arg0) {
        field3473++;
        if (arg0 != 28633) {
            this.method1057((byte) 21);
        }
        return this.field3465;
    }
}
