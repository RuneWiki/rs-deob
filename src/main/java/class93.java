import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class93 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field1370 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1369 = Calendar.getInstance();

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method662(boolean arg0) {
        field1368++;
        if (arg0) {
            field1374 = -12;
        }
        class107.field1512.method131(-2);
        class112.field1597.method131(-2);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLlh;Llh;)V", line = 20)
    public static final void method663(byte arg0, class59 arg1, class59 arg2) {
        field1372++;
        if (arg2.field856 != null) {
            arg2.method418(6971);
        }
        arg2.field841 = arg1;
        arg2.field856 = arg1.field856;
        arg2.field856.field841 = arg2;
        arg2.field841.field856 = arg2;
        int var3 = 48 / ((arg0 + 47) / 61);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 41)
    public static void method664(int arg0) {
        if (arg0 != 1) {
            method662(false);
        }
        field1370 = null;
        field1369 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)Z", line = 74)
    public static final boolean method665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class286.field4659 * arg0 + class128.field1905 * arg3 >> 16;
        int var6 = class286.field4659 * arg3 - class128.field1905 * arg0 >> 16;
        int var7 = class196.field3162 * arg1 + class178.field2885 * var6 >> 16;
        int var8 = class178.field2885 * arg1 - class196.field3162 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class196.field3162 * arg2 + class178.field2885 * var6 >> 16;
        int var12 = class178.field2885 * arg2 - class196.field3162 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class174.field2826 && var13 < class174.field2826) {
            return false;
        } else if (var9 > class22.field327 && var13 > class22.field327) {
            return false;
        } else if (var10 < class302.field5003 && var14 < class302.field5003) {
            return false;
        } else {
            return var10 <= class50.field760 || var14 <= class50.field760;
        }
    }
}
