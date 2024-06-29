import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class127 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lfh;")
    private class463 field1689 = new class463(null);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[B")
    private static byte[] field1688 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "J")
    private long field1696;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[I")
    private int[] field1690;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[I")
    private int[] field1692;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    private int[] field1693;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    public int[] field1694;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 4)
    public final void method889(int arg0) {
        this.field1692[arg0] = this.field1689.field6631;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()Z", line = 7)
    public final boolean method890() {
        return this.field1689.field6618 != null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(J)V", line = 10)
    public final void method891(long arg0) {
        this.field1696 = arg0;
        int var3 = this.field1692.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1694[var4] = 0;
            this.field1690[var4] = 0;
            this.field1689.field6631 = this.field1693[var4];
            this.method904(var4);
            this.field1692[var4] = this.field1689.field6631;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([B)V", line = 31)
    public final void method892(byte[] arg0) {
        this.field1689.field6618 = arg0;
        this.field1689.field6631 = 10;
        int var2 = this.field1689.method2758((byte) 75);
        this.field1695 = this.field1689.method2758((byte) 98);
        this.field1691 = 500000;
        this.field1693 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1689.method2727(-90);
            int var6 = this.field1689.method2727(-80);
            if (var5 == 1297379947) {
                this.field1693[var3] = this.field1689.field6631;
                var3++;
            }
            this.field1689.field6631 += var6;
        }
        this.field1696 = 0L;
        this.field1692 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1692[var4] = this.field1693[var4];
        }
        this.field1694 = new int[var2];
        this.field1690 = new int[var2];
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)J", line = 88)
    public final long method893(int arg0) {
        return (long) this.field1691 * (long) arg0 + this.field1696;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()I", line = 91)
    public final int method894() {
        return this.field1692.length;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()V", line = 95)
    public final void method895() {
        this.field1689.field6618 = null;
        this.field1693 = null;
        this.field1692 = null;
        this.field1694 = null;
        this.field1690 = null;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "()Z", line = 105)
    public final boolean method896() {
        int var1 = this.field1692.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1692[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "()V", line = 118)
    public final void method897() {
        this.field1689.field6631 = -1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I", line = 121)
    private final int method898(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1688[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1689.method2737(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1689.method2737(false) << 16;
            }
            return var8;
        }
        int var3 = this.field1689.method2737(false);
        int var4 = this.field1689.method2730(10637);
        if (var3 == 47) {
            this.field1689.field6631 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1689.method2738(-73);
            var4 -= 3;
            int var6 = this.field1694[arg0];
            this.field1696 += (long) (this.field1691 - var5) * (long) var6;
            this.field1691 = var5;
            this.field1689.field6631 += var4;
            return 2;
        } else {
            this.field1689.field6631 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I", line = 164)
    public final int method899(int arg0) {
        return this.method902(arg0);
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "()I", line = 172)
    public final int method900() {
        int var1 = this.field1692.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1692[var4] >= 0 && this.field1694[var4] < var3) {
                var2 = var4;
                var3 = this.field1694[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 197)
    public final void method901(int arg0) {
        this.field1689.field6631 = this.field1692[arg0];
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)I", line = 201)
    private final int method902(int arg0) {
        byte var2 = this.field1689.field6618[this.field1689.field6631];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1690[arg0] = var3;
            this.field1689.field6631++;
        } else {
            var3 = this.field1690[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method898(arg0, var3);
        }
        int var4 = this.field1689.method2730(10637);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1689.field6618[this.field1689.field6631] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1689.field6631++;
                this.field1690[arg0] = var5;
                return this.method898(arg0, var5);
            }
        }
        this.field1689.field6631 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "()V", line = 242)
    public static void method903() {
        field1688 = null;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V", line = 247)
    public final void method904(int arg0) {
        int var2 = this.field1689.method2730(10637);
        this.field1694[arg0] += var2;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 263)
    public class127() {
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V", line = 265)
    public class127(byte[] arg0) {
        this.method892(arg0);
    }
}
