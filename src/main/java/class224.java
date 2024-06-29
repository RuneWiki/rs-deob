import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class224 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lsc;")
    public static class181 field3869 = class149.method967(255, "not yet implemented");

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lsc;")
    public static class181 field3868 = class149.method967(255, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!l", name = "c", descriptor = "F")
    public static float field3867;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ldf;")
    public static class117 field3866;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Ljb;")
    public static class11 field3872;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lej;")
    public static class142 field3870;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
    public static final void method1478(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class137.field2237; var2++) {
            long var3 = (long) class263.field4581[var2] << 32 | 0x20000000L;
            class178 var5 = class129.field2140[class263.field4581[var2]];
            if (var5 != null && var5.method768((byte) -121) && arg1 == var5.field3117.field1024 && var5.field3117.method461(-121)) {
                int var6 = var5.field2654 >> 7;
                int var7 = var5.field2681 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field2619 == 1 && (var5.field2654 & 0x7F) == 64 && (var5.field2681 & 0x7F) == 64) {
                        if (class1.field12[var6][var7] == class94.field1505) {
                            continue;
                        }
                        class1.field12[var6][var7] = class94.field1505;
                    }
                    if (!var5.field3117.field1030) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field2622 = class232.method1606(class38.field581, (byte) -128, var5.field2681, var5.field2654);
                    class188.method1304(class38.field581, var5.field2654, var5.field2681, var5.field2622, (var5.field2619 - 1) * 64 + 60, var5, var5.field2675, var3, var5.field2632);
                }
            }
        }
        if (arg0 != 104) {
            field3868 = null;
        }
        field3873++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method1479(int arg0) {
        field3868 = null;
        field3869 = null;
        field3872 = null;
        field3870 = null;
        field3866 = null;
        if (arg0 != -480162169) {
            method1479(57);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llg;Ldg;IB)V")
    public static final void method1480(class195 arg0, class90 arg1, int arg2, byte arg3) {
        field3865++;
        byte[] var4 = null;
        class247 var5 = class194.field3398;
        synchronized (class194.field3398) {
            class131 var6 = (class131) class194.field3398.method1686((byte) -83);
            while (true) {
                if (var6 != null) {
                    if ((long) arg2 != var6.field606 || var6.field2168 != arg0 || var6.field2164 != 0) {
                        var6 = (class131) class194.field3398.method1683(140);
                        continue;
                    }
                    var4 = var6.field2165;
                }
                if (arg3 != -7) {
                    field3867 = 0.02167164F;
                }
                break;
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method1329(arg2, (byte) -128);
            arg1.method597(arg0, 255, arg2, true, var7);
        } else {
            arg1.method597(arg0, 255, arg2, true, var4);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
    public static final void method1481(byte arg0, int arg1) {
        class198.field3434.method1796(20, arg1);
        if (arg0 < 23) {
            field3868 = null;
        }
        field3871++;
    }
}
