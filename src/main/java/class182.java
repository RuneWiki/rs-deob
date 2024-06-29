import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class182 extends class80 {

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    private int field2936 = 0;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    private int field2937 = 4096;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "Lwm;")
    public static class399 field2940;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "[Z")
    public static boolean[] field2935;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
    public static final void method1243(int arg0) {
        if (~class80.field1592 != -1) {
            class433.field6450 -= class80.field1592 * 5;
            if (class433.field6450 >= class103.field1955) {
                class433.field6450 = class103.field1955 - 1;
            }
            if (~class433.field6450 > -1) {
                class433.field6450 = 0;
            }
            class80.field1592 = 0;
        }
        ++field2941;
        if (class344.field5144 < 102) {
            class344.field5144 += 6;
        }
        int var1 = 20 % ((50 - arg0) / 36);
        for (int var2 = 0; ~class76.field1540 < ~var2; ++var2) {
            int var3 = class137.field2300[var2].method1923(false);
            char var4 = class137.field2300[var2].method1924(-8478);
            if (var3 == 84) {
                class474.method2833(false, (byte) -95);
            }
            if (~var3 == -81) {
                class474.method2833(true, (byte) -69);
            } else if (class179.field2912.method1458(100, 82) && var3 == 66) {
                if (class472.field6997 != null) {
                    String var9 = "";
                    for (int var10 = class509.field7425.length + -1; ~var10 <= -1; --var10) {
                        if (class509.field7425[var10] != null && ~class509.field7425[var10].length() < -1) {
                            var9 = var9 + class509.field7425[var10] + '\n';
                        }
                    }
                    class472.field6997.setContents(new StringSelection(var9), (ClipboardOwner) null);
                }
            } else if (class179.field2912.method1458(100, 82) && var3 == 67) {
                if (class472.field6997 != null) {
                    Transferable var5 = class472.field6997.getContents((Object) null);
                    if (var5 != null) {
                        try {
                            String var6 = (String) var5.getTransferData(DataFlavor.stringFlavor);
                            if (var6 != null) {
                                String[] var7 = class266.method1697(0, '\n', var6);
                                if (~var7.length >= -2) {
                                    class496.field7294 = class496.field7294 + var6;
                                } else {
                                    for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                                        class496.field7294 = var7[var8];
                                        class474.method2833(false, (byte) -84);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (~var3 == -86 && ~class73.field1501 < -1) {
                class496.field7294 = class496.field7294.substring(0, class73.field1501 + -1) + class496.field7294.substring(class73.field1501);
                --class73.field1501;
            } else if (~var3 == -102 && ~class73.field1501 > ~class496.field7294.length()) {
                class496.field7294 = class496.field7294.substring(0, class73.field1501) + class496.field7294.substring(class73.field1501 - -1);
            } else if (~var3 == -97 && class73.field1501 > 0) {
                --class73.field1501;
            } else if (var3 == 97 && class73.field1501 < class496.field7294.length()) {
                ++class73.field1501;
            } else if (~var3 != -103) {
                if (~var3 != -104) {
                    if (~var3 == -105 && ~class509.field7425.length < ~class507.field7394) {
                        ++class507.field7394;
                        class524.method3097((byte) -67);
                        class73.field1501 = class496.field7294.length();
                    } else if (~var3 == -106 && class507.field7394 > 0) {
                        --class507.field7394;
                        class524.method3097((byte) -50);
                        class73.field1501 = class496.field7294.length();
                    } else if (class373.method2289(48, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || ~var4 == -96 || var4 == '-' || var4 == '+' || var4 == '[' || ~var4 == -94) {
                        class496.field7294 = class496.field7294.substring(0, class73.field1501) + class137.field2300[var2].method1924(-8478) + class496.field7294.substring(class73.field1501);
                        ++class73.field1501;
                    }
                } else {
                    class73.field1501 = class496.field7294.length();
                }
            } else {
                class73.field1501 = 0;
            }
        }
        class76.field1540 = 0;
        class102.method895(0);
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
    public static void method1244(int arg0) {
        if (arg0 != -3996) {
            method1243(121);
        }
        field2935 = null;
        field2940 = null;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, true);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = -1 % ((arg1 - 28) / 53);
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2937 = arg2.method1841((byte) 52);
            }
        } else {
            this.field2936 = arg2.method1841((byte) 57);
        }
        ++field2939;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2938;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            return null;
        } else {
            if (super.field1601.field124) {
                int[] var4 = this.method710(arg0, 0, (byte) 94);
                for (int var5 = 0; class137.field2308 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = this.field2936 <= var6 && ~this.field2937 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    static {
        new class309("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field2940 = new class399(260);
    }
}
