import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class27 extends class19 {

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Lsd;")
    public static class166 field465 = class135.method935("me", 0);

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field470 = 1;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "Lsd;")
    public static class166 field480 = class135.method935(" Sekunde(Xn(Y -Ubertragen)3", 0);

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "Lsd;")
    public class166 field475;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "Lf;")
    public static class47 field467;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[I")
    public int[] field469;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "[I")
    public int[] field473;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "[Lsd;")
    public class166[] field477;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lnf;BIII)V")
    public static final void method200(class123 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field481++;
        if (class41.field728 == arg0 || class160.field3064 >= 400) {
            return;
        }
        class166 var5;
        if (arg0.field2409 == 0) {
            var5 = class22.method148(new class166[] { arg0.field2412, class159.method1083(class41.field728.field2421, arg0.field2421, -4), class51.field930, class134.field2599, class174.method1192(false, arg0.field2421), class45.field805 }, arg1 ^ 0x7E);
        } else {
            var5 = class22.method148(new class166[] { arg0.field2412, class51.field930, class105.field2055, class174.method1192(false, arg0.field2409), class45.field805 }, 0);
        }
        if (class4.field73 == 1) {
            class141.field2750++;
            class72.method571(arg4, arg2, class72.field1426, class22.method148(new class166[] { class135.field2651, class172.field3296, var5 }, 0), 23, arg3, false);
        } else if (!class179.field3393) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class196.field3901[var6] != null) {
                    class9.field170++;
                    short var7 = 0;
                    boolean var8 = false;
                    if (class196.field3901[var6].method1146((byte) -105, class111.field2166)) {
                        if (class41.field728.field2421 < arg0.field2421) {
                            var7 = 2000;
                        }
                        if (class41.field728.field2417 != 0 && arg0.field2417 != 0) {
                            if (class41.field728.field2417 == arg0.field2417) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class113.field2196[var6]) {
                        var7 = 2000;
                    }
                    int var9 = class192.field3645[var6] + var7;
                    class72.method571(arg4, arg2, class196.field3901[var6], class22.method148(new class166[] { class202.field3989, var5 }, 0), var9, arg3, false);
                }
            }
        } else if ((class49.field911 & 0x8) == 8) {
            class72.method571(arg4, arg2, class102.field1988, class22.method148(new class166[] { class43.field759, class172.field3296, var5 }, 0), 44, arg3, false);
            class29.field539++;
        }
        int var10 = 0;
        if (arg1 != 126) {
            return;
        }
        while (var10 < class160.field3064) {
            if (class200.field3970[var10] == 39) {
                class182.field3462[var10] = class22.method148(new class166[] { class202.field3989, var5 }, 0);
                return;
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIIII)V")
    public static final void method201(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -121) {
            field478 = 124;
        }
        for (int var5 = 0; var5 < class91.field1788; var5++) {
            if (arg2 < class82.field1663[var5] + class22.field388[var5] && class82.field1663[var5] < arg2 + arg4 && arg3 < class38.field688[var5] + class184.field3515[var5] && arg1 + arg3 > class184.field3515[var5]) {
                class30.field556[var5] = true;
            }
        }
        field476++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method202(byte arg0) {
        int var1 = -10 / ((arg0 - 73) / 42);
        field467 = null;
        field465 = null;
        field480 = null;
    }
}
