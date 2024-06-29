import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class46 extends class86 {

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "S")
    public short field698;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field693 = -1;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field695 = -1;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Liu;")
    public static class390 field699 = new class390(58, -2);

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Liu;")
    public static class390 field700 = new class390(86, 8);

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(DB)V", line = 3)
    public static final void method350(double arg0, byte arg1) {
        field694++;
        if (class31.field526 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class370.field5554[var3] = var4 > 255 ? 255 : var4;
            }
            class31.field526 = arg0;
        }
        if (arg1 != 70) {
            method352(null, (byte) -48, 89, null);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 35)
    public static void method351(int arg0) {
        field699 = null;
        if (arg0 != 17228) {
            method350(1.170983815320863D, (byte) -106);
        }
        field700 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lps;BILjava/awt/Canvas;)Leq;", line = 64)
    public static final class134 method352(class59 arg0, byte arg1, int arg2, Canvas arg3) {
        field697++;
        return arg1 == 112 ? new class273(arg2, arg3, arg0) : null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V", line = 79)
    public static final void method353(int arg0, boolean arg1) {
        class388.method2333(-123);
        field692++;
        class408.method2441((byte) 79);
        class204.method1259(arg0, false, arg1);
        class479.method2800(0, class481.field6937, class445.field6482, class1.field1);
        class129.method717(class481.field6937, 1623, class445.field6482);
        class181.method1148((byte) -95, class106.field1421);
        class77.method508((byte) 124);
        class176.method1103(0);
        if (class323.field4729 == 10) {
            class168.method1061(false, -31085);
        } else if (class323.field4729 == 30) {
            class319.method1921(15508, 25);
            return;
        } else if (class323.field4729 == 5) {
            class465.method2726(class445.field6482, -104, class481.field6937);
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 105)
    public class46() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(S)V", line = 107)
    public class46(short arg0) {
        this.field698 = arg0;
    }
}
