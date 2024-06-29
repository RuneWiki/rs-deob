import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class499 {

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "[[I")
    public static int[][] field7344;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
    public static int[] field7345;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "J")
    public long field7342;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lki;")
    public class499 field7336;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lki;")
    public class499 field7339;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[[B")
    public static byte[][] field7346;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method2941(byte arg0) {
        field7345 = null;
        int var1 = -65 % ((arg0 + 30) / 35);
        field7346 = null;
        field7344 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static final void method2942(int arg0) {
        field7338++;
        class398.field5544 = arg0;
        class135.field1949 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLkj;Ljava/lang/String;ZB)V")
    public static final void method2943(boolean arg0, class397 arg1, String arg2, boolean arg3, byte arg4) {
        field7340++;
        if (arg0) {
            if (class397.field5517.startsWith("win") && class397.field5519 != 3) {
                String var5 = null;
                if (arg1.field5516 != null) {
                    var5 = arg1.field5516.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class409 var6 = class407.method2350(arg1, -80, arg2, 0);
                    class294.field3920 = arg1;
                    class92.field1242 = arg2;
                    class157.field2230 = var6;
                    return;
                }
            }
            if (class397.field5517.startsWith("mac")) {
                String var7 = null;
                if (arg1.field5516 != null) {
                    var7 = arg1.field5516.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class407.method2350(arg1, -99, arg2, 1);
                    return;
                }
            }
            class407.method2350(arg1, -65, arg2, 2);
        } else {
            class407.method2350(arg1, -124, arg2, 3);
        }
        if (arg4 != -112) {
            field7346 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)Z")
    public final boolean method2944(byte arg0) {
        if (arg0 == 119) {
            field7335++;
            return this.field7339 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2945(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field7343++;
        class238.method1382((byte) -22, arg1);
        int var7 = 0;
        int var8 = arg1 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg3 >= -31) {
            return;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class225.field3174[arg0];
        int var16 = arg4 - var8;
        int var17 = arg4 + var8;
        class419.method2511(var15, arg4 - arg1, arg6, var16, -38);
        class419.method2511(var15, var16, arg2, var17, -26);
        class419.method2511(var15, var17, arg6, arg1 + arg4, 103);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class131.field1813[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 < var8) {
                    int[] var18 = class225.field3174[arg0 + var9];
                    int[] var19 = class225.field3174[arg0 - var9];
                    int var20 = class131.field1813[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class419.method2511(var18, var22, arg6, var24, -59);
                    class419.method2511(var18, var24, arg2, var23, -15);
                    class419.method2511(var18, var23, arg6, var21, 86);
                    class419.method2511(var19, var22, arg6, var24, 109);
                    class419.method2511(var19, var24, arg2, var23, 72);
                    class419.method2511(var19, var23, arg6, var21, -93);
                } else {
                    int[] var25 = class225.field3174[arg0 + var9];
                    int[] var26 = class225.field3174[arg0 - var9];
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var7;
                    class419.method2511(var25, var28, arg6, var27, 101);
                    class419.method2511(var26, var28, arg6, var27, -36);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class225.field3174[arg0 + var7];
            int[] var30 = class225.field3174[arg0 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 >= var8) {
                class419.method2511(var29, var32, arg6, var31, -122);
                class419.method2511(var30, var32, arg6, var31, -42);
            } else {
                int var33 = var7 > var11 ? class131.field1813[var7] : var11;
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class419.method2511(var29, var32, arg6, var35, -55);
                class419.method2511(var29, var35, arg2, var34, -106);
                class419.method2511(var29, var34, arg6, var31, 64);
                class419.method2511(var30, var32, arg6, var35, 109);
                class419.method2511(var30, var35, arg2, var34, -32);
                class419.method2511(var30, var34, arg6, var31, -42);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method2946(int arg0) {
        field7341++;
        if (this.field7339 == null) {
            return;
        }
        if (arg0 >= -92) {
            this.method2946(14);
        }
        this.field7339.field7336 = this.field7336;
        this.field7336.field7339 = this.field7339;
        this.field7339 = null;
        this.field7336 = null;
    }

    static {
        new class83("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field7344 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
        field7345 = new int[] { 1, 0, -1, 0 };
        new class83("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
