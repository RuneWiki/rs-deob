import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 extends class17 {

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Lmb;")
    public static class84 field1953 = method672(true, "redstone3");

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lmb;")
    public static class84 field1960 = method672(true, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "[I")
    public static int[] field1950 = new int[2000];

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field1958 = -1;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "[[B")
    public static byte[][] field1951 = new byte[250][];

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Lmb;")
    private static class84 field1957 = method672(true, "glow1:");

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lmb;")
    public static class84 field1968 = field1957;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Lt;")
    public class124 field1965;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Lge;")
    public class47 field1966;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Lge;")
    public static class47 field1969;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "[B")
    public byte[] field1952;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "[I")
    public static int[] field1964;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static final void method671(int arg0) {
        field1954++;
        Object var1 = class76.field1916;
        synchronized (class76.field1916) {
            if (class27.field657 == arg0) {
                class115.field2770.method1198(new class108(), false, 5);
            }
            class27.field657 = 600;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;)Lmb;")
    public static final class84 method672(boolean arg0, String arg1) {
        if (!arg0) {
            field1969 = null;
        }
        field1970++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class84 var5 = new class84();
        var5.field2058 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field2058[var5.field2062++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field2058[var5.field2062++] = (byte) var6;
            }
        }
        var5.method709(false);
        return var5.method721(4096);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)Lka;")
    public static final class70 method673(int arg0, boolean arg1) {
        field1967++;
        class70 var2 = (class70) class33.field725.method970(-27059, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return null;
        } else {
            byte[] var3 = class63.field1562.method986(arg0, 12, (byte) 67);
            class70 var4 = new class70();
            if (var3 != null) {
                var4.method618(new class51(var3), (byte) -49);
            }
            var4.method614((byte) 45);
            class33.field725.method965(var4, 208, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    public static final int method674(int arg0, int arg1, int arg2) {
        field1962++;
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        if (arg0 != 24599) {
            method673(-127, true);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lve;")
    public static final class141 method675(int arg0, int arg1) {
        field1956++;
        class141 var2 = (class141) class107.field2586.method970(-27059, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field2192.method986(arg0, 9, (byte) 67);
        class141 var4 = new class141();
        var4.field3409 = arg0;
        if (var3 != null) {
            var4.method1140(new class51(var3), false);
        }
        if (arg1 > -10) {
            return null;
        } else {
            var4.method1141((byte) 124);
            class107.field2586.method965(var4, 208, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)V")
    public static void method676(boolean arg0) {
        field1950 = null;
        field1968 = null;
        if (!arg0) {
            field1968 = null;
        }
        field1969 = null;
        field1964 = null;
        field1953 = null;
        field1957 = null;
        field1951 = null;
        field1960 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static final void method677(byte arg0) {
        field1959++;
        if (arg0 >= -109) {
            method678(null, 81);
        }
        if (class125.field3019 == null) {
            return;
        }
        class57 var1 = class125.field3019;
        class57 var2 = class96.method802(1000, var1);
        if (var2 == null) {
            class125.field3019 = null;
            return;
        }
        class52.field1158++;
        int[] var3 = class54.method448((byte) 123, var2);
        int[] var4 = class54.method448((byte) 126, var1);
        int var5 = class20.field427 - class120.field2893;
        int var6 = class60.field1498 - class54.field1241;
        if (var5 <= var1.field1434 && -var1.field1434 <= var5 && var6 <= var1.field1434 && -var1.field1434 <= var6 && !class83.field2045) {
            var5 = 0;
            var6 = 0;
        } else if (class52.field1158 > var1.field1432 || class83.field2045) {
            class83.field2045 = true;
        } else {
            var5 = 0;
            var6 = 0;
        }
        int var7 = var4[1] + var6 - var3[1];
        int var8 = var4[0] + var5 - var3[0];
        if (var7 < 0) {
            var7 = 0;
        }
        if (var1.field1332 + var7 > var2.field1332) {
            var7 = var2.field1332 - var1.field1332;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        if (var2.field1365 < var1.field1365 + var8) {
            var8 = var2.field1365 - var1.field1365;
        }
        if (class125.field3019.field1354 != null && class83.field2045) {
            class43.method320(0, null, var7, var1.field1354, true, var8, var1);
        }
        if (class129.field3109 != 0) {
            return;
        }
        if (class83.field2045) {
            int var9 = class20.field427 - var3[0];
            if (var9 < 0) {
                var9 = 0;
            }
            int var10 = class60.field1498 - var3[1];
            if (var10 < 0) {
                var10 = 0;
            }
            if (var2.field1332 - 1 < var10) {
                var10 = var2.field1332 - 1;
            }
            if (var2.field1365 - 1 < var9) {
                var9 = var2.field1365 - 1;
            }
            class57 var11 = class36.method268(var2, var9, var10, var1, 119);
            if (class125.field3019.field1389 != null) {
                class43.method320(0, var11, var7, var1.field1389, true, var8, var1);
            }
            if (var11 != null && class146.method1188(var1, true) != null) {
                class76.field1910++;
                class80.field1978.method769((byte) 13, 240);
                class80.field1978.method388(var11.field1369, (byte) -97);
                class80.field1978.method397(true, var11.field1425);
                class80.field1978.method388(var1.field1369, (byte) -114);
                class80.field1978.method397(true, var1.field1425);
            }
        } else {
            if (class125.field3019.field1315 != null) {
                class43.method320(0, null, var7, var1.field1315, true, var8, var1);
            }
            if ((class92.field2293 == 1 || class8.method42(-19047, class20.field429 - 1)) && class20.field429 > 2) {
                class117.method954(96);
            } else if (class20.field429 > 0) {
                class44.method322(class20.field429 - 1, true);
            }
        }
        class125.field3019 = null;
        return;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method678(byte[] arg0, int arg1) {
        if (arg1 != 9) {
            field1950 = null;
        }
        field1955++;
        class51 var2 = new class51(arg0);
        int var3 = var2.method373(25094);
        int var4 = var2.method399(-539722392);
        if (var4 < 0 || class124.field3009 != 0 && var4 > class124.field3009) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method398((byte) 60, var5, var4, 0);
            return var5;
        } else {
            int var6 = var2.method399(-539722392);
            if (var6 < 0 || class124.field3009 != 0 && var6 > class124.field3009) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class32.method238(var7, var6, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }
}
