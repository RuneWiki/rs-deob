import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class293 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[Lvba;")
    private class36[] field4063;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    private int field4056;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Leea;")
    public static class114 field4065;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lea;")
    public static class474 field4066;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "J")
    private long field4064;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lvba;")
    private class36 field4057;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1890(char arg0, byte arg1, String arg2) {
        field4062++;
        int var3 = class512.method3044(arg2, arg0, false);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg1 != -1) {
            field4066 = null;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1891(int arg0) {
        if (arg0 != 5428) {
            method1895(69, (byte) -126, -111);
        }
        field4065 = null;
        field4066 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)Lvba;")
    public final class36 method1892(long arg0, int arg1) {
        field4059++;
        this.field4064 = arg0;
        class36 var4 = this.field4063[(int) ((long) (this.field4056 + arg1) & arg0)];
        for (this.field4057 = var4.field399; this.field4057 != var4; this.field4057 = this.field4057.field399) {
            if (this.field4057.field401 == arg0) {
                class36 var5 = this.field4057;
                this.field4057 = this.field4057.field399;
                return var5;
            }
        }
        this.field4057 = null;
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static final void method1893(boolean arg0) {
        if (!arg0) {
            field4066 = null;
        }
        field4060++;
        class507.field7381.method1810(false);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Lvba;")
    public final class36 method1894(boolean arg0) {
        field4061++;
        if (this.field4057 == null) {
            return null;
        }
        class36 var2 = this.field4063[(int) (this.field4064 & (long) (this.field4056 - 1))];
        while (this.field4057 != var2) {
            if (this.field4057.field401 == this.field4064) {
                class36 var3 = this.field4057;
                this.field4057 = this.field4057.field399;
                return var3;
            }
            this.field4057 = this.field4057.field399;
        }
        this.field4057 = null;
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1895(int arg0, byte arg1, int arg2) {
        field4058++;
        if (arg1 == -56) {
            return (arg0 & 0x70000) != 0 | class131.method804(arg1 ^ 0xFFFFFFB3, arg0, arg2) || class430.method2681(arg0, arg2, 112);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class293(int arg0) {
        this.field4063 = new class36[arg0];
        this.field4056 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class36 var3 = this.field4063[var2] = new class36();
            var3.field402 = var3;
            var3.field399 = var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLvba;J)V")
    public final void method1896(byte arg0, class36 arg1, long arg2) {
        if (arg1.field402 != null) {
            arg1.method199(-40);
        }
        field4067++;
        class36 var5 = this.field4063[(int) (arg2 & (long) (this.field4056 - 1))];
        arg1.field402 = var5.field402;
        if (arg0 >= 24) {
            arg1.field399 = var5;
            arg1.field402.field399 = arg1;
            arg1.field399.field402 = arg1;
            arg1.field401 = arg2;
        }
    }

    static {
        new class474("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field4065 = new class114();
        field4066 = new class474("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
    }
}
