import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class259 {

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Lof;")
    private class328 field4184 = new class328(64);

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Lof;")
    public class328 field4188 = new class328(2);

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Lmn;")
    public class162 field4183;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Lmn;")
    private class162 field4180;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "Lqu;")
    public static class219 field4187;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method1764(int arg0) {
        class328 var2 = this.field4184;
        synchronized (this.field4184) {
            this.field4184.method2187(-1);
        }
        if (arg0 != 27) {
            method1769((byte) -91);
        }
        field4186++;
        class328 var3 = this.field4188;
        synchronized (this.field4188) {
            this.field4188.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Ldi;")
    public final class335 method1765(int arg0, int arg1) {
        field4182++;
        class328 var3 = this.field4184;
        class335 var4;
        synchronized (this.field4184) {
            var4 = (class335) this.field4184.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field4180;
        byte[] var6;
        synchronized (this.field4180) {
            var6 = this.field4180.method1004(33, false, arg0);
        }
        class335 var7 = new class335();
        var7.field5230 = this;
        if (var6 != null) {
            var7.method2228(new class208(var6), arg1 ^ 0xFFFFFFDE);
        }
        class328 var8 = this.field4184;
        synchronized (this.field4184) {
            if (arg1 != 64) {
                method1769((byte) -68);
            }
            this.field4184.method2188(arg1 - 191, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public final void method1766(boolean arg0) {
        class328 var2 = this.field4184;
        synchronized (this.field4184) {
            this.field4184.method2189(false);
        }
        field4179++;
        class328 var3 = this.field4188;
        synchronized (this.field4188) {
            this.field4188.method2189(arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
    public final void method1767(int arg0, byte arg1) {
        field4181++;
        class328 var3 = this.field4184;
        synchronized (this.field4184) {
            this.field4184.method2202(0, arg0);
        }
        class328 var4 = this.field4188;
        synchronized (this.field4188) {
            this.field4188.method2202(0, arg0);
        }
        int var5 = -70 / ((54 - arg1) / 40);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[BIZI[BI)V")
    public static final void method1768(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, byte[] arg7, int arg8) {
        field4178++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        if (!arg5) {
            return;
        }
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg3[var10001] += arg7[arg6++];
                int var14 = arg4++;
                arg3[var14] += arg7[arg6++];
                int var15 = arg4++;
                arg3[var15] += arg7[arg6++];
                int var16 = arg4++;
                arg3[var16] += arg7[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg3[var10001] += arg7[arg6++];
            }
            arg4 += arg0;
            arg6 += arg8;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        if (arg0 == 37) {
            field4187 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lpr;ILmn;Lmn;)V")
    public class259(class236 arg0, int arg1, class162 arg2, class162 arg3) {
        this.field4183 = arg3;
        this.field4180 = arg2;
        this.field4180.method1008(33, (byte) -21);
    }

    static {
        new class213("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        new class213("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field4187 = new class219(27, 3);
    }
}
