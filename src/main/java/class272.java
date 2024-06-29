import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class272 implements class444 {

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lfe;")
    public class345 field3822;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Lmp;")
    public class565 field3828;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lin;")
    public static class380 field3818 = new class380(94, 0);

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
    public static boolean field3827 = false;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lsv;")
    public static class570 field3825 = new class570(45, 15);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lgga;")
    public static class513 field3829;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Lhl;")
    public class353 method327(byte arg0) {
        if (arg0 <= 51) {
            this.field3820 = 102;
        }
        field3819++;
        return class119.field2042;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLha;)V")
    public static final void method1736(byte arg0, class475 arg1) {
        field3824++;
        int var2 = 0;
        int var3 = 0;
        if (class593.field8489) {
            var2 = class45.method342(false);
            var3 = class87.method771(-2);
        }
        int var4 = class295.field4297 + var2;
        int var5 = class389.field5438 + var3;
        int var6 = -55 % ((arg0 + 78) / 34);
        int var7 = class414.field5678;
        int var8 = class72.field1137 - 3;
        byte var9 = 20;
        class521.method3059((byte) -41, class72.field1137, arg1, class414.field5678, class295.field4297 + var2, class563.field7822.method3281(class423.field5892, -1), class389.field5438 + var3, var9);
        int var10 = var2 + class754.field10496.method3065(-28062);
        int var11 = var3 + class754.field10496.method3066(72);
        if (class791.field10833) {
            int var15 = 0;
            for (class551 var16 = (class551) class496.field6807.method249(18371); var16 != null; var16 = (class551) class496.field6807.method254((byte) -64)) {
                int var29 = var15 * 16 + var5 + var9 + 13;
                if (class295.field4297 + var2 < var10 && (class295.field4297 + var2 + class414.field5678) > var10 && var11 > var29 - 13 && var29 + 4 > var11 && (var16.field7643 > 1 || ((class554) var16.field7645.field332.field6213).field7695)) {
                    arg1.method436(class295.field4297 + var2, var29 + -12, class414.field5678, 16, 255 - class414.field5688 << 24 | class514.field7088, 1);
                }
                var15++;
            }
            if (class346.field4933 != null) {
                class521.method3059((byte) -34, class778.field10681, arg1, class362.field5138, class653.field9248, class346.field4933.field7652, class541.field7494, var9);
                int var17 = 0;
                for (class554 var18 = (class554) class346.field4933.field7645.method249(18371); var18 != null; var18 = (class554) class346.field4933.field7645.method254((byte) -64)) {
                    int var19 = var17 * 16 + class541.field7494 + var9 + 13;
                    var17++;
                    if (class653.field9248 < var10 && class653.field9248 + class362.field5138 > var10 && var11 > var19 - 13 && (var19 + 4) > var11 && var18.field7695) {
                        arg1.method436(class653.field9248, var19 - 12, class362.field5138, 16, 255 - class414.field5688 << 24 | class514.field7088, 1);
                    }
                }
                class716.method3989(var9, class362.field5138, arg1, 2, class778.field10681, class541.field7494, class653.field9248);
            }
        } else {
            int var12 = 0;
            for (class554 var13 = (class554) class521.field7310.method3731((byte) -119); var13 != null; var13 = (class554) class521.field7310.method3729((byte) -114)) {
                int var14 = var5 + var9 + (class624.field8863 - 1 - var12) * 16 + 13;
                var12++;
                if (var10 > (class295.field4297 + var2) && class295.field4297 + var2 + class414.field5678 > var10 && var11 > (var14 - 13) && var11 < (var14 + 4) && var13.field7695) {
                    arg1.method436(class295.field4297 + var2, var14 + -12, class414.field5678, 16, class514.field7088 | 255 - class414.field5688 << 24, 1);
                }
            }
        }
        class716.method3989(var9, class414.field5678, arg1, 2, class72.field1137, class389.field5438 + var3, class295.field4297 + var2);
        if (class791.field10833) {
            int var20 = 0;
            for (class551 var21 = (class551) class496.field6807.method249(18371); var21 != null; var21 = (class551) class496.field6807.method254((byte) -64)) {
                int var25 = class389.field5438 + var9 + var3 + (var20 * 16) + 13;
                var20++;
                if (var21.field7643 == 1) {
                    class653.method3675(class561.field7773 | 0xFF000000, (class554) var21.field7645.field332.field6213, var11, var10, 36, var25, class421.field5865 | 0xFF000000, class414.field5678, class295.field4297 + var2, class389.field5438 + var3, arg1, class72.field1137);
                } else {
                    class535.method3110(arg1, var11, var25, var10, class561.field7773 | 0xFF000000, var21, 32, class295.field4297 + var2, class389.field5438 + var3, class414.field5678, class72.field1137, class421.field5865 | 0xFF000000);
                }
            }
            if (class346.field4933 != null) {
                int var22 = 0;
                for (class554 var23 = (class554) class346.field4933.field7645.method249(18371); var23 != null; var23 = (class554) class346.field4933.field7645.method254((byte) -64)) {
                    int var24 = var22 * 16 + (class541.field7494 + var9 + 13);
                    class653.method3675(class561.field7773 | 0xFF000000, var23, var11, var10, -100, var24, class421.field5865 | 0xFF000000, class362.field5138, class653.field9248, class541.field7494, arg1, class778.field10681);
                    var22++;
                }
                class640.method3633(class653.field9248, class778.field10681, class541.field7494, -53, class362.field5138);
            }
        } else {
            int var26 = 0;
            for (class554 var27 = (class554) class521.field7310.method3731((byte) -100); var27 != null; var27 = (class554) class521.field7310.method3729((byte) 14)) {
                int var28 = (class624.field8863 - var26 - 1) * 16 + (var5 + var9 + 13);
                class653.method3675(class561.field7773 | 0xFF000000, var27, var11, var10, 43, var28, class421.field5865 | 0xFF000000, var7, var4, var5, arg1, var8);
                var26++;
            }
        }
        class640.method3633(class295.field4297 + var2, class72.field1137, class389.field5438 + var3, -42, class414.field5678);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        field3818 = null;
        field3825 = null;
        field3829 = null;
        if (arg0 != -59) {
            field3829 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILmp;Lfe;II)V")
    public class272(int arg0, class565 arg1, class345 arg2, int arg3, int arg4) {
        this.field3823 = arg3;
        this.field3822 = arg2;
        this.field3828 = arg1;
        this.field3821 = arg4;
        this.field3820 = arg0;
    }
}
