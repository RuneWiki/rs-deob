import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class26 implements class16 {

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Z")
    private boolean field401 = true;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Lna;")
    public static class26 field394 = class33.method219("Hunter Store", 126);

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lna;")
    public static class26 field395 = class33.method219("Scimitar Shop", 94);

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lna;")
    public static class26 field398 = class33.method219("labels)3dat", 115);

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "[I")
    public static int[] field400 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Lna;")
    public static class26 field397 = class33.method219(" ", 94);

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "Lna;")
    public static class26 field406 = class33.method219("Silk Trader", 85);

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "Lna;")
    public static class26 field403 = class33.method219("Archery Shop", 83);

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "mapview!na", name = "n", descriptor = "Lta;")
    public static class38 field407;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!na", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field408;

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "[B")
    public byte[] field405;

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "[Lea;")
    public static class9[] field396;

    @OriginalMember(owner = "mapview!na", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)I", line = 18)
    public final int method165(int arg0) {
        if (arg0 != -24103) {
            field407 = null;
        }
        return this.method182(arg0 + 23995, 10);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IB)I", line = 30)
    public final int method166(int arg0, byte arg1) {
        return arg1 == 96 ? this.method167(arg0, 0, 19721) : -115;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(III)I", line = 45)
    private final int method167(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        if (arg2 != 19721) {
            field394 = null;
        }
        for (int var5 = arg1; var5 < this.field404; var5++) {
            if (this.field405[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)I", line = 70)
    public final int method168(int arg0) {
        int var2 = 0;
        if (arg0 != -1664051515) {
            field403 = null;
        }
        for (int var3 = 0; var3 < this.field404; var3++) {
            var2 = (this.field405[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 90)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class26)) {
            throw new IllegalArgumentException();
        }
        return this.method181(-1, (class26) arg0);
    }

    @OriginalMember(owner = "mapview!na", name = "hashCode", descriptor = "()I", line = 155)
    public final int hashCode() {
        return this.method168(-1664051515);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 164)
    private final void method169(byte arg0) {
        int var2 = -62 % ((45 - arg0) / 62);
        String var3;
        try {
            var3 = new String(this.field405, 0, this.field404, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field405, 0, this.field404);
        }
        System.out.println(var3);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 183)
    public final void method170(int arg0, byte arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field405, 0, this.field404, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field405, 0, this.field404);
        }
        if (arg1 <= 14) {
            this.method179(12);
        }
        arg3.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(B)V", line = 200)
    public static void method171(byte arg0) {
        field407 = null;
        if (arg0 != 98) {
            method171((byte) 62);
        }
        field396 = null;
        field397 = null;
        field395 = null;
        field400 = null;
        field394 = null;
        field406 = null;
        field403 = null;
        field398 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(B)V", line = 236)
    public static final void method172(byte arg0) {
        if (class14.field141.toLowerCase().indexOf("microsoft") == -1) {
            field400[92] = 74;
            field400[59] = 57;
            field400[45] = 26;
            field400[47] = 73;
            field400[46] = 72;
            if (class14.field139 == null) {
                field400[192] = 58;
                field400[222] = 59;
            } else {
                field400[222] = 58;
                field400[192] = 28;
                field400[520] = 59;
            }
            field400[44] = 71;
            field400[61] = 27;
            field400[91] = 42;
            field400[93] = 43;
        } else {
            field400[187] = 27;
            field400[191] = 73;
            field400[221] = 43;
            field400[186] = 57;
            field400[190] = 72;
            field400[223] = 28;
            field400[219] = 42;
            field400[188] = 71;
            field400[192] = 58;
            field400[189] = 26;
            field400[222] = 59;
            field400[220] = 74;
        }
        int var1 = 29 / ((5 - arg0) / 60);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II)Lna;", line = 284)
    public final class26 method173(int arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        }
        int var3 = -89 / ((-arg0 - 88) / 35);
        if (!this.field401) {
            throw new IllegalArgumentException();
        }
        this.field402 = 0;
        if (this.field405.length == this.field404) {
            int var4;
            for (var4 = 1; var4 <= this.field404; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class36.method239(this.field405, 0, var5, 0, this.field404);
            this.field405 = var5;
        }
        this.field405[this.field404++] = (byte) arg1;
        return this;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I[Lna;ZI)V", line = 327)
    public static final void method174(int arg0, class26[] arg1, boolean arg2, int arg3) {
        if (arg2) {
            return;
        }
        if (arg0 == 1) {
            arg1[0].method169((byte) -94);
        } else {
            class11.method54(arg3, -23132, arg0, arg1).method169((byte) 126);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 343)
    public final int method175(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field405, arg0, this.field404, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field405, 0, this.field404);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(I)Lna;", line = 371)
    public final class26 method176(int arg0) {
        if (!this.field401) {
            throw new IllegalArgumentException();
        }
        this.field402 = 0;
        if (arg0 != -2) {
            this.field405 = null;
        }
        if (this.field405.length != this.field404) {
            byte[] var2 = new byte[this.field404];
            class36.method239(this.field405, 0, var2, 0, this.field404);
            this.field405 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I[B)V", line = 399)
    public static final void method177(int arg0, byte[] arg1) {
        class40 var2 = new class40(arg1);
        var2.field528 = arg1.length - 2;
        class28.field427 = var2.method246(-25327);
        class39.field520 = new int[class28.field427];
        class10.field92 = new int[class28.field427];
        class10.field100 = new int[class28.field427];
        class25.field379 = new int[class28.field427];
        class2.field27 = new byte[class28.field427][];
        var2.field528 = arg1.length - class28.field427 * 8 - 7;
        class40.field523 = var2.method246(-25327);
        class12.field125 = var2.method246(-25327);
        int var3 = (var2.method252(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class28.field427; var4++) {
            class25.field379[var4] = var2.method246(-25327);
        }
        for (int var5 = 0; var5 < class28.field427; var5++) {
            class10.field100[var5] = var2.method246(-25327);
        }
        for (int var6 = 0; var6 < class28.field427; var6++) {
            class10.field92[var6] = var2.method246(-25327);
        }
        if (arg0 > -91) {
            method186(-93, -35);
        }
        for (int var7 = 0; var7 < class28.field427; var7++) {
            class39.field520[var7] = var2.method246(-25327);
        }
        var2.field528 = arg1.length - (var3 - 1) * 3 - class28.field427 * 8 - 7;
        class29.field446 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class29.field446[var8] = var2.method258((byte) 122);
            if (class29.field446[var8] == 0) {
                class29.field446[var8] = 1;
            }
        }
        var2.field528 = 0;
        for (int var9 = 0; var9 < class28.field427; var9++) {
            int var10 = class10.field92[var9];
            int var11 = class39.field520[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class2.field27[var9] = var13;
            int var14 = var2.method252(255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method251((byte) 110);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method251((byte) 96);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(IB)Lna;", line = 524)
    public final class26 method178(int arg0, byte arg1) {
        if (arg1 != -127) {
            this.field402 = 82;
        }
        return this.method187(arg0, this.field404, -51);
    }

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(I)I", line = 543)
    public final int method179(int arg0) {
        int var2 = 16 / ((65 - arg0) / 52);
        return this.field404;
    }

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(B)Lna;", line = 563)
    public final class26 method180(byte arg0) {
        if (arg0 != -128) {
            this.field402 = 48;
        }
        class26 var2 = new class26();
        var2.field404 = this.field404;
        var2.field405 = new byte[this.field404];
        for (int var3 = 0; var3 < this.field404; var3++) {
            byte var4 = this.field405[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field405[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ILna;)Z", line = 594)
    public final boolean method181(int arg0, class26 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field404 == arg1.field404) {
            if (!this.field401 || !arg1.field401) {
                if (this.field402 == 0) {
                    this.field402 = this.method168(-1664051515);
                    if (this.field402 == 0) {
                        this.field402 = 1;
                    }
                }
                if (arg1.field402 == 0) {
                    arg1.field402 = arg1.method168(arg0 ^ 0x632F693A);
                    if (arg1.field402 == 0) {
                        arg1.field402 = 1;
                    }
                }
                if (this.field402 != arg1.field402) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg0 != -1) {
                field396 = null;
            }
            while (var3 < this.field404) {
                if (this.field405[var3] != arg1.field405[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(II)I", line = 647)
    public final int method182(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field404; var6++) {
            int var7 = this.field405[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var8;
        }
        int var9 = -61 / ((arg0 + 35) / 43);
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(II)I", line = 725)
    public final int method183(int arg0, int arg1) {
        if (arg0 != -13799) {
            this.field404 = -73;
        }
        return this.field405[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BII)Lna;", line = 745)
    public final class26 method184(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg2;
        class26 var6 = new class26();
        var6.field404 = this.field404;
        var6.field405 = new byte[this.field404];
        for (int var7 = 0; var7 < this.field404; var7++) {
            byte var8 = this.field405[var7];
            if (var4 == var8) {
                var6.field405[var7] = var5;
            } else {
                var6.field405[var7] = var8;
            }
        }
        if (arg0 != 65) {
            this.method178(-122, (byte) -89);
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(II)V", line = 782)
    public final void method185(int arg0, int arg1) {
        this.field402 = 0;
        if (!this.field401) {
            throw new IllegalArgumentException();
        } else if (arg0 < ~arg1) {
            throw new IllegalArgumentException();
        } else {
            if (this.field405.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class36.method239(this.field405, 0, var4, 0, this.field404);
                this.field405 = var4;
            }
            for (int var5 = this.field404; var5 < arg1; var5++) {
                this.field405[var5] = 32;
            }
            this.field404 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "(II)Lna;", line = 831)
    public static final class26 method186(int arg0, int arg1) {
        return arg1 <= 14 ? (class26) null : class25.method164(arg0, 10, 39, false);
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(III)Lna;", line = 845)
    public final class26 method187(int arg0, int arg1, int arg2) {
        class26 var4 = new class26();
        var4.field404 = arg1 - arg0;
        var4.field405 = new byte[arg1 - arg0];
        class36.method239(this.field405, arg0, var4.field405, 0, var4.field404);
        int var5 = 84 / (-arg2 / 37);
        return var4;
    }

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "(I)J", line = 878)
    private final long method188(int arg0) {
        long var2 = 0L;
        if (arg0 < 62) {
            this.method170(78, (byte) -102, -33, null);
        }
        for (int var4 = 0; var4 < this.field404; var4++) {
            var2 = (var2 << 5) + ((long) (this.field405[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(ILna;)Z", line = 898)
    public final boolean method189(int arg0, class26 arg1) {
        if (arg1.field404 > this.field404) {
            return false;
        }
        int var3 = 41 % ((-arg0 - 11) / 54);
        for (int var4 = 0; var4 < arg1.field404; var4++) {
            if (this.field405[var4] != arg1.field405[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Lna;I)I", line = 941)
    public final int method190(class26 arg0, int arg1) {
        int var3;
        if (this.field404 <= arg0.field404) {
            var3 = this.field404;
        } else {
            var3 = arg0.field404;
        }
        for (int var4 = arg1; var4 < var3; var4++) {
            if ((this.field405[var4] & 0xFF) < (arg0.field405[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field405[var4] & 0xFF) < (this.field405[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field404 > this.field404) {
            return -1;
        } else if (this.field404 > arg0.field404) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "(B)Lna;", line = 980)
    public final class26 method191(byte arg0) {
        long var2 = this.method188(63);
        synchronized (field408 == null ? (field408 = method192("na")) : field408) {
            if (class10.field99 == null) {
                class10.field99 = new class23(4096);
            } else {
                for (class5 var5 = (class5) class10.field99.method126((byte) -109, var2); var5 != null; var5 = (class5) class10.field99.method123(11845)) {
                    if (this.method181(-1, var5.field60)) {
                        return var5.field60;
                    }
                }
            }
            if (arg0 != -82) {
                this.field404 = -39;
            }
            class5 var6 = new class5();
            var6.field60 = this;
            this.field401 = false;
            class10.field99.method124(var6, var2, 1);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 981)
    public static Class method192(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
