import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class244 extends class201 {

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "Ljd;")
    private static class85 field4168 = class221.method1499("Starting 3d library", (byte) 91);

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field4177 = 0;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Ljd;")
    public static class85 field4179 = field4168;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Lpa;")
    private class204 field4166;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lge;")
    public static class68 field4175;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[I")
    public static int[] field4165;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljd;Z)Z")
    public static final boolean method1646(class85 arg0, boolean arg1) {
        field4164++;
        if (arg0 == null) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            for (int var2 = 0; var2 < class56.field978; var2++) {
                if (arg0.method582(class256.field4572[var2], -117)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILqb;Lqb;IIIIJ)V")
    public static final void method1647(int arg0, int arg1, int arg2, int arg3, class56 arg4, class56 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class267 var12 = new class267();
        var12.field4751 = arg10;
        var12.field4752 = arg1 * 128 + 64;
        var12.field4746 = arg2 * 128 + 64;
        var12.field4758 = arg3;
        var12.field4759 = arg4;
        var12.field4753 = arg5;
        var12.field4755 = arg6;
        var12.field4754 = arg7;
        var12.field4756 = arg8;
        var12.field4750 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class99.field1780[var13][arg1][arg2] == null) {
                class99.field1780[var13][arg1][arg2] = new class208(var13, arg1, arg2);
            }
        }
        class99.field1780[arg0][arg1][arg2].field3641 = var12;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljd;II)Ljd;")
    public final class85 method1648(class85 arg0, int arg1, int arg2) {
        field4173++;
        if (this.field4166 == null) {
            return arg0;
        }
        if (arg1 < 19) {
            field4178 = -65;
        }
        class79 var4 = (class79) this.field4166.method1398(1, (long) arg2);
        return var4 == null ? arg0 : var4.field1444;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
    public static void method1649(boolean arg0) {
        field4179 = null;
        field4175 = null;
        if (!arg0) {
            field4179 = null;
        }
        field4168 = null;
        field4165 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lik;II)V")
    private final void method1650(class247 arg0, int arg1, int arg2) {
        field4176++;
        if (arg2 != 0) {
            field4179 = null;
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method1711((byte) -67);
        if (this.field4166 == null) {
            int var5 = class113.method804(var4, 103);
            this.field4166 = new class204(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1711((byte) -67) == 1;
            int var8 = arg0.method1691(arg2 ^ 0x4BBC);
            class253 var9;
            if (var7) {
                var9 = new class79(arg0.method1692(107));
            } else {
                var9 = new class105(arg0.method1712(6357));
            }
            this.field4166.method1393(var9, (long) var8, arg2 + 817);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)V")
    public static final void method1651(boolean arg0) {
        field4174++;
        class215.field3774 = new class255[class242.field4153.method478(arg0)][];
        class71.field1327 = new boolean[class242.field4153.method478(arg0)];
        if (!arg0) {
            method1654((byte) -27, true, (class129) null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI)I")
    public final int method1652(int arg0, boolean arg1, int arg2) {
        field4171++;
        if (!arg1) {
            field4175 = null;
        }
        if (this.field4166 == null) {
            return arg2;
        } else {
            class105 var4 = (class105) this.field4166.method1398(1, (long) arg0);
            return var4 == null ? arg2 : var4.field1842;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILik;)V")
    public final void method1653(int arg0, class247 arg1) {
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                if (arg0 < 49) {
                    return;
                }
                field4167++;
                return;
            }
            this.method1650(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZLdd;)V")
    public static final void method1654(byte arg0, boolean arg1, class129 arg2) {
        field4169++;
        int var3 = arg2.field2264;
        int var4 = (int) arg2.field4377;
        arg2.method1753(137);
        if (arg1) {
            class43.method304(var3, (byte) 49);
        }
        class50.method338(var3, (byte) 54);
        class255 var5 = class72.method506(var4, 0);
        if (var5 != null) {
            class16.method120((byte) -20, var5);
        }
        int var6 = class115.field2058;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class184.method1261(false, class90.field1659[var7])) {
                class141.method924(-11953, var7);
            }
        }
        if (arg0 < 21) {
            field4172 = 114;
        }
        if (class115.field2058 == 1) {
            class52.field902 = false;
            class252.method1745(class230.field3978, class102.field1812, (byte) 127, class134.field2334, class150.field2544);
        } else {
            class252.method1745(class230.field3978, class102.field1812, (byte) 122, class134.field2334, class150.field2544);
            int var8 = class180.field3092.method75(class202.field3532);
            for (int var9 = 0; var9 < class115.field2058; var9++) {
                int var10 = class180.field3092.method75(class154.method1012(-124, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class134.field2334 = var8 + 8;
            class150.field2544 = class115.field2058 * 15 + 22;
        }
        if (class129.field2267 != -1) {
            class205.method1401(1, class129.field2267, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(Z)I")
    public static final int method1655(boolean arg0) {
        field4170++;
        return arg0 ? 100 : class131.field2293;
    }
}
