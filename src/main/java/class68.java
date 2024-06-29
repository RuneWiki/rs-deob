import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lwc;")
    private class156 field1611 = new class156(256);

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lwc;")
    private class156 field1614 = new class156(256);

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lea;")
    private class30 field1607;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lea;")
    private class30 field1613;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lec;")
    public static class32 field1595 = class73.method594("titlebox", true);

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lec;")
    private static class32 field1600 = class73.method594("This world is running a closed Beta)3", true);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lec;")
    public static class32 field1596 = field1600;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[I")
    public static int[] field1601 = new int[4000];

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lec;")
    private static class32 field1606 = class73.method594("No reply from loginserver)3", true);

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lec;")
    public static class32 field1594 = class73.method594("::fpsoff", true);

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lec;")
    public static class32 field1605 = class73.method594(" steht bereits auf Ihrer Ignorieren)2Liste(Q", true);

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lec;")
    public static class32 field1599 = field1606;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lec;")
    public static class32 field1603 = class73.method594("bevor Sie den Vorgang wiederholen)3", true);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field1593;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
    public static final boolean method563(int arg0) {
        field1597++;
        long var1 = class52.method408((byte) -56);
        int var3 = (int) (var1 - class136.field3159);
        if (var3 > 200) {
            var3 = 200;
        }
        class133.field3042 += var3;
        class136.field3159 = var1;
        if (class66.field1580 == 0 && class64.field1495 == 0 && class33.field698 == 0 && class158.field3629 == 0) {
            return true;
        } else if (class4.field81 == null) {
            return false;
        } else {
            try {
                if (class133.field3042 > 30000) {
                    throw new IOException();
                }
                if (arg0 <= 81) {
                    method564((byte) -32);
                }
                while (class64.field1495 < 20 && class158.field3629 > 0) {
                    class110 var4 = (class110) class97.field2214.method1205((byte) 50);
                    class66 var5 = new class66(4);
                    var5.method515((byte) 73, 1);
                    var5.method551(-31368, (int) var4.field3326);
                    class4.field81.method49(var5.field1587, 4, 0, (byte) 125);
                    class112.field2618.method1203(true, var4.field3326, var4);
                    class64.field1495++;
                    class158.field3629--;
                }
                while (class66.field1580 < 20 && class33.field698 > 0) {
                    class110 var6 = (class110) class126.field2920.method1172((byte) -127);
                    class66 var7 = new class66(4);
                    var7.method515((byte) 99, 0);
                    var7.method551(-31368, (int) var6.field3326);
                    class4.field81.method49(var7.field1587, 4, 0, (byte) 122);
                    var6.method68(false);
                    class31.field593.method1203(true, var6.field3326, var6);
                    class66.field1580++;
                    class33.field698--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class4.field81.method51((byte) 118);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class133.field3042 = 0;
                    byte var10 = 0;
                    if (class149.field3374 == null) {
                        var10 = 8;
                    } else if (class38.field922 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class61.field1355.field1569;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class4.field81.method50(115, class61.field1355.field1569, class61.field1355.field1587, var11);
                        if (class92.field2120 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class61.field1355.field1587[class61.field1355.field1569 + var12] = (byte) class133.method1016(class61.field1355.field1587[class61.field1355.field1569 + var12], class92.field2120);
                            }
                        }
                        class61.field1355.field1569 += var11;
                        if (class61.field1355.field1569 < var10) {
                            break;
                        }
                        if (class149.field3374 == null) {
                            class61.field1355.field1569 = 0;
                            int var13 = class61.field1355.method533(255);
                            int var14 = class61.field1355.method532(0);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class61.field1355.method533(255);
                            int var18 = class61.field1355.method539(true);
                            class110 var19 = (class110) class112.field2618.method1198(var15, (byte) -106);
                            class13.field219 = true;
                            if (var19 == null) {
                                var19 = (class110) class31.field593.method1198(var15, (byte) -106);
                                class13.field219 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class149.field3374 = var19;
                            int var20 = var17 == 0 ? 5 : 9;
                            class106.field2531 = new class66(var18 + var20 + class149.field3374.field2589);
                            class106.field2531.method515((byte) 91, var17);
                            class106.field2531.method531(false, var18);
                            class61.field1355.field1569 = 0;
                            class38.field922 = 8;
                        } else if (class38.field922 == 0) {
                            if (class61.field1355.field1587[0] == -1) {
                                class61.field1355.field1569 = 0;
                                class38.field922 = 1;
                            } else {
                                class149.field3374 = null;
                            }
                        }
                    } else {
                        int var21 = class106.field2531.field1587.length - class149.field3374.field2589;
                        int var22 = 512 - class38.field922;
                        if (var21 - class106.field2531.field1569 < var22) {
                            var22 = var21 - class106.field2531.field1569;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        class4.field81.method50(110, class106.field2531.field1569, class106.field2531.field1587, var22);
                        if (class92.field2120 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class106.field2531.field1587[class106.field2531.field1569 + var23] = (byte) class133.method1016(class106.field2531.field1587[class106.field2531.field1569 + var23], class92.field2120);
                            }
                        }
                        class38.field922 += var22;
                        class106.field2531.field1569 += var22;
                        if (class106.field2531.field1569 == var21) {
                            if (class149.field3374.field3326 == 16711935L) {
                                class119.field2848 = class106.field2531;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class44 var26 = class88.field2049[var25];
                                    if (var26 != null) {
                                        class119.field2848.field1569 = var25 * 8 + 5;
                                        int var27 = class119.field2848.method539(true);
                                        int var28 = class119.field2848.method539(true);
                                        var26.method337(var28, var27, 16782);
                                    }
                                }
                            } else {
                                class23.field415.reset();
                                class23.field415.update(class106.field2531.field1587, 0, var21);
                                int var24 = (int) class23.field415.getValue();
                                if (class149.field3374.field2580 != var24) {
                                    try {
                                        class4.field81.method52(79);
                                    } catch (Exception var30) {
                                    }
                                    client.field388++;
                                    class92.field2120 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class4.field81 = null;
                                    return false;
                                }
                                client.field388 = 0;
                                class61.field1356 = 0;
                                class149.field3374.field2591.method336(class13.field219, (int) (class149.field3374.field3326 & 0xFFFFL), (class149.field3374.field3326 & 0xFF0000L) == 16711680L, false, class106.field2531.field1587);
                            }
                            class149.field3374.method1093(0);
                            if (class13.field219) {
                                class64.field1495--;
                            } else {
                                class66.field1580--;
                            }
                            class106.field2531 = null;
                            class149.field3374 = null;
                            class38.field922 = 0;
                        } else {
                            if (class38.field922 != 512) {
                                break;
                            }
                            class38.field922 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class4.field81.method52(-71);
                } catch (Exception var29) {
                }
                class4.field81 = null;
                class61.field1356++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method564(byte arg0) {
        field1605 = null;
        field1599 = null;
        field1594 = null;
        field1603 = null;
        field1600 = null;
        field1595 = null;
        field1593 = null;
        field1601 = null;
        if (arg0 > -105) {
            method564((byte) -82);
        }
        field1596 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[II)Lib;")
    private final class58 method565(int arg0, int arg1, int[] arg2, int arg3) {
        field1609++;
        int var5 = ((arg3 & 0xA0000FFF) << 4 | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class58 var9 = (class58) this.field1614.method1198(var7, (byte) -106);
        if (arg0 != -24259) {
            return null;
        } else if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class123 var10 = class123.method974(this.field1613, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class58 var11 = var10.method973();
            this.field1614.method1203(true, var7, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field1344.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method566(boolean arg0) {
        class83.field1967.method115(21828);
        field1598++;
        class34.field719 = null;
        if (!arg0) {
            field1603 = null;
        }
        class98.field2265 = 1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB[I)Lib;")
    public final class58 method567(int arg0, byte arg1, int[] arg2) {
        if (arg1 <= 40) {
            return null;
        }
        field1591++;
        if (this.field1613.method204(-101) == 1) {
            return this.method565(-24259, arg0, arg2, 0);
        } else if (this.field1613.method200((byte) 53, arg0) == 1) {
            return this.method565(-24259, 0, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IBI)Lib;")
    public final class58 method568(int[] arg0, byte arg1, int arg2) {
        field1612++;
        if (arg1 > -26) {
            return null;
        } else if (this.field1607.method204(-115) == 1) {
            return this.method571(arg2, 0, (byte) -29, arg0);
        } else if (this.field1607.method200((byte) 53, arg2) == 1) {
            return this.method571(0, arg2, (byte) -82, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    public static final void method569(int arg0, boolean arg1) {
        if (class98.field2265 == 0) {
            class83.field1967.method89(-19402, arg0);
        } else {
            class57.field1322 = arg0;
        }
        if (arg1) {
            method570((byte) 114);
        }
        field1608++;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method570(byte arg0) {
        field1610++;
        if (arg0 <= 66) {
            return;
        }
        for (int var1 = -1; var1 < class62.field1405; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class137.field3189[var1];
            }
            class70 var3 = class52.field1176[var2];
            if (var3 != null) {
                class31.method227((byte) 101, 1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB[I)Lib;")
    private final class58 method571(int arg0, int arg1, byte arg2, int[] arg3) {
        field1602++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFF);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class58 var9 = (class58) this.field1614.method1198(var7, (byte) -106);
        int var10 = -58 % ((68 - arg2) / 43);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class93 var11 = (class93) this.field1611.method1198(var7, (byte) -106);
            if (var11 == null) {
                var11 = class93.method738(this.field1607, arg1, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field1611.method1203(true, var7, var11);
            }
            class58 var12 = var11.method734(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method1093(0);
                this.field1614.method1203(true, var7, var12);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method572(int arg0, Throwable arg1) throws IOException {
        field1592++;
        String var3;
        if (arg1 instanceof class159) {
            class159 var2 = (class159) arg1;
            arg1 = var2.field3649;
            var3 = var2.field3645 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg0 != 32) {
                        return null;
                    }
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lea;Lea;)V")
    public class68(class30 arg0, class30 arg1) {
        this.field1607 = arg1;
        this.field1613 = arg0;
    }
}
