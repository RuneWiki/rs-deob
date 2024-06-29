import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 extends class124 {

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Z")
    public boolean field1434 = true;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public int field1438 = -1;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public int field1446 = -1;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public int field1449 = 0;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "[I")
    public static int[] field1439 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Lpe;")
    public static class109 field1429 = class141.method1120("Diese Betatest)2Welt ist nur f-Ur eingeladene", 0);

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lpe;")
    private static class109 field1445 = class141.method1120("OFF", 0);

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lpe;")
    public static class109 field1448 = class141.method1120("mapback", 0);

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "Lpe;")
    public static class109 field1440 = class141.method1120("Bitte benutzen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field1436 = 1;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lpe;")
    public static class109 field1453 = field1445;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Lr;")
    public static class118 field1437;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method569(int arg0) {
        field1429 = null;
        field1440 = null;
        field1448 = null;
        if (arg0 == 255) {
            field1439 = null;
            field1453 = null;
            field1445 = null;
            field1437 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lbe;III)V")
    private final void method570(class13 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -6036) {
            this.field1449 = -63;
        }
        if (arg3 == 1) {
            this.field1449 = arg0.method149(true);
        } else if (arg3 == 2) {
            this.field1438 = arg0.method142(arg1 ^ 0xFFFF8327);
        } else if (arg3 == 5) {
            this.field1434 = false;
        } else if (arg3 == 7) {
            this.field1446 = arg0.method149(true);
        }
        field1451++;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
    public final void method571(byte arg0) {
        field1452++;
        if (this.field1446 != -1) {
            this.method572(this.field1446, -4427);
            this.field1431 = this.field1447;
            this.field1443 = this.field1432;
            this.field1442 = this.field1454;
        }
        if (arg0 > -111) {
            this.method574(null, false, 87);
        }
        this.method572(this.field1449, -4427);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
    private final void method572(int arg0, int arg1) {
        field1441++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        if (var5 > var3) {
            var7 = var3;
        }
        double var9 = var5;
        double var11 = (double) (arg0 & 0xFF) / 256.0D;
        if (var5 < var3) {
            var9 = var3;
        }
        if (var9 < var11) {
            var9 = var11;
        }
        double var13 = 0.0D;
        if (var7 > var11) {
            var7 = var11;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var17 < 0.5D) {
                var13 = (var9 - var7) / (var7 + var9);
            }
            if (var5 == var9) {
                var15 = (var3 - var11) / (-var7 + var9);
            } else if (var3 == var9) {
                var15 = (var11 - var5) / (var9 - var7) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (-var7 + var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        this.field1447 = (int) (var13 * 256.0D);
        double var19 = var15 / 6.0D;
        if (this.field1447 < 0) {
            this.field1447 = 0;
        } else if (this.field1447 > 255) {
            this.field1447 = 255;
        }
        this.field1432 = (int) (var19 * 256.0D);
        this.field1454 = (int) (var17 * 256.0D);
        if (arg1 != -4427) {
            method575(null, null, null, 80);
        }
        if (this.field1454 < 0) {
            this.field1454 = 0;
        } else if (this.field1454 > 255) {
            this.field1454 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)I")
    public static final int method573(int arg0, int arg1, byte arg2) {
        field1450++;
        if (arg2 > -19) {
            return 108;
        } else if (arg0 >= 2) {
            int var3 = method573(arg0 >> 1, arg1 * arg1, (byte) -119);
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            return var3;
        } else if (arg0 == 1) {
            return arg1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lbe;ZI)V")
    public final void method574(class13 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method575(null, null, null, -74);
        }
        field1428++;
        while (true) {
            int var4 = arg0.method142(27467);
            if (var4 == 0) {
                return;
            }
            this.method570(arg0, -6036, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lna;Lpe;Lpe;I)Lk;")
    public static final class69 method575(class91 arg0, class109 arg1, class109 arg2, int arg3) {
        field1444++;
        int var4 = arg0.method766(87, arg2);
        if (arg3 >= -8) {
            return null;
        } else {
            int var5 = arg0.method743((byte) 127, arg1, var4);
            return class92.method769(var5, 120, arg0, var4);
        }
    }
}
