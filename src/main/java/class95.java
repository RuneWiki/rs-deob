import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class95 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    private int field1754 = 0;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    private int field1769 = -1;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Lnd;")
    private class122 field1764 = new class122();

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Z")
    public boolean field1771 = false;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    private int field1760;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[[[I")
    private int[][][] field1757;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[Lq;")
    private class145[] field1762;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lkb;")
    private static class93 field1755 = class76.method390(" ", 0);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lkb;")
    public static class93 field1759 = field1755;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lkb;")
    public static class93 field1761 = class76.method390("<col=ff7000>", 0);

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
    public static boolean field1763 = false;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
    public static int[] field1765 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "[[[I")
    public static int[][][] field1768;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method534(byte arg0) {
        field1767++;
        for (class78 var1 = (class78) class147.field2834.method612(12981); var1 != null; var1 = (class78) class147.field2834.method623((byte) -77)) {
            int var3 = var1.field1406;
            if (class67.method352(2, var3)) {
                boolean var4 = true;
                class65[] var5 = class28.field460[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field1152;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var1.field718;
                    class65 var8 = class204.method1325(65535, var7);
                    if (var8 != null) {
                        class160.method1095(0, var8);
                    }
                }
            }
        }
        int var2 = -72 % ((arg0 + 2) / 55);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public final void method535(boolean arg0) {
        for (int var2 = 0; var2 < this.field1760; var2++) {
            this.field1757[var2][0] = null;
            this.field1757[var2][1] = null;
            this.field1757[var2][2] = null;
            this.field1757[var2] = null;
        }
        this.field1762 = null;
        this.field1757 = null;
        this.field1764.method702((byte) 121);
        this.field1764 = null;
        if (!arg0) {
            field1756++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method536(int arg0) {
        field1759 = null;
        if (arg0 != -1) {
            method536(-91);
        }
        field1755 = null;
        field1768 = null;
        field1761 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        field1766++;
        if (arg0 != 0) {
            method536(-20);
        }
        if (this.field1760 == this.field1758) {
            this.field1771 = this.field1762[arg1] == null;
            this.field1762[arg1] = class122.field2261;
            return this.field1757[arg1];
        } else if (this.field1760 == 1) {
            this.field1771 = this.field1769 != arg1;
            this.field1769 = arg1;
            return this.field1757[0];
        } else {
            class145 var3 = this.field1762[arg1];
            if (this.field1771 = var3 == null) {
                if (this.field1760 > this.field1754) {
                    var3 = new class145(arg1, this.field1754);
                    this.field1754++;
                } else {
                    class145 var4 = (class145) this.field1764.method698((byte) 33);
                    var3 = new class145(arg1, var4.field2828);
                    this.field1762[var4.field2827] = null;
                    var4.method235(false);
                }
                this.field1762[arg1] = var3;
            }
            this.field1764.method699(var3, 115);
            return this.field1757[var3.field2828];
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
    public class95(int arg0, int arg1, int arg2) {
        this.field1758 = arg1;
        this.field1760 = arg0;
        this.field1757 = new int[arg0][3][arg2];
        this.field1762 = new class145[arg1];
    }
}
