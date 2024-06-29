import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class137 extends class159 {

    @OriginalMember(owner = "client!di", name = "k", descriptor = "J")
    public long field1846;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Ljb;")
    public static class519 field1848 = new class519(58, 0);

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Ljb;")
    public static class519 field1852;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "[J")
    public static long[] field1853;

    static {
        new class654("", 76);
        field1852 = new class519(46, 6);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Lmr;", line = 3)
    public static final class154 method950(int arg0) {
        field1847++;
        if (arg0 >= -100) {
            field1853 = null;
        }
        class247.field3222 = 0;
        return class154.method1072((byte) -43);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 15)
    public static void method951(byte arg0) {
        field1848 = null;
        field1853 = null;
        field1852 = null;
        if (arg0 != 86) {
            method953((byte) 0, 1, -53);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V", line = 32)
    public static final void method952(int arg0, byte arg1) {
        if (class125.field1721.field5162.method2276(43) == 0) {
            arg0 = -1;
        }
        field1849++;
        if (class719.field9785 == arg0 || arg1 != -29) {
            return;
        }
        if (arg0 != -1) {
            class638 var2 = class453.field6503.method1511(33, arg0);
            class162 var3 = var2.method3510(-24519);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class786.field10800.method1541(new Point(var2.field8594, var2.field8597), class669.field8962, var3.method1125(), var3.method1118(), var3.method1126(), 1989375728);
                class719.field9785 = arg0;
            }
        }
        if (arg0 == -1 && class719.field9785 != -1) {
            class786.field10800.method1541(new Point(), class669.field8962, null, -1, -1, 1989375728);
            class719.field9785 = -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)I", line = 75)
    public static final int method953(byte arg0, int arg1, int arg2) {
        field1851++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (arg0 < 28) {
                return 1;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 112)
    public static final void method954() {
        class627.field8492 = class627.field8497;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 117)
    public class137() {
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(J)V", line = 119)
    public class137(long arg0) {
        this.field1846 = arg0;
    }
}
