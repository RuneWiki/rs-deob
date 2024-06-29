import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class196 extends class7 {

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    private int field2612 = -1;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
    private int field2622 = -1;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "Z")
    public static boolean field2619 = false;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
    public static int field2620 = 999999;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "F")
    public static float field2615;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Ldia;II)V")
    public class196(class246 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field2623 = arg2;
        super.field81.method1653((byte) 97, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field67, arg2, arg2, 0, class544.method3097(super.field67, -87), 5121, (byte[]) null, 0);
        }
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1344(byte arg0, String arg1) {
        ++field2617;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 83 / ((arg0 - 62) / 61);
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            char var6 = arg1.charAt(var5);
            if (~var6 < -1 && var6 < 128 || ~var6 <= -161 && var6 <= 255) {
                var3[var5] = (byte) var6;
            } else if (~var6 != -8365) {
                if (var6 != 8218) {
                    if (~var6 == -403) {
                        var3[var5] = -125;
                    } else if (~var6 != -8223) {
                        if (~var6 == -8231) {
                            var3[var5] = -123;
                        } else if (var6 != 8224) {
                            if (var6 != 8225) {
                                if (var6 != 710) {
                                    if (var6 == 8240) {
                                        var3[var5] = -119;
                                    } else if (var6 == 352) {
                                        var3[var5] = -118;
                                    } else if (var6 == 8249) {
                                        var3[var5] = -117;
                                    } else if (var6 == 338) {
                                        var3[var5] = -116;
                                    } else if (var6 != 381) {
                                        if (var6 != 8216) {
                                            if (var6 == 8217) {
                                                var3[var5] = -110;
                                            } else if (var6 == 8220) {
                                                var3[var5] = -109;
                                            } else if (var6 == 8221) {
                                                var3[var5] = -108;
                                            } else if (var6 == 8226) {
                                                var3[var5] = -107;
                                            } else if (var6 != 8211) {
                                                if (~var6 == -8213) {
                                                    var3[var5] = -105;
                                                } else if (var6 != 732) {
                                                    if (var6 == 8482) {
                                                        var3[var5] = -103;
                                                    } else if (var6 == 353) {
                                                        var3[var5] = -102;
                                                    } else if (var6 != 8250) {
                                                        if (var6 != 339) {
                                                            if (~var6 != -383) {
                                                                if (~var6 != -377) {
                                                                    var3[var5] = 63;
                                                                } else {
                                                                    var3[var5] = -97;
                                                                }
                                                            } else {
                                                                var3[var5] = -98;
                                                            }
                                                        } else {
                                                            var3[var5] = -100;
                                                        }
                                                    } else {
                                                        var3[var5] = -101;
                                                    }
                                                } else {
                                                    var3[var5] = -104;
                                                }
                                            } else {
                                                var3[var5] = -106;
                                            }
                                        } else {
                                            var3[var5] = -111;
                                        }
                                    } else {
                                        var3[var5] = -114;
                                    }
                                } else {
                                    var3[var5] = -120;
                                }
                            } else {
                                var3[var5] = -121;
                            }
                        } else {
                            var3[var5] = -122;
                        }
                    } else {
                        var3[var5] = -124;
                    }
                } else {
                    var3[var5] = -126;
                }
            } else {
                var3[var5] = -128;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(II)V")
    public static final void method1345(int arg0, int arg1) {
        class239 var2 = class332.field4802;
        synchronized (class332.field4802) {
            class332.field4802.method1546(arg1, (byte) -8);
        }
        ++field2621;
        class239 var3 = class87.field1228;
        synchronized (class87.field1228) {
            class87.field1228.method1546(arg1, (byte) -8);
            if (arg0 <= 76) {
                field2620 = -108;
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public final void method58(int arg0) {
        ++field2616;
        OpenGL.glFramebufferTexture2DEXT(this.field2622, this.field2612, 3553, 0, 0);
        this.field2622 = arg0;
        this.field2612 = -1;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
    public static final void method1346(String[] arg0, int arg1, short[] arg2) {
        if (arg1 >= 31) {
            class705.method3949(arg0.length + -1, arg0, 0, 106, arg2);
            ++field2614;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIB)V")
    public final void method1347(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg3, super.field82, arg0);
        if (arg4 > -13) {
            field2619 = false;
        }
        ++field2613;
        this.field2622 = arg2;
        this.field2612 = arg1;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Ldia;IIZ[[I)V")
    public class196(class246 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field2623 = arg2;
        super.field81.method1653((byte) 110, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field67, arg2, arg2, 0, 32993, super.field81.field3596, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class774.method4295(var7 + 34069, arg4[var7], arg2, arg2, 32993, super.field81.field3596, 5056, super.field67);
            }
        }
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)V")
    public static final void method1348(boolean arg0) {
        if (~class262.field3897 >= -2) {
            class712.field9959.method735(2, class712.field9959.field1304, 117);
        } else {
            class712.field9959.method735(4, class712.field9959.field1304, 87);
        }
        if (arg0) {
            method1345(8, -87);
        }
        ++field2618;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Ldia;IIZ[[BI)V")
    public class196(class246 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field2623 = arg2;
        super.field81.method1653((byte) 123, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field67, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method52(false, true);
    }
}
