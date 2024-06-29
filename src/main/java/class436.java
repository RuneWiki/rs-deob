import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class436 {

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lje;")
    private class265 field5449 = new class265();

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "Lje;")
    private class265 field5455 = new class265();

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "Lje;")
    private class265 field5461 = new class265();

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "Lje;")
    private class265 field5462 = new class265();

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "Les;")
    private class630 field5465 = new class630(4);

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "B")
    private byte field5470 = 0;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
    public volatile int field5469 = 0;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "I")
    public volatile int field5468 = 0;

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "Les;")
    private class630 field5467 = new class630(8);

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field5446 = -1;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field5441 = 0;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Z")
    public static boolean field5442 = false;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "J")
    private long field5464;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "Lnf;")
    private class37 field5471;

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "Lrfa;")
    private class419 field5463;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIII)Ltba;", line = 6)
    public static final class704 method2287(boolean arg0, int arg1, int arg2, int arg3) {
        field5460++;
        class704 var4 = null;
        if (arg3 == 0) {
            class193.field2430++;
            var4 = class314.method1820(class32.field445, class400.field5014, (byte) 86);
        }
        if (arg3 == 1) {
            class668.field9410++;
            var4 = class314.method1820(class49.field699, class400.field5014, (byte) 78);
        }
        var4.field9929.method3505(-117, class145.field1879 + arg1);
        var4.field9929.method3518((byte) -72, class277.field3470.method448((byte) -68, 82) ? 1 : 0);
        var4.field9929.method3506(128, class630.field8817 + arg2);
        class520.field7095 = false;
        field5446 = arg2;
        class309.field3946 = arg1;
        class464.method2466(arg0);
        return var4;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIZB)Lnf;", line = 37)
    public final class37 method2288(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field5444++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class37 var8 = new class37();
        var8.field7752 = arg3;
        var8.field6874 = var6;
        var8.field506 = arg4;
        if (arg3) {
            if (this.method2302(26) >= 20) {
                throw new RuntimeException();
            }
            this.field5449.method1541(75, var8);
        } else if (this.method2301(0) < 20) {
            this.field5461.method1541(75, var8);
        } else {
            throw new RuntimeException();
        }
        return arg2 == 4 ? var8 : null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z", line = 83)
    public final boolean method2289(int arg0) {
        field5453++;
        if (this.field5463 != null) {
            long var2 = class571.method3150(94);
            int var4 = (int) (var2 - this.field5464);
            this.field5464 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5466 += var4;
            if (this.field5466 > 30000) {
                try {
                    this.field5463.method2237((byte) 61);
                } catch (Exception var28) {
                }
                this.field5463 = null;
            }
        }
        if (this.field5463 == null) {
            return this.method2302(47) == 0 && this.method2301(0) == 0;
        }
        try {
            this.field5463.method2238((byte) 17);
            for (class37 var5 = (class37) this.field5449.method1546((byte) -126); var5 != null; var5 = (class37) this.field5449.method1536(1252027233)) {
                this.field5465.field8812 = 0;
                this.field5465.method3509(1, (byte) -124);
                this.field5465.method3515((int) var5.field6874, (byte) -22);
                this.field5463.method2236(4, 0, (byte) -94, this.field5465.field8804);
                this.field5455.method1541(75, var5);
            }
            for (class37 var6 = (class37) this.field5461.method1546((byte) -55); var6 != null; var6 = (class37) this.field5461.method1536(1252027233)) {
                this.field5465.field8812 = 0;
                this.field5465.method3509(0, (byte) -119);
                this.field5465.method3515((int) var6.field6874, (byte) -22);
                this.field5463.method2236(4, 0, (byte) -60, this.field5465.field8804);
                this.field5462.method1541(75, var6);
            }
            int var7 = -107 % ((-arg0 - 22) / 35);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field5463.method2239(-22874);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field5466 = 0;
                byte var10 = 0;
                if (this.field5471 == null) {
                    var10 = 8;
                } else if (this.field5471.field502 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field5467.field8812;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field5463.method2234(this.field5467.field8812, this.field5467.field8804, var11, 14216);
                    if (this.field5470 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field5467.field8804[this.field5467.field8812 + var12] = (byte) class688.method3877(this.field5467.field8804[this.field5467.field8812 + var12], this.field5470);
                        }
                    }
                    this.field5467.field8812 += var11;
                    if (this.field5467.field8812 >= var10) {
                        if (this.field5471 == null) {
                            this.field5467.field8812 = 0;
                            int var13 = this.field5467.method3501(-9268);
                            int var14 = this.field5467.method3470(13111);
                            int var15 = this.field5467.method3501(-9268);
                            int var16 = this.field5467.method3483(70);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class37 var22;
                            if (var18) {
                                for (var22 = (class37) this.field5462.method1546((byte) -115); var22 != null && var22.field6874 != var19; var22 = (class37) this.field5462.method1536(1252027233)) {
                                }
                            } else {
                                for (var22 = (class37) this.field5455.method1546((byte) -100); var22 != null && var22.field6874 != var19; var22 = (class37) this.field5455.method1536(1252027233)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field5471 = var22;
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field5471.field505 = new class630(var16 + this.field5471.field506 + var23);
                            this.field5471.field505.method3509(var17, (byte) -122);
                            this.field5471.field505.method3464(var16, -120);
                            this.field5471.field502 = 8;
                            this.field5467.field8812 = 0;
                        } else if (this.field5471.field502 != 0) {
                            throw new IOException();
                        } else if (this.field5467.field8804[0] == -1) {
                            this.field5471.field502 = 1;
                            this.field5467.field8812 = 0;
                        } else {
                            this.field5471 = null;
                        }
                    }
                } else {
                    int var24 = this.field5471.field505.field8804.length - this.field5471.field506;
                    int var25 = 512 - this.field5471.field502;
                    if ((var24 - this.field5471.field505.field8812) < var25) {
                        var25 = var24 - this.field5471.field505.field8812;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field5463.method2234(this.field5471.field505.field8812, this.field5471.field505.field8804, var25, 14216);
                    if (this.field5470 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field5471.field505.field8804[this.field5471.field505.field8812 + var26] = (byte) class688.method3877(this.field5471.field505.field8804[this.field5471.field505.field8812 + var26], this.field5470);
                        }
                    }
                    this.field5471.field505.field8812 += var25;
                    this.field5471.field502 += var25;
                    if (this.field5471.field505.field8812 == var24) {
                        this.field5471.method2744((byte) -104);
                        this.field5471.field7755 = false;
                        this.field5471 = null;
                    } else if (this.field5471.field502 == 512) {
                        this.field5471.field502 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field5463.method2237((byte) 61);
            } catch (Exception var27) {
            }
            this.field5469++;
            this.field5468 = -2;
            this.field5463 = null;
            return this.method2302(111) == 0 && this.method2301(0) == 0;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V", line = 358)
    public static final void method2290(int arg0) {
        field5439++;
        class520.field7094.method3696((byte) -116);
        class232.method1397(74);
        class71.field965 = null;
        if (arg0 != -101) {
            field5443 = -66;
        }
        class196.field2458 = 0;
        class325.field4172 = 0;
        class533.field7187 = null;
        class221.field2713 = null;
        class298.field3671.field8812 = 0;
        class201.method1213(true);
        class29.field416 = null;
        class148.field1917 = 0;
        class313.field4023 = 0;
        class66.field904 = 0;
        class516.field7046 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 384)
    public final void method2291(byte arg0) {
        field5445++;
        if (arg0 < 3) {
            method2287(false, -52, -85, 111);
        }
        if (this.field5463 != null) {
            this.field5463.method2237((byte) 61);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V", line = 410)
    public final void method2292(int arg0) {
        field5447++;
        if (this.field5463 == null) {
            return;
        }
        try {
            this.field5465.field8812 = 0;
            this.field5465.method3509(7, (byte) -115);
            this.field5465.method3515(0, (byte) -22);
            this.field5463.method2236(arg0, 0, (byte) -55, this.field5465.field8804);
        } catch (IOException var3) {
            try {
                this.field5463.method2237((byte) 61);
            } catch (Exception var2) {
            }
            this.field5468 = -2;
            this.field5469++;
            this.field5463 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IZ)V", line = 436)
    public final void method2293(int arg0, boolean arg1) {
        if (arg0 < 126) {
            return;
        }
        field5440++;
        if (this.field5463 == null) {
            return;
        }
        try {
            this.field5465.field8812 = 0;
            this.field5465.method3509(arg1 ? 2 : 3, (byte) -128);
            this.field5465.method3515(0, (byte) -22);
            this.field5463.method2236(4, 0, (byte) -69, this.field5465.field8804);
        } catch (IOException var4) {
            try {
                this.field5463.method2237((byte) 61);
            } catch (Exception var3) {
            }
            this.field5469++;
            this.field5463 = null;
            this.field5468 = -2;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V", line = 464)
    public final void method2294(boolean arg0) {
        if (!arg0) {
            return;
        }
        try {
            this.field5463.method2237((byte) 61);
        } catch (Exception var2) {
        }
        field5454++;
        this.field5469++;
        this.field5468 = -1;
        this.field5463 = null;
        this.field5470 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IZLrfa;)V", line = 485)
    public final void method2295(int arg0, boolean arg1, class419 arg2) {
        if (arg0 <= 10) {
            this.method2289(66);
        }
        field5451++;
        if (this.field5463 != null) {
            try {
                this.field5463.method2237((byte) 61);
            } catch (Exception var8) {
            }
            this.field5463 = null;
        }
        this.field5463 = arg2;
        this.method2298((byte) -123);
        this.method2293(127, arg1);
        this.field5467.field8812 = 0;
        this.field5471 = null;
        while (true) {
            class37 var4 = (class37) this.field5455.method1537(-21957);
            if (var4 == null) {
                while (true) {
                    class37 var5 = (class37) this.field5462.method1537(-21957);
                    if (var5 == null) {
                        if (this.field5470 != 0) {
                            try {
                                this.field5465.field8812 = 0;
                                this.field5465.method3509(4, (byte) -111);
                                this.field5465.method3509(this.field5470, (byte) -126);
                                this.field5465.method3526(0, 13469);
                                this.field5463.method2236(4, 0, (byte) -62, this.field5465.field8804);
                            } catch (IOException var7) {
                                try {
                                    this.field5463.method2237((byte) 61);
                                } catch (Exception var6) {
                                }
                                this.field5468 = -2;
                                this.field5469++;
                                this.field5463 = null;
                            }
                        }
                        this.field5466 = 0;
                        this.field5464 = class571.method3150(96);
                        return;
                    }
                    this.field5461.method1541(75, var5);
                }
            }
            this.field5449.method1541(75, var4);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZLefa;)V", line = 555)
    public static final void method2296(boolean arg0, class156 arg1) {
        class468.field5950 = arg1;
        field5452++;
        if (arg0) {
            field5446 = -115;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)Z", line = 566)
    public final boolean method2297(int arg0) {
        if (arg0 <= 22) {
            this.method2289(-42);
        }
        field5450++;
        return this.method2301(0) >= 20;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V", line = 586)
    private final void method2298(byte arg0) {
        field5458++;
        if (this.field5463 == null) {
            return;
        }
        try {
            if (arg0 != -123) {
                this.method2302(42);
            }
            this.field5465.field8812 = 0;
            this.field5465.method3509(6, (byte) -122);
            this.field5465.method3515(3, (byte) -22);
            this.field5463.method2236(4, 0, (byte) -117, this.field5465.field8804);
        } catch (IOException var3) {
            try {
                this.field5463.method2237((byte) 61);
            } catch (Exception var2) {
            }
            this.field5469++;
            this.field5468 = -2;
            this.field5463 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)Z", line = 613)
    public final boolean method2299(int arg0) {
        field5459++;
        if (arg0 == 26555) {
            return this.method2302(112) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V", line = 624)
    public final void method2300(byte arg0) {
        if (this.field5463 != null) {
            this.field5463.method2232(35);
        }
        field5457++;
        if (arg0 >= -11) {
            this.field5462 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)I", line = 638)
    private final int method2301(int arg0) {
        if (arg0 == 0) {
            field5448++;
            return this.field5461.method1543(0) + this.field5462.method1543(0);
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)I", line = 653)
    public final int method2302(int arg0) {
        if (arg0 < 8) {
            method2287(false, 115, 17, -44);
        }
        field5456++;
        return this.field5449.method1543(0) + this.field5455.method1543(0);
    }
}
