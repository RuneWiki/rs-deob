import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class454 extends class361 {

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field6367;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field6360 = 1407;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Lkn;")
    public static class530 field6371;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "Lka;")
    public static class334 field6365;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "Lie;")
    public static class6 field6372;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "[Lnb;")
    public class201[] field6364;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[[B")
    private byte[][] field6369;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;Lih;IB)Lug;")
    public static final class401 method2647(String arg0, class503 arg1, int arg2, byte arg3) {
        field6368++;
        int var4 = -115 / ((24 - arg3) / 60);
        int var5 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var5);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class346.field5016, 0);
        if (class346.field5016[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class401(arg1, arg2, var5);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
    public final boolean method2648(int arg0, int arg1) {
        field6366++;
        return arg0 == 13834 ? this.field6364[arg1].field2875 : true;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Z")
    public final boolean method2649(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method2649(-109, -102);
        }
        field6359++;
        return this.field6364[arg0].field2877;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)Z")
    public final boolean method2650(boolean arg0) {
        field6361++;
        if (this.field6364 != null) {
            return true;
        }
        if (this.field6369 == null) {
            if (!class486.field6785.method445(this.field6367, (byte) -110)) {
                return false;
            }
            int[] var2 = class486.field6785.method419(arg0, this.field6367);
            this.field6369 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6369[var3] = class486.field6785.method426(this.field6367, (byte) 9, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6369.length; var5++) {
            byte[] var14 = this.field6369[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class63.field801.method424(0, var15);
        }
        if (!var4) {
            return false;
        }
        class455 var6 = new class455();
        int var7 = class486.field6785.method435(this.field6367, 0);
        this.field6364 = new class201[var7];
        int[] var8 = class486.field6785.method419(arg0, this.field6367);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6369[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class119 var12 = null;
            for (class119 var13 = (class119) var6.method2655(15152); var13 != null; var13 = (class119) var6.method2660((byte) 67)) {
                if (var13.field1640 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class119(var11, class63.field801.method421(var11, 1));
                var6.method2657(8492, var12);
            }
            this.field6364[var8[var9]] = new class201(var10, var12);
        }
        this.field6369 = null;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)Z")
    public final boolean method2651(int arg0, int arg1) {
        field6363++;
        if (arg1 != -1094206008) {
            field6370 = -116;
        }
        return this.field6364[arg0].field2881;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
    public class454(int arg0) {
        this.field6367 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)Lbe;")
    public static final class29 method2652(byte arg0, int arg1) {
        field6362++;
        class29 var2 = (class29) class77.field1002.method1088((long) arg1, (byte) -119);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class256.field3817.method426(0, (byte) 9, arg1);
        class29 var4 = new class29();
        if (arg0 > -37) {
            return null;
        }
        if (var3 != null) {
            var4.method179(arg1, 1, new class403(var3));
        }
        class77.field1002.method1097(19627, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method2653(byte arg0) {
        field6365 = null;
        if (arg0 <= -97) {
            field6371 = null;
            field6372 = null;
        }
    }

    static {
        new class530("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class530("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field6370 = 0;
        field6371 = new class530("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
    }
}
