import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class104 extends class173 {

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "Z")
    public boolean field1403 = true;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "Luw;")
    public static class208 field1405 = new class208(130, 0);

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "Ltn;")
    public static class749 field1407 = new class749(1);

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "Luw;")
    public static class208 field1408 = new class208(34, -2);

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Liga;")
    public class517 field1400;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "[I")
    private int[] field1389;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "[I")
    public int[] field1402;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field1397;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "[[I")
    private int[][] field1406;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lmc;B)V")
    public final void method600(class234 arg0, byte arg1) {
        field1387++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                if (arg1 > -92) {
                    field1408 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method604((byte) 122, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method601(int arg0) {
        class485.field6252.method2986(1, class485.field6252.field6940, (byte) -97);
        field1391++;
        class485.field6252.method2986(1, class485.field6252.field6942, (byte) -72);
        if (arg0 < 43) {
            method608((byte) -58);
        }
        class485.field6252.method2986(2, class485.field6252.field6918, (byte) 123);
        class485.field6252.method2986(2, class485.field6252.field6954, (byte) 90);
        class485.field6252.method2986(1, class485.field6252.field6938, (byte) 116);
        class485.field6252.method2986(1, class485.field6252.field6915, (byte) 107);
        class485.field6252.method2986(1, class485.field6252.field6945, (byte) -109);
        class485.field6252.method2986(1, class485.field6252.field6906, (byte) -62);
        class485.field6252.method2986(1, class485.field6252.field6923, (byte) -128);
        class485.field6252.method2986(1, class485.field6252.field6913, (byte) -96);
        class485.field6252.method2986(2, class485.field6252.field6952, (byte) -117);
        class485.field6252.method2986(1, class485.field6252.field6947, (byte) 60);
        class485.field6252.method2986(2, class485.field6252.field6951, (byte) 59);
        class485.field6252.method2986(1, class485.field6252.field6920, (byte) -125);
        class485.field6252.method2986(0, class485.field6252.field6953, (byte) 53);
        class485.field6252.method2986(0, class485.field6252.field6939, (byte) 60);
        class485.field6252.method2986(2, class485.field6252.field6908, (byte) 70);
        class485.field6252.method2986(0, class485.field6252.field6916, (byte) -115);
        class485.field6252.method2986(0, class485.field6252.field6936, (byte) -119);
        class251.method1634(7);
        class485.field6252.method2986(0, class485.field6252.field6955, (byte) -65);
        class485.field6252.method2986(4, class485.field6252.field6933, (byte) -125);
        class723.method3873(false);
        class193.method1346((byte) -40);
        class459.field5997 = true;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lmc;I)Ljava/lang/String;")
    public final String method602(class234 arg0, int arg1) {
        field1394++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1389 != null) {
            for (int var4 = 0; var4 < this.field1389.length; var4++) {
                var3.append(this.field1397[var4]);
                var3.append(this.field1400.method2861(this.method603(var4, (byte) 97), arg0.method1490(class413.method2394(14506, this.field1389[var4]).field704, 31310), 0, this.field1406[var4]));
            }
        }
        var3.append(this.field1397[this.field1397.length - 1]);
        if (arg1 != 0) {
            this.field1389 = null;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Lgh;")
    public final class54 method603(int arg0, byte arg1) {
        field1404++;
        if (this.field1389 == null || arg0 < 0 || arg0 > this.field1389.length) {
            return null;
        } else {
            if (arg1 <= 76) {
                field1405 = null;
            }
            return class413.method2394(14506, this.field1389[arg0]);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLmc;I)V")
    private final void method604(byte arg0, class234 arg1, int arg2) {
        int var4 = 126 % ((36 - arg0) / 53);
        field1395++;
        if (arg2 == 1) {
            this.field1397 = class340.method1966(1, '<', arg1.method1540((byte) -101));
        } else if (arg2 == 2) {
            int var5 = arg1.method1509(true);
            this.field1402 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1402[var6] = arg1.method1553((byte) -113);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1509(true);
            this.field1389 = new int[var7];
            this.field1406 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg1.method1553((byte) 84);
                class54 var10 = class413.method2394(14506, var9);
                if (var10 != null) {
                    this.field1389[var8] = var9;
                    this.field1406[var8] = new int[var10.field707];
                    for (int var11 = 0; var11 < var10.field707; var11++) {
                        this.field1406[var8][var11] = arg1.method1553((byte) 124);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field1403 = false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method605(String arg0, byte arg1) {
        field1392++;
        if (!class4.field51.field10571) {
            return -1;
        } else if (class232.field3128.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class739.method4015(arg0, (byte) -71);
            if (var2 == null) {
                return -1;
            }
            String var3 = class668.field8685 + var2;
            if (!class335.field4084.method150(16, "", var3)) {
                return -1;
            } else if (class335.field4084.method141(var3, -67)) {
                int var4 = 70 / ((arg1 + 18) / 54);
                byte[] var5 = class335.field4084.method142(-1, var3, "");
                Object var6 = null;
                File var7;
                try {
                    var7 = class125.method733(126, var2);
                } catch (RuntimeException var11) {
                    return -1;
                }
                if (var5 == null || var7 == null) {
                    return -1;
                }
                boolean var8 = true;
                byte[] var9 = class500.method2773((byte) 66, var7);
                if (var9 != null && var5.length == var9.length) {
                    for (int var10 = 0; var10 < var9.length; var10++) {
                        if (var5[var10] != var9[var10]) {
                            var8 = false;
                            break;
                        }
                    }
                } else {
                    var8 = false;
                }
                try {
                    if (!var8) {
                        class4.field51.method4235(9, var7, var5);
                    }
                } catch (Throwable var12) {
                    return -1;
                }
                class15.method63(arg0, var7, (byte) -122);
                return 100;
            } else {
                return class335.field4084.method151(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public final void method606(int arg0) {
        field1393++;
        if (this.field1402 != null) {
            for (int var2 = 0; var2 < this.field1402.length; var2++) {
                this.field1402[var2] = class77.method473(this.field1402[var2], 32768);
            }
        }
        if (arg0 != -17881) {
            this.field1389 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)I")
    public final int method607(int arg0, int arg1, int arg2) {
        int var4 = 61 % ((arg2 + 43) / 42);
        field1398++;
        if (this.field1389 == null || arg1 < 0 || this.field1389.length < arg1) {
            return -1;
        } else if (this.field1406[arg1] == null || arg0 < 0 || arg0 > this.field1406[arg1].length) {
            return -1;
        } else {
            return this.field1406[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method608(byte arg0) {
        if (arg0 != 40) {
            field1408 = null;
        }
        field1408 = null;
        field1407 = null;
        field1405 = null;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)I")
    public final int method609(byte arg0) {
        field1390++;
        if (this.field1389 == null) {
            return 0;
        } else {
            if (arg0 <= 32) {
                this.field1397 = null;
            }
            return this.field1389.length;
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method610(int arg0) {
        field1399++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1397 == null) {
            return "";
        }
        var2.append(this.field1397[0]);
        if (arg0 != -8275) {
            this.method602(null, 53);
        }
        for (int var3 = 1; var3 < this.field1397.length; var3++) {
            var2.append("...");
            var2.append(this.field1397[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lmc;[IZ)V")
    public final void method611(class234 arg0, int[] arg1, boolean arg2) {
        field1401++;
        if (this.field1389 == null) {
            return;
        }
        int var4 = 0;
        if (!arg2) {
            return;
        }
        while (var4 < this.field1389.length) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method603(var4, (byte) 96).field702;
            if (var5 > 0) {
                arg0.method1498((byte) 100, var5, (long) arg1[var4]);
            }
            var4++;
        }
    }
}
