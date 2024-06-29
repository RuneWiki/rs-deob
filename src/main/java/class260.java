import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class260 implements class104 {

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lra;")
    public static class361 field3500 = new class361(12, 0);

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lra;")
    public static class361 field3504 = new class361(46, 14);

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field3508 = 0;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lra;")
    public static class361 field3506 = new class361(96, 6);

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "F")
    public static float field3507;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Ljaa;")
    public static class250 field3509;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lfl;", line = 3)
    public final class103 method318(int arg0) {
        field3502++;
        if (arg0 != -26207) {
            this.method318(6);
        }
        return class614.field8296;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZZ)V", line = 16)
    public static final void method1621(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            class317.field4109--;
            if (class317.field4109 == 0) {
                class127.field1637 = null;
            }
        }
        field3501++;
        if (arg1) {
            class138.field1812--;
            if (class138.field1812 == 0) {
                class505.field6642 = null;
            }
        }
        if (arg2) {
            method1622((byte) -44);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 45)
    public static void method1622(byte arg0) {
        int var1 = 35 % ((77 - arg0) / 40);
        field3506 = null;
        field3504 = null;
        field3500 = null;
        field3509 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V", line = 67)
    public class260(int arg0) {
        this.field3503 = arg0;
    }
}
