import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class39 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int field536 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    private int field553 = 0;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    private int field551 = 128;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    private int field548 = 0;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Z")
    public boolean field557 = false;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public int field561 = -1;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    private int field559 = 128;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[[B")
    public static byte[][] field543 = new byte[1000][];

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lhj;")
    private static class69 field554 = class181.method1318("(U0a )2 in: ", (byte) -109);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lhj;")
    public static class69 field546 = class181.method1318(":assist:", (byte) -107);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lhj;")
    public static class69 field535 = class181.method1318("Bitte entfernen Sie ", (byte) -120);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Lci;")
    public static class230 field550 = new class230();

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Lhj;")
    public static class69 field563 = class181.method1318(")1", (byte) -112);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[S")
    private short[] field540;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[S")
    private short[] field542;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "[S")
    private short[] field552;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "[S")
    private short[] field562;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method213(int arg0) {
        class172.field3147.method1713(62);
        field547++;
        int var1 = 38 % ((arg0 - 52) / 49);
        class63.field1213.method1713(117);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Lsf;")
    public final class92 method214(int arg0, byte arg1) {
        field539++;
        class92 var3 = (class92) class235.field4284.method1714((long) this.field545, (byte) -127);
        if (var3 == null) {
            class74 var4 = class74.method523(class99.field1879, this.field558, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field540 != null) {
                for (int var5 = 0; var5 < this.field540.length; var5++) {
                    var4.method533(this.field540[var5], this.field562[var5]);
                }
            }
            if (this.field552 != null) {
                for (int var6 = 0; var6 < this.field552.length; var6++) {
                    var4.method514(this.field552[var6], this.field542[var6]);
                }
            }
            var3 = var4.method526(this.field548 + 64, this.field553 + 850, -30, -50, -30);
            class235.field4284.method1705((byte) 125, var3, (long) this.field545);
        }
        class92 var7;
        if (this.field561 == -1 || arg0 == -1) {
            var7 = var3.method654(true, true);
        } else {
            var7 = class211.method1521(-114, this.field561).method1199(65535, var3, arg0);
        }
        if (this.field559 != 128 || this.field551 != 128) {
            var7.method661(this.field559, this.field551, this.field559);
        }
        int var8 = -89 / ((arg1 - 49) / 36);
        if (this.field536 != 0) {
            if (this.field536 == 90) {
                var7.method653();
            }
            if (this.field536 == 180) {
                var7.method656();
            }
            if (this.field536 == 270) {
                var7.method655();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfh;BI)V")
    private final void method215(class128 arg0, byte arg1, int arg2) {
        field556++;
        if (arg2 == 1) {
            this.field558 = arg0.method912(arg1 ^ 0x62);
        } else if (arg2 == 2) {
            this.field561 = arg0.method912(118);
        } else if (arg2 == 4) {
            this.field559 = arg0.method912(-87);
        } else if (arg2 == 5) {
            this.field551 = arg0.method912(arg1 ^ 0xFFFFFFA3);
        } else if (arg2 == 6) {
            this.field536 = arg0.method912(-118);
        } else if (arg2 == 7) {
            this.field548 = arg0.method937(false);
        } else if (arg2 == 8) {
            this.field553 = arg0.method937(false);
        } else if (arg2 == 9) {
            this.field557 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method937(false);
            this.field540 = new short[var6];
            this.field562 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field540[var7] = (short) arg0.method912(-77);
                this.field562[var7] = (short) arg0.method912(-128);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method937(false);
            this.field542 = new short[var4];
            this.field552 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field552[var5] = (short) arg0.method912(class197.method1442(arg1, 122));
                this.field542[var5] = (short) arg0.method912(-123);
            }
        }
        if (arg1 != -13) {
            method220(60, 125, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static void method216(int arg0) {
        field546 = null;
        field563 = null;
        field535 = null;
        field543 = null;
        field554 = null;
        if (arg0 != 26272) {
            field554 = null;
        }
        field550 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BILvb;)V")
    public static final void method217(byte arg0, int arg1, class58 arg2) {
        Object[] var3 = arg2.field1050;
        if (arg0 > -31) {
            method222(-59, -101, 50, -13, 27);
        }
        int var4 = (Integer) var3[0];
        field544++;
        class200 var5 = class56.method334(var4, -87);
        if (var5 == null) {
            return;
        }
        class24.field361 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var5.field3609;
        int var9 = 0;
        int[] var10 = var5.field3608;
        byte var11 = -1;
        try {
            class182.field3304 = new int[var5.field3620];
            class54.field963 = new class69[var5.field3611];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field1053;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field1044;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field1048 == null ? -1 : arg2.field1048.field773;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field1042;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field1048 == null ? -1 : arg2.field1048.field735;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field1051 == null ? -1 : arg2.field1051.field773;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field1051 == null ? -1 : arg2.field1051.field735;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field1041;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field1055;
                    }
                    class182.field3304[var12++] = var16;
                } else if (var3[var14] instanceof class69) {
                    class69 var15 = (class69) var3[var14];
                    if (var15.method444((byte) -24, class45.field655)) {
                        var15 = arg2.field1052;
                    }
                    class54.field963[var13++] = var15;
                }
            }
            int var17 = 0;
            label3491: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var461 = var8[var7];
                if (var461 < 100) {
                    if (var461 == 0) {
                        class239.field4372[var6++] = var10[var7];
                        continue;
                    }
                    if (var461 == 1) {
                        int var18 = var10[var7];
                        class239.field4372[var6++] = class50.field812[var18];
                        continue;
                    }
                    if (var461 == 2) {
                        int var19 = var10[var7];
                        var6--;
                        class109.method818(var19, class239.field4372[var6], -29072);
                        continue;
                    }
                    if (var461 == 3) {
                        class233.field4263[var9++] = var5.field3616[var7];
                        continue;
                    }
                    if (var461 == 6) {
                        var7 += var10[var7];
                        continue;
                    }
                    if (var461 == 7) {
                        var6 -= 2;
                        if (class239.field4372[var6 + 1] != class239.field4372[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var461 == 8) {
                        var6 -= 2;
                        if (class239.field4372[var6 + 1] == class239.field4372[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var461 == 9) {
                        var6 -= 2;
                        if (class239.field4372[var6] < class239.field4372[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var461 == 10) {
                        var6 -= 2;
                        if (class239.field4372[var6 + 1] < class239.field4372[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var461 == 21) {
                        if (class24.field361 == 0) {
                            return;
                        }
                        class189 var20 = class78.field1504[--class24.field361];
                        class182.field3304 = var20.field3427;
                        var7 = var20.field3433;
                        var5 = var20.field3430;
                        var8 = var5.field3609;
                        class54.field963 = var20.field3431;
                        var10 = var5.field3608;
                        continue;
                    }
                    if (var461 == 25) {
                        int var21 = var10[var7];
                        class239.field4372[var6++] = class84.method623(var21, -3);
                        continue;
                    }
                    if (var461 == 27) {
                        int var22 = var10[var7];
                        var6--;
                        class205.method1494(class239.field4372[var6], 0, var22);
                        continue;
                    }
                    if (var461 == 31) {
                        var6 -= 2;
                        if (class239.field4372[var6] <= class239.field4372[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var461 == 32) {
                        var6 -= 2;
                        if (class239.field4372[var6] >= class239.field4372[var6 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var461 == 33) {
                        class239.field4372[var6++] = class182.field3304[var10[var7]];
                        continue;
                    }
                    int var10001;
                    if (var461 == 34) {
                        var10001 = var10[var7];
                        var6--;
                        class182.field3304[var10001] = class239.field4372[var6];
                        continue;
                    }
                    if (var461 == 35) {
                        class233.field4263[var9++] = class54.field963[var10[var7]];
                        continue;
                    }
                    if (var461 == 36) {
                        var10001 = var10[var7];
                        var9--;
                        class54.field963[var10001] = class233.field4263[var9];
                        continue;
                    }
                    if (var461 == 37) {
                        int var23 = var10[var7];
                        var9 -= var23;
                        class69 var24 = class212.method1529(var9, false, var23, class233.field4263);
                        class233.field4263[var9++] = var24;
                        continue;
                    }
                    if (var461 == 38) {
                        var6--;
                        continue;
                    }
                    if (var461 == 39) {
                        var9--;
                        continue;
                    }
                    if (var461 == 40) {
                        int var25 = var10[var7];
                        class200 var26 = class56.method334(var25, -72);
                        class69[] var27 = new class69[var26.field3611];
                        int[] var28 = new int[var26.field3620];
                        for (int var29 = 0; var29 < var26.field3617; var29++) {
                            var28[var29] = class239.field4372[var29 + var6 - var26.field3617];
                        }
                        for (int var30 = 0; var30 < var26.field3621; var30++) {
                            var27[var30] = class233.field4263[var9 + var30 - var26.field3621];
                        }
                        var9 -= var26.field3621;
                        var6 -= var26.field3617;
                        class189 var31 = new class189();
                        var31.field3430 = var5;
                        var31.field3431 = class54.field963;
                        var31.field3427 = class182.field3304;
                        var31.field3433 = var7;
                        if (class24.field361 >= class78.field1504.length) {
                            throw new RuntimeException();
                        }
                        var7 = -1;
                        var5 = var26;
                        class78.field1504[class24.field361++] = var31;
                        class54.field963 = var27;
                        var10 = var26.field3608;
                        class182.field3304 = var28;
                        var8 = var26.field3609;
                        continue;
                    }
                    if (var461 == 42) {
                        class239.field4372[var6++] = class270.field4784[var10[var7]];
                        continue;
                    }
                    if (var461 == 43) {
                        int var32 = var10[var7];
                        var6--;
                        class270.field4784[var32] = class239.field4372[var6];
                        class68.method434((byte) -56, var32);
                        continue;
                    }
                    if (var461 == 44) {
                        int var33 = var10[var7] & 0xFFFF;
                        var6--;
                        int var34 = class239.field4372[var6];
                        int var35 = var10[var7] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            class250.field4540[var35] = var34;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label3491;
                                }
                                class10.field79[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 45) {
                        var6--;
                        int var38 = class239.field4372[var6];
                        int var39 = var10[var7];
                        if (var38 >= 0 && class250.field4540[var39] > var38) {
                            class239.field4372[var6++] = class10.field79[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 46) {
                        var6 -= 2;
                        int var40 = var10[var7];
                        int var41 = class239.field4372[var6];
                        if (var41 >= 0 && var41 < class250.field4540[var40]) {
                            class10.field79[var40][var41] = class239.field4372[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 47) {
                        class69 var42 = class175.field3204[var10[var7]];
                        if (var42 == null) {
                            var42 = class56.field1012;
                        }
                        class233.field4263[var9++] = var42;
                        continue;
                    }
                    if (var461 == 48) {
                        int var43 = var10[var7];
                        var9--;
                        class175.field3204[var43] = class233.field4263[var9];
                        class68.method435(2, var43);
                        continue;
                    }
                    if (var461 == 51) {
                        class103 var44 = var5.field3612[var10[var7]];
                        var6--;
                        class3 var45 = (class3) var44.method769(true, (long) class239.field4372[var6]);
                        if (var45 != null) {
                            var7 += var45.field6;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var461 < 300) {
                    if (var461 == 100) {
                        var6 -= 3;
                        int var439 = class239.field4372[var6];
                        int var440 = class239.field4372[var6 + 1];
                        int var441 = class239.field4372[var6 + 2];
                        if (var440 == 0) {
                            throw new RuntimeException();
                        }
                        class50 var442 = client.method1144((byte) -9, var439);
                        if (var442.field848 == null) {
                            var442.field848 = new class50[var441 + 1];
                        }
                        if (var441 >= var442.field848.length) {
                            class50[] var443 = new class50[var441 + 1];
                            for (int var444 = 0; var444 < var442.field848.length; var444++) {
                                var443[var444] = var442.field848[var444];
                            }
                            var442.field848 = var443;
                        }
                        if (var441 > 0 && var442.field848[var441 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var441 - 1));
                        }
                        class50 var445 = new class50();
                        var445.field884 = var440;
                        var445.field763 = true;
                        var445.field778 = var445.field773 = var442.field773;
                        var445.field735 = var441;
                        var442.field848[var441] = var445;
                        if (var46) {
                            class53.field952 = var445;
                        } else {
                            class26.field379 = var445;
                        }
                        class204.method1478(var442, false);
                        continue;
                    }
                    if (var461 == 101) {
                        class50 var446 = var46 ? class53.field952 : class26.field379;
                        if (var446.field735 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class50 var447 = client.method1144((byte) -9, var446.field773);
                        var447.field848[var446.field735] = null;
                        class204.method1478(var447, false);
                        continue;
                    }
                    if (var461 == 102) {
                        var6--;
                        class50 var448 = client.method1144((byte) -9, class239.field4372[var6]);
                        var448.field848 = null;
                        class204.method1478(var448, false);
                        continue;
                    }
                    if (var461 == 200) {
                        var6 -= 2;
                        int var449 = class239.field4372[var6 + 1];
                        int var450 = class239.field4372[var6];
                        class50 var451 = class108.method814(var449, var450, -13706);
                        if (var451 != null && var449 != -1) {
                            class239.field4372[var6++] = 1;
                            if (var46) {
                                class53.field952 = var451;
                            } else {
                                class26.field379 = var451;
                            }
                            continue;
                        }
                        class239.field4372[var6++] = 0;
                        continue;
                    }
                    if (var461 == 201) {
                        var6--;
                        int var452 = class239.field4372[var6];
                        class50 var453 = client.method1144((byte) -9, var452);
                        if (var453 == null) {
                            class239.field4372[var6++] = 0;
                        } else {
                            class239.field4372[var6++] = 1;
                            if (var46) {
                                class53.field952 = var453;
                            } else {
                                class26.field379 = var453;
                            }
                        }
                        continue;
                    }
                } else if (var461 < 500) {
                    if (var461 == 403) {
                        var6 -= 2;
                        int var434 = class239.field4372[var6 + 1];
                        int var435 = class239.field4372[var6];
                        if (var435 >= 7) {
                            var435 -= 7;
                        }
                        class156.field2904.field2036.method678(var435, -29455, var434);
                        continue;
                    }
                    if (var461 == 404) {
                        var6 -= 2;
                        int var436 = class239.field4372[var6];
                        int var437 = class239.field4372[var6 + 1];
                        class156.field2904.field2036.method676(var436, var437, -33);
                        continue;
                    }
                    if (var461 == 410) {
                        var6--;
                        boolean var438 = class239.field4372[var6] != 0;
                        class156.field2904.field2036.method672((byte) 53, var438);
                        continue;
                    }
                } else if (!(var461 < 1000 || var461 >= 1100) || !(var461 < 2000 || var461 >= 2100)) {
                    class50 var47;
                    if (var461 < 2000) {
                        var47 = var46 ? class53.field952 : class26.field379;
                    } else {
                        var461 -= 1000;
                        var6--;
                        var47 = client.method1144((byte) -9, class239.field4372[var6]);
                    }
                    if (var461 == 1000) {
                        var6 -= 4;
                        var47.field782 = class239.field4372[var6];
                        var47.field867 = class239.field4372[var6 + 1];
                        int var48 = class239.field4372[var6 + 2];
                        int var49 = class239.field4372[var6 + 3];
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        if (var48 < 0) {
                            var48 = 0;
                        } else if (var48 > 5) {
                            var48 = 5;
                        }
                        var47.field780 = (byte) var48;
                        var47.field878 = (byte) var49;
                        class204.method1478(var47, false);
                        class62.method405(var47, -121);
                        if (var47.field735 == -1) {
                            class181.method1316(var47.field773, -5759);
                        }
                        continue;
                    }
                    if (var461 == 1001) {
                        var6 -= 4;
                        var47.field873 = class239.field4372[var6];
                        var47.field739 = class239.field4372[var6 + 1];
                        var47.field875 = 0;
                        var47.field869 = 0;
                        int var50 = class239.field4372[var6 + 2];
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 4) {
                            var50 = 4;
                        }
                        int var51 = class239.field4372[var6 + 3];
                        var47.field832 = (byte) var50;
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        var47.field868 = (byte) var51;
                        class204.method1478(var47, false);
                        class62.method405(var47, -128);
                        if (var47.field884 == 0) {
                            class247.method1745(false, var47, -106);
                        }
                        continue;
                    }
                    if (var461 == 1003) {
                        var6--;
                        boolean var52 = class239.field4372[var6] == 1;
                        if (var52 != var47.field746) {
                            var47.field746 = var52;
                            class204.method1478(var47, false);
                        }
                        if (var47.field735 == -1) {
                            class101.method746(1007, var47.field773);
                        }
                        continue;
                    }
                    if (var461 == 1004) {
                        var6 -= 2;
                        var47.field789 = class239.field4372[var6];
                        var47.field767 = class239.field4372[var6 + 1];
                        class204.method1478(var47, false);
                        class62.method405(var47, -112);
                        if (var47.field884 == 0) {
                            class247.method1745(false, var47, -65);
                        }
                        continue;
                    }
                } else if (var461 >= 1100 && var461 < 1200 || var461 >= 2100 && var461 < 2200) {
                    class50 var431;
                    if (var461 < 2000) {
                        var431 = var46 ? class53.field952 : class26.field379;
                    } else {
                        var6--;
                        var431 = client.method1144((byte) -9, class239.field4372[var6]);
                        var461 -= 1000;
                    }
                    if (var461 == 1100) {
                        var6 -= 2;
                        var431.field829 = class239.field4372[var6];
                        if (var431.field829 > (var431.field847 - var431.field798)) {
                            var431.field829 = var431.field847 - var431.field798;
                        }
                        if (var431.field829 < 0) {
                            var431.field829 = 0;
                        }
                        var431.field792 = class239.field4372[var6 + 1];
                        if ((var431.field839 - var431.field727) < var431.field792) {
                            var431.field792 = var431.field839 - var431.field727;
                        }
                        if (var431.field792 < 0) {
                            var431.field792 = 0;
                        }
                        class204.method1478(var431, false);
                        if (var431.field735 == -1) {
                            class62.method385(var431.field773, 122);
                        }
                        continue;
                    }
                    if (var461 == 1101) {
                        var6--;
                        var431.field845 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        if (var431.field735 == -1) {
                            class199.method1449((byte) -52, var431.field773);
                        }
                        continue;
                    }
                    if (var461 == 1102) {
                        var6--;
                        var431.field823 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1103) {
                        var6--;
                        var431.field793 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1104) {
                        var6--;
                        var431.field728 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1105) {
                        var6--;
                        var431.field876 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1106) {
                        var6--;
                        var431.field865 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1107) {
                        var6--;
                        var431.field762 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1108) {
                        var431.field737 = 1;
                        var6--;
                        var431.field888 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        if (var431.field735 == -1) {
                            class3.method12(-20402, var431.field773);
                        }
                        continue;
                    }
                    if (var461 == 1109) {
                        var6 -= 6;
                        var431.field846 = class239.field4372[var6];
                        var431.field885 = class239.field4372[var6 + 1];
                        var431.field835 = class239.field4372[var6 + 2];
                        var431.field883 = class239.field4372[var6 + 3];
                        var431.field755 = class239.field4372[var6 + 4];
                        var431.field776 = class239.field4372[var6 + 5];
                        class204.method1478(var431, false);
                        if (var431.field735 == -1) {
                            class213.method1535(-16411, var431.field773);
                            class196.method1440(10, var431.field773);
                        }
                        continue;
                    }
                    if (var461 == 1110) {
                        var6--;
                        int var432 = class239.field4372[var6];
                        if (var431.field783 != var432) {
                            var431.field821 = 0;
                            var431.field815 = 0;
                            var431.field783 = var432;
                            class204.method1478(var431, false);
                        }
                        if (var431.field735 == -1) {
                            class94.method682(var431.field773, 113);
                        }
                        continue;
                    }
                    if (var461 == 1111) {
                        var6--;
                        var431.field814 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1112) {
                        var9--;
                        class69 var433 = class233.field4263[var9];
                        if (!var433.method444((byte) -24, var431.field749)) {
                            var431.field749 = var433;
                            class204.method1478(var431, false);
                        }
                        if (var431.field735 == -1) {
                            class153.method1162(0, var431.field773);
                        }
                        continue;
                    }
                    if (var461 == 1113) {
                        var6--;
                        var431.field801 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1114) {
                        var6 -= 3;
                        var431.field852 = class239.field4372[var6];
                        var431.field791 = class239.field4372[var6 + 1];
                        var431.field861 = class239.field4372[var6 + 2];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1115) {
                        var6--;
                        var431.field843 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1116) {
                        var6--;
                        var431.field889 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1117) {
                        var6--;
                        var431.field779 = class239.field4372[var6];
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1118) {
                        var6--;
                        var431.field802 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1119) {
                        var6--;
                        var431.field797 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                    if (var461 == 1120) {
                        var6 -= 2;
                        var431.field847 = class239.field4372[var6];
                        var431.field839 = class239.field4372[var6 + 1];
                        class204.method1478(var431, false);
                        if (var431.field884 == 0) {
                            class247.method1745(false, var431, 125);
                        }
                        continue;
                    }
                    if (var461 == 1121) {
                        class204.method1478(var431, false);
                        var6 -= 2;
                        continue;
                    }
                    if (var461 == 1122) {
                        var6--;
                        var431.field833 = class239.field4372[var6] == 1;
                        class204.method1478(var431, false);
                        continue;
                    }
                } else if (!(var461 < 1200 || var461 >= 1300) || !(var461 < 2200 || var461 >= 2300)) {
                    class50 var53;
                    if (var461 < 2000) {
                        var53 = var46 ? class53.field952 : class26.field379;
                    } else {
                        var461 -= 1000;
                        var6--;
                        var53 = client.method1144((byte) -9, class239.field4372[var6]);
                    }
                    class204.method1478(var53, false);
                    if (var461 == 1200 || var461 == 1205) {
                        var6 -= 2;
                        int var54 = class239.field4372[var6];
                        int var55 = class239.field4372[var6 + 1];
                        if (var53.field735 == -1) {
                            class94.method687(false, var53.field773);
                            class213.method1535(-16411, var53.field773);
                            class196.method1440(10, var53.field773);
                        }
                        if (var54 == -1) {
                            var53.field765 = -1;
                            var53.field888 = -1;
                            var53.field737 = 1;
                        } else {
                            var53.field788 = var55;
                            var53.field765 = var54;
                            class205 var56 = class83.method585(var54, -1);
                            var53.field835 = var56.field3709;
                            var53.field776 = var56.field3722;
                            if (var53.field869 > 0) {
                                var53.field776 = var53.field776 * 32 / var53.field869;
                            } else if (var53.field873 > 0) {
                                var53.field776 = var53.field776 * 32 / var53.field873;
                            }
                            var53.field885 = var56.field3698;
                            var53.field846 = var56.field3708;
                            var53.field883 = var56.field3731;
                            if (var461 == 1205) {
                                var53.field890 = false;
                            } else {
                                var53.field890 = true;
                            }
                            var53.field755 = var56.field3733;
                        }
                        continue;
                    }
                    if (var461 == 1201) {
                        var53.field737 = 2;
                        var6--;
                        var53.field888 = class239.field4372[var6];
                        if (var53.field735 == -1) {
                            class3.method12(-20402, var53.field773);
                        }
                        continue;
                    }
                    if (var461 == 1202) {
                        var53.field737 = 3;
                        var53.field888 = class156.field2904.field2036.method680(false);
                        if (var53.field735 == -1) {
                            class3.method12(-20402, var53.field773);
                        }
                        continue;
                    }
                    if (var461 == 1203) {
                        var53.field737 = 6;
                        var6--;
                        var53.field888 = class239.field4372[var6];
                        if (var53.field735 == -1) {
                            class3.method12(-20402, var53.field773);
                        }
                        continue;
                    }
                    if (var461 == 1204) {
                        var53.field737 = 5;
                        var6--;
                        var53.field888 = class239.field4372[var6];
                        if (var53.field735 == -1) {
                            class3.method12(-20402, var53.field773);
                        }
                        continue;
                    }
                } else if (var461 >= 1300 && var461 < 1400 || var461 >= 2300 && var461 < 2400) {
                    class50 var427;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var6--;
                        var427 = client.method1144((byte) -9, class239.field4372[var6]);
                    } else {
                        var427 = var46 ? class53.field952 : class26.field379;
                    }
                    if (var461 == 1300) {
                        var6--;
                        int var428 = class239.field4372[var6] - 1;
                        if (var428 >= 0 && var428 <= 9) {
                            var9--;
                            var427.method291(var428, class233.field4263[var9], 0);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var461 == 1301) {
                        var6 -= 2;
                        int var429 = class239.field4372[var6];
                        int var430 = class239.field4372[var6 + 1];
                        var427.field751 = class108.method814(var430, var429, -13706);
                        continue;
                    }
                    if (var461 == 1302) {
                        var6--;
                        var427.field879 = class239.field4372[var6] == 1;
                        continue;
                    }
                    if (var461 == 1303) {
                        var6--;
                        var427.field887 = class239.field4372[var6];
                        continue;
                    }
                    if (var461 == 1304) {
                        var6--;
                        var427.field859 = class239.field4372[var6];
                        continue;
                    }
                    if (var461 == 1305) {
                        var9--;
                        var427.field853 = class233.field4263[var9];
                        continue;
                    }
                    if (var461 == 1306) {
                        var9--;
                        var427.field856 = class233.field4263[var9];
                        continue;
                    }
                    if (var461 == 1307) {
                        var427.field742 = null;
                        continue;
                    }
                } else {
                    if (var461 >= 1400 && var461 < 1500 || var461 >= 2400 && var461 < 2500) {
                        int[] var420 = null;
                        class50 var421;
                        if (var461 < 2000) {
                            var421 = var46 ? class53.field952 : class26.field379;
                        } else {
                            var461 -= 1000;
                            var6--;
                            var421 = client.method1144((byte) -9, class239.field4372[var6]);
                        }
                        var9--;
                        class69 var422 = class233.field4263[var9];
                        if (var422.method441((byte) 73) > 0 && var422.method490(108, var422.method441((byte) 73) - 1) == 89) {
                            var6--;
                            int var423 = class239.field4372[var6];
                            if (var423 > 0) {
                                var420 = new int[var423];
                                while (var423-- > 0) {
                                    var6--;
                                    var420[var423] = class239.field4372[var6];
                                }
                            }
                            var422 = var422.method485(var422.method441((byte) 73) - 1, 0, (byte) -20);
                        }
                        Object[] var424 = new Object[var422.method441((byte) 73) + 1];
                        for (int var425 = var424.length - 1; var425 >= 1; var425--) {
                            if (var422.method490(93, var425 - 1) == 115) {
                                var9--;
                                var424[var425] = class233.field4263[var9];
                            } else {
                                var6--;
                                var424[var425] = Integer.valueOf(class239.field4372[var6]);
                            }
                        }
                        var6--;
                        int var426 = class239.field4372[var6];
                        if (var426 == -1) {
                            var424 = null;
                        } else {
                            var424[0] = Integer.valueOf(var426);
                        }
                        var421.field854 = true;
                        if (var461 == 1400) {
                            var421.field796 = var424;
                        } else if (var461 == 1401) {
                            var421.field799 = var424;
                        } else if (var461 == 1402) {
                            var421.field810 = var424;
                        } else if (var461 == 1403) {
                            var421.field785 = var424;
                        } else if (var461 == 1404) {
                            var421.field774 = var424;
                        } else if (var461 == 1405) {
                            var421.field807 = var424;
                        } else if (var461 == 1406) {
                            var421.field816 = var424;
                        } else if (var461 == 1407) {
                            var421.field881 = var420;
                            var421.field831 = var424;
                        } else if (var461 == 1408) {
                            var421.field840 = var424;
                        } else if (var461 == 1409) {
                            var421.field777 = var424;
                        } else if (var461 == 1410) {
                            var421.field741 = var424;
                        } else if (var461 == 1411) {
                            var421.field891 = var424;
                        } else if (var461 == 1412) {
                            var421.field842 = var424;
                        } else if (var461 == 1414) {
                            var421.field734 = var424;
                            var421.field855 = var420;
                        } else if (var461 == 1415) {
                            var421.field758 = var420;
                            var421.field761 = var424;
                        } else if (var461 == 1416) {
                            var421.field733 = var424;
                        } else if (var461 == 1417) {
                            var421.field781 = var424;
                        } else if (var461 == 1418) {
                            var421.field759 = var424;
                        } else if (var461 == 1419) {
                            var421.field886 = var424;
                        } else if (var461 == 1420) {
                            var421.field820 = var424;
                        } else if (var461 == 1421) {
                            var421.field784 = var424;
                        } else if (var461 == 1422) {
                            var421.field836 = var424;
                        } else if (var461 == 1423) {
                            var421.field787 = var424;
                        } else if (var461 == 1424) {
                            var421.field732 = var424;
                        } else if (var461 == 1425) {
                            var421.field730 = var424;
                        } else if (var461 == 1426) {
                            var421.field806 = var424;
                        } else if (var461 == 1427) {
                            var421.field892 = var424;
                        } else if (var461 == 1428) {
                            var421.field769 = var420;
                            var421.field803 = var424;
                        } else if (var461 == 1429) {
                            var421.field744 = var420;
                            var421.field825 = var424;
                        }
                        continue;
                    }
                    if (var461 < 1600) {
                        class50 var419 = var46 ? class53.field952 : class26.field379;
                        if (var461 == 1500) {
                            class239.field4372[var6++] = var419.field771;
                            continue;
                        }
                        if (var461 == 1501) {
                            class239.field4372[var6++] = var419.field740;
                            continue;
                        }
                        if (var461 == 1502) {
                            class239.field4372[var6++] = var419.field798;
                            continue;
                        }
                        if (var461 == 1503) {
                            class239.field4372[var6++] = var419.field727;
                            continue;
                        }
                        if (var461 == 1504) {
                            class239.field4372[var6++] = var419.field746 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 1505) {
                            class239.field4372[var6++] = var419.field778;
                            continue;
                        }
                    } else if (var461 < 1700) {
                        class50 var418 = var46 ? class53.field952 : class26.field379;
                        if (var461 == 1600) {
                            class239.field4372[var6++] = var418.field829;
                            continue;
                        }
                        if (var461 == 1601) {
                            class239.field4372[var6++] = var418.field792;
                            continue;
                        }
                        if (var461 == 1602) {
                            class233.field4263[var9++] = var418.field749;
                            continue;
                        }
                        if (var461 == 1603) {
                            class239.field4372[var6++] = var418.field847;
                            continue;
                        }
                        if (var461 == 1604) {
                            class239.field4372[var6++] = var418.field839;
                            continue;
                        }
                        if (var461 == 1605) {
                            class239.field4372[var6++] = var418.field776;
                            continue;
                        }
                        if (var461 == 1606) {
                            class239.field4372[var6++] = var418.field835;
                            continue;
                        }
                        if (var461 == 1607) {
                            class239.field4372[var6++] = var418.field755;
                            continue;
                        }
                        if (var461 == 1608) {
                            class239.field4372[var6++] = var418.field883;
                            continue;
                        }
                        if (var461 == 1609) {
                            class239.field4372[var6++] = var418.field793;
                            continue;
                        }
                    } else if (var461 < 1800) {
                        class50 var417 = var46 ? class53.field952 : class26.field379;
                        if (var461 == 1700) {
                            class239.field4372[var6++] = var417.field765;
                            continue;
                        }
                        if (var461 == 1701) {
                            if (var417.field765 == -1) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = var417.field788;
                            }
                            continue;
                        }
                        if (var461 == 1702) {
                            class239.field4372[var6++] = var417.field735;
                            continue;
                        }
                    } else if (var461 < 1900) {
                        class50 var415 = var46 ? class53.field952 : class26.field379;
                        if (var461 == 1800) {
                            class239.field4372[var6++] = class65.method423(client.method1141(var415), -21748);
                            continue;
                        }
                        if (var461 == 1801) {
                            var6--;
                            int var416 = class239.field4372[var6];
                            int var463 = var416 - 1;
                            if (var415.field742 != null && var415.field742.length > var463 && var415.field742[var463] != null) {
                                class233.field4263[var9++] = var415.field742[var463];
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 1802) {
                            if (var415.field853 == null) {
                                class233.field4263[var9++] = class233.field4253;
                            } else {
                                class233.field4263[var9++] = var415.field853;
                            }
                            continue;
                        }
                    } else if (var461 < 2600) {
                        var6--;
                        class50 var57 = client.method1144((byte) -9, class239.field4372[var6]);
                        if (var461 == 2500) {
                            class239.field4372[var6++] = var57.field771;
                            continue;
                        }
                        if (var461 == 2501) {
                            class239.field4372[var6++] = var57.field740;
                            continue;
                        }
                        if (var461 == 2502) {
                            class239.field4372[var6++] = var57.field798;
                            continue;
                        }
                        if (var461 == 2503) {
                            class239.field4372[var6++] = var57.field727;
                            continue;
                        }
                        if (var461 == 2504) {
                            class239.field4372[var6++] = var57.field746 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 2505) {
                            class239.field4372[var6++] = var57.field778;
                            continue;
                        }
                    } else if (var461 < 2700) {
                        var6--;
                        class50 var414 = client.method1144((byte) -9, class239.field4372[var6]);
                        if (var461 == 2600) {
                            class239.field4372[var6++] = var414.field829;
                            continue;
                        }
                        if (var461 == 2601) {
                            class239.field4372[var6++] = var414.field792;
                            continue;
                        }
                        if (var461 == 2602) {
                            class233.field4263[var9++] = var414.field749;
                            continue;
                        }
                        if (var461 == 2603) {
                            class239.field4372[var6++] = var414.field847;
                            continue;
                        }
                        if (var461 == 2604) {
                            class239.field4372[var6++] = var414.field839;
                            continue;
                        }
                        if (var461 == 2605) {
                            class239.field4372[var6++] = var414.field776;
                            continue;
                        }
                        if (var461 == 2606) {
                            class239.field4372[var6++] = var414.field835;
                            continue;
                        }
                        if (var461 == 2607) {
                            class239.field4372[var6++] = var414.field755;
                            continue;
                        }
                        if (var461 == 2608) {
                            class239.field4372[var6++] = var414.field883;
                            continue;
                        }
                        if (var461 == 2609) {
                            class239.field4372[var6++] = var414.field793;
                            continue;
                        }
                    } else if (var461 < 2800) {
                        if (var461 == 2700) {
                            var6--;
                            class50 var404 = client.method1144((byte) -9, class239.field4372[var6]);
                            class239.field4372[var6++] = var404.field765;
                            continue;
                        }
                        if (var461 == 2701) {
                            var6--;
                            class50 var405 = client.method1144((byte) -9, class239.field4372[var6]);
                            if (var405.field765 == -1) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = var405.field788;
                            }
                            continue;
                        }
                        if (var461 == 2702) {
                            var6--;
                            int var406 = class239.field4372[var6];
                            class259 var407 = (class259) class156.field2910.method769(true, (long) var406);
                            if (var407 == null) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = 1;
                            }
                            continue;
                        }
                        if (var461 == 2703) {
                            var6--;
                            class50 var408 = client.method1144((byte) -9, class239.field4372[var6]);
                            if (var408.field848 == null) {
                                class239.field4372[var6++] = 0;
                                continue;
                            }
                            int var409 = var408.field848.length;
                            for (int var410 = 0; var410 < var408.field848.length; var410++) {
                                if (var408.field848[var410] == null) {
                                    var409 = var410;
                                    break;
                                }
                            }
                            class239.field4372[var6++] = var409;
                            continue;
                        }
                        if (var461 == 2704 || var461 == 2705) {
                            var6 -= 2;
                            int var411 = class239.field4372[var6];
                            int var412 = class239.field4372[var6 + 1];
                            class259 var413 = (class259) class156.field2910.method769(true, (long) var411);
                            if (var413 != null && var413.field4640 == var412) {
                                class239.field4372[var6++] = 1;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                    } else if (var461 < 2900) {
                        var6--;
                        class50 var58 = client.method1144((byte) -9, class239.field4372[var6]);
                        if (var461 == 2800) {
                            class239.field4372[var6++] = class65.method423(client.method1141(var58), -21748);
                            continue;
                        }
                        if (var461 == 2801) {
                            var6--;
                            int var59 = class239.field4372[var6];
                            int var462 = var59 - 1;
                            if (var58.field742 != null && var58.field742.length > var462 && var58.field742[var462] != null) {
                                class233.field4263[var9++] = var58.field742[var462];
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 2802) {
                            if (var58.field853 == null) {
                                class233.field4263[var9++] = class233.field4253;
                            } else {
                                class233.field4263[var9++] = var58.field853;
                            }
                            continue;
                        }
                    } else if (var461 < 3200) {
                        if (var461 == 3100) {
                            var9--;
                            class69 var60 = class233.field4263[var9];
                            class122.method881(0, class233.field4253, var60, false);
                            continue;
                        }
                        if (var461 == 3101) {
                            var6 -= 2;
                            class53.method314(class239.field4372[var6 + 1], class239.field4372[var6], false, class156.field2904);
                            continue;
                        }
                        if (var461 == 3103) {
                            class203.method1471((byte) -114);
                            continue;
                        }
                        if (var461 == 3104) {
                            int var61 = 0;
                            class221.field3969++;
                            var9--;
                            class69 var62 = class233.field4263[var9];
                            if (var62.method475(true)) {
                                var61 = var62.method479((byte) -27);
                            }
                            class48.field692.method301(130, -104);
                            class48.field692.method908(false, var61);
                            continue;
                        }
                        if (var461 == 3105) {
                            var9--;
                            class69 var63 = class233.field4263[var9];
                            class48.field692.method301(235, -104);
                            class253.field4566++;
                            class48.field692.method918(var63.method473((byte) 81), 18820);
                            continue;
                        }
                        if (var461 == 3106) {
                            var9--;
                            class69 var64 = class233.field4263[var9];
                            class123.field2290++;
                            class48.field692.method301(51, -104);
                            class48.field692.method933(var64.method441((byte) 73) + 1, -20946);
                            class48.field692.method927(var64, (byte) 125);
                            continue;
                        }
                        if (var461 == 3107) {
                            var6--;
                            int var65 = class239.field4372[var6];
                            var9--;
                            class69 var66 = class233.field4263[var9];
                            class108.method817(var65, var66, false);
                            continue;
                        }
                        if (var461 == 3108) {
                            var6 -= 3;
                            int var67 = class239.field4372[var6];
                            int var68 = class239.field4372[var6 + 1];
                            int var69 = class239.field4372[var6 + 2];
                            class50 var70 = client.method1144((byte) -9, var69);
                            class223.method1585(var70, var67, -110, var68);
                            continue;
                        }
                        if (var461 == 3109) {
                            var6 -= 2;
                            class50 var71 = var46 ? class53.field952 : class26.field379;
                            int var72 = class239.field4372[var6];
                            int var73 = class239.field4372[var6 + 1];
                            class223.method1585(var71, var72, -112, var73);
                            continue;
                        }
                        if (var461 == 3110) {
                            class62.field1155++;
                            var6--;
                            int var74 = class239.field4372[var6];
                            class48.field692.method301(114, -104);
                            class48.field692.method943((byte) 127, var74);
                            continue;
                        }
                    } else if (var461 < 3300) {
                        if (var461 == 3200) {
                            var6 -= 3;
                            class255.method1768(-122, class239.field4372[var6 + 2], class239.field4372[var6 + 1], class239.field4372[var6]);
                            continue;
                        }
                        if (var461 == 3201) {
                            var6--;
                            class211.method1527(class239.field4372[var6], -114);
                            continue;
                        }
                        if (var461 == 3202) {
                            var6 -= 2;
                            class268.method1843(class239.field4372[var6], class239.field4372[var6 + 1], 99);
                            continue;
                        }
                    } else if (var461 < 3400) {
                        if (var461 == 3300) {
                            class239.field4372[var6++] = class180.field3272;
                            continue;
                        }
                        if (var461 == 3301) {
                            var6 -= 2;
                            int var377 = class239.field4372[var6];
                            int var378 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class57.method351(var377, (byte) -109, var378);
                            continue;
                        }
                        if (var461 == 3302) {
                            var6 -= 2;
                            int var379 = class239.field4372[var6];
                            int var380 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class228.method1626(-2, var380, var379);
                            continue;
                        }
                        if (var461 == 3303) {
                            var6 -= 2;
                            int var381 = class239.field4372[var6];
                            int var382 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class192.method1392((byte) 74, var382, var381);
                            continue;
                        }
                        if (var461 == 3304) {
                            var6--;
                            int var383 = class239.field4372[var6];
                            class239.field4372[var6++] = class242.method1721(0, var383).field56;
                            continue;
                        }
                        if (var461 == 3305) {
                            var6--;
                            int var384 = class239.field4372[var6];
                            class239.field4372[var6++] = class179.field3253[var384];
                            continue;
                        }
                        if (var461 == 3306) {
                            var6--;
                            int var385 = class239.field4372[var6];
                            class239.field4372[var6++] = class208.field3791[var385];
                            continue;
                        }
                        if (var461 == 3307) {
                            var6--;
                            int var386 = class239.field4372[var6];
                            class239.field4372[var6++] = class139.field2607[var386];
                            continue;
                        }
                        if (var461 == 3308) {
                            int var387 = class52.field927;
                            int var388 = (class156.field2904.field3985 >> 7) + class242.field4441;
                            int var389 = (class156.field2904.field4005 >> 7) + class220.field3962;
                            class239.field4372[var6++] = (var387 << 28) + var389 + (var388 << 14);
                            continue;
                        }
                        if (var461 == 3309) {
                            var6--;
                            int var390 = class239.field4372[var6];
                            class239.field4372[var6++] = class69.method443(var390, 268431883) >> 14;
                            continue;
                        }
                        if (var461 == 3310) {
                            var6--;
                            int var391 = class239.field4372[var6];
                            class239.field4372[var6++] = var391 >> 28;
                            continue;
                        }
                        if (var461 == 3311) {
                            var6--;
                            int var392 = class239.field4372[var6];
                            class239.field4372[var6++] = class69.method443(var392, 16383);
                            continue;
                        }
                        if (var461 == 3312) {
                            class239.field4372[var6++] = class63.field1223 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3313) {
                            var6 -= 2;
                            int var393 = class239.field4372[var6] + 32768;
                            int var394 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class57.method351(var393, (byte) -69, var394);
                            continue;
                        }
                        if (var461 == 3314) {
                            var6 -= 2;
                            int var395 = class239.field4372[var6 + 1];
                            int var396 = class239.field4372[var6] + 32768;
                            class239.field4372[var6++] = class228.method1626(-2, var395, var396);
                            continue;
                        }
                        if (var461 == 3315) {
                            var6 -= 2;
                            int var397 = class239.field4372[var6] + 32768;
                            int var398 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class192.method1392((byte) 74, var398, var397);
                            continue;
                        }
                        if (var461 == 3316) {
                            if (class245.field4487 >= 2) {
                                class239.field4372[var6++] = class245.field4487;
                            } else {
                                class239.field4372[var6++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3317) {
                            class239.field4372[var6++] = class208.field3789;
                            continue;
                        }
                        if (var461 == 3318) {
                            class239.field4372[var6++] = class204.field3666;
                            continue;
                        }
                        if (var461 == 3321) {
                            class239.field4372[var6++] = class208.field3783;
                            continue;
                        }
                        if (var461 == 3322) {
                            class239.field4372[var6++] = class28.field408;
                            continue;
                        }
                        if (var461 == 3323) {
                            if (class131.field2432 >= 5 && class131.field2432 <= 9) {
                                class239.field4372[var6++] = 1;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3324) {
                            if (class131.field2432 >= 5 && class131.field2432 <= 9) {
                                class239.field4372[var6++] = class131.field2432;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3325) {
                            if (class43.field613 <= 0) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = 1;
                            }
                            continue;
                        }
                        if (var461 == 3326) {
                            class239.field4372[var6++] = class156.field2904.field2076;
                            continue;
                        }
                        if (var461 == 3327) {
                            class239.field4372[var6++] = class156.field2904.field2036.field1736 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3328) {
                            class239.field4372[var6++] = class108.field2060;
                            continue;
                        }
                        if (var461 == 3329) {
                            class239.field4372[var6++] = class182.field3313;
                            continue;
                        }
                        if (var461 == 3330) {
                            var6--;
                            int var399 = class239.field4372[var6];
                            class239.field4372[var6++] = class95.method696(false, var399);
                            continue;
                        }
                        if (var461 == 3331) {
                            var6 -= 2;
                            int var400 = class239.field4372[var6 + 1];
                            int var401 = class239.field4372[var6];
                            class239.field4372[var6++] = class76.method551(var400, false, var401, -10205);
                            continue;
                        }
                        if (var461 == 3332) {
                            var6 -= 2;
                            int var402 = class239.field4372[var6];
                            int var403 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class76.method551(var403, true, var402, -10205);
                            continue;
                        }
                        if (var461 == 3333) {
                            class239.field4372[var6++] = class16.field215;
                            continue;
                        }
                    } else if (var461 < 3500) {
                        if (var461 == 3400) {
                            var6 -= 2;
                            int var360 = class239.field4372[var6];
                            int var361 = class239.field4372[var6 + 1];
                            class235 var362 = class22.method126(var360, (byte) -38);
                            class233.field4263[var9++] = var362.method1662(41, var361);
                            continue;
                        }
                        if (var461 == 3408) {
                            var6 -= 4;
                            int var363 = class239.field4372[var6 + 1];
                            int var364 = class239.field4372[var6];
                            int var365 = class239.field4372[var6 + 2];
                            int var366 = class239.field4372[var6 + 3];
                            class235 var367 = class22.method126(var365, (byte) -38);
                            if (var367.field4283 == var364 && var367.field4276 == var363) {
                                if (var363 == 115) {
                                    class233.field4263[var9++] = var367.method1662(103, var366);
                                } else {
                                    class239.field4372[var6++] = var367.method1658((byte) -28, var366);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var461 == 3409) {
                            var6 -= 3;
                            int var368 = class239.field4372[var6];
                            int var369 = class239.field4372[var6 + 1];
                            int var370 = class239.field4372[var6 + 2];
                            if (var369 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class235 var371 = class22.method126(var369, (byte) -38);
                            if (var371.field4276 != var368) {
                                throw new RuntimeException("C3409-1");
                            }
                            class239.field4372[var6++] = var371.method1666(var370, (byte) 119) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3410) {
                            var6--;
                            int var372 = class239.field4372[var6];
                            var9--;
                            class69 var373 = class233.field4263[var9];
                            if (var372 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class235 var374 = class22.method126(var372, (byte) -38);
                            if (var374.field4276 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class239.field4372[var6++] = var374.method1665(var373, true) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3411) {
                            var6--;
                            int var375 = class239.field4372[var6];
                            class235 var376 = class22.method126(var375, (byte) -38);
                            class239.field4372[var6++] = var376.field4279.method762(false);
                            continue;
                        }
                    } else if (var461 < 3700) {
                        if (var461 == 3600) {
                            if (class111.field2112 == 0) {
                                class239.field4372[var6++] = -2;
                            } else if (class111.field2112 == 1) {
                                class239.field4372[var6++] = -1;
                            } else {
                                class239.field4372[var6++] = class273.field4828;
                            }
                            continue;
                        }
                        if (var461 == 3601) {
                            var6--;
                            int var75 = class239.field4372[var6];
                            if (class111.field2112 == 2 && class273.field4828 > var75) {
                                class233.field4263[var9++] = class103.field1915[var75];
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 3602) {
                            var6--;
                            int var76 = class239.field4372[var6];
                            if (class111.field2112 == 2 && var76 < class273.field4828) {
                                class239.field4372[var6++] = class112.field2163[var76];
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3603) {
                            var6--;
                            int var77 = class239.field4372[var6];
                            if (class111.field2112 == 2 && var77 < class273.field4828) {
                                class239.field4372[var6++] = class22.field307[var77];
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3604) {
                            var9--;
                            class69 var78 = class233.field4263[var9];
                            var6--;
                            int var79 = class239.field4372[var6];
                            class91.method649(var78, var79, 0);
                            continue;
                        }
                        if (var461 == 3605) {
                            var9--;
                            class69 var80 = class233.field4263[var9];
                            class228.method1628((byte) 127, var80.method473((byte) 67));
                            continue;
                        }
                        if (var461 == 3606) {
                            var9--;
                            class69 var81 = class233.field4263[var9];
                            class62.method406((byte) -128, var81.method473((byte) 86));
                            continue;
                        }
                        if (var461 == 3607) {
                            var9--;
                            class69 var82 = class233.field4263[var9];
                            class105.method794(true, var82.method473((byte) 113));
                            continue;
                        }
                        if (var461 == 3608) {
                            var9--;
                            class69 var83 = class233.field4263[var9];
                            class124.method892(var83.method473((byte) 60), -114);
                            continue;
                        }
                        if (var461 == 3609) {
                            var9--;
                            class69 var84 = class233.field4263[var9];
                            if (var84.method489(true, class255.field4593) || var84.method489(true, class161.field2991)) {
                                var84 = var84.method478(-127, 7);
                            }
                            class239.field4372[var6++] = class128.method911(-3383, var84) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3610) {
                            var6--;
                            int var85 = class239.field4372[var6];
                            if (class111.field2112 == 2 && class273.field4828 > var85) {
                                class233.field4263[var9++] = class62.field1202[var85];
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 3611) {
                            if (class233.field4255 == null) {
                                class233.field4263[var9++] = class233.field4253;
                            } else {
                                class233.field4263[var9++] = class233.field4255.method452(122);
                            }
                            continue;
                        }
                        if (var461 == 3612) {
                            if (class233.field4255 == null) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = class216.field3910;
                            }
                            continue;
                        }
                        if (var461 == 3613) {
                            var6--;
                            int var86 = class239.field4372[var6];
                            if (class233.field4255 != null && var86 < class216.field3910) {
                                class233.field4263[var9++] = class273.field4833[var86].field363.method452(122);
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 3614) {
                            var6--;
                            int var87 = class239.field4372[var6];
                            if (class233.field4255 != null && class216.field3910 > var87) {
                                class239.field4372[var6++] = class273.field4833[var87].field368;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3615) {
                            var6--;
                            int var88 = class239.field4372[var6];
                            if (class233.field4255 != null && var88 < class216.field3910) {
                                class239.field4372[var6++] = class273.field4833[var88].field371;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3616) {
                            class239.field4372[var6++] = class245.field4491;
                            continue;
                        }
                        if (var461 == 3617) {
                            var9--;
                            class69 var89 = class233.field4263[var9];
                            class135.method1007(false, var89);
                            continue;
                        }
                        if (var461 == 3618) {
                            class239.field4372[var6++] = class79.field1527;
                            continue;
                        }
                        if (var461 == 3619) {
                            var9--;
                            class69 var90 = class233.field4263[var9];
                            class217.method1556((byte) -4, var90.method473((byte) 107));
                            continue;
                        }
                        if (var461 == 3620) {
                            class114.method844((byte) -124);
                            continue;
                        }
                        if (var461 == 3621) {
                            if (class111.field2112 == 0) {
                                class239.field4372[var6++] = -1;
                            } else {
                                class239.field4372[var6++] = class149.field2778;
                            }
                            continue;
                        }
                        if (var461 == 3622) {
                            var6--;
                            int var91 = class239.field4372[var6];
                            if (class111.field2112 != 0 && class149.field2778 > var91) {
                                class233.field4263[var9++] = class101.method749(class159.field2959[var91], 25801).method452(122);
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 3623) {
                            var9--;
                            class69 var92 = class233.field4263[var9];
                            if (var92.method489(true, class255.field4593) || var92.method489(true, class161.field2991)) {
                                var92 = var92.method478(-73, 7);
                            }
                            class239.field4372[var6++] = class180.method1312(var92, 0) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3624) {
                            var6--;
                            int var93 = class239.field4372[var6];
                            if (class273.field4833 != null && var93 < class216.field3910 && class273.field4833[var93].field363.method446(class156.field2904.field2045, -127)) {
                                class239.field4372[var6++] = 1;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3625) {
                            if (class222.field4038 == null) {
                                class233.field4263[var9++] = class233.field4253;
                            } else {
                                class233.field4263[var9++] = class222.field4038.method452(122);
                            }
                            continue;
                        }
                        if (var461 == 3626) {
                            var6--;
                            int var94 = class239.field4372[var6];
                            if (class233.field4255 != null && class216.field3910 > var94) {
                                class233.field4263[var9++] = class273.field4833[var94].field375;
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 3627) {
                            var6--;
                            int var95 = class239.field4372[var6];
                            if (class111.field2112 == 2 && var95 >= 0 && var95 < class273.field4828) {
                                class239.field4372[var6++] = class93.field1737[var95] ? 1 : 0;
                                continue;
                            }
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 3628) {
                            var9--;
                            class69 var96 = class233.field4263[var9];
                            if (var96.method489(true, class255.field4593) || var96.method489(true, class161.field2991)) {
                                var96 = var96.method478(-114, 7);
                            }
                            class239.field4372[var6++] = class80.method567(var96, (byte) -96);
                            continue;
                        }
                    } else if (var461 < 4000) {
                        if (var461 == 3903) {
                            var6--;
                            int var346 = class239.field4372[var6];
                            class239.field4372[var6++] = class133.field2474[var346].method856(-2);
                            continue;
                        }
                        if (var461 == 3904) {
                            var6--;
                            int var347 = class239.field4372[var6];
                            class239.field4372[var6++] = class133.field2474[var347].field2214;
                            continue;
                        }
                        if (var461 == 3905) {
                            var6--;
                            int var348 = class239.field4372[var6];
                            class239.field4372[var6++] = class133.field2474[var348].field2220;
                            continue;
                        }
                        if (var461 == 3906) {
                            var6--;
                            int var349 = class239.field4372[var6];
                            class239.field4372[var6++] = class133.field2474[var349].field2208;
                            continue;
                        }
                        if (var461 == 3907) {
                            var6--;
                            int var350 = class239.field4372[var6];
                            class239.field4372[var6++] = class133.field2474[var350].field2210;
                            continue;
                        }
                        if (var461 == 3908) {
                            var6--;
                            int var351 = class239.field4372[var6];
                            class239.field4372[var6++] = class133.field2474[var351].field2221;
                            continue;
                        }
                        if (var461 == 3910) {
                            var6--;
                            int var352 = class239.field4372[var6];
                            int var353 = class133.field2474[var352].method859((byte) -117);
                            class239.field4372[var6++] = var353 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3911) {
                            var6--;
                            int var354 = class239.field4372[var6];
                            int var355 = class133.field2474[var354].method859((byte) -109);
                            class239.field4372[var6++] = var355 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3912) {
                            var6--;
                            int var356 = class239.field4372[var6];
                            int var357 = class133.field2474[var356].method859((byte) 2);
                            class239.field4372[var6++] = var357 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3913) {
                            var6--;
                            int var358 = class239.field4372[var6];
                            int var359 = class133.field2474[var358].method859((byte) -113);
                            class239.field4372[var6++] = var359 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var461 < 4100) {
                        if (var461 == 4000) {
                            var6 -= 2;
                            int var301 = class239.field4372[var6 + 1];
                            int var302 = class239.field4372[var6];
                            class239.field4372[var6++] = var301 + var302;
                            continue;
                        }
                        if (var461 == 4001) {
                            var6 -= 2;
                            int var303 = class239.field4372[var6 + 1];
                            int var304 = class239.field4372[var6];
                            class239.field4372[var6++] = var304 - var303;
                            continue;
                        }
                        if (var461 == 4002) {
                            var6 -= 2;
                            int var305 = class239.field4372[var6 + 1];
                            int var306 = class239.field4372[var6];
                            class239.field4372[var6++] = var305 * var306;
                            continue;
                        }
                        if (var461 == 4003) {
                            var6 -= 2;
                            int var307 = class239.field4372[var6 + 1];
                            int var308 = class239.field4372[var6];
                            class239.field4372[var6++] = var308 / var307;
                            continue;
                        }
                        if (var461 == 4004) {
                            var6--;
                            int var309 = class239.field4372[var6];
                            class239.field4372[var6++] = (int) (Math.random() * (double) var309);
                            continue;
                        }
                        if (var461 == 4005) {
                            var6--;
                            int var310 = class239.field4372[var6];
                            class239.field4372[var6++] = (int) (Math.random() * (double) (var310 + 1));
                            continue;
                        }
                        if (var461 == 4006) {
                            var6 -= 5;
                            int var311 = class239.field4372[var6];
                            int var312 = class239.field4372[var6 + 1];
                            int var313 = class239.field4372[var6 + 4];
                            int var314 = class239.field4372[var6 + 2];
                            int var315 = class239.field4372[var6 + 3];
                            class239.field4372[var6++] = var311 + ((var312 - var311) * (var313 - var314) / (var315 - var314));
                            continue;
                        }
                        if (var461 == 4007) {
                            var6 -= 2;
                            long var316 = (long) class239.field4372[var6 + 1];
                            long var318 = (long) class239.field4372[var6];
                            class239.field4372[var6++] = (int) (var316 * var318 / 100L + var318);
                            continue;
                        }
                        if (var461 == 4008) {
                            var6 -= 2;
                            int var320 = class239.field4372[var6];
                            int var321 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class230.method1644(var320, 0x1 << var321);
                            continue;
                        }
                        if (var461 == 4009) {
                            var6 -= 2;
                            int var322 = class239.field4372[var6];
                            int var323 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class69.method443(-(0x1 << var323) - 1, var322);
                            continue;
                        }
                        if (var461 == 4010) {
                            var6 -= 2;
                            int var324 = class239.field4372[var6 + 1];
                            int var325 = class239.field4372[var6];
                            class239.field4372[var6++] = class69.method443(0x1 << var324, var325) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var461 == 4011) {
                            var6 -= 2;
                            int var326 = class239.field4372[var6];
                            int var327 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = var326 % var327;
                            continue;
                        }
                        if (var461 == 4012) {
                            var6 -= 2;
                            int var328 = class239.field4372[var6];
                            int var329 = class239.field4372[var6 + 1];
                            if (var328 == 0) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = (int) Math.pow((double) var328, (double) var329);
                            }
                            continue;
                        }
                        if (var461 == 4013) {
                            var6 -= 2;
                            int var330 = class239.field4372[var6];
                            int var331 = class239.field4372[var6 + 1];
                            if (var330 == 0) {
                                class239.field4372[var6++] = 0;
                            } else if (var331 == 0) {
                                class239.field4372[var6++] = Integer.MAX_VALUE;
                            } else {
                                class239.field4372[var6++] = (int) Math.pow((double) var330, 1.0D / (double) var331);
                            }
                            continue;
                        }
                        if (var461 == 4014) {
                            var6 -= 2;
                            int var332 = class239.field4372[var6];
                            int var333 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class69.method443(var333, var332);
                            continue;
                        }
                        if (var461 == 4015) {
                            var6 -= 2;
                            int var334 = class239.field4372[var6];
                            int var335 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class230.method1644(var334, var335);
                            continue;
                        }
                        if (var461 == 4016) {
                            var6 -= 2;
                            int var336 = class239.field4372[var6 + 1];
                            int var337 = class239.field4372[var6];
                            class239.field4372[var6++] = var337 >= var336 ? var336 : var337;
                            continue;
                        }
                        if (var461 == 4017) {
                            var6 -= 2;
                            int var338 = class239.field4372[var6];
                            int var339 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = var338 > var339 ? var338 : var339;
                            continue;
                        }
                        if (var461 == 4018) {
                            var6 -= 3;
                            long var340 = (long) class239.field4372[var6];
                            long var342 = (long) class239.field4372[var6 + 1];
                            long var344 = (long) class239.field4372[var6 + 2];
                            class239.field4372[var6++] = (int) (var340 * var344 / var342);
                            continue;
                        }
                    } else if (var461 < 4200) {
                        if (var461 == 4100) {
                            var9--;
                            class69 var249 = class233.field4263[var9];
                            var6--;
                            int var250 = class239.field4372[var6];
                            class233.field4263[var9++] = class9.method42(-73, new class69[] { var249, class98.method727(-229, var250) });
                            continue;
                        }
                        if (var461 == 4101) {
                            var9 -= 2;
                            class69 var251 = class233.field4263[var9];
                            class69 var252 = class233.field4263[var9 + 1];
                            class233.field4263[var9++] = class9.method42(-84, new class69[] { var251, var252 });
                            continue;
                        }
                        if (var461 == 4102) {
                            var9--;
                            class69 var253 = class233.field4263[var9];
                            var6--;
                            int var254 = class239.field4372[var6];
                            class233.field4263[var9++] = class9.method42(88, new class69[] { var253, class145.method1100(true, (byte) -56, var254) });
                            continue;
                        }
                        if (var461 == 4103) {
                            var9--;
                            class69 var255 = class233.field4263[var9];
                            class233.field4263[var9++] = var255.method470((byte) 37);
                            continue;
                        }
                        if (var461 == 4104) {
                            var6--;
                            int var256 = class239.field4372[var6];
                            long var257 = ((long) var256 + 11745L) * 86400000L;
                            class76.field1491.setTime(new Date(var257));
                            int var259 = class76.field1491.get(5);
                            int var260 = class76.field1491.get(2);
                            int var261 = class76.field1491.get(1);
                            class233.field4263[var9++] = class9.method42(116, new class69[] { class98.method727(-229, var259), class177.field3229, class240.field4394[var260], class177.field3229, class98.method727(-229, var261) });
                            continue;
                        }
                        if (var461 == 4105) {
                            var9 -= 2;
                            class69 var262 = class233.field4263[var9];
                            class69 var263 = class233.field4263[var9 + 1];
                            if (class156.field2904.field2036 != null && class156.field2904.field2036.field1736) {
                                class233.field4263[var9++] = var263;
                                continue;
                            }
                            class233.field4263[var9++] = var262;
                            continue;
                        }
                        if (var461 == 4106) {
                            var6--;
                            int var264 = class239.field4372[var6];
                            class233.field4263[var9++] = class98.method727(-229, var264);
                            continue;
                        }
                        if (var461 == 4107) {
                            var9 -= 2;
                            class239.field4372[var6++] = class233.field4263[var9].method445(class233.field4263[var9 + 1], 10);
                            continue;
                        }
                        if (var461 == 4108) {
                            var6 -= 2;
                            var9--;
                            class69 var265 = class233.field4263[var9];
                            int var266 = class239.field4372[var6 + 1];
                            int var267 = class239.field4372[var6];
                            byte[] var268 = class146.field2696.method590(0, var266, 0);
                            class30 var269 = new class30(var268);
                            var269.method1614(class128.field2398, (int[]) null);
                            class239.field4372[var6++] = var269.method1594(var265, var267);
                            continue;
                        }
                        if (var461 == 4109) {
                            var6 -= 2;
                            int var270 = class239.field4372[var6];
                            int var271 = class239.field4372[var6 + 1];
                            var9--;
                            class69 var272 = class233.field4263[var9];
                            byte[] var273 = class146.field2696.method590(0, var271, 0);
                            class30 var274 = new class30(var273);
                            var274.method1614(class128.field2398, (int[]) null);
                            class239.field4372[var6++] = var274.method1601(var272, var270);
                            continue;
                        }
                        if (var461 == 4110) {
                            var9 -= 2;
                            class69 var275 = class233.field4263[var9 + 1];
                            class69 var276 = class233.field4263[var9];
                            var6--;
                            if (class239.field4372[var6] == 1) {
                                class233.field4263[var9++] = var276;
                            } else {
                                class233.field4263[var9++] = var275;
                            }
                            continue;
                        }
                        if (var461 == 4111) {
                            var9--;
                            class69 var277 = class233.field4263[var9];
                            class233.field4263[var9++] = class225.method1611(var277);
                            continue;
                        }
                        if (var461 == 4112) {
                            var9--;
                            class69 var278 = class233.field4263[var9];
                            var6--;
                            int var279 = class239.field4372[var6];
                            if (var279 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class233.field4263[var9++] = var278.method483((byte) -124, var279);
                            continue;
                        }
                        if (var461 == 4113) {
                            var6--;
                            int var280 = class239.field4372[var6];
                            class239.field4372[var6++] = class203.method1472(-24587, var280) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4114) {
                            var6--;
                            int var281 = class239.field4372[var6];
                            class239.field4372[var6++] = class3.method10(var281, (byte) 125) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4115) {
                            var6--;
                            int var282 = class239.field4372[var6];
                            class239.field4372[var6++] = class113.method843(4, var282) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4116) {
                            var6--;
                            int var283 = class239.field4372[var6];
                            class239.field4372[var6++] = class265.method1834(var283, false) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4117) {
                            var9--;
                            class69 var284 = class233.field4263[var9];
                            if (var284 == null) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = var284.method441((byte) 73);
                            }
                            continue;
                        }
                        if (var461 == 4118) {
                            var6 -= 2;
                            int var285 = class239.field4372[var6];
                            var9--;
                            class69 var286 = class233.field4263[var9];
                            int var287 = class239.field4372[var6 + 1];
                            class233.field4263[var9++] = var286.method485(var287, var285, (byte) -20);
                            continue;
                        }
                        if (var461 == 4119) {
                            var9--;
                            class69 var288 = class233.field4263[var9];
                            class69 var289 = class103.method758(var288.method441((byte) 73), true);
                            boolean var290 = false;
                            for (int var291 = 0; var291 < var288.method441((byte) 73); var291++) {
                                int var292 = var288.method490(83, var291);
                                if (var292 == 60) {
                                    var290 = true;
                                } else if (var292 == 62) {
                                    var290 = false;
                                } else if (!var290) {
                                    var289.method454(var292, -104);
                                }
                            }
                            var289.method448(1);
                            class233.field4263[var9++] = var289;
                            continue;
                        }
                        if (var461 == 4120) {
                            var6 -= 2;
                            int var293 = class239.field4372[var6];
                            var9--;
                            class69 var294 = class233.field4263[var9];
                            int var295 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = var294.method449((byte) -118, var295, var293);
                            continue;
                        }
                        if (var461 == 4121) {
                            var9 -= 2;
                            var6--;
                            int var296 = class239.field4372[var6];
                            class69 var297 = class233.field4263[var9];
                            class69 var298 = class233.field4263[var9 + 1];
                            class239.field4372[var6++] = var297.method471(118, var296, var298);
                            continue;
                        }
                        if (var461 == 4122) {
                            var6--;
                            int var299 = class239.field4372[var6];
                            class239.field4372[var6++] = class220.method1561(-11124, var299);
                            continue;
                        }
                        if (var461 == 4123) {
                            var6--;
                            int var300 = class239.field4372[var6];
                            class239.field4372[var6++] = class211.method1525(var300, -115);
                            continue;
                        }
                    } else if (var461 < 4300) {
                        if (var461 == 4200) {
                            var6--;
                            int var97 = class239.field4372[var6];
                            class233.field4263[var9++] = class83.method585(var97, -1).field3741;
                            continue;
                        }
                        if (var461 == 4201) {
                            var6 -= 2;
                            int var98 = class239.field4372[var6];
                            int var99 = class239.field4372[var6 + 1];
                            class205 var100 = class83.method585(var98, -1);
                            if (var99 >= 1 && var99 <= 5 && var100.field3752[var99 - 1] != null) {
                                class233.field4263[var9++] = var100.field3752[var99 - 1];
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 4202) {
                            var6 -= 2;
                            int var101 = class239.field4372[var6];
                            int var102 = class239.field4372[var6 + 1];
                            class205 var103 = class83.method585(var101, -1);
                            if (var102 >= 1 && var102 <= 5 && var103.field3718[var102 - 1] != null) {
                                class233.field4263[var9++] = var103.field3718[var102 - 1];
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                        if (var461 == 4203) {
                            var6--;
                            int var104 = class239.field4372[var6];
                            class239.field4372[var6++] = class83.method585(var104, -1).field3710;
                            continue;
                        }
                        if (var461 == 4204) {
                            var6--;
                            int var105 = class239.field4372[var6];
                            class239.field4372[var6++] = class83.method585(var105, -1).field3682 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4205) {
                            var6--;
                            int var106 = class239.field4372[var6];
                            class205 var107 = class83.method585(var106, -1);
                            if (var107.field3703 == -1 && var107.field3684 >= 0) {
                                class239.field4372[var6++] = var107.field3684;
                                continue;
                            }
                            class239.field4372[var6++] = var106;
                            continue;
                        }
                        if (var461 == 4206) {
                            var6--;
                            int var108 = class239.field4372[var6];
                            class205 var109 = class83.method585(var108, -1);
                            if (var109.field3703 >= 0 && var109.field3684 >= 0) {
                                class239.field4372[var6++] = var109.field3684;
                                continue;
                            }
                            class239.field4372[var6++] = var108;
                            continue;
                        }
                        if (var461 == 4207) {
                            var6--;
                            int var110 = class239.field4372[var6];
                            class239.field4372[var6++] = class83.method585(var110, -1).field3687 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4208) {
                            var6 -= 2;
                            int var111 = class239.field4372[var6];
                            int var112 = class239.field4372[var6 + 1];
                            class257 var113 = class99.method737(var112, (byte) 101);
                            if (var113.method1775(21824)) {
                                class233.field4263[var9++] = class83.method585(var111, -1).method1486(120, var112, var113.field4609);
                            } else {
                                class239.field4372[var6++] = class83.method585(var111, -1).method1493(var112, var113.field4616, (byte) -105);
                            }
                            continue;
                        }
                        if (var461 == 4210) {
                            var6--;
                            int var114 = class239.field4372[var6];
                            var9--;
                            class69 var115 = class233.field4263[var9];
                            class248.method1750(var114 == 1, -21577, var115);
                            class239.field4372[var6++] = client.field2826;
                            continue;
                        }
                        if (var461 == 4211) {
                            if (class141.field2641 != null && class217.field3923 < client.field2826) {
                                class239.field4372[var6++] = class69.method443(65535, class141.field2641[class217.field3923++]);
                                continue;
                            }
                            class239.field4372[var6++] = -1;
                            continue;
                        }
                        if (var461 == 4212) {
                            class217.field3923 = 0;
                            continue;
                        }
                    } else if (var461 < 4400) {
                        if (var461 == 4300) {
                            var6 -= 2;
                            int var239 = class239.field4372[var6];
                            int var240 = class239.field4372[var6 + 1];
                            class257 var241 = class99.method737(var240, (byte) 72);
                            if (var241.method1775(21824)) {
                                class233.field4263[var9++] = class62.method386((byte) 95, var239).method1354((byte) 110, var240, var241.field4609);
                            } else {
                                class239.field4372[var6++] = class62.method386((byte) 95, var239).method1349((byte) 32, var241.field4616, var240);
                            }
                            continue;
                        }
                        if (var461 == 4301) {
                            var6--;
                            int var242 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var242).field3353;
                            continue;
                        }
                        if (var461 == 4302) {
                            var6--;
                            int var243 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var243).field3401;
                            continue;
                        }
                        if (var461 == 4303) {
                            var6--;
                            int var244 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var244).field3350;
                            continue;
                        }
                        if (var461 == 4304) {
                            var6--;
                            int var245 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var245).field3361;
                            continue;
                        }
                        if (var461 == 4305) {
                            var6--;
                            int var246 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var246).field3383;
                            continue;
                        }
                        if (var461 == 4306) {
                            var6--;
                            int var247 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var247).field3408;
                            continue;
                        }
                        if (var461 == 4307) {
                            var6--;
                            int var248 = class239.field4372[var6];
                            class239.field4372[var6++] = class62.method386((byte) 95, var248).field3374;
                            continue;
                        }
                    } else if (var461 < 4500) {
                        if (var461 == 4400) {
                            var6 -= 2;
                            int var116 = class239.field4372[var6];
                            int var117 = class239.field4372[var6 + 1];
                            class257 var118 = class99.method737(var117, (byte) 105);
                            if (var118.method1775(21824)) {
                                class233.field4263[var9++] = class145.method1102(var116, 0).method69(-22, var117, var118.field4609);
                            } else {
                                class239.field4372[var6++] = class145.method1102(var116, 0).method68(var118.field4616, -18406, var117);
                            }
                            continue;
                        }
                    } else if (var461 < 4600) {
                        if (var461 == 4500) {
                            var6 -= 2;
                            int var119 = class239.field4372[var6];
                            int var120 = class239.field4372[var6 + 1];
                            class257 var121 = class99.method737(var120, (byte) 95);
                            if (var121.method1775(21824)) {
                                class233.field4263[var9++] = class98.method721(var119, false).method1366(var120, var121.field4609, 99);
                            } else {
                                class239.field4372[var6++] = class98.method721(var119, false).method1372(var120, 4, var121.field4616);
                            }
                            continue;
                        }
                    } else if (var461 < 5100) {
                        if (var461 == 5000) {
                            class239.field4372[var6++] = class126.field2319;
                            continue;
                        }
                        if (var461 == 5001) {
                            class153.field2845++;
                            var6 -= 3;
                            class126.field2319 = class239.field4372[var6];
                            class112.field2154 = class239.field4372[var6 + 1];
                            class72.field1396 = class239.field4372[var6 + 2];
                            class48.field692.method301(247, -104);
                            class48.field692.method933(class126.field2319, -20946);
                            class48.field692.method933(class112.field2154, -20946);
                            class48.field692.method933(class72.field1396, -20946);
                            continue;
                        }
                        if (var461 == 5002) {
                            class19.field248++;
                            var6 -= 2;
                            var9--;
                            class69 var176 = class233.field4263[var9];
                            int var177 = class239.field4372[var6 + 1];
                            int var178 = class239.field4372[var6];
                            class48.field692.method301(40, -104);
                            class48.field692.method918(var176.method473((byte) 64), 18820);
                            class48.field692.method933(var178 - 1, -20946);
                            class48.field692.method933(var177, -20946);
                            continue;
                        }
                        if (var461 == 5003) {
                            class69 var179 = null;
                            var6--;
                            int var180 = class239.field4372[var6];
                            if (var180 < 100) {
                                var179 = class228.field4160[var180];
                            }
                            if (var179 == null) {
                                var179 = class233.field4253;
                            }
                            class233.field4263[var9++] = var179;
                            continue;
                        }
                        if (var461 == 5004) {
                            var6--;
                            int var181 = class239.field4372[var6];
                            int var182 = -1;
                            if (var181 < 100 && class228.field4160[var181] != null) {
                                var182 = class138.field2577[var181];
                            }
                            class239.field4372[var6++] = var182;
                            continue;
                        }
                        if (var461 == 5005) {
                            class239.field4372[var6++] = class112.field2154;
                            continue;
                        }
                        if (var461 == 5008) {
                            var9--;
                            class69 var183 = class233.field4263[var9];
                            if (var183.method489(true, class129.field2407)) {
                                class71.method505(19, var183);
                                continue;
                            }
                            if (class245.field4487 == 0 && (class108.field2060 == 1 || class182.field3313 == 1)) {
                                continue;
                            }
                            class69 var184 = var183.method470((byte) 37);
                            byte var185 = 0;
                            byte var186 = 0;
                            class258.field4622++;
                            if (var184.method489(true, class233.field4262)) {
                                var186 = 0;
                                var183 = var183.method478(-79, class233.field4262.method441((byte) 73));
                            } else if (var184.method489(true, class16.field213)) {
                                var186 = 1;
                                var183 = var183.method478(-95, class16.field213.method441((byte) 73));
                            } else if (var184.method489(true, class171.field3131)) {
                                var186 = 2;
                                var183 = var183.method478(-84, class171.field3131.method441((byte) 73));
                            } else if (var184.method489(true, class38.field531)) {
                                var183 = var183.method478(-99, class38.field531.method441((byte) 73));
                                var186 = 3;
                            } else if (var184.method489(true, class41.field583)) {
                                var186 = 4;
                                var183 = var183.method478(-126, class41.field583.method441((byte) 73));
                            } else if (var184.method489(true, class222.field4051)) {
                                var186 = 5;
                                var183 = var183.method478(-104, class222.field4051.method441((byte) 73));
                            } else if (var184.method489(true, class236.field4297)) {
                                var183 = var183.method478(-76, class236.field4297.method441((byte) 73));
                                var186 = 6;
                            } else if (var184.method489(true, class246.field4493)) {
                                var186 = 7;
                                var183 = var183.method478(-69, class246.field4493.method441((byte) 73));
                            } else if (var184.method489(true, class98.field1858)) {
                                var186 = 8;
                                var183 = var183.method478(-88, class98.field1858.method441((byte) 73));
                            } else if (var184.method489(true, class239.field4387)) {
                                var183 = var183.method478(-123, class239.field4387.method441((byte) 73));
                                var186 = 9;
                            } else if (var184.method489(true, class136.field2551)) {
                                var183 = var183.method478(-81, class136.field2551.method441((byte) 73));
                                var186 = 10;
                            } else if (var184.method489(true, class142.field2654)) {
                                var183 = var183.method478(-94, class142.field2654.method441((byte) 73));
                                var186 = 11;
                            } else if (class165.field3051 != 0) {
                                if (var184.method489(true, class233.field4257)) {
                                    var183 = var183.method478(-123, class233.field4257.method441((byte) 73));
                                    var186 = 0;
                                } else if (var184.method489(true, class16.field212)) {
                                    var183 = var183.method478(-114, class16.field212.method441((byte) 73));
                                    var186 = 1;
                                } else if (var184.method489(true, class171.field3133)) {
                                    var183 = var183.method478(-95, class171.field3133.method441((byte) 73));
                                    var186 = 2;
                                } else if (var184.method489(true, class38.field529)) {
                                    var183 = var183.method478(-124, class38.field529.method441((byte) 73));
                                    var186 = 3;
                                } else if (var184.method489(true, class41.field584)) {
                                    var186 = 4;
                                    var183 = var183.method478(-83, class41.field584.method441((byte) 73));
                                } else if (var184.method489(true, class222.field4016)) {
                                    var186 = 5;
                                    var183 = var183.method478(-89, class222.field4016.method441((byte) 73));
                                } else if (var184.method489(true, class236.field4292)) {
                                    var186 = 6;
                                    var183 = var183.method478(-85, class236.field4292.method441((byte) 73));
                                } else if (var184.method489(true, class246.field4498)) {
                                    var183 = var183.method478(-97, class246.field4498.method441((byte) 73));
                                    var186 = 7;
                                } else if (var184.method489(true, class98.field1855)) {
                                    var183 = var183.method478(-75, class98.field1855.method441((byte) 73));
                                    var186 = 8;
                                } else if (var184.method489(true, class239.field4378)) {
                                    var186 = 9;
                                    var183 = var183.method478(-83, class239.field4378.method441((byte) 73));
                                } else if (var184.method489(true, class136.field2543)) {
                                    var183 = var183.method478(-117, class136.field2543.method441((byte) 73));
                                    var186 = 10;
                                } else if (var184.method489(true, class142.field2657)) {
                                    var186 = 11;
                                    var183 = var183.method478(-106, class142.field2657.method441((byte) 73));
                                }
                            }
                            class69 var187 = var183.method470((byte) 37);
                            if (var187.method489(true, class130.field2415)) {
                                var183 = var183.method478(-121, class130.field2415.method441((byte) 73));
                                var185 = 1;
                            } else if (var187.method489(true, class97.field1802)) {
                                var185 = 2;
                                var183 = var183.method478(-75, class97.field1802.method441((byte) 73));
                            } else if (var187.method489(true, class55.field988)) {
                                var183 = var183.method478(-94, class55.field988.method441((byte) 73));
                                var185 = 3;
                            } else if (var187.method489(true, class43.field623)) {
                                var183 = var183.method478(-91, class43.field623.method441((byte) 73));
                                var185 = 4;
                            } else if (var187.method489(true, class182.field3307)) {
                                var185 = 5;
                                var183 = var183.method478(-74, class182.field3307.method441((byte) 73));
                            } else if (class165.field3051 != 0) {
                                if (var187.method489(true, class130.field2418)) {
                                    var183 = var183.method478(-81, class130.field2418.method441((byte) 73));
                                    var185 = 1;
                                } else if (var187.method489(true, class97.field1812)) {
                                    var183 = var183.method478(-96, class97.field1812.method441((byte) 73));
                                    var185 = 2;
                                } else if (var187.method489(true, class55.field980)) {
                                    var183 = var183.method478(-96, class55.field980.method441((byte) 73));
                                    var185 = 3;
                                } else if (var187.method489(true, class43.field615)) {
                                    var185 = 4;
                                    var183 = var183.method478(-112, class43.field615.method441((byte) 73));
                                } else if (var187.method489(true, class182.field3303)) {
                                    var183 = var183.method478(-107, class182.field3303.method441((byte) 73));
                                    var185 = 5;
                                }
                            }
                            class48.field692.method301(93, -104);
                            class48.field692.method933(0, -20946);
                            int var188 = class48.field692.field2379;
                            class48.field692.method933(var186, -20946);
                            class48.field692.method933(var185, -20946);
                            class105.method798(var183, (byte) -111, class48.field692);
                            class48.field692.method941(2, class48.field692.field2379 - var188);
                            continue;
                        }
                        if (var461 == 5009) {
                            var9 -= 2;
                            class69 var189 = class233.field4263[var9];
                            class69 var190 = class233.field4263[var9 + 1];
                            if (class245.field4487 != 0 || class108.field2060 != 1 && class182.field3313 != 1) {
                                class251.field4547++;
                                class48.field692.method301(249, -104);
                                class48.field692.method933(0, -20946);
                                int var191 = class48.field692.field2379;
                                class48.field692.method918(var189.method473((byte) 50), 18820);
                                class105.method798(var190, (byte) -127, class48.field692);
                                class48.field692.method941(2, class48.field692.field2379 - var191);
                            }
                            continue;
                        }
                        if (var461 == 5010) {
                            class69 var192 = null;
                            var6--;
                            int var193 = class239.field4372[var6];
                            if (var193 < 100) {
                                var192 = class81.field1551[var193];
                            }
                            if (var192 == null) {
                                var192 = class233.field4253;
                            }
                            class233.field4263[var9++] = var192;
                            continue;
                        }
                        if (var461 == 5011) {
                            var6--;
                            int var194 = class239.field4372[var6];
                            class69 var195 = null;
                            if (var194 < 100) {
                                var195 = class149.field2770[var194];
                            }
                            if (var195 == null) {
                                var195 = class233.field4253;
                            }
                            class233.field4263[var9++] = var195;
                            continue;
                        }
                        if (var461 == 5012) {
                            var6--;
                            int var196 = class239.field4372[var6];
                            int var197 = -1;
                            if (var196 < 100) {
                                var197 = class41.field578[var196];
                            }
                            class239.field4372[var6++] = var197;
                            continue;
                        }
                        if (var461 == 5015) {
                            class69 var198;
                            if (class156.field2904 == null || class156.field2904.field2045 == null) {
                                var198 = class209.field3809;
                            } else {
                                var198 = class156.field2904.method816(1);
                            }
                            class233.field4263[var9++] = var198;
                            continue;
                        }
                        if (var461 == 5016) {
                            class239.field4372[var6++] = class72.field1396;
                            continue;
                        }
                        if (var461 == 5017) {
                            class239.field4372[var6++] = class32.field441;
                            continue;
                        }
                        if (var461 == 5050) {
                            var6--;
                            int var199 = class239.field4372[var6];
                            class233.field4263[var9++] = class88.method633((byte) 125, var199).field2297;
                            continue;
                        }
                        if (var461 == 5051) {
                            var6--;
                            int var200 = class239.field4372[var6];
                            class124 var201 = class88.method633((byte) 124, var200);
                            if (var201.field2305 == null) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = var201.field2305.length;
                            }
                            continue;
                        }
                        if (var461 == 5052) {
                            var6 -= 2;
                            int var202 = class239.field4372[var6];
                            int var203 = class239.field4372[var6 + 1];
                            class124 var204 = class88.method633((byte) 121, var202);
                            int var205 = var204.field2305[var203];
                            class239.field4372[var6++] = var205;
                            continue;
                        }
                        if (var461 == 5053) {
                            var6--;
                            int var206 = class239.field4372[var6];
                            class124 var207 = class88.method633((byte) 115, var206);
                            if (var207.field2301 == null) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = var207.field2301.length;
                            }
                            continue;
                        }
                        if (var461 == 5054) {
                            var6 -= 2;
                            int var208 = class239.field4372[var6];
                            int var209 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class88.method633((byte) 124, var208).field2301[var209];
                            continue;
                        }
                        if (var461 == 5055) {
                            var6--;
                            int var210 = class239.field4372[var6];
                            class233.field4263[var9++] = class80.method568(var210, -40).method1439(-25779);
                            continue;
                        }
                        if (var461 == 5056) {
                            var6--;
                            int var211 = class239.field4372[var6];
                            class196 var212 = class80.method568(var211, -40);
                            if (var212.field3564 == null) {
                                class239.field4372[var6++] = 0;
                            } else {
                                class239.field4372[var6++] = var212.field3564.length;
                            }
                            continue;
                        }
                        if (var461 == 5057) {
                            var6 -= 2;
                            int var213 = class239.field4372[var6];
                            int var214 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class80.method568(var213, -40).field3564[var214];
                            continue;
                        }
                        if (var461 == 5058) {
                            class263.field4693 = new class27();
                            var6--;
                            class263.field4693.field390 = class239.field4372[var6];
                            class263.field4693.field387 = class80.method568(class263.field4693.field390, -40);
                            class263.field4693.field384 = new int[class263.field4693.field387.method1431(-29251)];
                            continue;
                        }
                        if (var461 == 5059) {
                            class241.field4430++;
                            class48.field692.method301(59, -104);
                            class48.field692.method933(0, -20946);
                            int var215 = class48.field692.field2379;
                            class48.field692.method933(0, -20946);
                            class48.field692.method943((byte) 127, class263.field4693.field390);
                            class263.field4693.field387.method1435(89, class48.field692, class263.field4693.field384);
                            class48.field692.method941(2, class48.field692.field2379 - var215);
                            continue;
                        }
                        if (var461 == 5060) {
                            class140.field2619++;
                            var9--;
                            class69 var216 = class233.field4263[var9];
                            class48.field692.method301(147, -104);
                            class48.field692.method933(0, -20946);
                            int var217 = class48.field692.field2379;
                            class48.field692.method918(var216.method473((byte) 95), 18820);
                            class48.field692.method943((byte) 127, class263.field4693.field390);
                            class263.field4693.field387.method1435(98, class48.field692, class263.field4693.field384);
                            class48.field692.method941(2, class48.field692.field2379 - var217);
                            continue;
                        }
                        if (var461 == 5061) {
                            class241.field4430++;
                            class48.field692.method301(59, -104);
                            class48.field692.method933(0, -20946);
                            int var218 = class48.field692.field2379;
                            class48.field692.method933(1, -20946);
                            class48.field692.method943((byte) 127, class263.field4693.field390);
                            class263.field4693.field387.method1435(83, class48.field692, class263.field4693.field384);
                            class48.field692.method941(2, class48.field692.field2379 - var218);
                            continue;
                        }
                        if (var461 == 5062) {
                            var6 -= 2;
                            int var219 = class239.field4372[var6];
                            int var220 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class88.method633((byte) 123, var219).field2303[var220];
                            continue;
                        }
                        if (var461 == 5063) {
                            var6 -= 2;
                            int var221 = class239.field4372[var6];
                            int var222 = class239.field4372[var6 + 1];
                            class239.field4372[var6++] = class88.method633((byte) 118, var221).field2300[var222];
                            continue;
                        }
                        if (var461 == 5064) {
                            var6 -= 2;
                            int var223 = class239.field4372[var6];
                            int var224 = class239.field4372[var6 + 1];
                            if (var224 == -1) {
                                class239.field4372[var6++] = -1;
                            } else {
                                class239.field4372[var6++] = class88.method633((byte) 119, var223).method895(var224, 2529);
                            }
                            continue;
                        }
                        if (var461 == 5065) {
                            var6 -= 2;
                            int var225 = class239.field4372[var6 + 1];
                            int var226 = class239.field4372[var6];
                            if (var225 == -1) {
                                class239.field4372[var6++] = -1;
                            } else {
                                class239.field4372[var6++] = class88.method633((byte) 114, var226).method889(var225, 127);
                            }
                            continue;
                        }
                        if (var461 == 5066) {
                            var6--;
                            int var227 = class239.field4372[var6];
                            class239.field4372[var6++] = class80.method568(var227, -40).method1431(-29251);
                            continue;
                        }
                        if (var461 == 5067) {
                            var6 -= 2;
                            int var228 = class239.field4372[var6];
                            int var229 = class239.field4372[var6 + 1];
                            int var230 = class80.method568(var228, -40).method1438(1, var229);
                            class239.field4372[var6++] = var230;
                            continue;
                        }
                        if (var461 == 5068) {
                            var6 -= 2;
                            int var231 = class239.field4372[var6];
                            int var232 = class239.field4372[var6 + 1];
                            class263.field4693.field384[var231] = var232;
                            continue;
                        }
                        if (var461 == 5069) {
                            var6 -= 2;
                            int var233 = class239.field4372[var6];
                            int var234 = class239.field4372[var6 + 1];
                            class263.field4693.field384[var233] = var234;
                            continue;
                        }
                        if (var461 == 5070) {
                            var6 -= 3;
                            int var235 = class239.field4372[var6];
                            int var236 = class239.field4372[var6 + 1];
                            int var237 = class239.field4372[var6 + 2];
                            class196 var238 = class80.method568(var235, -40);
                            if (var238.method1438(1, var236) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class239.field4372[var6++] = var238.method1432(-1, var236, var237);
                            continue;
                        }
                    } else if (var461 < 5200) {
                        if (var461 == 5100) {
                            if (class261.field4656[86]) {
                                class239.field4372[var6++] = 1;
                            } else {
                                class239.field4372[var6++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 5101) {
                            if (class261.field4656[82]) {
                                class239.field4372[var6++] = 1;
                            } else {
                                class239.field4372[var6++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 5102) {
                            if (class261.field4656[81]) {
                                class239.field4372[var6++] = 1;
                            } else {
                                class239.field4372[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var461 < 5300) {
                        if (var461 == 5200) {
                            var6--;
                            class38.method207(class239.field4372[var6], (byte) -109);
                            continue;
                        }
                        if (var461 == 5201) {
                            class239.field4372[var6++] = class224.method1591(50);
                            continue;
                        }
                        if (var461 == 5202) {
                            var6--;
                            class271.method1859((byte) 123, class239.field4372[var6]);
                            continue;
                        }
                        if (var461 == 5203) {
                            var9--;
                            class91.method645(class233.field4263[var9], (byte) 115);
                            continue;
                        }
                        if (var461 == 5204) {
                            class233.field4263[var9 - 1] = class161.method1204(class233.field4263[var9 - 1], (byte) -33);
                            continue;
                        }
                        if (var461 == 5205) {
                            var9--;
                            class258.method1779(class233.field4263[var9], -1);
                            continue;
                        }
                        if (var461 == 5206) {
                            var6--;
                            int var122 = class239.field4372[var6];
                            class49 var123 = class27.method155(-65, var122 >> 14 & 0x3FFF, var122 & 0x3FFF);
                            if (var123 == null) {
                                class233.field4263[var9++] = class233.field4253;
                            } else {
                                class233.field4263[var9++] = var123.field712;
                            }
                            continue;
                        }
                        if (var461 == 5207) {
                            var9--;
                            class49 var124 = class65.method422((byte) -104, class233.field4263[var9]);
                            if (var124 != null && var124.field719 != null) {
                                class233.field4263[var9++] = var124.field719;
                                continue;
                            }
                            class233.field4263[var9++] = class233.field4253;
                            continue;
                        }
                    } else if (var461 < 5400) {
                        if (var461 == 5306) {
                            class239.field4372[var6++] = class109.method819((byte) 72);
                            continue;
                        }
                    } else if (var461 < 5500) {
                        if (var461 == 5400) {
                            var9 -= 2;
                            class69 var155 = class233.field4263[var9];
                            class69 var156 = class233.field4263[var9 + 1];
                            class256.field4602++;
                            var6--;
                            int var157 = class239.field4372[var6];
                            class48.field692.method301(47, -104);
                            class48.field692.method933(class110.method825(-128, var155) + class110.method825(-123, var156) + 1, -20946);
                            class48.field692.method927(var155, (byte) 127);
                            class48.field692.method927(var156, (byte) 126);
                            class48.field692.method933(var157, -20946);
                            continue;
                        }
                        if (var461 == 5401) {
                            var6 -= 2;
                            class164.field3030[class239.field4372[var6]] = (short) class112.method835(class239.field4372[var6 + 1], 2047);
                            class221.method1569((byte) 125);
                            class209.method1513(-24661);
                            class153.method1159((byte) -19);
                            class123.method883(0);
                            class35.method188((byte) -118);
                            continue;
                        }
                        if (var461 == 5405) {
                            var6 -= 2;
                            int var158 = class239.field4372[var6];
                            int var159 = class239.field4372[var6 + 1];
                            if (var158 >= 0 && var158 < 2) {
                                class189.field3421[var158] = new int[var159 << 1][4];
                            }
                            continue;
                        }
                        if (var461 == 5406) {
                            var6 -= 7;
                            int var160 = class239.field4372[var6];
                            int var161 = class239.field4372[var6 + 2];
                            int var162 = class239.field4372[var6 + 3];
                            int var163 = class239.field4372[var6 + 4];
                            int var164 = class239.field4372[var6 + 1] << 1;
                            int var165 = class239.field4372[var6 + 6];
                            int var166 = class239.field4372[var6 + 5];
                            if (var160 >= 0 && var160 < 2 && class189.field3421[var160] != null && var164 >= 0 && class189.field3421[var160].length > var164) {
                                class189.field3421[var160][var164] = new int[] { class69.method443(var161 >> 14, 16383) * 128, var162, class69.method443(var161, 16383) * 128, var165 };
                                class189.field3421[var160][var164 + 1] = new int[] { class69.method443(16383, var163 >> 14) * 128, var166, class69.method443(16383, var163) * 128 };
                            }
                            continue;
                        }
                        if (var461 == 5407) {
                            var6--;
                            int var167 = class189.field3421[class239.field4372[var6]].length >> 1;
                            class239.field4372[var6++] = var167;
                            continue;
                        }
                        if (var461 == 5408) {
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 5409) {
                            class29.method164((byte) -121);
                            continue;
                        }
                        if (var461 == 5411) {
                            if (class10.field85 == null) {
                                class171.method1256(class63.method415(17694), 0, false);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var461 == 5419) {
                            class69 var168 = class233.field4253;
                            if (class191.field3458 != null) {
                                var168 = class116.method854(false, class191.field3458.field1665);
                                try {
                                    if (class191.field3458.field1666 != null) {
                                        byte[] var169 = ((String) class191.field3458.field1666).getBytes("ISO-8859-1");
                                        var168 = class38.method209(95, 0, var169.length, var169);
                                    }
                                } catch (UnsupportedEncodingException var458) {
                                }
                            }
                            class233.field4263[var9++] = var168;
                            continue;
                        }
                        if (var461 == 5420) {
                            class239.field4372[var6++] = class165.field3035 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 5421) {
                            var6--;
                            boolean var170 = class239.field4372[var6] == 1;
                            var9--;
                            class69 var171 = class233.field4263[var9];
                            class69 var172 = class9.method42(118, new class69[] { class63.method415(17694), var171 });
                            if (class10.field85 == null && (!var170 || class165.field3035 == 2 || !class42.field604.startsWith("win") || class248.field4526)) {
                                class171.method1256(var172, 0, var170);
                                continue;
                            }
                            class66.field1274 = var172;
                            class59.field1070 = var170;
                            class23.field317 = class36.field508.method236(false, new String(var172.method469(127), "ISO-8859-1"));
                            continue;
                        }
                        if (var461 == 5422) {
                            var9 -= 2;
                            class69 var173 = class233.field4263[var9 + 1];
                            class69 var174 = class233.field4263[var9];
                            var6--;
                            int var175 = class239.field4372[var6];
                            if (var174.method441((byte) 73) > 0) {
                                if (class17.field227 == null) {
                                    class17.field227 = new class69[class204.field3676[class47.field688]];
                                }
                                class17.field227[var175] = var174;
                            }
                            if (var173.method441((byte) 73) > 0) {
                                if (class123.field2281 == null) {
                                    class123.field2281 = new class69[class204.field3676[class47.field688]];
                                }
                                class123.field2281[var175] = var173;
                            }
                            continue;
                        }
                    } else if (var461 < 5600) {
                        if (var461 == 5500) {
                            var6 -= 4;
                            int var143 = class239.field4372[var6];
                            int var144 = class239.field4372[var6 + 1];
                            int var145 = class239.field4372[var6 + 2];
                            int var146 = class239.field4372[var6 + 3];
                            class140.method1075((var143 & 0x3FFF) - class220.field3962, var145, var144, false, var146, ((var143 & 0xFFFF12B) >> 14) - class242.field4441, -127);
                            continue;
                        }
                        if (var461 == 5501) {
                            var6 -= 4;
                            int var147 = class239.field4372[var6 + 2];
                            int var148 = class239.field4372[var6 + 3];
                            int var149 = class239.field4372[var6];
                            int var150 = class239.field4372[var6 + 1];
                            class229.method1635(((var149 & 0xFFFF12D) >> 14) - class242.field4441, var147, (byte) -9, (var149 & 0x3FFF) - class220.field3962, var150, var148);
                            continue;
                        }
                        if (var461 == 5502) {
                            var6 -= 6;
                            int var151 = class239.field4372[var6];
                            if (var151 >= 2) {
                                throw new RuntimeException();
                            }
                            class115.field2194 = var151;
                            int var152 = class239.field4372[var6 + 1];
                            if (var152 + 1 >= class189.field3421[class115.field2194].length >> 1) {
                                throw new RuntimeException();
                            }
                            class153.field2841 = 0;
                            class114.field2184 = var152;
                            class28.field395 = class239.field4372[var6 + 2];
                            class23.field318 = class239.field4372[var6 + 3];
                            int var153 = class239.field4372[var6 + 4];
                            if (var153 >= 2) {
                                throw new RuntimeException();
                            }
                            class155.field2893 = var153;
                            int var154 = class239.field4372[var6 + 5];
                            if ((var154 + 1) >= (class189.field3421[class155.field2893].length >> 1)) {
                                throw new RuntimeException();
                            }
                            class134.field2509 = var154;
                            class265.field4711 = 3;
                            continue;
                        }
                        if (var461 == 5503) {
                            class101.method744(83);
                            continue;
                        }
                        if (var461 == 5504) {
                            var6 -= 2;
                            class207.field3775 = class239.field4372[var6];
                            client.field2812 = class239.field4372[var6 + 1];
                            class126.method900(false);
                            continue;
                        }
                        if (var461 == 5505) {
                            class239.field4372[var6++] = class207.field3775;
                            continue;
                        }
                        if (var461 == 5506) {
                            class239.field4372[var6++] = client.field2812;
                            continue;
                        }
                    } else if (var461 < 5700) {
                        if (var461 == 5600) {
                            var9 -= 2;
                            class69 var139 = class233.field4263[var9];
                            class69 var140 = class233.field4263[var9 + 1];
                            var6--;
                            int var141 = class239.field4372[var6];
                            if (class268.field4760 == 10 && class165.field3034 == 0 && class266.field4735 == 0) {
                                class209.method1509(var140, var139, var141, (byte) -8);
                            }
                            continue;
                        }
                        if (var461 == 5601) {
                            class27.method157(60);
                            continue;
                        }
                        if (var461 == 5602) {
                            if (class165.field3034 == 0) {
                                class265.field4718 = -2;
                            }
                            continue;
                        }
                        if (var461 == 5603) {
                            var6 -= 4;
                            if (class268.field4760 == 10 && class165.field3034 == 0 && class266.field4735 == 0) {
                                class105.method792(class239.field4372[var6 + 2], class239.field4372[var6 + 1], class239.field4372[var6 + 3], 0, class239.field4372[var6]);
                            }
                            continue;
                        }
                        if (var461 == 5604) {
                            var9--;
                            if (class268.field4760 == 10 && class165.field3034 == 0 && class266.field4735 == 0) {
                                class99.method736(class233.field4263[var9].method473((byte) 75), (byte) -4);
                            }
                            continue;
                        }
                        if (var461 == 5605) {
                            var6 -= 4;
                            var9 -= 2;
                            if (class268.field4760 == 10 && class165.field3034 == 0 && class266.field4735 == 0) {
                                class215.method1546(class233.field4263[var9 + 1], class233.field4263[var9].method473((byte) 73), class239.field4372[var6 + 3], -10, class239.field4372[var6 + 1], class239.field4372[var6 + 2], class239.field4372[var6]);
                            }
                            continue;
                        }
                        if (var461 == 5606) {
                            if (class266.field4735 == 0) {
                                class28.field407 = -2;
                            }
                            continue;
                        }
                        if (var461 == 5607) {
                            class239.field4372[var6++] = class265.field4718;
                            continue;
                        }
                        if (var461 == 5608) {
                            class239.field4372[var6++] = class181.field3299;
                            continue;
                        }
                        if (var461 == 5609) {
                            class239.field4372[var6++] = class28.field407;
                            continue;
                        }
                        if (var461 == 5610) {
                            for (int var142 = 0; var142 < 5; var142++) {
                                class233.field4263[var9++] = var142 < class221.field3964.length ? class221.field3964[var142].method452(122) : class233.field4253;
                            }
                            class221.field3964 = null;
                            continue;
                        }
                        if (var461 == 5611) {
                            class239.field4372[var6++] = class120.field2266;
                            continue;
                        }
                    } else if (var461 < 6100) {
                        if (var461 == 6001) {
                            var6--;
                            int var125 = class239.field4372[var6];
                            if (var125 < 1) {
                                var125 = 1;
                            }
                            if (var125 > 4) {
                                var125 = 4;
                            }
                            class10.field88 = var125;
                            if (class10.field88 == 1) {
                                class178.method1282(0.9F);
                            }
                            if (class10.field88 == 2) {
                                class178.method1282(0.8F);
                            }
                            if (class10.field88 == 3) {
                                class178.method1282(0.7F);
                            }
                            if (class10.field88 == 4) {
                                class178.method1282(0.6F);
                            }
                            class209.method1513(-24661);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6002) {
                            var6--;
                            class20.method119((byte) 44, class239.field4372[var6] == 1);
                            class237.method1674(99);
                            class213.method1534(false);
                            class10.method50(-92);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6003) {
                            var6--;
                            class45.field649 = class239.field4372[var6] == 1;
                            class10.method50(-101);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6005) {
                            var6--;
                            class64.field1246 = class239.field4372[var6] == 1;
                            class213.method1534(false);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6006) {
                            var6--;
                            class57.field1030 = class239.field4372[var6] == 1;
                            ((class104) class178.field3236).method788(5930, !class57.field1030);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6007) {
                            var6--;
                            class119.field2249 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6008) {
                            var6--;
                            class222.field4033 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6009) {
                            var6--;
                            class9.field63 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6010) {
                            var6--;
                            class233.field4261 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6011) {
                            var6--;
                            int var126 = class239.field4372[var6];
                            if (var126 < 0 || var126 > 2) {
                                var126 = 0;
                            }
                            class191.field3461 = var126;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6012) {
                            var6--;
                            class91.field1712 = class239.field4372[var6] == 1;
                            if (class10.field88 == 1) {
                                class178.method1282(0.9F);
                            }
                            if (class10.field88 == 2) {
                                class178.method1282(0.8F);
                            }
                            if (class10.field88 == 3) {
                                class178.method1282(0.7F);
                            }
                            if (class10.field88 == 4) {
                                class178.method1282(0.6F);
                            }
                            class213.method1534(false);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6014) {
                            var6--;
                            class133.field2476 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6015) {
                            var6--;
                            class250.field4537 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6016) {
                            var6--;
                            int var127 = class239.field4372[var6];
                            if (var127 < 0 || var127 > 2) {
                                var127 = 0;
                            }
                            class44.field627 = var127;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6017) {
                            var6--;
                            class95.field1784 = class239.field4372[var6] == 1;
                            class69.method468(20513);
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6018) {
                            var6--;
                            int var128 = class239.field4372[var6];
                            if (var128 < 0) {
                                var128 = 0;
                            }
                            if (var128 > 127) {
                                var128 = 127;
                            }
                            class91.field1726 = var128;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6019) {
                            var6--;
                            int var129 = class239.field4372[var6];
                            if (var129 < 0) {
                                var129 = 0;
                            }
                            if (var129 > 255) {
                                var129 = 255;
                            }
                            if (class81.field1554 != var129) {
                                if (class81.field1554 == 0 && class231.field4229 != -1) {
                                    class83.method616(false, class91.field1723, (byte) 27, class231.field4229, 0, var129);
                                    class119.field2251 = false;
                                } else if (var129 == 0) {
                                    class145.method1101(true);
                                    class119.field2251 = false;
                                } else {
                                    class230.method1645(0, var129);
                                }
                                class81.field1554 = var129;
                            }
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6020) {
                            var6--;
                            int var130 = class239.field4372[var6];
                            if (var130 < 0) {
                                var130 = 0;
                            }
                            if (var130 > 127) {
                                var130 = 127;
                            }
                            class11.field105 = var130;
                            class84.method625(false, class36.field508);
                            class152.field2833 = false;
                            continue;
                        }
                        if (var461 == 6021) {
                            var6--;
                            class263.field4694 = class239.field4372[var6] == 1;
                            class10.method50(-97);
                            continue;
                        }
                        if (var461 == 6022) {
                            var6--;
                            class144.field2679 = class239.field4372[var6] == 1;
                            class84.method625(false, class36.field508);
                            class113.method840((byte) -107, 0);
                            continue;
                        }
                    } else if (var461 < 6200) {
                        if (var461 == 6101) {
                            class239.field4372[var6++] = class10.field88;
                            continue;
                        }
                        if (var461 == 6102) {
                            class239.field4372[var6++] = class163.method1215(83) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6103) {
                            class239.field4372[var6++] = class45.field649 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6105) {
                            class239.field4372[var6++] = class64.field1246 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6106) {
                            class239.field4372[var6++] = class57.field1030 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6107) {
                            class239.field4372[var6++] = class119.field2249 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6108) {
                            class239.field4372[var6++] = class222.field4033 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6109) {
                            class239.field4372[var6++] = class9.field63 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6110) {
                            class239.field4372[var6++] = class233.field4261 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6111) {
                            class239.field4372[var6++] = class191.field3461;
                            continue;
                        }
                        if (var461 == 6112) {
                            class239.field4372[var6++] = class91.field1712 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6114) {
                            class239.field4372[var6++] = class133.field2476 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6115) {
                            class239.field4372[var6++] = class250.field4537 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6116) {
                            class239.field4372[var6++] = class44.field627;
                            continue;
                        }
                        if (var461 == 6117) {
                            class239.field4372[var6++] = class95.field1784 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6118) {
                            class239.field4372[var6++] = class91.field1726;
                            continue;
                        }
                        if (var461 == 6119) {
                            class239.field4372[var6++] = class81.field1554;
                            continue;
                        }
                        if (var461 == 6120) {
                            class239.field4372[var6++] = class11.field105;
                            continue;
                        }
                        if (var461 == 6121) {
                            class239.field4372[var6++] = 0;
                            continue;
                        }
                        if (var461 == 6122) {
                            class239.field4372[var6++] = class144.field2679 ? 1 : 0;
                            continue;
                        }
                    } else if (var461 < 6300) {
                        if (var461 == 6200) {
                            var6 -= 2;
                            class256.field4600 = (short) class239.field4372[var6];
                            if (class256.field4600 <= 0) {
                                class256.field4600 = 256;
                            }
                            class138.field2574 = (short) class239.field4372[var6 + 1];
                            if (class138.field2574 <= 0) {
                                class138.field2574 = 205;
                            }
                            continue;
                        }
                        if (var461 == 6201) {
                            var6 -= 2;
                            class159.field2944 = (short) class239.field4372[var6];
                            if (class159.field2944 <= 0) {
                                class159.field2944 = 256;
                            }
                            class73.field1412 = (short) class239.field4372[var6 + 1];
                            if (class73.field1412 <= 0) {
                                class73.field1412 = 320;
                            }
                            continue;
                        }
                        if (var461 == 6202) {
                            var6 -= 4;
                            class63.field1228 = (short) class239.field4372[var6];
                            if (class63.field1228 <= 0) {
                                class63.field1228 = 1;
                            }
                            class222.field3994 = (short) class239.field4372[var6 + 1];
                            if (class222.field3994 <= 0) {
                                class222.field3994 = 32767;
                            } else if (class63.field1228 > class222.field3994) {
                                class222.field3994 = class63.field1228;
                            }
                            class31.field430 = (short) class239.field4372[var6 + 2];
                            if (class31.field430 <= 0) {
                                class31.field430 = 1;
                            }
                            class110.field2103 = (short) class239.field4372[var6 + 3];
                            if (class110.field2103 <= 0) {
                                class110.field2103 = 32767;
                            } else if (class110.field2103 < class31.field430) {
                                class110.field2103 = class31.field430;
                            }
                            continue;
                        }
                        if (var461 == 6203) {
                            class220.method1558(class23.field328.field727, 0, false, 0, class23.field328.field798, 222);
                            class239.field4372[var6++] = class227.field4143;
                            class239.field4372[var6++] = class256.field4598;
                            continue;
                        }
                        if (var461 == 6204) {
                            class239.field4372[var6++] = class159.field2944;
                            class239.field4372[var6++] = class73.field1412;
                            continue;
                        }
                        if (var461 == 6205) {
                            class239.field4372[var6++] = class256.field4600;
                            class239.field4372[var6++] = class138.field2574;
                            continue;
                        }
                    } else if (var461 < 6400) {
                        if (var461 == 6300) {
                            class239.field4372[var6++] = (int) (class223.method1584(-25392) / 60000L);
                            continue;
                        }
                        if (var461 == 6301) {
                            class239.field4372[var6++] = (int) (class223.method1584(-25392) / 86400000L) - 11745;
                            continue;
                        }
                        if (var461 == 6302) {
                            var6 -= 3;
                            int var134 = class239.field4372[var6];
                            int var135 = class239.field4372[var6 + 2];
                            int var136 = class239.field4372[var6 + 1];
                            class76.field1491.clear();
                            class76.field1491.set(11, 12);
                            class76.field1491.set(var135, var136, var134);
                            class239.field4372[var6++] = (int) (class76.field1491.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var461 == 6303) {
                            class76.field1491.clear();
                            class76.field1491.setTime(new Date(class223.method1584(-25392)));
                            class239.field4372[var6++] = class76.field1491.get(1);
                            continue;
                        }
                        if (var461 == 6304) {
                            var6--;
                            int var137 = class239.field4372[var6];
                            boolean var138 = true;
                            if (var137 < 0) {
                                var138 = (var137 + 1) % 4 == 0;
                            } else if (var137 < 1582) {
                                var138 = (var137 % 4) == 0;
                            } else if (var137 % 4 != 0) {
                                var138 = false;
                            } else if (var137 % 100 != 0) {
                                var138 = true;
                            } else if ((var137 % 400) != 0) {
                                var138 = false;
                            }
                            class239.field4372[var6++] = var138 ? 1 : 0;
                            continue;
                        }
                    } else if (var461 < 6500) {
                        if (var461 == 6400) {
                            class239.field4372[var6++] = class228.field4166 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6401) {
                            var6--;
                            int var131 = class239.field4372[var6];
                            var9--;
                            class69 var132 = class233.field4263[var9];
                            String var133;
                            try {
                                var133 = new String(var132.method469(127), "ISO-8859-1");
                            } catch (UnsupportedEncodingException var459) {
                                var133 = new String(var132.method469(126));
                            }
                            if (class228.field4166) {
                                if (!browsercontrol.iscreated()) {
                                    browsercontrol.create("about:blank");
                                }
                                if (browsercontrol.iscreated()) {
                                    browsercontrol.navigate(var133);
                                    class62.field1124 = var131;
                                    class113.method840((byte) -110, 0);
                                }
                            }
                            continue;
                        }
                        if (var461 == 6402) {
                            if (browsercontrol.iscreated()) {
                                browsercontrol.navigate("about:blank");
                                browsercontrol.hide();
                                class62.field1124 = 0;
                                class113.method840((byte) -98, 0);
                            }
                            continue;
                        }
                        if (var461 == 6403) {
                            class233.field4263[var9++] = class192.field3473;
                            continue;
                        }
                        if (var461 == 6404) {
                            class233.field4263[var9++] = class163.field3017;
                            continue;
                        }
                        if (var461 == 6405) {
                            class239.field4372[var6++] = class209.method1512(-108) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6406) {
                            class239.field4372[var6++] = class155.method1178(false) ? 1 : 0;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var460) {
            if (var5.field3610 == null) {
                if (class240.field4402 != 0) {
                    class122.method881(0, class233.field4253, class175.field3190, false);
                }
                class222.method1575("CS2 - scr:" + var5.field1685 + " op:" + var11, var460, 75);
            } else {
                class69 var455 = class103.method758(30, true);
                var455.method462(8914, field554).method462(8914, var5.field3610);
                for (int var456 = class24.field361 - 1; var456 >= 0; var456--) {
                    var455.method462(8914, class76.field1492).method462(8914, class78.field1504[var456].field3430.field3610);
                }
                if (var11 == 40) {
                    int var457 = var10[var7];
                    var455.method462(8914, class126.field2321).method462(8914, class98.method727(-229, var457));
                }
                if (class240.field4402 != 0) {
                    class122.method881(0, class233.field4253, class9.method42(-127, new class69[] { class242.field4447, var5.field3610 }), false);
                }
                class222.method1575("CS2 - scr:" + var5.field1685 + " op:" + var11 + new String(var455.method469(127)), var460, 119);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public static final int method218(int arg0, int arg1) {
        field537++;
        if (arg0 <= 1) {
            field549 = 13;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static final void method219(int arg0) {
        field538++;
        if (class115.field2194 == -1 || class155.field2893 == -1) {
            return;
        }
        int var1 = ((class23.field318 - class28.field395) * class153.field2841 >> 16) + class28.field395;
        class153.field2841 += var1;
        if (class153.field2841 >= 65535) {
            if (class20.field267) {
                class133.field2483 = false;
            } else {
                class133.field2483 = true;
            }
            class20.field267 = true;
            class153.field2841 = 65535;
        } else {
            class20.field267 = false;
            class133.field2483 = false;
        }
        int var2 = class114.field2184 * 2;
        float[] var3 = new float[3];
        float var4 = (float) class153.field2841 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class189.field3421[class115.field2194][var2][var5] * 3;
            int var22 = class189.field3421[class115.field2194][var2 + 1][var5] * 3;
            int var23 = (class189.field3421[class115.field2194][var2 + 2][var5] + class189.field3421[class115.field2194][var2 + 2][var5] - class189.field3421[class115.field2194][var2 + 3][var5]) * 3;
            int var24 = class189.field3421[class115.field2194][var2][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class189.field3421[class115.field2194][var2 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var24;
        }
        if (class242.field4441 == 0 && class220.field3962 == 0) {
            class220.field3962 = (((int) var3[2] >> 10) - 6) * 8;
            class242.field4441 = ((int) var3[0] >> 10) * 8 - 48;
        }
        class123.field2291 = (int) var3[2] - (class220.field3962 * 128);
        class31.field427 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        class127.field2327 = (int) var3[0] - (class242.field4441 * 128);
        int var7 = class134.field2509 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class189.field3421[class155.field2893][var7 + 1][var8] * 3;
            int var15 = (class189.field3421[class155.field2893][var7 + 2][var8] + class189.field3421[class155.field2893][var7 + 2][var8] - class189.field3421[class155.field2893][var7 + 3][var8]) * 3;
            int var16 = class189.field3421[class155.field2893][var7][var8] * 3;
            int var17 = class189.field3421[class155.field2893][var7][var8];
            int var18 = var15 + var16 - (var14 * 2);
            int var19 = var14 - var16;
            int var20 = class189.field3421[class155.field2893][var7 + 2][var8] + var14 - var17 - var15;
            var6[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var19) * var4 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = var6[2] - var3[2];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
        class242.field4448 = (float) Math.atan2((double) var11, var12);
        class17.field220 = -((float) Math.atan2((double) var9, (double) var10));
        class148.field2753 = (int) ((double) class242.field4448 * 325.949D) & 0x7FF;
        class162.field3006 = (int) ((double) class17.field220 * 325.949D) & 0x7FF;
        if (arg0 != 12105) {
            method213(7);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[B)I")
    public static final int method220(int arg0, int arg1, byte[] arg2) {
        if (arg0 <= 20) {
            field554 = null;
        }
        field541++;
        return class200.method1458(0, (byte) -124, arg1, arg2);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfh;I)V")
    public final void method221(class128 arg0, int arg1) {
        if (arg1 != -25347) {
            method219(-117);
        }
        while (true) {
            int var3 = arg0.method937(false);
            if (var3 == 0) {
                field560++;
                return;
            }
            this.method215(arg0, (byte) -13, var3);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public static final void method222(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class99.method740(arg4, class186.field3402[arg0], arg2 ^ 0x454EDC7D, arg1 + arg3, arg3 - arg1);
        field555++;
        int var5 = arg1;
        if (arg2 != -3301) {
            method222(-87, -66, 68, 108, 89);
        }
        int var6 = -arg1;
        int var7 = -1;
        int var8 = 0;
        while (var5 > var8) {
            var7 += 2;
            var8++;
            var6 += var7;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int[] var9 = class186.field3402[arg0 + var5];
                int[] var10 = class186.field3402[arg0 - var5];
                int var11 = arg3 + var8;
                int var12 = arg3 - var8;
                class99.method740(arg4, var9, -1162793114, var11, var12);
                class99.method740(arg4, var10, arg2 ^ 0x454EDC7D, var11, var12);
            }
            int var13 = arg3 + var5;
            int var14 = arg3 - var5;
            int[] var15 = class186.field3402[arg0 + var8];
            int[] var16 = class186.field3402[arg0 - var8];
            class99.method740(arg4, var15, arg2 ^ 0x454EDC7D, var13, var14);
            class99.method740(arg4, var16, -1162793114, var13, var14);
        }
    }
}
