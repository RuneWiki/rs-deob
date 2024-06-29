import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class86 extends class430 implements class161 {

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "B")
    private byte field1337;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Z")
    private boolean field1322;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Z")
    private boolean field1316;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "B")
    private byte field1330;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "B")
    private byte field1342;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Z")
    private boolean field1336;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "S")
    private short field1328;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Z")
    private boolean field1326;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Lhc;")
    public class75 field1313;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Lek;")
    private class294 field1324;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "[[[I")
    public static int[][][] field1325 = new int[2][][];

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1318 = 50;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILaa;)Z", line = 7)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field1315;
        class75 var5 = this.method601(arg0, arg3, 65536);
        if (var5 != null) {
            class261 var6 = arg3.method1769();
            var6.method882(super.field6197, super.field6191, super.field6192);
            return var5.method516(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 27)
    public static void method595(int arg0) {
        field1325 = null;
        if (arg0 > -122) {
            field1325 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILrg;)V", line = 41)
    public static final void method596(int arg0, class383 arg1) {
        ++field1327;
        if (arg0 != 14459) {
            field1318 = -62;
        }
        if (class217.field2874 == arg1.field5557) {
            class259.field3553[arg1.field5549] = true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Laa;Z)V", line = 57)
    public final void method128(class281 arg0, boolean arg1) {
        ++field1340;
        if (!arg1) {
            this.field1316 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 69)
    public final void method138(int arg0) {
        if (arg0 == -4728) {
            ++field1338;
            if (this.field1313 != null) {
                this.field1313.method494();
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Laa;B)V", line = 83)
    public final void method133(class281 arg0, byte arg1) {
        if (arg1 != -102) {
            this.field1328 = -99;
        }
        ++field1323;
        Object var3 = null;
        class294 var5;
        if (this.field1324 == null && this.field1326) {
            class169 var4 = this.method597(arg0, true, 131072, 121);
            var5 = var4 != null ? var4.field2405 : null;
        } else {
            var5 = this.field1324;
            this.field1324 = null;
        }
        if (var5 != null) {
            class209.method1358(var5, this.field1337, super.field6197, super.field6192, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Laa;B)V", line = 111)
    public final void method122(class281 arg0, byte arg1) {
        ++field1321;
        Object var3 = null;
        class294 var5;
        if (this.field1324 == null && this.field1326) {
            class169 var4 = this.method597(arg0, true, 131072, 125);
            var5 = var4 != null ? var4.field2405 : null;
        } else {
            var5 = this.field1324;
            this.field1324 = null;
        }
        if (arg1 < 16) {
            this.method131((class281) null, -98);
        }
        if (var5 != null) {
            class409.method2624(var5, this.field1337, super.field6197, super.field6192, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Laa;ZII)Lvn;", line = 140)
    private final class169 method597(class281 arg0, boolean arg1, int arg2, int arg3) {
        ++field1320;
        class369 var5 = class310.method1961(65535 & this.field1328, (byte) 35);
        if (arg3 < 109) {
            return null;
        } else {
            class156 var6;
            class156 var7;
            if (!this.field1336) {
                var6 = class156.field2213[this.field1337];
                if (~this.field1337 <= -4) {
                    var7 = null;
                } else {
                    var7 = class156.field2213[this.field1337 + 1];
                }
            } else {
                var6 = class435.field6248[this.field1337];
                var7 = class156.field2213[0];
            }
            return var5.method2362(super.field6191, var6, ~this.field1330 != -12 ? this.field1330 : 10, arg0, 89, ~this.field1330 != -12 ? this.field1342 : this.field1342 + 4, var7, super.field6197, super.field6192, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 170)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 != 0) {
            method596(-121, (class383) null);
        }
        ++field1314;
        if (arg6 instanceof class135) {
            class135 var8 = (class135) arg6;
            if (this.field1313 != null && var8.field1923 != null) {
                this.field1313.method535(var8.field1923, arg3, arg5, arg2, arg1);
            }
        } else {
            if (arg6 instanceof class86) {
                class86 var9 = (class86) arg6;
                if (this.field1313 != null && var9.field1313 != null) {
                    this.field1313.method535(var9.field1313, arg3, arg5, arg2, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Laa;IB)Lhc;", line = 201)
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        ++field1317;
        if (arg2 >= -25) {
            this.field1322 = true;
        }
        return this.method601(0, arg0, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z", line = 212)
    public final boolean method127(byte arg0) {
        ++field1311;
        int var2 = 26 / ((-52 - arg0) / 33);
        return this.field1326;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)I", line = 224)
    public final int method598(byte arg0) {
        if (arg0 > -121) {
            method599(true, 36);
        }
        ++field1319;
        return this.field1313 != null ? this.field1313.method525() / 4 : 15;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I", line = 245)
    public final int method126(int arg0) {
        if (arg0 != -13482) {
            return 35;
        } else {
            ++field1341;
            return 65535 & this.field1328;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Laa;Lsk;IIIIIZIIIIIIZ)V", line = 260)
    public class86(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5177 == -2, class252.method1557(arg13, 9, arg12));
        this.field1337 = (byte) arg3;
        this.field1322 = arg14;
        this.field1316 = ~arg1.field5221 != -1 && !arg7;
        this.field1330 = (byte) arg12;
        this.field1342 = (byte) arg13;
        this.field1336 = arg7;
        this.field1328 = (short) arg1.field5204;
        this.field1326 = arg0.method1753() && arg1.field5176 && !this.field1336 && class410.field5956 != 0;
        int var16 = 1024;
        if (this.field1322) {
            var16 |= 32768;
        }
        class169 var17 = this.method597(arg0, this.field1326, var16, 113);
        if (var17 != null) {
            this.field1313 = var17.field2401;
            this.field1324 = var17.field2405;
            if (this.field1322) {
                this.field1313 = this.field1313.method529((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)Llo;", line = 293)
    public static final class449 method599(boolean arg0, int arg1) {
        ++field1335;
        if (arg0) {
            method599(true, -50);
        }
        class190 var2 = class62.field966;
        class449 var3;
        synchronized (class62.field966) {
            var3 = (class449) class62.field966.method1246((byte) -21, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class433.field6226.method1920(class312.method1974(arg1, 127), arg0, class344.method2204(arg1, true));
            class449 var5 = new class449();
            var5.field6503 = arg1;
            if (var4 != null) {
                var5.method2803((byte) 50, new class371(var4));
            }
            var5.method2801(arg0);
            class190 var6 = class62.field966;
            synchronized (class62.field966) {
                class62.field966.method1247((long) arg1, (byte) -119, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)I", line = 324)
    public final int method600(boolean arg0) {
        if (!arg0) {
            return 65;
        } else {
            ++field1312;
            return this.field1313 != null ? this.field1313.method523() : 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 336)
    public final void method135(byte arg0) {
        this.field1322 = false;
        if (arg0 != -123) {
            field1318 = -26;
        }
        ++field1332;
        if (this.field1313 != null) {
            this.field1313.method508(this.field1313.method533() & -32769);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)I", line = 352)
    public final int method124(int arg0) {
        ++field1329;
        if (arg0 != -11197) {
            this.method138(73);
        }
        return this.field1342;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILaa;I)Lhc;", line = 363)
    private final class75 method601(int arg0, class281 arg1, int arg2) {
        ++field1339;
        if (arg0 != 0) {
            this.field1313 = null;
        }
        if (this.field1313 != null && arg1.method1732(this.field1313.method533(), arg2) == 0) {
            return this.field1313;
        } else {
            class169 var4 = this.method597(arg1, false, arg2, 121);
            return var4 != null ? var4.field2401 : null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z", line = 385)
    public final boolean method137(int arg0) {
        ++field1331;
        return arg0 != 0 ? true : this.field1322;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I", line = 405)
    public final int method123(byte arg0) {
        ++field1333;
        return arg0 < 108 ? -38 : this.field1330;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V", line = 416)
    public static final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1334;
        class181.method1202(arg2, -42);
        int var7 = 0;
        int var8 = -arg4 + arg2;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (~class300.field4164 >= ~arg0 && arg0 <= class398.field5827) {
            int[] var15 = class84.field1286[arg0];
            int var16 = class231.method1452(121, class43.field659, arg6 - arg2, class379.field5397);
            int var17 = class231.method1452(118, class43.field659, arg2 + arg6, class379.field5397);
            int var18 = class231.method1452(104, class43.field659, arg6 - var8, class379.field5397);
            int var19 = class231.method1452(101, class43.field659, arg6 + var8, class379.field5397);
            class73.method486(var16, var15, arg5, arg1 ^ 9909, var18);
            class73.method486(var18, var15, arg3, -109, var19);
            class73.method486(var19, var15, arg5, -107, var17);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (~var12 <= -1 && ~var11 <= -2) {
                --var11;
                var12 -= var11 << 1;
                class275.field3727[var11] = var7;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg0;
                int var21 = arg0 + var9;
                if (~var21 <= ~class300.field4164 && ~var20 >= ~class398.field5827) {
                    if (~var8 >= ~var9) {
                        int var22 = class231.method1452(arg1 + 10027, class43.field659, arg6 + var7, class379.field5397);
                        int var23 = class231.method1452(arg1 + 10019, class43.field659, -var7 + arg6, class379.field5397);
                        if (var21 <= class398.field5827) {
                            class73.method486(var23, class84.field1286[var21], arg5, arg1 + 10053, var22);
                        }
                        if (var20 >= class300.field4164) {
                            class73.method486(var23, class84.field1286[var20], arg5, -123, var22);
                        }
                    } else {
                        int var24 = class275.field3727[var9];
                        int var25 = class231.method1452(88, class43.field659, arg6 - -var7, class379.field5397);
                        int var26 = class231.method1452(93, class43.field659, -var7 + arg6, class379.field5397);
                        int var27 = class231.method1452(126, class43.field659, arg6 + var24, class379.field5397);
                        int var28 = class231.method1452(84, class43.field659, arg6 - var24, class379.field5397);
                        if (var21 <= class398.field5827) {
                            int[] var29 = class84.field1286[var21];
                            class73.method486(var26, var29, arg5, -99, var28);
                            class73.method486(var28, var29, arg3, -109, var27);
                            class73.method486(var27, var29, arg5, 104, var25);
                        }
                        if (class300.field4164 <= var20) {
                            int[] var30 = class84.field1286[var20];
                            class73.method486(var26, var30, arg5, arg1 + 10029, var28);
                            class73.method486(var28, var30, arg3, -98, var27);
                            class73.method486(var27, var30, arg5, -126, var25);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (~class300.field4164 >= ~var32 && ~var31 >= ~class398.field5827) {
                int var33 = arg6 - -var9;
                int var34 = arg6 - var9;
                if (class379.field5397 <= var33 && ~class43.field659 <= ~var34) {
                    int var35 = class231.method1452(104, class43.field659, var33, class379.field5397);
                    int var36 = class231.method1452(arg1 + 10020, class43.field659, var34, class379.field5397);
                    if (var8 <= var7) {
                        if (~class398.field5827 <= ~var32) {
                            class73.method486(var36, class84.field1286[var32], arg5, -115, var35);
                        }
                        if (var31 >= class300.field4164) {
                            class73.method486(var36, class84.field1286[var31], arg5, arg1 + 9822, var35);
                        }
                    } else {
                        int var37 = var11 < var7 ? class275.field3727[var7] : var11;
                        int var38 = class231.method1452(122, class43.field659, arg6 + var37, class379.field5397);
                        int var39 = class231.method1452(arg1 ^ -9891, class43.field659, -var37 + arg6, class379.field5397);
                        if (~class398.field5827 <= ~var32) {
                            int[] var40 = class84.field1286[var32];
                            class73.method486(var36, var40, arg5, 124, var39);
                            class73.method486(var39, var40, arg3, arg1 + 10056, var38);
                            class73.method486(var38, var40, arg5, 95, var35);
                        }
                        if (var31 >= class300.field4164) {
                            int[] var41 = class84.field1286[var31];
                            class73.method486(var36, var41, arg5, arg1 + 10016, var39);
                            class73.method486(var39, var41, arg3, -110, var38);
                            class73.method486(var38, var41, arg5, 97, var35);
                        }
                    }
                }
            }
        }
        if (arg1 != -9934) {
            method602(-12, 125, -90, 73, -41, -52, -116);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Laa;I)Lcn;", line = 604)
    public final class300 method131(class281 arg0, int arg1) {
        ++field1310;
        if (this.field1313 == null) {
            return null;
        } else {
            class261 var3 = arg0.method1769();
            var3.method882(super.field6197, super.field6191, super.field6192);
            class300 var4 = null;
            if (this.field1316) {
                var4 = class8.method54((byte) -114, 1);
            }
            if (arg1 < 72) {
                method602(-41, 113, -26, 73, -73, 67, -59);
            }
            this.field1313.method514(var3, var4 == null ? null : var4.field4152[0], 0);
            return var4;
        }
    }
}
