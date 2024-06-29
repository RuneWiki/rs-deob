import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class221 extends class107 {

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[S")
    public static short[] field3281 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Lri;")
    public static class73 field3280 = new class73(75, -2);

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "F")
    public static float field3285;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class221(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)V", line = 7)
    public static void method1524(int arg0) {
        if (arg0 != 38) {
            method1525(-46);
        }
        field3280 = null;
        field3281 = null;
    }

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)Z", line = 28)
    public static final boolean method1525(int arg0) {
        if (arg0 != 0) {
            method1525(30);
        }
        ++field3282;
        if (class186.field2765) {
            try {
                if ((Boolean) class501.method2995("showingVideoAd", (byte) 86, class483.field7077.field6462)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V", line = 48)
    public final void method657(int arg0, int arg1, int arg2, int arg3) {
        super.field1542 = arg3;
        super.field1537 = arg1;
        super.field1541 = arg2;
        int var5 = -107 / ((64 - arg0) / 62);
        ++field3279;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(FB)V", line = 63)
    public final void method659(float arg0, byte arg1) {
        super.field1534 = arg0;
        if (arg1 != -9) {
            method1524(78);
        }
        ++field3283;
    }
}
