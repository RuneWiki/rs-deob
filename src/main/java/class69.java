import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YUTTZGSS")
public class class69 {

    @OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "B")
    private byte field1723 = -72;

    @OriginalMember(owner = "client!YUTTZGSS", name = "b", descriptor = "B")
    private byte field1724 = 62;

    @OriginalMember(owner = "client!YUTTZGSS", name = "e", descriptor = "I")
    public int field1727 = -1;

    @OriginalMember(owner = "client!YUTTZGSS", name = "g", descriptor = "[I")
    public int[] field1729 = new int[6];

    @OriginalMember(owner = "client!YUTTZGSS", name = "h", descriptor = "[I")
    public int[] field1730 = new int[6];

    @OriginalMember(owner = "client!YUTTZGSS", name = "i", descriptor = "[I")
    public int[] field1731 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!YUTTZGSS", name = "j", descriptor = "Z")
    public boolean field1732 = false;

    @OriginalMember(owner = "client!YUTTZGSS", name = "c", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!YUTTZGSS", name = "f", descriptor = "[I")
    public int[] field1728;

    @OriginalMember(owner = "client!YUTTZGSS", name = "d", descriptor = "[LYUTTZGSS;")
    public static class69[] field1726;

    @OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(BLXOJZVVDK;)V")
    public static void method579(byte arg0, class60 arg1) {
        class41 var2 = new class41(888, arg1.method560("idk.dat", null));
        field1725 = var2.method342();
        if (arg0 != -82) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1726 == null) {
            field1726 = new class69[field1725];
        }
        for (int var4 = 0; var4 < field1725; var4++) {
            if (field1726[var4] == null) {
                field1726[var4] = new class69();
            }
            field1726[var4].method580(var2, false);
        }
    }

    @OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    public void method580(class41 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method340();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1727 = arg0.method340();
                } else if (var3 == 2) {
                    int var4 = arg0.method340();
                    this.field1728 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1728[var5] = arg0.method342();
                    }
                } else if (var3 == 3) {
                    this.field1732 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1729[var3 - 40] = arg0.method342();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1730[var3 - 50] = arg0.method342();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1731[var3 - 60] = arg0.method342();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(I)Z")
    public boolean method581(int arg0) {
        if (this.field1728 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -33860) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field1728.length; var4++) {
            if (!class16.method219(this.field1728[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!YUTTZGSS", name = "b", descriptor = "(I)LFLXAIVEA;")
    public class16 method582(int arg0) {
        if (this.field1728 == null) {
            return null;
        }
        class16[] var2 = new class16[this.field1728.length];
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1728.length; var3++) {
            var2[var3] = class16.method218(this.field1728[var3]);
        }
        class16 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class16(var2.length, var2, this.field1723);
        }
        for (int var5 = 0; var5 < 6 && this.field1729[var5] != 0; var5++) {
            var4.method232(this.field1729[var5], this.field1730[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(B)Z")
    public boolean method583(byte arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1731[var3] != -1 && !class16.method219(this.field1731[var3])) {
                var2 = false;
            }
        }
        if (this.field1724 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(Z)LFLXAIVEA;")
    public class16 method584(boolean arg0) {
        class16[] var2 = new class16[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1731[var4] != -1) {
                var2[var3++] = class16.method218(this.field1731[var4]);
            }
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        class16 var5 = new class16(var3, var2, this.field1723);
        for (int var6 = 0; var6 < 6 && this.field1729[var6] != 0; var6++) {
            var5.method232(this.field1729[var6], this.field1730[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!YUTTZGSS", name = "<init>", descriptor = "()V")
    public class69() {
        if (class8.field622) {
        }
    }
}
