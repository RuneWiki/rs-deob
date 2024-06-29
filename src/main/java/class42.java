import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class113 {

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "[I")
    private int[] field970 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "Z")
    public boolean field980 = false;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public int field972 = -1;

    @OriginalMember(owner = "client!ff", name = "sb", descriptor = "[S")
    private short[] field987 = new short[6];

    @OriginalMember(owner = "client!ff", name = "rb", descriptor = "[S")
    private short[] field986 = new short[6];

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field967 = 1;

    @OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lu;")
    private static class135 field990 = class87.method676((byte) -65, "purple:");

    @OriginalMember(owner = "client!ff", name = "qb", descriptor = "Lu;")
    public static class135 field985 = class87.method676((byte) -76, "null");

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "Lu;")
    public static class135 field984 = class87.method676((byte) -103, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ff", name = "yb", descriptor = "Lu;")
    private static class135 field993 = class87.method676((byte) -60, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lu;")
    public static class135 field983 = field993;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lu;")
    public static class135 field974 = field990;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "Z")
    public static boolean field979 = false;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "Lu;")
    private static class135 field973 = class87.method676((byte) -116, "Loaded config");

    @OriginalMember(owner = "client!ff", name = "Cb", descriptor = "Lu;")
    public static class135 field997 = class87.method676((byte) -75, "@or2@");

    @OriginalMember(owner = "client!ff", name = "Bb", descriptor = "I")
    public static int field996 = -1;

    @OriginalMember(owner = "client!ff", name = "Db", descriptor = "Lu;")
    public static class135 field998 = class87.method676((byte) -81, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lu;")
    public static class135 field971 = field973;

    @OriginalMember(owner = "client!ff", name = "Eb", descriptor = "Lu;")
    public static class135 field999 = class87.method676((byte) -54, "ams");

    @OriginalMember(owner = "client!ff", name = "wb", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "Lu;")
    public static class135 field976 = field990;

    @OriginalMember(owner = "client!ff", name = "Fb", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ff", name = "tb", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ff", name = "ub", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ff", name = "xb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ff", name = "zb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ff", name = "Ab", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lg;")
    public static class43 field968;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "[I")
    private int[] field978;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Lpf;")
    public final class110 method307(int arg0) {
        field988++;
        if (this.field978 == null) {
            return null;
        }
        class110[] var2 = new class110[this.field978.length];
        for (int var3 = 0; var3 < this.field978.length; var3++) {
            var2[var3] = class110.method903(class119.field2839, this.field978[var3], 0);
        }
        class110 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class110(var2, var2.length);
        }
        if (arg0 < 120) {
            return null;
        } else {
            for (int var5 = 0; var5 < 6 && this.field987[var5] != 0; var5++) {
                var4.method904(this.field987[var5], this.field986[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
    public static void method308(int arg0) {
        field993 = null;
        field971 = null;
        field998 = null;
        if (arg0 <= 37) {
            method315(false, 34);
        }
        field974 = null;
        field976 = null;
        field973 = null;
        field999 = null;
        field968 = null;
        field984 = null;
        field990 = null;
        field985 = null;
        field983 = null;
        field997 = null;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public static final void method309(int arg0) {
        field992++;
        if (!class29.field693) {
            return;
        }
        if (arg0 < 121) {
            method315(false, -102);
        }
        class148.field3686 = null;
        class29.field694 = null;
        client.field534 = null;
        class93.field2206 = null;
        class128.field3090 = null;
        class38.field879 = null;
        class152.field3742 = null;
        class80.field1893 = null;
        class29.field707 = null;
        class76.field1790 = null;
        class5.field130 = null;
        class50.field1180 = null;
        class59.field1507 = null;
        class43.field1027 = null;
        class62.field1555 = null;
        class2.field61 = null;
        class87.field2066 = null;
        class56.field1357 = null;
        class49.field1173 = null;
        class113.field2739 = null;
        class129.field3100 = null;
        class21.method158(2, (byte) 7);
        class106.method862(true, 20625);
        class29.field693 = false;
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)Lpf;")
    public final class110 method310(int arg0) {
        field995++;
        class110[] var2 = new class110[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field970[var4] != -1) {
                var2[var3++] = class110.method903(class119.field2839, this.field970[var4], 0);
            }
        }
        if (arg0 != -27118) {
            this.method312(35, (byte) -37, null);
        }
        class110 var5 = new class110(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field987[var6] != 0; var6++) {
            var5.method904(this.field987[var6], this.field986[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
    public final boolean method311(boolean arg0) {
        field981++;
        if (this.field978 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field978.length; var3++) {
            if (!class119.field2839.method341(0, this.field978[var3], -15623)) {
                var2 = false;
            }
        }
        if (arg0) {
            method315(false, -107);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLic;)V")
    private final void method312(int arg0, byte arg1, class59 arg2) {
        field982++;
        if (arg0 == 1) {
            this.field972 = arg2.method480(0);
        } else if (arg0 == 2) {
            int var4 = arg2.method480(arg1 - 24);
            this.field978 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field978[var5] = arg2.method483((byte) 24);
            }
        } else if (arg0 == 3) {
            this.field980 = true;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field987[arg0 - 40] = (short) arg2.method483((byte) 24);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field986[arg0 - 50] = (short) arg2.method483((byte) 24);
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field970[arg0 - 60] = arg2.method483((byte) 24);
        }
        if (arg1 != 24) {
            this.field986 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lic;Z)V")
    public final void method313(class59 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field977++;
        while (true) {
            int var3 = arg0.method480(0);
            if (var3 == 0) {
                return;
            }
            this.method312(var3, (byte) 24, arg0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)Z")
    public final boolean method314(int arg0) {
        field989++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field970[var3] != -1 && !class119.field2839.method341(0, this.field970[var3], arg0 ^ 0xFFFFC2F9)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
    public static final void method315(boolean arg0, int arg1) {
        field994++;
        if (arg1 == -1 || !class116.field2767[arg1]) {
            return;
        }
        class108.field2598.method321(arg1, false);
        if (class105.field2528[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class105.field2528[arg1].length; var3++) {
            if (class105.field2528[arg1][var3] != null) {
                if (class105.field2528[arg1][var3].field3564 == 2) {
                    var2 = false;
                } else {
                    class105.field2528[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class105.field2528[arg1] = null;
        }
        class116.field2767[arg1] = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lhd;")
    public static final class53 method316(int arg0, int arg1) {
        class53 var2 = (class53) class138.field3342.method239(9325, (long) arg0);
        field1000++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 6) {
            method315(true, -101);
        }
        byte[] var3 = class106.field2560.method324(0, arg0, 16);
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method407(new class59(var3), (byte) -15);
        }
        class138.field3342.method241(var4, 0, (long) arg0);
        return var4;
    }
}
