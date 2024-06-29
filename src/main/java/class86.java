import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class86 extends class88 {

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    private int field1518 = -32768;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "Lta;")
    private class208 field1522;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "[I")
    public static int[] field1519;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
    public final int method5() {
        field1515++;
        return this.field1518;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lia;")
    private final class88 method582(int arg0) {
        field1512++;
        boolean var2 = class78.field1370 != class39.field808;
        class30 var3 = class73.method519(this.field1513, -21035);
        if (var3.field554 != null) {
            var3 = var3.method256(arg0 ^ 0xC620B2C8);
        }
        if (var3 == null) {
            return null;
        }
        if (this.field1522 != null) {
            int var4 = class203.field3758 - this.field1517;
            if (var4 > 100 && this.field1522.field3901 > 0) {
                int var5 = this.field1522.field3881.length - this.field1522.field3901;
                while (var5 > this.field1516 && var4 > this.field1522.field3882[this.field1516]) {
                    var4 -= this.field1522.field3882[this.field1516];
                    this.field1516++;
                }
                if (var5 <= this.field1516) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1522.field3881.length; var7++) {
                        var6 += this.field1522.field3882[var7];
                    }
                    var4 %= var6;
                }
            }
            label97: {
                do {
                    do {
                        if (this.field1522.field3882[this.field1516] >= var4) {
                            break label97;
                        }
                        var4 -= this.field1522.field3882[this.field1516];
                        this.field1516++;
                    } while (this.field1516 < this.field1522.field3881.length);
                    this.field1516 -= this.field1522.field3901;
                } while (this.field1516 >= 0 && this.field1522.field3881.length > this.field1516);
                this.field1522 = null;
            }
            this.field1517 = class203.field3758 - var4;
        }
        int var8;
        int var9;
        if (this.field1511 == 1 || this.field1511 == 3) {
            var9 = var3.field560;
            var8 = var3.field562;
        } else {
            var8 = var3.field560;
            var9 = var3.field562;
        }
        int var10 = this.field1509 + (var8 >> 1);
        if (arg0 != -861382974) {
            field1519 = null;
        }
        int var11 = (var8 + 1 >> 1) + this.field1509;
        int var12 = (this.field1509 << 7) + (var8 << 6);
        int var13 = (var9 >> 1) + this.field1521;
        int var14 = (var9 + 1 >> 1) + this.field1521;
        int var15 = (this.field1521 << 7) + (var9 << 6);
        int[][] var16 = class39.field808[this.field1508];
        int[][] var17 = null;
        if (var2) {
            var17 = class78.field1370[0];
        } else if (this.field1508 < 3) {
            var17 = class39.field808[this.field1508 + 1];
        }
        int var18 = var16[var10][var13] + var16[var10][var14] + var16[var11][var14] + var16[var11][var13] >> 2;
        class17 var19;
        if (this.field1522 == null) {
            var19 = var3.method246(false, this.field1514, false, var17, var16, var15, var12, this.field1511, var18);
        } else {
            var19 = var3.method254(var16, var12, this.field1511, this.field1516, var17, var18, this.field1514, var15, this.field1522, (byte) -104);
        }
        return var19 == null ? null : var19.field264;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1519 = null;
        if (arg0 != -1044489951) {
            field1519 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1520++;
        class88 var11 = this.method582(-861382974);
        if (var11 != null) {
            var11.method19(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1518 = var11.method5();
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIIIZLia;)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class88 arg8) {
        this.field1513 = arg0;
        this.field1508 = arg3;
        this.field1509 = arg4;
        this.field1514 = arg1;
        this.field1521 = arg5;
        this.field1511 = arg2;
        if (arg6 != -1) {
            this.field1522 = class16.method113(arg6, (byte) 90);
            this.field1516 = 0;
            this.field1517 = class203.field3758 - 1;
            if (this.field1522.field3906 == 0 && arg8 != null && arg8 instanceof class86) {
                class86 var10 = (class86) arg8;
                if (this.field1522 == var10.field1522) {
                    this.field1516 = var10.field1516;
                    this.field1517 = var10.field1517;
                    return;
                }
            }
            if (arg7 && this.field1522.field3901 != -1) {
                this.field1516 = (int) (Math.random() * (double) this.field1522.field3881.length);
                this.field1517 -= (int) (Math.random() * (double) this.field1522.field3882[this.field1516]);
                return;
            }
        }
    }
}
