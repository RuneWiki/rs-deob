import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class67 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lv;")
    private class77 field971 = new class77();

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lad;")
    private class342 field982 = new class342();

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Ls;")
    private class196 field986;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field976 = -1;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/lang/String;")
    public static String field980 = "Loading config - ";

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field981 = -1;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lth;")
    public static class57 field972 = new class57(4);

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Ljava/util/Calendar;")
    public static Calendar field985 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!g", name = "v", descriptor = "[I")
    public static int[] field988 = new int[4096];

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/lang/String;")
    public static String field987 = "Unable to find ";

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lok;")
    public static class120 field977;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lag;")
    public static class215 field973;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 16)
    public final void method545(byte arg0) {
        if (arg0 != -82) {
            return;
        }
        field969++;
        this.field982.method2392((byte) 87);
        this.field986.method1410(-118);
        this.field971 = new class77();
        this.field984 = this.field983;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)Lmg;", line = 40)
    public final class117 method546(byte arg0) {
        field974++;
        int var2 = 12 / ((-arg0 - 21) / 52);
        return this.field986.method1406(0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JILv;)V", line = 52)
    public final void method547(long arg0, int arg1, class77 arg2) {
        if (~this.field984 == arg1) {
            class77 var5 = this.field982.method2390((byte) 103);
            var5.method876(8);
            var5.method627(0);
            if (this.field971 == var5) {
                class77 var6 = this.field982.method2390((byte) 103);
                var6.method876(8);
                var6.method627(0);
            }
        } else {
            this.field984--;
        }
        this.field986.method1400(arg0, 105, arg2);
        field968++;
        this.field982.method2385(arg2, arg1 ^ 0xFFFFFFF1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBI)V", line = 82)
    public static final void method548(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 27) {
            field972 = (class57) null;
        }
        if (class38.field565 != 0 && arg4 != 0 && class194.field2821 < 50 && arg0 != -1) {
            class186.field2668[class194.field2821] = arg0;
            class300.field4489[class194.field2821] = arg4;
            class214.field3141[class194.field2821] = arg1;
            class276.field4188[class194.field2821] = null;
            class225.field3396[class194.field2821] = 0;
            class344.field5322[class194.field2821] = arg2;
            class194.field2821++;
        }
        field967++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 105)
    public static final void method549(int arg0) {
        class119.field1668.method462(arg0 ^ 0x2096);
        field975++;
        if (arg0 != 8334) {
            field981 = -10;
        }
        class167.field2414.method462(24);
        class124.field1801.method462(24);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Lmg;", line = 123)
    public final class117 method550(int arg0) {
        field979++;
        if (arg0 != -16723) {
            field980 = (String) null;
        }
        return this.field986.method1404(-103);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)Lv;", line = 136)
    public final class77 method551(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method547(-29L, -53, (class77) null);
        }
        field978++;
        class77 var4 = (class77) this.field986.method1405(arg1, false);
        if (var4 != null) {
            this.field982.method2385(var4, 14);
        }
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)I", line = 162)
    public static final int method552(int arg0) {
        if (arg0 == -1) {
            field970++;
            return class290.field4388;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V", line = 174)
    public static void method553(int arg0) {
        field987 = null;
        field988 = null;
        field972 = null;
        field985 = null;
        field980 = null;
        field973 = null;
        if (arg0 == 0) {
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V", line = 219)
    public class67(int arg0) {
        this.field983 = arg0;
        this.field984 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field986 = new class196(var2);
    }
}
