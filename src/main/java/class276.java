import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class276 extends class115 {

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "[S")
    public static short[] field4424 = new short[] { 35, 43, 3, 13, 16, 39, 9, 33 };

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field4433 = 1;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "F")
    public static float field4428;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lve;II)Lpg;")
    public static final class175 method1855(class233 arg0, int arg1, int arg2) {
        ++field4430;
        if (!class255.method1711(arg0, true, arg2)) {
            return null;
        } else {
            if (arg1 != 39) {
                field4424 = null;
            }
            return class134.method910(4);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public static final void method1856(byte arg0) {
        if (arg0 != 48) {
            method1859(70, 98, -29, 16, (class267) null, 39, 117, 76);
        }
        if (class32.field471 == null || class124.field1788 == null) {
            class124.field1788 = new int[256];
            class32.field471 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class32.field471[var1] = (int) (4096.0D * Math.sin(var2));
                class124.field1788[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        ++field4425;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(III)V")
    private final void method1857(int arg0, int arg1, int arg2) {
        int var4 = class169.field2444[arg1];
        ++field4421;
        int var5 = class187.field2664[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class71.field1105 = arg1;
            class9.field164 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class71.field1105 = arg2;
            class9.field164 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class71.field1105 = class77.field1178 - arg2;
            class9.field164 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class71.field1105 = arg1;
            class9.field164 = -arg2 + class192.field2753;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class71.field1105 = -arg1 + class77.field1178;
            class9.field164 = -arg2 + class192.field2753;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class9.field164 = -arg1 + class192.field2753;
            class71.field1105 = -arg2 + class77.field1178;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class9.field164 = -arg1 + class192.field2753;
            class71.field1105 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class9.field164 = arg2;
            class71.field1105 = -arg1 + class77.field1178;
        }
        class71.field1105 &= class207.field2992;
        class9.field164 &= class5.field136;
        if (arg0 < 116) {
            field4424 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    public static void method1858(byte arg0) {
        int var1 = -44 % ((arg0 - -7) / 51);
        field4424 = null;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field4431;
        int[] var3 = super.field1705.method463(arg1, false);
        if (arg0 != 242152972) {
            this.method1857(-107, -10, 97);
        }
        if (super.field1705.field1072) {
            for (int var4 = 0; ~var4 > ~class77.field1178; ++var4) {
                this.method1857(125, var4, arg1);
                int[] var5 = this.method797(0, class9.field164, -47);
                var3[var4] = var5[class71.field1105];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIILha;III)V")
    public static final void method1859(int arg0, int arg1, int arg2, int arg3, class267 arg4, int arg5, int arg6, int arg7) {
        if (!class254.field3862) {
            class169.field2443 = 0;
        } else {
            class169.field2443 = 32;
        }
        ++field4420;
        class254.field3862 = false;
        if (class137.field1987 != 0) {
            if (arg7 >= arg6 && ~arg7 > ~(arg6 - -16) && ~arg0 <= ~arg2 && arg2 + 16 > arg0) {
                arg4.field4140 -= 4;
                class217.method1396(false, arg4);
            } else if (~arg6 >= ~arg7 && arg7 < arg6 + 16 && ~(arg2 + arg3 + -16) >= ~arg0 && arg0 < arg2 - -arg3) {
                arg4.field4140 += 4;
                class217.method1396(false, arg4);
            } else if (~arg7 <= ~(-class169.field2443 + arg6) && arg7 < class169.field2443 + 16 + arg6 && ~arg0 <= ~(arg2 - -16) && arg2 + arg3 + -16 > arg0) {
                int var8 = (arg3 + -32) * arg3 / arg5;
                if (~var8 > -9) {
                    var8 = 8;
                }
                int var9 = -arg2 + -16 + arg0 - var8 / 2;
                int var10 = arg3 + -32 + -var8;
                arg4.field4140 = (-arg3 + arg5) * var9 / var10;
                class217.method1396(false, arg4);
                class254.field3862 = true;
            }
        }
        if (class204.field2959 != 0) {
            int var11 = arg4.field4177;
            if (~(-var11 + arg6) >= ~arg7 && arg2 <= arg0 && ~(arg6 - -16) < ~arg7 && ~arg0 >= ~(arg2 - -arg3)) {
                arg4.field4140 += class204.field2959 * 45;
                class217.method1396(false, arg4);
            }
        }
        if (arg1 <= 9) {
            field4422 = 6;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 >= -33) {
            method1858((byte) 122);
        }
        ++field4423;
        int[][] var3 = super.field1716.method6(arg1, (byte) 108);
        if (super.field1716.field23) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class77.field1178 < ~var7; ++var7) {
                this.method1857(119, var7, arg1);
                int[][] var8 = this.method798(0, 0, class9.field164);
                var4[var7] = var8[0][class71.field1105];
                var5[var7] = var8[1][class71.field1105];
                var6[var7] = var8[2][class71.field1105];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLha;)V")
    public static final void method1860(byte arg0, class267 arg1) {
        ++field4429;
        if (arg0 == -27) {
            int var2 = arg1.field4104;
            if (~var2 == -325) {
                if (~class222.field3308 == 0) {
                    class222.field3308 = arg1.field4186;
                    class146.field2096 = arg1.field4065;
                }
                if (class124.field1804.field3236) {
                    arg1.field4186 = class222.field3308;
                } else {
                    arg1.field4186 = class146.field2096;
                }
            } else if (~var2 == -326) {
                if (~class222.field3308 == 0) {
                    class146.field2096 = arg1.field4065;
                    class222.field3308 = arg1.field4186;
                }
                if (class124.field1804.field3236) {
                    arg1.field4186 = class146.field2096;
                } else {
                    arg1.field4186 = class222.field3308;
                }
            } else if (~var2 == -328) {
                arg1.field4097 = 150;
                arg1.field4155 = 2047 & (int) (256.0D * Math.sin((double) class82.field1267 / 40.0D));
                arg1.field4038 = -1;
                arg1.field4057 = 5;
            } else if (~var2 == -329) {
                if (class55.field847.field766 == null) {
                    arg1.field4038 = 0;
                } else {
                    arg1.field4097 = 150;
                    arg1.field4155 = 2047 & (int) (Math.sin((double) class82.field1267 / 40.0D) * 256.0D);
                    arg1.field4057 = 5;
                    arg1.field4038 = ((int) class109.method712((byte) 110, class55.field847.field766) << 11) + 2047;
                    arg1.field4190 = class55.field847.field132;
                    arg1.field4120 = class55.field847.field112;
                    arg1.field4126 = 0;
                    arg1.field4115 = class55.field847.field77;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 == arg0) {
            super.field1713 = ~arg1.method760(false) == -2;
        }
        ++field4427;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lj;ILde;IIIILth;)V")
    public static final void method1861(class250 arg0, int arg1, class53 arg2, int arg3, int arg4, int arg5, int arg6, class72 arg7) {
        ++field4432;
        int var8 = -114 % ((-2 - arg1) / 37);
        class30 var9 = new class30();
        var9.field427 = arg3 * 128;
        var9.field421 = arg5;
        var9.field419 = arg6 * 128;
        if (arg0 == null) {
            if (arg7 != null) {
                var9.field431 = arg7;
                class271 var10 = arg7.field1119;
                if (var10.field4291 != null) {
                    var9.field435 = true;
                    var10 = var10.method1812(0);
                }
                if (var10 != null) {
                    var9.field418 = (var10.field4283 + arg6) * 128;
                    var9.field430 = (var10.field4283 + arg3) * 128;
                    var9.field425 = class219.method1407(-1159, arg7);
                    var9.field440 = var10.field4263 * 128;
                }
                class210.field3019.method652(110, var9);
                return;
            }
            if (arg2 != null) {
                var9.field441 = arg2;
                var9.field418 = (arg6 + arg2.method57(0)) * 128;
                var9.field430 = (arg2.method57(0) + arg3) * 128;
                var9.field425 = class279.method1880(arg2, (byte) 110);
                var9.field440 = arg2.field793 * 128;
                class124.field1801.method1215(var9, -100, class109.method712((byte) 86, arg2.field766));
                return;
            }
        } else {
            var9.field424 = arg0.field3800;
            var9.field425 = arg0.field3763;
            var9.field428 = arg0.field3781;
            int var11 = arg0.field3821;
            var9.field440 = arg0.field3789 * 128;
            var9.field434 = arg0;
            int var12 = arg0.field3808;
            if (arg4 == 1 || ~arg4 == -4) {
                var11 = arg0.field3808;
                var12 = arg0.field3821;
            }
            var9.field418 = (arg6 + var11) * 128;
            var9.field430 = (arg3 - -var12) * 128;
            var9.field436 = arg0.field3753;
            if (arg0.field3817 != null) {
                var9.field435 = true;
                var9.method215((byte) -86);
            }
            if (var9.field424 != null) {
                var9.field422 = var9.field436 + (int) (Math.random() * (double) (-var9.field436 + var9.field428));
            }
            class74.field1146.method652(113, var9);
        }
    }
}
