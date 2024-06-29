import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 implements class127 {

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Z")
    private boolean field976 = true;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lgd;")
    public static class40 field968 = class14.method90(false, "Hierhin gehen");

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Lgd;")
    public static class40 field971 = class14.method90(false, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "Lgd;")
    private static class40 field995 = class14.method90(false, "Malformed login packet)3");

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lgd;")
    public static class40 field963 = field995;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lba;")
    public static class7 field972 = new class7(64);

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Z")
    public static boolean field999 = false;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1001 = 0;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lgd;")
    public static class40 field1002 = class14.method90(false, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lrb;")
    public static class103 field998;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lwe;")
    public static class137 field1000;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field1003;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[B")
    public byte[] field948;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method278(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I", line = 8)
    public final int method239(int arg0) {
        field994++;
        if (arg0 != 10505) {
            field971 = null;
        }
        return this.method241(-34, 10);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lgd;", line = 24)
    public final class40 method240(int arg0, int arg1) {
        if (arg0 == -28427) {
            field982++;
            return this.method242(arg1, arg0 + 15979, this.field950);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I", line = 38)
    private final int method241(int arg0, int arg1) {
        field951++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 != -34) {
            this.field962 = -42;
        }
        for (int var6 = 0; var6 < this.field950; var6++) {
            int var7 = this.field948[var6] & 0xFF;
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
            if (var8 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var5 = true;
            var4 = var8;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 116)
    public final boolean equals(Object arg0) {
        field955++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!gd", name = "hashCode", descriptor = "()I", line = 126)
    public final int hashCode() {
        field960++;
        return this.method253((byte) -49);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lgd;", line = 134)
    public final class40 method242(int arg0, int arg1, int arg2) {
        field954++;
        class40 var4 = new class40();
        if (arg1 != -12448) {
            this.method240(-56, -118);
        }
        var4.field950 = arg2 - arg0;
        var4.field948 = new byte[arg2 - arg0];
        class84.method556(this.field948, arg0, var4.field948, 0, var4.field950);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 150)
    public static final void method243(byte arg0) {
        field973++;
        if (class110.field2684 != null) {
            class110.field2684.method1079(true);
            class110.field2684 = null;
        }
        class21.method123(-104);
        class21.field490.method949();
        for (int var1 = 0; var1 < 4; var1++) {
            class54.field1392[var1].method694(16777215);
        }
        System.gc();
        class94.method634((byte) 124, 10);
        if (arg0 < 27) {
            field972 = null;
        }
        class94.field2178 = 0;
        class137.field3362 = -1;
        class67.method481(7);
        class106.method822(true, 10);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lgd;", line = 189)
    public final class40 method244(int arg0) {
        class40 var2 = new class40();
        var2.field950 = this.field950;
        field966++;
        var2.field948 = new byte[this.field950];
        boolean var3 = true;
        for (int var4 = arg0; var4 < this.field950; var4++) {
            byte var5 = this.field948[var4];
            if (var5 == 95) {
                var2.field948[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field948[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field948[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Lgd;", line = 231)
    public final class40 method245(int arg0) {
        long var2 = this.method270(26334);
        field979++;
        synchronized (field1003 == null ? (field1003 = method278("gd")) : field1003) {
            if (arg0 != 11037) {
                this.hashCode();
            }
            if (class2.field47 == null) {
                class2.field47 = new class24(4096);
            } else {
                for (class51 var5 = (class51) class2.field47.method142(var2, 23056); var5 != null; var5 = (class51) class2.field47.method150(19170)) {
                    if (this.method269(var5.field1295, arg0 ^ 0xFFFFD4DF)) {
                        return var5.field1295;
                    }
                }
            }
            class51 var7 = new class51();
            this.field976 = false;
            var7.field1295 = this;
            class2.field47.method144(var7, var2, arg0 ^ 0x68D9);
            return this;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)J", line = 283)
    public final long method246(int arg0) {
        field957++;
        long var2 = 0L;
        int var4 = 0;
        int var5 = -43 / ((15 - arg0) / 37);
        while (this.field950 > var4 && var4 < 12) {
            var2 *= 37L;
            byte var6 = this.field948[var4];
            if (var6 >= 65 && var6 <= 90) {
                var2 += var6 + 1 - 65;
            } else if (var6 >= 97 && var6 <= 122) {
                var2 += var6 + 1 - 97;
            } else if (var6 >= 48 && var6 <= 57) {
                var2 += var6 - 21;
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBI)I", line = 327)
    private final int method247(int arg0, byte arg1, int arg2) {
        field956++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field950; var5++) {
            if (this.field948[var5] == var4) {
                return var5;
            }
        }
        if (arg1 >= -98) {
            method243((byte) 102);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgd;I)Lgd;", line = 355)
    public final class40 method248(class40 arg0, int arg1) {
        field996++;
        if (!this.field976) {
            throw new IllegalArgumentException();
        }
        this.field962 = 0;
        if (this.field948.length < this.field950 + arg0.field950) {
            int var3;
            for (var3 = 1; var3 < this.field950 + arg0.field950; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class84.method556(this.field948, 0, var4, 0, this.field950);
            this.field948 = var4;
        }
        class84.method556(arg0.field948, 0, this.field948, this.field950, arg0.field950);
        if (arg1 == 12348) {
            this.field950 += arg0.field950;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)I", line = 398)
    public final int method249(byte arg0, int arg1) {
        field984++;
        if (arg0 > -54) {
            method251(-8);
        }
        return this.field948[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 419)
    public final void method250(int arg0, Graphics arg1, int arg2, int arg3) {
        field985++;
        if (arg2 != -8874) {
            field1000 = null;
        }
        String var5;
        try {
            var5 = new String(this.field948, 0, this.field950, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field948, 0, this.field950);
        }
        arg1.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V", line = 438)
    public static void method251(int arg0) {
        field968 = null;
        field998 = null;
        field1002 = null;
        field963 = null;
        field1000 = null;
        field995 = null;
        field972 = null;
        field971 = null;
        if (arg0 != -10) {
            method243((byte) -78);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(BI)Z", line = 460)
    private final boolean method252(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field991++;
        boolean var3 = false;
        if (arg0 > -18) {
            field1001 = -28;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field950; var6++) {
            int var7 = this.field948[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I", line = 532)
    public final int method253(byte arg0) {
        field980++;
        int var2 = 0;
        if (arg0 == -49) {
            for (int var3 = 0; var3 < this.field950; var3++) {
                var2 = (var2 << 5) + (this.field948[var3] & 0xFF) - var2;
            }
            return var2;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 553)
    public final int method254(FontMetrics arg0, int arg1) {
        field952++;
        String var3;
        try {
            var3 = new String(this.field948, arg1, this.field950, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field948, 0, this.field950);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I", line = 571)
    public final int method255(int arg0) {
        if (arg0 == -10) {
            field981++;
            return this.field950;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Lgd;", line = 591)
    public final class40 method256(byte arg0) {
        field947++;
        if (arg0 != -38) {
            this.method273(null, 52);
        }
        class40 var2 = new class40();
        var2.field950 = this.field950;
        var2.field948 = new byte[this.field950];
        for (int var3 = 0; var3 < this.field950; var3++) {
            var2.field948[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)Lgd;", line = 620)
    public final class40 method257(int arg0) {
        field977++;
        class40 var2 = new class40();
        if (arg0 != 122) {
            return null;
        }
        boolean var3 = true;
        var2.field950 = this.field950;
        var2.field948 = new byte[this.field950];
        for (int var4 = 0; var4 < this.field950; var4++) {
            byte var5 = this.field948[var4];
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
            var2.field948[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgd;B)I", line = 670)
    public final int method258(class40 arg0, byte arg1) {
        int var3 = -24 % ((arg1 + 6) / 53);
        field961++;
        return this.method263(0, true, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Lgd;", line = 688)
    public final class40 method259(byte arg0) {
        int var2;
        for (var2 = 0; this.field950 > var2 && (this.field948[var2] >= 0 && this.field948[var2] <= 32 || (this.field948[var2] & 0xFF) == 160); var2++) {
        }
        field959++;
        int var3;
        for (var3 = this.field950; var3 > var2 && (this.field948[var3 - 1] >= 0 && this.field948[var3 - 1] <= 32 || (this.field948[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field950 == var3) {
            return this;
        }
        class40 var4 = new class40();
        var4.field950 = var3 - var2;
        var4.field948 = new byte[var4.field950];
        int var5 = 23 / ((arg0 - 60) / 44);
        for (int var6 = 0; var6 < var4.field950; var6++) {
            var4.field948[var6] = this.field948[var2 + var6];
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lgd;B)Z", line = 724)
    public final boolean method260(class40 arg0, byte arg1) {
        field987++;
        if (arg0 == null) {
            return false;
        } else if (this.field950 == arg0.field950) {
            if (arg1 != 109) {
                this.method270(3);
            }
            for (int var3 = 0; var3 < this.field950; var3++) {
                byte var4 = this.field948[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field948[var3];
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

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lgd;Z)Z", line = 767)
    public final boolean method261(class40 arg0, boolean arg1) {
        field992++;
        if (arg0.field950 > this.field950) {
            return false;
        }
        int var3 = this.field950 - arg0.field950;
        if (arg1) {
            this.method254(null, -86);
        }
        for (int var4 = 0; var4 < arg0.field950; var4++) {
            if (this.field948[var3 + var4] != arg0.field948[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)Lgd;", line = 801)
    public final class40 method262(byte arg0) {
        field958++;
        class40 var2 = new class40();
        var2.field948 = new byte[12];
        int var3 = 0;
        var2.field950 = 0;
        for (int var4 = 0; var4 < this.field950; var4++) {
            if (this.field948[var4] >= 65 && this.field948[var4] <= 90) {
                var2.field948[var3++] = (byte) (this.field948[var4] + 97 - 65);
                var2.field950 = var3;
            } else if (this.field948[var4] >= 97 && this.field948[var4] <= 122 || this.field948[var4] >= 48 && this.field948[var4] <= 57) {
                var2.field948[var3++] = this.field948[var4];
                var2.field950 = var3;
            } else if (var3 > 0) {
                var2.field948[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        if (arg0 <= 15) {
            field1001 = -79;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLgd;)I", line = 865)
    private final int method263(int arg0, boolean arg1, class40 arg2) {
        field949++;
        int[] var4 = new int[arg2.field950];
        int[] var5 = new int[arg2.field950];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field950;
        }
        for (int var8 = 1; var8 <= arg2.field950; var8++) {
            var4[var8 - 1] = (arg2.field950 << 1) - var8;
            var6[class101.method709(arg2.field948[var8 - 1], 255)] = arg2.field950 - var8;
        }
        int var9 = arg2.field950 + 1;
        for (int var10 = arg2.field950; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg2.field950 && arg2.field948[var9 - 1] != arg2.field948[var10 - 1]) {
                if (arg2.field950 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field950 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = 0;
        int var12 = var9;
        int var13 = 1;
        int var14 = arg2.field950 + 1 - var9;
        int var15 = 1;
        while (var15 <= var14) {
            var5[var15 - 1] = var11;
            while (var11 >= 1 && arg2.field948[var11 - 1] != arg2.field948[var15 - 1]) {
                var11 = var5[var11 - 1];
            }
            var15++;
            var11++;
        }
        while (arg2.field950 > var12) {
            for (int var18 = var13; var18 <= var12; var18++) {
                if (arg2.field950 + var12 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = arg2.field950 + var12 - var18;
                }
            }
            var13 = var12 + 1;
            var12 = var12 + var14 - var5[var14 + -1];
            var14 = var5[var14 - 1];
        }
        if (!arg1) {
            this.method272(25, null, (byte) 101);
        }
        int var17;
        for (int var16 = arg0 + arg2.field950 - 1; var16 < this.field950; var16 += Math.max(var6[this.field948[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field950 - 1; var17 >= 0 && this.field948[var16] == arg2.field948[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(BI)Lgd;", line = 979)
    public final class40 method264(byte arg0, int arg1) {
        field993++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field976) {
            int var3 = 74 / ((51 - arg0) / 42);
            this.field962 = 0;
            if (this.field948.length == this.field950) {
                int var4;
                for (var4 = 1; var4 <= this.field950; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class84.method556(this.field948, 0, var5, 0, this.field950);
                this.field948 = var5;
            }
            this.field948[this.field950++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BZI)I", line = 1015)
    public final int method265(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.hashCode();
        }
        field964++;
        class84.method556(this.field948, arg0, arg2, arg4, arg1 - arg0);
        return arg1 - arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lrb;Lrb;BLrb;)V", line = 1030)
    public static final void method266(class103 arg0, class103 arg1, byte arg2, class103 arg3) {
        field986++;
        class85.field1897 = arg3;
        class23.field544 = arg0;
        if (arg2 <= 74) {
            field995 = null;
        }
        class8.field222 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;", line = 1044)
    public final String toString() {
        field983++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)Lgd;", line = 1054)
    public final class40 method267(int arg0) {
        class40 var2 = new class40();
        var2.field950 = this.field950;
        var2.field948 = new byte[this.field950];
        for (int var3 = 0; var3 < this.field950; var3++) {
            byte var4 = this.field948[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field948[var3] = var4;
        }
        if (arg0 < 99) {
            this.method246(39);
        }
        field974++;
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)[B", line = 1093)
    public final byte[] method268(int arg0) {
        field989++;
        if (arg0 != 0) {
            this.field976 = false;
        }
        byte[] var2 = new byte[this.field950];
        class84.method556(this.field948, 0, var2, 0, this.field950);
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lgd;I)Z", line = 1109)
    public final boolean method269(class40 arg0, int arg1) {
        field988++;
        if (arg0 == null) {
            return false;
        } else if (this.field950 == arg0.field950) {
            if (!this.field976 || !arg0.field976) {
                if (this.field962 == 0) {
                    this.field962 = this.method253((byte) -49);
                    if (this.field962 == 0) {
                        this.field962 = 1;
                    }
                }
                if (arg0.field962 == 0) {
                    arg0.field962 = arg0.method253((byte) -49);
                    if (arg0.field962 == 0) {
                        arg0.field962 = 1;
                    }
                }
                if (this.field962 != arg0.field962) {
                    return false;
                }
            }
            if (arg1 != -62) {
                this.method250(121, null, 85, -93);
            }
            for (int var3 = 0; var3 < this.field950; var3++) {
                if (this.field948[var3] != arg0.field948[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)J", line = 1163)
    private final long method270(int arg0) {
        field953++;
        if (arg0 != 26334) {
            this.field948 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field950; var4++) {
            var2 = (var2 << 5) + (long) (this.field948[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(BI)I", line = 1190)
    public final int method271(byte arg0, int arg1) {
        if (arg0 > -6) {
            this.field950 = 80;
        }
        field946++;
        return this.method247(arg1, (byte) -114, 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILgd;B)Lgd;", line = 1202)
    public final class40 method272(int arg0, class40 arg1, byte arg2) {
        field967++;
        if (!this.field976) {
            throw new IllegalArgumentException();
        } else if (arg0 > this.field950) {
            throw new IllegalArgumentException();
        } else if (arg2 == 62) {
            this.field962 = 0;
            if (arg0 + arg1.field950 > this.field948.length) {
                int var4;
                for (var4 = 1; var4 < arg1.field950 + arg0; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class84.method556(this.field948, 0, var5, 0, this.field950);
                this.field948 = var5;
            }
            class84.method556(arg1.field948, 0, this.field948, arg0, arg1.field950);
            if (arg1.field950 + arg0 > this.field950) {
                this.field950 = arg0 + arg1.field950;
            }
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lgd;I)I", line = 1262)
    public final int method273(class40 arg0, int arg1) {
        if (arg1 != 1) {
            return -65;
        }
        field990++;
        int var3;
        if (arg0.field950 >= this.field950) {
            var3 = this.field950;
        } else {
            var3 = arg0.field950;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0.field948[var4] > this.field948[var4]) {
                return -1;
            }
            if (arg0.field948[var4] < this.field948[var4]) {
                return 1;
            }
        }
        if (this.field950 < arg0.field950) {
            return -1;
        } else if (this.field950 > arg0.field950) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "(I)Z", line = 1306)
    public final boolean method274(int arg0) {
        field969++;
        if (arg0 != 70) {
            this.method273(null, 13);
        }
        return this.method252((byte) -64, 10);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lgd;", line = 1320)
    public final class40 method275(int arg0, byte arg1) {
        field965++;
        if (arg1 >= -93) {
            return null;
        } else if (arg0 > 0 && arg0 <= 255) {
            class40 var3 = new class40();
            var3.field948 = new byte[this.field950 + 1];
            var3.field950 = this.field950 + 1;
            class84.method556(this.field948, 0, var3.field948, 0, this.field950);
            var3.field948[this.field950] = (byte) arg0;
            return var3;
        } else {
            throw new IllegalArgumentException("invalid char");
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILgd;)Z", line = 1352)
    public final boolean method276(int arg0, class40 arg1) {
        field997++;
        if (this.field950 < arg1.field950) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field950; var3++) {
            if (this.field948[var3] != arg1.field948[var3]) {
                return false;
            }
        }
        if (arg0 != 36) {
            this.method240(-20, -27);
        }
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "(I)Lgd;", line = 1405)
    public final class40 method277(int arg0) {
        field970++;
        if (!this.field976) {
            throw new IllegalArgumentException();
        }
        this.field962 = arg0;
        if (this.field948.length != this.field950) {
            byte[] var2 = new byte[this.field950];
            class84.method556(this.field948, 0, var2, 0, this.field950);
            this.field948 = var2;
        }
        return this;
    }
}
