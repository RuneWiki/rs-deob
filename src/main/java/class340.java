import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class340 extends class228 {

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Z")
    public boolean field4714 = false;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Z")
    public boolean field4721 = false;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field4723 = 0;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "[I")
    public static int[] field4724 = new int[16384];

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "[I")
    public static int[] field4715 = new int[16384];

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "[I")
    public static int[] field4725;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "F")
    public static float field4711;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field4722;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field4724[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4715[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
        field4725 = new int[] { 104, 120, 136, 168 };
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Let;B)V", line = 4)
    public final void method2067(class419 arg0, byte arg1) {
        ++field4710;
        class300 var3 = null;
        try {
            int var4 = -84 / ((arg1 - -37) / 59);
            class449 var5 = arg0.method2561((byte) -127, "");
            while (var5.field6617 == 0) {
                class213.method1462(1L, -5184);
            }
            if (var5.field6617 == 1) {
                var3 = (class300) var5.field6613;
                class65 var6 = this.method2074(-114);
                var3.method1885(0, var6.field827, var6.field783, 1);
            }
        } catch (Exception var8) {
        }
        try {
            if (var3 != null) {
                var3.method1884(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Z", line = 44)
    public final boolean method2068(int arg0, int arg1) {
        if (arg0 >= -52) {
            return false;
        } else {
            ++field4720;
            return ~arg1 != -1 ? true : super.field3315;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Let;)V", line = 469)
    public class340(class419 arg0) {
        super.field3330 = 3;
        this.method2070(-2, true);
        super.field3323 = true;
        super.field3320 = true;
        super.field3334 = 255;
        super.field3354 = true;
        super.field3329 = 2;
        super.field3351 = 0;
        super.field3355 = true;
        super.field3350 = 127;
        super.field3339 = true;
        super.field3324 = 0;
        super.field3349 = 127;
        super.field3333 = true;
        super.field3321 = true;
        super.field3335 = 0;
        super.field3337 = 0;
        super.field3322 = 0;
        super.field3340 = true;
        super.field3317 = true;
        super.field3344 = false;
        super.field3348 = true;
        super.field3327 = 1;
        if (class352.field4882 >= 96) {
            class86.method766(2, 9060);
        } else {
            class86.method766(0, 9060);
        }
        super.field3328 = 0;
        super.field3352 = false;
        super.field3314 = true;
        super.field3353 = true;
        super.field3347 = 2;
        super.field3338 = false;
        super.field3345 = 2;
        super.field3331 = ~class247.field3668 != -2 ? 4 : 2;
        super.field3316 = 0;
        super.field3343 = false;
        class300 var2 = null;
        try {
            class449 var3 = arg0.method2561((byte) -69, "");
            while (var3.field6617 == 0) {
                class213.method1462(1L, -5184);
            }
            if (var3.field6617 == 1) {
                var2 = (class300) var3.field6613;
                byte[] var4 = new byte[(int) var2.method1888(74)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1886(var5, var4.length + -var5, var4, (byte) -119);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2073(new class65(var4), 93);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1884(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I", line = 67)
    public final int method2069(int arg0, int arg1) {
        int var3 = -28 / ((arg1 - 74) / 46);
        ++field4717;
        if (this.field4721) {
            return 0;
        } else if (!this.method2072(arg0, 116)) {
            return 1;
        } else {
            return super.field3355 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V", line = 84)
    public final void method2070(int arg0, boolean arg1) {
        super.field3315 = arg1;
        ++field4716;
        if (class384.field5645 != null) {
            class384.field5645.method788((byte) 114, !this.method2072(class65.field802, arg0 ^ -114));
        }
        if (arg0 != -2) {
            field4724 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)V", line = 98)
    public static final void method2071(int arg0, byte arg1) {
        if (class232.field3411 == null) {
            class232.field3411 = new byte[4][class397.field5828][class457.field6713];
        }
        ++field4719;
        if (arg0 <= -87) {
            for (int var2 = 0; var2 < 4; ++var2) {
                for (int var3 = 0; ~class397.field5828 < ~var3; ++var3) {
                    for (int var4 = 0; ~var4 > ~class457.field6713; ++var4) {
                        class232.field3411[var2][var3][var4] = arg1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)Z", line = 134)
    public final boolean method2072(int arg0, int arg1) {
        if (arg1 <= 104) {
            return false;
        } else {
            ++field4718;
            return ~arg0 == -1 && !this.field4714 ? super.field3315 : true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Liv;I)V", line = 151)
    private final void method2073(class65 arg0, int arg1) {
        ++field4722;
        if (~(arg0.field783.length + -arg0.field827) <= -2) {
            int var3 = arg0.method577(255);
            if (~var3 <= -1 && ~var3 >= -18) {
                byte var4;
                if (var3 != 17) {
                    if (~var3 == -17) {
                        var4 = 38;
                    } else if (~var3 != -16) {
                        if (var3 == 14) {
                            var4 = 36;
                        } else if (~var3 == -14) {
                            var4 = 35;
                        } else if (~var3 == -13) {
                            var4 = 34;
                        } else if (~var3 != -12) {
                            if (var3 == 10) {
                                var4 = 32;
                            } else if (~var3 == -10) {
                                var4 = 31;
                            } else if (~var3 != -9) {
                                if (var3 == 7) {
                                    var4 = 29;
                                } else if (~var3 != -7) {
                                    if (var3 != 5) {
                                        if (var3 != 4) {
                                            if (var3 != 3) {
                                                if (var3 != 2) {
                                                    if (~var3 == -2) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 22;
                                                }
                                            } else {
                                                var4 = 23;
                                            }
                                        } else {
                                            var4 = 24;
                                        }
                                    } else {
                                        var4 = 28;
                                    }
                                } else {
                                    var4 = 28;
                                }
                            } else {
                                var4 = 30;
                            }
                        } else {
                            var4 = 33;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 40;
                }
                if (~(arg0.field783.length + -arg0.field827) <= ~var4) {
                    super.field3330 = arg0.method577(255);
                    if (super.field3330 < 1) {
                        super.field3330 = 1;
                    } else if (~super.field3330 < -5) {
                        super.field3330 = 4;
                    }
                    this.method2070(-2, arg0.method577(255) == 1);
                    super.field3355 = ~arg0.method577(255) == -2;
                    super.field3354 = ~arg0.method577(255) == -2;
                    super.field3333 = arg0.method577(255) == 1;
                    super.field3327 = arg0.method577(255) != 1 ? 0 : 1;
                    super.field3323 = arg0.method577(255) == 1;
                    super.field3320 = ~arg0.method577(255) == -2;
                    super.field3348 = arg0.method577(255) == 1;
                    super.field3329 = arg0.method577(255);
                    if (~super.field3329 < -3) {
                        super.field3329 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field3322 = arg0.method577(255);
                    }
                    if (var3 < 2) {
                        super.field3340 = ~arg0.method577(255) == -2;
                        arg0.method577(255);
                    } else {
                        super.field3340 = ~arg0.method577(255) == -2;
                        if (var3 >= 17) {
                            super.field3344 = arg0.method577(255) == 1;
                        }
                    }
                    super.field3321 = arg0.method577(255) == 1;
                    super.field3339 = arg0.method577(255) == 1;
                    super.field3337 = arg0.method577(255);
                    if (~super.field3337 < -3) {
                        super.field3337 = 2;
                    }
                    super.field3335 = super.field3337;
                    super.field3317 = arg0.method577(255) == 1;
                    super.field3349 = arg0.method577(255);
                    if (super.field3349 > 127) {
                        super.field3349 = 127;
                    }
                    super.field3334 = arg0.method577(255);
                    super.field3350 = arg0.method577(255);
                    if (super.field3350 > 127) {
                        super.field3350 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field3324 = arg0.method623((byte) 91);
                        super.field3351 = arg0.method623((byte) -79);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg0.method577(255);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method577(255);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class352.field4882 < 96) {
                            var5 = 0;
                        }
                        class86.method766(var5, 9060);
                    }
                    if (var3 >= 5) {
                        super.field3316 = arg0.method616((byte) 126);
                    }
                    int var6 = -12 / ((arg1 - -27) / 49);
                    int var7 = 0;
                    if (~var3 <= -7) {
                        super.field3347 = var7 = arg0.method577(255);
                    }
                    if (super.field3347 != 1 && super.field3347 != 2) {
                        super.field3347 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field3338 = arg0.method577(255) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field3352 = arg0.method577(255) == 1;
                    }
                    if (var3 >= 9) {
                        super.field3328 = arg0.method577(255);
                    }
                    if (~super.field3328 > -1 || ~super.field3328 < ~client.method1378(class352.field4882, (byte) 101)) {
                        super.field3328 = 0;
                    }
                    if (var3 >= 10) {
                        super.field3343 = ~arg0.method577(255) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field3353 = ~arg0.method577(255) != -1;
                    }
                    if (var3 >= 12) {
                        super.field3327 = arg0.method577(255);
                    }
                    if (~super.field3327 > -1 || super.field3327 > 2) {
                        super.field3327 = 1;
                    }
                    if (var3 >= 13) {
                        super.field3314 = arg0.method577(255) == 1;
                    }
                    if (var3 >= 14) {
                        super.field3345 = arg0.method577(255);
                    } else if (var7 == 0) {
                        super.field3345 = 2;
                    } else {
                        super.field3345 = 1;
                    }
                    if (~super.field3345 > -1 || super.field3345 > 3) {
                        super.field3345 = 2;
                    }
                    if (var3 >= 15) {
                        super.field3331 = arg0.method577(255);
                        if (super.field3331 < 0 || super.field3331 > 4) {
                            super.field3331 = class247.field3668 == 1 ? 2 : 4;
                        }
                    }
                    if (var3 >= 16) {
                        super.field3356 = arg0.method577(255) == 1;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field3356 = false;
                            }
                        } catch (Throwable var8) {
                        }
                    }
                    if (var3 < 17 && super.field3345 == 0) {
                        super.field3345 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Liv;", line = 412)
    public final class65 method2074(int arg0) {
        ++field4712;
        class65 var2 = new class65(41);
        var2.method638(255, 17);
        var2.method638(255, super.field3330);
        var2.method638(255, super.field3315 ? 1 : 0);
        if (arg0 >= -60) {
            field4713 = -20;
        }
        var2.method638(255, super.field3355 ? 1 : 0);
        var2.method638(255, !super.field3354 ? 0 : 1);
        var2.method638(255, super.field3333 ? 1 : 0);
        var2.method638(255, 0);
        var2.method638(255, super.field3323 ? 1 : 0);
        var2.method638(255, !super.field3320 ? 0 : 1);
        var2.method638(255, !super.field3348 ? 0 : 1);
        var2.method638(255, super.field3329);
        var2.method638(255, super.field3322);
        var2.method638(255, !super.field3340 ? 0 : 1);
        var2.method638(255, !super.field3344 ? 0 : 1);
        var2.method638(255, super.field3321 ? 1 : 0);
        var2.method638(255, !super.field3339 ? 0 : 1);
        var2.method638(255, super.field3337);
        var2.method638(255, !super.field3317 ? 0 : 1);
        var2.method638(255, super.field3349);
        var2.method638(255, super.field3334);
        var2.method638(255, super.field3350);
        var2.method611((byte) 67, super.field3324);
        var2.method611((byte) 67, super.field3351);
        var2.method638(255, class176.method1234(8458));
        var2.method618(super.field3316, (byte) 121);
        var2.method638(255, super.field3347);
        var2.method638(255, super.field3338 ? 1 : 0);
        var2.method638(255, super.field3352 ? 1 : 0);
        var2.method638(255, super.field3328);
        var2.method638(255, super.field3343 ? 1 : 0);
        var2.method638(255, !super.field3353 ? 0 : 1);
        var2.method638(255, super.field3327);
        var2.method638(255, super.field3314 ? 1 : 0);
        var2.method638(255, super.field3345);
        var2.method638(255, super.field3331);
        var2.method638(255, !super.field3356 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 553)
    public static void method2075(int arg0) {
        field4725 = null;
        field4724 = null;
        if (arg0 != 1) {
            method2075(-116);
        }
        field4715 = null;
    }
}
