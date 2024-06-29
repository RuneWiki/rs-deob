import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class117 {

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public int field1504 = 127;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public int field1506 = -1;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Z")
    public boolean field1512 = true;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public int field1513 = 8;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Z")
    public boolean field1514 = false;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public int field1509 = 128;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public int field1516 = 1190717;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public int field1511 = 16;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public int field1519 = -1;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public int field1502 = 0;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public int field1521 = -1;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "Z")
    public boolean field1520 = true;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lwt;")
    public static class194 field1510 = new class194("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Lum;")
    public static class347 field1517 = new class347();

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Lvo;")
    public class31 field1507;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method669(byte arg0, int arg1) {
        field1500++;
        if (arg0 <= 8) {
            method671(-4, -121, (byte) -84, -17, 14);
        }
        if (arg1 == 4 || arg1 == 59 || arg1 == 30 || arg1 == 13 || arg1 == 51) {
            return true;
        } else {
            return arg1 == 20 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILae;I)V", line = 21)
    private final void method670(int arg0, class156 arg1, int arg2) {
        int var4 = -49 % ((arg0 - 23) / 34);
        if (arg2 == 1) {
            this.field1502 = class497.method2983(arg1.method943(1295851312), -1);
        } else if (arg2 == 2) {
            this.field1506 = arg1.method941((byte) 127);
        } else if (arg2 == 3) {
            this.field1506 = arg1.method993((byte) -105);
            if (this.field1506 == 65535) {
                this.field1506 = -1;
            }
        } else if (arg2 == 5) {
            this.field1520 = false;
        } else if (arg2 == 7) {
            this.field1519 = class497.method2983(arg1.method943(1295851312), -1);
        } else if (arg2 == 8) {
            this.field1507.field524 = this.field1501;
        } else if (arg2 == 9) {
            this.field1509 = arg1.method993((byte) -47) << 0;
        } else if (arg2 == 10) {
            this.field1512 = false;
        } else if (arg2 == 11) {
            this.field1513 = arg1.method941((byte) 125);
        } else if (arg2 == 12) {
            this.field1514 = true;
        } else if (arg2 == 13) {
            this.field1516 = arg1.method943(1295851312);
        } else if (arg2 == 14) {
            this.field1511 = arg1.method941((byte) 126);
        } else if (arg2 == 15) {
            this.field1521 = arg1.method993((byte) -123);
            if (this.field1521 == 65535) {
                this.field1521 = -1;
            }
        } else if (arg2 == 16) {
            this.field1504 = arg1.method941((byte) 127);
        }
        field1505++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIBII)V", line = 102)
    public static final void method671(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 100) {
            return;
        }
        for (class173 var5 = (class173) class173.field2360.method2096(arg2 - 21500); var5 != null; var5 = (class173) class173.field2360.method2084((byte) 19)) {
            class362.method2209(var5, arg4, arg0, 100, arg3, arg1);
        }
        field1508++;
        for (class173 var6 = (class173) class443.field6469.method2096(-21400); var6 != null; var6 = (class173) class443.field6469.method2084((byte) 19)) {
            byte var11 = 1;
            class171 var12 = var6.field2371.method1767(16643);
            if (var6.field2371.field4209) {
                var11 = 0;
            } else if (var6.field2371.field4256 == var12.field2285 || var6.field2371.field4256 == var12.field2302 || var6.field2371.field4256 == var12.field2282 || var6.field2371.field4256 == var12.field2306) {
                var11 = 2;
            } else if (var6.field2371.field4256 == var12.field2318 || var6.field2371.field4256 == var12.field2314 || var6.field2371.field4256 == var12.field2320 || var6.field2371.field4256 == var12.field2299) {
                var11 = 3;
            }
            if (var6.field2359 != var11) {
                int var13 = class242.method1501(var6.field2371, (byte) -67);
                if (var6.field2356 != var13) {
                    if (var6.field2366 != null) {
                        class375.field5607.method643(var6.field2366);
                        var6.field2366 = null;
                    }
                    var6.field2356 = var13;
                }
                var6.field2359 = var11;
            }
            var6.field2362 = var6.field2371.field2959;
            var6.field2368 = var6.field2371.field2959 + (var6.field2371.method1773(arg2 - 109) << 6);
            var6.field2364 = var6.field2371.field2966;
            var6.field2357 = var6.field2371.field2966 + (var6.field2371.method1773(-92) << 6);
            class362.method2209(var6, arg4, arg0, 100, arg3, arg1);
        }
        for (class173 var7 = (class173) class99.field1347.method2316(4999); var7 != null; var7 = (class173) class99.field1347.method2308((byte) -71)) {
            byte var8 = 1;
            class171 var9 = var7.field2354.method1767(arg2 ^ 0x4167);
            if (var7.field2354.field4209) {
                var8 = 0;
            } else if (var7.field2354.field4256 == var9.field2285 || var7.field2354.field4256 == var9.field2302 || var7.field2354.field4256 == var9.field2282 || var7.field2354.field4256 == var9.field2306) {
                var8 = 2;
            } else if (var7.field2354.field4256 == var9.field2318 || var7.field2354.field4256 == var9.field2314 || var7.field2354.field4256 == var9.field2320 || var7.field2354.field4256 == var9.field2299) {
                var8 = 3;
            }
            if (var7.field2359 != var8) {
                int var10 = class52.method387(var7.field2354, 18);
                if (var7.field2356 != var10) {
                    if (var7.field2366 != null) {
                        class375.field5607.method643(var7.field2366);
                        var7.field2366 = null;
                    }
                    var7.field2356 = var10;
                }
                var7.field2359 = var8;
            }
            var7.field2362 = var7.field2354.field2959;
            var7.field2368 = var7.field2354.field2959 + (var7.field2354.method1773(-121) << 6);
            var7.field2364 = var7.field2354.field2966;
            var7.field2357 = var7.field2354.field2966 + (var7.field2354.method1773(-53) << 6);
            class362.method2209(var7, arg4, arg0, 100, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 240)
    public static void method672(int arg0) {
        field1510 = null;
        if (arg0 > -38) {
            method672(-83);
        }
        field1517 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILae;)V", line = 252)
    public final void method673(int arg0, class156 arg1) {
        while (true) {
            int var3 = arg1.method941((byte) 126);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field1506 = 121;
                }
                field1522++;
                return;
            }
            this.method670(86, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 286)
    public final void method674(int arg0) {
        if (~this.field1521 == arg0) {
            this.field1521 = this.field1506;
        }
        field1515++;
        this.field1513 = this.field1513 << 8 | this.field1501;
    }
}
