import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class271 extends class312 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Z")
    private boolean field4495 = false;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    private int field4493 = -32768;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Lkm;")
    private class230 field4497 = null;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "Z")
    private boolean field4512 = false;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field4525 = -1;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field4519 = -1;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    private int field4499;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    private int field4506;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lck;")
    private class163 field4526;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    private int field4517;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4492 = "Cancel";

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field4507 = -1;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Z")
    public static boolean field4520 = true;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4514 = null;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lge;")
    private class139 field4494;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "[[[I")
    public static int[][][] field4516;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)Lda;")
    private final class312 method1908(boolean arg0, boolean arg1) {
        field4518++;
        boolean var3 = class245.field4123 != class207.field3401;
        if (!arg0) {
            method1910(-72, (byte) 49, 116, 32, -102);
        }
        class1 var4 = class110.method827(this.field4524, (byte) -125);
        if (var4.field34 != null) {
            var4 = var4.method22((byte) 117);
        }
        if (var4 == null) {
            this.field4519 = -1;
            this.field4525 = this.field4510;
            return null;
        }
        if (!this.field4512 && this.field4519 != var4.field50) {
            this.method1909(11771, -1);
        }
        int var5 = this.field4501 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field10;
            var7 = var4.field57;
        } else {
            var6 = var4.field57;
            var7 = var4.field10;
        }
        int var8 = (var6 >> 1) + this.field4499;
        int var9 = (var6 + 1 >> 1) + this.field4499;
        int var10 = (var7 >> 1) + this.field4509;
        int var11 = (var7 + 1 >> 1) + this.field4509;
        this.method1916(var8 * 128, var10 * 128, 82);
        boolean var12 = !var3 && var4.field59 && (this.field4519 != var4.field50 || (this.field4525 != this.field4510 || this.field4526 != null && (this.field4526.field2651 || class12.field205) && this.field4510 != this.field4506) && class162.field2631 >= 2);
        if (arg1 && !var12) {
            this.field4525 = this.field4510;
            this.field4519 = var4.field50;
            return null;
        }
        int[][] var13 = class245.field4123[this.field4513];
        int var14 = var13[var8][var11] + var13[var9][var10] + var13[var9][var11] + var13[var8][var10] >> 2;
        int[][] var15 = null;
        int var16 = (this.field4509 << 7) + (var7 << 6);
        int var17 = (this.field4499 << 7) + (var6 << 6);
        if (var3) {
            var15 = class207.field3401[0];
        } else if (this.field4513 < 3) {
            var15 = class245.field4123[this.field4513 + 1];
        }
        boolean var18 = this.field4497 == null;
        class221 var19;
        if (this.field4526 == null) {
            var19 = var4.method11(var13, this.field4503, (byte) -53, var14, var15, this.field4501, var17, var16, var18 ? class171.field2772 : this.field4497, var12, false);
        } else {
            var19 = var4.method20(var14, var15, var12, this.field4501, this.field4522, this.field4506, this.field4503, var17, var16, this.field4510, this.field4526, (byte) -21, var13, var18 ? class171.field2772 : this.field4497);
        }
        if (var19 == null) {
            this.field4525 = this.field4510;
            this.field4519 = var4.field50;
            return null;
        } else {
            this.field4519 = var4.field50;
            this.field4525 = this.field4510;
            return var19.field3720;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V")
    private final void method1909(int arg0, int arg1) {
        field4515++;
        int var3 = arg1;
        if (arg0 != 11771) {
            return;
        }
        boolean var4 = false;
        if (arg1 == -1) {
            class1 var5 = class110.method827(this.field4524, (byte) -126);
            class1 var6 = var5;
            if (var5.field34 != null) {
                var5 = var5.method22((byte) 117);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4 != null) {
                if (this.field4526 != null && var5.method13(this.field4526.field2650, (byte) -113)) {
                    return;
                }
                var3 = var5.method14((byte) -51);
                if (this.field4519 != var5.field50) {
                    var4 = var5.field78;
                }
            } else if (var5.field56 == -1) {
                if (var6 != null && var6.field4 != null) {
                    if (this.field4526 != null && var6.method13(this.field4526.field2650, (byte) -113)) {
                        return;
                    }
                    var3 = var6.method14((byte) -51);
                    if (this.field4519 != var6.field50) {
                        var4 = var6.field78;
                    }
                } else if (var6 != null && var6.field56 != -1 && this.field4519 != var6.field50) {
                    var4 = var6.field78;
                    var3 = var6.field56;
                }
            } else if (this.field4519 != var5.field50) {
                var4 = var5.field78;
                var3 = var5.field56;
            }
        }
        if (var3 == -1) {
            this.field4526 = null;
            return;
        }
        if (this.field4526 == null || this.field4526.field2650 != var3) {
            this.field4526 = class34.method211(var3, 3);
        } else if (this.field4526.field2658 == 0) {
            return;
        }
        if (var4) {
            this.field4510 = (int) (Math.random() * (double) this.field4526.field2639.length);
            this.field4522 = (int) (Math.random() * (double) this.field4526.field2638[this.field4510]) + 1;
        } else {
            this.field4522 = 1;
            this.field4510 = 0;
        }
        this.field4506 = this.field4510 + 1;
        if (this.field4506 < 0 || this.field4526.field2639.length <= this.field4506) {
            this.field4506 = -1;
        }
        this.field4517 = class275.field4598 - this.field4522;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()I")
    public final int method860() {
        field4523++;
        return this.field4493;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10) {
        field4511++;
        class312 var13 = this.method1915(false);
        if (var13 != null) {
            this.method1911(var13, -1);
            var13.method852(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4494);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBIII)V")
    public static final void method1910(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class55.field972 <= arg4 && class240.field4053 >= arg4) {
            int var5 = class243.method1742(class23.field423, arg1 ^ 0x25, class272.field4552, arg3);
            int var6 = class243.method1742(class23.field423, 0, class272.field4552, arg2);
            class93.method668(arg0, arg4, var5, var6, (byte) -27);
        }
        field4500++;
        if (arg1 != 37) {
            field4516 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IIIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4502++;
        class312 var6 = null;
        this.method1916(arg3, arg4, 86);
        if (!this.field4495) {
            if (var6 == null) {
                var6 = this.method1915(false);
            }
            if (var6 == null) {
                return;
            }
            this.method1911(var6, -1);
        }
        if (this.field4494 != null) {
            this.field4494.method1033(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lda;I)V")
    private final void method1911(class312 arg0, int arg1) {
        field4505++;
        if (arg1 != -1) {
            this.method930(-126, -12, 87, -99, -45);
        }
        class112 var3 = (class112) arg0;
        if ((this.field4494 == null || this.field4494.field2269) && (var3.field1847 != null || var3.field1878 != null)) {
            class1 var4 = class110.method827(this.field4524, (byte) -68);
            if (var4.field34 != null) {
                var4 = var4.method22((byte) 117);
            }
            if (var4 != null) {
                this.field4494 = new class139(class275.field4598, var4.field57, var4.field10);
            }
        }
        if (this.field4494 != null) {
            this.field4494.method1027(var3.field1847, var3.field1878, false, var3.field1849, var3.field1874, var3.field1848);
        }
        this.field4495 = true;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIII)V")
    public static final void method1912(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4496++;
        if (arg2 != 2) {
            field4516 = null;
        }
        if (class301.method2056(-1, arg3)) {
            class3.method30(113, arg0, arg4, class208.field3515[arg3], -1, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4508++;
        if (this.field4494 != null) {
            this.field4494.method1025();
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III[BZ[Llb;IIIII)V")
    public static final void method1913(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class311[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 <= 42) {
            field4507 = 52;
        }
        class249 var11 = new class249(arg3);
        field4521++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method1777(-78);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1819(-1741461848);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFDB) >> 6;
                int var17 = var14 >> 12;
                int var18 = var11.method1802((byte) -86);
                int var19 = var18 & 0x3;
                int var20 = var14 & 0x3F;
                int var21 = var18 >> 2;
                if (arg10 == var17 && arg2 <= var16 && arg2 + 8 > var16 && var20 >= arg0 && var20 < arg0 + 8) {
                    class1 var22 = class110.method827(var12, (byte) -105);
                    int var23 = class213.method1514((byte) 112, arg6, var22.field57, var22.field10, var19, var16 & 0x7, var20 & 0x7) + arg9;
                    int var24 = arg7 + class73.method513(var22.field57, var20 & 0x7, -1, var16 & 0x7, arg6, var19, var22.field10);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class311 var25 = null;
                        if (!arg4) {
                            int var26 = arg1;
                            if ((class67.field1132[1][var23][var24] & 0x2) == 2) {
                                var26 = arg1 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class72.method510(var24, -85, arg4, arg1, var23, !arg4, var25, arg6 + var19 & 0x3, var12, arg1, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public static void method1914(byte arg0) {
        field4492 = null;
        int var1 = -42 % ((arg0 + 77) / 40);
        field4514 = null;
        field4516 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Lda;")
    public final class312 method1915(boolean arg0) {
        if (arg0) {
            this.field4522 = 27;
        }
        field4498++;
        return this.method1908(true, false);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
    private final void method1916(int arg0, int arg1, int arg2) {
        int var4 = 59 / ((arg2 - 17) / 60);
        field4504++;
        label88: while (true) {
            if (this.field4526 == null) {
                if (this.field4512) {
                    return;
                }
                this.method1909(11771, -1);
                if (this.field4526 == null) {
                    return;
                }
            }
            int var5 = class275.field4598 - this.field4517;
            if (var5 > 100 && this.field4526.field2637 > 0) {
                int var6 = this.field4526.field2639.length - this.field4526.field2637;
                while (var6 > this.field4510 && var5 > this.field4526.field2638[this.field4510]) {
                    var5 -= this.field4526.field2638[this.field4510];
                    this.field4510++;
                }
                if (var6 <= this.field4510) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field4526.field2639.length; var8++) {
                        var7 += this.field4526.field2638[var8];
                    }
                    var5 %= var7;
                }
                this.field4506 = this.field4510 + 1;
                if (this.field4506 >= this.field4526.field2639.length) {
                    this.field4506 -= this.field4526.field2637;
                    if (this.field4506 < 0 || this.field4506 >= this.field4526.field2639.length) {
                        this.field4506 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4526.field2638[this.field4510] >= var5) {
                            this.field4522 = var5;
                            this.field4517 = class275.field4598 - var5;
                            return;
                        }
                        class131.method980(false, arg1, arg0, this.field4510, (byte) -123, this.field4526);
                        var5 -= this.field4526.field2638[this.field4510];
                        this.field4510++;
                        if (this.field4510 >= this.field4526.field2639.length) {
                            this.field4510 -= this.field4526.field2637;
                            if (this.field4510 < 0 || this.field4510 >= this.field4526.field2639.length) {
                                this.field4526 = null;
                                continue label88;
                            }
                        }
                        this.field4506 = this.field4510 + 1;
                    } while (this.field4526.field2639.length > this.field4506);
                    this.field4506 -= this.field4526.field2637;
                } while (this.field4506 >= 0 && this.field4506 < this.field4526.field2639.length);
                this.field4506 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIIIZLda;)V")
    public class271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class312 arg8) {
        this.field4503 = arg1;
        this.field4524 = arg0;
        this.field4501 = arg2;
        this.field4513 = arg3;
        this.field4509 = arg5;
        this.field4499 = arg4;
        if (arg8 != null) {
            this.field4512 = true;
            if (arg8 instanceof class271) {
                class271 var10 = (class271) arg8;
                this.field4510 = var10.field4510;
                this.field4522 = var10.field4522;
                this.field4506 = var10.field4506;
                this.field4526 = var10.field4526;
                this.field4517 = var10.field4517;
            }
        }
        if (this.field4512) {
            this.method1909(11771, arg6);
        }
    }
}
