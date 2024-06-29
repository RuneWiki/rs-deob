import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class116 {

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "Lsi;")
    private class560 field1527;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "Luv;")
    private class367 field1523;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "[B")
    public byte[] field1532;

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Z")
    public static boolean field1519 = false;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "Llga;")
    public static class712 field1533 = new class712(39, 8);

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "Llga;")
    public static class712 field1541 = new class712(32, 0);

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "Lea;")
    public static class547 field1542 = new class547(103, 7);

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    public static volatile int field1543 = -1;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Z")
    public static boolean field1544 = false;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "[I")
    public static int[] field1540;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "[[Lmj;")
    private class654[][] field1538;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ[[ZIII)V")
    public final void method763(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field1531++;
        this.field1523.method2131(false, -89);
        this.field1523.method2142(0, false);
        this.field1523.method2145(1, 106);
        this.field1523.method2153(1, (byte) 76);
        this.field1523.method2167(false, 0, -2, false);
        if (arg5 <= 15) {
            field1526 = -11;
        }
        float var7 = 1.0F / (float) (this.field1523.field5045 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field1529; var8++) {
                int var9 = var8 << this.field1528;
                int var10 = var8 + 1 << this.field1528;
                label145: for (int var11 = 0; var11 < this.field1534; var11++) {
                    if (this.field1538[var11][var8] != null) {
                        int var12 = var11 << this.field1528;
                        int var13 = var11 + 1 << this.field1528;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg4 <= var14 - arg0 && arg4 >= var14 - arg0) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg3 >= -arg4 && arg4 >= var15 - arg3 && arg2[var14 + arg4 - arg0][var15 + arg4 - arg3]) {
                                        class648 var16 = this.field1523.method2119((byte) -89);
                                        var16.method3665(var7, (byte) -113, var7, 1.0F);
                                        var16.method39(-var11, -var8, 0);
                                        this.field1523.method2149(class536.field7270, (byte) 81);
                                        this.field1538[var11][var8].method3688(30925);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1529; var17++) {
                int var18 = var17 << this.field1528;
                int var19 = var17 + 1 << this.field1528;
                for (int var20 = 0; var20 < this.field1534; var20++) {
                    class654 var21 = this.field1538[var20][var17];
                    if (var21 != null) {
                        class562 var22 = this.field1523.method2123(61, var21.field9104 * 3);
                        Buffer var23 = var22.method179(true, -116);
                        if (var23 != null) {
                            Stream var24 = this.field1523.method2170(24022, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field1528;
                            int var27 = var20 + 1 << this.field1528;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg4 <= var28 - arg3 && var28 - arg3 <= arg4) {
                                    int var30 = this.field1527.field3727 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((var31 - arg0) >= (-arg4) && arg4 >= var31 - arg0 && arg2[var31 + arg4 - arg0][var28 + arg4 - arg3]) {
                                            short[] var32 = this.field1527.field7883[var30];
                                            if (var32 != null) {
                                                if (Stream.method3786()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3791(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method3792(var32[var33] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3795();
                            if (var22.method178((byte) -99) && var25 > 0) {
                                class648 var29 = this.field1523.method2119((byte) -78);
                                var29.method3665(var7, (byte) -124, var7, 1.0F);
                                var29.method39(-var20, -var17, 0);
                                this.field1523.method2149(class536.field7270, (byte) 94);
                                var21.method3690(-18732, var22, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field1523.method2135(2);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z")
    public static final boolean method764(int arg0, int arg1, int arg2) {
        field1530++;
        if (arg1 != 1) {
            method769(-41);
        }
        return class257.method1545(arg2, (byte) -49, arg0) || class601.method3331(arg2, (byte) -124, arg0);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
    public final void method765(byte arg0) {
        this.field1538 = new class654[this.field1534][this.field1529];
        if (arg0 >= -9) {
            this.field1528 = 95;
        }
        field1520++;
        for (int var2 = 0; var2 < this.field1529; var2++) {
            for (int var3 = 0; var3 < this.field1534; var3++) {
                this.field1538[var3][var2] = new class654(this.field1523, this, this.field1527, var3, var2, this.field1528, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field1538[var3][var2].field9104 == 0) {
                    this.field1538[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIII)V")
    private final void method766(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1522++;
        if (this.field1538 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        if (arg0 != -30590) {
            this.method763(80, true, null, -46, -43, -39);
        }
        int var9 = arg4 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class654[] var11 = this.field1538[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field9117 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lr;IBI)V")
    public final void method767(class184 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 46) {
            field1526 = -82;
        }
        field1525++;
        class601 var5 = (class601) arg0;
        int var6 = var5.field8368 + arg1 + 1;
        int var7 = var5.field8362 + arg3 + 1;
        int var8 = this.field1536 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field8371;
        int var11 = var5.field8363;
        int var12 = this.field1536 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field1536 * var14;
        }
        if (this.field1535 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field1535;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var13 += var16;
            var6 = 1;
            var12 += var16;
        }
        if (this.field1536 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field1536;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class601.method3333(var9, this.field1532, var10, 1230470320, var12, var11, var13, var5.field8372, var8);
            this.method766(-30590, var7, var6, var11, var10);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lr;BII)V")
    public final void method768(class184 arg0, byte arg1, int arg2, int arg3) {
        field1539++;
        class601 var5 = (class601) arg0;
        int var6 = var5.field8362 + arg3 + 1;
        int var7 = var5.field8368 + arg2 + 1;
        int var8 = this.field1536 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field8371;
        if (arg1 > -84) {
            method764(23, 21, -126);
        }
        int var11 = var5.field8363;
        int var12 = this.field1536 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += var11 * var13;
            var8 += this.field1536 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field1535) {
            int var15 = var6 + var10 + 1 - this.field1535;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var11 -= var16;
            var7 = 1;
            var14 += var16;
            var12 += var16;
            var9 += var16;
        }
        if (this.field1536 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field1536;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class94.method650(var10, var12, var14, var11, this.field1532, false, var9, var5.field8372, var8);
            this.method766(-30590, var6, var7, var11, var10);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public static void method769(int arg0) {
        field1542 = null;
        field1541 = null;
        if (arg0 != 8) {
            field1543 = -128;
        }
        field1540 = null;
        field1533 = null;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Luv;Lsi;)V")
    public class116(class367 arg0, class560 arg1) {
        this.field1527 = arg1;
        this.field1523 = arg0;
        this.field1536 = (this.field1527.field3730 * this.field1527.field3727 >> this.field1523.field5065) + 2;
        this.field1535 = (this.field1527.field3730 * this.field1527.field3728 >> this.field1523.field5065) + 2;
        this.field1528 = this.field1523.field5065 + 7 - this.field1527.field3722;
        this.field1532 = new byte[this.field1536 * this.field1535];
        this.field1534 = this.field1527.field3727 >> this.field1528;
        this.field1529 = this.field1527.field3728 >> this.field1528;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method770(int arg0, class184 arg1, int arg2, int arg3) {
        field1524++;
        class601 var5 = (class601) arg1;
        int var6 = var5.field8368 + arg3 + 1;
        int var7 = var5.field8362 + arg0 + 1;
        int var8 = this.field1536 * var7 + var6;
        int var9 = var5.field8371;
        int var10 = var5.field8363;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var8 += this.field1536 * var11;
            var7 = 1;
            var9 -= var11;
        }
        int var12 = this.field1536 - var10;
        if (var7 + var9 >= this.field1535) {
            int var13 = var7 + var9 + 1 - this.field1535;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field1536 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field1536;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            int var17 = (arg2 - 1) * this.field1536 + var12;
            return class519.method2863(var8, var17, var10, this.field1532, arg2, 14849, var9);
        } else {
            return false;
        }
    }
}
