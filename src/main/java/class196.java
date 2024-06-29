import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class196 {

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3539 = -1;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lhh;")
    public static class163 field3534 = class137.method1065("(U4", 17);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lhh;")
    private static class163 field3535 = class137.method1065("Attack", 17);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
    public static int[] field3543 = new int[200];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lhh;")
    public static class163 field3531 = field3535;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lhh;")
    public static class163 field3544 = class137.method1065(")2", 17);

    @OriginalMember(owner = "client!u", name = "h", descriptor = "B")
    public static byte field3537;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lv;")
    public static class22 field3540;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field3530;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lne;")
    public static final class94 method1415(int arg0) {
        field3542++;
        class242 var1 = new class242(class107.field2043, class2.field36, class65.field1107[0], class180.field3267[0], class256.field4478[0], class257.field4505[0], class223.field4070[arg0], class111.field2097);
        class67.method463(93);
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1416(byte arg0) {
        field3535 = null;
        field3540 = null;
        field3530 = null;
        field3543 = null;
        field3531 = null;
        field3534 = null;
        field3544 = null;
        if (arg0 != -92) {
            method1416((byte) 76);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
    public static final int method1417(boolean arg0) {
        if (arg0) {
            method1416((byte) -48);
        }
        field3545++;
        return ((class2.field46 == 0 ? 0 : 1) << 22) + ((class77.field1453 == 0 ? 0 : 1) << 21) + ((class215.field3928 == 0 ? 0 : 1) << 20) + ((class84.field1593 ? 1 : 0) << 15) + ((class48.field804 ? 1 : 0) << 13) + ((class22.field353 & 0x3) << 11) + ((class9.field154 ? 1 : 0) << 9) + ((class119.field2247 ? 1 : 0) << 5) + ((class114.field2149 ? 1 : 0) << 3) + (class211.field3824 & 0x7) + ((class73.field1368 ? 1 : 0) << 4) + ((class208.field3781 ? 1 : 0) << 6) + (((class210.field3801 ? 1 : 0) << 7) - (-((class126.field2438 ? 1 : 0) << 8) - (((client.field2006 ? 1 : 0) << 10) + ((class88.field1633 ? 1 : 0) << 16)))) + ((class103.field1975 & 0x3) << 17) + ((class244.field4306 ? 1 : 0) << 19);
    }
}
