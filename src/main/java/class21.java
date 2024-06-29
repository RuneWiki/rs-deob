import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class21 implements class33 {

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Z")
    private boolean field209 = true;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ll;")
    public static class21 field196 = class28.method185(-20839, "POH Portal");

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Lha;")
    public static class14 field201 = null;

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "Ll;")
    public static class21 field206 = class28.method185(-20839, "Jewellery");

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "[[B")
    public static byte[][] field205 = new byte[250][];

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Z")
    public static boolean field199 = false;

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "Ll;")
    public static class21 field208 = class28.method185(-20839, "???");

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Ll;")
    public static class21 field200 = class28.method185(-20839, "Scimitar Shop");

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "Ll;")
    public static class21 field210 = class28.method185(-20839, "Clothes Shop");

    @OriginalMember(owner = "mapview!l", name = "q", descriptor = "Ll;")
    public static class21 field212 = class28.method185(-20839, "Next page");

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "Lu;")
    public static class32 field211;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!l", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field213;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "[B")
    public byte[] field197;

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "[Lja;")
    public static class18[] field207;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)Ll;", line = 8)
    public final class21 method97(int arg0, int arg1) {
        if (arg0 != -1989) {
            field199 = true;
        }
        return this.method112(-38, arg1, this.field204);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)I", line = 18)
    public final int method98(int arg0) {
        if (arg0 != -798259035) {
            this.equals(null);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field204; var3++) {
            var2 = (var2 << 5) + (this.field197[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)V", line = 45)
    public static void method99(int arg0) {
        field211 = null;
        field210 = null;
        field196 = null;
        field212 = null;
        if (arg0 != -49) {
            field199 = false;
        }
        field205 = null;
        field207 = null;
        field208 = null;
        field200 = null;
        field206 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(I)V", line = 96)
    public final void method100(int arg0) {
        String var2;
        try {
            var2 = new String(this.field197, 0, this.field204, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field197, 0, this.field204);
        }
        if (arg0 != 97) {
            this.method113(11, null, true, -11);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ll;B)Z", line = 114)
    public final boolean method101(class21 arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field204 == arg0.field204) {
            int var3 = 70 % ((-arg1 - 34) / 61);
            if (!this.field209 || !arg0.field209) {
                if (this.field198 == 0) {
                    this.field198 = this.method98(-798259035);
                    if (this.field198 == 0) {
                        this.field198 = 1;
                    }
                }
                if (arg0.field198 == 0) {
                    arg0.field198 = arg0.method98(-798259035);
                    if (arg0.field198 == 0) {
                        arg0.field198 = 1;
                    }
                }
                if (this.field198 != arg0.field198) {
                    return false;
                }
            }
            for (int var4 = 0; var4 < this.field204; var4++) {
                if (this.field197[var4] != arg0.field197[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(I)I", line = 168)
    public final int method102(int arg0) {
        if (arg0 != -62) {
            field212 = null;
        }
        return this.field204;
    }

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "(I)Ll;", line = 213)
    public final class21 method103(int arg0) {
        long var2 = this.method115(22184);
        synchronized (field213 == null ? (field213 = method117("l")) : field213) {
            int var5 = 19 / ((arg0 + 38) / 56);
            if (class4.field37 == null) {
                class4.field37 = new class29(4096);
            } else {
                for (class4 var6 = (class4) class4.field37.method187((byte) -61, var2); var6 != null; var6 = (class4) class4.field37.method186((byte) -123)) {
                    if (this.method101(var6.field31, (byte) 103)) {
                        return var6.field31;
                    }
                }
            }
            class4 var7 = new class4();
            this.field209 = false;
            var7.field31 = this;
            class4.field37.method189(-114, var2, var7);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
    public static Class method117(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!l", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 256)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "(I)Ll;", line = 266)
    public final class21 method104(int arg0) {
        class21 var2 = new class21();
        if (arg0 != 48) {
            return (class21) null;
        }
        var2.field204 = this.field204;
        var2.field197 = new byte[this.field204];
        for (int var3 = 0; var3 < this.field204; var3++) {
            byte var4 = this.field197[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field197[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)Ll;", line = 304)
    public final class21 method105(byte arg0) {
        if (!this.field209) {
            throw new IllegalArgumentException();
        }
        this.field198 = 0;
        if (this.field197.length != this.field204) {
            byte[] var2 = new byte[this.field204];
            class15.method58(this.field197, 0, var2, 0, this.field204);
            this.field197 = var2;
        }
        return arg0 == 111 ? this : (class21) null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BI)I", line = 337)
    private final int method106(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 75 / ((arg0 - 8) / 49);
        for (int var7 = 0; var7 < this.field204; var7++) {
            int var8 = this.field197[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var8 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var4 + var8;
            if (var9 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var4 = var9;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(II)I", line = 425)
    public final int method107(int arg0, int arg1) {
        if (arg1 != 5878) {
            field201 = null;
        }
        return this.field197[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!l", name = "toString", descriptor = "()Ljava/lang/String;", line = 437)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(III)I", line = 452)
    private final int method108(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        if (arg1 != -1) {
            field207 = null;
        }
        for (int var5 = arg2; var5 < this.field204; var5++) {
            if (this.field197[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!l", name = "hashCode", descriptor = "()I", line = 479)
    public final int hashCode() {
        return this.method98(-798259035);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IB)I", line = 487)
    public final int method109(int arg0, byte arg1) {
        if (arg1 != 102) {
            field199 = false;
        }
        return this.method108(arg0, -1, 0);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 499)
    public final int method110(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field197, 0, this.field204, "ISO-8859-1");
            if (arg0 > -48) {
                field210 = null;
            }
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field197, 0, this.field204);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([BI)V", line = 517)
    public static final void method111(byte[] arg0, int arg1) {
        class16 var2 = new class16(arg0);
        var2.field145 = arg0.length - 2;
        field203 = var2.method65((byte) -39);
        class18.field161 = new int[field203];
        class29.field344 = new int[field203];
        class30.field355 = new int[field203];
        class2.field12 = new int[field203];
        class31.field359 = new byte[field203][];
        var2.field145 = arg0.length - field203 * 8 - 7;
        class6.field48 = var2.method65((byte) -39);
        class30.field357 = var2.method65((byte) -39);
        int var3 = (var2.method64(0) & 0xFF) + 1;
        for (int var4 = 0; var4 < field203; var4++) {
            class30.field355[var4] = var2.method65((byte) -39);
        }
        if (arg1 != 31649) {
            method99(-116);
        }
        for (int var5 = 0; var5 < field203; var5++) {
            class29.field344[var5] = var2.method65((byte) -39);
        }
        for (int var6 = 0; var6 < field203; var6++) {
            class2.field12[var6] = var2.method65((byte) -39);
        }
        for (int var7 = 0; var7 < field203; var7++) {
            class18.field161[var7] = var2.method65((byte) -39);
        }
        var2.field145 = arg0.length - (var3 - 1) * 3 - field203 * 8 - 7;
        class34.field389 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class34.field389[var8] = var2.method68(-21060);
            if (class34.field389[var8] == 0) {
                class34.field389[var8] = 1;
            }
        }
        var2.field145 = 0;
        for (int var9 = 0; var9 < field203; var9++) {
            int var10 = class2.field12[var9];
            int var11 = class18.field161[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class31.field359[var9] = var13;
            int var14 = var2.method64(arg1 - 31649);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method66((byte) -114);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method66((byte) -118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(III)Ll;", line = 635)
    public final class21 method112(int arg0, int arg1, int arg2) {
        class21 var4 = new class21();
        var4.field204 = arg2 - arg1;
        var4.field197 = new byte[arg2 - arg1];
        if (arg0 > -15) {
            return (class21) null;
        } else {
            class15.method58(this.field197, arg1, var4.field197, 0, var4.field204);
            return var4;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V", line = 666)
    public final void method113(int arg0, Graphics arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field197, 0, this.field204, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field197, 0, this.field204);
        }
        arg1.drawString(var5, arg0, arg3);
    }

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "(I)I", line = 692)
    public final int method114(int arg0) {
        if (arg0 != 10) {
            field205 = null;
        }
        return this.method106((byte) -45, 10);
    }

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "(I)J", line = 717)
    private final long method115(int arg0) {
        long var2 = 0L;
        if (arg0 != 22184) {
            this.field198 = -61;
        }
        for (int var4 = 0; var4 < this.field204; var4++) {
            var2 = (var2 << 5) + (long) (this.field197[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BLjava/applet/Applet;)Ll;", line = 763)
    public final class21 method116(byte arg0, Applet arg1) {
        String var3 = new String(this.field197, 0, this.field204);
        int var4 = 30 % ((24 - arg0) / 33);
        String var5 = arg1.getParameter(var3);
        return var5 == null ? null : class14.method49(-103, var5);
    }
}
