import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class275 implements class64 {

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "Z")
    private boolean field4785 = true;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Z")
    public static boolean field4745 = false;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "[I")
    public static int[] field4773 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lda;")
    public static class275 field4772 = class255.method1672(119, "Okay");

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "Lda;")
    public static class275 field4787 = class255.method1672(122, "Ausw-=hlen");

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "Lrg;")
    public static class84 field4775 = new class84();

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field4794 = 128;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    private int field4763;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field4793;

    // $FF: synthetic field
    @OriginalMember(owner = "client!da", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field4795;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[B")
    public byte[] field4749;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
    public final void method1808(Applet arg0, byte arg1) throws Throwable {
        String var3 = new String(this.field4749, 0, this.field4752);
        field4757++;
        if (arg1 == 92) {
            class217.method1395(arg0, -101, var3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILda;I)Lda;")
    public final class275 method1809(int arg0, int arg1, class275 arg2, int arg3) {
        field4761++;
        if (!this.field4785) {
            throw new IllegalArgumentException();
        } else if (~arg3 <= arg1 && arg3 <= arg0 && arg0 <= arg2.field4752) {
            this.field4763 = 0;
            if (this.field4749.length < (arg0 + this.field4752 - arg3)) {
                int var5;
                for (var5 = 1; var5 < this.field4752 + arg2.field4752; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class154.method1085(this.field4749, 0, var6, 0, this.field4752);
                this.field4749 = var6;
            }
            class154.method1085(arg2.field4749, arg3, this.field4749, this.field4752, arg0 - arg3);
            this.field4752 += arg0 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;BI)I")
    public final int method1810(class275 arg0, byte arg1, int arg2) {
        int[] var4 = new int[arg0.field4752];
        field4751++;
        int[] var5 = new int[arg0.field4752];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg0.field4752;
        }
        for (int var8 = 1; var8 <= arg0.field4752; var8++) {
            var5[var8 - 1] = (arg0.field4752 << 1) - var8;
            var6[class19.method98(arg0.field4749[var8 - 1], 255)] = arg0.field4752 - var8;
        }
        int var9 = arg0.field4752 + 1;
        for (int var10 = arg0.field4752; var10 > 0; var10--) {
            var4[var10 - 1] = var9;
            while (arg0.field4752 >= var9 && arg0.field4749[var9 - 1] != arg0.field4749[var10 - 1]) {
                if (var5[var9 - 1] >= (arg0.field4752 - var10)) {
                    var5[var9 - 1] = arg0.field4752 - var10;
                }
                var9 = var4[var9 - 1];
            }
            var9--;
        }
        if (arg1 < 54) {
            return 114;
        }
        int var11 = var9;
        int var12 = arg0.field4752 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var4[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field4749[var14 - 1] != arg0.field4749[var15 - 1]) {
                var14 = var4[var14 - 1];
            }
            var14++;
        }
        while (arg0.field4752 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (arg0.field4752 + var11 - var18 <= var5[var18 + -1]) {
                    var5[var18 - 1] = arg0.field4752 - (var18 - var11);
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var4[var12 - 1];
            var12 = var4[var12 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg0.field4752 - 1; var16 < this.field4752; var16 += Math.max(var6[this.field4749[var16] & 0xFF], var5[var17])) {
            for (var17 = arg0.field4752 - 1; var17 >= 0 && this.field4749[var16] == arg0.field4749[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Ljava/net/URL;")
    public final URL method1811(int arg0) throws MalformedURLException {
        field4766++;
        return arg0 == 27688 ? new URL(new String(this.field4749, 0, this.field4752)) : null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)[B")
    public final byte[] method1812(byte arg0) {
        field4737++;
        if (arg0 != -14) {
            this.equals((Object) null);
        }
        byte[] var2 = new byte[this.field4752];
        class154.method1085(this.field4749, 0, var2, 0, this.field4752);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;B)Z")
    public final boolean method1813(class275 arg0, byte arg1) {
        field4779++;
        if (arg1 != -70) {
            return true;
        } else if (arg0.field4752 > this.field4752) {
            return false;
        } else {
            int var3 = this.field4752 - arg0.field4752;
            for (int var4 = 0; var4 < arg0.field4752; var4++) {
                if (this.field4749[var4 + var3] != arg0.field4749[var4]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
    public final int method1814(boolean arg0, FontMetrics arg1) {
        field4783++;
        String var3;
        try {
            var3 = new String(this.field4749, 0, this.field4752, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field4749, 0, this.field4752);
        }
        if (arg0) {
            this.field4785 = false;
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Lda;")
    public final class275 method1815(int arg0, int arg1, int arg2) {
        field4770++;
        class275 var4 = new class275();
        var4.field4752 = arg1 - arg0;
        var4.field4749 = new byte[arg1 - arg0];
        class154.method1085(this.field4749, arg0, var4.field4749, arg2, var4.field4752);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method1816(byte arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field4749, 0, this.field4752);
        field4760++;
        Object var4 = class217.method1396((Object[]) null, -32627, arg1, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class191.method1256(var5, -104, var5.length, 0);
        }
        if (arg0 != 10) {
            this.field4763 = -62;
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lda;")
    public final class275 method1817(int arg0, int arg1) {
        field4781++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class275 var3 = new class275();
        var3.field4749 = new byte[this.field4752 + 1];
        if (arg1 >= -112) {
            return null;
        } else {
            var3.field4752 = this.field4752 + 1;
            class154.method1085(this.field4749, 0, var3.field4749, 0, this.field4752);
            var3.field4749[this.field4752] = (byte) arg0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILda;)I")
    public final int method1818(int arg0, class275 arg1) {
        field4735++;
        if (arg0 != 19701) {
            this.method1854(-80);
        }
        return this.method1810(arg1, (byte) 81, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLda;)I")
    public final int method1819(byte arg0, class275 arg1) {
        field4755++;
        int var3 = 0;
        int var4 = 0;
        int var5 = arg1.field4752;
        int var6 = this.field4752;
        int var7 = arg1.field4752;
        int var8 = this.field4752;
        int var9 = 0;
        int var10 = 0;
        while (var8 != 0 && var5 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field4749[var9] & 0xFF;
                var9++;
            }
            if (class167.method1150(false, var3)) {
                var6++;
            } else {
                var8--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg1.field4749[var10] & 0xFF;
                var10++;
            }
            if (class167.method1150(false, var4)) {
                var7++;
            } else {
                var5--;
            }
            if (class178.field3071[var4] > class178.field3071[var3]) {
                return -1;
            }
            if (class178.field3071[var3] > class178.field3071[var4]) {
                return 1;
            }
        }
        if (arg0 != -87) {
            this.method1853(-64);
        }
        if (var6 < var7) {
            return -1;
        } else if (var6 > var7) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method1820(int arg0) {
        field4772 = null;
        field4787 = null;
        field4775 = null;
        field4773 = null;
        if (arg0 != 55) {
            method1829(-49, -93);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;ILda;)Lda;")
    public final class275 method1821(class275 arg0, int arg1, class275 arg2) {
        field4774++;
        if (arg1 >= -36) {
            field4773 = null;
        }
        int var4 = arg0.field4752 - arg2.field4752;
        int var5 = this.field4752;
        int var6 = 0;
        while (true) {
            int var7 = this.method1810(arg2, (byte) 96, var6);
            if (var7 < 0) {
                int var8 = 0;
                class275 var9 = class169.method1160(var5, 102);
                while (true) {
                    int var10 = this.method1810(arg2, (byte) 119, var8);
                    if (var10 < 0) {
                        while (var8 < this.field4752) {
                            var9.method1824(0, this.field4749[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method1824(0, this.field4749[var8++] & 0xFF);
                    }
                    var9.method1835(arg0, 0);
                    var8 += arg2.field4752;
                }
            }
            var6 = arg2.field4752 + var7;
            var5 += var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public final int method1822(int arg0, int arg1) {
        field4734++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg0 != -8804) {
            field4775 = null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4752; var6++) {
            int var7 = this.field4749[var6] & 0xFF;
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
            if ((var8 / arg1) != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;I)Z")
    public final boolean method1823(class275 arg0, int arg1) {
        field4747++;
        if (this.field4752 < arg0.field4752) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field4752; var3++) {
            byte var4 = this.field4749[var3];
            byte var5 = arg0.field4749[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        if (arg1 != 87) {
            this.method1814(false, (FontMetrics) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Lda;")
    public final class275 method1824(int arg0, int arg1) {
        field4767++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field4785) {
            this.field4763 = arg0;
            if (this.field4749.length == this.field4752) {
                int var3;
                for (var3 = 1; var3 <= this.field4752; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class154.method1085(this.field4749, 0, var4, 0, this.field4752);
                this.field4749 = var4;
            }
            this.field4749[this.field4752++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method1825(int arg0, byte arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field4749, 0, this.field4752, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field4749, 0, this.field4752);
        }
        field4778++;
        arg3.drawString(var5, arg0, arg2);
        if (arg1 >= -46) {
            field4794 = -22;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BIZI)I")
    public final int method1826(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        field4784++;
        class154.method1085(this.field4749, arg4, arg1, arg0, arg2 - arg4);
        if (arg3) {
            field4759 = -103;
        }
        return arg2 - arg4;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Lda;")
    public final class275 method1827(int arg0) {
        if (arg0 != 9151) {
            field4745 = false;
        }
        field4789++;
        if (!this.field4785) {
            throw new IllegalArgumentException();
        }
        this.field4763 = 0;
        if (this.field4749.length != this.field4752) {
            byte[] var2 = new byte[this.field4752];
            class154.method1085(this.field4749, 0, var2, 0, this.field4752);
            this.field4749 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLda;)Z")
    public final boolean method1828(boolean arg0, class275 arg1) {
        if (!arg0) {
            this.field4763 = 15;
        }
        field4769++;
        if (arg1 == null) {
            return false;
        } else if (this.field4752 == arg1.field4752) {
            if (!this.field4785 || !arg1.field4785) {
                if (this.field4763 == 0) {
                    this.field4763 = this.method1830((byte) -89);
                    if (this.field4763 == 0) {
                        this.field4763 = 1;
                    }
                }
                if (arg1.field4763 == 0) {
                    arg1.field4763 = arg1.method1830((byte) -89);
                    if (arg1.field4763 == 0) {
                        arg1.field4763 = 1;
                    }
                }
                if (this.field4763 != arg1.field4763) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field4752; var3++) {
                if (this.field4749[var3] != arg1.field4749[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)I")
    public static final int method1829(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg0 != 45) {
            method1820(104);
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        field4743++;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)I")
    public final int method1830(byte arg0) {
        field4758++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4752; var3++) {
            var2 = (var2 << 5) + (this.field4749[var3] & 0xFF) - var2;
        }
        if (arg0 != -89) {
            field4772 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)Lda;")
    public final class275 method1831(byte arg0) {
        if (arg0 > -55) {
            return null;
        }
        field4764++;
        class275 var2 = new class275();
        var2.field4752 = this.field4752;
        var2.field4749 = new byte[this.field4752];
        for (int var3 = 0; var3 < this.field4752; var3++) {
            byte var4 = this.field4749[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field4749[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/applet/Applet;)Lda;")
    public final class275 method1832(int arg0, Applet arg1) {
        if (arg0 > -119) {
            this.field4752 = -22;
        }
        field4791++;
        String var3 = new String(this.field4749, 0, this.field4752);
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class18.method93(var4, (byte) -10);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)J")
    public final long method1833(int arg0) {
        field4786++;
        long var2 = 0L;
        for (int var4 = arg0; var4 < this.field4752 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field4749[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public final void method1834(boolean arg0) {
        if (!arg0) {
            this.method1819((byte) -100, (class275) null);
        }
        field4777++;
        String var2;
        try {
            var2 = new String(this.field4749, 0, this.field4752, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field4749, 0, this.field4752);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!da", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field4748++;
        if (!arg0 instanceof class275) {
            throw new IllegalArgumentException();
        }
        return this.method1828(true, (class275) arg0);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Lda;I)Lda;")
    public final class275 method1835(class275 arg0, int arg1) {
        field4739++;
        if (!this.field4785) {
            throw new IllegalArgumentException();
        }
        this.field4763 = 0;
        if (this.field4752 + arg0.field4752 > this.field4749.length) {
            int var3;
            for (var3 = 1; var3 < this.field4752 + arg0.field4752; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class154.method1085(this.field4749, 0, var4, 0, this.field4752);
            this.field4749 = var4;
        }
        class154.method1085(arg0.field4749, arg1, this.field4749, this.field4752, arg0.field4752);
        this.field4752 += arg0.field4752;
        return this;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method1836(URL arg0, int arg1) throws MalformedURLException {
        int var3 = -128 % ((25 - arg1) / 52);
        field4776++;
        return new URL(arg0, new String(this.field4749, 0, this.field4752));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)I")
    public final int method1837(boolean arg0, int arg1) {
        byte var3 = (byte) arg1;
        field4736++;
        int var4 = 0;
        int var5 = 0;
        if (!arg0) {
            this.method1833(123);
        }
        while (this.field4752 > var5) {
            if (this.field4749[var5] == var3) {
                var4++;
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I")
    public final int method1838(int arg0) {
        if (arg0 != 3) {
            this.field4749 = null;
        }
        field4754++;
        return this.field4752;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Lda;")
    public final class275 method1839(int arg0, byte arg1) {
        field4740++;
        int var3 = -25 % ((32 - arg1) / 53);
        return this.method1815(arg0, this.field4752, 0);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)J")
    public final long method1840(int arg0) {
        long var2 = 0L;
        if (arg0 > -62) {
            field4773 = null;
        }
        field4765++;
        for (int var4 = 0; var4 < this.field4752; var4++) {
            var2 = (var2 << 5) + (long) (this.field4749[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Lda;")
    public final class275 method1841(int arg0) {
        field4738++;
        class275 var2 = class181.method1212(arg0 ^ arg0, this.method1833(0));
        return var2 == null ? class123.field2206 : var2;
    }

    @OriginalMember(owner = "client!da", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4744++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)[Lda;")
    public final class275[] method1842(byte arg0, int arg1) {
        field4750++;
        int var3 = 0;
        if (arg0 <= 102) {
            this.method1837(true, -123);
        }
        for (int var4 = 0; var4 < this.field4752; var4++) {
            if (this.field4749[var4] == arg1) {
                var3++;
            }
        }
        class275[] var5 = new class275[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field4749[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method1815(var7, var7 + var9, 0);
            var7 += var9 + 1;
        }
        var5[var3] = this.method1815(var7, this.field4752, 0);
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
    public final void method1843(int arg0, boolean arg1) {
        this.field4763 = 0;
        field4771++;
        if (!this.field4785) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field4749.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class154.method1085(this.field4749, 0, var4, 0, this.field4752);
                this.field4749 = var4;
            }
            if (arg1) {
                this.method1821((class275) null, -62, (class275) null);
            }
            for (int var5 = this.field4752; var5 < arg0; var5++) {
                this.field4749[var5] = 32;
            }
            this.field4752 = arg0;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ILda;)Z")
    public final boolean method1844(int arg0, class275 arg1) {
        field4742++;
        if (arg1 == null) {
            return false;
        } else if (this.field4752 == arg1.field4752) {
            int var3 = 0;
            if (arg0 != 90) {
                return false;
            }
            while (var3 < this.field4752) {
                byte var4 = arg1.field4749[var3];
                byte var5 = this.field4749[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lda;")
    public final class275 method1845(boolean arg0) {
        field4762++;
        if (arg0) {
            this.equals((Object) null);
        }
        int var2;
        for (var2 = 0; this.field4752 > var2 && (this.field4749[var2] >= 0 && this.field4749[var2] <= 32 || (this.field4749[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field4752; var3 > var2 && (this.field4749[var3 - 1] >= 0 && this.field4749[var3 - 1] <= 32 || (this.field4749[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field4752 == var3) {
            return this;
        }
        class275 var4 = new class275();
        var4.field4752 = var3 - var2;
        var4.field4749 = new byte[var4.field4752];
        for (int var5 = 0; var5 < var4.field4752; var5++) {
            var4.field4749[var5] = this.field4749[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BLda;)I")
    public final int method1846(byte arg0, class275 arg1) {
        int var3;
        if (arg1.field4752 < this.field4752) {
            var3 = arg1.field4752;
        } else {
            var3 = this.field4752;
        }
        field4746++;
        if (arg0 != 94) {
            return -100;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field4749[var4] & 0xFF) > (this.field4749[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field4749[var4] & 0xFF) < (this.field4749[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field4752 > this.field4752) {
            return -1;
        } else if (this.field4752 > arg1.field4752) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)I")
    public final int method1847(byte arg0) {
        field4741++;
        return arg0 == 5 ? this.method1822(arg0 ^ 0xFFFFDD99, 10) : 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)I")
    public final int method1848(int arg0, boolean arg1, int arg2) {
        field4756++;
        byte var4 = (byte) arg0;
        if (!arg1) {
            this.method1813((class275) null, (byte) 75);
        }
        for (int var5 = arg2; var5 < this.field4752; var5++) {
            if (this.field4749[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)Lda;")
    public final class275 method1849(byte arg0) {
        field4788++;
        byte var2 = 2;
        class275 var3 = new class275();
        var3.field4752 = this.field4752;
        var3.field4749 = new byte[this.field4752];
        int var4 = 119 % ((arg0 + 66) / 57);
        for (int var5 = 0; var5 < this.field4752; var5++) {
            byte var6 = this.field4749[var5];
            if (var6 >= 97 && var6 <= 122 || var6 >= -32 && var6 <= -2 && var6 != -9) {
                if (var2 == 2) {
                    var6 = (byte) (var6 - 32);
                }
                var2 = 0;
            } else if (!(var6 < 65 || var6 > 90) || !(var6 < -64 || var6 > -34 || var6 == -41)) {
                if (var2 == 0) {
                    var6 = (byte) (var6 + 32);
                }
                var2 = 0;
            } else if (var6 == 46 || var6 == 33 || var6 == 63) {
                var2 = 2;
            } else if (var6 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field4749[var5] = var6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)Lda;")
    public final class275 method1850(int arg0) {
        field4782++;
        class275 var2 = new class275();
        var2.field4752 = this.field4752;
        boolean var3 = true;
        var2.field4749 = new byte[this.field4752];
        if (arg0 != 97) {
            return null;
        }
        for (int var4 = 0; var4 < this.field4752; var4++) {
            byte var5 = this.field4749[var4];
            if (var5 == 95) {
                var2.field4749[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field4749[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field4749[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Lda;I)Z")
    public final boolean method1851(class275 arg0, int arg1) {
        field4768++;
        if (arg0.field4752 > this.field4752) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field4752; var3++) {
            if (this.field4749[var3] != arg0.field4749[var3]) {
                return false;
            }
        }
        int var4 = -30 % ((13 - arg1) / 62);
        return true;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(II)I")
    public final int method1852(int arg0, int arg1) {
        if (arg0 < 93) {
            return -122;
        } else {
            field4790++;
            return this.field4749[arg1] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!da", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field4753++;
        return this.method1830((byte) -89);
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)Lda;")
    public final class275 method1853(int arg0) {
        field4733++;
        class275 var2 = new class275();
        var2.field4752 = this.field4752;
        var2.field4749 = new byte[var2.field4752];
        if (arg0 == -25900) {
            for (int var3 = 0; var3 < this.field4752; var3++) {
                var2.field4749[this.field4752 - var3 - 1] = this.field4749[var3];
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(I)Z")
    public final boolean method1854(int arg0) {
        if (arg0 < 73) {
            return true;
        } else {
            field4780++;
            return this.method1856(10, -32026);
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(B)Lda;")
    public final class275 method1855(byte arg0) {
        field4793++;
        long var2 = this.method1840(arg0 ^ 0x53);
        synchronized (field4795 == null ? (field4795 = method1857("da")) : field4795) {
            if (class171.field2976 == null) {
                class171.field2976 = new class276(4096);
            } else {
                for (class271 var5 = (class271) class171.field2976.method1871(0, var2); var5 != null; var5 = (class271) class171.field2976.method1870((byte) -96)) {
                    if (this.method1828(true, var5.field4706)) {
                        return var5.field4706;
                    }
                }
            }
            class271 var7 = new class271();
            this.field4785 = false;
            var7.field4706 = this;
            class171.field2976.method1867(true, var2, var7);
            if (arg0 != -2) {
                this.field4749 = null;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(II)Z")
    private final boolean method1856(int arg0, int arg1) {
        if (arg1 != -32026) {
            this.field4749 = null;
        }
        field4792++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field4752; var6++) {
            int var7 = this.field4749[var6] & 0xFF;
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
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if ((var8 / arg0) != var4) {
                return false;
            }
            var4 = var8;
            var5 = true;
        }
        return var5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1857(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
