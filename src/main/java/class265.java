import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class265 extends class162 {

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public int field4360 = 0;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field4365 = 0;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "Lud;")
    public static class2 field4366 = new class2();

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4368 = null;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "Lfa;")
    public static class273 field4361;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lma;II)V")
    private final void method1827(class202 arg0, int arg1, int arg2) {
        field4362++;
        if (arg1 == arg2) {
            this.field4360 = arg0.method1419(112);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
    public static final void method1828(int arg0, boolean arg1) {
        field4359++;
        class137.method914(0);
        class161.method1070(27950);
        int var2 = class163.method1080(-57, arg0).field273;
        if (!arg1) {
            method1828(-55, false);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class209.field3356[arg0];
        if (var2 == 9) {
            class35.field435 = var3;
        }
        if (var2 == 5) {
            class258.field4246 = var3;
        }
        if (var2 == 6) {
            class97.field1457 = var3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method1829(byte arg0) {
        if (arg0 <= 41) {
            method1832(-10);
        }
        field4366 = null;
        field4368 = null;
        field4361 = null;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
    public static final void method1830(int arg0) {
        field4357++;
        if (arg0 != -1) {
            return;
        }
        for (class210 var1 = (class210) class147.field2309.method1959(205); var1 != null; var1 = (class210) class147.field2309.method1956(94)) {
            if (var1.field3365 > 0) {
                var1.field3365--;
            }
            if (var1.field3365 != 0) {
                if (var1.field3372 > 0) {
                    var1.field3372--;
                }
                if (var1.field3372 == 0 && var1.field3378 >= 1 && var1.field3368 >= 1 && var1.field3378 <= 102 && var1.field3368 <= 102 && (var1.field3370 < 0 || class275.method1915(var1.field3381, 9578, var1.field3370))) {
                    class245.method1714(var1.field3374, var1.field3377, var1.field3378, var1.field3370, var1.field3381, var1.field3380, var1.field3368, (byte) 87);
                    var1.field3372 = -1;
                    if (var1.field3376 == var1.field3370 && var1.field3376 == -1) {
                        var1.method900(108);
                    } else if (var1.field3376 == var1.field3370 && var1.field3380 == var1.field3364 && var1.field3381 == var1.field3379) {
                        var1.method900(115);
                    }
                }
            } else if (var1.field3376 < 0 || class275.method1915(var1.field3379, arg0 ^ 0xFFFFDA95, var1.field3376)) {
                class245.method1714(var1.field3374, var1.field3377, var1.field3378, var1.field3376, var1.field3379, var1.field3364, var1.field3368, (byte) 87);
                var1.method900(107);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILma;)V")
    public final void method1831(int arg0, class202 arg1) {
        if (arg0 != 0) {
            this.method1831(0, (class202) null);
        }
        field4363++;
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                return;
            }
            this.method1827(arg1, arg0 + 2, var3);
        }
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
    public static final void method1832(int arg0) {
        field4364++;
        class31.field393.method144(0);
        int var1 = -30 / ((arg0 - 20) / 42);
        class201.field3195.method144(0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method1833(int arg0, int arg1, byte[] arg2, int arg3) {
        field4356++;
        int var4 = arg1;
        boolean var5 = true;
        class202 var6 = new class202(arg2);
        label54: while (true) {
            int var7 = var6.method1458((byte) 125);
            if (var7 == 0) {
                return var5;
            }
            var4 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method1450(-69);
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = arg0 + var12;
                    int var14 = var6.method1420((byte) 0) >> 2;
                    int var15 = var8 >> 6 & 0x3F;
                    int var16 = var15 + arg3;
                    if (var16 > 0 && var13 > 0 && var16 < 103 && var13 < 103) {
                        class74 var17 = class216.method1510(0, var4);
                        if (var14 != 22 || class123.field1878 || var17.field1117 != 0 || var17.field1125 == 1 || var17.field1156) {
                            var9 = true;
                            if (!var17.method482((byte) -97)) {
                                class72.field1043++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var10 = var6.method1450(-77);
                if (var10 == 0) {
                    break;
                }
                var6.method1420((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLfa;)V")
    public static final void method1834(boolean arg0, class273 arg1) {
        field4358++;
        if (class72.field1038) {
            return;
        }
        class62.method383();
        class151.field2347 = class313.method2123((byte) -112, arg1, class100.field1515);
        int var2 = class79.field1254;
        int var3 = var2 * 956 / 503;
        class151.field2347.method241((class169.field2644 - var3) / 2, 0, var3, var2);
        class147.field2312 = class100.method649(class127.field1960, arg1, (byte) 74);
        class147.field2312.method20(class169.field2644 / 2 - (class147.field2312.field1681 / 2), 18);
        class72.field1038 = arg0;
    }
}
