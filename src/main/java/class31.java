import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public abstract class class31 {

    @OriginalMember(owner = "mapview!q", name = "u", descriptor = "Z")
    private boolean field440;

    @OriginalMember(owner = "mapview!q", name = "p", descriptor = "Z")
    public boolean field435;

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "La;")
    public static class1 field425 = class3.method36("Clothes Shop", -128);

    @OriginalMember(owner = "mapview!q", name = "s", descriptor = "La;")
    public static class1 field438 = class3.method36(" map", -106);

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "La;")
    public static class1 field429 = class3.method36("???", -83);

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lia;")
    public static class17 field427;

    @OriginalMember(owner = "mapview!q", name = "o", descriptor = "Lm;")
    public static class23 field434;

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Le;")
    private class8 field426;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "[I")
    private int[] field423;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "mapview!q", name = "q", descriptor = "[I")
    private int[] field436;

    @OriginalMember(owner = "mapview!q", name = "t", descriptor = "[I")
    public int[] field439;

    @OriginalMember(owner = "mapview!q", name = "v", descriptor = "[I")
    private int[] field441;

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "[Lu;")
    public static class38[] field422;

    @OriginalMember(owner = "mapview!q", name = "n", descriptor = "[Le;")
    private class8[] field433;

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field432;

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "[[I")
    private int[][] field431;

    @OriginalMember(owner = "mapview!q", name = "r", descriptor = "[[I")
    private int[][] field437;

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field428;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIILq;Lq;)Lka;", line = 19)
    public static final class20 method195(int arg0, int arg1, int arg2, class31 arg3, class31 arg4) {
        if (arg0 > -64) {
            method195(-13, 5, -16, null, null);
        }
        return class8.method55(arg4, 1, arg1, arg2) ? class33.method221(arg3.method205(arg2, arg1, -10526), 12) : null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILa;)I", line = 46)
    public final int method196(int arg0, class1 arg1) {
        if (arg0 != -2) {
            this.field423 = null;
        }
        class1 var3 = arg1.method14((byte) -60);
        return this.field426.method57(var3.method6(false), -1);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(III)V", line = 60)
    public static final void method197(int arg0, int arg1, int arg2) {
        class39.field498 = arg2 & 0x3F;
        class40.field518 = arg0 & 0x3F;
        class4.field42 = arg0 >> 6;
        if (arg1 >= -20) {
            method206(null, (byte) 39);
        }
        class28.field395 = arg2 >> 6;
        class5.field47 = (class39.field498 << 6) + class40.field518;
        class40.method259(18508);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I[II)Z", line = 90)
    private final boolean method198(int arg0, int[] arg1, int arg2) {
        if (this.field432[arg0] == null) {
            return false;
        }
        int var4 = this.field441[arg0];
        Object[] var5 = this.field428[arg0];
        boolean var6 = true;
        int[] var7 = this.field431[arg0];
        for (int var8 = arg2; var8 < var4; var8++) {
            if (var5[var7[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class24.method143(false, this.field432[arg0], arg2 ^ 0x20);
        } else {
            var9 = class24.method143(true, this.field432[arg0], 32);
            class39 var10 = new class39(var9);
            var10.method257(5, 76, var10.field497.length, arg1);
        }
        byte[] var11;
        try {
            var11 = class1.method13((byte) -24, var9);
        } catch (RuntimeException var28) {
            throw class23.method142(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class26.method175(var9, (byte) -5, var9.length) + "," + class26.method175(var9, (byte) -5, var9.length - 2) + "," + this.field436[arg0] + "," + this.field420);
        }
        if (this.field435) {
            this.field432[arg0] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var4 * var14 * 4;
            class39 var16 = new class39(var11);
            var16.field493 = var15;
            int[] var17 = new int[var4];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var16.method250(arg2 + 26078);
                    var17[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var17[var22]];
                var17[var22] = 0;
            }
            var16.field493 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var16.method250(26078);
                    class18.method90(var11, var23, var21[var26], var17[var26], var25);
                    var17[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field440) {
                    var5[var7[var27]] = var21[var27];
                } else {
                    var5[var7[var27]] = class36.method232(var21[var27], false, (byte) 121);
                }
            }
        } else if (this.field440) {
            var5[var7[0]] = var11;
        } else {
            var5[var7[0]] = class36.method232(var11, false, (byte) 121);
        }
        return true;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 253)
    public static void method199(byte arg0) {
        field434 = null;
        field422 = null;
        field429 = null;
        int var1 = 66 % ((-arg0 - 58) / 49);
        field438 = null;
        field427 = null;
        field425 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BI)V", line = 293)
    private final void method200(byte arg0, int arg1) {
        if (arg0 != 55) {
            method199((byte) 4);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IILa;)I", line = 303)
    public final int method201(int arg0, int arg1, class1 arg2) {
        class1 var4 = arg2.method14((byte) -60);
        if (arg0 != 0) {
            this.field426 = null;
        }
        return this.field433[arg1].method57(var4.method6(false), -1);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(La;IILjava/awt/Color;)V", line = 318)
    public static final void method202(class1 arg0, int arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class29.field402.getGraphics();
            if (class40.field515 == null) {
                class40.field515 = new Font("Helvetica", 1, 13);
                class23.field216 = class29.field402.getFontMetrics(class40.field515);
            }
            if (class41.field519) {
                class41.field519 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class33.field458, class29.field405);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class14.field128 == null) {
                    class14.field128 = class29.field402.createImage(304, 34);
                }
                Graphics var5 = class14.field128.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class40.field515);
                var5.setColor(Color.white);
                arg0.method26(var5, (byte) 36, 22, (304 - arg0.method4(class23.field216, (byte) 85)) / 2);
                var4.drawImage(class14.field128, class33.field458 / 2 - 152, class29.field405 / 2 + -18, null);
            } catch (Exception var11) {
                int var7 = class33.field458 / 2 - 152;
                int var8 = class29.field405 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class40.field515);
                var4.setColor(Color.white);
                arg0.method26(var4, (byte) 36, var8 + 22, var7 - -((-arg0.method4(class23.field216, (byte) -80) + 304) / 2));
            }
        } catch (Exception var12) {
            class29.field402.repaint();
        }
        int var10 = -63 % ((-arg2 - 56) / 38);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([BI)V", line = 388)
    public final void method203(byte[] arg0, int arg1) {
        this.field420 = class26.method175(arg0, (byte) -5, arg0.length);
        class39 var3 = new class39(class1.method13((byte) -24, arg0));
        int var4 = var3.method245(-115);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method250(26078);
        }
        int var5 = var3.method245(-122);
        this.field430 = var3.method253(false);
        this.field439 = new int[this.field430];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field430; var8++) {
            this.field439[var8] = var7 += var3.method253(false);
            if (this.field439[var8] > var6) {
                var6 = this.field439[var8];
            }
        }
        this.field428 = new Object[var6 + 1][];
        this.field431 = new int[var6 + 1][];
        this.field436 = new int[var6 + 1];
        this.field432 = new Object[var6 + 1];
        this.field424 = new int[var6 + 1];
        this.field441 = new int[var6 + 1];
        if (var5 != 0) {
            this.field423 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field423[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field430; var10++) {
                this.field423[this.field439[var10]] = var3.method250(arg1 + 26078);
            }
            this.field426 = new class8(this.field423);
        }
        for (int var11 = 0; var11 < this.field430; var11++) {
            this.field436[this.field439[var11]] = var3.method250(arg1 + 26078);
        }
        for (int var12 = 0; var12 < this.field430; var12++) {
            this.field424[this.field439[var12]] = var3.method250(26078);
        }
        for (int var13 = arg1; var13 < this.field430; var13++) {
            this.field441[this.field439[var13]] = var3.method253(false);
        }
        for (int var14 = 0; var14 < this.field430; var14++) {
            int var15 = this.field439[var14];
            int var16 = 0;
            int var17 = this.field441[var15];
            this.field431[var15] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field431[var15][var19] = var16 += var3.method253(false);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field428[var15] = new Object[var18 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field437 = new int[var6 + 1][];
        this.field433 = new class8[var6 + 1];
        for (int var21 = 0; var21 < this.field430; var21++) {
            int var22 = this.field439[var21];
            int var23 = this.field441[var22];
            this.field437[var22] = new int[this.field428[var22].length];
            for (int var24 = 0; var24 < this.field428[var22].length; var24++) {
                this.field437[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                this.field437[var22][this.field431[var22][var25]] = var3.method250(26078);
            }
            this.field433[var22] = new class8(this.field437[var22]);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([IIII)[B", line = 545)
    private final byte[] method204(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < ~arg3 || this.field428.length <= arg3 || this.field428[arg3] == null || arg2 < 0 || arg2 >= this.field428[arg3].length) {
            return null;
        }
        if (this.field428[arg3][arg2] == null) {
            boolean var5 = this.method198(arg3, arg0, ~arg1);
            if (!var5) {
                this.method200((byte) 55, arg3);
                boolean var6 = this.method198(arg3, arg0, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class24.method143(false, this.field428[arg3][arg2], 32);
        if (this.field440) {
            this.field428[arg3][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "(ZZ)V", line = 577)
    public class31(boolean arg0, boolean arg1) {
        this.field440 = arg1;
        this.field435 = arg0;
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(III)[B", line = 587)
    public final byte[] method205(int arg0, int arg1, int arg2) {
        return arg2 == -10526 ? this.method204(null, -1, arg0, arg1) : (byte[]) null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 601)
    public static final void method206(Component arg0, byte arg1) {
        arg0.addMouseListener(class13.field116);
        if (arg1 != -34) {
            field434 = null;
        }
        arg0.addMouseMotionListener(class13.field116);
        arg0.addFocusListener(class13.field116);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(La;ILa;)[B", line = 613)
    public final byte[] method207(class1 arg0, int arg1, class1 arg2) {
        class1 var4 = arg2.method14((byte) -60);
        class1 var5 = arg0.method14((byte) -60);
        if (arg1 != 10172) {
            this.method207(null, 69, null);
        }
        int var6 = this.field426.method57(var4.method6(false), arg1 ^ 0xFFFFD843);
        int var7 = this.field433[var6].method57(var5.method6(false), -1);
        return this.method205(var7, var6, -10526);
    }
}
