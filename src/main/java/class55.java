import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TGIKVGNH")
public class class55 {

    @OriginalMember(owner = "TGIKVGNH", name = "a", descriptor = "Z")
    private boolean field1364 = true;

    @OriginalMember(owner = "TGIKVGNH", name = "g", descriptor = "I")
    public int field1370 = -1;

    @OriginalMember(owner = "TGIKVGNH", name = "i", descriptor = "[I")
    public int[] field1372 = new int[6];

    @OriginalMember(owner = "TGIKVGNH", name = "j", descriptor = "[I")
    public int[] field1373 = new int[6];

    @OriginalMember(owner = "TGIKVGNH", name = "k", descriptor = "I")
    public int field1374 = 128;

    @OriginalMember(owner = "TGIKVGNH", name = "l", descriptor = "I")
    public int field1375 = 128;

    @OriginalMember(owner = "TGIKVGNH", name = "b", descriptor = "I")
    private static int field1365 = 868;

    @OriginalMember(owner = "TGIKVGNH", name = "p", descriptor = "LDSMCVRKW;")
    public static class15 field1379 = new class15((byte) 7, 30);

    @OriginalMember(owner = "TGIKVGNH", name = "c", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "TGIKVGNH", name = "e", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "TGIKVGNH", name = "f", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "TGIKVGNH", name = "m", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "TGIKVGNH", name = "n", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "TGIKVGNH", name = "o", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "TGIKVGNH", name = "h", descriptor = "LODMBIHRM;")
    public class41 field1371;

    @OriginalMember(owner = "TGIKVGNH", name = "d", descriptor = "[LTGIKVGNH;")
    public static class55[] field1367;

    @OriginalMember(owner = "TGIKVGNH", name = "a", descriptor = "(ILBBMKAXRK;)V")
    public static void method459(int arg0, class6 arg1) {
        class17 var2 = new class17(arg1.method30("spotanim.dat", null), -26583);
        field1366 = var2.method226();
        if (field1367 == null) {
            field1367 = new class55[field1366];
        }
        for (int var3 = 0; var3 < field1366; var3++) {
            if (field1367[var3] == null) {
                field1367[var3] = new class55();
            }
            field1367[var3].field1368 = var3;
            field1367[var3].method460(var2, (byte) -50);
        }
        while (arg0 >= 0) {
            field1365 = -98;
        }
    }

    @OriginalMember(owner = "TGIKVGNH", name = "a", descriptor = "(LEILHLJCE;B)V")
    public void method460(class17 arg0, byte arg1) {
        if (arg1 != -50) {
            this.field1364 = !this.field1364;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1369 = arg0.method226();
                } else if (var3 == 2) {
                    this.field1370 = arg0.method226();
                    if (class41.field1184 != null) {
                        this.field1371 = class41.field1184[this.field1370];
                    }
                } else if (var3 == 4) {
                    this.field1374 = arg0.method226();
                } else if (var3 == 5) {
                    this.field1375 = arg0.method226();
                } else if (var3 == 6) {
                    this.field1376 = arg0.method226();
                } else if (var3 == 7) {
                    this.field1377 = arg0.method224();
                } else if (var3 == 8) {
                    this.field1378 = arg0.method224();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1372[var3 - 40] = arg0.method226();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1373[var3 - 50] = arg0.method226();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "TGIKVGNH", name = "a", descriptor = "()LKBEXSZSN;")
    public class31 method461() {
        class31 var1 = (class31) field1379.method197((long) this.field1368);
        if (var1 != null) {
            return var1;
        }
        class31 var2 = class31.method339(this.field1369);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1372[0] != 0) {
                var2.method353(this.field1372[var3], this.field1373[var3]);
            }
        }
        field1379.method198((byte) 7, (long) this.field1368, var2);
        return var2;
    }
}
