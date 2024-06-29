import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class162 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lwa;")
    private class82 field2516 = new class82((byte[]) null);

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[B")
    private static byte[] field2520 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "J")
    private long field2522;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
    public int[] field2517;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    private int[] field2518;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    private int[] field2521;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    private int[] field2523;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 6)
    public static void method1094() {
        field2520 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)J", line = 9)
    public final long method1095(int arg0) {
        return (long) this.field2524 * (long) arg0 + this.field2522;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()Z", line = 13)
    public final boolean method1096() {
        int var1 = this.field2518.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2518[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(J)V", line = 31)
    public final void method1097(long arg0) {
        this.field2522 = arg0;
        int var3 = this.field2518.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2517[var4] = 0;
            this.field2523[var4] = 0;
            this.field2516.field1301 = this.field2521[var4];
            this.method1102(var4);
            this.field2518[var4] = this.field2516.field1301;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()Z", line = 49)
    public final boolean method1098() {
        return this.field2516.field1280 != null;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()I", line = 52)
    public final int method1099() {
        return this.field2518.length;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)I", line = 56)
    public final int method1100(int arg0) {
        return this.method1104(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 62)
    public final void method1101(int arg0) {
        this.field2516.field1301 = this.field2518[arg0];
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V", line = 66)
    public final void method1102(int arg0) {
        int var2 = this.field2516.method580((byte) 119);
        this.field2517[arg0] += var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I", line = 70)
    private final int method1103(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2520[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2516.method642((byte) -69) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2516.method642((byte) -60) << 16;
            }
            return var8;
        }
        int var3 = this.field2516.method642((byte) -60);
        int var4 = this.field2516.method580((byte) 123);
        if (var3 == 47) {
            this.field2516.field1301 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2516.method633((byte) 87);
            var4 -= 3;
            int var6 = this.field2517[arg0];
            this.field2522 += (long) (this.field2524 - var5) * (long) var6;
            this.field2524 = var5;
            this.field2516.field1301 += var4;
            return 2;
        } else {
            this.field2516.field1301 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)I", line = 114)
    private final int method1104(int arg0) {
        byte var2 = this.field2516.field1280[this.field2516.field1301];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2523[arg0] = var3;
            this.field2516.field1301++;
        } else {
            var3 = this.field2523[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1103(arg0, var3);
        }
        int var4 = this.field2516.method580((byte) 126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2516.field1280[this.field2516.field1301] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2516.field1301++;
                this.field2523[arg0] = var5;
                return this.method1103(arg0, var5);
            }
        }
        this.field2516.field1301 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 260)
    public class162() {
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([B)V", line = 265)
    public class162(byte[] arg0) {
        this.method1105(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([B)V", line = 155)
    public final void method1105(byte[] arg0) {
        this.field2516.field1280 = arg0;
        this.field2516.field1301 = 10;
        int var2 = this.field2516.method576(1);
        this.field2519 = this.field2516.method576(1);
        this.field2524 = 500000;
        this.field2521 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2516.method587(-502942936);
            int var5 = this.field2516.method587(-502942936);
            if (var4 == 1297379947) {
                this.field2521[var3] = this.field2516.field1301;
                var3++;
            }
            this.field2516.field1301 += var5;
        }
        this.field2522 = 0L;
        this.field2518 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2518[var6] = this.field2521[var6];
        }
        this.field2517 = new int[var2];
        this.field2523 = new int[var2];
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 209)
    public final void method1106(int arg0) {
        this.field2518[arg0] = this.field2516.field1301;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()I", line = 222)
    public final int method1107() {
        int var1 = this.field2518.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2518[var4] >= 0 && this.field2517[var4] < var3) {
                var2 = var4;
                var3 = this.field2517[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "()V", line = 251)
    public final void method1108() {
        this.field2516.field1280 = null;
        this.field2521 = null;
        this.field2518 = null;
        this.field2517 = null;
        this.field2523 = null;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "()V", line = 263)
    public final void method1109() {
        this.field2516.field1301 = -1;
    }
}
