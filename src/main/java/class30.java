import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class30 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lv;")
    private class152 field369 = new class152((byte[]) null);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[B")
    private static byte[] field368 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "J")
    private long field372;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    private int[] field371;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    private int[] field374;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    private int[] field375;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[I")
    public int[] field376;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method211(int arg0) {
        this.field369.field2511 = this.field374[arg0];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()Z")
    public final boolean method212() {
        int var1 = this.field374.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field374[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        int var2 = this.field369.method1101(-30598);
        this.field376[arg0] += var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([B)V")
    public final void method214(byte[] arg0) {
        this.field369.field2523 = arg0;
        this.field369.field2511 = 10;
        int var2 = this.field369.method1126(false);
        this.field370 = this.field369.method1126(false);
        this.field373 = 500000;
        this.field375 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field369.method1097(126);
            int var6 = this.field369.method1097(127);
            if (var5 == 1297379947) {
                this.field375[var3] = this.field369.field2511;
                var3++;
            }
            this.field369.field2511 += var6;
        }
        this.field372 = 0L;
        this.field374 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field374[var4] = this.field375[var4];
        }
        this.field376 = new int[var2];
        this.field371 = new int[var2];
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    public final void method215() {
        this.field369.field2511 = -1;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
    private final int method216(int arg0) {
        byte var2 = this.field369.field2523[this.field369.field2511];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field371[arg0] = var3;
            this.field369.field2511++;
        } else {
            var3 = this.field371[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method220(arg0, var3);
        }
        int var4 = this.field369.method1101(-30598);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field369.field2523[this.field369.field2511] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field369.field2511++;
                this.field371[arg0] = var5;
                return this.method220(arg0, var5);
            }
        }
        this.field369.field2511 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)I")
    public final int method217(int arg0) {
        return this.method216(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(J)V")
    public final void method218(long arg0) {
        this.field372 = arg0;
        int var3 = this.field374.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field376[var4] = 0;
            this.field371[var4] = 0;
            this.field369.field2511 = this.field375[var4];
            this.method213(var4);
            this.field374[var4] = this.field369.field2511;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
    public final void method219() {
        this.field369.field2523 = null;
        this.field375 = null;
        this.field374 = null;
        this.field376 = null;
        this.field371 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    private final int method220(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field368[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field369.method1111(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field369.method1111(255) << 16;
            }
            return var8;
        }
        int var3 = this.field369.method1111(255);
        int var4 = this.field369.method1101(-30598);
        if (var3 == 47) {
            this.field369.field2511 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field369.method1128((byte) -109);
            var4 -= 3;
            int var6 = this.field376[arg0];
            this.field372 += (long) (this.field373 - var5) * (long) var6;
            this.field373 = var5;
            this.field369.field2511 += var4;
            return 2;
        } else {
            this.field369.field2511 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()I")
    public final int method221() {
        return this.field374.length;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "()I")
    public final int method222() {
        int var1 = this.field374.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field374[var4] >= 0 && this.field376[var4] < var3) {
                var2 = var4;
                var3 = this.field376[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "()V")
    public static void method223() {
        field368 = null;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)J")
    public final long method224(int arg0) {
        return (long) this.field373 * (long) arg0 + this.field372;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public final void method225(int arg0) {
        this.field374[arg0] = this.field369.field2511;
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "()Z")
    public final boolean method226() {
        return this.field369.field2523 != null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class30() {
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
    public class30(byte[] arg0) {
        this.method214(arg0);
    }
}
