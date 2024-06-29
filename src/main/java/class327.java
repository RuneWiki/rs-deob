import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class327 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
    public static int[] field5066 = new int[8];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5070 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5068 = -1;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5071 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lbh;")
    public static class274[] field5067;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 11)
    public static void method2241(byte arg0) {
        if (arg0 != 124) {
            field5071 = 101;
        }
        field5066 = null;
        field5067 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 25)
    public static final String method2242(byte arg0, long arg1) {
        if (arg0 == 92) {
            field5069++;
            return class74.method555((byte) -116, arg1);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public abstract void method430(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I")
    public abstract int method432(int arg0, int arg1, int arg2);
}
