import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 extends class51 {

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "client!ca", name = "ob", descriptor = "I")
    private int field381 = 0;

    @OriginalMember(owner = "client!ca", name = "qb", descriptor = "I")
    private int field383 = 0;

    @OriginalMember(owner = "client!ca", name = "hb", descriptor = "[S")
    public static short[] field374 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ca", name = "tb", descriptor = "[I")
    public static int[] field386 = new int[32];

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!ca", name = "sb", descriptor = "Led;")
    public static class43 field385 = class191.method1219("::fpsoff", false);

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ca", name = "ib", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ca", name = "jb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ca", name = "lb", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!ca", name = "mb", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!ca", name = "nb", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ca", name = "pb", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!ca", name = "rb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ca", name = "ub", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!ca", name = "kb", descriptor = "Lpe;")
    public static class141 field377;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "Ljava/awt/Image;")
    public static Image field366;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field371 = (arg0.method577((byte) 30) << 12) / 100;
                    }
                } else {
                    this.field383 = (arg0.method577((byte) 30) << 12) / 100;
                }
            } else {
                this.field381 = arg0.method552((byte) -128);
            }
            ++field370;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZIZ)Led;")
    public static final class43 method103(boolean arg0, int arg1, boolean arg2) {
        ++field376;
        if (!arg0) {
            method103(false, 57, false);
        }
        return class136.method883(arg1, (byte) 53, arg2, 10);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZII)V")
    private final void method104(int arg0, boolean arg1, int arg2, int arg3) {
        ++field372;
        int var5 = arg2 <= 2048 ? (4096 - -arg3) * arg2 >> 12 : -(arg2 * arg3 >> 12) + arg3 + arg2;
        if (var5 <= 0) {
            this.field382 = this.field378 = this.field367 = arg2;
        } else {
            int var6 = -var5 + arg2 + arg2;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg0 * 6;
            int var9 = var8 >> 12;
            int var10 = -(var9 << 12) + var8;
            int var12 = var7 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field378 = var6;
                                    this.field382 = var5;
                                    this.field367 = var15;
                                }
                            } else {
                                this.field382 = var14;
                                this.field378 = var6;
                                this.field367 = var5;
                            }
                        } else {
                            this.field378 = var15;
                            this.field367 = var5;
                            this.field382 = var6;
                        }
                    } else {
                        this.field382 = var6;
                        this.field367 = var14;
                        this.field378 = var5;
                    }
                } else {
                    this.field382 = var15;
                    this.field378 = var5;
                    this.field367 = var6;
                }
            } else {
                this.field378 = var14;
                this.field382 = var5;
                this.field367 = var6;
            }
        }
        if (arg1) {
            method103(true, 78, true);
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public static void method105(int arg0) {
        field385 = null;
        field366 = null;
        field377 = null;
        field374 = null;
        if (arg0 != 9179409) {
            method107(false, (class202) null, (class202) null);
        }
        field386 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBII)V")
    private final void method106(int arg0, byte arg1, int arg2, int arg3) {
        ++field368;
        int var5 = ~arg0 >= ~arg2 ? arg2 : arg0;
        int var6 = ~var5 > ~arg3 ? arg3 : var5;
        if (arg1 == 0) {
            int var7 = arg2 > arg0 ? arg0 : arg2;
            int var8 = ~var7 < ~arg3 ? arg3 : var7;
            this.field369 = (var6 + var8) / 2;
            int var9 = -var8 + var6;
            if (var9 > 0) {
                if (~this.field369 < -1 && ~this.field369 > -4097) {
                    this.field379 = (var9 << 12) / (~this.field369 < -2049 ? 8192 - this.field369 * 2 : this.field369 * 2);
                }
                int var10 = (-arg0 + var6 << 12) / var9;
                int var11 = (-arg3 + var6 << 12) / var9;
                int var12 = (var6 - arg2 << 12) / var9;
                if (arg0 != var6) {
                    if (arg2 == var6) {
                        this.field387 = arg3 == var8 ? var10 + 4096 : -var11 + 12288;
                    } else {
                        this.field387 = arg0 == var8 ? var12 + 12288 : -var10 + 20480;
                    }
                } else {
                    this.field387 = ~arg2 == ~var8 ? var11 + 20480 : 4096 - var12;
                }
                this.field387 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLwc;Lwc;)V")
    public static final void method107(boolean arg0, class202 arg1, class202 arg2) {
        ++field380;
        if (class5.field112) {
            class26.method128(true, arg1, arg2);
        } else {
            if (~class174.field3473 == -1 || ~class174.field3473 == -6) {
                byte var3 = 20;
                int var4 = -var3 + 253;
                arg1.method935(class129.field2668, 382, -var3 + 245, 16777215, -1);
                class168.method1041(230, var4, 304, 34, 9179409);
                class168.method1041(231, var4 + 1, 302, 32, 0);
                class168.method1046(232, var4 + 2, class95.field1856 * 3, 30, 9179409);
                class168.method1046(class95.field1856 * 3 + 232, var4 + 2, -(class95.field1856 * 3) + 300, 30, 0);
                arg1.method935(class68.field1366, 382, 276 - var3, 16777215, -1);
            }
            if (arg0) {
                if (~class174.field3473 == -21) {
                    class35.field645.method1163(-(class35.field645.field3574 / 2) + 382, -(class35.field645.field3576 / 2) + 271);
                    short var5 = 211;
                    arg1.method935(class68.field1361, 382, var5, 16776960, 0);
                    int var23 = var5 + 15;
                    arg1.method935(class68.field1371, 382, var23, 16776960, 0);
                    int var24 = var23 + 15;
                    arg1.method935(class68.field1358, 382, var24, 16776960, 0);
                    int var25 = var24 + 15;
                    int var26 = var25 + 10;
                    arg1.method954(class167.method1036(new class43[] { class176.field3506, class151.method945(class68.field1374) }, true), 272, var26, 16777215, 0);
                    int var27 = var26 + 15;
                    arg1.method954(class167.method1036(new class43[] { class88.field1712, class68.field1368.method253(true) }, true), 274, var27, 16777215, 0);
                    int var28 = var27 + 15;
                }
                if (~class174.field3473 == -11) {
                    class35.field645.method1163(202, 171);
                    if (~class201.field3944 != -1) {
                        if (~class201.field3944 == -3) {
                            short var6 = 302;
                            short var7 = 321;
                            short var8 = 211;
                            arg1.method935(class68.field1361, 382, var8, 16776960, 0);
                            int var29 = var8 + 15;
                            arg1.method935(class68.field1371, 382, var29, 16776960, 0);
                            int var30 = var29 + 15;
                            arg1.method935(class68.field1358, 382, var30, 16776960, 0);
                            int var31 = var30 + 15;
                            boolean var9;
                            if (class121.field2430 == 0 && ~(client.field559 % 40) > -21 && class119.field2376) {
                                var9 = true;
                            } else {
                                var9 = false;
                            }
                            var29 = var31 + 10;
                            arg1.method954(class167.method1036(new class43[] { class176.field3506, class151.method945(class68.field1374), var9 ? class103.field1951 : class68.field1363 }, true), 272, var29, 16777215, 0);
                            boolean var10;
                            if (~class121.field2430 == -2 && client.field559 % 40 < 20 && class119.field2376) {
                                var10 = true;
                            } else {
                                var10 = false;
                            }
                            var29 += 15;
                            arg1.method954(class167.method1036(new class43[] { class88.field1712, class68.field1368.method253(true), var10 ? class103.field1951 : class68.field1363 }, true), 274, var29, 16777215, 0);
                            var29 += 15;
                            class60.field1229.method1163(var6 + -73, var7 + -20);
                            arg1.method935(class175.field3489, var6, var7 + 5, 16777215, 0);
                            short var11 = 462;
                            class60.field1229.method1163(var11 + -73, var7 + -20);
                            arg1.method935(class156.field3144, var11, var7 + 5, 16777215, 0);
                        } else if (class201.field3944 == 3) {
                            arg1.method935(class164.field3273, 382, 211, 16776960, 0);
                            short var12 = 236;
                            arg1.method935(class171.field3427, 382, var12, 16777215, 0);
                            short var13 = 382;
                            short var14 = 321;
                            int var32 = var12 + 15;
                            arg1.method935(class107.field2035, 382, var32, 16777215, 0);
                            int var33 = var32 + 15;
                            arg1.method935(class29.field532, 382, var33, 16777215, 0);
                            int var34 = var33 + 15;
                            arg1.method935(class104.field1981, 382, var34, 16777215, 0);
                            class60.field1229.method1163(var13 + -73, var14 + -20);
                            arg1.method935(class156.field3144, var13, var14 - -5, 16777215, 0);
                            int var35 = var34 + 15;
                        }
                    } else {
                        short var15 = 251;
                        arg1.method935(class85.field1663, 382, var15, 16776960, 0);
                        short var16 = 302;
                        short var17 = 291;
                        class60.field1229.method1163(var16 + -73, var17 + -20);
                        int var36 = var15 + 30;
                        arg1.method948(class84.field1646, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                        short var18 = 462;
                        class60.field1229.method1163(var18 + -73, var17 + -20);
                        arg1.method948(class170.field3395, var18 - 73, var17 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    }
                }
                if (class69.field1378 != 1) {
                    if (~class207.field4054 < -1) {
                        class103.method638(true, class207.field4054);
                        class207.field4054 = 0;
                    }
                    class121.method795((byte) -93);
                }
                class154.field3136[class159.field3214 ? 1 : 0].method1163(725, 463);
                if (class174.field3473 > 5 && class104.field1994 != 2 && ~class40.field776 == -1) {
                    if (class7.field134 != null) {
                        byte var19 = 35;
                        short var20 = 463;
                        byte var21 = 100;
                        byte var22 = 5;
                        class7.field134.method1163(var22, var20);
                        arg1.method935(class167.method1036(new class43[] { class29.field535, class167.field3322, class30.method161(class95.field1859, 10) }, true), var21 / 2 + var22, var20 - -(var19 / 2) - 2, 16777215, 0);
                        if (class85.field1666 == null) {
                            arg2.method935(class82.field1622, var21 / 2 + var22, var19 / 2 + var20 + 12, 16777215, 0);
                        } else {
                            arg2.method935(class52.field1059, var21 / 2 + var22, var19 / 2 + 12 + var20, 16777215, 0);
                        }
                    } else {
                        class7.field134 = class193.method1232(class157.field3171, class68.field1363, class2.field50, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        ++field375;
        if (arg1 != -94) {
            field385 = null;
        }
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(0, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[2];
            for (int var11 = 0; class122.field2442 > var11; ++var11) {
                this.method106(var6[var11], (byte) 0, var5[var11], var10[var11]);
                this.field379 += this.field383;
                this.field369 += this.field371;
                for (this.field387 += this.field381; this.field387 < 0; this.field387 += 4096) {
                }
                while (this.field387 > 4096) {
                    this.field387 -= 4096;
                }
                if (this.field379 < 0) {
                    this.field379 = 0;
                }
                if (this.field369 < 0) {
                    this.field369 = 0;
                }
                if (~this.field379 < -4097) {
                    this.field379 = 4096;
                }
                if (~this.field369 < -4097) {
                    this.field369 = 4096;
                }
                this.method104(this.field387, false, this.field369, this.field379);
                var9[var11] = this.field382;
                var7[var11] = this.field378;
                var8[var11] = this.field367;
            }
        }
        return var3;
    }
}
