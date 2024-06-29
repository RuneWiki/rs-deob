import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Ljb;")
    private class64 field542 = new class64();

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lbe;")
    private class13 field545 = new class13();

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "Lpc;")
    private class101 field544;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[I")
    public static int[] field516 = new int[4000];

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lrd;")
    public static class114 field524 = class84.method656("backbase2", (byte) 123);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lrd;")
    public static class114 field517 = class84.method656("b12_full", (byte) 114);

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lrd;")
    private static class114 field526 = class84.method656("Press (Wchange your password(W on front page)3", (byte) 118);

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lrd;")
    private static class114 field533 = class84.method656("Private chat", (byte) 117);

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lrd;")
    private static class114 field536 = class84.method656(" from your ignore list first", (byte) 120);

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lrd;")
    public static class114 field528 = class84.method656("Bitte versuchen Sie es erneut)3", (byte) 122);

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lrd;")
    public static class114 field538 = field536;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lrd;")
    public static class114 field518 = field526;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lrd;")
    public static class114 field522 = field533;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lpb;")
    public static class100 field521;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Lke;")
    public static class73 field537;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[I")
    public static int[] field527;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjb;J)V")
    public final void method193(int arg0, class64 arg1, long arg2) {
        field529++;
        if (this.field547 == 0) {
            class64 var5 = this.field545.method107((byte) -53);
            var5.method540(-26669);
            var5.method519((byte) -127);
            if (this.field542 == var5) {
                class64 var6 = this.field545.method107((byte) -53);
                var6.method540(-26669);
                var6.method519((byte) -123);
            }
        } else {
            this.field547--;
        }
        if (arg0 > -59) {
            method201(7, 49, -92);
        }
        this.field544.method781((byte) -7, arg2, arg1);
        this.field545.method108(arg1, (byte) -124);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)Ljb;")
    public final class64 method194(byte arg0, long arg1) {
        if (arg0 > -68) {
            return null;
        }
        field534++;
        class64 var4 = (class64) this.field544.method783(-1, arg1);
        if (var4 != null) {
            this.field545.method108(var4, (byte) -117);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[Lnc;IILua;B[BIII)V")
    public static final void method195(int arg0, int arg1, class89[] arg2, int arg3, int arg4, class129 arg5, byte arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        class60 var11 = new class60(arg7);
        int var12 = -1;
        while (true) {
            int var13 = var11.method469((byte) -52);
            if (var13 == 0) {
                field523++;
                if (arg6 != 37) {
                    field541 = 114;
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method469((byte) -80);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method462((byte) 116);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg9 == var18 && var17 >= arg3 && var17 < arg3 + 8 && arg10 <= var16 && var16 < arg10 + 8) {
                    class12 var22 = class130.method1048(-70, var12);
                    int var23 = arg8 + class103.method797(var16 & 0x7, var22.field277, var17 & 0x7, -101, var21, arg0, var22.field261);
                    int var24 = arg4 + class24.method168(var22.field277, var22.field261, arg6 ^ 0xFFFFFFA5, var21, var17 & 0x7, arg0, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg1;
                        if ((class22.field430[1][var23][var24] & 0x2) == 2) {
                            var25 = arg1 - 1;
                        }
                        class89 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg2[var25];
                        }
                        class16.method123(var24, var20, arg1, arg5, var26, arg0 + var21 & 0x3, var12, var23, (byte) -55);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method196(int arg0) {
        if (arg0 != -1) {
            field532 = -9;
        }
        class67.field1458.method200(-108);
        field520++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIILe;I)V")
    public static final void method197(int arg0, int arg1, int arg2, class29 arg3, int arg4) {
        field539++;
        if (class85.field1923 >= 50 || class84.field1860 == 0 || (arg3.field593 == null || arg3.field593.length <= arg0)) {
            return;
        }
        int var5 = arg3.field593[arg0];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        int var7 = var5 >> 4 & 0x7;
        class72.field1616[class85.field1923] = var6;
        int var8 = var5 & 0xF;
        int var9 = (arg2 - 64) / 128;
        int var10 = (arg4 - 64) / 128;
        class143.field3415[class85.field1923] = var7;
        if (arg1 == 6693) {
            class9.field141[class85.field1923] = 0;
            class31.field626[class85.field1923] = null;
            class46.field954[class85.field1923] = (var9 << 16) + (var10 << 8) + var8;
            class85.field1923++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static final void method198(int arg0) {
        class64.field1370 = true;
        field535++;
        class129.field3100 = true;
        int var1 = 24 % ((arg0 - 71) / 55);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public static final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field531++;
        if (class130.field3145 == arg4 && class65.field1409 == arg5 && (class7.field100 == arg3 || !class64.field1370)) {
            return;
        }
        class130.field3145 = arg4;
        class7.field100 = arg3;
        if (!class64.field1370) {
            class7.field100 = 0;
        }
        class65.field1409 = arg5;
        class12.method101(false, 25);
        class90.method694(0, null, false, class117.field2753);
        int var6 = class72.field1611;
        class72.field1611 = (arg4 - 6) * 8;
        int var7 = class65.field1408;
        class65.field1408 = arg5 * 8 - 48;
        int var8 = class65.field1408 - var7;
        int var9 = class65.field1408;
        int var10 = class72.field1611 - var6;
        int var11 = class72.field1611;
        for (int var12 = 0; var12 < 32768; var12++) {
            class8 var28 = class123.field2894[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field748[var29] -= var10;
                    var28.field758[var29] -= var8;
                }
                var28.field756 -= var8 * 128;
                var28.field712 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class126 var26 = class36.field762[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field748[var27] -= var10;
                    var26.field758[var27] -= var8;
                }
                var26.field712 -= var10 * 128;
                var26.field756 -= var8 * 128;
            }
        }
        class20.field346 = arg3;
        byte var14 = 0;
        class7.field103.method255((byte) -121, false, arg0, arg2);
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        if (arg1 < ~var10) {
            var14 = 103;
            var16 = -1;
            var15 = -1;
        }
        byte var18 = 1;
        byte var19 = 104;
        if (var8 < 0) {
            var18 = -1;
            var19 = -1;
            var17 = 103;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var20 + var10;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class77.field1767[var25][var20][var22] = class77.field1767[var25][var23][var24];
                    } else {
                        class77.field1767[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class98 var21 = (class98) class72.field1598.method654((byte) 92); var21 != null; var21 = (class98) class72.field1598.method644((byte) -68)) {
            var21.field2225 -= var8;
            var21.field2237 -= var10;
            if (var21.field2237 < 0 || var21.field2225 < 0 || var21.field2237 >= 104 || var21.field2225 >= 104) {
                var21.method540(arg1 ^ 0x682C);
            }
        }
        class11.field181 = false;
        if (class64.field1371 != 0) {
            class64.field1371 -= var10;
            class85.field1897 -= var8;
        }
        class85.field1923 = 0;
        class3.field21 = -1;
        class58.field1194.method648(114);
        class65.field1394.method648(arg1 ^ 0xFFFFFFAA);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public final void method200(int arg0) {
        if (arg0 > -91) {
            this.field547 = 82;
        }
        field519++;
        while (true) {
            class64 var2 = this.field545.method107((byte) -53);
            if (var2 == null) {
                this.field547 = this.field546;
                return;
            }
            var2.method540(-26669);
            var2.method519((byte) -104);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Lrd;")
    public static final class114 method201(int arg0, int arg1, int arg2) {
        field525++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class102.field2363;
        } else if (var3 < -6) {
            return class112.field2618;
        } else if (var3 < -3) {
            return class64.field1375;
        } else {
            if (arg1 != 7) {
                method202((byte) 13);
            }
            if (var3 < 0) {
                return class144.field3420;
            } else if (var3 > 9) {
                return class85.field1885;
            } else if (var3 > 6) {
                return class110.field2574;
            } else if (var3 > 3) {
                return class98.field2234;
            } else if (var3 > 0) {
                return class128.field3070;
            } else {
                return class3.field27;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method202(byte arg0) {
        field521 = null;
        field528 = null;
        field538 = null;
        field536 = null;
        field527 = null;
        field517 = null;
        field526 = null;
        if (arg0 <= 115) {
            field543 = -89;
        }
        field533 = null;
        field522 = null;
        field537 = null;
        field524 = null;
        field516 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
    public final void method203(long arg0, int arg1) {
        field540++;
        if (arg1 != 2) {
            this.method203(-18L, 17);
        }
        class64 var4 = (class64) this.field544.method783(-1, arg0);
        if (var4 != null) {
            var4.method540(arg1 - 26671);
            var4.method519((byte) -119);
            this.field547++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
    public class26(int arg0) {
        this.field547 = arg0;
        this.field546 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field544 = new class101(var2);
    }
}
