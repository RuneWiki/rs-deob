import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class93 extends class556 implements class457 {

    @OriginalMember(owner = "client!aja", name = "V", descriptor = "Z")
    private boolean field1277;

    @OriginalMember(owner = "client!aja", name = "ab", descriptor = "B")
    private byte field1282;

    @OriginalMember(owner = "client!aja", name = "ob", descriptor = "B")
    private byte field1296;

    @OriginalMember(owner = "client!aja", name = "db", descriptor = "S")
    private short field1285;

    @OriginalMember(owner = "client!aja", name = "eb", descriptor = "Z")
    private boolean field1286;

    @OriginalMember(owner = "client!aja", name = "bb", descriptor = "Z")
    private boolean field1283;

    @OriginalMember(owner = "client!aja", name = "ib", descriptor = "Z")
    private boolean field1290;

    @OriginalMember(owner = "client!aja", name = "R", descriptor = "Lka;")
    public class474 field1273;

    @OriginalMember(owner = "client!aja", name = "X", descriptor = "Lr;")
    private class185 field1279;

    @OriginalMember(owner = "client!aja", name = "mb", descriptor = "I")
    public static int field1294 = 1;

    @OriginalMember(owner = "client!aja", name = "wb", descriptor = "Lkg;")
    public static class275 field1304 = new class275(30, 6);

    @OriginalMember(owner = "client!aja", name = "S", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!aja", name = "T", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!aja", name = "U", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!aja", name = "W", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!aja", name = "Y", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!aja", name = "Z", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!aja", name = "fb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!aja", name = "gb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!aja", name = "hb", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!aja", name = "jb", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!aja", name = "kb", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!aja", name = "lb", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!aja", name = "nb", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!aja", name = "pb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!aja", name = "qb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!aja", name = "rb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!aja", name = "sb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!aja", name = "tb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!aja", name = "ub", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!aja", name = "vb", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!aja", name = "xb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!aja", name = "yb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!aja", name = "cb", descriptor = "Lwg;")
    private class428 field1284;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)I")
    public final int method743(int arg0) {
        ++field1291;
        if (arg0 != -30968) {
            this.field1277 = true;
        }
        return this.field1282;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1284 = null;
        }
        ++field1306;
    }

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "(I)I")
    public final int method84(int arg0) {
        ++field1274;
        if (arg0 != 1027) {
            this.method750(17, (class60) null);
        }
        return this.field1273 == null ? 0 : this.field1273.method248();
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)I")
    public final int method745(byte arg0) {
        int var2 = 46 / ((-33 - arg0) / 56);
        ++field1297;
        return 65535 & this.field1285;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(B)V")
    public final void method746(byte arg0) {
        if (this.field1273 != null) {
            this.field1273.method243();
        }
        if (arg0 < 82) {
            field1304 = null;
        }
        ++field1275;
    }

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "(B)V")
    public static void method747(byte arg0) {
        field1304 = null;
        if (arg0 >= -10) {
            field1294 = -68;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IZBLha;)Lok;")
    private final class257 method748(int arg0, boolean arg1, byte arg2, class60 arg3) {
        ++field1287;
        class543 var5 = client.field3995.method3384(65535 & this.field1285, false);
        class282 var6;
        class282 var7;
        if (this.field1286) {
            var6 = class707.field9826[0];
            var7 = class395.field5009[super.field5793];
        } else {
            if (~super.field5793 <= -4) {
                var6 = null;
            } else {
                var6 = class707.field9826[super.field5793 + 1];
            }
            var7 = class707.field9826[super.field5793];
        }
        if (arg2 <= 55) {
            this.method751(87, (class60) null, 53);
        }
        return var5.method3118(var6, super.field5797, this.field1296 == 11 ? this.field1282 + 4 : this.field1282, this.field1296 != 11 ? this.field1296 : 10, var7, super.field5800, arg3, arg0, 53, arg1, super.field5801, (class456) null);
    }

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        this.field1277 = false;
        ++field1295;
        if (this.field1273 != null) {
            this.field1273.method266(-65537 & this.field1273.method272());
        }
        if (arg0 > -41) {
            this.method758(true);
        }
    }

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        if (this.field1284 == null) {
            this.field1284 = class43.method309(super.field5800, this.method751(74, arg1, 0), super.field5797, super.field5801, -108);
        }
        ++field1278;
        if (arg0 >= -22) {
            this.field1290 = true;
        }
        return this.field1284;
    }

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "(B)I")
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            return -110;
        } else {
            ++field1281;
            return this.field1273 != null ? this.field1273.method286() : 0;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILha;I)Lka;")
    private final class474 method751(int arg0, class60 arg1, int arg2) {
        if (arg0 <= 31) {
            return null;
        } else {
            ++field1302;
            if (this.field1273 != null && ~arg1.method542(this.field1273.method272(), arg2) == -1) {
                return this.field1273;
            } else {
                class257 var4 = this.method748(arg2, false, (byte) 56, arg1);
                return var4 != null ? var4.field3263 : null;
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        if (arg0 >= -41) {
            method753(-103, (class285) null);
        }
        ++field1305;
        class474 var5 = this.method751(81, arg2, 131072);
        if (var5 != null) {
            class631 var6 = arg2.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            return class232.field3053 ? var5.method275(arg1, arg3, var6, false, 0, class286.field3600) : var5.method258(arg1, arg3, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILwha;)I")
    public static final int method753(int arg0, class285 arg1) {
        if (arg0 > -20) {
            field1294 = -7;
        }
        ++field1280;
        if (class285.field3584 == arg1) {
            return 5120;
        } else if (class285.field3587 != arg1) {
            if (class285.field3588 == arg1) {
                return 5124;
            } else if (class285.field3589 == arg1) {
                return 5121;
            } else if (class285.field3590 != arg1) {
                if (class285.field3591 != arg1) {
                    if (class285.field3592 == arg1) {
                        return 5131;
                    } else if (class285.field3593 == arg1) {
                        return 5126;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 5125;
                }
            } else {
                return 5123;
            }
        } else {
            return 5122;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != 30558) {
            this.method754(106, -108, (class435) null, (class60) null, false, -92, -114);
        }
        ++field1300;
        if (arg2 instanceof class407) {
            class407 var8 = (class407) arg2;
            if (this.field1273 != null && var8.field5169 != null) {
                this.field1273.method241(var8.field5169, arg6, arg1, arg5, arg4);
            }
        } else {
            if (arg2 instanceof class93) {
                class93 var9 = (class93) arg2;
                if (this.field1273 != null && var9.field1273 != null) {
                    this.field1273.method241(var9.field1273, arg6, arg1, arg5, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        ++field1299;
        if (this.field1273 == null) {
            return null;
        } else {
            class631 var3 = arg0.method531();
            int var4 = 12 % ((-39 - arg1) / 55);
            var3.method596(super.field5801, super.field5800, super.field5797);
            class635 var5 = class510.method2982(this.field1283, 0, 1);
            if (class232.field3053) {
                this.field1273.method255(var3, var5.field8760[0], class286.field3600, 0);
            } else {
                this.field1273.method250(var3, var5.field8760[0], 0);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIIIIIIZ)V")
    public class93(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7513 == 1, class561.method3241(arg13, arg12, 2));
        this.field1277 = arg14;
        this.field1282 = (byte) arg13;
        super.field5793 = (byte) arg3;
        this.field1296 = (byte) arg12;
        this.field1285 = (short) arg1.field7586;
        this.field1286 = arg7;
        this.field1283 = ~arg1.field7550 != -1 && !arg7;
        this.field1290 = arg0.method467() && arg1.field7504 && !this.field1286 && ~class748.field10451.field10410.method3447((byte) 62) != -1;
        int var16 = 2048;
        if (this.field1277) {
            var16 |= 65536;
        }
        class257 var17 = this.method748(var16, this.field1290, (byte) 65, arg0);
        if (var17 != null) {
            this.field1273 = var17.field3263;
            this.field1279 = var17.field3264;
            if (this.field1277) {
                this.field1273 = this.field1273.method273((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)Z")
    public final boolean method756(int arg0) {
        ++field1289;
        return arg0 > -52 ? true : this.field1290;
    }

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "(Z)I")
    public final int method757(boolean arg0) {
        ++field1276;
        if (arg0) {
            return -61;
        } else {
            return this.field1273 == null ? 15 : this.field1273.method288() / 4;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)I")
    public final int method758(boolean arg0) {
        if (!arg0) {
            this.field1290 = true;
        }
        ++field1293;
        return this.field1296;
    }

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        if (arg0 > -79) {
            this.method750(66, (class60) null);
        }
        ++field1292;
        return this.field1273 != null ? this.field1273.method287() : false;
    }

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        ++field1301;
        if (arg0 != -69) {
            return true;
        } else if (this.field1273 != null) {
            return !this.field1273.method244();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        if (arg0 != 0) {
            this.method748(-89, true, (byte) -113, (class60) null);
        }
        ++field1303;
        return this.field1277;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(ILha;)V")
    public final void method760(int arg0, class60 arg1) {
        ++field1288;
        if (arg0 == -31507) {
            Object var3 = null;
            class185 var5;
            if (this.field1279 == null && this.field1290) {
                class257 var4 = this.method748(262144, true, (byte) 115, arg1);
                var5 = var4 != null ? var4.field3264 : null;
            } else {
                var5 = this.field1279;
                this.field1279 = null;
            }
            if (var5 != null) {
                class549.method3194(var5, super.field5793, super.field5801, super.field5797, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILha;)V")
    public final void method761(int arg0, class60 arg1) {
        int var3 = 74 % ((arg0 - 63) / 51);
        ++field1298;
        Object var4 = null;
        class185 var6;
        if (this.field1279 == null && this.field1290) {
            class257 var5 = this.method748(262144, true, (byte) 120, arg1);
            var6 = var5 == null ? null : var5.field3264;
        } else {
            var6 = this.field1279;
            this.field1279 = null;
        }
        if (var6 != null) {
            class739.method4116(var6, super.field5793, super.field5801, super.field5797, (boolean[]) null);
        }
    }
}
