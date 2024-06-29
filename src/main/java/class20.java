import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class20 extends class179 {

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Z")
    private boolean field525 = false;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "B")
    public byte field542 = 0;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    public int field559 = 0;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public int field529 = 0;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "[I")
    public int[] field547;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "[I")
    public int[] field560;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "[I")
    public int[] field555;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "[I")
    private int[] field523;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "[I")
    public int[] field539;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "[I")
    public int[] field543;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "[I")
    public int[] field532;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "[B")
    public byte[] field524;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[B")
    public byte[] field533;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "[B")
    public byte[] field528;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "[S")
    public short[] field562;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "[S")
    public short[] field563;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "[B")
    public byte[] field565;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "[I")
    private int[] field538;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[B")
    public byte[] field552;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "[S")
    public short[] field530;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "[S")
    public short[] field561;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "[S")
    public short[] field544;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "[S")
    private short[] field548;

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "[S")
    private short[] field566;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "[S")
    private short[] field554;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[B")
    private byte[] field526;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[B")
    private byte[] field550;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "[B")
    private byte[] field545;

    @OriginalMember(owner = "client!ni", name = "kb", descriptor = "[B")
    private byte[] field570;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "[B")
    private byte[] field557;

    @OriginalMember(owner = "client!ni", name = "jb", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "[[I")
    public int[][] field536;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "[[I")
    public int[][] field527;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "[Lub;")
    public class17[] field535;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "[Lcc;")
    public class211[] field540;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "[Lub;")
    public class17[] field522;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "S")
    public short field564;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "S")
    public short field549;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private static int field531 = 0;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "[I")
    private static int[] field551 = class247.field4298;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "[I")
    private static int[] field546 = new int[10000];

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "[I")
    private static int[] field558 = new int[10000];

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "[I")
    private static int[] field567 = class247.field4289;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "S")
    private short field534;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "S")
    private short field537;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "S")
    private short field541;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "S")
    private short field553;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "S")
    private short field556;

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "S")
    private short field568;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V")
    private final void method139() {
        if (this.field525) {
            return;
        }
        this.field525 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field559; var7++) {
            int var8 = this.field547[var7];
            int var9 = this.field560[var7];
            int var10 = this.field555[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field537 = (short) var1;
        this.field541 = (short) var4;
        this.field553 = (short) var2;
        this.field534 = (short) var5;
        this.field556 = (short) var3;
        this.field568 = (short) var6;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    private final void method140(int arg0) {
        int var2 = field567[arg0];
        int var3 = field551[arg0];
        for (int var4 = 0; var4 < this.field559; var4++) {
            int var5 = this.field560[var4] * var3 - this.field555[var4] * var2 >> 16;
            this.field555[var4] = this.field560[var4] * var2 + this.field555[var4] * var3 >> 16;
            this.field560[var4] = var5;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
    public final int method141() {
        if (!this.field525) {
            this.method139();
        }
        return this.field553;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(SS)V")
    public final void method142(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field529; var3++) {
            if (this.field562[var3] == arg0) {
                this.field562[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)V")
    public final void method143(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field559; var4++) {
            this.field547[var4] += arg0;
            this.field560[var4] += arg1;
            this.field555[var4] += arg2;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(III)I")
    public final int method144(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field559; var4++) {
            if (this.field547[var4] == arg0 && this.field560[var4] == arg1 && this.field555[var4] == arg2) {
                return var4;
            }
        }
        this.field547[this.field559] = arg0;
        this.field560[this.field559] = arg1;
        this.field555[this.field559] = arg2;
        return this.field559++;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
    public final void method145() {
        for (int var1 = 0; var1 < this.field559; var1++) {
            int var2 = this.field555[var1];
            this.field555[var1] = this.field547[var1];
            this.field547[var1] = -var2;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()V")
    public final void method146() {
        this.field523 = null;
        this.field538 = null;
        this.field536 = null;
        this.field527 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    private final void method147(int arg0) {
        int var2 = field567[arg0];
        int var3 = field551[arg0];
        for (int var4 = 0; var4 < this.field559; var4++) {
            int var5 = this.field560[var4] * var2 + this.field547[var4] * var3 >> 16;
            this.field560[var4] = this.field560[var4] * var3 - this.field547[var4] * var2 >> 16;
            this.field547[var4] = var5;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()V")
    public final void method148() {
        if (this.field535 != null) {
            return;
        }
        this.field535 = new class17[this.field559];
        for (int var1 = 0; var1 < this.field559; var1++) {
            this.field535[var1] = new class17();
        }
        for (int var2 = 0; var2 < this.field529; var2++) {
            int var3 = this.field539[var2];
            int var4 = this.field543[var2];
            int var5 = this.field532[var2];
            int var6 = this.field547[var4] - this.field547[var3];
            int var7 = this.field560[var4] - this.field560[var3];
            int var8 = this.field555[var4] - this.field555[var3];
            int var9 = this.field547[var5] - this.field547[var3];
            int var10 = this.field560[var5] - this.field560[var3];
            int var11 = this.field555[var5] - this.field555[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field524 == null) {
                var19 = 0;
            } else {
                var19 = this.field524[var2];
            }
            if (var19 == 0) {
                class17 var20 = this.field535[var3];
                var20.field474 += var16;
                var20.field472 += var17;
                var20.field468 += var18;
                var20.field477++;
                class17 var21 = this.field535[var4];
                var21.field474 += var16;
                var21.field472 += var17;
                var21.field468 += var18;
                var21.field477++;
                class17 var22 = this.field535[var5];
                var22.field474 += var16;
                var22.field472 += var17;
                var22.field468 += var18;
                var22.field477++;
            } else if (var19 == 1) {
                if (this.field540 == null) {
                    this.field540 = new class211[this.field529];
                }
                class211 var23 = this.field540[var2] = new class211();
                var23.field3794 = var16;
                var23.field3786 = var17;
                var23.field3796 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()V")
    public final void method149() {
        for (int var1 = 0; var1 < this.field559; var1++) {
            this.field547[var1] = -this.field547[var1];
            this.field555[var1] = -this.field555[var1];
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "()Lni;")
    public final class20 method150() {
        class20 var1 = new class20();
        if (this.field524 != null) {
            var1.field524 = new byte[this.field529];
            for (int var2 = 0; var2 < this.field529; var2++) {
                var1.field524[var2] = this.field524[var2];
            }
        }
        var1.field559 = this.field559;
        var1.field529 = this.field529;
        var1.field569 = this.field569;
        var1.field547 = this.field547;
        var1.field560 = this.field560;
        var1.field555 = this.field555;
        var1.field539 = this.field539;
        var1.field543 = this.field543;
        var1.field532 = this.field532;
        var1.field533 = this.field533;
        var1.field528 = this.field528;
        var1.field565 = this.field565;
        var1.field562 = this.field562;
        var1.field563 = this.field563;
        var1.field542 = this.field542;
        var1.field552 = this.field552;
        var1.field530 = this.field530;
        var1.field561 = this.field561;
        var1.field544 = this.field544;
        var1.field548 = this.field548;
        var1.field566 = this.field566;
        var1.field554 = this.field554;
        var1.field526 = this.field526;
        var1.field550 = this.field550;
        var1.field545 = this.field545;
        var1.field570 = this.field570;
        var1.field557 = this.field557;
        var1.field523 = this.field523;
        var1.field538 = this.field538;
        var1.field536 = this.field536;
        var1.field527 = this.field527;
        var1.field535 = this.field535;
        var1.field540 = this.field540;
        var1.field564 = this.field564;
        var1.field549 = this.field549;
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ldk;IIIZ)V")
    public final void method151(class179 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class20 var6 = (class20) arg0;
        var6.method139();
        var6.method148();
        field531++;
        int var7 = 0;
        int[] var8 = var6.field547;
        int var9 = var6.field559;
        for (int var10 = 0; var10 < this.field559; var10++) {
            class17 var13 = this.field535[var10];
            if (var13.field477 != 0) {
                int var14 = this.field560[var10] - arg2;
                if (var14 >= var6.field553 && var14 <= var6.field534) {
                    int var15 = this.field547[var10] - arg1;
                    if (var15 >= var6.field537 && var15 <= var6.field541) {
                        int var16 = this.field555[var10] - arg3;
                        if (var16 >= var6.field556 && var16 <= var6.field568) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class17 var18 = var6.field535[var17];
                                if (var8[var17] == var15 && var6.field555[var17] == var16 && var6.field560[var17] == var14 && var18.field477 != 0) {
                                    if (this.field522 == null) {
                                        this.field522 = new class17[this.field559];
                                    }
                                    if (var6.field522 == null) {
                                        var6.field522 = new class17[var9];
                                    }
                                    class17 var19 = this.field522[var10];
                                    if (var19 == null) {
                                        var19 = this.field522[var10] = new class17(var13);
                                    }
                                    class17 var20 = var6.field522[var17];
                                    if (var20 == null) {
                                        var20 = var6.field522[var17] = new class17(var18);
                                    }
                                    var19.field474 += var18.field474;
                                    var19.field472 += var18.field472;
                                    var19.field468 += var18.field468;
                                    var19.field477 += var18.field477;
                                    var20.field474 += var13.field474;
                                    var20.field472 += var13.field472;
                                    var20.field468 += var13.field468;
                                    var20.field477 += var13.field477;
                                    var7++;
                                    field546[var10] = field531;
                                    field558[var17] = field531;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field529; var11++) {
            if (field546[this.field539[var11]] == field531 && field546[this.field543[var11]] == field531 && field546[this.field532[var11]] == field531) {
                if (this.field524 == null) {
                    this.field524 = new byte[this.field529];
                }
                this.field524[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field529; var12++) {
            if (field558[var6.field539[var12]] == field531 && field558[var6.field543[var12]] == field531 && field558[var6.field532[var12]] == field531) {
                if (var6.field524 == null) {
                    var6.field524 = new byte[var6.field529];
                }
                var6.field524[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lni;IS)I")
    private final int method152(class20 arg0, int arg1, short arg2) {
        int var4 = arg0.field547[arg1];
        int var5 = arg0.field560[arg1];
        int var6 = arg0.field555[arg1];
        for (int var7 = 0; var7 < this.field559; var7++) {
            if (this.field547[var7] == var4 && this.field560[var7] == var5 && this.field555[var7] == var6) {
                return var7;
            }
        }
        this.field547[this.field559] = var4;
        this.field560[this.field559] = var5;
        this.field555[this.field559] = var6;
        if (arg0.field523 != null) {
            this.field523[this.field559] = arg0.field523[arg1];
        }
        return this.field559++;
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "()V")
    public final void method153() {
        int var10002;
        if (this.field523 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field559; var3++) {
                int var7 = this.field523[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field536 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field536[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field559) {
                int var6 = this.field523[var5];
                this.field536[var6][var1[var6]++] = var5++;
            }
            this.field523 = null;
        }
        if (this.field538 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field529; var10++) {
            int var14 = this.field538[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field527 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field527[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field529) {
            int var13 = this.field538[var12];
            this.field527[var13][var8[var13]++] = var12++;
        }
        this.field538 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[[I[[IIIIZZ)Lni;")
    public final class20 method154(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method139();
        int var10 = this.field537 + arg4;
        int var11 = this.field541 + arg4;
        int var12 = this.field556 + arg6;
        int var13 = this.field568 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class20 var18;
        if (arg7) {
            var18 = new class20();
            var18.field559 = this.field559;
            var18.field529 = this.field529;
            var18.field569 = this.field569;
            var18.field539 = this.field539;
            var18.field543 = this.field543;
            var18.field532 = this.field532;
            var18.field524 = this.field524;
            var18.field533 = this.field533;
            var18.field528 = this.field528;
            var18.field565 = this.field565;
            var18.field562 = this.field562;
            var18.field563 = this.field563;
            var18.field542 = this.field542;
            var18.field552 = this.field552;
            var18.field530 = this.field530;
            var18.field561 = this.field561;
            var18.field544 = this.field544;
            var18.field548 = this.field548;
            var18.field566 = this.field566;
            var18.field554 = this.field554;
            var18.field526 = this.field526;
            var18.field550 = this.field550;
            var18.field545 = this.field545;
            var18.field570 = this.field570;
            var18.field557 = this.field557;
            var18.field523 = this.field523;
            var18.field538 = this.field538;
            var18.field536 = this.field536;
            var18.field527 = this.field527;
            var18.field564 = this.field564;
            var18.field549 = this.field549;
            var18.field535 = this.field535;
            var18.field540 = this.field540;
            var18.field522 = this.field522;
            if (arg0 == 3) {
                var18.field547 = class168.method1112(114, this.field547);
                var18.field560 = class168.method1112(-69, this.field560);
                var18.field555 = class168.method1112(91, this.field555);
            } else {
                var18.field547 = this.field547;
                var18.field560 = new int[var18.field559];
                var18.field555 = this.field555;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field559; var19++) {
                int var20 = this.field547[var19] + arg4;
                int var21 = this.field555[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field560[var19] = this.field560[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field559; var29++) {
                int var30 = (this.field560[var29] << 16) / this.field553;
                if (var30 < arg1) {
                    int var31 = this.field547[var29] + arg4;
                    int var32 = this.field555[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field560[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field560[var29];
                } else {
                    var18.field560[var29] = this.field560[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method171(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field534 - this.field553;
            for (int var43 = 0; var43 < this.field559; var43++) {
                int var44 = this.field547[var43] + arg4;
                int var45 = this.field555[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field560[var43] = var52 + this.field560[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field534 - this.field553;
            for (int var54 = 0; var54 < this.field559; var54++) {
                int var55 = this.field547[var54] + arg4;
                int var56 = this.field555[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field560[var54] = ((this.field560[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method160();
        } else {
            this.field525 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "()V")
    public static void method155() {
        field546 = null;
        field558 = null;
        field567 = null;
        field551 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([B)V")
    private final void method156(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class135 var4 = new class135(arg0);
        class135 var5 = new class135(arg0);
        class135 var6 = new class135(arg0);
        class135 var7 = new class135(arg0);
        class135 var8 = new class135(arg0);
        var4.field2449 = arg0.length - 18;
        int var9 = var4.method927(125);
        int var10 = var4.method927(126);
        int var11 = var4.method920((byte) 54);
        int var12 = var4.method920((byte) 58);
        int var13 = var4.method920((byte) 81);
        int var14 = var4.method920((byte) 108);
        int var15 = var4.method920((byte) 34);
        int var16 = var4.method920((byte) 34);
        int var17 = var4.method927(126);
        int var18 = var4.method927(127);
        int var19 = var4.method927(126);
        int var20 = var4.method927(125);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field559 = var9;
        this.field529 = var10;
        this.field569 = var11;
        this.field547 = new int[var9];
        this.field560 = new int[var9];
        this.field555 = new int[var9];
        this.field539 = new int[var10];
        this.field543 = new int[var10];
        this.field532 = new int[var10];
        if (var11 > 0) {
            this.field552 = new byte[var11];
            this.field530 = new short[var11];
            this.field561 = new short[var11];
            this.field544 = new short[var11];
        }
        if (var16 == 1) {
            this.field523 = new int[var9];
        }
        if (var12 == 1) {
            this.field524 = new byte[var10];
            this.field565 = new byte[var10];
            this.field563 = new short[var10];
        }
        if (var13 == 255) {
            this.field533 = new byte[var10];
        } else {
            this.field542 = (byte) var13;
        }
        if (var14 == 1) {
            this.field528 = new byte[var10];
        }
        if (var15 == 1) {
            this.field538 = new int[var10];
        }
        this.field562 = new short[var10];
        var4.field2449 = var21;
        var5.field2449 = var36;
        var6.field2449 = var38;
        var7.field2449 = var40;
        var8.field2449 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method920((byte) 123);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method940(false);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method940(false);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method940(false);
            }
            this.field547[var46] = var43 + var63;
            this.field560[var46] = var44 + var64;
            this.field555[var46] = var45 + var65;
            var43 = this.field547[var46];
            var44 = this.field560[var46];
            var45 = this.field555[var46];
            if (var16 == 1) {
                this.field523[var46] = var8.method920((byte) 103);
            }
        }
        var4.field2449 = var32;
        var5.field2449 = var28;
        var6.field2449 = var26;
        var7.field2449 = var30;
        var8.field2449 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field562[var47] = (short) var4.method927(125);
            if (var12 == 1) {
                int var61 = var5.method920((byte) 50);
                if ((var61 & 0x1) == 1) {
                    this.field524[var47] = 1;
                    var2 = true;
                } else {
                    this.field524[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field565[var47] = (byte) (var61 >> 2);
                    this.field563[var47] = this.field562[var47];
                    this.field562[var47] = 127;
                    if (this.field563[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field565[var47] = -1;
                    this.field563[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field533[var47] = var6.method929((byte) -3);
            }
            if (var14 == 1) {
                this.field528[var47] = var7.method929((byte) -3);
            }
            if (var15 == 1) {
                this.field538[var47] = var8.method920((byte) 93);
            }
        }
        var4.field2449 = var25;
        var5.field2449 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method920((byte) 77);
            if (var57 == 1) {
                var48 = var4.method940(false) + var51;
                var49 = var4.method940(false) + var48;
                var50 = var4.method940(false) + var49;
                var51 = var50;
                this.field539[var52] = var48;
                this.field543[var52] = var49;
                this.field532[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method940(false) + var51;
                var51 = var50;
                this.field539[var52] = var48;
                this.field543[var52] = var49;
                this.field532[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method940(false) + var51;
                var51 = var50;
                this.field539[var52] = var48;
                this.field543[var52] = var49;
                this.field532[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method940(false) + var51;
                var51 = var50;
                this.field539[var52] = var48;
                this.field543[var52] = var60;
                this.field532[var52] = var50;
            }
        }
        var4.field2449 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field552[var53] = 0;
            this.field530[var53] = (short) var4.method927(125);
            this.field561[var53] = (short) var4.method927(125);
            this.field544[var53] = (short) var4.method927(126);
        }
        if (this.field565 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field565[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field530[var56] & 0xFFFF) == this.field539[var55] && (this.field561[var56] & 0xFFFF) == this.field543[var55] && (this.field544[var56] & 0xFFFF) == this.field532[var55]) {
                        this.field565[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field565 = null;
            }
        }
        if (!var3) {
            this.field563 = null;
        }
        if (!var2) {
            this.field524 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lfl;II)Lni;")
    public static final class20 method157(class192 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1332(true, arg2, arg1);
        return var3 == null ? null : new class20(var3);
    }

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "()V")
    public final void method158() {
        for (int var1 = 0; var1 < this.field559; var1++) {
            this.field555[var1] = -this.field555[var1];
        }
        for (int var2 = 0; var2 < this.field529; var2++) {
            int var3 = this.field539[var2];
            this.field539[var2] = this.field532[var2];
            this.field532[var2] = var3;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "()V")
    public final void method159() {
        for (int var1 = 0; var1 < this.field559; var1++) {
            int var2 = this.field547[var1];
            this.field547[var1] = this.field555[var1];
            this.field555[var1] = -var2;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "()V")
    private final void method160() {
        this.field535 = null;
        this.field522 = null;
        this.field540 = null;
        this.field525 = false;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(SS)V")
    public final void method161(short arg0, short arg1) {
        if (this.field563 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field529; var3++) {
            if (this.field563[var3] == arg0) {
                this.field563[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[III)I")
    private static final int method162(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public final void method163(int arg0) {
        int var2 = field567[arg0];
        int var3 = field551[arg0];
        for (int var4 = 0; var4 < this.field559; var4++) {
            int var5 = this.field555[var4] * var2 + this.field547[var4] * var3 >> 16;
            this.field555[var4] = this.field555[var4] * var3 - this.field547[var4] * var2 >> 16;
            this.field547[var4] = var5;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIJILbe;)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class255 arg10) {
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Z")
    public final boolean method165() {
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([B)V")
    private final void method166(byte[] arg0) {
        class135 var2 = new class135(arg0);
        class135 var3 = new class135(arg0);
        class135 var4 = new class135(arg0);
        class135 var5 = new class135(arg0);
        class135 var6 = new class135(arg0);
        class135 var7 = new class135(arg0);
        class135 var8 = new class135(arg0);
        var2.field2449 = arg0.length - 23;
        int var9 = var2.method927(125);
        int var10 = var2.method927(127);
        int var11 = var2.method920((byte) 104);
        int var12 = var2.method920((byte) 26);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method920((byte) 100);
        int var16 = var2.method920((byte) 45);
        int var17 = var2.method920((byte) 52);
        int var18 = var2.method920((byte) 22);
        int var19 = var2.method920((byte) 63);
        int var20 = var2.method927(127);
        int var21 = var2.method927(125);
        int var22 = var2.method927(126);
        int var23 = var2.method927(126);
        int var24 = var2.method927(127);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field552 = new byte[var11];
            var2.field2449 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field552[var28] = var2.method929((byte) -3);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field559 = var9;
        this.field529 = var10;
        this.field569 = var11;
        this.field547 = new int[var9];
        this.field560 = new int[var9];
        this.field555 = new int[var9];
        this.field539 = new int[var10];
        this.field543 = new int[var10];
        this.field532 = new int[var10];
        if (var19 == 1) {
            this.field523 = new int[var9];
        }
        if (var13) {
            this.field524 = new byte[var10];
        }
        if (var15 == 255) {
            this.field533 = new byte[var10];
        } else {
            this.field542 = (byte) var15;
        }
        if (var16 == 1) {
            this.field528 = new byte[var10];
        }
        if (var17 == 1) {
            this.field538 = new int[var10];
        }
        if (var18 == 1) {
            this.field563 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field565 = new byte[var10];
        }
        this.field562 = new short[var10];
        if (var11 > 0) {
            this.field530 = new short[var11];
            this.field561 = new short[var11];
            this.field544 = new short[var11];
            if (var26 > 0) {
                this.field548 = new short[var26];
                this.field566 = new short[var26];
                this.field554 = new short[var26];
                this.field526 = new byte[var26];
                this.field550 = new byte[var26];
                this.field545 = new byte[var26];
            }
            if (var27 > 0) {
                this.field570 = new byte[var27];
                this.field557 = new byte[var27];
            }
        }
        var2.field2449 = var11;
        var3.field2449 = var46;
        var4.field2449 = var48;
        var5.field2449 = var50;
        var6.field2449 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method920((byte) 103);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method940(false);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method940(false);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method940(false);
            }
            this.field547[var69] = var66 + var85;
            this.field560[var69] = var67 + var86;
            this.field555[var69] = var68 + var87;
            var66 = this.field547[var69];
            var67 = this.field560[var69];
            var68 = this.field555[var69];
            if (var19 == 1) {
                this.field523[var69] = var6.method920((byte) 72);
            }
        }
        var2.field2449 = var44;
        var3.field2449 = var33;
        var4.field2449 = var36;
        var5.field2449 = var39;
        var6.field2449 = var37;
        var7.field2449 = var42;
        var8.field2449 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field562[var70] = (short) var2.method927(125);
            if (var13) {
                this.field524[var70] = var3.method929((byte) -3);
            }
            if (var15 == 255) {
                this.field533[var70] = var4.method929((byte) -3);
            }
            if (var16 == 1) {
                this.field528[var70] = var5.method929((byte) -3);
            }
            if (var17 == 1) {
                this.field538[var70] = var6.method920((byte) 60);
            }
            if (var18 == 1) {
                this.field563[var70] = (short) (var7.method927(126) - 1);
            }
            if (this.field565 != null) {
                if (this.field563[var70] == -1) {
                    this.field565[var70] = -1;
                } else {
                    this.field565[var70] = (byte) (var8.method920((byte) 47) - 1);
                }
            }
        }
        var2.field2449 = var35;
        var3.field2449 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method920((byte) 40);
            if (var80 == 1) {
                var71 = var2.method940(false) + var74;
                var72 = var2.method940(false) + var71;
                var73 = var2.method940(false) + var72;
                var74 = var73;
                this.field539[var75] = var71;
                this.field543[var75] = var72;
                this.field532[var75] = var73;
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method940(false) + var74;
                var74 = var73;
                this.field539[var75] = var71;
                this.field543[var75] = var72;
                this.field532[var75] = var73;
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method940(false) + var74;
                var74 = var73;
                this.field539[var75] = var71;
                this.field543[var75] = var72;
                this.field532[var75] = var73;
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method940(false) + var74;
                var74 = var73;
                this.field539[var75] = var71;
                this.field543[var75] = var83;
                this.field532[var75] = var73;
            }
        }
        var2.field2449 = var52;
        var3.field2449 = var54;
        var4.field2449 = var56;
        var5.field2449 = var58;
        var6.field2449 = var60;
        var7.field2449 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field552[var76] & 0xFF;
            if (var79 == 0) {
                this.field530[var76] = (short) var2.method927(125);
                this.field561[var76] = (short) var2.method927(125);
                this.field544[var76] = (short) var2.method927(126);
            }
            if (var79 == 1) {
                this.field530[var76] = (short) var3.method927(125);
                this.field561[var76] = (short) var3.method927(126);
                this.field544[var76] = (short) var3.method927(125);
                this.field548[var76] = (short) var4.method927(126);
                this.field566[var76] = (short) var4.method927(126);
                this.field554[var76] = (short) var4.method927(125);
                this.field526[var76] = var5.method929((byte) -3);
                this.field550[var76] = var6.method929((byte) -3);
                this.field545[var76] = var7.method929((byte) -3);
            }
            if (var79 == 2) {
                this.field530[var76] = (short) var3.method927(125);
                this.field561[var76] = (short) var3.method927(126);
                this.field544[var76] = (short) var3.method927(125);
                this.field548[var76] = (short) var4.method927(125);
                this.field566[var76] = (short) var4.method927(127);
                this.field554[var76] = (short) var4.method927(127);
                this.field526[var76] = var5.method929((byte) -3);
                this.field550[var76] = var6.method929((byte) -3);
                this.field545[var76] = var7.method929((byte) -3);
                this.field570[var76] = var7.method929((byte) -3);
                this.field557[var76] = var7.method929((byte) -3);
            }
            if (var79 == 3) {
                this.field530[var76] = (short) var3.method927(126);
                this.field561[var76] = (short) var3.method927(127);
                this.field544[var76] = (short) var3.method927(127);
                this.field548[var76] = (short) var4.method927(125);
                this.field566[var76] = (short) var4.method927(127);
                this.field554[var76] = (short) var4.method927(126);
                this.field526[var76] = var5.method929((byte) -3);
                this.field550[var76] = var6.method929((byte) -3);
                this.field545[var76] = var7.method929((byte) -3);
            }
        }
        if (!var14) {
            return;
        }
        var2.field2449 = var64;
        int var77 = var2.method920((byte) 108);
        if (var77 > 0) {
            var2.field2449 += var77 * 4;
        }
        int var78 = var2.method920((byte) 92);
        if (var78 > 0) {
            var2.field2449 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(III)V")
    public final void method167(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field559; var4++) {
            this.field547[var4] = this.field547[var4] * arg0 / 128;
            this.field560[var4] = this.field560[var4] * arg1 / 128;
            this.field555[var4] = this.field555[var4] * arg2 / 128;
        }
        this.method160();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIIII)Lh;")
    public final class185 method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class185(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Ldk;")
    public final class179 method169(int arg0, int arg1, int arg2) {
        return this.method172(this.field564, this.field549, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIBSB)I")
    public final int method170(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field539[this.field529] = arg0;
        this.field543[this.field529] = arg1;
        this.field532[this.field529] = arg2;
        this.field524[this.field529] = arg3;
        this.field565[this.field529] = -1;
        this.field562[this.field529] = arg4;
        this.field563[this.field529] = -1;
        this.field528[this.field529] = arg5;
        return this.field529++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[IIIIII)V")
    private final void method171(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method162(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method162(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method162(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method162(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method140(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method147(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method143(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(IIIII)Luh;")
    public final class235 method172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class185(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    private class20() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V")
    private class20(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method166(arg0);
        } else {
            this.method156(arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(III)V")
    public class20(int arg0, int arg1, int arg2) {
        this.field547 = new int[arg0];
        this.field560 = new int[arg0];
        this.field555 = new int[arg0];
        this.field523 = new int[arg0];
        this.field539 = new int[arg1];
        this.field543 = new int[arg1];
        this.field532 = new int[arg1];
        this.field524 = new byte[arg1];
        this.field533 = new byte[arg1];
        this.field528 = new byte[arg1];
        this.field562 = new short[arg1];
        this.field563 = new short[arg1];
        this.field565 = new byte[arg1];
        this.field538 = new int[arg1];
        if (arg2 > 0) {
            this.field552 = new byte[arg2];
            this.field530 = new short[arg2];
            this.field561 = new short[arg2];
            this.field544 = new short[arg2];
            this.field548 = new short[arg2];
            this.field566 = new short[arg2];
            this.field554 = new short[arg2];
            this.field526 = new byte[arg2];
            this.field550 = new byte[arg2];
            this.field545 = new byte[arg2];
            this.field570 = new byte[arg2];
            this.field557 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([Lni;I)V")
    public class20(class20[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field559 = 0;
        this.field529 = 0;
        this.field569 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field542 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class20 var20 = arg0[var11];
            if (var20 != null) {
                this.field559 += var20.field559;
                this.field529 += var20.field529;
                this.field569 += var20.field569;
                if (var20.field533 == null) {
                    if (this.field542 == -1) {
                        this.field542 = var20.field542;
                    }
                    if (this.field542 != var20.field542) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var20.field524 != null;
                var5 |= var20.field528 != null;
                var6 |= var20.field538 != null;
                var7 |= var20.field563 != null;
                var8 |= var20.field565 != null;
            }
        }
        this.field547 = new int[this.field559];
        this.field560 = new int[this.field559];
        this.field555 = new int[this.field559];
        this.field523 = new int[this.field559];
        this.field539 = new int[this.field529];
        this.field543 = new int[this.field529];
        this.field532 = new int[this.field529];
        if (var3) {
            this.field524 = new byte[this.field529];
        }
        if (var4) {
            this.field533 = new byte[this.field529];
        }
        if (var5) {
            this.field528 = new byte[this.field529];
        }
        if (var6) {
            this.field538 = new int[this.field529];
        }
        if (var7) {
            this.field563 = new short[this.field529];
        }
        if (var8) {
            this.field565 = new byte[this.field529];
        }
        this.field562 = new short[this.field529];
        if (this.field569 > 0) {
            this.field552 = new byte[this.field569];
            this.field530 = new short[this.field569];
            this.field561 = new short[this.field569];
            this.field544 = new short[this.field569];
            this.field548 = new short[this.field569];
            this.field566 = new short[this.field569];
            this.field554 = new short[this.field569];
            this.field526 = new byte[this.field569];
            this.field550 = new byte[this.field569];
            this.field545 = new byte[this.field569];
            this.field570 = new byte[this.field569];
            this.field557 = new byte[this.field569];
        }
        this.field559 = 0;
        this.field529 = 0;
        this.field569 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class20 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field529; var17++) {
                    if (var3 && var16.field524 != null) {
                        this.field524[this.field529] = var16.field524[var17];
                    }
                    if (var4) {
                        if (var16.field533 == null) {
                            this.field533[this.field529] = var16.field542;
                        } else {
                            this.field533[this.field529] = var16.field533[var17];
                        }
                    }
                    if (var5 && var16.field528 != null) {
                        this.field528[this.field529] = var16.field528[var17];
                    }
                    if (var6 && var16.field538 != null) {
                        this.field538[this.field529] = var16.field538[var17];
                    }
                    if (var7) {
                        if (var16.field563 == null) {
                            this.field563[this.field529] = -1;
                        } else {
                            this.field563[this.field529] = var16.field563[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field565 == null || var16.field565[var17] == -1) {
                            this.field565[this.field529] = -1;
                        } else {
                            this.field565[this.field529] = (byte) (var16.field565[var17] + this.field569);
                        }
                    }
                    this.field562[this.field529] = var16.field562[var17];
                    this.field539[this.field529] = this.method152(var16, var16.field539[var17], var15);
                    this.field543[this.field529] = this.method152(var16, var16.field543[var17], var15);
                    this.field532[this.field529] = this.method152(var16, var16.field532[var17], var15);
                    this.field529++;
                }
                for (int var18 = 0; var18 < var16.field569; var18++) {
                    byte var19 = this.field552[this.field569] = var16.field552[var18];
                    if (var19 == 0) {
                        this.field530[this.field569] = (short) this.method152(var16, var16.field530[var18], var15);
                        this.field561[this.field569] = (short) this.method152(var16, var16.field561[var18], var15);
                        this.field544[this.field569] = (short) this.method152(var16, var16.field544[var18], var15);
                    }
                    if (var19 >= 1 && var19 <= 3) {
                        this.field530[this.field569] = var16.field530[var18];
                        this.field561[this.field569] = var16.field561[var18];
                        this.field544[this.field569] = var16.field544[var18];
                        this.field548[this.field569] = var16.field548[var18];
                        this.field566[this.field569] = var16.field566[var18];
                        this.field554[this.field569] = var16.field554[var18];
                        this.field526[this.field569] = var16.field526[var18];
                        this.field550[this.field569] = var16.field550[var18];
                        this.field545[this.field569] = var16.field545[var18];
                    }
                    if (var19 == 2) {
                        this.field570[this.field569] = var16.field570[var18];
                        this.field557[this.field569] = var16.field557[var18];
                    }
                    this.field569++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lni;ZZZZ)V")
    public class20(class20 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field559 = arg0.field559;
        this.field529 = arg0.field529;
        this.field569 = arg0.field569;
        if (arg1) {
            this.field547 = arg0.field547;
            this.field560 = arg0.field560;
            this.field555 = arg0.field555;
        } else {
            this.field547 = new int[this.field559];
            this.field560 = new int[this.field559];
            this.field555 = new int[this.field559];
            for (int var6 = 0; var6 < this.field559; var6++) {
                this.field547[var6] = arg0.field547[var6];
                this.field560[var6] = arg0.field560[var6];
                this.field555[var6] = arg0.field555[var6];
            }
        }
        if (arg2) {
            this.field562 = arg0.field562;
        } else {
            this.field562 = new short[this.field529];
            for (int var7 = 0; var7 < this.field529; var7++) {
                this.field562[var7] = arg0.field562[var7];
            }
        }
        if (arg3 || arg0.field563 == null) {
            this.field563 = arg0.field563;
        } else {
            this.field563 = new short[this.field529];
            for (int var8 = 0; var8 < this.field529; var8++) {
                this.field563[var8] = arg0.field563[var8];
            }
        }
        if (arg4) {
            this.field528 = arg0.field528;
        } else {
            this.field528 = new byte[this.field529];
            if (arg0.field528 == null) {
                for (int var9 = 0; var9 < this.field529; var9++) {
                    this.field528[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field529; var10++) {
                    this.field528[var10] = arg0.field528[var10];
                }
            }
        }
        this.field539 = arg0.field539;
        this.field543 = arg0.field543;
        this.field532 = arg0.field532;
        this.field524 = arg0.field524;
        this.field533 = arg0.field533;
        this.field565 = arg0.field565;
        this.field542 = arg0.field542;
        this.field552 = arg0.field552;
        this.field530 = arg0.field530;
        this.field561 = arg0.field561;
        this.field544 = arg0.field544;
        this.field548 = arg0.field548;
        this.field566 = arg0.field566;
        this.field554 = arg0.field554;
        this.field526 = arg0.field526;
        this.field550 = arg0.field550;
        this.field545 = arg0.field545;
        this.field570 = arg0.field570;
        this.field557 = arg0.field557;
        this.field523 = arg0.field523;
        this.field538 = arg0.field538;
        this.field536 = arg0.field536;
        this.field527 = arg0.field527;
        this.field535 = arg0.field535;
        this.field540 = arg0.field540;
        this.field522 = arg0.field522;
        this.field564 = arg0.field564;
        this.field549 = arg0.field549;
    }
}
