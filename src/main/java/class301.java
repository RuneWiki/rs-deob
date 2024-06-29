import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class301 {

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4045 = -1;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", line = 3)
    public static final void method1786(String arg0, String arg1, String arg2, String arg3, int arg4, int arg5, int arg6) {
        class568.method3328(arg2, arg6, null, arg3, -95, arg5, arg4, arg1, arg0);
        field4042++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)J", line = 17)
    public static final synchronized long method1787(byte arg0) {
        field4046++;
        long var1 = System.currentTimeMillis();
        if (client.field3743 > var1) {
            class77.field1127 += client.field3743 - var1;
        }
        client.field3743 = var1;
        int var3 = -65 / ((arg0 - 6) / 32);
        return var1 + class77.field1127;
    }
}
