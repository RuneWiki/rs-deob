import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class463 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Z")
    public static boolean field6506 = false;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lkn;")
    public static class737 field6505 = new class737(13, -1);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6508 = new String[100];

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lej;")
    public static class124 field6509 = new class124(35, 5);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6510 = "";

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[I")
    public static int[] field6511 = new int[25];

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lin;")
    public static class91 field6504;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 4)
    public static void method2733(int arg0) {
        field6504 = null;
        field6505 = null;
        field6508 = null;
        field6511 = null;
        field6510 = null;
        field6509 = null;
        if (arg0 != 25) {
            field6509 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 19)
    public static final void method2734(int arg0) {
        field6507++;
        int var1 = class219.field3167;
        int[] var2 = class87.field1561;
        for (int var3 = 0; var3 < var1; var3++) {
            class598 var9 = class49.field1040[var2[var3]];
            if (var9 != null && var9.field5690 > 0) {
                var9.field5690--;
                if (var9.field5690 == 0) {
                    var9.field5718 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class738.field9939; var4++) {
            long var5 = (long) class737.field9925[var4];
            class751 var7 = (class751) class86.field1546.method1465(var5, -6008);
            if (var7 != null) {
                class9 var8 = var7.field10510;
                if (var8.field5690 > 0) {
                    var8.field5690--;
                    if (var8.field5690 == 0) {
                        var8.field5718 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIFFIFIFII[F)V")
    public abstract void method2694(int arg0, int arg1, float arg2, float arg3, int arg4, float arg5, int arg6, float arg7, int arg8, int arg9, float[] arg10);
}
