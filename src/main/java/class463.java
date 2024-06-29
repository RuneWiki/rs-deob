import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class463 extends OutputStream {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lco;")
    public static class210 field6522;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lec;")
    public static class40 field6527;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field6529;

    static {
        new class40("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field6522 = new class210(20);
        field6527 = new class40("red:", "rot:", "rouge:", "vermelho:");
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method2723(int arg0, byte arg1) {
        field6525++;
        class89 var2 = class146.method695(9, arg0, (byte) -34);
        int var3 = 52 % ((arg1 - 21) / 55);
        var2.method448(13);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([IZ[III)V", line = 25)
    public static final void method2724(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg0[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method2724(arg0, arg1, arg2, arg3, var6 - 1);
            method2724(arg0, true, arg2, var6 + 1, arg4);
        }
        if (!arg1) {
            field6524 = 21;
        }
        field6526++;
    }

    @OriginalMember(owner = "client!wk", name = "write", descriptor = "(I)V", line = 79)
    public final void write(int arg0) throws IOException {
        field6523++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V", line = 89)
    public static final void method2725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class275.field3914 != null) {
            class275.field3914[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class419.field6040 != null) {
            class419.field6040[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class3.field24 != null) {
            class3.field24[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I", line = 106)
    public static final int method2726(byte arg0, int arg1) {
        if (arg0 != 115) {
            method2727(true);
        }
        field6521++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 124)
    public static void method2727(boolean arg0) {
        field6527 = null;
        field6522 = null;
        if (arg0) {
            method2724((int[]) null, false, (int[]) null, 10, -2);
        }
    }
}
