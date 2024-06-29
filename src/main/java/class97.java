import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class97 extends class36 {

    @OriginalMember(owner = "client!qa", name = "Ub", descriptor = "Lwb;")
    public static class130 field2346 = class26.method212("mapback", -32376);

    @OriginalMember(owner = "client!qa", name = "Rb", descriptor = "Lwb;")
    public static class130 field2343 = class26.method212(":tradereq:", -32376);

    @OriginalMember(owner = "client!qa", name = "Wb", descriptor = "Lwb;")
    private static class130 field2348 = class26.method212("Press (Wchange your password(W on front page)3", -32376);

    @OriginalMember(owner = "client!qa", name = "bc", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!qa", name = "Ob", descriptor = "Lwb;")
    public static class130 field2340 = field2348;

    @OriginalMember(owner = "client!qa", name = "Tb", descriptor = "Lwb;")
    public static class130 field2345 = class26.method212("Benutzen", -32376);

    @OriginalMember(owner = "client!qa", name = "Mb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!qa", name = "Nb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!qa", name = "Qb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!qa", name = "Sb", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!qa", name = "Vb", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!qa", name = "Xb", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!qa", name = "Zb", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!qa", name = "ac", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!qa", name = "cc", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!qa", name = "dc", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!qa", name = "ec", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!qa", name = "fc", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!qa", name = "gc", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!qa", name = "hc", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!qa", name = "Yb", descriptor = "Lqd;")
    public static class100 field2350;

    @OriginalMember(owner = "client!qa", name = "Pb", descriptor = "Ltd;")
    private class117 field2341;

    @OriginalMember(owner = "client!qa", name = "Lb", descriptor = "Lda;")
    public static class20 field2337;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)I", line = 4)
    public final int method721(int arg0, byte arg1) {
        ++field2358;
        int var3 = this.field2354 >> 3;
        int var4 = 8 - (this.field2354 & 7);
        int var5 = 0;
        this.field2354 += arg0;
        if (arg1 > -94) {
            field2348 = null;
        }
        while (~arg0 < ~var4) {
            var5 += (super.field1067[var3++] & class64.field1639[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (class64.field1639[arg0] & super.field1067[var3] >> -arg0 + var4) + var5;
        } else {
            var6 = (class64.field1639[var4] & super.field1067[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([II)V", line = 34)
    public final void method722(int[] arg0, int arg1) {
        ++field2347;
        if (arg1 != 9109) {
            method724(111, -69, (class28) null, 47);
        }
        this.field2341 = new class117(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "(B)V", line = 63)
    public final void method723(byte arg0) {
        this.field2354 = super.field1057 * 8;
        ++field2351;
        int var2 = -35 / ((-6 - arg0) / 60);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILec;I)V", line = 75)
    public static final void method724(int arg0, int arg1, class28 arg2, int arg3) {
        int var4 = arg0 * arg0 + arg3 * arg3;
        if (var4 > 4225 && ~var4 > -90001) {
            int var5 = 2047 & class3.field80 - -class85.field2041;
            int var6 = class102.field2514[var5];
            int var7 = var6 * 256 / (class115.field2825 - -256);
            int var8 = class102.field2502[var5];
            int var9 = var8 * 256 / (class115.field2825 + 256);
            int var10 = arg0 * var7 + arg3 * var9 >> 16;
            int var11 = arg3 * var7 + -(arg0 * var9) >> 16;
            double var12 = Math.atan2((double) var10, (double) var11);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (57.0D * Math.cos(var12));
            class71.field1812.method226(var14 - -4 + 94 - 10, -var15 + 63, 20, 20, 15, 15, var12, 256);
        } else {
            class26.method215(-93, arg2, arg0, arg3);
        }
        ++field2357;
        int var16 = -100 / ((-34 - arg1) / 36);
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "(II)I", line = 112)
    public static final int method725(int arg0, int arg1) {
        ++field2356;
        if (arg1 != -4456) {
            method728((class121[]) null, (class34) null, -61, 13, (byte[]) null, -19);
        }
        return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(BI)I", line = 130)
    public final int method726(byte arg0, int arg1) {
        ++field2342;
        if (arg0 != -86) {
            field2343 = null;
        }
        return arg1 * 8 + -this.field2354;
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(II)V", line = 164)
    public final void method727(int arg0, int arg1) {
        ++field2339;
        super.field1067[super.field1057++] = (byte) (arg0 + this.field2341.method901((byte) 100));
        int var3 = 12 / ((arg1 - -24) / 62);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Luc;Lfc;II[BI)V", line = 191)
    public static final void method728(class121[] arg0, class34 arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        ++field2349;
        if (arg5 != 2047) {
            method728((class121[]) null, (class34) null, 90, -7, (byte[]) null, 119);
        }
        class36 var6 = new class36(arg4);
        int var7 = -1;
        while (true) {
            int var8 = var6.method331(-128);
            if (~var8 == -1) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method331(arg5 + -2171);
                if (~var10 == -1) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = var9 & 63;
                int var12 = (var9 & 4062) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method365((byte) -128);
                int var15 = var14 >> 2;
                int var16 = arg2 + var12;
                int var17 = var14 & 3;
                int var18 = arg3 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && ~var18 > -104) {
                    int var19 = var13;
                    class121 var20 = null;
                    if ((class56.field1435[1][var16][var18] & 2) == 2) {
                        var19 = var13 - 1;
                    }
                    if (~var19 <= -1) {
                        var20 = arg0[var19];
                    }
                    class112.method858(var7, var13, var17, arg1, var16, var18, (byte) 59, var15, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "(I)V", line = 267)
    public static void method729(int arg0) {
        field2345 = null;
        field2348 = null;
        field2346 = null;
        field2350 = null;
        field2337 = null;
        field2340 = null;
        field2343 = null;
        if (arg0 != 4225) {
            method728((class121[]) null, (class34) null, -49, 115, (byte[]) null, 61);
        }
    }

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "(I)V", line = 283)
    public final void method730(int arg0) {
        if (arg0 == -1) {
            super.field1057 = (this.field2354 - -7) / 8;
            ++field2355;
        }
    }

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "(I)I", line = 294)
    public final int method731(int arg0) {
        if (arg0 != -7218) {
            field2352 = 37;
        }
        ++field2338;
        return super.field1067[super.field1057++] + -this.field2341.method901((byte) 125) & 255;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V", line = 305)
    public class97(int arg0) {
        super(arg0);
    }
}
