import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class22 extends class154 {

    @OriginalMember(owner = "client!ca", name = "jb", descriptor = "I")
    private int field366 = -1;

    @OriginalMember(owner = "client!ca", name = "Gb", descriptor = "Z")
    private volatile boolean field389 = false;

    @OriginalMember(owner = "client!ca", name = "ib", descriptor = "Z")
    private boolean field365 = false;

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "Lqe;")
    private class164 field362;

    @OriginalMember(owner = "client!ca", name = "Kb", descriptor = "Lqe;")
    private class164 field393;

    @OriginalMember(owner = "client!ca", name = "nb", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!ca", name = "zb", descriptor = "Lob;")
    private static class141 field382 = class175.method1195(40, "Please try using a different world)3");

    @OriginalMember(owner = "client!ca", name = "Ab", descriptor = "Lob;")
    public static class141 field383 = field382;

    @OriginalMember(owner = "client!ca", name = "hb", descriptor = "Lob;")
    public static class141 field364 = field382;

    @OriginalMember(owner = "client!ca", name = "Bb", descriptor = "Lob;")
    public static class141 field384 = field382;

    @OriginalMember(owner = "client!ca", name = "Qb", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!ca", name = "Eb", descriptor = "Lob;")
    public static class141 field387 = class175.method1195(40, "blinken3:");

    @OriginalMember(owner = "client!ca", name = "Rb", descriptor = "Lob;")
    public static class141 field400 = field382;

    @OriginalMember(owner = "client!ca", name = "sb", descriptor = "Lob;")
    public static class141 field375 = field382;

    @OriginalMember(owner = "client!ca", name = "Nb", descriptor = "[Lob;")
    public static class141[] field396 = new class141[500];

    @OriginalMember(owner = "client!ca", name = "Mb", descriptor = "Lob;")
    private static class141 field395 = class175.method1195(40, "K");

    @OriginalMember(owner = "client!ca", name = "Ib", descriptor = "Lob;")
    public static class141 field391 = field382;

    @OriginalMember(owner = "client!ca", name = "rb", descriptor = "Lob;")
    public static class141 field374 = field395;

    @OriginalMember(owner = "client!ca", name = "qb", descriptor = "Lob;")
    public static class141 field373 = field395;

    @OriginalMember(owner = "client!ca", name = "Cb", descriptor = "Lob;")
    public static class141 field385 = class175.method1195(40, "ams");

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ca", name = "mb", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!ca", name = "ob", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ca", name = "pb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ca", name = "tb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ca", name = "ub", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ca", name = "vb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ca", name = "wb", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!ca", name = "xb", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!ca", name = "yb", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ca", name = "Db", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ca", name = "Fb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ca", name = "Hb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ca", name = "Jb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ca", name = "Ob", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ca", name = "Pb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ca", name = "kb", descriptor = "[Lkc;")
    public static class102[] field367;

    @OriginalMember(owner = "client!ca", name = "lb", descriptor = "[Lkc;")
    public static class102[] field368;

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "[Lfa;")
    public static class52[] field363;

    @OriginalMember(owner = "client!ca", name = "Lb", descriptor = "[Z")
    private volatile boolean[] field394;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[BZLqe;)V")
    public final void method131(byte arg0, int arg1, byte[] arg2, boolean arg3, class164 arg4) {
        ++field397;
        if (arg0 == -14) {
            if (this.field393 != arg4) {
                if (!arg3 && ~this.field366 == ~arg1) {
                    this.field389 = true;
                }
                if (arg2 == null || arg2.length <= 2) {
                    this.field394[arg1] = false;
                    if (this.field365 || arg3) {
                        class46.method305(this, arg3, this.field370, (byte) 2, arg0 + -18949, super.field2948[arg1], arg1);
                    }
                    return;
                }
                class147.field2881.reset();
                class147.field2881.update(arg2, 0, arg2.length + -2);
                int var6 = (int) class147.field2881.getValue();
                int var7 = (65280 & arg2[arg2.length + -2] << 8) - -(255 & arg2[arg2.length + -1]);
                if (super.field2948[arg1] != var6 || ~super.field2966[arg1] != ~var7) {
                    this.field394[arg1] = false;
                    if (this.field365 || arg3) {
                        class46.method305(this, arg3, this.field370, (byte) 2, -18963, super.field2948[arg1], arg1);
                    }
                    return;
                }
                this.field394[arg1] = true;
                if (arg3) {
                    super.field2986[arg1] = class135.method850(true, false, arg2);
                    return;
                }
            } else {
                if (this.field389) {
                    throw new RuntimeException();
                }
                if (arg2 == null) {
                    class46.method305(this, true, 255, (byte) 0, arg0 + -18949, this.field369, this.field370);
                    return;
                }
                class147.field2881.reset();
                class147.field2881.update(arg2, 0, arg2.length);
                int var8 = (int) class147.field2881.getValue();
                if (~this.field369 != ~var8) {
                    class46.method305(this, true, 255, (byte) 0, -18963, this.field369, this.field370);
                    return;
                }
                class146 var9;
                try {
                    var9 = new class146(class107.method710(arg2, arg0 ^ -127));
                } catch (RuntimeException var12) {
                    class46.method305(this, true, 255, (byte) 0, arg0 ^ 18975, this.field369, this.field370);
                    return;
                }
                int var10 = var9.method991(255);
                if (~var10 != -6 && var10 != 6) {
                    class46.method305(this, true, 255, (byte) 0, arg0 ^ 18975, this.field369, this.field370);
                    return;
                }
                int var11 = 0;
                if (var10 >= 6) {
                    var11 = var9.method979(arg0 ^ -1029109982);
                }
                if (~this.field380 != ~var11) {
                    class46.method305(this, true, 255, (byte) 0, -18963, this.field369, this.field370);
                    return;
                }
                this.method1067((byte) 91, arg2);
                this.method142((byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
    public final void method132(int arg0, boolean arg1) {
        ++field377;
        if (this.method1066(arg0, 0)) {
            if (!arg1) {
                field388 = 85;
            }
            if (this.field362 != null && this.field394 != null && this.field394[arg0]) {
                class39.method261(arg0, this, this.field362, false);
            } else {
                class46.method305(this, true, this.field370, (byte) 2, -18963, super.field2948[arg0], arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([Lcd;[II[III)V")
    public static final void method133(class25[] arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (~arg5 < ~arg2) {
            int var6 = arg5 + 1;
            int var7 = arg2 - 1;
            int var8 = (arg2 - -arg5) / 2;
            class25 var9 = arg0[var8];
            arg0[var8] = arg0[arg2];
            arg0[arg2] = var9;
            while (var7 < var6) {
                boolean var10 = true;
                do {
                    --var6;
                    for (int var11 = 0; ~var11 > -5; ++var11) {
                        int var12;
                        int var13;
                        if (arg3[var11] == 2) {
                            var12 = var9.field472;
                            var13 = arg0[var6].field472;
                        } else if (~arg3[var11] == -2) {
                            var12 = var9.field469;
                            var13 = arg0[var6].field469;
                            if (~var13 == 0 && arg1[var11] == 1) {
                                var13 = 2001;
                            }
                            if (~var12 == 0 && ~arg1[var11] == -2) {
                                var12 = 2001;
                            }
                        } else if (arg3[var11] != 3) {
                            var12 = var9.field475;
                            var13 = arg0[var6].field475;
                        } else {
                            var12 = !var9.field468 ? 0 : 1;
                            var13 = arg0[var6].field468 ? 1 : 0;
                        }
                        if (~var12 != ~var13) {
                            if ((~arg1[var11] != -2 || ~var12 <= ~var13) && (arg1[var11] != 0 || ~var12 >= ~var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    ++var7;
                    for (int var15 = 0; ~var15 > -5; ++var15) {
                        int var16;
                        int var17;
                        if (~arg3[var15] == -3) {
                            var16 = arg0[var7].field472;
                            var17 = var9.field472;
                        } else if (~arg3[var15] != -2) {
                            if (arg3[var15] == 3) {
                                var16 = arg0[var7].field468 ? 1 : 0;
                                var17 = !var9.field468 ? 0 : 1;
                            } else {
                                var17 = var9.field475;
                                var16 = arg0[var7].field475;
                            }
                        } else {
                            var17 = var9.field469;
                            var16 = arg0[var7].field469;
                            if (var16 == -1 && ~arg1[var15] == -2) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && ~arg1[var15] == -2) {
                                var17 = 2001;
                            }
                        }
                        if (~var16 != ~var17) {
                            if ((~arg1[var15] != -2 || var16 >= var17) && (arg1[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (~var15 == -4) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 < var6) {
                    class25 var18 = arg0[var7];
                    arg0[var7] = arg0[var6];
                    arg0[var6] = var18;
                }
            }
            method133(arg0, arg1, arg2, arg3, 25097, var6);
            method133(arg0, arg1, var6 + 1, arg3, 25097, arg5);
        }
        ++field371;
        if (arg4 != 25097) {
            field398 = -128;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(II)V")
    public final void method134(int arg0, int arg1) {
        ++field381;
        if (this.method1066(arg1, 0)) {
            class16.method103(arg1, this.field370, (byte) -84);
            if (arg0 != 18965) {
                field375 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V")
    public final void method135(int arg0, byte arg1, int arg2) {
        ++field376;
        this.field369 = arg0;
        this.field380 = arg2;
        if (arg1 == 88) {
            if (this.field393 != null) {
                class39.method261(this.field370, this, this.field393, false);
            } else {
                class46.method305(this, true, 255, (byte) 0, -18963, this.field369, this.field370);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
    public final int method136(int arg0) {
        ++field361;
        if (arg0 != 1) {
            field382 = null;
        }
        if (this.field389) {
            return 100;
        } else if (super.field2986 != null) {
            return 99;
        } else {
            int var2 = class219.method1418(255, true, this.field370);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public static void method137(int arg0) {
        field395 = null;
        field396 = null;
        field384 = null;
        field363 = null;
        field373 = null;
        field385 = null;
        field391 = null;
        field382 = null;
        field383 = null;
        field374 = null;
        field364 = null;
        if (arg0 != 0) {
            method141(-41, -44, 90, 54, -8, -63, -2);
        }
        field367 = null;
        field400 = null;
        field375 = null;
        field387 = null;
        field368 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)I")
    public static final int method138(boolean arg0, int arg1) {
        ++field379;
        int var2 = ((-1431655765 & arg1) >>> 1) + (arg1 & 1431655765);
        int var3 = ((-858993460 & var2) >>> 2) + (var2 & 858993459);
        int var4 = var3 - -(var3 >>> 4) & 252645135;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return arg0 ? 12 : 255 & var6;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZBIZ)Lca;")
    public static final class22 method139(boolean arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        ++field378;
        if (arg2 < 16) {
            field364 = null;
        }
        class164 var5 = null;
        if (class175.field3482 != null) {
            var5 = new class164(arg3, class175.field3482, class1.field9[arg3], 1000000);
        }
        return new class22(var5, class131.field2502, arg3, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z[BZIB)V")
    public final void method140(boolean arg0, byte[] arg1, boolean arg2, int arg3, byte arg4) {
        ++field390;
        int var6 = -10 % ((arg4 - 29) / 63);
        if (arg0) {
            if (this.field389) {
                throw new RuntimeException();
            } else {
                if (this.field393 != null) {
                    class144.method952(this.field370, this.field393, 77, arg1);
                }
                this.method1067((byte) 114, arg1);
                this.method142((byte) -59);
            }
        } else {
            arg1[arg1.length - 2] = (byte) (super.field2966[arg3] >> 8);
            arg1[arg1.length + -1] = (byte) super.field2966[arg3];
            if (this.field362 != null) {
                class144.method952(arg3, this.field362, 119, arg1);
                this.field394[arg3] = true;
            }
            if (arg2) {
                super.field2986[arg3] = class135.method850(true, false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg2 - arg1) <= ~class68.field1323 && ~(arg1 + arg2) >= ~class136.field2590 && ~(-arg1 + arg6) <= ~class35.field698 && class130.field2470 >= arg1 + arg6) {
            class176.method1202(arg2, arg6, arg1, arg4, (byte) -120, arg0, arg5);
        } else {
            class104.method693(arg1, arg6, (byte) 86, arg4, arg5, arg0, arg2);
        }
        if (arg3 == -17360) {
            ++field372;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    private final void method142(byte arg0) {
        if (arg0 == -59) {
            this.field394 = new boolean[super.field2986.length];
            for (int var2 = 0; var2 < this.field394.length; ++var2) {
                this.field394[var2] = false;
            }
            ++field386;
            if (this.field362 == null) {
                this.field389 = true;
            } else {
                this.field366 = -1;
                for (int var3 = 0; ~var3 > ~this.field394.length; ++var3) {
                    if (super.field2975[var3] > 0) {
                        class173.method1186(this, var3, this.field362, arg0 + 26582);
                        this.field366 = var3;
                    }
                }
                if (~this.field366 == 0) {
                    this.field389 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I")
    public final int method143(byte arg0, int arg1) {
        ++field392;
        if (!this.method1066(arg1, 0)) {
            return 0;
        } else if (super.field2986[arg1] != null) {
            return 100;
        } else if (this.field394[arg1]) {
            return 100;
        } else {
            if (arg0 != -53) {
                method137(-16);
            }
            return class219.method1418(this.field370, true, arg1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lqe;Lqe;IZZZ)V")
    private class22(class164 arg0, class164 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field362 = arg0;
        this.field393 = arg1;
        this.field365 = arg5;
        this.field370 = arg2;
        class87.method593(this, 255, this.field370);
    }
}
