import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class219 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[Z")
    public static boolean[] field3699 = new boolean[100];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    public static int[] field3698 = new int[32768];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3703 = -1;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "J")
    public static long field3697 = 0L;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 7)
    public static void method1438(int arg0) {
        int var1 = -65 % ((85 - arg0) / 37);
        field3698 = null;
        field3699 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Z", line = 20)
    public static final boolean method1439(int arg0, int arg1) {
        field3702++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            if (arg1 >= -103) {
                field3699 = (boolean[]) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II[BI)Lbe;", line = 52)
    public static final class283 method1440(int arg0, int arg1, byte[] arg2, int arg3) {
        class283 var4 = new class283();
        var4.field4843 = new byte[arg1];
        var4.field4812 = 0;
        if (arg0 != 159) {
            return (class283) null;
        }
        for (int var5 = arg3; var5 < (arg3 + arg1); var5++) {
            if (arg2[var5] != 0) {
                var4.field4843[var4.field4812++] = arg2[var5];
            }
        }
        field3701++;
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)Z", line = 83)
    public static final boolean method1441(int arg0, int arg1) {
        field3700++;
        if (arg1 < 3) {
            field3703 = -79;
        }
        return ((arg0 & 0x64D5221C) >> 30) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Z", line = 107)
    public static final boolean method1442(int arg0, int arg1, int arg2) {
        field3704++;
        if (arg1 < 70) {
            return true;
        } else {
            return (arg2 >> arg0 + 1 & 0x1) != 0;
        }
    }
}
