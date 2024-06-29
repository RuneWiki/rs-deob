import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class35 implements class27 {

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Z")
    private boolean field716 = true;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field717 = 0;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Ldd;")
    private static class35 field720 = class180.method1196((byte) -65, "Dec");

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Ldd;")
    private static class35 field729 = class180.method1196((byte) 127, "Apr");

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "[I")
    public static int[] field748 = new int[2048];

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Ldd;")
    private static class35 field739 = class180.method1196((byte) -121, "Nov");

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Ldd;")
    private static class35 field757 = class180.method1196((byte) 126, "Oct");

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "Ldd;")
    private static class35 field766 = class180.method1196((byte) -73, "Jan");

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Ldd;")
    public static class35 field754 = class180.method1196((byte) 126, "leuchten1:");

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "Ldd;")
    public static class35 field768 = class180.method1196((byte) 127, "(Y");

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "Ldd;")
    private static class35 field765 = class180.method1196((byte) -78, "Mar");

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field761 = 500;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Ldd;")
    private static class35 field741 = class180.method1196((byte) -69, "Create a free account");

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Ldd;")
    private static class35 field745 = class180.method1196((byte) 127, "Jul");

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Ldd;")
    private static class35 field719 = class180.method1196((byte) -127, "Jun");

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field750 = 128;

    @OriginalMember(owner = "client!dd", name = "tb", descriptor = "I")
    public static int field777 = 0;

    @OriginalMember(owner = "client!dd", name = "ub", descriptor = "Ldd;")
    public static class35 field778 = field741;

    @OriginalMember(owner = "client!dd", name = "wb", descriptor = "Ldd;")
    private static class35 field780 = class180.method1196((byte) -51, "Aug");

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Ldd;")
    private static class35 field747 = class180.method1196((byte) 126, "Feb");

    @OriginalMember(owner = "client!dd", name = "qb", descriptor = "Ldd;")
    private static class35 field774 = class180.method1196((byte) -48, "Sep");

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Ldd;")
    private static class35 field753 = class180.method1196((byte) 127, "May");

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[Ldd;")
    public static class35[] field709 = new class35[] { field766, field747, field765, field729, field753, field719, field745, field780, field774, field757, field739, field720 };

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field738 = -1;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Ll;")
    public static class107 field746 = new class107(32);

    @OriginalMember(owner = "client!dd", name = "xb", descriptor = "Z")
    public static boolean field781 = false;

    @OriginalMember(owner = "client!dd", name = "zb", descriptor = "Ldd;")
    public static class35 field783 = class180.method1196((byte) -20, "T");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!dd", name = "rb", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!dd", name = "sb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!dd", name = "vb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!dd", name = "yb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lbg;")
    public static class18 field707;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lag;")
    public static class8 field708;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dd", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field784;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[B")
    public byte[] field730;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLdd;)Z")
    public final boolean method317(byte arg0, class35 arg1) {
        field755++;
        if (arg1.field758 > this.field758) {
            return false;
        }
        if (arg0 != 95) {
            this.method340(2);
        }
        int var3 = this.field758 - arg1.field758;
        for (int var4 = 0; var4 < arg1.field758; var4++) {
            if (this.field730[var3 + var4] != arg1.field730[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field749++;
        return this.method328(0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Ldd;")
    public final class35 method318(int arg0) {
        field752++;
        if (!this.field716) {
            throw new IllegalArgumentException();
        }
        this.field773 = arg0;
        if (this.field730.length != this.field758) {
            byte[] var2 = new byte[this.field758];
            class156.method1048(this.field730, 0, var2, 0, this.field758);
            this.field730 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Ldd;")
    public final class35 method319(byte arg0) {
        class35 var2 = new class35();
        field744++;
        var2.field758 = this.field758;
        var2.field730 = new byte[this.field758];
        if (arg0 != 13) {
            return null;
        }
        for (int var3 = 0; var3 < this.field758; var3++) {
            byte var4 = this.field730[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field730[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Ljava/net/URL;")
    public final URL method320(boolean arg0) throws MalformedURLException {
        if (arg0) {
            field733++;
            return new URL(new String(this.field730, 0, this.field758));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)J")
    public final long method321(int arg0) {
        long var2 = 0L;
        field775++;
        int var4 = 0;
        if (arg0 != 21830) {
            return -80L;
        }
        while (var4 < this.field758 && var4 < 12) {
            byte var5 = this.field730[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I")
    public static final int method322(int arg0, int arg1, int arg2, int arg3) {
        field751++;
        if ((class40.field894[arg3][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class40.field894[1][arg0][arg1] & 0x2) == 0) {
            if (arg2 != 31771) {
                method322(-114, 100, -48, -125);
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Ldd;")
    public final class35 method323(int arg0) {
        if (arg0 != 14100) {
            field720 = null;
        }
        field756++;
        class35 var2 = class49.method436(this.method321(21830), false);
        return var2 == null ? class98.field2161 : var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Z")
    private final boolean method324(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = arg0;
        field769++;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field758; var6++) {
            int var7 = this.field730[var6] & 0xFF;
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
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)[B")
    public final byte[] method325(int arg0) {
        field760++;
        if (arg0 == -20306) {
            byte[] var2 = new byte[this.field758];
            class156.method1048(this.field730, 0, var2, 0, this.field758);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Ldd;")
    public final class35 method326(int arg0, int arg1, int arg2) {
        field759++;
        class35 var4 = new class35();
        var4.field730 = new byte[arg2 - arg0];
        var4.field758 = arg2 - arg0;
        class156.method1048(this.field730, arg0, var4.field730, 0, var4.field758);
        int var5 = -60 % ((62 - arg1) / 41);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BLdd;)I")
    public final int method327(byte arg0, class35 arg1) {
        if (arg0 < 55) {
            return 112;
        } else {
            field728++;
            return this.method336(true, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)I")
    public final int method328(int arg0) {
        field723++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field758; var3++) {
            var2 = (var2 << 5) + (this.field730[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BBIII)I")
    public final int method329(byte[] arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = 108 / ((90 - arg1) / 32);
        class156.method1048(this.field730, arg3, arg0, arg2, arg4 - arg3);
        field712++;
        return arg4 - arg3;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I")
    public final int method330(int arg0) {
        if (arg0 == 10) {
            field706++;
            return this.method355(10, (byte) 29);
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method331(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            field718 = 48;
        }
        String var5;
        try {
            var5 = new String(this.field730, 0, this.field758, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field730, 0, this.field758);
        }
        field732++;
        arg1.drawString(var5, arg3, arg2);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILdd;)Z")
    public final boolean method332(int arg0, class35 arg1) {
        field743++;
        if (arg1 == null) {
            return false;
        } else if (this.field758 == arg1.field758) {
            if (!this.field716 || !arg1.field716) {
                if (this.field773 == 0) {
                    this.field773 = this.method328(arg0 ^ 0x492C);
                    if (this.field773 == 0) {
                        this.field773 = 1;
                    }
                }
                if (arg1.field773 == 0) {
                    arg1.field773 = arg1.method328(0);
                    if (arg1.field773 == 0) {
                        arg1.field773 = 1;
                    }
                }
                if (this.field773 != arg1.field773) {
                    return false;
                }
            }
            if (arg0 != 18732) {
                return true;
            }
            for (int var3 = 0; var3 < this.field758; var3++) {
                if (this.field730[var3] != arg1.field730[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Ldd;")
    public final class35 method333(int arg0) {
        field742++;
        long var2 = this.method349(false);
        synchronized (field784 == null ? (field784 = method358("dd")) : field784) {
            if (class55.field1301 == null) {
                class55.field1301 = new class107(4096);
            } else {
                for (class126 var5 = (class126) class55.field1301.method796(true, var2); var5 != null; var5 = (class126) class55.field1301.method795((byte) -53)) {
                    if (this.method332(18732, var5.field2742)) {
                        return var5.field2742;
                    }
                }
            }
            class126 var7 = new class126();
            var7.field2742 = this;
            this.field716 = false;
            class55.field1301.method789(var7, true, var2);
            if (arg0 != -2512) {
                this.field716 = true;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Ldd;")
    public final class35 method334(int arg0, int arg1) {
        field721++;
        int var3 = -40 % ((arg0 + 54) / 54);
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field716) {
            this.field773 = 0;
            if (this.field730.length == this.field758) {
                int var4;
                for (var4 = 1; var4 <= this.field758; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class156.method1048(this.field730, 0, var5, 0, this.field758);
                this.field730 = var5;
            }
            this.field730[this.field758++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ldd;I)Z")
    public final boolean method335(class35 arg0, int arg1) {
        int var3 = -62 % (arg1 / 39);
        field714++;
        if (arg0.field758 > this.field758) {
            return false;
        }
        for (int var4 = 0; var4 < arg0.field758; var4++) {
            if (this.field730[var4] != arg0.field730[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZILdd;)I")
    public final int method336(boolean arg0, int arg1, class35 arg2) {
        field727++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg2.field758];
        int[] var6 = new int[arg2.field758];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg2.field758;
        }
        for (int var8 = 1; var8 <= arg2.field758; var8++) {
            var5[var8 - 1] = (arg2.field758 << 1) - var8;
            var4[class208.method1372(255, arg2.field730[var8 - 1])] = arg2.field758 - var8;
        }
        int var9 = arg2.field758 + 1;
        for (int var10 = arg2.field758; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg2.field758 >= var9 && arg2.field730[var9 - 1] != arg2.field730[var10 - 1]) {
                if (arg2.field758 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg2.field758 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field758 + 1 - var9;
        int var13 = 0;
        int var14 = 1;
        while (var14 <= var12) {
            var6[var14 - 1] = var13;
            while (var13 >= 1 && arg2.field730[var13 - 1] != arg2.field730[var14 - 1]) {
                var13 = var6[var13 - 1];
            }
            var14++;
            var13++;
        }
        int var15 = 1;
        while (var11 < arg2.field758) {
            for (int var18 = var15; var18 <= var11; var18++) {
                if (var5[var18 - 1] >= arg2.field758 + var11 - var18) {
                    var5[var18 - 1] = arg2.field758 + var11 - var18;
                }
            }
            var15 = var11 + 1;
            var11 = var11 + var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        if (!arg0) {
            field750 = 25;
        }
        int var17;
        for (int var16 = arg1 + arg2.field758 - 1; var16 < this.field758; var16 += Math.max(var4[this.field730[var16] & 0xFF], var5[var17])) {
            for (var17 = arg2.field758 - 1; var17 >= 0 && this.field730[var16] == arg2.field730[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field715++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!dd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field762++;
        if (!(arg0 instanceof class35)) {
            throw new IllegalArgumentException();
        }
        return this.method332(18732, (class35) arg0);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(ILdd;)Z")
    public final boolean method337(int arg0, class35 arg1) {
        int var3 = -60 / ((24 - arg0) / 38);
        field724++;
        if (arg1 == null) {
            return false;
        } else if (this.field758 == arg1.field758) {
            for (int var4 = 0; var4 < this.field758; var4++) {
                byte var5 = this.field730[var4];
                byte var6 = arg1.field730[var4];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public static void method338(boolean arg0) {
        field765 = null;
        field774 = null;
        if (!arg0) {
            return;
        }
        field719 = null;
        field745 = null;
        field778 = null;
        field739 = null;
        field757 = null;
        field754 = null;
        field783 = null;
        field748 = null;
        field709 = null;
        field753 = null;
        field729 = null;
        field708 = null;
        field747 = null;
        field707 = null;
        field766 = null;
        field768 = null;
        field780 = null;
        field720 = null;
        field741 = null;
        field746 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ldd;B)I")
    public final int method339(class35 arg0, byte arg1) {
        field771++;
        int var3;
        if (this.field758 <= arg0.field758) {
            var3 = this.field758;
        } else {
            var3 = arg0.field758;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field730[var4] & 0xFF) < (arg0.field730[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field730[var4] & 0xFF) > (arg0.field730[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field758 < arg0.field758) {
            return -1;
        } else if (this.field758 > arg0.field758) {
            return 1;
        } else {
            if (arg1 != 30) {
                this.method342(85, 124);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)Ldd;")
    public final class35 method340(int arg0) {
        int var2 = 0;
        field767++;
        while (this.field758 > var2 && (this.field730[var2] >= 0 && this.field730[var2] <= 32 || (this.field730[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field758; var3 > var2 && (this.field730[var3 - 1] >= 0 && this.field730[var3 - 1] <= 32 || (this.field730[var3 - 1] & 0xFF) == 160); var3--) {
        }
        int var4 = 115 / ((-arg0 - 74) / 37);
        if (var2 == 0 && this.field758 == var3) {
            return this;
        }
        class35 var5 = new class35();
        var5.field758 = var3 - var2;
        var5.field730 = new byte[var5.field758];
        for (int var6 = 0; var6 < var5.field758; var6++) {
            var5.field730[var6] = this.field730[var2 + var6];
        }
        return var5;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I")
    public final int method341(int arg0, int arg1) {
        int var3 = -59 / ((arg1 - 69) / 48);
        field735++;
        return this.field730[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)Ldd;")
    public final class35 method342(int arg0, int arg1) {
        field710++;
        if (arg0 != 6632) {
            field739 = null;
        }
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class35 var3 = new class35();
        var3.field730 = new byte[this.field758 + 1];
        var3.field758 = this.field758 + 1;
        class156.method1048(this.field730, 0, var3.field730, 0, this.field758);
        var3.field730[this.field758] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLdd;)Ldd;")
    public final class35 method343(boolean arg0, class35 arg1) {
        field725++;
        if (!this.field716) {
            throw new IllegalArgumentException();
        }
        this.field773 = 0;
        if (this.field758 + arg1.field758 > this.field730.length) {
            int var3;
            for (var3 = 1; var3 < this.field758 + arg1.field758; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class156.method1048(this.field730, 0, var4, 0, this.field758);
            this.field730 = var4;
        }
        if (arg0) {
            return null;
        } else {
            class156.method1048(arg1.field730, 0, this.field730, this.field758, arg1.field758);
            this.field758 += arg1.field758;
            return this;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)Ldd;")
    public final class35 method344(int arg0, int arg1) {
        field770++;
        if (arg1 != -26886) {
            field717 = 52;
        }
        return this.method326(arg0, arg1 + 26760, this.field758);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method345(FontMetrics arg0, byte arg1) {
        field779++;
        String var3;
        try {
            var3 = new String(this.field730, 0, this.field758, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field730, 0, this.field758);
        }
        int var4 = 109 / ((19 - arg1) / 55);
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)Ldd;")
    public final class35 method346(int arg0) {
        class35 var2 = new class35();
        field736++;
        var2.field758 = this.field758;
        boolean var3 = true;
        var2.field730 = new byte[this.field758];
        if (arg0 <= 57) {
            return null;
        }
        for (int var4 = 0; var4 < this.field758; var4++) {
            byte var5 = this.field730[var4];
            if (var5 == 95) {
                var2.field730[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field730[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field730[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I")
    public final int method347(byte arg0) {
        field772++;
        if (arg0 > -83) {
            this.method324(false, 76);
        }
        return this.field758;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)Z")
    public final boolean method348(byte arg0) {
        field734++;
        if (arg0 != -113) {
            field747 = null;
        }
        return this.method324(false, 10);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)J")
    private final long method349(boolean arg0) {
        if (arg0) {
            return 106L;
        }
        field713++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field758; var4++) {
            var2 = (var2 << 5) + (long) (this.field730[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/applet/Applet;)V")
    public final void method350(byte arg0, Applet arg1) throws Throwable {
        field764++;
        String var3 = new String(this.field730, 0, this.field758);
        if (arg0 != 27) {
            field707 = null;
        }
        class87.method646(var3, arg0 ^ 0x253E, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)I")
    public final int method351(int arg0, int arg1, int arg2) {
        field737++;
        byte var4 = (byte) arg1;
        int var5 = arg0;
        int var6 = 15 % ((-arg2 - 50) / 60);
        while (var5 < this.field758) {
            if (this.field730[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BLjava/applet/Applet;)Ldd;")
    public final class35 method352(byte arg0, Applet arg1) {
        field731++;
        String var3 = new String(this.field730, 0, this.field758);
        String var4 = arg1.getParameter(var3);
        if (arg0 <= 63) {
            field761 = 57;
        }
        return var4 == null ? null : class138.method942(var4, 108);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(II)I")
    public static final int method353(int arg0, int arg1) {
        field722++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = arg0 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Ldd;I)I")
    public final int method354(class35 arg0, int arg1) {
        if (arg1 != 255) {
            return 32;
        }
        field763++;
        int var3;
        if (arg0.field758 >= this.field758) {
            var3 = this.field758;
        } else {
            var3 = arg0.field758;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class159.field3237[this.field730[var4] & 0xFF] < class159.field3237[arg0.field730[var4] & 0xFF]) {
                return -1;
            }
            if (class159.field3237[arg0.field730[var4] & 0xFF] < class159.field3237[this.field730[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0.field758 > this.field758) {
            return -1;
        } else if (this.field758 > arg0.field758) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)I")
    public final int method355(int arg0, byte arg1) {
        field740++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field758; var6++) {
            int var7 = this.field730[var6] & 0xFF;
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
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (arg1 != 29) {
            return -89;
        } else if (var4) {
            return var5;
        } else {
            throw new NumberFormatException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)Ldd;")
    public final class35 method356(byte arg0) {
        field726++;
        class35 var2 = new class35();
        var2.field758 = this.field758;
        var2.field730 = new byte[this.field758];
        if (arg0 <= 73) {
            this.method354(null, -47);
        }
        for (int var3 = 0; var3 < this.field758; var3++) {
            var2.field730[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)Ldd;")
    public final class35 method357(byte arg0) {
        class35 var2 = new class35();
        field776++;
        var2.field758 = this.field758;
        var2.field730 = new byte[this.field758];
        byte var3 = 2;
        int var4 = 0;
        if (arg0 <= 79) {
            this.method329(null, (byte) 98, 65, -119, 114);
        }
        while (var4 < this.field758) {
            byte var5 = this.field730[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
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
            var2.field730[var4] = var5;
            var4++;
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method358(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
