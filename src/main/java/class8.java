import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class8 {

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "Lvha;")
    private class63 field92;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "Lpj;")
    private class38 field79;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "[B")
    public byte[] field88;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field84;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "[[Lpca;")
    private class156[][] field90;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BILr;I)V", line = 3)
    public final void method31(byte arg0, int arg1, class706 arg2, int arg3) {
        field82++;
        class684 var5 = (class684) arg2;
        int var6 = var5.field9677 + arg1 + 1;
        int var7 = var5.field9673 + arg3 + 1;
        int var8 = var7 + (this.field86 * var6);
        int var9 = 0;
        int var10 = var5.field9680;
        int var11 = var5.field9674;
        int var12 = this.field86 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var8 += this.field86 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (arg0 != -55) {
            field77 = -22;
        }
        if (this.field91 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field91;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var14 += var16;
            var11 -= var16;
        }
        if (this.field86 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field86;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class652.method3670(var9, var11, var12, var8, 96, var5.field9678, var14, this.field88, var10);
            this.method36(var11, var10, var7, (byte) -116, var6);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 77)
    public final void method32(byte arg0) {
        this.field90 = new class156[this.field80][this.field83];
        field76++;
        if (arg0 != -53) {
            return;
        }
        for (int var2 = 0; var2 < this.field83; var2++) {
            for (int var3 = 0; var3 < this.field80; var3++) {
                this.field90[var3][var2] = new class156(this.field79, this, this.field92, var3, var2, this.field85, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field90[var3][var2].field2416 == 0) {
                    this.field90[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILr;)V", line = 109)
    public final void method33(int arg0, int arg1, int arg2, class706 arg3) {
        field87++;
        class684 var5 = (class684) arg3;
        int var6 = var5.field9677 + arg2 + 1;
        int var7 = var5.field9673 + arg0 + 1;
        int var8 = this.field86 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9680;
        int var11 = var5.field9674;
        int var12 = this.field86 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field86 * var13;
            var6 = 1;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (arg1 <= 97) {
            field84 = null;
        }
        if (var6 + var10 >= this.field91) {
            int var15 = var6 + var10 + 1 - this.field91;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var12 += var16;
            var8 += var16;
            var14 += var16;
        }
        if (var7 + var11 >= this.field86) {
            int var17 = var11 + var7 + 1 - this.field86;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class425.method2651(var8, var14, var12, var5.field9678, var10, var11, (byte) 13, var9, this.field88);
            this.method36(var11, var10, var7, (byte) -101, var6);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lr;IIB)Z", line = 191)
    public final boolean method34(class706 arg0, int arg1, int arg2, byte arg3) {
        field78++;
        class684 var5 = (class684) arg0;
        int var6 = var5.field9677 + arg2 + 1;
        int var7 = var5.field9673 + arg1 + 1;
        int var8 = this.field86 * var6 + var7;
        int var9 = var5.field9680;
        if (arg3 > -103) {
            return false;
        }
        int var10 = var5.field9674;
        int var11 = this.field86 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field86 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if ((var6 + var9) >= this.field91) {
            int var13 = var6 - this.field91 - (-var9 - 1);
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var11 += var14;
            var10 -= var14;
        }
        if ((var7 + var10) >= this.field86) {
            int var15 = var10 + var7 + 1 - this.field86;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field86 + var11;
            return class395.method2454(var10, var17, var8, var9, (byte) 91, var16, this.field88);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V", line = 266)
    public static void method35(byte arg0) {
        if (arg0 != 107) {
            method35((byte) 120);
        }
        field84 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIBI)V", line = 276)
    private final void method36(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field89++;
        if (this.field90 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg0 + arg2 - 2 >> 7;
        int var8 = arg4 - 1 >> 7;
        if (arg3 >= -100) {
            return;
        }
        int var9 = arg4 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class156[] var11 = this.field90[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field2421 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II[[ZIZZ)V", line = 320)
    public final void method37(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, boolean arg5) {
        field81++;
        this.field79.method384(-64, false);
        this.field79.method394(13119, false);
        this.field79.method314(1, (byte) 21);
        this.field79.method405(1, (byte) 121);
        this.field79.method421(false, 15, -2, arg4);
        float var7 = 1.0F / (float) (this.field79.field630 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field83; var8++) {
                int var9 = var8 << this.field85;
                int var10 = var8 + 1 << this.field85;
                label147: for (int var11 = 0; var11 < this.field80; var11++) {
                    if (this.field90[var11][var8] != null) {
                        int var12 = var11 << this.field85;
                        int var13 = var11 + 1 << this.field85;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (var14 - arg3 >= -arg1 && arg1 >= (var14 - arg3)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (var15 - arg0 >= -arg1 && (var15 - arg0) <= arg1 && arg2[var14 - (arg3 - arg1)][var15 + arg1 - arg0]) {
                                        class341 var16 = this.field79.method269(1);
                                        var16.method2179(var7, 1.0F, !arg4, var7);
                                        var16.method671(-var11, -var8, 0);
                                        this.field79.method342((byte) -122, class673.field9518);
                                        this.field90[var11][var8].method1170(0);
                                        continue label147;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field83; var17++) {
                int var18 = var17 << this.field85;
                int var19 = var17 + 1 << this.field85;
                for (int var20 = 0; var20 < this.field80; var20++) {
                    class156 var21 = this.field90[var20][var17];
                    if (var21 != null) {
                        class743 var22 = this.field79.method221(var21.field2416 * 3, -103);
                        Buffer var23 = var22.method926(true, -29944);
                        if (var23 != null) {
                            Stream var24 = this.field79.method368((byte) -121, var23);
                            int var25 = 0;
                            int var26 = var20 << this.field85;
                            int var27 = var20 + 1 << this.field85;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg1 <= var28 - arg0 && (var28 - arg0) <= arg1) {
                                    int var30 = this.field92.field4956 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg1) <= (var31 - arg3) && arg1 >= var31 - arg3 && arg2[var31 + arg1 - arg3][var28 + arg1 - arg0]) {
                                            short[] var32 = this.field92.field1016[var30];
                                            if (var32 != null) {
                                                if (Stream.method2572()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method2585(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method2584(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method2573();
                            if (var22.method925((byte) 108) && var25 > 0) {
                                class341 var29 = this.field79.method269(1);
                                var29.method2179(var7, 1.0F, true, var7);
                                var29.method671(-var20, -var17, 0);
                                this.field79.method342((byte) -124, class673.field9518);
                                var21.method1172(-10154, var25 / 3, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field79.method250(-91);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lpj;Lvha;)V", line = 519)
    public class8(class38 arg0, class63 arg1) {
        this.field92 = arg1;
        this.field79 = arg0;
        this.field86 = (this.field92.field4958 * this.field92.field4956 >> this.field79.field658) + 2;
        this.field91 = (this.field92.field4960 * this.field92.field4958 >> this.field79.field658) + 2;
        this.field85 = this.field79.field658 + 7 - this.field92.field4962;
        this.field88 = new byte[this.field91 * this.field86];
        this.field80 = this.field92.field4956 >> this.field85;
        this.field83 = this.field92.field4960 >> this.field85;
    }
}
