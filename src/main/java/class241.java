import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class241 {

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[Z")
    public static boolean[] field3535 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lpi;")
    public static class201 field3533 = new class201(50);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field3538 = 0;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3539 = "Loaded fonts";

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3542 = " is already on your friend list.";

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lli;")
    public static class175 field3543;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1645(int arg0) {
        field3543 = null;
        field3542 = null;
        field3535 = null;
        int var1 = -70 / ((arg0 - 23) / 53);
        field3539 = null;
        field3533 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BZ)V")
    public static final void method1646(byte arg0, boolean arg1) {
        if (class228.field3361 == null) {
            class228.field3361 = new byte[4][104][104];
        }
        if (!arg1) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class228.field3361[var2][var3][var4] = arg0;
                }
            }
        }
        field3537++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZBLgg;Ldc;Lhf;)V")
    public static final void method1647(int arg0, int arg1, int arg2, boolean arg3, byte arg4, class66 arg5, class1 arg6, class159 arg7) {
        field3541++;
        class157 var8 = null;
        if (arg4 >= -24) {
            method1649((class263) null, (byte) -68);
        }
        if (arg5.field1014 == 0) {
            if ((double) class46.field629 == 3.0D) {
                var8 = class303.field4908;
            }
            if ((double) class46.field629 == 4.0D) {
                var8 = class190.field2816;
            }
            if ((double) class46.field629 == 6.0D) {
                var8 = class231.field3396;
            }
            if ((double) class46.field629 >= 8.0D) {
                var8 = class260.field4029;
            }
        } else if (arg5.field1014 == 1) {
            if ((double) class46.field629 == 3.0D) {
                var8 = class231.field3396;
            }
            if ((double) class46.field629 == 4.0D) {
                var8 = class260.field4029;
            }
            if ((double) class46.field629 == 6.0D) {
                var8 = class155.field2414;
            }
            if ((double) class46.field629 >= 8.0D) {
                var8 = class13.field154;
            }
        } else if (arg5.field1014 == 2) {
            if ((double) class46.field629 == 3.0D) {
                var8 = class155.field2414;
            }
            if ((double) class46.field629 == 4.0D) {
                var8 = class13.field154;
            }
            if ((double) class46.field629 == 6.0D) {
                var8 = class172.field2601;
            }
            if ((double) class46.field629 >= 8.0D) {
                var8 = class220.field3214;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = arg5.field1005;
        if (arg7.field2470 && arg5.field997 != -1) {
            var9 = arg5.field997;
        }
        int var10 = class84.field1336.method62(arg5.field991, (int[]) null, class306.field4937);
        int var11 = arg7.field2474;
        int var12;
        if (arg3) {
            var12 = var11 - var8.method1147() * var10 / 2;
        } else {
            var12 = var11 - (arg1 - (-((var10 - 1) * var8.method1149()) - var8.method1147() / 2));
        }
        int var13 = var12 - var8.method1147();
        int var14 = var12 + var8.method1147() / 2;
        int var15 = 0;
        for (int var16 = 0; var16 < var10; var16++) {
            String var22 = class306.field4937[var16];
            if (var16 < var10 - 1) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method1143(var22);
            if (var23 > var15) {
                var15 = var23;
            }
        }
        arg6.field18 = arg2 + var13;
        arg6.field9 = arg7.field2468 + arg0 - (var15 / 2);
        arg6.field5 = var15 / 2 + arg0 + arg7.field2468;
        arg6.field12 = arg2 + var8.method1149() * var10 + var13;
        int var17 = arg7.field2468 - (var15 / 2) - 5;
        int var18 = var13 + 2;
        if (arg5.field1007 != 0) {
            class130.method1003(var17, var18, var15 + 10, -var18 + 1 + (var13 - -(var10 * var8.method1149())), arg5.field1007, arg5.field1007 >>> 24);
        }
        if (arg5.field1006 != 0) {
            class130.method987(var17, var18, var15 + 10, -var18 + 1 + var8.method1149() * var10 + var13, arg5.field1006, arg5.field1006 >>> 24);
        }
        for (int var19 = 0; var19 < var10; var19++) {
            String var20 = class306.field4937[var19];
            if (var10 - 1 > var19) {
                var20 = var20.substring(0, var20.length() - 4);
            }
            int var21 = var8.method1143(var20);
            if (var15 < var21) {
                var15 = var21;
            }
            var8.method1146(var20, arg7.field2468, var14, var9, true);
            var14 += var8.method1149();
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        class36.field463.method1422((byte) 100);
        if (arg0 > -31) {
            field3538 = 53;
        }
        field3533.method1422((byte) -80);
        field3531++;
        class301.field4878.method1422((byte) 121);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lmh;B)Lmh;")
    public static final class263 method1649(class263 arg0, byte arg1) {
        if (arg1 <= 58) {
            field3533 = null;
        }
        field3536++;
        class263 var2 = client.method908(arg0);
        if (var2 == null) {
            var2 = arg0.field4048;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)Ll;")
    public static final class10 method1650(byte[] arg0, int arg1) {
        if (arg1 != -805) {
            method1649((class263) null, (byte) 10);
        }
        field3534++;
        if (arg0 == null) {
            return null;
        } else {
            class83 var2 = new class83(arg0, class32.field399, class297.field4765, class165.field2534, class283.field4559, class280.field4506);
            class137.method1032(arg1 + 703);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3530++;
        class293 var10 = null;
        class293 var11 = (class293) class222.field3228.method8(-114);
        if (arg8 >= -62) {
            field3538 = -18;
        }
        while (var11 != null) {
            if (var11.field4670 == arg3 && var11.field4655 == arg9 && var11.field4663 == arg6 && var11.field4667 == arg1) {
                var10 = var11;
                break;
            }
            var11 = (class293) class222.field3228.method12((byte) 69);
        }
        if (var10 == null) {
            var10 = new class293();
            var10.field4655 = arg9;
            var10.field4670 = arg3;
            var10.field4663 = arg6;
            var10.field4667 = arg1;
            class6.method32(var10, -5678);
            class222.field3228.method13(32, var10);
        }
        var10.field4649 = arg2;
        var10.field4651 = arg5;
        var10.field4668 = arg0;
        var10.field4662 = arg4;
        var10.field4660 = arg7;
    }
}
