import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class81 extends class327 {

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public int field1443 = (int) (class508.method2860(false) / 1000L);

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "S")
    public short field1439;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Ljava/lang/String;")
    public String field1442;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "[F")
    public static float[] field1441 = new float[4];

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "Lm;")
    public static class105 field1444;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)Z", line = 6)
    public static final boolean method750(int arg0, int arg1, boolean arg2) {
        field1440++;
        if (!arg2) {
            field1441 = null;
        }
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 27)
    public class81(String arg0, int arg1) {
        this.field1439 = (short) arg1;
        this.field1442 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V", line = 40)
    public static void method751(int arg0) {
        field1441 = null;
        field1444 = null;
        if (arg0 != 1408) {
            method751(-51);
        }
    }
}
