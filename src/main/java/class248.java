import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class248 extends class18 {

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field4008 = -1;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public static int field4010 = 0;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field4020 = -1;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "Ljava/lang/String;")
    public String field4014;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "[I")
    public int[] field4007;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "[I")
    public int[] field4011;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "[Luc;")
    public class39[] field4009;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field4006;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lre;Z)Z")
    public static final boolean method1708(class228 arg0, boolean arg1) {
        field4017++;
        if (arg0.field3549 == 205) {
            class28.field383 = 250;
            return true;
        } else {
            return !arg1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZLre;I)V")
    public static final void method1709(int arg0, int arg1, boolean arg2, class228 arg3, int arg4) {
        field4019++;
        if (class53.field806 >= 3) {
            class211.method1421(arg0, arg4, 0, arg3.field3589, arg3.field3544);
        } else {
            ((class276) class41.field586).method853(arg0, arg4, arg3.field3574, arg3.field3625, class41.field586.field2874 / 2, class41.field586.field2871 / 2, (int) class16.field244, 256, arg3.field3589, arg3.field3544);
        }
        class85.field1428[arg1] = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lwc;IIII)V")
    public static final void method1710(class236 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4016++;
        if (class283.field4473 == arg0 || class128.field2018 >= 400) {
            return;
        }
        if (arg4 != 46) {
            method1709(-42, 25, true, (class228) null, 87);
        }
        String var5;
        if (arg0.field3811 == 0) {
            boolean var6 = true;
            if (class283.field4473.field3819 != -1 && arg0.field3819 != -1) {
                int var7 = arg0.field3819 <= class283.field4473.field3819 ? arg0.field3819 : class283.field4473.field3819;
                int var8 = arg0.field3821 >= class283.field4473.field3821 ? arg0.field3821 : class283.field4473.field3821;
                int var9 = var8 * 10 / 100 + var7 + 5;
                int var10 = class283.field4473.field3821 - arg0.field3821;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            String var11 = class167.field2613 == 1 ? class208.field3235 : class210.field3270;
            if (arg0.field3817 > arg0.field3821) {
                var5 = arg0.method1620(false) + (var6 ? class84.method598(arg0.field3821, class283.field4473.field3821, arg4 ^ 0xFFFFFFD1) : "<col=ffffff>") + " (" + var11 + arg0.field3821 + "+" + (arg0.field3817 - arg0.field3821) + ")";
            } else {
                var5 = arg0.method1620(false) + (var6 ? class84.method598(arg0.field3821, class283.field4473.field3821, arg4 ^ 0xFFFFFFD1) : "<col=ffffff>") + " (" + var11 + arg0.field3821 + ")";
            }
        } else {
            var5 = arg0.method1620(false) + " (" + class266.field4250 + arg0.field3811 + ")";
        }
        if (class73.field1227 == 1) {
            class117.method825(class140.field2139, arg4 - 47, class137.field2109, arg3, (long) arg1, (short) 31, class243.field3951 + " -> <col=ffffff>" + var5, arg2);
            class149.field2353++;
        } else if (!class122.field1960) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class118.field1913[var12] != null) {
                    class213.field3307++;
                    short var13 = 0;
                    if (class167.field2613 == 0 && class118.field1913[var12].equalsIgnoreCase(class286.field4534)) {
                        if (arg0.field3821 > class283.field4473.field3821) {
                            var13 = 2000;
                        }
                        if (class283.field4473.field3824 != 0 && arg0.field3824 != 0) {
                            if (class283.field4473.field3824 == arg0.field3824) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class6.field130[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class238.field3865[var12];
                    short var16 = (short) (var13 + var15);
                    class117.method825(class251.field4046[var12], -1, class118.field1913[var12], arg3, (long) arg1, var16, "<col=ffffff>" + var5, arg2);
                }
            }
        } else if ((class170.field2644 & 0x8) != 0) {
            class1.field3++;
            class117.method825(class258.field4123, -1, class37.field518, arg3, (long) arg1, (short) 46, class190.field2950 + " -> <col=ffffff>" + var5, arg2);
        }
        for (int var17 = 0; var17 < class128.field2018; var17++) {
            if (class146.field2319[var17] == 2) {
                class256.field4099[var17] = "<col=ffffff>" + var5;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILhc;)V")
    public static final void method1711(int arg0, class235 arg1) {
        field4012++;
        class250.field4030 = arg1;
        if (arg0 <= 8) {
            field4010 = 19;
        }
    }
}
