import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class111 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1573 = -50;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Luia;")
    public static class272 field1570 = new class272();

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lgr;")
    public static class530 field1574 = new class530(13, 8);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "F")
    public static float field1571;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lqs;Z)V", line = 11)
    public static final void method809(class603 arg0, boolean arg1) {
        arg0.field8541 = null;
        field1572++;
        if (!arg1) {
            field1574 = null;
        }
        int var2 = arg0.field8543.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field8543[var3].field5409 = false;
        }
        class215[] var4 = class308.field4178;
        synchronized (class308.field4178) {
            if (var2 < class308.field4178.length && class372.field5405[var2] < 200) {
                class308.field4178[var2].method1521(arg0, -24256);
                int var10002 = class372.field5405[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 40)
    public static void method810(int arg0) {
        if (arg0 != -50) {
            field1573 = 125;
        }
        field1570 = null;
        field1574 = null;
    }
}
