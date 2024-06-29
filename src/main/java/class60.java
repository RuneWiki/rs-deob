import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class60 extends class129 {

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public int field1548 = 1000;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Lv;")
    public static class122 field1549 = class55.method425(-71, "Empf\u001c1nger:");

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Lv;")
    private static class122 field1543 = class55.method425(-69, "Click to continue");

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Lv;")
    public static class122 field1545 = field1543;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "[I")
    public static int[] field1550 = new int[500];

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "Ljb;")
    public static class56 field1551 = new class56(64);

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1554 = 0;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "Lv;")
    private static class122 field1555 = class55.method425(-63, "On");

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "Lv;")
    public static class122 field1552 = field1555;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Lrc;")
    public static class105 field1553;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "[I")
    public static int[] field1542;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method458(int arg0, int arg1, int arg2) {
        field1547++;
        if (arg0 == 0 && class49.field1250 == arg2) {
            return true;
        } else if (arg0 == arg1 && class61.field1563 == arg2) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class109.field2700 == arg2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIIII)V", line = 34)
    public void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1544++;
        class68 var10 = this.method424(false);
        if (var10 != null) {
            this.field1548 = var10.field1548;
            var10.method459(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Llb;", line = 58)
    public class68 method424(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field1546++;
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V", line = 69)
    public static void method460(byte arg0) {
        field1543 = null;
        field1545 = null;
        field1553 = null;
        field1549 = null;
        int var1 = 54 / ((54 - arg0) / 48);
        field1550 = null;
        field1551 = null;
        field1542 = null;
        field1552 = null;
        field1555 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILrc;Lrc;)V", line = 99)
    public static final void method461(int arg0, class105 arg1, class105 arg2) {
        class102.field2535.method473((byte) -4);
        field1540++;
        if (class44.field1156 == 0 || class44.field1156 == 5) {
            byte var3 = 20;
            arg1.method811(class74.field2002, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class117.method894(28, var4, 304, 34, 9179409);
            class117.method894(29, var4 + 1, 302, 32, 0);
            class117.method895(30, var4 + 2, class113.field2755 * 3, 30, 9179409);
            class117.method895(class113.field2755 * 3 + 30, var4 + 2, 300 - class113.field2755 * 3, 30, 0);
            arg1.method811(class88.field2262, 180, 105 - var3, 16777215);
        }
        if (class44.field1156 == 20) {
            class2.field90.method63(0, 0);
            byte var5 = 40;
            arg1.method814(class88.field2253, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg1.method814(class88.field2254, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg1.method814(class88.field2258, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg1.method802(class59.method454(new class122[] { class64.field1674, class88.field2261 }, 5176), 90, var22, 16777215, true);
            int var23 = var22 + 15;
            arg1.method802(class59.method454(new class122[] { class112.field2744, class88.field2250.method954(-31758) }, arg0 ^ 0x48B0), 92, var23, 16777215, true);
            int var24 = var23 + 15;
        }
        if (class44.field1156 == 10) {
            class2.field90.method63(0, 0);
            if (class24.field657 == 0) {
                byte var13 = 80;
                byte var14 = 100;
                arg1.method814(class50.field1266, 180, var13, 16776960, true);
                byte var15 = 120;
                class75.field2005.method63(var14 - 73, var15 + -20);
                arg1.method815(class118.field2851, var14 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class75.field2005.method63(var16 - 73, var15 - 20);
                arg1.method815(class46.field1193, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                int var35 = var13 + 30;
            } else if (class24.field657 == 2) {
                byte var9 = 100;
                byte var10 = 40;
                arg1.method814(class88.field2253, 180, var10, 16776960, true);
                int var29 = var10 + 15;
                arg1.method814(class88.field2254, 180, var29, 16776960, true);
                int var30 = var29 + 15;
                arg1.method814(class88.field2258, 180, var30, 16776960, true);
                short var11 = 150;
                int var31 = var30 + 15;
                int var32 = var31 + 10;
                arg1.method802(class59.method454(new class122[] { class64.field1674, class88.field2261, class127.field3072 == 0 & class16.field396 % 40 < 20 ? class49.field1243 : class88.field2260 }, 5176), 90, var32, 16777215, true);
                int var33 = var32 + 15;
                arg1.method802(class59.method454(new class122[] { class112.field2744, class88.field2250.method954(-31758), class16.field396 % 40 < 20 & class127.field3072 == 1 ? class49.field1243 : class88.field2260 }, arg0 - 18512), 92, var33, 16777215, true);
                class75.field2005.method63(var9 - 73, var11 + -20);
                arg1.method814(class38.field998, var9, var11 + 5, 16777215, true);
                int var34 = var33 + 15;
                short var12 = 260;
                class75.field2005.method63(var12 - 73, var11 + -20);
                arg1.method814(class55.field1444, var12, var11 + 5, 16777215, true);
            } else if (class24.field657 == 3) {
                arg1.method814(class10.field215, 180, 40, 16776960, true);
                short var6 = 180;
                short var7 = 150;
                byte var8 = 65;
                arg1.method814(class83.field2153, 180, var8, 16777215, true);
                int var25 = var8 + 15;
                arg1.method814(class120.field2904, 180, var25, 16777215, true);
                int var26 = var25 + 15;
                arg1.method814(class8.field192, 180, var26, 16777215, true);
                int var27 = var26 + 15;
                arg1.method814(class30.field754, 180, var27, 16777215, true);
                int var28 = var27 + 15;
                class75.field2005.method63(var6 - 73, var7 - 20);
                arg1.method814(class55.field1444, var6, var7 + 5, 16777215, true);
            }
        }
        class33.method292(-61);
        try {
            if (arg0 == 23688) {
                Graphics var17 = class54.field1411.getGraphics();
                class102.field2535.method122(arg0 ^ 0xFFFFA314, var17, 202, 171);
                class56.field1484.method122(22, var17, 0, 0);
                class2.field76.method122(arg0 ^ 0xFFFFA31A, var17, 637, 0);
                if (class81.field2121) {
                    class81.field2121 = false;
                    class26.field696.method122(arg0 - 23566, var17, 128, 0);
                    class115.field2803.method122(arg0 ^ 0xFFFFA322, var17, 202, 371);
                    class47.field1219.method122(arg0 ^ 0x5C87, var17, 0, 265);
                    class127.field3092.method122(-69, var17, 562, 265);
                    class21.field579.method122(arg0 ^ 0x5CF4, var17, 128, 171);
                    class66.field1694.method122(arg0 ^ 0x5CFA, var17, 562, 171);
                }
            }
        } catch (Exception var18) {
            class54.field1411.repaint();
        }
    }
}
