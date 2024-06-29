import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class225 extends class171 {

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Lha;")
    public static class46 field3929 = class271.method1828("hitbar_default", -46);

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Laa;")
    private static class39 field3931 = new class39();

    @OriginalMember(owner = "client!g", name = "N", descriptor = "Ljg;")
    public static class147 field3934 = new class147(0, 0);

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Lha;")
    private static class46 field3937 = class271.method1828("Allocating memory", -46);

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field3938 = -1;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Lha;")
    public static class46 field3941 = field3937;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "Lha;")
    private static class46 field3939 = class271.method1828("glow2:", -46);

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lha;")
    public static class46 field3940 = field3939;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "Lha;")
    public static class46 field3942 = field3939;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Lpi;")
    public static class181 field3936;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lha;")
    public class46 field3923;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "[I")
    public int[] field3930;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "[I")
    public int[] field3932;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "[Lge;")
    public class235[] field3935;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "[Lha;")
    public class46[] field3926;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public static void method1539(int arg0) {
        field3939 = null;
        field3934 = null;
        field3942 = null;
        if (arg0 != 20741) {
            field3929 = null;
        }
        field3931 = null;
        field3940 = null;
        field3937 = null;
        field3941 = null;
        field3929 = null;
        field3936 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIIIIIIIII)V")
    public static final void method1540(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3927++;
        int var11 = arg2 - arg6;
        if (arg1 < 27) {
            return;
        }
        boolean var12;
        if (class70.field1203 > 0 && class70.field1203 % 10 < 5) {
            var12 = true;
        } else {
            var12 = false;
        }
        int var13 = arg10 - arg4;
        int var14 = 983040 / arg5;
        int var15 = 983040 / arg8;
        for (int var16 = -var15; var16 < var11 + var15; var16++) {
            int var18 = arg9 + (arg8 * var16) >> 16;
            int var19 = (var16 + 1) * arg8 + arg9 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg0 + var18;
                int var10000 = arg0 + var19;
                int var23 = var16 + arg6 >> 6;
                if (var23 >= 0 && var23 <= (class161.field2839.length - 1)) {
                    int[][] var24 = class161.field2839[var23];
                    for (int var25 = -var14; var25 < var13 + var14; var25++) {
                        int var26 = arg7 + (arg5 * var25) >> 16;
                        int var27 = (var25 + 1) * arg5 + arg7 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg3 + var27;
                            int var30 = arg3 + var26;
                            int var31 = arg4 + var25 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = (arg4 + var25 & 0x3F << 6) + (arg6 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class236 var34 = class157.method1158(var33 - 1, 114);
                                    if (var12 && class251.field4434 == var34.field4150) {
                                        class33 var35 = new class33();
                                        var35.field609 = var21;
                                        var35.field618 = var30;
                                        var35.field613 = var34.field4150;
                                        field3931.method265(var35, -501);
                                    }
                                    class142.field2599[var34.field4150].method119(var21 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class33 var17 = (class33) field3931.method264(-121); var17 != null; var17 = (class33) field3931.method269((byte) 7)) {
            class142.field2599[var17.field613].method119(var17.field609 - 7, var17.field618 + -7);
            class262.method1761(var17.field609, var17.field618, 15, 16776960, 128);
            class262.method1761(var17.field609, var17.field618, 7, 16777215, 256);
        }
        field3931.method266(5);
    }
}
