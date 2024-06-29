import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class512 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field7133 = new int[1];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "F")
    public static float field7129;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 4)
    public static void method2988(int arg0) {
        int var1 = -127 / ((arg0 + 36) / 51);
        field7133 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)Z", line = 13)
    public static final boolean method2989(byte arg0, int arg1, int arg2) {
        if (arg0 <= 46) {
            return false;
        } else {
            field7134++;
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z", line = 24)
    public static final boolean method2990(byte arg0) {
        field7128++;
        if (arg0 != 118) {
            field7133 = null;
        }
        return class289.method1854((byte) -121, "jaclib") ? class289.method1854((byte) 33, "hw3d") : false;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 42)
    public static final void method2991(byte arg0) {
        field7132++;
        if (class318.field4526 != null) {
            class318.field4526.method2501(115);
        }
        int var1 = -29 / ((arg0 - 36) / 34);
        if (class790.field10850 != null) {
            class790.field10850.method2501(89);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 65)
    public static final void method2992(int arg0) {
        class593.field8098.method468(((float) class125.field1721.field5136.method331(43) * 0.1F + 0.7F) * class692.field9217);
        field7130++;
        class593.field8098.method555(class52.field630, class734.field9958, field7129, (float) (class69.field955 << 2), (float) (class578.field7890 << 2), (float) (class565.field7734 << 2));
        class593.field8098.method440(class789.field10841);
        if (arg0 != 1055253410) {
            field7133 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lfea;I)I", line = 78)
    public static final int method2993(class152 arg0, int arg1) {
        field7131++;
        if (class117.field1574 == arg0) {
            return 7681;
        } else if (class291.field4152 == arg0) {
            return 8448;
        } else if (class328.field4644 == arg0) {
            return 34165;
        } else if (class175.field2307 == arg0) {
            return 260;
        } else if (class66.field895 == arg0) {
            return 34023;
        } else {
            if (arg1 != 260) {
                method2990((byte) -127);
            }
            throw new IllegalArgumentException();
        }
    }
}
