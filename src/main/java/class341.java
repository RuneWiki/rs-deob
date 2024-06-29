import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class341 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lmd;")
    private class379 field4504 = new class379(null);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "[B")
    private static byte[] field4505 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "J")
    private long field4506;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    private int[] field4508;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[I")
    private int[] field4509;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    private int[] field4511;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[I")
    public int[] field4512;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
    public final int method1967(int arg0) {
        return this.method1969(arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([B)V")
    public final void method1968(byte[] arg0) {
        this.field4504.field5152 = arg0;
        this.field4504.field5173 = 10;
        int var2 = this.field4504.method2212((byte) 83);
        this.field4510 = this.field4504.method2212((byte) 83);
        this.field4507 = 500000;
        this.field4511 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4504.method2232((byte) 126);
            int var6 = this.field4504.method2232((byte) 127);
            if (var5 == 1297379947) {
                this.field4511[var3] = this.field4504.field5173;
                var3++;
            }
            this.field4504.field5173 += var6;
        }
        this.field4506 = 0L;
        this.field4508 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4508[var4] = this.field4511[var4];
        }
        this.field4512 = new int[var2];
        this.field4509 = new int[var2];
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
    private final int method1969(int arg0) {
        byte var2 = this.field4504.field5152[this.field4504.field5173];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4509[arg0] = var3;
            this.field4504.field5173++;
        } else {
            var3 = this.field4509[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1970(arg0, var3);
        }
        int var4 = this.field4504.method2192((byte) -72);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4504.field5152[this.field4504.field5173] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4504.field5173++;
                this.field4509[arg0] = var5;
                return this.method1970(arg0, var5);
            }
        }
        this.field4504.field5173 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    private final int method1970(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4505[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4504.method2238(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4504.method2238(255) << 16;
            }
            return var8;
        }
        int var3 = this.field4504.method2238(255);
        int var4 = this.field4504.method2192((byte) -32);
        if (var3 == 47) {
            this.field4504.field5173 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4504.method2249((byte) 118);
            var4 -= 3;
            int var6 = this.field4512[arg0];
            this.field4506 += (long) (this.field4507 - var5) * (long) var6;
            this.field4507 = var5;
            this.field4504.field5173 += var4;
            return 2;
        } else {
            this.field4504.field5173 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()Z")
    public final boolean method1971() {
        int var1 = this.field4508.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4508[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()V")
    public final void method1972() {
        this.field4504.field5173 = -1;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()I")
    public final int method1973() {
        return this.field4508.length;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()V")
    public final void method1974() {
        this.field4504.field5152 = null;
        this.field4511 = null;
        this.field4508 = null;
        this.field4512 = null;
        this.field4509 = null;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public final void method1975(int arg0) {
        int var2 = this.field4504.method2192((byte) -126);
        this.field4512[arg0] += var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(J)V")
    public final void method1976(long arg0) {
        this.field4506 = arg0;
        int var3 = this.field4508.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4512[var4] = 0;
            this.field4509[var4] = 0;
            this.field4504.field5173 = this.field4511[var4];
            this.method1975(var4);
            this.field4508[var4] = this.field4504.field5173;
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "()I")
    public final int method1977() {
        int var1 = this.field4508.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4508[var4] >= 0 && this.field4512[var4] < var3) {
                var2 = var4;
                var3 = this.field4512[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public final void method1978(int arg0) {
        this.field4504.field5173 = this.field4508[arg0];
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "()Z")
    public final boolean method1979() {
        return this.field4504.field5152 != null;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)J")
    public final long method1980(int arg0) {
        return (long) this.field4507 * (long) arg0 + this.field4506;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
    public final void method1981(int arg0) {
        this.field4508[arg0] = this.field4504.field5173;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "()V")
    public static void method1982() {
        field4505 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class341() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V")
    public class341(byte[] arg0) {
        this.method1968(arg0);
    }
}
