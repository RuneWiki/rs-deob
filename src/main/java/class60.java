import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XAYNDIOJ")
public class class60 {

    @OriginalMember(owner = "XAYNDIOJ", name = "a", descriptor = "B")
    private byte field1469 = 44;

    @OriginalMember(owner = "XAYNDIOJ", name = "d", descriptor = "I")
    public int field1472 = -1;

    @OriginalMember(owner = "XAYNDIOJ", name = "f", descriptor = "[I")
    public int[] field1474 = new int[6];

    @OriginalMember(owner = "XAYNDIOJ", name = "g", descriptor = "[I")
    public int[] field1475 = new int[6];

    @OriginalMember(owner = "XAYNDIOJ", name = "h", descriptor = "[I")
    public int[] field1476 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "XAYNDIOJ", name = "i", descriptor = "Z")
    public boolean field1477 = false;

    @OriginalMember(owner = "XAYNDIOJ", name = "b", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "XAYNDIOJ", name = "e", descriptor = "[I")
    public int[] field1473;

    @OriginalMember(owner = "XAYNDIOJ", name = "c", descriptor = "[LXAYNDIOJ;")
    public static class60[] field1471;

    @OriginalMember(owner = "XAYNDIOJ", name = "a", descriptor = "(LOTSGNSQM;Z)V")
    public static void method508(class41 arg0, boolean arg1) {
        class68 var2 = new class68(arg0.method376("idk.dat", null), -103);
        field1470 = var2.method551();
        if (field1471 == null) {
            field1471 = new class60[field1470];
        }
        for (int var3 = 0; var3 < field1470; var3++) {
            if (field1471[var3] == null) {
                field1471[var3] = new class60();
            }
            field1471[var3].method509((byte) 44, var2);
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "XAYNDIOJ", name = "a", descriptor = "(BLYOXDZEVD;)V")
    public void method509(byte arg0, class68 arg1) {
        if (this.field1469 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method549();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1472 = arg1.method549();
                } else if (var3 == 2) {
                    int var4 = arg1.method549();
                    this.field1473 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1473[var5] = arg1.method551();
                    }
                } else if (var3 == 3) {
                    this.field1477 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1474[var3 - 40] = arg1.method551();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1475[var3 - 50] = arg1.method551();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1476[var3 - 60] = arg1.method551();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "XAYNDIOJ", name = "a", descriptor = "(I)Z")
    public boolean method510(int arg0) {
        if (arg0 != 48283) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1473 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1473.length; var4++) {
            if (!class39.method347(this.field1473[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "XAYNDIOJ", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public class39 method511(boolean arg0) {
        if (this.field1473 == null) {
            return null;
        }
        class39[] var2 = new class39[this.field1473.length];
        for (int var3 = 0; var3 < this.field1473.length; var3++) {
            var2[var3] = class39.method346(true, this.field1473[var3]);
        }
        class39 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class39(var2, (byte) 0, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1474[var5] != 0; var5++) {
            var4.method360(this.field1474[var5], this.field1475[var5]);
        }
        if (arg0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "XAYNDIOJ", name = "b", descriptor = "(I)Z")
    public boolean method512(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1476[var4] != -1 && !class39.method347(this.field1476[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "XAYNDIOJ", name = "c", descriptor = "(I)LOIBEFFXI;")
    public class39 method513(int arg0) {
        class39[] var2 = new class39[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1476[var4] != -1) {
                var2[var3++] = class39.method346(true, this.field1476[var4]);
            }
        }
        class39 var5 = new class39(var2, (byte) 0, var3);
        for (int var6 = 0; var6 < 6 && this.field1474[var6] != 0; var6++) {
            var5.method360(this.field1474[var6], this.field1475[var6]);
        }
        if (arg0 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "XAYNDIOJ", name = "<init>", descriptor = "()V")
    public class60() {
        if (class72.field1713) {
        }
    }
}
