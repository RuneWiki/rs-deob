import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NQIAMATB")
public class class32 {

    @OriginalMember(owner = "NQIAMATB", name = "a", descriptor = "Z")
    private boolean field1110 = true;

    @OriginalMember(owner = "NQIAMATB", name = "b", descriptor = "B")
    private byte field1111 = 9;

    @OriginalMember(owner = "NQIAMATB", name = "g", descriptor = "I")
    public int field1116 = -1;

    @OriginalMember(owner = "NQIAMATB", name = "i", descriptor = "[I")
    public int[] field1118 = new int[6];

    @OriginalMember(owner = "NQIAMATB", name = "j", descriptor = "[I")
    public int[] field1119 = new int[6];

    @OriginalMember(owner = "NQIAMATB", name = "k", descriptor = "[I")
    public int[] field1120 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "NQIAMATB", name = "l", descriptor = "Z")
    public boolean field1121 = false;

    @OriginalMember(owner = "NQIAMATB", name = "d", descriptor = "I")
    private static int field1113 = -389;

    @OriginalMember(owner = "NQIAMATB", name = "c", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "NQIAMATB", name = "e", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "NQIAMATB", name = "h", descriptor = "[I")
    public int[] field1117;

    @OriginalMember(owner = "NQIAMATB", name = "f", descriptor = "[LNQIAMATB;")
    public static class32[] field1115;

    @OriginalMember(owner = "NQIAMATB", name = "a", descriptor = "(LGWOEELWB;B)V")
    public static void method336(class18 arg0, byte arg1) {
        class30 var2 = new class30(true, arg0.method249("idk.dat", null));
        if (arg1 != 3) {
            field1113 = 41;
        }
        field1114 = var2.method298();
        if (field1115 == null) {
            field1115 = new class32[field1114];
        }
        for (int var3 = 0; var3 < field1114; var3++) {
            if (field1115[var3] == null) {
                field1115[var3] = new class32();
            }
            field1115[var3].method337(var2, (byte) 2);
        }
    }

    @OriginalMember(owner = "NQIAMATB", name = "a", descriptor = "(LMLYYHULT;B)V")
    public void method337(class30 arg0, byte arg1) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method296();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1116 = arg0.method296();
                } else if (var3 == 2) {
                    int var4 = arg0.method296();
                    this.field1117 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1117[var5] = arg0.method298();
                    }
                } else if (var3 == 3) {
                    this.field1121 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1118[var3 - 40] = arg0.method298();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1119[var3 - 50] = arg0.method298();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1120[var3 - 60] = arg0.method298();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "NQIAMATB", name = "a", descriptor = "(I)Z")
    public boolean method338(int arg0) {
        if (this.field1117 == null) {
            return true;
        }
        boolean var2 = true;
        while (arg0 >= 0) {
            this.field1112 = 188;
        }
        for (int var3 = 0; var3 < this.field1117.length; var3++) {
            if (!class3.method12(this.field1117[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "NQIAMATB", name = "b", descriptor = "(I)LCADBNSXE;")
    public class3 method339(int arg0) {
        if (arg0 != 0) {
            this.field1112 = 375;
        }
        if (this.field1117 == null) {
            return null;
        }
        class3[] var2 = new class3[this.field1117.length];
        for (int var3 = 0; var3 < this.field1117.length; var3++) {
            var2[var3] = class3.method11(this.field1117[var3]);
        }
        class3 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class3(var2, var2.length, 337);
        }
        for (int var5 = 0; var5 < 6 && this.field1118[var5] != 0; var5++) {
            var4.method25(this.field1118[var5], this.field1119[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "NQIAMATB", name = "c", descriptor = "(I)Z")
    public boolean method340(int arg0) {
        int var2 = 98 / arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1120[var4] != -1 && !class3.method12(this.field1120[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "NQIAMATB", name = "a", descriptor = "(B)LCADBNSXE;")
    public class3 method341(byte arg0) {
        class3[] var2 = new class3[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1120[var4] != -1) {
                var2[var3++] = class3.method11(this.field1120[var4]);
            }
        }
        if (this.field1111 == arg0) {
            boolean var5 = false;
        } else {
            this.field1110 = !this.field1110;
        }
        class3 var6 = new class3(var2, var3, 337);
        for (int var7 = 0; var7 < 6 && this.field1118[var7] != 0; var7++) {
            var6.method25(this.field1118[var7], this.field1119[var7]);
        }
        return var6;
    }
}
