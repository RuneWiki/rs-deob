import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class187 extends class102 {

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "[S")
    private short[] field3466 = new short[512];

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    private int field3473 = 5;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "[B")
    private byte[] field3472 = new byte[512];

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    private int field3481 = 5;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    private int field3480 = 2048;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    private int field3484 = 1;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    private int field3475 = 2;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    private int field3476 = 0;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Lqe;")
    private static class179 field3467 = class206.method1380("Loading sprites )2 ", (byte) 93);

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "[Lpb;")
    public static class165[] field3477 = new class165[4];

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Lqe;")
    public static class179 field3465 = class206.method1380("", (byte) 37);

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Lqe;")
    public static class179 field3471 = field3467;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field3469 = 0;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lqe;")
    public static class179 field3487 = null;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lqe;")
    public static class179 field3485 = null;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lqe;")
    public static class179 field3492 = class206.method1380("(U2", (byte) -127);

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lqe;")
    public static class179 field3489 = class206.method1380("", (byte) 116);

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "[I")
    public static int[] field3493;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            field3469 = -126;
        }
        ++field3474;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = 2048 - -(class94.field1769[arg1] * this.field3473);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class155.field2796 > var7; ++var7) {
                class68.field1375 = Integer.MAX_VALUE;
                class201.field3725 = Integer.MAX_VALUE;
                class112.field2117 = Integer.MAX_VALUE;
                class109.field2025 = Integer.MAX_VALUE;
                int var8 = class124.field2292[var7] * this.field3481 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field3472[255 & (~var11 <= ~this.field3473 ? -this.field3473 + var11 : var11)];
                    for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (this.field3472[255 & (~var14 > ~this.field3481 ? var14 : var14 - this.field3481) + var13] & 255);
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field3466[var15]);
                        int var17 = -this.field3466[var27] - ((var11 << 12) - var4);
                        int var18 = this.field3484;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = var25 >= var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class109.field2025) {
                            if (~class112.field2117 < ~var19) {
                                class68.field1375 = class201.field3725;
                                class201.field3725 = class112.field2117;
                                class112.field2117 = var19;
                            } else if (~class201.field3725 < ~var19) {
                                class68.field1375 = class201.field3725;
                                class201.field3725 = var19;
                            } else if (~var19 > ~class68.field1375) {
                                class68.field1375 = var19;
                            }
                        } else {
                            class68.field1375 = class201.field3725;
                            class201.field3725 = class112.field2117;
                            class112.field2117 = class109.field2025;
                            class109.field2025 = var19;
                        }
                    }
                }
                int var12 = this.field3475;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class109.field2025 + class112.field2117;
                                }
                            } else {
                                var3[var7] = class68.field1375;
                            }
                        } else {
                            var3[var7] = class201.field3725;
                        }
                    } else {
                        var3[var7] = class112.field2117;
                    }
                } else {
                    var3[var7] = class109.field2025;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
    public static final void method1262(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (~class168.field3037 >= ~arg0 && arg0 <= class70.field1403) {
            int var5 = class56.method391(16777215, class40.field869, class235.field4336, arg1);
            int var6 = class56.method391(16777215, class40.field869, class235.field4336, arg4);
            class114.method732(var6, var5, (byte) -60, arg3, arg0);
        }
        ++field3486;
        if (arg2) {
            method1268(-44, 75, -73);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILqe;ILqe;Lqe;)V")
    public static final void method1263(int arg0, class179 arg1, int arg2, class179 arg3, class179 arg4) {
        class58.method394(arg4, arg0, arg2 ^ arg2, arg3, arg1, -1);
        ++field3482;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I")
    public static final int method1264(int arg0, byte arg1, int arg2) {
        class177 var3 = (class177) class155.field2777.method909(-1, (long) arg2);
        ++field3488;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field3221.length) {
            if (arg1 < 17) {
                method1269((byte) -119);
            }
            return var3.field3221[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        this.field3472 = class207.method1383(-114, this.field3476);
        this.method1265(true);
        ++field3483;
        if (arg0 != 14005) {
            field3469 = -58;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    private final void method1265(boolean arg0) {
        ++field3468;
        if (!arg0) {
            this.method191(98);
        }
        Random var2 = new Random((long) this.field3476);
        this.field3466 = new short[512];
        if (~this.field3480 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3466[var3] = (short) class4.method26(var2, 12024, this.field3480);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3473 = arg0.method1243(3);
                                }
                            } else {
                                this.field3481 = arg0.method1243(3);
                            }
                        } else {
                            this.field3484 = arg0.method1243(3);
                        }
                    } else {
                        this.field3475 = arg0.method1243(3);
                    }
                } else {
                    this.field3480 = arg0.method1252(2);
                }
            } else {
                this.field3476 = arg0.method1243(3);
            }
        } else {
            this.field3481 = this.field3473 = arg0.method1243(3);
        }
        if (arg2) {
            method1263(102, (class179) null, 38, (class179) null, (class179) null);
        }
        ++field3479;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLeh;Leh;Leh;Leh;)V")
    public static final void method1266(byte arg0, class52 arg1, class52 arg2, class52 arg3, class52 arg4) {
        class202.field3740 = arg3;
        class100.field1857 = arg1;
        ++field3490;
        class199.field3707 = arg4;
        class227.field4202 = arg2;
        class199.field3710 = new class6[class227.field4202.method339(-108)][];
        class236.field4346 = new boolean[class227.field4202.method339(62)];
        if (arg0 > -32) {
            method1262(-12, 38, true, -26, -41);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
    public static final void method1267(int arg0, int arg1) {
        if (arg1 != -1) {
            method1266((byte) 59, (class52) null, (class52) null, (class52) null, (class52) null);
        }
        ++field3491;
        if (~arg0 == 0 && !class144.field2618) {
            class68.method439(1);
        } else if (arg0 != -1 && (class136.field2520 != arg0 || !class197.method1319(-6773)) && ~class130.field2364 != -1 && !class144.field2618) {
            class191.method1284(2, arg0, class130.field2364, false, 0, 0, class179.field3251);
        }
        class136.field2520 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Lec;")
    public static final class47 method1268(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        return var3 != null && var3.field3681 != null ? var3.field3681 : null;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static void method1269(byte arg0) {
        field3487 = null;
        field3467 = null;
        int var1 = -51 % ((arg0 - 50) / 55);
        field3485 = null;
        field3489 = null;
        field3477 = null;
        field3492 = null;
        field3493 = null;
        field3465 = null;
        field3471 = null;
    }
}
