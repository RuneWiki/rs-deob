import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class75 extends class142 {

    @OriginalMember(owner = "client!ia", name = "nb", descriptor = "I")
    private int field1298 = 0;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    private int field1294 = 0;

    @OriginalMember(owner = "client!ia", name = "sb", descriptor = "I")
    private int field1303 = 0;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lai;")
    private static class10 field1283 = class44.method278("Loaded input handler", 108);

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Lai;")
    private static class10 field1282 = class44.method278("Ok", -53);

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    public static int field1292 = -1;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Lai;")
    private static class10 field1280 = class44.method278("Existing User", 103);

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1284 = 1;

    @OriginalMember(owner = "client!ia", name = "ob", descriptor = "Lai;")
    public static class10 field1299 = field1283;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lai;")
    public static class10 field1286 = field1280;

    @OriginalMember(owner = "client!ia", name = "rb", descriptor = "Lai;")
    public static class10 field1302 = class44.method278("hel", -31);

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lai;")
    public static class10 field1293 = field1282;

    @OriginalMember(owner = "client!ia", name = "ub", descriptor = "I")
    public static int field1305 = 1;

    @OriginalMember(owner = "client!ia", name = "vb", descriptor = "I")
    public static int field1306 = 2;

    @OriginalMember(owner = "client!ia", name = "xb", descriptor = "[I")
    public static int[] field1308 = new int[500];

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ia", name = "lb", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ia", name = "mb", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ia", name = "pb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client!ia", name = "tb", descriptor = "J")
    public static long field1304;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Lk;")
    public static class91 field1289;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "[Lah;")
    public static class9[] field1288;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field1287;
        if (arg1) {
            return null;
        } else {
            int[][] var3 = super.field2666.method956(arg0, -101);
            if (super.field2666.field2664) {
                int[][] var4 = this.method961(2, 0, arg0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class133.field2499 < ~var11; ++var11) {
                    this.method468(var7[var11], var5[var11], -7255, var6[var11]);
                    this.field1279 += this.field1298;
                    if (this.field1279 < 0) {
                        this.field1279 = 0;
                    }
                    if (~this.field1279 < -4097) {
                        this.field1279 = 4096;
                    }
                    for (this.field1301 += this.field1294; ~this.field1301 > -1; this.field1301 += 4096) {
                    }
                    this.field1275 += this.field1303;
                    while (this.field1301 > 4096) {
                        this.field1301 -= 4096;
                    }
                    if (this.field1275 < 0) {
                        this.field1275 = 0;
                    }
                    if (~this.field1275 < -4097) {
                        this.field1275 = 4096;
                    }
                    this.method467(this.field1279, this.field1275, 22124, this.field1301);
                    var8[var11] = this.field1276;
                    var9[var11] = this.field1307;
                    var10[var11] = this.field1285;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JB)V")
    public static final void method463(long arg0, byte arg1) {
        if (arg1 != 69) {
            field1284 = 72;
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        ++field1281;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 >= -34) {
            this.field1301 = 30;
        }
        ++field1297;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1303 = (arg0.method759((byte) 127) << 12) / 100;
                }
            } else {
                this.field1298 = (arg0.method759((byte) 127) << 12) / 100;
            }
        } else {
            this.field1294 = arg0.method765(65);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method464(int arg0) {
        field1283 = null;
        field1288 = null;
        field1289 = null;
        field1302 = null;
        field1308 = null;
        if (arg0 != 28942) {
            method465(-59, 74, 18);
        }
        field1293 = null;
        field1286 = null;
        field1280 = null;
        field1299 = null;
        field1282 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)I")
    public static final int method465(int arg0, int arg1, int arg2) {
        int var3 = class126.method869(arg1 + -1, (byte) -70, arg0 + -1) - -class126.method869(arg1 + -1, (byte) -70, arg0 + 1) + class126.method869(arg1 - -1, (byte) -70, arg0 - 1) + class126.method869(arg1 + 1, (byte) -70, arg0 + 1);
        ++field1278;
        int var4 = class126.method869(arg1, (byte) -70, arg0 + -1) - -class126.method869(arg1, (byte) -70, arg0 + 1) + class126.method869(arg1 + -1, (byte) -70, arg0) + class126.method869(arg1 - -1, (byte) -70, arg0);
        int var5 = class126.method869(arg1, (byte) -70, arg0);
        if (arg2 >= -106) {
            field1299 = null;
        }
        return var3 / 16 + var5 / 4 - -(var4 / 8);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(JB)V")
    public static final void method466(long arg0, byte arg1) {
        ++field1291;
        if (arg0 != 0L) {
            for (int var3 = 0; ~var3 > ~class124.field2380; ++var3) {
                if (class115.field2205[var3] == arg0) {
                    ++class74.field1271;
                    --class124.field2380;
                    for (int var4 = var3; ~var4 > ~class124.field2380; ++var4) {
                        class131.field2480[var4] = class131.field2480[var4 + 1];
                        class47.field795[var4] = class47.field795[var4 - -1];
                        class115.field2205[var4] = class115.field2205[var4 + 1];
                        class77.field1341[var4] = class77.field1341[var4 + 1];
                    }
                    class98.field1812 = class7.field78;
                    class76.field1323.method635((byte) -47, 184);
                    class76.field1323.method783(arg0, -57);
                    break;
                }
            }
            if (arg1 > -88) {
                method464(122);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
    private final void method467(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 22124) {
            ++field1296;
            int var5 = ~arg1 >= -2049 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 + -(arg0 * arg1 >> 12);
            if (var5 <= 0) {
                this.field1276 = this.field1307 = this.field1285 = arg1;
            } else {
                int var6 = arg3 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = -var13 + var5;
                int var15 = var7 + var13;
                if (~var9 != -1) {
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 != 3) {
                                if (var9 != 4) {
                                    if (var9 == 5) {
                                        this.field1276 = var5;
                                        this.field1307 = var7;
                                        this.field1285 = var14;
                                    }
                                } else {
                                    this.field1276 = var15;
                                    this.field1307 = var7;
                                    this.field1285 = var5;
                                }
                            } else {
                                this.field1276 = var7;
                                this.field1307 = var14;
                                this.field1285 = var5;
                            }
                        } else {
                            this.field1276 = var7;
                            this.field1285 = var15;
                            this.field1307 = var5;
                        }
                    } else {
                        this.field1307 = var5;
                        this.field1285 = var7;
                        this.field1276 = var14;
                    }
                } else {
                    this.field1307 = var15;
                    this.field1285 = var7;
                    this.field1276 = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIII)V")
    private final void method468(int arg0, int arg1, int arg2, int arg3) {
        ++field1300;
        if (arg2 == -7255) {
            int var5 = ~arg3 >= ~arg1 ? arg1 : arg3;
            int var6 = ~arg1 >= ~arg3 ? arg1 : arg3;
            int var7 = ~arg0 > ~var6 ? arg0 : var6;
            int var8 = ~arg0 >= ~var5 ? var5 : arg0;
            this.field1275 = (var7 + var8) / 2;
            int var9 = -var7 + var8;
            if (~var9 < -1) {
                if (this.field1275 > 0 && ~this.field1275 > -4097) {
                    this.field1279 = (var9 << 12) / (this.field1275 > 2048 ? 8192 - this.field1275 * 2 : this.field1275 * 2);
                }
                int var10 = (-arg3 + var8 << 12) / var9;
                int var11 = (-arg0 + var8 << 12) / var9;
                int var12 = (-arg1 + var8 << 12) / var9;
                if (~arg3 == ~var8) {
                    this.field1301 = arg1 != var7 ? -var12 + 4096 : 20480 - -var11;
                } else if (arg1 == var8) {
                    this.field1301 = arg0 != var7 ? -var11 + 12288 : var10 + 4096;
                } else {
                    this.field1301 = ~arg3 == ~var7 ? 12288 - -var12 : -var10 + 20480;
                }
                this.field1301 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }
}
