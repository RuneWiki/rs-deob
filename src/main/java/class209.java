import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class209 implements class135 {

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Z")
    private boolean field3780 = true;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field3779 = 0;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lcc;")
    public static class209 field3781 = class95.method669(103, ")2");

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Lcc;")
    public static class209 field3788 = class95.method669(112, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lcc;")
    public static class209 field3804 = class95.method669(126, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "[[I")
    public static int[][] field3812 = new int[5][5000];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field3815;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field3816;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "[B")
    public byte[] field3786;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "[I")
    public static int[] field3785;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
    public static int[] field3791;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "[Lal;")
    public static class231[] field3765;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLcc;)I")
    public final int method1443(boolean arg0, class209 arg1) {
        field3796++;
        return arg0 ? this.method1450(-20711, arg1, 0) : -26;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/applet/Applet;I)Lcc;")
    public final class209 method1444(Applet arg0, int arg1) {
        field3782++;
        String var3 = new String(this.field3786, arg1, this.field3811);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class21.method183(var4, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lcc;B)Lcc;")
    public final class209 method1445(class209 arg0, byte arg1) {
        field3813++;
        if (!this.field3780) {
            throw new IllegalArgumentException();
        }
        if (this.field3786.length < (this.field3811 + arg0.field3811)) {
            int var3;
            for (var3 = 1; var3 < this.field3811 + arg0.field3811; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class270.method1847(this.field3786, 0, var4, 0, this.field3811);
            this.field3786 = var4;
        }
        if (arg1 == -76) {
            class270.method1847(arg0.field3786, 0, this.field3786, this.field3811, arg0.field3811);
            this.field3811 += arg0.field3811;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)J")
    public final long method1446(boolean arg0) {
        field3771++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field3811; var4++) {
            var2 = (var2 << 5) + (long) (this.field3786[var4] & 0xFF) - var2;
        }
        if (arg0) {
            field3791 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLcc;)I")
    public final int method1447(byte arg0, class209 arg1) {
        int var3;
        if (arg1.field3811 < this.field3811) {
            var3 = arg1.field3811;
        } else {
            var3 = this.field3811;
        }
        field3809++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field3786[var4] & 0xFF) < (arg1.field3786[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field3786[var4] & 0xFF) > (arg1.field3786[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0 != -112) {
            this.method1465(-12);
        }
        if (this.field3811 < arg1.field3811) {
            return -1;
        } else if (this.field3811 > arg1.field3811) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)J")
    public final long method1448(boolean arg0) {
        field3806++;
        long var2 = 0L;
        int var4 = 0;
        if (!arg0) {
            field3812 = null;
        }
        while (this.field3811 > var4 && var4 < 12) {
            var2 *= 37L;
            byte var5 = this.field3786[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
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

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[Lcc;")
    public final class209[] method1449(byte arg0, int arg1) {
        field3768++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3811; var4++) {
            if (this.field3786[var4] == arg1) {
                var3++;
            }
        }
        class209[] var5 = new class209[var3 + 1];
        int var6 = -80 % ((-arg0 - 4) / 50);
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            int var10;
            for (var10 = 0; this.field3786[var8 + var10] != arg1; var10++) {
            }
            var5[var7++] = this.method1466(123, var8 + var10, var8);
            var8 += var10 + 1;
        }
        var5[var3] = this.method1466(125, this.field3811, var8);
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILcc;I)I")
    public final int method1450(int arg0, class209 arg1, int arg2) {
        field3801++;
        int var4 = arg1.field3811;
        if (arg2 >= this.field3811) {
            return var4 == 0 ? this.field3811 : -1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (var4 == 0) {
            return arg2;
        }
        byte[] var5 = arg1.field3786;
        byte var6 = var5[0];
        int var7 = this.field3811 - var4;
        for (int var8 = arg2; var8 <= var7; var8++) {
            if (this.field3786[var8] != var6) {
                do {
                    var8++;
                    if (var8 > var7) {
                        return -1;
                    }
                } while (this.field3786[var8] != var6);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            int var11 = 1;
            while (var11 < var4) {
                if (this.field3786[var10] != var5[var11]) {
                    var9 = false;
                    break;
                }
                var11++;
                var10++;
            }
            if (var9) {
                return var8;
            }
        }
        if (arg0 != -20711) {
            this.method1478(true);
        }
        return -1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lcc;")
    public final class209 method1451(int arg0, int arg1) {
        field3755++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field3780) {
            if (this.field3786.length == this.field3811) {
                int var3;
                for (var3 = 1; var3 <= this.field3811; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class270.method1847(this.field3786, 0, var4, 0, this.field3811);
                this.field3786 = var4;
            }
            if (arg0 != 31919) {
                this.hashCode();
            }
            this.field3786[this.field3811++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method1452(Applet arg0, int arg1) throws Throwable {
        String var3 = new String(this.field3786, 0, this.field3811);
        field3753++;
        int var4 = 39 % ((63 - arg1) / 51);
        class120.method849(var3, -27957, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lcc;B)Z")
    public final boolean method1453(class209 arg0, byte arg1) {
        field3807++;
        if (this.field3811 < arg0.field3811) {
            return false;
        } else if (arg1 == -59) {
            for (int var3 = 0; var3 < arg0.field3811; var3++) {
                byte var4 = this.field3786[var3];
                byte var5 = arg0.field3786[var3];
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
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lcc;")
    public final class209 method1454(int arg0) {
        field3773++;
        if (arg0 < 84) {
            field3812 = null;
        }
        int var2 = 0;
        int var3 = this.field3811;
        while (var2 < this.field3811 && (this.field3786[var2] >= 0 && this.field3786[var2] <= 32 || (this.field3786[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field3786[var3 - 1] >= 0 && this.field3786[var3 - 1] <= 32 || (this.field3786[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field3811 == var3) {
            return this;
        }
        class209 var4 = new class209();
        var4.field3811 = var3 - var2;
        var4.field3786 = new byte[var4.field3811];
        for (int var5 = 0; var5 < var4.field3811; var5++) {
            var4.field3786[var5] = this.field3786[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)[B")
    public final byte[] method1455(byte arg0) {
        int var2 = 35 / ((arg0 - 50) / 37);
        byte[] var3 = new byte[this.field3811];
        class270.method1847(this.field3786, 0, var3, 0, this.field3811);
        field3774++;
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLjava/net/URL;)Ljava/net/URL;")
    public final URL method1456(boolean arg0, URL arg1) throws MalformedURLException {
        field3761++;
        if (arg0) {
            field3765 = null;
        }
        return new URL(arg1, new String(this.field3786, 0, this.field3811));
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BLcc;)Z")
    public final boolean method1457(byte arg0, class209 arg1) {
        field3787++;
        if (arg1 == null) {
            return false;
        } else if (arg1 == this) {
            return true;
        } else if (this.field3811 == arg1.field3811) {
            byte[] var3 = arg1.field3786;
            byte[] var4 = this.field3786;
            if (arg0 >= -62) {
                this.field3780 = false;
            }
            for (int var5 = 0; var5 < this.field3811; var5++) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[BIII)I")
    public final int method1458(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        int var6 = -11 / ((arg0 + 61) / 63);
        class270.method1847(this.field3786, arg4, arg1, arg3, arg2 - arg4);
        field3802++;
        return arg2 - arg4;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)Lcc;")
    public final class209 method1459(byte arg0) {
        field3815++;
        if (arg0 > -52) {
            field3765 = null;
        }
        class209 var2 = new class209();
        boolean var3 = true;
        var2.field3811 = this.field3811;
        var2.field3786 = new byte[this.field3811];
        for (int var4 = 0; var4 < this.field3811; var4++) {
            byte var5 = this.field3786[var4];
            if (var5 == 95) {
                var2.field3786[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field3786[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field3786[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)Lcc;")
    public final class209 method1460(byte arg0) {
        field3758++;
        if (!this.field3780) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 104) {
            method1470((class106) null, true);
        }
        if (this.field3786.length != this.field3811) {
            byte[] var2 = new byte[this.field3811];
            class270.method1847(this.field3786, 0, var2, 0, this.field3811);
            this.field3786 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lcc;")
    public final class209 method1461(int arg0, int arg1) {
        field3766++;
        return arg0 > -22 ? null : this.method1466(124, this.field3811, arg1);
    }

    @OriginalMember(owner = "client!cc", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3805++;
        return this.method1478(true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Ljava/net/URL;")
    public final URL method1462(int arg0) throws MalformedURLException {
        if (arg0 < 2) {
            this.hashCode();
        }
        field3800++;
        return new URL(new String(this.field3786, 0, this.field3811));
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/applet/Applet;B)Ljava/lang/Object;")
    public final Object method1463(Applet arg0, byte arg1) throws Throwable {
        field3778++;
        String var3 = new String(this.field3786, 0, this.field3811);
        if (arg1 != 110) {
            this.method1460((byte) -27);
        }
        Object var4 = class120.method850((Object[]) null, arg0, (byte) 8, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class281.method1897(0, var5.length, -29806, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public final void method1464(int arg0) {
        field3803++;
        if (arg0 < 64) {
            field3765 = null;
        }
        String var2;
        try {
            var2 = new String(this.field3786, 0, this.field3811, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field3786, 0, this.field3811);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Lcc;")
    public final class209 method1465(int arg0) {
        field3797++;
        class209 var2 = new class209();
        byte var3 = 2;
        var2.field3811 = this.field3811;
        var2.field3786 = new byte[this.field3811];
        for (int var4 = arg0; var4 < this.field3811; var4++) {
            byte var5 = this.field3786[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (!(var5 < 65 || var5 > 90) || !(var5 < -64 || var5 > -34 || var5 == -41)) {
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
            var2.field3786[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lcc;")
    public final class209 method1466(int arg0, int arg1, int arg2) {
        field3772++;
        class209 var4 = new class209();
        var4.field3811 = arg1 - arg2;
        var4.field3786 = new byte[arg1 - arg2];
        class270.method1847(this.field3786, arg2, var4.field3786, 0, var4.field3811);
        if (arg0 < 118) {
            field3812 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)Lcc;")
    public final class209 method1467(byte arg0) {
        field3793++;
        if (arg0 <= 7) {
            this.method1460((byte) 56);
        }
        class209 var2 = new class209();
        var2.field3811 = this.field3811;
        var2.field3786 = new byte[this.field3811];
        for (int var3 = 0; var3 < this.field3811; var3++) {
            byte var4 = this.field3786[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3786[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)Lcc;")
    public final class209 method1468(int arg0, int arg1) {
        field3764++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        if (arg1 > -66) {
            field3779 = 112;
        }
        class209 var3 = new class209();
        var3.field3786 = new byte[this.field3811 + 1];
        var3.field3811 = this.field3811 + 1;
        class270.method1847(this.field3786, 0, var3.field3786, 0, this.field3811);
        var3.field3786[this.field3811] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method1469(int arg0, FontMetrics arg1) {
        if (arg0 != -14408) {
            return 18;
        }
        field3760++;
        String var3;
        try {
            var3 = new String(this.field3786, 0, this.field3811, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3786, 0, this.field3811);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ltf;Z)V")
    public static final void method1470(class106 arg0, boolean arg1) {
        field3756++;
        int var2 = arg0.method760(255);
        class197.field3537 = new class11[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class197.field3537[var3] = new class11();
            class197.field3537[var3].field208 = arg0.method760(255);
            class197.field3537[var3].field221 = arg0.method750(-102);
        }
        class163.field2951 = arg0.method760(255);
        class262.field4725 = arg0.method760(255);
        class215.field3891 = arg0.method760(255);
        class62.field1232 = new class159[class262.field4725 - (class163.field2951 - 1)];
        for (int var4 = 0; var4 < class215.field3891; var4++) {
            int var5 = arg0.method760(255);
            class159 var6 = class62.field1232[var5] = new class159();
            var6.field2373 = arg0.method774((byte) 127);
            var6.field2379 = arg0.method746((byte) -100);
            var6.field2894 = class163.field2951 + var5;
            var6.field2897 = arg0.method750(-74);
            var6.field2902 = arg0.method750(-60);
        }
        class71.field1346 = arg0.method746((byte) -100);
        class80.field1494 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lcc;Lcc;Z)Lcc;")
    public final class209 method1471(class209 arg0, class209 arg1, boolean arg2) {
        int var4 = 0;
        field3757++;
        int var5 = this.field3811;
        int var6 = arg1.field3811 - arg0.field3811;
        while (true) {
            int var7 = this.method1450(-20711, arg0, var4);
            if (var7 < 0) {
                int var8 = 0;
                class209 var9 = class79.method554(-30159, var5);
                while (true) {
                    int var10 = this.method1450(-20711, arg0, var8);
                    if (var10 < 0) {
                        while (var8 < this.field3811) {
                            var9.method1451(31919, this.field3786[var8++] & 0xFF);
                        }
                        if (arg2) {
                            this.method1468(-27, 46);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method1451(31919, this.field3786[var8++] & 0xFF);
                    }
                    var9.method1445(arg1, (byte) -76);
                    var8 += arg0.field3811;
                }
            }
            var5 += var6;
            var4 = arg0.field3811 + var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lcc;I)Z")
    public final boolean method1472(class209 arg0, int arg1) {
        field3790++;
        if (this.field3811 < arg0.field3811) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field3811; var3++) {
            if (this.field3786[var3] != arg0.field3786[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(II)Z")
    private final boolean method1473(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field3795++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != 57) {
            this.method1444((Applet) null, -45);
        }
        for (int var6 = 0; var6 < this.field3811; var6++) {
            int var7 = this.field3786[var6] & 0xFF;
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
                return false;
            }
            if (arg0 <= var7) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(II)I")
    public final int method1474(int arg0, int arg1) {
        field3783++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3811; var6++) {
            int var7 = this.field3786[var6] & 0xFF;
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
        if (arg1 < 90) {
            field3789 = 15;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Lcc;")
    public final class209 method1475(byte arg0) {
        field3794++;
        int var2 = -3 % ((arg0 - 33) / 41);
        long var3 = this.method1446(false);
        synchronized (field3816 == null ? (field3816 = method1492("cc")) : field3816) {
            if (class268.field4797 == null) {
                class268.field4797 = new class255(4096);
            } else {
                for (class275 var6 = (class275) class268.field4797.method1755(var3, (byte) -79); var6 != null; var6 = (class275) class268.field4797.method1763(true)) {
                    if (this.method1457((byte) -98, var6.field4864)) {
                        return var6.field4864;
                    }
                }
            }
            class275 var8 = new class275();
            this.field3780 = false;
            var8.field4864 = this;
            class268.field4797.method1762(var8, var3, (byte) 73);
            return this;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lcc;IIZ)Lcc;")
    public final class209 method1476(class209 arg0, int arg1, int arg2, boolean arg3) {
        field3770++;
        if (!this.field3780) {
            throw new IllegalArgumentException();
        }
        if (!arg3) {
            this.method1444((Applet) null, -57);
        }
        if (arg1 < 0 || arg1 > arg2 || arg2 > arg0.field3811) {
            throw new IllegalArgumentException();
        }
        if (this.field3786.length < this.field3811 - (arg1 - arg2)) {
            int var5;
            for (var5 = 1; var5 < (this.field3811 + arg0.field3811); var5 += var5) {
            }
            byte[] var6 = new byte[var5];
            class270.method1847(this.field3786, 0, var6, 0, this.field3811);
            this.field3786 = var6;
        }
        class270.method1847(arg0.field3786, arg1, this.field3786, this.field3811, arg2 - arg1);
        this.field3811 += arg2 - arg1;
        return this;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)I")
    public final int method1477(byte arg0) {
        field3814++;
        if (arg0 < 103) {
            this.method1482(-55, -10, 96);
        }
        return this.method1474(10, 100);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Z)I")
    public final int method1478(boolean arg0) {
        field3752++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3811; var3++) {
            var2 = (var2 << 5) + (this.field3786[var3] & 0xFF) - var2;
        }
        return arg0 ? var2 : 78;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public final void method1479(byte arg0, int arg1, Graphics arg2, int arg3) {
        field3754++;
        if (arg0 != -64) {
            this.method1477((byte) 63);
        }
        String var5;
        try {
            var5 = new String(this.field3786, 0, this.field3811, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3786, 0, this.field3811);
        }
        arg2.drawString(var5, arg1, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3775++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(B)Lcc;")
    public final class209 method1480(byte arg0) {
        field3777++;
        if (arg0 >= -3) {
            field3781 = null;
        }
        class209 var2 = class56.method437(this.method1448(true), (byte) 120);
        return var2 == null ? class9.field190 : var2;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(II)I")
    public final int method1481(int arg0, int arg1) {
        int var3 = 0;
        byte var4 = (byte) arg0;
        if (arg1 != 32381) {
            return -103;
        }
        for (int var5 = 0; var5 < this.field3811; var5++) {
            if (this.field3786[var5] == var4) {
                var3++;
            }
        }
        field3784++;
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)I")
    public final int method1482(int arg0, int arg1, int arg2) {
        field3763++;
        byte var4 = (byte) arg2;
        if (arg0 != -1) {
            this.method1491(94, 27);
        }
        for (int var5 = arg1; var5 < this.field3811; var5++) {
            if (this.field3786[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lcc;B)Z")
    public final boolean method1483(class209 arg0, byte arg1) {
        field3776++;
        if (arg0 == null) {
            return false;
        } else if (this.field3811 == arg0.field3811) {
            for (int var3 = 0; var3 < this.field3811; var3++) {
                byte var4 = arg0.field3786[var3];
                byte var5 = this.field3786[var3];
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
            if (arg1 > -21) {
                this.method1471((class209) null, (class209) null, false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(B)V")
    public static void method1484(byte arg0) {
        field3791 = null;
        field3781 = null;
        field3765 = null;
        field3785 = null;
        if (arg0 != -66) {
            method1484((byte) 55);
        }
        field3812 = null;
        field3804 = null;
        field3788 = null;
    }

    @OriginalMember(owner = "client!cc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3799++;
        if (!arg0 instanceof class209) {
            throw new IllegalArgumentException();
        }
        return this.method1457((byte) -127, (class209) arg0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lcc;I)Z")
    public final boolean method1485(class209 arg0, int arg1) {
        field3767++;
        if (this.field3811 < arg0.field3811) {
            return false;
        }
        int var3 = this.field3811 - arg0.field3811;
        if (arg1 != 16990) {
            this.method1487(-91);
        }
        for (int var4 = 0; var4 < arg0.field3811; var4++) {
            if (this.field3786[var3 + var4] != arg0.field3786[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
    public final int method1486(int arg0) {
        field3810++;
        return arg0 == 5 ? this.field3811 : 17;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z")
    public final boolean method1487(int arg0) {
        field3808++;
        if (arg0 != 0) {
            this.equals((Object) null);
        }
        return this.method1473(10, 57);
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(B)Lcc;")
    public final class209 method1488(byte arg0) {
        class209 var2 = new class209();
        var2.field3811 = this.field3811;
        field3769++;
        var2.field3786 = new byte[var2.field3811];
        if (arg0 != 4) {
            field3781 = null;
        }
        for (int var3 = 0; var3 < this.field3811; var3++) {
            var2.field3786[this.field3811 - var3 - 1] = this.field3786[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(BLcc;)I")
    public final int method1489(byte arg0, class209 arg1) {
        int var3 = 0;
        field3759++;
        int var4 = 0;
        int var5 = arg1.field3811;
        int var6 = this.field3811;
        int var7 = arg1.field3811;
        int var8 = this.field3811;
        int var9 = 0;
        if (arg0 != 88) {
            this.field3786 = null;
        }
        int var10 = 0;
        while (var8 != 0 && var5 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field3786[var9] & 0xFF;
                var9++;
            }
            if (class119.method841(var4, arg0 + 19259)) {
                var6++;
            } else {
                var8--;
            }
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = arg1.field3786[var10] & 0xFF;
                var10++;
            }
            if (class119.method841(var3, arg0 + 19259)) {
                var7++;
            } else {
                var5--;
            }
            if (class182.field3302[var3] > class182.field3302[var4]) {
                return -1;
            }
            if (class182.field3302[var4] > class182.field3302[var3]) {
                return 1;
            }
        }
        if (var6 < var7) {
            return -1;
        } else if (var7 < var6) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(II)V")
    public final void method1490(int arg0, int arg1) {
        field3792++;
        if (!this.field3780) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field3786.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class270.method1847(this.field3786, 0, var4, 0, this.field3811);
                this.field3786 = var4;
            }
            for (int var5 = this.field3811; var5 < arg1; var5++) {
                this.field3786[var5] = 32;
            }
            if (arg0 != 0) {
                this.method1482(35, -91, 25);
            }
            this.field3811 = arg1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(II)I")
    public final int method1491(int arg0, int arg1) {
        if (arg0 != 111) {
            this.method1450(88, (class209) null, 127);
        }
        field3798++;
        return this.field3786[arg1] & 0xFF;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1492(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
