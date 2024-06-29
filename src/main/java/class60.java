import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WBROSLMK")
public class class60 {

    @OriginalMember(owner = "client!WBROSLMK", name = "b", descriptor = "I")
    private int field1418 = 635;

    @OriginalMember(owner = "client!WBROSLMK", name = "j", descriptor = "Z")
    public boolean field1426 = false;

    @OriginalMember(owner = "client!WBROSLMK", name = "k", descriptor = "Z")
    public boolean field1427 = true;

    @OriginalMember(owner = "client!WBROSLMK", name = "m", descriptor = "Z")
    public boolean field1429 = false;

    @OriginalMember(owner = "client!WBROSLMK", name = "p", descriptor = "Z")
    public boolean field1432 = false;

    @OriginalMember(owner = "client!WBROSLMK", name = "q", descriptor = "I")
    public int field1433 = -1;

    @OriginalMember(owner = "client!WBROSLMK", name = "r", descriptor = "Z")
    public boolean field1434 = true;

    @OriginalMember(owner = "client!WBROSLMK", name = "c", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!WBROSLMK", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!WBROSLMK", name = "h", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!WBROSLMK", name = "i", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!WBROSLMK", name = "l", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!WBROSLMK", name = "n", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!WBROSLMK", name = "o", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!WBROSLMK", name = "g", descriptor = "Ljava/lang/String;")
    public String field1423;

    @OriginalMember(owner = "client!WBROSLMK", name = "a", descriptor = "Z")
    private static boolean field1417;

    @OriginalMember(owner = "client!WBROSLMK", name = "f", descriptor = "[I")
    public static int[] field1422;

    @OriginalMember(owner = "client!WBROSLMK", name = "d", descriptor = "[LWBROSLMK;")
    public static class60[] field1420;

    @OriginalMember(owner = "client!WBROSLMK", name = "a", descriptor = "(ZLFXNTEMPE;)V")
    public static void method460(boolean arg0, class18 arg1) {
        class50 var2 = new class50(arg1.method212("varp.dat", null), -46859);
        field1421 = 0;
        if (!arg0) {
            field1417 = !field1417;
        }
        field1419 = var2.method390();
        if (field1420 == null) {
            field1420 = new class60[field1419];
        }
        if (field1422 == null) {
            field1422 = new int[field1419];
        }
        for (int var3 = 0; var3 < field1419; var3++) {
            if (field1420[var3] == null) {
                field1420[var3] = new class60();
            }
            field1420[var3].method461(var3, 635, var2);
        }
        if (var2.field1224.length != var2.field1225) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!WBROSLMK", name = "a", descriptor = "(IILRSWRPCHR;)V")
    public void method461(int arg0, int arg1, class50 arg2) {
        if (arg1 <= 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method388();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1424 = arg2.method388();
            } else if (var4 == 2) {
                this.field1425 = arg2.method388();
            } else if (var4 == 3) {
                this.field1426 = true;
                field1422[field1421++] = arg0;
            } else if (var4 == 4) {
                this.field1427 = false;
            } else if (var4 == 5) {
                this.field1428 = arg2.method390();
            } else if (var4 == 6) {
                this.field1429 = true;
            } else if (var4 == 7) {
                this.field1430 = arg2.method393();
            } else if (var4 == 8) {
                this.field1431 = 1;
                this.field1432 = true;
            } else if (var4 == 10) {
                this.field1423 = arg2.method395();
            } else if (var4 == 11) {
                this.field1432 = true;
            } else if (var4 == 12) {
                this.field1433 = arg2.method393();
            } else if (var4 == 13) {
                this.field1431 = 2;
                this.field1432 = true;
            } else if (var4 == 14) {
                this.field1434 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
