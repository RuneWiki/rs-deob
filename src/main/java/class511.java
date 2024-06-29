import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class511 extends class654 {

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3098(boolean arg0, int arg1) {
        field7459++;
        if (arg1 == 25 || arg1 == 4 || arg1 == 60 || arg1 == 2 || arg1 == 46) {
            return true;
        } else if (arg1 == 45 || arg1 == 1012) {
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILr;Lkt;Lvca;)V")
    public static final void method3099(int arg0, class167 arg1, class143 arg2, class257 arg3) {
        field7458++;
        class702 var4 = arg3.method1819(arg0 ^ 0xFFFFFFFE, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1083();
        if (var4.method1075() > var5) {
            var5 = var4.method1075();
        }
        byte var6 = 10;
        int var7 = arg2.field2401;
        int var8 = arg2.field2400;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field4088 != null) {
            var9 = class130.field2132.method3675(arg3.field4088, arg0 ^ 0x7F, null, null, class366.field5745);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class366.field5745[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class286.field4544.method775(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class286.field4544.method774() * var9 + class286.field4544.method777() / 2;
        }
        int var15 = var5 / 2 + arg2.field2401;
        if (class378.field5887 + var5 > var7) {
            var7 = class378.field5887;
            var15 = var5 / 2 + class378.field5887 + var6 - (-(var10 / 2) + -5);
        } else if (var7 > (class378.field5899 - var5)) {
            var7 = class378.field5899 - var5;
            var15 = class378.field5899 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        int var16 = arg2.field2400;
        if ((class378.field5890 + var5) > var8) {
            var8 = class378.field5890;
            var16 = var5 / 2 + class378.field5890 + var6;
        } else if ((class378.field5897 - var5) < var8) {
            var16 = class378.field5897 - var6 - (var5 / 2) - var11;
            var8 = class378.field5897 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg2.field2401), (double) (var8 - arg2.field2400)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3963((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = arg0;
        int var21 = -2;
        if (arg3.field4088 != null) {
            var18 = var15 - (var10 / 2 + 5);
            var19 = var16;
            var21 = (var16 + (class286.field4544.method774() * var9)) + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field4075 != 0) {
                arg1.method1355(var16, var18, var21 - var16, -var18 + var20, arg3.field4075, arg0 + 3);
            }
            if (arg3.field4078 != 0) {
                arg1.method1353(arg3.field4078, var21 - var16, -var18 + var20, var18, true, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class366.field5745[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class286.field4544.method778(arg1, var23, var15, var16, arg3.field4097, true);
                var16 += class286.field4544.method774();
            }
        }
        if (arg3.field4102 == -1 && arg3.field4088 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class659 var25 = new class659(arg2);
        var25.field9177 = var8 + var24;
        var25.field9180 = var7 + var24;
        var25.field9182 = var21;
        var25.field9173 = var8 - var24;
        var25.field9175 = var18;
        var25.field9181 = var7 - var24;
        var25.field9184 = var20;
        var25.field9174 = var19;
        class167.field2803.method3463((byte) -87, var25);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIII)V")
    public static final void method3100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7460++;
        if (arg2 >= class545.field7931 && class585.field8331 >= arg2) {
            int var5 = class160.method1320(0, arg0, class576.field8218, class340.field5510);
            int var6 = class160.method1320(0, arg3, class576.field8218, class340.field5510);
            class437.method2773(var6, 32767, arg2, var5, arg4);
        }
        if (arg1 >= -13) {
            method3101(false);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)Lpfa;")
    public abstract class270 method525(boolean arg0);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(Z)V")
    public static final void method3101(boolean arg0) {
        field7457++;
        if (!arg0) {
            class49 var1 = class376.field5862;
            synchronized (class376.field5862) {
                class376.field5862.method563(0);
            }
        }
    }
}
