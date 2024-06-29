import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class217 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Luf;")
    private static class168 field3536 = class148.method1019(-1720, "Prepared sound engine");

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Luf;")
    public static class168 field3539 = field3536;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lk;")
    public static class36 field3537 = new class36(128);

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Luf;")
    private static class168 field3543 = class148.method1019(-1720, "glow2:");

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Luf;")
    public static class168 field3544 = field3543;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Luf;")
    public static class168 field3546 = field3543;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Luf;")
    private static class168 field3547 = class148.method1019(-1720, "Choose Option");

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Luf;")
    public static class168 field3548 = field3547;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[B)V", line = 9)
    public static final void method1505(int arg0, byte[] arg1) {
        class153 var2 = new class153(arg1);
        var2.field2367 = arg1.length + arg0;
        class201.field3305 = var2.method1069(arg0 + 45);
        class205.field3374 = new int[class201.field3305];
        class78.field1086 = new boolean[class201.field3305];
        class254.field4341 = new int[class201.field3305];
        class303.field5115 = new byte[class201.field3305][];
        class214.field3490 = new int[class201.field3305];
        field3533++;
        class236.field3779 = new byte[class201.field3305][];
        class154.field2430 = new int[class201.field3305];
        var2.field2367 = arg1.length - class201.field3305 * 8 - 7;
        class56.field724 = var2.method1069(32);
        class206.field3381 = var2.method1069(120);
        int var3 = (var2.method1042((byte) 127) & 0xFF) + 1;
        for (int var4 = 0; var4 < class201.field3305; var4++) {
            class154.field2430[var4] = var2.method1069(121);
        }
        for (int var5 = 0; var5 < class201.field3305; var5++) {
            class254.field4341[var5] = var2.method1069(38);
        }
        for (int var6 = 0; var6 < class201.field3305; var6++) {
            class205.field3374[var6] = var2.method1069(81);
        }
        for (int var7 = 0; var7 < class201.field3305; var7++) {
            class214.field3490[var7] = var2.method1069(55);
        }
        var2.field2367 = arg1.length - ((var3 - 1) * 3) - (class201.field3305 * 8) - 7;
        class123.field1905 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class123.field1905[var8] = var2.method1088(-30917);
            if (class123.field1905[var8] == 0) {
                class123.field1905[var8] = 1;
            }
        }
        var2.field2367 = 0;
        for (int var9 = 0; var9 < class201.field3305; var9++) {
            int var10 = class205.field3374[var9];
            boolean var11 = false;
            int var12 = class214.field3490[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            class236.field3779[var9] = var14;
            byte[] var15 = new byte[var13];
            class303.field5115[var9] = var15;
            int var16 = var2.method1042((byte) -118);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var13; var22++) {
                    var14[var22] = var2.method1078(-6338);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var13; var23++) {
                        byte var24 = var15[var23] = var2.method1078(-6338);
                        var11 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label87: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label87;
                            }
                            for (int var20 = 0; var20 < var12; var20++) {
                                byte var21 = var15[var10 * var20 + var19] = var2.method1078(-6338);
                                var11 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var12; var18++) {
                        var14[var17 + (var10 * var18)] = var2.method1078(-6338);
                    }
                    var17++;
                }
            }
            class78.field1086[var9] = var11;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 176)
    public static final void method1506(int arg0) {
        field3535++;
        class121.method867(5, 3961);
        if (arg0 > -58) {
            field3537 = (class36) null;
        }
        class69.method387(5, 3);
        class269.method1870(5, -19800);
        class262.method1830(5, false);
        class177.method1269(5, (byte) -86);
        class110.method816(5, (byte) -45);
        class244.method1680((byte) -128, 5);
        class219.method1517(5, true);
        class63.method361(-1, 5);
        class26.method135(0, 5);
        class15.method57(4, 5);
        class124.method882(50, -111);
        class95.method727((byte) 124, 5);
        class18.method85(1, 5);
        class276.field4640.method1428(5, 29946);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILol;I)V", line = 211)
    public static final void method1507(int arg0, int arg1, int arg2, int arg3, class113 arg4, int arg5) {
        if (arg5 > -123) {
            method1506(88);
        }
        field3538++;
        if (arg4.field1754 == -1 && arg4.field1766 == null) {
            return;
        }
        int var6 = 0;
        if (arg0 > arg4.field1765) {
            var6 += arg0 - arg4.field1765;
        } else if (arg0 < arg4.field1761) {
            var6 += arg4.field1761 - arg0;
        }
        if (arg4.field1764 < arg3) {
            var6 += arg3 - arg4.field1764;
        } else if (arg4.field1756 > arg3) {
            var6 += arg4.field1756 - arg3;
        }
        if (arg4.field1773 == 0 || (var6 - 64) > arg4.field1773 || class72.field968 == 0 || arg4.field1755 != arg1) {
            if (arg4.field1770 != null) {
                client.field4933.method1533(arg4.field1770);
                arg4.field1770 = null;
            }
            if (arg4.field1767 != null) {
                client.field4933.method1533(arg4.field1767);
                arg4.field1767 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg4.field1773 - var6) * class72.field968 / arg4.field1773;
        if (arg4.field1770 != null) {
            arg4.field1770.method1811(var7);
        } else if (arg4.field1754 >= 0) {
            class147 var8 = class147.method1014(class198.field3272, arg4.field1754, 0);
            if (var8 != null) {
                class11 var9 = var8.method1015().method38(class20.field247);
                class260 var10 = class260.method1790(var9, 100, var7);
                var10.method1787(-1);
                client.field4933.method1527(var10);
                arg4.field1770 = var10;
            }
        }
        if (arg4.field1767 != null) {
            arg4.field1767.method1811(var7);
            if (!arg4.field1767.method123((byte) -101)) {
                arg4.field1767 = null;
            }
        } else if (arg4.field1766 != null && (arg4.field1768 -= arg2) <= 0) {
            int var11 = (int) ((double) arg4.field1766.length * Math.random());
            class147 var12 = class147.method1014(class198.field3272, arg4.field1766[var11], 0);
            if (var12 != null) {
                class11 var13 = var12.method1015().method38(class20.field247);
                class260 var14 = class260.method1790(var13, 100, var7);
                var14.method1787(0);
                client.field4933.method1527(var14);
                arg4.field1768 = arg4.field1752 + ((int) ((double) (arg4.field1751 - arg4.field1752) * Math.random()));
                arg4.field1767 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 368)
    public static void method1508(byte arg0) {
        field3543 = null;
        field3548 = null;
        field3544 = null;
        field3539 = null;
        field3546 = null;
        field3537 = null;
        field3536 = null;
        field3547 = null;
        if (arg0 > -81) {
            field3541 = 88;
        }
    }
}
