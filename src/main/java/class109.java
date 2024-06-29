import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1442 = -1;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Ljg;")
    public static class241 field1444 = new class241(8);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lpf;")
    public static class425 field1447;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method670(boolean arg0) {
        field1447 = null;
        if (!arg0) {
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method671(int arg0, int arg1) {
        field1446++;
        class342.field5115 = arg0;
        class241 var2 = class427.field6289;
        synchronized (class427.field6289) {
            class427.field6289.method1485(-22032);
        }
        class241 var3 = class338.field5048;
        synchronized (class338.field5048) {
            class338.field5048.method1485(-22032);
            if (arg1 <= 14) {
                method670(true);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class112 var7 = new class112();
        var7.field1466 = arg1 >> class254.field3869;
        var7.field1479 = arg2 >> class254.field3869;
        var7.field1471 = arg3 >> class254.field3869;
        var7.field1470 = arg4 >> class254.field3869;
        var7.field1480 = arg0;
        var7.field1478 = arg1;
        var7.field1472 = arg2;
        var7.field1481 = arg3;
        var7.field1483 = arg4;
        var7.field1464 = arg5;
        var7.field1465 = arg6;
        class176.field2676[class377.field5496++] = var7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method673(int arg0, int arg1, int arg2) {
        int var3 = -109 % ((-arg2 - 15) / 55);
        field1439++;
        class382 var4 = new class382(16);
        for (class429 var5 = (class429) class45.field557.method2296(5773); var5 != null; var5 = (class429) class45.field557.method2304(100)) {
            var5.method625((byte) -50);
            int var6 = (int) (var5.field1339 >> 28);
            int var7 = (int) (var5.field1339 >> 14 & 0x3FFFL) - arg1;
            int var8 = (int) (var5.field1339 & 0x3FFFL) - arg0;
            if (var8 >= 0 && var7 >= 0 && class115.field1522 > var8 && var7 < class198.field3004) {
                var4.method2301(105, var5, (long) (var8 | var6 << 28 | var7 << 14));
            }
        }
        class45.field557 = var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BJ)V")
    public static final void method674(byte arg0, long arg1) {
        field1440++;
        if (arg0 != 99) {
            field1443 = -127;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class407.method2556(arg1 - 1L, (byte) 126);
            class407.method2556(1L, (byte) 122);
        } else {
            class407.method2556(arg1, (byte) 98);
        }
    }

    static {
        new class151("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field1447 = new class425(37, 7);
    }
}
