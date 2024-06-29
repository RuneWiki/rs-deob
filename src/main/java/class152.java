import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class152 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lfk;")
    private class14 field2691 = new class14((byte[]) null);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[B")
    private static byte[] field2690 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "J")
    private long field2695;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
    public int[] field2694;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    private int[] field2696;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[I")
    private int[] field2697;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
    private int[] field2698;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method1141(int arg0) {
        int var2 = this.field2691.method195(-36);
        this.field2694[arg0] += var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()Z")
    public final boolean method1142() {
        return this.field2691.field269 != null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I")
    public final int method1143(int arg0) {
        return this.method1150(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()Z")
    public final boolean method1144() {
        int var1 = this.field2696.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2696[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(J)V")
    public final void method1145(long arg0) {
        this.field2695 = arg0;
        int var3 = this.field2696.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2694[var4] = 0;
            this.field2697[var4] = 0;
            this.field2691.field318 = this.field2698[var4];
            this.method1141(var4);
            this.field2696[var4] = this.field2691.field318;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()V")
    public final void method1146() {
        this.field2691.field269 = null;
        this.field2698 = null;
        this.field2696 = null;
        this.field2694 = null;
        this.field2697 = null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public final void method1147(int arg0) {
        this.field2696[arg0] = this.field2691.field318;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()I")
    public final int method1148() {
        int var1 = this.field2696.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2696[var4] >= 0 && this.field2694[var4] < var3) {
                var2 = var4;
                var3 = this.field2694[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    private final int method1149(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2690[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2691.method200(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2691.method200(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2691.method200(255);
        int var4 = this.field2691.method195(-64);
        if (var3 == 47) {
            this.field2691.field318 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2691.method190(-25267);
            var4 -= 3;
            int var6 = this.field2694[arg0];
            this.field2695 += (long) (this.field2692 - var5) * (long) var6;
            this.field2692 = var5;
            this.field2691.field318 += var4;
            return 2;
        } else {
            this.field2691.field318 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)I")
    private final int method1150(int arg0) {
        byte var2 = this.field2691.field269[this.field2691.field318];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2697[arg0] = var3;
            this.field2691.field318++;
        } else {
            var3 = this.field2697[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1149(arg0, var3);
        }
        int var4 = this.field2691.method195(-60);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2691.field269[this.field2691.field318] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2691.field318++;
                this.field2697[arg0] = var5;
                return this.method1149(arg0, var5);
            }
        }
        this.field2691.field318 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "()I")
    public final int method1151() {
        return this.field2696.length;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)J")
    public final long method1152(int arg0) {
        return (long) this.field2692 * (long) arg0 + this.field2695;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
    public final void method1153() {
        this.field2691.field318 = -1;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public final void method1154(int arg0) {
        this.field2691.field318 = this.field2696[arg0];
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V")
    public final void method1155(byte[] arg0) {
        this.field2691.field269 = arg0;
        this.field2691.field318 = 10;
        int var2 = this.field2691.method161(4);
        this.field2693 = this.field2691.method161(4);
        this.field2692 = 500000;
        this.field2698 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2691.method187((byte) 61);
            int var6 = this.field2691.method187((byte) 61);
            if (var5 == 1297379947) {
                this.field2698[var3] = this.field2691.field318;
                var3++;
            }
            this.field2691.field318 += var6;
        }
        this.field2695 = 0L;
        this.field2696 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2696[var4] = this.field2698[var4];
        }
        this.field2694 = new int[var2];
        this.field2697 = new int[var2];
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "()V")
    public static void method1156() {
        field2690 = null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class152() {
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V")
    public class152(byte[] arg0) {
        this.method1155(arg0);
    }
}
