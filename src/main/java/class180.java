import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class180 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
    public static int[] field3538 = new int[2000];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    public static int[] field3540 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lob;")
    public static class141 field3539 = class175.method1195(40, "mapflag");

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
    public static boolean field3537 = false;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lob;")
    private static class141 field3536 = class175.method1195(40, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lob;")
    public static class141 field3545 = class175.method1195(40, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lob;")
    public static class141 field3543 = field3536;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[Lvf;")
    public static class215[] field3541;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBII[I)V")
    public static final void method1217(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 != 52) {
            return;
        }
        arg2--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg2 = var13 + 1;
            arg4[arg2] = arg3;
        }
        while (arg2 < var6) {
            arg2++;
            arg4[arg2] = arg3;
        }
        field3546++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1218(int arg0) {
        field3545 = null;
        field3541 = null;
        field3538 = null;
        field3539 = null;
        int var1 = -31 / ((-arg0 - 13) / 62);
        field3536 = null;
        field3543 = null;
        field3540 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method1219(byte arg0) {
        if (arg0 != 94) {
            return;
        }
        field3544++;
        for (class66 var1 = (class66) class216.field4115.method1103((byte) -9); var1 != null; var1 = (class66) class216.field4115.method1106((byte) 95)) {
            if (var1.field1291 > 0) {
                var1.field1291--;
            }
            if (var1.field1291 != 0) {
                if (var1.field1271 > 0) {
                    var1.field1271--;
                }
                if (var1.field1271 == 0 && var1.field1285 >= 1 && var1.field1290 >= 1 && var1.field1285 <= 102 && var1.field1290 <= 102 && (var1.field1277 < 0 || class85.method579(23616, var1.field1272, var1.field1277))) {
                    class142.method939(var1.field1272, var1.field1292, var1.field1293, var1.field1285, var1.field1276, false, var1.field1277, var1.field1290);
                    var1.field1271 = -1;
                    if (var1.field1277 == var1.field1270 && var1.field1270 == -1) {
                        var1.method1392(128);
                    } else if (var1.field1277 == var1.field1270 && var1.field1293 == var1.field1284 && var1.field1288 == var1.field1272) {
                        var1.method1392(128);
                    }
                }
            } else if (var1.field1270 < 0 || class85.method579(23616, var1.field1288, var1.field1270)) {
                class142.method939(var1.field1288, var1.field1292, var1.field1284, var1.field1285, var1.field1276, false, var1.field1270, var1.field1290);
                var1.method1392(128);
            }
        }
    }
}
