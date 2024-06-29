import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class30 implements class199 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
    private boolean field579 = true;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "[S")
    public static short[] field602 = new short[500];

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field603 = -1;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static volatile int field613 = 0;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "Lsg;")
    public static class30 field619 = class167.method1221((byte) 33, "Okay");

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "Lsg;")
    public static class30 field607 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!sg", name = "lb", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!sg", name = "mb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!sg", name = "nb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Lmc;")
    public static class151 field596;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "ob", descriptor = "Ljava/lang/Class;")
    public static Class field632;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "[B")
    public byte[] field618;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "[I")
    public static int[] field599;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I")
    public final int method249(int arg0) {
        field578++;
        return arg0 > -5 ? -17 : this.field576;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[Lsg;")
    public final class30[] method250(int arg0, int arg1) {
        field574++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field576; var4++) {
            if (this.field618[var4] == arg0) {
                var3++;
            }
        }
        class30[] var5 = new class30[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field618[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method274(var7 + var9, var7, (byte) -127);
            var7 += var9 + 1;
        }
        var5[var3] = this.method274(this.field576, var7, (byte) -120);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Lsg;")
    public final class30 method251(int arg0, boolean arg1) {
        if (arg1) {
            this.method278(119);
        }
        field585++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class30 var3 = new class30();
        var3.field618 = new byte[this.field576 + 1];
        var3.field576 = this.field576 + 1;
        class26.method235(this.field618, 0, var3.field618, 0, this.field576);
        var3.field618[this.field576] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILsg;)Z")
    public final boolean method252(int arg0, class30 arg1) {
        field622++;
        if (this.field576 < arg1.field576) {
            return false;
        }
        if (arg0 != 1) {
            field613 = -73;
        }
        for (int var3 = 0; var3 < arg1.field576; var3++) {
            byte var4 = this.field618[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field618[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/applet/Applet;)Lsg;")
    public final class30 method253(byte arg0, Applet arg1) {
        String var3 = new String(this.field618, 0, this.field576);
        field592++;
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != -113) {
                field603 = 112;
            }
            return class224.method1604(var4, (byte) 53);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
    public final int method254(byte arg0, FontMetrics arg1) {
        field600++;
        String var3;
        try {
            var3 = new String(this.field618, 0, this.field576, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field618, 0, this.field576);
        }
        return arg0 < 71 ? -24 : arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLsg;)I")
    public final int method255(boolean arg0, class30 arg1) {
        field584++;
        return arg0 ? this.method291(0, 22, arg1) : -57;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lsg;")
    public final class30 method256(int arg0) {
        field582++;
        boolean var2 = true;
        class30 var3 = new class30();
        var3.field576 = this.field576;
        var3.field618 = new byte[this.field576];
        for (int var4 = 0; var4 < this.field576; var4++) {
            byte var5 = this.field618[var4];
            if (var5 == 95) {
                var3.field618[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field618[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var2 = false;
                var3.field618[var4] = var5;
            }
        }
        if (arg0 <= 74) {
            this.method257(36, -40);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
    public final int method257(int arg0, int arg1) {
        byte var3 = (byte) arg1;
        field571++;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field576; var5++) {
            if (this.field618[var5] == var3) {
                var4++;
            }
        }
        int var6 = 32 / ((arg0 + 31) / 35);
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
    public final void method258(int arg0, int arg1) {
        this.field626 = 0;
        field606++;
        if (!this.field579) {
            throw new IllegalArgumentException();
        } else if (~arg1 > arg0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field618.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class26.method235(this.field618, 0, var4, 0, this.field576);
                this.field618 = var4;
            }
            for (int var5 = this.field576; var5 < arg1; var5++) {
                this.field618[var5] = 32;
            }
            this.field576 = arg1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)J")
    public static final long method259(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3522; var4++) {
            class35 var5 = var3.field3540[var4];
            if ((var5.field863 >> 29 & 0x3L) == 2L && var5.field854 == arg1 && var5.field856 == arg2) {
                return var5.field863;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lsg;")
    public final class30 method260(byte arg0, int arg1) {
        field583++;
        int var3 = 98 % ((arg0 + 52) / 48);
        return this.method274(this.field576, arg1, (byte) -127);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)[B")
    public final byte[] method261(int arg0) {
        if (arg0 == -1) {
            field588++;
            byte[] var2 = new byte[this.field576];
            class26.method235(this.field618, 0, var2, 0, this.field576);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method262(byte arg0) {
        field607 = null;
        field619 = null;
        field602 = null;
        field596 = null;
        if (arg0 != 104) {
            field603 = -10;
        }
        field599 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)Lsg;")
    public final class30 method263(byte arg0) {
        field617++;
        if (!this.field579) {
            throw new IllegalArgumentException();
        } else if (arg0 == -116) {
            this.field626 = 0;
            if (this.field618.length != this.field576) {
                byte[] var2 = new byte[this.field576];
                class26.method235(this.field618, 0, var2, 0, this.field576);
                this.field618 = var2;
            }
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)Lsg;")
    public final class30 method264(int arg0, int arg1) {
        field628++;
        if (arg0 >= arg1 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field579) {
            this.field626 = 0;
            if (this.field618.length == this.field576) {
                int var3;
                for (var3 = 1; var3 <= this.field576; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class26.method235(this.field618, 0, var4, 0, this.field576);
                this.field618 = var4;
            }
            this.field618[this.field576++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)I")
    public final int method265(int arg0, int arg1, byte arg2) {
        field589++;
        if (arg2 != 95) {
            field596 = null;
        }
        byte var4 = (byte) arg0;
        for (int var5 = arg1; var5 < this.field576; var5++) {
            if (this.field618[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Lsg;")
    public final class30 method266(int arg0) {
        if (arg0 == 37) {
            field597++;
            class30 var2 = class197.method1422(this.method297((byte) -88), arg0 ^ 0xFFFFFFAE);
            return var2 == null ? class219.field3959 : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(ILsg;)Z")
    public final boolean method267(int arg0, class30 arg1) {
        field614++;
        if (arg1 == null) {
            return false;
        } else if (this.field576 == arg1.field576) {
            if (!this.field579 || !arg1.field579) {
                if (this.field626 == 0) {
                    this.field626 = this.method269(true);
                    if (this.field626 == 0) {
                        this.field626 = 1;
                    }
                }
                if (arg1.field626 == 0) {
                    arg1.field626 = arg1.method269(true);
                    if (arg1.field626 == 0) {
                        arg1.field626 = 1;
                    }
                }
                if (this.field626 != arg1.field626) {
                    return false;
                }
            }
            if (arg0 != -52) {
                field602 = null;
            }
            for (int var3 = 0; var3 < this.field576; var3++) {
                if (this.field618[var3] != arg1.field618[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IZ)Z")
    private final boolean method268(int arg0, boolean arg1) {
        field609++;
        if (!arg1) {
            field613 = -59;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field576; var6++) {
            int var7 = this.field618[var6] & 0xFF;
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
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I")
    public final int method269(boolean arg0) {
        field616++;
        int var2 = 0;
        int var3 = 0;
        if (!arg0) {
            this.method293(107, (class30) null);
        }
        while (this.field576 > var3) {
            var2 = (var2 << 5) + (this.field618[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lsg;IIB)Lsg;")
    public final class30 method270(class30 arg0, int arg1, int arg2, byte arg3) {
        field627++;
        if (!this.field579) {
            throw new IllegalArgumentException();
        } else if (arg2 >= 0 && arg2 <= arg1 && arg0.field576 >= arg1) {
            this.field626 = 0;
            if (this.field618.length < this.field576 + arg1 - arg2) {
                int var5;
                for (var5 = 1; var5 < (this.field576 + arg0.field576); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class26.method235(this.field618, 0, var6, 0, this.field576);
                this.field618 = var6;
            }
            if (arg3 != 103) {
                this.field618 = null;
            }
            class26.method235(arg0.field618, arg2, this.field618, this.field576, arg1 - arg2);
            this.field576 += arg1 - arg2;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field624++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)I")
    public final int method271(byte arg0) {
        if (arg0 >= -126) {
            this.field626 = -1;
        }
        field575++;
        return this.method282(-5989, 10);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lsg;I)Z")
    public final boolean method272(class30 arg0, int arg1) {
        field611++;
        if (this.field576 < arg0.field576) {
            return false;
        }
        int var3 = this.field576 - arg0.field576;
        for (int var4 = 0; var4 < arg0.field576; var4++) {
            if (this.field618[var4 + var3] != arg0.field618[var4]) {
                return false;
            }
        }
        if (arg1 != 65) {
            field599 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method273(URL arg0, int arg1) throws MalformedURLException {
        field573++;
        if (arg1 != 17851) {
            this.method261(48);
        }
        return new URL(arg0, new String(this.field618, 0, this.field576));
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIB)Lsg;")
    public final class30 method274(int arg0, int arg1, byte arg2) {
        field577++;
        int var4 = 112 % ((arg2 + 50) / 58);
        class30 var5 = new class30();
        var5.field618 = new byte[arg0 - arg1];
        var5.field576 = arg0 - arg1;
        class26.method235(this.field618, arg1, var5.field618, 0, var5.field576);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lsg;B)I")
    public final int method275(class30 arg0, byte arg1) {
        field612++;
        int var3 = 0;
        int var4 = 0;
        int var5 = arg0.field576;
        int var6 = arg0.field576;
        int var7 = this.field576;
        int var8 = this.field576;
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
                var3 = this.field618[var9] & 0xFF;
                var9++;
            }
            if (class142.method1058(var3, (byte) -61)) {
                var8++;
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
                var4 = arg0.field618[var10] & 0xFF;
                var10++;
            }
            if (class142.method1058(var4, (byte) -61)) {
                var5++;
            } else {
                var6--;
            }
            if (class81.field1745[var3] < class81.field1745[var4]) {
                return -1;
            }
            if (class81.field1745[var3] > class81.field1745[var4]) {
                return 1;
            }
        }
        int var11 = 99 / ((-arg1 - 30) / 61);
        if (var5 > var8) {
            return -1;
        } else if (var5 < var8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lsg;I)Z")
    public final boolean method276(class30 arg0, int arg1) {
        field569++;
        if (this.field576 < arg0.field576) {
            return false;
        }
        if (arg1 != -93) {
            this.method284(true);
        }
        for (int var3 = 0; var3 < arg0.field576; var3++) {
            if (this.field618[var3] != arg0.field618[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)Ljava/net/URL;")
    public final URL method277(byte arg0) throws MalformedURLException {
        field581++;
        if (arg0 <= 25) {
            this.method260((byte) 14, -54);
        }
        return new URL(new String(this.field618, 0, this.field576));
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)Lsg;")
    public final class30 method278(int arg0) {
        field572++;
        class30 var2 = new class30();
        var2.field576 = this.field576;
        byte var3 = 2;
        var2.field618 = new byte[this.field576];
        for (int var4 = arg0; var4 < this.field576; var4++) {
            byte var5 = this.field618[var4];
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
            var2.field618[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)Z")
    public final boolean method279(byte arg0) {
        if (arg0 != 87) {
            field596 = null;
        }
        field605++;
        return this.method268(10, true);
    }

    @OriginalMember(owner = "client!sg", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field615++;
        return this.method269(true);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLsg;)I")
    public final int method280(byte arg0, class30 arg1) {
        if (arg0 != 1) {
            return -33;
        }
        int var3;
        if (arg1.field576 < this.field576) {
            var3 = arg1.field576;
        } else {
            var3 = this.field576;
        }
        field604++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field618[var4] & 0xFF) < (arg1.field618[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field618[var4] & 0xFF) < (this.field618[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field576 < arg1.field576) {
            return -1;
        } else if (this.field576 > arg1.field576) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)Lsg;")
    public final class30 method281(byte arg0) {
        field570++;
        long var2 = this.method287(0);
        synchronized (field632 == null ? (field632 = method299("sg")) : field632) {
            if (class25.field477 == null) {
                class25.field477 = new class157(4096);
            } else {
                for (class196 var5 = (class196) class25.field477.method1168(-3, var2); var5 != null; var5 = (class196) class25.field477.method1173(-15659)) {
                    if (this.method267(-52, var5.field3549)) {
                        return var5.field3549;
                    }
                }
            }
            class196 var7 = new class196();
            this.field579 = false;
            if (arg0 >= -90) {
                field603 = 81;
            }
            var7.field3549 = this;
            class25.field477.method1164((byte) -103, var2, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(II)I")
    public final int method282(int arg0, int arg1) {
        field580++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != -5989) {
            return -112;
        }
        for (int var6 = 0; var6 < this.field576; var6++) {
            int var7 = this.field618[var6] & 0xFF;
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

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(II)I")
    public final int method283(int arg0, int arg1) {
        field590++;
        if (arg1 != 255) {
            this.method276((class30) null, -101);
        }
        return this.field618[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V")
    public final void method284(boolean arg0) {
        String var2;
        try {
            var2 = new String(this.field618, 0, this.field576, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field618, 0, this.field576);
        }
        System.out.println(var2);
        if (!arg0) {
            this.method297((byte) -86);
        }
        field598++;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lsg;I)Z")
    public final boolean method285(class30 arg0, int arg1) {
        field568++;
        if (arg0 == null) {
            return false;
        } else if (this.field576 == arg0.field576) {
            for (int var3 = arg1; var3 < this.field576; var3++) {
                byte var4 = this.field618[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field618[var3];
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

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method286(Applet arg0, int arg1) throws Throwable {
        field608++;
        String var3 = new String(this.field618, arg1, this.field576);
        class118.method905((byte) -78, var3, arg0);
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)J")
    public final long method287(int arg0) {
        field620++;
        long var2 = (long) arg0;
        for (int var4 = 0; var4 < this.field576; var4++) {
            var2 = (var2 << 5) + (long) (this.field618[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(B)Lsg;")
    public final class30 method288(byte arg0) {
        field610++;
        if (arg0 != 121) {
            field602 = null;
        }
        int var2 = this.field576;
        int var3;
        for (var3 = 0; var3 < this.field576 && (this.field618[var3] >= 0 && this.field618[var3] <= 32 || (this.field618[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field618[var2 - 1] >= 0 && this.field618[var2 - 1] <= 32 || (this.field618[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field576 == var2) {
            return this;
        }
        class30 var4 = new class30();
        var4.field576 = var2 - var3;
        var4.field618 = new byte[var4.field576];
        for (int var5 = 0; var5 < var4.field576; var5++) {
            var4.field618[var5] = this.field618[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field591++;
        int var8 = class68.method609(class275.field4804, 22050, class167.field3064, arg1);
        int var9 = class68.method609(class275.field4804, 22050, class167.field3064, arg0);
        int var10 = class68.method609(class48.field1096, 22050, class252.field4458, arg5);
        int var11 = class68.method609(class48.field1096, 22050, class252.field4458, arg7);
        if (arg3 != 5497) {
            return;
        }
        int var12 = class68.method609(class275.field4804, 22050, class167.field3064, arg1 + arg2);
        int var13 = class68.method609(class275.field4804, 22050, class167.field3064, arg0 - arg2);
        for (int var14 = var8; var14 < var12; var14++) {
            class194.method1405(true, class121.field2390[var14], var11, var10, arg4);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class194.method1405(true, class121.field2390[var15], var11, var10, arg4);
        }
        int var16 = class68.method609(class48.field1096, 22050, class252.field4458, arg2 + arg5);
        int var17 = class68.method609(class48.field1096, 22050, class252.field4458, arg7 - arg2);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class121.field2390[var18];
            class194.method1405(true, var19, var16, var10, arg4);
            class194.method1405(true, var19, var17, var16, arg6);
            class194.method1405(true, var19, var11, var17, arg4);
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)Lsg;")
    public final class30 method290(int arg0) {
        field595++;
        if (arg0 != -1) {
            this.method270((class30) null, -108, 49, (byte) 58);
        }
        class30 var2 = new class30();
        var2.field576 = this.field576;
        var2.field618 = new byte[var2.field576];
        for (int var3 = 0; var3 < this.field576; var3++) {
            var2.field618[this.field576 - var3 - 1] = this.field618[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILsg;)I")
    public final int method291(int arg0, int arg1, class30 arg2) {
        int[] var4 = new int[arg2.field576];
        field593++;
        int[] var5 = new int[arg2.field576];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field576;
        }
        for (int var8 = 1; var8 <= arg2.field576; var8++) {
            var4[var8 - 1] = (arg2.field576 << 1) - var8;
            var6[class68.method612(arg2.field618[var8 - 1], 255)] = arg2.field576 - var8;
        }
        int var9 = arg2.field576 + 1;
        for (int var10 = arg2.field576; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg2.field576 && arg2.field618[var9 - 1] != arg2.field618[var10 - 1]) {
                if (var4[var9 - 1] >= arg2.field576 - var10) {
                    var4[var9 - 1] = arg2.field576 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        if (arg1 < 21) {
            this.method257(20, 51);
        }
        int var11 = 1;
        int var12 = 0;
        int var13 = var9;
        int var14 = arg2.field576 + 1 - var9;
        int var15 = 1;
        while (var14 >= var15) {
            var5[var15 - 1] = var12;
            while (var12 >= 1 && arg2.field618[var12 - 1] != arg2.field618[var15 - 1]) {
                var12 = var5[var12 - 1];
            }
            var15++;
            var12++;
        }
        while (arg2.field576 > var13) {
            for (int var18 = var11; var18 <= var13; var18++) {
                if (var4[var18 - 1] >= (arg2.field576 + var13 - var18)) {
                    var4[var18 - 1] = arg2.field576 + var13 - var18;
                }
            }
            var11 = var13 + 1;
            var13 = var13 + var14 - var5[var14 + -1];
            var14 = var5[var14 - 1];
        }
        int var17;
        for (int var16 = arg2.field576 + arg0 - 1; var16 < this.field576; var16 += Math.max(var6[this.field618[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field576 - 1; var17 >= 0 && this.field618[var16] == arg2.field618[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(B)Lsg;")
    public final class30 method292(byte arg0) {
        class30 var2 = new class30();
        var2.field576 = this.field576;
        field630++;
        var2.field618 = new byte[this.field576];
        for (int var3 = 0; var3 < this.field576; var3++) {
            byte var4 = this.field618[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field618[var3] = var4;
        }
        if (arg0 == 43) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(ILsg;)Lsg;")
    public final class30 method293(int arg0, class30 arg1) {
        field631++;
        if (!this.field579) {
            throw new IllegalArgumentException();
        }
        if (arg0 > -80) {
            field602 = null;
        }
        this.field626 = 0;
        if (this.field618.length < this.field576 + arg1.field576) {
            int var3;
            for (var3 = 1; var3 < (this.field576 + arg1.field576); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class26.method235(this.field618, 0, var4, 0, this.field576);
            this.field618 = var4;
        }
        class26.method235(arg1.field618, 0, this.field618, this.field576, arg1.field576);
        this.field576 += arg1.field576;
        return this;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
    public final Object method294(Applet arg0, int arg1) throws Throwable {
        field587++;
        String var3 = new String(this.field618, arg1, this.field576);
        Object var4 = class118.method904((Object[]) null, arg0, var3, (byte) -12);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class255.method1775(var5.length, var5, 2, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method295(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 >= -116) {
            return;
        }
        field586++;
        String var5;
        try {
            var5 = new String(this.field618, 0, this.field576, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field618, 0, this.field576);
        }
        arg3.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!sg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field594++;
        if (!arg0 instanceof class30) {
            throw new IllegalArgumentException();
        }
        return this.method267(-52, (class30) arg0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[BI)I")
    public final int method296(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        class26.method235(this.field618, arg0, arg3, arg1, arg2 - arg0);
        if (arg4 != 17044) {
            this.method253((byte) -106, (Applet) null);
        }
        field567++;
        return arg2 - arg0;
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "(B)J")
    public final long method297(byte arg0) {
        if (arg0 > -43) {
            return 69L;
        }
        field623++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field576 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field618[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 - 21);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLsg;Lsg;)Lsg;")
    public final class30 method298(byte arg0, class30 arg1, class30 arg2) {
        field629++;
        int var4 = arg1.field576 - arg2.field576;
        int var5 = 0;
        int var6 = this.field576;
        while (true) {
            int var7 = this.method291(var5, 28, arg2);
            if (var7 < 0) {
                int var8 = -104 % (arg0 / 57);
                int var9 = 0;
                class30 var10 = class136.method1023(6534, var6);
                while (true) {
                    int var11 = this.method291(var9, 74, arg2);
                    if (var11 < 0) {
                        while (var9 < this.field576) {
                            var10.method264(0, this.field618[var9++] & 0xFF);
                        }
                        return var10;
                    }
                    while (var11 > var9) {
                        var10.method264(0, this.field618[var9++] & 0xFF);
                    }
                    var10.method293(-84, arg1);
                    var9 += arg2.field576;
                }
            }
            var6 += var4;
            var5 = arg2.field576 + var7;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method299(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
