import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class104 extends class51 {

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    private final int field1484;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private final int field1468;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    private final int field1473;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    private final int field1476;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Z")
    public static boolean field1472 = false;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lok;")
    public static class41 field1469 = class137.method956("Versteckt", 45);

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Lok;")
    private static class41 field1481 = class137.method956("Loaded config", 45);

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Lok;")
    public static class41 field1474 = class137.method956("Hidden)2use", 45);

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field1483 = 0;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lok;")
    public static class41 field1477 = field1481;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "[I")
    public static int[] field1485 = new int[2];

    @OriginalMember(owner = "client!he", name = "G", descriptor = "Lok;")
    public static class41 field1487 = class137.method956("Mem:", 45);

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[Lka;")
    public static class279[] field1470;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 5)
    public static void method718(int arg0) {
        field1487 = null;
        if (arg0 != 29031) {
            method721(-55, -112, -28, -15, -122);
        }
        field1470 = null;
        field1477 = null;
        field1469 = null;
        field1481 = null;
        field1485 = null;
        field1474 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", line = 24)
    public static final void method719(String arg0, Throwable arg1, boolean arg2) {
        field1478++;
        if (arg2) {
            field1483 = -75;
        }
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class111.method753(arg1, -1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class27.field397.field3390 == null) {
                return;
            }
            class182 var8 = class27.field397.method1473(8779, new URL(class27.field397.field3390.getCodeBase(), "clienterror.ws?c=" + class69.field1042 + "&u=" + class205.field3324 + "&v1=" + class211.field3399 + "&v2=" + class211.field3394 + "&e=" + var7));
            while (var8.field2948 == 0) {
                class300.method2068(118, 1L);
            }
            if (var8.field2948 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2945;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIII)V", line = 89)
    public class104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1484 = arg2;
        this.field1468 = arg0;
        this.field1473 = arg1;
        this.field1476 = arg3;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V", line = 102)
    public final void method71(int arg0, int arg1, int arg2) {
        field1479++;
        int var4 = this.field1484 * arg0 >> 12;
        int var5 = this.field1468 * arg0 >> 12;
        if (arg1 == 0) {
            int var6 = this.field1473 * arg2 >> 12;
            int var7 = this.field1476 * arg2 >> 12;
            class180.method1286(var4, var7, 3652, this.field767, var6, var5, this.field769);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V", line = 135)
    public final void method73(int arg0, int arg1, int arg2) {
        field1467++;
        int var4 = this.field1468 * arg2 >> 12;
        if (arg0 == 0) {
            int var5 = this.field1484 * arg2 >> 12;
            int var6 = this.field1473 * arg1 >> 12;
            int var7 = this.field1476 * arg1 >> 12;
            class105.method724(this.field772, (byte) 71, this.field767, this.field769, var4, var7, var5, var6);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLib;Lib;)V", line = 157)
    public static final void method720(byte arg0, class3 arg1, class3 arg2) {
        if (arg1.field45 != null) {
            arg1.method11(true);
        }
        field1475++;
        arg1.field37 = arg2.field37;
        arg1.field45 = arg2;
        arg1.field45.field37 = arg1;
        if (arg0 < -17) {
            arg1.field37.field45 = arg1;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V", line = 181)
    public final void method72(int arg0, int arg1, int arg2) {
        field1480++;
        int var4 = this.field1468 * arg2 >> 12;
        int var5 = this.field1484 * arg2 >> 12;
        if (arg0 == -15071) {
            int var6 = this.field1476 * arg1 >> 12;
            int var7 = this.field1473 * arg1 >> 12;
            class117.method834(var7, var5, var4, (byte) -40, var6, this.field772);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 199)
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            method719((String) null, (Throwable) null, false);
        }
        for (int var5 = 0; var5 < class75.field1120; var5++) {
            if (arg3 < (class237.field3804[var5] + class201.field3212[var5]) && class237.field3804[var5] < (arg0 + arg3) && arg4 < class92.field1353[var5] + class62.field904[var5] && arg2 + arg4 > class92.field1353[var5]) {
                class165.field2615[var5] = true;
            }
        }
        field1482++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V", line = 231)
    public static final void method722(boolean arg0, int arg1) {
        field1486++;
        if (arg1 != 2) {
            method719((String) null, (Throwable) null, true);
        }
        if (class62.field913.field4280 >> 7 == class124.field1846 && class62.field913.field4311 >> 7 == class107.field1506) {
            class124.field1846 = 0;
        }
        int var2 = class85.field1248;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class245 var4;
            long var5;
            if (arg0) {
                var4 = class62.field913;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class118.field1737[var3] << 32;
                var4 = class246.field3955[class118.field1737[var3]];
            }
            if (var4 != null && var4.method351(true)) {
                var4.field3921 = false;
                if ((class207.field3359 && class85.field1248 > 200 || class85.field1248 > 50) && !arg0 && var4.field4333 == var4.field4321) {
                    var4.field3921 = true;
                }
                int var7 = var4.field4280 >> 7;
                int var8 = var4.field4311 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field3907 == null || var4.field3944 > class18.field234 || var4.field3926 <= class18.field234) {
                        if (var4.method1753((byte) -15) == 1 && (var4.field4280 & 0x7F) == 64 && (var4.field4311 & 0x7F) == 64) {
                            if (class252.field4010[var7][var8] == class112.field1646) {
                                continue;
                            }
                            class252.field4010[var7][var8] = class112.field1646;
                        }
                        var4.field4307 = class140.method983((byte) -110, class55.field807, var4.field4280, var4.field4311);
                        class238.method1709(class55.field807, var4.field4280, var4.field4311, var4.field4307, var4.method1753((byte) -15) * 64 + 60 - 64, var4, var4.field4297, var5, var4.field4331);
                    } else {
                        var4.field3921 = false;
                        var4.field4307 = class140.method983((byte) 52, class55.field807, var4.field4280, var4.field4311);
                        class307.method2130(class55.field807, var4.field4280, var4.field4311, var4.field4307, var4, var4.field4297, var5, var4.field3947, var4.field3912, var4.field3931, var4.field3906);
                    }
                }
            }
        }
    }
}
