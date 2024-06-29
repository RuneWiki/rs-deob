import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class122 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lma;")
    private class202 field1864 = new class202((byte[]) null);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[B")
    private static byte[] field1865 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "J")
    private long field1869;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    private int[] field1867;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    private int[] field1870;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[I")
    private int[] field1871;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    public int[] field1872;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
    public final int method792() {
        return this.field1870.length;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
    private final int method793(int arg0) {
        byte var2 = this.field1864.field3234[this.field1864.field3272];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1871[arg0] = var3;
            this.field1864.field3272++;
        } else {
            var3 = this.field1871[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method805(arg0, var3);
        }
        int var4 = this.field1864.method1445(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1864.field3234[this.field1864.field3272] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1864.field3272++;
                this.field1871[arg0] = var5;
                return this.method805(arg0, var5);
            }
        }
        this.field1864.field3272 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public final void method794() {
        this.field1864.field3272 = -1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(J)V")
    public final void method795(long arg0) {
        this.field1869 = arg0;
        int var3 = this.field1870.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1872[var4] = 0;
            this.field1871[var4] = 0;
            this.field1864.field3272 = this.field1867[var4];
            this.method804(var4);
            this.field1870[var4] = this.field1864.field3272;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
    public static void method796() {
        field1865 = null;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()V")
    public final void method797() {
        this.field1864.field3234 = null;
        this.field1867 = null;
        this.field1870 = null;
        this.field1872 = null;
        this.field1871 = null;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "()Z")
    public final boolean method798() {
        return this.field1864.field3234 != null;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "()I")
    public final int method799() {
        int var1 = this.field1870.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1870[var4] >= 0 && this.field1872[var4] < var3) {
                var2 = var4;
                var3 = this.field1872[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method800(int arg0) {
        this.field1870[arg0] = this.field1864.field3272;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)V")
    public final void method801(byte[] arg0) {
        this.field1864.field3234 = arg0;
        this.field1864.field3272 = 10;
        int var2 = this.field1864.method1419(95);
        this.field1866 = this.field1864.method1419(85);
        this.field1868 = 500000;
        this.field1867 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1864.method1440(20404);
            int var6 = this.field1864.method1440(20404);
            if (var5 == 1297379947) {
                this.field1867[var3] = this.field1864.field3272;
                var3++;
            }
            this.field1864.field3272 += var6;
        }
        this.field1869 = 0L;
        this.field1870 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1870[var4] = this.field1867[var4];
        }
        this.field1872 = new int[var2];
        this.field1871 = new int[var2];
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)J")
    public final long method802(int arg0) {
        return (long) this.field1868 * (long) arg0 + this.field1869;
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "()Z")
    public final boolean method803() {
        int var1 = this.field1870.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1870[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public final void method804(int arg0) {
        int var2 = this.field1864.method1445(false);
        this.field1872[arg0] += var2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
    private final int method805(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1865[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1864.method1420((byte) 0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1864.method1420((byte) 0) << 16;
            }
            return var8;
        }
        int var3 = this.field1864.method1420((byte) 0);
        int var4 = this.field1864.method1445(false);
        if (var3 == 47) {
            this.field1864.field3272 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1864.method1401((byte) -105);
            var4 -= 3;
            int var6 = this.field1872[arg0];
            this.field1869 += (long) (this.field1868 - var5) * (long) var6;
            this.field1868 = var5;
            this.field1864.field3272 += var4;
            return 2;
        } else {
            this.field1864.field3272 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public final void method806(int arg0) {
        this.field1864.field3272 = this.field1870[arg0];
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)I")
    public final int method807(int arg0) {
        return this.method793(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class122() {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
    public class122(byte[] arg0) {
        this.method801(arg0);
    }
}
