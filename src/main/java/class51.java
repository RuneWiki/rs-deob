import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RGMKWKCG")
public class class51 {

    @OriginalMember(owner = "client!RGMKWKCG", name = "i", descriptor = "Z")
    public boolean field1386 = false;

    @OriginalMember(owner = "client!RGMKWKCG", name = "j", descriptor = "Z")
    public boolean field1387 = true;

    @OriginalMember(owner = "client!RGMKWKCG", name = "l", descriptor = "Z")
    public boolean field1389 = false;

    @OriginalMember(owner = "client!RGMKWKCG", name = "o", descriptor = "Z")
    public boolean field1392 = false;

    @OriginalMember(owner = "client!RGMKWKCG", name = "p", descriptor = "I")
    public int field1393 = -1;

    @OriginalMember(owner = "client!RGMKWKCG", name = "q", descriptor = "Z")
    public boolean field1394 = true;

    @OriginalMember(owner = "client!RGMKWKCG", name = "a", descriptor = "I")
    private static int field1378;

    @OriginalMember(owner = "client!RGMKWKCG", name = "b", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!RGMKWKCG", name = "d", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!RGMKWKCG", name = "g", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!RGMKWKCG", name = "h", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!RGMKWKCG", name = "k", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!RGMKWKCG", name = "m", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!RGMKWKCG", name = "n", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!RGMKWKCG", name = "f", descriptor = "Ljava/lang/String;")
    public String field1383;

    @OriginalMember(owner = "client!RGMKWKCG", name = "e", descriptor = "[I")
    public static int[] field1382;

    @OriginalMember(owner = "client!RGMKWKCG", name = "c", descriptor = "[LRGMKWKCG;")
    public static class51[] field1380;

    @OriginalMember(owner = "client!RGMKWKCG", name = "a", descriptor = "(BLJUPFHAZZ;)V")
    public static void method474(byte arg0, class32 arg1) {
        class59 var2 = new class59(859, arg1.method372("varp.dat", null));
        field1381 = 0;
        field1379 = var2.method531();
        if (arg0 != -3) {
            field1378 = -387;
        }
        if (field1380 == null) {
            field1380 = new class51[field1379];
        }
        if (field1382 == null) {
            field1382 = new int[field1379];
        }
        for (int var3 = 0; var3 < field1379; var3++) {
            if (field1380[var3] == null) {
                field1380[var3] = new class51();
            }
            field1380[var3].method475(var2, 0, var3);
        }
        if (var2.field1588.length != var2.field1589) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!RGMKWKCG", name = "a", descriptor = "(LTKPFKOXP;II)V")
    public void method475(class59 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method529();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1384 = arg0.method529();
            } else if (var5 == 2) {
                this.field1385 = arg0.method529();
            } else if (var5 == 3) {
                this.field1386 = true;
                field1382[field1381++] = arg2;
            } else if (var5 == 4) {
                this.field1387 = false;
            } else if (var5 == 5) {
                this.field1388 = arg0.method531();
            } else if (var5 == 6) {
                this.field1389 = true;
            } else if (var5 == 7) {
                this.field1390 = arg0.method534();
            } else if (var5 == 8) {
                this.field1391 = 1;
                this.field1392 = true;
            } else if (var5 == 10) {
                this.field1383 = arg0.method536();
            } else if (var5 == 11) {
                this.field1392 = true;
            } else if (var5 == 12) {
                this.field1393 = arg0.method534();
            } else if (var5 == 13) {
                this.field1391 = 2;
                this.field1392 = true;
            } else if (var5 == 14) {
                this.field1394 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
