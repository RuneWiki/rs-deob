import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class511 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lnp;")
    private class115 field7327 = new class115(null);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[B")
    private static byte[] field7326 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public int field7332;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field7333;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "J")
    private long field7329;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
    private int[] field7328;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
    public int[] field7330;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
    private int[] field7331;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[I")
    private int[] field7334;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
    public final int method2916(int arg0) {
        return this.method2921(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()Z")
    public final boolean method2917() {
        int var1 = this.field7328.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7328[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([B)V")
    public final void method2918(byte[] arg0) {
        this.field7327.field1269 = arg0;
        this.field7327.field1218 = 10;
        int var2 = this.field7327.method643((byte) -77);
        this.field7332 = this.field7327.method643((byte) -77);
        this.field7333 = 500000;
        this.field7331 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7327.method631(false);
            int var6 = this.field7327.method631(false);
            if (var5 == 1297379947) {
                this.field7331[var3] = this.field7327.field1218;
                var3++;
            }
            this.field7327.field1218 += var6;
        }
        this.field7329 = 0L;
        this.field7328 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7328[var4] = this.field7331[var4];
        }
        this.field7330 = new int[var2];
        this.field7334 = new int[var2];
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V")
    public final void method2919() {
        this.field7327.field1218 = -1;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V")
    public final void method2920() {
        this.field7327.field1269 = null;
        this.field7331 = null;
        this.field7328 = null;
        this.field7330 = null;
        this.field7334 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
    private final int method2921(int arg0) {
        byte var2 = this.field7327.field1269[this.field7327.field1218];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7334[arg0] = var3;
            this.field7327.field1218++;
        } else {
            var3 = this.field7334[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2927(arg0, var3);
        }
        int var4 = this.field7327.method652((byte) 83);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7327.field1269[this.field7327.field1218] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7327.field1218++;
                this.field7334[arg0] = var5;
                return this.method2927(arg0, var5);
            }
        }
        this.field7327.field1218 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public final void method2922(int arg0) {
        this.field7328[arg0] = this.field7327.field1218;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
    public final void method2923(int arg0) {
        int var2 = this.field7327.method652((byte) 82);
        this.field7330[arg0] += var2;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()Z")
    public final boolean method2924() {
        return this.field7327.field1269 != null;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()I")
    public final int method2925() {
        int var1 = this.field7328.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7328[var4] >= 0 && this.field7330[var4] < var3) {
                var2 = var4;
                var3 = this.field7330[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "()V")
    public static void method2926() {
        field7326 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    private final int method2927(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7326[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7327.method620((byte) 46) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7327.method620((byte) -18) << 16;
            }
            return var8;
        }
        int var3 = this.field7327.method620((byte) 75);
        int var4 = this.field7327.method652((byte) 126);
        if (var3 == 47) {
            this.field7327.field1218 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7327.method675(-125);
            var4 -= 3;
            int var6 = this.field7330[arg0];
            this.field7329 += (long) (this.field7333 - var5) * (long) var6;
            this.field7333 = var5;
            this.field7327.field1218 += var4;
            return 2;
        } else {
            this.field7327.field1218 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)J")
    public final long method2928(int arg0) {
        return (long) this.field7333 * (long) arg0 + this.field7329;
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "()I")
    public final int method2929() {
        return this.field7328.length;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V")
    public final void method2930(int arg0) {
        this.field7327.field1218 = this.field7328[arg0];
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(J)V")
    public final void method2931(long arg0) {
        this.field7329 = arg0;
        int var3 = this.field7328.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7330[var4] = 0;
            this.field7334[var4] = 0;
            this.field7327.field1218 = this.field7331[var4];
            this.method2923(var4);
            this.field7328[var4] = this.field7327.field1218;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class511() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([B)V")
    public class511(byte[] arg0) {
        this.method2918(arg0);
    }
}
