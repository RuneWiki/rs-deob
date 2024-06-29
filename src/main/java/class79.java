import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class79 extends class212 {

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "[Lnj;")
    public class226[] field1186;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "Lqe;")
    public static class168 field1190 = class66.method448(" x ", 67);

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field1192 = 3353893;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "Lvb;")
    public static class251 field1188;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)Z")
    public final boolean method526(int arg0, byte arg1) {
        if (arg1 > -17) {
            method527(50);
        }
        field1187++;
        return this.field1186[arg0].field3858;
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
    public static void method527(int arg0) {
        field1190 = null;
        if (arg0 != 0) {
            field1191 = -66;
        }
        field1188 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Loe;Loe;IZ)V")
    public class79(class256 arg0, class256 arg1, int arg2, boolean arg3) {
        class47 var5 = new class47();
        int var6 = arg0.method1694(arg2, 28851);
        this.field1186 = new class226[var6];
        int[] var7 = arg0.method1704(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1712(var7[var8], arg2, -1);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class221 var11 = null;
            for (class221 var12 = (class221) var5.method315(-31594); var12 != null; var12 = (class221) var5.method312(1012)) {
                if (var12.field3800 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1710(var10, (byte) -35, 0);
                } else {
                    var13 = arg1.method1710(0, (byte) -35, var10);
                }
                var11 = new class221(var10, var13);
                var5.method311((byte) 16, var11);
            }
            this.field1186[var7[var8]] = new class226(var9, var11);
        }
    }
}
