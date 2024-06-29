import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class224 extends class71 {

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3567 = "Loading title screen - ";

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "Z")
    public static boolean field3569 = false;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIBIII)V", line = 4)
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3562++;
        if (arg7 >= 0 && arg0 >= 0 && arg7 < 103 && arg0 < 103) {
            if (arg5 == 0) {
                class19 var8 = class287.method2019(arg3, arg7, arg0);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field263 >>> 32);
                    if (arg6 == 2) {
                        var8.field259 = new class240(var9, 2, arg1 + 4, arg3, arg7, arg0, arg2, false, var8.field259);
                        var8.field272 = new class240(var9, 2, arg1 + 1 & 0x3, arg3, arg7, arg0, arg2, false, var8.field272);
                    } else {
                        var8.field259 = new class240(var9, arg6, arg1, arg3, arg7, arg0, arg2, false, var8.field259);
                    }
                }
            }
            if (arg5 == 1) {
                class145 var10 = class132.method901(arg3, arg7, arg0);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field2175 >>> 32);
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field2174 = new class240(var11, 4, arg1, arg3, arg7, arg0, arg2, false, var10.field2174);
                    } else if (arg6 == 6) {
                        var10.field2174 = new class240(var11, 4, arg1 + 4, arg3, arg7, arg0, arg2, false, var10.field2174);
                    } else if (arg6 == 7) {
                        var10.field2174 = new class240(var11, 4, (arg1 + 2 & 0x3) + 4, arg3, arg7, arg0, arg2, false, var10.field2174);
                    } else if (arg6 == 8) {
                        var10.field2174 = new class240(var11, 4, arg1 + 4, arg3, arg7, arg0, arg2, false, var10.field2174);
                        var10.field2166 = new class240(var11, 4, (arg1 + 2 & 0x3) + 4, arg3, arg7, arg0, arg2, false, var10.field2166);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 11) {
                    arg6 = 10;
                }
                class271 var12 = class202.method1476(arg3, arg7, arg0);
                if (var12 != null) {
                    var12.field4286 = new class240(Integer.MAX_VALUE & (int) (var12.field4294 >>> 32), arg6, arg1, arg3, arg7, arg0, arg2, false, var12.field4286);
                }
            }
            if (arg5 == 3) {
                class49 var13 = class19.method126(arg3, arg7, arg0);
                if (var13 != null) {
                    var13.field667 = new class240((int) (var13.field677 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg3, arg7, arg0, arg2, false, var13.field667);
                }
            }
        }
        if (arg4 > -64) {
            method1638((byte) 37, 49);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V", line = 96)
    public static final void method1635(int arg0, boolean arg1) {
        if (arg1) {
            if (class246.field3904 != -1) {
                class206.method1510(-1, class246.field3904);
            }
            for (class224 var2 = (class224) class176.field2870.method1746((byte) -33); var2 != null; var2 = (class224) class176.field2870.method1749((byte) -106)) {
                class100.method707(var2, 112, true);
            }
            class246.field3904 = -1;
            class176.field2870 = new class246(8);
            class2.method10((byte) -119);
            class246.field3904 = class12.field134;
            class242.method1713(false, 122);
            method1641((byte) -57);
            class80.method590(class246.field3904, (byte) -115);
        }
        class239.field3778 = -1;
        class222.method1620(class24.field345, -1);
        field3573++;
        if (arg0 != Integer.MAX_VALUE) {
            field3569 = false;
        }
        class13.field159 = new class320();
        class13.field159.field1980 = 3000;
        class13.field159.field1944 = 3000;
        if (!class186.field2991 && class20.field290 == 0) {
            class20.method127(class149.field2248, 0);
            class173.method1180(10, 65280);
            return;
        }
        if (class282.field4461 == 2) {
            class74.field983 = class255.field4041 << 7;
            class27.field388 = class277.field4378 << 7;
        } else {
            class118.method821((byte) 54);
        }
        if (class186.field2991) {
            class232.method1670((byte) 61);
        }
        class128.method878(true);
        class173.method1180(28, arg0 ^ 0x7FFF00FF);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 174)
    public static void method1636(int arg0) {
        if (arg0 < 85) {
            field3575 = -57;
        }
        field3567 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lkb;ILkb;)I", line = 195)
    public static final int method1637(class39 arg0, int arg1, class39 arg2) {
        field3571++;
        int var3 = 0;
        if (arg2.method246(false, class100.field1522)) {
            var3++;
        }
        if (arg2.method246(false, class86.field1307)) {
            var3++;
        }
        if (arg2.method246(false, class330.field5136)) {
            var3++;
        }
        if (arg1 != 5802) {
            field3575 = -88;
        }
        if (arg0.method246(false, class100.field1522)) {
            var3++;
        }
        if (arg0.method246(false, class86.field1307)) {
            var3++;
        }
        if (arg0.method246(false, class330.field5136)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Z", line = 232)
    public static final boolean method1638(byte arg0, int arg1) {
        int var2 = 39 % ((arg0 - 2) / 50);
        field3566++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 246)
    public static final String method1639(Throwable arg0, byte arg1) throws IOException {
        field3574++;
        String var2;
        if ((arg0 instanceof class325)) {
            class325 var3 = (class325) arg0;
            arg0 = var3.field5075;
            var2 = var3.field5073 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 > -106) {
            field3575 = 118;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIII)V", line = 319)
    public static final void method1640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3568++;
        if (arg6 != 5) {
            method1641((byte) -108);
        }
        for (int var9 = 0; var9 < class193.field3167.field4901; var9++) {
            if (class193.field3167.method2191(var9, (byte) -87)) {
                int[] var10 = class124.field1855.method2213(class193.field3167.field4908[var9] >> 28 & 0x3, arg6 ^ 0x34, class193.field3167.field4908[var9] & 0x3FFF, (class193.field3167.field4908[var9] & 0xFFFC199) >> 14);
                if (var10 != null) {
                    int var11 = class161.field2636 + class331.field5158 - var10[2] - 1;
                    int var12 = var10[1] - class287.field4528;
                    int var13 = (var12 - arg3) * (arg7 - arg5) / (arg8 - arg3) + arg5;
                    int var14 = class193.field3167.method2189(var9, -125);
                    int var15 = (var11 - arg1) * (arg0 - arg2) / (arg4 - arg1) + arg2;
                    int var16 = 16777215;
                    class53 var17 = null;
                    if (var14 == 0) {
                        if ((double) class42.field584 == 3.0D) {
                            var17 = class119.field1833;
                        }
                        if ((double) class42.field584 == 4.0D) {
                            var17 = class35.field463;
                        }
                        if ((double) class42.field584 == 6.0D) {
                            var17 = class18.field253;
                        }
                        if ((double) class42.field584 >= 8.0D) {
                            var17 = class244.field3884;
                        }
                    }
                    if (var14 == 1) {
                        if ((double) class42.field584 == 3.0D) {
                            var17 = class18.field253;
                        }
                        if ((double) class42.field584 == 4.0D) {
                            var17 = class244.field3884;
                        }
                        if ((double) class42.field584 == 6.0D) {
                            var17 = class101.field1549;
                        }
                        if ((double) class42.field584 >= 8.0D) {
                            var17 = class77.field1168;
                        }
                    }
                    if (var14 == 2) {
                        var16 = 16755200;
                        if ((double) class42.field584 == 3.0D) {
                            var17 = class101.field1549;
                        }
                        if ((double) class42.field584 == 4.0D) {
                            var17 = class77.field1168;
                        }
                        if ((double) class42.field584 == 6.0D) {
                            var17 = class282.field4433;
                        }
                        if ((double) class42.field584 >= 8.0D) {
                            var17 = class139.field2082;
                        }
                    }
                    if (class193.field3167.field4910[var9] != -1) {
                        var16 = class193.field3167.field4910[var9];
                    }
                    if (var17 != null) {
                        int var18 = class99.field1516.method1005(class193.field3167.field4911[var9], (int[]) null, class313.field4876);
                        int var19 = var15 - (var18 - 1) * var17.method363() / 2;
                        int var20 = var19 + var17.method368() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class313.field4876[var21];
                            if (var18 - 1 > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method364(var22, var13, var20, var16, true);
                            var20 += var17.method363();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 442)
    public static final void method1641(byte arg0) {
        if (arg0 > -29) {
            field3575 = -36;
        }
        field3572++;
        for (int var1 = 0; var1 < 100; var1++) {
            class284.field4485[var1] = true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(SB)Z", line = 460)
    public static final boolean method1642(short arg0, byte arg1) {
        field3570++;
        if (arg0 == 38 || arg0 == 3 || arg0 == 10 || arg0 == 7 || arg0 == 46 || arg0 == 33 || arg0 == 11 || arg0 == 4) {
            return true;
        } else if (arg0 == 2 || arg0 == 19 || arg0 == 1002 || arg0 == 1006) {
            return true;
        } else if (arg0 == 21 || arg0 == 35 || arg0 == 5 || arg0 == 47 || arg0 == 20) {
            return true;
        } else if (arg0 == 28 || arg0 == 59 || arg0 == 22 || arg0 == 60 || arg0 == 30 || arg0 == 31) {
            return true;
        } else {
            if (arg1 != 124) {
                field3575 = -81;
            }
            return false;
        }
    }
}
