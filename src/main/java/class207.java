import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class207 extends class92 {

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "Led;")
    public static class43 field4045 = class191.method1219("gr-Un:", false);

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "Led;")
    public static class43 field4052 = class191.method1219("Willkommen auf RuneScape", false);

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "Led;")
    private static class43 field4049 = class191.method1219("Sorry invited players only)3", false);

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "Led;")
    public static class43 field4047 = field4049;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "Lbf;")
    public static class17 field4044 = new class17(32);

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
    public static int field4054 = 0;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "Led;")
    public static class43 field4055 = class191.method1219("Benutzen Sie bitte eine andere Welt)3", false);

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "[Lnb;")
    public static class120[] field4053;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lga;IILga;I)Lwc;")
    public static final class202 method1340(class58 arg0, int arg1, int arg2, class58 arg3, int arg4) {
        field4051++;
        if (arg1 > -21) {
            field4049 = null;
        }
        return class184.method1185(arg4, arg2, 100, arg0) ? method1342(arg3.method367(arg4, arg2, (byte) -34), (byte) -127) : null;
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)Lw;")
    public final class199 method593(int arg0) {
        field4050++;
        if (arg0 != 6) {
            method1343(-101);
        }
        return class2.method18(this.field4040, arg0 ^ 0x6).method286(-24, 0, this.field4046, null);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILob;)Z")
    public static final boolean method1341(int arg0, class129 arg1) {
        field4041++;
        int var2 = arg1.field2646;
        if (arg0 != 32) {
            return true;
        } else if (var2 == 205) {
            class175.field3490 = 250;
            return true;
        } else {
            if (var2 >= 300 && var2 <= 313) {
                int var3 = (var2 - 300) / 2;
                int var4 = var2 & 0x1;
                class5.field103.method473(var3, var4 == 1, arg0 ^ 0x21);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class5.field103.method461(var6 == 1, var5, true);
            }
            if (var2 == 324) {
                class5.field103.method462((byte) 1, false);
            }
            if (var2 == 325) {
                class5.field103.method462((byte) 1, true);
            }
            if (var2 == 326) {
                class59.field1194++;
                class29.field522.method338(253, 63);
                class5.field103.method468(class29.field522, (byte) -122);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BB)Lwc;")
    private static final class202 method1342(byte[] arg0, byte arg1) {
        field4043++;
        if (arg0 == null) {
            return null;
        }
        class202 var2 = new class202(arg0, class114.field2220, class66.field1328, class30.field573, class52.field1055, class17.field274, class1.field1);
        if (arg1 > -122) {
            method1340(null, 125, 20, null, -85);
        }
        class60.method382((byte) -109);
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field4052 = null;
        field4055 = null;
        field4049 = null;
        field4053 = null;
        if (arg0 != 18836) {
            field4052 = null;
        }
        field4044 = null;
        field4047 = null;
        field4045 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method1344(boolean arg0, int arg1, byte[] arg2) {
        field4042++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class47.field949) {
            try {
                class170 var3 = (class170) Class.forName("ra").getDeclaredConstructor().newInstance();
                var3.method985(arg2, 64);
                return var3;
            } catch (Throwable var4) {
                class47.field949 = true;
            }
        }
        if (arg1 != 27042) {
            method1342(null, (byte) -58);
        }
        return arg0 ? class78.method480(arg2, true) : arg2;
    }
}
