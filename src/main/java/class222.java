import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class222 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Laj;")
    private class1 field3463 = new class1((byte[]) null);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[B")
    private static byte[] field3462 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "J")
    private long field3464;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "[I")
    private int[] field3466;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
    private int[] field3467;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[I")
    public int[] field3468;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    private int[] field3469;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I", line = 4)
    public final int method1617(int arg0) {
        return this.method1618(arg0);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I", line = 11)
    private final int method1618(int arg0) {
        byte var2 = this.field3463.field34[this.field3463.field48];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3466[arg0] = var3;
            this.field3463.field48++;
        } else {
            var3 = this.field3466[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1620(arg0, var3);
        }
        int var4 = this.field3463.method34(-1005610576);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3463.field34[this.field3463.field48] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3463.field48++;
                this.field3466[arg0] = var5;
                return this.method1620(arg0, var5);
            }
        }
        this.field3463.field48 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 52)
    public static void method1619() {
        field3462 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I", line = 56)
    private final int method1620(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3462[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3463.method15((byte) 109) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3463.method15((byte) 66) << 16;
            }
            return var8;
        }
        int var3 = this.field3463.method15((byte) 77);
        int var4 = this.field3463.method34(-1005610576);
        if (var3 == 47) {
            this.field3463.field48 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3463.method4(true);
            var4 -= 3;
            int var6 = this.field3468[arg0];
            this.field3464 += (long) (this.field3470 - var5) * (long) var6;
            this.field3470 = var5;
            this.field3463.field48 += var4;
            return 2;
        } else {
            this.field3463.field48 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()Z", line = 98)
    public final boolean method1621() {
        return this.field3463.field34 != null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()V", line = 102)
    public final void method1622() {
        this.field3463.field34 = null;
        this.field3469 = null;
        this.field3467 = null;
        this.field3468 = null;
        this.field3466 = null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)J", line = 112)
    public final long method1623(int arg0) {
        return (long) this.field3470 * (long) arg0 + this.field3464;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(J)V", line = 117)
    public final void method1624(long arg0) {
        this.field3464 = arg0;
        int var3 = this.field3467.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3468[var4] = 0;
            this.field3466[var4] = 0;
            this.field3463.field48 = this.field3469[var4];
            this.method1631(var4);
            this.field3467[var4] = this.field3463.field48;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "()I", line = 136)
    public final int method1625() {
        int var1 = this.field3467.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3467[var4] >= 0 && this.field3468[var4] < var3) {
                var2 = var4;
                var3 = this.field3468[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "()I", line = 161)
    public final int method1626() {
        return this.field3467.length;
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "()V", line = 164)
    public final void method1627() {
        this.field3463.field48 = -1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([B)V", line = 168)
    public final void method1628(byte[] arg0) {
        this.field3463.field34 = arg0;
        this.field3463.field48 = 10;
        int var2 = this.field3463.method56(19612);
        this.field3465 = this.field3463.method56(19612);
        this.field3470 = 500000;
        this.field3469 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3463.method33(false);
            int var5 = this.field3463.method33(false);
            if (var4 == 1297379947) {
                this.field3469[var3] = this.field3463.field48;
                var3++;
            }
            this.field3463.field48 += var5;
        }
        this.field3464 = 0L;
        this.field3467 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3467[var6] = this.field3469[var6];
        }
        this.field3468 = new int[var2];
        this.field3466 = new int[var2];
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 225)
    public final void method1629(int arg0) {
        this.field3463.field48 = this.field3467[arg0];
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "()Z", line = 230)
    public final boolean method1630() {
        int var1 = this.field3467.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3467[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V", line = 244)
    public final void method1631(int arg0) {
        int var2 = this.field3463.method34(-1005610576);
        this.field3468[arg0] += var2;
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V", line = 251)
    public final void method1632(int arg0) {
        this.field3467[arg0] = this.field3463.field48;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 264)
    public class222() {
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([B)V", line = 266)
    public class222(byte[] arg0) {
        this.method1628(arg0);
    }
}
