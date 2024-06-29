import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class76 extends class370 {

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    private int field1248 = 0;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "Z")
    private boolean field1251 = false;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "I")
    private int field1268 = -1;

    @OriginalMember(owner = "client!co", name = "mb", descriptor = "I")
    private int field1285 = -32768;

    @OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
    private int field1275 = 0;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "Z")
    private boolean field1256;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!co", name = "bb", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client!co", name = "fb", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!co", name = "db", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client!co", name = "jb", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!co", name = "ob", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!co", name = "nb", descriptor = "Ldn;")
    private class357 field1286;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Z")
    public static boolean field1245 = false;

    @OriginalMember(owner = "client!co", name = "lb", descriptor = "Z")
    public static boolean field1284 = false;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "D")
    private double field1246;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "D")
    private double field1257;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "D")
    private double field1259;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "D")
    private double field1263;

    @OriginalMember(owner = "client!co", name = "R", descriptor = "D")
    private double field1264;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "D")
    private double field1265;

    @OriginalMember(owner = "client!co", name = "Y", descriptor = "D")
    private double field1271;

    @OriginalMember(owner = "client!co", name = "hb", descriptor = "D")
    private double field1280;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!co", name = "Z", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!co", name = "eb", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!co", name = "gb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!co", name = "ib", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!co", name = "kb", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!co", name = "pb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!co", name = "qb", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!co", name = "rb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!co", name = "sb", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "Lrb;")
    private class234 field1261;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZI)V")
    public final void method623(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field1279;
        if (!this.field1251) {
            double var6 = (double) (-super.field5529 + arg2);
            double var8 = (double) (-super.field5539 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1246 = (double) this.field1274 * var6 / var10 + (double) super.field5529;
            this.field1265 = (double) this.field1274 * var8 / var10 + (double) super.field5539;
            if (this.field1256) {
                this.field1264 = (double) (class259.method1646((int) this.field1265, (int) this.field1246, 851701031, super.field5538) + -this.field1276);
            } else {
                this.field1264 = (double) super.field5534;
            }
        }
        double var12 = (double) (-arg1 + 1 + this.field1278);
        this.field1259 = ((double) arg4 + -this.field1265) / var12;
        this.field1257 = ((double) arg2 + -this.field1246) / var12;
        this.field1271 = Math.sqrt(this.field1259 * this.field1259 + this.field1257 * this.field1257);
        if (arg3) {
            if (~this.field1287 != 0) {
                if (!this.field1251) {
                    this.field1280 = -this.field1271 * Math.tan((double) this.field1287 * 0.02454369D);
                }
                this.field1263 = ((double) arg0 - this.field1264 + -(this.field1280 * var12)) * 2.0D / (var12 * var12);
            } else {
                this.field1280 = ((double) arg0 + -this.field1264) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        if (arg0 <= -127) {
            ++field1255;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)I")
    public static final int method624(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            method624(-105, -26, 115);
        }
        ++field1289;
        return ~arg1 != -2 && ~arg1 != -4 ? class488.field7135[3 & arg2] : class52.field767[3 & arg2];
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        ++field1249;
        class121 var3 = this.method627(0, 49, arg0);
        if (var3 != null) {
            class413 var4 = arg0.method439();
            var4.method999(this.field1277);
            var4.method996(this.field1266);
            if (arg1 <= -43) {
                var4.method1004((int) this.field1246, (int) this.field1264, (int) this.field1265);
                this.field1285 = var3.method918();
                this.method625(var3, (byte) -38, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)I")
    public final int method107(boolean arg0) {
        if (arg0) {
            this.method121(78);
        }
        ++field1250;
        return this.field1285;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class259.method1646(arg3, arg2, 851701031, arg1), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field1256 = arg11;
        this.field1262 = arg10;
        this.field1274 = arg8;
        this.field1278 = arg6;
        this.field1276 = arg4;
        this.field1247 = arg0;
        this.field1282 = arg9;
        this.field1287 = arg7;
        this.field1258 = arg5;
        this.field1251 = false;
        int var13 = class450.field6582.method1475(this.field1247, true).field3547;
        if (var13 == -1) {
            this.field1286 = null;
        } else {
            this.field1286 = class311.field4455.method1233(true, var13);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field1290;
        return arg1 != -1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lc;BLqa;)V")
    private final void method625(class121 arg0, byte arg1, class162 arg2) {
        ++field1269;
        if (arg1 == -38) {
            class46[] var4 = arg0.method913();
            class113[] var5 = arg0.method890();
            if ((this.field1261 == null || this.field1261.field3402) && (var4 != null || var5 != null)) {
                this.field1261 = new class234(class180.field2734);
            }
            if (this.field1261 != null) {
                this.field1261.method1518(arg2, (long) class180.field2734, var4, var5, false);
                this.field1261.method1529(super.field5538, super.field5532, super.field5542, super.field5535, super.field5540);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)Z")
    public final boolean method121(int arg0) {
        ++field1252;
        if (arg0 != 26923) {
            this.field1262 = -42;
        }
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static final void method626(boolean arg0) {
        class364 var1 = class510.field7486;
        synchronized (class510.field7486) {
            class510.field7486.method2349(0);
        }
        if (arg0) {
            method630(-36);
        }
        ++field1253;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        ++field1260;
        class121 var3 = this.method627(2048, 83, arg1);
        if (var3 == null) {
            return null;
        } else {
            class413 var4 = arg1.method439();
            var4.method999(this.field1277);
            var4.method996(this.field1266);
            var4.method1004((int) this.field1246, (int) this.field1264, (int) this.field1265);
            if (arg0 != -6796) {
                this.method627(97, -39, (class162) null);
            }
            if (this.field1261 != null) {
                class492 var5 = this.field1261.method1519();
                arg1.method531(var3, var5, var4, (class361) null, 0);
            } else {
                var3.method910(var4, (class361) null, 0);
            }
            this.field1285 = var3.method918();
            this.method625(var3, (byte) -38, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILqa;)Lc;")
    private final class121 method627(int arg0, int arg1, class162 arg2) {
        int var4 = -48 % ((-44 - arg1) / 39);
        ++field1281;
        class246 var5 = class450.field6582.method1475(this.field1247, true);
        return var5.method1577(class311.field4455, arg2, this.field1248, this.field1268, this.field1275, arg0, 44);
    }

    @OriginalMember(owner = "client!co", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1283;
        if (this.field1261 != null) {
            this.field1261.method1528();
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public final void method628(byte arg0) {
        if (arg0 != -7) {
            this.field1271 = -2.4999756396842385D;
        }
        if (this.field1261 != null) {
            this.field1261.method1528();
        }
        ++field1288;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        if (arg3 < 5) {
            this.method623(115, 20, -113, true, 29);
        }
        ++field1291;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
    public final void method629(int arg0, byte arg1) {
        ++field1267;
        this.field1265 += (double) arg0 * this.field1259;
        this.field1251 = true;
        int var3 = 27 % ((-53 - arg1) / 49);
        this.field1246 += (double) arg0 * this.field1257;
        if (this.field1256) {
            this.field1264 = (double) (class259.method1646((int) this.field1265, (int) this.field1246, 851701031, super.field5538) + -this.field1276);
        } else if (this.field1287 == -1) {
            this.field1264 += (double) arg0 * this.field1280;
        } else {
            this.field1264 += this.field1263 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1280;
            this.field1280 += (double) arg0 * this.field1263;
        }
        this.field1266 = 8192 + (int) (Math.atan2(this.field1257, this.field1259) * 2607.5945876176133D) & 16383;
        this.field1277 = 16383 & (int) (Math.atan2(this.field1280, this.field1271) * 2607.5945876176133D);
        if (this.field1286 != null) {
            this.field1248 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field1248 >= ~this.field1286.field5408[this.field1275]) {
                            return;
                        }
                        this.field1248 -= this.field1286.field5408[this.field1275];
                        ++this.field1275;
                        if (this.field1275 >= this.field1286.field5395.length) {
                            this.field1275 -= this.field1286.field5402;
                            if (~this.field1275 > -1 || ~this.field1286.field5395.length >= ~this.field1275) {
                                this.field1275 = 0;
                            }
                        }
                        this.field1268 = this.field1275 + 1;
                    } while (this.field1286.field5395.length > this.field1268);
                    this.field1268 -= this.field1286.field5402;
                } while (~this.field1268 <= -1 && this.field1286.field5395.length > this.field1268);
                this.field1268 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static final void method630(int arg0) {
        ++field1270;
        if (class397.field5830.method1295(class399.field5865, 0) == 2) {
            byte var1 = (byte) (class454.field6731 + -4 & 255);
            int var2 = class454.field6731 % class237.field3436;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; ~class83.field1366 < ~var16; ++var16) {
                    class275.field3993[var3][var2][var16] = var1;
                }
            }
            if (class434.field6317 != 3) {
                for (int var4 = arg0; ~var4 > -3; ++var4) {
                    class490.field7156[var4] = -1000000;
                    class354.field5355[var4] = 1000000;
                    class366.field5496[var4] = 0;
                    class348.field5281[var4] = 1000000;
                    class25.field437[var4] = 0;
                }
                if (class403.field5944 == 1) {
                    if (~(4 & class364.field5475[class434.field6317][class95.field1558.field5529 >> 7][class95.field1558.field5539 >> 7]) != -1) {
                        class413.method2550(false, class36.field545, class95.field1558.field5539 >> 7, class95.field1558.field5529 >> 7, false, 0);
                    }
                    if (~class310.field4446 > -2561) {
                        int var5 = class430.field6262 >> 7;
                        int var6 = class291.field4175 >> 7;
                        int var7 = class95.field1558.field5529 >> 7;
                        int var8 = class95.field1558.field5539 >> 7;
                        int var9;
                        if (~var7 < ~var5) {
                            var9 = var7 - var5;
                        } else {
                            var9 = -var7 + var5;
                        }
                        int var10;
                        if (~var6 > ~var8) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = var6 - var8;
                        }
                        if ((var9 != 0 || ~var10 != -1) && ~(-class237.field3436) > ~var9 && var9 < class237.field3436 && -class83.field1366 < var10 && class83.field1366 > var10) {
                            if (var10 < var9) {
                                int var11 = var10 * 65536 / var9;
                                int var12 = 32768;
                                while (var5 != var7) {
                                    if (~var7 >= ~var5) {
                                        if (var5 > var7) {
                                            --var5;
                                        }
                                    } else {
                                        ++var5;
                                    }
                                    if ((class364.field5475[class434.field6317][var5][var6] & 4) != 0) {
                                        class413.method2550(false, class36.field545, var6, var5, false, 1);
                                        return;
                                    }
                                    var12 += var11;
                                    if (~var12 <= -65537) {
                                        var12 -= 65536;
                                        if (~var8 < ~var6) {
                                            ++var6;
                                        } else if (var6 > var8) {
                                            --var6;
                                        }
                                        if (~(class364.field5475[class434.field6317][var5][var6] & 4) != -1) {
                                            class413.method2550(false, class36.field545, var6, var5, false, 1);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var9 * 65536 / var10;
                            int var14 = 32768;
                            while (var6 != var8) {
                                if (var6 < var8) {
                                    ++var6;
                                } else if (~var8 > ~var6) {
                                    --var6;
                                }
                                if ((4 & class364.field5475[class434.field6317][var5][var6]) != 0) {
                                    class413.method2550(false, class36.field545, var6, var5, false, 1);
                                    return;
                                }
                                var14 += var13;
                                if (~var14 <= -65537) {
                                    var14 -= 65536;
                                    if (var7 <= var5) {
                                        if (var5 > var7) {
                                            --var5;
                                        }
                                    } else {
                                        ++var5;
                                    }
                                    if (~(class364.field5475[class434.field6317][var5][var6] & 4) != -1) {
                                        class413.method2550(false, class36.field545, var6, var5, false, 1);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class169.method1200("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class483.field7082 + "," + class465.field6840, (Throwable) null, (byte) -113);
                        return;
                    }
                } else {
                    int var15 = class259.method1646(class291.field4175, class430.field6262, 851701031, class434.field6317);
                    if (~(-class207.field2983 + var15) <= -801 || ~(class364.field5475[class434.field6317][class430.field6262 >> 7][class291.field4175 >> 7] & 4) == -1) {
                        return;
                    }
                    class413.method2550(false, class36.field545, class291.field4175 >> 7, class430.field6262 >> 7, false, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
    public final void method188(byte arg0) {
        ++field1272;
        if (arg0 != 76) {
            this.field1274 = -102;
        }
        super.field5535 = super.field5540 = (short) ((int) (this.field1265 / 128.0D));
        super.field5532 = super.field5542 = (short) ((int) (this.field1246 / 128.0D));
    }
}
