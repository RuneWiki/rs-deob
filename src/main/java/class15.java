import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 extends class58 {

    @OriginalMember(owner = "client!cb", name = "Hd", descriptor = "I")
    public int field313 = 0;

    @OriginalMember(owner = "client!cb", name = "Dd", descriptor = "I")
    public int field309 = -1;

    @OriginalMember(owner = "client!cb", name = "xd", descriptor = "I")
    public int field303 = 0;

    @OriginalMember(owner = "client!cb", name = "yd", descriptor = "I")
    public int field304 = 0;

    @OriginalMember(owner = "client!cb", name = "ld", descriptor = "I")
    public int field291 = -1;

    @OriginalMember(owner = "client!cb", name = "Ad", descriptor = "I")
    public int field306 = 0;

    @OriginalMember(owner = "client!cb", name = "md", descriptor = "I")
    public int field292 = 0;

    @OriginalMember(owner = "client!cb", name = "kd", descriptor = "Z")
    public boolean field290 = false;

    @OriginalMember(owner = "client!cb", name = "sd", descriptor = "[I")
    public static int[] field298 = new int[500];

    @OriginalMember(owner = "client!cb", name = "gd", descriptor = "Lrc;")
    private static class105 field286 = class43.method374("Please check your message)2centre for details)3", 0);

    @OriginalMember(owner = "client!cb", name = "zd", descriptor = "Lrc;")
    private static class105 field305 = class43.method374("Prepared visibility map", 0);

    @OriginalMember(owner = "client!cb", name = "Id", descriptor = "Z")
    public static boolean field314 = false;

    @OriginalMember(owner = "client!cb", name = "vd", descriptor = "Lrc;")
    public static class105 field301 = field286;

    @OriginalMember(owner = "client!cb", name = "nd", descriptor = "Lrc;")
    private static class105 field293 = class43.method374("No reply from loginserver)3", 0);

    @OriginalMember(owner = "client!cb", name = "Md", descriptor = "Lrc;")
    public static class105 field318 = field305;

    @OriginalMember(owner = "client!cb", name = "Gd", descriptor = "Lrc;")
    public static class105 field312 = class43.method374("(Y", 0);

    @OriginalMember(owner = "client!cb", name = "jd", descriptor = "Lrc;")
    public static class105 field289 = field293;

    @OriginalMember(owner = "client!cb", name = "hd", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!cb", name = "od", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!cb", name = "pd", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!cb", name = "rd", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!cb", name = "td", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!cb", name = "wd", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!cb", name = "Bd", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!cb", name = "Cd", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!cb", name = "Ed", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!cb", name = "Fd", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!cb", name = "Jd", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!cb", name = "Kd", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!cb", name = "Ld", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!cb", name = "Nd", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!cb", name = "Od", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!cb", name = "ud", descriptor = "Lrc;")
    public class105 field300;

    @OriginalMember(owner = "client!cb", name = "qd", descriptor = "Lbe;")
    public class12 field296;

    @OriginalMember(owner = "client!cb", name = "id", descriptor = "Ljb;")
    public class56 field288;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)V", line = 6)
    public static final void method163(int arg0) {
        ++field310;
        class12.field234.method306((byte) 113);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class64.field1429[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class36.field834[var2] = 0L;
        }
        if (arg0 >= -80) {
            field305 = null;
        }
        class81.field1822 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)Z", line = 34)
    public final boolean method164(int arg0) {
        ++field320;
        if (this.field296 == null) {
            return false;
        } else {
            return arg0 > 92;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V", line = 49)
    public static final void method165(byte arg0) {
        ++field299;
        Object var1 = class3.field36;
        synchronized (class3.field36) {
            if (class31.field698 == 0) {
                class122.field2991.method318(5, -115, new class93());
            }
            int var2 = -112 / ((arg0 - 75) / 49);
            class31.field698 = 600;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLb;)V", line = 76)
    public final void method166(byte arg0, class7 arg1) {
        arg1.field143 = 0;
        int var3 = arg1.method96(27023);
        ++field295;
        this.field309 = arg1.method85(-4794);
        this.field291 = arg1.method85(-4794);
        this.field303 = 0;
        int[] var4 = new int[12];
        int var5 = -1;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method96(27023);
            if (~var7 == -1) {
                var4[var6] = 0;
            } else {
                int var8 = arg1.method96(27023);
                var4[var6] = (var7 << 8) - -var8;
                if (var6 == 0 && ~var4[0] == -65536) {
                    var5 = arg1.method101(2);
                    break;
                }
                if (var4[var6] >= 512) {
                    int var13 = class75.method636(var4[var6] - 512, 0).field752;
                    if (~var13 != -1) {
                        this.field303 = var13;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var12 = arg1.method96(27023);
            if (~var12 > -1 || var12 >= class90.field2077[var10].length) {
                var12 = 0;
            }
            var9[var10] = var12;
        }
        int var11 = 76 % ((-48 - arg0) / 44);
        super.field1290 = arg1.method101(2);
        if (super.field1290 == 65535) {
            super.field1290 = -1;
        }
        super.field1217 = arg1.method101(2);
        if (super.field1217 == 65535) {
            super.field1217 = -1;
        }
        super.field1228 = super.field1217;
        super.field1278 = arg1.method101(2);
        if (~super.field1278 == -65536) {
            super.field1278 = -1;
        }
        super.field1285 = arg1.method101(2);
        if (super.field1285 == 65535) {
            super.field1285 = -1;
        }
        super.field1259 = arg1.method101(2);
        if (super.field1259 == 65535) {
            super.field1259 = -1;
        }
        super.field1265 = arg1.method101(2);
        if (super.field1265 == 65535) {
            super.field1265 = -1;
        }
        super.field1213 = arg1.method101(2);
        if (super.field1213 == 65535) {
            super.field1213 = -1;
        }
        this.field300 = class65.method553(arg1.method71((byte) 11), -31825).method844(21975);
        this.field306 = arg1.method96(27023);
        this.field313 = arg1.method101(2);
        if (this.field296 == null) {
            this.field296 = new class12();
        }
        this.field296.method146(~var3 == -2, var9, var4, -112, var5);
    }

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)V", line = 196)
    public static final void method167(int arg0) {
        if (arg0 != 11060) {
            method167(22);
        }
        ++field315;
        if (class76.field1706 != null) {
            class39 var1 = class76.field1706;
            synchronized (class76.field1706) {
                class76.field1706 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Ljb;", line = 216)
    public final class56 method168(int arg0) {
        ++field287;
        if (this.field296 == null) {
            return null;
        } else {
            if (arg0 <= 6) {
                this.method168(-51);
            }
            class116 var2 = ~super.field1238 != 0 && ~super.field1230 == -1 ? class6.method49(103, super.field1238) : null;
            class116 var3 = super.field1271 == -1 || this.field290 || ~super.field1290 == ~super.field1271 && var2 != null ? null : class6.method49(103, super.field1271);
            class56 var4 = this.field296.method147(super.field1267, super.field1262, var2, var3, 0);
            if (var4 == null) {
                return null;
            } else {
                var4.method444();
                super.field1246 = var4.field1328;
                if (!this.field290 && ~super.field1245 != 0 && ~super.field1215 != 0) {
                    class56 var5 = class118.method956(super.field1245, 19452).method724(super.field1215, (byte) 87);
                    if (var5 != null) {
                        var5.method445(0, -super.field1216, 0);
                        class56[] var6 = new class56[] { var4, var5 };
                        var4 = new class56(var6, 2, true);
                    }
                }
                if (!this.field290 && this.field288 != null) {
                    if (this.field292 <= class104.field2351) {
                        this.field288 = null;
                    }
                    if (~class104.field2351 <= ~this.field304 && ~class104.field2351 > ~this.field292) {
                        class56 var7 = this.field288;
                        var7.method445(-super.field1229 + this.field307, -this.field311 + this.field316, -super.field1274 + this.field294);
                        if (super.field1253 == 512) {
                            var7.method442();
                            var7.method442();
                            var7.method442();
                        } else if (super.field1253 != 1024) {
                            if (super.field1253 == 1536) {
                                var7.method442();
                            }
                        } else {
                            var7.method442();
                            var7.method442();
                        }
                        class56[] var8 = new class56[] { var4, var7 };
                        var4 = new class56(var8, 2, true);
                        if (~super.field1253 != -513) {
                            if (super.field1253 != 1024) {
                                if (~super.field1253 == -1537) {
                                    var7.method442();
                                    var7.method442();
                                    var7.method442();
                                }
                            } else {
                                var7.method442();
                                var7.method442();
                            }
                        } else {
                            var7.method442();
                        }
                        var7.method445(-this.field307 + super.field1229, -this.field316 + this.field311, super.field1274 - this.field294);
                    }
                }
                var4.field1135 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLvc;)V", line = 341)
    public static final void method169(int arg0, boolean arg1, class129 arg2) {
        ++field308;
        if (class74.field1630 != null) {
            try {
                class74.field1630.method1037(0);
            } catch (Exception var8) {
            }
            class74.field1630 = null;
        }
        class74.field1630 = arg2;
        class41.method366(2, arg1);
        class102.field2307.field143 = 0;
        class93.field2175 = null;
        class3.field34 = null;
        if (arg0 < -126) {
            class97.field2237 = 0;
            while (true) {
                class108 var3 = (class108) class43.field979.method621(31);
                if (var3 == null) {
                    while (true) {
                        class108 var4 = (class108) class107.field2453.method621(53);
                        if (var4 == null) {
                            if (~class28.field627 != -1) {
                                try {
                                    class7 var5 = new class7(4);
                                    var5.method102((byte) 123, 4);
                                    var5.method102((byte) 123, class28.field627);
                                    var5.method113(0, 74);
                                    class74.field1630.method1034(0, var5.field117, -112, 4);
                                } catch (IOException var7) {
                                    try {
                                        class74.field1630.method1037(0);
                                    } catch (Exception var6) {
                                    }
                                    class74.field1630 = null;
                                    ++class31.field730;
                                }
                            }
                            class98.field2269 = 0;
                            class107.field2458 = class1.method3(false);
                            return;
                        }
                        class74.field1635.method180(32, var4);
                        class97.field2232.method625((byte) -122, var4, var4.field1448);
                        --class10.field209;
                        ++class12.field240;
                    }
                }
                class26.field594.method625((byte) -118, var3, var3.field1448);
                ++class110.field2526;
                --class61.field1347;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)V", line = 422)
    public static void method170(int arg0) {
        if (arg0 != 512) {
            method167(27);
        }
        field298 = null;
        field305 = null;
        field318 = null;
        field293 = null;
        field301 = null;
        field312 = null;
        field289 = null;
        field286 = null;
    }
}
