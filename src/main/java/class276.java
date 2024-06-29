import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class276 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Lps;")
    private class428 field4052 = new class428(null);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "[B")
    private static byte[] field4051 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    private int field4058;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "J")
    private long field4057;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "[I")
    private int[] field4053;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "[I")
    public int[] field4054;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "[I")
    private int[] field4056;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "[I")
    private int[] field4059;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "()V", line = 3)
    public final void method1732() {
        this.field4052.field6221 = -1;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 6)
    public final void method1733(int arg0) {
        this.field4052.field6221 = this.field4053[arg0];
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "()V", line = 9)
    public static void method1734() {
        field4051 = null;
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "()I", line = 13)
    public final int method1735() {
        int var1 = this.field4053.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4053[var4] >= 0 && this.field4054[var4] < var3) {
                var2 = var4;
                var3 = this.field4054[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)I", line = 41)
    public final int method1736(int arg0) {
        return this.method1741(arg0);
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "()Z", line = 48)
    public final boolean method1737() {
        return this.field4052.field6162 != null;
    }

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "()V", line = 51)
    public final void method1738() {
        this.field4052.field6162 = null;
        this.field4056 = null;
        this.field4053 = null;
        this.field4054 = null;
        this.field4059 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(J)V", line = 61)
    public final void method1739(long arg0) {
        this.field4057 = arg0;
        int var3 = this.field4053.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4054[var4] = 0;
            this.field4059[var4] = 0;
            this.field4052.field6221 = this.field4056[var4];
            this.method1742(var4);
            this.field4053[var4] = this.field4052.field6221;
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V", line = 79)
    public final void method1740(int arg0) {
        this.field4053[arg0] = this.field4052.field6221;
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)I", line = 83)
    private final int method1741(int arg0) {
        byte var2 = this.field4052.field6162[this.field4052.field6221];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4059[arg0] = var3;
            this.field4052.field6221++;
        } else {
            var3 = this.field4059[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1743(arg0, var3);
        }
        int var4 = this.field4052.method2568(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4052.field6162[this.field4052.field6221] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4052.field6221++;
                this.field4059[arg0] = var5;
                return this.method1743(arg0, var5);
            }
        }
        this.field4052.field6221 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)V", line = 122)
    public final void method1742(int arg0) {
        int var2 = this.field4052.method2568(false);
        this.field4054[arg0] += var2;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)I", line = 130)
    private final int method1743(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4051[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4052.method2561((byte) -107) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4052.method2561((byte) -126) << 16;
            }
            return var8;
        }
        int var3 = this.field4052.method2561((byte) 124);
        int var4 = this.field4052.method2568(false);
        if (var3 == 47) {
            this.field4052.field6221 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4052.method2601(117);
            var4 -= 3;
            int var6 = this.field4054[arg0];
            this.field4057 += (long) (this.field4058 - var5) * (long) var6;
            this.field4058 = var5;
            this.field4052.field6221 += var4;
            return 2;
        } else {
            this.field4052.field6221 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "()Z", line = 176)
    public final boolean method1744() {
        int var1 = this.field4053.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4053[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "()I", line = 189)
    public final int method1745() {
        return this.field4053.length;
    }

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "(I)J", line = 194)
    public final long method1746(int arg0) {
        return (long) this.field4058 * (long) arg0 + this.field4057;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "([B)V", line = 199)
    public final void method1747(byte[] arg0) {
        this.field4052.field6162 = arg0;
        this.field4052.field6221 = 10;
        int var2 = this.field4052.method2620(64);
        this.field4055 = this.field4052.method2620(69);
        this.field4058 = 500000;
        this.field4056 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4052.method2589(-11179);
            int var6 = this.field4052.method2589(-11179);
            if (var5 == 1297379947) {
                this.field4056[var3] = this.field4052.field6221;
                var3++;
            }
            this.field4052.field6221 += var6;
        }
        this.field4057 = 0L;
        this.field4053 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4053[var4] = this.field4056[var4];
        }
        this.field4054 = new int[var2];
        this.field4059 = new int[var2];
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "()V", line = 264)
    public class276() {
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "([B)V", line = 266)
    public class276(byte[] arg0) {
        this.method1747(arg0);
    }
}
