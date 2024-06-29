import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class427 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
    public static int[] field6090 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 3)
    public static void method2666(int arg0) {
        field6090 = null;
        if (arg0 != 24512) {
            field6090 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBIZI)V", line = 13)
    public static final void method2667(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        field6091++;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg1);
        class101 var8 = (class101) class64.field885.method1373(var6, 118);
        if (var8 == null) {
            var8 = new class101();
            class64.field885.method1376(var8, var6, 88);
        }
        int var9 = -106 / ((arg2 + 78) / 41);
        if (var8.field1277.length <= arg5) {
            int[] var10 = new int[arg5 + 1];
            int[] var11 = new int[arg5 + 1];
            for (int var12 = 0; var12 < var8.field1277.length; var12++) {
                var10[var12] = var8.field1277[var12];
                var11[var12] = var8.field1280[var12];
            }
            for (int var13 = var8.field1277.length; var13 < arg5; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var8.field1277 = var10;
            var8.field1280 = var11;
        }
        var8.field1277[arg5] = arg0;
        var8.field1280[arg5] = arg3;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIBII)V", line = 72)
    public static final void method2668(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class329.field4771 = arg6;
        class129.field1826 = arg2;
        class278.field3992 = arg5;
        class433.field6193 = arg0;
        if (arg4 <= 117) {
            method2667(72, -96, (byte) 99, -112, false, -2);
        }
        class52.field669 = arg1;
        field6089++;
        class83.field1066 = arg3;
    }
}
