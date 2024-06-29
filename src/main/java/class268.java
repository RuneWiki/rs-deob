import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class268 {

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "Lqs;")
    public static class559 field4040 = new class559();

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Lbga;")
    public static class324 field4044;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "Lbd;")
    public static class56 field4039;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)I")
    public static final int method1748(int arg0, byte arg1) {
        field4042++;
        int var2 = -91 / ((arg1 - 22) / 37);
        return arg0 == 16711935 ? -1 : class647.method3591(arg0, -30824);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static void method1749(int arg0) {
        if (arg0 == -1350933182) {
            field4044 = null;
            field4039 = null;
            field4040 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public static final void method1750(byte arg0) {
        class512.field7202.method132(((float) class287.field4270.field3725 * 0.1F + 0.7F) * class487.field6927);
        int var1 = 36 / ((-arg0 - 49) / 34);
        field4043++;
        class512.field7202.method185(class139.field2041, class393.field5823, class267.field4033, (float) (class585.field8199 << 2), (float) (class401.field5906 << 2), (float) (class258.field3941 << 2));
        class512.field7202.method116(class207.field2908);
    }

    @OriginalMember(owner = "client!nba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4038++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)Z")
    public static final boolean method1751(int arg0) {
        field4037++;
        try {
            if (class313.field4623 == 2) {
                if (class294.field4326 == null) {
                    class294.field4326 = class280.method1824(class208.field2929, class594.field8392, class685.field9652);
                    if (class294.field4326 == null) {
                        return false;
                    }
                }
                if (class390.field5781 == null) {
                    class390.field5781 = new class628(class563.field7922, class286.field4266);
                }
                if (class323.field4762.method401(true, class390.field5781, class495.field7032, 22050, class294.field4326)) {
                    class323.field4762.method412((byte) 127);
                    if (class676.field9576 > 0) {
                        class313.field4623 = 3;
                        class323.field4762.method402(0, (byte) -91);
                    } else {
                        class313.field4623 = 0;
                        class323.field4762.method402(class596.field8425, (byte) -91);
                    }
                    if (class196.field2800 > 0L) {
                        class323.field4762.method415(class666.field9405, 16, class196.field2800, true, class294.field4326);
                    } else {
                        class323.field4762.method405(128, class294.field4326, class666.field9405);
                    }
                    class196.field2800 = 0L;
                    class294.field4326 = null;
                    class208.field2929 = null;
                    class390.field5781 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class323.field4762.method395((byte) 127);
            class313.field4623 = 0;
            class208.field2929 = null;
            class294.field4326 = null;
            class390.field5781 = null;
        }
        return arg0 != 3;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
    public static final void method1752(int arg0, int arg1, int arg2) {
        field4041++;
        class191 var3 = class6.method38(1, -79, arg1);
        if (arg2 != 0) {
            method1748(-16, (byte) -2);
        }
        var3.method1285((byte) -1);
        var3.field2754 = arg0;
    }
}
