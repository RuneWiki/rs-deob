import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class258 extends class184 {

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lada;")
    public class164 field3693 = new class164();

    @OriginalMember(owner = "client!se", name = "q", descriptor = "[I")
    public static int[] field3697 = new int[8];

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIBII)V", line = 6)
    public static final void method1683(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class63.field916.field10189.method2268(17503) != 0 && arg4 != 0 && class107.field1497 < 50 && arg2 != -1) {
            class282.field4007[class107.field1497++] = new class247((byte) 1, arg2, arg4, arg5, arg1, 0, arg0, null);
        }
        field3695++;
        if (arg3 > 0) {
            field3697 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 23)
    public static final String[] method1684(int arg0, String arg1, char arg2) {
        field3696++;
        int var3 = class251.method1656(arg2, arg1, 11);
        String[] var4 = new String[var3 + 1];
        if (arg0 != 3270) {
            return null;
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 59)
    public static final void method1685(int arg0) {
        if (arg0 != 50) {
            method1683(120, 105, -9, (byte) -25, -83, -53);
        }
        for (int var1 = 0; var1 < class627.field8770; var1++) {
            int var2 = class291.method1859(class627.field8770, (byte) -97, class386.field5833 + var1) * class73.field1021;
            for (int var3 = 0; var3 < class73.field1021; var3++) {
                int var4 = class291.method1859(class73.field1021, (byte) -97, var3 + class672.field9372) + var2;
                if (class564.field8028[var4] == class271.field3871) {
                    class302.field4293[var4].method1371(0, 0, class634.field8902, class437.field6477, class634.field8902 * var3, class437.field6477 * var1, true, true);
                }
            }
        }
        field3694++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 99)
    public static void method1686(byte arg0) {
        if (arg0 < -51) {
            field3697 = null;
        }
    }
}
