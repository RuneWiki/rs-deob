import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 extends class166 {

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    private int field345 = 4;

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "I")
    private int field355 = 4;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "Lhj;")
    public static class69 field348 = class181.method1318("Gegenstand f-Ur Mitglieder", (byte) -110);

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "Lhj;")
    public static class69 field344 = class181.method1318("Lade Schrifts-=tze )2 ", (byte) -112);

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "[I")
    public static int[] field352 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lhj;")
    public static class69 field351 = class181.method1318("<img=1>", (byte) -111);

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "Lhj;")
    public static class69 field341 = class181.method1318("null", (byte) -127);

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "Lhj;")
    public static class69 field359 = class181.method1318("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) -111);

    @OriginalMember(owner = "client!gh", name = "hb", descriptor = "I")
    public static volatile int field360 = 0;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "Lhj;")
    public static class69 field353 = class181.method1318(": ", (byte) -125);

    @OriginalMember(owner = "client!gh", name = "ib", descriptor = "I")
    public static int field361 = 0;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lnc;")
    public static class83 field343;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "Lnc;")
    public static class83 field358;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "[I")
    public static int[] field347;

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "[Lqb;")
    public static class56[] field356;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 == 96) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field345 = arg1.method937(false);
                }
            } else {
                this.field355 = arg1.method937(false);
            }
            ++field357;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field346;
            int[][] var3 = super.field3064.method320(arg1, (byte) -91);
            if (super.field3064.field979) {
                int var4 = class253.field4565 / this.field355;
                int var5 = class146.field2691 / this.field345;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method1229(0, arg0 ^ 23580, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method1229(class146.field2691 * var7 / var5, 23580, 0);
                }
                int[] var8 = var6[1];
                int[] var9 = var6[0];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; var14 < class253.field4565; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class253.field4565 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var9[var16];
                    var12[var14] = var8[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg4 && arg5 == arg6 && ~arg2 == ~arg3 && ~arg1 == ~arg7) {
            class136.method1021(arg1, arg9, arg0, (byte) -37, arg3, arg5);
        } else {
            int var10 = arg0;
            int var11 = arg0 * 3;
            int var12 = arg5;
            int var13 = arg5 * 3;
            int var14 = arg6 * 3;
            int var15 = arg7 * 3;
            int var16 = arg1 - (-var14 + var15 + arg5);
            int var17 = arg4 * 3;
            int var18 = arg2 * 3;
            int var19 = arg3 - -var17 + -arg0 + -var18;
            int var20 = var18 - (var17 - (-var17 + var11));
            int var21 = -var11 + var17;
            int var22 = -var14 + var13 + -var14 + var15;
            int var23 = -var13 + var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var16 * var26;
                int var28 = var19 * var26;
                int var29 = var22 * var25;
                int var30 = var20 * var25;
                int var31 = var21 * var24;
                int var32 = var23 * var24;
                int var33 = (var28 + var30 + var31 >> 12) + arg0;
                int var34 = (var27 + var29 - -var32 >> 12) + arg5;
                class136.method1021(var34, arg9, var10, (byte) -37, var33, var12);
                var10 = var33;
                var12 = var34;
            }
        }
        if (arg8 != -13125) {
            field347 = null;
        }
        ++field354;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field342;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int var4 = class253.field4565 / this.field355;
            int var5 = class146.field2691 / this.field345;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1231(124, class146.field2691 * var6 / var5, 0);
            } else {
                var7 = this.method1231(-14, 0, 0);
            }
            for (int var8 = 0; ~var8 > ~class253.field4565; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class253.field4565 * var9 / var4];
                }
            }
        }
        return arg1 != 8388607 ? null : var3;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V")
    public static void method136(byte arg0) {
        field347 = null;
        field348 = null;
        field353 = null;
        field341 = null;
        field359 = null;
        field356 = null;
        field344 = null;
        field343 = null;
        field358 = null;
        field352 = null;
        int var1 = -76 / ((arg0 - 40) / 33);
        field351 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class24() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
    public static final void method137(int arg0) {
        ++field350;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class90.method641(class212.field3862, (byte) -23);
        class176.method1278(-31547, class212.field3862);
        if (class106.field2002 != null) {
            class106.field2002.method896(class212.field3862, (byte) 104);
        }
        class239.method1694((byte) 45);
        class163.method1213((byte) -61, class212.field3862);
        class90.method639((byte) -34, class212.field3862);
        if (class106.field2002 != null) {
            class106.field2002.method897(class212.field3862, (byte) -115);
        }
        class123.method885(-120);
        class129.field2414 = (long) arg0;
    }
}
