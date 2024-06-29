import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class23 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lhb;")
    private class164 field296 = new class164((byte[]) null);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[B")
    private static byte[] field297 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "J")
    private long field301;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
    private int[] field298;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public int[] field299;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[I")
    private int[] field302;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    private int[] field304;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 3)
    public final void method134(int arg0) {
        this.field296.field2670 = this.field304[arg0];
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 7)
    public final void method135(int arg0) {
        int var2 = this.field296.method1175(766301319);
        this.field299[arg0] += var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V", line = 11)
    public final void method136() {
        this.field296.field2668 = null;
        this.field302 = null;
        this.field304 = null;
        this.field299 = null;
        this.field298 = null;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)J", line = 23)
    public final long method137(int arg0) {
        return (long) this.field300 * (long) arg0 + this.field301;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()V", line = 26)
    public final void method138() {
        this.field296.field2670 = -1;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()V", line = 35)
    public static void method139() {
        field297 = null;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()I", line = 40)
    public final int method140() {
        int var1 = this.field304.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field304[var4] >= 0 && this.field299[var4] < var3) {
                var2 = var4;
                var3 = this.field299[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "()Z", line = 66)
    public final boolean method141() {
        int var1 = this.field304.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field304[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "()I", line = 79)
    public final int method142() {
        return this.field304.length;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 221)
    public class23() {
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V", line = 223)
    public class23(byte[] arg0) {
        this.method146(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(J)V", line = 85)
    public final void method143(long arg0) {
        this.field301 = arg0;
        int var3 = this.field304.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field299[var4] = 0;
            this.field298[var4] = 0;
            this.field296.field2670 = this.field302[var4];
            this.method135(var4);
            this.field304[var4] = this.field296.field2670;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I", line = 109)
    public final int method144(int arg0) {
        return this.method149(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I", line = 116)
    private final int method145(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field297[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field296.method1178(8) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field296.method1178(8) << 16;
            }
            return var8;
        }
        int var3 = this.field296.method1178(8);
        int var4 = this.field296.method1175(766301319);
        if (var3 == 47) {
            this.field296.field2670 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field296.method1176(1048115912);
            var4 -= 3;
            int var6 = this.field299[arg0];
            this.field301 += (long) (this.field300 - var5) * (long) var6;
            this.field300 = var5;
            this.field296.field2670 += var4;
            return 2;
        } else {
            this.field296.field2670 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B)V", line = 159)
    public final void method146(byte[] arg0) {
        this.field296.field2668 = arg0;
        this.field296.field2670 = 10;
        int var2 = this.field296.method1161(true);
        this.field303 = this.field296.method1161(true);
        this.field300 = 500000;
        this.field302 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field296.method1191(31776);
            int var5 = this.field296.method1191(31776);
            if (var4 == 1297379947) {
                this.field302[var3] = this.field296.field2670;
                var3++;
            }
            this.field296.field2670 += var5;
        }
        this.field301 = 0L;
        this.field304 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field304[var6] = this.field302[var6];
        }
        this.field299 = new int[var2];
        this.field298 = new int[var2];
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "()Z", line = 214)
    public final boolean method147() {
        return this.field296.field2668 != null;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 217)
    public final void method148(int arg0) {
        this.field304[arg0] = this.field296.field2670;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)I", line = 228)
    private final int method149(int arg0) {
        byte var2 = this.field296.field2668[this.field296.field2670];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field298[arg0] = var3;
            this.field296.field2670++;
        } else {
            var3 = this.field298[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method145(arg0, var3);
        }
        int var4 = this.field296.method1175(766301319);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field296.field2668[this.field296.field2670] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field296.field2670++;
                this.field298[arg0] = var5;
                return this.method145(arg0, var5);
            }
        }
        this.field296.field2670 += var4;
        return 0;
    }
}
