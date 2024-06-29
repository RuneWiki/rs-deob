import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class166 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lrg;")
    private class239 field2932 = new class239((byte[]) null);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[B")
    private static byte[] field2931 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "J")
    private long field2938;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[I")
    private int[] field2933;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    public int[] field2934;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    private int[] field2936;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "[I")
    private int[] field2937;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B)V")
    public final void method1189(byte[] arg0) {
        this.field2932.field4144 = arg0;
        this.field2932.field4124 = 10;
        int var2 = this.field2932.method1663((byte) -86);
        this.field2935 = this.field2932.method1663((byte) -64);
        this.field2939 = 500000;
        this.field2936 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2932.method1617((byte) -43);
            int var6 = this.field2932.method1617((byte) -43);
            if (var5 == 1297379947) {
                this.field2936[var3] = this.field2932.field4124;
                var3++;
            }
            this.field2932.field4124 += var6;
        }
        this.field2938 = 0L;
        this.field2933 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2933[var4] = this.field2936[var4];
        }
        this.field2934 = new int[var2];
        this.field2937 = new int[var2];
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method1190(int arg0) {
        this.field2933[arg0] = this.field2932.field4124;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public final void method1191(int arg0) {
        this.field2932.field4124 = this.field2933[arg0];
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)J")
    public final long method1192(int arg0) {
        return (long) this.field2939 * (long) arg0 + this.field2938;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()Z")
    public final boolean method1193() {
        return this.field2932.field4144 != null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()Z")
    public final boolean method1194() {
        int var1 = this.field2933.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2933[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)I")
    public final int method1195(int arg0) {
        return this.method1197(arg0);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
    public final int method1196() {
        return this.field2933.length;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)I")
    private final int method1197(int arg0) {
        byte var2 = this.field2932.field4144[this.field2932.field4124];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2937[arg0] = var3;
            this.field2932.field4124++;
        } else {
            var3 = this.field2937[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1201(arg0, var3);
        }
        int var4 = this.field2932.method1633((byte) -127);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2932.field4144[this.field2932.field4124] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2932.field4124++;
                this.field2937[arg0] = var5;
                return this.method1201(arg0, var5);
            }
        }
        this.field2932.field4124 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()I")
    public final int method1198() {
        int var1 = this.field2933.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2933[var4] >= 0 && this.field2934[var4] < var3) {
                var2 = var4;
                var3 = this.field2934[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()V")
    public static void method1199() {
        field2931 = null;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
    public final void method1200(int arg0) {
        int var2 = this.field2932.method1633((byte) -127);
        this.field2934[arg0] += var2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    private final int method1201(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2931[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2932.method1651(4139) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2932.method1651(4139) << 16;
            }
            return var8;
        }
        int var3 = this.field2932.method1651(4139);
        int var4 = this.field2932.method1633((byte) -127);
        if (var3 == 47) {
            this.field2932.field4124 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2932.method1660(-335289648);
            var4 -= 3;
            int var6 = this.field2934[arg0];
            this.field2938 += (long) (this.field2939 - var5) * (long) var6;
            this.field2939 = var5;
            this.field2932.field4124 += var4;
            return 2;
        } else {
            this.field2932.field4124 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(J)V")
    public final void method1202(long arg0) {
        this.field2938 = arg0;
        int var3 = this.field2933.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2934[var4] = 0;
            this.field2937[var4] = 0;
            this.field2932.field4124 = this.field2936[var4];
            this.method1200(var4);
            this.field2933[var4] = this.field2932.field4124;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "()V")
    public final void method1203() {
        this.field2932.field4144 = null;
        this.field2936 = null;
        this.field2933 = null;
        this.field2934 = null;
        this.field2937 = null;
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "()V")
    public final void method1204() {
        this.field2932.field4124 = -1;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class166() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
    public class166(byte[] arg0) {
        this.method1189(arg0);
    }
}
