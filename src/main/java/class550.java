import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class550 {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Ldc;")
    public static class303 field8065 = new class303(11, 0, 1, 2);

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
    public static int[] field8067 = new int[1];

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "J")
    public static long field8068 = -1L;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lvh;")
    public static class125 field8069 = new class125(6, 16);

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field8070 = 0;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field8071 = 0;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
    public static final void method3227(int arg0, int arg1, int arg2) {
        field8062++;
        if (class89.field1330 != arg1) {
            class518.field7652 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class518.field7652[var3] = (var3 << 12) / arg1;
            }
            class156.field2572 = arg1 - 1;
            class542.field7968 = arg1 * 32;
            class89.field1330 = arg1;
        }
        if (class236.field3492 != arg2) {
            if (class89.field1330 == arg2) {
                class78.field1195 = class518.field7652;
            } else {
                class78.field1195 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class78.field1195[var4] = (var4 << 12) / arg2;
                }
            }
            class453.field6525 = arg2 - 1;
            class236.field3492 = arg2;
        }
        int var5 = 67 % ((-arg0 - 5) / 33);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILr;II)V")
    public static final void method3228(int arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5) {
        arg3.method771(arg0, arg2, arg0 + arg5, arg2 + arg4);
        field8066++;
        arg3.method792(arg4, (byte) -88, arg5, arg2, -16777216, arg0);
        if (class238.field3515 < 100) {
            return;
        }
        float var6 = (float) class161.field2631 / (float) class161.field2640;
        int var7 = arg5;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg5 - var7) / 2 + arg0;
        int var10 = (arg4 - var8) / 2 + arg2;
        if (class695.field9870 == null || arg5 != class695.field9870.method12() || class695.field9870.method17() != arg4) {
            class161.method1210(class161.field2628, class161.field2636 + class161.field2631, class161.field2640 + class161.field2628, class161.field2636, var9, var10, var7 + var9, var8 + var10);
            class161.method1208(arg3);
            class695.field9870 = arg3.method749(var9, var10, var7, var8, false);
        }
        class695.field9870.method1638(var9, var10);
        int var11 = class500.field7430 * var7 / class161.field2640;
        int var12 = class259.field3710 * var8 / class161.field2631;
        int var13 = class123.field2007 * var7 / class161.field2640 + var9;
        int var14 = var10 - (class556.field8141 * var8 / class161.field2631) - (-var8 + var12);
        int var15 = -1996554240;
        if (class486.field6942 == class302.field4235) {
            var15 = -1996488705;
        }
        arg3.method824(var13, var14, var11, var12, var15, 1);
        arg3.method791(var13, var14, var11, var12, var15, arg1);
        if (class440.field6371 <= 0) {
            return;
        }
        int var16;
        if (class106.field1751 > 50) {
            var16 = 500 - (class106.field1751 * 5);
        } else {
            var16 = class106.field1751 * 5;
        }
        for (class66 var17 = (class66) class161.field2621.method3905(-107); var17 != null; var17 = (class66) class161.field2621.method3899(0)) {
            class30 var18 = class161.field2609.method2837(var17.field954, -76);
            if (class512.method3045(17366, var18)) {
                if (class277.field3924 == var17.field954) {
                    int var19 = var17.field951 * var7 / class161.field2640 + var9;
                    int var20 = (class161.field2631 - var17.field952) * var8 / class161.field2631 + var10;
                    arg3.method792(4, (byte) -88, 4, var20 - 2, var16 << 24 | 0xFFFF00, var19 - 2);
                } else if (class530.field7820 != -1 && class530.field7820 == var18.field444) {
                    int var21 = var17.field951 * var7 / class161.field2640 + var9;
                    int var22 = (class161.field2631 - var17.field952) * var8 / class161.field2631 + var10;
                    arg3.method792(4, (byte) -88, 4, var22 - 2, var16 << 24 | 0xFFFF00, var21 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZLjava/lang/String;J)V")
    public static final void method3229(byte arg0, boolean arg1, String arg2, long arg3) {
        field8064++;
        if (arg1) {
            class262.method1671(122);
            if (class308.field4283.equals("")) {
                class693.field9848 = 39;
                return;
            }
        }
        class465 var5 = new class465(576);
        var5.method2753((byte) 104, 10);
        int var6 = -108 % ((-arg0 - 35) / 48);
        var5.method2739((byte) -86, (int) (Math.random() * 65535.0D));
        var5.method2721(arg3, 520596624);
        var5.method2739((byte) -86, arg1 ? class383.field5614 : class557.field8151);
        var5.method2703(false, arg2);
        var5.method2721(arg1 ? class219.field3286 : class461.field6627, 520596624);
        if (arg1) {
            var5.method2721(class294.method1798(true, class308.field4283), 520596624);
            try {
                var5.method2721(Long.parseLong(class415.field5895), 520596624);
            } catch (Exception var10) {
                class693.field9848 = 39;
                return;
            }
        } else {
            var5.method2733(false, (int) (Math.random() * 9.9999999E7D));
            var5.method2733(false, (int) (Math.random() * 9.9999999E7D));
            var5.method2733(false, (int) (Math.random() * 9.9999999E7D));
            var5.method2733(false, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method2733(false, (int) (Math.random() * 9.9999999E7D));
        var5.method2725(true, class23.field308, class136.field2181);
        class699 var7 = class336.method1996((byte) 113);
        var7.field9908.method2753((byte) 89, arg1 ? class561.field8196.field4340 : class561.field8193.field4340);
        int var8 = 1;
        if (class529.field7808 != null) {
            var8 += class529.field7808.length() + 1;
        }
        var7.field9908.method2739((byte) -86, var5.field6710 + var8 + 28);
        var7.field9908.method2739((byte) -86, 624);
        var7.field9908.method2753((byte) 108, class238.field3511);
        var7.field9908.method2753((byte) 76, class486.field6942.field7806);
        class134.method1028(var7.field9908, (byte) 124);
        String var9 = arg1 ? class435.field6262 : class529.field7808;
        var7.field9908.method2753((byte) 127, var9 == null ? 0 : 1);
        if (var9 != null) {
            var7.field9908.method2703(false, var9);
        }
        var7.field9908.method2731(0, var5.field6710, var5.field6719, 0);
        class149.method1134(var7, true);
        class514.field7630 = 0;
        class693.field9848 = -3;
        class250.field3623 = 1;
        class211.field3232 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static void method3230(byte arg0) {
        field8067 = null;
        if (arg0 == -70) {
            field8065 = null;
            field8069 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method3231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8063++;
        if (arg2 >= arg3 + arg6 || arg3 >= arg2 + arg4) {
            return false;
        } else if (arg5 < arg7 + arg8 && arg8 < arg1 + arg5) {
            if (arg0 != 100) {
                method3229((byte) 69, false, null, 110L);
            }
            return true;
        } else {
            return false;
        }
    }
}
