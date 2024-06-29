import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class497 {

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "Ljf;")
    public static class640 field6964 = new class640(7, 19);

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "Ljf;")
    public static class640 field6968 = new class640(2, 3);

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "Z")
    public static boolean field6971 = true;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    public static int field6969 = class668.method3830((byte) -7, 1600);

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "F")
    public static float field6966;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V")
    public static void method2980(int arg0) {
        if (arg0 != 95) {
            field6966 = -0.7619675F;
        }
        field6968 = null;
        field6964 = null;
    }

    @OriginalMember(owner = "client!gha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6967++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)Z")
    public final boolean method2981(int arg0) {
        if (arg0 > -110) {
            field6964 = null;
        }
        field6970++;
        return class96.field1400 == this | class77.field1058 == this;
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
    public static final void method2982(int arg0) {
        field6965++;
        if (class622.field8846 < 102) {
            class622.field8846 += 6;
        }
        if (class200.field2897 != -1 && class224.method1457((byte) -62) > class77.field1053) {
            for (int var1 = class200.field2897; var1 < class464.field6352.length; var1++) {
                if (class464.field6352[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class464.field6352[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class645.method3738("Pausing for " + var2 + " seconds...", (byte) -49);
                    class200.field2897 = var1 + 1;
                    class77.field1053 = (long) (var2 * 1000) + class224.method1457((byte) -62);
                    return;
                }
                class577.field8263 = class464.field6352[var1];
                class633.method3680(arg0 - 1, false);
            }
            class200.field2897 = -1;
        }
        if (class120.field1657 != 0) {
            class196.field2824 -= class120.field1657 * 5;
            if (class196.field2824 >= class30.field436) {
                class196.field2824 = class30.field436 - 1;
            }
            class120.field1657 = 0;
            if (class196.field2824 < 0) {
                class196.field2824 = 0;
            }
        }
        for (int var3 = 0; var3 < class457.field6296; var3++) {
            class243 var4 = class751.field10438[var3];
            int var5 = var4.method1541(arg0 - 26820);
            char var6 = var4.method1544(-28046);
            int var7 = var4.method1545((byte) -52);
            if (var5 == 84) {
                class633.method3680(-1, false);
            }
            if (var5 == 80) {
                class633.method3680(-1, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class278.field3716 != null) {
                    String var8 = "";
                    for (int var9 = class688.field9646.length - 1; var9 >= 0; var9--) {
                        if (class688.field9646[var9] != null && class688.field9646[var9].length() > 0) {
                            var8 = var8 + class688.field9646[var9] + '\n';
                        }
                    }
                    class278.field3716.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class278.field3716 != null) {
                    Transferable var10 = class278.field3716.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class498.method2984(var11, '\n', -97);
                                class535.method3196(-71, var12);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class718.field10149 > 0) {
                class577.field8263 = class577.field8263.substring(0, class718.field10149 - 1) + class577.field8263.substring(class718.field10149);
                class718.field10149--;
            } else if (var5 == 101 && class718.field10149 < class577.field8263.length()) {
                class577.field8263 = class577.field8263.substring(0, class718.field10149) + class577.field8263.substring(class718.field10149 + 1);
            } else if (var5 == 96 && class718.field10149 > 0) {
                class718.field10149--;
            } else if (var5 == 97 && class718.field10149 < class577.field8263.length()) {
                class718.field10149++;
            } else if (var5 == 102) {
                class718.field10149 = 0;
            } else if (var5 == 103) {
                class718.field10149 = class577.field8263.length();
            } else if (var5 == 104 && class688.field9646.length > class199.field2878) {
                class199.field2878++;
                class80.method482((byte) 120);
                class718.field10149 = class577.field8263.length();
            } else if (var5 == 105 && class199.field2878 > 0) {
                class199.field2878--;
                class80.method482((byte) -26);
                class718.field10149 = class577.field8263.length();
            } else if (class235.method1502(var6, (byte) -117) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class577.field8263 = class577.field8263.substring(0, class718.field10149) + class751.field10438[var3].method1544(-28046) + class577.field8263.substring(class718.field10149);
                class718.field10149++;
            }
        }
        class457.field6296 = arg0;
        class748.field10427 = 0;
        class330.method1918(7);
    }
}
