import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class304 extends class194 {

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    private int field4621 = -1;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    private int field4625 = -1;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "Lbg;")
    public static class310 field4619;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "Z")
    public static boolean field4622;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[Lpg;")
    public static class494[] field4624;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field4623;

    static {
        new class423("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field4619 = new class310(24, 8);
        field4622 = false;
        field4624 = new class494[128];
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V", line = 10)
    public static void method1833(byte arg0) {
        if (arg0 == -100) {
            field4619 = null;
            field4624 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 21)
    public final void method1111(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field4621, this.field4625, 3553, 0, 0);
        ++field4620;
        if (arg0 <= -104) {
            this.field4625 = -1;
            this.field4621 = -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lbl;II)V", line = 35)
    public class304(class442 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field4618 = arg2;
        super.field3065.method2586(this, false);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field3067, arg2, arg2, 0, class458.method2735(super.field3067, 22775), 5121, (byte[]) null, 0);
        }
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lbl;IIZ[[I)V", line = 53)
    public class304(class442 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4618 = arg2;
        super.field3065.method2586(this, false);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class475.method2858(super.field3067, var6 + 34069, arg2, -2, super.field3065.field6807, 32993, arg2, arg4[var6]);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field3067, arg2, arg2, 0, 32993, super.field3065.field6807, arg4[var7], 0);
            }
        }
        this.method1208(true, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBII)V", line = 84)
    public final void method1834(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = -47 / ((arg2 - 21) / 46);
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg3, super.field3071, arg4);
        ++field4617;
        this.field4621 = arg0;
        this.field4625 = arg1;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lbl;IIZ[[BI)V", line = 96)
    public class304(class442 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field4618 = arg2;
        super.field3065.method2586(this, false);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field3067, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1208(true, false);
    }
}
