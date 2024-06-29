import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class237 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[Lvf;")
    public static class89[] field3797 = new class89[14];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
    public static boolean field3796 = false;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Ljh;")
    public static class207 field3803;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
    public static int[] field3801;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[Lng;")
    public static class245[] field3798;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method1615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3802++;
        int var8 = class3.method20(class323.field5030, arg5, class88.field1324, -27521);
        int var9 = 20 % ((arg0 - 18) / 54);
        int var10 = class3.method20(class323.field5030, arg1, class88.field1324, -27521);
        int var11 = class3.method20(class256.field3995, arg2, class118.field1834, -27521);
        int var12 = class3.method20(class256.field3995, arg7, class118.field1834, -27521);
        int var13 = class3.method20(class323.field5030, arg4 + arg5, class88.field1324, -27521);
        int var14 = class3.method20(class323.field5030, arg1 - arg4, class88.field1324, -27521);
        for (int var15 = var8; var15 < var13; var15++) {
            class253.method1704(var11, var12, arg6, class175.field2675[var15], 7);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class253.method1704(var11, var12, arg6, class175.field2675[var16], 7);
        }
        int var17 = class3.method20(class256.field3995, arg2 + arg4, class118.field1834, -27521);
        int var18 = class3.method20(class256.field3995, arg7 - arg4, class118.field1834, -27521);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class175.field2675[var19];
            class253.method1704(var11, var17, arg6, var20, 7);
            class253.method1704(var17, var18, arg3, var20, 7);
            class253.method1704(var18, var12, arg6, var20, 7);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V", line = 58)
    public static final void method1616(boolean arg0, int arg1) {
        if (!arg0) {
            field3798 = (class245[]) null;
        }
        field3800++;
        class220.field3493.method1287(arg1, 122);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I", line = 73)
    public static final int method1617(int arg0) {
        if (arg0 <= 27) {
            field3801 = (int[]) null;
        }
        field3799++;
        return class206.field3112;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 87)
    public static void method1618(int arg0) {
        field3798 = null;
        field3801 = null;
        if (arg0 != 14) {
            field3796 = false;
        }
        field3797 = null;
        field3803 = null;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 109)
    public static final void method1619(int arg0) {
        if (arg0 <= 119) {
            method1616(false, -6);
        }
        class276.field4262.method1296(255);
        field3804++;
        class56.field781.method1296(255);
        class109.field1685.method1296(255);
    }
}
