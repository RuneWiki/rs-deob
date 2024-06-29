import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class268 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Lgf;")
    public static class180 field3901;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field3903;

    static {
        new class180("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new class180("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        new class180("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field3901 = new class180("white:", "weiss:", "blanc:", "branco:");
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZILkh;)V", line = 22)
    public static final void method1714(boolean arg0, int arg1, class13 arg2) {
        field3902++;
        if (class106.field1669 >= 400) {
            return;
        }
        class148 var3 = arg2.field210;
        if (var3.field2193 != null) {
            var3 = var3.method1059((byte) -51, class526.field7733);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field2170 || arg1 > -11) {
            return;
        }
        String var4 = var3.field2186;
        if (var3.field2237 != 0) {
            String var5 = class321.field4649 == class193.field2824 ? class425.field6237.method1273(true, class370.field5530) : class288.field4148.method1273(true, class370.field5530);
            var4 = var4 + class424.method2589(var3.field2237, class95.field1558.field1071, -6) + " (" + var5 + var3.field2237 + ")";
        }
        if (!class301.field4287) {
            if (!arg0) {
                String[] var7 = var3.field2178;
                if (class339.field5160) {
                    var7 = class307.method1932(-114, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class371.field5565 != class321.field4649 || !var7[var8].equalsIgnoreCase(class367.field5503.method1273(true, class370.field5530)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 6;
                            }
                            int var10 = class183.field2751;
                            if (var8 == 1) {
                                var9 = 2;
                            }
                            if (var8 == 2) {
                                var9 = 51;
                            }
                            if (var8 == 3) {
                                var9 = 60;
                            }
                            if (var3.field2184 == var8) {
                                var10 = var3.field2195;
                            }
                            if (var8 == 4) {
                                var9 = 57;
                            }
                            if (var3.field2188 == var8) {
                                var10 = var3.field2181;
                            }
                            class421.field6197++;
                            class192.method1313(-1, var10, "<col=ffff00>" + var4, var7[var8], 0, false, (long) arg2.field331, (byte) 35, var9, true, 0);
                        }
                    }
                }
                if (class371.field5565 == class321.field4649 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class367.field5503.method1273(true, class370.field5530))) {
                            short var12 = 0;
                            if (class95.field1558.field1071 < var3.field2237) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 6;
                            }
                            if (var11 == 1) {
                                var13 = 2;
                            }
                            if (var11 == 2) {
                                var13 = 51;
                            }
                            if (var11 == 3) {
                                var13 = 60;
                            }
                            if (var11 == 4) {
                                var13 = 57;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class20.field289++;
                            class192.method1313(-1, var3.field2176, "<col=ffff00>" + var4, var7[var11], 0, false, (long) arg2.field331, (byte) 35, var13, true, 0);
                        }
                    }
                }
            }
            class386.field5711++;
            class192.method1313(-1, class40.field618, "<col=ffff00>" + var4, class331.field5097.method1273(true, class370.field5530), 0, arg0, (long) arg2.field331, (byte) 35, 1008, true, 0);
        } else if (!arg0) {
            class93 var6 = class458.field6759 == -1 ? null : class219.field3164.method2570((byte) -32, class458.field6759);
            if ((class288.field4144 & 0x2) != 0) {
                if (var6 == null || var3.method1062(class458.field6759, (byte) 118, var6.field1529) != var6.field1529) {
                    class192.method1313(-1, class189.field2797, class318.field4553 + " -> <col=ffff00>" + var4, class200.field2920, 0, false, (long) arg2.field331, (byte) 35, 17, true, 0);
                    class233.field3378++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)Z", line = 192)
    public final boolean method1715(byte arg0) {
        field3903++;
        if (arg0 < 72) {
            return false;
        } else {
            return this.method711((byte) 126) || this.method715(4) || this.method705(-3129);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 212)
    public static void method1716(boolean arg0) {
        if (arg0) {
            field3901 = null;
        }
        field3901 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public abstract void method717(byte arg0);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I")
    public abstract int method713(int arg0);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Z")
    public abstract boolean method711(byte arg0);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
    public abstract boolean method715(int arg0);

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Z")
    public abstract boolean method705(int arg0);

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Llf;")
    public abstract class157 method704(int arg0);

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(I)I")
    public abstract int method712(int arg0);

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
    public abstract void method708(int arg0);
}
