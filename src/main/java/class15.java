import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 implements class8 {

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Z")
    private boolean field249 = true;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lh;")
    public static class15 field246 = class26.method190(true, "Candle Shop");

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Le;")
    public static class9 field251 = new class9();

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "Lb;")
    public static class3 field257 = null;

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "Lh;")
    public static class15 field256 = class26.method190(true, "Skirt Shop");

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "Lh;")
    public static class15 field258 = class26.method190(true, "Next page");

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lh;")
    public static class15 field252 = class26.method190(true, "100(U");

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "I")
    public static int field254;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!h", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field259;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "[B")
    public byte[] field247;

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "[I")
    public static int[] field255;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BII)Lh;", line = 19)
    public final class15 method112(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        class15 var5 = new class15();
        var5.field250 = this.field250;
        byte var6 = (byte) arg2;
        if (arg0 <= 1) {
            field255 = null;
        }
        var5.field247 = new byte[this.field250];
        for (int var7 = 0; var7 < this.field250; var7++) {
            byte var8 = this.field247[var7];
            if (var6 == var8) {
                var5.field247[var7] = var4;
            } else {
                var5.field247[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(II)I", line = 55)
    public final int method113(int arg0, int arg1) {
        if (arg0 < 7) {
            this.toString();
        }
        return this.field247[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(III)I", line = 83)
    private final int method114(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        int var5 = 94 % ((-arg2 - 52) / 45);
        for (int var6 = arg0; var6 < this.field250; var6++) {
            if (this.field247[var6] == var4) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)Lh;", line = 107)
    public final class15 method115(byte arg0) {
        class15 var2 = new class15();
        var2.field250 = this.field250;
        var2.field247 = new byte[this.field250];
        for (int var3 = 0; var3 < this.field250; var3++) {
            byte var4 = this.field247[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field247[var3] = var4;
        }
        if (arg0 != 73) {
            field254 = 123;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)J", line = 135)
    private final long method116(byte arg0) {
        long var2 = 0L;
        int var4 = 0;
        if (arg0 < 7) {
            field256 = null;
        }
        while (this.field250 > var4) {
            var2 = (var2 << 5) + (long) (this.field247[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Lh;Z)Z", line = 160)
    public final boolean method117(class15 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field250 == arg0.field250) {
            if (!this.field249 || !arg0.field249) {
                if (this.field248 == 0) {
                    this.field248 = this.method124(-4);
                    if (this.field248 == 0) {
                        this.field248 = 1;
                    }
                }
                if (arg0.field248 == 0) {
                    arg0.field248 = arg0.method124(-45);
                    if (arg0.field248 == 0) {
                        arg0.field248 = 1;
                    }
                }
                if (this.field248 != arg0.field248) {
                    return false;
                }
            }
            if (!arg1) {
                return false;
            }
            for (int var3 = 0; var3 < this.field250; var3++) {
                if (this.field247[var3] != arg0.field247[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IB)Lh;", line = 222)
    public final class15 method118(int arg0, byte arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field249) {
            this.field248 = 0;
            if (this.field247.length == this.field250) {
                int var3;
                for (var3 = 1; var3 <= this.field250; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class34.method234(this.field247, 0, var4, 0, this.field250);
                this.field247 = var4;
            }
            this.field247[this.field250++] = (byte) arg0;
            return arg1 < 22 ? (class15) null : this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(III)Lh;", line = 267)
    public final class15 method119(int arg0, int arg1, int arg2) {
        int var4 = -19 / ((arg2 - 48) / 36);
        class15 var5 = new class15();
        var5.field247 = new byte[arg1 - arg0];
        var5.field250 = arg1 - arg0;
        class34.method234(this.field247, arg0, var5.field247, 0, var5.field250);
        return var5;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILh;)I", line = 281)
    public final int method120(int arg0, class15 arg1) {
        int var3;
        if (this.field250 > arg1.field250) {
            var3 = arg1.field250;
        } else {
            var3 = this.field250;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1.field247[var4] > this.field247[var4]) {
                return -1;
            }
            if (arg1.field247[var4] < this.field247[var4]) {
                return 1;
            }
        }
        if (arg0 != 30729) {
            this.method126(null, false);
        }
        if (arg1.field250 > this.field250) {
            return -1;
        } else if (arg1.field250 >= this.field250) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "toString", descriptor = "()Ljava/lang/String;", line = 319)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B[B)V", line = 331)
    public static final void method121(byte arg0, byte[] arg1) {
        class18 var2 = new class18(arg1);
        var2.field286 = arg1.length - 2;
        class3.field106 = var2.method157(-1);
        class25.field343 = new int[class3.field106];
        class29.field399 = new int[class3.field106];
        class6.field130 = new byte[class3.field106][];
        class2.field87 = new int[class3.field106];
        class16.field261 = new int[class3.field106];
        if (arg0 != 91) {
            return;
        }
        var2.field286 = arg1.length - class3.field106 * 8 - 7;
        class14.field234 = var2.method157(arg0 - 92);
        class21.field309 = var2.method157(-1);
        int var3 = (var2.method148((byte) 92) & 0xFF) + 1;
        for (int var4 = 0; var4 < class3.field106; var4++) {
            class25.field343[var4] = var2.method157(-1);
        }
        for (int var5 = 0; var5 < class3.field106; var5++) {
            class2.field87[var5] = var2.method157(-1);
        }
        for (int var6 = 0; var6 < class3.field106; var6++) {
            class16.field261[var6] = var2.method157(-1);
        }
        for (int var7 = 0; var7 < class3.field106; var7++) {
            class29.field399[var7] = var2.method157(-1);
        }
        var2.field286 = arg1.length - class3.field106 * 8 - (var3 - 1) * 3 - 7;
        class16.field269 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class16.field269[var8] = var2.method153(-15076);
            if (class16.field269[var8] == 0) {
                class16.field269[var8] = 1;
            }
        }
        var2.field286 = 0;
        for (int var9 = 0; var9 < class3.field106; var9++) {
            int var10 = class16.field261[var9];
            int var11 = class29.field399[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class6.field130[var9] = var13;
            int var14 = var2.method148((byte) 84);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method150(-128);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method150(-128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(II)V", line = 450)
    public final void method122(int arg0, int arg1) {
        this.field248 = 0;
        if (!this.field249) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field247.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class34.method234(this.field247, 0, var4, 0, this.field250);
                this.field247 = var4;
            }
            if (arg1 != 27311) {
                field253 = 118;
            }
            for (int var5 = this.field250; var5 < arg0; var5++) {
                this.field247[var5] = 32;
            }
            this.field250 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(II)Lh;", line = 499)
    public static final class15 method123(int arg0, int arg1) {
        if (arg0 != 13073) {
            method121((byte) -75, null);
        }
        class15 var2 = new class15();
        var2.field250 = 0;
        var2.field247 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)I", line = 522)
    public final int method124(int arg0) {
        int var2 = 0;
        int var3 = 0;
        if (arg0 >= -2) {
            this.method117(null, true);
        }
        while (this.field250 > var3) {
            var2 = (var2 << 5) + ((this.field247[var3] & 0xFF) - var2);
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZI)I", line = 550)
    private final int method125(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = arg0;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field250; var6++) {
            int var7 = this.field247[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
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
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var5 = true;
            var4 = var8;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!h", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 635)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/applet/Applet;Z)Lh;", line = 657)
    public final class15 method126(Applet arg0, boolean arg1) {
        String var3 = new String(this.field247, 0, this.field250);
        String var4 = arg0.getParameter(var3);
        if (!arg1) {
            this.method132(63, 122);
        }
        return var4 == null ? null : class28.method204(0, var4);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 688)
    public final int method127(int arg0, FontMetrics arg1) {
        int var3 = -120 / ((-arg0 - 48) / 43);
        String var4;
        try {
            var4 = new String(this.field247, 0, this.field250, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var4 = new String(this.field247, 0, this.field250);
        }
        return arg1.stringWidth(var4);
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)V", line = 711)
    public static void method128(int arg0) {
        if (arg0 != 0) {
            field252 = null;
        }
        field246 = null;
        field256 = null;
        field258 = null;
        field251 = null;
        field252 = null;
        field255 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "hashCode", descriptor = "()I", line = 736)
    public final int hashCode() {
        return this.method124(-34);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)I", line = 747)
    public final int method129(boolean arg0) {
        if (!arg0) {
            field253 = -15;
        }
        return this.field250;
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(I)Lh;", line = 760)
    public final class15 method130(int arg0) {
        if (!this.field249) {
            throw new IllegalArgumentException();
        }
        this.field248 = arg0;
        if (this.field247.length != this.field250) {
            byte[] var2 = new byte[this.field250];
            class34.method234(this.field247, 0, var2, 0, this.field250);
            this.field247 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 787)
    public final void method131(int arg0, Graphics arg1, int arg2, int arg3) {
        String var5;
        try {
            if (arg2 != 32342) {
                return;
            }
            var5 = new String(this.field247, 0, this.field250, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field247, 0, this.field250);
        }
        arg1.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(II)I", line = 806)
    public final int method132(int arg0, int arg1) {
        if (arg1 != 0) {
            method123(65, 48);
        }
        return this.method114(0, arg0, 17);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(BI)Lh;", line = 816)
    public final class15 method133(byte arg0, int arg1) {
        return arg0 <= 69 ? (class15) null : this.method119(arg1, this.field250, 101);
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(I)I", line = 859)
    public final int method134(int arg0) {
        if (arg0 != 255) {
            this.method125(false, -76);
        }
        return this.method125(false, 10);
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(B)Lh;", line = 877)
    public final class15 method135(byte arg0) {
        long var2 = this.method116((byte) 43);
        if (arg0 >= -99) {
            field254 = 124;
        }
        synchronized (field259 == null ? (field259 = method136("h")) : field259) {
            if (class22.field312 == null) {
                class22.field312 = new class25(4096);
            } else {
                for (class14 var5 = (class14) class22.field312.method189(2, var2); var5 != null; var5 = (class14) class22.field312.method185((byte) -50)) {
                    if (this.method117(var5.field235, true)) {
                        return var5.field235;
                    }
                }
            }
            class14 var6 = new class14();
            this.field249 = false;
            var6.field235 = this;
            class22.field312.method186(var6, 8, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 881)
    public static Class method136(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
