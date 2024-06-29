import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class98 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lij;")
    private class85 field1655 = new class85((byte[]) null);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[B")
    private static byte[] field1654 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "J")
    private long field1660;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    public int[] field1656;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    private int[] field1657;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    private int[] field1661;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    private int[] field1662;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public final void method690() {
        this.field1655.field1381 = null;
        this.field1662 = null;
        this.field1657 = null;
        this.field1656 = null;
        this.field1661 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)J")
    public final long method691(int arg0) {
        return (long) this.field1658 * (long) arg0 + this.field1660;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
    public final int method692() {
        return this.field1657.length;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
    private final int method693(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1654[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1655.method564((byte) 66) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1655.method564((byte) 87) << 16;
            }
            return var8;
        }
        int var3 = this.field1655.method564((byte) 85);
        int var4 = this.field1655.method574(true);
        if (var3 == 47) {
            this.field1655.field1392 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1655.method598(104);
            var4 -= 3;
            int var6 = this.field1656[arg0];
            this.field1660 += (long) (this.field1658 - var5) * (long) var6;
            this.field1658 = var5;
            this.field1655.field1392 += var4;
            return 2;
        } else {
            this.field1655.field1392 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
    private final int method694(int arg0) {
        byte var2 = this.field1655.field1381[this.field1655.field1392];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1661[arg0] = var3;
            this.field1655.field1392++;
        } else {
            var3 = this.field1661[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method693(arg0, var3);
        }
        int var4 = this.field1655.method574(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1655.field1381[this.field1655.field1392] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1655.field1392++;
                this.field1661[arg0] = var5;
                return this.method693(arg0, var5);
            }
        }
        this.field1655.field1392 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)I")
    public final int method695(int arg0) {
        return this.method694(arg0);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()Z")
    public final boolean method696() {
        int var1 = this.field1657.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1657[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
    public final void method697() {
        this.field1655.field1392 = -1;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public final void method698(int arg0) {
        this.field1655.field1392 = this.field1657[arg0];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(J)V")
    public final void method699(long arg0) {
        this.field1660 = arg0;
        int var3 = this.field1657.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1656[var4] = 0;
            this.field1661[var4] = 0;
            this.field1655.field1392 = this.field1662[var4];
            this.method705(var4);
            this.field1657[var4] = this.field1655.field1392;
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()Z")
    public final boolean method700() {
        return this.field1655.field1381 != null;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()I")
    public final int method701() {
        int var1 = this.field1657.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1657[var4] >= 0 && this.field1656[var4] < var3) {
                var2 = var4;
                var3 = this.field1656[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V")
    public final void method702(byte[] arg0) {
        this.field1655.field1381 = arg0;
        this.field1655.field1392 = 10;
        int var2 = this.field1655.method608(40);
        this.field1659 = this.field1655.method608(29);
        this.field1658 = 500000;
        this.field1662 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1655.method568(19845);
            int var6 = this.field1655.method568(19845);
            if (var5 == 1297379947) {
                this.field1662[var3] = this.field1655.field1392;
                var3++;
            }
            this.field1655.field1392 += var6;
        }
        this.field1660 = 0L;
        this.field1657 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1657[var4] = this.field1662[var4];
        }
        this.field1656 = new int[var2];
        this.field1661 = new int[var2];
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()V")
    public static void method703() {
        field1654 = null;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public final void method704(int arg0) {
        this.field1657[arg0] = this.field1655.field1392;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
    public final void method705(int arg0) {
        int var2 = this.field1655.method574(true);
        this.field1656[arg0] += var2;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class98() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    public class98(byte[] arg0) {
        this.method702(arg0);
    }
}
