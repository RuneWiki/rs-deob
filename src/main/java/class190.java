import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class190 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2783++;
        int var6 = class486.method2879((byte) 120, arg0, class233.field3241, class23.field320);
        if (arg4 != -1) {
            method1262(69, -24, -110, -32, -30, -122);
        }
        int var7 = class486.method2879((byte) 101, arg2, class233.field3241, class23.field320);
        int var8 = class486.method2879((byte) -86, arg5, class375.field5387, class519.field7633);
        int var9 = class486.method2879((byte) 72, arg3, class375.field5387, class519.field7633);
        for (int var10 = var6; var10 <= var7; var10++) {
            class188.method1259(var8, (byte) 27, var9, arg1, class42.field626[var10]);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1263(byte arg0) {
        field2782++;
        if (class181.field2695 != 0) {
            class343.field4961 -= class181.field2695 * 5;
            if (class343.field4961 >= class9.field110) {
                class343.field4961 = class9.field110 - 1;
            }
            class181.field2695 = 0;
            if (class343.field4961 < 0) {
                class343.field4961 = 0;
            }
        }
        if (class338.field4903 < 102) {
            class338.field4903 += 6;
        }
        if (arg0 != 44) {
            return;
        }
        for (int var1 = 0; var1 < class329.field4472; var1++) {
            int var2 = client.field7560[var1].method1437(arg0 - 24513);
            char var3 = client.field7560[var1].method1435(-126);
            if (var2 == 84) {
                class342.method2069(false, 48);
            }
            if (var2 == 80) {
                class342.method2069(true, arg0 ^ 0x6A);
            } else if (class78.field1106.method2585(82, (byte) 74) && var2 == 66) {
                if (class232.field3237 != null) {
                    String var4 = "";
                    for (int var5 = class379.field5448.length - 1; var5 >= 0; var5--) {
                        if (class379.field5448[var5] != null && class379.field5448[var5].length() > 0) {
                            var4 = var4 + class379.field5448[var5] + '\n';
                        }
                    }
                    class232.field3237.setContents(new StringSelection(var4), null);
                }
            } else if (class78.field1106.method2585(82, (byte) 58) && var2 == 67) {
                if (class232.field3237 != null) {
                    Transferable var6 = class232.field3237.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class139.method982('\n', (byte) 10, var7);
                                if (var8.length <= 1) {
                                    class441.field6349 = class441.field6349 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class441.field6349 = var8[var9];
                                        class342.method2069(false, -124);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class480.field6949 > 0) {
                class441.field6349 = class441.field6349.substring(0, class480.field6949 - 1) + class441.field6349.substring(class480.field6949);
                class480.field6949--;
            } else if (var2 == 101 && class480.field6949 < class441.field6349.length()) {
                class441.field6349 = class441.field6349.substring(0, class480.field6949) + class441.field6349.substring(class480.field6949 + 1);
            } else if (var2 == 96 && class480.field6949 > 0) {
                class480.field6949--;
            } else if (var2 == 97 && class480.field6949 < class441.field6349.length()) {
                class480.field6949++;
            } else if (var2 == 102) {
                class480.field6949 = 0;
            } else if (var2 == 103) {
                class480.field6949 = class441.field6349.length();
            } else if (var2 == 104 && class379.field5448.length > class178.field2666) {
                class178.field2666++;
                class28.method192((byte) -52);
                class480.field6949 = class441.field6349.length();
            } else if (var2 == 105 && class178.field2666 > 0) {
                class178.field2666--;
                class28.method192((byte) -18);
                class480.field6949 = class441.field6349.length();
            } else if (class280.method1619(34336, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class441.field6349 = class441.field6349.substring(0, class480.field6949) + client.field7560[var1].method1435(-122) + class441.field6349.substring(class480.field6949);
                class480.field6949++;
            }
        }
        class329.field4472 = 0;
        class157.method1127(1508614222);
    }
}
