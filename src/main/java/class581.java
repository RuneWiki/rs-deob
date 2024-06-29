import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class581 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "F")
    public static float field8363;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lkea;")
    public static class203 field8364;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lgh;")
    public static class476 field8365;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method3371(byte arg0) {
        field8365 = null;
        field8364 = null;
        int var1 = -83 / ((arg0 + 30) / 45);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)Lar;")
    public static final class594 method3372(boolean arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            return null;
        } else {
            field8367++;
            long var3 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
            return (class594) class194.field2581.method524((byte) 104, var3);
        }
    }
}
