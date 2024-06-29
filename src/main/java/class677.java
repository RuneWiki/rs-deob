import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class677 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field9562 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Llj;")
    public static class570 field9564 = new class570(13, 0, 1, 0);

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Ltga;")
    public static class54 field9568 = new class54("WTWIP", 3);

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field9571 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lcu;")
    public static class206 field9569 = new class206(8, 8);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[Lag;")
    public static class641[] field9570;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILvj;II)V")
    public static final void method3785(int arg0, int arg1, class411 arg2, int arg3, int arg4) {
        field9565++;
        if (arg1 < 109) {
            return;
        }
        class543 var5 = arg2.method2353(-1);
        int var6 = arg2.field5593 - arg2.field5574.field8875 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg2.field5553 > 25) {
                arg2.field5609 = false;
                if (arg4 < 0 && var5.field7140 != -1) {
                    arg2.field5584 = var5.field7140;
                } else if (arg4 <= 0 || var5.field7170 == -1) {
                    arg2.field5584 = var5.field7184;
                } else {
                    arg2.field5584 = var5.field7170;
                }
            } else if (!arg2.field5609 || !var5.method3003(arg2.field5584, -111)) {
                arg2.field5584 = var5.method3002((byte) -108);
                arg2.field5609 = arg2.field5584 != -1;
            }
        } else if (arg2.field5551 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class94.field1446[arg0] - arg2.field5574.field8875 & 0x3FFF;
            if (arg3 == 2 && var5.field7186 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7174 != -1) {
                    arg2.field5584 = var5.field7174;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7147 != -1) {
                    arg2.field5584 = var5.field7147;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7136 == -1) {
                    arg2.field5584 = var5.field7186;
                } else {
                    arg2.field5584 = var5.field7136;
                }
            } else if (arg3 == 0 && var5.field7155 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field7156 != -1) {
                    arg2.field5584 = var5.field7156;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field7163 != -1) {
                    arg2.field5584 = var5.field7163;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field7153 == -1) {
                    arg2.field5584 = var5.field7155;
                } else {
                    arg2.field5584 = var5.field7153;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field7181 != -1) {
                arg2.field5584 = var5.field7181;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field7176 != -1) {
                arg2.field5584 = var5.field7176;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field7166 == -1) {
                arg2.field5584 = var5.field7184;
            } else {
                arg2.field5584 = var5.field7166;
            }
            arg2.field5609 = false;
        } else if (var6 == 0 && arg2.field5553 <= 25) {
            if (arg3 == 2 && var5.field7186 != -1) {
                arg2.field5584 = var5.field7186;
            } else if (arg3 == 0 && var5.field7155 != -1) {
                arg2.field5584 = var5.field7155;
            } else {
                arg2.field5584 = var5.field7184;
            }
            arg2.field5609 = false;
        } else {
            if (arg3 == 2 && var5.field7186 != -1) {
                if (arg4 < 0 && var5.field7165 != -1) {
                    arg2.field5584 = var5.field7165;
                } else if (arg4 <= 0 || var5.field7164 == -1) {
                    arg2.field5584 = var5.field7186;
                } else {
                    arg2.field5584 = var5.field7164;
                }
            } else if (arg3 == 0 && var5.field7155 != -1) {
                if (arg4 < 0 && var5.field7175 != -1) {
                    arg2.field5584 = var5.field7175;
                } else if (arg4 <= 0 || var5.field7160 == -1) {
                    arg2.field5584 = var5.field7155;
                } else {
                    arg2.field5584 = var5.field7160;
                }
            } else if (arg4 < 0 && var5.field7178 != -1) {
                arg2.field5584 = var5.field7178;
            } else if (arg4 <= 0 || var5.field7137 == -1) {
                arg2.field5584 = var5.field7184;
            } else {
                arg2.field5584 = var5.field7137;
            }
            arg2.field5609 = false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method3786(byte arg0) {
        field9564 = null;
        field9568 = null;
        field9570 = null;
        field9562 = null;
        if (arg0 <= 106) {
            method3786((byte) 41);
        }
        field9569 = null;
        field9571 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
    public static final void method3787(byte arg0) {
        field9563++;
        if (class36.field551 != 0) {
            class711.field9945 -= class36.field551 * 5;
            if (class711.field9945 >= class586.field7776) {
                class711.field9945 = class586.field7776 - 1;
            }
            if (class711.field9945 < 0) {
                class711.field9945 = 0;
            }
            class36.field551 = 0;
        }
        if (class147.field2352 < 102) {
            class147.field2352 += 6;
        }
        int var1 = 109 % ((-arg0 - 62) / 58);
        for (int var2 = 0; var2 < class404.field5409; var2++) {
            class293 var3 = class107.field1576[var2];
            int var4 = var3.method1809(13772);
            char var5 = var3.method1805(18449);
            int var6 = var3.method1807(-10117);
            if (var4 == 84) {
                class50.method342(false, false);
            }
            if (var4 == 80) {
                class50.method342(true, false);
            } else if (var4 == 66 && (var6 & 0x4) != 0) {
                if (class636.field8566 != null) {
                    String var7 = "";
                    for (int var8 = class287.field4063.length - 1; var8 >= 0; var8--) {
                        if (class287.field4063[var8] != null && class287.field4063[var8].length() > 0) {
                            var7 = var7 + class287.field4063[var8] + '\n';
                        }
                    }
                    class636.field8566.setContents(new StringSelection(var7), null);
                }
            } else if (var4 == 67 && (var6 & 0x4) != 0) {
                if (class636.field8566 != null) {
                    Transferable var9 = class636.field8566.getContents(null);
                    if (var9 != null) {
                        try {
                            String var10 = (String) var9.getTransferData(DataFlavor.stringFlavor);
                            if (var10 != null) {
                                String[] var11 = class572.method3141(var10, '\n', (byte) 12);
                                if (var11.length <= 1) {
                                    class656.field8914 = class656.field8914 + var10;
                                } else {
                                    for (int var12 = 0; var12 < var11.length; var12++) {
                                        class656.field8914 = var11[var12];
                                        class50.method342(false, false);
                                    }
                                }
                            }
                        } catch (Exception var13) {
                        }
                    }
                }
            } else if (var4 == 85 && class157.field2484 > 0) {
                class656.field8914 = class656.field8914.substring(0, class157.field2484 - 1) + class656.field8914.substring(class157.field2484);
                class157.field2484--;
            } else if (var4 == 101 && class157.field2484 < class656.field8914.length()) {
                class656.field8914 = class656.field8914.substring(0, class157.field2484) + class656.field8914.substring(class157.field2484 + 1);
            } else if (var4 == 96 && class157.field2484 > 0) {
                class157.field2484--;
            } else if (var4 == 97 && class157.field2484 < class656.field8914.length()) {
                class157.field2484++;
            } else if (var4 == 102) {
                class157.field2484 = 0;
            } else if (var4 == 103) {
                class157.field2484 = class656.field8914.length();
            } else if (var4 == 104 && class577.field7661 < class287.field4063.length) {
                class577.field7661++;
                class310.method1854(true);
                class157.field2484 = class656.field8914.length();
            } else if (var4 == 105 && class577.field7661 > 0) {
                class577.field7661--;
                class310.method1854(true);
                class157.field2484 = class656.field8914.length();
            } else if (class353.method2102(var5, -49) || var5 == ':' || var5 == ',' || var5 == ' ' || var5 == '_' || var5 == '-' || var5 == '+' || var5 == '[' || var5 == ']') {
                class656.field8914 = class656.field8914.substring(0, class157.field2484) + class107.field1576[var2].method1805(18449) + class656.field8914.substring(class157.field2484);
                class157.field2484++;
            }
        }
        class404.field5409 = 0;
        class386.field5134 = 0;
        class449.method2540((byte) -14);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
    public static final void method3788(byte arg0) {
        field9566++;
        if (class376.field5070 || arg0 <= 49) {
            return;
        }
        class527.method2944((byte) 112, class705.field9916);
        if (class412.field5656 != null) {
            class527.method2944((byte) 112, class412.field5656);
        }
        class376.field5070 = true;
    }
}
