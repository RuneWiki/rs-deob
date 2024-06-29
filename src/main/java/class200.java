import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class200 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lmb;")
    private class121 field3885 = new class121(null);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[B")
    private static byte[] field3884 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "J")
    private long field3888;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    private int[] field3887;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public int[] field3889;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    private int[] field3890;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    private int[] field3891;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method1323(int arg0) {
        return this.method1335(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([B)V")
    public final void method1324(byte[] arg0) {
        this.field3885.field2218 = arg0;
        this.field3885.field2222 = 10;
        int var2 = this.field3885.method755((byte) -65);
        this.field3886 = this.field3885.method755((byte) -24);
        this.field3892 = 500000;
        this.field3891 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3885.method776(74);
            int var6 = this.field3885.method776(-121);
            if (var5 == 1297379947) {
                this.field3891[var3] = this.field3885.field2222;
                var3++;
            }
            this.field3885.field2222 += var6;
        }
        this.field3888 = 0L;
        this.field3890 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3890[var4] = this.field3891[var4];
        }
        this.field3889 = new int[var2];
        this.field3887 = new int[var2];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()Z")
    public final boolean method1325() {
        return this.field3885.field2218 != null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
    public final void method1326() {
        this.field3885.field2222 = -1;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
    public final int method1327() {
        return this.field3890.length;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public final void method1328(int arg0) {
        this.field3885.field2222 = this.field3890[arg0];
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public final void method1329(int arg0) {
        this.field3890[arg0] = this.field3885.field2222;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)J")
    public final long method1330(int arg0) {
        return (long) this.field3892 * (long) arg0 + this.field3888;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public final void method1331(int arg0) {
        int var2 = this.field3885.method757((byte) -7);
        this.field3889[arg0] += var2;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()I")
    public final int method1332() {
        int var1 = this.field3890.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3890[var4] >= 0 && this.field3889[var4] < var3) {
                var2 = var4;
                var3 = this.field3889[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()Z")
    public final boolean method1333() {
        int var1 = this.field3890.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3890[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    private final int method1334(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3884[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3885.method751((byte) 90) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3885.method751((byte) 104) << 16;
            }
            return var8;
        }
        int var3 = this.field3885.method751((byte) 127);
        int var4 = this.field3885.method757((byte) -7);
        if (var3 == 47) {
            this.field3885.field2222 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3885.method780(16711680);
            var4 -= 3;
            int var6 = this.field3889[arg0];
            this.field3888 += (long) (this.field3892 - var5) * (long) var6;
            this.field3892 = var5;
            this.field3885.field2222 += var4;
            return 2;
        } else {
            this.field3885.field2222 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
    private final int method1335(int arg0) {
        byte var2 = this.field3885.field2218[this.field3885.field2222];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3887[arg0] = var3;
            this.field3885.field2222++;
        } else {
            var3 = this.field3887[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1334(arg0, var3);
        }
        int var4 = this.field3885.method757((byte) -7);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3885.field2218[this.field3885.field2222] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3885.field2222++;
                this.field3887[arg0] = var5;
                return this.method1334(arg0, var5);
            }
        }
        this.field3885.field2222 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "()V")
    public static void method1336() {
        field3884 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(J)V")
    public final void method1337(long arg0) {
        this.field3888 = arg0;
        int var3 = this.field3890.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3889[var4] = 0;
            this.field3887[var4] = 0;
            this.field3885.field2222 = this.field3891[var4];
            this.method1331(var4);
            this.field3890[var4] = this.field3885.field2222;
        }
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "()V")
    public final void method1338() {
        this.field3885.field2218 = null;
        this.field3891 = null;
        this.field3890 = null;
        this.field3889 = null;
        this.field3887 = null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class200() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
    public class200(byte[] arg0) {
        this.method1324(arg0);
    }
}
