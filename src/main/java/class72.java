import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZWYXHQWS")
public class class72 {

    @OriginalMember(owner = "ZWYXHQWS", name = "a", descriptor = "I")
    private int field1752 = 47202;

    @OriginalMember(owner = "ZWYXHQWS", name = "b", descriptor = "Z")
    private boolean field1753 = false;

    @OriginalMember(owner = "ZWYXHQWS", name = "e", descriptor = "I")
    public int field1756 = -1;

    @OriginalMember(owner = "ZWYXHQWS", name = "g", descriptor = "[I")
    public int[] field1758 = new int[6];

    @OriginalMember(owner = "ZWYXHQWS", name = "h", descriptor = "[I")
    public int[] field1759 = new int[6];

    @OriginalMember(owner = "ZWYXHQWS", name = "i", descriptor = "[I")
    public int[] field1760 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "ZWYXHQWS", name = "j", descriptor = "Z")
    public boolean field1761 = false;

    @OriginalMember(owner = "ZWYXHQWS", name = "c", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "ZWYXHQWS", name = "f", descriptor = "[I")
    public int[] field1757;

    @OriginalMember(owner = "ZWYXHQWS", name = "d", descriptor = "[LZWYXHQWS;")
    public static class72[] field1755;

    @OriginalMember(owner = "ZWYXHQWS", name = "a", descriptor = "(ILTKEGJSFV;)V")
    public static void method595(int arg0, class58 arg1) {
        if (arg0 != 0) {
            return;
        }
        class15 var2 = new class15(arg1.method542("idk.dat", null), false);
        field1754 = var2.method263();
        if (field1755 == null) {
            field1755 = new class72[field1754];
        }
        for (int var3 = 0; var3 < field1754; var3++) {
            if (field1755[var3] == null) {
                field1755[var3] = new class72();
            }
            field1755[var3].method596(var2, true);
        }
    }

    @OriginalMember(owner = "ZWYXHQWS", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    public void method596(class15 arg0, boolean arg1) {
        if (!arg1) {
            this.field1752 = 251;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method261();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1756 = arg0.method261();
                } else if (var3 == 2) {
                    int var4 = arg0.method261();
                    this.field1757 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1757[var5] = arg0.method263();
                    }
                } else if (var3 == 3) {
                    this.field1761 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1758[var3 - 40] = arg0.method263();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1759[var3 - 50] = arg0.method263();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1760[var3 - 60] = arg0.method263();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "ZWYXHQWS", name = "a", descriptor = "(B)Z")
    public boolean method597(byte arg0) {
        if (this.field1757 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 108) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1757.length; var3++) {
            if (!class32.method355(this.field1757[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ZWYXHQWS", name = "b", descriptor = "(B)LIGXVZOHI;")
    public class32 method598(byte arg0) {
        if (this.field1757 == null) {
            return null;
        }
        class32[] var2 = new class32[this.field1757.length];
        for (int var3 = 0; var3 < this.field1757.length; var3++) {
            var2[var3] = class32.method354(this.field1757[var3]);
        }
        class32 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class32(true, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1758[var5] != 0; var5++) {
            var4.method368(this.field1758[var5], this.field1759[var5]);
        }
        if (arg0 == 5) {
            boolean var6 = false;
        } else {
            this.field1753 = !this.field1753;
        }
        return var4;
    }

    @OriginalMember(owner = "ZWYXHQWS", name = "a", descriptor = "(Z)Z")
    public boolean method599(boolean arg0) {
        if (!arg0) {
            this.field1752 = -234;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1760[var3] != -1 && !class32.method355(this.field1760[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ZWYXHQWS", name = "b", descriptor = "(Z)LIGXVZOHI;")
    public class32 method600(boolean arg0) {
        class32[] var2 = new class32[5];
        int var3 = 0;
        if (!arg0) {
            throw new NullPointerException();
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1760[var4] != -1) {
                var2[var3++] = class32.method354(this.field1760[var4]);
            }
        }
        class32 var5 = new class32(true, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field1758[var6] != 0; var6++) {
            var5.method368(this.field1758[var6], this.field1759[var6]);
        }
        return var5;
    }
}
