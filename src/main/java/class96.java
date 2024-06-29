import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class96 extends class208 {

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    private int field1531 = -1;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    private int field1535 = -32768;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lka;")
    private class134 field1534 = null;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    private int field1552 = -1;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lqa;")
    private class254 field1532;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Ljd;")
    public static class265 field1540 = new class265(20);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lsc;")
    public static class181 field1541 = class149.method967(255, ": ");

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Lni;")
    public static class118 field1550;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "[Ltg;")
    public static class107[] field1554;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 != -15) {
            return;
        }
        field1545++;
        int var9 = arg7 - arg1;
        int var10 = (arg6 - arg0 << 16) / var9;
        int var11 = arg2 - arg4;
        int var12 = (arg3 - arg8 << 16) / var11;
        class212.method1406(103, var10, arg1, var12, 0, arg0, arg4, 0, arg2, arg7, arg8);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
    private final void method635(int arg0, int arg1, int arg2) {
        field1539++;
        if (this.field1532 != null) {
            int var4 = class237.field4125 - this.field1536;
            if (var4 > 100 && this.field1532.field4424 > 0) {
                int var5 = this.field1532.field4431.length - this.field1532.field4424;
                while (var5 > this.field1542 && var4 > this.field1532.field4456[this.field1542]) {
                    var4 -= this.field1532.field4456[this.field1542];
                    this.field1542++;
                }
                if (var5 <= this.field1542) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1532.field4431.length; var7++) {
                        var6 += this.field1532.field4456[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field1532.field4456[this.field1542]) {
                            break label62;
                        }
                        class211.method1396(arg0, -1287515740, arg1, this.field1532, false, this.field1542);
                        var4 -= this.field1532.field4456[this.field1542];
                        this.field1542++;
                    } while (this.field1542 < this.field1532.field4431.length);
                    this.field1542 -= this.field1532.field4424;
                } while (this.field1542 >= 0 && this.field1532.field4431.length > this.field1542);
                this.field1532 = null;
            }
            this.field1536 = class237.field4125 - var4;
        }
        if (arg2 != 26501) {
            this.method194(47, 84, -22, 16, 122, 123, 9, -66, 127L);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1544++;
        class208 var11 = this.method637(-123);
        if (var11 != null) {
            var11.method194(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1535 = var11.method190();
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIII)V")
    public final void method636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method635((arg2 + (arg1 - arg2 >> 1)) * 128 + 64, ((-arg0 + arg4 >> 1) + arg0) * 128 + 64, 26501);
        if (arg3 != 17855) {
            this.field1542 = 92;
        }
        field1549++;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Laf;")
    private final class208 method637(int arg0) {
        int var2 = -110 % ((arg0 + 79) / 43);
        field1533++;
        return this.method639(false, (byte) 120);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static void method638(int arg0) {
        field1541 = null;
        field1550 = null;
        field1554 = null;
        if (arg0 >= -106) {
            field1541 = null;
        }
        field1540 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
    public final int method190() {
        field1543++;
        return this.field1535;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)Laf;")
    private final class208 method639(boolean arg0, byte arg1) {
        boolean var3 = class31.field505 != class21.field379;
        field1547++;
        class148 var4 = class62.method442((byte) 79, this.field1537);
        if (var4.field2446 != null) {
            var4 = var4.method966((byte) 126);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field1548 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2466;
            var7 = var4.field2433;
        } else {
            var6 = var4.field2433;
            var7 = var4.field2466;
        }
        int var8 = (var6 >> 1) + this.field1553;
        int var9 = (var6 + 1 >> 1) + this.field1553;
        int var10 = this.field1538 + (var7 >> 1);
        int var11 = this.field1538 + (var7 + 1 >> 1);
        this.method635(var8 * 128, var10 * 128, arg1 + 26381);
        boolean var12 = !var3 && var4.field2448 && (this.field1531 != var4.field2431 || this.field1552 != this.field1542 && class184.field3252 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class31.field505[this.field1530];
        int var14 = (this.field1553 << 7) + (var6 << 6);
        int var15 = (this.field1538 << 7) + (var7 << 6);
        int var16 = var13[var10][var8] + var13[var11][var8] + var13[var10][var9] + var13[var11][var9] >> 2;
        if (arg1 != 120) {
            this.field1532 = null;
        }
        int[][] var17 = null;
        boolean var18 = this.field1534 == null;
        if (var3) {
            var17 = class21.field379[0];
        } else if (this.field1530 < 3) {
            var17 = class31.field505[this.field1530 + 1];
        }
        class260 var19;
        if (this.field1532 == null) {
            var19 = var4.method954(var14, false, (byte) 115, var13, var17, var15, var18 ? class203.field3507 : this.field1534, var16, this.field1548, this.field1551, var12);
        } else {
            var19 = var4.method961(var13, var15, var14, var16, var18 ? class203.field3507 : this.field1534, this.field1551, this.field1542, this.field1548, var12, this.field1532, 0, var17);
        }
        return var19 == null ? null : var19.field4534;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIZLaf;)V")
    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class208 arg8) {
        this.field1530 = arg3;
        this.field1548 = arg2;
        this.field1551 = arg1;
        this.field1537 = arg0;
        this.field1538 = arg4;
        this.field1553 = arg5;
        if (arg6 != -1) {
            this.field1532 = class128.method827(arg6, 99);
            this.field1542 = 0;
            this.field1536 = class237.field4125 - 1;
            if (this.field1532.field4444 == 0 && arg8 != null && arg8 instanceof class96) {
                class96 var10 = (class96) arg8;
                if (this.field1532 == var10.field1532) {
                    this.field1536 = var10.field1536;
                    this.field1542 = var10.field1542;
                    return;
                }
            }
            if (arg7 && this.field1532.field4424 != -1) {
                this.field1542 = (int) ((double) this.field1532.field4431.length * Math.random());
                this.field1536 -= (int) (Math.random() * (double) this.field1532.field4456[this.field1542]);
                return;
            }
        }
    }
}
