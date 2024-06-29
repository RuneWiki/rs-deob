import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class275 {

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field4261 = -1;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4254 = "Loading title screen - ";

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4256 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lke;")
    public static class110 field4264;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lhc;")
    public static class235 field4258;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lql;B)Lp;")
    public static final class292 method1834(class224 arg0, byte arg1) {
        if (arg1 > -89) {
            method1837(-98);
        }
        field4252++;
        return new class292(arg0.method1479(false), arg0.method1479(false), arg0.method1479(false), arg0.method1479(false), arg0.method1454(-116), arg0.method1454(-60), arg0.method1453((byte) -127));
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lhc;BLhc;)V")
    public static final void method1835(class235 arg0, byte arg1, class235 arg2) {
        field4249++;
        class69.field938 = arg2;
        class159.field2223 = arg0;
        int var3 = -35 % ((arg1 + 13) / 41);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)I")
    public static final int method1836(int arg0, int arg1, int arg2, int arg3) {
        field4248++;
        if (class200.field2788 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class230.field3489[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var7) * class200.field2788[var6][var4][var5] + (class200.field2788[var6][var4 + 1][var5] * var7) >> 7;
        int var10 = (128 - var7) * class200.field2788[var6][var4][var5 + 1] + class200.field2788[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var11 = -114 % ((arg3 + 53) / 44);
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1837(int arg0) {
        if (arg0 > 41) {
            field4254 = null;
            field4258 = null;
            field4264 = null;
            field4256 = null;
        }
    }
}
