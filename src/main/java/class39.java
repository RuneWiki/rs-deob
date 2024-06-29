import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class39 extends class40 {

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    private int field484 = -1;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    private int field486 = -1;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
    public static int[] field489;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field487;

    static {
        new class466("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field488 = -1;
        field489 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lef;IIZ[[I)V", line = 10)
    public class39(class338 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field490 = arg2;
        super.field503.method1996(2, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class497.method2903(super.field503.field4874, arg4[var6], arg2, var6 + 34069, super.field496, arg2, 32993, (byte) 94);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field496, arg2, arg2, 0, 32993, super.field503.field4874, arg4[var7], 0);
            }
        }
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lef;II)V", line = 54)
    public class39(class338 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field490 = arg2;
        super.field503.method1996(2, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field496, arg2, arg2, 0, class217.method1344(super.field496, (byte) 127), 5121, (byte[]) null, 0);
        }
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lef;IIZ[[BI)V", line = 113)
    public class39(class338 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field490 = arg2;
        super.field503.method1996(2, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field496, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V", line = 41)
    public static void method330(int arg0) {
        int var1 = 11 / ((-29 - arg0) / 61);
        field489 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)V", line = 74)
    public static final void method331(int arg0, int arg1, byte arg2, int arg3) {
        ++field483;
        if (arg2 >= -94) {
            field488 = -20;
        }
        int var4 = class20.field269.field7671 * arg1 >> 8;
        if (~arg3 == 0 && !class486.field7122) {
            class339.method2014((byte) 118);
        } else if (~arg3 != 0 && (class173.field2570 != arg3 || !class52.method450(-13911)) && var4 != 0 && !class486.field7122) {
            class53.method458(var4, arg0, class177.field2625, -67, 0, arg3, false);
        }
        class173.field2570 = arg3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 100)
    public final void method332(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field486, this.field484, 3553, 0, 0);
        ++field485;
        this.field486 = -1;
        if (arg0 != 37) {
            field488 = 107;
        }
        this.field484 = -1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V", line = 133)
    public final void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field487;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, arg2, super.field501, arg1);
        this.field484 = arg3;
        if (arg4 == 34069) {
            this.field486 = arg0;
        }
    }
}
