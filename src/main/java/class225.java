import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class225 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lkh;")
    private class13 field3826 = new class13((byte[]) null);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[B")
    private static byte[] field3827 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "J")
    private long field3834;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    private int[] field3828;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
    private int[] field3830;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    public int[] field3831;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    private int[] field3832;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()Z", line = 4)
    public final boolean method1616() {
        int var1 = this.field3828.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3828[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 18)
    public final void method1617(int arg0) {
        int var2 = this.field3826.method103((byte) -127);
        this.field3831[arg0] += var2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()Z", line = 22)
    public final boolean method1618() {
        return this.field3826.field254 != null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 26)
    private final int method1619(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3827[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3826.method152((byte) -128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3826.method152((byte) -77) << 16;
            }
            return var8;
        }
        int var3 = this.field3826.method152((byte) -71);
        int var4 = this.field3826.method103((byte) -116);
        if (var3 == 47) {
            this.field3826.field281 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3826.method111(1263702152);
            var4 -= 3;
            int var6 = this.field3831[arg0];
            this.field3834 += (long) (this.field3833 - var5) * (long) var6;
            this.field3833 = var5;
            this.field3826.field281 += var4;
            return 2;
        } else {
            this.field3826.field281 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 70)
    public final void method1620(int arg0) {
        this.field3828[arg0] = this.field3826.field281;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V", line = 74)
    public final void method1621(long arg0) {
        this.field3834 = arg0;
        int var3 = this.field3828.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3831[var4] = 0;
            this.field3832[var4] = 0;
            this.field3826.field281 = this.field3830[var4];
            this.method1617(var4);
            this.field3828[var4] = this.field3826.field281;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V", line = 92)
    public final void method1622() {
        this.field3826.field281 = -1;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 96)
    public final void method1623() {
        this.field3826.field254 = null;
        this.field3830 = null;
        this.field3828 = null;
        this.field3831 = null;
        this.field3832 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I", line = 109)
    public final int method1624(int arg0) {
        return this.method1628(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)J", line = 115)
    public final long method1625(int arg0) {
        return (long) this.field3833 * (long) arg0 + this.field3834;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()I", line = 122)
    public final int method1626() {
        int var1 = this.field3828.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3828[var4] >= 0 && this.field3831[var4] < var3) {
                var2 = var4;
                var3 = this.field3831[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 147)
    public final void method1627(int arg0) {
        this.field3826.field281 = this.field3828[arg0];
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)I", line = 151)
    private final int method1628(int arg0) {
        byte var2 = this.field3826.field254[this.field3826.field281];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3832[arg0] = var3;
            this.field3826.field281++;
        } else {
            var3 = this.field3832[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1619(arg0, var3);
        }
        int var4 = this.field3826.method103((byte) -121);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3826.field254[this.field3826.field281] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3826.field281++;
                this.field3832[arg0] = var5;
                return this.method1619(arg0, var5);
            }
        }
        this.field3826.field281 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V", line = 190)
    public final void method1629(byte[] arg0) {
        this.field3826.field254 = arg0;
        this.field3826.field281 = 10;
        int var2 = this.field3826.method112((byte) 92);
        this.field3829 = this.field3826.method112((byte) 92);
        this.field3833 = 500000;
        this.field3830 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3826.method105((byte) 73);
            int var5 = this.field3826.method105((byte) 97);
            if (var4 == 1297379947) {
                this.field3830[var3] = this.field3826.field281;
                var3++;
            }
            this.field3826.field281 += var5;
        }
        this.field3834 = 0L;
        this.field3828 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3828[var6] = this.field3830[var6];
        }
        this.field3831 = new int[var2];
        this.field3832 = new int[var2];
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()I", line = 243)
    public final int method1630() {
        return this.field3828.length;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 264)
    public class225() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V", line = 266)
    public class225(byte[] arg0) {
        this.method1629(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V", line = 252)
    public static void method1631() {
        field3827 = null;
    }
}
