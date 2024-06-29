import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class101 {

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Z")
    public boolean field1496 = true;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public int field1503 = -1;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    private int field1485 = 0;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public int field1495 = 128;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field1490 = -1;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1494 = new String[100];

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Z")
    public static boolean field1504 = false;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "[I")
    public static int[] field1500;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method861(int arg0) {
        if (arg0 != 255) {
            method869((byte) 113);
        }
        field1500 = null;
        field1494 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IFBIIIIIZ)[[I")
    public static final int[][] method862(int arg0, float arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field1497++;
        int[][] var9 = new int[arg6][arg7];
        class426 var10 = new class426();
        var10.field6016 = arg8;
        var10.field6026 = arg3;
        var10.field6034 = arg4;
        var10.field6036 = (int) (arg1 * 4096.0F);
        var10.field6017 = arg0;
        var10.method87((byte) 77);
        class69.method597(arg6, arg7, -1);
        if (arg2 != 127) {
            method867(42, -23, false, true, -60);
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method2624(-110, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public static final void method863(int arg0, int arg1) {
        field1498++;
        if (arg0 == -1 || !class224.field3103[arg0]) {
            return;
        }
        class166.field2453.method2642(arg0, (byte) -51);
        if (class291.field3949[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 2) {
            method867(47, 91, true, false, -58);
        }
        for (int var3 = 0; var3 < class291.field3949[arg0].length; var3++) {
            if (class291.field3949[arg0][var3] != null) {
                if (class291.field3949[arg0][var3].field2023 == 2) {
                    var2 = false;
                } else {
                    class291.field3949[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class291.field3949[arg0] = null;
        }
        class224.field3103[arg0] = false;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method864(int arg0, String arg1) {
        field1487++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -13619) {
            method869((byte) -117);
        }
        for (int var2 = 0; var2 < class123.field1724; var2++) {
            if (arg1.equalsIgnoreCase(class87.field1294[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class95.field1379.field4577);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILap;I)V")
    private final void method865(int arg0, int arg1, class289 arg2, int arg3) {
        field1499++;
        if (arg0 != -1) {
            return;
        }
        if (arg3 == 1) {
            this.field1485 = arg2.method1880((byte) -61);
            this.method868(this.field1485, 18223);
        } else if (arg3 == 2) {
            this.field1503 = arg2.method1853(-121);
            if (this.field1503 == 65535) {
                this.field1503 = -1;
                return;
            }
        } else if (arg3 == 3) {
            this.field1495 = arg2.method1853(123);
            return;
        } else if (arg3 == 4) {
            this.field1496 = false;
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lap;BI)V")
    public final void method866(class289 arg0, byte arg1, int arg2) {
        int var4 = -114 % ((arg1 - 53) / 61);
        field1486++;
        while (true) {
            int var5 = arg0.method1861((byte) -72);
            if (var5 == 0) {
                return;
            }
            this.method865(-1, arg2, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIZZI)V")
    public static final void method867(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field1505++;
        class331.method2108(-20519, arg2, 0, arg1, class365.field5034.length - 1, arg4, arg3);
        class322.field4363 = null;
        if (arg0 < 6) {
            method862(110, -1.5952252F, (byte) -90, 46, -107, -96, 126, -122, false);
        }
        class167.field2477 = 0;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    private final void method868(int arg0, int arg1) {
        field1491++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (arg1 != 18223) {
            this.field1502 = -63;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field1501 = (int) (var15 * 256.0D);
        this.field1489 = (int) (var17 * 256.0D);
        if (this.field1501 < 0) {
            this.field1501 = 0;
        } else if (this.field1501 > 255) {
            this.field1501 = 255;
        }
        if (this.field1489 < 0) {
            this.field1489 = 0;
        } else if (this.field1489 > 255) {
            this.field1489 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field1502 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1502 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1502 < 1) {
            this.field1502 = 1;
        }
        this.field1492 = (int) ((double) this.field1502 * var19);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static final void method869(byte arg0) {
        field1488++;
        if (arg0 == -115) {
            class298.field4010.method2539(67);
        }
    }
}
