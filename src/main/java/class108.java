import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class108 {

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public int field1572 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field1565 = -1;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    public boolean field1574 = true;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public int field1571 = -1;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljk;")
    public static class81 field1568 = new class81();

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lol;")
    public static class220 field1576 = new class220();

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Ljf;")
    public static class216 field1577 = new class216(64);

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "S")
    public static short field1579 = 205;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1578 = "red:";

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lu;IB)V")
    public static final void method720(class243 arg0, int arg1, byte arg2) {
        field1569++;
        if (arg0.field3888 > class311.field4996) {
            class81.method549(arg0, (byte) 27);
        } else if (class311.field4996 <= arg0.field3975) {
            class15.method90(arg0, -120);
        } else {
            class62.method399(arg0, 0);
        }
        if (arg0.field3915 < 128 || arg0.field3920 < 128 || arg0.field3915 >= 13184 || arg0.field3920 >= 13184) {
            arg0.field3975 = 0;
            arg0.field3904 = -1;
            arg0.field3888 = 0;
            arg0.field3987 = -1;
            arg0.field3915 = arg0.field3970[0] * 128 + (arg0.method8((byte) -109) * 64);
            arg0.field3920 = arg0.field3972[0] * 128 + arg0.method8((byte) -74) * 64;
            arg0.method1721(16711680);
        }
        if (arg2 != -49) {
            field1578 = null;
        }
        if (class214.field3347 == arg0 && (arg0.field3915 < 1536 || arg0.field3920 < 1536 || arg0.field3915 >= 11776 || arg0.field3920 >= 11776)) {
            arg0.field3987 = -1;
            arg0.field3975 = 0;
            arg0.field3904 = -1;
            arg0.field3888 = 0;
            arg0.field3915 = arg0.field3970[0] * 128 + (arg0.method8((byte) -109) * 64);
            arg0.field3920 = arg0.field3972[0] * 128 + arg0.method8((byte) -41) * 64;
            arg0.method1721(arg2 ^ 0xFF00FFCF);
        }
        class198.method1379(-64, arg0);
        class144.method944(true, arg0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lim;BI)V")
    public final void method721(class170 arg0, byte arg1, int arg2) {
        field1567++;
        while (true) {
            int var4 = arg0.method1218(arg1 ^ 0xFFFFFFC6);
            if (var4 == 0) {
                if (arg1 == -77) {
                    return;
                } else {
                    field1576 = null;
                    return;
                }
            }
            this.method727(arg2, var4, arg0, -15);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIIIII)V")
    public static final void method722(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class113 var6 = class184.field2892[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class273 var7 = var6.field1645;
        if (var7 != null) {
            int var8 = var7.field4444;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class54 var10 = var6.field1657;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field783;
        int var12 = var10.field789;
        int var13 = var10.field779;
        int var14 = var10.field781;
        int[] var15 = class69.field1025[var11];
        int[] var16 = class283.field4596[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static final void method723(int arg0) {
        field1577.method1510(10283);
        class295.field4722.method1510(10283);
        class205.field3204.method1510(10283);
        if (arg0 == 64) {
            field1573++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1578 = null;
        if (arg0 != -4) {
            method724(123);
        }
        field1568 = null;
        field1577 = null;
        field1576 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)I")
    public static final int method725(int arg0, byte arg1) {
        field1570++;
        int var2 = -116 % ((arg1 - 21) / 52);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public static final void method726(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1566++;
        for (class251 var5 = (class251) class241.field3882.method1548(0); var5 != null; var5 = (class251) class241.field3882.method1549(101)) {
            class312.method2096(arg1, arg3, arg4, false, var5, arg2);
        }
        for (class251 var6 = (class251) class206.field3234.method1548(0); var6 != null; var6 = (class251) class206.field3234.method1549(-41)) {
            class163 var11 = var6.field4113.method1725(-121);
            byte var12 = 1;
            if (var6.field4113.field3946 == var11.field2517) {
                var12 = 0;
            } else if (var6.field4113.field3946 == var11.field2511 || var6.field4113.field3946 == var11.field2501 || var6.field4113.field3946 == var11.field2527 || var6.field4113.field3946 == var11.field2509) {
                var12 = 2;
            } else if (var6.field4113.field3946 == var11.field2523 || var6.field4113.field3946 == var11.field2518 || var6.field4113.field3946 == var11.field2520 || var6.field4113.field3946 == var11.field2525) {
                var12 = 3;
            }
            if (var6.field4107 != var12) {
                int var13 = class222.method1574(var6.field4113, -11);
                if (var6.field4110 != var13) {
                    if (var6.field4099 != null) {
                        class81.field1231.method1931(var6.field4099);
                        var6.field4099 = null;
                    }
                    var6.field4110 = var13;
                }
                var6.field4107 = var12;
            }
            var6.field4105 = var6.field4113.field3915;
            var6.field4103 = var6.field4113.field3915 + var6.field4113.method8((byte) -57) * 64;
            var6.field4116 = var6.field4113.field3920;
            var6.field4121 = var6.field4113.field3920 + var6.field4113.method8((byte) -41) * 64;
            class312.method2096(arg1, arg3, arg4, false, var6, arg2);
        }
        if (arg0 > -17) {
            field1568 = null;
        }
        for (class251 var7 = (class251) class13.field190.method1065((byte) -59); var7 != null; var7 = (class251) class13.field190.method1066(-125)) {
            class163 var8 = var7.field4115.method1725(-128);
            byte var9 = 1;
            if (var7.field4115.field3946 == var8.field2517) {
                var9 = 0;
            } else if (var7.field4115.field3946 == var8.field2511 || var7.field4115.field3946 == var8.field2501 || var7.field4115.field3946 == var8.field2527 || var7.field4115.field3946 == var8.field2509) {
                var9 = 2;
            } else if (var7.field4115.field3946 == var8.field2523 || var7.field4115.field3946 == var8.field2518 || var7.field4115.field3946 == var8.field2520 || var7.field4115.field3946 == var8.field2525) {
                var9 = 3;
            }
            if (var7.field4107 != var9) {
                int var10 = class59.method382(32, var7.field4115);
                if (var7.field4110 != var10) {
                    if (var7.field4099 != null) {
                        class81.field1231.method1931(var7.field4099);
                        var7.field4099 = null;
                    }
                    var7.field4110 = var10;
                }
                var7.field4107 = var9;
            }
            var7.field4105 = var7.field4115.field3915;
            var7.field4103 = var7.field4115.field3915 + var7.field4115.method8((byte) -99) * 64;
            var7.field4116 = var7.field4115.field3920;
            var7.field4121 = var7.field4115.field3920 + (var7.field4115.method8((byte) -65) * 64);
            class312.method2096(arg1, arg3, arg4, false, var7, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILim;I)V")
    private final void method727(int arg0, int arg1, class170 arg2, int arg3) {
        field1575++;
        if (arg1 == 1) {
            this.field1572 = class105.method699(arg2.method1212(arg3 ^ 0xE489B6A1), 0);
        } else if (arg1 == 2) {
            this.field1565 = arg2.method1218(arg3 ^ 0xFFFFFF83);
        } else if (arg1 == 3) {
            this.field1565 = arg2.method1186((byte) -110);
            if (this.field1565 == 65535) {
                this.field1565 = -1;
            }
        } else if (arg1 == 5) {
            this.field1574 = false;
        } else if (arg1 == 7) {
            this.field1571 = class105.method699(arg2.method1212(460736848), 0);
        } else if (arg1 == 8) {
            class95.field1424 = arg0;
        } else if (arg1 == 9) {
            arg2.method1186((byte) -83);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg2.method1218(106);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg2.method1212(460736848);
                } else if (arg1 == 14) {
                    arg2.method1218(-117);
                }
            }
        }
        if (arg3 != -15) {
            method722((int[]) null, -42, -75, -36, -10, -103);
        }
    }
}
