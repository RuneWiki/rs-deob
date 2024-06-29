import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class170 extends class93 {

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    private int field3320 = 4096;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    private int field3325 = 4096;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    private int field3328 = 4096;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field3313 = -1;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "Ljd;")
    public static class92 field3322 = class202.method1325((byte) 90, "au");

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Ljd;")
    public static class92 field3321 = class202.method1325((byte) 90, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Ljd;")
    private static class92 field3324 = class202.method1325((byte) 90, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "Ljd;")
    public static class92 field3327 = class202.method1325((byte) 90, "floorshadows");

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Ljd;")
    public static class92 field3326 = class202.method1325((byte) 90, ")1j");

    @OriginalMember(owner = "client!s", name = "V", descriptor = "Ljd;")
    public static class92 field3316 = class202.method1325((byte) 90, "Fertigkeit)2");

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Ljd;")
    public static class92 field3314 = field3324;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "Ljd;")
    public static class92 field3329 = class202.method1325((byte) 90, "<)4col> x");

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "[Lrf;")
    public static class167[] field3319;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lmd;")
    public static final class120 method1129(int arg0, int arg1) {
        ++field3317;
        class120 var2 = (class120) class119.field2409.method930(116, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class15.field439.method899((byte) 87, arg1, 0);
            if (var3 == null) {
                return null;
            } else {
                class120 var4 = new class120();
                class70 var5 = new class70(var3);
                var5.field1472 = var5.field1493.length + -2;
                int var6 = var5.method442(-21351);
                if (arg0 < 22) {
                    field3314 = null;
                }
                int var7 = var5.field1493.length + -12 + -2 - var6;
                var5.field1472 = var7;
                int var8 = var5.method453(65);
                var4.field2431 = var5.method442(-21351);
                var4.field2441 = var5.method442(-21351);
                var4.field2436 = var5.method442(-21351);
                var4.field2430 = var5.method442(-21351);
                int var9 = var5.method443(255);
                if (~var9 < -1) {
                    var4.field2424 = new class33[var9];
                    for (int var10 = 0; ~var9 < ~var10; ++var10) {
                        int var11 = var5.method442(-21351);
                        class33 var12 = new class33(class130.method857((byte) 60, var11));
                        var4.field2424[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method453(111);
                            int var14 = var5.method453(37);
                            var12.method210((byte) -75, (long) var13, new class130(var14));
                        }
                    }
                }
                var5.field1472 = 0;
                int var15 = 0;
                var4.field2443 = var5.method436(126);
                var4.field2440 = new class92[var8];
                var4.field2439 = new int[var8];
                var4.field2429 = new int[var8];
                while (var7 > var5.field1472) {
                    int var16 = var5.method442(-21351);
                    if (~var16 != -4) {
                        if (var16 < 100 && var16 != 21 && ~var16 != -39 && ~var16 != -40) {
                            var4.field2429[var15] = var5.method453(71);
                        } else {
                            var4.field2429[var15] = var5.method443(255);
                        }
                    } else {
                        var4.field2440[var15] = var5.method437((byte) 114);
                    }
                    var4.field2439[var15++] = var16;
                }
                class119.field2409.method927(24744, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        class212.field4091.method923(-110);
        class168.field3283.method923(-114);
        if (arg0 != 1) {
            field3313 = 59;
        }
        class186.field3510.method923(arg0 + -114);
        ++field3315;
        class100.field2048.method923(-99);
        class165.field3224.method923(-103);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3320 = arg1.method442(arg2 ^ -21351);
                }
            } else {
                this.field3328 = arg1.method442(arg2 + -21351);
            }
        } else {
            this.field3325 = arg1.method442(-21351);
        }
        if (arg2 != 0) {
            field3321 = null;
        }
        ++field3318;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class170() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public static void method1131(int arg0) {
        field3327 = null;
        field3314 = null;
        field3316 = null;
        field3322 = null;
        field3329 = null;
        field3324 = null;
        field3319 = null;
        field3326 = null;
        if (arg0 > -85) {
            field3322 = null;
        }
        field3321 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            return null;
        } else {
            ++field3323;
            int[][] var3 = super.field1873.method553(arg0, 0);
            if (super.field1873.field1656) {
                int[][] var4 = this.method649(0, true, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class150.field2985; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && var12 == var14) {
                        var8[var11] = this.field3325 * var13 >> 12;
                        var9[var11] = this.field3328 * var12 >> 12;
                        var10[var11] = this.field3320 * var14 >> 12;
                    } else {
                        var8[var11] = this.field3325;
                        var9[var11] = this.field3328;
                        var10[var11] = this.field3320;
                    }
                }
            }
            return var3;
        }
    }
}
