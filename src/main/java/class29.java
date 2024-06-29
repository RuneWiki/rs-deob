import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class29 {

    @OriginalMember(owner = "mapview!p", name = "q", descriptor = "Z")
    public boolean field444;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Z")
    private boolean field436;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Lna;")
    public static class26 field429 = class33.method219("Tannery", 104);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Lna;")
    public static class26 field430 = class33.method219("Bank", 78);

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lna;")
    public static class26 field432 = class33.method219("loc)3dat", 118);

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Lna;")
    public static class26 field440 = class33.method219("General Store", 116);

    @OriginalMember(owner = "mapview!p", name = "v", descriptor = "Lna;")
    public static class26 field449 = class33.method219("Enter place name to find", 109);

    @OriginalMember(owner = "mapview!p", name = "x", descriptor = "Lna;")
    public static class26 field451 = class33.method219("Overview", 91);

    @OriginalMember(owner = "mapview!p", name = "y", descriptor = "Lna;")
    public static class26 field452 = class33.method219("Loading )3)3)3", 102);

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "mapview!p", name = "t", descriptor = "Lg;")
    private class12 field447;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field433;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "[I")
    private int[] field435;

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "[I")
    private int[] field439;

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "[I")
    private int[] field443;

    @OriginalMember(owner = "mapview!p", name = "r", descriptor = "[I")
    private int[] field445;

    @OriginalMember(owner = "mapview!p", name = "s", descriptor = "[I")
    public static int[] field446;

    @OriginalMember(owner = "mapview!p", name = "w", descriptor = "[I")
    public int[] field450;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "[Lg;")
    private class12[] field442;

    @OriginalMember(owner = "mapview!p", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field448;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "[[I")
    private int[][] field434;

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "[[I")
    private int[][] field438;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field428;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 10)
    public static final String method197(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class20) {
            class20 var2 = (class20) arg0;
            arg0 = var2.field220;
            var3 = var2.field216 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    if (arg1 != 5) {
                        field433 = null;
                    }
                    return var18;
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

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(II[I)Z", line = 78)
    private final boolean method198(int arg0, int arg1, int[] arg2) {
        if (this.field448[arg0] == null) {
            return false;
        }
        int var4 = this.field439[arg0];
        boolean var5 = true;
        int[] var6 = this.field438[arg0];
        Object[] var7 = this.field428[arg0];
        for (int var8 = 0; var8 < var4; var8++) {
            if (var7[var6[var8]] == null) {
                var5 = false;
                break;
            }
        }
        if (var5) {
            return true;
        }
        byte[] var9;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var9 = mapview.method142(this.field448[arg0], -118, false);
        } else {
            var9 = mapview.method142(this.field448[arg0], 104, true);
            class40 var10 = new class40(var9);
            var10.method259(1469468875, arg2, var10.field530.length, 5);
        }
        byte[] var11;
        try {
            var11 = class3.method22(var9, arg1);
        } catch (RuntimeException var28) {
            throw class1.method2(var28, "T3 - " + (arg2 != null) + "," + arg0 + "," + var9.length + "," + class2.method17(var9.length, var9, 5702) + "," + class2.method17(var9.length - 2, var9, 5702) + "," + this.field435[arg0] + "," + this.field437);
        }
        if (this.field444) {
            this.field448[arg0] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var4 * var14 * 4;
            int[] var16 = new int[var4];
            class40 var17 = new class40(var11);
            var17.field528 = var15;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method248(arg1 ^ 0xFF);
                    var16[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var16[var22]];
                var16[var22] = 0;
            }
            var17.field528 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method248(255);
                    class36.method239(var11, var23, var21[var26], var16[var26], var25);
                    var16[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field436) {
                    var7[var6[var27]] = var21[var27];
                } else {
                    var7[var6[var27]] = class20.method115(false, var21[var27], false);
                }
            }
        } else if (this.field436) {
            var7[var6[0]] = var11;
        } else {
            var7[var6[0]] = class20.method115(false, var11, false);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([BB)V", line = 237)
    public final void method199(byte[] arg0, byte arg1) {
        this.field437 = class2.method17(arg0.length, arg0, 5702);
        class40 var3 = new class40(class3.method22(arg0, 0));
        int var4 = var3.method252(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        } else if (arg1 > 15) {
            if (var4 >= 6) {
                var3.method248(255);
            }
            int var5 = var3.method252(255);
            this.field441 = var3.method246(-25327);
            int var6 = 0;
            this.field450 = new int[this.field441];
            int var7 = -1;
            for (int var8 = 0; var8 < this.field441; var8++) {
                this.field450[var8] = var6 += var3.method246(-25327);
                if (var7 < this.field450[var8]) {
                    var7 = this.field450[var8];
                }
            }
            this.field428 = new Object[var7 + 1][];
            this.field448 = new Object[var7 + 1];
            this.field443 = new int[var7 + 1];
            this.field438 = new int[var7 + 1][];
            this.field439 = new int[var7 + 1];
            this.field435 = new int[var7 + 1];
            if (var5 != 0) {
                this.field445 = new int[var7 + 1];
                for (int var9 = 0; var9 < var7 + 1; var9++) {
                    this.field445[var9] = -1;
                }
                for (int var10 = 0; var10 < this.field441; var10++) {
                    this.field445[this.field450[var10]] = var3.method248(255);
                }
                this.field447 = new class12(this.field445);
            }
            for (int var11 = 0; var11 < this.field441; var11++) {
                this.field435[this.field450[var11]] = var3.method248(255);
            }
            for (int var12 = 0; var12 < this.field441; var12++) {
                this.field443[this.field450[var12]] = var3.method248(255);
            }
            for (int var13 = 0; var13 < this.field441; var13++) {
                this.field439[this.field450[var13]] = var3.method246(-25327);
            }
            for (int var14 = 0; var14 < this.field441; var14++) {
                int var15 = 0;
                int var16 = this.field450[var14];
                int var17 = this.field439[var16];
                this.field438[var16] = new int[var17];
                int var18 = -1;
                for (int var19 = 0; var19 < var17; var19++) {
                    int var20 = this.field438[var16][var19] = var15 += var3.method246(-25327);
                    if (var20 > var18) {
                        var18 = var20;
                    }
                }
                this.field428[var16] = new Object[var18 + 1];
            }
            if (var5 != 0) {
                this.field434 = new int[var7 + 1][];
                this.field442 = new class12[var7 + 1];
                for (int var21 = 0; var21 < this.field441; var21++) {
                    int var22 = this.field450[var21];
                    int var23 = this.field439[var22];
                    this.field434[var22] = new int[this.field428[var22].length];
                    for (int var24 = 0; var24 < this.field428[var22].length; var24++) {
                        this.field434[var22][var24] = -1;
                    }
                    for (int var25 = 0; var25 < var23; var25++) {
                        this.field434[var22][this.field438[var22][var25]] = var3.method248(255);
                    }
                    this.field442[var22] = new class12(this.field434[var22]);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(III)[B", line = 417)
    public final byte[] method200(int arg0, int arg1, int arg2) {
        if (arg1 != 11808) {
            this.method204(null, null, false);
        }
        return this.method202(null, arg2, arg1 ^ 0x2930, arg0);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IILna;)I", line = 452)
    public final int method201(int arg0, int arg1, class26 arg2) {
        if (arg0 != -1) {
            this.field444 = true;
        }
        class26 var4 = arg2.method180((byte) -128);
        return this.field442[arg1].method62(1805163361, var4.method168(-1664051515));
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([IIII)[B", line = 470)
    private final byte[] method202(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1808) {
            return (byte[]) null;
        } else if (arg3 < 0 || arg3 >= this.field428.length || this.field428[arg3] == null || arg1 < 0 || this.field428[arg3].length <= arg1) {
            return null;
        } else {
            if (this.field428[arg3][arg1] == null) {
                boolean var5 = this.method198(arg3, arg2 - 1808, arg0);
                if (!var5) {
                    this.method206(arg3, 0);
                    boolean var6 = this.method198(arg3, 0, arg0);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = mapview.method142(this.field428[arg3][arg1], arg2 ^ 0xFFFFF8C6, false);
            if (this.field436) {
                this.field428[arg3][arg1] = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 508)
    public static void method203(int arg0) {
        field451 = null;
        field429 = null;
        field432 = null;
        field430 = null;
        field440 = null;
        field452 = null;
        field433 = null;
        if (arg0 != 5) {
            method205(8);
        }
        field446 = null;
        field449 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Lna;Lna;Z)[B", line = 529)
    public final byte[] method204(class26 arg0, class26 arg1, boolean arg2) {
        class26 var4 = arg1.method180((byte) -128);
        if (!arg2) {
            this.field442 = null;
        }
        class26 var5 = arg0.method180((byte) -128);
        int var6 = this.field447.method62(1805163361, var4.method168(-1664051515));
        int var7 = this.field442[var6].method62(1805163361, var5.method168(-1664051515));
        return this.method200(var6, 11808, var7);
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)B", line = 554)
    public static final byte method205(int arg0) {
        if (arg0 == -1) {
            return class11.field107 == null ? 0 : class11.field107[class6.field65];
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(II)V", line = 574)
    private final void method206(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method204(null, null, false);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Lna;I)I", line = 594)
    public final int method207(class26 arg0, int arg1) {
        class26 var3 = arg0.method180((byte) -128);
        if (arg1 != -19661) {
            this.field443 = null;
        }
        return this.field447.method62(1805163361, var3.method168(-1664051515));
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "(ZZ)V", line = 605)
    public class29(boolean arg0, boolean arg1) {
        this.field444 = arg0;
        this.field436 = arg1;
    }
}
