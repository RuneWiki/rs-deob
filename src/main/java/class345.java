import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class345 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5011 = 0;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field5013 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lcb;")
    public static class332 field5010 = new class332();

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5014 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lck;")
    public static class419 field5016 = new class419(5000);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lbc;")
    public static class225 field5017 = new class225();

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[C")
    public static char[] field5018 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[Lka;")
    public static class303[] field5015;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method2165(int arg0) {
        field5015 = null;
        field5013 = null;
        field5016 = null;
        field5018 = null;
        field5017 = null;
        if (arg0 != 243) {
            field5011 = -80;
        }
        field5010 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBLdt;Z)V")
    public static final void method2166(int arg0, int arg1, byte arg2, class145 arg3, boolean arg4) {
        field5012++;
        int var5 = arg3.field2010;
        int var6 = arg3.field2021;
        if (arg3.field2040 == 0) {
            arg3.field2010 = arg3.field2000;
        } else if (arg3.field2040 == 1) {
            arg3.field2010 = arg1 - arg3.field2000;
        } else if (arg3.field2040 == 2) {
            arg3.field2010 = arg3.field2000 * arg1 >> 14;
        }
        if (arg3.field2006 == 0) {
            arg3.field2021 = arg3.field2042;
        } else if (arg3.field2006 == 1) {
            arg3.field2021 = arg0 - arg3.field2042;
        } else if (arg3.field2006 == 2) {
            arg3.field2021 = arg3.field2042 * arg0 >> 14;
        }
        if (arg3.field2040 == 4) {
            arg3.field2010 = arg3.field2039 * arg3.field2021 / arg3.field1997;
        }
        if (arg3.field2006 == 4) {
            arg3.field2021 = arg3.field2010 * arg3.field1997 / arg3.field2039;
        }
        if (class342.field4986 && (client.method1122(arg3).field5472 != 0 || arg3.field2073 == 0)) {
            if (arg3.field2021 < 5 && arg3.field2010 < 5) {
                arg3.field2010 = 5;
                arg3.field2021 = 5;
            } else {
                if (arg3.field2021 <= 0) {
                    arg3.field2021 = 5;
                }
                if (arg3.field2010 <= 0) {
                    arg3.field2010 = 5;
                }
            }
        }
        if (class359.field5169 == arg3.field2062) {
            class197.field2876 = arg3;
        }
        if (arg4 && arg3.field2050 != null && (arg3.field2010 != var5 || arg3.field2021 != var6)) {
            class202 var7 = new class202();
            var7.field2976 = arg3;
            var7.field2971 = arg3.field2050;
            class157.field2349.method2845(var7, (byte) 37);
        }
        int var8 = -105 % ((49 - arg2) / 51);
    }
}
