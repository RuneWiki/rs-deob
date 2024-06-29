import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class581 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Leh;")
    private class335 field7725 = new class335(null);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[B")
    private static byte[] field7732 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field7729;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field7731;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "J")
    private long field7730;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public int[] field7726;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    private int[] field7727;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[I")
    private int[] field7728;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
    private int[] field7733;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final int method3188(int arg0) {
        return this.method3191(arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    private final int method3189(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7732[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7725.method2034(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7725.method2034(255) << 16;
            }
            return var8;
        }
        int var3 = this.field7725.method2034(255);
        int var4 = this.field7725.method1988((byte) -70);
        if (var3 == 47) {
            this.field7725.field4619 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7725.method2042((byte) 53);
            var4 -= 3;
            int var6 = this.field7726[arg0];
            this.field7730 += (long) (this.field7731 - var5) * (long) var6;
            this.field7731 = var5;
            this.field7725.field4619 += var4;
            return 2;
        } else {
            this.field7725.field4619 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
    public final int method3190() {
        return this.field7733.length;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
    private final int method3191(int arg0) {
        byte var2 = this.field7725.field4600[this.field7725.field4619];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7727[arg0] = var3;
            this.field7725.field4619++;
        } else {
            var3 = this.field7727[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3189(arg0, var3);
        }
        int var4 = this.field7725.method1988((byte) -74);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7725.field4600[this.field7725.field4619] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7725.field4619++;
                this.field7727[arg0] = var5;
                return this.method3189(arg0, var5);
            }
        }
        this.field7725.field4619 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
    public final void method3192() {
        this.field7725.field4600 = null;
        this.field7728 = null;
        this.field7733 = null;
        this.field7726 = null;
        this.field7727 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(J)V")
    public final void method3193(long arg0) {
        this.field7730 = arg0;
        int var3 = this.field7733.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7726[var4] = 0;
            this.field7727[var4] = 0;
            this.field7725.field4619 = this.field7728[var4];
            this.method3195(var4);
            this.field7733[var4] = this.field7725.field4619;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
    public static void method3194() {
        field7732 = null;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public final void method3195(int arg0) {
        int var2 = this.field7725.method1988((byte) -88);
        this.field7726[arg0] += var2;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()Z")
    public final boolean method3196() {
        int var1 = this.field7733.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7733[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "()Z")
    public final boolean method3197() {
        return this.field7725.field4600 != null;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "()V")
    public final void method3198() {
        this.field7725.field4619 = -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([B)V")
    public final void method3199(byte[] arg0) {
        this.field7725.field4600 = arg0;
        this.field7725.field4619 = 10;
        int var2 = this.field7725.method2001((byte) -83);
        this.field7729 = this.field7725.method2001((byte) -83);
        this.field7731 = 500000;
        this.field7728 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7725.method2045(-98);
            int var6 = this.field7725.method2045(-98);
            if (var5 == 1297379947) {
                this.field7728[var3] = this.field7725.field4619;
                var3++;
            }
            this.field7725.field4619 += var6;
        }
        this.field7730 = 0L;
        this.field7733 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7733[var4] = this.field7728[var4];
        }
        this.field7726 = new int[var2];
        this.field7727 = new int[var2];
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public final void method3200(int arg0) {
        this.field7733[arg0] = this.field7725.field4619;
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)J")
    public final long method3201(int arg0) {
        return (long) this.field7731 * (long) arg0 + this.field7730;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
    public final void method3202(int arg0) {
        this.field7725.field4619 = this.field7733[arg0];
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "()I")
    public final int method3203() {
        int var1 = this.field7733.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7733[var4] >= 0 && this.field7726[var4] < var3) {
                var2 = var4;
                var3 = this.field7726[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class581() {
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
    public class581(byte[] arg0) {
        this.method3199(arg0);
    }
}
