import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TYXORIIC")
public class class54 {

    @OriginalMember(owner = "client!TYXORIIC", name = "e", descriptor = "I")
    public int field1410 = -1;

    @OriginalMember(owner = "client!TYXORIIC", name = "g", descriptor = "[I")
    public int[] field1412 = new int[6];

    @OriginalMember(owner = "client!TYXORIIC", name = "h", descriptor = "[I")
    public int[] field1413 = new int[6];

    @OriginalMember(owner = "client!TYXORIIC", name = "i", descriptor = "I")
    public int field1414 = 128;

    @OriginalMember(owner = "client!TYXORIIC", name = "j", descriptor = "I")
    public int field1415 = 128;

    @OriginalMember(owner = "client!TYXORIIC", name = "n", descriptor = "LDSCQIAPU;")
    public static class8 field1419 = new class8(401, 30);

    @OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!TYXORIIC", name = "c", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!TYXORIIC", name = "d", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!TYXORIIC", name = "k", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!TYXORIIC", name = "l", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!TYXORIIC", name = "m", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!TYXORIIC", name = "f", descriptor = "LPVVHTYPN;")
    public class41 field1411;

    @OriginalMember(owner = "client!TYXORIIC", name = "b", descriptor = "[LTYXORIIC;")
    public static class54[] field1407;

    @OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "(BLRPFMUSNN;)V")
    public static void method434(byte arg0, class49 arg1) {
        if (arg0 != -114) {
            return;
        }
        class63 var2 = new class63((byte) -58, arg1.method414("spotanim.dat", null));
        field1406 = var2.method504();
        if (field1407 == null) {
            field1407 = new class54[field1406];
        }
        for (int var3 = 0; var3 < field1406; var3++) {
            if (field1407[var3] == null) {
                field1407[var3] = new class54();
            }
            field1407[var3].field1408 = var3;
            field1407[var3].method435(-934, var2);
        }
    }

    @OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "(ILWNCFPLWV;)V")
    public void method435(int arg0, class63 arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method502();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1409 = arg1.method504();
                } else if (var3 == 2) {
                    this.field1410 = arg1.method504();
                    if (class41.field1147 != null) {
                        this.field1411 = class41.field1147[this.field1410];
                    }
                } else if (var3 == 4) {
                    this.field1414 = arg1.method504();
                } else if (var3 == 5) {
                    this.field1415 = arg1.method504();
                } else if (var3 == 6) {
                    this.field1416 = arg1.method504();
                } else if (var3 == 7) {
                    this.field1417 = arg1.method502();
                } else if (var3 == 8) {
                    this.field1418 = arg1.method502();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1412[var3 - 40] = arg1.method504();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1413[var3 - 50] = arg1.method504();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "()LUNLYQRUD;")
    public class56 method436() {
        class56 var1 = (class56) field1419.method179((long) this.field1408);
        if (var1 != null) {
            return var1;
        }
        class56 var2 = class56.method442(this.field1409);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1412[0] != 0) {
                var2.method456(this.field1412[var3], this.field1413[var3]);
            }
        }
        field1419.method180(true, var2, (long) this.field1408);
        return var2;
    }
}
