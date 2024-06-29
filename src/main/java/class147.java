import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class147 extends class101 {

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[B")
    public byte[] field2213;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "[I")
    public static int[] field2217 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Log;")
    public static class283 field2212;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2211;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 4)
    public static final void method1047(byte arg0) {
        class61.field821++;
        field2220++;
        if (arg0 > -33) {
            field2215 = 38;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 15)
    public static final void method1048(boolean arg0) {
        field2221++;
        class230.field3476 = 0;
        class287.field4332 = 0;
        if (arg0) {
            method1050(-57, (byte) -48, -52, -103, -116, 64, -69, 72);
        }
        class211.method1467(127);
        class194.method1339(true);
        class103.method728((byte) 75);
        class157.method1118(0);
        for (int var1 = 0; var1 < class287.field4332; var1++) {
            int var2 = class88.field1311[var1];
            if (class304.field4641 != class241.field3592[var2].field1498) {
                if (class241.field3592[var2].field2920 > 0) {
                    class49.method337(class241.field3592[var2], true);
                }
                class241.field3592[var2] = null;
            }
        }
        if (class3.field13 != class207.field3137.field4025) {
            throw new RuntimeException("gpp1 pos:" + class207.field3137.field4025 + " psize:" + class3.field13);
        }
        for (int var3 = 0; var3 < class56.field706; var3++) {
            if (class241.field3592[class20.field239[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class56.field706);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 77)
    public static final void method1049(String arg0, byte arg1, boolean arg2) {
        field2219++;
        if (arg1 > -127) {
            return;
        }
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg2 ? 32768 : 0;
        int var6 = 0;
        int var7 = var5 + (arg2 ? class51.field640 : class130.field2020);
        for (int var8 = var5; var8 < var7; var8++) {
            class11 var9 = class202.method1384(var8, (byte) 118);
            if (var9.field121 && var9.method61(false).toLowerCase().indexOf(var3) != -1) {
                if (var6 >= 50) {
                    class257.field3898 = null;
                    class266.field4097 = -1;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var6; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var6++] = (short) var8;
            }
        }
        class257.field3898 = var4;
        class306.field4658 = 0;
        class266.field4097 = var6;
        String[] var12 = new String[class266.field4097];
        for (int var13 = 0; var13 < class266.field4097; var13++) {
            var12[var13] = class202.method1384(var4[var13], (byte) 118).method61(false);
        }
        class110.method771(var12, 125, class257.field3898);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V", line = 150)
    public class147(byte[] arg0) {
        this.field2213 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIII)V", line = 163)
    public static final void method1050(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2216++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg2 - arg5;
        int var12 = arg4 - arg5;
        int var13 = arg2 * arg2;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var12 << 1;
        int var22 = arg4 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = var14 - ((var22 - 1) * var18);
        int var25 = (1 - var21) * var15 + var19;
        int var26 = var16 - ((var21 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var16 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var22 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = var29;
        int var36 = (arg4 - 1) * var27;
        int var37 = var28;
        int[] var38 = class40.field488[arg0];
        class315.method2160(var38, arg6, arg7 - var11, -arg2 + arg7, 7);
        if (arg1 != -59) {
            method1050(-127, (byte) -55, -10, 19, 21, 45, -45, 54);
        }
        class315.method2160(var38, arg3, arg7 + var11, arg7 - var11, 7);
        class315.method2160(var38, arg6, arg2 + arg7, arg7 + var11, 7);
        int var39 = (var12 - 1) * var30;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var24 += var35;
                    var35 += var29;
                    var23 += var31;
                    var31 += var29;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var29;
                var35 += var29;
            }
            var23 += -var36;
            boolean var40 = var12 >= var9;
            var9--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var25 += var33;
                        var33 += var28;
                        var26 += var37;
                        var37 += var28;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var33 += var28;
                    var26 += var37;
                    var37 += var28;
                    var10++;
                }
                var25 += -var39;
                var39 -= var30;
                var26 += -var34;
                var34 -= var30;
            }
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 - var10;
                int var46 = arg7 + var10;
                class315.method2160(class40.field488[var41], arg6, var45, var44, 7);
                class315.method2160(class40.field488[var41], arg3, var46, var45, 7);
                class315.method2160(class40.field488[var41], arg6, var43, var46, arg1 + 66);
                class315.method2160(class40.field488[var42], arg6, var45, var44, arg1 + 66);
                class315.method2160(class40.field488[var42], arg3, var46, var45, 7);
                class315.method2160(class40.field488[var42], arg6, var43, var46, 7);
            } else {
                class315.method2160(class40.field488[var41], arg6, var43, var44, 7);
                class315.method2160(class40.field488[var42], arg6, var43, var44, 7);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 333)
    public static void method1051(int arg0) {
        field2217 = null;
        field2211 = null;
        if (arg0 != 0) {
            field2210 = -109;
        }
        field2212 = null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 354)
    public static final void method1052(int arg0) {
        field2218++;
        if (class234.field3515 == 0) {
            return;
        }
        try {
            if (++class126.field1975 > 2000) {
                if (class168.field2517 != null) {
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                }
                if (class138.field2095 >= 1) {
                    class234.field3515 = 0;
                    class56.field709 = -5;
                    return;
                }
                class138.field2095++;
                class126.field1975 = 0;
                if (class302.field4614 == class207.field3130) {
                    class302.field4614 = class41.field498;
                } else {
                    class302.field4614 = class207.field3130;
                }
                class234.field3515 = 1;
            }
            if (class234.field3515 == 1) {
                class224.field3411 = class274.field4200.method1777(class283.field4286, 0, class302.field4614);
                class234.field3515 = 2;
            }
            if (class234.field3515 == 2) {
                if (class224.field3411.field3456 == 2) {
                    throw new IOException();
                }
                if (class224.field3411.field3456 != 1) {
                    return;
                }
                class168.field2517 = new class161((Socket) class224.field3411.field3452, class274.field4200);
                class224.field3411 = null;
                class168.field2517.method1134(class234.field3507.field3986, true, class234.field3507.field4025, 0);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -94);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -97);
                }
                int var1 = class168.field2517.method1141(65280);
                if (class225.field3426 != null) {
                    class225.field3426.method1241((byte) -105);
                }
                if (class17.field211 != null) {
                    class17.field211.method1241((byte) -97);
                }
                if (var1 != 21) {
                    class234.field3515 = 0;
                    class56.field709 = var1;
                    class168.field2517.method1138(-16726864);
                    class168.field2517 = null;
                    return;
                }
                class234.field3515 = 3;
            }
            if (class234.field3515 == 3) {
                if (class168.field2517.method1137(-2266) < 1) {
                    return;
                }
                class249.field3708 = new String[class168.field2517.method1141(65280)];
                class234.field3515 = 4;
            }
            if (class234.field3515 == 4) {
                if (class168.field2517.method1137(-2266) < (class249.field3708.length * 8)) {
                    return;
                }
                class207.field3137.field4025 = 0;
                class168.field2517.method1142(class249.field3708.length * 8, true, class207.field3137.field3986, 0);
                for (int var2 = 0; var2 < class249.field3708.length; var2++) {
                    class249.field3708[var2] = class177.method1224(0, class207.field3137.method1797(-1023818720));
                }
                class56.field709 = 21;
                class234.field3515 = 0;
                class168.field2517.method1138(-16726864);
                class168.field2517 = null;
                return;
            }
        } catch (IOException var4) {
            if (class168.field2517 != null) {
                class168.field2517.method1138(-16726864);
                class168.field2517 = null;
            }
            if (class138.field2095 < 1) {
                class234.field3515 = 1;
                if (class302.field4614 == class207.field3130) {
                    class302.field4614 = class41.field498;
                } else {
                    class302.field4614 = class207.field3130;
                }
                class126.field1975 = 0;
                class138.field2095++;
            } else {
                class56.field709 = -4;
                class234.field3515 = 0;
            }
        }
        if (arg0 >= -99) {
            field2210 = 70;
        }
    }
}
