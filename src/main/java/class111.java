import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class111 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field1844 = 0;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field1841 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field1845 = 2048;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field1838 = 2048;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1836 = "scroll:";

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lja;")
    public static class64 field1842;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 14)
    public static void method846(boolean arg0) {
        if (arg0) {
            field1836 = (String) null;
        }
        field1836 = null;
        field1842 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILpe;)V", line = 25)
    private final void method847(int arg0, int arg1, int arg2, class101 arg3) {
        if (arg0 == 1) {
            this.field1841 = arg3.method741(24);
        } else if (arg0 == 2) {
            this.field1838 = arg3.method731(false);
        } else if (arg0 == 3) {
            this.field1845 = arg3.method731(false);
        } else if (arg0 == 4) {
            this.field1844 = arg3.method780(-17432);
        }
        if (arg2 != -1157) {
            this.field1841 = 68;
        }
        field1840++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 57)
    public static final void method848(int arg0) {
        field1843++;
        class240.field3732.method1837(35);
        if (arg0 != 2048) {
            method848(5);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 69)
    public static final void method849(int arg0) {
        class82.field1225.method1832((byte) -90);
        if (arg0 == 4) {
            field1839++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 83)
    public static final int method850(int arg0, int arg1) {
        field1846++;
        if (arg1 < 28) {
            field1836 = (String) null;
        }
        return arg0 == 16711935 ? -1 : class137.method1049(arg0, 75);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILpe;)V", line = 119)
    public final void method851(byte arg0, int arg1, class101 arg2) {
        while (true) {
            int var4 = arg2.method741(53);
            if (var4 == 0) {
                field1837++;
                if (arg0 > -118) {
                    this.method847(-24, 36, 114, (class101) null);
                }
                return;
            }
            this.method847(var4, arg1, -1157, arg2);
        }
    }
}
