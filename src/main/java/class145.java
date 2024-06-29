import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class145 {

    @OriginalMember(owner = "client!un", name = "f", descriptor = "[I")
    public static int[] field1967 = new int[500];

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lsj;")
    public static class474 field1962;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "[I")
    public static int[] field1963;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public static void method1012(int arg0) {
        int var1 = -94 % ((arg0 + 67) / 56);
        field1967 = null;
        field1963 = null;
        field1962 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1013(String arg0, byte arg1, String arg2, int arg3, int arg4, String arg5, String arg6) {
        int var7 = 6 / ((67 - arg1) / 32);
        field1969++;
        class399.method2417(false, arg2, -1, arg6, arg4, arg5, arg3, arg0, null);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        field1968++;
        if (class348.field5140 < 102) {
            class348.field5140 += 6;
        }
        if (class270.field3837 != -1 && class465.method2818(255) > class704.field9920) {
            for (int var1 = class270.field3837; var1 < class338.field4663.length; var1++) {
                if (class338.field4663[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class338.field4663[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class646.method3726("Pausing for " + var2 + " seconds...", -115);
                    class270.field3837 = var1 + 1;
                    class704.field9920 = class465.method2818(255) + (long) (var2 * 1000);
                    return;
                }
                class683.field9700 = class338.field4663[var1];
                class494.method3008(false, 0);
            }
            class270.field3837 = -1;
        }
        if (class428.field6170 != 0) {
            class319.field4347 -= class428.field6170 * 5;
            if (class379.field5507 <= class319.field4347) {
                class319.field4347 = class379.field5507 - 1;
            }
            if (class319.field4347 < 0) {
                class319.field4347 = 0;
            }
            class428.field6170 = 0;
        }
        for (int var3 = 0; var3 < class518.field7470; var3++) {
            class462 var4 = class282.field3945[var3];
            int var5 = var4.method2800((byte) -110);
            char var6 = var4.method2802(-17007);
            int var7 = var4.method2803((byte) -128);
            if (var5 == 84) {
                class494.method3008(false, 0);
            }
            if (var5 == 80) {
                class494.method3008(true, arg0 - 5);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class554.field8058 != null) {
                    String var11 = "";
                    for (int var12 = class445.field6360.length - 1; var12 >= 0; var12--) {
                        if (class445.field6360[var12] != null && class445.field6360[var12].length() > 0) {
                            var11 = var11 + class445.field6360[var12] + '\n';
                        }
                    }
                    class554.field8058.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class554.field8058 != null) {
                    Transferable var8 = class554.field8058.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class330.method2035('\n', var9, (byte) 114);
                                class386.method2377((byte) -105, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class308.field4179 > 0) {
                class683.field9700 = class683.field9700.substring(0, class308.field4179 - 1) + class683.field9700.substring(class308.field4179);
                class308.field4179--;
            } else if (var5 == 101 && class308.field4179 < class683.field9700.length()) {
                class683.field9700 = class683.field9700.substring(0, class308.field4179) + class683.field9700.substring(class308.field4179 + 1);
            } else if (var5 == 96 && class308.field4179 > 0) {
                class308.field4179--;
            } else if (var5 == 97 && class308.field4179 < class683.field9700.length()) {
                class308.field4179++;
            } else if (var5 == 102) {
                class308.field4179 = 0;
            } else if (var5 == 103) {
                class308.field4179 = class683.field9700.length();
            } else if (var5 == 104 && class514.field7446 < class445.field6360.length) {
                class514.field7446++;
                class434.method2667(0);
                class308.field4179 = class683.field9700.length();
            } else if (var5 == 105 && class514.field7446 > 0) {
                class514.field7446--;
                class434.method2667(0);
                class308.field4179 = class683.field9700.length();
            } else if (class272.method1773(-66, var6) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class683.field9700 = class683.field9700.substring(0, class308.field4179) + class282.field3945[var3].method2802(arg0 ^ 0xFFFFBD94) + class683.field9700.substring(class308.field4179);
                class308.field4179++;
            }
        }
        class518.field7470 = 0;
        class147.field2140 = 0;
        if (arg0 != 5) {
            field1963 = null;
        }
        class328.method2021(-8586);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V")
    public static final void method1015(boolean arg0, byte arg1) {
        if (arg0 && class664.field9481 != null) {
            class334.field4532 = class664.field9481.field9731;
        } else {
            class334.field4532 = -1;
        }
        field1966++;
        class344.field4731 = null;
        class664.field9481 = null;
        class499.field7172 = 0;
        class524.field7613 = null;
        class664.method3780();
        class664.field9495.method3553(0);
        class311.field4214 = null;
        class664.field9490 = null;
        class748.field10424 = null;
        class417.field5972 = null;
        class196.field2867 = null;
        class120.field1639 = -1;
        class126.field1743 = null;
        class713.field10039 = null;
        class709.field9963 = -1;
        if (arg1 != -87) {
            return;
        }
        class64.field1008 = null;
        class157.field2257 = null;
        class611.field8741 = null;
        if (class664.field9482 != null) {
            class664.field9482.method2686(-14237);
            class664.field9482.method2690(64, 128, 64);
        }
        if (class664.field9483 != null) {
            class664.field9483.method4087(64, 64, true);
        }
        if (class664.field9478 != null) {
            class664.field9478.method2681(16383, 64);
        }
        class215.field3233.method1141(64, (byte) -89);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;ZIZLjava/lang/String;IIJIJIIZ)V")
    public static final void method1016(String arg0, boolean arg1, int arg2, boolean arg3, String arg4, int arg5, int arg6, long arg7, int arg8, long arg9, int arg10, int arg11, boolean arg12) {
        field1964++;
        if (class147.field2154 || class456.field6499 >= 500) {
            return;
        }
        int var15 = arg8 == -1 ? class548.field7953 : arg8;
        class304 var16 = new class304(arg0, arg4, var15, arg10, arg11, arg9, arg6, arg2, arg1, arg12, arg7, arg3);
        if (arg5 > -116) {
            method1014(102);
        }
        class394.method2400(-90, var16);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
    public static final boolean method1017(int arg0, int arg1) {
        field1965++;
        if (arg0 == 19 || arg0 == 20 || arg0 == 12 || arg0 == 49 || arg0 == 59) {
            return true;
        } else if (arg0 == 13 || arg0 == 1004) {
            return true;
        } else {
            if (arg1 <= 40) {
                field1962 = null;
            }
            return false;
        }
    }
}
