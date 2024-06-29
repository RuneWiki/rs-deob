import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class73 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1190 = "Loaded sprites";

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[Z")
    public static boolean[] field1193 = new boolean[112];

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1198 = "Loading world list data";

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[I")
    public static int[] field1197;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIBI)V")
    public static final void method517(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class255.field4055 <= (arg2 - arg4) && (arg2 + arg4) <= class9.field128 && class161.field2561 <= (arg1 - arg4) && (arg1 + arg4) <= class51.field896) {
            class210.method1451(false, arg4, arg0, arg2, arg1);
        } else {
            class199.method1348(true, arg2, arg1, arg0, arg4);
        }
        field1189++;
        int var5 = -16 / ((arg3 - 27) / 60);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg3 - arg4;
        int var10 = arg8 - arg0;
        field1195++;
        int var11 = (arg1 - arg5 << 16) / var9;
        int var12 = (arg2 - arg6 << 16) / var10;
        class11.method81(arg8, 0, false, arg4, var12, var11, arg3, arg6, arg0, arg5, 0);
        if (arg7 >= -105) {
            field1190 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method519(boolean arg0) {
        field1197 = null;
        if (arg0) {
            field1197 = null;
        }
        field1193 = null;
        field1190 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)Lgi;")
    public static final class156 method520(byte arg0) {
        field1191++;
        try {
            int var1 = 51 / ((arg0 - 44) / 58);
            return (class156) Class.forName("qb").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class52();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)Lml;")
    public static final class289 method521(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2151; var4++) {
            class289 var5 = var3.field2153[var4];
            if ((var5.field4574 >> 29 & 0x3L) == 2L && var5.field4567 == arg1 && var5.field4575 == arg2) {
                class263.method1787(var5);
                return var5;
            }
        }
        return null;
    }
}
