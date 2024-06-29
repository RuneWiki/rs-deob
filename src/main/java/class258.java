import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class258 {

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public int field3708 = -1;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Lvh;")
    public static class125 field3699 = new class125(7, 6);

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Lkq;")
    public static class696 field3707 = new class696(0, 1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 8)
    public static void method1640(int arg0) {
        if (arg0 == 1314470024) {
            field3699 = null;
            field3707 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBI)V", line = 25)
    public static final void method1641(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class525.field7713.field5991 * arg1 >> 8;
        field3703++;
        if (var4 != 0 && arg0 != -1) {
            if (!class369.field5120 && class283.field3963 != -1 && class154.method1162((byte) 47)) {
                class453.field6518 = class688.method3879(60);
                class295 var5 = class236.method1544(-26634, class453.field6518);
                class23.method219(true, var5, (byte) 10);
            }
            class513.method3050(arg0, class418.field5944, var4, 0, 0, false);
            class29.method273(255, -1, -9873);
            class369.field5120 = true;
        }
        int var6 = -106 / ((arg2 + 28) / 57);
    }
}
