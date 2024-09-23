import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SNGXEJOJ")
public class class55 {

    @OriginalMember(owner = "SNGXEJOJ", name = "c", descriptor = "I")
    private int field1420 = 734;

    @OriginalMember(owner = "SNGXEJOJ", name = "h", descriptor = "I")
    public int field1425 = -1;

    @OriginalMember(owner = "SNGXEJOJ", name = "j", descriptor = "[I")
    public int[] field1427 = new int[6];

    @OriginalMember(owner = "SNGXEJOJ", name = "k", descriptor = "[I")
    public int[] field1428 = new int[6];

    @OriginalMember(owner = "SNGXEJOJ", name = "l", descriptor = "I")
    public int field1429 = 128;

    @OriginalMember(owner = "SNGXEJOJ", name = "m", descriptor = "I")
    public int field1430 = 128;

    @OriginalMember(owner = "SNGXEJOJ", name = "a", descriptor = "I")
    private static int field1418 = 8;

    @OriginalMember(owner = "SNGXEJOJ", name = "b", descriptor = "Z")
    private static boolean field1419 = true;

    @OriginalMember(owner = "SNGXEJOJ", name = "q", descriptor = "LRUNMBJUO;")
    public static class51 field1434 = new class51(30, false);

    @OriginalMember(owner = "SNGXEJOJ", name = "d", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "SNGXEJOJ", name = "f", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "SNGXEJOJ", name = "g", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "SNGXEJOJ", name = "n", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "SNGXEJOJ", name = "o", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "SNGXEJOJ", name = "p", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "SNGXEJOJ", name = "i", descriptor = "LTLXFHCOO;")
    public class58 field1426;

    @OriginalMember(owner = "SNGXEJOJ", name = "e", descriptor = "[LSNGXEJOJ;")
    public static class55[] field1422;

    @OriginalMember(owner = "SNGXEJOJ", name = "a", descriptor = "(LFIGUVTWB;Z)V")
    public static void method476(class15 arg0, boolean arg1) {
        if (arg1) {
            field1419 = !field1419;
        }
        class33 var2 = new class33(field1418, arg0.method209("spotanim.dat", null));
        field1421 = var2.method294();
        if (field1422 == null) {
            field1422 = new class55[field1421];
        }
        for (int var3 = 0; var3 < field1421; var3++) {
            if (field1422[var3] == null) {
                field1422[var3] = new class55();
            }
            field1422[var3].field1423 = var3;
            field1422[var3].method477(var2, false);
        }
    }

    @OriginalMember(owner = "SNGXEJOJ", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public void method477(class33 arg0, boolean arg1) {
        if (arg1) {
            this.field1420 = -96;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method292();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1424 = arg0.method294();
                } else if (var3 == 2) {
                    this.field1425 = arg0.method294();
                    if (class58.field1453 != null) {
                        this.field1426 = class58.field1453[this.field1425];
                    }
                } else if (var3 == 4) {
                    this.field1429 = arg0.method294();
                } else if (var3 == 5) {
                    this.field1430 = arg0.method294();
                } else if (var3 == 6) {
                    this.field1431 = arg0.method294();
                } else if (var3 == 7) {
                    this.field1432 = arg0.method292();
                } else if (var3 == 8) {
                    this.field1433 = arg0.method292();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1427[var3 - 40] = arg0.method294();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1428[var3 - 50] = arg0.method294();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "SNGXEJOJ", name = "a", descriptor = "()LNJPATAFL;")
    public class35 method478() {
        class35 var1 = (class35) field1434.method450((long) this.field1423);
        if (var1 != null) {
            return var1;
        }
        class35 var2 = class35.method334(this.field1424, 14700);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1427[0] != 0) {
                var2.method348(this.field1427[var3], this.field1428[var3]);
            }
        }
        field1434.method451((long) this.field1423, var2, false);
        return var2;
    }
}
