import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class662 {

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field9293 = new String[200];

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field9292 = 0;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZIILib;ZLib;)I", line = 3)
    public static final int method3771(int arg0, boolean arg1, int arg2, int arg3, class162 arg4, boolean arg5, class162 arg6) {
        field9294++;
        if (arg2 > -81) {
            method3777(-9);
        }
        int var7 = class132.method947(arg6, true, arg4, arg0, arg1);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class132.method947(arg6, true, arg4, arg3, arg5);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I[B)Ljava/lang/String;", line = 37)
    public static final String method3772(int arg0, byte[] arg1) {
        field9297++;
        if (arg0 != 0) {
            method3775(true);
        }
        return class45.method308(arg1.length, 0, (byte) 37, arg1);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILjava/lang/String;)V", line = 50)
    public static final void method3773(int arg0, int arg1, String arg2) {
        field9291++;
        int var3 = class147.field1873;
        int[] var4 = class568.field8045;
        boolean var5 = false;
        for (int var6 = arg0; var6 < var3; var6++) {
            class559 var7 = class581.field8250[var4[var6]];
            if (var7 != null && class251.field3549 != var7 && var7.field7955 != null && var7.field7955.equalsIgnoreCase(arg2)) {
                if (arg1 == 1) {
                    class163.field2389++;
                    class731 var13 = class155.method1222(arg0 ^ 0x104, class745.field10366, class237.field3417);
                    var13.field10211.method856(-110, var4[var6]);
                    var13.field10211.method847((byte) 120, 0);
                    class533.method3088(var13, 0);
                } else if (arg1 == 4) {
                    class676.field9628++;
                    class731 var8 = class155.method1222(260, class619.field8717, class237.field3417);
                    var8.field10211.method847((byte) 120, 0);
                    var8.field10211.method860(var4[var6], (byte) 120);
                    class533.method3088(var8, 0);
                } else if (arg1 == 5) {
                    class781.field10758++;
                    class731 var12 = class155.method1222(260, class649.field9143, class237.field3417);
                    var12.field10211.method860(var4[var6], (byte) 125);
                    var12.field10211.method847((byte) 120, 0);
                    class533.method3088(var12, 0);
                } else if (arg1 == 6) {
                    class262.field3701++;
                    class731 var9 = class155.method1222(arg0 + 260, class277.field3852, class237.field3417);
                    var9.field10211.method836(arg0 - 30411, 0);
                    var9.field10211.method832(-93, var4[var6]);
                    class533.method3088(var9, 0);
                } else if (arg1 == 7) {
                    class792.field10854++;
                    class731 var10 = class155.method1222(260, class234.field3390, class237.field3417);
                    var10.field10211.method840(0, (byte) 98);
                    var10.field10211.method860(var4[var6], (byte) 122);
                    class533.method3088(var10, arg0);
                } else if (arg1 == 9) {
                    class731 var11 = class155.method1222(260, class164.field2408, class237.field3417);
                    var11.field10211.method856(arg0 ^ 0xFFFFFF97, var4[var6]);
                    var11.field10211.method851((byte) -2, 0);
                    class533.method3088(var11, 0);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class64.method386(class674.field9572.method3825((byte) -10, class526.field7494) + arg2, 4, false);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZBI)I", line = 149)
    public static final int method3774(int arg0, boolean arg1, byte arg2, int arg3) {
        field9298++;
        class685 var4 = class26.method198(arg1, (byte) -19, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -41) {
            return arg0 >= 0 && arg0 < var4.field9721.length ? var4.field9721[arg0] : 0;
        } else {
            return 113;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)Z", line = 170)
    public static final boolean method3775(boolean arg0) {
        field9299++;
        if (arg0) {
            return false;
        } else {
            return class543.field7608 > 0;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 184)
    public static final String method3776(boolean arg0, int arg1) {
        field9295++;
        String var2 = Integer.toString(arg1);
        int var3 = var2.length() - 3;
        if (arg0) {
            return null;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class674.field9584.method3825((byte) -10, class526.field7494) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class674.field9586.method3825((byte) -10, class526.field7494) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V", line = 223)
    public static void method3777(int arg0) {
        field9293 = null;
        if (arg0 < 33) {
            method3772(-56, null);
        }
    }
}
