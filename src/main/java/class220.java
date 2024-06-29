import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class220 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lja;")
    private class60 field3753 = new class60((byte[]) null);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[B")
    private static byte[] field3752 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "J")
    private long field3754;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[I")
    private int[] field3755;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    private int[] field3757;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    private int[] field3758;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[I")
    public int[] field3759;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([B)V", line = 3)
    public final void method1604(byte[] arg0) {
        this.field3753.field997 = arg0;
        this.field3753.field1012 = 10;
        int var2 = this.field3753.method485((byte) -2);
        this.field3756 = this.field3753.method485((byte) -2);
        this.field3760 = 500000;
        this.field3758 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3753.method505(255);
            int var5 = this.field3753.method505(255);
            if (var4 == 1297379947) {
                this.field3758[var3] = this.field3753.field1012;
                var3++;
            }
            this.field3753.field1012 += var5;
        }
        this.field3754 = 0L;
        this.field3757 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3757[var6] = this.field3758[var6];
        }
        this.field3759 = new int[var2];
        this.field3755 = new int[var2];
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V", line = 56)
    public static void method1605() {
        field3752 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()I", line = 64)
    public final int method1606() {
        int var1 = this.field3757.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3757[var4] >= 0 && this.field3759[var4] < var3) {
                var2 = var4;
                var3 = this.field3759[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()Z", line = 89)
    public final boolean method1607() {
        return this.field3753.field997 != null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 93)
    public final void method1608(int arg0) {
        int var2 = this.field3753.method525(2);
        this.field3759[arg0] += var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(J)V", line = 97)
    public final void method1609(long arg0) {
        this.field3754 = arg0;
        int var3 = this.field3757.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3759[var4] = 0;
            this.field3755[var4] = 0;
            this.field3753.field1012 = this.field3758[var4];
            this.method1608(var4);
            this.field3757[var4] = this.field3753.field1012;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 116)
    public final void method1610(int arg0) {
        this.field3753.field1012 = this.field3757[arg0];
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I", line = 123)
    private final int method1611(int arg0) {
        byte var2 = this.field3753.field997[this.field3753.field1012];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3755[arg0] = var3;
            this.field3753.field1012++;
        } else {
            var3 = this.field3755[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1614(arg0, var3);
        }
        int var4 = this.field3753.method525(2);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3753.field997[this.field3753.field1012] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3753.field1012++;
                this.field3755[arg0] = var5;
                return this.method1614(arg0, var5);
            }
        }
        this.field3753.field1012 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)J", line = 164)
    public final long method1612(int arg0) {
        return (long) this.field3760 * (long) arg0 + this.field3754;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "()Z", line = 168)
    public final boolean method1613() {
        int var1 = this.field3757.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3757[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I", line = 181)
    private final int method1614(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3752[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3753.method501(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3753.method501(0) << 16;
            }
            return var8;
        }
        int var3 = this.field3753.method501(0);
        int var4 = this.field3753.method525(2);
        if (var3 == 47) {
            this.field3753.field1012 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3753.method489(-98);
            var4 -= 3;
            int var6 = this.field3759[arg0];
            this.field3754 += (long) (this.field3760 - var5) * (long) var6;
            this.field3760 = var5;
            this.field3753.field1012 += var4;
            return 2;
        } else {
            this.field3753.field1012 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)I", line = 224)
    public final int method1615(int arg0) {
        return this.method1611(arg0);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "()V", line = 230)
    public final void method1616() {
        this.field3753.field1012 = -1;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V", line = 234)
    public final void method1617(int arg0) {
        this.field3757[arg0] = this.field3753.field1012;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "()I", line = 238)
    public final int method1618() {
        return this.field3757.length;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 264)
    public class220() {
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V", line = 266)
    public class220(byte[] arg0) {
        this.method1604(arg0);
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "()V", line = 256)
    public final void method1619() {
        this.field3753.field997 = null;
        this.field3758 = null;
        this.field3757 = null;
        this.field3759 = null;
        this.field3755 = null;
    }
}
