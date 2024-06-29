import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 implements class163 {

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "Z")
    private boolean field655 = true;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Z")
    public static boolean field626 = false;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "Lok;")
    public static class41 field661 = class137.method956("n", 45);

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "Lok;")
    public static class41 field666 = class137.method956("Liste der Welten geladen", 45);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ok", name = "hb", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ok", name = "ib", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ok", name = "jb", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ok", name = "kb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ok", name = "lb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ok", name = "mb", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "Lmh;")
    public static class65 field647;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "[B")
    public byte[] field660;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;I)Lok;", line = 4)
    public final class41 method266(class41 arg0, int arg1) {
        field656++;
        if (!this.field655) {
            throw new IllegalArgumentException();
        }
        this.field662 = 0;
        if (this.field617 + arg0.field617 > this.field660.length) {
            int var3;
            for (var3 = 1; var3 < (this.field617 + arg0.field617); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class21.method144(this.field660, 0, var4, 0, this.field617);
            this.field660 = var4;
        }
        class21.method144(arg0.field660, arg1, this.field660, this.field617, arg0.field617);
        this.field617 += arg0.field617;
        return this;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)J", line = 37)
    public final long method267(int arg0) {
        field645++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != 890436613) {
            field647 = (class65) null;
        }
        while (this.field617 > var4) {
            var2 = (var2 << 5) + (long) (this.field660[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lok;I)Z", line = 57)
    public final boolean method268(class41 arg0, int arg1) {
        field651++;
        if (arg0 == null) {
            return false;
        } else if (this.field617 == arg0.field617) {
            if (!this.field655 || !arg0.field655) {
                if (this.field662 == 0) {
                    this.field662 = this.method270(arg1 ^ 0xFFFFF9DD);
                    if (this.field662 == 0) {
                        this.field662 = 1;
                    }
                }
                if (arg0.field662 == 0) {
                    arg0.field662 = arg0.method270(109);
                    if (arg0.field662 == 0) {
                        arg0.field662 = 1;
                    }
                }
                if (this.field662 != arg0.field662) {
                    return false;
                }
            }
            if (arg1 != 1631) {
                return false;
            }
            for (int var3 = 0; var3 < this.field617; var3++) {
                if (this.field660[var3] != arg0.field660[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I", line = 115)
    public final int method269(boolean arg0, FontMetrics arg1) {
        field616++;
        String var3;
        try {
            var3 = new String(this.field660, 0, this.field617, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field660, 0, this.field617);
        }
        if (arg0) {
            field620 = 4;
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I", line = 142)
    public final int method270(int arg0) {
        int var2 = 0;
        int var3 = 56 / ((arg0 + 26) / 62);
        for (int var4 = 0; var4 < this.field617; var4++) {
            var2 = (this.field660[var4] & 0xFF) + (var2 << 5) - var2;
        }
        field663++;
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Lok;", line = 166)
    public final class41 method271(byte arg0) {
        if (arg0 >= -61) {
            return (class41) null;
        }
        field649++;
        if (!this.field655) {
            throw new IllegalArgumentException();
        }
        this.field662 = 0;
        if (this.field660.length != this.field617) {
            byte[] var2 = new byte[this.field617];
            class21.method144(this.field660, 0, var2, 0, this.field617);
            this.field660 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lok;", line = 203)
    public final class41 method272(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg2;
        field653++;
        if (arg1 != -16387) {
            return (class41) null;
        }
        class41 var6 = new class41();
        var6.field617 = this.field617;
        var6.field660 = new byte[this.field617];
        for (int var7 = 0; var7 < this.field617; var7++) {
            byte var8 = this.field660[var7];
            if (var5 == var8) {
                var6.field660[var7] = var4;
            } else {
                var6.field660[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/applet/Applet;I)Lok;", line = 240)
    public final class41 method273(Applet arg0, int arg1) {
        String var3 = new String(this.field660, 0, this.field617);
        String var4 = arg0.getParameter(var3);
        field668++;
        if (arg1 != -14711) {
            this.field617 = 96;
        }
        return var4 == null ? null : class199.method1413(var4, -1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Lok;", line = 272)
    public final class41 method274(byte arg0, int arg1) {
        field667++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (!this.field655) {
            throw new IllegalArgumentException();
        } else if (arg0 == 70) {
            this.field662 = 0;
            if (this.field660.length == this.field617) {
                int var3;
                for (var3 = 1; var3 <= this.field617; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class21.method144(this.field660, 0, var4, 0, this.field617);
                this.field660 = var4;
            }
            this.field660[this.field617++] = (byte) arg1;
            return this;
        } else {
            return (class41) null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)I", line = 312)
    public final int method275(boolean arg0) {
        if (arg0) {
            this.method291((byte) 72);
        }
        field628++;
        return this.field617;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)Z", line = 327)
    public final boolean method276(boolean arg0) {
        field657++;
        return arg0 ? this.method300(10, (byte) 107) : true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLok;)Z", line = 339)
    public final boolean method277(byte arg0, class41 arg1) {
        field637++;
        if (arg0 > -8) {
            return false;
        } else if (this.field617 < arg1.field617) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field617; var3++) {
                byte var4 = this.field660[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field660[var3];
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

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)Lok;", line = 377)
    public final class41 method278(byte arg0) {
        if (arg0 > -61) {
            return (class41) null;
        } else {
            class41 var2 = class235.method1690(this.method291((byte) 65), (byte) 37);
            field642++;
            return var2 == null ? class307.field5154 : var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lok;", line = 397)
    public final class41 method279(int arg0, byte arg1) {
        if (arg1 > -6) {
            this.field655 = false;
        }
        field625++;
        return this.method308(this.field617, arg0, -53);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V", line = 408)
    public final void method280(int arg0, int arg1) {
        this.field662 = 0;
        field611++;
        if (!this.field655) {
            throw new IllegalArgumentException();
        } else if (arg0 >= 0) {
            if (arg1 != 30080) {
                this.method293((class41) null, (byte) -98, -67);
            }
            if (arg0 > this.field660.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class21.method144(this.field660, 0, var4, 0, this.field617);
                this.field660 = var4;
            }
            for (int var5 = this.field617; var5 < arg0; var5++) {
                this.field660[var5] = 32;
            }
            this.field617 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IB)I", line = 457)
    public final int method281(int arg0, byte arg1) {
        int var3 = 99 / ((arg1 - 73) / 39);
        field650++;
        return this.field660[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 466)
    public final void method282(Graphics arg0, int arg1, int arg2, int arg3) {
        field619++;
        String var5;
        try {
            var5 = new String(this.field660, arg1, this.field617, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field660, 0, this.field617);
        }
        arg0.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I", line = 483)
    public static final int method283(int arg0, int arg1) {
        if (arg0 != 12770) {
            field626 = true;
        }
        field648++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Ljava/net/URL;", line = 508)
    public final URL method284(byte arg0) throws MalformedURLException {
        field670++;
        return arg0 == 104 ? new URL(new String(this.field660, 0, this.field617)) : (URL) null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;IBI)Lok;", line = 532)
    public final class41 method285(class41 arg0, int arg1, byte arg2, int arg3) {
        field631++;
        if (!this.field655) {
            throw new IllegalArgumentException();
        } else if (arg1 >= 0 && arg1 <= arg3 && arg0.field617 >= arg3) {
            this.field662 = 0;
            if (this.field660.length < (this.field617 + arg3 - arg1)) {
                int var5;
                for (var5 = 1; var5 < this.field617 + arg0.field617; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class21.method144(this.field660, 0, var6, 0, this.field617);
                this.field660 = var6;
            }
            int var7 = -32 % ((-arg2 - 53) / 42);
            class21.method144(arg0.field660, arg1, this.field660, this.field617, arg3 - arg1);
            this.field617 += arg3 - arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 586)
    public final boolean equals(Object arg0) {
        field636++;
        if (!(arg0 instanceof class41)) {
            throw new IllegalArgumentException();
        }
        return this.method268((class41) arg0, 1631);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;B)I", line = 603)
    public final int method286(class41 arg0, byte arg1) {
        field640++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field617;
        int var6 = arg0.field617;
        int var7 = this.field617;
        int var8 = arg0.field617;
        int var9 = 0;
        int var10 = 0;
        while (var7 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field660[var9] & 0xFF;
                var9++;
            }
            if (class153.method1093(-99, var3)) {
                var5++;
            } else {
                var7--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg0.field660[var10] & 0xFF;
                var10++;
            }
            if (class153.method1093(-112, var4)) {
                var8++;
            } else {
                var6--;
            }
            if (class107.field1513[var3] < class107.field1513[var4]) {
                return -1;
            }
            if (class107.field1513[var3] > class107.field1513[var4]) {
                return 1;
            }
        }
        if (var8 > var5) {
            return -1;
        } else {
            if (arg1 >= -67) {
                this.equals((Object) null);
            }
            return var8 >= var5 ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V", line = 694)
    public final void method287(byte arg0) {
        field639++;
        String var2;
        try {
            if (arg0 != -113) {
                this.method308(103, -61, 10);
            }
            var2 = new String(this.field660, 0, this.field617, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field660, 0, this.field617);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)Lok;", line = 716)
    public final class41 method288(byte arg0) {
        field633++;
        boolean var2 = true;
        class41 var3 = new class41();
        var3.field617 = this.field617;
        var3.field660 = new byte[this.field617];
        if (arg0 > -117) {
            this.method309((class41) null, 45);
        }
        for (int var4 = 0; var4 < this.field617; var4++) {
            byte var5 = this.field660[var4];
            if (var5 == 95) {
                var3.field660[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field660[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var3.field660[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)[Lok;", line = 761)
    public final class41[] method289(int arg0, int arg1) {
        field638++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field617; var4++) {
            if (this.field660[var4] == arg1) {
                var3++;
            }
        }
        class41[] var5 = new class41[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        if (arg0 != -3607) {
            this.method304(95, 71);
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field660[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method308(var7 + var9, var7, class26.method169(arg0, 3632));
            var7 += var9 + 1;
        }
        var5[var3] = this.method308(this.field617, var7, arg0 + 3731);
        return var5;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(II)I", line = 817)
    public final int method290(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        field635++;
        int var5 = 0;
        if (arg0 != -2281) {
            this.method289(-7, 109);
        }
        for (int var6 = 0; var6 < this.field617; var6++) {
            int var7 = this.field660[var6] & 0xFF;
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
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
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

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)J", line = 893)
    public final long method291(byte arg0) {
        long var2 = 0L;
        if (arg0 != 65) {
            this.method270(62);
        }
        for (int var4 = 0; var4 < this.field617 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field660[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (27 - (48 - var5));
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        field641++;
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(BLok;)I", line = 931)
    public final int method292(byte arg0, class41 arg1) {
        field612++;
        int var3;
        if (this.field617 <= arg1.field617) {
            var3 = this.field617;
        } else {
            var3 = arg1.field617;
        }
        if (arg0 > -6) {
            return 70;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field660[var4] & 0xFF) < (arg1.field660[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field660[var4] & 0xFF) < (this.field660[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field617 > this.field617) {
            return -1;
        } else if (this.field617 <= arg1.field617) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;BI)I", line = 973)
    public final int method293(class41 arg0, byte arg1, int arg2) {
        int[] var4 = new int[arg0.field617];
        field627++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field617];
        int var7 = 0;
        if (arg1 != 70) {
            this.field662 = 58;
        }
        while (var7 < var5.length) {
            var5[var7] = arg0.field617;
            var7++;
        }
        for (int var8 = 1; var8 <= arg0.field617; var8++) {
            var4[var8 - 1] = (arg0.field617 << 1) - var8;
            var5[class217.method1563(arg0.field660[var8 - 1], 255)] = arg0.field617 - var8;
        }
        int var9 = arg0.field617 + 1;
        for (int var10 = arg0.field617; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg0.field617 >= var9 && arg0.field660[var10 - 1] != arg0.field660[var9 - 1]) {
                if (arg0.field617 - var10 <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg0.field617 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = arg0.field617 + 1 - var9;
        int var14 = 0;
        int var15 = 1;
        while (var13 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field660[var14 - 1] != arg0.field660[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg0.field617 > var12) {
            for (int var16 = var11; var16 <= var12; var16++) {
                if (var4[var16 - 1] >= var12 + arg0.field617 - var16) {
                    var4[var16 - 1] = var12 + arg0.field617 - var16;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var13 - var6[var13 + -1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg0.field617 + arg2 - 1; var17 < this.field617; var17 += Math.max(var5[this.field660[var17] & 0xFF], var4[var18])) {
            for (var18 = arg0.field617 - 1; var18 >= 0 && this.field660[var17] == arg0.field660[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Lok;", line = 1093)
    public final class41 method294(int arg0) {
        field623++;
        class41 var2 = new class41();
        var2.field617 = this.field617;
        var2.field660 = new byte[this.field617];
        for (int var3 = 0; var3 < this.field617; var3++) {
            byte var4 = this.field660[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field660[var3] = var4;
        }
        if (arg0 != 1) {
            this.method305(115, (class41) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;", line = 1122)
    public final URL method295(URL arg0, int arg1) throws MalformedURLException {
        if (arg1 >= -68) {
            this.field655 = true;
        }
        field675++;
        return new URL(arg0, new String(this.field660, 0, this.field617));
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZIIII)V", line = 1141)
    public static final void method296(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class207.field3353 = arg4;
        field646++;
        class128.field1903 = arg1;
        class292.field4737 = arg6;
        class121.field1782 = arg5;
        class299.field4841 = arg3;
        if (arg0 != -7057) {
            field661 = (class41) null;
        }
        if (arg2 && class292.field4737 >= 100) {
            class251.field3990 = class207.field3353 * 128 + 64;
            class235.field3779 = class128.field1903 * 128 + 64;
            class13.field159 = class140.method983((byte) -109, class55.field807, class235.field3779, class251.field3990) - class299.field4841;
        }
        class28.field416 = 2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;", line = 1167)
    public final Object method297(Applet arg0, int arg1) throws Throwable {
        field643++;
        String var3 = new String(this.field660, 0, this.field617);
        if (arg1 != -24900) {
            this.method279(-21, (byte) -7);
        }
        Object var4 = class100.method701(arg0, 118, (Object[]) null, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class213.method1507(var5.length, 0, false, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "hashCode", descriptor = "()I", line = 1190)
    public final int hashCode() {
        field630++;
        return this.method270(-88);
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Lok;", line = 1200)
    public final class41 method298(int arg0) {
        field618++;
        long var2 = this.method267(890436613);
        synchronized (ok.class) {
            if (class281.field4574 == null) {
                class281.field4574 = new class86(4096);
            } else {
                for (class167 var5 = (class167) class281.field4574.method617(var2, false); var5 != null; var5 = (class167) class281.field4574.method613(-103)) {
                    if (this.method268(var5.field2658, 1631)) {
                        return var5.field2658;
                    }
                }
            }
            class167 var6 = new class167();
            var6.field2658 = this;
            this.field655 = false;
            class281.field4574.method610(102, var6, var2);
            if (arg0 != -11492) {
                this.field655 = false;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Z)Lok;", line = 1241)
    public final class41 method299(boolean arg0) {
        int var2;
        for (var2 = 0; var2 < this.field617 && (this.field660[var2] >= 0 && this.field660[var2] <= 32 || (this.field660[var2] & 0xFF) == 160); var2++) {
        }
        field644++;
        int var3;
        for (var3 = this.field617; var3 > var2 && (this.field660[var3 - 1] >= 0 && this.field660[var3 - 1] <= 32 || (this.field660[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field617 == var3) {
            return this;
        }
        class41 var4 = new class41();
        var4.field617 = var3 - var2;
        var4.field660 = new byte[var4.field617];
        int var5 = 0;
        if (arg0) {
            method283(-102, 36);
        }
        while (var4.field617 > var5) {
            var4.field660[var5] = this.field660[var2 + var5];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(IB)Z", line = 1283)
    private final boolean method300(int arg0, byte arg1) {
        int var3 = -93 / ((arg1 - 17) / 59);
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field654++;
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field617; var7++) {
            int var8 = this.field660[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var5 = true;
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
                return false;
            }
            if (arg0 <= var8) {
                return false;
            }
            if (var5) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                return false;
            }
            var6 = var9;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(B)I", line = 1357)
    public final int method301(byte arg0) {
        if (arg0 > -91) {
            return 126;
        } else {
            field658++;
            return this.method290(-2281, 10);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;Lok;I)Lok;", line = 1368)
    public final class41 method302(class41 arg0, class41 arg1, int arg2) {
        field672++;
        int var4 = this.field617;
        int var5 = arg1.field617 - arg0.field617;
        int var6 = 0;
        while (true) {
            int var7 = this.method293(arg0, (byte) 70, var6);
            if (var7 < 0) {
                if (arg2 != -34) {
                    this.method270(-101);
                }
                class41 var8 = class230.method1645(var4, (byte) -117);
                int var9 = 0;
                while (true) {
                    int var10 = this.method293(arg0, (byte) 70, var9);
                    if (var10 < 0) {
                        while (var9 < this.field617) {
                            var8.method274((byte) 70, this.field660[var9++] & 0xFF);
                        }
                        return var8;
                    }
                    while (var9 < var10) {
                        var8.method274((byte) 70, this.field660[var9++] & 0xFF);
                    }
                    var8.method266(arg1, arg2 ^ 0xFFFFFFDE);
                    var9 += arg0.field617;
                }
            }
            var4 += var5;
            var6 = var7 + arg0.field617;
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(II)Lok;", line = 1425)
    public final class41 method303(int arg0, int arg1) {
        field629++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg1 > -104) {
            return (class41) null;
        } else {
            class41 var3 = new class41();
            var3.field660 = new byte[this.field617 + 1];
            var3.field617 = this.field617 + 1;
            class21.method144(this.field660, 0, var3.field660, 0, this.field617);
            var3.field660[this.field617] = (byte) arg0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(II)I", line = 1450)
    public final int method304(int arg0, int arg1) {
        int var3 = arg0;
        field659++;
        byte var4 = (byte) arg1;
        for (int var5 = 0; var5 < this.field617; var5++) {
            if (this.field660[var5] == var4) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILok;)I", line = 1475)
    public final int method305(int arg0, class41 arg1) {
        field674++;
        if (arg0 > -53) {
            this.method273((Applet) null, -97);
        }
        return this.method293(arg1, (byte) 70, 0);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Lok;I)Z", line = 1498)
    public final boolean method306(class41 arg0, int arg1) {
        field665++;
        if (arg0 == null) {
            return false;
        } else if (this.field617 == arg0.field617) {
            if (arg1 != 27080) {
                this.method285((class41) null, -107, (byte) -74, -4);
            }
            for (int var3 = 0; var3 < this.field617; var3++) {
                byte var4 = this.field660[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field660[var3];
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

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Lok;", line = 1540)
    public final class41 method307(int arg0) {
        field673++;
        if (arg0 < 114) {
            this.method277((byte) 84, (class41) null);
        }
        class41 var2 = new class41();
        var2.field617 = this.field617;
        var2.field660 = new byte[var2.field617];
        for (int var3 = 0; var3 < this.field617; var3++) {
            var2.field660[this.field617 - var3 - 1] = this.field660[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Lok;", line = 1563)
    public final class41 method308(int arg0, int arg1, int arg2) {
        field652++;
        class41 var4 = new class41();
        var4.field617 = arg0 - arg1;
        var4.field660 = new byte[arg0 - arg1];
        class21.method144(this.field660, arg1, var4.field660, 0, var4.field617);
        int var5 = 88 / ((arg2 - 25) / 53);
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(Lok;I)Z", line = 1582)
    public final boolean method309(class41 arg0, int arg1) {
        field634++;
        if (this.field617 < arg0.field617) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field617; var3++) {
            if (this.field660[var3] != arg0.field660[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILok;)Z", line = 1602)
    public final boolean method310(int arg0, class41 arg1) {
        field624++;
        if (arg1.field617 > this.field617) {
            return false;
        } else if (arg0 == -141) {
            int var3 = this.field617 - arg1.field617;
            for (int var4 = 0; var4 < arg1.field617; var4++) {
                if (this.field660[var3 + var4] != arg1.field660[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIIZII)Z", line = 1648)
    public static final boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field615++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class132.field1976[var12][var13] = 0;
                class97.field1426[var12][var13] = 99999999;
            }
        }
        class132.field1976[arg5][arg11] = 99;
        class97.field1426[arg5][arg11] = 0;
        byte var14 = 0;
        int var15 = arg5;
        int var16 = 0;
        int var17 = arg11;
        boolean var18 = false;
        class173.field2810[var14] = arg5;
        int var32 = var14 + 1;
        class138.field2068[var14] = arg11;
        int[][] var19 = class222.field3548[class55.field807].field3570;
        while (var32 != var16) {
            var17 = class138.field2068[var16];
            var15 = class173.field2810[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg0 == var15 && arg6 == var17) {
                var18 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class222.field3548[class55.field807].method1601(2, 19661058, arg0, arg6, var15, var17, arg4, arg2 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg2 < 10 && class222.field3548[class55.field807].method1602(2, arg2 - 1, (byte) 42, arg0, var15, arg6, arg4, var17)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg10 != 0 && class222.field3548[class55.field807].method1608(var15, arg1 ^ 0xFFFF851B, arg0, arg7, var17, 2, arg8, arg10, arg6)) {
                var18 = true;
                break;
            }
            int var20 = class97.field1426[var15][var17] + 1;
            if (var15 > 0 && class132.field1976[var15 - 1][var17] == 0 && (var19[var15 - 1][var17] & 0x12C010E) == 0 && (var19[var15 - 1][var17 + 1] & 0x12C0138) == 0) {
                class173.field2810[var32] = var15 - 1;
                class138.field2068[var32] = var17;
                class132.field1976[var15 - 1][var17] = 2;
                var32 = var32 + 1 & 0xFFF;
                class97.field1426[var15 - 1][var17] = var20;
            }
            if (var15 < 102 && class132.field1976[var15 + 1][var17] == 0 && (var19[var15 + 2][var17] & 0x12C0183) == 0 && (var19[var15 + 2][var17 + 1] & 0x12C01E0) == 0) {
                class173.field2810[var32] = var15 + 1;
                class138.field2068[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var15 + 1][var17] = 8;
                class97.field1426[var15 + 1][var17] = var20;
            }
            if (var17 > 0 && class132.field1976[var15][var17 - 1] == 0 && (var19[var15][var17 - 1] & 0x12C010E) == 0 && (var19[var15 + 1][var17 - 1] & 0x12C0183) == 0) {
                class173.field2810[var32] = var15;
                class138.field2068[var32] = var17 - 1;
                class132.field1976[var15][var17 - 1] = 1;
                class97.field1426[var15][var17 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var17 < 102 && class132.field1976[var15][var17 + 1] == 0 && (var19[var15][var17 + 2] & 0x12C0138) == 0 && (var19[var15 + 1][var17 + 2] & 0x12C01E0) == 0) {
                class173.field2810[var32] = var15;
                class138.field2068[var32] = var17 + 1;
                class132.field1976[var15][var17 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class97.field1426[var15][var17 + 1] = var20;
            }
            if (var15 > 0 && var17 > 0 && class132.field1976[var15 - 1][var17 - 1] == 0 && (var19[var15 - 1][var17] & 0x12C0138) == 0 && (var19[var15 - 1][var17 - 1] & 0x12C010E) == 0 && (var19[var15][var17 - 1] & 0x12C0183) == 0) {
                class173.field2810[var32] = var15 - 1;
                class138.field2068[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var15 - 1][var17 - 1] = 3;
                class97.field1426[var15 - 1][var17 - 1] = var20;
            }
            if (var15 < 102 && var17 > 0 && class132.field1976[var15 + 1][var17 - 1] == 0 && (var19[var15 + 1][var17 - 1] & 0x12C010E) == 0 && (var19[var15 + 2][var17 - 1] & 0x12C0183) == 0 && (var19[var15 + 2][var17] & 0x12C01E0) == 0) {
                class173.field2810[var32] = var15 + 1;
                class138.field2068[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var15 + 1][var17 - 1] = 9;
                class97.field1426[var15 + 1][var17 - 1] = var20;
            }
            if (var15 > 0 && var17 < 102 && class132.field1976[var15 - 1][var17 + 1] == 0 && (var19[var15 - 1][var17 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var17 + 2] & 0x12C0138) == 0 && (var19[var15][var17 + 2] & 0x12C01E0) == 0) {
                class173.field2810[var32] = var15 - 1;
                class138.field2068[var32] = var17 + 1;
                class132.field1976[var15 - 1][var17 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class97.field1426[var15 - 1][var17 + 1] = var20;
            }
            if (var15 < 102 && var17 < 102 && class132.field1976[var15 + 1][var17 + 1] == 0 && (var19[var15 + 1][var17 + 2] & 0x12C0138) == 0 && (var19[var15 + 2][var17 + 2] & 0x12C01E0) == 0 && (var19[var15 + 2][var17 + 1] & 0x12C0183) == 0) {
                class173.field2810[var32] = var15 + 1;
                class138.field2068[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class132.field1976[var15 + 1][var17 + 1] = 12;
                class97.field1426[var15 + 1][var17 + 1] = var20;
            }
        }
        class292.field4732 = 0;
        if (!var18) {
            if (!arg9) {
                return false;
            }
            byte var21 = 10;
            int var22 = 100;
            int var23 = 1000;
            for (int var24 = arg0 - var21; var24 <= arg0 + var21; var24++) {
                for (int var25 = arg6 - var21; var25 <= arg6 + var21; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class97.field1426[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var25 < arg6) {
                            var27 = arg6 - var25;
                        } else if (var25 > arg6 + arg10 - 1) {
                            var27 = var25 + 1 - arg6 - arg10;
                        }
                        if (arg0 > var24) {
                            var26 = arg0 - var24;
                        } else if (var24 > (arg0 + arg7 - 1)) {
                            var26 = var24 + 1 - arg0 - arg7;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var23 > var28 || var23 == var28 && class97.field1426[var24][var25] < var22) {
                            var22 = class97.field1426[var24][var25];
                            var23 = var28;
                            var17 = var25;
                            var15 = var24;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg5 == var15 && arg11 == var17) {
                return false;
            }
            class292.field4732 = 1;
        }
        byte var29 = 0;
        class173.field2810[var29] = var15;
        int var33 = var29 + 1;
        class138.field2068[var29] = var17;
        int var30;
        int var31 = var30 = class132.field1976[var15][var17];
        while (arg5 != var15 || arg11 != var17) {
            if (var30 != var31) {
                var30 = var31;
                class173.field2810[var33] = var15;
                class138.field2068[var33++] = var17;
            }
            if ((var31 & 0x1) != 0) {
                var17++;
            } else if ((var31 & 0x4) != 0) {
                var17--;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            var31 = class132.field1976[var15][var17];
        }
        if (var33 > 0) {
            class296.method2042((byte) 91, arg3, var33);
            return true;
        }
        if (arg1 != -31429) {
            method296(38, -58, false, 103, -6, -51, 25);
        }
        if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/applet/Applet;B)V", line = 2045)
    public final void method312(Applet arg0, byte arg1) throws Throwable {
        int var3 = 7 % ((arg1 - 34) / 32);
        field614++;
        String var4 = new String(this.field660, 0, this.field617);
        class100.method702(-83, var4, arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[BI)I", line = 2058)
    public final int method313(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        class21.method144(this.field660, arg0, arg3, arg4, arg2 - arg0);
        field632++;
        return arg1 > -89 ? 83 : arg2 - arg0;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(III)I", line = 2084)
    public final int method314(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method272(17, 106, -39);
        }
        byte var4 = (byte) arg0;
        field669++;
        for (int var5 = arg2; var5 < this.field617; var5++) {
            if (this.field660[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(B)Lok;", line = 2109)
    public final class41 method315(byte arg0) {
        class41 var2 = new class41();
        byte var3 = 2;
        field622++;
        var2.field617 = this.field617;
        var2.field660 = new byte[this.field617];
        int var4 = 0;
        if (arg0 != 32) {
            return (class41) null;
        }
        while (this.field617 > var4) {
            byte var5 = this.field660[var4];
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
            var2.field660[var4] = var5;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V", line = 2176)
    public static void method316(int arg0) {
        field647 = null;
        if (arg0 == 65) {
            field666 = null;
            field661 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(Z)[B", line = 2205)
    public final byte[] method317(boolean arg0) {
        field621++;
        if (arg0) {
            this.field655 = false;
        }
        byte[] var2 = new byte[this.field617];
        class21.method144(this.field660, 0, var2, 0, this.field617);
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "toString", descriptor = "()Ljava/lang/String;", line = 2220)
    public final String toString() {
        field671++;
        throw new RuntimeException();
    }
}
