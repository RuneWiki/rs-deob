import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XPVGEAJJ")
public class class64 {

    @OriginalMember(owner = "client!XPVGEAJJ", name = "c", descriptor = "I")
    public int field1599 = -1;

    @OriginalMember(owner = "client!XPVGEAJJ", name = "e", descriptor = "[I")
    public int[] field1601 = new int[6];

    @OriginalMember(owner = "client!XPVGEAJJ", name = "f", descriptor = "[I")
    public int[] field1602 = new int[6];

    @OriginalMember(owner = "client!XPVGEAJJ", name = "g", descriptor = "[I")
    public int[] field1603 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!XPVGEAJJ", name = "h", descriptor = "Z")
    public boolean field1604 = false;

    @OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!XPVGEAJJ", name = "d", descriptor = "[I")
    public int[] field1600;

    @OriginalMember(owner = "client!XPVGEAJJ", name = "b", descriptor = "[LXPVGEAJJ;")
    public static class64[] field1598;

    @OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(ZLAKPFVPPG;)V")
    public static void method538(boolean arg0, class2 arg1) {
        class13 var2 = new class13(arg1.method7("idk.dat", null), (byte) 3);
        field1597 = var2.method215();
        if (!arg0) {
            return;
        }
        if (field1598 == null) {
            field1598 = new class64[field1597];
        }
        for (int var3 = 0; var3 < field1597; var3++) {
            if (field1598[var3] == null) {
                field1598[var3] = new class64();
            }
            field1598[var3].method539(var2, 799);
        }
    }

    @OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(LFTMSICIZ;I)V")
    public void method539(class13 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method213();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1599 = arg0.method213();
                } else if (var4 == 2) {
                    int var5 = arg0.method213();
                    this.field1600 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1600[var6] = arg0.method215();
                    }
                } else if (var4 == 3) {
                    this.field1604 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1601[var4 - 40] = arg0.method215();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1602[var4 - 50] = arg0.method215();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1603[var4 - 60] = arg0.method215();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(Z)Z")
    public boolean method540(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1600 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1600.length; var4++) {
            if (!class28.method331(this.field1600[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(I)LKUGNQTGL;")
    public class28 method541(int arg0) {
        if (this.field1600 == null) {
            return null;
        }
        class28[] var2 = new class28[this.field1600.length];
        for (int var3 = 0; var3 < this.field1600.length; var3++) {
            var2[var3] = class28.method330(this.field1600[var3]);
        }
        class28 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class28(var2.length, var2, 127);
        }
        for (int var5 = 0; var5 < 6 && this.field1601[var5] != 0; var5++) {
            var4.method344(this.field1601[var5], this.field1602[var5]);
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!XPVGEAJJ", name = "b", descriptor = "(I)Z")
    public boolean method542(int arg0) {
        boolean var2 = true;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1603[var3] != -1 && !class28.method331(this.field1603[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!XPVGEAJJ", name = "b", descriptor = "(Z)LKUGNQTGL;")
    public class28 method543(boolean arg0) {
        class28[] var2 = new class28[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1603[var4] != -1) {
                var2[var3++] = class28.method330(this.field1603[var4]);
            }
        }
        class28 var5 = new class28(var3, var2, 127);
        for (int var6 = 0; var6 < 6 && this.field1601[var6] != 0; var6++) {
            var5.method344(this.field1601[var6], this.field1602[var6]);
        }
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!XPVGEAJJ", name = "<init>", descriptor = "()V")
    public class64() {
        if (class41.field1195) {
        }
    }
}
