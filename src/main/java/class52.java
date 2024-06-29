import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SVMLNUSB")
public class class52 {

    @OriginalMember(owner = "client!SVMLNUSB", name = "i", descriptor = "Z")
    public boolean field1410 = false;

    @OriginalMember(owner = "client!SVMLNUSB", name = "j", descriptor = "Z")
    public boolean field1411 = true;

    @OriginalMember(owner = "client!SVMLNUSB", name = "l", descriptor = "Z")
    public boolean field1413 = false;

    @OriginalMember(owner = "client!SVMLNUSB", name = "o", descriptor = "Z")
    public boolean field1416 = false;

    @OriginalMember(owner = "client!SVMLNUSB", name = "p", descriptor = "I")
    public int field1417 = -1;

    @OriginalMember(owner = "client!SVMLNUSB", name = "q", descriptor = "Z")
    public boolean field1418 = true;

    @OriginalMember(owner = "client!SVMLNUSB", name = "a", descriptor = "I")
    private static int field1402 = 685;

    @OriginalMember(owner = "client!SVMLNUSB", name = "b", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!SVMLNUSB", name = "d", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!SVMLNUSB", name = "g", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!SVMLNUSB", name = "h", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!SVMLNUSB", name = "k", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!SVMLNUSB", name = "m", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!SVMLNUSB", name = "n", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!SVMLNUSB", name = "f", descriptor = "Ljava/lang/String;")
    public String field1407;

    @OriginalMember(owner = "client!SVMLNUSB", name = "e", descriptor = "[I")
    public static int[] field1406;

    @OriginalMember(owner = "client!SVMLNUSB", name = "c", descriptor = "[LSVMLNUSB;")
    public static class52[] field1404;

    @OriginalMember(owner = "client!SVMLNUSB", name = "a", descriptor = "(LHBJEXSJX;Z)V")
    public static void method522(class24 arg0, boolean arg1) {
        class18 var2 = new class18(arg0.method348("varp.dat", null), 0);
        field1405 = 0;
        field1403 = var2.method241();
        if (!arg1) {
            field1402 = 428;
        }
        if (field1404 == null) {
            field1404 = new class52[field1403];
        }
        if (field1406 == null) {
            field1406 = new int[field1403];
        }
        for (int var3 = 0; var3 < field1403; var3++) {
            if (field1404[var3] == null) {
                field1404[var3] = new class52();
            }
            field1404[var3].method523(var3, var2, 24145);
        }
        if (var2.field793.length != var2.field794) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!SVMLNUSB", name = "a", descriptor = "(ILEYMNCFMK;I)V")
    public void method523(int arg0, class18 arg1, int arg2) {
        if (arg2 != 24145) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method239();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1408 = arg1.method239();
            } else if (var5 == 2) {
                this.field1409 = arg1.method239();
            } else if (var5 == 3) {
                this.field1410 = true;
                field1406[field1405++] = arg0;
            } else if (var5 == 4) {
                this.field1411 = false;
            } else if (var5 == 5) {
                this.field1412 = arg1.method241();
            } else if (var5 == 6) {
                this.field1413 = true;
            } else if (var5 == 7) {
                this.field1414 = arg1.method244();
            } else if (var5 == 8) {
                this.field1415 = 1;
                this.field1416 = true;
            } else if (var5 == 10) {
                this.field1407 = arg1.method246();
            } else if (var5 == 11) {
                this.field1416 = true;
            } else if (var5 == 12) {
                this.field1417 = arg1.method244();
            } else if (var5 == 13) {
                this.field1415 = 2;
                this.field1416 = true;
            } else if (var5 == 14) {
                this.field1418 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
