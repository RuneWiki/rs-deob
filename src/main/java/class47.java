import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SDNQJNMP")
public class class47 {

    @OriginalMember(owner = "client!SDNQJNMP", name = "f", descriptor = "I")
    public int field1279 = -1;

    @OriginalMember(owner = "client!SDNQJNMP", name = "h", descriptor = "[I")
    public int[] field1281 = new int[6];

    @OriginalMember(owner = "client!SDNQJNMP", name = "i", descriptor = "[I")
    public int[] field1282 = new int[6];

    @OriginalMember(owner = "client!SDNQJNMP", name = "j", descriptor = "I")
    public int field1283 = 128;

    @OriginalMember(owner = "client!SDNQJNMP", name = "k", descriptor = "I")
    public int field1284 = 128;

    @OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "I")
    private static int field1274 = 182;

    @OriginalMember(owner = "client!SDNQJNMP", name = "o", descriptor = "LBVBRKPZH;")
    public static class5 field1288 = new class5(-21657, 30);

    @OriginalMember(owner = "client!SDNQJNMP", name = "b", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!SDNQJNMP", name = "d", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!SDNQJNMP", name = "e", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!SDNQJNMP", name = "l", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!SDNQJNMP", name = "m", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!SDNQJNMP", name = "n", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!SDNQJNMP", name = "g", descriptor = "LVYXELYSX;")
    public class55 field1280;

    @OriginalMember(owner = "client!SDNQJNMP", name = "c", descriptor = "[LSDNQJNMP;")
    public static class47[] field1276;

    @OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "(ILMAARFNGV;)V")
    public static void method394(int arg0, class29 arg1) {
        class14 var2 = new class14(arg1.method332("spotanim.dat", null), true);
        field1275 = var2.method219();
        if (arg0 != 0) {
            field1274 = 460;
        }
        if (field1276 == null) {
            field1276 = new class47[field1275];
        }
        for (int var3 = 0; var3 < field1275; var3++) {
            if (field1276[var3] == null) {
                field1276[var3] = new class47();
            }
            field1276[var3].field1277 = var3;
            field1276[var3].method395(1016, var2);
        }
    }

    @OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public void method395(int arg0, class14 arg1) {
        if (arg0 != 1016) {
            field1274 = -135;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method217();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1278 = arg1.method219();
                } else if (var3 == 2) {
                    this.field1279 = arg1.method219();
                    if (class55.field1444 != null) {
                        this.field1280 = class55.field1444[this.field1279];
                    }
                } else if (var3 == 4) {
                    this.field1283 = arg1.method219();
                } else if (var3 == 5) {
                    this.field1284 = arg1.method219();
                } else if (var3 == 6) {
                    this.field1285 = arg1.method219();
                } else if (var3 == 7) {
                    this.field1286 = arg1.method217();
                } else if (var3 == 8) {
                    this.field1287 = arg1.method217();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1281[var3 - 40] = arg1.method219();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1282[var3 - 50] = arg1.method219();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "()LIEHKDFMR;")
    public class18 method396() {
        class18 var1 = (class18) field1288.method25((long) this.field1277);
        if (var1 != null) {
            return var1;
        }
        class18 var2 = class18.method267(this.field1278);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1281[0] != 0) {
                var2.method281(this.field1281[var3], this.field1282[var3]);
            }
        }
        field1288.method26((byte) 0, (long) this.field1277, var2);
        return var2;
    }
}
