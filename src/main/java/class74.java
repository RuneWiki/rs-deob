import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class74 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
    public static int[] field1068 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1071;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[[I")
    public static int[][] field1069;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)[Lcq;", line = 5)
    public static final class494[] method638(int arg0) {
        if (arg0 >= -33) {
            method639((byte) -54);
        }
        field1067++;
        return new class494[] { class121.field2190, class499.field6814, class194.field2959 };
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 25)
    public static final void method639(byte arg0) {
        field1070++;
        class616.field8586.method273(-28);
        if (arg0 > -38) {
            method638(10);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 36)
    public static void method640(int arg0) {
        field1068 = null;
        field1069 = null;
        if (arg0 > -53) {
            method640(18);
        }
        field1071 = null;
    }
}
