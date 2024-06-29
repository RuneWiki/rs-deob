import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class109 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lfl;")
    private class248 field1692 = new class248((byte[]) null);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[B")
    private static byte[] field1691 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "J")
    private long field1697;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    private int[] field1694;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[I")
    public int[] field1695;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[I")
    private int[] field1699;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(J)V")
    public final void method683(long arg0) {
        this.field1697 = arg0;
        int var3 = this.field1698.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1695[var4] = 0;
            this.field1694[var4] = 0;
            this.field1692.field3748 = this.field1699[var4];
            this.method697(var4);
            this.field1698[var4] = this.field1692.field3748;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
    public final int method684(int arg0) {
        return this.method690(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
    public final int method685() {
        int var1 = this.field1698.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1698[var4] >= 0 && this.field1695[var4] < var3) {
                var2 = var4;
                var3 = this.field1695[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()Z")
    public final boolean method686() {
        int var1 = this.field1698.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1698[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([B)V")
    public final void method687(byte[] arg0) {
        this.field1692.field3723 = arg0;
        this.field1692.field3748 = 10;
        int var2 = this.field1692.method1575(false);
        this.field1696 = this.field1692.method1575(false);
        this.field1693 = 500000;
        this.field1699 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1692.method1576(-17672);
            int var6 = this.field1692.method1576(-17672);
            if (var5 == 1297379947) {
                this.field1699[var3] = this.field1692.field3748;
                var3++;
            }
            this.field1692.field3748 += var6;
        }
        this.field1697 = 0L;
        this.field1698 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1698[var4] = this.field1699[var4];
        }
        this.field1695 = new int[var2];
        this.field1694 = new int[var2];
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
    public static void method688() {
        field1691 = null;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()V")
    public final void method689() {
        this.field1692.field3748 = -1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
    private final int method690(int arg0) {
        byte var2 = this.field1692.field3723[this.field1692.field3748];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1694[arg0] = var3;
            this.field1692.field3748++;
        } else {
            var3 = this.field1694[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method696(arg0, var3);
        }
        int var4 = this.field1692.method1616((byte) 122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1692.field3723[this.field1692.field3748] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1692.field3748++;
                this.field1694[arg0] = var5;
                return this.method696(arg0, var5);
            }
        }
        this.field1692.field3748 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "()I")
    public final int method691() {
        return this.field1698.length;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)J")
    public final long method692(int arg0) {
        return (long) this.field1693 * (long) arg0 + this.field1697;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "()V")
    public final void method693() {
        this.field1692.field3723 = null;
        this.field1699 = null;
        this.field1698 = null;
        this.field1695 = null;
        this.field1694 = null;
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "()Z")
    public final boolean method694() {
        return this.field1692.field3723 != null;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public final void method695(int arg0) {
        this.field1692.field3748 = this.field1698[arg0];
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    private final int method696(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1691[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1692.method1593((byte) 27) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1692.method1593((byte) 27) << 16;
            }
            return var8;
        }
        int var3 = this.field1692.method1593((byte) 27);
        int var4 = this.field1692.method1616((byte) 126);
        if (var3 == 47) {
            this.field1692.field3748 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1692.method1587(-127);
            var4 -= 3;
            int var6 = this.field1695[arg0];
            this.field1697 += (long) (this.field1693 - var5) * (long) var6;
            this.field1693 = var5;
            this.field1692.field3748 += var4;
            return 2;
        } else {
            this.field1692.field3748 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
    public final void method697(int arg0) {
        int var2 = this.field1692.method1616((byte) 63);
        this.field1695[arg0] += var2;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public final void method698(int arg0) {
        this.field1698[arg0] = this.field1692.field3748;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class109() {
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
    public class109(byte[] arg0) {
        this.method687(arg0);
    }
}
