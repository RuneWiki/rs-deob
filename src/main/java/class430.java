import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class430 {

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field6125 = 0;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Lej;")
    public static class104 field6126 = new class104("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)I")
    public static final int method2557(boolean arg0) {
        field6124++;
        return arg0 ? 16 : 36;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2558(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class439.field6235++;
        class440.field6264 = 0;
        for (int var6 = class244.field3410; var6 < class395.field5610; var6++) {
            class622[][] var17 = class356.field4807[var6];
            for (int var18 = class213.field3024; var18 < class258.field3595; var18++) {
                for (int var19 = class67.field1139; var19 < class277.field3834; var19++) {
                    class622 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class69.field1172[var18 + class325.field4377 - class120.field1970][var19 + class325.field4377 - class546.field7561] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field8975 = true;
                            var20.field8964 = true;
                            if (var20.field8973 == null) {
                                var20.field8984 = false;
                            } else {
                                var20.field8984 = true;
                            }
                            class440.field6264++;
                        } else {
                            var20.field8975 = false;
                            var20.field8964 = false;
                            var20.field8976 = 0;
                            if (var18 >= class120.field1970 - 16 && var18 <= class120.field1970 + 16 && var19 >= class546.field7561 - 16 && var19 <= class546.field7561 + 16 && (var20.field8985 != null || var20.field8982 != null || var20.field8981 != null || var20.field8977 != null || var20.field8979 != null || var20.field8973 != null)) {
                                class233.field3288.method2852(true, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = client.field3472 == class590.field8430;
        for (int var8 = class244.field3410; var8 < class395.field5610; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class329.field4405.method1340() && var8 >= arg2 && arg1 != null) {
                int var10 = class69.field1172.length;
                if (class69.field1172.length + class213.field3024 > class332.field4447) {
                    var10 -= class69.field1172.length + class213.field3024 - class332.field4447;
                }
                int var11 = class69.field1172[0].length;
                if (class69.field1172[0].length + class67.field1139 > class34.field624) {
                    var11 -= class69.field1172[0].length + class67.field1139 - class34.field624;
                }
                int var12 = class467.field6583;
                while (true) {
                    if (var12 >= var10) {
                        class233.field3288.method2853(var9, 56, var8, class590.field8430[var8], true);
                        break;
                    }
                    int var13 = class213.field3024 + var12 - class467.field6583;
                    for (int var14 = class486.field6827; var14 < var11; var14++) {
                        class270.field3764[var12][var14] = false;
                        if (class69.field1172[var12][var14]) {
                            int var15 = class67.field1139 + var14 - class486.field6827;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class356.field4807[var16][var13][var15] != null && class356.field4807[var16][var13][var15].field8970 == var8) {
                                    class270.field3764[var12][var14] = class356.field4807[var16][var13][var15].field8975;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class233.field3288.method2853(var9, 77, var8, class590.field8430[var8], false);
            }
            class233.field3288.method2858(-103);
        }
        if (!class329.method2026(true)) {
            class329.method2026(false);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method2559(int arg0) {
        if (arg0 != -7767) {
            method2559(46);
        }
        field6126 = null;
    }
}
