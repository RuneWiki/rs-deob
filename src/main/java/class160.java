import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class160 extends class115 {

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Z")
    private boolean field2315 = true;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Z")
    private boolean field2324 = true;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "[I")
    public static int[] field2325 = new int[50];

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
    public static final void method1073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class280.field4470 < 100) {
            class91.method619(2);
        }
        class144.method950(arg1, arg2, arg0 + arg1, arg2 - -arg4);
        ++field2316;
        if (class280.field4470 < 100) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg1;
            int var7 = arg4 / 2 + -var5 + arg2 + -18;
            class144.method955(arg1, arg2, arg0, arg4, 0);
            class144.method951(var6 + -152, var7, 304, 34, 9179409);
            class144.method951(var6 + -151, var7 + 1, 302, 32, 0);
            class144.method955(var6 + -150, var7 + 2, class280.field4470 * 3, 30, 9179409);
            class144.method955(class280.field4470 * 3 + var6 + -150, var7 + 2, 300 - class280.field4470 * 3, 30, 0);
            class179.field2556.method1289(class284.field4516, var6, var5 + var7, 16777215, -1);
        } else {
            class234.field3539 = (int) ((float) (arg0 * 2) / class276.field4428);
            class179.field2558 = -((int) ((float) arg0 / class276.field4428)) + class136.field1967;
            if (arg3 != 9179409) {
                field2322 = -101;
            }
            class42.field609 = -((int) ((float) arg4 / class276.field4428)) + class286.field4544;
            class259.field3916 = (int) ((float) (arg4 * 2) / class276.field4428);
            int var8 = -((int) ((float) arg4 / class276.field4428)) + class286.field4544;
            int var9 = class136.field1967 - (int) ((float) arg0 / class276.field4428);
            int var10 = (int) ((float) arg0 / class276.field4428) + class136.field1967;
            int var11 = (int) ((float) arg4 / class276.field4428) + class286.field4544;
            class120.method821(var11, arg1, var10, arg0 + arg1, arg2, var9, arg2 + arg4, (byte) 96, var8);
            class240.method1565(arg2, var11, var10, var8, var9, arg1, 1285513040, arg2 - -arg4, arg0 + arg1);
            class181.method1170(arg1, var9, var11, arg2 + arg4, arg3 + -9179524, arg0 + arg1, var8, arg2, var10);
            if (class80.field1235 > 0) {
                --class140.field2029;
                if (~class140.field2029 == -1) {
                    --class80.field1235;
                    class140.field2029 = 20;
                }
            }
            if (class246.field3676) {
                int var12 = arg0 + -5 + arg1;
                int var13 = arg2 - -arg4 + -8;
                class258.field3914.method1282("Fps:" + class33.field483, var12, var13, 16776960, -1);
                Runtime var14 = Runtime.getRuntime();
                int var15 = 16776960;
                int var16 = (int) ((var14.totalMemory() + -var14.freeMemory()) / 1024L);
                int var17 = var13 - 15;
                if (var16 > 65536) {
                    var15 = 16711680;
                }
                class258.field3914.method1282("Mem:" + var16 + "k", var12, var17, var15, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field2327;
        if (arg0 > -33) {
            return null;
        } else {
            int[][] var3 = super.field1716.method6(arg1, (byte) -87);
            if (super.field1716.field23) {
                int[][] var4 = this.method798(0, 0, this.field2324 ? class5.field136 - arg1 : arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field2315) {
                    for (int var11 = 0; ~var11 > ~class77.field1178; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class77.field1178; ++var12) {
                        var8[var12] = var5[-var12 + class207.field2992];
                        var9[var12] = var6[-var12 + class207.field2992];
                        var10[var12] = var7[class207.field2992 - var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 != -1) {
            this.method168(4, (class114) null, -62);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1713 = arg1.method760(false) == 1;
                }
            } else {
                this.field2324 = ~arg1.method760(false) == -2;
            }
        } else {
            this.field2315 = ~arg1.method760(false) == -2;
        }
        ++field2323;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public static final void method1074(byte arg0) {
        ++field2320;
        int[] var1 = new int[class31.field460];
        int var2 = 0;
        for (int var3 = 0; ~class31.field460 < ~var3; ++var3) {
            class273 var5 = class259.method1735(var3, -14667);
            if (~var5.field4353 <= -1 || ~var5.field4338 <= -1) {
                var1[var2++] = var3;
            }
        }
        class171.field2461 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class171.field2461[var4] = var1[var4];
        }
        if (arg0 <= 108) {
            method1075(-116);
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public static final void method1075(int arg0) {
        ++field2318;
        class289.field4570.method257(false);
        if (arg0 == 100) {
            class171.field2454.method257(false);
            class61.field931.method257(false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static final void method1076(int arg0) {
        if (arg0 == 16) {
            for (int var1 = 0; var1 < class282.field4501; ++var1) {
                int var2 = class60.field909[var1];
                class72 var3 = class82.field1268[var2];
                int var4 = class68.field1071.method760(false);
                if ((16 & var4) != 0) {
                    var4 += class68.field1071.method760(false) << 8;
                }
                if (~(var4 & 128) != -1) {
                    int var5 = class68.field1071.method750((byte) 127);
                    int var6 = class68.field1071.method750((byte) 127);
                    var3.method66((byte) -113, class82.field1267, var5, var6);
                }
                if ((var4 & 256) != 0) {
                    int var7 = class68.field1071.method782(false);
                    int[] var8 = new int[var7];
                    int[] var9 = new int[var7];
                    int[] var10 = new int[var7];
                    for (int var11 = 0; ~var7 < ~var11; ++var11) {
                        int var12 = class68.field1071.method733(false);
                        if (var12 == 65535) {
                            var12 = -1;
                        }
                        var8[var11] = var12;
                        var9[var11] = class68.field1071.method760(false);
                        var10[var11] = class68.field1071.method757(-1380156360);
                    }
                    class286.method1926(var9, var10, var8, 87, var3);
                }
                if ((var4 & 4) != 0) {
                    int var13 = class68.field1071.method757(-1380156360);
                    int var14 = class68.field1071.method750((byte) 126);
                    if (var13 == 65535) {
                        var13 = -1;
                    }
                    class235.method1549(var13, var3, -1, var14);
                }
                if (~(var4 & 2) != -1) {
                    if (var3.field1119.method1816((byte) 100)) {
                        class140.method933(var3, (byte) -9);
                    }
                    var3.method487((byte) -3, class14.method115(class68.field1071.method756(-29901), (byte) -113));
                    var3.method67(var3.field1119.field4283, 17505);
                    var3.field107 = var3.field1119.field4254;
                    if (var3.field1119.method1816((byte) 121)) {
                        class276.method1861((class250) null, -123, (class53) null, var3.field50[0], 0, class163.field2364, var3.field119[0], var3);
                    }
                }
                if (~(var4 & 1) != -1) {
                    int var15 = class68.field1071.method756(-29901);
                    int var16 = class68.field1071.method735((byte) -59);
                    boolean var17 = true;
                    if (var15 == 65535) {
                        var15 = -1;
                    }
                    if (~var15 != 0 && ~var3.field81 != 0 && class70.method478(class274.method1848(true, var15).field138, false).field2830 < class70.method478(class274.method1848(true, var3.field81).field138, false).field2830) {
                        var17 = false;
                    }
                    if (var17) {
                        var3.field90 = 0;
                        var3.field120 = 0;
                        var3.field111 = var16 >> 16;
                        var3.field81 = var15;
                        var3.field40 = class82.field1267 - -(var16 & 65535);
                        if (~class82.field1267 > ~var3.field40) {
                            var3.field120 = -1;
                        }
                        var3.field46 = 1;
                        if (~var3.field81 != 0 && ~class82.field1267 == ~var3.field40) {
                            int var18 = class274.method1848(true, var3.field81).field138;
                            if (var18 != -1) {
                                class196 var19 = class70.method478(var18, false);
                                if (var19 != null && var19.field2818 != null) {
                                    class206.method1327(0, arg0 + -78, var19, false, var3.field94, var3.field45);
                                }
                            }
                        }
                    }
                }
                if (~(var4 & 8) != -1) {
                    int var20 = class68.field1071.method760(false);
                    int var21 = class68.field1071.method760(false);
                    var3.method66((byte) 74, class82.field1267, var20, var21);
                    var3.field82 = class82.field1267 + 300;
                    var3.field70 = class68.field1071.method760(false);
                }
                if ((512 & var4) != 0) {
                    var3.field95 = class68.field1071.method756(-29901);
                    var3.field51 = class68.field1071.method733(false);
                }
                if (~(var4 & 64) != -1) {
                    var3.field97 = class68.field1071.method746((byte) -41);
                    if (var3.field97 == 65535) {
                        var3.field97 = -1;
                    }
                }
                if (~(var4 & 32) != -1) {
                    var3.field69 = class68.field1071.method753(arg0 ^ -112);
                    var3.field115 = 100;
                }
            }
            ++field2326;
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
    public static void method1077(int arg0) {
        field2325 = null;
        if (arg0 != -31118) {
            method1073(-28, -87, -34, 90, 18);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class160() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field2319;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, this.field2324 ? -arg1 + class5.field136 : arg1, arg0 + -242153079);
            if (this.field2315) {
                for (int var5 = 0; var5 < class77.field1178; ++var5) {
                    var3[var5] = var4[-var5 + class207.field2992];
                }
            } else {
                class164.method1096(var4, 0, var3, 0, class77.field1178);
            }
        }
        return arg0 != 242152972 ? null : var3;
    }
}
