import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class498 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
    public static int[] field7257 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/lang/String;")
    public static String field7259 = "";

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field7251;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field7256;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lkea;")
    public static class203 field7254;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lxa;")
    public static class433 field7253;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lpc;")
    public static class585 field7255;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 3)
    public static void method2985(byte arg0) {
        field7259 = null;
        field7254 = null;
        if (arg0 != 59) {
            field7254 = null;
        }
        field7257 = null;
        field7255 = null;
        field7253 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method2986(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class461.field6877 = arg1;
        field7260++;
        if (arg2 == -18178) {
            class113.field1385 = arg0;
            class4.field43 = arg3;
            class418.field6298 = arg4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Ltca;", line = 43)
    public static final class150 method2987(boolean arg0) {
        field7252++;
        if (arg0) {
            return null;
        }
        try {
            return (class150) Class.forName("hs").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
