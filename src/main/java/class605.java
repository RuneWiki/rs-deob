import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class605 extends class108 {

    @OriginalMember(owner = "client!aca", name = "S", descriptor = "I")
    public static int field8487 = 0;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!aca", name = "O", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!aca", name = "Q", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!aca", name = "R", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!aca", name = "T", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!aca", name = "P", descriptor = "Lae;")
    public static class283 field8484;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)V", line = 3)
    public static void method3492(int arg0) {
        if (arg0 >= -48) {
            method3494(false, -48, 68);
        }
        field8484 = null;
    }

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)V", line = 13)
    public static final void method3493(int arg0) {
        class306.field4440 = -1;
        ++field8486;
        class683.field9568 = -1;
        class255.field3779 = 0;
        class461.field6447 = -1;
        if (arg0 != -425370164) {
            method3495((byte) -118);
        }
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(ZII)Z", line = 29)
    public static final boolean method3494(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return true;
        } else {
            ++field8482;
            boolean var3 = (arg1 & 55) != 0 ? class138.method924(arg2, arg1, (byte) 14) : class171.method1100(arg2, 353, arg1);
            return var3 | class183.method1155(arg2, (byte) -117, arg1) | ~(65536 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "(B)V", line = 46)
    public static final void method3495(byte arg0) {
        if (~field8487 > -103) {
            field8487 += 6;
        }
        ++field8485;
        if (~class475.field6590 != 0 && ~class683.method3903((byte) 4) < ~class631.field8829) {
            for (int var1 = class475.field6590; ~var1 > ~class137.field1756.length; ++var1) {
                if (class137.field1756[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class137.field1756[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class629.method3616(false, "Pausing for " + var2 + " seconds...");
                    class475.field6590 = var1 + 1;
                    class631.field8829 = class683.method3903((byte) 4) + (long) (var2 * 1000);
                    return;
                }
                class108.field1279 = class137.field1756[var1];
                class712.method3998(true, false);
            }
            class475.field6590 = -1;
        }
        if (class637.field8957 != 0) {
            class534.field7390 -= class637.field8957 * 5;
            if (class534.field7390 >= class371.field5343) {
                class534.field7390 = class371.field5343 + -1;
            }
            class637.field8957 = 0;
            if (class534.field7390 < 0) {
                class534.field7390 = 0;
            }
        }
        int var3 = 0;
        if (arg0 <= 97) {
            field8487 = -72;
        }
        while (class94.field1099 > var3) {
            class659 var4 = class462.field6462[var3];
            int var5 = var4.method727(17788);
            char var6 = var4.method733((byte) -72);
            int var7 = var4.method729(3766);
            if (~var5 == -85) {
                class712.method3998(true, false);
            }
            if (~var5 == -81) {
                class712.method3998(true, true);
            } else if (var5 == 66 && ~(4 & var7) != -1) {
                if (class734.field10127 != null) {
                    String var11 = "";
                    for (int var12 = class74.field826.length + -1; var12 >= 0; --var12) {
                        if (class74.field826[var12] != null && class74.field826[var12].length() > 0) {
                            var11 = var11 + class74.field826[var12] + '\n';
                        }
                    }
                    class734.field10127.setContents(new StringSelection(var11), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && ~(var7 & 4) != -1) {
                if (class734.field10127 != null) {
                    Transferable var8 = class734.field10127.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class24.method105(var9, 19478, '\n');
                                class517.method3088(var10, (byte) 127);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (~var5 == -86 && ~class74.field829 < -1) {
                class108.field1279 = class108.field1279.substring(0, class74.field829 + -1) + class108.field1279.substring(class74.field829);
                --class74.field829;
            } else if (var5 == 101 && ~class74.field829 > ~class108.field1279.length()) {
                class108.field1279 = class108.field1279.substring(0, class74.field829) + class108.field1279.substring(class74.field829 - -1);
            } else if (var5 == 96 && class74.field829 > 0) {
                --class74.field829;
            } else if (~var5 == -98 && class74.field829 < class108.field1279.length()) {
                ++class74.field829;
            } else if (~var5 != -103) {
                if (var5 != 103) {
                    if (var5 == 104 && ~class74.field826.length < ~class471.field6527) {
                        ++class471.field6527;
                        class54.method462((byte) 14);
                        class74.field829 = class108.field1279.length();
                    } else if (~var5 == -106 && class471.field6527 > 0) {
                        --class471.field6527;
                        class54.method462((byte) 14);
                        class74.field829 = class108.field1279.length();
                    } else if (class475.method2831(var6, (byte) -55) || ~var6 == -93 || ~var6 == -48 || ~var6 == -47 || var6 == ':' || ~var6 == -45 || var6 == ' ' || ~var6 == -96 || var6 == '-' || ~var6 == -44 || var6 == '[' || var6 == ']') {
                        class108.field1279 = class108.field1279.substring(0, class74.field829) + class462.field6462[var3].method733((byte) -105) + class108.field1279.substring(class74.field829);
                        ++class74.field829;
                    }
                } else {
                    class74.field829 = class108.field1279.length();
                }
            } else {
                class74.field829 = 0;
            }
            ++var3;
        }
        class572.field8055 = 0;
        class94.field1099 = 0;
        class23.method99(100);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)[[I", line = 239)
    public final int[][] method537(int arg0, int arg1) {
        ++field8488;
        if (arg0 != 0) {
            field8487 = 127;
        }
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510 && this.method765(657837988)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1282 * super.field1282;
            for (int var8 = 0; var8 < class80.field901; ++var8) {
                int var9 = super.field1284[var8 % super.field1285 + var7];
                var6[var8] = class407.method2490(255, var9) << 4;
                var5[var8] = class407.method2490(4080, var9 >> 4);
                var4[var8] = class407.method2490(var9, 16711680) >> 12;
            }
        }
        return var3;
    }
}
