import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class733 {

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9917 = 0;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public int field9912;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public int field9913;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public int field9914;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public int field9915;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public int field9919;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public int field9921;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public int field9923;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public int field9925;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public int field9926;

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
    public int field9927;

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
    public int field9928;

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
    public int field9929;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBI)V")
    public static final void method4041(int arg0, byte arg1, int arg2) {
        if (arg1 >= -97) {
            field9917 = -50;
        }
        field9924++;
        class778 var3 = class389.method2406(-103, (long) arg2, 5);
        var3.method4274(92);
        var3.field10690 = arg0;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
    public static final void method4042(int arg0) {
        field9920++;
        if (class98.field1419 < 102) {
            class98.field1419 += 6;
        }
        if (arg0 != 12569) {
            field9917 = 45;
        }
        if (class91.field1287 != -1 && class401.method2440(false) > class42.field453) {
            for (int var1 = class91.field1287; var1 < class659.field8886.length; var1++) {
                if (class659.field8886[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class659.field8886[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class280.method1834((byte) 88, "Pausing for " + var2 + " seconds...");
                    class91.field1287 = var1 + 1;
                    class42.field453 = (long) (var2 * 1000) + class401.method2440(false);
                    return;
                }
                class753.field10200 = class659.field8886[var1];
                class55.method338(false, -93);
            }
            class91.field1287 = -1;
        }
        if (class685.field9162 != 0) {
            class507.field7106 -= class685.field9162 * 5;
            if (class507.field7106 >= class559.field7666) {
                class507.field7106 = class559.field7666 - 1;
            }
            class685.field9162 = 0;
            if (class507.field7106 < 0) {
                class507.field7106 = 0;
            }
        }
        for (int var3 = 0; var3 < class735.field9967; var3++) {
            class622 var4 = class123.field1707[var3];
            int var5 = var4.method1991(arg0 ^ 0x4F1F);
            char var6 = var4.method1989((byte) -35);
            int var7 = var4.method1994(-112);
            if (var5 == 84) {
                class55.method338(false, 52);
            }
            if (var5 == 80) {
                class55.method338(true, 69);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class26.field257 != null) {
                    String var11 = "";
                    for (int var12 = class614.field8305.length - 1; var12 >= 0; var12--) {
                        if (class614.field8305[var12] != null && class614.field8305[var12].length() > 0) {
                            var11 = var11 + class614.field8305[var12] + '\n';
                        }
                    }
                    class26.field257.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class26.field257 != null) {
                    Transferable var8 = class26.field257.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class684.method3748(-2242, var9, '\n');
                                class197.method1292(arg0 ^ 0xFFFFC946, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class382.field5560 > 0) {
                class753.field10200 = class753.field10200.substring(0, class382.field5560 - 1) + class753.field10200.substring(class382.field5560);
                class382.field5560--;
            } else if (var5 == 101 && class382.field5560 < class753.field10200.length()) {
                class753.field10200 = class753.field10200.substring(0, class382.field5560) + class753.field10200.substring(class382.field5560 + 1);
            } else if (var5 == 96 && class382.field5560 > 0) {
                class382.field5560--;
            } else if (var5 == 97 && class382.field5560 < class753.field10200.length()) {
                class382.field5560++;
            } else if (var5 == 102) {
                class382.field5560 = 0;
            } else if (var5 == 103) {
                class382.field5560 = class753.field10200.length();
            } else if (var5 == 104 && class446.field6419 < class614.field8305.length) {
                class446.field6419++;
                class775.method4266((byte) 122);
                class382.field5560 = class753.field10200.length();
            } else if (var5 == 105 && class446.field6419 > 0) {
                class446.field6419--;
                class775.method4266((byte) 117);
                class382.field5560 = class753.field10200.length();
            } else if (class429.method2580(var6, true) || var6 == '\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class753.field10200 = class753.field10200.substring(0, class382.field5560) + class123.field1707[var3].method1989((byte) 94) + class753.field10200.substring(class382.field5560);
                class382.field5560++;
            }
        }
        class735.field9967 = 0;
        class243.field3194 = 0;
        class166.method1137(false);
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
    public static final int method4043(int arg0) {
        if (arg0 != 96) {
            method4045(44, null);
        }
        field9922++;
        return class180.field2361.method1009(19684);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZLpw;)Z")
    public final boolean method4044(boolean arg0, class733 arg1) {
        field9916++;
        if (this.field9913 == arg1.field9913 && this.field9921 == arg1.field9921 && this.field9926 == arg1.field9926) {
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILofa;)Lofa;")
    public static final class347 method4045(int arg0, class347 arg1) {
        field9918++;
        if (arg0 != -24216) {
            return null;
        }
        class347 var2 = client.method2044(arg1);
        if (var2 == null) {
            var2 = arg1.field4954;
        }
        return var2;
    }
}
