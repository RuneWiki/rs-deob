import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 implements class233 {

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Z")
    private boolean field65 = true;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "F")
    public static float field51;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "[B")
    public byte[] field57;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[Lla;")
    public static class178[] field36;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I", line = 13)
    public final int method27(int arg0, int arg1) {
        field49++;
        byte var3 = (byte) arg1;
        int var4 = arg0;
        for (int var5 = 0; var5 < this.field72; var5++) {
            if (this.field57[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 37)
    public final void method28(int arg0) {
        String var2;
        try {
            var2 = new String(this.field57, 0, this.field72, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field57, 0, this.field72);
        }
        if (arg0 != 33) {
            field50 = 105;
        }
        System.out.println(var2);
        field85++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILma;)Z", line = 54)
    public final boolean method29(int arg0, class5 arg1) {
        field75++;
        if (arg1 == null) {
            return false;
        } else if (this.field72 == arg1.field72) {
            if (arg0 != 61) {
                field58 = -99;
            }
            for (int var3 = 0; var3 < this.field72; var3++) {
                byte var4 = this.field57[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field57[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lma;", line = 95)
    public final class5 method30(int arg0) {
        class5 var2 = new class5();
        boolean var3 = true;
        field90++;
        var2.field72 = this.field72;
        var2.field57 = new byte[this.field72];
        for (int var4 = 0; var4 < this.field72; var4++) {
            byte var5 = this.field57[var4];
            if (var5 == 95) {
                var2.field57[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field57[var4] = (byte) (var5 - 32);
            } else {
                var2.field57[var4] = var5;
                var3 = false;
            }
        }
        if (arg0 >= -65) {
            this.method59(61);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;", line = 144)
    public final Object method31(Applet arg0, int arg1) throws Throwable {
        field38++;
        String var3 = new String(this.field57, arg1, this.field72);
        Object var4 = class199.method1310(var3, (byte) -23, (Object[]) null, arg0);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class101.method645(var5, true, 0, var5.length);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lma;BI)I", line = 165)
    public final int method32(class5 arg0, byte arg1, int arg2) {
        int[] var4 = new int[256];
        int[] var5 = new int[arg0.field72];
        int[] var6 = new int[arg0.field72];
        field80++;
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg0.field72;
        }
        for (int var8 = 1; var8 <= arg0.field72; var8++) {
            var5[var8 - 1] = (arg0.field72 << 1) - var8;
            var4[class204.method1354(arg0.field57[var8 - 1], 255)] = arg0.field72 - var8;
        }
        int var9 = arg0.field72 + 1;
        if (arg1 != -127) {
            field58 = 18;
        }
        for (int var10 = arg0.field72; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg0.field72 && arg0.field57[var9 - 1] != arg0.field57[var10 - 1]) {
                if (arg0.field72 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg0.field72 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = arg0.field72 + 1 - var9;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var13) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field57[var14 - 1] != arg0.field57[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg0.field72 > var12) {
            for (int var16 = var11; var16 <= var12; var16++) {
                if ((arg0.field72 + var12 - var16) <= var5[var16 - 1]) {
                    var5[var16 - 1] = arg0.field72 + var12 - var16;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg2 + arg0.field72 - 1; var17 < this.field72; var17 += Math.max(var4[this.field57[var17] & 0xFF], var5[var18])) {
            for (var18 = arg0.field72 - 1; var18 >= 0 && this.field57[var17] == arg0.field57[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V", line = 273)
    public final void method33(int arg0, Graphics arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field60++;
        String var5;
        try {
            var5 = new String(this.field57, 0, this.field72, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field57, 0, this.field72);
        }
        arg1.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 294)
    public static void method34(byte arg0) {
        field36 = null;
        if (arg0 != -99) {
            field36 = (class178[]) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Lma;", line = 315)
    public final class5 method35(int arg0, int arg1) {
        if (arg1 < 24) {
            return (class5) null;
        }
        field95++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field65) {
            this.field77 = 0;
            if (this.field57.length == this.field72) {
                int var3;
                for (var3 = 1; var3 <= this.field72; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class42.method296(this.field57, 0, var4, 0, this.field72);
                this.field57 = var4;
            }
            this.field57[this.field72++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I", line = 358)
    public final int method36(int arg0) {
        field70++;
        if (arg0 != 30673) {
            field58 = -6;
        }
        return this.field72;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lma;", line = 380)
    public final class5 method37(int arg0) {
        class5 var2 = new class5();
        field96++;
        var2.field72 = this.field72;
        var2.field57 = new byte[this.field72];
        for (int var3 = 0; var3 < this.field72; var3++) {
            byte var4 = this.field57[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field57[var3] = var4;
        }
        if (arg0 > -40) {
            field50 = -45;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)I", line = 412)
    public final int method38(byte arg0) {
        field78++;
        int var2 = 0;
        int var3 = -58 / ((-arg0 - 60) / 40);
        for (int var4 = 0; var4 < this.field72; var4++) {
            var2 = (var2 << 5) + (this.field57[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lma;I)Z", line = 446)
    public final boolean method39(class5 arg0, int arg1) {
        field40++;
        if (this.field72 < arg0.field72) {
            return false;
        }
        int var3 = this.field72 - arg0.field72;
        for (int var4 = arg1; var4 < arg0.field72; var4++) {
            if (this.field57[var3 + var4] != arg0.field57[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)Lma;", line = 469)
    public final class5 method40(byte arg0) {
        field79++;
        int var2;
        for (var2 = 0; var2 < this.field72 && (this.field57[var2] >= 0 && this.field57[var2] <= 32 || (this.field57[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field72; var2 < var3 && (this.field57[var3 - 1] >= 0 && this.field57[var3 - 1] <= 32 || (this.field57[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field72 == var3) {
            return this;
        }
        if (arg0 >= -112) {
            field51 = -0.2627702F;
        }
        class5 var4 = new class5();
        var4.field72 = var3 - var2;
        var4.field57 = new byte[var4.field72];
        for (int var5 = 0; var5 < var4.field72; var5++) {
            var4.field57[var5] = this.field57[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "hashCode", descriptor = "()I", line = 514)
    public final int hashCode() {
        field71++;
        return this.method38((byte) 93);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I", line = 522)
    public final int method41(int arg0, int arg1, int arg2) {
        field97++;
        if (arg0 != 32494) {
            return -91;
        }
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field72; var5++) {
            if (this.field57[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;", line = 551)
    public final URL method42(URL arg0, byte arg1) throws MalformedURLException {
        if (arg1 != 126) {
            this.method36(26);
        }
        field67++;
        return new URL(arg0, new String(this.field57, 0, this.field72));
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII[BI)I", line = 577)
    public final int method43(byte arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field87++;
        if (arg0 != -45) {
            this.method40((byte) -100);
        }
        class42.method296(this.field57, arg4, arg3, arg1, arg2 - arg4);
        return arg2 - arg4;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)[B", line = 594)
    public final byte[] method44(int arg0) {
        field63++;
        if (this.field72 == 0) {
            return new byte[0];
        }
        int var2 = this.field72 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (arg0 != 13661) {
            return (byte[]) null;
        }
        if (var2 - 2 >= this.field72 || class282.method1914(-29861, this.field57[var2 - 2]) == -1) {
            var3 -= 2;
        } else if (var2 - 1 >= this.field72 || class282.method1914(-29861, this.field57[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method74(0, var4, (byte) -118);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)Lma;", line = 626)
    public final class5 method45(int arg0) {
        field56++;
        if (!this.field65) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -11069) {
            field36 = (class178[]) null;
        }
        this.field77 = 0;
        if (this.field57.length != this.field72) {
            byte[] var2 = new byte[this.field72];
            class42.method296(this.field57, 0, var2, 0, this.field72);
            this.field57 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/applet/Applet;B)Lma;", line = 657)
    public final class5 method46(Applet arg0, byte arg1) {
        String var3 = new String(this.field57, 0, this.field72);
        field37++;
        String var4 = arg0.getParameter(var3);
        if (var4 == null) {
            return null;
        } else {
            int var5 = 41 / ((arg1 + 16) / 33);
            return class212.method1405(var4, 0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V", line = 673)
    public final void method47(int arg0, int arg1) {
        field66++;
        this.field77 = 0;
        if (!this.field65) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field57.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class42.method296(this.field57, 0, var4, 0, this.field72);
                this.field57 = var4;
            }
            int var5 = this.field72;
            if (arg1 != -5436) {
                this.field65 = true;
            }
            while (var5 < arg0) {
                this.field57[var5] = 32;
                var5++;
            }
            this.field72 = arg0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(ILma;)I", line = 727)
    public final int method48(int arg0, class5 arg1) {
        field42++;
        int var3;
        if (arg1.field72 < this.field72) {
            var3 = arg1.field72;
        } else {
            var3 = this.field72;
        }
        if (arg0 != 255) {
            field36 = (class178[]) null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field57[var4] & 0xFF) < (arg1.field57[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field57[var4] & 0xFF) < (this.field57[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field72 > this.field72) {
            return -1;
        } else if (this.field72 <= arg1.field72) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lma;Lma;Z)Lma;", line = 768)
    public final class5 method49(class5 arg0, class5 arg1, boolean arg2) {
        field61++;
        int var4 = this.field72;
        if (!arg2) {
            this.method71((byte) 27, -77, -30);
        }
        int var5 = arg1.field72 - arg0.field72;
        int var6 = 0;
        while (true) {
            int var7 = this.method32(arg0, (byte) -127, var6);
            if (var7 < 0) {
                int var8 = 0;
                class5 var9 = class230.method1637(-9, var4);
                while (true) {
                    int var10 = this.method32(arg0, (byte) -127, var8);
                    if (var10 < 0) {
                        while (var8 < this.field72) {
                            var9.method35(this.field57[var8++] & 0xFF, 45);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method35(this.field57[var8++] & 0xFF, 74);
                    }
                    var9.method64(11469, arg1);
                    var8 += arg0.field72;
                }
            }
            var4 += var5;
            var6 = arg0.field72 + var7;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)I", line = 826)
    public final int method50(int arg0, int arg1) {
        field54++;
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 0;
        boolean var5 = false;
        if (arg0 < 99) {
            this.field65 = false;
        }
        for (int var6 = 0; var6 < this.field72; var6++) {
            int var7 = this.field57[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if ((var8 / arg1) != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(ILma;)Z", line = 901)
    public final boolean method51(int arg0, class5 arg1) {
        field46++;
        if (arg0 != 32) {
            return true;
        } else if (arg1.field72 > this.field72) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field72; var3++) {
                byte var4 = arg1.field57[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field57[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V", line = 939)
    public static final void method52(byte arg0) {
        field64++;
        int var1 = class201.field3197.method2013(class111.field1651);
        if (arg0 != -105) {
            field36 = (class178[]) null;
        }
        for (int var2 = 0; var2 < class282.field4794; var2++) {
            int var3 = class201.field3197.method2013(class104.method663(0, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class51.field808;
        int var5 = class176.field2683 - (var1 / 2);
        if (class255.field4362 < var1 + var5) {
            var5 = class255.field4362 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class282.field4794 * 15 + 21;
        if (var4 + var6 > class156.field2314) {
            var4 = class156.field2314 - var6;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class179.field2721 == 1) {
            if (class200.field3179 == class176.field2683 && class51.field808 == class151.field2198) {
                class209.field3323 = var1;
                class261.field4462 = var4;
                class251.field4162 = true;
                class179.field2721 = 0;
                class18.field307 = var5;
                class86.field1305 = class282.field4794 * 15 + 22;
            }
        } else if (class176.field2683 == class104.field1545 && class51.field808 == class289.field4915) {
            class18.field307 = var5;
            class86.field1305 = class282.field4794 * 15 + 22;
            class251.field4162 = true;
            class261.field4462 = var4;
            class209.field3323 = var1;
            class179.field2721 = 0;
        } else {
            class179.field2721 = 1;
            class200.field3179 = class104.field1545;
            class151.field2198 = class289.field4915;
        }
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)Ljava/net/URL;", line = 1031)
    public final URL method53(int arg0) throws MalformedURLException {
        if (arg0 != 0) {
            this.method37(100);
        }
        field91++;
        return new URL(new String(this.field57, 0, this.field72));
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(B)I", line = 1046)
    public final int method54(byte arg0) {
        field88++;
        return arg0 == -83 ? this.method50(117, 10) : -15;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(II)[Lma;", line = 1059)
    public final class5[] method55(int arg0, int arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < this.field72; var4++) {
            if (this.field57[var4] == arg1) {
                var3++;
            }
        }
        field81++;
        class5[] var5 = new class5[var3 + 1];
        if (arg0 == var3) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field57[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method76(class259.method1798(arg0, 0), var7, var7 + var9);
            var7 += var9 + 1;
        }
        var5[var3] = this.method76(arg0, var7, this.field72);
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)Lma;", line = 1112)
    public final class5 method56(int arg0) {
        field86++;
        class5 var2 = class245.method1719(this.method69(-49), (byte) -45);
        if (arg0 != 0) {
            this.field72 = -105;
        }
        return var2 == null ? class196.field3061 : var2;
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)Z", line = 1129)
    public final boolean method57(int arg0) {
        if (arg0 >= -84) {
            return true;
        } else {
            field89++;
            return this.method72((byte) 78, 10);
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(II)I", line = 1141)
    public final int method58(int arg0, int arg1) {
        field48++;
        return arg0 == 0 ? this.method41(arg0 ^ 0x7EEE, arg1, 0) : -109;
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)Lma;", line = 1153)
    public final class5 method59(int arg0) {
        field93++;
        byte var2 = 2;
        class5 var3 = new class5();
        var3.field72 = this.field72;
        var3.field57 = new byte[this.field72];
        if (arg0 != 15624) {
            return (class5) null;
        }
        for (int var4 = 0; var4 < this.field72; var4++) {
            byte var5 = this.field57[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field57[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "(I)J", line = 1218)
    public final long method60(int arg0) {
        if (arg0 != -1) {
            this.method73(64, (class5) null);
        }
        long var2 = 0L;
        field43++;
        for (int var4 = 0; var4 < this.field72; var4++) {
            var2 = (var2 << 5) + (long) (this.field57[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 1237)
    public final int method61(byte arg0, FontMetrics arg1) {
        field69++;
        if (arg0 != -85) {
            this.method51(114, (class5) null);
        }
        String var3;
        try {
            var3 = new String(this.field57, 0, this.field72, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field57, 0, this.field72);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lma;I)Z", line = 1257)
    public final boolean method62(class5 arg0, int arg1) {
        field45++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -23269) {
            this.method73(117, (class5) null);
        }
        if (this.field72 != arg0.field72) {
            return false;
        }
        if (!this.field65 || !arg0.field65) {
            if (this.field77 == 0) {
                this.field77 = this.method38((byte) -113);
                if (this.field77 == 0) {
                    this.field77 = 1;
                }
            }
            if (arg0.field77 == 0) {
                arg0.field77 = arg0.method38((byte) -121);
                if (arg0.field77 == 0) {
                    arg0.field77 = 1;
                }
            }
            if (this.field77 != arg0.field77) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field72; var3++) {
            if (this.field57[var3] != arg0.field57[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/applet/Applet;)V", line = 1316)
    public final void method63(byte arg0, Applet arg1) throws Throwable {
        field55++;
        if (arg0 == -2) {
            String var3 = new String(this.field57, 0, this.field72);
            class199.method1309(var3, 12345, arg1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1333)
    public final boolean equals(Object arg0) {
        field84++;
        if (!(arg0 instanceof class5)) {
            throw new IllegalArgumentException();
        }
        return this.method62((class5) arg0, -23269);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(ILma;)Lma;", line = 1347)
    public final class5 method64(int arg0, class5 arg1) {
        field92++;
        if (!this.field65) {
            throw new IllegalArgumentException();
        }
        this.field77 = 0;
        if (this.field57.length < this.field72 + arg1.field72) {
            int var3;
            for (var3 = 1; var3 < (this.field72 + arg1.field72); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class42.method296(this.field57, 0, var4, 0, this.field72);
            this.field57 = var4;
        }
        class42.method296(arg1.field57, 0, this.field57, this.field72, arg1.field72);
        if (arg0 == 11469) {
            this.field72 += arg1.field72;
            return this;
        } else {
            return (class5) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)I", line = 1381)
    public final int method65(byte arg0, int arg1) {
        field52++;
        return arg0 <= 61 ? 23 : this.field57[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(B)Lma;", line = 1394)
    public final class5 method66(byte arg0) {
        long var2 = this.method60(-1);
        int var4 = -62 / ((arg0 + 13) / 51);
        field47++;
        synchronized (ma.class) {
            if (class156.field2325 == null) {
                class156.field2325 = new class209(4096);
            } else {
                for (class127 var6 = (class127) class156.field2325.method1372(false, var2); var6 != null; var6 = (class127) class156.field2325.method1373(-1)) {
                    if (this.method62(var6.field1901, -23269)) {
                        return var6.field1901;
                    }
                }
            }
            class127 var7 = new class127();
            var7.field1901 = this;
            this.field65 = false;
            class156.field2325.method1376(var2, -1, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(I)[B", line = 1435)
    public final byte[] method67(int arg0) {
        byte[] var2 = new byte[this.field72];
        if (arg0 <= 79) {
            this.field72 = 98;
        }
        class42.method296(this.field57, 0, var2, 0, this.field72);
        field39++;
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "toString", descriptor = "()Ljava/lang/String;", line = 1449)
    public final String toString() {
        field59++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V", line = 1460)
    public static final void method68(int arg0) {
        field44++;
        if (class236.field3896 == 5) {
            class236.field3896 = 6;
            if (arg0 != 24782) {
                method52((byte) 61);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "(I)J", line = 1475)
    public final long method69(int arg0) {
        field53++;
        long var2 = 0L;
        if (arg0 != -49) {
            this.method49((class5) null, (class5) null, true);
        }
        for (int var4 = 0; this.field72 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field57[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(ILma;)I", line = 1524)
    public final int method70(int arg0, class5 arg1) {
        field41++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field72;
        if (arg0 != 31) {
            this.field77 = 109;
        }
        int var6 = this.field72;
        int var7 = arg1.field72;
        int var8 = arg1.field72;
        int var9 = 0;
        int var10 = 0;
        while (var5 != 0 && var7 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field57[var9] & 0xFF;
                var9++;
            }
            if (class157.method1006((byte) 107, var4)) {
                var6++;
            } else {
                var5--;
            }
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = arg1.field57[var10] & 0xFF;
                var10++;
            }
            if (class157.method1006((byte) 76, var3)) {
                var8++;
            } else {
                var7--;
            }
            if (class19.field330[var4] < class19.field330[var3]) {
                return -1;
            }
            if (class19.field330[var3] < class19.field330[var4]) {
                return 1;
            }
        }
        if (var6 >= var8) {
            return var6 <= var8 ? 0 : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)Lma;", line = 1621)
    public final class5 method71(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        field82++;
        byte var5 = (byte) arg1;
        class5 var6 = new class5();
        int var7 = -125 % ((-arg0 - 22) / 55);
        var6.field72 = this.field72;
        var6.field57 = new byte[this.field72];
        for (int var8 = 0; var8 < this.field72; var8++) {
            byte var9 = this.field57[var8];
            if (var4 == var9) {
                var6.field57[var8] = var5;
            } else {
                var6.field57[var8] = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)Z", line = 1654)
    private final boolean method72(byte arg0, int arg1) {
        field83++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != 78) {
            this.field77 = 20;
        }
        for (int var6 = 0; var6 < this.field72; var6++) {
            int var7 = this.field57[var6] & 0xFF;
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
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(ILma;)I", line = 1737)
    public final int method73(int arg0, class5 arg1) {
        field74++;
        return arg0 == -5069 ? this.method32(arg1, (byte) -127, 0) : 68;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[BB)I", line = 1751)
    private final int method74(int arg0, byte[] arg1, byte arg2) {
        int var4 = arg0;
        field62++;
        if (arg2 >= -99) {
            return -70;
        }
        for (int var5 = 0; var5 < this.field72; var5 += 4) {
            int var6 = class282.method1914(-29861, this.field57[var5]);
            int var7 = var5 + 1 < this.field72 ? class282.method1914(-29861, this.field57[var5 + 1]) : -1;
            int var8 = this.field72 <= (var5 + 2) ? -1 : class282.method1914(-29861, this.field57[var5 + 2]);
            int var9 = this.field72 > (var5 + 3) ? class282.method1914(-29861, this.field57[var5 + 3]) : -1;
            arg1[arg0++] = (byte) class264.method1820(var7 >>> 4, var6 << 2);
            if (var8 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class264.method1820(class204.method1354(15, var7) << 4, var8 >>> 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class264.method1820(var9, class204.method1354(3, var8) << 6);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLma;)Z", line = 1791)
    public final boolean method75(byte arg0, class5 arg1) {
        field98++;
        if (this.field72 < arg1.field72) {
            return false;
        } else if (arg0 < 6) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field72; var3++) {
                if (this.field57[var3] != arg1.field57[var3]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)Lma;", line = 1817)
    public final class5 method76(int arg0, int arg1, int arg2) {
        field68++;
        class5 var4 = new class5();
        var4.field57 = new byte[arg2 - arg1];
        var4.field72 = arg2 - arg1;
        class42.method296(this.field57, arg1, var4.field57, arg0, var4.field72);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(II)Lma;", line = 1831)
    public final class5 method77(int arg0, int arg1) {
        int var3 = -63 / ((-arg0 - 59) / 34);
        field94++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class5 var4 = new class5();
        var4.field57 = new byte[this.field72 + 1];
        var4.field72 = this.field72 + 1;
        class42.method296(this.field57, 0, var4.field57, 0, this.field72);
        var4.field57[this.field72] = (byte) arg1;
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(II)Lma;", line = 1853)
    public final class5 method78(int arg0, int arg1) {
        if (arg0 == -24938) {
            field76++;
            return this.method76(0, arg1, this.field72);
        } else {
            return (class5) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIILma;)Lma;", line = 1867)
    public final class5 method79(byte arg0, int arg1, int arg2, class5 arg3) {
        field73++;
        if (!this.field65) {
            throw new IllegalArgumentException();
        } else if (arg1 >= 0 && arg1 <= arg2 && arg3.field72 >= arg2) {
            this.field77 = 0;
            if (this.field57.length < this.field72 + arg2 - arg1) {
                int var5;
                for (var5 = 1; var5 < (this.field72 + arg3.field72); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class42.method296(this.field57, 0, var6, 0, this.field72);
                this.field57 = var6;
            }
            class42.method296(arg3.field57, arg1, this.field57, this.field72, arg2 - arg1);
            this.field72 += arg2 - arg1;
            if (arg0 != 117) {
                this.method49((class5) null, (class5) null, false);
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
