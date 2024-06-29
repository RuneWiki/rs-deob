import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class556 {

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7800 = null;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7801 = new String[100];

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field7802 = 0;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "[I")
    public static int[] field7797;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "[[I")
    public static int[][] field7799;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static void method3158(int arg0) {
        field7800 = null;
        if (arg0 != 32) {
            field7800 = null;
        }
        field7801 = null;
        field7797 = null;
        field7799 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIBI)I")
    public static final int method3159(int arg0, int arg1, byte arg2, int arg3) {
        field7798++;
        if (class551.field7754 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class341.field4441;
        if (arg2 != -33) {
            return -59;
        }
        int var7 = arg1 - class341.field4442;
        for (class499 var8 = (class499) class341.field4421.method3111(102); var8 != null; var8 = (class499) class341.field4421.method3116(-96)) {
            if (var8.field7056 == arg3) {
                int var9 = var8.field7059;
                int var10 = var8.field7047;
                int var11 = class341.field4442 + var10 | class341.field4441 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }
}
