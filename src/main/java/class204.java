import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class204 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lfa;")
    private class52 field3997 = new class52(null);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[B")
    private static byte[] field3996 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    private int field4002;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "J")
    private long field4000;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    private int[] field3998;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    private int[] field3999;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[I")
    private int[] field4001;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[I")
    public int[] field4003;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public static void method1327() {
        field3996 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(J)V")
    public final void method1328(long arg0) {
        this.field4000 = arg0;
        int var3 = this.field4001.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4003[var4] = 0;
            this.field3999[var4] = 0;
            this.field3997.field1033 = this.field3998[var4];
            this.method1339(var4);
            this.field4001[var4] = this.field3997.field1033;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final void method1329(int arg0) {
        this.field3997.field1033 = this.field4001[arg0];
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()Z")
    public final boolean method1330() {
        return this.field3997.field1054 != null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    public final void method1331() {
        this.field3997.field1033 = -1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
    public final int method1332() {
        int var1 = this.field4001.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4001[var4] >= 0 && this.field4003[var4] < var3) {
                var2 = var4;
                var3 = this.field4003[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)J")
    public final long method1333(int arg0) {
        return (long) this.field4002 * (long) arg0 + this.field4000;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
    public final int method1334(int arg0) {
        return this.method1337(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public final void method1335(int arg0) {
        this.field4001[arg0] = this.field3997.field1033;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()I")
    public final int method1336() {
        return this.field4001.length;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
    private final int method1337(int arg0) {
        byte var2 = this.field3997.field1054[this.field3997.field1033];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3999[arg0] = var3;
            this.field3997.field1033++;
        } else {
            var3 = this.field3999[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1342(arg0, var3);
        }
        int var4 = this.field3997.method360(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3997.field1054[this.field3997.field1033] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3997.field1033++;
                this.field3999[arg0] = var5;
                return this.method1342(arg0, var5);
            }
        }
        this.field3997.field1033 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()Z")
    public final boolean method1338() {
        int var1 = this.field4001.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4001[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public final void method1339(int arg0) {
        int var2 = this.field3997.method360(true);
        this.field4003[arg0] += var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B)V")
    public final void method1340(byte[] arg0) {
        this.field3997.field1054 = arg0;
        this.field3997.field1033 = 10;
        int var2 = this.field3997.method390((byte) 98);
        this.field4004 = this.field3997.method390((byte) 127);
        this.field4002 = 500000;
        this.field3998 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3997.method383(124);
            int var6 = this.field3997.method383(78);
            if (var5 == 1297379947) {
                this.field3998[var3] = this.field3997.field1033;
                var3++;
            }
            this.field3997.field1033 += var6;
        }
        this.field4000 = 0L;
        this.field4001 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4001[var4] = this.field3998[var4];
        }
        this.field4003 = new int[var2];
        this.field3999 = new int[var2];
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
    public final void method1341() {
        this.field3997.field1054 = null;
        this.field3998 = null;
        this.field4001 = null;
        this.field4003 = null;
        this.field3999 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    private final int method1342(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3996[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3997.method344(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3997.method344(255) << 16;
            }
            return var8;
        }
        int var3 = this.field3997.method344(255);
        int var4 = this.field3997.method360(true);
        if (var3 == 47) {
            this.field3997.field1033 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3997.method340(false);
            var4 -= 3;
            int var6 = this.field4003[arg0];
            this.field4000 += (long) (this.field4002 - var5) * (long) var6;
            this.field4002 = var5;
            this.field3997.field1033 += var4;
            return 2;
        } else {
            this.field3997.field1033 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class204() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
    public class204(byte[] arg0) {
        this.method1340(arg0);
    }
}
