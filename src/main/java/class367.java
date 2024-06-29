import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class367 extends class304 implements class106 {

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "Z")
    private boolean field5266;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "B")
    private byte field5259;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "Z")
    private boolean field5263;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "B")
    private byte field5278;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "B")
    private byte field5282;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "Z")
    private boolean field5285;

    @OriginalMember(owner = "client!qi", name = "db", descriptor = "S")
    private short field5290;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "Z")
    private boolean field5273;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "Lf;")
    public class491 field5281;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "Ltm;")
    private class242 field5280;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field5271 = 0;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!qi", name = "cb", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!qi", name = "eb", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!qi", name = "fb", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Lw;")
    public static class179 field5264;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        if (arg1 instanceof class185) {
            class185 var8 = (class185) arg1;
            if (this.field5281 != null && var8.field2723 != null) {
                this.field5281.method1341(var8.field2723, arg6, arg2, arg0, arg5);
            }
        } else if (arg1 instanceof class367) {
            class367 var9 = (class367) arg1;
            if (this.field5281 != null && var9.field5281 != null) {
                this.field5281.method1341(var9.field5281, arg6, arg2, arg0, arg5);
            }
        }
        ++field5267;
        int var10 = -6 / ((20 - arg4) / 38);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field5275;
        if (this.field5281 == null) {
            return null;
        } else {
            class282 var3 = arg1.method601();
            var3.method1019(super.field4331, super.field4322, super.field4317);
            class477 var4 = null;
            if (this.field5263) {
                var4 = class96.method543(1, (byte) 71);
            }
            this.field5281.method1323(var3, var4 == null ? null : var4.field6696[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        ++field5277;
        return arg0 > -105 ? false : this.field5266;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 >= -40) {
            return true;
        } else {
            ++field5291;
            return this.field5273;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 < 56) {
            this.method115((class313) null, (byte) 112, 76);
        }
        ++field5268;
        if (this.field5281 != null) {
            this.field5281.method1313();
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)V")
    public static void method2255(boolean arg0) {
        if (!arg0) {
            field5264 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
    public static int method2256(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        ++field5270;
        if (arg0 != 0) {
            this.field5273 = true;
        }
        return this.field5281 == null ? 0 : this.field5281.method1289();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field5287;
        class491 var5 = this.method2258(1, arg3, 65536);
        if (arg1 <= 16) {
            field5264 = null;
        }
        if (var5 != null) {
            class282 var6 = arg3.method601();
            var6.method1019(super.field4331, super.field4322, super.field4317);
            return var5.method1339(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)I")
    public static final int method2257(byte arg0, int arg1, int arg2) {
        ++field5286;
        int var3 = class329.method2083(arg2 + -1, arg1 + -1, 1376312589) - (-class329.method2083(arg2 + -1, arg1 - -1, 1376312589) - class329.method2083(arg2 - -1, arg1 + -1, 1376312589)) + class329.method2083(arg2 + 1, arg1 + 1, 1376312589);
        int var4 = class329.method2083(arg2, arg1 + -1, 1376312589) + (class329.method2083(arg2, arg1 + 1, arg0 + 1376312579) - (-class329.method2083(arg2 - 1, arg1, arg0 ^ 1376312583) + -class329.method2083(arg2 + 1, arg1, 1376312589)));
        if (arg0 != 10) {
            method2260(-8);
        }
        int var5 = class329.method2083(arg2, arg1, 1376312589);
        return var3 / 16 + var4 / 8 - -(var5 / 4);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        if (arg0 <= 13) {
            return -17;
        } else {
            ++field5289;
            return this.field5259;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILnp;I)Lf;")
    private final class491 method2258(int arg0, class313 arg1, int arg2) {
        if (arg0 != 1) {
            method2263((class452) null, 17);
        }
        ++field5276;
        if (this.field5281 != null && arg1.method653(this.field5281.method1319(), arg2) == 0) {
            return this.field5281;
        } else {
            class284 var4 = this.method2261(arg0 ^ -101, arg1, false, arg2);
            return var4 == null ? null : var4.field4158;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)I")
    public final int method2259(byte arg0) {
        ++field5283;
        if (arg0 != -121) {
            this.method247(72, (class54) null, 69, (class313) null, (byte) -62, true, -25);
        }
        return this.field5281 != null ? this.field5281.method1296() / 4 : 15;
    }

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "(I)I")
    public static final int method2260(int arg0) {
        if (arg0 != 10) {
            field5264 = null;
        }
        ++field5288;
        class313 var1 = class141.field1878;
        boolean var2 = false;
        if (class437.field6083 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class313.method1937(0, var3, (class430) null, (class109) null, arg0 + 21944, 0);
        }
        long var4 = class433.method2562(-2039);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method605(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class433.method2562(-2039));
        var1.method1941(100, 0, 1, 100, 0, -16777216);
        if (var2) {
            var1.method1936((byte) 119);
        }
        return var7;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILnp;ZI)Lpr;")
    private final class284 method2261(int arg0, class313 arg1, boolean arg2, int arg3) {
        ++field5269;
        class453 var5 = class156.field2325.method808(65535 & this.field5290, 0);
        if (arg0 >= -72) {
            this.method119((byte) 74);
        }
        class426 var6;
        class426 var7;
        if (!this.field5285) {
            if (this.field5282 >= 3) {
                var6 = null;
            } else {
                var6 = class178.field2556[this.field5282 + 1];
            }
            var7 = class178.field2556[this.field5282];
        } else {
            var7 = class28.field388[this.field5282];
            var6 = class178.field2556[0];
        }
        return var5.method2667(super.field4317, arg3, -4, arg2, super.field4322, ~this.field5259 == -12 ? this.field5278 + 4 : this.field5278, arg1, super.field4331, var6, var7, ~this.field5259 != -12 ? this.field5259 : 10);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        if (arg0 != 31249) {
            this.field5266 = false;
        }
        ++field5292;
        return this.field5278;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field5279;
        if (arg1 >= -95) {
            this.method113(-111, 110, -24, (class313) null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        ++field5262;
        Object var3 = null;
        class242 var5;
        if (this.field5280 == null && this.field5273) {
            class284 var4 = this.method2261(-120, arg1, true, 131072);
            var5 = var4 == null ? null : var4.field4154;
        } else {
            var5 = this.field5280;
            this.field5280 = null;
        }
        if (var5 != null) {
            class94.method531(var5, this.field5282, super.field4331, super.field4317, (boolean[]) null);
        }
        if (arg0 > -126) {
            field5264 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        if (arg0 != 12181) {
            this.method323(55);
        }
        ++field5274;
        return this.field5290 & 65535;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lnp;Ldq;IIIIIZIIIIIIZ)V")
    public class367(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6329 == -2, class85.method479(arg12, arg13, (byte) 0));
        this.field5266 = arg14;
        this.field5259 = (byte) arg12;
        this.field5263 = arg1.field6366 != 0 && !arg7;
        this.field5278 = (byte) arg13;
        this.field5282 = (byte) arg3;
        this.field5285 = arg7;
        this.field5290 = (short) arg1.field6343;
        this.field5273 = arg0.method639() && arg1.field6380 && !this.field5285 && ~class314.field4438.field5776 != -1;
        int var16 = 1024;
        if (this.field5266) {
            var16 |= 32768;
        }
        class284 var17 = this.method2261(-128, arg0, this.field5273, var16);
        if (var17 != null) {
            this.field5281 = var17.field4158;
            this.field5280 = var17.field4154;
            if (this.field5266) {
                this.field5281 = this.field5281.method1292((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(CB)B")
    public static final byte method2262(char arg0, byte arg1) {
        if (arg1 != -99) {
            field5271 = 95;
        }
        ++field5265;
        byte var2;
        if ((~arg0 >= -1 || arg0 >= 128) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 8364) {
                if (~arg0 != -8219) {
                    if (~arg0 == -403) {
                        var2 = -125;
                    } else if (~arg0 != -8223) {
                        if (arg0 == 8230) {
                            var2 = -123;
                        } else if (~arg0 == -8225) {
                            var2 = -122;
                        } else if (~arg0 != -8226) {
                            if (arg0 == 710) {
                                var2 = -120;
                            } else if (~arg0 == -8241) {
                                var2 = -119;
                            } else if (arg0 != 352) {
                                if (arg0 != 8249) {
                                    if (arg0 != 338) {
                                        if (~arg0 == -382) {
                                            var2 = -114;
                                        } else if (~arg0 == -8217) {
                                            var2 = -111;
                                        } else if (~arg0 != -8218) {
                                            if (arg0 != 8220) {
                                                if (arg0 != 8221) {
                                                    if (arg0 == 8226) {
                                                        var2 = -107;
                                                    } else if (~arg0 == -8212) {
                                                        var2 = -106;
                                                    } else if (arg0 != 8212) {
                                                        if (arg0 == 732) {
                                                            var2 = -104;
                                                        } else if (~arg0 != -8483) {
                                                            if (~arg0 != -354) {
                                                                if (~arg0 != -8251) {
                                                                    if (~arg0 == -340) {
                                                                        var2 = -100;
                                                                    } else if (arg0 == 382) {
                                                                        var2 = -98;
                                                                    } else if (~arg0 == -377) {
                                                                        var2 = -97;
                                                                    } else {
                                                                        var2 = 63;
                                                                    }
                                                                } else {
                                                                    var2 = -101;
                                                                }
                                                            } else {
                                                                var2 = -102;
                                                            }
                                                        } else {
                                                            var2 = -103;
                                                        }
                                                    } else {
                                                        var2 = -105;
                                                    }
                                                } else {
                                                    var2 = -108;
                                                }
                                            } else {
                                                var2 = -109;
                                            }
                                        } else {
                                            var2 = -110;
                                        }
                                    } else {
                                        var2 = -116;
                                    }
                                } else {
                                    var2 = -117;
                                }
                            } else {
                                var2 = -118;
                            }
                        } else {
                            var2 = -121;
                        }
                    } else {
                        var2 = -124;
                    }
                } else {
                    var2 = -126;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 <= 70) {
            return null;
        } else {
            ++field5260;
            return this.method2258(1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        ++field5261;
        if (arg1 != -26920) {
            this.method115((class313) null, (byte) -123, -49);
        }
        Object var3 = null;
        class242 var5;
        if (this.field5280 == null && this.field5273) {
            class284 var4 = this.method2261(-127, arg0, true, 131072);
            var5 = var4 != null ? var4.field4154 : null;
        } else {
            var5 = this.field5280;
            this.field5280 = null;
        }
        if (var5 != null) {
            class333.method2103(var5, this.field5282, super.field4331, super.field4317, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        ++field5284;
        this.field5266 = false;
        if (this.field5281 != null) {
            this.field5281.method1344(this.field5281.method1319() & -32769);
        }
        if (arg0 != -1) {
            method2262('e', (byte) -22);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loa;I)V")
    public static final void method2263(class452 arg0, int arg1) {
        ++field5272;
        class342 var2 = (class342) class389.field5521.method2761((long) arg0.field2154, (byte) -112);
        if (var2 != null) {
            if (var2.field4984 != null) {
                class59.field796.method2561(var2.field4984);
                var2.field4984 = null;
            }
            var2.method1510((byte) -13);
        }
        if (arg1 != 30748) {
            field5264 = null;
        }
    }
}
