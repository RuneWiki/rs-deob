import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class494 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lhw;")
    private class208 field7450 = new class208(null);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[B")
    private static byte[] field7449 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field7451;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field7455;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "J")
    private long field7454;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    private int[] field7452;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[I")
    private int[] field7453;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
    private int[] field7456;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
    public int[] field7457;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public final int method3016(int arg0) {
        return this.method3018(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public final void method3017(int arg0) {
        this.field7452[arg0] = this.field7450.field3162;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)I")
    private final int method3018(int arg0) {
        byte var2 = this.field7450.field3193[this.field7450.field3162];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7453[arg0] = var3;
            this.field7450.field3162++;
        } else {
            var3 = this.field7453[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3024(arg0, var3);
        }
        int var4 = this.field7450.method1469((byte) -122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7450.field3193[this.field7450.field3162] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7450.field3162++;
                this.field7453[arg0] = var5;
                return this.method3024(arg0, var5);
            }
        }
        this.field7450.field3162 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)J")
    public final long method3019(int arg0) {
        return (long) this.field7455 * (long) arg0 + this.field7454;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public final void method3020() {
        this.field7450.field3162 = -1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()I")
    public final int method3021() {
        return this.field7452.length;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    public final void method3022(int arg0) {
        this.field7450.field3162 = this.field7452[arg0];
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()V")
    public static void method3023() {
        field7449 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    private final int method3024(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7449[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7450.method1445(-104) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7450.method1445(82) << 16;
            }
            return var8;
        }
        int var3 = this.field7450.method1445(-84);
        int var4 = this.field7450.method1469((byte) -120);
        if (var3 == 47) {
            this.field7450.field3162 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7450.method1452(3);
            var4 -= 3;
            int var6 = this.field7457[arg0];
            this.field7454 += (long) (this.field7455 - var5) * (long) var6;
            this.field7455 = var5;
            this.field7450.field3162 += var4;
            return 2;
        } else {
            this.field7450.field3162 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(J)V")
    public final void method3025(long arg0) {
        this.field7454 = arg0;
        int var3 = this.field7452.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7457[var4] = 0;
            this.field7453[var4] = 0;
            this.field7450.field3162 = this.field7456[var4];
            this.method3030(var4);
            this.field7452[var4] = this.field7450.field3162;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
    public final void method3026() {
        this.field7450.field3193 = null;
        this.field7456 = null;
        this.field7452 = null;
        this.field7457 = null;
        this.field7453 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V")
    public final void method3027(byte[] arg0) {
        this.field7450.field3193 = arg0;
        this.field7450.field3162 = 10;
        int var2 = this.field7450.method1455(-3387);
        this.field7451 = this.field7450.method1455(-3387);
        this.field7455 = 500000;
        this.field7456 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7450.method1436((byte) 122);
            int var6 = this.field7450.method1436((byte) 113);
            if (var5 == 1297379947) {
                this.field7456[var3] = this.field7450.field3162;
                var3++;
            }
            this.field7450.field3162 += var6;
        }
        this.field7454 = 0L;
        this.field7452 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7452[var4] = this.field7456[var4];
        }
        this.field7457 = new int[var2];
        this.field7453 = new int[var2];
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "()Z")
    public final boolean method3028() {
        int var1 = this.field7452.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7452[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "()Z")
    public final boolean method3029() {
        return this.field7450.field3193 != null;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public final void method3030(int arg0) {
        int var2 = this.field7450.method1469((byte) -113);
        this.field7457[arg0] += var2;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "()I")
    public final int method3031() {
        int var1 = this.field7452.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7452[var4] >= 0 && this.field7457[var4] < var3) {
                var2 = var4;
                var3 = this.field7457[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class494() {
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V")
    public class494(byte[] arg0) {
        this.method3027(arg0);
    }
}
