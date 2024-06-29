import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class217 extends class152 {

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Z")
    public boolean field3958 = false;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lt;")
    private class66 field3960;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Z")
    private boolean field3946;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Z")
    private boolean field3945;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field3955;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[Z")
    public static boolean[] field3942 = new boolean[112];

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lhh;")
    public static class163 field3941 = class137.method1065("<col=80ff00>", 17);

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "[I")
    public static int[] field3956 = new int[32];

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "F")
    private float field3951;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "Lpa;")
    public static class123 field3957;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "[I")
    private int[] field3953;

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3944++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1538(int arg0, int arg1) {
        class237 var2 = class57.field940;
        synchronized (class57.field940) {
            int var3 = -16 / ((-arg1 - 54) / 45);
            class69.field1176 = arg0;
        }
        field3961++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lqh;III)V")
    public static final void method1539(class69 arg0, int arg1, int arg2, int arg3) {
        field3954++;
        if (arg2 <= 78) {
            field3940 = -96;
        }
        if (arg0.field1214 == 0) {
            arg0.field1243 = arg0.field1298;
        } else if (arg0.field1214 == 1) {
            arg0.field1243 = (arg3 - arg0.field1183) / 2 + arg0.field1298;
        } else if (arg0.field1214 == 2) {
            arg0.field1243 = arg3 - arg0.field1183 - arg0.field1298;
        } else if (arg0.field1214 == 3) {
            arg0.field1243 = arg0.field1298 * arg3 >> 14;
        } else if (arg0.field1214 == 4) {
            arg0.field1243 = (arg0.field1298 * arg3 >> 14) + (arg3 - arg0.field1183) / 2;
        } else {
            arg0.field1243 = arg3 - ((arg0.field1298 * arg3 >> 14) + arg0.field1183);
        }
        if (arg0.field1231 == 0) {
            arg0.field1218 = arg0.field1167;
        } else if (arg0.field1231 == 1) {
            arg0.field1218 = (arg1 - arg0.field1220) / 2 + arg0.field1167;
        } else if (arg0.field1231 == 2) {
            arg0.field1218 = arg1 - arg0.field1167 - arg0.field1220;
        } else if (arg0.field1231 == 3) {
            arg0.field1218 = arg0.field1167 * arg1 >> 14;
        } else if (arg0.field1231 == 4) {
            arg0.field1218 = (arg0.field1167 * arg1 >> 14) + (arg1 - arg0.field1220) / 2;
        } else {
            arg0.field1218 = arg1 - arg0.field1220 - (arg0.field1167 * arg1 >> 14);
        }
        if (!class127.field2470 || client.method826(arg0) == 0 && arg0.field1294 != 0) {
            return;
        }
        if (arg0.field1218 < 0) {
            arg0.field1218 = 0;
        } else if (arg1 < arg0.field1218 + arg0.field1220) {
            arg0.field1218 = arg1 - arg0.field1220;
        }
        if (arg0.field1243 < 0) {
            arg0.field1243 = 0;
        } else if ((arg0.field1243 + arg0.field1183) > arg3) {
            arg0.field1243 = arg3 - arg0.field1183;
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpa;Lmf;B)Z")
    public final boolean method1540(class123 arg0, class83 arg1, byte arg2) {
        if (arg2 >= -121) {
            method1544(false);
        }
        field3949++;
        return this.field3960.method459(arg1, arg0, 34);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static final void method1541(boolean arg0) {
        if (!arg0) {
            method1545(-56);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class110.field2086[var1] = true;
        }
        field3947++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpa;BFZLmf;)[I")
    public final int[] method1542(class123 arg0, byte arg1, float arg2, boolean arg3, class83 arg4) {
        field3943++;
        if (arg1 != -58) {
            this.method1540((class123) null, (class83) null, (byte) -16);
        }
        if (this.field3953 == null || this.field3951 != arg2) {
            if (!this.field3960.method459(arg4, arg0, 62)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field3953 = this.field3960.method457(this.field3945, arg0, true, arg4, (double) arg2, var6, -127, var6);
            this.field3951 = arg2;
            if (this.field3946) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field3953[var12];
                        var7[var34] += class7.method50(16712878, var35) >> 16;
                        var9[var34] += class7.method50(65292, var35) >> 8;
                        var8[var34] += class7.method50(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var22 += var9[var25];
                        var24 += var7[var25];
                        var23 += var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var23 / 9;
                        var25--;
                        int var32 = var22 / 9;
                        int var33 = var24 / 9;
                        var19--;
                        var10[var19] = class3.method27(class3.method27(var33 << 16, var32 << 8), var31);
                        var21--;
                        var23 += var8[var25] - var8[var21];
                        var22 += var9[var25] - var9[var21];
                        var24 += var7[var25] - var7[var21];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field3953[var12];
                        var13--;
                        int var30 = this.field3953[var13];
                        var7[var28] += (class7.method50(var29, 16738767) >> 16) - (class7.method50(16735404, var30) >> 16);
                        var9[var28] += class7.method50(var29 >> 8, 255) - (class7.method50(var30, 65489) >> 8);
                        var8[var28] += -class7.method50(255, var30) + class7.method50(var29, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field3953 = var10;
            }
        }
        return this.field3953;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBLpa;Lmf;)[I")
    public final int[] method1543(boolean arg0, byte arg1, class123 arg2, class83 arg3) {
        if (arg1 != -105) {
            method1541(true);
        }
        field3959++;
        if (this.field3960.method459(arg3, arg2, 112)) {
            int var5 = arg0 ? 64 : 128;
            return this.field3960.method457(this.field3945, arg2, false, arg3, 1.0D, var5, -123, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public static void method1544(boolean arg0) {
        field3942 = null;
        if (!arg0) {
            field3942 = null;
        }
        field3956 = null;
        field3957 = null;
        field3941 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public static final void method1545(int arg0) {
        field3952++;
        int var1 = class190.field3484;
        int var2 = 20 % ((66 - arg0) / 47);
        int var3 = class153.field2867;
        int var4 = 6116423;
        int var5 = class239.field4247;
        int var6 = class14.field221;
        class206.method1483(var1, var6, var3, var5, var4);
        class206.method1483(var1 + 1, var6 + 1, var3 - 2, 16, 0);
        class206.method1471(var1 + 1, var6 - -18, var3 - 2, var5 + -19, 0);
        class216.field3932.method592(class265.field4615, var1 + 3, var6 + 14, var4, -1);
        int var7 = class240.field4281;
        int var8 = class36.field608;
        for (int var9 = 0; var9 < class202.field3647; var9++) {
            int var10 = (class202.field3647 - var9 - 1) * 15 + var6 + 31;
            int var11 = 16777215;
            if (var1 < var8 && var8 < var1 + var3 && var7 > var10 - 13 && var7 < var10 + 3) {
                var11 = 16776960;
            }
            class216.field3932.method592(class110.method882((byte) -55, var9), var1 + 3, var10, var11, 0);
        }
        class75.method550(class14.field221, 0, class153.field2867, class190.field3484, class239.field4247);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
    public final void method1546(byte arg0, int arg1) {
        field3950++;
        if (arg0 <= 62 || this.field3953 == null || this.field3955 == 0 && this.field3948 == 0) {
            return;
        }
        if (class210.field3799 == null || this.field3953.length > class210.field3799.length) {
            class210.field3799 = new int[this.field3953.length];
        }
        int var3 = this.field3948 * arg1;
        int var4 = this.field3953.length;
        int var5 = this.field3953.length == 4096 ? 64 : 128;
        int var6 = var4 - 1;
        int var7 = this.field3955 * arg1 * var5;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var4; var9 += var5) {
            int var11 = var9 + var7 & var6;
            for (int var12 = 0; var12 < var5; var12++) {
                int var13 = var9 + var12;
                int var14 = (var8 & var3 + var12) + var11;
                class210.field3799[var13] = this.field3953[var14];
            }
        }
        int[] var10 = this.field3953;
        this.field3953 = class210.field3799;
        class210.field3799 = var10;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lpg;)V")
    public class217(class81 arg0) {
        this.field3960 = new class66(arg0);
        this.field3946 = arg0.method622(true) == 1;
        this.field3945 = arg0.method622(true) == 1;
        arg0.method622(true);
        arg0.method622(true);
        int var2 = arg0.method622(true) & 0x3;
        this.field3948 = arg0.method635(-90);
        this.field3955 = arg0.method635(-65);
        arg0.method622(true);
        arg0.method622(true);
    }
}
