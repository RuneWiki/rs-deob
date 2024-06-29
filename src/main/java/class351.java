import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class351 extends class102 implements class433 {

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "[S")
    public static short[] field4488 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Loi;")
    public static class169 field4484 = new class169("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[Lun;")
    public static class117[] field4491 = new class117[2048];

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[C")
    public static char[] field4494 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Loi;")
    public static class169 field4492 = new class169("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Ldn;")
    public static class201 field4485;

    static {
        new class169("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lbt;I)Ldw;", line = 3)
    public static final class96 method2061(class88 arg0, int arg1) {
        ++field4489;
        arg0.method617(2);
        if (arg1 >= -28) {
            method2061((class88) null, 123);
        }
        int var2 = arg0.method617(2);
        class96 var3 = class463.method2783(var2, 18376);
        var3.field1335 = arg0.method617(2);
        int var4 = arg0.method617(2);
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            int var6 = arg0.method617(2);
            var3.method31(var6, -1, arg0);
        }
        var3.method390(25);
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([BBII)V", line = 42)
    public final void method2062(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 8) {
            method2061((class88) null, -93);
        }
        ++field4490;
        this.method687(arg0, arg2, (byte) 55);
        this.field4486 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZII)I", line = 55)
    public static final int method2063(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4497;
        class378 var4 = class188.method1235(arg1, (byte) -126, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= -54) {
            return 127;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field4905.length; ++var6) {
                if (~var4.field4901[var6] == ~arg0) {
                    var5 += var4.field4905[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lgk;I[BIZ)V", line = 90)
    public class351(class463 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4486 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 99)
    public static void method2064(int arg0) {
        field4488 = null;
        field4484 = null;
        if (arg0 != 117) {
            field4485 = null;
        }
        field4491 = null;
        field4492 = null;
        field4494 = null;
        field4485 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I", line = 114)
    public final int method2065(int arg0) {
        ++field4487;
        return arg0 != -13703 ? -31 : super.field1401;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)J", line = 125)
    public final long method2066(int arg0) {
        if (arg0 >= -117) {
            return 42L;
        } else {
            ++field4496;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I", line = 136)
    public final int method2067(int arg0) {
        if (arg0 != -14964) {
            this.method2062((byte[]) null, (byte) 63, -63, 127);
        }
        ++field4493;
        return this.field4486;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 168)
    public final void method346(byte arg0) {
        ++field4483;
        if (arg0 >= -126) {
            method2064(-120);
        }
        super.field1404.method2725(this, (byte) -122);
    }
}
