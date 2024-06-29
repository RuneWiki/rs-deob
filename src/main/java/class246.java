import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class class246 {

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lpg;")
    public class333 field3361;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Lde;")
    public static class10 field3360;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZB)V")
    public abstract void method743(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Z")
    public abstract boolean method738(byte arg0);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
    public abstract void method740(boolean arg0, int arg1);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public abstract void method739(int arg0);

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
    public static void method1477(byte arg0) {
        int var1 = 107 % ((arg0 + 35) / 37);
        field3360 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)V")
    public abstract void method744(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILfg;I)V")
    public abstract void method742(int arg0, class128 arg1, int arg2);

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lpg;)V")
    public class246(class333 arg0) {
        this.field3361 = arg0;
    }

    static {
        new class157("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field3359 = -1;
        field3360 = new class10(6, 0, 4, 2);
    }
}
