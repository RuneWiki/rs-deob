import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class478 extends class513 {

    @OriginalMember(owner = "client!oja", name = "i", descriptor = "Lada;")
    public class175 field6631;

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6629 = new String[100];

    @OriginalMember(owner = "client!oja", name = "h", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!oja", name = "j", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!oja", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6628;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)Z")
    public static final boolean method2839(boolean arg0) {
        if (arg0) {
            field6628 = null;
        }
        field6630++;
        if (class171.field2050) {
            try {
                class745.method4171("showVideoAd", class345.field4331, (byte) 94);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)V")
    public static void method2840(byte arg0) {
        int var1 = 79 / ((15 - arg0) / 42);
        field6628 = null;
        field6629 = null;
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lwg;II[B)V")
    public class478(class449 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6631 = arg0.method2653(arg2, -123, false, arg3, class205.field2451, arg1);
        this.field6631.method1198(false, false, (byte) -126);
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lwg;II[I)V")
    public class478(class449 arg0, int arg1, int arg2, int[] arg3) {
        this.field6631 = arg0.method2712(false, arg1, arg2, 0, arg3);
        this.field6631.method1198(false, false, (byte) 90);
    }
}
