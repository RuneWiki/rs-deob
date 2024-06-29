import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class207 implements class38 {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Z")
    private boolean field3626 = true;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3664 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qk", name = "pb", descriptor = "Lqk;")
    public static class207 field3686 = class24.method212(255, ":chalreq:");

    @OriginalMember(owner = "client!qk", name = "lb", descriptor = "Lqk;")
    public static class207 field3682 = class24.method212(255, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "Lqk;")
    private static class207 field3678 = class24.method212(255, "Started 3d Library");

    @OriginalMember(owner = "client!qk", name = "nb", descriptor = "Lqk;")
    public static class207 field3684 = class24.method212(255, "Regarder dans cette direction");

    @OriginalMember(owner = "client!qk", name = "qb", descriptor = "[I")
    public static int[] field3687 = new int[2];

    @OriginalMember(owner = "client!qk", name = "mb", descriptor = "Lqk;")
    private static class207 field3683 = class24.method212(255, " is already on your ignore list)3");

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "Lqk;")
    public static class207 field3675 = field3683;

    @OriginalMember(owner = "client!qk", name = "rb", descriptor = "Lqk;")
    public static class207 field3688 = field3678;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "Lpk;")
    public static class99 field3662;

    @OriginalMember(owner = "client!qk", name = "kb", descriptor = "Lpk;")
    public static class99 field3681;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qk", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field3690;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "[B")
    public byte[] field3652;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "[I")
    public static int[] field3674;

    @OriginalMember(owner = "client!qk", name = "ob", descriptor = "[I")
    public static int[] field3685;

    @OriginalMember(owner = "client!qk", name = "sb", descriptor = "[I")
    public static int[] field3689;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "[S")
    public static short[] field3679;

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "[[B")
    public static byte[][] field3680;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lqk;")
    public final class207 method1423(int arg0) {
        field3639++;
        if (arg0 <= 112) {
            this.method1467(102, (class207) null);
        }
        boolean var2 = true;
        class207 var3 = new class207();
        var3.field3663 = this.field3663;
        var3.field3652 = new byte[this.field3663];
        for (int var4 = 0; var4 < this.field3663; var4++) {
            byte var5 = this.field3652[var4];
            if (var5 == 95) {
                var3.field3652[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field3652[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var3.field3652[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILqk;)I")
    public final int method1424(int arg0, class207 arg1) {
        int var3;
        if (this.field3663 <= arg1.field3663) {
            var3 = this.field3663;
        } else {
            var3 = arg1.field3663;
        }
        field3641++;
        if (arg0 <= 102) {
            return -108;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field3652[var4] & 0xFF) > (this.field3652[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field3652[var4] & 0xFF) < (this.field3652[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field3663 > this.field3663) {
            return -1;
        } else if (this.field3663 > arg1.field3663) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3640++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)J")
    public final long method1425(boolean arg0) {
        if (arg0) {
            this.method1427(-3, 84, -66);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field3663; var4++) {
            var2 = (var2 << 5) + (long) (this.field3652[var4] & 0xFF) - var2;
        }
        field3630++;
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
    private final boolean method1426(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field3677++;
        if (arg0 != 28959) {
            this.method1459(-40);
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3663; var6++) {
            int var7 = this.field3652[var6] & 0xFF;
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
            if (var7 >= arg1) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Lqk;")
    public final class207 method1427(int arg0, int arg1, int arg2) {
        field3623++;
        if (arg0 != -17195) {
            this.method1436((class207) null, (byte) -45);
        }
        class207 var4 = new class207();
        var4.field3663 = arg2 - arg1;
        var4.field3652 = new byte[arg2 - arg1];
        class274.method1857(this.field3652, arg1, var4.field3652, 0, var4.field3663);
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)J")
    public final long method1428(int arg0) {
        field3636++;
        long var2 = 0L;
        for (int var4 = arg0; var4 < this.field3663 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field3652[var4];
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

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII[B)I")
    public final int method1429(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = 64 % ((-arg2 - 1) / 39);
        field3644++;
        class274.method1857(this.field3652, arg3, arg4, arg1, arg0 - arg3);
        return arg0 - arg3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method1430(Applet arg0, int arg1) throws Throwable {
        field3649++;
        if (arg1 > -88) {
            field3680 = null;
        }
        String var3 = new String(this.field3652, 0, this.field3663);
        class181.method1284(var3, arg0, -25889);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I")
    public final int method1431(int arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            this.method1456(107, -27);
        }
        field3670++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field3663; var5++) {
            if (this.field3652[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lqk;")
    public final class207 method1432(byte arg0) {
        field3631++;
        class207 var2 = class21.method125(-37, this.method1428(0));
        if (arg0 != 108) {
            field3682 = null;
        }
        return var2 == null ? class173.field3109 : var2;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)Z")
    public final boolean method1433(byte arg0) {
        int var2 = -62 % ((arg0 - 6) / 33);
        field3619++;
        return this.method1426(28959, 10);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqk;B)Z")
    public final boolean method1434(class207 arg0, byte arg1) {
        if (arg1 > -60) {
            field3679 = null;
        }
        field3668++;
        if (this.field3663 < arg0.field3663) {
            return false;
        }
        int var3 = this.field3663 - arg0.field3663;
        for (int var4 = 0; var4 < arg0.field3663; var4++) {
            if (this.field3652[var4 + var3] != arg0.field3652[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLjava/applet/Applet;)Lqk;")
    public final class207 method1435(byte arg0, Applet arg1) {
        field3672++;
        String var3 = new String(this.field3652, 0, this.field3663);
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != -72) {
                this.method1423(-51);
            }
            return class156.method1140(var4, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Lqk;B)Z")
    public final boolean method1436(class207 arg0, byte arg1) {
        field3635++;
        if (arg0 == null) {
            return false;
        } else if (arg0 == this) {
            return true;
        } else if (this.field3663 == arg0.field3663) {
            byte[] var3 = this.field3652;
            byte[] var4 = arg0.field3652;
            int var5 = 0;
            int var6 = -67 / ((-arg1 - 28) / 53);
            while (this.field3663 > var5) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
                var5++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3654++;
        if (!arg0 instanceof class207) {
            throw new IllegalArgumentException();
        }
        return this.method1436((class207) arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)Lqk;")
    public final class207 method1437(boolean arg0) {
        field3658++;
        long var2 = this.method1425(false);
        synchronized (field3690 == null ? (field3690 = method1471("qk")) : field3690) {
            if (class115.field2002 == null) {
                class115.field2002 = new class275(4096);
            } else {
                for (class165 var5 = (class165) class115.field2002.method1867(var2, true); var5 != null; var5 = (class165) class115.field2002.method1869(255)) {
                    if (this.method1436(var5.field2921, (byte) -87)) {
                        return var5.field2921;
                    }
                }
            }
            class165 var7 = new class165();
            this.field3626 = arg0;
            var7.field2921 = this;
            class115.field2002.method1863((byte) 59, var7, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Lqk;")
    public final class207 method1438(int arg0) {
        field3634++;
        if (!this.field3626) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 0) {
            this.equals((Object) null);
        }
        if (this.field3652.length != this.field3663) {
            byte[] var2 = new byte[this.field3663];
            class274.method1857(this.field3652, 0, var2, 0, this.field3663);
            this.field3652 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)Lqk;")
    public final class207 method1439(int arg0, byte arg1) {
        int var3 = -78 % ((-arg1 - 30) / 54);
        field3669++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field3626) {
            if (this.field3652.length == this.field3663) {
                int var4;
                for (var4 = 1; var4 <= this.field3663; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class274.method1857(this.field3652, 0, var5, 0, this.field3663);
                this.field3652 = var5;
            }
            this.field3652[this.field3663++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method1440(FontMetrics arg0, int arg1) {
        if (arg1 != 2866) {
            return -47;
        }
        String var3;
        try {
            var3 = new String(this.field3652, 0, this.field3663, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3652, 0, this.field3663);
        }
        field3629++;
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLqk;)Z")
    public final boolean method1441(byte arg0, class207 arg1) {
        if (arg0 != -99) {
            field3680 = null;
        }
        field3627++;
        if (this.field3663 < arg1.field3663) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field3663; var3++) {
            byte var4 = arg1.field3652[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = this.field3652[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)I")
    public final int method1442(int arg0) {
        if (arg0 >= -52) {
            field3685 = null;
        }
        field3624++;
        return this.method1456(10, -49);
    }

    @OriginalMember(owner = "client!qk", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3632++;
        return this.method1448(255);
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)Lqk;")
    public final class207 method1443(int arg0) {
        int var2 = this.field3663;
        int var3;
        for (var3 = 0; var3 < this.field3663 && (this.field3652[var3] >= 0 && this.field3652[var3] <= 32 || (this.field3652[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field3652[var2 - 1] >= 0 && this.field3652[var2 - 1] <= 32 || (this.field3652[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        field3648++;
        if (var3 == 0 && this.field3663 == var2) {
            return this;
        }
        class207 var4 = new class207();
        var4.field3663 = var2 - var3;
        int var5 = 63 % ((-arg0 - 62) / 34);
        var4.field3652 = new byte[var4.field3663];
        for (int var6 = 0; var6 < var4.field3663; var6++) {
            var4.field3652[var6] = this.field3652[var3 + var6];
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Lqk;")
    public final class207 method1444(byte arg0) {
        field3671++;
        class207 var2 = new class207();
        if (arg0 != -76) {
            this.field3652 = null;
        }
        var2.field3663 = this.field3663;
        var2.field3652 = new byte[this.field3663];
        for (int var3 = 0; var3 < this.field3663; var3++) {
            byte var4 = this.field3652[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3652[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)[Lqk;")
    public final class207[] method1445(int arg0, int arg1) {
        field3642++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3663; var4++) {
            if (this.field3652[var4] == arg0) {
                var3++;
            }
        }
        class207[] var5 = new class207[var3 + 1];
        int var6 = -114 / ((arg1 + 11) / 57);
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            int var10;
            for (var10 = 0; this.field3652[var8 + var10] != arg0; var10++) {
            }
            var5[var7++] = this.method1427(-17195, var8, var8 + var10);
            var8 += var10 + 1;
        }
        var5[var3] = this.method1427(-17195, var8, this.field3663);
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V")
    public final void method1446(int arg0) {
        if (arg0 >= -38) {
            return;
        }
        field3638++;
        String var2;
        try {
            var2 = new String(this.field3652, 0, this.field3663, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field3652, 0, this.field3663);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLqk;Lqk;)Lqk;")
    public final class207 method1447(byte arg0, class207 arg1, class207 arg2) {
        if (arg0 < 3) {
            return null;
        }
        field3622++;
        int var4 = this.field3663;
        int var5 = arg1.field3663 - arg2.field3663;
        int var6 = 0;
        while (true) {
            int var7 = this.method1469(true, var6, arg2);
            if (var7 < 0) {
                int var8 = 0;
                class207 var9 = class191.method1335((byte) 100, var4);
                while (true) {
                    int var10 = this.method1469(true, var8, arg2);
                    if (var10 < 0) {
                        while (this.field3663 > var8) {
                            var9.method1439(this.field3652[var8++] & 0xFF, (byte) 80);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method1439(this.field3652[var8++] & 0xFF, (byte) -105);
                    }
                    var9.method1463(arg1, false);
                    var8 += arg2.field3663;
                }
            }
            var6 = arg2.field3663 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)I")
    public final int method1448(int arg0) {
        field3653++;
        int var2 = 0;
        if (arg0 == 255) {
            for (int var3 = 0; var3 < this.field3663; var3++) {
                var2 = (var2 << 5) + (this.field3652[var3] & 0xFF) - var2;
            }
            return var2;
        } else {
            return 123;
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)Lqk;")
    public final class207 method1449(byte arg0) {
        field3650++;
        class207 var2 = new class207();
        var2.field3663 = this.field3663;
        var2.field3652 = new byte[var2.field3663];
        if (arg0 == -116) {
            for (int var3 = 0; var3 < this.field3663; var3++) {
                var2.field3652[this.field3663 - var3 - 1] = this.field3652[var3];
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)I")
    public final int method1450(byte arg0) {
        int var2 = 33 / ((-arg0 - 59) / 51);
        field3645++;
        return this.field3663;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)[B")
    public final byte[] method1451(int arg0) {
        field3646++;
        int var2 = 34 % ((-arg0 - 26) / 49);
        byte[] var3 = new byte[this.field3663];
        class274.method1857(this.field3652, 0, var3, 0, this.field3663);
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method1452(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 23681) {
            field3685 = null;
        }
        field3660++;
        String var5;
        try {
            var5 = new String(this.field3652, 0, this.field3663, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3652, 0, this.field3663);
        }
        arg0.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(ILqk;)Z")
    public final boolean method1453(int arg0, class207 arg1) {
        field3647++;
        if (this.field3663 < arg1.field3663) {
            return false;
        }
        for (int var3 = arg0; var3 < arg1.field3663; var3++) {
            if (this.field3652[var3] != arg1.field3652[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
    public final URL method1454(int arg0, URL arg1) throws MalformedURLException {
        field3661++;
        if (arg0 != 0) {
            this.method1427(9, 83, -37);
        }
        return new URL(arg1, new String(this.field3652, 0, this.field3663));
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(IB)V")
    public final void method1455(int arg0, byte arg1) {
        field3665++;
        if (!this.field3626) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field3652.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class274.method1857(this.field3652, 0, var4, 0, this.field3663);
                this.field3652 = var4;
            }
            for (int var5 = this.field3663; var5 < arg0; var5++) {
                this.field3652[var5] = 32;
            }
            this.field3663 = arg0;
            if (arg1 < 42) {
                field3678 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)I")
    public final int method1456(int arg0, int arg1) {
        if (arg1 != -49) {
            this.method1469(false, 34, (class207) null);
        }
        field3656++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field3663; var6++) {
            int var7 = this.field3652[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var5 = true;
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
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg0 * var3 + var7;
            if (var8 / arg0 != var3) {
                throw new NumberFormatException();
            }
            var4 = true;
            var3 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(II)I")
    public final int method1457(int arg0, int arg1) {
        if (arg1 == -12675) {
            field3667++;
            return this.field3652[arg0] & 0xFF;
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqk;I)I")
    public final int method1458(class207 arg0, int arg1) {
        int var3 = 0;
        int var4 = this.field3663;
        int var5 = 0;
        int var6 = arg0.field3663;
        field3651++;
        int var7 = this.field3663;
        int var8 = arg0.field3663;
        if (arg1 != 101) {
            return -7;
        }
        int var9 = 0;
        int var10 = 0;
        while (var4 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field3652[var9] & 0xFF;
                var9++;
            }
            if (class282.method1918(15255, var3)) {
                var7++;
            } else {
                var4--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg0.field3652[var10] & 0xFF;
                var10++;
            }
            if (class282.method1918(15255, var5)) {
                var8++;
            } else {
                var6--;
            }
            if (class58.field1063[var3] < class58.field1063[var5]) {
                return -1;
            }
            if (class58.field1063[var5] < class58.field1063[var3]) {
                return 1;
            }
        }
        if (var8 > var7) {
            return -1;
        } else if (var7 > var8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)Lqk;")
    public final class207 method1459(int arg0) {
        class207 var2 = new class207();
        byte var3 = 2;
        var2.field3663 = this.field3663;
        var2.field3652 = new byte[this.field3663];
        for (int var4 = arg0; var4 < this.field3663; var4++) {
            byte var5 = this.field3652[var4];
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
            var2.field3652[var4] = var5;
        }
        field3659++;
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)Lqk;")
    public final class207 method1460(byte arg0, int arg1) {
        field3621++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg0 == -38) {
            class207 var3 = new class207();
            var3.field3652 = new byte[this.field3663 + 1];
            var3.field3663 = this.field3663 + 1;
            class274.method1857(this.field3652, 0, var3.field3652, 0, this.field3663);
            var3.field3652[this.field3663] = (byte) arg1;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V")
    public static void method1461(int arg0) {
        field3689 = null;
        if (arg0 <= 41) {
            field3681 = null;
        }
        field3679 = null;
        field3685 = null;
        field3680 = null;
        field3662 = null;
        field3678 = null;
        field3683 = null;
        field3684 = null;
        field3674 = null;
        field3681 = null;
        field3686 = null;
        field3682 = null;
        field3688 = null;
        field3687 = null;
        field3664 = null;
        field3675 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqk;Z)Z")
    public final boolean method1462(class207 arg0, boolean arg1) {
        if (!arg1) {
            return true;
        }
        field3620++;
        if (arg0 == null) {
            return false;
        } else if (this.field3663 == arg0.field3663) {
            for (int var3 = 0; var3 < this.field3663; var3++) {
                byte var4 = arg0.field3652[var3];
                byte var5 = this.field3652[var3];
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
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Lqk;Z)Lqk;")
    public final class207 method1463(class207 arg0, boolean arg1) {
        field3673++;
        if (arg1) {
            field3676 = -50;
        }
        if (!this.field3626) {
            throw new IllegalArgumentException();
        }
        if ((this.field3663 + arg0.field3663) > this.field3652.length) {
            int var3;
            for (var3 = 1; var3 < (this.field3663 + arg0.field3663); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class274.method1857(this.field3652, 0, var4, 0, this.field3663);
            this.field3652 = var4;
        }
        class274.method1857(arg0.field3652, 0, this.field3652, this.field3663, arg0.field3663);
        this.field3663 += arg0.field3663;
        return this;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(II)Lqk;")
    public final class207 method1464(int arg0, int arg1) {
        if (arg0 != -23886) {
            this.method1453(84, (class207) null);
        }
        field3655++;
        return this.method1427(-17195, arg1, this.field3663);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method1465(int arg0, Applet arg1) throws Throwable {
        field3625++;
        if (arg0 != 63) {
            field3680 = null;
        }
        String var3 = new String(this.field3652, 0, this.field3663);
        Object var4 = class181.method1285(arg1, var3, -21944);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class140.method971(var5.length, 0, arg0 ^ 0x3D, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "(I)Ljava/net/URL;")
    public final URL method1466(int arg0) throws MalformedURLException {
        field3657++;
        if (arg0 > -110) {
            field3680 = null;
        }
        return new URL(new String(this.field3652, 0, this.field3663));
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(ILqk;)I")
    public final int method1467(int arg0, class207 arg1) {
        if (arg0 == -1) {
            field3637++;
            return this.method1469(true, 0, arg1);
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqk;BII)Lqk;")
    public final class207 method1468(class207 arg0, byte arg1, int arg2, int arg3) {
        field3628++;
        if (!this.field3626) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg3 <= arg2 && arg0.field3663 >= arg2) {
            if ((this.field3663 + arg2 - arg3) > this.field3652.length) {
                int var5;
                for (var5 = 1; var5 < this.field3663 + arg0.field3663; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class274.method1857(this.field3652, 0, var6, 0, this.field3663);
                this.field3652 = var6;
            }
            class274.method1857(arg0.field3652, arg3, this.field3652, this.field3663, arg2 - arg3);
            this.field3663 += arg2 - arg3;
            return arg1 > -58 ? null : this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZILqk;)I")
    public final int method1469(boolean arg0, int arg1, class207 arg2) {
        field3643++;
        int var4 = arg2.field3663;
        if (arg1 >= this.field3663) {
            return var4 == 0 ? this.field3663 : -1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (var4 == 0) {
            return arg1;
        }
        int var5 = this.field3663 - var4;
        byte[] var6 = arg2.field3652;
        byte var7 = var6[0];
        if (!arg0) {
            return -22;
        }
        for (int var8 = arg1; var8 <= var5; var8++) {
            if (this.field3652[var8] != var7) {
                do {
                    var8++;
                    if (var8 > var5) {
                        return -1;
                    }
                } while (this.field3652[var8] != var7);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            int var11 = 1;
            while (var4 > var11) {
                if (this.field3652[var10] != var6[var11]) {
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
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "(I)Ldg;")
    public static final class139 method1470(int arg0) {
        int var1 = class241.field4402[0] * class107.field1895[arg0];
        field3633++;
        byte[] var2 = class185.field3286[0];
        class139 var5;
        if (class44.field865[0]) {
            byte[] var6 = class134.field2327[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class281.method1906(class243.field4421[class121.method860(255, var2[var8])], class121.method860(-16777216, var6[var8] << 24));
            }
            var5 = new class50(class242.field4406, class230.field4224, class287.field5127[0], class170.field3021[0], class107.field1895[0], class241.field4402[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class243.field4421[class121.method860(var2[var4], 255)];
            }
            var5 = new class139(class242.field4406, class230.field4224, class287.field5127[0], class170.field3021[0], class107.field1895[0], class241.field4402[0], var3);
        }
        class116.method821((byte) -126);
        return var5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1471(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
