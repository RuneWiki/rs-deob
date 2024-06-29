import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class163 extends class3 {

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    private int field2587 = 4096;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    private int field2593 = 0;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "Le;")
    public static class248 field2584;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "[I")
    public static int[] field2591;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V", line = 4)
    public static final void method1144(int arg0) {
        field2588++;
        class216 var1 = class275.field4544;
        synchronized (class275.field4544) {
            class197.field3032 = class117.field1711;
            class3.field24++;
            class305.field4988 = class319.field5259;
            class130.field1982 = class223.field3441;
            class161.field2569 = class26.field394;
            if (arg0 != 28666) {
                method1147(13, 112);
            }
            class241.field3777 = class84.field1205;
            class69.field1074 = class11.field123;
            class20.field241 = class283.field4651;
            class26.field394 = 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)[[I", line = 31)
    public final int[][] method22(int arg0, int arg1) {
        field2586++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (arg0 != -21194) {
            this.field2593 = -88;
        }
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) 99);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class326.field5342; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (this.field2593 > var13) {
                    var7[var11] = this.field2593;
                } else if (var13 <= this.field2587) {
                    var7[var11] = var13;
                } else {
                    var7[var11] = this.field2587;
                }
                if (this.field2593 > var12) {
                    var9[var11] = this.field2593;
                } else if (var12 > this.field2587) {
                    var9[var11] = this.field2587;
                } else {
                    var9[var11] = var12;
                }
                if (this.field2593 > var14) {
                    var10[var11] = this.field2593;
                } else if (this.field2587 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field2587;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lfh;IZ)V", line = 108)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field2592++;
        if (arg1 == 0) {
            this.field2593 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field2587 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field34 = arg0.method2224(-121) == 1;
        }
        if (arg2) {
            method1147(-128, -17);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIII)V", line = 153)
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            field2584 = (class248) null;
        }
        class211 var5 = class17.method115(8, arg4, 4086);
        field2589++;
        var5.method1433(true);
        var5.field3211 = arg1;
        var5.field3210 = arg3;
        var5.field3209 = arg2;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)V", line = 172)
    public static void method1146(byte arg0) {
        field2584 = null;
        if (arg0 == -72) {
            field2591 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[I", line = 185)
    public final int[] method25(byte arg0, int arg1) {
        field2582++;
        if (arg0 < 57) {
            return (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field2593) {
                    var3[var5] = this.field2593;
                } else if (this.field2587 < var6) {
                    var3[var5] = this.field2587;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 226)
    public class163() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V", line = 241)
    public static final void method1147(int arg0, int arg1) {
        class50 var2 = class264.field4230[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class50 var4 = class264.field4230[var3][arg0][arg1] = class264.field4230[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field729--;
                for (int var5 = 0; var5 < var4.field735; var5++) {
                    class258 var6 = var4.field752[var5];
                    if ((var6.field4076 >> 29 & 0x3L) == 2L && var6.field4082 == arg0 && var6.field4081 == arg1) {
                        var6.field4085--;
                    }
                }
            }
        }
        if (class264.field4230[0][arg0][arg1] == null) {
            class264.field4230[0][arg0][arg1] = new class50(0, arg0, arg1);
        }
        class264.field4230[0][arg0][arg1].field745 = var2;
        class264.field4230[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(B)V", line = 278)
    public static final void method1148(byte arg0) {
        field2583++;
        if (!class261.method1836(0) && class120.field1779 != class119.field1760) {
            class304.method2132(class120.field1779, class50.field749, false, class329.field5388.field4757[0], false, class328.field5362, class329.field5388.field4762[0], (byte) -115);
            return;
        }
        class139.method972((byte) -61);
        if (arg0 < 123) {
            method1147(3, 88);
        }
        if (class320.field5277 != class120.field1779) {
            class49.method365(255);
        }
    }
}
