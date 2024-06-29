import java.awt.Canvas;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class70 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lrh;")
    private class59 field914;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lpg;")
    public static class150 field916;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lsf;")
    private class28 field922;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)I")
    public static final int method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -31023) {
            field916 = null;
        }
        field919++;
        if (class397.field5666 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var6 = arg5 >> 9;
            int var7 = arg0 >> 9;
            if (arg3 < 0 || arg4 < 0 || class588.field8082 - 1 < arg3 || arg4 > class12.field113 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class588.field8082 - 1 || var7 > (class12.field113 - 1)) {
                return 0;
            }
            boolean var8 = (class645.field9140[1][arg5 >> 9][arg0 >> 9] & 0x2) != 0;
            if ((arg5 & 0x1FF) == 0) {
                boolean var9 = (class645.field9140[1][var6 - 1][arg0 >> 9] & 0x2) != 0;
                boolean var10 = (class645.field9140[1][var6][arg0 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class645.field9140[1][arg3][arg4] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x1FF) == 0) {
                boolean var11 = (class645.field9140[1][arg5 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class645.field9140[1][arg5 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class645.field9140[1][arg3][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class397.field5666[arg1].method159(arg5, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lsf;")
    public final class28 method412(int arg0) {
        field924++;
        class28 var2 = this.field922;
        if (arg0 < 50) {
            method411(-42, -110, -19, 2, -125, 7);
        }
        if (this.field914.field825 == var2) {
            this.field922 = null;
            return null;
        } else {
            this.field922 = var2.field276;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method413(int arg0) {
        field913++;
        if (class476.field6436 == 3) {
            class676.method3739(-22149, 4);
        } else if (class476.field6436 == 7) {
            class676.method3739(-22149, 8);
        } else if (class476.field6436 == 10) {
            class676.method3739(-22149, 11);
        }
        if (arg0 != 11) {
            field916 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static final void method414(int arg0) {
        field923++;
        if (arg0 > -76) {
            method419((byte) 9, null);
        }
        if (class667.field9492 != class375.field5396) {
            try {
                class302.method1821(class167.field2083, 10049, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)Lsf;")
    public final class28 method415(byte arg0) {
        field915++;
        if (arg0 != -30) {
            method417(false);
        }
        class28 var2 = this.field914.field825.field276;
        if (this.field914.field825 == var2) {
            this.field922 = null;
            return null;
        } else {
            this.field922 = var2.field276;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static final void method416(int arg0) {
        field918++;
        if (class69.field912 < 102) {
            class69.field912 += 6;
        }
        if (class627.field8530 != 0) {
            class443.field6117 -= class627.field8530 * 5;
            if (class443.field6117 >= class541.field7402) {
                class443.field6117 = class541.field7402 - 1;
            }
            if (class443.field6117 < 0) {
                class443.field6117 = 0;
            }
            class627.field8530 = 0;
        }
        int var1 = 0;
        if (arg0 != 352805641) {
            return;
        }
        while (class18.field154 > var1) {
            class136 var2 = class143.field1818[var1];
            int var3 = var2.method97(false);
            char var4 = var2.method99(17220);
            int var5 = var2.method100(4424);
            if (var3 == 84) {
                class357.method2214(false, (byte) -4);
            }
            if (var3 == 80) {
                class357.method2214(true, (byte) -126);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class327.field4791 != null) {
                    String var10 = "";
                    for (int var11 = class603.field8242.length - 1; var11 >= 0; var11--) {
                        if (class603.field8242[var11] != null && class603.field8242[var11].length() > 0) {
                            var10 = var10 + class603.field8242[var11] + '\n';
                        }
                    }
                    class327.field4791.setContents(new StringSelection(var10), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class327.field4791 != null) {
                    Transferable var6 = class327.field4791.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class105.method562(var7, '\n', true);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class427.field5933 = var8[var9];
                                        class357.method2214(false, (byte) 39);
                                    }
                                } else {
                                    class427.field5933 = class427.field5933 + var7;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class557.field7603 > 0) {
                class427.field5933 = class427.field5933.substring(0, class557.field7603 - 1) + class427.field5933.substring(class557.field7603);
                class557.field7603--;
            } else if (var3 == 101 && class557.field7603 < class427.field5933.length()) {
                class427.field5933 = class427.field5933.substring(0, class557.field7603) + class427.field5933.substring(class557.field7603 + 1);
            } else if (var3 == 96 && class557.field7603 > 0) {
                class557.field7603--;
            } else if (var3 == 97 && class557.field7603 < class427.field5933.length()) {
                class557.field7603++;
            } else if (var3 == 102) {
                class557.field7603 = 0;
            } else if (var3 == 103) {
                class557.field7603 = class427.field5933.length();
            } else if (var3 == 104 && class610.field8316 < class603.field8242.length) {
                class610.field8316++;
                class599.method3322(arg0 ^ 0xEAF89CAD);
                class557.field7603 = class427.field5933.length();
            } else if (var3 == 105 && class610.field8316 > 0) {
                class610.field8316--;
                class599.method3322(arg0 ^ 0xEAF89CA2);
                class557.field7603 = class427.field5933.length();
            } else if (class544.method3064(-91, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class427.field5933 = class427.field5933.substring(0, class557.field7603) + class143.field1818[var1].method99(17220) + class427.field5933.substring(class557.field7603);
                class557.field7603++;
            }
            var1++;
        }
        class18.field154 = 0;
        class410.field5757 = 0;
        class578.method3251((byte) 73);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method417(boolean arg0) {
        field916 = null;
        if (!arg0) {
            method417(false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBLjava/awt/Canvas;Le;)Loa;")
    public static final class689 method418(int arg0, byte arg1, Canvas arg2, class479 arg3) {
        field921++;
        return arg1 > -39 ? null : new class641(arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLoa;)V")
    public static final void method419(byte arg0, class689 arg1) {
        field917++;
        int var2 = -65 / ((arg0 + 7) / 50);
        for (class117 var3 = (class117) class379.field5440.method2224((byte) -112); var3 != null; var3 = (class117) class379.field5440.method2222((byte) -53)) {
            if (var3.field1513) {
                var3.method720(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lrh;Z)V")
    public final void method420(class59 arg0, boolean arg1) {
        field920++;
        this.field914 = arg0;
        if (arg1) {
            method419((byte) 19, null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class70() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lrh;)V")
    public class70(class59 arg0) {
        this.field914 = arg0;
    }
}
