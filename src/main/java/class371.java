import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class371 extends class316 {

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public int field5113;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public int field5105;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public int field5104;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public int field5115;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public int field5110;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field5101 = 0;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "[Z")
    public static boolean[] field5111 = new boolean[8];

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Lno;")
    public static class238 field5108;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ip", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field5117;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)V")
    public final void method75(byte arg0) {
        field5109++;
        if (arg0 != 111) {
            method2268();
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
    public static void method2265(int arg0) {
        field5111 = null;
        field5108 = null;
        if (arg0 != 0) {
            method2265(35);
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        field5103++;
        int var2 = 54 / ((2 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIII)V")
    public static final void method2266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5107++;
        int var6 = arg2 - arg0;
        int var7 = arg5 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class432.method2617(arg4, arg0, 128, arg5, arg1);
            }
        } else if (var7 == 0) {
            class114.method903(arg2, -79, arg4, arg1, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class295.field4153 > arg0) {
                var10 = class295.field4153;
                var11 = (class295.field4153 * var8 >> 12) + var9;
            } else if (class103.field1457 >= arg0) {
                var10 = arg0;
                var11 = arg1;
            } else {
                var10 = class103.field1457;
                var11 = (class103.field1457 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg2 < class295.field4153) {
                var12 = (class295.field4153 * var8 >> 12) + var9;
                var13 = class295.field4153;
            } else if (arg2 <= class103.field1457) {
                var13 = arg2;
                var12 = arg5;
            } else {
                var13 = class103.field1457;
                var12 = (class103.field1457 * var8 >> 12) + var9;
            }
            if (class444.field6338 > var11) {
                var11 = class444.field6338;
                var10 = (class444.field6338 - var9 << 12) / var8;
            } else if (class151.field2091 < var11) {
                var11 = class151.field2091;
                var10 = (class151.field2091 - var9 << 12) / var8;
            }
            if (var12 < class444.field6338) {
                var12 = class444.field6338;
                var13 = (class444.field6338 - var9 << 12) / var8;
            } else if (var12 > class151.field2091) {
                var12 = class151.field2091;
                var13 = (class151.field2091 - var9 << 12) / var8;
            }
            class393.method2380(var11, var12, arg4, var10, 0, var13);
            if (arg3 != -17232) {
                method2265(-87);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)I")
    public abstract int method803(int arg0);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILvc;IILuq;I)V")
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        field5114++;
        if (arg1 < 40) {
            this.field5110 = 125;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIIILvc;)V")
    public static final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class89 arg8) {
        field5116++;
        class210 var9 = (class210) class133.method991(arg0, arg2, arg3);
        if (var9 != null) {
            class267 var10 = class468.field6599.method506(arg5 ^ 0x7445, var9.method80(10143));
            int var11 = var9.method71((byte) 96) & 0x3;
            int var12 = var9.method83((byte) 103);
            if (var10.field3865 == -1) {
                int var13 = arg6;
                if (var10.field3902 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method748(4, (byte) -57, var13, arg1, arg7);
                    } else if (var11 == 1) {
                        arg8.method743(4, arg1, (byte) -127, arg7, var13);
                    } else if (var11 == 2) {
                        arg8.method748(4, (byte) -57, var13, arg1, arg7 + 3);
                    } else if (var11 == 3) {
                        arg8.method743(4, arg1 + 3, (byte) -127, arg7, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method742(11, arg1, 1, 1, var13, arg7);
                    } else if (var11 == 1) {
                        arg8.method742(11, arg1, 1, 1, var13, arg7 + 3);
                    } else if (var11 == 2) {
                        arg8.method742(11, arg1 + 3, 1, 1, var13, arg7 + 3);
                    } else if (var11 == 3) {
                        arg8.method742(11, arg1 + 3, 1, 1, var13, arg7);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method743(4, arg1, (byte) -127, arg7, var13);
                    } else if (var11 == 1) {
                        arg8.method748(4, (byte) -57, var13, arg1, arg7 + 3);
                    } else if (var11 == 2) {
                        arg8.method743(4, arg1 + 3, (byte) -127, arg7, var13);
                    } else if (var11 == 3) {
                        arg8.method748(4, (byte) -57, var13, arg1, arg7);
                    }
                }
            } else {
                class200.method1397(var11, arg1, var10, arg7, arg8, (byte) 33);
            }
        }
        if (arg5 != -29747) {
            method2268();
        }
        class210 var14 = (class210) class106.method847(arg0, arg2, arg3, field5117 == null ? (field5117 = method2269("dc")) : field5117);
        if (var14 != null) {
            class267 var15 = class468.field6599.method506(-124, var14.method80(arg5 ^ -21422));
            int var16 = var14.method71((byte) 95) & 0x3;
            int var17 = var14.method83((byte) 108);
            if (var15.field3865 != -1) {
                class200.method1397(var16, arg1, var15, arg7, arg8, (byte) 33);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3902 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method747(1, arg1 + 3, arg1, var18, arg7, arg7 + 3);
                } else {
                    arg8.method747(1, arg1, arg1 + 3, var18, arg7, arg7 + 3);
                }
            }
        }
        class210 var19 = (class210) class86.method730(arg0, arg2, arg3);
        if (var19 == null) {
            return;
        }
        class267 var20 = class468.field6599.method506(-124, var19.method80(arg5 ^ -21422));
        int var21 = var19.method71((byte) 118) & 0x3;
        if (var20.field3865 != -1) {
            class200.method1397(var21, arg1, var20, arg7, arg8, (byte) 33);
            return;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
    public static final void method2268() {
        if (class36.field393 != null) {
            for (int var0 = 0; var0 < class36.field393.length; var0++) {
                for (int var1 = 0; var1 < class310.field4401; var1++) {
                    for (int var2 = 0; var2 < class97.field1374; var2++) {
                        if (class36.field393[var0][var1][var2] != null) {
                            class36.field393[var0][var1][var2].method495(112);
                        }
                        class36.field393[var0][var1][var2] = null;
                    }
                }
            }
        }
        class36.field393 = null;
        class190.field2858 = null;
        if (class267.field3862 != null) {
            for (int var3 = 0; var3 < class267.field3862.length; var3++) {
                for (int var4 = 0; var4 < class310.field4401; var4++) {
                    for (int var5 = 0; var5 < class97.field1374; var5++) {
                        if (class267.field3862[var3][var4][var5] != null) {
                            class267.field3862[var3][var4][var5].method495(123);
                        }
                        class267.field3862[var3][var4][var5] = null;
                    }
                }
            }
        }
        class267.field3862 = null;
        class427.field5960 = null;
        class385.field5285 = null;
        class340.field4692 = null;
        class198.field2924 = 0;
        if (class153.field2126 != null) {
            for (int var6 = 0; var6 < class198.field2924; var6++) {
                class153.field2126[var6] = null;
            }
        }
        if (class360.field4950 != null) {
            for (int var7 = 0; var7 < class239.field3495; var7++) {
                class360.field4950[var7] = null;
            }
            class239.field3495 = 0;
        }
        if (class357.field4906 != null) {
            for (int var8 = 0; var8 < class237.field3467; var8++) {
                class357.field4906[var8] = null;
            }
            for (int var9 = 0; var9 < class310.field4398; var9++) {
                for (int var10 = 0; var10 < class310.field4401; var10++) {
                    for (int var11 = 0; var11 < class97.field1374; var11++) {
                        class221.field3191[var9][var10][var11] = 0L;
                    }
                }
            }
            class237.field3467 = 0;
        }
        class117.field1629 = null;
        class428.method2560((byte) 38);
        class280.field4024.method1772((byte) 119);
        class332.field4610 = null;
        class486.field6872 = null;
        class218.field3157 = null;
        class291.field4124 = null;
        class379.field5217 = null;
        class340.field4702 = null;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIIIII)V")
    public class371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5102 = arg3;
        this.field5113 = arg0;
        this.field5105 = arg4;
        this.field5104 = arg6;
        this.field5112 = arg2;
        this.field5115 = arg5;
        this.field5110 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2269(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
