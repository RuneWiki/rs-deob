import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class79 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1340 = -1;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Le;")
    public static class191 field1347 = class54.method368("headicons_pk", 2047);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Le;")
    public static class191 field1348 = null;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[I")
    public static int[] field1338 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1350 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[Lc;")
    public static class60[] field1355;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[[[B")
    public static byte[][][] field1342;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1342 = null;
        field1338 = null;
        if (arg0 > -13) {
            field1348 = null;
        }
        field1347 = null;
        field1355 = null;
        field1348 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Ltc;")
    public static final class126 method513(int arg0, int arg1) {
        field1354++;
        class126 var2 = (class126) class54.field1005.method991((long) arg1, -25858);
        if (arg0 != -17500) {
            field1355 = null;
        }
        if (var2 != null) {
            return var2;
        }
        class126 var3 = class201.method1409(class167.field2814, true, arg1, false, class8.field77);
        if (var3 != null) {
            class54.field1005.method987(var3, (long) arg1, arg0 + 15062);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIB)V")
    public static final void method514(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class34 var5 = (class34) class91.field1475.method612((long) arg2, true);
        field1349++;
        if (var5 == null) {
            var5 = new class34();
            class91.field1475.method605((long) arg2, -3, var5);
        }
        if (var5.field634.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field634.length; var8++) {
                var7[var8] = var5.field634[var8];
                var6[var8] = var5.field638[var8];
            }
            for (int var9 = var5.field634.length; var9 < arg0; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field638 = var6;
            var5.field634 = var7;
        }
        var5.field634[arg0] = arg3;
        var5.field638[arg0] = arg1;
        if (arg4 <= 0) {
            field1348 = null;
        }
    }
}
