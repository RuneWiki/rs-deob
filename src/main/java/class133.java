import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class class133 {

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lgn;")
    public static class526 field1987 = new class526(11, 16);

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field1990 = -1;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Ldp;")
    public static class347 field1991 = new class347(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lum;")
    public static class83 field1984;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "()V")
    public static final void method978() {
        for (int var0 = 0; var0 < class468.field6866; var0++) {
            class522 var1 = class132.field1979[var0];
            class434.method2561(var1);
            class132.field1979[var0] = null;
        }
        class468.field6866 = 0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II[Lgo;)V")
    public static final void method979(int arg0, int arg1, class310[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class310 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4703 == 0) {
                    if (var4.field4788 != null) {
                        method979(arg0, 34037, var4.field4788);
                    }
                    class313 var5 = (class313) class312.field4840.method3059(80, (long) var4.field4643);
                    if (var5 != null) {
                        class398.method2389(arg0, var5.field4852, arg1 ^ 0x84F5);
                    }
                }
                if (arg0 == 0 && var4.field4656 != null) {
                    class120 var6 = new class120();
                    var6.field1833 = var4;
                    var6.field1832 = var4.field4656;
                    class64.method449(var6);
                }
                if (arg0 == 1 && var4.field4706 != null) {
                    if (var4.field4675 >= 0) {
                        class310 var7 = class52.method386(0, var4.field4643);
                        if (var7 == null || var7.field4788 == null || var4.field4675 >= var7.field4788.length || var7.field4788[var4.field4675] != var4) {
                            continue;
                        }
                    }
                    class120 var8 = new class120();
                    var8.field1833 = var4;
                    var8.field1832 = var4.field4706;
                    class64.method449(var8);
                }
            }
        }
        if (arg1 != 34037) {
            method980(89);
        }
        field1989++;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static void method980(int arg0) {
        field1984 = null;
        if (arg0 == 1) {
            field1987 = null;
            field1991 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLvd;I[II)Lwq;")
    public static final class283 method981(int arg0, boolean arg1, class258 arg2, int arg3, int[] arg4, int arg5) {
        field1985++;
        if (arg0 != 3553) {
            return null;
        } else if (!arg2.field3845 && (!class384.method2305(1, arg5) || !class384.method2305(1, arg3))) {
            return arg2.field3744 ? new class283(arg2, 34037, arg5, arg3, arg1, arg4) : new class283(arg2, arg5, arg3, class143.method1039(8, arg5), class143.method1039(8, arg3), arg4);
        } else {
            return new class283(arg2, 3553, arg5, arg3, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method982(String arg0, int arg1) {
        field1986++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class491.method2932((byte) 83, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class411.field6211; var3++) {
            String var4 = class60.field827[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class491.method2932((byte) 53, var4);
            if (var5 != null && var5.equals(var2)) {
                class411.field6211--;
                for (int var6 = var3; var6 < class411.field6211; var6++) {
                    class60.field827[var6] = class60.field827[var6 + 1];
                    class51.field660[var6] = class51.field660[var6 + 1];
                    class505.field7431[var6] = class505.field7431[var6 + 1];
                    class520.field7646[var6] = class520.field7646[var6 + 1];
                    class328.field5132[var6] = class328.field5132[var6 + 1];
                }
                class231.field3248 = class264.field3939;
                class4.field32++;
                class97.method758(class34.field471, false);
                class43.field559.method2754(class521.method3084(arg0, 118), 5574);
                class43.field559.method2731(arg0, (byte) -55);
                break;
            }
        }
        if (arg1 != -1) {
            method981(59, true, null, -11, null, 100);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLcm;)Lcm;")
    public abstract class438 method983(byte arg0, class438 arg1);
}
