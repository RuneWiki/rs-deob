import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class62 extends class45 {

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "Liv;")
    public static class64 field1077 = new class64(3, -1);

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "[[Z")
    public static boolean[][] field1078;

    static {
        new class342("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BIIII)V", line = 4)
    public static final void method534(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1081;
        if (arg0 == 60) {
            for (int var5 = 0; class100.field1650 > var5; ++var5) {
                Rectangle var6 = class362.field5483[var5];
                if (arg3 < var6.x - -var6.width && ~var6.x > ~(arg1 + arg3) && ~arg4 > ~(var6.y + var6.height) && var6.y < arg2 + arg4) {
                    class355.field5424[var5] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)[[I", line = 29)
    public final int[][] method49(int arg0, int arg1) {
        ++field1080;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            return null;
        } else {
            if (super.field833.field1888) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class259.field3768; ++var7) {
                    this.method536(var7, arg1, -7795);
                    int[][] var8 = this.method437(0, class460.field6907, 50);
                    var4[var7] = var8[0][class385.field5804];
                    var5[var7] = var8[1][class385.field5804];
                    var6[var7] = var8[2][class385.field5804];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V", line = 76)
    public class62() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V", line = 79)
    public static final void method535(int arg0) {
        class419.field6268 = null;
        class45.field843 = null;
        class228.field3248 = null;
        class35.field675 = null;
        class464.field6944 = null;
        class377.field5711 = null;
        ++field1075;
        class328.field4954 = null;
        class202.field2947 = null;
        class261.field3789 = null;
        if (arg0 != -1) {
            method535(107);
        }
        class77.field1301 = null;
        class8.field144 = null;
        class376.field5707 = null;
        class320.field4907 = null;
        class85.field1469 = null;
        class414.field6182 = null;
        class310.field4726 = null;
        class399.field6021 = null;
        class491.field7266 = null;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(III)V", line = 108)
    private final void method536(int arg0, int arg1, int arg2) {
        ++field1079;
        int var4 = class69.field1199[arg0];
        int var5 = class433.field6429[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class385.field5804 = arg0;
            class460.field6907 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class385.field5804 = arg1;
            class460.field6907 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class460.field6907 = arg0;
            class385.field5804 = -arg1 + class259.field3768;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class460.field6907 = class457.field6849 - arg1;
            class385.field5804 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class460.field6907 = -arg1 + class457.field6849;
            class385.field5804 = class259.field3768 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class385.field5804 = -arg1 + class259.field3768;
            class460.field6907 = class457.field6849 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class460.field6907 = -arg0 + class457.field6849;
            class385.field5804 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class385.field5804 = -arg0 + class259.field3768;
            class460.field6907 = arg1;
        }
        class385.field5804 &= class290.field4128;
        if (arg2 != -7795) {
            field1082 = -72;
        }
        class460.field6907 &= class506.field7463;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[I", line = 182)
    public final int[] method35(int arg0, int arg1) {
        ++field1076;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field854.field1928) {
                for (int var4 = 0; var4 < class259.field3768; ++var4) {
                    this.method536(var4, arg1, -7795);
                    int[] var5 = this.method434(0, class460.field6907, 113);
                    var3[var4] = var5[class385.field5804];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V", line = 215)
    public static void method537(boolean arg0) {
        field1077 = null;
        if (!arg0) {
            method534((byte) -47, -99, 8, -128, 8);
        }
        field1078 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lcu;II)V", line = 227)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field844 = arg0.method1063((byte) -100) == 1;
        }
        ++field1074;
        if (arg1 != -26471) {
            field1077 = null;
        }
    }
}
