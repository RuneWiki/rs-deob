import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WINORGIB")
public class class63 {

    @OriginalMember(owner = "client!WINORGIB", name = "b", descriptor = "I")
    private int field1611 = 178;

    @OriginalMember(owner = "client!WINORGIB", name = "e", descriptor = "I")
    public int field1614 = -1;

    @OriginalMember(owner = "client!WINORGIB", name = "g", descriptor = "[I")
    public int[] field1616 = new int[6];

    @OriginalMember(owner = "client!WINORGIB", name = "h", descriptor = "[I")
    public int[] field1617 = new int[6];

    @OriginalMember(owner = "client!WINORGIB", name = "i", descriptor = "[I")
    public int[] field1618 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!WINORGIB", name = "j", descriptor = "Z")
    public boolean field1619 = false;

    @OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "Z")
    private static boolean field1610 = true;

    @OriginalMember(owner = "client!WINORGIB", name = "c", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!WINORGIB", name = "f", descriptor = "[I")
    public int[] field1615;

    @OriginalMember(owner = "client!WINORGIB", name = "d", descriptor = "[LWINORGIB;")
    public static class63[] field1613;

    @OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(LAWEEREDT;I)V")
    public static void method525(class2 arg0, int arg1) {
        class25 var2 = new class25(arg0.method14("idk.dat", null), 713);
        field1612 = var2.method247();
        if (field1613 == null) {
            field1613 = new class63[field1612];
        }
        for (int var3 = 0; var3 < field1612; var3++) {
            if (field1613[var3] == null) {
                field1613[var3] = new class63();
            }
            field1613[var3].method526(var2, (byte) 1);
        }
        if (arg1 != 0) {
            field1610 = !field1610;
        }
    }

    @OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(LIUVBENCV;B)V")
    public void method526(class25 arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg0.method245();
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    this.field1614 = arg0.method245();
                } else if (var5 == 2) {
                    int var6 = arg0.method245();
                    this.field1615 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1615[var7] = arg0.method247();
                    }
                } else if (var5 == 3) {
                    this.field1619 = true;
                } else if (var5 >= 40 && var5 < 50) {
                    this.field1616[var5 - 40] = arg0.method247();
                } else if (var5 >= 50 && var5 < 60) {
                    this.field1617[var5 - 50] = arg0.method247();
                } else if (var5 >= 60 && var5 < 70) {
                    this.field1618[var5 - 60] = arg0.method247();
                } else {
                    System.out.println("Error unrecognised config code: " + var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(I)Z")
    public boolean method527(int arg0) {
        while (arg0 >= 0) {
            this.field1611 = 96;
        }
        if (this.field1615 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1615.length; var3++) {
            if (!class29.method301(this.field1615[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public class29 method528(byte arg0) {
        if (this.field1615 == null) {
            return null;
        }
        class29[] var2 = new class29[this.field1615.length];
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1615.length; var3++) {
            var2[var3] = class29.method300(this.field1615[var3]);
        }
        class29 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class29(var2, var2.length, -41715);
        }
        for (int var5 = 0; var5 < 6 && this.field1616[var5] != 0; var5++) {
            var4.method314(this.field1616[var5], this.field1617[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!WINORGIB", name = "b", descriptor = "(I)Z")
    public boolean method529(int arg0) {
        int var2 = 71 / arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1618[var4] != -1 && !class29.method301(this.field1618[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!WINORGIB", name = "b", descriptor = "(B)LJJMVUSJJ;")
    public class29 method530(byte arg0) {
        class29[] var2 = new class29[5];
        if (arg0 != 67) {
            field1610 = !field1610;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1618[var4] != -1) {
                var2[var3++] = class29.method300(this.field1618[var4]);
            }
        }
        class29 var5 = new class29(var2, var3, -41715);
        for (int var6 = 0; var6 < 6 && this.field1616[var6] != 0; var6++) {
            var5.method314(this.field1616[var6], this.field1617[var6]);
        }
        return var5;
    }
}
