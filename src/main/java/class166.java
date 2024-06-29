import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class166 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    private int[] field2989;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[I")
    private int[] field2998;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Llf;")
    private class105 field3008;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Llf;")
    private class105 field2988;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[Llf;")
    private class105[] field3002;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[Ldl;")
    public static class31[] field2992 = new class31[28];

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[S")
    public static short[] field2996 = new short[] { 47, 5, 51, 43, 24, 15, 25, 16 };

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Lvf;")
    private static class265 field3010 = class87.method582(-46, "flash1:");

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lvf;")
    public static class265 field2990 = field3010;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lvf;")
    public static class265 field2999 = field3010;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Ldl;")
    public static class31 field3011;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[[[B")
    public static byte[][][] field3007;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZII)I")
    public static final int method1090(int arg0, boolean arg1, int arg2, int arg3) {
        field3000++;
        if ((class230.field4064[arg2][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1) {
            return arg2 <= 0 || (class230.field4064[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILsd;)I")
    public static final int method1091(int arg0, class23 arg1) {
        field3004++;
        class268 var2 = arg1.field681;
        if (arg0 < 87) {
            return 21;
        }
        if (var2.field4755 != null) {
            var2 = var2.method1825(20656);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4716;
        if (arg1.field2601 == arg1.field2582) {
            var3 = var2.field4733;
        } else if (arg1.field2587 == arg1.field2582) {
            var3 = var2.field4719;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLng;)Llf;")
    private static final class105 method1092(byte arg0, class135 arg1) {
        field2991++;
        arg1.method920((byte) 125);
        if (arg0 > -79) {
            return null;
        }
        int var2 = arg1.method920((byte) 70);
        class105 var3 = class7.method48(-121, var2);
        var3.field1864 = arg1.method920((byte) 22);
        int var4 = arg1.method920((byte) 38);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method920((byte) 49);
            var3.method12(var6, 255, arg1);
        }
        var3.method94(false);
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3001++;
        class35.method287(arg3, arg0, arg3 + arg4, arg0 - -arg1);
        class35.method295(arg3, arg0, arg4, arg1, 0);
        if (class103.field1830 < 100) {
            return;
        }
        if (class160.field2934 == null || class160.field2934.field1896 != arg4 || class160.field2934.field1904 != arg1) {
            class88 var5 = new class88(arg4, arg1);
            class35.method281(var5.field1592, arg4, arg1);
            class154.method1050(class213.field3824, 0, class155.field2871, 0, 0, 0, 127, arg1, arg4);
            class160.field2934 = var5;
            class252.field4334.method846((byte) 2);
        }
        class160.field2934.method604(arg3, arg0);
        if (arg2 < 47) {
            field3010 = null;
        }
        int var6 = class270.field4819 * arg4 / class213.field3824 + arg3;
        int var7 = class75.field1450 * arg1 / class155.field2871 + arg0;
        int var8 = class39.field891 * arg4 / class213.field3824;
        int var9 = class262.field4577 * arg1 / class155.field2871;
        int var10 = 16711680;
        if (class229.field4051 == 1) {
            var10 = 16777215;
        }
        class35.method301(var6, var7, var8, var9, var10, 128);
        class35.method292(var6, var7, var8, var9, var10);
        if (class8.field274 <= 0 || (class8.field274 % 10) >= 5) {
            return;
        }
        for (class79 var11 = (class79) class258.field4429.method789((byte) -71); var11 != null; var11 = (class79) class258.field4429.method787((byte) -76)) {
            if (class260.field4480 == var11.field1505) {
                int var12 = var11.field1498 * arg4 / class213.field3824 + arg3;
                int var13 = var11.field1499 * arg1 / class155.field2871 + arg0;
                class35.method295(var12 - 2, var13 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLvf;)V")
    public static final void method1094(int arg0, boolean arg1, class265 arg2) {
        field3009++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class22.field668.method771(arg2, 250);
        int var6 = class22.field668.method755(arg2, 250) * 13;
        int var7 = var3 + 6;
        class35.method295(var7 - var3, -var3 + var4, var3 + var3 + var5, var3 + var6 + var3, 0);
        class35.method292(var7 - var3, -var3 + var4, var3 + var3 + var5, var3 + var3 + var6, 16777215);
        if (arg0 != 24974) {
            method1091(-34, (class23) null);
        }
        class22.field668.method760(arg2, var7, var4, var5, var6, 16777215, -1, 1, 1, 0);
        class169.method1117(-96, var6 + var3 + var3, -var3 + var4, var7 - var3, var3 + var5 + var3);
        if (!arg1) {
            class139.method961(var6, var4, var5, 6467, var7);
            return;
        }
        try {
            Graphics var8 = class125.field2241.getGraphics();
            class252.field4334.method580(0, 0, var8, true);
        } catch (Exception var9) {
            class125.field2241.repaint();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1095(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= class107.field1890 && class79.field1510 >= arg3 && class81.field1521 <= arg5 && arg4 <= class205.field3681) {
            if (arg6 == 1) {
                class131.method871(arg5, arg3, 3698, arg4, arg2, arg0);
            } else {
                class1.method10(arg4, arg6, arg0, arg3, arg2, 1000, arg5);
            }
        } else if (arg6 == 1) {
            class244.method1621(arg4, arg0, 105, arg2, arg3, arg5);
        } else {
            class122.method819(arg2, 0, arg0, arg4, arg5, arg3, arg6);
        }
        field3006++;
        if (arg1 != -37) {
            field2990 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
    public static final void method1096(boolean arg0, int arg1) {
        field2995++;
        if (arg0) {
            if (class8.field271 != -1) {
                class108.method716(class8.field271, true);
            }
            for (class181 var2 = (class181) class49.field1042.method1851(false); var2 != null; var2 = (class181) class49.field1042.method1847(false)) {
                class40.method338(var2, -2, true);
            }
            class8.field271 = -1;
            class49.field1042 = new class269(8);
            class229.method1549((byte) -101);
            class8.field271 = class120.field2126;
            class232.method1568(false, true);
            class227.method1540(-32514);
            class116.method778(class8.field271, (byte) 86);
        }
        class227.field4033 = -1;
        class209.method1434(class133.field2409, 12781);
        class214.field3827 = new class122();
        class214.field3827.field2564 = 3000;
        class214.field3827.field2600 = 3000;
        int var3 = -15 % ((arg1 + 12) / 46);
        class121.method811(0, class243.field4236);
        class70.method497(102, 10);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field2996 = null;
        field3007 = null;
        if (arg0 < 89) {
            field3010 = null;
        }
        field3010 = null;
        field3011 = null;
        field2990 = null;
        field2992 = null;
        field2999 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLjb;Lfl;IIZID)[I")
    public final int[] method1098(boolean arg0, class24 arg1, class192 arg2, int arg3, int arg4, boolean arg5, int arg6, double arg7) {
        class40.method335(false, arg7);
        class78.field1492 = arg1;
        class198.field3533 = arg2;
        field3003++;
        class275.method1876(arg4, arg3, (byte) 112);
        for (int var10 = arg6; var10 < this.field3002.length; var10++) {
            this.field3002[var10].method700(arg3, false, arg4);
        }
        int[] var11 = new int[arg3 * arg4];
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var12 = arg4 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = 1;
            var13 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg5) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3008.field1853) {
                int[] var22 = this.field3008.method16(arg6 ^ 0x1F77, var16);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field3008.method18(var16, (byte) -126);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class172.field3109[var24];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class172.field3109[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class172.field3109[var26];
                var11[var15++] = (var27 << 16) + (var28 << 8) + var29;
                if (arg5) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3002.length; var17++) {
            this.field3002[var17].method130(-1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class166() {
        this.field2989 = new int[0];
        this.field2998 = new int[0];
        this.field3008 = new class267();
        this.field3008.field1864 = 1;
        this.field2988 = new class267();
        this.field3002 = new class105[] { this.field3008, this.field2988 };
        this.field2988.field1864 = 1;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lng;)V")
    public class166(class135 arg0) {
        int var2 = 0;
        int var3 = arg0.method920((byte) 76);
        this.field3002 = new class105[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class105 var16 = method1092((byte) -112, arg0);
            if (var16.method433(-48) >= 0) {
                var2++;
            }
            if (var16.method128(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field1855.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method920((byte) 103);
            }
            this.field3002[var6] = var16;
        }
        this.field2998 = new int[var2];
        int var7 = 0;
        this.field2989 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class105 var11 = this.field3002[var9];
            int var12 = var11.field1855.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1855[var13] = this.field3002[var5[var9][var13]];
            }
            int var14 = var11.method433(-26);
            int var15 = var11.method128(-1);
            if (var14 > 0) {
                this.field2998[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2989[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3008 = this.field3002[arg0.method920((byte) 55)];
        Object var10 = null;
        this.field2988 = this.field3002[arg0.method920((byte) 112)];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjb;Lfl;)Z")
    public final boolean method1099(int arg0, class24 arg1, class192 arg2) {
        field2993++;
        if (arg0 > -74) {
            method1095(5, (byte) -96, 115, 35, -111, 28, -43);
        }
        if (class172.field3111 <= 0) {
            for (int var4 = 0; var4 < this.field2998.length; var4++) {
                if (!arg2.method1330(this.field2998[var4], (byte) -112)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2998.length; var5++) {
                if (!arg2.method1310(class172.field3111, 2, this.field2998[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2989.length; var6++) {
            if (!arg1.method68(this.field2989[var6], 7164)) {
                return false;
            }
        }
        return true;
    }
}
