import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class142 {

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "B")
    public byte field1892;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Lsu;")
    public class142 field1875;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Ltc;")
    public static class236 field1879;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 7)
    public static void method870(int arg0) {
        field1879 = null;
        if (arg0 != 1) {
            method870(58);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIBI)Lsu;", line = 19)
    public final class142 method871(int arg0, int arg1, byte arg2, int arg3) {
        field1887++;
        return arg2 == -38 ? new class142(this.field1890, arg3, arg1, arg0, this.field1892) : null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lct;", line = 39)
    public static final class99 method872(byte arg0) {
        field1885++;
        if (arg0 <= 9) {
            method872((byte) 111);
        }
        try {
            return (class99) Class.forName("dq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Lew;", line = 59)
    public final class342 method873(int arg0) {
        if (arg0 != -3) {
            this.field1894 = 10;
        }
        field1882++;
        return class115.method695(this.field1890, 24009);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V", line = 72)
    public static final void method874(int arg0, byte arg1) {
        class395.method2376(10);
        field1880++;
        if (arg1 != -25) {
            field1879 = null;
        }
        class20.method114(-1);
        class141.method869(true, arg0, 108);
        class121.method727(class343.field4596, arg1 + 25, class282.field3733, class98.field1309);
        class186.method1077((byte) 82, class343.field4596, class282.field3733);
        class531.method3157(true);
        class250.method1548(-20170, class302.field3996);
        class104.method628(-105);
        if (class527.field7734 == 2) {
            class57.method345(1, 3);
        } else if (class527.field7734 == 6) {
            class57.method345(1, 7);
        } else if (class527.field7734 == 9) {
            class57.method345(arg1 ^ 0xFFFFFFE6, 10);
        } else if (class527.field7734 == 1) {
            class446.method2753(class343.field4596, class282.field3733, 18);
            return;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIB)V", line = 105)
    public class142(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1890 = arg0;
        this.field1888 = arg2;
        this.field1892 = arg4;
        this.field1883 = arg3;
        this.field1889 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lsu;I)V", line = 116)
    public class142(class142 arg0, int arg1) {
        this.field1875 = arg0;
        this.field1889 = this.field1875.field1889 + arg1;
        this.field1883 = this.field1875.field1883 + arg1;
        this.field1888 = this.field1875.field1888 + arg1;
        this.field1890 = this.field1875.field1890;
        this.field1892 = this.field1875.field1892;
    }
}
