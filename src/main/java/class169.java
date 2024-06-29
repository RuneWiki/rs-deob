import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class169 extends class112 {

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "[Lob;")
    public class177[] field2759;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "[I")
    public static int[] field2760 = new int[32];

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1212(int arg0) {
        if (arg0 != -30113) {
            field2760 = null;
        }
        field2760 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)Z")
    public final boolean method1213(int arg0, byte arg1) {
        if (arg1 != 14) {
            field2760 = null;
        }
        field2765++;
        return this.field2759[arg0].field2947;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
    public final boolean method1214(int arg0, int arg1) {
        if (arg1 < 83) {
            field2762 = -12;
        }
        field2764++;
        return this.field2759[arg0].field2959;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lsb;Lsb;IZ)V")
    public class169(class124 arg0, class124 arg1, int arg2, boolean arg3) {
        class266 var5 = new class266();
        int var6 = arg0.method891(0, arg2);
        this.field2759 = new class177[var6];
        int[] var7 = arg0.method910(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method900(arg2, var7[var8], false);
            class111 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class111 var12 = (class111) var5.method1807(-95); var12 != null; var12 = (class111) var5.method1808((byte) 30)) {
                if (var12.field1714 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method892(var11, 0, 97);
                } else {
                    var13 = arg1.method892(0, var11, -15);
                }
                var10 = new class111(var11, var13);
                var5.method1809(5, var10);
            }
            this.field2759[var7[var8]] = new class177(var9, var10);
        }
    }
}
