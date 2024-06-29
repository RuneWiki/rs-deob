import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SLGAFVQN")
public class class51 {

    @OriginalMember(owner = "client!SLGAFVQN", name = "i", descriptor = "Z")
    public boolean field1378 = false;

    @OriginalMember(owner = "client!SLGAFVQN", name = "j", descriptor = "Z")
    public boolean field1379 = true;

    @OriginalMember(owner = "client!SLGAFVQN", name = "l", descriptor = "Z")
    public boolean field1381 = false;

    @OriginalMember(owner = "client!SLGAFVQN", name = "o", descriptor = "Z")
    public boolean field1384 = false;

    @OriginalMember(owner = "client!SLGAFVQN", name = "p", descriptor = "I")
    public int field1385 = -1;

    @OriginalMember(owner = "client!SLGAFVQN", name = "q", descriptor = "Z")
    public boolean field1386 = true;

    @OriginalMember(owner = "client!SLGAFVQN", name = "a", descriptor = "Z")
    private static boolean field1370 = true;

    @OriginalMember(owner = "client!SLGAFVQN", name = "b", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!SLGAFVQN", name = "d", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!SLGAFVQN", name = "g", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!SLGAFVQN", name = "h", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!SLGAFVQN", name = "k", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!SLGAFVQN", name = "m", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!SLGAFVQN", name = "n", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!SLGAFVQN", name = "f", descriptor = "Ljava/lang/String;")
    public String field1375;

    @OriginalMember(owner = "client!SLGAFVQN", name = "e", descriptor = "[I")
    public static int[] field1374;

    @OriginalMember(owner = "client!SLGAFVQN", name = "c", descriptor = "[LSLGAFVQN;")
    public static class51[] field1372;

    @OriginalMember(owner = "client!SLGAFVQN", name = "a", descriptor = "(BLRPFMUSNN;)V")
    public static void method421(byte arg0, class49 arg1) {
        class63 var2 = new class63((byte) -58, arg1.method414("varp.dat", null));
        field1373 = 0;
        field1371 = var2.method504();
        if (arg0 != -114) {
            return;
        }
        if (field1372 == null) {
            field1372 = new class51[field1371];
        }
        if (field1374 == null) {
            field1374 = new int[field1371];
        }
        for (int var3 = 0; var3 < field1371; var3++) {
            if (field1372[var3] == null) {
                field1372[var3] = new class51();
            }
            field1372[var3].method422(var3, var2, field1370);
        }
        if (var2.field1570.length != var2.field1571) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!SLGAFVQN", name = "a", descriptor = "(ILWNCFPLWV;Z)V")
    public void method422(int arg0, class63 arg1, boolean arg2) {
        if (!arg2) {
            field1370 = !field1370;
        }
        while (true) {
            int var4 = arg1.method502();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1376 = arg1.method502();
            } else if (var4 == 2) {
                this.field1377 = arg1.method502();
            } else if (var4 == 3) {
                this.field1378 = true;
                field1374[field1373++] = arg0;
            } else if (var4 == 4) {
                this.field1379 = false;
            } else if (var4 == 5) {
                this.field1380 = arg1.method504();
            } else if (var4 == 6) {
                this.field1381 = true;
            } else if (var4 == 7) {
                this.field1382 = arg1.method507();
            } else if (var4 == 8) {
                this.field1383 = 1;
                this.field1384 = true;
            } else if (var4 == 10) {
                this.field1375 = arg1.method509();
            } else if (var4 == 11) {
                this.field1384 = true;
            } else if (var4 == 12) {
                this.field1385 = arg1.method507();
            } else if (var4 == 13) {
                this.field1383 = 2;
                this.field1384 = true;
            } else if (var4 == 14) {
                this.field1386 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
