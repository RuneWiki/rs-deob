import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class275 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field4246;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[B")
    public byte[] field4242;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public int[] field4249;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public int[] field4254;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field4241 = -1;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lna;")
    public static class22 field4247;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method1930(int arg0, int arg1) {
        field4248++;
        if (arg0 != -25638) {
            this.field4246 = (String[]) null;
        }
        return (this.field4242[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILug;II)[Lci;", line = 16)
    public static final class201[] method1931(int arg0, class253 arg1, int arg2, int arg3) {
        if (arg2 != -25679) {
            method1933(71, -5, 109);
        }
        field4251++;
        return class287.method2029(arg1, arg3, 2, arg0) ? class221.method1616(101) : null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 31)
    public static void method1932(int arg0) {
        if (arg0 >= -123) {
            field4247 = (class22) null;
        }
        field4247 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I", line = 43)
    public static final int method1933(int arg0, int arg1, int arg2) {
        field4252++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg1 == arg2) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)I", line = 82)
    public final int method1934(boolean arg0, int arg1) {
        field4245++;
        return arg0 ? 102 : this.field4242[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Z", line = 100)
    public final boolean method1935(int arg0, int arg1) {
        if (arg1 == -1) {
            field4250++;
            return (this.field4242[arg0] & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Z", line = 112)
    public final boolean method1936(byte arg0, int arg1) {
        if (arg0 >= -33) {
            return false;
        } else {
            field4253++;
            return (this.field4242[arg1] & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V", line = 129)
    public class275(int arg0) {
        this.field4244 = arg0;
        this.field4246 = new String[this.field4244];
        this.field4242 = new byte[this.field4244];
        this.field4249 = new int[this.field4244];
        this.field4254 = new int[this.field4244];
    }
}
