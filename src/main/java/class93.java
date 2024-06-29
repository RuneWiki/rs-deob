import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class93 extends class55 implements class425 {

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "Z")
    private boolean field1312;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Z")
    private boolean field1326;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "S")
    private short field1328;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "B")
    private byte field1334;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "B")
    private byte field1311;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "B")
    private byte field1322;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "Z")
    private boolean field1319;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Z")
    private boolean field1325;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Ldc;")
    public class375 field1332;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Lri;")
    private class98 field1327;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lcr;")
    public static class189 field1329 = new class189(16);

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "[Lrf;")
    public static class442[] field1338 = new class442[14];

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "Z")
    public static boolean field1342 = true;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "Lcr;")
    public static class189 field1340 = new class189(5);

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "Llm;")
    public static class347 field1339;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "[Lcq;")
    public static class67[] field1341;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILii;I)Ldc;")
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        if (arg2 <= 27) {
            return null;
        } else {
            ++field1306;
            return this.method651(arg0, (byte) 66, arg1);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lii;I)V")
    public final void method118(class405 arg0, int arg1) {
        ++field1309;
        if (arg1 != 22295) {
            this.method102((byte) -55, (class405) null);
        }
        Object var3 = null;
        class98 var5;
        if (this.field1327 == null && this.field1325) {
            class386 var4 = this.method650(arg0, true, 131072, (byte) -120);
            var5 = var4 != null ? var4.field5595 : null;
        } else {
            var5 = this.field1327;
            this.field1327 = null;
        }
        if (var5 != null) {
            class142.method903(var5, this.field1334, super.field740, super.field734, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)I")
    public final int method647(int arg0) {
        if (arg0 != 7334) {
            this.method650((class405) null, false, -41, (byte) -73);
        }
        ++field1320;
        return this.field1332 == null ? 15 : this.field1332.method1563() / 4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLii;)V")
    public final void method102(byte arg0, class405 arg1) {
        ++field1321;
        Object var3 = null;
        if (arg0 != 76) {
            this.method102((byte) 25, (class405) null);
        }
        class98 var5;
        if (this.field1327 == null && this.field1325) {
            class386 var4 = this.method650(arg1, true, 131072, (byte) -69);
            var5 = var4 == null ? null : var4.field5595;
        } else {
            var5 = this.field1327;
            this.field1327 = null;
        }
        if (var5 != null) {
            class161.method995(var5, this.field1334, super.field740, super.field734, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        if (arg0 != -15123) {
            this.method651(74, (byte) 88, (class405) null);
        }
        ++field1324;
        return this.field1328 & 65535;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
    public final int method105(int arg0) {
        ++field1308;
        return arg0 > -4 ? 91 : this.field1311;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
    public final int method120(int arg0) {
        ++field1330;
        return arg0 != 25940 ? 96 : this.field1322;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        if (arg2) {
            return false;
        } else {
            ++field1313;
            class375 var5 = this.method651(65536, (byte) 100, arg3);
            if (var5 != null) {
                class177 var6 = arg3.method1735();
                var6.method985(super.field740, super.field729, super.field734);
                return var5.method1594(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
    public static final void method648(byte arg0) {
        ++field1333;
        if (arg0 > 104) {
            class189 var1 = class125.field1762;
            synchronized (class125.field1762) {
                class125.field1762.method1136((byte) -75);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[Lps;B)V")
    public static final void method649(int arg0, class394[] arg1, byte arg2) {
        int var3 = -32 % (arg2 / 61);
        ++field1318;
        for (int var4 = 0; arg1.length > var4; ++var4) {
            class394 var5 = arg1[var4];
            if (var5 != null) {
                if (var5.field5671 == 0) {
                    if (var5.field5820 != null) {
                        method649(arg0, var5.field5820, (byte) 97);
                    }
                    class169 var6 = (class169) class99.field1377.method384((long) var5.field5698, true);
                    if (var6 != null) {
                        class362.method2367(arg0, var6.field2275, 14336);
                    }
                }
                if (arg0 == 0 && var5.field5730 != null) {
                    class192 var7 = new class192();
                    var7.field2566 = var5;
                    var7.field2578 = var5.field5730;
                    class123.method783(var7);
                }
                if (~arg0 == -2 && var5.field5736 != null) {
                    if (var5.field5649 >= 0) {
                        class394 var8 = class196.method1168((byte) -124, var5.field5698);
                        if (var8 == null || var8.field5820 == null || var8.field5820.length <= var5.field5649 || var8.field5820[var5.field5649] != var5) {
                            continue;
                        }
                    }
                    class192 var9 = new class192();
                    var9.field2566 = var5;
                    var9.field2578 = var5.field5736;
                    class123.method783(var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (arg0 < -108) {
            ++field1310;
            if (this.field1332 != null) {
                this.field1332.method1598();
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lii;ZIB)Lcb;")
    private final class386 method650(class405 arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 >= -55) {
            this.method102((byte) 48, (class405) null);
        }
        ++field1335;
        class104 var5 = class329.method2190((byte) 63, 65535 & this.field1328);
        class351 var6;
        class351 var7;
        if (!this.field1326) {
            var6 = class265.field3846[this.field1334];
            if (this.field1334 < 3) {
                var7 = class265.field3846[this.field1334 - -1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class265.field3846[0];
            var6 = class191.field2557[this.field1334];
        }
        return var5.method706(false, var7, super.field734, arg1, super.field740, arg2, ~this.field1311 != -12 ? this.field1311 : 10, ~this.field1311 != -12 ? this.field1322 : this.field1322 + 4, var6, super.field729, arg0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBLii;)Ldc;")
    private final class375 method651(int arg0, byte arg1, class405 arg2) {
        ++field1314;
        if (arg1 <= 64) {
            return null;
        } else if (this.field1332 != null && ~arg2.method1643(this.field1332.method1608(), arg0) == -1) {
            return this.field1332;
        } else {
            class386 var4 = this.method650(arg2, false, arg0, (byte) -100);
            return var4 != null ? var4.field5592 : null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        ++field1337;
        if (arg0 <= 102) {
            this.method169((class405) null, 92, 50, 74, -99, (class126) null, true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lii;Lge;IIIIIZIIIIIIZ)V")
    public class93(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1448 == 1, class163.method1010((byte) 127, arg12, arg13));
        this.field1312 = ~arg1.field1455 != -1 && !arg7;
        this.field1326 = arg7;
        this.field1328 = (short) arg1.field1507;
        this.field1334 = (byte) arg3;
        this.field1311 = (byte) arg12;
        this.field1322 = (byte) arg13;
        this.field1319 = arg14;
        this.field1325 = arg0.method1740() && arg1.field1464 && !this.field1326 && ~class423.field6238 != -1;
        int var16 = 1024;
        if (this.field1319) {
            var16 |= 32768;
        }
        class386 var17 = this.method650(arg0, this.field1325, var16, (byte) -95);
        if (var17 != null) {
            this.field1332 = var17.field5592;
            this.field1327 = var17.field5595;
            if (this.field1319) {
                this.field1332 = this.field1332.method1568((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field1336;
        return arg0 != -17506 ? true : this.field1319;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            this.method102((byte) 16, (class405) null);
        }
        ++field1323;
        return this.field1325;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        this.field1319 = arg0;
        ++field1331;
        if (this.field1332 != null) {
            this.field1332.method1593(this.field1332.method1608() & -32769);
        }
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
    public static void method652(int arg0) {
        field1339 = null;
        field1341 = null;
        field1329 = null;
        if (arg0 != -19935) {
            method652(-18);
        }
        field1340 = null;
        field1338 = null;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)I")
    public final int method174(int arg0) {
        if (arg0 != 2) {
            this.field1327 = null;
        }
        ++field1316;
        return this.field1332 != null ? this.field1332.method1597() : 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method653(byte[] arg0, int arg1) {
        ++field1307;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class60.method421(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        if (arg1 != -1) {
            this.field1326 = true;
        }
        ++field1315;
        if (this.field1332 == null) {
            return null;
        } else {
            class177 var3 = arg0.method1735();
            var3.method985(super.field740, super.field729, super.field734);
            class382 var4 = null;
            if (this.field1312) {
                var4 = class397.method2554(1, 0);
            }
            this.field1332.method1601(var3, var4 != null ? var4.field5543[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg3 >= -106) {
            this.field1325 = false;
        }
        if (arg5 instanceof class338) {
            class338 var8 = (class338) arg5;
            if (this.field1332 != null && var8.field4870 != null) {
                this.field1332.method1599(var8.field4870, arg4, arg2, arg1, arg6);
            }
        } else if (arg5 instanceof class93) {
            class93 var9 = (class93) arg5;
            if (this.field1332 != null && var9.field1332 != null) {
                this.field1332.method1599(var9.field1332, arg4, arg2, arg1, arg6);
            }
        }
        ++field1317;
    }
}
