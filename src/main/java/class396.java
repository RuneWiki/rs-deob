import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class396 {

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
    public static int[] field6019 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field6021 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lqo;")
    public static class141 field6016 = new class141(8);

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lpg;")
    public static class492 field6022 = new class492(61, 7);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lf;")
    public static class191 field6018;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method2436(int arg0) {
        if (class338.field5349 != 0) {
            class52.field703 -= class338.field5349 * 5;
            if (class52.field703 >= class74.field993) {
                class52.field703 = class74.field993 - 1;
            }
            class338.field5349 = 0;
            if (class52.field703 < 0) {
                class52.field703 = 0;
            }
        }
        if (class33.field523 < 102) {
            class33.field523 += 6;
        }
        field6017++;
        if (arg0 != -45) {
            method2437((byte) 107, 118);
        }
        for (int var1 = 0; var1 < class12.field199; var1++) {
            int var2 = class453.field6651[var1].method1946(4);
            char var3 = class453.field6651[var1].method1945((byte) 127);
            if (var2 == 84) {
                class54.method372((byte) 127);
            } else if (class382.field5821.method705((byte) 43, 82) && var2 == 66) {
                if (class128.field1810 != null) {
                    String var8 = "";
                    for (int var9 = class341.field5382.length - 1; var9 >= 0; var9--) {
                        if (class341.field5382[var9] != null && class341.field5382[var9].length() > 0) {
                            var8 = var8 + class341.field5382[var9] + '\n';
                        }
                    }
                    class128.field1810.setContents(new StringSelection(var8), null);
                }
            } else if (class382.field5821.method705((byte) 43, 82) && var2 == 67) {
                if (class128.field1810 != null) {
                    Transferable var4 = class128.field1810.getContents(null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class14.method125(arg0 + 142, '\n', var5);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class350.field5444 = var6[var7];
                                        class54.method372((byte) 121);
                                    }
                                } else {
                                    class350.field5444 = class350.field5444 + var5;
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class300.field4438 > 0) {
                class350.field5444 = class350.field5444.substring(0, class300.field4438 - 1) + class350.field5444.substring(class300.field4438);
                class300.field4438--;
            } else if (var2 == 101 && class300.field4438 < class350.field5444.length()) {
                class350.field5444 = class350.field5444.substring(0, class300.field4438) + class350.field5444.substring(class300.field4438 + 1);
            } else if (var2 == 96 && class300.field4438 > 0) {
                class300.field4438--;
            } else if (var2 == 97 && class300.field4438 < class350.field5444.length()) {
                class300.field4438++;
            } else if (var2 == 102) {
                class300.field4438 = 0;
            } else if (var2 == 103) {
                class300.field4438 = class350.field5444.length();
            } else if (var2 == 104 && class97.field1410 < class341.field5382.length) {
                class97.field1410++;
                class15.method130(0);
                class300.field4438 = class350.field5444.length();
            } else if (var2 == 105 && class97.field1410 > 0) {
                class97.field1410--;
                class15.method130(0);
                class300.field4438 = class350.field5444.length();
            } else if (class92.method646(var3, arg0 ^ 0xFFFFFFB5) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class350.field5444 = class350.field5444.substring(0, class300.field4438) + class453.field6651[var1].method1945((byte) 125) + class350.field5444.substring(class300.field4438);
                class300.field4438++;
            }
        }
        class12.field199 = 0;
        class268.method1710(true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)C")
    public static final char method2437(byte arg0, int arg1) {
        field6020++;
        if (arg1 != -5513) {
            method2436(105);
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class102.field1460[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method2438(byte arg0) {
        field6018 = null;
        field6019 = null;
        if (arg0 == -112) {
            field6016 = null;
            field6022 = null;
        }
    }
}
