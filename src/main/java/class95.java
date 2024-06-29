import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class95 {

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "Z")
    private boolean field1804;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Z")
    private boolean field1796;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lge;")
    public static class60 field1781 = new class60();

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field1807 = 0;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "Lsg;")
    public static class169 field1810 = class165.method1060("(Udns", 1536);

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lua;")
    public static class181 field1808 = new class181(50);

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "[I")
    public static int[] field1811 = new int[5];

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "Z")
    public static boolean field1812 = true;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "Lua;")
    public static class181 field1813 = new class181(64);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    private int field1768;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lag;")
    private class8 field1780;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[I")
    private int[] field1772;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "[I")
    public int[] field1788;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "[I")
    private int[] field1801;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
    public int[] field1803;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[I")
    public int[] field1806;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "[Lbg;")
    public static class18[] field1787;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[Lag;")
    private class8[] field1789;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Ljava/lang/Object;")
    public Object[] field1764;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[[I")
    private int[][] field1775;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[[I")
    private int[][] field1794;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1778;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lsg;I)V")
    public final void method550(class169 arg0, int arg1) {
        class169 var3 = arg0.method1131((byte) -75);
        if (arg1 >= -117) {
            return;
        }
        field1774++;
        int var4 = this.field1780.method44(61, var3.method1130((byte) -109));
        if (var4 >= 0) {
            this.method551(var4, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
    public void method551(int arg0, byte arg1) {
        if (arg1 != -87) {
            this.field1799 = 30;
        }
        field1769++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)[B")
    public final byte[] method552(int arg0, int arg1, int arg2) {
        field1792++;
        return arg2 == 0 ? this.method566(arg1, null, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILsg;)I")
    public final int method553(int arg0, class169 arg1) {
        if (arg0 > -9) {
            return -74;
        } else {
            field1776++;
            class169 var3 = arg1.method1131((byte) -109);
            return this.field1780.method44(-84, var3.method1130((byte) -121));
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        field1766++;
        if (arg0 != -26436) {
            field1808 = null;
        }
        return this.field1778.length;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[B)V")
    public final void method555(byte arg0, byte[] arg1) {
        field1786++;
        this.field1799 = class61.method382(arg1, arg1.length, false);
        class127 var3 = new class127(class148.method967((byte) -26, arg1));
        int var4 = var3.method819((byte) 22);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method814(arg0 + 44);
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method819((byte) 22);
        this.field1768 = var3.method785(true);
        this.field1801 = new int[this.field1768];
        for (int var8 = 0; var8 < this.field1768; var8++) {
            this.field1801[var8] = var6 += var3.method785(true);
            if (this.field1801[var8] > var5) {
                var5 = this.field1801[var8];
            }
        }
        this.field1803 = new int[var5 + 1];
        this.field1775 = new int[var5 + 1][];
        this.field1764 = new Object[var5 + 1];
        this.field1788 = new int[var5 + 1];
        this.field1778 = new Object[var5 + 1][];
        this.field1806 = new int[var5 + 1];
        if (var7 != 0) {
            this.field1772 = new int[var5 + 1];
            for (int var9 = 0; var9 < var5 + 1; var9++) {
                this.field1772[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1768; var10++) {
                this.field1772[this.field1801[var10]] = var3.method814(class44.method277(arg0, -44));
            }
            this.field1780 = new class8(this.field1772);
        }
        for (int var11 = 0; var11 < this.field1768; var11++) {
            this.field1803[this.field1801[var11]] = var3.method814(arg0 + 44);
        }
        int var12 = 0;
        if (arg0 != -36) {
            field1813 = null;
        }
        while (this.field1768 > var12) {
            this.field1806[this.field1801[var12]] = var3.method814(8);
            var12++;
        }
        for (int var13 = 0; var13 < this.field1768; var13++) {
            this.field1788[this.field1801[var13]] = var3.method785(true);
        }
        for (int var14 = 0; var14 < this.field1768; var14++) {
            int var20 = 0;
            int var21 = this.field1801[var14];
            int var22 = -1;
            int var23 = this.field1788[var21];
            this.field1775[var21] = new int[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                int var25 = this.field1775[var21][var24] = var20 += var3.method785(true);
                if (var25 > var22) {
                    var22 = var25;
                }
            }
            this.field1778[var21] = new Object[var22 + 1];
        }
        if (var7 == 0) {
            return;
        }
        this.field1794 = new int[var5 + 1][];
        this.field1789 = new class8[var5 + 1];
        for (int var15 = 0; var15 < this.field1768; var15++) {
            int var16 = this.field1801[var15];
            int var17 = this.field1788[var16];
            this.field1794[var16] = new int[this.field1778[var16].length];
            for (int var18 = 0; var18 < this.field1778[var16].length; var18++) {
                this.field1794[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field1794[var16][this.field1775[var16][var19]] = var3.method814(8);
            }
            this.field1789[var16] = new class8(this.field1794[var16]);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Z")
    public final boolean method556(int arg0, int arg1) {
        field1779++;
        if (this.field1764[arg0] != null) {
            return true;
        }
        if (arg1 != 14406) {
            field1787 = null;
        }
        this.method575(arg0, -119);
        return this.field1764[arg0] != null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static void method557(int arg0) {
        field1810 = null;
        field1813 = null;
        if (arg0 != 1) {
            field1808 = null;
        }
        field1811 = null;
        field1808 = null;
        field1781 = null;
        field1787 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[B")
    public final byte[] method558(int arg0, int arg1) {
        field1784++;
        if (this.field1778.length == 1) {
            return this.method552(arg0, 0, 0);
        } else if (this.field1778[arg0].length == 1) {
            return this.method552(0, arg0, 0);
        } else {
            if (arg1 >= -88) {
                field1805 = 51;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lsg;ILsg;)[B")
    public final byte[] method559(class169 arg0, int arg1, class169 arg2) {
        if (arg1 != 0) {
            this.field1764 = null;
        }
        class169 var4 = arg2.method1131((byte) -67);
        field1783++;
        class169 var5 = arg0.method1131((byte) -126);
        int var6 = this.field1780.method44(71, var4.method1130((byte) -93));
        int var7 = this.field1789[var6].method44(-110, var5.method1130((byte) -87));
        return this.method552(var7, var6, 0);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Z")
    public final boolean method560(int arg0, int arg1) {
        field1773++;
        if (this.field1778.length == 1) {
            return this.method567(arg1, arg0 + 19406, 0);
        } else if (this.field1778[arg1].length == 1) {
            return this.method567(0, 19406, arg1);
        } else {
            if (arg0 != 0) {
                this.method572(-23, null, 33);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILsg;Lsg;)Z")
    public final boolean method561(int arg0, class169 arg1, class169 arg2) {
        int var4 = -47 % ((arg0 - 56) / 40);
        field1771++;
        class169 var5 = arg1.method1131((byte) -71);
        class169 var6 = arg2.method1131((byte) -68);
        int var7 = this.field1780.method44(69, var5.method1130((byte) -56));
        int var8 = this.field1789[var7].method44(97, var6.method1130((byte) -69));
        return this.method567(var8, 19406, var7);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILsg;I)I")
    public final int method562(int arg0, class169 arg1, int arg2) {
        class169 var4 = arg1.method1131((byte) -127);
        if (arg2 == 25284) {
            field1765++;
            return this.field1789[arg0].method44(arg2 ^ 0xFFFF9D00, var4.method1130((byte) -68));
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method563(Throwable arg0, int arg1) throws IOException {
        field1800++;
        String var2;
        if (arg0 instanceof class49) {
            class49 var3 = (class49) arg0;
            arg0 = var3.field882;
            var2 = var3.field884 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 < 11) {
            field1811 = null;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)[I")
    public final int[] method564(int arg0, int arg1) {
        if (arg1 == -2) {
            field1777++;
            return this.field1775[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
    public final void method565(byte arg0, int arg1) {
        if (arg0 > 78) {
            for (int var3 = 0; var3 < this.field1778[arg1].length; var3++) {
                this.field1778[arg1][var3] = null;
            }
            field1770++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[III)[B")
    public final byte[] method566(int arg0, int[] arg1, int arg2, int arg3) {
        field1790++;
        if (arg3 > arg0 || this.field1778.length <= arg0 || this.field1778[arg0] == null || arg2 < 0 || arg2 >= this.field1778[arg0].length) {
            return null;
        }
        if (this.field1778[arg0][arg2] == null) {
            boolean var5 = this.method572(arg0, arg1, arg3);
            if (!var5) {
                this.method575(arg0, -82);
                boolean var6 = this.method572(arg0, arg1, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class203.method1321(false, 0, this.field1778[arg0][arg2]);
        if (this.field1796) {
            this.field1778[arg0][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
    public final boolean method567(int arg0, int arg1, int arg2) {
        field1802++;
        if (arg2 < 0 || arg2 >= this.field1778.length || this.field1778[arg2] == null || arg0 < 0 || this.field1778[arg2].length <= arg0) {
            return false;
        } else if (this.field1778[arg2][arg0] != null) {
            return true;
        } else if (this.field1764[arg2] == null) {
            if (arg1 != 19406) {
                this.field1796 = false;
            }
            this.method575(arg2, -66);
            return this.field1764[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z")
    public final boolean method568(int arg0) {
        field1782++;
        if (arg0 != -27628) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1801.length; var3++) {
            int var4 = this.field1801[var3];
            if (this.field1764[var4] == null) {
                this.method575(var4, -78);
                if (this.field1764[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)[B")
    public final byte[] method569(int arg0, int arg1, int arg2) {
        field1767++;
        if (arg0 < ~arg2 || arg2 >= this.field1778.length || this.field1778[arg2] == null || arg1 < 0 || arg1 >= this.field1778[arg2].length) {
            return null;
        }
        if (this.field1778[arg2][arg1] == null) {
            boolean var4 = this.method572(arg2, null, ~arg0);
            if (!var4) {
                this.method575(arg2, -47);
                boolean var5 = this.method572(arg2, null, arg0 + 1);
                if (!var5) {
                    return null;
                }
            }
        }
        return class203.method1321(false, 0, this.field1778[arg2][arg1]);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)I")
    public final int method570(byte arg0, int arg1) {
        if (arg0 == 113) {
            field1791++;
            return this.field1778[arg1].length;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method571(byte arg0) {
        if (arg0 < 74) {
            return;
        }
        field1798++;
        for (int var2 = 0; var2 < this.field1778.length; var2++) {
            if (this.field1778[var2] != null) {
                for (int var3 = 0; var3 < this.field1778[var2].length; var3++) {
                    this.field1778[var2][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[II)Z")
    private final boolean method572(int arg0, int[] arg1, int arg2) {
        field1793++;
        if (this.field1764[arg0] == null) {
            return false;
        }
        int var4 = this.field1788[arg0];
        int[] var5 = this.field1775[arg0];
        boolean var6 = true;
        Object[] var7 = this.field1778[arg0];
        for (int var8 = arg2; var8 < var4; var8++) {
            if (var7[var5[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class203.method1321(false, 0, this.field1764[arg0]);
        } else {
            var9 = class203.method1321(true, 0, this.field1764[arg0]);
            class127 var10 = new class127(var9);
            var10.method783(5, arg1, var10.field2325.length, -113);
        }
        byte[] var11;
        try {
            var11 = class148.method967((byte) -26, var9);
        } catch (RuntimeException var28) {
            throw class160.method1030(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class61.method382(var9, var9.length, false) + "," + class61.method382(var9, var9.length - 2, false) + "," + this.field1803[arg0] + "," + this.field1799);
        }
        if (this.field1804) {
            this.field1764[arg0] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            class127 var15 = new class127(var11);
            int var16 = var29 - var14 * 4 * var4;
            int[] var17 = new int[var4];
            var15.field2346 = var16;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var15.method814(arg2 ^ 0x8);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            int var23 = 0;
            var15.field2346 = var16;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var15.method814(8);
                    class97.method580(var11, var23, var21[var26], var17[var26], var25);
                    var23 += var25;
                    var17[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field1796) {
                    var7[var5[var27]] = var21[var27];
                } else {
                    var7[var5[var27]] = class111.method687(var21[var27], 73, false);
                }
            }
        } else if (this.field1796) {
            var7[var5[0]] = var11;
        } else {
            var7[var5[0]] = class111.method687(var11, arg2 + 54, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lqf;II)Lsg;")
    public static final class169 method573(class150 arg0, int arg1, int arg2) {
        if (arg1 > -48) {
            method573(null, 116, -59);
        }
        field1797++;
        if (!class199.method1305(class70.method436(arg0, 107), arg2, 2) && arg0.field2786 == null) {
            return null;
        } else if (arg0.field2897 == null || arg0.field2897.length <= arg2 || arg0.field2897[arg2] == null || arg0.field2897[arg2].method1107(-1).method1134(0) == 0) {
            return class172.field3335 ? class165.method1058(0, new class169[] { class160.field3053, class2.method18((byte) -62, arg2) }) : null;
        } else {
            return arg0.field2897[arg2];
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILke;)V")
    public static final void method574(int arg0, class95 arg1) {
        class57.field1062 = arg1;
        if (arg0 != -9306) {
            method573(null, -50, 110);
        }
        field1795++;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)V")
    public void method575(int arg0, int arg1) {
        int var3 = -117 % ((-arg1 - 8) / 36);
        field1785++;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ZZ)V")
    public class95(boolean arg0, boolean arg1) {
        this.field1804 = arg0;
        this.field1796 = arg1;
    }
}
