import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class265 extends class273 {

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "J")
    public static long field4231 = 0L;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4230 = "wave:";

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field4236 = 0;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "[I")
    public static int[] field4233 = new int[14];

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field4240 = -1;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "Lhi;")
    public static class25 field4239;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "[I")
    public static int[] field4234;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[Lkj;")
    public static class114[] field4232;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)I")
    public static final int method1804(byte arg0, int arg1) {
        field4238++;
        if (arg0 != -105) {
            method1806((byte) -108, 77);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        field4239 = null;
        field4230 = null;
        field4234 = null;
        field4232 = null;
        field4233 = null;
        if (arg0 > -122) {
            method1806((byte) -107, 92);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            field4231 = -113L;
        }
        field4235++;
        return field4234;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(BI)V")
    public static final void method1806(byte arg0, int arg1) {
        field4237++;
        class146 var2 = class67.field1137.method1062(-119);
        if (arg0 >= -38) {
            field4232 = null;
        }
        while (var2 != null) {
            if ((var2.field2406 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method1074((byte) 7);
            }
            var2 = class67.field1137.method1059(-14608);
        }
    }
}
