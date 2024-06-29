import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class452 {

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "B")
    public byte field6798 = 0;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "S")
    public short field6805;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "B")
    public byte field6811;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "B")
    public byte field6810;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "S")
    public short field6816;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "Ljava/lang/String;")
    public static String field6813;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lof;")
    public static class446 field6799;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "Lip;")
    public static class508 field6817;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "Lla;")
    public static class319 field6818;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "B")
    public byte field6793;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "B")
    public byte field6802;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "B")
    public byte field6803;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "B")
    public byte field6808;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Luq;")
    public class113 field6796;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lfq;")
    public class137 field6792;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "Lbb;")
    public class222 field6809;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Lbb;")
    public class222 field6815;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Lj;")
    public class384 field6814;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Ljw;")
    public class394 field6801;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lsn;")
    public class452 field6795;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Lkr;")
    public class535 field6797;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "Lkr;")
    public class535 field6812;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "S")
    public short field6807;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "Z")
    public boolean field6800;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Z")
    public boolean field6804;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Z")
    public boolean field6806;

    static {
        new class446("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field6813 = "";
        field6799 = new class446("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
        field6817 = new class508("", 17);
        field6818 = new class319(37, -1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)B", line = 5)
    public static final byte method2754(byte arg0, int arg1, int arg2) {
        field6790++;
        if (arg1 == 9) {
            if (arg0 != -2) {
                method2754((byte) 95, -46, -128);
            }
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 24)
    public static void method2755(int arg0) {
        if (arg0 == 29898) {
            field6813 = null;
            field6817 = null;
            field6799 = null;
            field6818 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(III)V", line = 43)
    public class452(int arg0, int arg1, int arg2) {
        this.field6805 = (short) arg1;
        this.field6810 = this.field6811 = (byte) arg0;
        this.field6816 = (short) arg2;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 56)
    public final void method2756(int arg0) {
        if (arg0 != 5071) {
            method2755(67);
        }
        while (this.field6814 != null) {
            class384 var2 = this.field6814.field5834;
            this.field6814.method2403(false);
            this.field6814 = var2;
        }
        field6791++;
        this.field6798 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBIIII)I", line = 91)
    public static final int method2757(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6794++;
        if (arg1 != -10) {
            return 89;
        } else if (class306.field4447 == null) {
            return 0;
        } else {
            if (arg0 < 3) {
                int var6 = arg3 >> 7;
                int var7 = arg4 >> 7;
                if (arg2 < 0 || arg5 < 0 || arg2 > (class398.field6071 - 1) || (class528.field7734 - 1) < arg5) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > class398.field6071 - 1 || class528.field7734 - 1 < var7) {
                    return 0;
                }
                boolean var8 = (class178.field2382[1][arg3 >> 7][arg4 >> 7] & 0x2) != 0;
                if ((arg3 & 0x7F) == 0) {
                    boolean var9 = (class178.field2382[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                    boolean var10 = (class178.field2382[1][var6][arg4 >> 7] & 0x2) != 0;
                    if (var9 != var10) {
                        var8 = (class178.field2382[1][arg2][arg5] & 0x2) != 0;
                    }
                }
                if ((arg4 & 0x7F) == 0) {
                    boolean var11 = (class178.field2382[1][arg3 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class178.field2382[1][arg3 >> 7][var7] & 0x2) != 0;
                    if (var12 != var11) {
                        var8 = (class178.field2382[1][arg2][arg5] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg0++;
                }
            }
            return class306.field4447[arg0].method218(arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 153)
    public static final void method2758(int arg0) {
        field6789++;
        if (arg0 != 10584) {
            method2755(126);
        }
        if (class179.field2408 != null) {
            return;
        }
        class179.field2408 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class179.field2408[var3++] = var25;
            }
        }
    }
}
