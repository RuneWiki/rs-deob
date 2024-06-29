import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class254 {

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lwj;")
    public static class270 field3531;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lbk;")
    public class254 field3525;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lbk;")
    public class254 field3529;

    static {
        new class466("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field3531 = new class270(22, -1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I", line = 8)
    public static final int method1521(int arg0, int arg1) {
        if (arg0 > -86) {
            method1523(51);
        }
        field3528++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 20)
    public final void method1522(int arg0) {
        if (arg0 != -59) {
            method1526(59, -69);
        }
        field3527++;
        if (this.field3525 != null) {
            this.field3525.field3529 = this.field3529;
            this.field3529.field3525 = this.field3525;
            this.field3529 = null;
            this.field3525 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 37)
    public static void method1523(int arg0) {
        int var1 = 67 / ((arg0 + 69) / 51);
        field3531 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Z", line = 56)
    public static final boolean method1524(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field3530++;
            return (arg1 & 0x580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 67)
    public static final void method1525(byte arg0) {
        if (class77.field1061 < 102) {
            class77.field1061 += 6;
        }
        field3524++;
        if (class244.field3409 != 0) {
            class6.field107 -= class244.field3409 * 5;
            if (class6.field107 >= class410.field5996) {
                class6.field107 = class410.field5996 - 1;
            }
            class244.field3409 = 0;
            if (class6.field107 < 0) {
                class6.field107 = 0;
            }
        }
        if (arg0 < 89) {
            field3531 = null;
        }
        for (int var1 = 0; var1 < class296.field4062; var1++) {
            int var2 = class373.field5481[var1].method1149(true);
            char var3 = class373.field5481[var1].method1151((byte) -29);
            if (var2 == 84) {
                class494.method2892((byte) 82);
            } else if (class310.field4231.method901(0, 82) && var2 == 66) {
                if (class52.field635 != null) {
                    String var8 = "";
                    for (int var9 = class63.field790.length - 1; var9 >= 0; var9--) {
                        if (class63.field790[var9] != null && class63.field790[var9].length() > 0) {
                            var8 = var8 + class63.field790[var9] + '\n';
                        }
                    }
                    class52.field635.setContents(new StringSelection(var8), null);
                }
            } else if (class310.field4231.method901(0, 82) && var2 == 67) {
                if (class52.field635 != null) {
                    Transferable var4 = class52.field635.getContents(null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class38.method284('\n', var5, false);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class218.field3047 = var6[var7];
                                        class494.method2892((byte) -79);
                                    }
                                } else {
                                    class218.field3047 = class218.field3047 + var5;
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class378.field5542 > 0) {
                class218.field3047 = class218.field3047.substring(0, class378.field5542 - 1) + class218.field3047.substring(class378.field5542);
                class378.field5542--;
            } else if (var2 == 101 && class378.field5542 < class218.field3047.length()) {
                class218.field3047 = class218.field3047.substring(0, class378.field5542) + class218.field3047.substring(class378.field5542 + 1);
            } else if (var2 == 96 && class378.field5542 > 0) {
                class378.field5542--;
            } else if (var2 == 97 && class378.field5542 < class218.field3047.length()) {
                class378.field5542++;
            } else if (var2 == 102) {
                class378.field5542 = 0;
            } else if (var2 == 103) {
                class378.field5542 = class218.field3047.length();
            } else if (var2 == 104 && class63.field790.length > class453.field6662) {
                class453.field6662++;
                class305.method1776(2722);
                class378.field5542 = class218.field3047.length();
            } else if (var2 == 105 && class453.field6662 > 0) {
                class453.field6662--;
                class305.method1776(2722);
                class378.field5542 = class218.field3047.length();
            } else if (class44.method414(var3, 48) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class218.field3047 = class218.field3047.substring(0, class378.field5542) + class373.field5481[var1].method1151((byte) -116) + class218.field3047.substring(class378.field5542);
                class378.field5542++;
            }
        }
        class296.field4062 = 0;
        class361.method2180(true);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)I", line = 230)
    public static final int method1526(int arg0, int arg1) {
        field3526++;
        if (arg1 != 399515434) {
            method1521(49, -101);
        }
        return arg0 >>> 10;
    }
}
