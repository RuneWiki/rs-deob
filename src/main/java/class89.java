import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class89 {

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "B")
    private byte field1328;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field1314 = 0;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "[Ltd;")
    public static class107[] field1325 = new class107[5];

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field1324 = -1;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "Lik;")
    public static class410 field1330;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Lrk;")
    public static class427 field1312;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method785(int arg0) {
        if (arg0 != 64) {
            method786(-52, -74, -112, 53, 32);
        }
        field1330 = null;
        field1312 = null;
        field1325 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V")
    public static final void method786(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1313++;
        for (class417 var5 = (class417) class329.field4465.method1240((byte) -94); var5 != null; var5 = (class417) class329.field4465.method1245(1)) {
            class289.method1867(var5, arg1, arg0, arg3, (byte) 11, arg2);
        }
        for (class417 var6 = (class417) client.field3444.method1240((byte) -70); var6 != null; var6 = (class417) client.field3444.method1245(1)) {
            byte var11 = 1;
            class434 var12 = var6.field5849.method2280(108);
            if (var6.field5849.field4982) {
                var11 = 0;
            } else if (var6.field5849.field4941 == var12.field6190 || var6.field5849.field4941 == var12.field6148 || var6.field5849.field4941 == var12.field6176 || var6.field5849.field4941 == var12.field6154) {
                var11 = 2;
            } else if (var6.field5849.field4941 == var12.field6174 || var6.field5849.field4941 == var12.field6153 || var6.field5849.field4941 == var12.field6172 || var6.field5849.field4941 == var12.field6195) {
                var11 = 3;
            }
            if (var6.field5832 != var11) {
                int var13 = class73.method629(var6.field5849, -86);
                if (var6.field5839 != var13) {
                    if (var6.field5836 != null) {
                        class315.field4277.method1431(var6.field5836);
                        var6.field5836 = null;
                    }
                    var6.field5839 = var13;
                }
                var6.field5832 = var11;
            }
            var6.field5850 = var6.field5849.field3176;
            var6.field5838 = var6.field5849.field3176 + (var6.field5849.method2146(110) * 64);
            var6.field5854 = var6.field5849.field3167;
            var6.field5860 = var6.field5849.field3167 + var6.field5849.method2146(-125) * 64;
            class289.method1867(var6, arg1, arg0, arg3, (byte) 11, arg2);
        }
        for (class417 var7 = (class417) class218.field3018.method608(-39); var7 != null; var7 = (class417) class218.field3018.method606((byte) 55)) {
            byte var8 = 1;
            class434 var9 = var7.field5841.method2280(60);
            if (var7.field5841.field4982) {
                var8 = 0;
            } else if (var7.field5841.field4941 == var9.field6190 || var7.field5841.field4941 == var9.field6148 || var7.field5841.field4941 == var9.field6176 || var7.field5841.field4941 == var9.field6154) {
                var8 = 2;
            } else if (var7.field5841.field4941 == var9.field6174 || var7.field5841.field4941 == var9.field6153 || var7.field5841.field4941 == var9.field6172 || var7.field5841.field4941 == var9.field6195) {
                var8 = 3;
            }
            if (var7.field5832 != var8) {
                int var10 = class340.method2162(82, var7.field5841);
                if (var7.field5839 != var10) {
                    if (var7.field5836 != null) {
                        class315.field4277.method1431(var7.field5836);
                        var7.field5836 = null;
                    }
                    var7.field5839 = var10;
                }
                var7.field5832 = var8;
            }
            var7.field5850 = var7.field5841.field3176;
            var7.field5838 = var7.field5841.field3176 + (var7.field5841.method2146(-128) * 64);
            var7.field5854 = var7.field5841.field3167;
            var7.field5860 = var7.field5841.field3167 + (var7.field5841.method2146(-122) * 64);
            class289.method1867(var7, arg1, arg0, arg3, (byte) 11, arg2);
        }
        if (arg4 >= -34) {
            field1325 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        for (class125 var7 = (class125) class121.field1698.method891(20838); var7 != null; var7 = (class125) class121.field1698.method898(64)) {
            if (class414.field5793 >= var7.field1752) {
                var7.method328(-52);
            } else {
                class438.method2719(arg4, arg2 >> 1, arg5, var7.field1746 * 2, (var7.field1749 << 7) + 64, (var7.field1751 << 7) + 64, 8741, arg3 >> 1);
                class96.field1387.method1309(0, var7.field1747, (byte) 106, var7.field1743 | 0xFF000000, class220.field3043[1] + arg1, arg0 - -class220.field3043[0]);
            }
        }
        if (arg6 <= -17) {
            field1316++;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)I")
    public static final int method788(int arg0, byte arg1) {
        field1315++;
        int var2 = -53 % ((21 - arg1) / 49);
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
    public static final void method789(int arg0, int arg1) {
        field1311++;
        class334.field4531.method2534(arg1 ^ arg1, arg0);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
    public static final void method790(int arg0, int arg1) {
        field1321++;
        class450 var2 = class59.method540(8, arg0, 1000);
        var2.method2798(-664528978);
        int var3 = 21 % ((arg1 - 40) / 47);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lpe;IIILsj;IIIIII)Lsj;")
    public static final class73 method791(class391 arg0, int arg1, int arg2, int arg3, class73 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1327++;
        long var11 = (long) arg9;
        class73 var13 = (class73) class156.field2361.method2537(arg5 ^ 0xFFFFFBD6, var11);
        if (var13 == null) {
            class84 var15 = class128.method1002(arg9, (byte) 126, 0, class204.field2875);
            if (var15 == null) {
                return null;
            }
            var13 = arg0.method237(var15, arg5, class315.field4283, 64, 768);
            class156.field2361.method2542(var13, (byte) -63, var11);
        }
        class73 var16 = var13.method440((byte) 2, arg5, true);
        if (arg8 != 0) {
            var16.method439(arg8);
        }
        if (arg6 != 0) {
            var16.method467(arg6);
        }
        if (arg3 != 0) {
            var16.method442(arg3);
        }
        if (arg2 != 0) {
            var16.method460(0, arg2, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I")
    public final int method792(byte arg0) {
        if (arg0 > -82) {
            return -89;
        } else {
            field1317++;
            return (this.field1328 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBLfo;)Ldb;")
    public static final class26 method793(int arg0, byte arg1, class228 arg2) {
        field1329++;
        class26 var3;
        if (class412.field5768 == null) {
            var3 = new class26();
        } else {
            var3 = class412.field5768;
            class412.field5768 = class412.field5768.field463;
            var3.field463 = null;
            class338.field4588--;
        }
        var3.field464 = arg0;
        var3.field460 = arg2;
        return arg1 == -74 ? var3 : null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I")
    public final int method794(int arg0) {
        if (arg0 != 17057) {
            this.method794(-5);
        }
        field1322++;
        return this.field1328 & 0x7;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class89() {
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lap;)V")
    public class89(class289 arg0) {
        this.field1328 = arg0.method1868((byte) -123);
        this.field1310 = arg0.method1853(98);
        this.field1326 = arg0.method1856((byte) 29);
        this.field1319 = arg0.method1856((byte) 17);
        this.field1323 = arg0.method1856((byte) 114);
        this.field1318 = arg0.method1856((byte) 62);
    }

    static {
        for (int var0 = 0; var0 < field1325.length; var0++) {
            field1325[var0] = new class107();
        }
        field1330 = new class410(64);
    }
}
