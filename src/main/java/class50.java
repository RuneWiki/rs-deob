import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class50 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Llf;")
    private class130 field652 = new class130((byte[]) null);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "[B")
    private static byte[] field653 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "J")
    private long field659;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[I")
    private int[] field655;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "[I")
    public int[] field656;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
    private int[] field657;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "[I")
    private int[] field660;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 6)
    public final void method317(int arg0) {
        this.field652.field1880 = this.field657[arg0];
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 10)
    public final void method318(int arg0) {
        this.field657[arg0] = this.field652.field1880;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)I", line = 15)
    private final int method319(int arg0) {
        byte var2 = this.field652.field1851[this.field652.field1880];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field655[arg0] = var3;
            this.field652.field1880++;
        } else {
            var3 = this.field655[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method327(arg0, var3);
        }
        int var4 = this.field652.method845(1228);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field652.field1851[this.field652.field1880] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field652.field1880++;
                this.field655[arg0] = var5;
                return this.method327(arg0, var5);
            }
        }
        this.field652.field1880 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()V", line = 56)
    public final void method320() {
        this.field652.field1851 = null;
        this.field660 = null;
        this.field657 = null;
        this.field656 = null;
        this.field655 = null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()V", line = 65)
    public static void method321() {
        field653 = null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "()Z", line = 69)
    public final boolean method322() {
        int var1 = this.field657.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field657[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "()I", line = 82)
    public final int method323() {
        return this.field657.length;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "()Z", line = 85)
    public final boolean method324() {
        return this.field652.field1851 != null;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 91)
    public final void method325(int arg0) {
        int var2 = this.field652.method845(1228);
        this.field656[arg0] += var2;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 246)
    public class50() {
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "([B)V", line = 248)
    public class50(byte[] arg0) {
        this.method326(arg0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([B)V", line = 100)
    public final void method326(byte[] arg0) {
        this.field652.field1851 = arg0;
        this.field652.field1880 = 10;
        int var2 = this.field652.method798(false);
        this.field658 = this.field652.method798(false);
        this.field654 = 500000;
        this.field660 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field652.method815(true);
            int var6 = this.field652.method815(true);
            if (var5 == 1297379947) {
                this.field660[var3] = this.field652.field1880;
                var3++;
            }
            this.field652.field1880 += var6;
        }
        this.field659 = 0L;
        this.field657 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field657[var4] = this.field660[var4];
        }
        this.field656 = new int[var2];
        this.field655 = new int[var2];
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I", line = 153)
    private final int method327(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field653[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field652.method837(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field652.method837(true) << 16;
            }
            return var8;
        }
        int var3 = this.field652.method837(true);
        int var4 = this.field652.method845(1228);
        if (var3 == 47) {
            this.field652.field1880 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field652.method839((byte) -92);
            var4 -= 3;
            int var6 = this.field656[arg0];
            this.field659 += (long) (this.field654 - var5) * (long) var6;
            this.field654 = var5;
            this.field652.field1880 += var4;
            return 2;
        } else {
            this.field652.field1880 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "()V", line = 196)
    public final void method328() {
        this.field652.field1880 = -1;
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "()I", line = 208)
    public final int method329() {
        int var1 = this.field657.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field657[var4] >= 0 && this.field656[var4] < var3) {
                var2 = var4;
                var3 = this.field656[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)I", line = 234)
    public final int method330(int arg0) {
        return this.method319(arg0);
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)J", line = 240)
    public final long method331(int arg0) {
        return (long) this.field654 * (long) arg0 + this.field659;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(J)V", line = 252)
    public final void method332(long arg0) {
        this.field659 = arg0;
        int var3 = this.field657.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field656[var4] = 0;
            this.field655[var4] = 0;
            this.field652.field1880 = this.field660[var4];
            this.method325(var4);
            this.field657[var4] = this.field652.field1880;
        }
    }
}
