import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class242 extends class26 {

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field3501 = 0;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3509 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field3508 = 0;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field3513 = 0;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "[I")
    public static int[] field3512 = new int[14];

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[I")
    public int[] field3502;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "[I")
    public int[] field3506;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "[I")
    public int[] field3514;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "[Lvk;")
    public class188[] field3505;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[Lvk;")
    public class188[] field3511;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "[Ll;")
    public static class283[] field3504;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "[[[B")
    public byte[][][] field3500;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 12)
    public static void method1717(int arg0) {
        field3509 = null;
        field3504 = null;
        if (arg0 != 0) {
            method1717(19);
        }
        field3512 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 34)
    public static final void method1718(boolean arg0) {
        for (class96 var1 = (class96) class264.field3831.method413(1253231568); var1 != null; var1 = (class96) class264.field3831.method419(118)) {
            if (var1.field1264) {
                var1.method693(-123);
            }
        }
        if (arg0) {
            field3509 = (String[]) null;
        }
        field3510++;
        for (class96 var2 = (class96) class343.field5336.method413(1253231568); var2 != null; var2 = (class96) class343.field5336.method419(65)) {
            if (var2.field1264) {
                var2.method693(-121);
            }
        }
    }
}
