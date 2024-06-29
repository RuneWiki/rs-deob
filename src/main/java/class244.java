import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class244 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lpj;")
    public static class237 field4282 = class33.method353(":chalreq:", 47);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lva;")
    public static class34 field4279 = new class34(5000);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "J")
    public long field4275;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lqe;")
    public class95 field4271;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lqe;")
    public class95 field4272;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lqe;")
    public class95 field4278;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        field4282 = null;
        if (arg0 == -66) {
            field4279 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static final void method1685(byte arg0) {
        field4283++;
        class55.field1131.method942(0);
        class238.field4168.method942(0);
        if (arg0 != 65) {
            method1685((byte) 62);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)Lwc;")
    public static final class221 method1686(byte arg0) {
        field4280++;
        try {
            return arg0 == 112 ? (class221) Class.forName("vg").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return new class43();
        }
    }
}
