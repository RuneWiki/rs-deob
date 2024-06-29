import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class35 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static volatile int field413 = 0;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Z")
    public static boolean field418 = false;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Ldh;")
    public static class179 field415 = new class179(64);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lsm;")
    public static class167 field419;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
    public static int[] field412;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field416;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 7)
    public static void method207(boolean arg0) {
        field419 = null;
        field415 = null;
        field412 = null;
        field416 = null;
        if (arg0) {
            field418 = true;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIII)V", line = 22)
    public static final void method208(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field414++;
        class84.field1075 = 0L;
        int var5 = client.method1954(true);
        boolean var6 = false;
        if (arg1 <= 0 == var5 > 0) {
            var6 = true;
        }
        if (arg4 != 26332) {
            return;
        }
        if (arg1 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class265.field4172.startsWith("mac") && arg1 > 0) {
            arg0 = true;
        }
        if (arg0 && arg1 > 0) {
            var6 = true;
        }
        class260.method1875(var6, arg0, arg3, var5, arg2, (byte) -113, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z", line = 71)
    public static final boolean method209(byte arg0) {
        if (arg0 != 34) {
            method208(true, -63, 23, -113, 49);
        }
        field420++;
        if (class89.field1119) {
            try {
                return !(Boolean) class122.method824(class9.field131.field4179, 25315, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
