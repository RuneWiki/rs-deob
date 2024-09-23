import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YMQGRGSI")
public class class68 {

    @OriginalMember(owner = "YMQGRGSI", name = "a", descriptor = "I")
    private int field1627 = 16191;

    @OriginalMember(owner = "YMQGRGSI", name = "b", descriptor = "Z")
    private boolean field1628 = true;

    @OriginalMember(owner = "YMQGRGSI", name = "e", descriptor = "Z")
    private boolean field1631 = true;

    @OriginalMember(owner = "YMQGRGSI", name = "h", descriptor = "I")
    public int field1634 = -1;

    @OriginalMember(owner = "YMQGRGSI", name = "j", descriptor = "[I")
    public int[] field1636 = new int[6];

    @OriginalMember(owner = "YMQGRGSI", name = "k", descriptor = "[I")
    public int[] field1637 = new int[6];

    @OriginalMember(owner = "YMQGRGSI", name = "l", descriptor = "[I")
    public int[] field1638 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "YMQGRGSI", name = "m", descriptor = "Z")
    public boolean field1639 = false;

    @OriginalMember(owner = "YMQGRGSI", name = "c", descriptor = "I")
    private static int field1629;

    @OriginalMember(owner = "YMQGRGSI", name = "d", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "YMQGRGSI", name = "f", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "YMQGRGSI", name = "i", descriptor = "[I")
    public int[] field1635;

    @OriginalMember(owner = "YMQGRGSI", name = "g", descriptor = "[LYMQGRGSI;")
    public static class68[] field1633;

    @OriginalMember(owner = "YMQGRGSI", name = "a", descriptor = "(ILSPZBTZXL;)V")
    public static void method568(int arg0, class51 arg1) {
        class34 var2 = new class34(arg1.method515("idk.dat", null), field1629);
        field1632 = var2.method404();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1633 == null) {
            field1633 = new class68[field1632];
        }
        for (int var4 = 0; var4 < field1632; var4++) {
            if (field1633[var4] == null) {
                field1633[var4] = new class68();
            }
            field1633[var4].method569(var2, 16191);
        }
    }

    @OriginalMember(owner = "YMQGRGSI", name = "a", descriptor = "(LLDILQFVA;I)V")
    public void method569(class34 arg0, int arg1) {
        if (this.field1627 != arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method402();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1634 = arg0.method402();
                } else if (var3 == 2) {
                    int var4 = arg0.method402();
                    this.field1635 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1635[var5] = arg0.method404();
                    }
                } else if (var3 == 3) {
                    this.field1639 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1636[var3 - 40] = arg0.method404();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1637[var3 - 50] = arg0.method404();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1638[var3 - 60] = arg0.method404();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "YMQGRGSI", name = "a", descriptor = "(I)Z")
    public boolean method570(int arg0) {
        if (this.field1635 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 >= 0) {
            this.field1628 = !this.field1628;
        }
        for (int var3 = 0; var3 < this.field1635.length; var3++) {
            if (!class27.method323(this.field1635[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "YMQGRGSI", name = "b", descriptor = "(I)LHEQROJXW;")
    public class27 method571(int arg0) {
        if (this.field1635 == null) {
            return null;
        }
        class27[] var2 = new class27[this.field1635.length];
        int var3 = 37 / arg0;
        for (int var4 = 0; var4 < this.field1635.length; var4++) {
            var2[var4] = class27.method322(this.field1635[var4], (byte) 71);
        }
        class27 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class27((byte) 6, var2.length, var2);
        }
        for (int var6 = 0; var6 < 6 && this.field1636[var6] != 0; var6++) {
            var5.method336(this.field1636[var6], this.field1637[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "YMQGRGSI", name = "a", descriptor = "(Z)Z")
    public boolean method572(boolean arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1638[var3] != -1 && !class27.method323(this.field1638[var3])) {
                var2 = false;
            }
        }
        if (arg0) {
            this.field1630 = 334;
        }
        return var2;
    }

    @OriginalMember(owner = "YMQGRGSI", name = "b", descriptor = "(Z)LHEQROJXW;")
    public class27 method573(boolean arg0) {
        class27[] var2 = new class27[5];
        int var3 = 0;
        if (!arg0) {
            this.field1628 = !this.field1628;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1638[var4] != -1) {
                var2[var3++] = class27.method322(this.field1638[var4], (byte) 71);
            }
        }
        class27 var5 = new class27((byte) 6, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field1636[var6] != 0; var6++) {
            var5.method336(this.field1636[var6], this.field1637[var6]);
        }
        return var5;
    }
}
