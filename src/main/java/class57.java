import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class57 extends class12 {

    @OriginalMember(owner = "client!gb", name = "pc", descriptor = "I")
    public int field1318 = -1;

    @OriginalMember(owner = "client!gb", name = "sc", descriptor = "Z")
    public boolean field1321 = false;

    @OriginalMember(owner = "client!gb", name = "uc", descriptor = "I")
    public int field1323 = -1;

    @OriginalMember(owner = "client!gb", name = "nc", descriptor = "I")
    public int field1316 = 0;

    @OriginalMember(owner = "client!gb", name = "rc", descriptor = "I")
    public int field1320 = 0;

    @OriginalMember(owner = "client!gb", name = "Fc", descriptor = "I")
    public int field1334 = 0;

    @OriginalMember(owner = "client!gb", name = "Gc", descriptor = "I")
    public int field1335 = 0;

    @OriginalMember(owner = "client!gb", name = "Mc", descriptor = "I")
    public int field1341 = 0;

    @OriginalMember(owner = "client!gb", name = "xc", descriptor = "Lcd;")
    public static class23 field1326 = class54.method414("Wir vermuten)1 dass Ihr Konto gestohlen wurde", -1);

    @OriginalMember(owner = "client!gb", name = "Jc", descriptor = "Z")
    public static boolean field1338 = false;

    @OriginalMember(owner = "client!gb", name = "Rc", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!gb", name = "Bc", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!gb", name = "Ac", descriptor = "I")
    public static int field1329 = 2;

    @OriginalMember(owner = "client!gb", name = "Tc", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!gb", name = "oc", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!gb", name = "qc", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!gb", name = "tc", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gb", name = "wc", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!gb", name = "yc", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gb", name = "Cc", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!gb", name = "Dc", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!gb", name = "Ec", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!gb", name = "Hc", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!gb", name = "Ic", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!gb", name = "Lc", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!gb", name = "Nc", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!gb", name = "Oc", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!gb", name = "Pc", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!gb", name = "Sc", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!gb", name = "vc", descriptor = "J")
    public static long field1324;

    @OriginalMember(owner = "client!gb", name = "zc", descriptor = "Lsd;")
    public class165 field1328;

    @OriginalMember(owner = "client!gb", name = "Kc", descriptor = "Lbh;")
    public class18 field1339;

    @OriginalMember(owner = "client!gb", name = "Qc", descriptor = "Lcd;")
    public class23 field1345;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lva;I)V")
    public final void method437(class189 arg0, int arg1) {
        arg0.field3752 = 0;
        int var3 = arg0.method1202(-121);
        ++field1322;
        this.field1323 = arg0.method1204(true);
        this.field1318 = arg0.method1204(true);
        this.field1335 = 0;
        int var4 = -1;
        int[] var5 = new int[12];
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg0.method1202(-35);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method1202(-75);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var5[0] == 65535) {
                    var4 = arg0.method1197(-1);
                    break;
                }
                if (~var5[var6] <= -513) {
                    int var12 = class85.method565(var5[var6] + -512, (byte) 96).field1454;
                    if (~var12 != -1) {
                        this.field1335 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        if (arg1 >= 52) {
            for (int var10 = 0; ~var10 > -6; ++var10) {
                int var11 = arg0.method1202(101);
                if (~var11 > -1 || ~class61.field1421[var10].length >= ~var11) {
                    var11 = 0;
                }
                var9[var10] = var11;
            }
            super.field262 = arg0.method1197(-1);
            if (super.field262 == 65535) {
                super.field262 = -1;
            }
            super.field251 = arg0.method1197(-1);
            if (~super.field251 == -65536) {
                super.field251 = -1;
            }
            super.field226 = super.field251;
            super.field268 = arg0.method1197(-1);
            if (~super.field268 == -65536) {
                super.field268 = -1;
            }
            super.field216 = arg0.method1197(-1);
            if (super.field216 == 65535) {
                super.field216 = -1;
            }
            super.field253 = arg0.method1197(-1);
            if (~super.field253 == -65536) {
                super.field253 = -1;
            }
            super.field229 = arg0.method1197(-1);
            if (~super.field229 == -65536) {
                super.field229 = -1;
            }
            super.field269 = arg0.method1197(-1);
            if (super.field269 == 65535) {
                super.field269 = -1;
            }
            this.field1345 = class39.method326(arg0.method1217(832087072), 102).method164(-12065);
            this.field1341 = arg0.method1202(114);
            this.field1320 = arg0.method1197(-1);
            if (this.field1328 == null) {
                this.field1328 = new class165();
            }
            this.field1328.method1016(var4, ~var3 == -2, var5, var9, 105);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)Lbh;")
    public final class18 method31(int arg0) {
        ++field1342;
        if (this.field1328 == null) {
            return null;
        } else {
            if (arg0 > -101) {
                this.field1335 = -119;
            }
            class94 var2 = ~super.field288 != 0 && ~super.field252 == -1 ? class20.method128(super.field288, (byte) 64) : null;
            class94 var3 = super.field250 != -1 && !this.field1321 && (~super.field262 != ~super.field250 || var2 == null) ? class20.method128(super.field250, (byte) 59) : null;
            class18 var4 = this.field1328.method1015(super.field220, var3, super.field285, true, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method122();
                super.field283 = var4.field3376;
                if (!this.field1321 && ~super.field287 != 0 && ~super.field278 != 0) {
                    class18 var5 = class82.method553((byte) 6, super.field287).method221(super.field278, -120);
                    if (var5 != null) {
                        var5.method119(0, -super.field249, 0);
                        var4 = var4.method121(var5);
                    }
                }
                if (!this.field1321 && this.field1339 != null) {
                    if (~this.field1316 >= ~class15.field339) {
                        this.field1339 = null;
                    }
                    if (this.field1334 <= class15.field339 && class15.field339 < this.field1316) {
                        class18 var6 = this.field1339;
                        var6.method119(-super.field215 + this.field1336, -this.field1319 + this.field1333, this.field1347 - super.field277);
                        if (~super.field227 == -513) {
                            var6.method114();
                            var6.method114();
                            var6.method114();
                        } else if (super.field227 != 1024) {
                            if (super.field227 == 1536) {
                                var6.method114();
                            }
                        } else {
                            var6.method114();
                            var6.method114();
                        }
                        var4 = var4.method121(var6);
                        if (super.field227 == 512) {
                            var6.method114();
                        } else if (super.field227 == 1024) {
                            var6.method114();
                            var6.method114();
                        } else if (super.field227 == 1536) {
                            var6.method114();
                            var6.method114();
                            var6.method114();
                        }
                        var6.method119(-this.field1336 + super.field215, this.field1319 - this.field1333, super.field277 - this.field1347);
                    }
                }
                var4.field386 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)Z")
    public final boolean method69(boolean arg0) {
        ++field1325;
        if (!arg0) {
            method438(false, -92, true);
        }
        return this.field1328 != null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIZ)I")
    public static final int method438(boolean arg0, int arg1, boolean arg2) {
        ++field1343;
        int var3 = arg1;
        if (arg2) {
            var3 = class84.field1789 + class145.field2973 + arg1;
        }
        if (arg0) {
            var3 += class31.field677 + class10.field196;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[B)Lcd;")
    public static final class23 method439(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1337;
        class23 var4 = new class23();
        var4.field480 = new byte[arg1];
        var4.field473 = 0;
        if (arg0 != -1) {
            return null;
        } else {
            for (int var5 = arg2; ~(arg1 + arg2) < ~var5; ++var5) {
                if (~arg3[var5] != -1) {
                    var4.field480[var4.field473++] = arg3[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
    public static final boolean method440(int arg0, int arg1) {
        if (arg1 != -974291460) {
            return false;
        } else {
            ++field1327;
            return ~((arg0 & 464234134) >> 28) != -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
    public static void method441(boolean arg0) {
        if (!arg0) {
            field1326 = null;
        }
        field1326 = null;
    }
}
