import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class219 {

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "J")
    public long field3795 = 0L;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Loh;")
    private static class258 field3786 = class153.method1046("Created gameworld", 125);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Loh;")
    public static class258 field3796 = class153.method1046(")1o", 126);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Loh;")
    public static class258 field3800 = field3786;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field3791 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field3785;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lrk;")
    public class123 field3801;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLme;)V", line = 9)
    public static final void method1484(byte arg0, class295 arg1) {
        if (arg0 >= -93) {
            field3796 = (class258) null;
        }
        class222 var2 = null;
        try {
            class116 var3 = arg1.method2069(0, "runescape");
            while (var3.field2067 == 0) {
                class237.method1628((byte) -88, 1L);
            }
            if (var3.field2067 == 1) {
                var2 = (class222) var3.field2063;
                class235 var4 = class122.method895((byte) 125);
                var2.method1502(var4.field4051, 0, (byte) -77, var4.field4066);
            }
        } catch (Exception var8) {
        }
        field3799++;
        try {
            if (var2 != null) {
                var2.method1501(true);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 47)
    public static void method1485(int arg0) {
        field3796 = null;
        if (arg0 == -1) {
            field3786 = null;
            field3800 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 60)
    public static final void method1486(boolean arg0) {
        class155.field2652 = new class12();
        field3788++;
        if (!arg0) {
            method1486(true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)I", line = 87)
    public static final int method1487(byte arg0, int arg1) {
        field3802++;
        if (arg0 > -77) {
            method1485(8);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lp;", line = 98)
    public static final class23 method1488(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3923;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BJ)V", line = 119)
    public static final void method1489(byte arg0, long arg1) {
        field3792++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -18) {
            field3796 = (class258) null;
        }
        for (int var3 = 0; var3 < class312.field5292; var3++) {
            if (class99.field1766[var3] == arg1) {
                class243.field4222++;
                class312.field5292--;
                for (int var4 = var3; var4 < class312.field5292; var4++) {
                    class306.field5198[var4] = class306.field5198[var4 + 1];
                    class291.field5009[var4] = class291.field5009[var4 + 1];
                    class20.field241[var4] = class20.field241[var4 + 1];
                    class99.field1766[var4] = class99.field1766[var4 + 1];
                    class105.field1888[var4] = class105.field1888[var4 + 1];
                    class98.field1754[var4] = class98.field1754[var4 + 1];
                }
                class69.field1188 = class182.field3259;
                class159.field2710.method885(69, -123);
                class159.field2710.method1603(arg1, -1649350304);
                break;
            }
        }
    }
}
