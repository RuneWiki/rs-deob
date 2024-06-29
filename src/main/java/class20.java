import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class20 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lwi;")
    private class330 field302 = new class330(64);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Luu;")
    private class191 field308;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
    public final void method186(byte arg0, int arg1) {
        int var3 = 0 % ((-arg0 - 36) / 39);
        class330 var4 = this.field302;
        synchronized (this.field302) {
            this.field302.method2140(-115, arg1);
        }
        field303++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lpl;")
    public static final class468 method187(int arg0) {
        field304++;
        if (arg0 > -89) {
            return null;
        }
        try {
            return (class468) Class.forName("cu").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBIIII)V")
    public static final void method188(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= class369.field5628 && arg0 >= class463.field6924) {
            boolean var6;
            if (arg5 < class377.field5760) {
                arg5 = class377.field5760;
                var6 = false;
            } else if (arg5 <= class49.field701) {
                var6 = true;
            } else {
                arg5 = class49.field701;
                var6 = false;
            }
            boolean var7;
            if (class377.field5760 > arg2) {
                arg2 = class377.field5760;
                var7 = false;
            } else if (class49.field701 >= arg2) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class49.field701;
            }
            if (arg4 < class463.field6924) {
                arg4 = class463.field6924;
            } else {
                class221.method1489(class466.field6955[arg4++], arg5, arg2, (byte) -30, arg3);
            }
            if (arg0 > class369.field5628) {
                arg0 = class369.field5628;
            } else {
                class221.method1489(class466.field6955[arg0--], arg5, arg2, (byte) -30, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class466.field6955[var8];
                    var9[arg5] = var9[arg2] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class466.field6955[var10][arg5] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class466.field6955[var11][arg2] = arg3;
                }
            }
        }
        field300++;
        if (arg1 != 46) {
            method187(-48);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Luk;")
    public final class174 method189(int arg0, int arg1) {
        field309++;
        class330 var3 = this.field302;
        class174 var4;
        synchronized (this.field302) {
            var4 = (class174) this.field302.method2133((long) arg0, (byte) 79);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field308;
        byte[] var6;
        synchronized (this.field308) {
            var6 = this.field308.method1281(arg1, arg0, 81);
        }
        class174 var7 = new class174();
        if (var6 != null) {
            var7.method1175(new class164(var6), (byte) 99);
        }
        class330 var8 = this.field302;
        synchronized (this.field302) {
            this.field302.method2131(var7, (long) arg0, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLik;)V")
    public static final void method190(byte arg0, class141 arg1) {
        field301++;
        for (int var2 = 0; var2 < class493.field7267; var2++) {
            int var3 = class224.field3113[var2];
            class96 var4 = class241.field3398[var3];
            int var5 = arg1.method1087(false);
            if ((var5 & 0x1) != 0) {
                var5 += arg1.method1087(false) << 8;
            }
            if ((var5 & 0x2000) != 0) {
                var5 += arg1.method1087(false) << 16;
            }
            class412.method2540((byte) -69, var5, var3, arg1, var4);
        }
        if (arg0 < 6) {
            method188(108, (byte) 111, -36, 66, 31, -95);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method191(int arg0) {
        class330 var2 = this.field302;
        synchronized (this.field302) {
            this.field302.method2135(0);
        }
        int var3 = -36 / ((-arg0 - 27) / 47);
        field305++;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class20(class65 arg0, int arg1, class191 arg2) {
        this.field308 = arg2;
        if (this.field308 == null) {
            this.field307 = 0;
        } else {
            this.field307 = this.field308.method1290(false, 16);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final void method192(int arg0) {
        field306++;
        class330 var2 = this.field302;
        synchronized (this.field302) {
            this.field302.method2127((byte) 124);
            if (arg0 <= 71) {
                this.field302 = null;
            }
        }
    }

    static {
        new class446("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }
}
