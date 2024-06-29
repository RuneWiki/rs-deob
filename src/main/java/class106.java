import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class106 extends class349 {

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Z")
    public boolean field1314;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "Z")
    public boolean field1316;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "[S")
    public short[] field1304;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field1297 = -1;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1303 = "white:";

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Lfd;")
    public static class194 field1313 = null;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Luc;")
    public static class58 field1305 = new class58(32);

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[Lae;")
    public static class275[] field1318 = new class275[16];

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Lam;")
    public static class286 field1312;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1310;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lok;")
    public static final class60 method562(int arg0, int arg1) {
        ++field1300;
        if (arg0 != 0) {
            if (arg0 == 1) {
                if ((double) class443.field6457 == 3.0D) {
                    return class216.field2909;
                }
                if ((double) class443.field6457 == 4.0D) {
                    return class359.field5072;
                }
                if ((double) class443.field6457 == 6.0D) {
                    return class53.field547;
                }
                if ((double) class443.field6457 >= 8.0D) {
                    return class191.field2402;
                }
            } else if (arg0 == 2) {
                if ((double) class443.field6457 == 3.0D) {
                    return class53.field547;
                }
                if ((double) class443.field6457 == 4.0D) {
                    return class191.field2402;
                }
                if ((double) class443.field6457 == 6.0D) {
                    return class370.field5174;
                }
                if ((double) class443.field6457 >= 8.0D) {
                    return class244.field3321;
                }
            }
        } else {
            if ((double) class443.field6457 == 3.0D) {
                return class116.field1442;
            }
            if ((double) class443.field6457 == 4.0D) {
                return class72.field804;
            }
            if ((double) class443.field6457 == 6.0D) {
                return class216.field2909;
            }
            if ((double) class443.field6457 >= 8.0D) {
                return class359.field5072;
            }
        }
        if (arg1 != 1) {
            method563(73);
        }
        return null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public static final void method563(int arg0) {
        for (int var1 = 0; ~var1 > ~class21.field197.length; ++var1) {
            for (int var2 = 0; var2 < class21.field197[var1].length; ++var2) {
                class21.field197[var1][var2] = class129.field1665;
            }
        }
        if (arg0 > -30) {
            method562(100, 98);
        }
        ++field1315;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
    public final void method564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 52) {
            field1297 = -34;
        }
        this.field1302 = arg1;
        ++field1306;
        this.field1317 = arg0;
        this.field1299 = arg3;
        this.field1311 = arg4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZII)V")
    public final void method565(boolean arg0, int arg1, int arg2) {
        ++field1307;
        if (arg1 == -12) {
            int var4;
            if (arg0) {
                var4 = 2048;
            } else {
                int var5 = 2047 & this.field1299 * arg2 / 50 + this.field1298;
                int var6 = this.field1311;
                if (~var6 != -2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 2) {
                                if (~var6 == -6) {
                                    var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
                                } else {
                                    var4 = 2048;
                                }
                            } else {
                                var4 = var5;
                            }
                        } else {
                            var4 = var5 >> 10 << 11;
                        }
                    } else {
                        var4 = class32.field315[var5] >> 1;
                    }
                } else {
                    var4 = (class356.field5037[var5 << 3] >> 5) + 1024;
                }
            }
            super.field4852 = (float) ((this.field1317 * var4 >> 11) + this.field1302) / 2048.0F;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method566(byte arg0) {
        field1305 = null;
        field1303 = null;
        field1312 = null;
        field1313 = null;
        field1318 = null;
        field1310 = null;
        if (arg0 != 110) {
            field1313 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    private final void method567(byte arg0) {
        ++field1308;
        if (arg0 < 103) {
            this.field1316 = true;
        }
        int var2 = this.field1301;
        if (var2 != 2) {
            if (~var2 != -4) {
                if (~var2 != -5) {
                    if (~var2 != -6) {
                        if (var2 != 12) {
                            if (var2 != 13) {
                                if (~var2 != -11) {
                                    if (~var2 != -12) {
                                        if (~var2 != -7) {
                                            if (~var2 != -8) {
                                                if (~var2 != -9) {
                                                    if (var2 != 9) {
                                                        if (~var2 != -15) {
                                                            if (~var2 != -16) {
                                                                if (~var2 == -17) {
                                                                    this.field1302 = 1792;
                                                                    this.field1317 = 256;
                                                                    this.field1299 = 8192;
                                                                    this.field1311 = 1;
                                                                } else {
                                                                    this.field1302 = 0;
                                                                    this.field1311 = 0;
                                                                    this.field1299 = 2048;
                                                                    this.field1317 = 2048;
                                                                }
                                                            } else {
                                                                this.field1311 = 1;
                                                                this.field1299 = 4096;
                                                                this.field1302 = 1536;
                                                                this.field1317 = 512;
                                                            }
                                                        } else {
                                                            this.field1317 = 768;
                                                            this.field1302 = 1280;
                                                            this.field1311 = 1;
                                                            this.field1299 = 2048;
                                                        }
                                                    } else {
                                                        this.field1302 = 1024;
                                                        this.field1299 = 4096;
                                                        this.field1311 = 3;
                                                        this.field1317 = 1024;
                                                    }
                                                } else {
                                                    this.field1302 = 1024;
                                                    this.field1311 = 3;
                                                    this.field1317 = 1024;
                                                    this.field1299 = 2048;
                                                }
                                            } else {
                                                this.field1299 = 4096;
                                                this.field1311 = 3;
                                                this.field1302 = 1280;
                                                this.field1317 = 768;
                                            }
                                        } else {
                                            this.field1311 = 3;
                                            this.field1299 = 2048;
                                            this.field1302 = 1280;
                                            this.field1317 = 768;
                                        }
                                    } else {
                                        this.field1317 = 512;
                                        this.field1302 = 1536;
                                        this.field1299 = 4096;
                                        this.field1311 = 3;
                                    }
                                } else {
                                    this.field1302 = 1536;
                                    this.field1311 = 3;
                                    this.field1299 = 2048;
                                    this.field1317 = 512;
                                }
                            } else {
                                this.field1317 = 2048;
                                this.field1311 = 2;
                                this.field1299 = 8192;
                                this.field1302 = 0;
                            }
                        } else {
                            this.field1299 = 2048;
                            this.field1302 = 0;
                            this.field1311 = 2;
                            this.field1317 = 2048;
                        }
                    } else {
                        this.field1317 = 2048;
                        this.field1311 = 4;
                        this.field1299 = 8192;
                        this.field1302 = 0;
                    }
                } else {
                    this.field1299 = 2048;
                    this.field1311 = 4;
                    this.field1302 = 0;
                    this.field1317 = 2048;
                }
            } else {
                this.field1311 = 1;
                this.field1302 = 0;
                this.field1317 = 2048;
                this.field1299 = 4096;
            }
        } else {
            this.field1317 = 2048;
            this.field1311 = 1;
            this.field1299 = 2048;
            this.field1302 = 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    protected class106() {
        if (class32.field315 == null) {
            class322.method1856(91);
        }
        this.method567((byte) 104);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ltq;)V")
    public class106(class250 arg0) {
        if (class32.field315 == null) {
            class322.method1856(93);
        }
        this.field1309 = arg0.method1350(31351);
        this.field1314 = ~(8 & this.field1309) != -1;
        this.field1316 = ~(this.field1309 & 16) != -1;
        this.field1309 &= 7;
        super.field4853 = arg0.method1374(-2);
        super.field4851 = arg0.method1374(-2);
        super.field4849 = arg0.method1374(-2);
        super.field4855 = arg0.method1350(31351);
        int var2 = super.field4855 * 2 + 1;
        this.field1304 = new short[var2];
        for (int var3 = 0; this.field1304.length > var3; ++var3) {
            short var5 = (short) arg0.method1374(-2);
            int var6 = var5 >>> 8;
            int var7 = 255 & var5;
            if (~var2 >= ~var6) {
                var6 = var2 - 1;
            }
            if (~var7 < ~(-var6 + var2)) {
                var7 = -var6 + var2;
            }
            this.field1304[var3] = (short) class392.method2441(var6 << 8, var7);
        }
        super.field4855 = (super.field4855 << 7) - -64;
        if (class180.field2271 != null) {
            super.field4848 = class180.field2271[arg0.method1374(-2)];
        } else {
            super.field4848 = class284.field3878[class347.method2109(arg0.method1374(-2), 39) & 65535];
        }
        int var4 = arg0.method1350(31351);
        this.field1301 = 31 & var4;
        this.field1298 = (var4 & 224) << 3;
        if (~this.field1301 != -32) {
            this.method567((byte) 123);
        }
    }
}
