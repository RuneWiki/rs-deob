import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lfja;")
    public static class783 field2176 = new class783(112, -2);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "J")
    public static long field2177;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lnf;")
    public static class604 field2181;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[S")
    public static short[] field2182;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class111.field1911.field6762.method925((byte) 93) != 0 && arg6 != 0 && class57.field806 < 50 && arg3 != -1) {
            class531.field7189[class57.field806++] = new class481((byte) 1, arg3, arg6, arg5, arg4, arg2, arg1, null);
        }
        if (arg0 == -6732) {
            field2179++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class609.field8510 = arg4;
        class412.field5654 = arg3;
        if (arg2 <= -9) {
            field2178++;
            class434.field5903 = arg0;
            class398.field5482 = arg1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Z", line = 42)
    public static final boolean method1051(int arg0) {
        field2180++;
        if (class740.field10206) {
            try {
                if ((Boolean) class729.method4044(class286.field3936, 26693, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 <= 2) {
            field2181 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 61)
    public static void method1052(int arg0) {
        field2176 = null;
        if (arg0 >= -92) {
            method1051(-50);
        }
        field2182 = null;
        field2181 = null;
    }
}
