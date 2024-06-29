import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class253 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lqd;")
    public static class40 field4193 = class147.method1106("settings=", (byte) -81);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4192 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lqd;")
    public static class40 field4195 = class147.method1106(" <col=ffffff>", (byte) -126);

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lhi;")
    public static class282 field4194 = new class282();

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lqd;")
    public static class40 field4196 = class147.method1106("l", (byte) -90);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 16)
    public static final void method1781(Object[] arg0, int arg1, int[] arg2) {
        field4190++;
        class135.method1001(0, (byte) -1, arg2, arg2.length + arg1, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 32)
    public static void method1782(byte arg0) {
        field4196 = null;
        field4192 = null;
        int var1 = -81 / ((arg0 - 59) / 60);
        field4193 = null;
        field4195 = null;
        field4194 = null;
    }
}
