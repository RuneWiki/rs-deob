import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QRYQWAHS")
public class class43 {

    @OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "I")
    private int field1167 = 8;

    @OriginalMember(owner = "client!QRYQWAHS", name = "b", descriptor = "Z")
    private boolean field1168 = false;

    @OriginalMember(owner = "client!QRYQWAHS", name = "c", descriptor = "I")
    private int field1169 = 9;

    @OriginalMember(owner = "client!QRYQWAHS", name = "d", descriptor = "I")
    private int field1170 = 155;

    @OriginalMember(owner = "client!QRYQWAHS", name = "g", descriptor = "I")
    public int field1173 = -1;

    @OriginalMember(owner = "client!QRYQWAHS", name = "i", descriptor = "[I")
    public int[] field1175 = new int[6];

    @OriginalMember(owner = "client!QRYQWAHS", name = "j", descriptor = "[I")
    public int[] field1176 = new int[6];

    @OriginalMember(owner = "client!QRYQWAHS", name = "k", descriptor = "[I")
    public int[] field1177 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!QRYQWAHS", name = "l", descriptor = "Z")
    public boolean field1178 = false;

    @OriginalMember(owner = "client!QRYQWAHS", name = "e", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!QRYQWAHS", name = "h", descriptor = "[I")
    public int[] field1174;

    @OriginalMember(owner = "client!QRYQWAHS", name = "f", descriptor = "[LQRYQWAHS;")
    public static class43[] field1172;

    @OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "(ILMAARFNGV;)V")
    public static void method373(int arg0, class29 arg1) {
        class14 var2 = new class14(arg1.method332("idk.dat", null), true);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1171 = var2.method219();
        if (field1172 == null) {
            field1172 = new class43[field1171];
        }
        for (int var4 = 0; var4 < field1171; var4++) {
            if (field1172[var4] == null) {
                field1172[var4] = new class43();
            }
            field1172[var4].method374(1016, var2);
        }
    }

    @OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public void method374(int arg0, class14 arg1) {
        if (arg0 != 1016) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method217();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1173 = arg1.method217();
                } else if (var3 == 2) {
                    int var4 = arg1.method217();
                    this.field1174 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1174[var5] = arg1.method219();
                    }
                } else if (var3 == 3) {
                    this.field1178 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1175[var3 - 40] = arg1.method219();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1176[var3 - 50] = arg1.method219();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1177[var3 - 60] = arg1.method219();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "(I)Z")
    public boolean method375(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        } else if (this.field1174 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1174.length; var3++) {
                if (!class18.method268(this.field1174[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!QRYQWAHS", name = "b", descriptor = "(I)LIEHKDFMR;")
    public class18 method376(int arg0) {
        if (this.field1174 == null) {
            return null;
        }
        class18[] var2 = new class18[this.field1174.length];
        for (int var3 = 0; var3 < this.field1174.length; var3++) {
            var2[var3] = class18.method267(this.field1174[var3]);
        }
        class18 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class18(var2, this.field1167, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1175[var5] != 0; var5++) {
            var4.method281(this.field1175[var5], this.field1176[var5]);
        }
        if (this.field1169 != arg0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!QRYQWAHS", name = "c", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        boolean var2 = true;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1177[var3] != -1 && !class18.method268(this.field1177[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!QRYQWAHS", name = "d", descriptor = "(I)LIEHKDFMR;")
    public class18 method378(int arg0) {
        class18[] var2 = new class18[5];
        if (arg0 != 37587) {
            this.field1168 = !this.field1168;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1177[var4] != -1) {
                var2[var3++] = class18.method267(this.field1177[var4]);
            }
        }
        class18 var5 = new class18(var2, this.field1167, var3);
        for (int var6 = 0; var6 < 6 && this.field1175[var6] != 0; var6++) {
            var5.method281(this.field1175[var6], this.field1176[var6]);
        }
        return var5;
    }
}
