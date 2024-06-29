import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class78 extends class142 {

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    private int field1368 = 4096;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    private int field1379 = 4096;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    private int field1376 = 409;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    private int field1378 = 4096;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "[I")
    private int[] field1374 = new int[3];

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "[I")
    public static int[] field1361 = new int[5];

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lai;")
    private static class10 field1363 = class44.method278("Please try again)3", -39);

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Lai;")
    public static class10 field1372 = field1363;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "Lai;")
    public static class10 field1369 = class44.method278(" weitere Optionen", -11);

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "Z")
    public static boolean field1380 = false;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1370 = -1;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Lme;")
    public static class114 field1362 = new class114(new byte[5000]);

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "Lai;")
    public static class10 field1385 = class44.method278("::fpson", 105);

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "Lai;")
    public static class10 field1386 = class44.method278("da dieser Computer gegen unsere ", 92);

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "Lai;")
    private static class10 field1383 = class44.method278("Unexpected loginserver response)3", 124);

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "Lai;")
    public static class10 field1384 = field1383;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "Lai;")
    public static class10 field1387 = class44.method278("Verbindung konnte nicht hergestellt werden)3", -44);

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "[Lta;")
    public static class173[] field1371;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field1365;
        int[][] var3 = super.field2666.method956(arg0, -110);
        if (arg1) {
            this.method78((class114) null, -111, (byte) -16);
        }
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class133.field2499; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field1374[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1376 < var13) {
                    var7[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var8[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field1374[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field1376) {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field1374[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field1376 > ~var17) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field1378 * var12 >> 12;
                            var9[var11] = this.field1368 * var14 >> 12;
                            var10[var11] = this.field1379 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[SII[Lai;)V")
    public static final void method483(int arg0, short[] arg1, int arg2, int arg3, class10[] arg4) {
        ++field1366;
        if (arg2 != 20962) {
            method484((byte) -96);
        }
        if (~arg0 < ~arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            class10 var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg3; ~var9 > ~arg0; ++var9) {
                if (var7 == null || arg4[var9] != null && arg4[var9].method47(var7, false) < (var9 & 1)) {
                    class10 var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method483(var6 + -1, arg1, 20962, arg3, arg4);
            method483(arg0, arg1, 20962, var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)Lta;")
    public static final class173 method484(byte arg0) {
        ++field1382;
        class173 var1 = new class173();
        var1.field3341 = class100.field1857[0];
        var1.field3337 = class144.field2754;
        var1.field3340 = class87.field1547[0];
        var1.field3342 = class145.field2781[0];
        var1.field3344 = class140.field2639;
        var1.field3338 = class189.field3615[0];
        var1.field3343 = class18.field263[0];
        var1.field3339 = class184.field3500;
        class56.method383(-87);
        return arg0 != 8 ? null : var1;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)V")
    public static final void method485(boolean arg0) {
        ++field1381;
        if (!arg0) {
            method483(20, (short[]) null, 116, -38, (class10[]) null);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class53.field946 + -1) < ~var2; ++var2) {
                if (class75.field1308[var2] < 1000 && ~class75.field1308[var2 - -1] < -1001) {
                    var1 = false;
                    class10 var3 = class148.field2845[var2];
                    class148.field2845[var2] = class148.field2845[var2 - -1];
                    class148.field2845[var2 - -1] = var3;
                    class10 var4 = class116.field2235[var2];
                    class116.field2235[var2] = class116.field2235[var2 + 1];
                    class116.field2235[var2 + 1] = var4;
                    int var5 = class75.field1308[var2];
                    class75.field1308[var2] = class75.field1308[var2 + 1];
                    class75.field1308[var2 + 1] = var5;
                    int var6 = class36.field561[var2];
                    class36.field561[var2] = class36.field561[var2 + 1];
                    class36.field561[var2 - -1] = var6;
                    int var7 = class148.field2848[var2];
                    class148.field2848[var2] = class148.field2848[var2 - -1];
                    class148.field2848[var2 + 1] = var7;
                    int var8 = class130.field2472[var2];
                    class130.field2472[var2] = class130.field2472[var2 + 1];
                    class130.field2472[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static void method486(int arg0) {
        field1387 = null;
        if (arg0 == 0) {
            field1371 = null;
            field1383 = null;
            field1361 = null;
            field1384 = null;
            field1362 = null;
            field1363 = null;
            field1369 = null;
            field1385 = null;
            field1372 = null;
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field1364;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method771(126);
                            this.field1374[0] = class123.method861(var5 << 4, 267386880);
                            this.field1374[1] = class123.method861(65280, var5) >> 4;
                            this.field1374[2] = class123.method861(0, var5 >> 12);
                        }
                    } else {
                        this.field1378 = arg0.method762((byte) 105);
                    }
                } else {
                    this.field1368 = arg0.method762((byte) 115);
                }
            } else {
                this.field1379 = arg0.method762((byte) 117);
            }
        } else {
            this.field1376 = arg0.method762((byte) 75);
        }
        if (arg2 > -34) {
            method486(2);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, false);
    }
}
