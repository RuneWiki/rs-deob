import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class228 extends class213 {

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    private int field3439 = 0;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Ljl;")
    private class253 field3416 = new class253(16);

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    private int field3442 = 0;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lgk;")
    private class159 field3445 = new class159();

    @OriginalMember(owner = "client!re", name = "T", descriptor = "J")
    private long field3447 = 0L;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Lll;")
    private class211 field3424;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    private int field3419;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Z")
    private boolean field3443;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Lgk;")
    private class159 field3441;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    private int field3430;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Lne;")
    private class52 field3433;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
    private boolean field3446;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lnf;")
    private class160 field3423;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Lll;")
    private class211 field3426;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lmg;")
    private class272 field3418;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lgk;")
    public static class159 field3432 = new class159();

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Lrk;")
    private class277 field3428;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lpf;")
    public static class294 field3444;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Z")
    private boolean field3440;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "[B")
    private byte[] field3434;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Lrk;")
    public final class277 method1359(byte arg0) {
        field3417++;
        if (this.field3428 != null) {
            return this.field3428;
        }
        if (this.field3418 == null) {
            if (this.field3433.method357(20)) {
                return null;
            }
            this.field3418 = this.field3433.method350(this.field3419, true, (byte) 0, -106, 255);
        }
        if (arg0 <= 86) {
            this.method1455(-42);
        }
        if (this.field3418.field4091) {
            return null;
        }
        byte[] var2 = this.field3418.method111((byte) 90);
        if (this.field3418 instanceof class15) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3428 = new class277(var2, this.field3430);
                if (this.field3428.field4166 != this.field3429) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3428 = null;
                if (this.field3433.method357(20)) {
                    this.field3418 = null;
                } else {
                    this.field3418 = this.field3433.method350(this.field3419, true, (byte) 0, 89, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3428 = new class277(var2, this.field3430);
            } catch (RuntimeException var4) {
                this.field3433.method344((byte) 101);
                this.field3428 = null;
                if (this.field3433.method357(20)) {
                    this.field3418 = null;
                } else {
                    this.field3418 = this.field3433.method350(this.field3419, true, (byte) 0, -113, 255);
                }
                return null;
            }
            if (this.field3426 != null) {
                this.field3423.method992(this.field3419, 2, this.field3426, var2);
            }
        }
        if (this.field3424 != null) {
            this.field3434 = new byte[this.field3428.field4171];
            this.field3439 = 0;
        }
        this.field3418 = null;
        return this.field3428;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
    public final int method1452(int arg0) {
        field3414++;
        if (this.method1359((byte) 102) == null) {
            return this.field3418 == null ? 0 : this.field3418.method112(arg0 ^ 0xFFFFFFFE);
        } else {
            if (arg0 != 1) {
                this.field3445 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)Lmg;")
    private final class272 method1453(int arg0, int arg1, int arg2) {
        field3431++;
        if (arg1 < 77) {
            return null;
        }
        class272 var4 = (class272) this.field3416.method1666((long) arg2, (byte) -94);
        if (var4 != null && arg0 == 0 && !var4.field4094 && var4.field4091) {
            var4.method538(106);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3424 == null || this.field3434[arg2] == -1) {
                    if (this.field3433.method357(20)) {
                        return null;
                    }
                    var4 = this.field3433.method350(arg2, true, (byte) 2, -14, this.field3419);
                } else {
                    var4 = this.field3423.method1000(this.field3424, 1, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field3424 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3423.method994(arg2, -122, this.field3424);
            } else if (arg0 == 2) {
                if (this.field3424 == null) {
                    throw new RuntimeException();
                }
                if (this.field3434[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3433.method343(-1)) {
                    return null;
                }
                var4 = this.field3433.method350(arg2, false, (byte) 2, 120, this.field3419);
            } else {
                throw new RuntimeException();
            }
            this.field3416.method1663((long) arg2, var4, -121);
        }
        if (var4.field4091) {
            return null;
        }
        byte[] var5 = var4.method111((byte) 108);
        if (!var4 instanceof class15) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class212.field3177.reset();
                class212.field3177.update(var5, 0, var5.length - 2);
                int var9 = (int) class212.field3177.getValue();
                if (this.field3428.field4176[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field3433.field853 = 0;
                this.field3433.field856 = 0;
            } catch (RuntimeException var12) {
                this.field3433.method344((byte) 100);
                var4.method538(127);
                if (var4.field4094 && !this.field3433.method357(20)) {
                    class22 var10 = this.field3433.method350(arg2, true, (byte) 2, -7, this.field3419);
                    this.field3416.method1663((long) arg2, var10, -89);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3428.field4164[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3428.field4164[arg2];
            if (this.field3424 != null) {
                this.field3423.method992(arg2, 2, this.field3424, var5);
                if (this.field3434[arg2] != 1) {
                    this.field3439++;
                    this.field3434[arg2] = 1;
                }
            }
            if (!var4.field4094) {
                var4.method538(83);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class212.field3177.reset();
            class212.field3177.update(var5, 0, var5.length - 2);
            int var6 = (int) class212.field3177.getValue();
            if (this.field3428.field4176[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3428.field4164[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3434[arg2] != 1) {
                this.field3439++;
                this.field3434[arg2] = 1;
            }
            if (!var4.field4094) {
                var4.method538(115);
            }
            return var4;
        } catch (Exception var11) {
            this.field3434[arg2] = -1;
            var4.method538(120);
            if (var4.field4094 && !this.field3433.method357(20)) {
                class22 var8 = this.field3433.method350(arg2, true, (byte) 2, 116, this.field3419);
                this.field3416.method1663((long) arg2, var8, -114);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public final void method1454(int arg0) {
        field3438++;
        if (arg0 != -1 || this.field3441 == null || this.method1359((byte) 110) == null) {
            return;
        }
        for (class82 var2 = this.field3445.method983(arg0 + 8); var2 != null; var2 = this.field3445.method985((byte) 111)) {
            int var3 = (int) var2.field1321;
            if (var3 < 0 || this.field3428.field4171 <= var3 || this.field3428.field4172[var3] == 0) {
                var2.method538(arg0 ^ 0xFFFFFF8B);
            } else {
                if (this.field3434[var3] == 0) {
                    this.method1453(1, 93, var3);
                }
                if (this.field3434[var3] == -1) {
                    this.method1453(2, 96, var3);
                }
                if (this.field3434[var3] == 1) {
                    var2.method538(arg0 + 124);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
    public final int method1455(int arg0) {
        field3425++;
        int var2 = 34 % ((arg0 - 47) / 63);
        return this.field3439;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLui;)V")
    public static final void method1456(byte arg0, class234 arg1) {
        class199.method1247(arg1, 1, 200000);
        field3437++;
        int var2 = -77 / ((arg0 - 52) / 43);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
    public final void method1364(int arg0, int arg1) {
        field3436++;
        if (this.field3424 == null) {
            return;
        }
        for (class82 var3 = this.field3445.method983(7); var3 != null; var3 = this.field3445.method985((byte) -79)) {
            if (((long) arg1) == var3.field1321) {
                return;
            }
        }
        if (arg0 != 1) {
            this.method1459((byte) -77);
        }
        class82 var4 = new class82();
        var4.field1321 = (long) arg1;
        this.field3445.method987(var4, (byte) -121);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
    public final int method1365(int arg0, byte arg1) {
        if (arg1 != -66) {
            this.field3430 = -85;
        }
        field3422++;
        class272 var3 = (class272) this.field3416.method1666((long) arg0, (byte) 84);
        return var3 == null ? 0 : var3.method112(-1);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
    public final int method1457(int arg0) {
        field3420++;
        if (arg0 != 0) {
            this.method1460(-126);
        }
        if (this.field3428 == null) {
            return 0;
        } else if (this.field3443) {
            class82 var2 = this.field3441.method983(7);
            return var2 == null ? 0 : (int) var2.field1321;
        } else {
            return this.field3428.field4173;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public final void method1458(byte arg0) {
        field3412++;
        if (this.field3424 == null) {
            return;
        }
        if (arg0 != 12) {
            this.field3434 = null;
        }
        this.field3440 = true;
        if (this.field3441 == null) {
            this.field3441 = new class159();
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
    public final int method1459(byte arg0) {
        field3427++;
        if (arg0 == -49) {
            return this.field3428 == null ? 0 : this.field3428.field4173;
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public final void method1460(int arg0) {
        field3435++;
        if (this.field3441 != null) {
            if (this.method1359((byte) 100) == null) {
                return;
            }
            if (this.field3443) {
                boolean var2 = true;
                for (class82 var3 = this.field3441.method983(7); var3 != null; var3 = this.field3441.method985((byte) -64)) {
                    int var5 = (int) var3.field1321;
                    if (this.field3434[var5] == 0) {
                        this.method1453(1, 78, var5);
                    }
                    if (this.field3434[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method538(125);
                    }
                }
                while (this.field3428.field4172.length > this.field3442) {
                    if (this.field3428.field4172[this.field3442] == 0) {
                        this.field3442++;
                    } else {
                        if (this.field3423.field2472 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3434[this.field3442] == 0) {
                            this.method1453(1, arg0 + 6059, this.field3442);
                        }
                        if (this.field3434[this.field3442] == 0) {
                            var2 = false;
                            class82 var4 = new class82();
                            var4.field1321 = (long) this.field3442;
                            this.field3441.method987(var4, (byte) -121);
                        }
                        this.field3442++;
                    }
                }
                if (var2) {
                    this.field3442 = 0;
                    this.field3443 = false;
                }
            } else if (this.field3440) {
                boolean var6 = true;
                for (class82 var7 = this.field3441.method983(7); var7 != null; var7 = this.field3441.method985((byte) -67)) {
                    int var9 = (int) var7.field1321;
                    if (this.field3434[var9] != 1) {
                        this.method1453(2, 125, var9);
                    }
                    if (this.field3434[var9] == 1) {
                        var7.method538(105);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3428.field4172.length > this.field3442) {
                    if (this.field3428.field4172[this.field3442] == 0) {
                        this.field3442++;
                    } else {
                        if (this.field3433.method343(arg0 + 5956)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3434[this.field3442] != 1) {
                            this.method1453(2, 81, this.field3442);
                        }
                        if (this.field3434[this.field3442] != 1) {
                            var6 = false;
                            class82 var8 = new class82();
                            var8.field1321 = (long) this.field3442;
                            this.field3441.method987(var8, (byte) -121);
                        }
                        this.field3442++;
                    }
                }
                if (var6) {
                    this.field3440 = false;
                    this.field3442 = 0;
                }
            } else {
                this.field3441 = null;
            }
        }
        if (this.field3446 && this.field3447 <= class263.method1754(123)) {
            for (class272 var10 = (class272) this.field3416.method1665(16); var10 != null; var10 = (class272) this.field3416.method1659((byte) -118)) {
                if (!var10.field4091) {
                    if (var10.field4087) {
                        if (!var10.field4094) {
                            throw new RuntimeException();
                        }
                        var10.method538(65);
                    } else {
                        var10.field4087 = true;
                    }
                }
            }
            this.field3447 = class263.method1754(-19) + 1000L;
        }
        if (arg0 != -5957) {
            this.method1455(24);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lnd;Z)V")
    public static final void method1461(class270 arg0, boolean arg1) {
        class113.field1731.method987(arg0, (byte) -121);
        while (true) {
            class270 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class270[][] var7;
            class270 var66;
            do {
                class270 var65;
                do {
                    class270 var64;
                    do {
                        class270 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class270) class113.field1731.method989(4);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4075);
                                            var3 = var2.field4066;
                                            var4 = var2.field4078;
                                            var5 = var2.field4077;
                                            var6 = var2.field4082;
                                            var7 = class33.field487[var5];
                                            if (!var2.field4064) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class270 var8 = class33.field487[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field4075) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class81.field1306 && var3 > class76.field1234) {
                                                    class270 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field4075 && (var9.field4064 || (var2.field4065 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class81.field1306 && var3 < class76.field1229 - 1) {
                                                    class270 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field4075 && (var10.field4064 || (var2.field4065 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class43.field697 && var4 > class192.field2952) {
                                                    class270 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field4075 && (var11.field4064 || (var2.field4065 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class43.field697 && var4 < class187.field2841 - 1) {
                                                    class270 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field4075 && (var12.field4064 || (var2.field4065 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4064 = false;
                                            if (var2.field4072 != null) {
                                                class270 var13 = var2.field4072;
                                                if (var13.field4085 == null) {
                                                    if (var13.field4081 != null) {
                                                        if (class236.method1501(0, var3, var4)) {
                                                            class176.method1092(var13.field4081, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, true);
                                                        } else {
                                                            class176.method1092(var13.field4081, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class236.method1501(0, var3, var4)) {
                                                    class253.method1662(var13.field4085, 0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, true);
                                                } else {
                                                    class253.method1662(var13.field4085, 0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, false);
                                                }
                                                class162 var14 = var13.field4084;
                                                if (var14 != null) {
                                                    var14.field2489.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var14.field2483 - class274.field4127, var14.field2491 - class239.field3593, var14.field2495 - class136.field1998, var14.field2496, var5, (class245) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field4071; var15++) {
                                                    class2 var16 = var13.field4069[var15];
                                                    if (var16 != null) {
                                                        var16.field31.method90(var16.field21, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var16.field27 - class274.field4127, var16.field36 - class239.field3593, var16.field17 - class136.field1998, var16.field28, var5, (class245) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field4085 == null) {
                                                if (var2.field4081 != null) {
                                                    if (class236.method1501(var6, var3, var4)) {
                                                        class176.method1092(var2.field4081, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class176.method1092(var2.field4081, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, false);
                                                    }
                                                }
                                            } else if (class236.method1501(var6, var3, var4)) {
                                                class253.method1662(var2.field4085, var6, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field4085.field3909 != 12345678 || class26.field327 && var5 <= class187.field2843) {
                                                    class253.method1662(var2.field4085, var6, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class108 var18 = var2.field4063;
                                                if (var18 != null && (var18.field1687 & 0x80000000L) != 0L) {
                                                    var18.field1684.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var18.field1686 - class274.field4127, var18.field1685 - class239.field3593, var18.field1682 - class136.field1998, var18.field1687, var5, (class245) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class162 var21 = var2.field4084;
                                            class183 var22 = var2.field4073;
                                            if (var21 != null || var22 != null) {
                                                if (class81.field1306 == var3) {
                                                    var19++;
                                                } else if (class81.field1306 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class43.field697 == var4) {
                                                    var19 += 3;
                                                } else if (class43.field697 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class41.field612[var19];
                                                var2.field4067 = class185.field2808[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2476 & class195.field2974[var19]) == 0) {
                                                    var2.field4080 = 0;
                                                } else if (var21.field2476 == 16) {
                                                    var2.field4080 = 3;
                                                    var2.field4079 = class84.field1340[var19];
                                                    var2.field4070 = 3 - var2.field4079;
                                                } else if (var21.field2476 == 32) {
                                                    var2.field4080 = 6;
                                                    var2.field4079 = class76.field1230[var19];
                                                    var2.field4070 = 6 - var2.field4079;
                                                } else if (var21.field2476 == 64) {
                                                    var2.field4080 = 12;
                                                    var2.field4079 = class188.field2886[var19];
                                                    var2.field4070 = 12 - var2.field4079;
                                                } else {
                                                    var2.field4080 = 9;
                                                    var2.field4079 = class26.field319[var19];
                                                    var2.field4070 = 9 - var2.field4079;
                                                }
                                                if ((var21.field2476 & var20) != 0 && !class13.method76(var6, var3, var4, var21.field2476)) {
                                                    var21.field2489.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var21.field2483 - class274.field4127, var21.field2491 - class239.field3593, var21.field2495 - class136.field1998, var21.field2496, var5, (class245) null);
                                                }
                                                if ((var21.field2477 & var20) != 0 && !class13.method76(var6, var3, var4, var21.field2477)) {
                                                    var21.field2478.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var21.field2483 - class274.field4127, var21.field2491 - class239.field3593, var21.field2495 - class136.field1998, var21.field2496, var5, (class245) null);
                                                }
                                            }
                                            if (var22 != null && !class233.method1485(var6, var3, var4, var22.field2768.method81())) {
                                                if ((var22.field2760 & var20) != 0) {
                                                    var22.field2768.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var22.field2765 + var22.field2767 - class274.field4127, var22.field2777 - class239.field3593, var22.field2764 + var22.field2763 - class136.field1998, var22.field2766, var5, (class245) null);
                                                } else if (var22.field2760 == 256) {
                                                    int var23 = var22.field2765 - class274.field4127;
                                                    int var24 = var22.field2777 - class239.field3593;
                                                    int var25 = var22.field2764 - class136.field1998;
                                                    int var26 = var22.field2758;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2768.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var22.field2767 + var23, var24, var22.field2763 + var25, var22.field2766, var5, (class245) null);
                                                    } else if (var22.field2774 != null) {
                                                        var22.field2774.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var23, var24, var25, var22.field2766, var5, (class245) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class108 var29 = var2.field4063;
                                                if (var29 != null && (var29.field1687 & 0x80000000L) == 0L) {
                                                    var29.field1684.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var29.field1686 - class274.field4127, var29.field1685 - class239.field3593, var29.field1682 - class136.field1998, var29.field1687, var5, (class245) null);
                                                }
                                                class231 var30 = var2.field4068;
                                                if (var30 != null && var30.field3478 == 0) {
                                                    if (var30.field3487 != null) {
                                                        var30.field3487.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var30.field3475 - class274.field4127, var30.field3490 - class239.field3593, var30.field3496 - class136.field1998, var30.field3485, var5, (class245) null);
                                                    }
                                                    if (var30.field3481 != null) {
                                                        var30.field3481.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var30.field3475 - class274.field4127, var30.field3490 - class239.field3593, var30.field3496 - class136.field1998, var30.field3485, var5, (class245) null);
                                                    }
                                                    if (var30.field3489 != null) {
                                                        var30.field3489.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var30.field3475 - class274.field4127, var30.field3490 - class239.field3593, var30.field3496 - class136.field1998, var30.field3485, var5, (class245) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field4065;
                                            if (var31 != 0) {
                                                if (var3 < class81.field1306 && (var31 & 0x4) != 0) {
                                                    class270 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field4075) {
                                                        class113.field1731.method987(var32, (byte) -121);
                                                    }
                                                }
                                                if (var4 < class43.field697 && (var31 & 0x2) != 0) {
                                                    class270 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field4075) {
                                                        class113.field1731.method987(var33, (byte) -121);
                                                    }
                                                }
                                                if (var3 > class81.field1306 && (var31 & 0x1) != 0) {
                                                    class270 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field4075) {
                                                        class113.field1731.method987(var34, (byte) -121);
                                                    }
                                                }
                                                if (var4 > class43.field697 && (var31 & 0x8) != 0) {
                                                    class270 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field4075) {
                                                        class113.field1731.method987(var35, (byte) -121);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4080 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field4071; var37++) {
                                                if (class166.field2548 != var2.field4069[var37].field33 && (var2.field4076[var37] & var2.field4080) == var2.field4079) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class162 var38 = var2.field4084;
                                                if (!class13.method76(var6, var3, var4, var38.field2476)) {
                                                    var38.field2489.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var38.field2483 - class274.field4127, var38.field2491 - class239.field3593, var38.field2495 - class136.field1998, var38.field2496, var5, (class245) null);
                                                }
                                                var2.field4080 = 0;
                                            }
                                        }
                                        if (!var2.field4074) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field4071;
                                            var2.field4074 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class2 var42 = var2.field4069[var41];
                                                if (class166.field2548 != var42.field33) {
                                                    for (int var43 = var42.field26; var43 <= var42.field25; var43++) {
                                                        for (int var44 = var42.field23; var44 <= var42.field34; var44++) {
                                                            class270 var45 = var7[var43][var44];
                                                            if (var45.field4064) {
                                                                var2.field4074 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field4080 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field26) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field25) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field23) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field34) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field4080) == var2.field4070) {
                                                                    var2.field4074 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class200.field3044[var40++] = var42;
                                                    int var47 = class81.field1306 - var42.field26;
                                                    int var48 = var42.field25 - class81.field1306;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class43.field697 - var42.field23;
                                                    int var50 = var42.field34 - class43.field697;
                                                    if (var50 > var49) {
                                                        var42.field22 = var47 + var50;
                                                    } else {
                                                        var42.field22 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class2 var54 = class200.field3044[var53];
                                                    if (class166.field2548 != var54.field33) {
                                                        if (var54.field22 > var51) {
                                                            var51 = var54.field22;
                                                            var52 = var53;
                                                        } else if (var54.field22 == var51) {
                                                            int var55 = var54.field27 - class274.field4127;
                                                            int var56 = var54.field17 - class136.field1998;
                                                            int var57 = class200.field3044[var52].field27 - class274.field4127;
                                                            int var58 = class200.field3044[var52].field17 - class136.field1998;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class2 var59 = class200.field3044[var52];
                                                var59.field33 = class166.field2548;
                                                if (!class290.method1929(var6, var59.field26, var59.field25, var59.field23, var59.field34, var59.field31.method81())) {
                                                    var59.field31.method90(var59.field21, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var59.field27 - class274.field4127, var59.field36 - class239.field3593, var59.field17 - class136.field1998, var59.field28, var5, (class245) null);
                                                }
                                                for (int var60 = var59.field26; var60 <= var59.field25; var60++) {
                                                    for (int var61 = var59.field23; var61 <= var59.field34; var61++) {
                                                        class270 var62 = var7[var60][var61];
                                                        if (var62.field4080 != 0) {
                                                            class113.field1731.method987(var62, (byte) -121);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field4075) {
                                                            class113.field1731.method987(var62, (byte) -121);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4074) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field4074 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4075);
                            } while (var2.field4080 != 0);
                            if (var3 > class81.field1306 || var3 <= class76.field1234) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field4075);
                        if (var3 < class81.field1306 || var3 >= class76.field1229 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field4075);
                    if (var4 > class43.field697 || var4 <= class192.field2952) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field4075);
                if (var4 < class43.field697 || var4 >= class187.field2841 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field4075);
            var2.field4075 = false;
            class237.field3573--;
            class231 var67 = var2.field4068;
            if (var67 != null && var67.field3478 != 0) {
                if (var67.field3487 != null) {
                    var67.field3487.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var67.field3475 - class274.field4127, var67.field3490 - class239.field3593 - var67.field3478, var67.field3496 - class136.field1998, var67.field3485, var5, (class245) null);
                }
                if (var67.field3481 != null) {
                    var67.field3481.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var67.field3475 - class274.field4127, var67.field3490 - class239.field3593 - var67.field3478, var67.field3496 - class136.field1998, var67.field3485, var5, (class245) null);
                }
                if (var67.field3489 != null) {
                    var67.field3489.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var67.field3475 - class274.field4127, var67.field3490 - class239.field3593 - var67.field3478, var67.field3496 - class136.field1998, var67.field3485, var5, (class245) null);
                }
            }
            if (var2.field4067 != 0) {
                class183 var68 = var2.field4073;
                if (var68 != null && !class233.method1485(var6, var3, var4, var68.field2768.method81())) {
                    if ((var68.field2760 & var2.field4067) != 0) {
                        var68.field2768.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var68.field2765 + var68.field2767 - class274.field4127, var68.field2777 - class239.field3593, var68.field2764 + var68.field2763 - class136.field1998, var68.field2766, var5, (class245) null);
                    } else if (var68.field2760 == 256) {
                        int var69 = var68.field2765 - class274.field4127;
                        int var70 = var68.field2777 - class239.field3593;
                        int var71 = var68.field2764 - class136.field1998;
                        int var72 = var68.field2758;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2768.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var68.field2767 + var69, var70, var68.field2763 + var71, var68.field2766, var5, (class245) null);
                        } else if (var68.field2774 != null) {
                            var68.field2774.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var69, var70, var71, var68.field2766, var5, (class245) null);
                        }
                    }
                }
                class162 var75 = var2.field4084;
                if (var75 != null) {
                    if ((var75.field2477 & var2.field4067) != 0 && !class13.method76(var6, var3, var4, var75.field2477)) {
                        var75.field2478.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var75.field2483 - class274.field4127, var75.field2491 - class239.field3593, var75.field2495 - class136.field1998, var75.field2496, var5, (class245) null);
                    }
                    if ((var75.field2476 & var2.field4067) != 0 && !class13.method76(var6, var3, var4, var75.field2476)) {
                        var75.field2489.method90(0, class215.field3235, class114.field1744, class274.field4120, class180.field2733, var75.field2483 - class274.field4127, var75.field2491 - class239.field3593, var75.field2495 - class136.field1998, var75.field2496, var5, (class245) null);
                    }
                }
            }
            if (var5 < class114.field1743 - 1) {
                class270 var76 = class33.field487[var5 + 1][var3][var4];
                if (var76 != null && var76.field4075) {
                    class113.field1731.method987(var76, (byte) -121);
                }
            }
            if (var3 < class81.field1306) {
                class270 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field4075) {
                    class113.field1731.method987(var77, (byte) -121);
                }
            }
            if (var4 < class43.field697) {
                class270 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field4075) {
                    class113.field1731.method987(var78, (byte) -121);
                }
            }
            if (var3 > class81.field1306) {
                class270 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field4075) {
                    class113.field1731.method987(var79, (byte) -121);
                }
            }
            if (var4 > class43.field697) {
                class270 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field4075) {
                    class113.field1731.method987(var80, (byte) -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)[B")
    public final byte[] method1363(byte arg0, int arg1) {
        class272 var3 = this.method1453(0, 78, arg1);
        field3415++;
        if (arg0 < 29) {
            field3432 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method111((byte) 83);
            var3.method538(74);
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public static void method1462(byte arg0) {
        field3432 = null;
        if (arg0 != -83) {
            field3432 = null;
        }
        field3444 = null;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)Ltg;")
    public static final class185 method1463(int arg0, int arg1) {
        if (arg0 < 120) {
            field3432 = null;
        }
        field3421++;
        if (arg1 == 0) {
            return new class24();
        } else if (arg1 == 1) {
            return new class81();
        } else if (arg1 == 2) {
            return new class20();
        } else if (arg1 == 3) {
            return new class7();
        } else if (arg1 == 4) {
            return new class241();
        } else if (arg1 == 5) {
            return new class8();
        } else if (arg1 == 6) {
            return new class16();
        } else if (arg1 == 7) {
            return new class30();
        } else if (arg1 == 8) {
            return new class285();
        } else if (arg1 == 9) {
            return new class85();
        } else if (arg1 == 10) {
            return new class139();
        } else if (arg1 == 11) {
            return new class100();
        } else if (arg1 == 12) {
            return new class163();
        } else if (arg1 == 13) {
            return new class36();
        } else if (arg1 == 14) {
            return new class66();
        } else if (arg1 == 15) {
            return new class284();
        } else if (arg1 == 16) {
            return new class145();
        } else if (arg1 == 17) {
            return new class50();
        } else if (arg1 == 18) {
            return new class186();
        } else if (arg1 == 19) {
            return new class282();
        } else if (arg1 == 20) {
            return new class264();
        } else if (arg1 == 21) {
            return new class235();
        } else if (arg1 == 22) {
            return new class123();
        } else if (arg1 == 23) {
            return new class254();
        } else if (arg1 == 24) {
            return new class262();
        } else if (arg1 == 25) {
            return new class33();
        } else if (arg1 == 26) {
            return new class223();
        } else if (arg1 == 27) {
            return new class64();
        } else if (arg1 == 28) {
            return new class98();
        } else if (arg1 == 29) {
            return new class191();
        } else if (arg1 == 30) {
            return new class91();
        } else if (arg1 == 31) {
            return new class220();
        } else if (arg1 == 32) {
            return new class229();
        } else if (arg1 == 33) {
            return new class233();
        } else if (arg1 == 34) {
            return new class6();
        } else if (arg1 == 35) {
            return new class13();
        } else if (arg1 == 36) {
            return new class25();
        } else if (arg1 == 37) {
            return new class184();
        } else if (arg1 == 38) {
            return new class297();
        } else if (arg1 == 39) {
            return new class214();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILll;Lll;Lne;Lnf;IIZ)V")
    public class228(int arg0, class211 arg1, class211 arg2, class52 arg3, class160 arg4, int arg5, int arg6, boolean arg7) {
        this.field3424 = arg1;
        this.field3419 = arg0;
        if (this.field3424 == null) {
            this.field3443 = false;
        } else {
            this.field3443 = true;
            this.field3441 = new class159();
        }
        this.field3430 = arg5;
        this.field3429 = arg6;
        this.field3433 = arg3;
        this.field3446 = arg7;
        this.field3423 = arg4;
        this.field3426 = arg2;
        if (this.field3426 != null) {
            this.field3418 = this.field3423.method1000(this.field3426, 1, this.field3419);
        }
    }
}
