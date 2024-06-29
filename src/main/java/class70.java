import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 {

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public static int[] field1546 = new int[256];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[[I")
    public static int[][] field1549 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1553 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Llc;")
    public static class69 field1552 = class69.method470((byte) -102, "Loading friend list");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Llc;")
    public static class69 field1548 = class69.method470((byte) -109, "Import ready");

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Llc;")
    public static class69 field1557 = class69.method470((byte) -119, "Username: ");

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Llc;")
    public static class69 field1560;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lfe;")
    public static class36 field1559;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Llc;")
    public static class69 field1562;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Llc;")
    public static class69 field1567;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Llc;")
    public static class69 field1566;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Llc;")
    public static class69 field1564;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
    public static int[] field1569;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Llc;")
    public static class69 field1568;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "J")
    public long field1554;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lld;")
    public class70 field1550;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lld;")
    public class70 field1556;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[Z")
    public static boolean[] field1547;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method497(int arg0) {
        field1544++;
        class18.method104((byte) 104);
        if (arg0 != 1878 || class125.field2705 != 10) {
            return;
        }
        int var1 = class62.field1278;
        int var2 = class127.field2733 - 202;
        int var3 = class19.field417 - 171;
        if (class77.field1724 == 0) {
            byte var12 = 100;
            byte var13 = 120;
            if (var1 == 1 && var2 >= var12 - 75 && var12 + 75 >= var2 && var13 - 20 <= var3 && var13 + 20 >= var3) {
                class77.field1724 = 3;
                class104.field2261 = 0;
            }
            short var14 = 260;
            if (var1 == 1 && var2 >= var14 - 75 && var2 <= var14 + 75 && var13 - 20 <= var3 && var3 <= var13 + 20) {
                class77.field1724 = 2;
                class104.field2261 = 0;
                class71.field1571 = class108.field2401;
                class71.field1591 = class71.field1590;
            }
        } else if (class77.field1724 == 2) {
            byte var6 = 60;
            int var15 = var6 + 30;
            byte var7 = 100;
            if (var1 == 1 && var15 - 15 <= var3 && var15 > var3) {
                class104.field2261 = 0;
            }
            short var8 = 150;
            var15 += 15;
            if (var1 == 1 && var3 >= var15 - 15 && var3 < var15) {
                class104.field2261 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var7 - 75 <= var2 && var7 + 75 >= var2 && var8 - 20 <= var3 && var3 <= var8 + 20) {
                class71.field1585 = class71.field1585.method476(true).method460(false);
                class55.method347(class71.field1590, -124, class18.field378);
                class89.method626(20, (byte) 112);
                return;
            }
            short var9 = 260;
            if (var1 == 1 && var9 - 75 <= var2 && var9 + 75 >= var2 && var3 >= var8 - 20 && var8 + 20 >= var3) {
                class77.field1724 = 0;
                class71.field1592 = class71.field1590;
                class71.field1585 = class71.field1590;
            }
            while (true) {
                while (class80.method575(arg0 ^ 0x71E)) {
                    boolean var10 = false;
                    for (int var11 = 0; class18.field379.method487((byte) -112) > var11; var11++) {
                        if (class10.field197 == class18.field379.method480(var11, false)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (class104.field2261 == 0) {
                        if (class71.field1573 == 85 && class71.field1585.method487((byte) -87) > 0) {
                            class71.field1585 = class71.field1585.method477(63, class71.field1585.method487((byte) -125) - 1, 0);
                        }
                        if (class71.field1573 == 84 || class71.field1573 == 80) {
                            class104.field2261 = 1;
                        }
                        if (var10 && class71.field1585.method487((byte) -92) < 12) {
                            class71.field1585 = class71.field1585.method469(class10.field197, (byte) -69);
                        }
                    } else if (class104.field2261 == 1) {
                        if (class71.field1573 == 85 && class71.field1592.method487((byte) -111) > 0) {
                            class71.field1592 = class71.field1592.method477(63, class71.field1592.method487((byte) -118) - 1, 0);
                        }
                        if (class71.field1573 == 84 || class71.field1573 == 80) {
                            class104.field2261 = 0;
                        }
                        if (var10 && class71.field1592.method487((byte) -96) < 20) {
                            class71.field1592 = class71.field1592.method469(class10.field197, (byte) -104);
                        }
                    }
                }
                return;
            }
        } else if (class77.field1724 == 3) {
            short var4 = 180;
            short var5 = 150;
            if (var1 == 1 && var4 - 75 <= var2 && var4 + 75 >= var2 && var3 >= var5 - 20 && var3 <= var5 + 20) {
                class77.field1724 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZBLkc;ILkc;)Lia;")
    public static final class49 method498(boolean arg0, byte arg1, class63 arg2, int arg3, class63 arg4) {
        field1545++;
        boolean var5 = true;
        int var6 = -113 / ((70 - arg1) / 44);
        int[] var7 = arg2.method385(arg3, -1);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg2.method381(var7[var8], arg3, true);
            if (var9 == null) {
                var5 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg0) {
                    var11 = arg4.method381(var10, 0, true);
                } else {
                    var11 = arg4.method381(0, var10, true);
                }
                if (var11 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class49(arg2, arg4, arg3, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method499(String arg0, Throwable arg1, int arg2) {
        field1543++;
        try {
            String var4;
            if (arg1 instanceof class120) {
                class120 var3 = (class120) arg1;
                var4 = var3.field2568 + " | ";
                arg1 = var3.field2565;
            } else {
                var4 = "";
            }
            StringWriter var5 = new StringWriter();
            PrintWriter var6 = new PrintWriter(var5);
            arg1.printStackTrace(var6);
            var6.close();
            String var7 = var5.toString();
            if (arg2 == 40) {
                BufferedReader var8 = new BufferedReader(new StringReader(var7));
                String var9 = var8.readLine();
                while (true) {
                    while (true) {
                        String var10 = var8.readLine();
                        if (var10 == null) {
                            String var19 = var4 + "| " + var9;
                            if (arg0 != null) {
                                var19 = var19 + " | " + arg0;
                            }
                            class16.method90(35, var19);
                            return;
                        }
                        int var11 = var10.indexOf(40);
                        int var12 = var10.indexOf(41, var11 + 1);
                        if (var11 >= 0 && var12 >= 0) {
                            String var13 = var10.substring(var11 + 1, var12);
                            int var14 = var13.indexOf(".java:");
                            if (var14 >= 0) {
                                String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                                var4 = var4 + var15 + ' ';
                                continue;
                            }
                            var10 = var10.substring(0, var11);
                        }
                        String var16 = var10.trim();
                        String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                        String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                        var4 = var4 + var18 + ' ';
                    }
                }
            }
        } catch (Exception var20) {
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method500(int arg0) {
        field1551++;
        if (!class24.field506) {
            return;
        }
        class24.field506 = false;
        class115.field2494 = null;
        class119.field2542 = null;
        class39.field769 = null;
        class121.field2601 = null;
        class98.field2155 = null;
        class3.field47 = null;
        class82.field1859 = null;
        class68.field1447 = null;
        if (arg0 != 30471) {
            field1558 = 59;
        }
        class90.field1948 = null;
        class90.field1966 = null;
        class107.field2317 = null;
        class81.field1844 = null;
        class29.field609 = null;
        class3.field25 = null;
        class60.field1247 = null;
        class76.field1701 = null;
        class112.field2444 = null;
        class81.field1842 = null;
        class47.field981 = null;
        class93.field2020 = null;
        class108.field2398 = null;
        class82.field1858 = null;
        class75.field1690 = null;
        class60.field1245 = null;
        class30.field612 = null;
        class93.field2036 = null;
        class83.field1870 = null;
        class80.field1824 = null;
        class106.field2311 = null;
        class36.field737 = null;
        class18.field381 = null;
        class13.field267 = null;
        class29.field605 = null;
        class24.field500 = null;
        class63.field1333 = null;
        class36.field720 = null;
        class63.field1331 = null;
        class112.field2449 = null;
        class16.field283 = null;
        class43.field850 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        field1557 = null;
        field1559 = null;
        field1568 = null;
        field1560 = null;
        field1548 = null;
        field1546 = null;
        field1562 = null;
        field1552 = null;
        field1569 = null;
        if (!arg0) {
            return;
        }
        field1549 = null;
        field1564 = null;
        field1567 = null;
        field1547 = null;
        field1566 = null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final void method502(int arg0) {
        field1555++;
        if (this.field1556 == null) {
            return;
        }
        this.field1556.field1550 = this.field1550;
        this.field1550.field1556 = this.field1556;
        if (arg0 == 0) {
            this.field1556 = null;
            this.field1550 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1546[var0] = var1;
        }
        field1558 = 0;
        field1560 = class69.method470((byte) -122, "Loading game screen )2 ");
        field1559 = new class36(100);
        field1562 = class69.method470((byte) -113, "Report abuse @whi@");
        field1567 = class69.method470((byte) -112, "Unknown");
        field1566 = class69.method470((byte) -117, " you requested@lre@ new recovery*6n@lre@questions)3@yel@ The requested change will occur*6non: @lre@");
        field1564 = class69.method470((byte) -104, "To create a new account you need to");
        field1569 = new int[16384];
        field1565 = 0;
        field1568 = class69.method470((byte) -124, " @whi@");
        field1570 = 0;
        field1563 = 256;
    }
}
