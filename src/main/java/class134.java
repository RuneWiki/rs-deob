import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class134 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lmb;")
    private static class84 field3200 = class79.method672(true, "Loaded sprites");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lmb;")
    public static class84 field3205 = field3200;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lmb;")
    public static class84 field3203 = class79.method672(true, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3206 = -1;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lmb;")
    public static class84 field3209 = class79.method672(true, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lmb;")
    public static class84 field3210 = class79.method672(true, "null");

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3204 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lmb;")
    private static class84 field3212 = class79.method672(true, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lmb;")
    public static class84 field3215 = class79.method672(true, "Weiter");

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lmb;")
    public static class84 field3214 = field3212;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lmb;")
    public static class84 field3216 = class79.method672(true, "Neuer Benutzer");

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "[I")
    public static int[] field3213;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1073(byte arg0) {
        field3213 = null;
        field3210 = null;
        field3212 = null;
        field3203 = null;
        field3200 = null;
        field3204 = null;
        field3216 = null;
        if (arg0 == 28) {
            field3215 = null;
            field3205 = null;
            field3214 = null;
            field3209 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ[B)Lmb;")
    public static final class84 method1074(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field3202++;
        class84 var4 = new class84();
        var4.field2062 = 0;
        var4.field2058 = new byte[arg0];
        if (!arg2) {
            method1074(-24, 101, true, null);
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field2058[var4.field2062++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[Lsc;")
    public static final class121[] method1075(int arg0) {
        field3207++;
        class121[] var1 = new class121[class80.field1989];
        int var2 = 0;
        if (arg0 >= -100) {
            method1074(-70, -66, true, null);
        }
        while (class80.field1989 > var2) {
            class121 var3 = var1[var2] = new class121();
            var3.field2897 = class80.field1991;
            var3.field2901 = class58.field1452;
            var3.field2900 = class107.field2599[var2];
            var3.field2899 = field3213[var2];
            var3.field2904 = class133.field3162[var2];
            var3.field2898 = class125.field3032[var2];
            var3.field2902 = class11.field181;
            var3.field2903 = client.field459[var2];
            var2++;
        }
        class115.method944(-89);
        return var1;
    }
}
