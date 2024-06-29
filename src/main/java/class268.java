import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class268 extends class36 {

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    private int field4295;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Z")
    public static boolean field4293 = false;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field4292 = -2;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4304 = "purple:";

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4288 = "glow3:";

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Lsb;")
    public static class124 field4297;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lsb;")
    public static class124 field4305;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "[I")
    public static int[] field4291;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        ++field4290;
        if (arg2 != -17) {
            this.method307(38, 101, 47);
        }
        int var4 = this.field4307 * arg1 >> 12;
        int var5 = this.field4294 * arg1 >> 12;
        int var6 = this.field4296 * arg0 >> 12;
        int var7 = this.field4295 * arg0 >> 12;
        class85.method676(super.field610, var4, var6, false, super.field608, var7, super.field611, var5);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        ++field4300;
        int var4 = this.field4294 * arg1 >> 12;
        if (arg0 == 0) {
            int var5 = this.field4296 * arg2 >> 12;
            int var6 = this.field4307 * arg1 >> 12;
            int var7 = this.field4295 * arg2 >> 12;
            class59.method458(var7, var4, var6, var5, 33, super.field608);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIB)V")
    public final void method310(int arg0, int arg1, byte arg2) {
        ++field4299;
        int var4 = this.field4307 * arg1 >> 12;
        int var5 = -51 / ((-65 - arg2) / 34);
        int var6 = this.field4296 * arg0 >> 12;
        int var7 = this.field4294 * arg1 >> 12;
        int var8 = this.field4295 * arg0 >> 12;
        class287.method1934(var6, super.field610, (byte) -100, var4, var8, var7, super.field611);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILkj;)V")
    public static final void method1824(int arg0, class114 arg1) {
        ++field4306;
        int var2 = arg1.field1929;
        if (~var2 == -325) {
            if (~class66.field1078 == 0) {
                class3.field43 = arg1.field1773;
                class66.field1078 = arg1.field1918;
            }
            if (!class204.field3282.field1347) {
                arg1.field1918 = class3.field43;
            } else {
                arg1.field1918 = class66.field1078;
            }
        } else {
            if (arg0 != 2) {
                field4305 = null;
            }
            if (var2 == 325) {
                if (class66.field1078 == -1) {
                    class66.field1078 = arg1.field1918;
                    class3.field43 = arg1.field1773;
                }
                if (!class204.field3282.field1347) {
                    arg1.field1918 = class66.field1078;
                } else {
                    arg1.field1918 = class3.field43;
                }
            } else if (~var2 == -328) {
                arg1.field1863 = 150;
                arg1.field1756 = (int) (Math.sin((double) class207.field3336 / 40.0D) * 256.0D) & 2047;
                arg1.field1892 = 5;
                arg1.field1931 = -1;
            } else if (var2 == 328) {
                if (class48.field878.field3445 == null) {
                    arg1.field1931 = 0;
                } else {
                    arg1.field1863 = 150;
                    arg1.field1756 = 2047 & (int) (256.0D * Math.sin((double) class207.field3336 / 40.0D));
                    arg1.field1892 = 5;
                    arg1.field1931 = ((int) class260.method1739(false, class48.field878.field3445) << 11) - -2047;
                    arg1.field1816 = class48.field878.field2901;
                    arg1.field1825 = 0;
                    arg1.field1819 = class48.field878.field2858;
                    arg1.field1912 = class48.field878.field2811;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public static void method1825(byte arg0) {
        field4305 = null;
        field4291 = null;
        field4304 = null;
        field4288 = null;
        if (arg0 < -41) {
            field4297 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIII)V")
    public class268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4296 = arg1;
        this.field4294 = arg2;
        this.field4295 = arg3;
        this.field4307 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method1826(String arg0, int arg1) {
        ++field4298;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 >= -76) {
            field4288 = null;
        }
        while (var2 > var4) {
            char var5 = arg0.charAt(var4);
            if (~var5 < -1 && ~var5 > -129 || var5 >= 160 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (~var5 != -8365) {
                if (var5 == 8218) {
                    var3[var4] = -126;
                } else if (var5 != 402) {
                    if (var5 == 8222) {
                        var3[var4] = -124;
                    } else if (~var5 == -8231) {
                        var3[var4] = -123;
                    } else if (~var5 == -8225) {
                        var3[var4] = -122;
                    } else if (~var5 != -8226) {
                        if (var5 == 710) {
                            var3[var4] = -120;
                        } else if (var5 != 8240) {
                            if (~var5 != -353) {
                                if (~var5 == -8250) {
                                    var3[var4] = -117;
                                } else if (var5 != 338) {
                                    if (var5 == 381) {
                                        var3[var4] = -114;
                                    } else if (var5 != 8216) {
                                        if (var5 == 8217) {
                                            var3[var4] = -110;
                                        } else if (var5 != 8220) {
                                            if (~var5 != -8222) {
                                                if (~var5 != -8227) {
                                                    if (var5 == 8211) {
                                                        var3[var4] = -106;
                                                    } else if (~var5 != -8213) {
                                                        if (~var5 != -733) {
                                                            if (var5 != 8482) {
                                                                if (var5 == 353) {
                                                                    var3[var4] = -102;
                                                                } else if (var5 != 8250) {
                                                                    if (~var5 != -340) {
                                                                        if (~var5 != -383) {
                                                                            if (var5 != 376) {
                                                                                var3[var4] = 63;
                                                                            } else {
                                                                                var3[var4] = -97;
                                                                            }
                                                                        } else {
                                                                            var3[var4] = -98;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -100;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -101;
                                                                }
                                                            } else {
                                                                var3[var4] = -103;
                                                            }
                                                        } else {
                                                            var3[var4] = -104;
                                                        }
                                                    } else {
                                                        var3[var4] = -105;
                                                    }
                                                } else {
                                                    var3[var4] = -107;
                                                }
                                            } else {
                                                var3[var4] = -108;
                                            }
                                        } else {
                                            var3[var4] = -109;
                                        }
                                    } else {
                                        var3[var4] = -111;
                                    }
                                } else {
                                    var3[var4] = -116;
                                }
                            } else {
                                var3[var4] = -118;
                            }
                        } else {
                            var3[var4] = -119;
                        }
                    } else {
                        var3[var4] = -121;
                    }
                } else {
                    var3[var4] = -125;
                }
            } else {
                var3[var4] = -128;
            }
            ++var4;
        }
        return var3;
    }
}
