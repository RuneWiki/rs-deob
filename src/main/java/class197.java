import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class197 extends class499 {

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "Lfg;")
    public static class83 field2839;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "F")
    public static float field2842;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            field2839 = null;
        }
        field2836++;
        if (class54.field753 < arg5 || class343.field4727 > arg3) {
            return;
        }
        boolean var6;
        if (class382.field5379 > arg0) {
            var6 = false;
            arg0 = class382.field5379;
        } else if (arg0 <= class175.field2497) {
            var6 = true;
        } else {
            var6 = false;
            arg0 = class175.field2497;
        }
        boolean var7;
        if (arg2 < class382.field5379) {
            arg2 = class382.field5379;
            var7 = false;
        } else if (class175.field2497 < arg2) {
            arg2 = class175.field2497;
            var7 = false;
        } else {
            var7 = true;
        }
        if (arg5 >= class343.field4727) {
            class419.method2511(class225.field3174[arg5++], arg0, arg1, arg2, 102);
        } else {
            arg5 = class343.field4727;
        }
        if (arg3 <= class54.field753) {
            class419.method2511(class225.field3174[arg3--], arg0, arg1, arg2, -31);
        } else {
            arg3 = class54.field753;
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg3; var8++) {
                int[] var9 = class225.field3174[var8];
                var9[arg0] = var9[arg2] = arg1;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg5; var10 <= arg3; var10++) {
                class225.field3174[var10][arg0] = arg1;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg5; var11 <= arg3; var11++) {
                class225.field3174[var11][arg2] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field2839 = null;
        if (arg0 != 0) {
            field2842 = 0.6474614F;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
    public static final void method1221(int arg0, int arg1) {
        class504.field7413.method61((byte) -67, arg0);
        if (arg1 != 1023) {
            field2839 = null;
        }
        field2832++;
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)I")
    public final int method1222(int arg0) {
        field2837++;
        if (arg0 != 24805) {
            field2842 = -0.4626494F;
        }
        return class109.method708(this.field2833, arg0 ^ 0xFFFF9F37);
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)Z")
    public final boolean method1223(int arg0) {
        field2831++;
        if (arg0 != 3091573) {
            this.field2833 = 1;
        }
        return (this.field2833 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Z")
    public final boolean method1224(int arg0) {
        field2841++;
        if (arg0 != 26591) {
            method1219(-20, 74, 122, 25, false, -92);
        }
        return (this.field2833 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)Z")
    public final boolean method1225(byte arg0) {
        if (arg0 == -62) {
            field2834++;
            return (this.field2833 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)Z")
    public final boolean method1226(int arg0, int arg1) {
        if (arg0 != -18308) {
            this.field2833 = -102;
        }
        field2830++;
        return (this.field2833 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(II)V")
    public class197(int arg0, int arg1) {
        this.field2835 = arg1;
        this.field2833 = arg0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)I")
    public final int method1227(boolean arg0) {
        field2840++;
        return arg0 ? (this.field2833 & 0x1F5AA9) >> 18 : -3;
    }

    static {
        new class83("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field2839 = new class83("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
        new class83("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
