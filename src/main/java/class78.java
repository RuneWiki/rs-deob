import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class78 {

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Lnk;")
    private class206 field1318 = new class206();

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljj;")
    private class156 field1316;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
    public static int[] field1315 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILvj;IZLjava/awt/Component;)Lck;")
    public static final class351 method609(int arg0, class177 arg1, int arg2, boolean arg3, Component arg4) {
        field1322++;
        if (class326.field4692 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                if (!arg3) {
                    method616(-4);
                }
                class351 var5 = (class351) Class.forName("vd").getDeclaredConstructor().newInstance();
                var5.field5010 = arg0;
                var5.field4997 = new int[(class122.field1929 ? 2 : 1) * 256];
                var5.method20(arg4);
                var5.field5013 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field5013 > 16384) {
                    var5.field5013 = 16384;
                }
                var5.method18(var5.field5013);
                if (class267.field3998 > 0 && class356.field5061 == null) {
                    class356.field5061 = new class387();
                    class356.field5061.field5542 = arg1;
                    arg1.method1384(class356.field5061, true, class267.field3998);
                }
                if (class356.field5061 != null) {
                    if (class356.field5061.field5552[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class356.field5061.field5552[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class368 var6 = new class368(arg1, arg2);
                    var6.field5010 = arg0;
                    var6.field4997 = new int[(class122.field1929 ? 2 : 1) * 256];
                    var6.method20(arg4);
                    var6.field5013 = 16384;
                    var6.method18(var6.field5013);
                    if (class267.field3998 > 0 && class356.field5061 == null) {
                        class356.field5061 = new class387();
                        class356.field5061.field5542 = arg1;
                        arg1.method1384(class356.field5061, true, class267.field3998);
                    }
                    if (class356.field5061 != null) {
                        if (class356.field5061.field5552[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class356.field5061.field5552[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class351();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public static final void method610(byte arg0) {
        class78 var1 = class417.field6046;
        synchronized (class417.field6046) {
            class417.field6046.method615(103);
        }
        field1325++;
        if (arg0 < 44) {
            field1315 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
    public final int method611(boolean arg0) {
        field1329++;
        return arg0 ? -65 : this.field1331;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public static final void method612(byte arg0) {
        class18 var1 = class168.field2483;
        synchronized (class168.field2483) {
            class168.field2483.method112(0);
        }
        field1332++;
        class18 var2 = class58.field923;
        synchronized (class58.field923) {
            class58.field923.method112(arg0 ^ 0xFFFFFFCA);
            if (arg0 != -54) {
                field1315 = null;
            }
        }
        class78 var3 = class417.field6046;
        synchronized (class417.field6046) {
            class417.field6046.method613(1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    private final void method613(int arg0) {
        if (arg0 != 1) {
            this.method614((class316) null, false, (Object) null);
        }
        for (class234 var2 = (class234) this.field1318.method1565(arg0); var2 != null; var2 = (class234) this.field1318.method1562(-4)) {
            if (var2.method1722((byte) -124)) {
                var2.method251(42);
                var2.method1398(110);
                this.field1331++;
            }
        }
        field1330++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lmc;ZLjava/lang/Object;)V")
    public final void method614(class316 arg0, boolean arg1, Object arg2) {
        field1328++;
        this.method617(124, arg0);
        if (this.field1331 == 0) {
            class234 var4 = (class234) this.field1318.method1558(-2);
            var4.method251(115);
            var4.method1398(110);
        } else {
            this.field1331--;
        }
        class326 var5 = new class326(arg0, arg2);
        this.field1316.method1217(1, arg0.method2130(-19580), var5);
        this.field1318.method1564((byte) 106, var5);
        if (arg1) {
            var5.field2671 = 0L;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public final void method615(int arg0) {
        this.field1318.method1557(1);
        field1317++;
        if (arg0 <= 94) {
            this.method622((class316) null, -117);
        }
        this.field1316.method1228(-30653);
        this.field1331 = this.field1321;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1315 = null;
        if (arg0 != -23359) {
            method609(46, (class177) null, 43, true, (Component) null);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILmc;)V")
    private final void method617(int arg0, class316 arg1) {
        field1327++;
        long var3 = arg1.method2130(-19580);
        int var5 = -98 % ((arg0 + 1) / 45);
        for (class234 var6 = (class234) this.field1316.method1219(var3, -89); var6 != null; var6 = (class234) this.field1316.method1229(0)) {
            if (var6.field3390.method2129(arg1, (byte) -7)) {
                var6.method251(64);
                var6.method1398(110);
                this.field1331++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)I")
    public final int method618(byte arg0) {
        field1333++;
        int var2 = -2 / ((29 - arg0) / 34);
        return this.field1321;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        this.field1331 = arg0;
        this.field1321 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1316 = new class156(var2);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z")
    public static final boolean method619(int arg0, int arg1, int arg2) {
        int var3 = class315.field4586[arg0][arg1][arg2];
        if (-class365.field5205 == var3) {
            return false;
        } else if (class365.field5205 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class218.method1647(var4 + 1, class50.field816[arg0].method794(arg1, arg2), var5 + 1) && class218.method1647(var4 + 128 - 1, class50.field816[arg0].method794(arg1 + 1, arg2), var5 + 1) && class218.method1647(var4 + 128 - 1, class50.field816[arg0].method794(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class218.method1647(var4 + 1, class50.field816[arg0].method794(arg1, arg2 + 1), var5 + 128 - 1)) {
                class315.field4586[arg0][arg1][arg2] = class365.field5205;
                return true;
            } else {
                class315.field4586[arg0][arg1][arg2] = -class365.field5205;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)I")
    public static final int method620(int arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        field1326++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 != 126) {
            method616(-21);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
    public final void method621(int arg0, int arg1) {
        int var3 = 36 % ((1 - arg0) / 41);
        if (class188.field2785 != null) {
            for (class234 var4 = (class234) this.field1318.method1565(1); var4 != null; var4 = (class234) this.field1318.method1562(-4)) {
                if (var4.method1722((byte) -74)) {
                    if (var4.method1723((byte) -91) == null) {
                        var4.method251(3);
                        var4.method1398(110);
                        this.field1331++;
                    }
                } else if ((long) arg1 < ++var4.field2671) {
                    class234 var5 = class188.field2785.method1060(true, var4);
                    this.field1316.method1217(1, var4.field499, var5);
                    class206.method1556(var4, 569, var5);
                    var4.method251(35);
                    var4.method1398(110);
                }
            }
        }
        field1319++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lmc;I)Ljava/lang/Object;")
    public final Object method622(class316 arg0, int arg1) {
        field1323++;
        long var3 = arg0.method2130(-19580);
        for (class234 var5 = (class234) this.field1316.method1219(var3, -90); var5 != null; var5 = (class234) this.field1316.method1229(0)) {
            if (var5.field3390.method2129(arg0, (byte) -7)) {
                Object var7 = var5.method1723((byte) -99);
                if (var7 != null) {
                    if (var5.method1722((byte) -55)) {
                        class326 var8 = new class326(arg0, var7);
                        this.field1316.method1217(1, var5.field499, var8);
                        this.field1318.method1564((byte) 106, var8);
                        var8.field2671 = 0L;
                        var5.method251(116);
                        var5.method1398(110);
                    } else {
                        this.field1318.method1564((byte) 106, var5);
                        var5.field2671 = 0L;
                    }
                    return var7;
                }
                var5.method251(79);
                var5.method1398(110);
                this.field1331++;
            }
        }
        int var6 = 118 / ((-arg1 - 54) / 47);
        return null;
    }
}
