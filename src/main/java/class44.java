import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class44 implements class110 {

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
    private boolean field801 = true;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
    public static int[] field797 = new int[5];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Ldj;")
    public static class44 field787 = class89.method650(255, "Clientscript error in: ");

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Ldj;")
    public static class44 field816 = class89.method650(255, " x ");

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Ldj;")
    public static class44 field799 = class89.method650(255, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "Ldj;")
    public static class44 field832 = class89.method650(255, "<)4col>");

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "Ldj;")
    private static class44 field842 = class89.method650(255, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "Ldj;")
    public static class44 field844 = field842;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "Ldj;")
    public static class44 field848 = class89.method650(255, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "Ldj;")
    public static class44 field836 = class89.method650(255, "runes");

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "Ldj;")
    public static class44 field815 = class89.method650(255, "scrollen:");

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
    public static int field850;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dj", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field851;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "[B")
    public byte[] field822;

    @OriginalMember(owner = "client!dj", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field818++;
        return this.method304(true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILdj;)I")
    public final int method297(int arg0, class44 arg1) {
        int var3 = 28 / ((arg0 - 4) / 36);
        field838++;
        return this.method326((byte) -85, 0, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLfj;)Lhe;")
    public static final class82 method298(byte arg0, class66 arg1) {
        field814++;
        arg1.method506(255);
        int var2 = arg1.method506(255);
        class82 var3 = class36.method247(24572, var2);
        var3.field1588 = arg1.method506(255);
        int var4 = arg1.method506(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method506(255);
            var3.method2(arg1, var6, (byte) 68);
        }
        var3.method78((byte) 106);
        if (arg0 < 0) {
            method298((byte) 103, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)J")
    private final long method299(byte arg0) {
        field794++;
        long var2 = 0L;
        if (arg0 > -3) {
            this.method305(68);
        }
        for (int var4 = 0; var4 < this.field849; var4++) {
            var2 = (var2 << 5) - (var2 - ((long) (this.field822[var4] & 0xFF)));
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field810++;
        if (!(arg0 instanceof class44)) {
            throw new IllegalArgumentException();
        }
        return this.method314((class44) arg0, -27);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ldj;Z)Z")
    public final boolean method300(class44 arg0, boolean arg1) {
        field829++;
        if (arg0.field849 > this.field849) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field849; var3++) {
            byte var4 = this.field822[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg0.field822[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        if (arg1) {
            this.method330(null, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBII[B)I")
    public final int method301(int arg0, byte arg1, int arg2, int arg3, byte[] arg4) {
        field835++;
        class18.method146(this.field822, arg0, arg4, arg2, arg3 - arg0);
        return arg1 > -38 ? 92 : arg3 - arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
    public final int method302(int arg0, int arg1) {
        if (arg0 != -12540) {
            this.method323(true, null);
        }
        field805++;
        return this.field822[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)[Ldj;")
    public final class44[] method303(int arg0, int arg1) {
        field791++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field849; var4++) {
            if (this.field822[var4] == arg1) {
                var3++;
            }
        }
        class44[] var5 = new class44[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        if (arg0 != 4423) {
            return null;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field822[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method318(126, var7 + var9, var7);
            var7 += var9 + 1;
        }
        var5[var3] = this.method318(127, this.field849, var7);
        return var5;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
    public final int method304(boolean arg0) {
        field795++;
        int var2 = 0;
        int var3 = 0;
        if (!arg0) {
            return 115;
        }
        while (var3 < this.field849) {
            var2 = (var2 << 5) + (this.field822[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
    public final boolean method305(int arg0) {
        if (arg0 == 10) {
            field826++;
            return this.method321(10, 1981220580);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)J")
    public final long method306(int arg0) {
        field790++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != -58) {
            field842 = null;
        }
        while (var4 < this.field849 && var4 < 12) {
            var2 *= 37L;
            byte var5 = this.field822[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)Ldj;")
    public final class44 method307(int arg0, int arg1) {
        field833++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field801) {
            if (arg0 != 1) {
                field848 = null;
            }
            this.field788 = 0;
            if (this.field822.length == this.field849) {
                int var3;
                for (var3 = 1; var3 <= this.field849; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class18.method146(this.field822, 0, var4, 0, this.field849);
                this.field822 = var4;
            }
            this.field822[this.field849++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Ljava/net/URL;")
    public final URL method308(int arg0) throws MalformedURLException {
        if (arg0 == -58) {
            field840++;
            return new URL(new String(this.field822, 0, this.field849));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
    public final URL method309(int arg0, URL arg1) throws MalformedURLException {
        if (arg0 != 21195) {
            field842 = null;
        }
        field813++;
        return new URL(arg1, new String(this.field822, 0, this.field849));
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ldj;I)Z")
    public final boolean method310(class44 arg0, int arg1) {
        field820++;
        if (arg0.field849 > this.field849) {
            return false;
        }
        int var3 = this.field849 - arg0.field849;
        for (int var4 = arg1; var4 < arg0.field849; var4++) {
            if (this.field822[var4 + var3] != arg0.field822[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Ldj;")
    public final class44 method311(byte arg0) {
        field841++;
        if (!this.field801) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -118) {
            this.method300(null, false);
        }
        this.field788 = 0;
        if (this.field822.length != this.field849) {
            byte[] var2 = new byte[this.field849];
            class18.method146(this.field822, 0, var2, 0, this.field849);
            this.field822 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Ldj;")
    public final class44 method312(int arg0) {
        if (arg0 != 65) {
            this.method311((byte) -88);
        }
        field817++;
        class44 var2 = new class44();
        var2.field849 = this.field849;
        var2.field822 = new byte[this.field849];
        for (int var3 = 0; var3 < this.field849; var3++) {
            byte var4 = this.field822[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field822[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Ldj;I)I")
    public final int method313(class44 arg0, int arg1) {
        field845++;
        if (arg1 != -4986) {
            this.field788 = 19;
        }
        int var3;
        if (arg0.field849 >= this.field849) {
            var3 = this.field849;
        } else {
            var3 = arg0.field849;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class207.field3708[arg0.field822[var4] & 0xFF] > class207.field3708[this.field822[var4] & 0xFF]) {
                return -1;
            }
            if (class207.field3708[arg0.field822[var4] & 0xFF] < class207.field3708[this.field822[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0.field849 > this.field849) {
            return -1;
        } else if (arg0.field849 < this.field849) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Ldj;I)Z")
    public final boolean method314(class44 arg0, int arg1) {
        field804++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 > -24) {
            this.hashCode();
        }
        if (this.field849 != arg0.field849) {
            return false;
        }
        if (!this.field801 || !arg0.field801) {
            if (this.field788 == 0) {
                this.field788 = this.method304(true);
                if (this.field788 == 0) {
                    this.field788 = 1;
                }
            }
            if (arg0.field788 == 0) {
                arg0.field788 = arg0.method304(true);
                if (arg0.field788 == 0) {
                    arg0.field788 = 1;
                }
            }
            if (this.field788 != arg0.field788) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field849; var3++) {
            if (this.field822[var3] != arg0.field822[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLdj;)I")
    public final int method315(byte arg0, class44 arg1) {
        field831++;
        int var3;
        if (this.field849 > arg1.field849) {
            var3 = arg1.field849;
        } else {
            var3 = this.field849;
        }
        int var4 = -23 / ((-arg0 - 25) / 47);
        for (int var5 = 0; var5 < var3; var5++) {
            if ((arg1.field822[var5] & 0xFF) > (this.field822[var5] & 0xFF)) {
                return -1;
            }
            if ((arg1.field822[var5] & 0xFF) < (this.field822[var5] & 0xFF)) {
                return 1;
            }
        }
        if (this.field849 < arg1.field849) {
            return -1;
        } else if (arg1.field849 < this.field849) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
    public static void method316(int arg0) {
        field799 = null;
        field797 = null;
        field836 = null;
        field787 = null;
        field842 = null;
        field816 = null;
        field832 = null;
        field848 = null;
        field815 = null;
        field844 = null;
        if (arg0 != 255) {
            method316(64);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)Ldj;")
    public final class44 method317(byte arg0) {
        field806++;
        if (arg0 != 114) {
            this.method331((byte) -32);
        }
        class44 var2 = class38.method263((byte) 3, this.method306(-58));
        return var2 == null ? class212.field3814 : var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Ldj;")
    public final class44 method318(int arg0, int arg1, int arg2) {
        field811++;
        class44 var4 = new class44();
        var4.field822 = new byte[arg1 - arg2];
        if (arg0 <= 124) {
            this.method319(-115, -91);
        }
        var4.field849 = arg1 - arg2;
        class18.method146(this.field822, arg2, var4.field822, 0, var4.field849);
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)I")
    public final int method319(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field823++;
        if (arg0 != -1) {
            return -3;
        }
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field849; var6++) {
            int var7 = this.field822[var6] & 0xFF;
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
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var3 + var7;
            if (var8 / arg1 != var3) {
                throw new NumberFormatException();
            }
            var5 = true;
            var3 = var8;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)Ldj;")
    public final class44 method320(boolean arg0) {
        field808++;
        class44 var2 = new class44();
        var2.field849 = this.field849;
        var2.field822 = new byte[this.field849];
        boolean var3 = true;
        int var4 = 0;
        if (arg0) {
            return null;
        }
        while (var4 < this.field849) {
            byte var5 = this.field822[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field822[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field822[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field822[var4] = var5;
            }
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)Z")
    private final boolean method321(int arg0, int arg1) {
        field803++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != 1981220580) {
            field842 = null;
        }
        for (int var6 = 0; var6 < this.field849; var6++) {
            int var7 = this.field822[var6] & 0xFF;
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
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Z)Ldj;")
    public final class44 method322(boolean arg0) {
        class44 var2 = new class44();
        field834++;
        byte var3 = 2;
        if (!arg0) {
            this.method323(false, null);
        }
        var2.field849 = this.field849;
        var2.field822 = new byte[this.field849];
        for (int var4 = 0; var4 < this.field849; var4++) {
            byte var5 = this.field822[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var2.field822[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLdj;)Z")
    public final boolean method323(boolean arg0, class44 arg1) {
        field839++;
        if (this.field849 < arg1.field849) {
            return false;
        }
        if (!arg0) {
            field842 = null;
        }
        for (int var3 = 0; var3 < arg1.field849; var3++) {
            if (this.field822[var3] != arg1.field822[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)I")
    public final int method324(int arg0, int arg1, int arg2) {
        field793++;
        byte var4 = (byte) arg2;
        if (arg0 >= -122) {
            this.method315((byte) 54, null);
        }
        for (int var5 = arg1; var5 < this.field849; var5++) {
            if (this.field822[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)Ldj;")
    public final class44 method325(int arg0) {
        field807++;
        long var2 = this.method299((byte) -46);
        synchronized (field851 == null ? (field851 = method342("dj")) : field851) {
            if (arg0 != -62) {
                return null;
            }
            if (class175.field3034 == null) {
                class175.field3034 = new class120(4096);
            } else {
                for (class169 var6 = (class169) class175.field3034.method828(var2, (byte) -40); var6 != null; var6 = (class169) class175.field3034.method833(arg0 + 61)) {
                    if (this.method314(var6.field2923, -89)) {
                        return var6.field2923;
                    }
                }
            }
            class169 var8 = new class169();
            var8.field2923 = this;
            this.field801 = false;
            class175.field3034.method830(var8, var2, 1);
            return this;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILdj;)I")
    public final int method326(byte arg0, int arg1, class44 arg2) {
        int[] var4 = new int[arg2.field849];
        int[] var5 = new int[256];
        field800++;
        int[] var6 = new int[arg2.field849];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field849;
        }
        int var8 = -16 % ((14 - arg0) / 63);
        for (int var9 = 1; var9 <= arg2.field849; var9++) {
            var4[var9 - 1] = (arg2.field849 << 1) - var9;
            var5[class29.method202(arg2.field822[var9 - 1], 255)] = arg2.field849 - var9;
        }
        int var10 = arg2.field849 + 1;
        for (int var11 = arg2.field849; var11 > 0; var11--) {
            var6[var11 - 1] = var10;
            while (arg2.field849 >= var10 && arg2.field822[var10 - 1] != arg2.field822[var11 - 1]) {
                if (var4[var10 - 1] >= arg2.field849 - var11) {
                    var4[var10 - 1] = arg2.field849 - var11;
                }
                var10 = var6[var10 - 1];
            }
            var10--;
        }
        int var12 = var10;
        int var13 = arg2.field849 + 1 - var10;
        int var14 = 1;
        int var15 = 0;
        for (int var16 = 1; var16 <= var13; var16++) {
            var6[var16 - 1] = var15;
            while (var15 >= 1 && arg2.field822[var15 - 1] != arg2.field822[var16 - 1]) {
                var15 = var6[var15 - 1];
            }
            var15++;
        }
        while (var12 < arg2.field849) {
            for (int var19 = var14; var19 <= var12; var19++) {
                if (var4[var19 - 1] >= arg2.field849 + var12 - var19) {
                    var4[var19 - 1] = arg2.field849 + var12 - var19;
                }
            }
            var14 = var12 + 1;
            var12 = var12 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg2.field849 + arg1 - 1; var17 < this.field849; var17 += Math.max(var5[this.field822[var17] & 0xFF], var4[var18])) {
            for (var18 = arg2.field849 - 1; var18 >= 0 && this.field822[var17] == arg2.field822[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)[B")
    public final byte[] method327(byte arg0) {
        field825++;
        byte[] var2 = new byte[this.field849];
        if (arg0 <= 74) {
            return null;
        } else {
            class18.method146(this.field822, 0, var2, 0, this.field849);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZ)Ldj;")
    public final class44 method328(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return null;
        }
        byte var4 = (byte) arg1;
        field843++;
        class44 var5 = new class44();
        byte var6 = (byte) arg0;
        var5.field849 = this.field849;
        var5.field822 = new byte[this.field849];
        for (int var7 = 0; var7 < this.field849; var7++) {
            byte var8 = this.field822[var7];
            if (var4 == var8) {
                var5.field822[var7] = var6;
            } else {
                var5.field822[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method329(Applet arg0, int arg1) throws Throwable {
        field850++;
        String var3 = new String(this.field822, arg1, this.field849);
        class167.method1062(arg0, var3, 29125);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Ldj;Z)Z")
    public final boolean method330(class44 arg0, boolean arg1) {
        field830++;
        if (arg0 == null) {
            return false;
        }
        if (!arg1) {
            this.equals(null);
        }
        if (this.field849 != arg0.field849) {
            return false;
        }
        for (int var3 = 0; var3 < this.field849; var3++) {
            byte var4 = this.field822[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg0.field822[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)I")
    public final int method331(byte arg0) {
        field824++;
        if (arg0 != -83) {
            field848 = null;
        }
        return this.method319(-1, 10);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)Ldj;")
    public final class44 method332(int arg0, byte arg1) {
        field812++;
        return arg1 < 2 ? null : this.method318(126, this.field849, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
    public final int method333(FontMetrics arg0, boolean arg1) {
        field792++;
        String var3;
        try {
            var3 = new String(this.field822, 0, this.field849, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field822, 0, this.field849);
        }
        if (!arg1) {
            field797 = null;
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!dj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field846++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/applet/Applet;)Ldj;")
    public final class44 method334(int arg0, Applet arg1) {
        field837++;
        String var3 = new String(this.field822, 0, this.field849);
        int var4 = 85 % ((arg0 - 80) / 40);
        String var5 = arg1.getParameter(var3);
        return var5 == null ? null : class59.method451(var5, 109);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(Z)V")
    public final void method335(boolean arg0) {
        field819++;
        String var2;
        try {
            var2 = new String(this.field822, 0, this.field849, "ISO-8859-1");
            if (!arg0) {
                field815 = null;
            }
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field822, 0, this.field849);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)Ldj;")
    public final class44 method336(byte arg0) {
        class44 var2 = new class44();
        var2.field849 = this.field849;
        if (arg0 != -103) {
            this.method333(null, true);
        }
        field789++;
        var2.field822 = new byte[this.field849];
        for (int var3 = 0; var3 < this.field849; var3++) {
            var2.field822[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(Ldj;Z)Ldj;")
    public final class44 method337(class44 arg0, boolean arg1) {
        field847++;
        if (arg1) {
            this.method304(true);
        }
        if (!this.field801) {
            throw new IllegalArgumentException();
        }
        this.field788 = 0;
        if (this.field822.length < this.field849 + arg0.field849) {
            int var3;
            for (var3 = 1; var3 < this.field849 + arg0.field849; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class18.method146(this.field822, 0, var4, 0, this.field849);
            this.field822 = var4;
        }
        class18.method146(arg0.field822, 0, this.field822, this.field849, arg0.field849);
        this.field849 += arg0.field849;
        return this;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(II)Ldj;")
    public final class44 method338(int arg0, int arg1) {
        field809++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class44 var3 = new class44();
        var3.field822 = new byte[this.field849 + 1];
        var3.field849 = this.field849 + 1;
        if (arg0 != 16227) {
            this.method306(28);
        }
        class18.method146(this.field822, 0, var3.field822, 0, this.field849);
        var3.field822[this.field849] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Ldj;")
    public final class44 method339(int arg0) {
        field802++;
        int var2 = this.field849;
        int var3;
        for (var3 = 0; this.field849 > var3 && (this.field822[var3] >= 0 && this.field822[var3] <= 32 || (this.field822[var3] & 0xFF) == 160); var3++) {
        }
        if (arg0 != -11196) {
            this.method337(null, true);
        }
        while (var2 > var3 && (this.field822[var2 - 1] >= 0 && this.field822[var2 - 1] <= 32 || (this.field822[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field849 == var2) {
            return this;
        }
        class44 var4 = new class44();
        var4.field849 = var2 - var3;
        var4.field822 = new byte[var4.field849];
        for (int var5 = 0; var5 < var4.field849; var5++) {
            var4.field822[var5] = this.field822[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)I")
    public final int method340(int arg0) {
        if (arg0 == 3) {
            field827++;
            return this.field849;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method341(int arg0, Graphics arg1, int arg2, byte arg3) {
        if (arg3 != 14) {
            return;
        }
        field828++;
        String var5;
        try {
            var5 = new String(this.field822, 0, this.field849, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field822, 0, this.field849);
        }
        arg1.drawString(var5, arg2, arg0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method342(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
