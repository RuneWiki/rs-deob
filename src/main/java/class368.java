import jaggl.OpenGL;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class368 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
    public static boolean field5390 = false;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "Z")
    public static boolean field5393;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Ls;")
    public static class186 field5394;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5388;

    static {
        new class309("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field5393 = false;
        field5394 = new class186(15, 2);
        new class309("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lnn;Z[B)V", line = 9)
    public final void method2252(class289 arg0, boolean arg1, byte[] arg2) {
        field5391++;
        if (arg0.field4408[arg0.field4399] != 31 || arg0.field4408[arg0.field4399 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5388 == null) {
            this.field5388 = new Inflater(true);
        }
        try {
            this.field5388.setInput(arg0.field4408, arg0.field4399 + 10, -arg0.field4399 + -8 + -10 + arg0.field4408.length);
            this.field5388.inflate(arg2);
        } catch (Exception var4) {
            this.field5388.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5388.reset();
        if (arg1) {
            method2254(-128);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 36)
    public class368() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 39)
    public static void method2253(byte arg0) {
        field5394 = null;
        int var1 = -106 / ((-arg0 - 28) / 62);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z", line = 49)
    public static final boolean method2254(int arg0) {
        field5389++;
        if (class407.field6166) {
            try {
                if ((Boolean) class227.method1509(class497.field7305.field7072, "showingVideoAd", 29436)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -1) {
            field5390 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lda;BLjava/lang/String;I)Lhh;", line = 69)
    public static final class86 method2255(class44 arg0, byte arg1, String arg2, int arg3) {
        field5392++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramStringARB(arg3, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class429.field6416, 0);
        if (class429.field6416[0] == -1) {
            int var5 = -113 / ((arg1 + 13) / 50);
            OpenGL.glBindProgramARB(arg3, 0);
            return new class86(arg0, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 94)
    public static final void method2256(byte arg0) {
        if (arg0 < 8) {
            method2255(null, (byte) -114, null, 67);
        }
        field5386++;
        int var1 = (int) ((double) class339.field5099 * 34.46D);
        int var2 = var1 << 0;
        if (class262.field4006.method270()) {
            var2 += 128;
        }
        class262.field4006.method446(50, var2);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILgh;)Lgh;", line = 113)
    public static final class388 method2257(int arg0, class388 arg1) {
        field5387++;
        if (arg1.field5728 != -1) {
            return class271.method1716(27411, arg1.field5728);
        }
        int var2 = arg1.field5700 >>> 16;
        class107 var3 = new class107(class470.field6975);
        class141 var4 = (class141) var3.method913(true);
        if (arg0 > -40) {
            method2254(-112);
        }
        while (var4 != null) {
            if (var4.field2342 == var2) {
                return class271.method1716(27411, (int) var4.field3977);
            }
            var4 = (class141) var3.method914(-127);
        }
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lke;III)V", line = 162)
    public static final void method2258(class427 arg0, int arg1, int arg2, int arg3) {
        long var4 = class383.field5598[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field6394 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field6397[arg0.field6394++] = class248.field3825[var8 - 1].field3015;
            var6 += 16L;
        }
        for (int var9 = arg0.field6394; var9 < 4; var9++) {
            arg0.field6397[var9] = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(III)V", line = 189)
    private class368(int arg0, int arg1, int arg2) {
    }
}
