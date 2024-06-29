import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class51 implements class235 {

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Z")
    private boolean field857 = true;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Ldf;")
    public static class51 field831 = class46.method233("Art", 100);

    @OriginalMember(owner = "client!df", name = "U", descriptor = "Ldf;")
    public static class51 field851 = class46.method233("blinken1:", 100);

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[S")
    public static short[] field819 = new short[256];

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Ldf;")
    public static class51 field862 = class46.method233("Lade Konfiguration )2 ", 100);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lja;")
    public static class55 field807;

    // $FF: synthetic field
    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field870;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[B")
    public byte[] field813;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public final int method268(int arg0, int arg1) {
        if (arg1 > -94) {
            this.field855 = -77;
        }
        field805++;
        return this.field813[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)Ldf;")
    public final class51 method269(byte arg0, int arg1, int arg2) {
        field812++;
        class51 var4 = new class51();
        if (arg0 != -74) {
            this.method283((byte) -124);
        }
        var4.field813 = new byte[arg2 - arg1];
        var4.field855 = arg2 - arg1;
        class256.method1746(this.field813, arg1, var4.field813, 0, var4.field855);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method270(Applet arg0, int arg1) throws Throwable {
        field828++;
        String var3 = new String(this.field813, 0, this.field855);
        if (arg1 > -101) {
            this.field857 = false;
        }
        class194.method1377((byte) -107, var3, arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;I)I")
    public final int method271(class51 arg0, int arg1) {
        field848++;
        if (arg1 != -1) {
            this.method314(-29, 73);
        }
        return this.method289(arg0, 0, (byte) 88);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public static final void method272(int arg0, int arg1, int arg2) {
        field826++;
        class252 var3 = class90.field1493[class257.field4496][arg0][arg1];
        if (var3 == null) {
            class69.method483(class257.field4496, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class86 var5 = null;
        for (class86 var6 = (class86) var3.method1720(true); var6 != null; var6 = (class86) var3.method1712((byte) 112)) {
            class222 var13 = class219.method1508(var6.field1439.field3034, (byte) 83);
            int var14 = var13.field3880;
            if (var13.field3913 == 1) {
                var14 = (var6.field1439.field3038 + 1) * var14;
            }
            if (var4 < var14) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class69.method483(class257.field4496, arg0, arg1);
            return;
        }
        class184 var7 = null;
        var3.method1711((byte) 79, var5);
        if (arg2 != -28686) {
            method288((byte) 49);
        }
        class86 var8 = (class86) var3.method1720(true);
        class184 var9 = null;
        while (var8 != null) {
            class184 var12 = var8.field1439;
            if (var5.field1439.field3034 != var12.field3034) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field3034 != var12.field3034 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class86) var3.method1712((byte) 112);
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class146.method1045(class257.field4496, arg0, arg1, class207.method1424(class257.field4496, arg0 * 128 + 64, (byte) 18, arg1 * 128 + 64), var5.field1439, var10, var7, var9);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)I")
    public final int method273(int arg0, byte arg1) {
        if (arg1 == 36) {
            field852++;
            return this.method319(63, arg0, 0);
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)I")
    public final int method274(byte arg0) {
        field818++;
        return arg0 == 11 ? this.method300(10, -15072) : 127;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLdf;)Z")
    public final boolean method275(byte arg0, class51 arg1) {
        field843++;
        if (this.field855 < arg1.field855) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field855; var3++) {
            byte var4 = this.field813[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field813[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        if (arg0 < 89) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field834++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILdf;)Z")
    public final boolean method276(int arg0, class51 arg1) {
        field867++;
        if (arg0 > -111) {
            this.method286(93, 121);
        }
        if (arg1.field855 > this.field855) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field855; var3++) {
            if (this.field813[var3] != arg1.field813[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(ILdf;)Z")
    public final boolean method277(int arg0, class51 arg1) {
        field853++;
        if (arg1.field855 > this.field855) {
            return false;
        }
        int var3 = this.field855 - arg1.field855;
        for (int var4 = arg0; var4 < arg1.field855; var4++) {
            if (this.field813[var3 + var4] != arg1.field813[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILdf;)Ldf;")
    public final class51 method278(int arg0, int arg1, int arg2, class51 arg3) {
        field841++;
        if (!this.field857) {
            throw new IllegalArgumentException();
        } else if (arg0 >= 0 && arg0 <= arg2 && arg3.field855 >= arg2) {
            this.field811 = 0;
            if (this.field813.length < (this.field855 + arg2 - arg0)) {
                int var5;
                for (var5 = 1; var5 < this.field855 + arg3.field855; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class256.method1746(this.field813, 0, var6, 0, this.field855);
                this.field813 = var6;
            }
            class256.method1746(arg3.field813, arg0, this.field813, this.field855, arg2 - arg0);
            this.field855 += arg2 - arg0;
            return arg1 == 1239 ? this : null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Ldf;")
    public final class51 method279(byte arg0, int arg1) {
        if (arg0 != -55) {
            field817 = 103;
        }
        field849++;
        return this.method269((byte) -74, arg1, this.field855);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Ldf;")
    public final class51 method280(byte arg0) {
        class51 var2 = class63.method422(this.method316(88), -109);
        field869++;
        if (arg0 >= -60) {
            field862 = null;
        }
        return var2 == null ? class118.field1978 : var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;")
    public final URL method281(URL arg0, byte arg1) throws MalformedURLException {
        if (arg1 >= -111) {
            this.method301(-30);
        }
        field839++;
        return new URL(arg0, new String(this.field813, 0, this.field855));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;B)I")
    public final int method282(class51 arg0, byte arg1) {
        field827++;
        int var3;
        if (arg0.field855 < this.field855) {
            var3 = arg0.field855;
        } else {
            var3 = this.field855;
        }
        if (arg1 != -113) {
            this.field811 = -14;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field813[var4] & 0xFF) > (this.field813[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field813[var4] & 0xFF) > (arg0.field813[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field855 > this.field855) {
            return -1;
        } else if (arg0.field855 < this.field855) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)[B")
    public final byte[] method283(byte arg0) {
        if (arg0 != 88) {
            return null;
        }
        field820++;
        if (this.field855 == 0) {
            return new byte[0];
        }
        int var2 = this.field855 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if ((var2 - 2) >= this.field855 || class213.method1459(this.field813[var2 - 2], 100) == -1) {
            var3 -= 2;
        } else if (this.field855 <= var2 - 1 || class213.method1459(this.field813[var2 - 1], 100) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method303(0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    public final void method284(byte arg0) {
        String var2;
        try {
            var2 = new String(this.field813, 0, this.field855, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field813, 0, this.field855);
        }
        System.out.println(var2);
        field816++;
        if (arg0 < 54) {
            this.method290(-33);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Ldf;")
    public final class51 method285(int arg0) {
        field863++;
        if (!this.field857) {
            throw new IllegalArgumentException();
        }
        this.field811 = 0;
        if (this.field813.length != this.field855) {
            byte[] var2 = new byte[this.field855];
            class256.method1746(this.field813, 0, var2, 0, this.field855);
            this.field813 = var2;
        }
        if (arg0 != 43) {
            this.method318((FontMetrics) null, (byte) 124);
        }
        return this;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
    public final void method286(int arg0, int arg1) {
        this.field811 = 0;
        if (arg0 >= -80) {
            this.method305((byte) 30, (class51) null);
        }
        field856++;
        if (!this.field857) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field813.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class256.method1746(this.field813, 0, var4, 0, this.field855);
                this.field813 = var4;
            }
            for (int var5 = this.field855; var5 < arg1; var5++) {
                this.field813[var5] = 32;
            }
            this.field855 = arg1;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IB)Ldf;")
    public final class51 method287(int arg0, byte arg1) {
        field864++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class51 var3 = new class51();
        var3.field813 = new byte[this.field855 + 1];
        if (arg1 > -52) {
            return null;
        } else {
            var3.field855 = this.field855 + 1;
            class256.method1746(this.field813, 0, var3.field813, 0, this.field855);
            var3.field813[this.field855] = (byte) arg0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)V")
    public static void method288(byte arg0) {
        field851 = null;
        field831 = null;
        field819 = null;
        field862 = null;
        if (arg0 <= -62) {
            field807 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field840++;
        if (!arg0 instanceof class51) {
            throw new IllegalArgumentException();
        }
        return this.method315(false, (class51) arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;IB)I")
    public final int method289(class51 arg0, int arg1, byte arg2) {
        int[] var4 = new int[arg0.field855];
        field832++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field855];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg0.field855;
        }
        for (int var8 = 1; var8 <= arg0.field855; var8++) {
            var4[var8 - 1] = (arg0.field855 << 1) - var8;
            var5[class191.method1366(arg0.field813[var8 - 1], 255)] = arg0.field855 - var8;
        }
        int var9 = arg0.field855 + 1;
        int var10 = arg0.field855;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg0.field855 >= var9 && arg0.field813[var9 - 1] != arg0.field813[var10 - 1]) {
                if ((arg0.field855 - var10) <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg0.field855 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg0.field855 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var12) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field813[var15 - 1] != arg0.field813[var14 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg0.field855) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg0.field855 + var11 - var18) {
                    var4[var18 - 1] = arg0.field855 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 += var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        if (arg2 <= 86) {
            return 87;
        }
        int var17;
        for (int var16 = arg1 + arg0.field855 - 1; var16 < this.field855; var16 += Math.max(var5[this.field813[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field855 - 1; var17 >= 0 && this.field813[var16] == arg0.field813[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        if (arg0 != -20661) {
            this.field813 = null;
        }
        field830++;
        return this.method317((byte) 120, 10);
    }

    @OriginalMember(owner = "client!df", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field806++;
        return this.method294(1579154277);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(B)[B")
    public final byte[] method291(byte arg0) {
        field837++;
        byte[] var2 = new byte[this.field855];
        class256.method1746(this.field813, 0, var2, 0, this.field855);
        if (arg0 < 56) {
            field817 = -56;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLdf;)Z")
    public final boolean method292(boolean arg0, class51 arg1) {
        field847++;
        if (arg1 == null) {
            return false;
        }
        if (!arg0) {
            this.method290(-16);
        }
        if (this.field855 != arg1.field855) {
            return false;
        }
        for (int var3 = 0; var3 < this.field855; var3++) {
            byte var4 = arg1.field813[var3];
            byte var5 = this.field813[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)I")
    public final int method293(boolean arg0) {
        if (arg0) {
            this.method309(-72, (Graphics) null, 116, 36);
        }
        field815++;
        return this.field855;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I")
    public final int method294(int arg0) {
        field808++;
        if (arg0 != 1579154277) {
            field817 = -101;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field855; var3++) {
            var2 = (var2 << 5) + (this.field813[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method295(int arg0, Applet arg1) throws Throwable {
        field821++;
        String var3 = new String(this.field813, 0, this.field855);
        Object var4 = class194.method1378((byte) -124, arg1, var3, (Object[]) null);
        if (arg0 != -12249) {
            this.method303(-93, (byte[]) null, true);
        }
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class101.method741(var5.length, 0, true, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)I")
    public final int method296(int arg0, boolean arg1) {
        field823++;
        byte var3 = (byte) arg0;
        int var4 = 0;
        if (arg1) {
            field831 = null;
        }
        for (int var5 = 0; var5 < this.field855; var5++) {
            if (this.field813[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(B)V")
    public static final void method297(byte arg0) {
        field810++;
        for (int var1 = 0; var1 < class185.field3060; var1++) {
            int var2 = class215.field3732[var1];
            class83 var3 = class34.field512[var2];
            int var4 = class97.field1622.method897(arg0 - 4);
            if ((var4 & 0x1) != 0) {
                int var5 = class97.field1622.method880((byte) 107);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class97.field1622.method881(0);
                class43.method221(var3, arg0 - 122, var6, var5);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field1392.method64(-8093)) {
                    class245.method1671(-12011, var3);
                }
                var3.field1392 = class247.method1678((byte) -103, class97.field1622.method890((byte) -83));
                var3.field4304 = var3.field1392.field130;
                var3.field4345 = var3.field1392.field118;
                var3.field4298 = var3.field1392.field136;
                var3.field4287 = var3.field1392.field135;
                var3.field4307 = var3.field1392.field119;
                var3.field4312 = var3.field1392.field171;
                var3.field4341 = var3.field1392.field159;
                var3.field4275 = var3.field1392.field173;
                var3.field4297 = var3.field1392.field113;
                if (var3.field1392.method64(arg0 ^ 0xFFFFE01A)) {
                    class230.method1589(var3, 0, var3.field4343[0], (class103) null, (byte) -119, class257.field4496, (class108) null, var3.field4336[0]);
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field4353 = class97.field1622.method903((byte) 108);
                var3.field4323 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class97.field1622.method881(0);
                int var8 = class97.field1622.method901((byte) -4);
                var3.method1685(class179.field2960, false, var7, var8);
                var3.field4305 = class179.field2960 + 300;
                var3.field4338 = class97.field1622.method881(0);
            }
            if ((var4 & 0x20) != 0) {
                var3.field4355 = class97.field1622.method914(-114);
                if (var3.field4355 == 65535) {
                    var3.field4355 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field4337 = class97.field1622.method914(arg0 - 73);
                var3.field4295 = class97.field1622.method876(false);
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class97.field1622.method901((byte) -4);
                int var10 = class97.field1622.method881(0);
                var3.method1685(class179.field2960, false, var9, var10);
            }
            if ((var4 & 0x80) != 0) {
                var3.field4334 = class97.field1622.method880((byte) 107);
                int var11 = class97.field1622.method894(255);
                if (var3.field4334 == 65535) {
                    var3.field4334 = -1;
                }
                var3.field4306 = 0;
                var3.field4289 = 0;
                var3.field4357 = var11 >> 16;
                var3.field4358 = (var11 & 0xFFFF) + class179.field2960;
                if (class179.field2960 < var3.field4358) {
                    var3.field4306 = -1;
                }
                if (var3.field4334 != -1 && class179.field2960 == var3.field4358) {
                    int var12 = class195.method1384(var3.field4334, 0).field1388;
                    if (var12 != -1) {
                        class151 var13 = class72.method501(var12, (byte) 22);
                        if (var13 != null && var13.field2539 != null) {
                            class208.method1433(var3.field4348, var3.field4319, arg0 ^ 0x11, 0, false, var13);
                        }
                    }
                }
            }
        }
        if (arg0 != 121) {
            field819 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Ljava/net/URL;")
    public final URL method298(int arg0) throws MalformedURLException {
        field868++;
        if (arg0 != 0) {
            this.method291((byte) 39);
        }
        return new URL(new String(this.field813, 0, this.field855));
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)J")
    public final long method299(int arg0) {
        long var2 = 0L;
        field825++;
        for (int var4 = 0; var4 < this.field855; var4++) {
            var2 = (var2 << 5) + (long) (this.field813[var4] & 0xFF) - var2;
        }
        if (arg0 != -91) {
            field817 = -19;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        field814++;
        boolean var3 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != -15072) {
            return -67;
        }
        for (int var6 = 0; var6 < this.field855; var6++) {
            int var7 = this.field813[var6] & 0xFF;
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
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Ldf;")
    public final class51 method301(int arg0) {
        field846++;
        long var2 = this.method299(arg0 ^ 0x6163);
        synchronized (field870 == null ? (field870 = method321("df")) : field870) {
            if (class89.field1483 == null) {
                class89.field1483 = new class212(4096);
            } else {
                for (class120 var5 = (class120) class89.field1483.method1453(var2, 1); var5 != null; var5 = (class120) class89.field1483.method1446(false)) {
                    if (this.method315(false, var5.field1998)) {
                        return var5.field1998;
                    }
                }
            }
            if (arg0 != -24890) {
                method288((byte) -107);
            }
            class120 var7 = new class120();
            this.field857 = false;
            var7.field1998 = this;
            class89.field1483.method1447(-104, var2, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(ILdf;)I")
    public final int method302(int arg0, class51 arg1) {
        field838++;
        int var3 = 0;
        int var4 = -112 / ((-arg0 - 29) / 57);
        int var5 = 0;
        int var6 = this.field855;
        int var7 = arg1.field855;
        int var8 = arg1.field855;
        int var9 = this.field855;
        int var10 = 0;
        int var11 = 0;
        while (var6 != 0 && var7 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field813[var11] & 0xFF;
                var11++;
            }
            if (class234.method1625(95, var3)) {
                var9++;
            } else {
                var6--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg1.field813[var10] & 0xFF;
                var10++;
            }
            if (class234.method1625(65, var5)) {
                var8++;
            } else {
                var7--;
            }
            if (class208.field3480[var3] < class208.field3480[var5]) {
                return -1;
            }
            if (class208.field3480[var5] < class208.field3480[var3]) {
                return 1;
            }
        }
        if (var9 < var8) {
            return -1;
        } else if (var9 > var8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BZ)I")
    private final int method303(int arg0, byte[] arg1, boolean arg2) {
        field861++;
        if (!arg2) {
            return -35;
        }
        int var4 = arg0;
        for (int var5 = 0; var5 < this.field855; var5 += 4) {
            int var6 = class213.method1459(this.field813[var5], 100);
            int var7 = (var5 + 1) < this.field855 ? class213.method1459(this.field813[var5 + 1], 100) : -1;
            int var8 = (var5 + 2) >= this.field855 ? -1 : class213.method1459(this.field813[var5 + 2], 100);
            int var9 = var5 + 3 >= this.field855 ? -1 : class213.method1459(this.field813[var5 + 3], 100);
            arg1[arg0++] = (byte) class82.method642(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class82.method642(var8 >>> 2, class191.method1366(var7, 15) << 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class82.method642(class191.method1366(3, var8) << 6, var9);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(B)Ldf;")
    public final class51 method304(byte arg0) {
        field829++;
        class51 var2 = new class51();
        var2.field855 = this.field855;
        var2.field813 = new byte[this.field855];
        boolean var3 = true;
        int var4 = 0;
        if (arg0 != -92) {
            this.field813 = null;
        }
        while (this.field855 > var4) {
            byte var5 = this.field813[var4];
            if (var5 == 95) {
                var2.field813[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field813[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field813[var4] = var5;
            }
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(BLdf;)Ldf;")
    public final class51 method305(byte arg0, class51 arg1) {
        field809++;
        if (!this.field857) {
            throw new IllegalArgumentException();
        }
        this.field811 = 0;
        if ((this.field855 + arg1.field855) > this.field813.length) {
            int var3;
            for (var3 = 1; var3 < (this.field855 + arg1.field855); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class256.method1746(this.field813, 0, var4, 0, this.field855);
            this.field813 = var4;
        }
        class256.method1746(arg1.field813, 0, this.field813, this.field855, arg1.field855);
        if (arg0 >= -78) {
            return null;
        } else {
            this.field855 += arg1.field855;
            return this;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;Ldf;I)Ldf;")
    public final class51 method306(class51 arg0, class51 arg1, int arg2) {
        field824++;
        int var4 = this.field855;
        int var5 = arg1.field855 - arg0.field855;
        int var6 = 0;
        while (true) {
            int var7 = this.method289(arg0, var6, (byte) 107);
            if (var7 < 0) {
                int var8 = arg2;
                class51 var9 = class131.method964(0, var4);
                while (true) {
                    int var10 = this.method289(arg0, var8, (byte) 123);
                    if (var10 < 0) {
                        while (this.field855 > var8) {
                            var9.method314(this.field813[var8++] & 0xFF, 255);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method314(this.field813[var8++] & 0xFF, 255);
                    }
                    var9.method305((byte) -120, arg1);
                    var8 += arg0.field855;
                }
            }
            var4 += var5;
            var6 = var7 + arg0.field855;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)Ldf;")
    public final class51 method307(int arg0) {
        field850++;
        class51 var2 = new class51();
        byte var3 = 2;
        var2.field855 = this.field855;
        var2.field813 = new byte[this.field855];
        if (arg0 != -3) {
            this.field857 = true;
        }
        for (int var4 = 0; var4 < this.field855; var4++) {
            byte var5 = this.field813[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field813[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(ILjava/applet/Applet;)Ldf;")
    public final class51 method308(int arg0, Applet arg1) {
        field836++;
        if (arg0 == 25787) {
            String var3 = new String(this.field813, 0, this.field855);
            String var4 = arg1.getParameter(var3);
            return var4 == null ? null : class123.method925(var4, 14592);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method309(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 != -97) {
            this.method283((byte) 87);
        }
        String var5;
        try {
            var5 = new String(this.field813, 0, this.field855, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field813, 0, this.field855);
        }
        field844++;
        arg1.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)Ldf;")
    public final class51 method310(int arg0) {
        field860++;
        int var2 = 0;
        int var3 = this.field855;
        while (this.field855 > var2 && (this.field813[var2] >= 0 && this.field813[var2] <= 32 || (this.field813[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field813[var3 - 1] >= 0 && this.field813[var3 - 1] <= 32 || (this.field813[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (~var2 == arg0 && this.field855 == var3) {
            return this;
        }
        class51 var4 = new class51();
        var4.field855 = var3 - var2;
        var4.field813 = new byte[var4.field855];
        for (int var5 = 0; var5 < var4.field855; var5++) {
            var4.field813[var5] = this.field813[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)Ldf;")
    public static final class51 method311(int arg0, int arg1) {
        if (arg1 != 10) {
            field819 = null;
        }
        field842++;
        return class204.method1413(false, arg1 ^ 0xA, arg0, 10);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(II)[Ldf;")
    public final class51[] method312(int arg0, int arg1) {
        field845++;
        int var3 = 0;
        if (arg1 > -120) {
            return null;
        }
        for (int var4 = 0; var4 < this.field855; var4++) {
            if (this.field813[var4] == arg0) {
                var3++;
            }
        }
        class51[] var5 = new class51[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field813[var6 + var9] != arg0; var9++) {
            }
            var5[var7++] = this.method269((byte) -74, var6, var6 + var9);
            var6 += var9 + 1;
        }
        var5[var3] = this.method269((byte) -74, var6, this.field855);
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)Ldf;")
    public final class51 method313(int arg0) {
        field865++;
        class51 var2 = new class51();
        if (arg0 < 47) {
            this.field855 = -71;
        }
        var2.field855 = this.field855;
        var2.field813 = new byte[this.field855];
        for (int var3 = 0; var3 < this.field855; var3++) {
            byte var4 = this.field813[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field813[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(II)Ldf;")
    public final class51 method314(int arg0, int arg1) {
        field854++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (!this.field857) {
            throw new IllegalArgumentException();
        } else if (arg1 == 255) {
            this.field811 = 0;
            if (this.field813.length == this.field855) {
                int var3;
                for (var3 = 1; var3 <= this.field855; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class256.method1746(this.field813, 0, var4, 0, this.field855);
                this.field813 = var4;
            }
            this.field813[this.field855++] = (byte) arg0;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(ZLdf;)Z")
    public final boolean method315(boolean arg0, class51 arg1) {
        field866++;
        if (arg1 == null) {
            return false;
        } else if (this.field855 == arg1.field855) {
            if (!this.field857 || !arg1.field857) {
                if (this.field811 == 0) {
                    this.field811 = this.method294(1579154277);
                    if (this.field811 == 0) {
                        this.field811 = 1;
                    }
                }
                if (arg1.field811 == 0) {
                    arg1.field811 = arg1.method294(1579154277);
                    if (arg1.field811 == 0) {
                        arg1.field811 = 1;
                    }
                }
                if (this.field811 != arg1.field811) {
                    return false;
                }
            }
            if (arg0) {
                field807 = null;
            }
            for (int var3 = 0; var3 < this.field855; var3++) {
                if (this.field813[var3] != arg1.field813[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "(I)J")
    public final long method316(int arg0) {
        field822++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 < 9) {
            this.field813 = null;
        }
        while (var4 < this.field855 && var4 < 12) {
            byte var5 = this.field813[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (1 - (97 - var5));
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 - 21);
            }
            var4++;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(BI)Z")
    private final boolean method317(byte arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        field858++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0 < 93) {
            return true;
        }
        while (var6 < this.field855) {
            label79: {
                int var7 = this.field813[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label79;
                    }
                    if (var7 == 43) {
                        break label79;
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
            var6++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method318(FontMetrics arg0, byte arg1) {
        field833++;
        String var3;
        try {
            if (arg1 > -118) {
                this.method317((byte) 18, 13);
            }
            var3 = new String(this.field813, 0, this.field855, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field813, 0, this.field855);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)I")
    public final int method319(int arg0, int arg1, int arg2) {
        if (arg0 < 6) {
            this.field813 = null;
        }
        byte var4 = (byte) arg1;
        field859++;
        for (int var5 = arg2; var5 < this.field855; var5++) {
            if (this.field813[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII[B)I")
    public final int method320(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        class256.method1746(this.field813, arg0, arg4, arg1, arg3 - arg0);
        field835++;
        if (arg2 != 0) {
            this.field857 = false;
        }
        return arg3 - arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method321(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
