import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 implements class10 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
    private boolean field76 = true;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field105 = -1;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Z")
    public static boolean field112 = true;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lbd;")
    public static class12 field79 = new class12(64);

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lae;")
    private static class6 field126 = class64.method474(116, "Unexpected server response");

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lae;")
    public static class6 field124 = field126;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "Lsb;")
    public static class111 field128 = new class111(5000);

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lae;")
    public static class6 field129 = class64.method474(123, "@cya@");

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "[I")
    public static int[] field131 = new int[4000];

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lae;")
    public static class6 field130 = class64.method474(109, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field99;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field133;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[B")
    public byte[] field114;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method69(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILae;ILae;BII)V", line = 4)
    public static final void method26(int arg0, class6 arg1, int arg2, class6 arg3, byte arg4, int arg5, int arg6) {
        field83++;
        if (class85.field2058 < 500) {
            if (arg3.method41(-8521) <= 0) {
                class57.field1247[class85.field2058] = arg1;
            } else {
                class57.field1247[class85.field2058] = class85.method731(new class6[] { arg1, class104.field2460, arg3 }, 14569);
            }
            class61.field1333[class85.field2058] = arg6;
            class15.field303[class85.field2058] = arg5;
            class16.field329[class85.field2058] = arg0;
            class79.field1929[class85.field2058] = arg2;
            class85.field2058++;
        }
        if (arg4 >= -1) {
            method33(118);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I", line = 28)
    public final int method27(byte arg0) {
        if (arg0 <= 107) {
            field132 = 16;
        }
        field96++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field93; var3++) {
            var2 = (this.field114[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Lae;", line = 55)
    public final class6 method28(int arg0) {
        field103++;
        long var2 = this.method65(0);
        synchronized (field133 == null ? (field133 = method69("ae")) : field133) {
            if (class12.field225 == null) {
                class12.field225 = new class30(4096);
            } else {
                for (class52 var5 = (class52) class12.field225.method276((byte) -19, var2); var5 != null; var5 = (class52) class12.field225.method273((byte) 79)) {
                    if (this.method60(var5.field1166, (byte) 113)) {
                        return var5.field1166;
                    }
                }
            }
            class52 var7 = new class52();
            this.field76 = false;
            var7.field1166 = this;
            class12.field225.method269(var2, var7, (byte) -127);
            if (arg0 > -123) {
                this.method37(null, 36);
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lae;", line = 95)
    public final class6 method29(boolean arg0) {
        class6 var2 = new class6();
        var2.field93 = this.field93;
        var2.field114 = new byte[this.field93];
        field74++;
        boolean var3 = arg0;
        for (int var4 = 0; var4 < this.field93; var4++) {
            byte var5 = this.field114[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var3) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = false;
            }
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = true;
            }
            var2.field114[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lae;", line = 142)
    public final class6 method30(int arg0, int arg1, int arg2) {
        field121++;
        class6 var4 = new class6();
        if (arg1 == -1) {
            var4.field114 = new byte[arg2 - arg0];
            var4.field93 = arg2 - arg0;
            class53.method417(this.field114, arg0, var4.field114, 0, var4.field93);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILae;)Z", line = 160)
    public static final boolean method31(int arg0, class6 arg1) {
        field78++;
        if (arg0 != 21469) {
            method66(18);
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class7.field139; var2++) {
            if (arg1.method68(class41.field924[var2], arg0 - 21535)) {
                return true;
            }
        }
        return arg1.method68(class12.field229.field1456, -66);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Z", line = 190)
    private final boolean method32(boolean arg0, int arg1) {
        field116++;
        if (!arg0) {
            return false;
        }
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field93; var6++) {
            int var7 = this.field114[var6] & 0xFF;
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

    @OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;", line = 267)
    public final String toString() {
        field77++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 280)
    public static final void method33(int arg0) {
        if (class19.field370[98]) {
            class70.field1555 += (12 - class70.field1555) / 2;
        } else if (class19.field370[99]) {
            class70.field1555 += (-class70.field1555 - 12) / 2;
        } else {
            class70.field1555 /= 2;
        }
        if (class19.field370[96]) {
            class62.field1360 += (-class62.field1360 - 24) / 2;
        } else if (class19.field370[97]) {
            class62.field1360 += (24 - class62.field1360) / 2;
        } else {
            class62.field1360 /= 2;
        }
        class60.field1307 = class62.field1360 / 2 + class60.field1307 & 0x7FF;
        class21.field506 += class70.field1555 / 2;
        int var1 = 28 / ((65 - arg0) / 58);
        field89++;
        if (class21.field506 < 128) {
            class21.field506 = 128;
        }
        if (class21.field506 > 383) {
            class21.field506 = 383;
        }
        int var2 = class25.field627 + class12.field229.field1783;
        int var3 = class77.field1841 + class12.field229.field1752;
        if (class70.field1547 - var2 < -500 || class70.field1547 - var2 > 500 || class96.field2285 - var3 < -500 || class96.field2285 - var3 > 500) {
            class70.field1547 = var2;
            class96.field2285 = var3;
        }
        if (class70.field1547 != var2) {
            class70.field1547 += (var2 - class70.field1547) / 16;
        }
        if (class96.field2285 != var3) {
            class96.field2285 += (var3 - class96.field2285) / 16;
        }
        int var4 = class70.field1547 >> 7;
        int var5 = class96.field2285 >> 7;
        int var6 = class20.method193(class96.field2285, 9990, class15.field305, class70.field1547);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = class15.field305;
                    if (var10 < 3 && (class108.field2582[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class137.field3331[var10][var8][var9];
                    if (var7 < var11) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > class12.field220) {
            class12.field220 += (var12 - class12.field220) / 24;
        } else if (var12 < class12.field220) {
            class12.field220 += (var12 - class12.field220) / 80;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLae;)Lae;", line = 392)
    public final class6 method34(int arg0, byte arg1, class6 arg2) {
        field87++;
        if (!this.field76) {
            throw new IllegalArgumentException();
        } else if (arg0 > this.field93) {
            throw new IllegalArgumentException();
        } else {
            this.field100 = 0;
            if (this.field114.length < arg2.field93 + arg0) {
                int var4;
                for (var4 = 1; var4 < arg2.field93 + arg0; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class53.method417(this.field114, 0, var5, 0, this.field93);
                this.field114 = var5;
            }
            class53.method417(arg2.field114, 0, this.field114, arg0, arg2.field93);
            if (arg1 != 84) {
                this.method64((byte) -32, null, -24);
            }
            if (arg2.field93 + arg0 > this.field93) {
                this.field93 = arg2.field93 + arg0;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 441)
    public static void method35(byte arg0) {
        field124 = null;
        field130 = null;
        field126 = null;
        field128 = null;
        field79 = null;
        field131 = null;
        field129 = null;
        if (arg0 <= 55) {
            field132 = -74;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lae;Z)Z", line = 464)
    public final boolean method36(class6 arg0, boolean arg1) {
        field115++;
        if (arg0.field93 > this.field93) {
            return false;
        }
        if (arg1) {
            this.method44((byte) -34);
        }
        for (int var3 = 0; var3 < arg0.field93; var3++) {
            if (this.field114[var3] != arg0.field114[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 497)
    public final int method37(FontMetrics arg0, int arg1) {
        field110++;
        String var3;
        try {
            var3 = new String(this.field114, 0, this.field93, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field114, 0, this.field93);
        }
        if (arg1 != -11) {
            this.method40((byte) -113);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I", line = 520)
    private final int method38(int arg0, byte arg1) {
        field123++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 < 72) {
            this.method30(89, -118, 87);
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        for (int var6 = 0; var6 < this.field93; var6++) {
            int var7 = this.field114[var6] & 0xFF;
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
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZII)I", line = 601)
    private final int method39(boolean arg0, int arg1, int arg2) {
        field90++;
        if (arg0) {
            return -92;
        }
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field93; var5++) {
            if (this.field114[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)Lae;", line = 628)
    public final class6 method40(byte arg0) {
        if (arg0 != -45) {
            field98 = -73;
        }
        field122++;
        int var2 = 0;
        int var3 = this.field93;
        while (this.field93 > var2 && (this.field114[var2] >= 0 && this.field114[var2] <= 32 || (this.field114[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field114[var3 - 1] >= 0 && this.field114[var3 - 1] <= 32 || (this.field114[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field93 == var3) {
            return this;
        }
        class6 var4 = new class6();
        var4.field93 = var3 - var2;
        var4.field114 = new byte[var4.field93];
        for (int var5 = 0; var5 < var4.field93; var5++) {
            var4.field114[var5] = this.field114[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I", line = 668)
    public final int method41(int arg0) {
        if (arg0 == -8521) {
            field95++;
            return this.field93;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lae;", line = 681)
    public final class6 method42(int arg0, int arg1) {
        field119++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field76) {
            this.field100 = arg0;
            if (this.field114.length == this.field93) {
                int var3;
                for (var3 = 1; var3 <= this.field93; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class53.method417(this.field114, 0, var4, 0, this.field93);
                this.field114 = var4;
            }
            this.field114[this.field93++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)J", line = 716)
    public final long method43(byte arg0) {
        field92++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != -56) {
            method62((byte) 24);
        }
        while (this.field93 > var4 && var4 < 12) {
            var2 *= 37L;
            byte var5 = this.field114[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
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

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)Lae;", line = 761)
    public final class6 method44(byte arg0) {
        field117++;
        class6 var2 = new class6();
        if (arg0 >= -42) {
            return null;
        }
        var2.field93 = this.field93;
        var2.field114 = new byte[this.field93];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field93; var4++) {
            byte var5 = this.field114[var4];
            if (var5 == 95) {
                var2.field114[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field114[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field114[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Lae;", line = 806)
    public final class6 method45(int arg0) {
        field113++;
        if (arg0 != 373233063) {
            return null;
        }
        class6 var2 = new class6();
        var2.field93 = this.field93;
        var2.field114 = new byte[this.field93];
        for (int var3 = 0; var3 < this.field93; var3++) {
            var2.field114[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Lae;", line = 831)
    public final class6 method46(int arg0) {
        field86++;
        if (!this.field76) {
            throw new IllegalArgumentException();
        }
        this.field100 = 0;
        int var2 = 25 / ((arg0 - 71) / 40);
        if (this.field114.length != this.field93) {
            byte[] var3 = new byte[this.field93];
            class53.method417(this.field114, 0, var3, 0, this.field93);
            this.field114 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(B)I", line = 861)
    public final int method47(byte arg0) {
        field127++;
        return arg0 == -71 ? this.method38(10, (byte) 84) : 46;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)Lae;", line = 879)
    public final class6 method48(int arg0) {
        field107++;
        class6 var2 = new class6();
        var2.field93 = this.field93;
        var2.field114 = new byte[this.field93];
        for (int var3 = 0; var3 < this.field93; var3++) {
            byte var4 = this.field114[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field114[var3] = var4;
        }
        if (arg0 != 17183) {
            method26(94, null, -53, null, (byte) 119, -42, 30);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)[B", line = 909)
    public final byte[] method49(int arg0) {
        field118++;
        if (arg0 != 4484) {
            field112 = false;
        }
        byte[] var2 = new byte[this.field93];
        class53.method417(this.field114, 0, var2, 0, this.field93);
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 925)
    public final void method50(int arg0, int arg1, byte arg2, Graphics arg3) {
        field104++;
        String var5;
        try {
            var5 = new String(this.field114, 0, this.field93, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field114, 0, this.field93);
        }
        arg3.drawString(var5, arg1, arg0);
        if (arg2 != 13) {
            this.method27((byte) 76);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILae;)I", line = 946)
    public final int method51(int arg0, class6 arg1) {
        field94++;
        if (arg0 != 22938) {
            this.equals(null);
        }
        return this.method64((byte) 72, arg1, 0);
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)Lae;", line = 957)
    public final class6 method52(int arg0) {
        class6 var2 = new class6();
        var2.field114 = new byte[12];
        int var3 = 0;
        if (arg0 != -32769) {
            return null;
        }
        var2.field93 = 0;
        for (int var4 = 0; var4 < this.field93; var4++) {
            if (this.field114[var4] >= 65 && this.field114[var4] <= 90) {
                var2.field114[var3++] = (byte) (this.field114[var4] + 97 - 65);
                var2.field93 = var3;
            } else if (this.field114[var4] >= 97 && this.field114[var4] <= 122 || this.field114[var4] >= 48 && this.field114[var4] <= 57) {
                var2.field114[var3++] = this.field114[var4];
                var2.field93 = var3;
            } else if (var3 > 0) {
                var2.field114[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        field73++;
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(ILae;)Lae;", line = 1004)
    public final class6 method53(int arg0, class6 arg1) {
        field125++;
        if (!this.field76) {
            throw new IllegalArgumentException();
        }
        this.field100 = 0;
        if (this.field114.length < this.field93 + arg1.field93) {
            int var3;
            for (var3 = 1; var3 < this.field93 + arg1.field93; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class53.method417(this.field114, 0, var4, 0, this.field93);
            this.field114 = var4;
        }
        if (arg0 != 27681) {
            this.hashCode();
        }
        class53.method417(arg1.field114, 0, this.field114, this.field93, arg1.field93);
        this.field93 += arg1.field93;
        return this;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[BII)I", line = 1039)
    public final int method54(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field101++;
        class53.method417(this.field114, arg1, arg2, arg3, arg4 - arg1);
        int var6 = -63 / ((arg0 + 61) / 52);
        return arg4 - arg1;
    }

    @OriginalMember(owner = "client!ae", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1058)
    public final boolean equals(Object arg0) {
        field88++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lae;I)Z", line = 1074)
    public final boolean method55(class6 arg0, int arg1) {
        field111++;
        if (this.field93 < arg0.field93) {
            return false;
        }
        int var3 = this.field93 - arg0.field93;
        for (int var4 = arg1; var4 < arg0.field93; var4++) {
            if (this.field114[var3 + var4] != arg0.field114[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lae;", line = 1098)
    public final class6 method56(int arg0, int arg1) {
        if (arg0 != -58) {
            this.field76 = false;
        }
        field102++;
        return this.method30(arg1, -1, this.field93);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lae;", line = 1123)
    public final class6 method57(byte arg0, int arg1) {
        field106++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class6 var3 = new class6();
        var3.field114 = new byte[this.field93 + 1];
        if (arg0 == -15) {
            var3.field93 = this.field93 + 1;
            class53.method417(this.field114, 0, var3.field114, 0, this.field93);
            var3.field114[this.field93] = (byte) arg1;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "hashCode", descriptor = "()I", line = 1157)
    public final int hashCode() {
        field97++;
        return this.method27((byte) 108);
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)Z", line = 1165)
    public final boolean method58(int arg0) {
        if (arg0 != 22415) {
            this.method32(true, -17);
        }
        field75++;
        return this.method32(true, 10);
    }

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)V", line = 1180)
    public static final void method59(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
        if (arg0 != -44) {
            method62((byte) -81);
        }
        field85++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lae;B)Z", line = 1210)
    public final boolean method60(class6 arg0, byte arg1) {
        field120++;
        if (arg0 == null) {
            return false;
        } else if (this.field93 == arg0.field93) {
            if (!this.field76 || !arg0.field76) {
                if (this.field100 == 0) {
                    this.field100 = this.method27((byte) 108);
                    if (this.field100 == 0) {
                        this.field100 = 1;
                    }
                }
                if (arg0.field100 == 0) {
                    arg0.field100 = arg0.method27((byte) 125);
                    if (arg0.field100 == 0) {
                        arg0.field100 = 1;
                    }
                }
                if (this.field100 != arg0.field100) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field93; var3++) {
                if (this.field114[var3] != arg0.field114[var3]) {
                    return false;
                }
            }
            return arg1 >= 110;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)I", line = 1263)
    public final int method61(int arg0, int arg1) {
        if (arg1 == -32011) {
            field109++;
            return this.field114[arg0] & 0xFF;
        } else {
            return -45;
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(B)V", line = 1274)
    public static final void method62(byte arg0) {
        field108++;
        if (arg0 >= -48) {
            field131 = null;
        }
        for (int var1 = 0; var1 < class138.field3365; var1++) {
            int var2 = class42.field967[var1];
            class2 var3 = class49.field1097[var2];
            if (var3 != null) {
                class32.method293((byte) 116, var3, var3.field11.field2347);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)I", line = 1315)
    public final int method63(byte arg0, int arg1) {
        if (arg0 < 112) {
            this.method46(-123);
        }
        field82++;
        return this.method39(false, arg1, 0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLae;I)I", line = 1331)
    private final int method64(byte arg0, class6 arg1, int arg2) {
        field81++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg1.field93];
        int[] var6 = new int[arg1.field93];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field93;
        }
        for (int var8 = 1; var8 <= arg1.field93; var8++) {
            var6[var8 - 1] = (arg1.field93 << 1) - var8;
            var4[class60.method451(arg1.field114[var8 - 1], 255)] = arg1.field93 - var8;
        }
        int var9 = arg1.field93 + 1;
        int var10 = arg1.field93;
        while (var10 > 0) {
            var5[var10 - 1] = var9;
            while (var9 <= arg1.field93 && arg1.field114[var9 - 1] != arg1.field114[var10 - 1]) {
                if (var6[var9 - 1] >= arg1.field93 - var10) {
                    var6[var9 - 1] = arg1.field93 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field93 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var12) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field114[var14 - 1] != arg1.field114[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg1.field93) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (arg1.field93 + var11 - var18 <= var6[var18 - 1]) {
                    var6[var18 - 1] = arg1.field93 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var5[var12 + -1];
            var12 = var5[var12 - 1];
        }
        int var16 = arg2 + arg1.field93 - 1;
        if (arg0 < 6) {
            field128 = null;
        }
        while (var16 < this.field93) {
            int var17;
            for (var17 = arg1.field93 - 1; var17 >= 0 && this.field114[var16] == arg1.field114[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
            var16 += Math.max(var4[this.field114[var16] & 0xFF], var6[var17]);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "(I)J", line = 1454)
    private final long method65(int arg0) {
        field80++;
        long var2 = (long) arg0;
        for (int var4 = 0; var4 < this.field93; var4++) {
            var2 = (var2 << 5) + (long) (this.field114[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "(I)V", line = 1478)
    public static final void method66(int arg0) {
        field91++;
        if (class54.field1188 != 0) {
            return;
        }
        class85.field2058 = 1;
        class61.field1333[0] = 1002;
        class57.field1247[0] = class66.field1468;
        if (class72.field1649 != -1) {
            class91.field2171 = -1;
            class41.field933 = -1;
            class40.method337(0, class117.field2771, class57.field1244, (byte) 124, 0, 0, class72.field1649, 765, 503);
            class96.field2269 = class91.field2171;
            class51.field1144 = class41.field933;
            return;
        }
        class26.method243((byte) 126);
        class41.field933 = -1;
        class91.field2171 = -1;
        if (class117.field2771 > 4 && class57.field1244 > 4 && class117.field2771 < 516 && class57.field1244 < 338) {
            if (class103.field2449 == -1) {
                class136.method1108(-65);
            } else {
                class40.method337(4, class117.field2771, class57.field1244, (byte) 126, 4, 0, class103.field2449, 516, 338);
            }
        }
        class51.field1144 = class41.field933;
        class96.field2269 = class91.field2171;
        class41.field933 = -1;
        class91.field2171 = -1;
        boolean var1 = false;
        if (arg0 < 7) {
            method33(113);
        }
        if (class117.field2771 > 553 && class57.field1244 > 205 && class117.field2771 < 743 && class57.field1244 < 466) {
            if (class126.field3086 != -1) {
                class40.method337(553, class117.field2771, class57.field1244, (byte) 114, 205, 1, class126.field3086, 743, 466);
            } else if (class102.field2412[class68.field1493] != -1) {
                class40.method337(553, class117.field2771, class57.field1244, (byte) 123, 205, 1, class102.field2412[class68.field1493], 743, 466);
            }
        }
        if (class91.field2171 != class16.field326) {
            class139.field3380 = true;
            class16.field326 = class91.field2171;
        }
        class91.field2171 = -1;
        if (class96.field2294 != class41.field933) {
            class96.field2294 = class41.field933;
            class139.field3380 = true;
        }
        class41.field933 = -1;
        if (class117.field2771 > 17 && class57.field1244 > 357 && class117.field2771 < 496 && class57.field1244 < 453) {
            if (class102.field2410 != -1) {
                class40.method337(17, class117.field2771, class57.field1244, (byte) 123, 357, 2, class102.field2410, 496, 453);
            } else if (class117.field2776 != -1) {
                class40.method337(17, class117.field2771, class57.field1244, (byte) 112, 357, 3, class117.field2776, 496, 453);
            } else if (class57.field1244 < 434 && class117.field2771 < 426) {
                class22.method220(-2, class57.field1244 - 357, class117.field2771 + -17);
            }
        }
        if ((class102.field2410 != -1 || class117.field2776 != -1) && class91.field2171 != class121.field2943) {
            class121.field2943 = class91.field2171;
            class20.field427 = true;
        }
        if ((class102.field2410 != -1 || class117.field2776 != -1) && class41.field933 != class118.field2807) {
            class20.field427 = true;
            class118.field2807 = class41.field933;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class85.field2058 - 1; var2++) {
                if (class61.field1333[var2] < 1000 && class61.field1333[var2 + 1] > 1000) {
                    var1 = false;
                    class6 var3 = class57.field1247[var2];
                    class57.field1247[var2] = class57.field1247[var2 + 1];
                    class57.field1247[var2 + 1] = var3;
                    int var4 = class61.field1333[var2];
                    class61.field1333[var2] = class61.field1333[var2 + 1];
                    class61.field1333[var2 + 1] = var4;
                    int var5 = class16.field329[var2];
                    class16.field329[var2] = class16.field329[var2 + 1];
                    class16.field329[var2 + 1] = var5;
                    int var6 = class79.field1929[var2];
                    class79.field1929[var2] = class79.field1929[var2 + 1];
                    class79.field1929[var2 + 1] = var6;
                    int var7 = class15.field303[var2];
                    class15.field303[var2] = class15.field303[var2 + 1];
                    class15.field303[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(ILae;)I", line = 1628)
    public final int method67(int arg0, class6 arg1) {
        if (arg0 != 10445) {
            this.field114 = null;
        }
        field84++;
        int var3;
        if (arg1.field93 >= this.field93) {
            var3 = this.field93;
        } else {
            var3 = arg1.field93;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1.field114[var4] > this.field114[var4]) {
                return -1;
            }
            if (this.field114[var4] > arg1.field114[var4]) {
                return 1;
            }
        }
        if (arg1.field93 > this.field93) {
            return -1;
        } else if (this.field93 > arg1.field93) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lae;I)Z", line = 1670)
    public final boolean method68(class6 arg0, int arg1) {
        field99++;
        if (arg0 == null) {
            return false;
        } else if (this.field93 != arg0.field93) {
            return false;
        } else if (arg1 == -66) {
            for (int var3 = 0; var3 < this.field93; var3++) {
                byte var4 = this.field114[var3];
                byte var5 = arg0.field114[var3];
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
}
