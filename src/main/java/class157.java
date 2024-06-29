import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class157 extends class311 {

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Z")
    public boolean field2236 = false;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public int field2229 = -1;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2233++;
        class26 var5 = class217.method1445(true, arg2, 8);
        var5.method158(28194);
        var5.field339 = arg3;
        var5.field341 = arg4;
        var5.field336 = arg1;
        int var6 = 51 / ((arg0 + 50) / 59);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)Lvg;", line = 25)
    public static final class108 method1139(int arg0, boolean arg1) {
        field2235++;
        int var2 = arg0 >> 16;
        if (arg1) {
            method1140(-50, (class423) null);
        }
        int var3 = arg0 & 0xFFFF;
        if (class103.field1425[var2] == null || class103.field1425[var2][var3] == null) {
            boolean var4 = class387.method2400(var2, 176);
            if (!var4) {
                return null;
            }
        }
        return class103.field1425[var2][var3];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILof;)V", line = 57)
    public static final void method1140(int arg0, class423 arg1) {
        field2238++;
        if (class149.field2171 >= 400 || class359.field4970 == arg1) {
            return;
        }
        String var2;
        if (arg1.field5856 == 0) {
            boolean var3 = true;
            if (class359.field4970.field5873 != -1 && arg1.field5873 != -1) {
                int var4 = arg1.field5878 >= class359.field4970.field5878 ? arg1.field5878 : class359.field4970.field5878;
                int var5 = arg1.field5873 <= class359.field4970.field5873 ? arg1.field5873 : class359.field4970.field5873;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class359.field4970.field5878 - arg1.field5878;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class133.field1986 == 1 ? class35.field477.method2313((byte) -111, class445.field6241) : class149.field2160.method2313((byte) -116, class445.field6241);
            if (arg1.field5878 >= arg1.field5853) {
                var2 = arg1.method2612(true, (byte) 97) + (var3 ? class134.method997(class359.field4970.field5878, (byte) 115, arg1.field5878) : "<col=ffffff>") + " (" + var8 + arg1.field5878 + ")";
            } else {
                var2 = arg1.method2612(true, (byte) 96) + (var3 ? class134.method997(class359.field4970.field5878, (byte) 115, arg1.field5878) : "<col=ffffff>") + " (" + var8 + arg1.field5878 + "+" + (arg1.field5853 - arg1.field5878) + ")";
            }
        } else {
            var2 = arg1.method2612(true, (byte) 111) + " (" + class71.field986.method2313((byte) -111, class445.field6241) + arg1.field5856 + ")";
        }
        if (!class213.field2980) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class51.field659[var9] != null) {
                    short var11 = 0;
                    if (class133.field1986 == 0 && class51.field659[var9].equalsIgnoreCase(class109.field1690.method2313((byte) -76, class445.field6241))) {
                        if (arg1.field5878 > class359.field4970.field5878) {
                            var11 = 2000;
                        }
                        if (class359.field4970.field5888 != 0 && arg1.field5888 != 0) {
                            if (class359.field4970.field5888 == arg1.field5888) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (class304.field4148[var9]) {
                        var11 = 2000;
                    }
                    short var12 = (short) (class132.field1983[var9] + var11);
                    int var13 = class46.field591[var9] == -1 ? class274.field3749 : class46.field591[var9];
                    class345.field4665++;
                    class46.method379(class51.field659[var9], var12, 0, true, (long) arg1.field2622, 0, var13, "<col=ffffff>" + var2);
                }
            }
        } else if ((class277.field3780 & 0x8) != 0) {
            class211.field2955++;
            class46.method379(class302.field4121, 17, 0, true, (long) arg1.field2622, 0, class438.field6183, class119.field1816 + " -> <col=ffffff>" + var2);
        }
        for (class429 var10 = (class429) class451.field6491.method1173(0); var10 != null; var10 = (class429) class451.field6491.method1165(true)) {
            if (var10.field5977 == 13) {
                var10.field5972 = "<col=ffffff>" + var2;
                break;
            }
        }
        if (arg0 != 11532) {
            method1139(-58, true);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)I", line = 184)
    public static final int method1141(int arg0, int arg1, int arg2, int arg3) {
        field2230++;
        if (arg2 != -1) {
            method1139(-95, false);
        }
        if (arg0 == arg3) {
            return arg0;
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0x7F) * var4 + (arg3 & 0x7F) * arg1 >> 7;
        int var6 = (arg0 & 0x380) * var4 + ((arg3 & 0x380) * arg1) >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg1 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IILof;[I[I)V", line = 209)
    public static final void method1142(int[] arg0, int arg1, class423 arg2, int[] arg3, int[] arg4) {
        field2237++;
        if (arg1 != -9535) {
            method1141(-114, -43, 108, -40);
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field2588.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field2588[var9] = null;
                    } else {
                        class83 var10 = class408.method2521((byte) 37, var6);
                        int var11 = var10.field1166;
                        class134 var12 = arg2.field2588[var9];
                        if (var12 != null) {
                            if (var12.field1998 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field2588[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2002 = 0;
                                    var12.field2001 = 0;
                                    var12.field1996 = 1;
                                    var12.field2006 = var8;
                                    var12.field1995 = 0;
                                    class431.method2657(var10, -63, arg2.field40, class359.field4970 == arg2, 0, arg2.field44);
                                } else if (var11 == 2) {
                                    var12.field2001 = 0;
                                }
                            } else if (var10.field1163 >= class408.method2521((byte) -111, var12.field1998).field1163) {
                                var12 = arg2.field2588[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class134 var13 = arg2.field2588[var9] = new class134();
                            var13.field2006 = var8;
                            var13.field1995 = 0;
                            var13.field1996 = 1;
                            var13.field2001 = 0;
                            var13.field2002 = 0;
                            var13.field1998 = var6;
                            class431.method2657(var10, -63, arg2.field40, class359.field4970 == arg2, 0, arg2.field44);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V", line = 308)
    public class157(int arg0) {
        this.field2229 = arg0;
    }
}
