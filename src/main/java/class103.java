import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class103 extends class120 implements class143 {

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "S")
    private short field1312;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "B")
    private byte field1299;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Z")
    private boolean field1311;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "B")
    private byte field1314;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Z")
    private boolean field1300;

    @OriginalMember(owner = "client!kk", name = "db", descriptor = "Z")
    private boolean field1329;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "B")
    private byte field1306;

    @OriginalMember(owner = "client!kk", name = "hb", descriptor = "Z")
    private boolean field1333;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Lni;")
    public class305 field1313;

    @OriginalMember(owner = "client!kk", name = "eb", descriptor = "Lo;")
    private class21 field1330;

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "Z")
    public static boolean field1326 = true;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "Lpm;")
    public static class349 field1325 = new class349("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!kk", name = "gb", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!kk", name = "fb", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "Lvj;")
    public static class256 field1302;

    @OriginalMember(owner = "client!kk", name = "ib", descriptor = "Z")
    public static boolean field1334;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        int var5 = 0 % ((19 - arg3) / 45);
        ++field1320;
        class305 var6 = this.method598(65536, arg0, (byte) 126);
        if (var6 != null) {
            class154 var7 = arg0.method884();
            var7.method1133(super.field1619, super.field1621, super.field1629);
            return var6.method209(arg1, arg2, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V")
    public static void method597(boolean arg0) {
        if (!arg0) {
            method606(-94);
        }
        field1325 = null;
        field1302 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILvq;B)Lni;")
    private final class305 method598(int arg0, class269 arg1, byte arg2) {
        ++field1316;
        if (this.field1313 != null && ~arg1.method944(this.field1313.method247(), arg0) == -1) {
            return this.field1313;
        } else if (arg2 <= 120) {
            return null;
        } else {
            class266 var4 = this.method607(false, arg1, arg0, (byte) 126);
            return var4 == null ? null : var4.field3906;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I")
    public final int method599(int arg0) {
        ++field1310;
        return arg0 != -10450 ? 69 : 65535 & this.field1312;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 <= -62) {
            ++field1304;
            if (this.field1313 != null) {
                this.field1313.method204();
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method601(String arg0, boolean arg1) {
        ++field1322;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class134.method1029(arg0, (byte) 73);
            if (!arg1) {
                method601((String) null, true);
            }
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class417.field5994; ++var3) {
                    String var4 = class137.field2109[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class134.method1029(var4, (byte) 118);
                    if (var5 != null && var5.equals(var2)) {
                        --class417.field5994;
                        for (int var6 = var3; var6 < class417.field5994; ++var6) {
                            class137.field2109[var6] = class137.field2109[var6 - -1];
                            class289.field4207[var6] = class289.field4207[var6 - -1];
                            class434.field6200[var6] = class434.field6200[var6 + 1];
                            class266.field3905[var6] = class266.field3905[var6 - -1];
                            class398.field5595[var6] = class398.field5595[var6 + 1];
                        }
                        class444.field6344 = class428.field6095;
                        ++class314.field4621;
                        class407.field5761.method2048(2040, 54);
                        class407.field5761.method831(class276.method1873(true, arg0), (byte) 116);
                        class407.field5761.method807((byte) 124, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)I")
    public final int method602(byte arg0) {
        ++field1318;
        if (arg0 >= -33) {
            this.method602((byte) -105);
        }
        return this.field1314;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)I")
    public final int method603(byte arg0) {
        ++field1307;
        if (arg0 != -62) {
            this.field1300 = true;
        }
        return this.field1306;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvq;I)V")
    public final void method604(class269 arg0, int arg1) {
        int var3 = 29 % ((87 - arg1) / 34);
        ++field1303;
        Object var4 = null;
        class21 var6;
        if (this.field1330 == null && this.field1333) {
            class266 var5 = this.method607(true, arg0, 131072, (byte) 121);
            var6 = var5 != null ? var5.field3904 : null;
        } else {
            var6 = this.field1330;
            this.field1330 = null;
        }
        if (var6 != null) {
            class428.method2669(var6, this.field1299, super.field1619, super.field1629, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        ++field1315;
        if (arg1 < 11) {
            this.field1312 = 121;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILvq;)V")
    public final void method605(int arg0, class269 arg1) {
        ++field1323;
        Object var3 = null;
        class21 var5;
        if (this.field1330 == null && this.field1333) {
            class266 var4 = this.method607(true, arg1, 131072, (byte) 95);
            var5 = var4 != null ? var4.field3904 : null;
        } else {
            var5 = this.field1330;
            this.field1330 = null;
        }
        if (arg0 == 29929) {
            if (var5 != null) {
                class129.method793(var5, this.field1299, super.field1619, super.field1629, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public static final void method606(int arg0) {
        ++field1321;
        class240.method1637(-79);
        class139.method1057(120);
        class106.method619(1);
        class242.method1648(arg0 + -45);
        class423.method2651((byte) 108);
        class79.method468(52);
        class53.method343(0);
        class183.method1314(arg0 + 2);
        class199.method1410(0);
        class329.method2165((byte) 115);
        class5.method19(1203489091);
        class70.method431(0);
        class40.method258(true);
        class323.method2139(17);
        class361.method2347(27343);
        class429.method2675(arg0 + 8);
        class249.method1733((byte) 62);
        class242.method1651((byte) 97);
        class130.method841(22586);
        class386.method2448(arg0 + 108);
        class365.method2360(true);
        class226.method1582(4437);
        class415.method2616((byte) -28);
        class105.field1347.method98(~arg0);
        class353.field5120.method98(arg0 ^ arg0);
        class357.field5163.method98(0);
        class199.field2840.method98(0);
        class424.field6065.method98(0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLvq;IB)Lsl;")
    private final class266 method607(boolean arg0, class269 arg1, int arg2, byte arg3) {
        if (arg3 < 28) {
            return null;
        } else {
            ++field1305;
            class282 var5 = class398.method2496(-118, this.field1312 & 65535);
            class92 var6;
            class92 var7;
            if (this.field1300) {
                var6 = class241.field3567[this.field1299];
                var7 = class126.field1734[0];
            } else {
                if (this.field1299 < 3) {
                    var7 = class126.field1734[this.field1299 - -1];
                } else {
                    var7 = null;
                }
                var6 = class126.field1734[this.field1299];
            }
            return var5.method1936(-14268, arg2, super.field1629, var6, this.field1306, this.field1314, super.field1619, arg1, arg0, var7, super.field1621);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z")
    public final boolean method608(boolean arg0) {
        if (arg0) {
            this.method604((class269) null, 76);
        }
        ++field1319;
        return this.field1333;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lvq;Lbi;IIIIZIIZ)V")
    public class103(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class287.method1962((byte) -121, arg8, arg7));
        super.field1629 = (short) arg5;
        this.field1312 = (short) arg1.field4094;
        super.field1619 = (short) arg3;
        this.field1299 = (byte) arg2;
        this.field1311 = arg9;
        this.field1314 = (byte) arg7;
        this.field1300 = arg6;
        this.field1329 = arg1.field4036 != 0 && !arg6;
        this.field1306 = (byte) arg8;
        this.field1333 = arg0.method891() && arg1.field4107 && !this.field1300 && class194.field2802 != 0;
        int var11 = 1024;
        if (this.field1311) {
            var11 |= 32768;
        }
        class266 var12 = this.method607(this.field1333, arg0, var11, (byte) 106);
        if (var12 != null) {
            this.field1313 = var12.field3906;
            this.field1330 = var12.field3904;
            if (this.field1311) {
                this.field1313 = this.field1313.method200((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field1324;
        if (this.field1313 == null) {
            return null;
        } else {
            class154 var3 = arg1.method884();
            int var4 = 48 / ((arg0 - -8) / 51);
            var3.method1133(super.field1619, super.field1621, super.field1629);
            class316 var5 = null;
            if (this.field1329) {
                var5 = class105.method616(-15465, 1);
            }
            this.field1313.method230(var3, var5 != null ? var5.field4631[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Z")
    public static final boolean method609(int arg0, int arg1) {
        ++field1317;
        if (class189.field2713[arg0]) {
            return true;
        } else if (!class438.field6255.method638(arg0, (byte) -46)) {
            return false;
        } else {
            int var2 = class438.field6255.method651(0, arg0);
            if (~var2 == -1) {
                class189.field2713[arg0] = true;
                return true;
            } else {
                if (class186.field2657[arg0] == null) {
                    class186.field2657[arg0] = new class223[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class186.field2657[arg0][var3] == null) {
                        byte[] var4 = class438.field6255.method643(arg0, var3, true);
                        if (var4 != null) {
                            class223 var5 = class186.field2657[arg0][var3] = new class223();
                            var5.field3227 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method1564(new class130(var4), 0);
                        }
                    }
                }
                if (arg1 != 1) {
                    method601((String) null, true);
                }
                class189.field2713[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        ++field1309;
        if (arg0 != -439) {
            this.method599(9);
        }
        return this.field1311;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = -41 % ((arg5 - 12) / 40);
        ++field1327;
        if (!(arg2 instanceof class103)) {
            if (arg2 instanceof class332) {
                class332 var9 = (class332) arg2;
                if (this.field1313 != null && var9.field4813 != null) {
                    this.field1313.method232(var9.field4813, arg4, arg6, arg3, arg1);
                    return;
                }
            }
        } else {
            class103 var10 = (class103) arg2;
            if (this.field1313 == null || var10.field1313 == null) {
                return;
            }
            this.field1313.method232(var10.field1313, arg4, arg6, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V")
    public static final void method612(boolean arg0) {
        ++field1308;
        for (int var1 = -1; class334.field4847 > var1; ++var1) {
            int var5;
            if (var1 != -1) {
                var5 = class26.field323[var1];
            } else {
                var5 = 2047;
            }
            class128 var6 = class243.field3596[var5];
            if (var6 != null && var6.field4531 > 0) {
                --var6.field4531;
                if (~var6.field4531 == -1) {
                    var6.field4507 = null;
                }
            }
        }
        int var2 = 0;
        if (arg0) {
            while (var2 < class229.field3396) {
                int var3 = class431.field6169[var2];
                class446 var4 = class442.field6317[var3];
                if (var4 != null && var4.field4531 > 0) {
                    --var4.field4531;
                    if (~var4.field4531 == -1) {
                        var4.field4507 = null;
                    }
                }
                ++var2;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        if (arg0 >= -56) {
            this.method608(true);
        }
        this.field1311 = false;
        ++field1328;
        if (this.field1313 != null) {
            this.field1313.method233(-32769 & this.field1313.method247());
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILvq;)Lni;")
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        ++field1301;
        if (arg0 >= -19) {
            this.method605(61, (class269) null);
        }
        return this.method598(arg1, arg2, (byte) 125);
    }
}
