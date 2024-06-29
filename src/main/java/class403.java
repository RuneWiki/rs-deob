import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class403 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lap;")
    private class289 field5615 = new class289((byte[]) null);

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[B")
    private static byte[] field5616 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    private int field5621;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "J")
    private long field5620;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "[I")
    public int[] field5617;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
    private int[] field5619;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
    private int[] field5622;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "[I")
    private int[] field5623;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(J)V")
    public final void method2462(long arg0) {
        this.field5620 = arg0;
        int var3 = this.field5623.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5617[var4] = 0;
            this.field5619[var4] = 0;
            this.field5615.field3938 = this.field5622[var4];
            this.method2465(var4);
            this.field5623[var4] = this.field5615.field3938;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
    private final int method2463(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5616[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5615.method1861((byte) -72) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5615.method1861((byte) -72) << 16;
            }
            return var8;
        }
        int var3 = this.field5615.method1861((byte) -72);
        int var4 = this.field5615.method1850(2);
        if (var3 == 47) {
            this.field5615.field3938 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5615.method1880((byte) -103);
            var4 -= 3;
            int var6 = this.field5617[arg0];
            this.field5620 += (long) (this.field5621 - var5) * (long) var6;
            this.field5621 = var5;
            this.field5615.field3938 += var4;
            return 2;
        } else {
            this.field5615.field3938 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
    public final int method2464(int arg0) {
        return this.method2466(arg0);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public final void method2465(int arg0) {
        int var2 = this.field5615.method1850(2);
        this.field5617[arg0] += var2;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I")
    private final int method2466(int arg0) {
        byte var2 = this.field5615.field3882[this.field5615.field3938];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5619[arg0] = var3;
            this.field5615.field3938++;
        } else {
            var3 = this.field5619[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2463(arg0, var3);
        }
        int var4 = this.field5615.method1850(2);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5615.field3882[this.field5615.field3938] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5615.field3938++;
                this.field5619[arg0] = var5;
                return this.method2463(arg0, var5);
            }
        }
        this.field5615.field3938 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "()Z")
    public final boolean method2467() {
        return this.field5615.field3882 != null;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "()V")
    public static void method2468() {
        field5616 = null;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "()V")
    public final void method2469() {
        this.field5615.field3938 = -1;
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "()V")
    public final void method2470() {
        this.field5615.field3882 = null;
        this.field5622 = null;
        this.field5623 = null;
        this.field5617 = null;
        this.field5619 = null;
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)J")
    public final long method2471(int arg0) {
        return (long) this.field5621 * (long) arg0 + this.field5620;
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V")
    public final void method2472(int arg0) {
        this.field5623[arg0] = this.field5615.field3938;
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "()I")
    public final int method2473() {
        int var1 = this.field5623.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5623[var4] >= 0 && this.field5617[var4] < var3) {
                var2 = var4;
                var3 = this.field5617[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([B)V")
    public final void method2474(byte[] arg0) {
        this.field5615.field3882 = arg0;
        this.field5615.field3938 = 10;
        int var2 = this.field5615.method1853(104);
        this.field5618 = this.field5615.method1853(-105);
        this.field5621 = 500000;
        this.field5622 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5615.method1856((byte) 76);
            int var6 = this.field5615.method1856((byte) 116);
            if (var5 == 1297379947) {
                this.field5622[var3] = this.field5615.field3938;
                var3++;
            }
            this.field5615.field3938 += var6;
        }
        this.field5620 = 0L;
        this.field5623 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5623[var4] = this.field5622[var4];
        }
        this.field5617 = new int[var2];
        this.field5619 = new int[var2];
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "()I")
    public final int method2475() {
        return this.field5623.length;
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V")
    public final void method2476(int arg0) {
        this.field5615.field3938 = this.field5623[arg0];
    }

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "()Z")
    public final boolean method2477() {
        int var1 = this.field5623.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5623[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
    public class403() {
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
    public class403(byte[] arg0) {
        this.method2474(arg0);
    }
}
