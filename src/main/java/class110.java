import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class110 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    public int[] field1505 = new int[257];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[[B")
    public byte[][] field1507 = new byte[6][258];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "[B")
    public byte[] field1512 = new byte[256];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[Z")
    public boolean[] field1508 = new boolean[256];

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
    public int[] field1520 = new int[16];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    public int[] field1502 = new int[6];

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[B")
    public byte[] field1514 = new byte[4096];

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public int field1534 = 0;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[[I")
    public int[][] field1530 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "[[I")
    public int[][] field1536 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[[I")
    public int[][] field1535 = new int[6][258];

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[Z")
    public boolean[] field1522 = new boolean[16];

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
    public int[] field1504 = new int[256];

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "[B")
    public byte[] field1541 = new byte[18002];

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[B")
    public byte[] field1532 = new byte[18002];

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public int field1543 = 0;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1517 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "B")
    public byte field1524;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lgb;")
    public static class88 field1521;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[B")
    public byte[] field1506;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[B")
    public byte[] field1509;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
    public static int[] field1527;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 24)
    public static final String method783(int arg0, String arg1, String arg2, String arg3) {
        field1515++;
        int var4 = arg3.length();
        if (arg0 < 79) {
            field1521 = (class88) null;
        }
        int var5 = arg2.length();
        int var6 = arg1.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg3.indexOf(arg2, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg3.indexOf(arg2, var12);
            if (var13 < 0) {
                var11.append(arg3.substring(var12));
                return var11.toString();
            }
            var11.append(arg3.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 87)
    public static void method784(int arg0) {
        field1517 = null;
        field1521 = null;
        if (arg0 != 256) {
            method784(-54);
        }
        field1527 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 114)
    public static final String method785(Throwable arg0, int arg1) throws IOException {
        String var2;
        if ((arg0 instanceof class4)) {
            class4 var3 = (class4) arg0;
            arg0 = var3.field40;
            var2 = var3.field37 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        field1516++;
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 != 1) {
            return (String) null;
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var2 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var2 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)I", line = 190)
    public static final int method786(boolean arg0, int arg1) {
        if (!arg0) {
            method788(false);
        }
        field1518++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIZ)V", line = 200)
    public static final void method787(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class131.field1938 = arg1;
        class308.field4794 = arg2;
        class166.field2734 = arg3;
        class225.field3566 = new class124[arg0][class131.field1938][class308.field4794];
        class18.field294 = new int[arg0][class131.field1938 + 1][class308.field4794 + 1];
        if (class109.field1458) {
            class18.field288 = new class247[4][];
        }
        if (arg4) {
            class111.field1546 = new class124[1][class131.field1938][class308.field4794];
            class193.field3070 = new int[class131.field1938][class308.field4794];
            class187.field3013 = new int[1][class131.field1938 + 1][class308.field4794 + 1];
            if (class109.field1458) {
                class34.field493 = new class247[1][];
            }
        } else {
            class111.field1546 = (class124[][][]) null;
            class193.field3070 = (int[][]) null;
            class187.field3013 = (int[][][]) null;
            class34.field493 = (class247[][]) null;
        }
        class316.method2208(false);
        class5.field60 = new class290[500];
        class163.field2641 = 0;
        class286.field4423 = new class290[500];
        class157.field2443 = 0;
        class183.field2973 = new int[arg0][class131.field1938 + 1][class308.field4794 + 1];
        class125.field1815 = new class263[5000];
        class277.field4269 = 0;
        class65.field936 = new class263[100];
        class145.field2286 = new boolean[class166.field2734 + class166.field2734 + 1][class166.field2734 + class166.field2734 + 1];
        class256.field4055 = new boolean[class166.field2734 + class166.field2734 + 2][class166.field2734 + class166.field2734 + 2];
        class248.field3903 = new byte[arg0][class131.field1938][class308.field4794];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)[Luj;", line = 261)
    public static final class169[] method788(boolean arg0) {
        field1519++;
        if (arg0) {
            return (class169[]) null;
        }
        class169[] var1 = new class169[class230.field3599];
        for (int var2 = 0; var2 < class230.field3599; var2++) {
            int var3 = class81.field1103[var2] * class213.field3355[var2];
            byte[] var4 = class207.field3298[var2];
            if (class18.field300[var2]) {
                int[] var5 = new int[var3];
                byte[] var6 = class193.field3083[var2];
                for (int var7 = 0; var7 < var3; var7++) {
                    var5[var7] = class214.method1562(class81.field1101[class333.method2319(var4[var7], 255)], class333.method2319(var6[var7], 255) << 24);
                }
                if (class109.field1458) {
                    var1[var2] = new class19(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], var5);
                } else {
                    var1[var2] = new class186(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], var5);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class81.field1101[class333.method2319(255, var4[var9])];
                }
                if (class109.field1458) {
                    var1[var2] = new class239(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], var8);
                } else {
                    var1[var2] = new class190(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], var8);
                }
            }
        }
        class207.method1526(0);
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lug;B)V", line = 349)
    public static final void method789(class253 arg0, byte arg1) {
        field1538++;
        class34.field506 = arg0.method1808(-1, "p11_full");
        class172.field2838 = arg0.method1808(-1, "p12_full");
        class249.field3914 = arg0.method1808(-1, "b12_full");
        class311.field4844 = arg0.method1808(-1, "mapfunction");
        class291.field4501 = arg0.method1808(arg1 ^ 0xFFFFFFE0, "hitmarks");
        class205.field3255 = arg0.method1808(-1, "hitbar_default");
        class97.field1276 = arg0.method1808(-1, "headicons_pk");
        class78.field1045 = arg0.method1808(-1, "headicons_prayer");
        class158.field2446 = arg0.method1808(-1, "hint_headicons");
        class39.field547 = arg0.method1808(-1, "hint_mapmarkers");
        class158.field2452 = arg0.method1808(-1, "mapflag");
        class58.field838 = arg0.method1808(-1, "cross");
        class332.field5179 = arg0.method1808(-1, "mapdots");
        if (arg1 != 31) {
            method786(false, 115);
        }
        class56.field771 = arg0.method1808(-1, "scrollbar");
        class128.field1883 = arg0.method1808(-1, "name_icons");
        class83.field1133 = arg0.method1808(-1, "floorshadows");
        class275.field4243 = arg0.method1808(-1, "compass");
        class193.field3073 = arg0.method1808(arg1 - 32, "hint_mapedge");
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 401)
    public static final void method790(byte arg0) {
        if (arg0 <= 96) {
            method784(117);
        }
        field1526++;
        class4.field38.method1359(111);
        class334.field5206.method1359(86);
    }
}
