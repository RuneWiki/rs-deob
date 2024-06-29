import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class220 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lid;")
    public class247 field3437 = new class247();

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Ljf;")
    public static class216 field3443 = new class216(64);

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "Laf;")
    public static class168 field3455 = new class168();

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Z")
    public static boolean field3457 = false;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Lid;")
    private class247 field3448;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Lid;")
    public final class247 method1538(boolean arg0) {
        field3446++;
        if (!arg0) {
            method1545(-98, -57, (byte) -67, 62, -17, -110, 64, 125, 89, -47, 14, -128, -70);
        }
        class247 var2 = this.field3448;
        if (this.field3437 == var2) {
            this.field3448 = null;
            return null;
        } else {
            this.field3448 = var2.field4017;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILid;)V")
    public final void method1539(int arg0, class247 arg1) {
        if (arg1.field4017 != null) {
            arg1.method1764(64);
        }
        arg1.field4013 = this.field3437.field4013;
        if (arg0 == -1770092592) {
            field3440++;
            arg1.field4017 = this.field3437;
            arg1.field4017.field4013 = arg1;
            arg1.field4013.field4017 = arg1;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lid;B)V")
    public final void method1540(class247 arg0, byte arg1) {
        field3450++;
        if (arg0.field4017 != null) {
            arg0.method1764(64);
        }
        arg0.field4013 = this.field3437;
        arg0.field4017 = this.field3437.field4017;
        arg0.field4017.field4013 = arg0;
        arg0.field4013.field4017 = arg0;
        if (arg1 > -47) {
            method1550(false, (short[]) null, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lid;")
    public final class247 method1541(int arg0) {
        if (arg0 != 1) {
            field3456 = -77;
        }
        field3442++;
        class247 var2 = this.field3437.field4017;
        if (this.field3437 == var2) {
            this.field3448 = null;
            return null;
        } else {
            this.field3448 = var2.field4017;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method1542(byte arg0) {
        field3443 = null;
        if (arg0 != -8) {
            method1546(-50, 120, -47);
        }
        field3455 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II[Lfe;)V")
    public static final void method1543(int arg0, int arg1, class231[] arg2) {
        field3445++;
        int var3 = 0;
        int var4 = -33 % ((-arg1 - 32) / 47);
        while (arg2.length > var3) {
            class231 var5 = arg2[var3];
            if (var5 != null && var5.field3633 == arg0 && (!var5.field3585 || !client.method1714(var5))) {
                label110: {
                    if (var5.field3620 == 0) {
                        if (!var5.field3585 && client.method1714(var5) && class93.field1399 != var5) {
                            break label110;
                        }
                        method1543(var5.field3595, 97, arg2);
                        if (var5.field3578 != null) {
                            method1543(var5.field3595, -127, var5.field3578);
                        }
                        class104 var6 = (class104) class115.field1674.method1064(-1, (long) var5.field3595);
                        if (var6 != null) {
                            class15.method91(var6.field1511, 120);
                        }
                    }
                    if (var5.field3620 == 6) {
                        if (var5.field3631 != -1 || var5.field3689 != -1) {
                            boolean var7 = class215.method1507(var5, (byte) 125);
                            int var8;
                            if (var7) {
                                var8 = var5.field3689;
                            } else {
                                var8 = var5.field3631;
                            }
                            if (var8 != -1) {
                                class57 var9 = class174.method1241(29, var8);
                                if (var9 != null) {
                                    var5.field3669 += class135.field1949;
                                    while (var5.field3669 > var9.field828[var5.field3659]) {
                                        var5.field3669 -= var9.field828[var5.field3659];
                                        var5.field3659++;
                                        if (var5.field3659 >= var9.field850.length) {
                                            var5.field3659 -= var9.field830;
                                            if (var5.field3659 < 0 || var5.field3659 >= var9.field850.length) {
                                                var5.field3659 = 0;
                                            }
                                        }
                                        var5.field3647 = var5.field3659 + 1;
                                        if (var5.field3647 >= var9.field850.length) {
                                            var5.field3647 -= var9.field830;
                                            if (var5.field3647 < 0 || var9.field850.length <= var5.field3647) {
                                                var5.field3647 = -1;
                                            }
                                        }
                                        class247.method1761(var5, (byte) -88);
                                    }
                                }
                            }
                        }
                        if (var5.field3673 != 0 && !var5.field3585) {
                            int var10 = var5.field3673 >> 16;
                            int var11 = class135.field1949 * var10;
                            var5.field3651 = var5.field3651 + var11 & 0x7FF;
                            int var12 = var5.field3673 << 16 >> 16;
                            int var13 = class135.field1949 * var12;
                            var5.field3695 = var5.field3695 + var13 & 0x7FF;
                            class247.method1761(var5, (byte) -92);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public final void method1544(byte arg0) {
        if (arg0 != 43) {
            this.method1538(false);
        }
        field3453++;
        while (true) {
            class247 var2 = this.field3437.field4013;
            if (this.field3437 == var2) {
                this.field3448 = null;
                return;
            }
            var2.method1764(64);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBIIIIIIIIII)V")
    public static final void method1545(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class265 var13 = new class265();
        var13.field4301 = arg4;
        var13.field4302 = arg8;
        field3452++;
        var13.field4310 = arg0;
        var13.field4308 = arg7;
        var13.field4312 = arg5;
        var13.field4299 = arg1;
        var13.field4300 = arg3;
        var13.field4309 = arg6;
        var13.field4296 = arg12;
        if (arg2 <= -55) {
            var13.field4303 = arg10;
            var13.field4295 = arg11;
            var13.field4298 = arg9;
            class311.field4994.method1540(var13, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I")
    public static final int method1546(int arg0, int arg1, int arg2) {
        field3454++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            if (arg2 != 14309) {
                field3444 = 74;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lid;")
    public final class247 method1547(int arg0) {
        field3438++;
        if (arg0 <= 116) {
            this.field3437 = null;
        }
        class247 var2 = this.field3437.field4013;
        if (this.field3437 == var2) {
            return null;
        } else {
            var2.method1764(64);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class220() {
        this.field3437.field4013 = this.field3437;
        this.field3437.field4017 = this.field3437;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Lid;")
    public final class247 method1548(int arg0) {
        field3441++;
        class247 var2 = this.field3437.field4013;
        if (arg0 != 0) {
            field3457 = false;
        }
        if (this.field3437 == var2) {
            this.field3448 = null;
            return null;
        } else {
            this.field3448 = var2.field4013;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Lid;")
    public final class247 method1549(int arg0) {
        field3439++;
        class247 var2 = this.field3448;
        if (this.field3437 == var2) {
            this.field3448 = null;
            return null;
        } else {
            this.field3448 = var2.field4013;
            int var3 = -60 / ((29 - arg0) / 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z[S[Ljava/lang/String;)V")
    public static final void method1550(boolean arg0, short[] arg1, String[] arg2) {
        class38.method215(0, arg2.length - 1, arg1, (byte) 110, arg2);
        field3449++;
        if (!arg0) {
            field3443 = null;
        }
    }
}
