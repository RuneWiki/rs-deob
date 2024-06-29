import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class105 {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Lpi;")
    public static class340 field1434 = new class340(68, 5);

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field1433;

    static {
        new class169("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        new class169("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        new class169("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method699(boolean arg0) {
        if (arg0) {
            class470.field6877 = class354.field4550;
            class92.field1285 = class283.field3620;
        } else {
            class470.field6877 = class188.field2468;
            class92.field1285 = class405.field5436;
        }
        class412.field5495 = class470.field6877.length;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 17)
    public static void method700(byte arg0) {
        if (arg0 != -126) {
            method699(false);
        }
        field1434 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLqa;Ldn;)V", line = 27)
    public static final void method701(byte arg0, class129 arg1, class201 arg2) {
        field1433++;
        class136[] var3 = class136.method954(arg2, class520.field7688, 0);
        class9.field95 = new class404[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class9.field95[var4] = arg1.method851(var3[var4], true);
        }
        class136[] var5 = class136.method954(arg2, class337.field4301, 0);
        class271.field3446 = new class404[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class271.field3446[var6] = arg1.method851(var5[var6], true);
        }
        class136[] var7 = class136.method954(arg2, class482.field7015, 0);
        class347.field4436 = new class404[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class347.field4436[var8] = arg1.method851(var7[var8], true);
        }
        class136[] var9 = class136.method954(arg2, class522.field7747, 0);
        class492.field7189 = new class404[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class492.field7189[var10] = arg1.method851(var9[var10], true);
        }
        class136[] var11 = class136.method954(arg2, class52.field707, 0);
        class303.field3927 = new class404[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class303.field3927[var12] = arg1.method851(var11[var12], true);
        }
        class136[] var13 = class136.method954(arg2, class152.field2040, 0);
        class269.field3407 = new class404[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class269.field3407[var14] = arg1.method851(var13[var14], true);
        }
        class136[] var15 = class136.method954(arg2, class188.field2457, 0);
        class328.field4215 = new class404[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class328.field4215[var16] = arg1.method851(var15[var16], true);
        }
        class136[] var17 = class136.method954(arg2, class355.field4555, 0);
        class475.field6950 = new class404[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class475.field6950[var18] = arg1.method851(var17[var18], true);
        }
        class136[] var19 = class136.method954(arg2, class486.field7059, 0);
        class517.field7622 = new class404[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class517.field7622[var20] = arg1.method851(var19[var20], true);
        }
        class136[] var21 = class136.method954(arg2, class169.field2201, 0);
        class54.field745 = new class404[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class54.field745[var22] = arg1.method851(var21[var22], true);
        }
        class136[] var23 = class136.method954(arg2, class322.field4144, 0);
        class350.field4482 = new class404[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class350.field4482[var24] = arg1.method851(var23[var24], true);
        }
        if (arg0 < 56) {
            field1434 = null;
        }
        class136[] var25 = class136.method954(arg2, class120.field1667, 0);
        class334.field4280 = new class404[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class334.field4280[var26] = arg1.method851(var25[var26], true);
        }
        class71.field881 = arg1.method851(class136.method945(arg2, class481.field7002, 0), true);
        class52.field716 = arg1.method851(class136.method945(arg2, class288.field3689, 0), true);
        class136[] var27 = class136.method954(arg2, class447.field6216, 0);
        class310.field4007 = new class404[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class310.field4007[var28] = arg1.method851(var27[var28], true);
        }
    }
}
