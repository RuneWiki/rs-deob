import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 extends class41 {

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public int field216 = -1;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public int field217 = -1;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    public static int[] field209 = new int[256];

    @OriginalMember(owner = "client!n", name = "w", descriptor = "[I")
    public static int[] field214;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
    public static int[] field219;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field210;
        class203 var3 = arg0.method1960();
        var3.method1029(super.field584, super.field580, super.field583);
        class374 var4 = class358.method2196(3, (byte) -105);
        if (~this.field217 != 0) {
            class456 var5 = class175.field2385.method1557(this.field217, 21992).method2593(0, -1, 1024, -1, (class181) null, arg0, this.field218, (class202) null, 0);
            if (var5 != null) {
                var5.method1880(var3, var4.field5156[2], 0);
            }
        }
        if (~this.field216 != 0) {
            class456 var6 = class175.field2385.method1557(this.field216, 21992).method2593(0, -1, 1024, -1, (class181) null, arg0, this.field213, (class202) null, 0);
            if (var6 != null) {
                var6.method1880(var3, var4.field5156[1], 0);
            }
        }
        if (arg1 <= 99) {
            return null;
        } else {
            class456 var7 = class175.field2385.method1557(this.field222, 21992).method2593(0, -1, 1024, -1, (class181) null, arg0, this.field221, (class202) null, 0);
            if (var7 != null) {
                var7.method1880(var3, var4.field5156[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method96(int arg0) {
        field209 = null;
        field214 = null;
        if (arg0 != -1) {
            field215 = 101;
        }
        field219 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        if (arg2 >= -107) {
            return false;
        } else {
            ++field208;
            class203 var5 = arg3.method1960();
            var5.method1029(super.field584, super.field580, super.field583);
            class456 var6 = class175.field2385.method1557(this.field222, 21992).method2593(0, -1, 65536, -1, (class181) null, arg3, this.field221, (class202) null, 0);
            if (var6 != null && var6.method1882(arg0, arg1, var5, true)) {
                return true;
            } else {
                if (~this.field216 != 0) {
                    class456 var7 = class175.field2385.method1557(this.field216, 21992).method2593(0, -1, 65536, -1, (class181) null, arg3, this.field213, (class202) null, 0);
                    if (var7 != null && var7.method1882(arg0, arg1, var5, true)) {
                        return true;
                    }
                }
                if (~this.field217 != 0) {
                    class456 var8 = class175.field2385.method1557(this.field217, 21992).method2593(0, -1, 65536, -1, (class181) null, arg3, this.field218, (class202) null, 0);
                    if (var8 != null && var8.method1882(arg0, arg1, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwm;IILon;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method97(class364 arg0, int arg1, int arg2, class203 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class95.field1404 = arg0;
        class45.field622 = arg1;
        class132.field1937 = arg3;
        class205.field2781 = class95.field1404.method1977() > 0;
        class121.field1779 = arg4 >> class302.field4025;
        class412.field5643 = arg6 >> class302.field4025;
        class138.field2003 = arg4;
        class1.field6 = arg6;
        class35.field540 = arg5;
        class100.field1461 = class121.field1779 - class314.field4169;
        if (class100.field1461 < 0) {
            class222.field2952 = -class100.field1461;
            class100.field1461 = 0;
        } else {
            class222.field2952 = 0;
        }
        class492.field6879 = class412.field5643 - class314.field4169;
        if (class492.field6879 < 0) {
            class214.field2879 = -class492.field6879;
            class492.field6879 = 0;
        } else {
            class214.field2879 = 0;
        }
        class86.field1188 = class314.field4169 + class121.field1779;
        if (class86.field1188 > class143.field2058) {
            class86.field1188 = class143.field2058;
        }
        class66.field884 = class412.field5643 + class314.field4169;
        if (class66.field884 > class91.field1344) {
            class66.field884 = class91.field1344;
        }
        for (int var18 = 0; var18 < class314.field4169 + class314.field4169 + 2; ++var18) {
            for (int var23 = 0; var23 < class314.field4169 + class314.field4169 + 2; ++var23) {
                int var24 = class121.field1779 - class314.field4169 + var18;
                int var25 = class412.field5643 - class314.field4169 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class143.field2058 && var25 < class91.field1344) {
                    int var26 = var24 << class302.field4025;
                    int var27 = var25 << class302.field4025;
                    int var28 = class289.field3896[class289.field3896.length - 1].method371(var24, var25) - 1000;
                    int var29 = class312.field4112 != null ? class312.field4112[0].method371(var24, var25) + class230.field3020 : class289.field3896[0].method371(var24, var25) + class230.field3020;
                    class37.field552[var18][var23] = class95.field1404.method2099(var26, var28, var27, var26, var29, var27);
                } else {
                    class37.field552[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class314.field4169 + class314.field4169 + 1; ++var19) {
            for (int var22 = 0; var22 < class314.field4169 + class314.field4169 + 1; ++var22) {
                class150.field2125[var19][var22] = class37.field552[var19][var22] || class37.field552[var19 + 1][var22] || class37.field552[var19][var22 + 1] || class37.field552[var19 + 1][var22 + 1];
            }
        }
        class114.field1718 = arg8;
        class130.field1918 = arg9;
        class385.field5335 = arg10;
        class432.field5884 = arg11;
        class165.field2289 = arg12;
        class69.method454();
        class14.method87(false);
        for (class374 var20 = (class374) class32.field488.method2764((byte) -114); var20 != null; var20 = (class374) class32.field488.method2769(true)) {
            var20.method1541(-3);
            class459.method2699(var20, (byte) 38);
        }
        if (class205.field2781) {
            for (int var21 = 0; var21 < class162.field2259; ++var21) {
                class276.field3652[var21].method1490(arg1, arg17, false);
            }
        }
        if (arg2 > 1) {
            class95.field1404.method2015(0);
            if (class67.field913 == null || class67.field913 instanceof class194) {
                class67.field913 = new class200();
            }
        } else if (class67.field913 == null || class67.field913 instanceof class200) {
            class67.field913 = new class194();
        }
        class67.field913.method1106((byte) 121, arg2);
        class67.field913.method1111(0);
        if (class308.field4077 != null) {
            class410.method2459(true);
            class67.field913.method1108(22, 0);
            class104.method638(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class67.field913.method1111(0);
            class67.field913.method1108(23, 0);
            class410.method2459(false);
        }
        class104.method638(arg2, arg7, arg13, arg14, arg15, arg16);
        class67.field913.method1111(0);
        class67.field913.method1112(-127);
        class67.field913.method1111(0);
        if (arg2 > 1) {
            class95.field1404.method2041(0);
        }
        class95.field1404.method1978(0, (class404[]) null);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method98(int arg0, int arg1) {
        field215 = arg0;
        int var2 = 15 / ((-50 - arg1) / 51);
        class464.field6405 = -1;
        class308.field4076 = 100;
        class134.field1953 = 3;
        ++field220;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field212;
        if (arg1 > -48) {
            method96(25);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIIIFII)[[I")
    public static final int[][] method99(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8) {
        ++field211;
        int[][] var9 = new int[arg5][arg7];
        class297 var10 = new class297();
        var10.field3983 = arg3;
        var10.field3973 = arg1;
        var10.field3964 = arg2;
        var10.field3979 = (int) (arg6 * 4096.0F);
        var10.field3980 = arg0;
        var10.method65(-123);
        class422.method2501(arg7, arg5, (byte) -108);
        for (int var11 = arg8; arg5 > var11; ++var11) {
            var10.method1675(var9[var11], arg8 ^ -65, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static final void method100(byte arg0) {
        class76 var1 = class142.field2052;
        synchronized (class142.field2052) {
            class142.field2052.method502(0);
        }
        ++field207;
        class76 var2 = class26.field324;
        synchronized (class26.field324) {
            class26.field324.method502(0);
            if (arg0 != -96) {
                method96(12);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if ((1 & var1) != 1) {
                    var1 >>>= 1;
                } else {
                    var1 = -306674912 ^ var1 >>> 1;
                }
            }
            field209[var0] = var1;
        }
        field214 = new int[14];
        field215 = -1;
        field219 = new int[2048];
    }
}
