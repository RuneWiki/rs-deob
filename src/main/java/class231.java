import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class231 extends class68 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Z")
    public static boolean field3877 = false;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "[I")
    public static int[] field3882 = new int[25];

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 4)
    public static final void method1570(int arg0) {
        class137.field2428 = null;
        class294.field4904 = null;
        field3884++;
        class30.field421 = null;
        if (arg0 != 1) {
            field3882 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILbb;)Lqa;", line = 31)
    public static final class99 method1571(int arg0, class134 arg1) {
        field3876++;
        if (arg0 != 29599) {
            method1570(39);
        }
        return new class99(arg1.method931((byte) 59), arg1.method931((byte) 111), arg1.method931((byte) 84), arg1.method931((byte) 67), arg1.method949(20732), arg1.method948(arg0 ^ 0xFFFF8C1E));
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z", line = 45)
    public static final boolean method1572(byte arg0, int arg1) {
        field3881++;
        class88 var2 = class122.method799((byte) 101, arg1);
        if (var2 == null) {
            return false;
        } else if (class147.field2708 == 1 || class147.field2708 == 2 || class194.field3305 == 2) {
            byte[] var3 = var2.field1377.method860((byte) -49);
            class190.field3258 = new String(var3, 0, var3.length);
            class91.field1422 = var2.field1386;
            if (class194.field3305 != 0) {
                class172.field3035 = class91.field1422 + 50000;
                class63.field1069 = class91.field1422 + 40000;
                class239.field4040 = class63.field1069;
            }
            return true;
        } else {
            if (arg0 >= -52) {
                method1570(-56);
            }
            class126 var4 = class189.field3239;
            if (class194.field3305 != 0) {
                var4 = class12.method69(new class126[] { class33.field493, class195.method1386((byte) 20, var2.field1386 + 7000) }, (byte) 125);
            }
            class126 var5 = class189.field3239;
            if (class23.field321 != null) {
                var5 = class12.method69(new class126[] { class17.field234, class23.field321 }, (byte) 116);
            }
            class126 var6 = class12.method69(new class126[] { class88.field1381, var2.field1377, var4, class317.field5434, class195.method1386((byte) 20, class226.field3813), class260.field4363, class195.method1386((byte) 20, class126.field2121), var5, class197.field3373, class206.field3538 ? class244.field4137 : class220.field3712, class35.field515, field3877 ? class244.field4137 : class220.field3712, class41.field650, class314.field5394 ? class244.field4137 : class220.field3712 }, (byte) 127);
            try {
                class19.field260.getAppletContext().showDocument(var6.method874(0), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 95)
    public static void method1573(int arg0) {
        if (arg0 != 0) {
            method1574(-49, -89, 8, 125);
        }
        field3882 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V", line = 108)
    public static final void method1574(int arg0, int arg1, int arg2, int arg3) {
        field3879++;
        class245 var4 = class139.method1022(arg2, (byte) -97, arg0);
        var4.method1683(0);
        var4.field4153 = arg1;
        var4.field4154 = arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIILja;IZJ)Z", line = 126)
    public static final boolean method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class264.field4396 == class177.field3122;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class197.field3377 || var16 >= class65.field1094) {
                    return false;
                }
                class5 var17 = class297.field4940[arg0][var15][var16];
                if (var17 != null && var17.field61 >= 5) {
                    return false;
                }
            }
        }
        class240 var18 = new class240();
        var18.field4045 = arg11;
        var18.field4049 = arg0;
        var18.field4058 = arg5;
        var18.field4047 = arg6;
        var18.field4057 = arg7;
        var18.field4043 = arg8;
        var18.field4055 = arg9;
        var18.field4041 = arg1;
        var18.field4046 = arg2;
        var18.field4051 = arg1 + arg3 - 1;
        var18.field4044 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class297.field4940[var22][var19][var20] == null) {
                        class297.field4940[var22][var19][var20] = new class5(var22, var19, var20);
                    }
                }
                class5 var23 = class297.field4940[arg0][var19][var20];
                var23.field54[var23.field61] = var18;
                var23.field60[var23.field61] = var21;
                var23.field67 |= var21;
                var23.field61++;
                if (var13 && class166.field2959[var19][var20] != 0) {
                    var14 = class166.field2959[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class166.field2959[var24][var25] == 0) {
                        class166.field2959[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class217.field3653[class305.field5121++] = var18;
        }
        return true;
    }
}
