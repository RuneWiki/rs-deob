import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class91 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public int field1061 = 0;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lhq;")
    public static class365 field1062 = new class365(8);

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "J")
    public static long field1068;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1067;

    static {
        new class72("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field1068 = 0L;
        new class72("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field1069 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 5)
    public static final void method569(int arg0) {
        field1065++;
        if (class264.field3386 < 102) {
            class264.field3386 += 6;
        }
        if (class236.field3097 != 0) {
            class278.field3592 -= class236.field3097 * 5;
            if (class278.field3592 >= class5.field36) {
                class278.field3592 = class5.field36 - 1;
            }
            class236.field3097 = 0;
            if (class278.field3592 < 0) {
                class278.field3592 = 0;
            }
        }
        for (int var1 = 0; var1 < class40.field481; var1++) {
            int var2 = class6.field56[var1].method323(arg0 - 26026);
            char var3 = class6.field56[var1].method318(true);
            if (var2 == 84) {
                class330.method2126((byte) 52);
            } else if (class261.field3359.method623(arg0 ^ 0x65A3, 82) && var2 == 66) {
                if (class354.field4809 != null) {
                    String var4 = "";
                    for (int var5 = class431.field5878.length - 1; var5 >= 0; var5--) {
                        if (class431.field5878[var5] != null && class431.field5878[var5].length() > 0) {
                            var4 = var4 + class431.field5878[var5] + '\n';
                        }
                    }
                    class354.field4809.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class261.field3359.method623(9, 82) && var2 == 67) {
                if (class354.field4809 != null) {
                    Transferable var6 = class354.field4809.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class349.method2225(-11337, '\n', var7);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class342.field4668 = var8[var9];
                                        class330.method2126((byte) 63);
                                    }
                                } else {
                                    class342.field4668 = class342.field4668 + var7;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class286.field3774 > 0) {
                class342.field4668 = class342.field4668.substring(0, class286.field3774 - 1) + class342.field4668.substring(class286.field3774);
                class286.field3774--;
            } else if (var2 == 101 && class286.field3774 < class342.field4668.length()) {
                class342.field4668 = class342.field4668.substring(0, class286.field3774) + class342.field4668.substring(class286.field3774 + 1);
            } else if (var2 == 96 && class286.field3774 > 0) {
                class286.field3774--;
            } else if (var2 == 97 && class286.field3774 < class342.field4668.length()) {
                class286.field3774++;
            } else if (var2 == 102) {
                class286.field3774 = 0;
            } else if (var2 == 103) {
                class286.field3774 = class342.field4668.length();
            } else if (var2 == 104 && class241.field3160 < class431.field5878.length) {
                class241.field3160++;
                class221.method1344(113);
                class286.field3774 = class342.field4668.length();
            } else if (var2 == 105 && class241.field3160 > 0) {
                class241.field3160--;
                class221.method1344(arg0 ^ 0x65E8);
                class286.field3774 = class342.field4668.length();
            } else if (class277.method1742((byte) -68, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class342.field4668 = class342.field4668.substring(0, class286.field3774) + class6.field56[var1].method318(true) + class342.field4668.substring(class286.field3774);
                class286.field3774++;
            }
        }
        class40.field481 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class433.field5909[var10]) {
                var10002 = class296.field3951[var10]++;
                if (class296.field3951[var10] > 102) {
                    class433.field5909[var10] = false;
                }
            } else {
                var10002 = class296.field3951[var10]--;
                if (class296.field3951[var10] < 0) {
                    class228.field2883[var10] = (int) (Math.random() * (double) class39.field457);
                    class175.field2032[var10] = (int) (Math.random() * 350.0D);
                    class296.field3951[var10] = 0;
                    class433.field5909[var10] = true;
                }
            }
        }
        if (arg0 != 26026) {
            method569(27);
        }
        class11.method53(16026);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILbg;B)V", line = 199)
    private final void method570(int arg0, class242 arg1, byte arg2) {
        int var4 = -80 / ((-arg2 - 53) / 59);
        if (arg0 == 5) {
            this.field1061 = arg1.method1587((byte) -102);
        }
        field1067++;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 214)
    public static void method571(int arg0) {
        if (arg0 > -98) {
            method571(2);
        }
        field1062 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLkj;)V", line = 227)
    public static final void method572(boolean arg0, class175 arg1) {
        if (!arg0) {
            method569(77);
        }
        arg1.field2024 = null;
        field1066++;
        int var2 = arg1.field2030.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field2030[var3].field375 = false;
        }
        class288[] var4 = class300.field4005;
        synchronized (class300.field4005) {
            if (class300.field4005.length > var2 && class240.field3156[var2] < 200) {
                class300.field4005[var2].method1833(arg1, 10209);
                int var10002 = class240.field3156[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lbg;B)V", line = 257)
    public final void method573(class242 arg0, byte arg1) {
        field1063++;
        while (true) {
            int var3 = arg0.method1563(arg1 ^ 0xFFFFFF80);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field1062 = null;
                    return;
                }
            }
            this.method570(var3, arg0, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 278)
    public static final void method574(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1064++;
        int var1 = class215.field2658.method2171(8, 108);
        if (class450.field6291 > var1) {
            for (int var2 = var1; var2 < class450.field6291; var2++) {
                class374.field5062[class238.field3146++] = class304.field4083[var2];
            }
        }
        if (class450.field6291 < var1) {
            throw new RuntimeException("gppov1");
        }
        class450.field6291 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class304.field4083[var3];
            class131 var5 = class212.field2584[var4];
            int var6 = class215.field2658.method2171(1, 107);
            if (var6 == 0) {
                class304.field4083[class450.field6291++] = var4;
                var5.field2427 = class106.field1273;
            } else {
                int var7 = class215.field2658.method2171(2, 123);
                if (var7 == 0) {
                    class304.field4083[class450.field6291++] = var4;
                    var5.field2427 = class106.field1273;
                    class332.field4530[class341.field4651++] = var4;
                } else if (var7 == 1) {
                    class304.field4083[class450.field6291++] = var4;
                    var5.field2427 = class106.field1273;
                    int var8 = class215.field2658.method2171(3, 94);
                    var5.method840(var8, (byte) 84, 1);
                    int var9 = class215.field2658.method2171(1, 85);
                    if (var9 == 1) {
                        class332.field4530[class341.field4651++] = var4;
                    }
                } else if (var7 == 2) {
                    class304.field4083[class450.field6291++] = var4;
                    var5.field2427 = class106.field1273;
                    if (class215.field2658.method2171(1, 118) == 1) {
                        int var11 = class215.field2658.method2171(3, 72);
                        var5.method840(var11, (byte) 111, 2);
                        int var12 = class215.field2658.method2171(3, 104);
                        var5.method840(var12, (byte) 80, 2);
                    } else {
                        int var10 = class215.field2658.method2171(3, 77);
                        var5.method840(var10, (byte) 96, 0);
                    }
                    int var13 = class215.field2658.method2171(1, 94);
                    if (var13 == 1) {
                        class332.field4530[class341.field4651++] = var4;
                    }
                } else if (var7 == 3) {
                    class374.field5062[class238.field3146++] = var4;
                }
            }
        }
    }
}
