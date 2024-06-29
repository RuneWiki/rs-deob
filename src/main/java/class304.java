import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class304 {

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field4253 = 0;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field4256 = 1;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Lmr;")
    public static class213 field4254;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "Lgda;")
    public static class486 field4255;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II[B)I", line = 5)
    public static final int method1858(int arg0, int arg1, byte[] arg2) {
        if (arg1 == -12498) {
            field4257++;
            return class457.method2650(arg2, 0, false, arg0);
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Lqe;", line = 26)
    public static final class80 method1859(byte arg0) {
        if (arg0 != 59) {
            method1859((byte) 58);
        }
        field4252++;
        class80 var1 = (class80) class377.field5226.method3306((byte) -127);
        if (var1 == null) {
            return new class80();
        } else {
            class437.field6285--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 48)
    public static void method1860(int arg0) {
        field4255 = null;
        int var1 = 101 % ((37 - arg0) / 62);
        field4254 = null;
    }
}
