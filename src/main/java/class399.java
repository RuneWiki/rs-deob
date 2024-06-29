import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class399 {

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "Lkm;")
    private class438 field5523 = new class438();

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[B")
    public static byte[] field5519 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field5517 = -1;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "[Li;")
    public static class83[] field5529 = new class83[14];

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "Z")
    public static boolean field5526 = true;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field5535 = 0;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "[I")
    public static int[] field5528 = new int[4096];

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "Lij;")
    public static class316 field5534;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "Lkm;")
    private class438 field5532;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "Lsd;")
    public static class68 field5537;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "Lwn;")
    public static class77 field5527;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5528[var0] = class274.method1731(512, var0);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2470(boolean arg0) {
        class253.field3517 = null;
        class344.field4644 = null;
        class31.field432 = null;
        field5525++;
        class363.field4995 = null;
        class242.field3429 = null;
        class276.field3767 = null;
        class221.field3104 = null;
        class269.field3685 = null;
        class361.field4987 = null;
        if (arg0) {
            return;
        }
        class405.field5613 = null;
        class134.field2005 = null;
        class328.field4462 = null;
        class21.field269 = null;
        class191.field2751 = null;
        class310.field4208 = null;
        class52.field669 = null;
        class90.field1259 = null;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 525)
    public class399() {
        this.field5523.field6178 = this.field5523;
        this.field5523.field6179 = this.field5523;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZZLea;Lea;ILcc;Lok;IIZI)Lwn;", line = 45)
    public static final class77 method2471(int arg0, boolean arg1, boolean arg2, class58 arg3, class58 arg4, int arg5, class339 arg6, class61 arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field5533++;
        class77 var12 = class14.method81(arg8, arg3, 29037, arg6, arg0, arg5, arg11, arg9);
        if (var12 != null) {
            return var12;
        }
        class14 var13 = class367.method2308(false, arg0);
        if (arg9 > 1 && var13.field126 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field166[var15] <= arg9 && var13.field166[var15] != 0) {
                    var14 = var13.field126[var15];
                }
            }
            if (var14 != -1) {
                var13 = class367.method2308(false, var14);
            }
        }
        class98 var16 = class267.method1702((byte) -83, var13.field136, 0, class393.field5456);
        if (var16 == null) {
            return null;
        }
        if (var13.field137 != null) {
            for (int var17 = 0; var17 < var13.field137.length; var17++) {
                if (var13.field194 == null || var17 >= var13.field194.length) {
                    var16.method766(var13.field137[var17], var13.field165[var17], (byte) -13);
                } else {
                    var16.method766(var13.field137[var17], class192.field2759[var13.field194[var17] & 0xFF], (byte) -13);
                }
            }
        }
        if (var13.field193 != null) {
            for (int var18 = 0; var18 < var13.field193.length; var18++) {
                var16.method763(var13.field144[var18], var13.field193[var18], 0);
            }
        }
        if (arg6 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (class215.field3017[var19].length > arg6.field4584[var19]) {
                    var16.method766(class194.field2808[var19], class215.field3017[var19][arg6.field4584[var19]], (byte) -13);
                }
                if (class101.field1391[var19].length > arg6.field4584[var19]) {
                    var16.method766(class419.field5820[var19], class101.field1391[var19][arg6.field4584[var19]], (byte) -13);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field141 != 128 || var13.field161 != 128 || var13.field195 != 128) {
            var21 = true;
            var20 |= 0x7;
        }
        class116 var22 = arg4.method254(var16, var20, 0, var13.field123 + 64, var13.field125 + 768);
        if (!var22.method885()) {
            return null;
        }
        if (var21) {
            var22.method890(var13.field141, var13.field161, var13.field195);
        }
        class77 var23 = null;
        if (var13.field197 != -1) {
            var23 = method2471(var13.field155, true, true, arg3, arg4, 0, arg6, arg7, 0, 10, true, 1);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field198 != -1) {
            var23 = method2471(var13.field170, false, arg2, arg3, arg4, 0, arg6, arg7, arg8, arg9, true, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field156;
        if (arg1) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg11 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        arg4.method194(16, 16, 512, 512);
        class309 var25 = arg4.method220();
        var25.method1856();
        arg4.method168(var25);
        arg4.method248(1.0F);
        arg4.method171(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class309 var26 = arg4.method210();
        var26.method1862(-var13.field190 << 3);
        var26.method1865(var13.field189 << 3);
        var26.method1869(var13.field173, (class136.field2021[var13.field135 << 3] * var24 >> 15) + var13.field199 - (var22.method889() / 2), (class136.field2020[var13.field135 << 3] * var24 >> 15) + var13.field199);
        if (!arg2) {
            return null;
        }
        var26.method1859(var13.field135 << 3);
        int var27 = arg4.method258();
        int var28 = arg4.method253();
        arg4.method238(50, Integer.MAX_VALUE);
        arg4.method202();
        arg4.method204();
        arg4.method245(0, 0, 36, 32, 0, 0);
        var22.method896(var26, (class153) null, 1);
        arg4.method238(var27, var28);
        int[] var29 = arg4.method239(0, 0, 36, 32);
        if (arg11 >= 1) {
            var29 = class264.method1691(0, var29, -16777215);
            if (arg11 >= 2) {
                var29 = class264.method1691(0, var29, -1);
            }
        }
        if (arg8 != 0) {
            class348.method2103(31, arg8, var29);
        }
        arg4.method232(var29, 0, 36, 36, 32).method616(0, 0);
        if (var13.field197 != -1) {
            var23.method616(0, 0);
        } else if (var13.field198 != -1) {
            var23.method616(0, 0);
        }
        if (arg5 == 1 || arg5 == 2 && (var13.field153 == 1 || arg9 != 1) && arg9 != -1) {
            arg7.method486(0, -256, (byte) 44, 9, -16777215, class246.method1602((byte) 70, arg9));
        }
        int[] var30 = arg4.method239(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class431.method2655(var30[var31], -16777216);
            }
        }
        class77 var32;
        if (arg10) {
            var32 = arg4.method232(var30, 0, 36, 36, 32);
        } else {
            var32 = arg3.method232(var30, 0, 36, 36, 32);
        }
        if (!arg10) {
            class128 var33 = new class128();
            var33.field1946 = arg3.field744;
            var33.field1939 = arg11;
            var33.field1938 = arg9;
            var33.field1933 = arg6 != null;
            var33.field1937 = arg0;
            var33.field1935 = arg5;
            var33.field1932 = arg8;
            class431.field6035.method1052((byte) -101, var32, var33);
        }
        return var32;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Z", line = 280)
    public final boolean method2472(byte arg0) {
        int var2 = 37 / ((-arg0 - 73) / 43);
        field5536++;
        return this.field5523.field6179 == this.field5523;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 291)
    public static final void method2473(byte arg0) {
        field5524++;
        if (class314.field4259 == 2) {
            return;
        }
        if (arg0 < 51) {
            field5517 = 58;
        }
        try {
            class9.method49(class352.field4737, "tbrefresh", -125);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)I", line = 311)
    public static final int method2474(byte arg0, int arg1) {
        if (arg0 != 22) {
            field5529 = null;
        }
        if (class398.field5513 != null) {
            class398.field5513.method1324(arg0 + 92);
            class398.field5513 = null;
        }
        field5521++;
        class419.field5806++;
        if (class419.field5806 > 4) {
            class112.field1727 = 0;
            class419.field5806 = 0;
            return arg1;
        }
        class112.field1727 = 0;
        if (class369.field5111 == class166.field2340) {
            class166.field2340 = class169.field2405;
        } else {
            class166.field2340 = class369.field5111;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V", line = 346)
    public static final void method2475(byte arg0) {
        class144.field2108.method176(class337.field4559, class160.field2272 ? class429.field5978 + 256 : -1);
        field5522++;
        if (arg0 <= 107) {
            field5528 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(B)V", line = 363)
    public final void method2476(byte arg0) {
        if (arg0 != 0) {
            return;
        }
        field5531++;
        while (true) {
            class438 var2 = this.field5523.field6179;
            if (this.field5523 == var2) {
                this.field5532 = null;
                return;
            }
            var2.method2695(0);
        }
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)V", line = 387)
    public static void method2477(byte arg0) {
        if (arg0 < 121) {
            return;
        }
        field5537 = null;
        field5519 = null;
        field5528 = null;
        field5529 = null;
        field5527 = null;
        field5534 = null;
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(B)Lkm;", line = 403)
    public final class438 method2478(byte arg0) {
        field5530++;
        class438 var2 = this.field5523.field6178;
        if (this.field5523 == var2) {
            this.field5532 = null;
            return null;
        } else {
            int var3 = 6 / ((arg0 + 13) / 60);
            this.field5532 = var2.field6178;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Lkm;", line = 423)
    public final class438 method2479(int arg0) {
        if (arg0 > -47) {
            return null;
        }
        field5538++;
        class438 var2 = this.field5523.field6179;
        if (this.field5523 == var2) {
            return null;
        } else {
            var2.method2695(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Lkm;", line = 462)
    public final class438 method2480(int arg0) {
        field5539++;
        class438 var2 = this.field5523.field6179;
        if (arg0 != 7904) {
            field5535 = -87;
        }
        if (this.field5523 == var2) {
            this.field5532 = null;
            return null;
        } else {
            this.field5532 = var2.field6179;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)I", line = 485)
    public final int method2481(int arg0) {
        field5518++;
        int var2 = 0;
        if (arg0 != -15824) {
            return -74;
        }
        class438 var3 = this.field5523.field6179;
        while (this.field5523 != var3) {
            var3 = var3.field6179;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)Lkm;", line = 506)
    public final class438 method2482(int arg0) {
        field5516++;
        class438 var2 = this.field5532;
        if (arg0 != 50) {
            return null;
        } else if (this.field5523 == var2) {
            this.field5532 = null;
            return null;
        } else {
            this.field5532 = var2.field6179;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lkm;I)V", line = 534)
    public final void method2483(class438 arg0, int arg1) {
        field5520++;
        if (arg1 != 0) {
            return;
        }
        if (arg0.field6178 != null) {
            arg0.method2695(0);
        }
        arg0.field6178 = this.field5523.field6178;
        arg0.field6179 = this.field5523;
        arg0.field6178.field6179 = arg0;
        arg0.field6179.field6178 = arg0;
    }
}
