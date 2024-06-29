import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Ljf;")
    public static class229 field1377 = class212.method1457((byte) 99, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Ljf;")
    public static class229 field1380 = class212.method1457((byte) 87, "::cardmem");

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Ljf;")
    public static class229 field1382 = class212.method1457((byte) 106, ")3)3)3");

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lhg;")
    public class174 field1383;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lrm;")
    public class248 field1384;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 6)
    public static void method530(int arg0) {
        field1377 = null;
        field1382 = null;
        if (arg0 == -31454) {
            field1380 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILek;)I", line = 25)
    public static final int method531(int arg0, class185 arg1) {
        field1376++;
        int var2 = 37 % ((arg0 + 16) / 50);
        int var3 = 0;
        if (arg1.method1289(class169.field2923, -95)) {
            var3++;
        }
        if (arg1.method1289(class183.field3172, -123)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(FIBIIIIZ)[I", line = 48)
    public static final int[] method532(float arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1378++;
        int[] var8 = new int[arg5];
        class80 var9 = new class80();
        var9.field1455 = arg7;
        var9.field1450 = arg6;
        var9.field1448 = (int) (arg0 * 4096.0F);
        if (arg2 > -48) {
            return (int[]) null;
        }
        var9.field1459 = arg4;
        var9.field1449 = arg1;
        var9.field1451 = arg3;
        var9.method25(-8);
        class328.method2216(arg5, 1, (byte) -32);
        var9.method569(0, var8, 263904844);
        return var8;
    }
}
