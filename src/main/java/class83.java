import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class83 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[[BLtga;)V")
    public static final void method593(byte arg0, byte[][] arg1, class258 arg2) {
        field1183++;
        if (arg0 != 96) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class63 var11 = new class63(var10);
                int var12 = class316.field4364[var5] >> 8;
                int var13 = class316.field4364[var5] & 0xFF;
                int var14 = var12 * 64 - class113.field1509;
                int var15 = var13 * 64 - class587.field7995;
                class11.method51(98);
                arg2.method2399((byte) 101, var14, class587.field7995, var11, var15, class113.field1509, class209.field2735);
                arg2.method1740(var15, var3, class129.field1802, var11, var14, (byte) -68);
                if (!arg2.field5485 && class338.field4749 / 8 == var12 && class48.field727 / 8 == var13 && var3[0] != -1) {
                    class359.field5138 = class463.field6453.method3339(var3[1], class560.field7796, var3[2], (byte) -107, var3[0], var3[3]);
                    class456.field6323 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class316.field4364[var6] >> 8) * 64 - class113.field1509;
            int var8 = (class316.field4364[var6] & 0xFF) * 64 - class587.field7995;
            byte[] var9 = arg1[var6];
            if (var9 == null && class48.field727 < 800) {
                class11.method51(92);
                arg2.method2389(64, -26215, 64, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lcea;BBII)V")
    public static final void method594(class96 arg0, byte arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -126) {
            method593((byte) 21, null, null);
        }
        field1182++;
        int var5 = arg0.field7197[0];
        int var6 = arg0.field7198[0];
        if (var5 < 0 || class277.field4036 <= var5 || var6 < 0 || var6 >= class667.field9202 || arg3 < 0 || class277.field4036 <= arg3 || arg4 < 0 || arg4 >= class667.field9202) {
            return;
        }
        int var7 = class197.method1210((byte) -75, class209.field2735[arg0.field4408], 0, arg0.method662((byte) 15), -4, class676.field9377, arg4, var5, 0, 0, arg3, class534.field7410, var6, true, 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method647(arg1, (byte) -124, class534.field7410[var8], class676.field9377[var8]);
            }
        }
    }
}
