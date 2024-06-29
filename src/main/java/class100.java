import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class100 extends class69 {

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "J")
    public long field1519;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Leg;")
    public static class272 field1521 = new class272(30);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[I")
    public static int[] field1522 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lmg;")
    public static class139 field1524 = null;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[Lwb;")
    public static class138[] field1520;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljj;III)[Ljg;")
    public static final class271[] method709(class134 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 70) {
            return null;
        } else {
            field1517++;
            return class227.method1499((byte) -43, arg0, arg1, arg2) ? class228.method1517((byte) 110) : null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method710(byte arg0) {
        field1520 = null;
        if (arg0 <= 26) {
            method710((byte) 21);
        }
        field1521 = null;
        field1522 = null;
        field1524 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class100() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(J)V")
    public class100(long arg0) {
        this.field1519 = arg0;
    }
}
