import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class193 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "J")
    public static long field2734;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Liu;")
    public static class390 field2736;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lgn;")
    public static class475 field2737;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[Z")
    public static boolean[] field2738;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2731;

    static {
        new class194("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field2735 = 0;
        field2734 = -1L;
        field2736 = new class390(68, 8);
        field2737 = new class475(50, 7);
        field2738 = new boolean[100];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 5)
    public static void method1213(byte arg0) {
        field2737 = null;
        int var1 = -103 % ((-arg0 - 77) / 33);
        field2736 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 25)
    public class193() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)V", line = 31)
    public static final void method1214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2730++;
        int var8 = arg2 - arg1;
        int var9 = arg1 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class238.method1440(class41.field629[var10], arg3, arg4, arg5, -14726);
        }
        int var11 = arg1 + arg5;
        int var12 = arg4 - arg1;
        for (int var13 = arg2; var13 > var8; var13--) {
            class238.method1440(class41.field629[var13], arg3, arg4, arg5, -14726);
        }
        int var14 = -89 % ((arg0 + 64) / 58);
        for (int var15 = var9; var15 <= var8; var15++) {
            int[] var16 = class41.field629[var15];
            class238.method1440(var16, arg3, var11, arg5, -14726);
            class238.method1440(var16, arg6, var12, var11, -14726);
            class238.method1440(var16, arg3, arg4, var12, -14726);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lae;B[B)V", line = 83)
    public final void method1215(class156 arg0, byte arg1, byte[] arg2) {
        field2733++;
        if (arg0.field2041[arg0.field2018] != 31 || arg0.field2041[arg0.field2018 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2731 == null) {
            this.field2731 = new Inflater(true);
        }
        try {
            this.field2731.setInput(arg0.field2041, arg0.field2018 + 10, arg0.field2041.length + -arg0.field2018 + -18);
            this.field2731.inflate(arg2);
        } catch (Exception var4) {
            this.field2731.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 == -19) {
            this.field2731.reset();
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V", line = 114)
    private class193(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 127)
    public static final void method1216(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class179.field2584[var1] = false;
        }
        field2732++;
        class391.field5800 = 0;
        class362.field5446 = -1;
        class278.field3964 = 0;
        class306.field4454 = 1;
        class72.field1058 = -1;
        if (arg0 < 123) {
            field2737 = null;
        }
    }
}
