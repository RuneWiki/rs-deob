import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class35 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
    public static int[] field374 = new int[4096];

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Llo;")
    public static class280 field378;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lnl;")
    public static class435 field379;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLvc;IIII)V")
    public static final void method212(byte arg0, class89 arg1, int arg2, int arg3, int arg4, int arg5) {
        field377++;
        arg1.method453(arg4, arg3, arg2 + arg4, arg3 + arg5);
        arg1.method742(11, arg3, arg5, arg2, -16777216, arg4);
        if (class4.field33 < 100) {
            return;
        }
        float var6 = (float) class330.field4581 / (float) class330.field4600;
        int var7 = arg2;
        int var8 = arg5;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        if (arg0 != -59) {
            method214(-5, 16, -103);
        }
        int var9 = (arg2 - var7) / 2 + arg4;
        int var10 = (arg5 - var8) / 2 + arg3;
        if (class92.field1298 == null || class92.field1298.method1293() != arg2 || class92.field1298.method1287() != arg5) {
            class330.method2066(class330.field4596, class330.field4602 + class330.field4581, class330.field4596 - -class330.field4600, class330.field4602, var9, var10, var7 + var9, var8 + var10);
            class330.method2078(arg1);
            class92.field1298 = arg1.method429(var9, var10, var7, var8, false);
        }
        class92.field1298.method2493(var9, var10);
        int var11 = class486.field6874 * var7 / class330.field4600;
        int var12 = class480.field6801 * var8 / class330.field4581;
        int var13 = class158.field2260 * var7 / class330.field4600 + var9;
        int var14 = var10 + var8 - var12 - (class211.field3078 * var8 / class330.field4581);
        int var15 = -1996554240;
        if (class350.field4825 == field378) {
            var15 = -1996488705;
        }
        arg1.method438(var13, var14, var11, var12, var15, 1);
        arg1.method348(var13, var14, var11, var12, var15, 0);
        if (class349.field4804 <= 0) {
            return;
        }
        int var16;
        if (class182.field2752 <= 50) {
            var16 = class182.field2752 * 5;
        } else {
            var16 = (100 - class182.field2752) * 5;
        }
        for (class266 var17 = (class266) class330.field4572.method775(1); var17 != null; var17 = (class266) class330.field4572.method763(arg0 ^ 0xFFFFFFC5)) {
            class76 var18 = class330.field4569.method2321(var17.field3826, true);
            if (class118.method919(var18, -18334)) {
                if (class480.field6802 == var17.field3826) {
                    int var21 = var17.field3825 * var7 / class330.field4600 + var9;
                    int var22 = var10 + ((class330.field4581 - var17.field3828) * var8 / class330.field4581);
                    arg1.method742(11, var22 - 2, 4, 4, var16 << 24 | 0xFFFF00, var21 - 2);
                } else if (class221.field3193 != -1 && class221.field3193 == var18.field1100) {
                    int var19 = var17.field3825 * var7 / class330.field4600 + var9;
                    int var20 = (class330.field4581 - var17.field3828) * var8 / class330.field4581 + var10;
                    arg1.method742(11, var20 - 2, 4, 4, var16 << 24 | 0xFFFF00, var19 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method213(byte arg0) {
        field374 = null;
        field378 = null;
        field379 = null;
        if (arg0 != -126) {
            method214(127, -30, 88);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Lro;")
    public static final class174 method214(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class174 var4 = var3.field748;
            var3.field748 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static final void method215(byte arg0) {
        if (arg0 <= 124) {
            field376 = -4;
        }
        field375++;
        if (class273.field3967 != null) {
            return;
        }
        Container var1;
        if (class467.field6587 == null) {
            var1 = class436.field6206.field960;
        } else {
            var1 = class467.field6587;
        }
        class59.field847 = var1.getSize().width;
        class297.field4191 = var1.getSize().height;
        if (class467.field6587 == var1) {
            Insets var2 = class467.field6587.getInsets();
            class59.field847 -= var2.left + var2.right;
            class297.field4191 -= var2.top + var2.bottom;
        }
        if (class448.method2708(0) == 1) {
            class364.field5007 = class15.field146;
            class431.field6099 = class364.field5005;
            class394.field5444 = 0;
            class97.field1357 = (class59.field847 - class15.field146) / 2;
        } else if (class364.field5008 < 96 && class377.field5192 == 0) {
            int var3 = class59.field847 > 1024 ? 1024 : class59.field847;
            class97.field1357 = (class59.field847 - var3) / 2;
            class364.field5007 = var3;
            int var4 = class297.field4191 <= 768 ? class297.field4191 : 768;
            class431.field6099 = var4;
            class394.field5444 = 0;
        } else {
            class97.field1357 = 0;
            class364.field5007 = class59.field847;
            class394.field5444 = 0;
            class431.field6099 = class297.field4191;
        }
        if (class480.field6799 != class389.field5379) {
            boolean var10000;
            if (class364.field5007 < 1024 && class431.field6099 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class33.field338.setSize(class364.field5007, class431.field6099);
        if (class374.field5152 != null) {
            class374.field5152.method294();
        }
        if (class467.field6587 == var1) {
            Insets var5 = class467.field6587.getInsets();
            class33.field338.setLocation(var5.left + class97.field1357, class394.field5444 + var5.top);
        } else {
            class33.field338.setLocation(class97.field1357, class394.field5444);
        }
        if (class238.field3475 != -1) {
            class464.method2770((byte) -68, true);
        }
        class476.method2822(true);
    }

    static {
        new class151((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field378 = null;
    }
}
