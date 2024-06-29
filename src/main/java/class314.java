import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class314 {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lcga;")
    public static class449 field3935 = new class449(68, -1);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lrh;")
    public static class249 field3941;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "[B")
    public byte[] field3939;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "[S")
    public short[] field3937;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "[S")
    public short[] field3940;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "[S")
    public short[] field3943;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1837(int arg0) {
        field3938++;
        if (arg0 != 103) {
            field3935 = null;
        }
        if (class278.field3538 != 0) {
            class15.field148 -= class278.field3538 * 5;
            if (class209.field2475 <= class15.field148) {
                class15.field148 = class209.field2475 - 1;
            }
            if (class15.field148 < 0) {
                class15.field148 = 0;
            }
            class278.field3538 = 0;
        }
        if (class127.field1547 < 102) {
            class127.field1547 += 6;
        }
        for (int var1 = 0; var1 < class142.field1725; var1++) {
            class521 var2 = class184.field2162[var1];
            int var3 = var2.method731((byte) -107);
            char var4 = var2.method730(arg0 + 13507);
            int var5 = var2.method734((byte) 107);
            if (var3 == 84) {
                class499.method2721(false, (byte) 74);
            }
            if (var3 == 80) {
                class499.method2721(true, (byte) 76);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class95.field1236 != null) {
                    String var6 = "";
                    for (int var7 = class350.field4526.length - 1; var7 >= 0; var7--) {
                        if (class350.field4526[var7] != null && class350.field4526[var7].length() > 0) {
                            var6 = var6 + class350.field4526[var7] + '\n';
                        }
                    }
                    class95.field1236.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class95.field1236 != null) {
                    Transferable var8 = class95.field1236.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class112.method774('\n', 1, var9);
                                if (var10.length > 1) {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class229.field2957 = var10[var11];
                                        class499.method2721(false, (byte) 29);
                                    }
                                } else {
                                    class229.field2957 = class229.field2957 + var9;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class608.field8289 > 0) {
                class229.field2957 = class229.field2957.substring(0, class608.field8289 - 1) + class229.field2957.substring(class608.field8289);
                class608.field8289--;
            } else if (var3 == 101 && class608.field8289 < class229.field2957.length()) {
                class229.field2957 = class229.field2957.substring(0, class608.field8289) + class229.field2957.substring(class608.field8289 + 1);
            } else if (var3 == 96 && class608.field8289 > 0) {
                class608.field8289--;
            } else if (var3 == 97 && class608.field8289 < class229.field2957.length()) {
                class608.field8289++;
            } else if (var3 == 102) {
                class608.field8289 = 0;
            } else if (var3 == 103) {
                class608.field8289 = class229.field2957.length();
            } else if (var3 == 104 && class593.field7960 < class350.field4526.length) {
                class593.field7960++;
                class633.method3549(-1);
                class608.field8289 = class229.field2957.length();
            } else if (var3 == 105 && class593.field7960 > 0) {
                class593.field7960--;
                class633.method3549(-1);
                class608.field8289 = class229.field2957.length();
            } else if (class274.method1634(var4, arg0 - 30780) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class229.field2957 = class229.field2957.substring(0, class608.field8289) + class184.field2162[var1].method730(13610) + class229.field2957.substring(class608.field8289);
                class608.field8289++;
            }
        }
        class142.field1725 = 0;
        class372.field4803 = 0;
        class377.method2172(arg0 - 3);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 177)
    public static void method1838(byte arg0) {
        field3935 = null;
        if (arg0 <= -110) {
            field3941 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I", line = 200)
    public static final int method1839(int arg0, int arg1) {
        if (arg0 == -103) {
            field3942++;
            return arg1 & 0xFF;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 212)
    public static final void method1840(boolean arg0) {
        if (!arg0) {
            method1838((byte) 103);
        }
        field3936++;
        class269.field3394.method1045((byte) 120);
    }
}
