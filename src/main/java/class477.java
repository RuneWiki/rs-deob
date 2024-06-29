import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class477 extends class443 {

    @OriginalMember(owner = "client!au", name = "w", descriptor = "Z")
    public volatile boolean field6814 = true;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "Ldg;")
    public static class20 field6813 = new class20();

    @OriginalMember(owner = "client!au", name = "A", descriptor = "Loh;")
    public static class549 field6818 = null;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "Lfea;")
    public static class47 field6816 = new class47();

    @OriginalMember(owner = "client!au", name = "B", descriptor = "Lep;")
    public static class380 field6819;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "Lha;")
    public static class116 field6821;

    // $FF: synthetic field
    @OriginalMember(owner = "client!au", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6822;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Z")
    public boolean field6811;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Z")
    public boolean field6817;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "[Lraa;")
    public static class624[] field6820;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
    public abstract int method2525(int arg0);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILgm;)V")
    public static final void method2757(int arg0, class127 arg1) {
        field6815++;
        if (class277.field4051 == null) {
            return;
        }
        if (arg0 != -16668) {
            method2759(-12, (byte) 120, 6);
        }
        class231 var2 = null;
        if (arg1.field2071 == 0) {
            var2 = (class231) class507.method2859(arg1.field2078, arg1.field2074, arg1.field2073);
        }
        if (arg1.field2071 == 1) {
            var2 = (class231) class485.method2786(arg1.field2078, arg1.field2074, arg1.field2073);
        }
        if (arg1.field2071 == 2) {
            var2 = (class231) class460.method2691(arg1.field2078, arg1.field2074, arg1.field2073, field6822 == null ? (field6822 = method2760("p")) : field6822);
        }
        if (arg1.field2071 == 3) {
            var2 = (class231) class621.method3504(arg1.field2078, arg1.field2074, arg1.field2073);
        }
        if (var2 == null) {
            arg1.field2076 = 0;
            arg1.field2081 = 0;
            arg1.field2084 = -1;
        } else {
            arg1.field2084 = var2.method264(-25792);
            arg1.field2081 = var2.method269(-13265);
            arg1.field2076 = var2.method258((byte) -36);
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)[B")
    public abstract byte[] method2526(int arg0);

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)V")
    public static void method2758(int arg0) {
        field6818 = null;
        field6820 = null;
        field6816 = null;
        if (arg0 != -29799) {
            method2757(92, null);
        }
        field6821 = null;
        field6813 = null;
        field6819 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IBI)B")
    public static final byte method2759(int arg0, byte arg1, int arg2) {
        field6812++;
        if (arg2 == 9) {
            if (arg1 != 79) {
                field6819 = null;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2760(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class567("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field6819 = new class380();
    }
}
