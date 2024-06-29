import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class230 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lpm;")
    public static class349 field3404 = new class349("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field3406 = -50;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lcn;")
    public static class301 field3405 = new class301();

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
    public static float field3407;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    public static final void method1595(int arg0, int arg1) {
        if (arg0 > -29) {
            method1597((byte[][]) null, 57, (byte[][]) null, -50, (byte[]) null, (int[]) null, -35, (int[]) null);
        }
        field3403++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class96.field1230 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1596(int arg0) {
        int var1 = 103 / ((-arg0 - 41) / 36);
        field3405 = null;
        field3404 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([[BI[[BI[B[II[I)I")
    public static final int method1597(byte[][] arg0, int arg1, byte[][] arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int[] arg7) {
        field3401++;
        int var8 = arg5[arg3];
        int var9 = arg7[arg3] + var8;
        int var10 = arg5[arg1];
        int var11 = arg7[arg1] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg3] & 0xFF;
        if (var14 > (arg4[arg1] & 0xFF)) {
            var14 = arg4[arg1] & 0xFF;
        }
        byte[] var15 = arg2[arg3];
        byte[] var16 = arg0[arg1];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        if (arg6 < 62) {
            field3406 = -33;
        }
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lhl;IIIBIILhl;II)V")
    public static final void method1598(class311 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class311 arg7, int arg8, int arg9) {
        field3402++;
        int var10 = arg0.method778((byte) 121);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class256 var12 = (class256) class357.field5163.method99(true, (long) var10);
        if (var12 == null) {
            class337[] var13 = class337.method2215(class15.field216, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class59.field786.method870(var13[0], true);
            class357.field5163.method90(var12, (long) var10, 0);
        }
        class356.method2328(arg7.field4466, arg1 >> 1, arg7.field4463, 0, arg9 >> 1, arg7.method773((byte) 62) * 64, -127, arg2, arg6);
        int var14 = arg5 + class212.field3004[0] - 18;
        int var15 = class212.field3004[1] + arg3 - 54 - 16;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method1772(var16, var17);
        if (arg0 == arg7) {
            class59.field786.method1837(var17 - 1, 18, 18, -256, (byte) -106, var16 - 1);
        }
        class117 var18 = class150.method1119((byte) -70);
        var18.field1586 = var17;
        var18.field1590 = var16 + 16;
        var18.field1584 = var17 + 16;
        var18.field1587 = arg0;
        var18.field1589 = var16;
        class288.field4198.method1076(116, var18);
        if (arg4 != 13) {
            method1595(-56, 14);
        }
    }
}
