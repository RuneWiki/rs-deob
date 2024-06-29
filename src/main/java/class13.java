import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public abstract class class13 {

    @OriginalMember(owner = "mapview!g", name = "v", descriptor = "Z")
    private boolean field205;

    @OriginalMember(owner = "mapview!g", name = "x", descriptor = "Z")
    private boolean field207;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Lh;")
    public static class15 field188 = class18.method153("General Store", 1);

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "Lh;")
    public static class15 field194 = class18.method153("Crafting Shop", 1);

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Lh;")
    public static class15 field185 = class18.method153("Slayer Master", 1);

    @OriginalMember(owner = "mapview!g", name = "r", descriptor = "Lh;")
    public static class15 field201 = class18.method153("Silver Shop", 1);

    @OriginalMember(owner = "mapview!g", name = "q", descriptor = "Lh;")
    public static class15 field200 = class18.method153("Dairy Churn", 1);

    @OriginalMember(owner = "mapview!g", name = "t", descriptor = "Lh;")
    public static class15 field203 = class18.method153("Spice Shop", 1);

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "mapview!g", name = "w", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "mapview!g", name = "u", descriptor = "Lu;")
    private class35 field204;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "[I")
    private int[] field186;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "[I")
    private int[] field187;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "[I")
    private int[] field189;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "[I")
    public int[] field193;

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "[I")
    private int[] field195;

    @OriginalMember(owner = "mapview!g", name = "o", descriptor = "[Lu;")
    private class35[] field198;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "[[B")
    public static byte[][] field192;

    @OriginalMember(owner = "mapview!g", name = "s", descriptor = "[[B")
    public byte[][] field202;

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "[[I")
    private int[][] field190;

    @OriginalMember(owner = "mapview!g", name = "p", descriptor = "[[I")
    private int[][] field199;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "[[[B")
    private byte[][][] field184;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I[II)Z", line = 54)
    private final boolean method99(int arg0, int[] arg1, int arg2) {
        if (this.field202[arg2] == null) {
            return false;
        }
        int var4 = this.field189[arg2];
        int[] var5 = this.field190[arg2];
        if (arg0 != -25790) {
            this.field207 = false;
        }
        byte[][] var6 = this.field184[arg2];
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = this.field202[arg2];
        } else {
            var9 = new byte[this.field202[arg2].length];
            class2.method28(this.field202[arg2], 0, var9, 0, var9.length);
            class19 var10 = new class19(var9);
            var10.method167(var10.field263.length, 5, arg1, arg0 + 91070);
        }
        byte[] var11;
        try {
            var11 = class19.method171(var9, 1);
        } catch (RuntimeException var26) {
            throw mapview.method23(var26, "T3 - " + (arg1 != null) + "," + arg2 + "," + var9.length + "," + class11.method95(var9, 14869, var9.length) + "," + class11.method95(var9, 14869, var9.length - 2) + "," + this.field187[arg2] + "," + this.field206);
        }
        if (this.field207) {
            this.field202[arg2] = null;
        }
        if (var4 <= 1) {
            var6[var5[0]] = var11;
        } else {
            int var13 = var11.length;
            int[] var14 = new int[var4];
            int var27 = var13 - 1;
            int var15 = var11[var27] & 0xFF;
            class19 var16 = new class19(var11);
            int var17 = var27 - var15 * 4 * var4;
            var16.field261 = var17;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method162((byte) 115);
                    var14[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var6[var5[var21]] == null) {
                    var6[var5[var21]] = new byte[var14[var21]];
                }
                var14[var21] = 0;
            }
            var16.field261 = var17;
            int var22 = 0;
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var16.method162((byte) 120);
                    class2.method28(var11, var22, var6[var5[var25]], var14[var25], var24);
                    var14[var25] += var24;
                    var22 += var24;
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(III)[B", line = 199)
    public final byte[] method100(int arg0, int arg1, int arg2) {
        if (arg2 != -16591) {
            field185 = null;
        }
        return this.method107(null, arg1, (byte) -113, arg0);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Lh;Lh;Z)[B", line = 215)
    public final byte[] method101(class15 arg0, class15 arg1, boolean arg2) {
        if (arg2) {
            return (byte[]) null;
        }
        class15 var4 = arg1.method119(113);
        class15 var5 = arg0.method119(122);
        int var6 = this.field204.method234(var4.method125((byte) -116), false);
        int var7 = this.field198[var6].method234(var5.method125((byte) -101), false);
        return this.method100(var7, var6, -16591);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([BB)V", line = 235)
    public final void method102(byte[] arg0, byte arg1) {
        this.field206 = class11.method95(arg0, arg1 ^ 0x3A68, arg0.length);
        class19 var3 = new class19(class19.method171(arg0, arg1 ^ 0x7C));
        int var4 = var3.method164((byte) 62);
        if (var4 != 5) {
            return;
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method164((byte) 62);
        this.field197 = var3.method166(2);
        this.field193 = new int[this.field197];
        for (int var8 = 0; var8 < this.field197; var8++) {
            this.field193[var8] = var5 += var3.method166(2);
            if (var6 < this.field193[var8]) {
                var6 = this.field193[var8];
            }
        }
        this.field189 = new int[var6 + 1];
        this.field202 = new byte[var6 + 1][];
        this.field184 = new byte[var6 + 1][][];
        this.field190 = new int[var6 + 1][];
        this.field187 = new int[var6 + 1];
        this.field186 = new int[var6 + 1];
        if (arg1 != 125) {
            this.method111(-89, 105);
        }
        if (var7 != 0) {
            this.field195 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field197; var9++) {
                this.field195[this.field193[var9]] = var3.method162((byte) 119);
            }
            this.field204 = new class35(this.field195);
        }
        for (int var10 = 0; var10 < this.field197; var10++) {
            this.field187[this.field193[var10]] = var3.method162((byte) 118);
        }
        for (int var11 = 0; var11 < this.field197; var11++) {
            this.field186[this.field193[var11]] = var3.method162((byte) 117);
        }
        for (int var12 = 0; var12 < this.field197; var12++) {
            this.field189[this.field193[var12]] = var3.method166(method109(arg1, 127));
        }
        for (int var13 = 0; var13 < this.field197; var13++) {
            int var14 = 0;
            int var15 = this.field193[var13];
            int var16 = -1;
            int var17 = this.field189[var15];
            this.field190[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field190[var15][var18] = var14 += var3.method166(2);
                if (var19 > var16) {
                    var16 = var19;
                }
            }
            this.field184[var15] = new byte[var16 + 1][];
        }
        if (var7 == 0) {
            return;
        }
        this.field198 = new class35[var6 + 1];
        this.field199 = new int[var6 + 1][];
        for (int var20 = 0; var20 < this.field197; var20++) {
            int var21 = this.field193[var20];
            int var22 = this.field189[var21];
            this.field199[var21] = new int[this.field184[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field199[var21][this.field190[var21][var23]] = var3.method162((byte) 117);
            }
            this.field198[var21] = new class35(this.field199[var21]);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ZLjava/lang/String;)Lh;", line = 375)
    public static final class15 method103(boolean arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        if (arg0) {
            field201 = null;
        }
        class15 var4 = new class15();
        var4.field229 = 0;
        var4.field219 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field229++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ILh;)I", line = 420)
    public final int method104(int arg0, class15 arg1) {
        int var3 = -32 / ((arg0 - 66) / 56);
        class15 var4 = arg1.method119(14);
        return this.field204.method234(var4.method125((byte) -113), false);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Ljava/awt/Color;IBLh;)V", line = 438)
    public static final void method105(Color arg0, int arg1, byte arg2, class15 arg3) {
        try {
            Graphics var4 = class25.field340.getGraphics();
            if (class33.field424 == null) {
                class33.field424 = new Font("Helvetica", 1, 13);
                class9.field117 = class25.field340.getFontMetrics(class33.field424);
            }
            if (class30.field389) {
                class30.field389 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class16.field236, class19.field268);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class14.field210 == null) {
                    class14.field210 = class25.field340.createImage(304, 34);
                }
                Graphics var5 = class14.field210.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                if (arg2 <= 71) {
                    field200 = null;
                }
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class33.field424);
                var5.setColor(Color.white);
                arg3.method132((304 - arg3.method116(class9.field117, false)) / 2, true, 22, var5);
                var4.drawImage(class14.field210, class16.field236 / 2 - 152, class19.field268 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class19.field268 / 2 - 18;
                int var8 = class16.field236 / 2 - 152;
                var4.setColor(arg0);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var8 + 2, var7 - -2, 300 - arg1 * 3, 30);
                var4.setFont(class33.field424);
                var4.setColor(Color.white);
                arg3.method132(var8 + (304 - arg3.method116(class9.field117, false)) / 2, true, var7 + 22, var4);
            }
        } catch (Exception var11) {
            class25.field340.repaint();
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 501)
    public static final void method106(Component arg0, byte arg1) {
        if (arg1 == -114) {
            arg0.removeKeyListener(class21.field288);
            arg0.removeFocusListener(class21.field288);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([IIBI)[B", line = 512)
    private final byte[] method107(int[] arg0, int arg1, byte arg2, int arg3) {
        if (arg1 < 0 || this.field184.length <= arg1 || this.field184[arg1] == null || arg3 < 0 || this.field184[arg1].length <= arg3) {
            return null;
        }
        if (this.field184[arg1][arg3] == null) {
            boolean var5 = this.method99(-25790, arg0, arg1);
            if (!var5) {
                this.method111(-108, arg1);
                boolean var6 = this.method99(-25790, arg0, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field184[arg1][arg3];
        if (this.field205) {
            this.field184[arg1][arg3] = null;
        }
        int var8 = -73 / ((arg2 + 77) / 33);
        return var7;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 556)
    public static void method108(byte arg0) {
        field201 = null;
        field192 = null;
        field203 = null;
        field200 = null;
        field188 = null;
        field194 = null;
        int var1 = 23 % ((47 - arg0) / 35);
        field185 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II)I", line = 571)
    private static int method109(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ILh;I)I", line = 586)
    public final int method110(int arg0, class15 arg1, int arg2) {
        if (arg2 != 0) {
            field200 = null;
        }
        class15 var4 = arg1.method119(-86);
        return this.field198[arg0].method234(var4.method125((byte) -118), false);
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(II)V", line = 615)
    private final void method111(int arg0, int arg1) {
        int var3 = -37 / ((arg0 + 16) / 46);
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(ZZ)V", line = 621)
    public class13(boolean arg0, boolean arg1) {
        this.field205 = arg1;
        this.field207 = arg0;
    }
}
