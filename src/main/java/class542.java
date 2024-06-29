import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class542 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field8124 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lgw;ILjava/lang/String;)I")
    public static final int method3292(class148 arg0, int arg1, String arg2) {
        field8123++;
        int var3 = arg0.field2177;
        byte[] var4 = class136.method960(arg2, (byte) -119);
        arg0.method1035(var4.length, (byte) -114);
        arg0.field2177 += class215.field3166.method132(arg1, var4.length, arg0.field2177, false, var4, arg0.field2146);
        return arg0.field2177 - var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method3293(int arg0) {
        if (class538.field8011 < 102) {
            class538.field8011 += 6;
        }
        field8122++;
        if (class185.field2777 != 0) {
            class182.field2744 -= class185.field2777 * 5;
            if (class182.field2744 >= class33.field399) {
                class182.field2744 = class33.field399 - 1;
            }
            class185.field2777 = 0;
            if (class182.field2744 < 0) {
                class182.field2744 = 0;
            }
        }
        if (arg0 <= 69) {
            return;
        }
        for (int var1 = 0; var1 < class46.field559; var1++) {
            class109 var2 = class36.field427[var1];
            int var3 = var2.method802(-107);
            char var4 = var2.method799(94);
            int var5 = var2.method803((byte) 103);
            if (var3 == 84) {
                class199.method1337((byte) 123, false);
            }
            if (var3 == 80) {
                class199.method1337((byte) 70, true);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class146.field2126 != null) {
                    String var10 = "";
                    for (int var11 = class540.field8106.length - 1; var11 >= 0; var11--) {
                        if (class540.field8106[var11] != null && class540.field8106[var11].length() > 0) {
                            var10 = var10 + class540.field8106[var11] + '\n';
                        }
                    }
                    class146.field2126.setContents(new StringSelection(var10), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class146.field2126 != null) {
                    Transferable var6 = class146.field2126.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class587.method3490('\n', -109, var7);
                                if (var8.length <= 1) {
                                    class527.field7657 = class527.field7657 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class527.field7657 = var8[var9];
                                        class199.method1337((byte) 67, false);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class145.field2044 > 0) {
                class527.field7657 = class527.field7657.substring(0, class145.field2044 - 1) + class527.field7657.substring(class145.field2044);
                class145.field2044--;
            } else if (var3 == 101 && class145.field2044 < class527.field7657.length()) {
                class527.field7657 = class527.field7657.substring(0, class145.field2044) + class527.field7657.substring(class145.field2044 + 1);
            } else if (var3 == 96 && class145.field2044 > 0) {
                class145.field2044--;
            } else if (var3 == 97 && class145.field2044 < class527.field7657.length()) {
                class145.field2044++;
            } else if (var3 == 102) {
                class145.field2044 = 0;
            } else if (var3 == 103) {
                class145.field2044 = class527.field7657.length();
            } else if (var3 == 104 && class540.field8106.length > class529.field7895) {
                class529.field7895++;
                class208.method1373(1);
                class145.field2044 = class527.field7657.length();
            } else if (var3 == 105 && class529.field7895 > 0) {
                class529.field7895--;
                class208.method1373(1);
                class145.field2044 = class527.field7657.length();
            } else if (class433.method2530(-107, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class527.field7657 = class527.field7657.substring(0, class145.field2044) + class36.field427[var1].method799(76) + class527.field7657.substring(class145.field2044);
                class145.field2044++;
            }
        }
        class46.field559 = 0;
        class504.method2996((byte) 106);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
    public static final void method3294(byte arg0, int arg1) {
        class90.field1352 = arg1;
        int var2 = 108 % ((arg0 + 64) / 48);
        class276.field3881 = 100;
        class572.field8429 = 3;
        field8120++;
        class383.field5268 = -1;
    }
}
