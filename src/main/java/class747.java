import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public abstract class class747 {

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "[I")
    public static int[] field10443 = new int[25];

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lcb;")
    public static class631 field10444 = new class631(80, 8);

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field10446 = -1;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III[B)V")
    public abstract void method3115(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
    public abstract void method3117(boolean arg0);

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method4176(String arg0, byte arg1) {
        field10445++;
        if (arg1 != -83) {
            method4178(84);
        }
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + ((long) arg0.charAt(var5)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public abstract void method3118(int arg0);

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLkn;)Z")
    public static final boolean method4177(byte arg0, class516 arg1) {
        if (arg0 == 121) {
            field10442++;
            return arg1 == null ? false : class52.method502(arg1.field7472 - arg1.field7469, arg1.field7474, -125, arg1.field7479, arg1.field7480 - arg1.field7474, arg1.field7469, arg1.field7484 - arg1.field7479);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
    public static void method4178(int arg0) {
        field10444 = null;
        if (arg0 == -1) {
            field10443 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)Z")
    public abstract boolean method3114(int arg0, byte arg1) throws IOException;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBI[B)I")
    public abstract int method3120(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException;
}
