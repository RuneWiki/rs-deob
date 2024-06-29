import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class65 extends class417 implements class248 {

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Lnu;")
    public class417 field1109;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "Lpi;")
    public static class342 field1121 = new class342("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!al", name = "W", descriptor = "[B")
    public static byte[] field1127;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "F")
    public static float field1125;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "Lia;")
    public static class414 field1126;

    static {
        new class342("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        new class342("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1127 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIIIIIILnu;)V", line = 4)
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class417 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class116.method856(-28211, arg1, arg0));
        this.field1109 = arg10;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z", line = 15)
    public final boolean method8(int arg0) {
        field1123++;
        if (arg0 < 94) {
            this.method9(null, -37);
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I", line = 28)
    public final int method547(int arg0) {
        field1108++;
        if (arg0 != 3) {
            field1121 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 39)
    public final void method26(int arg0) {
        int var2 = -100 / ((arg0 + 46) / 44);
        field1119++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILqa;ZLto;III)V", line = 48)
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            this.method14(-32, null, 16, -126);
        }
        field1116++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;II)Lc;", line = 58)
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        field1104++;
        if (arg1 != 17793) {
            field1121 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;Lto;III)V", line = 70)
    public static final void method548(class162 arg0, class8 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class151.field2408) {
            class429 var5 = class380.field5761[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6366 != null && var5.field6366.method24(false)) {
                arg1.method18(class177.field2697, arg0, true, var5.field6366, -1, 0, 0);
            }
        }
        if (arg4 < class151.field2408) {
            class429 var6 = class380.field5761[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6366 != null && var6.field6366.method24(false)) {
                arg1.method18(0, arg0, true, var6.field6366, -1, class177.field2697, 0);
            }
        }
        if (arg3 < class151.field2408 && arg4 < class261.field3792) {
            class429 var7 = class380.field5761[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6366 != null && var7.field6366.method24(false)) {
                arg1.method18(class177.field2697, arg0, true, var7.field6366, -1, class177.field2697, 0);
            }
        }
        if (arg3 < class151.field2408 && arg4 > 0) {
            class429 var8 = class380.field5761[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6366 != null && var8.field6366.method24(false)) {
                arg1.method18(class177.field2697, arg0, true, var8.field6366, -1, -class177.field2697, 0);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I", line = 118)
    public final int method12(int arg0) {
        field1122++;
        if (arg0 != 3765) {
            field1121 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILqa;)V", line = 131)
    public final void method15(int arg0, class162 arg1) {
        field1113++;
        if (arg0 != -13300) {
            field1121 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 142)
    public static void method549(int arg0) {
        field1121 = null;
        field1126 = null;
        if (arg0 != -10562) {
            field1121 = null;
        }
        field1127 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILqa;II)Z", line = 154)
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        field1112++;
        if (arg0 != 131072) {
            this.method14(54, null, -116, 87);
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I", line = 165)
    public final int method19(byte arg0) {
        field1115++;
        if (arg0 != -69) {
            this.method12(-79);
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 176)
    public final void method22(byte arg0) {
        field1107++;
        if (arg0 != -3) {
            this.method14(-31, null, 36, 6);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lpa;III)J", line = 191)
    public static final long method550(class248 arg0, int arg1, int arg2, int arg3) {
        field1110++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class79 var10 = class319.field4807.method2874(arg0.method17((byte) 79), -17045);
        long var11 = (long) (arg0.method12(3765) << 14 | arg2 | arg1 << 7 | arg0.method19((byte) -69) << 20 | 0x40000000);
        if (var10.field1357 == 0) {
            var11 |= var8;
        }
        if (arg3 < 7) {
            method548(null, null, 127, 42, -81);
        }
        if (var10.field1331 == 1) {
            var11 |= var4;
        }
        if (var10.field1356) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method17((byte) -117) << 32;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V", line = 224)
    public static final void method551(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 177016718) {
            return;
        }
        field1118++;
        if (arg3 == 1007) {
            class437.method2609(class19.field317, arg1, arg0);
        } else if (arg3 == 1008) {
            class437.method2609(class206.field2984, arg1, arg0);
        } else if (arg3 == 1012) {
            class437.method2609(class498.field7357, arg1, arg0);
        } else if (arg3 == 1003) {
            class437.method2609(class20.field338, arg1, arg0);
        } else if (arg3 == 1009) {
            class437.method2609(class265.field3812, arg1, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;I)V", line = 255)
    public final void method9(class162 arg0, int arg1) {
        field1120++;
        if (arg1 >= -111) {
            method549(-13);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLqa;)Lae;", line = 267)
    public final class163 method13(boolean arg0, class162 arg1) {
        field1105++;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLqa;)V", line = 281)
    public final void method25(byte arg0, class162 arg1) {
        int var3 = 101 / ((-arg0 - 45) / 48);
        field1106++;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)Z", line = 290)
    public final boolean method24(boolean arg0) {
        field1117++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I", line = 301)
    public final int method17(byte arg0) {
        int var2 = 94 / ((arg0 + 60) / 40);
        field1111++;
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/lang/String;)I", line = 311)
    public static final int method552(byte arg0, String arg1) {
        field1114++;
        if (arg0 != 0) {
            method551(62, -12, -75, 119);
        }
        for (int var2 = 0; var2 < class402.field6035.length; var2++) {
            if (class402.field6035[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
