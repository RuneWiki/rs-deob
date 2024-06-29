import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class49 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lnh;")
    private class112 field664 = new class112(null);

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[B")
    private static byte[] field667 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "J")
    private long field666;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[I")
    private int[] field665;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
    private int[] field668;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
    public int[] field669;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[I")
    private int[] field672;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(J)V")
    public final void method329(long arg0) {
        this.field666 = arg0;
        int var3 = this.field672.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field669[var4] = 0;
            this.field668[var4] = 0;
            this.field664.field1821 = this.field665[var4];
            this.method338(var4);
            this.field672[var4] = this.field664.field1821;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
    public final void method330() {
        this.field664.field1821 = -1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([B)V")
    public final void method331(byte[] arg0) {
        this.field664.field1780 = arg0;
        this.field664.field1821 = 10;
        int var2 = this.field664.method731(false);
        this.field670 = this.field664.method731(false);
        this.field671 = 500000;
        this.field665 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field664.method769((byte) -86);
            int var6 = this.field664.method769((byte) -86);
            if (var5 == 1297379947) {
                this.field665[var3] = this.field664.field1821;
                var3++;
            }
            this.field664.field1821 += var6;
        }
        this.field666 = 0L;
        this.field672 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field672[var4] = this.field665[var4];
        }
        this.field669 = new int[var2];
        this.field668 = new int[var2];
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method332(int arg0) {
        this.field664.field1821 = this.field672[arg0];
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
    public final void method333() {
        this.field664.field1780 = null;
        this.field665 = null;
        this.field672 = null;
        this.field669 = null;
        this.field668 = null;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()V")
    public static void method334() {
        field667 = null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
    public final int method335(int arg0) {
        return this.method343(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public final void method336(int arg0) {
        this.field672[arg0] = this.field664.field1821;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()I")
    public final int method337() {
        return this.field672.length;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public final void method338(int arg0) {
        int var2 = this.field664.method741(0);
        this.field669[arg0] += var2;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "()Z")
    public final boolean method339() {
        int var1 = this.field672.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field672[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "()Z")
    public final boolean method340() {
        return this.field664.field1780 != null;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)J")
    public final long method341(int arg0) {
        return (long) this.field671 * (long) arg0 + this.field666;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "()I")
    public final int method342() {
        int var1 = this.field672.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field672[var4] >= 0 && this.field669[var4] < var3) {
                var2 = var4;
                var3 = this.field669[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
    private final int method343(int arg0) {
        byte var2 = this.field664.field1780[this.field664.field1821];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field668[arg0] = var3;
            this.field664.field1821++;
        } else {
            var3 = this.field668[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method344(arg0, var3);
        }
        int var4 = this.field664.method741(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field664.field1780[this.field664.field1821] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field664.field1821++;
                this.field668[arg0] = var5;
                return this.method344(arg0, var5);
            }
        }
        this.field664.field1821 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    private final int method344(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field667[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field664.method758(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field664.method758(true) << 16;
            }
            return var8;
        }
        int var3 = this.field664.method758(true);
        int var4 = this.field664.method741(0);
        if (var3 == 47) {
            this.field664.field1821 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field664.method727(-27619);
            var4 -= 3;
            int var6 = this.field669[arg0];
            this.field666 += (long) (this.field671 - var5) * (long) var6;
            this.field671 = var5;
            this.field664.field1821 += var4;
            return 2;
        } else {
            this.field664.field1821 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V")
    public class49(byte[] arg0) {
        this.method331(arg0);
    }
}
