import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class497 {

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "B")
    public byte field7207;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "S")
    public short field7204;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Ljs;")
    public class170 field7210;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "B")
    public byte field7208;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lcb;")
    public static class631 field7213 = new class631(63, 8);

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "F")
    public static float field7209;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lqha;")
    public static class231 field7205;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 7)
    public static void method3014(byte arg0) {
        field7213 = null;
        if (arg0 == 50) {
            field7205 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 20)
    public static final void method3015(byte arg0) {
        class658.method3704(-5697, 11);
        field7206++;
        class449.method2759(10);
        if (arg0 < -119) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 38)
    public static final void method3016(int arg0, int arg1, int arg2) {
        class120.field1849 = arg0 - class729.field10239;
        class505.field7362 = arg1 - class729.field10228;
        if (arg2 < 93) {
            field7209 = -1.1973257F;
        }
        field7211++;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljs;III)V", line = 53)
    public class497(class170 arg0, int arg1, int arg2, int arg3) {
        this.field7207 = (byte) arg3;
        this.field7204 = (short) arg1;
        this.field7210 = arg0;
        this.field7208 = (byte) arg2;
    }
}
