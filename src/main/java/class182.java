import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class182 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
    private int[] field3125;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "[I")
    private int[] field3136;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[B")
    private byte[] field3140;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[[S")
    public static short[][] field3129 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Le;")
    public static class191 field3126 = class54.method368("W-=hlen Sie eine Welt", 2047);

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3131 = 0;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[I")
    public static int[] field3130 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Le;")
    public static class191 field3135 = null;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Le;")
    public static class191 field3134 = class54.method368("Update)2Liste geladen)3", 2047);

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3138 = 0;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Leg;")
    public static class33 field3139;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1228(byte arg0) {
        int var1 = 37 % ((arg0 + 40) / 44);
        field3139 = null;
        field3126 = null;
        field3130 = null;
        field3134 = null;
        field3129 = null;
        field3135 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public static final void method1229(int arg0, int arg1) {
        field3133++;
        class241 var2 = class14.method97(arg1, arg0, arg1 - 115);
        var2.method1691(0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[B[B)I")
    public final int method1230(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field3137++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg1 >= -64) {
            this.method1231(-56, (byte[]) null, 34, (byte[]) null, -105, -79);
        }
        int var8 = arg0 + arg3;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var7 = this.field3125[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var11);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var12;
            if ((var12 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var13;
            if ((var13 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var14;
            if ((var14 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var15;
            if ((var15 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var16;
            if ((var16 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var17;
            if ((var17 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3125[var7];
            }
            int var18;
            if ((var18 = this.field3125[var7]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[BI[BII)I")
    public final int method1231(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg2 + arg5;
        int var8 = 0;
        field3132++;
        int var9 = arg4 << 3;
        while (arg5 < var7) {
            int var10 = arg3[arg5] & 0xFF;
            byte var11 = this.field3140[var10];
            int var12 = this.field3136[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class217.method1476(var15, var12 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var12 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var12 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var12 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            var9 += var11;
            arg5++;
        }
        if (arg0 != 7) {
            field3129 = null;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([B)V")
    public class182(byte[] arg0) {
        int var2 = 0;
        int var3 = arg0.length;
        this.field3125 = new int[8];
        int[] var4 = new int[33];
        this.field3136 = new int[var3];
        this.field3140 = arg0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field3136[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class217.method1476(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3125[var14] == 0) {
                            this.field3125[var14] = var2;
                        }
                        var14 = this.field3125[var14];
                    }
                    if (var14 >= this.field3125.length) {
                        int[] var17 = new int[this.field3125.length * 2];
                        for (int var18 = 0; var18 < this.field3125.length; var18++) {
                            var17[var18] = this.field3125[var18];
                        }
                        this.field3125 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
                this.field3125[var14] = ~var5;
            }
        }
    }
}
