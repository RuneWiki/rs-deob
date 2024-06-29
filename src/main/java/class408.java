import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class408 {

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "Lcb;")
    private class444 field5569;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lih;")
    private class600 field5560;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public int field5555;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    private int field5570;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "[B")
    public byte[] field5575;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    private int field5565;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lkv;")
    public static class227 field5564 = new class227();

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field5576 = new String[200];

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "[I")
    public static int[] field5573;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "[Lha;")
    public static class53[] field5574;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "[[Lvu;")
    private class284[][] field5578;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III[[ZZZ)V", line = 4)
    public final void method2393(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, boolean arg5) {
        field5566++;
        this.field5569.method2658(49, false);
        this.field5569.method2644(-119, false);
        this.field5569.method2650(1, (byte) 35);
        this.field5569.method2698(1, 1);
        this.field5569.method2652(false, 128, -2, false);
        if (!arg5) {
            return;
        }
        float var7 = 1.0F / (float) (this.field5569.field6171 * 128);
        if (arg4) {
            for (int var26 = 0; var26 < this.field5565; var26++) {
                int var27 = var26 << this.field5559;
                int var28 = var26 + 1 << this.field5559;
                label94: for (int var29 = 0; var29 < this.field5572; var29++) {
                    if (this.field5578[var29][var26] != null) {
                        int var30 = var29 << this.field5559;
                        int var31 = var29 + 1 << this.field5559;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if (var32 - arg1 >= -arg2 && var32 - arg1 <= arg2) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if (var33 - arg0 >= -arg2 && arg2 >= (var33 - arg0) && arg3[var32 + arg2 - arg1][arg2 + var33 - arg0]) {
                                        class57 var34 = this.field5569.method2653((byte) -110);
                                        var34.method381(1.0F, var7, var7, (byte) -60);
                                        var34.method338(-var29, -var26, 0);
                                        this.field5569.method2623(110, class210.field3107);
                                        this.field5578[var29][var26].method1768(95);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field5565; var8++) {
                int var9 = var8 << this.field5559;
                int var10 = var8 + 1 << this.field5559;
                for (int var11 = 0; var11 < this.field5572; var11++) {
                    class284 var12 = this.field5578[var11][var8];
                    if (var12 != null) {
                        class370 var13 = this.field5569.method2689(true, var12.field3978 * 3);
                        Buffer var14 = var13.method282(-13803, true);
                        if (var14 != null) {
                            Stream var15 = this.field5569.method2597(var14, 1);
                            int var16 = 0;
                            int var17 = var11 << this.field5559;
                            int var18 = var11 + 1 << this.field5559;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (var19 - arg0 >= -arg2 && (var19 - arg0) <= arg2) {
                                    int var21 = this.field5560.field2697 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg1) >= (-arg2) && arg2 >= (var22 - arg1) && arg3[var22 + arg2 - arg1][var19 + arg2 - arg0]) {
                                            short[] var23 = this.field5560.field8856[var21];
                                            if (var23 != null) {
                                                if (Stream.method3454()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3447(var23[var24] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method3452(var23[var25] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3448();
                            if (var13.method280(28596) && var16 > 0) {
                                class57 var20 = this.field5569.method2653((byte) -110);
                                var20.method381(1.0F, var7, var7, (byte) -60);
                                var20.method338(-var11, -var8, 0);
                                this.field5569.method2623(-102, class210.field3107);
                                var12.method1769(var13, var16 / 3, -5840);
                            }
                        }
                    }
                }
            }
        }
        this.field5569.method2664(47);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lk;III)Z", line = 208)
    public final boolean method2394(class485 arg0, int arg1, int arg2, int arg3) {
        field5557++;
        class396 var5 = (class396) arg0;
        int var6 = var5.field5446 + arg3 + 1;
        int var7 = var5.field5443 + arg2 - arg1;
        int var8 = this.field5555 * var6 + var7;
        int var9 = var5.field5448;
        int var10 = var5.field5447;
        int var11 = this.field5555 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var9 -= var12;
            var8 += this.field5555 * var12;
        }
        if (this.field5570 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field5570;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var11 += var14;
            var10 -= var14;
        }
        if (this.field5555 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field5555;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5555 + var11;
            return class142.method973(var16, var10, var9, var17, var8, (byte) 102, this.field5575);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Z", line = 278)
    public static final boolean method2395(int arg0, int arg1, int arg2) {
        if (arg1 > -88) {
            return false;
        } else {
            field5558++;
            boolean var3 = (arg0 & 0x37) == 0 ? class286.method1775(arg0, -104, arg2) : class282.method1758(arg2, arg0, 0);
            return class393.method2336(arg2, -9359, arg0) | (arg2 & 0x10000) != 0 | var3;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lk;IBI)V", line = 296)
    public final void method2396(class485 arg0, int arg1, byte arg2, int arg3) {
        field5567++;
        class396 var5 = (class396) arg0;
        int var6 = var5.field5446 + arg1 + 1;
        int var7 = var5.field5443 + arg3 + 1;
        int var8 = this.field5555 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5448;
        int var11 = -76 / ((arg2 - 25) / 38);
        int var12 = var5.field5447;
        int var13 = this.field5555 - var12;
        int var14 = 0;
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var6 = 1;
            var9 += var12 * var15;
            var8 += this.field5555 * var15;
            var10 -= var15;
        }
        if (this.field5570 <= var6 + var10) {
            int var16 = var6 + var10 + 1 - this.field5570;
            var10 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var9 += var17;
            var12 -= var17;
            var8 += var17;
            var13 += var17;
            var7 = 1;
            var14 += var17;
        }
        if (this.field5555 <= (var7 + var12)) {
            int var18 = var7 + var12 + 1 - this.field5555;
            var14 += var18;
            var13 += var18;
            var12 -= var18;
        }
        if (var12 > 0 && var10 > 0) {
            class274.method1720(var9, var14, var13, (byte) -108, var12, this.field5575, var5.field5444, var8, var10);
            this.method2402(var12, var6, var7, 122, var10);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BII)Z", line = 368)
    public static final boolean method2397(byte arg0, int arg1, int arg2) {
        field5562++;
        if (arg0 != 59) {
            field5573 = null;
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V", line = 379)
    public static final void method2398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5568++;
        if (arg2 < 128 || arg4 < 128 || arg2 > ((class146.field2125 - 2) * 128) || ((class410.field5609 - 2) * 128) < arg4) {
            class524.field7487[0] = class524.field7487[1] = -1;
            return;
        }
        int var10 = class132.method919(arg8, arg4, arg2, (byte) -82) - arg9;
        class259.field3707.method338(arg6, 0, 0);
        class99.field1445.method483(class259.field3707);
        class99.field1445.method475(arg2, var10, arg4, class524.field7487);
        class259.field3707.method338(-arg6, 0, 0);
        if (arg5 != -5984) {
            field5571 = 5;
        }
        class99.field1445.method483(class259.field3707);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 404)
    public final void method2399(byte arg0) {
        this.field5578 = new class284[this.field5572][this.field5565];
        field5556++;
        if (arg0 != 89) {
            return;
        }
        for (int var2 = 0; var2 < this.field5565; var2++) {
            for (int var3 = 0; var3 < this.field5572; var3++) {
                this.field5578[var3][var2] = new class284(this.field5569, this, this.field5560, var3, var2, this.field5559, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field5578[var3][var2].field3978 == 0) {
                    this.field5578[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 437)
    public static void method2400(int arg0) {
        field5574 = null;
        if (arg0 != -1) {
            field5576 = null;
        }
        field5564 = null;
        field5573 = null;
        field5576 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILk;II)V", line = 450)
    public final void method2401(int arg0, class485 arg1, int arg2, int arg3) {
        field5563++;
        class396 var5 = (class396) arg1;
        int var6 = var5.field5443 + arg3 + 1;
        int var7 = var5.field5446 + arg2 + 1;
        int var8 = var6 + (this.field5555 * var7);
        int var9 = 0;
        int var10 = var5.field5448;
        int var11 = var5.field5447;
        int var12 = this.field5555 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field5555 * var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field5570) {
            int var15 = var7 - (-var10 - 1) - this.field5570;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var13 += var16;
            var6 = 1;
        }
        int var17 = 0 % ((arg0 + 66) / 41);
        if (this.field5555 <= var6 + var11) {
            int var18 = var6 + var11 + 1 - this.field5555;
            var13 += var18;
            var11 -= var18;
            var12 += var18;
        }
        if (var11 > 0 && var10 > 0) {
            class43.method272(var9, var12, var8, var13, (byte) 45, this.field5575, var5.field5444, var10, var11);
            this.method2402(var11, var7, var6, 95, var10);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIII)V", line = 529)
    private final void method2402(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5561++;
        if (arg3 <= 65) {
            this.field5565 = 28;
        }
        if (this.field5578 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg0 - 2 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg4 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class284[] var11 = this.field5578[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field3974 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lcb;Lih;)V", line = 586)
    public class408(class444 arg0, class600 arg1) {
        this.field5569 = arg0;
        this.field5560 = arg1;
        this.field5555 = (this.field5560.field2697 * this.field5560.field2694 >> this.field5569.field6156) + 2;
        this.field5570 = (this.field5560.field2694 * this.field5560.field2693 >> this.field5569.field6156) + 2;
        this.field5559 = this.field5569.field6156 + 7 - this.field5560.field2695;
        this.field5575 = new byte[this.field5570 * this.field5555];
        this.field5572 = this.field5560.field2697 >> this.field5559;
        this.field5565 = this.field5560.field2693 >> this.field5559;
    }
}
