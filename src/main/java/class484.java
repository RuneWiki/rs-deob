import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class484 extends class589 {

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public int field6787 = (int) (class301.method1787((byte) 109) / 1000L);

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Ljava/lang/String;")
    public String field6786;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "S")
    public short field6782;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lgga;I)I", line = 3)
    public static final int method2829(class265 arg0, int arg1) {
        field6783++;
        if (class231.field3011 == arg0) {
            return 7681;
        } else if (class652.field9230 == arg0) {
            return 8448;
        } else if (class442.field6300 == arg0) {
            return 34165;
        } else if (class698.field9875 == arg0) {
            return 260;
        } else if (class603.field8698 == arg0) {
            return 34023;
        } else {
            if (arg1 != 7681) {
                method2831((byte) -127, null, null, 109);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I", line = 33)
    public static final int method2830(int arg0) {
        field6784++;
        if ((double) class550.field7983 == 3.0D) {
            return 37;
        } else if ((double) class550.field7983 == 4.0D) {
            return 50;
        } else if ((double) class550.field7983 == 6.0D) {
            return 75;
        } else if ((double) class550.field7983 == 8.0D) {
            return 100;
        } else if (arg0 == -7670) {
            return 200;
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjn;Ljn;I)V", line = 59)
    public static final void method2831(byte arg0, class668 arg1, class668 arg2, int arg3) {
        class357.field4763 = arg2;
        field6785++;
        if (arg0 == 15) {
            class512.field7503 = arg1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 78)
    public class484(String arg0, int arg1) {
        this.field6786 = arg0;
        this.field6782 = (short) arg1;
    }
}
