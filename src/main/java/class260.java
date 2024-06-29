import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class260 extends class20 {

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field4573 = -1;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Ldh;")
    private class265 field4580 = null;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    private int field4574 = -1;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    private int field4567 = -32768;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    private int field4589;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Luc;")
    private class224 field4592;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lr;")
    public static class66 field4565 = class93.method641(43, "Schlie-8en");

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lr;")
    private static class66 field4588 = class93.method641(43, "green:");

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Z")
    public static boolean field4587 = false;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lr;")
    public static class66 field4586 = field4588;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lr;")
    public static class66 field4576 = field4588;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field4572 = 0;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "Lcj;")
    public static class28 field4593;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lr;")
    public static final class66 method1772(int arg0, int arg1) {
        if (arg1 == -17516) {
            field4585++;
            return class212.method1372(arg1 ^ 0xFFFFBB96, new class66[] { class144.method989(arg0 >> 24 & 0xFF, 0), class4.field46, class144.method989(arg0 >> 16 & 0xFF, 0), class4.field46, class144.method989((arg0 & 0xFFC7) >> 8, 0), class4.field46, class144.method989(arg0 & 0xFF, 0) });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)La;")
    private final class20 method1773(int arg0) {
        if (arg0 == 675116226) {
            field4566++;
            return this.method1774(false, 2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)La;")
    private final class20 method1774(boolean arg0, int arg1) {
        field4583++;
        boolean var3 = class30.field453 != class250.field4412;
        class231 var4 = class52.method359(arg1 + 89, this.field4570);
        if (var4.field4027 != null) {
            var4 = var4.method1515(arg1 - 3);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field4579 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field4021;
            var6 = var4.field4020;
        } else {
            var6 = var4.field4021;
            var7 = var4.field4020;
        }
        int var8 = this.field4584 + (var6 >> 1);
        int var9 = (var7 >> 1) + this.field4589;
        int var10 = this.field4584 + (var6 + 1 >> 1);
        int var11 = this.field4589 + (var7 + 1 >> 1);
        this.method1778(var8 * 128, var9 * 128, (byte) -95);
        boolean var12 = !var3 && var4.field4051 && (this.field4573 != var4.field4064 || this.field4578 != this.field4574 && class124.field2334 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class30.field453[this.field4571];
        int var14 = (this.field4584 << 7) + (var6 << 6);
        int var15 = (this.field4589 << 7) + (var7 << 6);
        boolean var16 = this.field4580 == null;
        int var17 = var13[var8][var9] + var13[var10][var9] + var13[var8][var11] + var13[var10][var11] >> 2;
        int[][] var18 = null;
        if (var3) {
            var18 = class250.field4412[0];
        } else if (this.field4571 < 3) {
            var18 = class30.field453[this.field4571 + 1];
        }
        class103 var19;
        if (this.field4592 == null) {
            var19 = var4.method1507(this.field4577, var16 ? class240.field4177 : this.field4580, var12, (byte) -10, false, var17, this.field4579, var13, var15, var18, var14);
        } else {
            var19 = var4.method1519(var16 ? class240.field4177 : this.field4580, this.field4592, var12, var14, var17, this.field4578, this.field4579, var18, var13, 65535, var15, this.field4577);
        }
        if (arg1 != 2) {
            this.method1778(13, 52, (byte) -73);
        }
        return var19 == null ? null : var19.field2007;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field4586 = null;
        field4588 = null;
        field4576 = null;
        field4565 = null;
        field4593 = null;
        if (arg0 > -44) {
            method1775(-90);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILa;JLa;La;)V")
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, class20 arg4, long arg5, class20 arg6, class20 arg7) {
        class140 var9 = new class140();
        var9.field2598 = arg4;
        var9.field2589 = arg1 * 128 + 64;
        var9.field2590 = arg2 * 128 + 64;
        var9.field2600 = arg3;
        var9.field2586 = arg5;
        var9.field2588 = arg6;
        var9.field2593 = arg7;
        int var10 = 0;
        class16 var11 = class110.field2124[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field219; var12++) {
                class44 var13 = var11.field220[var12];
                if ((var13.field780 & 0x400000L) == 4194304L) {
                    int var14 = var13.field779.method28();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2584 = -var10;
        if (class110.field2124[arg0][arg1][arg2] == null) {
            class110.field2124[arg0][arg1][arg2] = new class16(arg0, arg1, arg2);
        }
        class110.field2124[arg0][arg1][arg2].field207 = var9;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static final void method1777(int arg0) {
        if (arg0 != 255) {
            field4593 = null;
        }
        field4568++;
        if (class9.field95 != null) {
            class131 var1 = class9.field95;
            synchronized (class9.field95) {
                class9.field95 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
    public final int method28() {
        field4575++;
        return this.field4567;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class20 var11 = this.method1773(675116226);
        field4582++;
        if (var11 != null) {
            var11.method25(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4567 = var11.method28();
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4569++;
        this.method1778(((arg4 - arg1 >> 1) + arg1) * 128 + 64, (arg3 - -(-arg3 + arg0 >> 1)) * 128 + 64, (byte) -59);
        if (arg2 < 96) {
            this.field4579 = 5;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V")
    private final void method1778(int arg0, int arg1, byte arg2) {
        field4590++;
        if (this.field4592 != null) {
            int var4 = class75.field1501 - this.field4581;
            if (var4 > 100 && this.field4592.field3848 > 0) {
                int var5 = this.field4592.field3811.length - this.field4592.field3848;
                while (this.field4578 < var5 && var4 > this.field4592.field3834[this.field4578]) {
                    var4 -= this.field4592.field3834[this.field4578];
                    this.field4578++;
                }
                if (this.field4578 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4592.field3811.length; var7++) {
                        var6 += this.field4592.field3834[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field4592.field3834[this.field4578]) {
                            break label62;
                        }
                        class103.method713(false, this.field4578, arg0, this.field4592, false, arg1);
                        var4 -= this.field4592.field3834[this.field4578];
                        this.field4578++;
                    } while (this.field4578 < this.field4592.field3811.length);
                    this.field4578 -= this.field4592.field3848;
                } while (this.field4578 >= 0 && this.field4592.field3811.length > this.field4578);
                this.field4592 = null;
            }
            this.field4581 = class75.field1501 - var4;
        }
        if (arg2 >= -25) {
            this.field4573 = 24;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIIZLa;)V")
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class20 arg8) {
        this.field4584 = arg4;
        this.field4589 = arg5;
        this.field4577 = arg1;
        this.field4571 = arg3;
        this.field4570 = arg0;
        this.field4579 = arg2;
        if (arg6 != -1) {
            this.field4592 = class47.method335((byte) -36, arg6);
            this.field4581 = class75.field1501 - 1;
            this.field4578 = 0;
            if (this.field4592.field3837 == 0 && arg8 != null && arg8 instanceof class260) {
                class260 var10 = (class260) arg8;
                if (this.field4592 == var10.field4592) {
                    this.field4578 = var10.field4578;
                    this.field4581 = var10.field4581;
                    return;
                }
            }
            if (arg7 && this.field4592.field3848 != -1) {
                this.field4578 = (int) ((double) this.field4592.field3811.length * Math.random());
                this.field4581 -= (int) (Math.random() * (double) this.field4592.field3834[this.field4578]);
                return;
            }
        }
    }
}
