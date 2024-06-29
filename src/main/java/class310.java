import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class310 {

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3972 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLya;)V", line = 4)
    public static final void method1809(byte arg0, class38 arg1) {
        field3968++;
        if (arg0 != -92) {
            method1810(102, 31);
        }
        arg1.method330(0, 0, class174.field2262, 350);
        arg1.method308(0, 0, class174.field2262, 350, class294.field3760 << 24 | 0x332277, 1);
        int var2 = 350 / class346.field4446;
        if (class488.field7109 > 0) {
            int var3 = 346 - class346.field4446 - 4;
            int var4 = var2 * var3 / (class488.field7109 + var2 - 1);
            int var5 = 4;
            if (class488.field7109 > 1) {
                var5 += (class488.field7109 - class520.field7512 - 1) * (var3 - var4) / (class488.field7109 - 1);
            }
            arg1.method308(class174.field2262 - 16, var5, 12, var4, class294.field3760 << 24 | 0x332277, 2);
            for (int var6 = class520.field7512; (class520.field7512 + var2) > var6 && class488.field7109 > var6; var6++) {
                String[] var7 = class335.method1937(arg0 - 33, class99.field1199[var6], '\b');
                int var8 = (class174.field2262 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method330(var10, 0, var10 + var8 - 8, 350);
                    class460.field6579.method1849(var10, -1, false, var7[var9], -16777216, 348 - (class383.field5049 + class159.field2030.field3824 + ((-class520.field7512 + var6) * class346.field4446)));
                }
            }
        }
        arg1.method330(0, 0, class174.field2262, 350);
        arg1.method373(class174.field2262, 0, 1, -1, 350 - class383.field5049);
        class91.field1116.method1849(10, -1, false, "--> " + class113.field1505, -16777216, 349 - class274.field3437.field3824);
        int var11 = -1;
        if (class163.field2065 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method323(12, arg0 ^ 0xFFFFFFA5, class274.field3437.method1757((byte) -125, "--> " + class113.field1505.substring(0, class232.field2965)) + 10, 350 - class274.field3437.field3824 + -11, var11);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lhd;", line = 68)
    public static final class523 method1810(int arg0, int arg1) {
        field3969++;
        if (arg1 != 1182823664) {
            return null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class293.field3725[var2] == null || class293.field3725[var2][var3] == null) {
            boolean var4 = class450.method2649(var2, 21182);
            if (!var4) {
                return null;
            }
        }
        return class293.field3725[var2][var3];
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 98)
    public static void method1811(int arg0) {
        field3972 = null;
        int var1 = 33 % ((arg0 + 9) / 47);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)V", line = 108)
    public static final void method1812(int arg0, int arg1, int arg2) {
        field3970++;
        class153 var3 = class75.method656(7, 255, arg0);
        var3.method1003((byte) -99);
        int var4 = 49 % ((arg2 - 29) / 42);
        var3.field1933 = arg1;
    }
}
