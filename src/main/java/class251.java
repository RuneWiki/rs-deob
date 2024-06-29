import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class251 extends class401 {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3424 = new String[100];

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public int[] field3427;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "[I")
    public int[] field3430;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "[I")
    public int[] field3432;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[Lkl;")
    public class70[] field3420;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[Lkl;")
    public class70[] field3429;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "[[[B")
    public byte[][][] field3431;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method1542(byte arg0) {
        class14.field146.method3749(7648);
        if (arg0 > 8) {
            field3421++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1543(String arg0, int arg1) {
        field3423++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = 63 % (-arg1 / 53);
        while (var2 < class165.field2390) {
            if (arg0.equalsIgnoreCase(class59.field663[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class281.field3845[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method1544(byte arg0) {
        field3424 = null;
        if (arg0 != -23) {
            field3424 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIILr;)V")
    public static final void method1545(int arg0, int arg1, int arg2, int arg3, int arg4, class166 arg5) {
        arg5.method200(arg3, arg2, arg3 + arg4, arg1 + arg2);
        field3422++;
        arg5.method1170(-16777216, arg1, arg3, arg4, arg2, -28207);
        if (class606.field8432 < 100) {
            return;
        }
        float var6 = (float) class510.field7013 / (float) class510.field7009;
        int var7 = arg4;
        int var8 = arg1;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg1 / var6);
        }
        int var9 = (arg4 - var7) / arg0 + arg3;
        int var10 = (arg1 - var8) / 2 + arg2;
        if (class527.field7149 == null || class527.field7149.method1658() != arg4 || arg1 != class527.field7149.method1653()) {
            class510.method2911(class510.field7003, class510.field7013 + class510.field7012, class510.field7003 - -class510.field7009, class510.field7012, var9, var10, var9 + var7, var8 + var10);
            class510.method2918(arg5);
            class527.field7149 = arg5.method156(var9, var10, var7, var8, false);
        }
        class527.field7149.method3927(var9, var10);
        int var11 = class609.field8460 * var7 / class510.field7009;
        int var12 = class495.field6743 * var8 / class510.field7013;
        int var13 = class250.field3417 * var7 / class510.field7009 + var9;
        int var14 = var10 + var8 - var12 - class627.field8688 * var8 / class510.field7013;
        int var15 = -1996554240;
        if (class704.field9959 == class219.field3065) {
            var15 = -1996488705;
        }
        arg5.method110(var13, var14, var11, var12, var15, 1);
        arg5.method190(var13, var14, var11, var12, var15, 0);
        if (class657.field9137 <= 0) {
            return;
        }
        int var16;
        if (class593.field8304 > 50) {
            var16 = (100 - class593.field8304) * 5;
        } else {
            var16 = class593.field8304 * 5;
        }
        for (class163 var17 = (class163) class510.field6985.method1436(28964); var17 != null; var17 = (class163) class510.field6985.method1443((byte) 6)) {
            class165 var18 = class510.field6981.method3709((byte) 86, var17.field2338);
            if (class107.method779((byte) 13, var18)) {
                if (class496.field6752 == var17.field2338) {
                    int var19 = var9 + (var17.field2344 * var7 / class510.field7009);
                    int var20 = (class510.field7013 - var17.field2343) * var8 / class510.field7013 + var10;
                    arg5.method1170(var16 << 24 | 0xFFFF00, 4, var19 - 2, 4, var20 - 2, -28207);
                } else if (class675.field9530 != -1 && class675.field9530 == var18.field2409) {
                    int var21 = var17.field2344 * var7 / class510.field7009 + var9;
                    int var22 = var10 + ((class510.field7013 - var17.field2343) * var8 / class510.field7013);
                    arg5.method1170(var16 << 24 | 0xFFFF00, 4, var21 - 2, 4, var22 - 2, -28207);
                }
            }
        }
    }
}
