import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class222 extends class445 {

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public static int field2947 = 0;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)I")
    public final int method1254(byte arg0) {
        if (arg0 != -60) {
            field2947 = -36;
        }
        field2950++;
        return this.field2954 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)Z")
    public final boolean method1255(byte arg0) {
        field2949++;
        int var2 = -4 % ((34 - arg0) / 38);
        return (this.field2954 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)I")
    public final int method1256(byte arg0) {
        if (arg0 == -122) {
            field2956++;
            return class173.method1003(this.field2954, (byte) -40);
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Z")
    public final boolean method1257(int arg0) {
        if (arg0 < 91) {
            field2958 = -115;
        }
        field2953++;
        return (this.field2954 & 0x398230) >> 21 != 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z")
    public final boolean method1258(int arg0, int arg1) {
        field2948++;
        if (arg1 == -22114) {
            return (this.field2954 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Z")
    public final boolean method1259(int arg0) {
        field2951++;
        if (arg0 == -16034) {
            return (this.field2954 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public static final void method1260(int arg0) {
        class466.field6459 = arg0;
        for (int var1 = 0; var1 < class143.field2058; var1++) {
            for (int var2 = 0; var2 < class91.field1344; var2++) {
                if (class289.field3897[arg0][var1][var2] == null) {
                    class289.field3897[arg0][var1][var2] = new class491(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
    public class222(int arg0, int arg1) {
        this.field2955 = arg1;
        this.field2954 = arg0;
    }

    static {
        new class206("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field2959 = -1;
        field2958 = 0;
    }
}
