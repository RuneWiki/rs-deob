import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class150 implements class87 {

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
    private boolean field3684 = true;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lwd;")
    public static class150 field3674 = class2.method9(true, "Benutzen");

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lwd;")
    public static class150 field3662 = class2.method9(true, "Fertigkeit)2");

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
    public static int[] field3680 = new int[4000];

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "[I")
    public static int[] field3685 = new int[128];

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Lwd;")
    private static class150 field3701 = class2.method9(true, "Loading friend list");

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lwd;")
    public static class150 field3713 = class2.method9(true, "backtop1");

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field3712 = 0;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lwd;")
    public static class150 field3669 = field3701;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lwd;")
    private static class150 field3716 = class2.method9(true, "glow2:");

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lwd;")
    public static class150 field3702 = field3716;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lwd;")
    public static class150 field3704 = field3716;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "Lwd;")
    public static class150 field3721 = class2.method9(true, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Lhb;")
    public static class51 field3698;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lkc;")
    public static class72 field3664;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field3723;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[B")
    public byte[] field3678;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)[B")
    public final byte[] method1170(int arg0) {
        byte[] var2 = new byte[this.field3718];
        if (arg0 != -1) {
            this.method1178(-78, 16, 63);
        }
        class79.method577(this.field3678, 0, var2, 0, this.field3718);
        field3709++;
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)Z")
    private final boolean method1171(boolean arg0, int arg1) {
        field3695++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3718; var6++) {
            int var7 = this.field3678[var6] & 0xFF;
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

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
    public final boolean method1172(byte arg0) {
        if (arg0 >= -44) {
            field3698 = null;
        }
        field3706++;
        return this.method1171(false, 10);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Ljava/net/URL;")
    public final URL method1173(byte arg0) throws MalformedURLException {
        field3681++;
        int var2 = -94 % ((arg0 - 5) / 35);
        return new URL(new String(this.field3678, 0, this.field3718));
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)I")
    public final int method1174(byte arg0) {
        field3696++;
        return arg0 >= -113 ? 90 : this.field3718;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lwd;")
    public final class150 method1175(byte arg0) {
        class150 var2 = new class150();
        var2.field3718 = this.field3718;
        if (arg0 != 71) {
            this.method1186(false);
        }
        var2.field3678 = new byte[this.field3718];
        field3668++;
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3718; var4++) {
            byte var5 = this.field3678[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field3678[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field3678[var4] = (byte) (var5 - 32);
            } else {
                var2.field3678[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)J")
    private final long method1176(int arg0) {
        field3665++;
        long var2 = 0L;
        for (int var4 = arg0; var4 < this.field3718; var4++) {
            var2 = (var2 << 5) + (long) (this.field3678[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BIIIIII[Lme;)V")
    public static final void method1177(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class88[] arg9) {
        field3711++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg9[arg3].field2056[arg0 + var10][arg8 + var15] = class94.method667(arg9[arg3].field2056[arg0 + var10][arg8 + var15], -16777217);
                }
            }
        }
        if (arg6 != 40) {
            method1208(false);
        }
        class148 var11 = new class148(arg2);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg4 && var14 < arg4 + 8) {
                        class98.method680(arg1, arg3, 0, var11, class83.method605((byte) -107, var14 & 0x7, var13 & 0x7, arg1) + arg0, 0, false, class97.method677(arg1, var13 & 0x7, (byte) 89, var14 & 0x7) + arg8);
                    } else {
                        class98.method680(0, 0, 0, var11, -1, 0, false, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    private final int method1178(int arg0, int arg1, int arg2) {
        field3697++;
        byte var4 = (byte) arg1;
        int var5 = arg2;
        if (arg0 != 2047) {
            return 3;
        }
        while (var5 < this.field3718) {
            if (this.field3678[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lwd;")
    public final class150 method1179(int arg0) {
        field3682++;
        int var2 = 0;
        class150 var3 = new class150();
        var3.field3678 = new byte[12];
        var3.field3718 = 0;
        if (arg0 >= -24) {
            return null;
        }
        for (int var4 = 0; var4 < this.field3718; var4++) {
            if (this.field3678[var4] >= 65 && this.field3678[var4] <= 90) {
                var3.field3678[var2++] = (byte) (this.field3678[var4] + 32);
                var3.field3718 = var2;
            } else if (this.field3678[var4] >= 97 && this.field3678[var4] <= 122 || this.field3678[var4] >= 48 && this.field3678[var4] <= 57) {
                var3.field3678[var2++] = this.field3678[var4];
                var3.field3718 = var2;
            } else if (var2 > 0) {
                var3.field3678[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1180(byte arg0, byte[] arg1) {
        if (arg0 > -89) {
            field3704 = null;
        }
        field3687++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class79.method577(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLwd;)Z")
    public final boolean method1181(boolean arg0, class150 arg1) {
        field3677++;
        if (arg1 == null) {
            return false;
        }
        if (!arg0) {
            this.method1196(-38, -91);
        }
        if (this.field3718 != arg1.field3718) {
            return false;
        }
        for (int var3 = 0; var3 < this.field3718; var3++) {
            byte var4 = this.field3678[var3];
            byte var5 = arg1.field3678[var3];
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
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I")
    private final int method1182(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        if (arg1 <= 41) {
            this.method1170(72);
        }
        field3693++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3718; var6++) {
            int var7 = this.field3678[var6] & 0xFF;
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
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLwd;)Lwd;")
    public final class150 method1183(byte arg0, class150 arg1) {
        field3714++;
        if (arg0 != -8) {
            method1208(false);
        }
        if (!this.field3684) {
            throw new IllegalArgumentException();
        }
        this.field3710 = 0;
        if (this.field3678.length < this.field3718 + arg1.field3718) {
            int var3;
            for (var3 = 1; var3 < this.field3718 + arg1.field3718; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class79.method577(this.field3678, 0, var4, 0, this.field3718);
            this.field3678 = var4;
        }
        class79.method577(arg1.field3678, 0, this.field3678, this.field3718, arg1.field3718);
        this.field3718 += arg1.field3718;
        return this;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lwd;")
    public final class150 method1184(boolean arg0) {
        field3722++;
        if (!arg0) {
            this.method1178(73, 71, -10);
        }
        class150 var2 = new class150();
        var2.field3718 = this.field3718;
        var2.field3678 = new byte[this.field3718];
        for (int var3 = 0; var3 < this.field3718; var3++) {
            var2.field3678[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Lwd;")
    public final class150 method1185(int arg0) {
        field3717++;
        byte var2 = 2;
        class150 var3 = new class150();
        var3.field3718 = this.field3718;
        var3.field3678 = new byte[this.field3718];
        for (int var4 = 0; var4 < this.field3718; var4++) {
            byte var6 = this.field3678[var4];
            if (var6 >= 97 && var6 <= 122 || var6 >= -32 && var6 <= -2 && var6 != -9) {
                if (var2 == 2) {
                    var6 = (byte) (var6 - 32);
                }
                var2 = 0;
            } else if (var6 >= 65 && var6 <= 90 || !(var6 < -64 || var6 > -34 || var6 == -41)) {
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
            var3.field3678[var4] = var6;
        }
        int var5 = -68 % ((74 - arg0) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)Lwd;")
    public final class150 method1186(boolean arg0) {
        field3691++;
        class150 var2 = new class150();
        var2.field3718 = this.field3718;
        var2.field3678 = new byte[this.field3718];
        int var3 = 0;
        if (!arg0) {
            field3664 = null;
        }
        while (this.field3718 > var3) {
            byte var4 = this.field3678[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3678[var3] = var4;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lwd;")
    public final class150 method1187(byte arg0, int arg1) {
        field3700++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class150 var3 = new class150();
        var3.field3678 = new byte[this.field3718 + 1];
        var3.field3718 = this.field3718 + 1;
        class79.method577(this.field3678, 0, var3.field3678, 0, this.field3718);
        if (arg0 == -118) {
            var3.field3678[this.field3718] = (byte) arg1;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
    public final int method1188(int arg0) {
        field3686++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field3718; var3++) {
            var2 = (var2 << 5) + (this.field3678[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILwd;)Z")
    public final boolean method1189(int arg0, class150 arg1) {
        field3667++;
        if (arg1.field3718 > this.field3718) {
            return false;
        }
        int var3 = this.field3718 - arg1.field3718;
        if (arg0 > -63) {
            return false;
        }
        for (int var4 = 0; var4 < arg1.field3718; var4++) {
            if (this.field3678[var4 + var3] != arg1.field3678[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)I")
    public final int method1190(byte arg0, int arg1) {
        field3666++;
        return arg0 == -52 ? this.method1178(2047, arg1, 0) : -78;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)Lwd;")
    public final class150 method1191(boolean arg0) {
        field3675++;
        if (!this.field3684) {
            throw new IllegalArgumentException();
        }
        this.field3710 = 0;
        if (arg0) {
            this.method1188(-97);
        }
        if (this.field3678.length != this.field3718) {
            byte[] var2 = new byte[this.field3718];
            class79.method577(this.field3678, 0, var2, 0, this.field3718);
            this.field3678 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwd;I)Z")
    public final boolean method1192(class150 arg0, int arg1) {
        field3690++;
        if (arg0 == null) {
            return false;
        } else if (this.field3718 == arg0.field3718) {
            if (!this.field3684 || !arg0.field3684) {
                if (this.field3710 == 0) {
                    this.field3710 = this.method1188(0);
                    if (this.field3710 == 0) {
                        this.field3710 = 1;
                    }
                }
                if (arg0.field3710 == 0) {
                    arg0.field3710 = arg0.method1188(0);
                    if (arg0.field3710 == 0) {
                        arg0.field3710 = 1;
                    }
                }
                if (this.field3710 != arg0.field3710) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg1 != 1) {
                this.method1189(-11, null);
            }
            while (this.field3718 > var3) {
                if (this.field3678[var3] != arg0.field3678[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ILwd;)I")
    public final int method1193(int arg0, class150 arg1) {
        field3671++;
        int var3;
        if (arg1.field3718 >= this.field3718) {
            var3 = this.field3718;
        } else {
            var3 = arg1.field3718;
        }
        if (arg0 != -22403) {
            this.method1209((byte) 22, 54, 58, null, 83);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class101.field2312[this.field3678[var4] & 0xFF] < class101.field2312[arg1.field3678[var4] & 0xFF]) {
                return -1;
            }
            if (class101.field2312[arg1.field3678[var4] & 0xFF] < class101.field2312[this.field3678[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field3718 > this.field3718) {
            return -1;
        } else if (arg1.field3718 < this.field3718) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(BI)Lwd;")
    public final class150 method1194(byte arg0, int arg1) {
        field3705++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field3684) {
            this.field3710 = 0;
            if (this.field3678.length == this.field3718) {
                int var3;
                for (var3 = 1; var3 <= this.field3718; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class79.method577(this.field3678, 0, var4, 0, this.field3718);
                this.field3678 = var4;
            }
            this.field3678[this.field3718++] = (byte) arg1;
            if (arg0 != 20) {
                this.method1198(117);
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3720++;
        if (!(arg0 instanceof class150)) {
            throw new IllegalArgumentException();
        }
        return this.method1192((class150) arg0, 1);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method1195(int arg0, Graphics arg1, int arg2, byte arg3) {
        field3670++;
        String var5;
        try {
            var5 = new String(this.field3678, 0, this.field3718, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3678, 0, this.field3718);
        }
        arg1.drawString(var5, arg0, arg2);
        if (arg3 != -84) {
            field3702 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lwd;")
    public final class150 method1196(int arg0, int arg1) {
        if (arg1 != -31851) {
            this.method1170(-101);
        }
        field3703++;
        return this.method1202(arg0, this.field3718, 0);
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)I")
    public final int method1197(byte arg0) {
        if (arg0 != 38) {
            this.method1205(-125, null);
        }
        field3663++;
        return this.method1182(10, (byte) 112);
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)J")
    public final long method1198(int arg0) {
        field3679++;
        long var2 = 0L;
        if (arg0 != 1) {
            return 70L;
        }
        for (int var4 = 0; var4 < this.field3718 && var4 < 12; var4++) {
            byte var5 = this.field3678[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3683++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)Lwd;")
    public final class150 method1199(int arg0) {
        field3708++;
        long var2 = this.method1176(0);
        synchronized (field3723 == null ? (field3723 = method1211("wd")) : field3723) {
            if (arg0 != 4096) {
                this.method1188(-126);
            }
            if (class43.field1181 == null) {
                class43.field1181 = new class70(4096);
            } else {
                for (class40 var5 = (class40) class43.field1181.method534((byte) -116, var2); var5 != null; var5 = (class40) class43.field1181.method538(true)) {
                    if (this.method1192(var5.field1054, 1)) {
                        return var5.field1054;
                    }
                }
            }
            class40 var7 = new class40();
            this.field3684 = false;
            var7.field1054 = this;
            class43.field1181.method541(var7, var2, false);
            return this;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Lwd;I)I")
    public final int method1200(class150 arg0, int arg1) {
        if (arg1 == 29903) {
            field3715++;
            return this.method1210((byte) 82, 0, arg0);
        } else {
            return 50;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)Lwd;")
    public final class150 method1201(boolean arg0) {
        field3672++;
        int var2;
        for (var2 = 0; this.field3718 > var2 && (this.field3678[var2] >= 0 && this.field3678[var2] <= 32 || (this.field3678[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field3718; var2 < var3 && (this.field3678[var3 - 1] >= 0 && this.field3678[var3 - 1] <= 32 || (this.field3678[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field3718 == var3) {
            return this;
        }
        class150 var4 = new class150();
        var4.field3718 = var3 - var2;
        if (!arg0) {
            return null;
        }
        var4.field3678 = new byte[var4.field3718];
        for (int var5 = 0; var5 < var4.field3718; var5++) {
            var4.field3678[var5] = this.field3678[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)Lwd;")
    public final class150 method1202(int arg0, int arg1, int arg2) {
        class150 var4 = new class150();
        var4.field3718 = arg1 - arg0;
        field3688++;
        var4.field3678 = new byte[arg1 - arg0];
        class79.method577(this.field3678, arg0, var4.field3678, arg2, var4.field3718);
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZLwd;)Z")
    public final boolean method1203(boolean arg0, class150 arg1) {
        field3694++;
        if (this.field3718 < arg1.field3718) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field3718; var3++) {
            if (this.field3678[var3] != arg1.field3678[var3]) {
                return false;
            }
        }
        if (!arg0) {
            field3669 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZILwd;)Lwd;")
    public final class150 method1204(boolean arg0, int arg1, class150 arg2) {
        if (arg0) {
            return null;
        }
        field3692++;
        if (!this.field3684) {
            throw new IllegalArgumentException();
        } else if (this.field3718 < arg1) {
            throw new IllegalArgumentException();
        } else {
            this.field3710 = 0;
            if (arg2.field3718 + arg1 > this.field3678.length) {
                int var4;
                for (var4 = 1; var4 < arg2.field3718 + arg1; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class79.method577(this.field3678, 0, var5, 0, this.field3718);
                this.field3678 = var5;
            }
            class79.method577(arg2.field3678, 0, this.field3678, arg1, arg2.field3718);
            if (this.field3718 < arg2.field3718 + arg1) {
                this.field3718 = arg2.field3718 + arg1;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method1205(int arg0, FontMetrics arg1) {
        int var3 = 36 / ((58 - arg0) / 63);
        String var4;
        try {
            var4 = new String(this.field3678, 0, this.field3718, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var4 = new String(this.field3678, 0, this.field3718);
        }
        field3673++;
        return arg1.stringWidth(var4);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
    public final int method1206(int arg0, int arg1) {
        if (arg1 != -27473) {
            field3716 = null;
        }
        field3719++;
        return this.field3678[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)V")
    public static void method1207(byte arg0) {
        field3685 = null;
        field3702 = null;
        field3713 = null;
        field3704 = null;
        if (arg0 != 38) {
            field3664 = null;
        }
        field3669 = null;
        field3716 = null;
        field3662 = null;
        field3664 = null;
        field3674 = null;
        field3680 = null;
        field3698 = null;
        field3701 = null;
        field3721 = null;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(Z)V")
    public static final void method1208(boolean arg0) {
        int var1 = class63.field1633 * 128 + 64;
        field3707++;
        int var2 = class80.field1934 * 128 + 64;
        int var3 = class25.method205(var1, class17.field466, -23287, var2) - class25.field776;
        if (var2 > class46.field1248) {
            class46.field1248 += (var2 - class46.field1248) * class50.field1366 / 1000 + class146.field3540;
            if (class46.field1248 > var2) {
                class46.field1248 = var2;
            }
        }
        if (var2 < class46.field1248) {
            class46.field1248 -= (class46.field1248 - var2) * class50.field1366 / 1000 + class146.field3540;
            if (class46.field1248 < var2) {
                class46.field1248 = var2;
            }
        }
        int var4 = class133.field3131 * 128 + 64;
        if (var1 > class61.field1591) {
            class61.field1591 += class146.field3540 + (var1 - class61.field1591) * class50.field1366 / 1000;
            if (class61.field1591 > var1) {
                class61.field1591 = var1;
            }
        }
        if (var1 < class61.field1591) {
            class61.field1591 -= class146.field3540 + (class61.field1591 - var1) * class50.field1366 / 1000;
            if (var1 > class61.field1591) {
                class61.field1591 = var1;
            }
        }
        int var5 = class43.field1190 * 128 + 64;
        if (!arg0) {
            return;
        }
        if (class130.field3061 < var3) {
            class130.field3061 += (var3 - class130.field3061) * class50.field1366 / 1000 + class146.field3540;
            if (class130.field3061 > var3) {
                class130.field3061 = var3;
            }
        }
        if (class130.field3061 > var3) {
            class130.field3061 -= (class130.field3061 - var3) * class50.field1366 / 1000 + class146.field3540;
            if (class130.field3061 < var3) {
                class130.field3061 = var3;
            }
        }
        int var6 = class25.method205(var5, class17.field466, -23287, var4) - class96.field2217;
        int var7 = var5 - class61.field1591;
        int var8 = var6 - class130.field3061;
        int var9 = var4 - class46.field1248;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > class97.field2230) {
            class97.field2230 += class66.field1681 + (var11 - class97.field2230) * class131.field3091 / 1000;
            if (class97.field2230 > var11) {
                class97.field2230 = var11;
            }
        }
        if (class97.field2230 > var11) {
            class97.field2230 -= (class97.field2230 - var11) * class131.field3091 / 1000 + class66.field1681;
            if (class97.field2230 < var11) {
                class97.field2230 = var11;
            }
        }
        int var13 = var12 - class95.field2199;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class95.field2199 += class66.field1681 + class131.field3091 * var13 / 1000;
            class95.field2199 &= 0x7FF;
        }
        if (var13 < 0) {
            class95.field2199 -= class66.field1681 + -var13 * class131.field3091 / 1000;
            class95.field2199 &= 0x7FF;
        }
        int var14 = var12 - class95.field2199;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class95.field2199 = var12;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII[BI)I")
    public final int method1209(byte arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg0 < 66) {
            this.method1176(-100);
        }
        class79.method577(this.field3678, arg2, arg3, arg1, arg4 - arg2);
        field3689++;
        return arg4 - arg2;
    }

    @OriginalMember(owner = "client!wd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3699++;
        return this.method1188(0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILwd;)I")
    private final int method1210(byte arg0, int arg1, class150 arg2) {
        int[] var4 = new int[arg2.field3718];
        field3676++;
        int[] var5 = new int[arg2.field3718];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field3718;
        }
        for (int var8 = 1; var8 <= arg2.field3718; var8++) {
            var4[var8 - 1] = (arg2.field3718 << 1) - var8;
            var6[class94.method667(255, arg2.field3678[var8 - 1])] = arg2.field3718 - var8;
        }
        int var9 = arg2.field3718 + 1;
        for (int var10 = arg2.field3718; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (arg2.field3718 >= var9 && arg2.field3678[var9 - 1] != arg2.field3678[var10 - 1]) {
                if (arg2.field3718 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field3718 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        if (arg0 != 82) {
            this.method1187((byte) -55, -61);
        }
        int var11 = 1;
        int var12 = 0;
        int var13 = var9;
        int var14 = arg2.field3718 + 1 - var9;
        for (int var15 = 1; var15 <= var14; var15++) {
            var5[var15 - 1] = var12;
            while (var12 >= 1 && arg2.field3678[var12 - 1] != arg2.field3678[var15 - 1]) {
                var12 = var5[var12 - 1];
            }
            var12++;
        }
        while (var13 < arg2.field3718) {
            for (int var18 = var11; var18 <= var13; var18++) {
                if (var13 + arg2.field3718 - var18 <= var4[var18 - 1]) {
                    var4[var18 - 1] = arg2.field3718 + var13 - var18;
                }
            }
            var11 = var13 + 1;
            var13 += var14 - var5[var14 - 1];
            var14 = var5[var14 - 1];
        }
        int var17;
        for (int var16 = arg2.field3718 + arg1 - 1; var16 < this.field3718; var16 += Math.max(var6[this.field3678[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field3718 - 1; var17 >= 0 && this.field3678[var16] == arg2.field3678[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1211(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
