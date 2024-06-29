import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class263 extends class23 {

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    private int field4389 = 0;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    private int field4395 = 0;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    private int field4388 = 0;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Lqd;")
    public static class40 field4391 = class147.method1106("Fallen lassen", (byte) -75);

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field4393 = -2;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Lpl;")
    public static class186 field4394 = new class186(64);

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "Lqd;")
    public static class40 field4408 = class147.method1106(" )2>", (byte) -104);

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "[I")
    public static int[] field4409 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    private int field4398;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
    private int field4400;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
    private int field4402;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
    private int field4403;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "[I")
    public static int[] field4401;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lth;Lce;Lce;ILce;)Z", line = 8)
    public static final boolean method1846(class80 arg0, class239 arg1, class239 arg2, int arg3, class239 arg4) {
        class306.field5137 = arg4;
        class89.field1607 = arg2;
        if (arg3 != 1960552908) {
            field4394 = (class186) null;
        }
        field4406++;
        class45.field877 = arg1;
        class202.field3206 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIII)V", line = 27)
    private final void method1847(byte arg0, int arg1, int arg2, int arg3) {
        field4399++;
        int var5 = arg1 >= arg3 ? arg1 : arg3;
        int var6 = var5 < arg2 ? arg2 : var5;
        int var7 = arg1 <= arg3 ? arg1 : arg3;
        int var8 = var7 <= arg2 ? var7 : arg2;
        this.field4390 = (var8 + var6) / 2;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field4402 = 0;
        } else {
            int var10 = (var6 - arg1 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (arg3 == var6) {
                this.field4402 = arg1 == var8 ? var11 + 20480 : -var10 + 4096;
            } else if (arg1 == var6) {
                this.field4402 = arg2 == var8 ? var12 + 4096 : -var11 + 12288;
            } else {
                this.field4402 = arg3 == var8 ? var10 + 12288 : 20480 - var12;
            }
            this.field4402 /= 6;
        }
        if (this.field4390 > 0 && this.field4390 < 4096) {
            this.field4405 = (var9 << 12) / (this.field4390 > 2048 ? 8192 - (this.field4390 * 2) : this.field4390 * 2);
        } else {
            this.field4405 = 0;
        }
        if (arg0 != 99) {
            field4408 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 89)
    public class263() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[[I", line = 100)
    public final int[][] method17(int arg0, int arg1) {
        int[][] var3 = this.field417.method1251(arg1, 126);
        if (arg0 < 30) {
            this.field4400 = 55;
        }
        field4396++;
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) -104);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class52.field1007; var11++) {
                this.method1847((byte) 99, var8[var11], var6[var11], var5[var11]);
                this.field4405 += this.field4389;
                this.field4402 += this.field4388;
                this.field4390 += this.field4395;
                while (this.field4402 < 0) {
                    this.field4402 += 4096;
                }
                if (this.field4405 < 0) {
                    this.field4405 = 0;
                }
                while (this.field4402 > 4096) {
                    this.field4402 -= 4096;
                }
                if (this.field4405 > 4096) {
                    this.field4405 = 4096;
                }
                if (this.field4390 < 0) {
                    this.field4390 = 0;
                }
                if (this.field4390 > 4096) {
                    this.field4390 = 4096;
                }
                this.method1848(this.field4402, this.field4405, -107, this.field4390);
                var7[var11] = this.field4398;
                var10[var11] = this.field4400;
                var9[var11] = this.field4403;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V", line = 169)
    private final void method1848(int arg0, int arg1, int arg2, int arg3) {
        field4387++;
        int var5 = -88 / ((47 - arg2) / 57);
        int var6 = arg3 <= 2048 ? (arg1 + 4096) * arg3 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
        if (var6 <= 0) {
            this.field4398 = this.field4400 = this.field4403 = arg3;
            return;
        }
        int var7 = arg3 + arg3 - var6;
        int var8 = (var6 - var7 << 12) / var6;
        int var10 = var8 * var6 >> 12;
        int var11 = arg0 * 6;
        int var12 = var11 >> 12;
        int var13 = var11 - (var12 << 12);
        int var14 = var10 * var13 >> 12;
        int var15 = var6 - var14;
        int var16 = var7 + var14;
        if (var12 == 0) {
            this.field4403 = var7;
            this.field4400 = var16;
            this.field4398 = var6;
        } else if (var12 == 1) {
            this.field4403 = var7;
            this.field4398 = var15;
            this.field4400 = var6;
        } else if (var12 == 2) {
            this.field4398 = var7;
            this.field4403 = var16;
            this.field4400 = var6;
        } else if (var12 == 3) {
            this.field4398 = var7;
            this.field4400 = var15;
            this.field4403 = var6;
        } else if (var12 == 4) {
            this.field4403 = var6;
            this.field4400 = var7;
            this.field4398 = var16;
        } else if (var12 == 5) {
            this.field4400 = var7;
            this.field4403 = var15;
            this.field4398 = var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILsd;)V", line = 294)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field4388 = arg2.method201(true);
        } else if (arg0 == 1) {
            this.field4389 = (arg2.method234(arg1 + 2193) << 12) / 100;
        } else if (arg0 == 2) {
            this.field4395 = (arg2.method234(2193) << 12) / 100;
        }
        if (arg1 == 0) {
            field4404++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIIILoe;)V", line = 336)
    public static final void method1849(byte arg0, int arg1, int arg2, int arg3, class121 arg4) {
        int var5 = 83 / ((15 - arg0) / 61);
        field4392++;
        if (class255.field4252 >= 400) {
            return;
        }
        if (arg4.field2098 != null) {
            arg4 = arg4.method918(-1);
        }
        if (arg4 == null || !arg4.field2079) {
            return;
        }
        class40 var6 = arg4.field2064;
        if (arg4.field2075 != 0) {
            var6 = class153.method1192(new class40[] { var6, class78.method580(arg4.field2075, class255.field4233.field4320, -26482), class6.field94, class60.field1153, class276.method1927((byte) -69, arg4.field2075), class298.field4985 }, (byte) -115);
        }
        if (class274.field4566 == 1) {
            class277.method1941(arg2, class153.method1192(new class40[] { class3.field27, class129.field2219, var6 }, (byte) 123), (short) 26, arg1, (long) arg3, 103, class12.field207);
            class126.field2182++;
        } else if (!class274.field4549) {
            class40[] var7 = arg4.field2046;
            if (class169.field2782) {
                var7 = class210.method1479(var7, (byte) 115);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class249.field4110 != 0 || !var7[var8].method327(class189.field3062, -21581))) {
                        class17.field257++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 33;
                        }
                        if (var8 == 1) {
                            var9 = 19;
                        }
                        if (var8 == 2) {
                            var9 = 14;
                        }
                        if (var8 == 3) {
                            var9 = 17;
                        }
                        if (var8 == 4) {
                            var9 = 13;
                        }
                        class277.method1941(arg2, class153.method1192(new class40[] { class244.field4028, var6 }, (byte) 121), var9, arg1, (long) arg3, 83, var7[var8]);
                    }
                }
            }
            if (class249.field4110 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method327(class189.field3062, -21581)) {
                        class27.field564++;
                        short var11 = 0;
                        if (var10 == 0) {
                            var11 = 33;
                        }
                        short var12 = 0;
                        if (arg4.field2075 > class255.field4233.field4320) {
                            var12 = 2000;
                        }
                        if (var10 == 1) {
                            var11 = 19;
                        }
                        if (var10 == 2) {
                            var11 = 14;
                        }
                        if (var10 == 3) {
                            var11 = 17;
                        }
                        if (var10 == 4) {
                            var11 = 13;
                        }
                        if (var11 != 0) {
                            var11 += var12;
                        }
                        class277.method1941(arg2, class153.method1192(new class40[] { class244.field4028, var6 }, (byte) 122), var11, arg1, (long) arg3, 106, var7[var10]);
                    }
                }
            }
            field4397++;
            class277.method1941(arg2, class153.method1192(new class40[] { class244.field4028, var6 }, (byte) 122), (short) 1003, arg1, (long) arg3, 57, class81.field1432);
        } else if ((class306.field5130 & 0x2) == 2) {
            class160.field2686++;
            class277.method1941(arg2, class153.method1192(new class40[] { class300.field5012, class129.field2219, var6 }, (byte) 126), (short) 35, arg1, (long) arg3, 112, class277.field4638);
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 496)
    public static void method1850(int arg0) {
        field4409 = null;
        field4408 = null;
        if (arg0 == 2) {
            field4391 = null;
            field4394 = null;
            field4401 = null;
        }
    }
}
