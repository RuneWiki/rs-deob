import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class159 {

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "Z")
    public static boolean field2149 = false;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "Lju;")
    public static class102 field2146 = new class102(67, -1);

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field2150 = 0;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILjm;)Ljava/lang/String;", line = 3)
    public static final String method995(int arg0, class6 arg1) {
        if (arg0 <= 48) {
            return null;
        }
        field2147++;
        if (arg1.field53 == null || arg1.field53.length() == 0) {
            return arg1.field50 == null || arg1.field50.length() <= 0 ? arg1.field51 : arg1.field51 + class138.field1868.method891(-2041650704, class369.field4721) + arg1.field50;
        } else if (arg1.field50 == null || arg1.field50.length() <= 0) {
            return arg1.field51 + class138.field1868.method891(-2041650704, class369.field4721) + arg1.field53;
        } else {
            return arg1.field51 + class138.field1868.method891(-2041650704, class369.field4721) + arg1.field50 + class138.field1868.method891(-2041650704, class369.field4721) + arg1.field53;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 33)
    public static void method996(int arg0) {
        field2146 = null;
        if (arg0 != -1) {
            field2146 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIZI)V", line = 43)
    public static final void method997(int arg0, int arg1, boolean arg2, int arg3) {
        field2148++;
        if (arg0 > -10) {
            method997(64, -102, true, -4);
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class379.field5336 = arg2;
        class757.field10509 = arg3;
        class602.field8612 = arg1;
    }
}
