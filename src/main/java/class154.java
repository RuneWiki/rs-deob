import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class154 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Ltt;")
    public static class338 field2170 = new class338(13, 3);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 3)
    public static final void method898(byte arg0) {
        field2169++;
        if (class53.field696 < 102) {
            class53.field696 += 6;
        }
        if (class601.field8367 != -1 && class45.field543 < class529.method2982((byte) -69)) {
            for (int var1 = class601.field8367; var1 < class670.field9532.length; var1++) {
                if (class670.field9532[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class670.field9532[var1].substring(6));
                    } catch (Exception var15) {
                    }
                    class592.method3278((byte) -59, "Pausing for " + var2 + " seconds...");
                    class601.field8367 = var1 + 1;
                    class45.field543 = class529.method2982((byte) -69) + ((long) (var2 * 1000));
                    return;
                }
                class519.field7203 = class670.field9532[var1];
                class314.method1836(0, false);
            }
            class601.field8367 = -1;
        }
        if (class427.field5753 != 0) {
            class410.field5398 -= class427.field5753 * 5;
            if (class627.field8682 <= class410.field5398) {
                class410.field5398 = class627.field8682 - 1;
            }
            class427.field5753 = 0;
            if (class410.field5398 < 0) {
                class410.field5398 = 0;
            }
        }
        if (arg0 != -110) {
            field2170 = null;
        }
        for (int var3 = 0; var3 < class270.field3531; var3++) {
            class477 var4 = class96.field1162[var3];
            int var5 = var4.method2749(61);
            char var6 = var4.method2750(false);
            int var7 = var4.method2746(4849);
            if (var5 == 84) {
                class314.method1836(0, false);
            }
            if (var5 == 80) {
                class314.method1836(0, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class157.field2205 != null) {
                    String var13 = "";
                    for (int var14 = class187.field2606.length - 1; var14 >= 0; var14--) {
                        if (class187.field2606[var14] != null && class187.field2606[var14].length() > 0) {
                            var13 = var13 + class187.field2606[var14] + '\n';
                        }
                    }
                    class157.field2205.setContents(new StringSelection(var13), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class157.field2205 != null) {
                    Transferable var8 = class157.field2205.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class87.method475('\n', var9, false);
                                if (var10.length > 1) {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        if (var10[var11].startsWith("pause")) {
                                            int var12 = 5;
                                            try {
                                                var12 = Integer.parseInt(var10[var11].substring(6));
                                            } catch (Exception var16) {
                                            }
                                            class592.method3278((byte) -59, "Pausing for " + var12 + " seconds...");
                                            class601.field8367 = var11 + 1;
                                            class670.field9532 = var10;
                                            class45.field543 = (long) (var12 * 1000) + class529.method2982((byte) -69);
                                            return;
                                        }
                                        class519.field7203 = var10[var11];
                                        class314.method1836(0, false);
                                    }
                                } else {
                                    class519.field7203 = class519.field7203 + var9;
                                }
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            } else if (var5 == 85 && class104.field1243 > 0) {
                class519.field7203 = class519.field7203.substring(0, class104.field1243 - 1) + class519.field7203.substring(class104.field1243);
                class104.field1243--;
            } else if (var5 == 101 && class104.field1243 < class519.field7203.length()) {
                class519.field7203 = class519.field7203.substring(0, class104.field1243) + class519.field7203.substring(class104.field1243 + 1);
            } else if (var5 == 96 && class104.field1243 > 0) {
                class104.field1243--;
            } else if (var5 == 97 && class104.field1243 < class519.field7203.length()) {
                class104.field1243++;
            } else if (var5 == 102) {
                class104.field1243 = 0;
            } else if (var5 == 103) {
                class104.field1243 = class519.field7203.length();
            } else if (var5 == 104 && class68.field829 < class187.field2606.length) {
                class68.field829++;
                class704.method3950(-127);
                class104.field1243 = class519.field7203.length();
            } else if (var5 == 105 && class68.field829 > 0) {
                class68.field829--;
                class704.method3950(86);
                class104.field1243 = class519.field7203.length();
            } else if (class114.method672(var6, true) || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class519.field7203 = class519.field7203.substring(0, class104.field1243) + class96.field1162[var3].method2750(false) + class519.field7203.substring(class104.field1243);
                class104.field1243++;
            }
        }
        class24.field290 = 0;
        class270.field3531 = 0;
        class398.method2275(-1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 235)
    public static void method899(int arg0) {
        field2170 = null;
        if (arg0 != -1) {
            method898((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[B)V", line = 245)
    public static final synchronized void method900(int arg0, byte[] arg1) {
        field2172++;
        if (arg1.length == 100 && class213.field2818 < 1000) {
            class65.field808[class213.field2818++] = arg1;
            return;
        }
        if (arg0 != 19511) {
            field2170 = null;
        }
        if (arg1.length == 5000 && class284.field3732 < 250) {
            class584.field8071[class284.field3732++] = arg1;
        } else if (arg1.length == 30000 && class295.field3906 < 50) {
            class77.field912[class295.field3906++] = arg1;
        } else if (class98.field1191 != null) {
            for (int var2 = 0; var2 < class452.field5962.length; var2++) {
                if (class452.field5962[var2] == arg1.length && class663.field9444[var2] < class98.field1191[var2].length) {
                    class98.field1191[var2][class663.field9444[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[B", line = 292)
    public static final synchronized byte[] method901(int arg0, int arg1) {
        field2171++;
        if (arg1 != -28933) {
            field2170 = null;
        }
        if (arg0 == 100 && class213.field2818 > 0) {
            byte[] var2 = class65.field808[--class213.field2818];
            class65.field808[class213.field2818] = null;
            return var2;
        } else if (arg0 == 5000 && class284.field3732 > 0) {
            byte[] var3 = class584.field8071[--class284.field3732];
            class584.field8071[class284.field3732] = null;
            return var3;
        } else if (arg0 == 30000 && class295.field3906 > 0) {
            byte[] var4 = class77.field912[--class295.field3906];
            class77.field912[class295.field3906] = null;
            return var4;
        } else {
            if (class98.field1191 != null) {
                for (int var5 = 0; var5 < class452.field5962.length; var5++) {
                    if (class452.field5962[var5] == arg0 && class663.field9444[var5] > 0) {
                        byte[] var6 = class98.field1191[var5][--class663.field9444[var5]];
                        class98.field1191[var5][class663.field9444[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI[[[Lse;IZI)Z", line = 353)
    public static final boolean method902(boolean arg0, int arg1, class207[][][] arg2, int arg3, boolean arg4, int arg5) {
        field2173++;
        byte var6 = arg4 ? 1 : (byte) (class647.field8940 & 0xFF);
        if (class614.field8511[class298.field3942][arg5][arg3] == var6) {
            return false;
        } else if ((class31.field440[class298.field3942][arg5][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class588.field8121[var7] = arg5;
            int var8 = 0;
            int var35 = var7 + 1;
            class262.field3403[var7] = arg3;
            class614.field8511[class298.field3942][arg5][arg3] = var6;
            while (var35 != var8) {
                int var9 = class588.field8121[var8] & 0xFFFF;
                int var10 = class588.field8121[var8] >> 16 & 0xFF;
                int var11 = class588.field8121[var8] >> 24 & 0xFF;
                int var12 = class262.field3403[var8] & 0xFFFF;
                int var13 = class262.field3403[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class31.field440[class298.field3942][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label242: for (int var16 = class298.field3942 + 1; var16 <= 3; var16++) {
                    if ((class31.field440[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field2768 != null) {
                                int var20 = class501.method2848(2, var10);
                                if (arg2[var16][var9][var12].field2768.field2632 == var20 || arg2[var16][var9][var12].field2767 != null && arg2[var16][var9][var12].field2767.field2632 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class501.method2848(2, var11);
                                    if (arg2[var16][var9][var12].field2768.field2632 == var21 || arg2[var16][var9][var12].field2767 != null && arg2[var16][var9][var12].field2767.field2632 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class501.method2848(2, var13);
                                    if (arg2[var16][var9][var12].field2768.field2632 == var22 || arg2[var16][var9][var12].field2767 != null && arg2[var16][var9][var12].field2767.field2632 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class207 var23 = arg2[var16][var9][var12];
                            if (var23.field2774 != null) {
                                for (class634 var24 = var23.field2774; var24 != null; var24 = var24.field8764) {
                                    class29 var25 = var24.field8767;
                                    if (var25 instanceof class599) {
                                        class599 var26 = (class599) var25;
                                        int var27 = var26.method699((byte) -37);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method706(16259);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label242;
                                        }
                                    }
                                }
                            }
                        }
                        class207 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field2774 != null) {
                            for (class634 var31 = var30.field2774; var31 != null; var31 = var31.field8764) {
                                class29 var32 = var31.field8767;
                                if (var32.field423 != var32.field420 || var32.field421 != var32.field419) {
                                    for (int var33 = var32.field423; var33 <= var32.field420; var33++) {
                                        for (int var34 = var32.field419; var34 <= var32.field421; var34++) {
                                            class614.field8511[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class614.field8511[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class246.field3214[class298.field3942 + 1].method1611(var9, !arg0, var12);
                    if (class323.field4355[arg1] < var17) {
                        class323.field4355[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (class62.field780[arg1] > var18) {
                        class62.field780[arg1] = var18;
                    } else if (var18 > class699.field9859[arg1]) {
                        class699.field9859[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (var19 < class474.field6605[arg1]) {
                        class474.field6605[arg1] = var19;
                    } else if (class302.field3994[arg1] < var19) {
                        class302.field3994[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class614.field8511[class298.field3942][var9 - 1][var12] != var6) {
                        class588.field8121[var35] = class665.method3789(-754974720, class665.method3789(var9 - 1, 1179648));
                        class262.field3403[var35] = class665.method3789(var12, 1245184);
                        class614.field8511[class298.field3942][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class431.field5789 > var12) {
                        if ((var9 - 1) >= 0 && class614.field8511[class298.field3942][var9 - 1][var12] != var6 && (class31.field440[class298.field3942][var9][var12] & 0x4) == 0 && (class31.field440[class298.field3942][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class588.field8121[var35] = class665.method3789(class665.method3789(1179648, var9 - 1), 1375731712);
                            class262.field3403[var35] = class665.method3789(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class614.field8511[class298.field3942][var9 - 1][var12] = var6;
                        }
                        if (class614.field8511[class298.field3942][var9][var12] != var6) {
                            class588.field8121[var35] = class665.method3789(318767104, class665.method3789(5373952, var9));
                            class262.field3403[var35] = class665.method3789(5439488, var12);
                            class614.field8511[class298.field3942][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class703.field9886 > var9 + 1 && class614.field8511[class298.field3942][var9 + 1][var12] != var6 && (class31.field440[class298.field3942][var9][var12] & 0x4) == 0 && (class31.field440[class298.field3942][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class588.field8121[var35] = class665.method3789(class665.method3789(var9 + 1, 5373952), -1845493760);
                            class262.field3403[var35] = class665.method3789(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class614.field8511[class298.field3942][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class703.field9886 > var9 + 1 && class614.field8511[class298.field3942][var9 + 1][var12] != var6) {
                        class588.field8121[var35] = class665.method3789(1392508928, class665.method3789(9568256, var9 + 1));
                        class262.field3403[var35] = class665.method3789(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class614.field8511[class298.field3942][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class614.field8511[class298.field3942][var9 - 1][var12] != var6 && (class31.field440[class298.field3942][var9][var12] & 0x4) == 0 && (class31.field440[class298.field3942][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class588.field8121[var35] = class665.method3789(301989888, class665.method3789(13762560, var9 - 1));
                            class262.field3403[var35] = class665.method3789(var12, 13828096);
                            class614.field8511[class298.field3942][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class614.field8511[class298.field3942][var9][var12] != var6) {
                            class588.field8121[var35] = class665.method3789(-1828716544, class665.method3789(13762560, var9));
                            class262.field3403[var35] = class665.method3789(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class614.field8511[class298.field3942][var9][var12] = var6;
                        }
                        if (class703.field9886 > (var9 + 1) && class614.field8511[class298.field3942][var9 + 1][var12] != var6 && (class31.field440[class298.field3942][var9][var12] & 0x4) == 0 && (class31.field440[class298.field3942][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class588.field8121[var35] = class665.method3789(-771751936, class665.method3789(var9 + 1, 9568256));
                            class262.field3403[var35] = class665.method3789(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class614.field8511[class298.field3942][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class323.field4355[arg1] != -1000000) {
                class323.field4355[arg1] += 40;
                class62.field780[arg1] -= 512;
                class699.field9859[arg1] += 512;
                class302.field3994[arg1] += 512;
                class474.field6605[arg1] -= 512;
            }
            if (arg0) {
                return true;
            } else {
                return true;
            }
        }
    }
}
