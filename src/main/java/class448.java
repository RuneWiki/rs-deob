import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class448 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lpu;")
    public static class411 field6680 = new class411();

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Z")
    public static boolean field6684;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lqs;")
    public static class496 field6682;

    static {
        new class306("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field6684 = false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BBLch;II)V", line = 7)
    public static final void method2686(byte arg0, byte arg1, class166 arg2, int arg3, int arg4) {
        field6681++;
        int var5 = arg2.field3159[0];
        int var6 = arg2.field3158[0];
        if (var5 < 0 || class217.field3775 <= var5 || var6 < 0 || class277.field4548 <= var6 || arg4 < 0 || arg4 >= class217.field3775 || arg3 < 0 || class277.field4548 <= arg3) {
            return;
        }
        int var7 = class88.method622(0, arg3, -4, (byte) -96, arg4, class295.field4751, class106.field1865[arg2.field4720], var5, var6, 0, arg2.method1143(0), 0, true, class229.field3998, 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg2.method1145(arg1, class229.field3998[var8], class295.field4751[var8], -1);
            }
            int var9 = -89 / ((arg0 + 38) / 34);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 42)
    public static void method2687(byte arg0) {
        field6680 = null;
        field6682 = null;
        if (arg0 != -55) {
            method2687((byte) 70);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 67)
    public static final void method2688(byte arg0) {
        if (class331.field5206 < 102) {
            class331.field5206 += 6;
        }
        if (class147.field2394 != 0) {
            class265.field4425 -= class147.field2394 * 5;
            if (class307.field4888 <= class265.field4425) {
                class265.field4425 = class307.field4888 - 1;
            }
            class147.field2394 = 0;
            if (class265.field4425 < 0) {
                class265.field4425 = 0;
            }
        }
        field6679++;
        for (int var1 = 0; var1 < class188.field2946; var1++) {
            int var2 = class447.field6677[var1].method308(-75);
            char var3 = class447.field6677[var1].method306(0);
            if (var2 == 84) {
                class283.method1849(false, (byte) 99);
            }
            if (var2 == 80) {
                class283.method1849(true, (byte) 99);
            } else if (class468.field6955.method1369(82, 26) && var2 == 66) {
                if (class146.field2388 != null) {
                    String var4 = "";
                    for (int var5 = class383.field5913.length - 1; var5 >= 0; var5--) {
                        if (class383.field5913[var5] != null && class383.field5913[var5].length() > 0) {
                            var4 = var4 + class383.field5913[var5] + '\n';
                        }
                    }
                    class146.field2388.setContents(new StringSelection(var4), null);
                }
            } else if (class468.field6955.method1369(82, 26) && var2 == 67) {
                if (class146.field2388 != null) {
                    Transferable var6 = class146.field2388.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class241.method1661('\n', -20326, var7);
                                if (var8.length <= 1) {
                                    class250.field4263 = class250.field4263 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class250.field4263 = var8[var9];
                                        class283.method1849(false, (byte) 120);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class158.field2549 > 0) {
                class250.field4263 = class250.field4263.substring(0, class158.field2549 - 1) + class250.field4263.substring(class158.field2549);
                class158.field2549--;
            } else if (var2 == 101 && class158.field2549 < class250.field4263.length()) {
                class250.field4263 = class250.field4263.substring(0, class158.field2549) + class250.field4263.substring(class158.field2549 + 1);
            } else if (var2 == 96 && class158.field2549 > 0) {
                class158.field2549--;
            } else if (var2 == 97 && class158.field2549 < class250.field4263.length()) {
                class158.field2549++;
            } else if (var2 == 102) {
                class158.field2549 = 0;
            } else if (var2 == 103) {
                class158.field2549 = class250.field4263.length();
            } else if (var2 == 104 && class160.field2564 < class383.field5913.length) {
                class160.field2564++;
                class158.method1104((byte) 118);
                class158.field2549 = class250.field4263.length();
            } else if (var2 == 105 && class160.field2564 > 0) {
                class160.field2564--;
                class158.method1104((byte) 64);
                class158.field2549 = class250.field4263.length();
            } else if (class88.method623(var3, 90) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class250.field4263 = class250.field4263.substring(0, class158.field2549) + class447.field6677[var1].method306(0) + class250.field4263.substring(class158.field2549);
                class158.field2549++;
            }
        }
        class188.field2946 = 0;
        class408.method2530(17234);
        if (arg0 >= -87) {
            field6684 = true;
        }
    }
}
