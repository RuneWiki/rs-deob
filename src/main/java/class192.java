import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class192 {

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lna;")
    public class119 field3638 = new class119();

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3641 = new CRC32();

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ldd;")
    public static class34 field3651 = new class34(260);

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lai;")
    private static class10 field3652 = class44.method278("Too many incorrect logins from your address)3", 102);

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lai;")
    public static class10 field3654 = class44.method278("Benutzeroberfl-=che geladen)3", -72);

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lai;")
    public static class10 field3656 = class44.method278("runes", -127);

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Lai;")
    private static class10 field3659 = class44.method278("Loading)3)3)3", 116);

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lai;")
    public static class10 field3657 = field3652;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lai;")
    public static class10 field3661 = field3659;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lai;")
    public static class10 field3660 = class44.method278("::errortest", 99);

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Lai;")
    private static class10 field3663 = class44.method278("World", -84);

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Lai;")
    public static class10 field3658 = field3663;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Lai;")
    public static class10 field3662 = field3663;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lmb;")
    public static class111 field3655;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lna;")
    private class119 field3649;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lc;")
    public static class21 field3653;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
    public static final void method1218(boolean arg0, boolean arg1) {
        field3648++;
        int var2 = class189.field3616;
        if (arg0) {
            var2 = 1;
        }
        if (class145.field2767.field1100 >> 7 == class169.field3270 && class145.field2767.field1097 >> 7 == class120.field2314) {
            class169.field3270 = 0;
        }
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class38 var4;
            int var5;
            if (arg0) {
                var4 = class145.field2767;
                var5 = 33538048;
            } else {
                var4 = class2.field10[class174.field3355[var3]];
                var5 = class174.field3355[var3] << 14;
            }
            if (var4 != null && var4.method250((byte) 105)) {
                int var6 = var4.field1100 >> 7;
                int var7 = var4.field1097 >> 7;
                var4.field600 = false;
                if ((class126.field2406 && class189.field3616 > 50 || class189.field3616 > 200) && !arg0 && var4.field1092 == var4.field1080) {
                    var4.field600 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field610 == null || var4.field616 > class120.field2304 || var4.field606 <= class120.field2304) {
                        if ((var4.field1100 & 0x7F) == 64 && (var4.field1097 & 0x7F) == 64) {
                            if (class58.field1025[var6][var7] == class119.field2292) {
                                continue;
                            }
                            class58.field1025[var6][var7] = class119.field2292;
                        }
                        var4.field1128 = class145.method1003((byte) -101, var4.field1100, var4.field1097, class42.field687);
                        class36.field560.method583(class42.field687, var4.field1100, var4.field1097, var4.field1128, 60, var4, var4.field1109, var5, var4.field1133);
                    } else {
                        var4.field600 = false;
                        var4.field1128 = class145.method1003((byte) -80, var4.field1100, var4.field1097, class42.field687);
                        class36.field560.method605(class42.field687, var4.field1100, var4.field1097, var4.field1128, 60, var4, var4.field1109, var5, var4.field608, var4.field601, var4.field592, var4.field598);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lna;")
    public final class119 method1219(int arg0) {
        field3640++;
        class119 var2 = this.field3638.field2295;
        if (arg0 != -14190) {
            this.method1230(null, true);
        }
        if (this.field3638 == var2) {
            this.field3649 = null;
            return null;
        } else {
            this.field3649 = var2.field2295;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public static final void method1220(int arg0, int arg1) {
        field3643++;
        class131 var2 = (class131) class101.field1882.method213(124, (long) arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2482.length; var3++) {
            var2.field2482[var3] = -1;
            var2.field2479[var3] = 0;
        }
        if (arg0 != -1) {
            method1227((byte) -51);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lna;")
    public final class119 method1221(byte arg0) {
        field3646++;
        if (arg0 != 121) {
            return null;
        }
        class119 var2 = this.field3649;
        if (this.field3638 == var2) {
            this.field3649 = null;
            return null;
        } else {
            this.field3649 = var2.field2295;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLna;Lna;)V")
    public final void method1222(byte arg0, class119 arg1, class119 arg2) {
        if (arg2.field2295 != null) {
            arg2.method848(false);
        }
        field3639++;
        arg2.field2287 = arg1;
        arg2.field2295 = arg1.field2295;
        arg2.field2295.field2287 = arg2;
        arg2.field2287.field2295 = arg2;
        if (arg0 <= 69) {
            field3652 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Lna;")
    public final class119 method1223(boolean arg0) {
        class119 var2 = this.field3638.field2287;
        field3644++;
        if (!arg0) {
            return null;
        } else if (this.field3638 == var2) {
            this.field3649 = null;
            return null;
        } else {
            this.field3649 = var2.field2287;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public final void method1224(byte arg0) {
        if (arg0 != 24) {
            this.method1223(false);
        }
        field3650++;
        while (true) {
            class119 var2 = this.field3638.field2287;
            if (this.field3638 == var2) {
                return;
            }
            var2.method848(false);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLc;)V")
    public static final void method1225(boolean arg0, class21 arg1) {
        field3642++;
        class203.field3964 = arg1;
        if (!arg0) {
            field3652 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Lna;")
    public final class119 method1226(byte arg0) {
        field3647++;
        class119 var2 = this.field3649;
        if (this.field3638 == var2) {
            this.field3649 = null;
            return null;
        }
        if (arg0 != -57) {
            this.method1231((byte) 27, null);
        }
        this.field3649 = var2.field2287;
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field3656 = null;
        field3659 = null;
        field3658 = null;
        field3663 = null;
        field3654 = null;
        field3661 = null;
        field3641 = null;
        int var1 = -83 % ((60 - arg0) / 61);
        field3652 = null;
        field3657 = null;
        field3662 = null;
        field3660 = null;
        field3653 = null;
        field3655 = null;
        field3651 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z")
    public static final boolean method1228(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg1 != 8) {
            method1229(null, -55, 97, -47, 75, -108);
        }
        field3636++;
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class47 var3 = class184.method1189(arg2, arg1 ^ 0xE);
        return var3.method288(arg1 ^ 0x8, arg0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lbf;IIIII)V")
    public static final void method1229(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3645++;
        if (arg3 != 256) {
            return;
        }
        int var6 = arg2 * arg2 + arg5 * arg5;
        if (var6 <= 4225 || var6 >= 90000) {
            class180.method1163(arg0, arg4, arg2, arg5, arg1, (byte) 44);
            return;
        }
        int var7 = class53.field950 + class171.field3316 & 0x7FF;
        int var8 = class113.field2124[var7];
        int var9 = class113.field2120[var7];
        int var10 = var9 * 256 / (class42.field698 + 256);
        int var11 = var8 * 256 / (class42.field698 + 256);
        int var12 = arg5 * var10 - arg2 * var11 >> 16;
        int var13 = arg2 * var10 + arg5 * var11 >> 16;
        double var14 = Math.atan2((double) var13, (double) var12);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class144.field2756.method103(var16 + arg4 + 94 + 4 - 10, arg1 - -83 + -var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lna;Z)V")
    public final void method1230(class119 arg0, boolean arg1) {
        field3633++;
        if (arg0.field2295 != null) {
            arg0.method848(false);
        }
        arg0.field2295 = this.field3638.field2295;
        if (!arg1) {
            field3658 = null;
        }
        arg0.field2287 = this.field3638;
        arg0.field2295.field2287 = arg0;
        arg0.field2287.field2295 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLna;)V")
    public final void method1231(byte arg0, class119 arg1) {
        if (arg0 > -3) {
            return;
        }
        if (arg1.field2295 != null) {
            arg1.method848(false);
        }
        field3637++;
        arg1.field2287 = this.field3638.field2287;
        arg1.field2295 = this.field3638;
        arg1.field2295.field2287 = arg1;
        arg1.field2287.field2295 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class192() {
        this.field3638.field2295 = this.field3638;
        this.field3638.field2287 = this.field3638;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)Lna;")
    public final class119 method1232(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3634++;
        class119 var2 = this.field3638.field2287;
        if (this.field3638 == var2) {
            return null;
        } else {
            var2.method848(arg0);
            return var2;
        }
    }
}
