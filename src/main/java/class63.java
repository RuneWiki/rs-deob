import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class63 extends class17 implements class285 {

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "Lie;")
    public class53 field664;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Z")
    private boolean field661;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field659 = -1;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public static int field653 = 127;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "Z")
    public static boolean field663 = false;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "Lam;")
    public static class286 field646;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I", line = 4)
    public final int method339(int arg0) {
        ++field654;
        int var2 = 121 % ((19 - arg0) / 32);
        return this.field664.field516;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lvm;Lds;IIIIIIIZIIIII)V", line = 14)
    public class63(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field3069 == -2, class398.method2489((byte) -98, arg2, arg3));
        this.field664 = new class53(arg0, arg1, arg2, arg3, super.field161, arg5, arg6, arg8, arg9, arg14);
        this.field661 = ~arg1.field3027 != -1;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)V", line = 24)
    public static final void method340(byte arg0) {
        int var1 = -38 / ((arg0 - 64) / 55);
        class235.field3227 = new class194[class131.field1693.method1676(116)][];
        ++field643;
        class289.field3940 = new boolean[class131.field1693.method1676(120)];
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 35)
    public static final void method341() {
        class68.field706 = 0;
        label191: for (int var0 = 0; var0 < class248.field3338; ++var0) {
            class427 var1 = class179.field2250[var0];
            if (class169.field2137 != null) {
                for (int var2 = 0; var2 < class169.field2137.length; ++var2) {
                    if (class169.field2137[var2] != -1000000 && (var1.field6265 <= class169.field2137[var2] || var1.field6271 <= class169.field2137[var2]) && (var1.field6256 <= class94.field1094[var2] || var1.field6272 <= class94.field1094[var2]) && (var1.field6256 >= class149.field1898[var2] || var1.field6272 >= class149.field1898[var2]) && (var1.field6254 <= class452.field6572[var2] || var1.field6261 <= class452.field6572[var2]) && (var1.field6254 >= class99.field1167[var2] || var1.field6261 >= class99.field1167[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field6259 == 1) {
                int var3 = var1.field6269 - class98.field1164 + class430.field6316;
                if (var3 >= 0 && var3 <= class430.field6316 + class430.field6316) {
                    int var4 = var1.field6274 - class419.field6103 + class430.field6316;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field6275 - class419.field6103 + class430.field6316;
                    if (var5 > class430.field6316 + class430.field6316) {
                        var5 = class430.field6316 + class430.field6316;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class342.field4573[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class62.field638 - var1.field6256;
                        if (var7 > 32) {
                            var1.field6278 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field6278 = 2;
                            var7 = -var7;
                        }
                        var1.field6273 = (var1.field6254 - class390.field5596 << 8) / var7;
                        var1.field6270 = (var1.field6261 - class390.field5596 << 8) / var7;
                        var1.field6266 = (var1.field6265 - class421.field6185 << 8) / var7;
                        var1.field6257 = (var1.field6271 - class421.field6185 << 8) / var7;
                        class176.field2208[class68.field706++] = var1;
                    }
                }
            } else if (var1.field6259 == 2) {
                int var8 = var1.field6274 - class419.field6103 + class430.field6316;
                if (var8 >= 0 && var8 <= class430.field6316 + class430.field6316) {
                    int var9 = var1.field6269 - class98.field1164 + class430.field6316;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field6268 - class98.field1164 + class430.field6316;
                    if (var10 > class430.field6316 + class430.field6316) {
                        var10 = class430.field6316 + class430.field6316;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class342.field4573[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class390.field5596 - var1.field6254;
                        if (var12 > 32) {
                            var1.field6278 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field6278 = 4;
                            var12 = -var12;
                        }
                        var1.field6267 = (var1.field6256 - class62.field638 << 8) / var12;
                        var1.field6277 = (var1.field6272 - class62.field638 << 8) / var12;
                        var1.field6266 = (var1.field6265 - class421.field6185 << 8) / var12;
                        var1.field6257 = (var1.field6271 - class421.field6185 << 8) / var12;
                        class176.field2208[class68.field706++] = var1;
                    }
                }
            } else if (var1.field6259 == 4) {
                int var13 = var1.field6265 - class421.field6185;
                if (var13 > 128) {
                    int var14 = var1.field6274 - class419.field6103 + class430.field6316;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field6275 - class419.field6103 + class430.field6316;
                    if (var15 > class430.field6316 + class430.field6316) {
                        var15 = class430.field6316 + class430.field6316;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field6269 - class98.field1164 + class430.field6316;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field6268 - class98.field1164 + class430.field6316;
                        if (var17 > class430.field6316 + class430.field6316) {
                            var17 = class430.field6316 + class430.field6316;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class342.field4573[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field6278 = 5;
                            var1.field6267 = (var1.field6256 - class62.field638 << 8) / var13;
                            var1.field6277 = (var1.field6272 - class62.field638 << 8) / var13;
                            var1.field6273 = (var1.field6254 - class390.field5596 << 8) / var13;
                            var1.field6270 = (var1.field6261 - class390.field5596 << 8) / var13;
                            class176.field2208[class68.field706++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lor;III)V", line = 261)
    public static final void method342(class295 arg0, int arg1, int arg2, int arg3) {
        int var4 = class396.field5706[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field4008 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 255;
            if (var6 <= 0) {
                break;
            }
            arg0.field3999[arg0.field4008++] = class227.field3090[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field4008; var7 < 4; ++var7) {
            arg0.field3999[var7] = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILja;Z)V", line = 289)
    public static final void method343(int arg0, int arg1, class89 arg2, boolean arg3) {
        ++field656;
        if (arg3) {
            class21.field197[arg0][arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILvm;)Z", line = 300)
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        if (arg0 != -23563) {
            field653 = -86;
        }
        ++field642;
        class396 var5 = this.field664.method258(arg3, super.field154, 65536, super.field152, -1, false, false);
        if (var5 == null) {
            return false;
        } else {
            class247 var6 = arg3.method1650();
            var6.method747(super.field152, super.field150, super.field154);
            return var5.method2300(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I", line = 321)
    public final int method76(int arg0) {
        ++field647;
        return arg0 != 20765 ? 50 : this.field664.method263(2);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)Z", line = 335)
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            return true;
        } else {
            ++field660;
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 348)
    public final void method346(int arg0) {
        ++field651;
        if (arg0 <= -13) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLvm;)V", line = 363)
    public final void method347(byte arg0, class322 arg1) {
        ++field648;
        this.field664.method260(false, arg1);
        if (arg0 != -108) {
            this.method353(true, 74, -60, 103, (class128) null, -4, (class322) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)V", line = 374)
    public static void method348(byte arg0) {
        if (arg0 < 64) {
            method340((byte) -92);
        }
        field646 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lvm;II)Ljn;", line = 384)
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        if (arg1 != -24206) {
            this.method351((byte) 51);
        }
        ++field657;
        return this.field664.method258(arg0, 0, arg2, 0, arg1 ^ 24205, false, false);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 397)
    public final void method350(byte arg0) {
        ++field645;
        if (arg0 < 114) {
            this.method345((byte) 87);
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I", line = 409)
    public final int method351(byte arg0) {
        if (arg0 != 103) {
            return 7;
        } else {
            ++field665;
            return this.field664.field532;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lvm;I)V", line = 424)
    public final void method352(class322 arg0, int arg1) {
        if (arg1 == 0) {
            ++field655;
            class396 var3 = this.field664.method258(arg0, super.field154, 131072, super.field152, arg1 + -1, true, true);
            if (var3 != null) {
                this.field664.method262(super.field153, arg0, super.field168, super.field159, false, false, var3, super.field158);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIIILai;ILvm;)V", line = 441)
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (arg1 < 36) {
            this.method356(56);
        }
        ++field649;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V", line = 455)
    public static final void method354(int arg0, int arg1) {
        ++field662;
        class386.field5504.method614(-127, arg1);
        class249.field3353.method614(-125, arg1);
        class350.field4869.method614(-128, arg1);
        class155.field1961.method614(-123, arg1);
        if (arg0 < -18) {
            class208.field2807.method614(-119, arg1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lvm;Z)Ldn;", line = 470)
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field652;
        class396 var3 = this.field664.method258(arg0, super.field154, 1024, super.field152, -1, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = arg0.method1650();
            var4.method747(super.field152, super.field150, super.field154);
            class321 var5 = null;
            if (this.field661) {
                var5 = class204.method1110(258, 1);
            }
            if (this.field664.field546 == null) {
                var3.method2284(var4, var5 == null ? null : var5.field4293[0], 0);
            } else {
                class366 var6 = this.field664.field546.method917();
                arg0.method1622(var3, var6, var4, var5 == null ? null : var5.field4293[0], 0);
            }
            this.field664.method262(super.field153, arg0, super.field168, super.field159, arg1, true, var3, super.field158);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)I", line = 510)
    public final int method356(int arg0) {
        ++field644;
        if (arg0 != 10397) {
            field659 = 115;
        }
        return this.field664.field539;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLvm;)V", line = 521)
    public final void method357(boolean arg0, class322 arg1) {
        ++field650;
        this.field664.method261(-124, arg1);
        if (arg0) {
            field659 = 3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z", line = 536)
    public final boolean method358(byte arg0) {
        ++field658;
        if (arg0 != 24) {
            field653 = 12;
        }
        return this.field664.method256(15842);
    }
}
