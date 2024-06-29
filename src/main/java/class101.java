import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class101 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lvf;")
    private class230 field1690 = new class230((byte[]) null);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[B")
    private static byte[] field1697 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "J")
    private long field1692;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
    public int[] field1691;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    private int[] field1693;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    private int[] field1695;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    private int[] field1696;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public final void method673() {
        this.field1690.field3977 = null;
        this.field1696 = null;
        this.field1695 = null;
        this.field1691 = null;
        this.field1693 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)J")
    public final long method674(int arg0) {
        return (long) this.field1694 * (long) arg0 + this.field1692;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()Z")
    public final boolean method675() {
        int var1 = this.field1695.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1695[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
    private final int method676(int arg0) {
        byte var2 = this.field1690.field3977[this.field1690.field3933];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1693[arg0] = var3;
            this.field1690.field3933++;
        } else {
            var3 = this.field1693[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method682(arg0, var3);
        }
        int var4 = this.field1690.method1526((byte) 87);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1690.field3977[this.field1690.field3933] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1690.field3933++;
                this.field1693[arg0] = var5;
                return this.method682(arg0, var5);
            }
        }
        this.field1690.field3933 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()I")
    public final int method677() {
        int var1 = this.field1695.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1695[var4] >= 0 && this.field1691[var4] < var3) {
                var2 = var4;
                var3 = this.field1691[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public final void method678(int arg0) {
        this.field1690.field3933 = this.field1695[arg0];
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public final void method679(int arg0) {
        int var2 = this.field1690.method1526((byte) 116);
        this.field1691[arg0] += var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([B)V")
    public final void method680(byte[] arg0) {
        this.field1690.field3977 = arg0;
        this.field1690.field3933 = 10;
        int var2 = this.field1690.method1535(2);
        this.field1698 = this.field1690.method1535(2);
        this.field1694 = 500000;
        this.field1696 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1690.method1529(-32494);
            int var6 = this.field1690.method1529(-32494);
            if (var5 == 1297379947) {
                this.field1696[var3] = this.field1690.field3933;
                var3++;
            }
            this.field1690.field3933 += var6;
        }
        this.field1692 = 0L;
        this.field1695 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1695[var4] = this.field1696[var4];
        }
        this.field1691 = new int[var2];
        this.field1693 = new int[var2];
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()V")
    public static void method681() {
        field1697 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    private final int method682(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1697[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1690.method1516((byte) 82) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1690.method1516((byte) 82) << 16;
            }
            return var8;
        }
        int var3 = this.field1690.method1516((byte) 82);
        int var4 = this.field1690.method1526((byte) 62);
        if (var3 == 47) {
            this.field1690.field3933 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1690.method1508(true);
            var4 -= 3;
            int var6 = this.field1691[arg0];
            this.field1692 += (long) (this.field1694 - var5) * (long) var6;
            this.field1694 = var5;
            this.field1690.field3933 += var4;
            return 2;
        } else {
            this.field1690.field3933 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public final void method683(int arg0) {
        this.field1695[arg0] = this.field1690.field3933;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "()Z")
    public final boolean method684() {
        return this.field1690.field3977 != null;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)I")
    public final int method685(int arg0) {
        return this.method676(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "()V")
    public final void method686() {
        this.field1690.field3933 = -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(J)V")
    public final void method687(long arg0) {
        this.field1692 = arg0;
        int var3 = this.field1695.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1691[var4] = 0;
            this.field1693[var4] = 0;
            this.field1690.field3933 = this.field1696[var4];
            this.method679(var4);
            this.field1695[var4] = this.field1690.field3933;
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "()I")
    public final int method688() {
        return this.field1695.length;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class101() {
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
    public class101(byte[] arg0) {
        this.method680(arg0);
    }
}
