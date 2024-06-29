import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class220 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public static int[] field3512 = new int[32];

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3513 = new String[8];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field3519 = 0;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Ljava/lang/String;")
    public String field3516;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method1459(boolean arg0) {
        if (arg0) {
            method1463(-104);
        }
        field3512 = null;
        field3513 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public static final void method1460(int arg0, int arg1, int arg2) {
        field3520++;
        class283 var3 = class46.method360(arg2, -94, arg1);
        var3.method1893(0);
        var3.field4528 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)I")
    public static final int method1461(int arg0, int arg1, int arg2, int arg3) {
        field3518++;
        if (class229.field3641 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        int var7 = arg0 & 0x7F;
        if (arg1 < 3 && (class134.field2251[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class229.field3641[var6][var4][var5] + class229.field3641[var6][var4 + 1][var5] * var7 >> 7;
        if (arg3 <= 13) {
            method1463(108);
        }
        int var10 = (128 - var7) * class229.field3641[var6][var4][var5 + 1] + class229.field3641[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)Lrj;")
    public static final class16 method1462(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class16 var4 = var3.field1491;
            var3.field1491 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public static final int method1463(int arg0) {
        if (arg0 != 0) {
            return -40;
        }
        field3515++;
        if (class239.field3828) {
            return 0;
        } else if (class200.method1349(false)) {
            return class38.field468 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
