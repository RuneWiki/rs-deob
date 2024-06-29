import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lkk;")
    private class161 field18 = new class161((byte[]) null);

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[B")
    private static byte[] field20 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "J")
    private long field21;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    public int[] field22;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[I")
    private int[] field24;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "[I")
    private int[] field25;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
    private int[] field26;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()I")
    public final int method13() {
        int var1 = this.field26.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field26[var4] >= 0 && this.field22[var4] < var3) {
                var2 = var4;
                var3 = this.field22[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
    private final int method14(int arg0) {
        byte var2 = this.field18.field2262[this.field18.field2298];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field24[arg0] = var3;
            this.field18.field2298++;
        } else {
            var3 = this.field24[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method27(arg0, var3);
        }
        int var4 = this.field18.method1151((byte) -101);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field18.field2262[this.field18.field2298] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field18.field2298++;
                this.field24[arg0] = var5;
                return this.method27(arg0, var5);
            }
        }
        this.field18.field2298 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
    public final int method15() {
        return this.field26.length;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method16(int arg0) {
        this.field18.field2298 = this.field26[arg0];
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)I")
    public final int method17(int arg0) {
        return this.method14(arg0);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()Z")
    public final boolean method18() {
        return this.field18.field2262 != null;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
    public final void method19() {
        this.field18.field2298 = -1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(J)V")
    public final void method20(long arg0) {
        this.field21 = arg0;
        int var3 = this.field26.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field22[var4] = 0;
            this.field24[var4] = 0;
            this.field18.field2298 = this.field25[var4];
            this.method24(var4);
            this.field26[var4] = this.field18.field2298;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B)V")
    public final void method21(byte[] arg0) {
        this.field18.field2262 = arg0;
        this.field18.field2298 = 10;
        int var2 = this.field18.method1134(-16848);
        this.field19 = this.field18.method1134(-16848);
        this.field23 = 500000;
        this.field25 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field18.method1168(255);
            int var6 = this.field18.method1168(255);
            if (var5 == 1297379947) {
                this.field25[var3] = this.field18.field2298;
                var3++;
            }
            this.field18.field2298 += var6;
        }
        this.field21 = 0L;
        this.field26 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field26[var4] = this.field25[var4];
        }
        this.field22 = new int[var2];
        this.field24 = new int[var2];
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        this.field26[arg0] = this.field18.field2298;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()V")
    public static void method23() {
        field20 = null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
    public final void method24(int arg0) {
        int var2 = this.field18.method1151((byte) -114);
        this.field22[arg0] += var2;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "()Z")
    public final boolean method25() {
        int var1 = this.field26.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field26[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "()V")
    public final void method26() {
        this.field18.field2262 = null;
        this.field25 = null;
        this.field26 = null;
        this.field22 = null;
        this.field24 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I")
    private final int method27(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field20[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field18.method1172((byte) -108) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field18.method1172((byte) -119) << 16;
            }
            return var8;
        }
        int var3 = this.field18.method1172((byte) -111);
        int var4 = this.field18.method1151((byte) -92);
        if (var3 == 47) {
            this.field18.field2298 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field18.method1178((byte) 63);
            var4 -= 3;
            int var6 = this.field22[arg0];
            this.field21 += (long) (this.field23 - var5) * (long) var6;
            this.field23 = var5;
            this.field18.field2298 += var4;
            return 2;
        } else {
            this.field18.field2298 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class3() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V")
    public class3(byte[] arg0) {
        this.method21(arg0);
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)J")
    public final long method28(int arg0) {
        return (long) this.field23 * (long) arg0 + this.field21;
    }
}
