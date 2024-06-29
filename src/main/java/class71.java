import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZAYCIZYV")
public class class71 {

    @OriginalMember(owner = "client!ZAYCIZYV", name = "b", descriptor = "Z")
    private boolean field1723 = true;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "c", descriptor = "Z")
    private boolean field1724 = true;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "d", descriptor = "I")
    private int field1725 = 585;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "g", descriptor = "I")
    public int field1728 = -1;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "i", descriptor = "[I")
    public int[] field1730 = new int[6];

    @OriginalMember(owner = "client!ZAYCIZYV", name = "j", descriptor = "[I")
    public int[] field1731 = new int[6];

    @OriginalMember(owner = "client!ZAYCIZYV", name = "k", descriptor = "[I")
    public int[] field1732 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ZAYCIZYV", name = "l", descriptor = "Z")
    public boolean field1733 = false;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "e", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "h", descriptor = "[I")
    public int[] field1729;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "f", descriptor = "[LZAYCIZYV;")
    public static class71[] field1727;

    @OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(LHBJEXSJX;Z)V")
    public static void method587(class24 arg0, boolean arg1) {
        class18 var2 = new class18(arg0.method348("idk.dat", null), 0);
        field1726 = var2.method241();
        if (field1727 == null) {
            field1727 = new class71[field1726];
        }
        for (int var3 = 0; var3 < field1726; var3++) {
            if (field1727[var3] == null) {
                field1727[var3] = new class71();
            }
            field1727[var3].method588((byte) 5, var2);
        }
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(BLEYMNCFMK;)V")
    public void method588(byte arg0, class18 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1728 = arg1.method239();
                } else if (var4 == 2) {
                    int var5 = arg1.method239();
                    this.field1729 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1729[var6] = arg1.method241();
                    }
                } else if (var4 == 3) {
                    this.field1733 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1730[var4 - 40] = arg1.method241();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1731[var4 - 50] = arg1.method241();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1732[var4 - 60] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(I)Z")
    public boolean method589(int arg0) {
        if (this.field1729 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            this.field1723 = !this.field1723;
        }
        for (int var3 = 0; var3 < this.field1729.length; var3++) {
            if (!class41.method414(this.field1729[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(Z)LOJGAHFXC;")
    public class41 method590(boolean arg0) {
        if (this.field1729 == null) {
            return null;
        }
        class41[] var2 = new class41[this.field1729.length];
        for (int var3 = 0; var3 < this.field1729.length; var3++) {
            var2[var3] = class41.method413(this.field1729[var3]);
        }
        class41 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class41(var2.length, (byte) 112, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1730[var5] != 0; var5++) {
            var4.method427(this.field1730[var5], this.field1731[var5]);
        }
        if (!arg0) {
            this.field1722 = -155;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ZAYCIZYV", name = "b", descriptor = "(I)Z")
    public boolean method591(int arg0) {
        if (arg0 <= 0) {
            this.field1722 = 73;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1732[var3] != -1 && !class41.method414(this.field1732[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ZAYCIZYV", name = "a", descriptor = "(B)LOJGAHFXC;")
    public class41 method592(byte arg0) {
        if (arg0 != -18) {
            this.field1724 = !this.field1724;
        }
        class41[] var2 = new class41[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1732[var4] != -1) {
                var2[var3++] = class41.method413(this.field1732[var4]);
            }
        }
        class41 var5 = new class41(var3, (byte) 112, var2);
        for (int var6 = 0; var6 < 6 && this.field1730[var6] != 0; var6++) {
            var5.method427(this.field1730[var6], this.field1731[var6]);
        }
        return var5;
    }
}
