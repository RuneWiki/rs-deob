import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class263 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Leb;")
    private class371 field3590 = new class371((byte[]) null);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[B")
    private static byte[] field3589 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "J")
    private long field3596;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[I")
    public int[] field3591;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "[I")
    private int[] field3593;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "[I")
    private int[] field3595;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "[I")
    private int[] field3597;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
    public final void method1615() {
        this.field3590.field5258 = null;
        this.field3595 = null;
        this.field3597 = null;
        this.field3591 = null;
        this.field3593 = null;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "()I")
    public final int method1616() {
        int var1 = this.field3597.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3597[var4] >= 0 && this.field3591[var4] < var3) {
                var2 = var4;
                var3 = this.field3591[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(J)V")
    public final void method1617(long arg0) {
        this.field3596 = arg0;
        int var3 = this.field3597.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3591[var4] = 0;
            this.field3593[var4] = 0;
            this.field3590.field5273 = this.field3595[var4];
            this.method1620(var4);
            this.field3597[var4] = this.field3590.field5273;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)J")
    public final long method1618(int arg0) {
        return (long) this.field3594 * (long) arg0 + this.field3596;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)I")
    private final int method1619(int arg0) {
        byte var2 = this.field3590.field5258[this.field3590.field5273];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3593[arg0] = var3;
            this.field3590.field5273++;
        } else {
            var3 = this.field3593[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1626(arg0, var3);
        }
        int var4 = this.field3590.method2401((byte) 68);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3590.field5258[this.field3590.field5273] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3590.field5273++;
                this.field3593[arg0] = var5;
                return this.method1626(arg0, var5);
            }
        }
        this.field3590.field5273 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
    public final void method1620(int arg0) {
        int var2 = this.field3590.method2401((byte) -116);
        this.field3591[arg0] += var2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([B)V")
    public final void method1621(byte[] arg0) {
        this.field3590.field5258 = arg0;
        this.field3590.field5273 = 10;
        int var2 = this.field3590.method2403((byte) 51);
        this.field3592 = this.field3590.method2403((byte) 53);
        this.field3594 = 500000;
        this.field3595 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3590.method2413((byte) -30);
            int var6 = this.field3590.method2413((byte) -30);
            if (var5 == 1297379947) {
                this.field3595[var3] = this.field3590.field5273;
                var3++;
            }
            this.field3590.field5273 += var6;
        }
        this.field3596 = 0L;
        this.field3597 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3597[var4] = this.field3595[var4];
        }
        this.field3591 = new int[var2];
        this.field3593 = new int[var2];
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "()V")
    public static void method1622() {
        field3589 = null;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "()V")
    public final void method1623() {
        this.field3590.field5273 = -1;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)I")
    public final int method1624(int arg0) {
        return this.method1619(arg0);
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
    public final void method1625(int arg0) {
        this.field3597[arg0] = this.field3590.field5273;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
    private final int method1626(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3589[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3590.method2429(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3590.method2429(0) << 16;
            }
            return var8;
        }
        int var3 = this.field3590.method2429(0);
        int var4 = this.field3590.method2401((byte) -119);
        if (var3 == 47) {
            this.field3590.field5273 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3590.method2425(-121);
            var4 -= 3;
            int var6 = this.field3591[arg0];
            this.field3596 += (long) (this.field3594 - var5) * (long) var6;
            this.field3594 = var5;
            this.field3590.field5273 += var4;
            return 2;
        } else {
            this.field3590.field5273 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "()Z")
    public final boolean method1627() {
        int var1 = this.field3597.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3597[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "()I")
    public final int method1628() {
        return this.field3597.length;
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "()Z")
    public final boolean method1629() {
        return this.field3590.field5258 != null;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
    public final void method1630(int arg0) {
        this.field3590.field5273 = this.field3597[arg0];
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class263() {
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "([B)V")
    public class263(byte[] arg0) {
        this.method1621(arg0);
    }
}
