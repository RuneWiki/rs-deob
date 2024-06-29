import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lhe;")
    private static class54 field3200 = class6.method58("Press (Wrecover a locked account(W on front page)3", false);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lhe;")
    public static class54 field3201 = class6.method58("Unerwartete Antwort vom Anmelde)2Server", false);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lhe;")
    public static class54 field3195 = field3200;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lhe;")
    private static class54 field3203 = class6.method58("Your account has been disabled)3", false);

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lhe;")
    public static class54 field3199 = field3203;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[Z")
    public static boolean[] field3197;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method1082(int arg0) {
        field3196++;
        if (arg0 == -20 && class100.field2527 != null) {
            class34 var1 = class100.field2527;
            synchronized (class100.field2527) {
                class100.field2527 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1083(int arg0, int arg1) {
        field3194++;
        if (arg1 == 100 && class129.field2923 > 0) {
            byte[] var2 = class149.field3383[--class129.field2923];
            class149.field3383[class129.field2923] = null;
            return var2;
        } else if (arg1 == 5000 && class87.field2150 > 0) {
            byte[] var3 = class13.field360[--class87.field2150];
            class13.field360[class87.field2150] = null;
            return var3;
        } else if (arg0 != -1) {
            return null;
        } else if (arg1 == 30000 && class11.field308 > 0) {
            byte[] var4 = class53.field1276[--class11.field308];
            class53.field1276[class11.field308] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
    public static final boolean method1084(int arg0, int arg1) {
        if (arg0 != 1) {
            field3204 = -29;
        }
        field3192++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method1085(boolean arg0) {
        field3195 = null;
        field3200 = null;
        field3203 = null;
        field3201 = null;
        field3197 = null;
        field3199 = null;
        if (!arg0) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lod;ILod;)V")
    public static final void method1086(class101 arg0, int arg1, class101 arg2) {
        field3193++;
        if (class91.field2211) {
            class14.method107((byte) -95, arg2, arg0);
            return;
        }
        if (class105.field2604 == 0 || class105.field2604 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method1183(class5.field170, 382, 245 - var3, 16777215, -1);
            class90.method724(230, var4, 304, 34, 9179409);
            class90.method724(231, var4 + 1, 302, 32, 0);
            class90.method710(232, var4 + 2, class4.field139 * 3, 30, 9179409);
            class90.method710(class4.field139 * 3 + 232, var4 + 2, 300 - class4.field139 * 3, 30, 0);
            arg0.method1183(class66.field1602, 382, 276 - var3, 16777215, -1);
        }
        if (class105.field2604 == 20) {
            short var5 = 211;
            class49.field1173.method161(382 - class49.field1173.field574 / 2, -(class49.field1173.field577 / 2) + 271);
            arg0.method1183(class66.field1611, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method1183(class66.field1606, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method1183(class66.field1609, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method1189(class143.method1105(new class54[] { class51.field1232, class154.method1186(class66.field1608) }, -842), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method1189(class143.method1105(new class54[] { class75.field1857, class66.field1604.method388(-126) }, -842), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class105.field2604 == 10) {
            class49.field1173.method161(202, 171);
            if (class107.field2615 == 0) {
                short var6 = 251;
                arg0.method1183(class84.field2100, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 302;
                short var8 = 291;
                class38.field964.method161(var7 - 73, var8 - 20);
                arg0.method1178(class125.field2869, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class38.field964.method161(var9 - 73, var8 + -20);
                arg0.method1178(class137.field3146, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class107.field2615 == 2) {
                short var10 = 211;
                arg0.method1183(class66.field1611, 382, var10, 16776960, 0);
                short var11 = 302;
                int var30 = var10 + 15;
                short var12 = 321;
                arg0.method1183(class66.field1606, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg0.method1183(class66.field1609, 382, var31, 16776960, 0);
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                arg0.method1189(class143.method1105(new class54[] { class51.field1232, class154.method1186(class66.field1608), class4.field138 % 40 < 20 & class22.field614 == 0 ? class118.field2766 : class66.field1607 }, -842), 272, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg0.method1189(class143.method1105(new class54[] { class75.field1857, class66.field1604.method388(-127), class4.field138 % 40 < 20 & class22.field614 == 1 ? class118.field2766 : class66.field1607 }, -842), 274, var34, 16777215, 0);
                class38.field964.method161(var11 - 73, var12 + -20);
                arg0.method1183(class135.field3051, var11, var12 + 5, 16777215, 0);
                short var13 = 462;
                class38.field964.method161(var13 - 73, var12 + -20);
                int var35 = var34 + 15;
                arg0.method1183(class157.field3575, var13, var12 + 5, 16777215, 0);
            } else if (class107.field2615 == 3) {
                short var14 = 382;
                arg0.method1183(class63.field1528, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method1183(class48.field1159, 382, var15, 16777215, 0);
                int var36 = var15 + 15;
                short var16 = 321;
                arg0.method1183(class7.field221, 382, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg0.method1183(class102.field2548, 382, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method1183(class114.field2712, 382, var38, 16777215, 0);
                class38.field964.method161(var14 - 73, var16 + -20);
                arg0.method1183(class157.field3575, var14, var16 + 5, 16777215, 0);
                int var39 = var38 + 15;
            }
        }
        if (class43.field1093 != 1) {
            if (client.field591 > 0) {
                class93.method735(client.field591, (byte) -5);
                client.field591 = 0;
            }
            class12.method92(false);
        }
        class158.field3629[class66.field1605 ? 1 : 0].method161(725, 463);
        if (class105.field2604 > 5 && class50.field1207 != 2 && class31.field802 == 0) {
            if (class38.field992 == null) {
                class38.field992 = class2.method9(24094, class66.field1607, class125.field2877, client.field607);
            } else {
                byte var17 = 100;
                byte var18 = 35;
                byte var19 = 5;
                short var20 = 463;
                class38.field992.method161(var19, var20);
                arg0.method1183(class143.method1105(new class54[] { class48.field1166, class138.field3170, class147.method1117(-12, class123.field2828) }, -842), var17 / 2 + var19, var18 / 2 - 2 + var20, 16777215, 0);
                if (class83.field2062 == null) {
                    arg2.method1183(class52.field1240, var19 + var17 / 2, var18 / 2 + var20 + 12, 16777215, 0);
                } else {
                    arg2.method1183(class85.field2105, var17 / 2 + var19, var18 / 2 + var20 + 12, 16777215, 0);
                }
            }
        }
        try {
            if (arg1 < 113) {
                method1085(true);
            }
            Graphics var21 = class70.field1753.getGraphics();
            class124.field2852.method81(var21, 0, 0, true);
        } catch (Exception var22) {
            class70.field1753.repaint();
        }
    }
}
