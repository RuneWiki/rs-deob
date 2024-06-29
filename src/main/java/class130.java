import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class130 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
    public static boolean field1934 = false;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Ljava/lang/Object;")
    public static volatile Object field1935 = null;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "[F")
    public static float[] field1933 = new float[4];

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1936 = 1408;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BF)F", line = 22)
    public static final float method1045(byte arg0, float arg1) {
        field1937++;
        if (arg0 != -6) {
            field1934 = false;
        }
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 34)
    public static void method1046(int arg0) {
        field1935 = null;
        if (arg0 != 6) {
            method1046(72);
        }
        field1933 = null;
    }
}
