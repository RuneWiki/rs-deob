import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class496 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lvj;")
    private class26 field6956 = new class26(null);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "[B")
    private static byte[] field6955 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public int field6959;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    private int field6963;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "J")
    private long field6958;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "[I")
    private int[] field6957;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[I")
    private int[] field6960;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
    private int[] field6961;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "[I")
    public int[] field6962;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)J")
    public final long method2964(int arg0) {
        return (long) this.field6963 * (long) arg0 + this.field6958;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I")
    public final int method2965(int arg0) {
        return this.method2970(arg0);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()I")
    public final int method2966() {
        int var1 = this.field6961.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6961[var4] >= 0 && this.field6962[var4] < var3) {
                var2 = var4;
                var3 = this.field6962[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()V")
    public final void method2967() {
        this.field6956.field279 = null;
        this.field6960 = null;
        this.field6961 = null;
        this.field6962 = null;
        this.field6957 = null;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public final void method2968(int arg0) {
        this.field6956.field330 = this.field6961[arg0];
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()Z")
    public final boolean method2969() {
        return this.field6956.field279 != null;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
    private final int method2970(int arg0) {
        byte var2 = this.field6956.field279[this.field6956.field330];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6957[arg0] = var3;
            this.field6956.field330++;
        } else {
            var3 = this.field6957[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2972(arg0, var3);
        }
        int var4 = this.field6956.method170((byte) -108);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6956.field279[this.field6956.field330] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6956.field330++;
                this.field6957[arg0] = var5;
                return this.method2972(arg0, var5);
            }
        }
        this.field6956.field330 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(J)V")
    public final void method2971(long arg0) {
        this.field6958 = arg0;
        int var3 = this.field6961.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6962[var4] = 0;
            this.field6957[var4] = 0;
            this.field6956.field330 = this.field6960[var4];
            this.method2976(var4);
            this.field6961[var4] = this.field6956.field330;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
    private final int method2972(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6955[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6956.method194((byte) 119) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6956.method194((byte) 119) << 16;
            }
            return var8;
        }
        int var3 = this.field6956.method194((byte) 119);
        int var4 = this.field6956.method170((byte) -124);
        if (var3 == 47) {
            this.field6956.field330 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6956.method186((byte) 99);
            var4 -= 3;
            int var6 = this.field6962[arg0];
            this.field6958 += (long) (this.field6963 - var5) * (long) var6;
            this.field6963 = var5;
            this.field6956.field330 += var4;
            return 2;
        } else {
            this.field6956.field330 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()V")
    public static void method2973() {
        field6955 = null;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "()I")
    public final int method2974() {
        return this.field6961.length;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "()Z")
    public final boolean method2975() {
        int var1 = this.field6961.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6961[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V")
    public final void method2976(int arg0) {
        int var2 = this.field6956.method170((byte) -109);
        this.field6962[arg0] += var2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([B)V")
    public final void method2977(byte[] arg0) {
        this.field6956.field279 = arg0;
        this.field6956.field330 = 10;
        int var2 = this.field6956.method193(2);
        this.field6959 = this.field6956.method193(2);
        this.field6963 = 500000;
        this.field6960 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6956.method189(255);
            int var6 = this.field6956.method189(255);
            if (var5 == 1297379947) {
                this.field6960[var3] = this.field6956.field330;
                var3++;
            }
            this.field6956.field330 += var6;
        }
        this.field6958 = 0L;
        this.field6961 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6961[var4] = this.field6960[var4];
        }
        this.field6962 = new int[var2];
        this.field6957 = new int[var2];
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "()V")
    public final void method2978() {
        this.field6956.field330 = -1;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)V")
    public final void method2979(int arg0) {
        this.field6961[arg0] = this.field6956.field330;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
    public class496() {
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([B)V")
    public class496(byte[] arg0) {
        this.method2977(arg0);
    }
}
