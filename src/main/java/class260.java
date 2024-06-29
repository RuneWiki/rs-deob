import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class260 extends class120 {

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field3813 = -1;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "Lbj;")
    public class146 field3808;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "Ltr;")
    public static class176 field3809;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field3809 = null;
        if (arg0 != 24720) {
            method1615(90);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
    public static final void method1616(int arg0, int arg1, int arg2) {
        field3814++;
        class470 var3 = new class470(16);
        for (class442 var4 = (class442) class269.field3928.method2769((byte) 79); var4 != null; var4 = (class442) class269.field3928.method2768((byte) -88)) {
            var4.method1510((byte) -13);
            int var5 = (int) (var4.field3568 >> 28);
            int var6 = (int) (var4.field3568 >> 14 & 0x3FFFL) - arg0;
            int var7 = (int) (var4.field3568 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class58.field758 > var7 && var6 < class287.field4181) {
                var3.method2767(-1, (long) (var6 << 14 | var5 << 28 | var7), var4);
            }
        }
        if (arg2 != -128) {
            field3812 = -36;
        }
        class269.field3928 = var3;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public static final void method1617(int arg0) {
        int var1 = 0;
        if (arg0 != 12702) {
            method1616(-125, -75, -48);
        }
        while (class442.field6125 > var1) {
            int var10002 = class242.field3621[var1]--;
            if (class242.field3621[var1] >= -10) {
                label91: {
                    class192 var3 = class318.field4614[var1];
                    if (var3 == null) {
                        var3 = class192.method1187(class258.field3769, class40.field532[var1], 0);
                        if (var3 == null) {
                            break label91;
                        }
                        class242.field3621[var1] += var3.method1189();
                        class318.field4614[var1] = var3;
                    }
                    if (class242.field3621[var1] < 0) {
                        label94: {
                            int var4;
                            if (class235.field3545[var1] == 0) {
                                var4 = class306.field4360[var1] * class314.field4438.field5798 >> 8;
                            } else {
                                int var5 = class235.field3545[var1] >> 24 & 0x3;
                                if (class492.field6935.field4319 == var5) {
                                    int var6 = (class235.field3545[var1] & 0xFF) * 128;
                                    int var7 = class235.field3545[var1] >> 16 & 0xFF;
                                    int var8 = var7 * 128 - (class492.field6935.field4331 - 64);
                                    if (var8 < 0) {
                                        var8 = -var8;
                                    }
                                    int var9 = class235.field3545[var1] >> 8 & 0xFF;
                                    int var10 = var9 * 128 + 64 - class492.field6935.field4317;
                                    if (var10 < 0) {
                                        var10 = -var10;
                                    }
                                    int var11 = var10 + var8 - 128;
                                    if (var11 > var6) {
                                        class242.field3621[var1] = -100;
                                        break label94;
                                    }
                                    if (var11 < 0) {
                                        var11 = 0;
                                    }
                                    var4 = class306.field4360[var1] * class314.field4438.field5771 * (var6 - var11) / var6 >> 8;
                                } else {
                                    var4 = 0;
                                }
                            }
                            if (var4 > 0) {
                                class352 var12 = var3.method1190().method2199(class220.field3282);
                                class12 var13 = class12.method54(var12, 100, var4);
                                var13.method57(class339.field4952[var1] - 1);
                                class59.field796.method2559(var13);
                            }
                            class242.field3621[var1] = -100;
                        }
                    }
                }
            } else {
                class442.field6125--;
                for (int var2 = var1; var2 < class442.field6125; var2++) {
                    class40.field532[var2] = class40.field532[var2 + 1];
                    class318.field4614[var2] = class318.field4614[var2 + 1];
                    class339.field4952[var2] = class339.field4952[var2 + 1];
                    class242.field3621[var2] = class242.field3621[var2 + 1];
                    class235.field3545[var2] = class235.field3545[var2 + 1];
                    class306.field4360[var2] = class306.field4360[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field3810++;
        if (class420.field5875 && !class86.method481(124)) {
            if (class314.field4438.field5794 != 0 && class268.field3923 != -1) {
                class273.method1674(class314.field4438.field5794, class360.field5189, 127, class268.field3923, false, 0);
            }
            class420.field5875 = false;
        } else if (class314.field4438.field5794 != 0 && class268.field3923 != -1 && !class86.method481(119)) {
            class278.field4087++;
            class15.method110(class413.field5817, -125);
            class225.field3415.method1744(class268.field3923, true);
            class268.field3923 = -1;
        }
    }
}
