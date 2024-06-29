import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class291 {

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Lwa;")
    private class366 field4223 = new class366();

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Lse;")
    private class139 field4235 = new class139();

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    private int field4232;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    private int field4231;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Ldj;")
    private class191 field4233;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4225 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "[I")
    public static int[] field4236;

    static {
        new class349("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 3)
    public static final String method1971(int arg0, int[] arg1) {
        if (arg0 < 33) {
            method1974(-120);
        }
        field4230++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class216.field3122;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class165 var5 = class321.method2132(arg1[var4], (byte) 107);
            if (var5.field2356 != -1) {
                class256 var6 = (class256) class199.field2840.method99(true, (long) var5.field2356);
                if (var6 == null) {
                    class337 var7 = class337.method2225(class15.field216, var5.field2356, 0);
                    if (var7 != null) {
                        var6 = class59.field786.method870(var7, true);
                        class199.field2840.method90(var6, (long) var5.field2356, 0);
                    }
                }
                if (var6 != null) {
                    class110.field1426[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)Lwa;", line = 65)
    public final class366 method1972(long arg0, int arg1) {
        field4220++;
        if (arg1 != 0) {
            method1971(-122, (int[]) null);
        }
        class366 var4 = (class366) this.field4233.method1373(arg0, -61);
        if (var4 != null) {
            this.field4235.method1055(var4, arg1 ^ 0x79);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 92)
    public static final void method1973(String arg0, int arg1) {
        System.out.println("Error: " + class354.method2320("%0a", -1, "\n", arg0));
        field4221++;
        if (arg1 != 30) {
            method1973((String) null, -111);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 108)
    public static final void method1974(int arg0) {
        if (class59.field786 != null) {
            class147.field2188.method1083((byte) -96);
            class204.method1430();
            class276.method1879((byte) 94);
            class255.method1770((byte) 6);
            class381.method2428((byte) 71);
            class347.method2278(113);
            if (class429.field6097 != null) {
                class429.field6097.method2169(116);
            }
            class332.method2181(-2548);
            class166.method1198(-22156);
            class65.method416(-16777216);
            class431.method2693(false, -1);
            class264.method1815(1);
            for (int var1 = 0; var1 < 2048; var1++) {
                class128 var5 = class243.field3596[var1];
                if (var5 != null) {
                    var5.field4600 = null;
                    for (int var6 = 0; var6 < var5.field4597.length; var6++) {
                        var5.field4597[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class442.field6317.length; var2++) {
                class446 var3 = class442.field6317[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4597.length; var4++) {
                        var3.field4597[var4] = null;
                    }
                }
            }
            class59.field786.method1831((byte) 108);
            class59.field786 = null;
        }
        field4222++;
        if (arg0 <= 45) {
            field4228 = 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lwa;JZ)V", line = 183)
    public final void method1975(class366 arg0, long arg1, boolean arg2) {
        if (arg2) {
            this.field4223 = null;
        }
        if (this.field4232 == 0) {
            class366 var5 = this.field4235.method1054((byte) -68);
            var5.method2660((byte) 120);
            var5.method2365(true);
            if (this.field4223 == var5) {
                class366 var6 = this.field4235.method1054((byte) -68);
                var6.method2660((byte) 119);
                var6.method2365(true);
            }
        } else {
            this.field4232--;
        }
        field4224++;
        this.field4233.method1376(arg0, arg1, 88);
        this.field4235.method1055(arg0, -101);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 217)
    public final void method1976(byte arg0) {
        field4226++;
        this.field4235.method1056(11281);
        this.field4233.method1382((byte) 47);
        this.field4223 = new class366();
        this.field4232 = this.field4231;
        if (arg0 < 19) {
            this.field4232 = 23;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V", line = 289)
    public class291(int arg0) {
        this.field4232 = arg0;
        this.field4231 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4233 = new class191(var2);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 246)
    public static void method1977(byte arg0) {
        if (arg0 != 66) {
            field4236 = null;
        }
        field4236 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lvq;BIIZILug;)V", line = 262)
    public static final void method1978(class269 arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, class335 arg6) {
        field4229++;
        if (arg4) {
            class25.field317.method1772((class24.field307 - class25.field317.method83()) / 2, (class316.field4643 - class25.field317.method75()) / 2);
            class231.field3418.method1772((class24.field307 - class231.field3418.method83()) / 2, 18);
        }
        arg6.method2194(-21811, arg5, class316.field4643 / 2 - 26, class317.field4656 == 1 ? class410.field5884.method2284((byte) -79, class309.field4497) : class145.field2172.method2284((byte) 111, class309.field4497), -1, class24.field307 / 2);
        int var7 = class316.field4643 / 2 - 18;
        arg0.method983(class24.field307 / 2 - 152, var7, 304, 34, arg2, 0);
        if (arg1 <= -109) {
            arg0.method983(class24.field307 / 2 - 151, var7 + 1, 302, 32, 0, 0);
            arg0.method1012(class24.field307 / 2 - 150, var7 - -2, class285.field4142 * 3, 30, arg3, 0);
            arg0.method1012(class24.field307 / 2 + (class285.field4142 * 3) - 150, var7 + 2, 300 - class285.field4142 * 3, 30, 0, 0);
            arg6.method2194(-21811, arg5, class316.field4643 / 2 + 4, class413.field5905, -1, class24.field307 / 2);
        }
    }
}
