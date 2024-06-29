import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class70 extends class175 {

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Li;")
    public class193 field970;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Z")
    public static boolean field966;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "[I")
    public static int[] field968;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Li;)V")
    public class70(class193 arg0) {
        this.field970 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(Z)V")
    public static void method548(boolean arg0) {
        field968 = null;
        if (arg0) {
            field968 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)V")
    public static final void method549(int arg0, int arg1, byte arg2) {
        field965++;
        int var3 = class92.field1319 * arg0 >> 8;
        if (arg1 == -1 && !class82.field1141) {
            class222.method1471((byte) -88);
        } else if (arg1 != -1 && (class88.field1212 != arg1 || !class218.method1450(-1)) && var3 != 0 && !class82.field1141) {
            class175.method1217(2, false, arg1, var3, 0, false, class198.field3188);
        }
        if (arg2 != 87) {
            field966 = true;
        }
        class88.field1212 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
    public static final int method550(byte arg0) {
        field971++;
        if (arg0 >= -37) {
            method551(-51, -71, -55, -35, -68);
        }
        return ((class92.field1319 == 0 ? 0 : 1) << 21) + ((class153.field2469 == 0 ? 0 : 1) << 20) + ((class195.field3161 ? 1 : 0) << 19) + ((class28.field339 ? 1 : 0) << 13) + (class96.field1454 & 0x3 << 11) + ((class9.field138 ? 1 : 0) << 9) + ((class96.field1442 ? 1 : 0) << 8) + (((class168.field2735 ? 1 : 0) << 6) + ((class38.field468 ? 1 : 0) << 4) + (class257.field4109 & 0x7) + ((class185.field2970 ? 1 : 0) << 3) - (-((class205.field3279 ? 1 : 0) << 5) - (((class183.field2928 ? 1 : 0) << 7) + ((class22.field270 ? 1 : 0) << 10) - -((class133.field2207 ? 1 : 0) << 15) - -((class235.field3744 ? 1 : 0) << 16)) + -(class105.field1819 << 17) + -((class45.field548 == 0 ? 0 : 1) << 22)) - -(class4.method29() << 23));
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
    public static final void method551(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field964++;
        for (class54 var5 = (class54) class76.field1041.method365(3); var5 != null; var5 = (class54) class76.field1041.method372((byte) 7)) {
            class274.method1845(arg0, arg3, arg4, var5, (byte) -86, arg1);
        }
        for (class54 var6 = (class54) class128.field2141.method365(arg2 ^ 0x3); var6 != null; var6 = (class54) class128.field2141.method372((byte) 7)) {
            byte var11 = 1;
            class177 var12 = var6.field750.method375(arg2);
            if (var6.field750.field659 == var12.field2862) {
                var11 = 0;
            } else if (var6.field750.field659 == var12.field2831 || var6.field750.field659 == var12.field2865 || var6.field750.field659 == var12.field2838 || var6.field750.field659 == var12.field2856) {
                var11 = 2;
            } else if (var6.field750.field659 == var12.field2858 || var6.field750.field659 == var12.field2852 || var6.field750.field659 == var12.field2847 || var6.field750.field659 == var12.field2834) {
                var11 = 3;
            }
            if (var6.field761 != var11) {
                int var13 = class9.method58(var6.field750, false);
                if (var6.field759 != var13) {
                    if (var6.field749 != null) {
                        class215.field3464.method454(var6.field749);
                        var6.field749 = null;
                    }
                    var6.field759 = var13;
                }
                var6.field761 = var11;
            }
            var6.field751 = var6.field750.field614;
            var6.field762 = var6.field750.field614 + var6.field750.method385((byte) -107) * 64;
            var6.field752 = var6.field750.field613;
            var6.field766 = var6.field750.field613 + var6.field750.method385((byte) -121) * 64;
            class274.method1845(arg0, arg3, arg4, var6, (byte) -62, arg1);
        }
        for (class54 var7 = (class54) class189.field3018.method465((byte) -115); var7 != null; var7 = (class54) class189.field3018.method461((byte) -13)) {
            class177 var8 = var7.field768.method375(0);
            byte var9 = 1;
            if (var7.field768.field659 == var8.field2862) {
                var9 = 0;
            } else if (var7.field768.field659 == var8.field2831 || var7.field768.field659 == var8.field2865 || var7.field768.field659 == var8.field2838 || var7.field768.field659 == var8.field2856) {
                var9 = 2;
            } else if (var7.field768.field659 == var8.field2858 || var7.field768.field659 == var8.field2852 || var7.field768.field659 == var8.field2847 || var7.field768.field659 == var8.field2834) {
                var9 = 3;
            }
            if (var7.field761 != var9) {
                int var10 = class142.method966((byte) -125, var7.field768);
                if (var7.field759 != var10) {
                    if (var7.field749 != null) {
                        class215.field3464.method454(var7.field749);
                        var7.field749 = null;
                    }
                    var7.field759 = var10;
                }
                var7.field761 = var9;
            }
            var7.field751 = var7.field768.field614;
            var7.field762 = var7.field768.field614 + (var7.field768.method385((byte) 80) * 64);
            var7.field752 = var7.field768.field613;
            var7.field766 = var7.field768.field613 + (var7.field768.method385((byte) 102) * 64);
            class274.method1845(arg0, arg3, arg4, var7, (byte) -107, arg1);
        }
        if (arg2 != 0) {
            method551(-69, 20, 25, -54, -2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
    public static final void method552(byte arg0, int arg1) {
        if (arg0 >= 92) {
            class87.field1187.method1832(arg1, (byte) 64);
            field967++;
        }
    }
}
