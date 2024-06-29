import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class164 extends class151 {

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lmb;")
    public static class132 field2956 = class166.method1092("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 113);

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lmb;")
    private static class132 field2965 = class166.method1092("Your ignore list is full)3 Max of 100 users)3", 119);

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Lmb;")
    public static class132 field2964 = class166.method1092("Die Verbindung konnte", 116);

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lmb;")
    public static class132 field2958 = field2965;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lmb;")
    private static class132 field2959 = class166.method1092("Existing User", 113);

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lmb;")
    public static class132 field2955 = field2959;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Lmb;")
    public static final class132 method1057(byte arg0, long arg1) {
        field2957++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != 11) {
                method1062(-36, 66);
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class237.field4289[(int) (var8 - arg1 * 37L)];
            }
            class132 var7 = new class132();
            var7.field2446 = var6;
            var7.field2479 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII[Lii;)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, class96[] arg4) {
        if (arg1 != 853933806) {
            field2964 = null;
        }
        field2967++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            class96 var6 = arg4[var5];
            if (var6 != null && var6.field1776 == arg0) {
                if (var6.field1788 == 0) {
                    var6.field1740 = var6.field1697;
                } else if (var6.field1788 == 1) {
                    var6.field1740 = arg3 - var6.field1697;
                } else if (var6.field1788 == 2) {
                    var6.field1740 = var6.field1697 * arg3 >> 14;
                } else if (var6.field1788 == 3) {
                    if (var6.field1760 == 2) {
                        var6.field1740 = (var6.field1697 - 1) * var6.field1820 + var6.field1697 * 32;
                    } else if (var6.field1760 == 7) {
                        var6.field1740 = var6.field1697 * 12 + (var6.field1697 - 1) * var6.field1820;
                    }
                }
                if (var6.field1840 == 0) {
                    var6.field1834 = var6.field1709;
                } else if (var6.field1840 == 1) {
                    var6.field1834 = (arg3 - var6.field1740) / 2 + var6.field1709;
                } else if (var6.field1840 == 2) {
                    var6.field1834 = arg3 - var6.field1740 - var6.field1709;
                } else if (var6.field1840 == 3) {
                    var6.field1834 = var6.field1709 * arg3 >> 14;
                } else if (var6.field1840 == 4) {
                    var6.field1834 = (var6.field1709 * arg3 >> 14) + (arg3 - var6.field1740) / 2;
                } else {
                    var6.field1834 = arg3 - (var6.field1709 * arg3 >> 14) - var6.field1740;
                }
                if (var6.field1742 == 0) {
                    var6.field1830 = var6.field1715;
                } else if (var6.field1742 == 1) {
                    var6.field1830 = arg2 - var6.field1715;
                } else if (var6.field1742 == 2) {
                    var6.field1830 = var6.field1715 * arg2 >> 14;
                } else if (var6.field1742 == 3) {
                    if (var6.field1760 == 2) {
                        var6.field1830 = (var6.field1715 - 1) * var6.field1712 + var6.field1715 * 32;
                    } else if (var6.field1760 == 7) {
                        var6.field1830 = var6.field1715 * 115 + (var6.field1715 - 1) * var6.field1712;
                    }
                }
                if (var6.field1695 > var6.field1833 - var6.field1740) {
                    var6.field1695 = var6.field1833 - var6.field1740;
                }
                if (var6.field1695 < 0) {
                    var6.field1695 = 0;
                }
                if (var6.field1746 == 0) {
                    var6.field1752 = var6.field1751;
                } else if (var6.field1746 == 1) {
                    var6.field1752 = (arg2 - var6.field1830) / 2 + var6.field1751;
                } else if (var6.field1746 == 2) {
                    var6.field1752 = arg2 - var6.field1830 - var6.field1751;
                } else if (var6.field1746 == 3) {
                    var6.field1752 = var6.field1751 * arg2 >> 14;
                } else if (var6.field1746 == 4) {
                    var6.field1752 = (arg2 - var6.field1830) / 2 + (var6.field1751 * arg2 >> 14);
                } else {
                    var6.field1752 = arg2 - var6.field1830 - (var6.field1751 * arg2 >> 14);
                }
                if (var6.field1800 > var6.field1744 - var6.field1830) {
                    var6.field1800 = var6.field1744 - var6.field1830;
                }
                if (var6.field1800 < 0) {
                    var6.field1800 = 0;
                }
                if (var6.field1760 == 0) {
                    class235.method1486(var6, -28715);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field2958 = null;
        field2956 = null;
        if (arg0 != 37) {
            field2955 = null;
        }
        field2965 = null;
        field2964 = null;
        field2955 = null;
        field2959 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
    public static final void method1060(boolean arg0, int arg1) {
        field2961++;
        if (class130.field2397 == null) {
            return;
        }
        try {
            class112 var2 = new class112(4);
            var2.method747(arg0 ? 2 : 3, (byte) -81);
            var2.method736(-106, 0);
            if (arg1 != 853933806) {
                method1061((byte) 33);
            }
            class130.field2397.method419(-87, var2.field2157, 0, 4);
        } catch (IOException var4) {
            try {
                class130.field2397.method423(true);
            } catch (Exception var3) {
            }
            class75.field1245++;
            class130.field2397 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    public static final void method1061(byte arg0) {
        if (arg0 < 78) {
            field2958 = null;
        }
        field2960++;
        class101.field1893.method778((byte) 107);
        class27.field432.method778((byte) 108);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
    public class164(int arg0, int arg1) {
        this.field2963 = arg0;
        this.field2966 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public static final void method1062(int arg0, int arg1) {
        class25.field405 = null;
        class88.field1545 = arg1;
        class39.field633 = 1;
        class55.field940 = -1;
        class45.field785 = false;
        class52.field881 = 0;
        field2962++;
        class65.field1065 = arg0;
    }
}
