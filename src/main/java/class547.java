import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class547 extends class361 {

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "B")
    public byte field7803 = 5;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "Lwq;")
    public static class168 field7807 = new class168();

    @OriginalMember(owner = "client!kga", name = "F", descriptor = "Ljg;")
    public static class340 field7811 = new class340();

    @OriginalMember(owner = "client!kga", name = "G", descriptor = "[I")
    public static int[] field7812 = new int[25];

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "[I")
    public static int[] field7813 = new int[13];

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "Ldi;")
    public static class127 field7814 = new class127(true);

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "Lqe;")
    public static class469 field7815 = new class469(27, 4);

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "F")
    public static float field7805;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
    public int field7800;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public int field7801;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "I")
    public int field7804;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    public int field7806;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    public int field7808;

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "I")
    public int field7810;

    @OriginalMember(owner = "client!kga", name = "K", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "Z")
    public boolean field7809;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)V")
    public static void method3198(int arg0) {
        field7814 = null;
        field7812 = null;
        field7815 = null;
        int var1 = 61 / ((6 - arg0) / 37);
        field7807 = null;
        field7813 = null;
        field7811 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    public static final void method3199(boolean arg0) {
        field7802++;
        if (class633.field8862 < 0) {
            class270.field3860 = -1;
            class190.field2880 = -1;
            class633.field8862 = 0;
        }
        if (class633.field8862 > class84.field1204) {
            class633.field8862 = class84.field1204;
            class270.field3860 = -1;
            class190.field2880 = -1;
        }
        if (client.field4272 < 0) {
            class190.field2880 = -1;
            client.field4272 = 0;
            class270.field3860 = -1;
        }
        if (!arg0) {
            method3198(-79);
        }
        if (class84.field1198 < client.field4272) {
            class190.field2880 = -1;
            class270.field3860 = -1;
            client.field4272 = class84.field1198;
        }
    }
}
